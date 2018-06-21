package com.luan.spider.pojo;

/**
 * Created by Administrator on 2018/1/17 0017.
 */
public class Company {
    private String name;
    private String url;
    private int item;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", item=" + item +
                '}';
    }
}
