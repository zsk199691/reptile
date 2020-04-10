package zsk.pa.zsk_pa.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import zsk.pa.zsk_pa.Entity.pageEntity;
import zsk.pa.zsk_pa.Entity.service.impl.HttpClientDownLoadServiceimpl;

/***
 * 页面下载
 * @author Lenovo
 *
 */

public class pageDownLoadUtil {
	//静态返回页面地址的方法带参
	public static String getpageContent(String url) {
		HttpClientBuilder builder=HttpClients.custom();
	CloseableHttpClient client=builder.build();
	HttpGet request=new HttpGet(url);
	String count =null;
	try {
		CloseableHttpResponse response = client.execute(request);
		HttpEntity entity = response.getEntity();
	count =	EntityUtils.toString(entity);
	} catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return count;
	}
	
	
	public static void main(String[] args) {
		String url="https://search.gitee.com/?skin=rec&type=repository&q=vue%E6%A1%86%E6%9E%B6&repo=&reponame=";
//		String count =pageDownLoadUtil.getpageContent(url);
//		System.out.println(count);
		HttpClientDownLoadServiceimpl httpClientDownLoadServiceimpl=new HttpClientDownLoadServiceimpl();
		pageEntity page =httpClientDownLoadServiceimpl.download(url);
		System.out.println(page.getCount());
	}

}
