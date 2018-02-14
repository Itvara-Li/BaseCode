package com.coffee.HTTP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpPost {

	public static void main(String[] args) {
   new ReadByPost().start();
		
	}

}
class ReadByPost extends Thread{
	@Override
	public void run() {
		try {
			URL url=new URL("http://api.fanyi.baidu.com/api/trans/vip/translate");
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		  connection.addRequestProperty("encoding", "UTF-8");
		  connection.setDoInput(true);
		  connection.setDoOutput(true);
		  connection.setRequestMethod("POST");
		  
		  OutputStream os=connection.getOutputStream();
		  OutputStreamWriter osw=new OutputStreamWriter(os);
		  BufferedWriter bw=new BufferedWriter(osw);
		  
		  bw.write("q=apple&from=en&to=zh&appid=2015063000000001&salt=1435660288&sign=f89f9594663708c1605f3d736d01d2d4&doctype=json");
		  bw.flush();
		  
		  
		  InputStream is=connection.getInputStream();
		  InputStreamReader isr=new InputStreamReader(is);
		  BufferedReader br=new BufferedReader(isr);
		  
		  
		   String line;
		   StringBuilder builder=new StringBuilder();
		   while ((line=br.readLine())!=null) {
			builder.append(line);
		   }
		   
		   bw.close();osw.close();os.close();br.close();isr.close();is.close();
		   System.out.println(builder.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}