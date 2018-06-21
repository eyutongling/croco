package com.luan.servrices;


import okhttp3.*;
import org.junit.Test;
import sun.nio.cs.ext.GBK;
import sun.rmi.runtime.Log;


import java.io.IOException;

/**
 * Created by Administrator on 2018/1/16 0016.
 * 获取html的服务
 */
public class OkHttpServrices {


    public static void main(String[] args) {
        try {
            String string= new OkHttpServrices().run("http://jobs.51job.com/guangzhou-hpq/co4241252.html");
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    OkHttpClient client = new OkHttpClient();
    String run(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
           return "404";
        }
    }

    @Test
    public void g(){
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
    }
}
