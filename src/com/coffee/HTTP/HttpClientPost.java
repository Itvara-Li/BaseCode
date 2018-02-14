package com.coffee.HTTP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientPost {

	public static void main(String[] args) {
//"http://api.fanyi.baidu.com/api/trans/vip/translate"
//"q=apple&from=en&to=zh&appid=2015063000000001&salt=1435660288&sign=f89f9594663708c1605f3d736d01d2d4&doctype=json"
	new Post().start();
	}

}

class Post extends Thread
{
	HttpClient client=HttpClients.createDefault();
	
	@Override
	public void run() {
		HttpPost post=new HttpPost("http://api.fanyi.baidu.com/api/trans/vip/translate");
		try {						
	List<BasicNameValuePair> parameters=new ArrayList<>();
	//"q=apple&from=en&to=zh&appid=2015063000000001&salt=1435660288&sign=f89f9594663708c1605f3d736d01d2d4&doctype=json"
	parameters.add(new BasicNameValuePair("q", "apple"));
	parameters.add(new BasicNameValuePair("from", "en"));
	parameters.add(new BasicNameValuePair("to", "zh"));
	parameters.add(new BasicNameValuePair("appid", "2015063000000001"));
	parameters.add(new BasicNameValuePair("salt", "1435660288"));
	parameters.add(new BasicNameValuePair("sign", "f89f9594663708c1605f3d736d01d2d4"));
	parameters.add(new BasicNameValuePair("doctype", "xml"));
	post.setEntity(new UrlEncodedFormEntity(parameters,"UTF-8"));
	HttpResponse response=client.execute(post);
	HttpEntity entity=	response.getEntity();
	String result=	EntityUtils.toString(entity, "UTF-8");
		System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}}