package com.coffee.HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpGet1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new ReadByGet().start();
	}

}
class ReadByGet extends Thread{
	@Override
	public void run() {
	try {
		URL url=new URL("http://api.fanyi.baidu.com/api/trans/vip/translate?q=apple&from=en&to=zh&appid=2015063000000001&salt=1435660288&sign=f89f9594663708c1605f3d736d01d2d4&doctype=xml");
		URLConnection connection=url.openConnection();
		InputStream is=connection.getInputStream();
		InputStreamReader isr=new InputStreamReader(is,"UTF-8");
		BufferedReader br=new BufferedReader(isr);
		
		String Line;
		StringBuilder builder=new StringBuilder();
		while ((Line=br.readLine())!=null) {
			builder.append(Line);
		}
		br.close();isr.close();is.close();
		System.out.println(builder.toString());
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}