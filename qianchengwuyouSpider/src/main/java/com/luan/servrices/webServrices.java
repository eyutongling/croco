package com.luan.servrices;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Administrator on 2018/1/16 0016.
 * 获取html的服务
 */
public class webServrices {


    public String getHtmlByUrl(String url){
        String html = "0";
        CloseableHttpClient httpClient = HttpClients.createDefault();//创建httpClient对象
        HttpGet httpget = new HttpGet(url);
        try {
            HttpResponse responce = httpClient.execute(httpget);
            int resStatu = responce.getStatusLine().getStatusCode();
            if (resStatu == HttpStatus.SC_OK) {

                HttpEntity entity = responce.getEntity();
                if (entity != null) {
                    html = EntityUtils.toString(entity,"GBK");//获得html源代码
                }
            }
        } catch (Exception e) {
            System.out.println("访问【"+url+"】出现异常!");
            e.printStackTrace();
        } finally {
            //释放连接
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return html;
    }

}
