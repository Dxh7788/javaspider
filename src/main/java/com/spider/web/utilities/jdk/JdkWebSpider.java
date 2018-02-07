package com.spider.web.utilities.jdk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javaspider
 *
 * @author xh.d
 * @since 2018/2/7 10:43
 */
public class JdkWebSpider {

    public static String JdkFetch(String request, String charset) throws MalformedURLException,IOException{
        URL url = new URL(request);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko)Chrome/59.0.3071.86 Safari/537.36");
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK){
            InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            StringBuffer sb = new StringBuffer();
            String str;
            while ((str=reader.readLine())!=null){
                sb.append(str+"\n");
            }
            input.close();
            connection.disconnect();
            return new String(sb);
        }
        return "";
    }
}
