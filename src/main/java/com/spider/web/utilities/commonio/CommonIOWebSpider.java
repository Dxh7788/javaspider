package com.spider.web.utilities.commonio;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javaspider
 *
 * @author xh.d
 * @since 2018/2/7 11:12
 */
public class CommonIOWebSpider {

    public static String commonIoFetch(String url, String charset)throws IOException{
        return IOUtils.toString(new URL(url),charset);
    }
}
