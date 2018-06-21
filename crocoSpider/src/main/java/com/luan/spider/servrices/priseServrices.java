package com.luan.spider.servrices;

import com.luan.spider.pojo.Company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/17 0017.
 * 解析html的服务
 */
public class priseServrices {
    /**
     *获取公司url
     * @param city_html
     * @return List<String>
     */
    public List<String> getCommpanyUrlsByHtml(String city_html){
        Document doc = Jsoup.parse(city_html);
        Elements links = doc.getElementsByTag("li").select("span").select("a");
        List<String> company_urls=new ArrayList<String>();
        for (Element e:links){
            String company_url =e.attr("href");
            if (!company_urls.contains(company_url)){
                company_urls.add(company_url);
            }
        }
        return company_urls;
    }

    /**
     * 获取公司对象
     * @param company_html
     * @return
     */
    public Company getCommpany(String company_html){
        Document doc = Jsoup.parse(company_html);
        Elements jobItem = doc.getElementsByClass("jobInfo bor");
        Company company=new Company();
        for (Element e:jobItem){
            if (e.select(".jobList").size()!=0){
                company.setItem( e.select(".jobList").select("tbody").select("tr").size());
            }else {
                company.setItem(0);
            }
        }
        Elements businessName = doc.getElementsByClass("businessName fl");
        company.setName(businessName.attr("title"));
        String url="http://qy.58.com"+businessName.attr("href");
        company.setUrl(url);
        return company;
    }

    /**
     * 获取城市的地址
     * @param city_list_html
     * @return List<String></>
     */
    public List<String> getCityUrlsByHtml(String city_list_html){
        Document doc = Jsoup.parse(city_list_html);
        Elements links = doc.getElementById("clist").select("dd").select("a");
        List<String> city_urls=new ArrayList<>();
        for (Element e:links){
            //System.out.println(e.attr("href"));
            city_urls.add(e.attr("href"));
        }
        return city_urls;
    }


    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {


       // new priseServrices().getCityItemByHtml(new webServrices().getHtmlByUrl("http://qy.58.com/citylist/"));
    }
}
