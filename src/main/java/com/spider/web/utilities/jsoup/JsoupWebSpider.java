package com.spider.web.utilities.jsoup;

import org.jsoup.Jsoup;

import java.net.URL;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javaspider
 *
 * @author xh.d
 * @since 2018/2/7 11:14
 */
public class JsoupWebSpider {

    public static String JsoupFetch(String url) throws Exception{
        return Jsoup.parse(new URL(url),20000).html();
    }
}
