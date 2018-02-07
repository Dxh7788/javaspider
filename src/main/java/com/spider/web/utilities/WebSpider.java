package com.spider.web.utilities;

import com.spider.web.utilities.commonio.CommonIOWebSpider;
import com.spider.web.utilities.httpclient.HttpClientWebSpider;
import com.spider.web.utilities.jdk.JdkWebSpider;
import com.spider.web.utilities.jsoup.JsoupWebSpider;
import com.spider.web.utilities.url.UrlWebSpider;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javaspider
 *
 * @author xh.d
 * @since 2018/2/7 11:17
 */
public class WebSpider {

    /**
     * JDK Fetch
     * */
    public static String jdkFetch(String request, String charset) throws Exception{
        return JdkWebSpider.JdkFetch(request,charset);
    }
    /**
     * Url Fetch
     * */
    public static String urlFetch(String request, String charset) throws Exception{
        return UrlWebSpider.UrlFetch(request,charset);
    }

    /**
     * HttpClient Fetch
     * */
    public static String httpClientFetch(String url, String charset) throws Exception{
        return HttpClientWebSpider.httpClientFetch(url,charset);
    }
    /**
     * Jsoup Fetch
     * */
    public static String jsoupFetch(String url) throws Exception{
        return JsoupWebSpider.JsoupFetch(url);
    }
    /**
     * Common io Fetch
     * */
    public static String commonIoFetch(String url, String charset) throws Exception{
        return CommonIOWebSpider.commonIoFetch(url,charset);
    }

    public static int getResponseCode(String request) throws Exception {
        URL url = new URL(request);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        return conn.getResponseCode();
    }
}
