package com.luan.servrices;

import com.luan.pojo.Company;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/16 0016.
 * 获取html的服务
 */
public class GetHtmlByGetThrend extends Thread {
    String company_url;
    public GetHtmlByGetThrend(String company_url){
        this.company_url=company_url;
    }

    @Override
    public void run() {
        String company_html= new webServrices().getHtmlByUrl(company_url);
        Company company=new Company();
        Document doc = Jsoup.parse(company_html);
        Elements elements=doc.getElementById("joblistdata").select(".el");
        company.setItem(elements.size());
        List<String> job_list=new LinkedList<>();
        for (Element e:elements){
            //System.out.println(e.html());
            job_list.add(e.getElementsByClass("t1").select("a").first().attr("title"));
        }
        company.setName(doc.getElementsByTag("h1").first().text());
        company.setUrl(doc.getElementsByTag("head").select("link").last().attr("href"));
        company.setJob_list(job_list);
        System.out.println(company);
    }

}
