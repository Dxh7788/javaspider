package com.spider.web.utilities.httpclient;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javaspider
 *
 * @author xh.d
 * @since 2018/2/7 11:08
 */
public class HttpClientWebSpider {

    public static String httpClientFetch(String url, String charset) throws IOException{
        HttpClient client = new HttpClient();
        client.getParams().setContentCharset(charset);
        HttpMethod method = new GetMethod(url);
        client.executeMethod(method);

        return method.getResponseBodyAsString();
    }
}
