package com.luan.spider;


import com.luan.spider.pojo.Company;
import com.luan.spider.servrices.OutServrice;
import com.luan.spider.servrices.priseServrices;
import com.luan.spider.servrices.webServrices;
import org.junit.Test;

import java.util.List;

public class App {
    static long sun=0;
    public static void main(String[] args) {
        String city_list_url="http://qy.58.com/citylist/";
        List<String> city_url_list=new priseServrices().getCityUrlsByHtml(
                new webServrices().getHtmlByUrl(city_list_url));
        for (int i=0;i<city_url_list.size();i++){
            //System.out.println(city_url_list.get(i));
            List<String> company_urls=new priseServrices().getCommpanyUrlsByHtml( new webServrices().getHtmlByUrl(city_url_list.get(i)));
            for (int j=0;j<company_urls.size();j++){
                //System.out.println(company_urls.get(j));
                String company_html= new webServrices().getHtmlByUrl(company_urls.get(j));
                Company company=new priseServrices().getCommpany(company_html);
                if (company.getItem()>=5){
                    System.out.println(company);
                }
            }
        }
    }
    @Test
    public  void f() {
            //System.out.println(city_url_list.get(i));
            List<String> company_urls=new priseServrices().getCommpanyUrlsByHtml( new webServrices().getHtmlByUrl("http://qy.58.com/gz_244/"));
            for (int j=0;j<company_urls.size();j++){
                //System.out.println(company_urls.get(j));
                String company_html= new webServrices().getHtmlByUrl(company_urls.get(j));
                Company company=new priseServrices().getCommpany(company_html);
                if (company.getItem()>=5){
                    System.out.println(company);
                }
            }

    }
}
