package com.coffee.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientChatManager {
 private ClientChatManager() {}
private static final ClientChatManager instance
=new ClientChatManager();

public static ClientChatManager getCCM() {
	return instance;
}
ChatWindow window;
Socket socket;
BufferedReader reader;
PrintWriter writer;
public void setWindow(ChatWindow window) {
	this.window=window;
	window.appendText("banding");
}
public void connect(String ip) {
	new Thread() {

		@Override
		public void run() {
			try {
				socket=new Socket(ip, 54321);
				writer=new PrintWriter(
						new OutputStreamWriter(
								socket.getOutputStream()));
				reader=new BufferedReader(
						new InputStreamReader(
								socket.getInputStream()));
				String line;
				while ((line=reader.readLine())!=null) {
					window.appendText(line);
				}
				writer.close();reader.close();
				writer=null;reader=null;
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}.start();
}
public void send(String out) {
	if (writer!=null) {
		writer.write(out+"\n");
		writer.flush();
	}else {
		window.appendText("disconnect!");
	}
}
}
