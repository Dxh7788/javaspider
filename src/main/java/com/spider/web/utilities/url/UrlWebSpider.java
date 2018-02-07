package com.spider.web.utilities.url;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javaspider
 *
 * @author xh.d
 * @since 2018/2/7 11:01
 */
public class UrlWebSpider {

    public static String UrlFetch(String request, String charset) throws MalformedURLException,IOException{
        URL url = new URL(request);
        return IOUtils.toString(url.openStream());
    }
}
