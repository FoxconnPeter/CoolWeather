package com.liqipeter.myapplication.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/1/9.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
        //发起一条HTTP请求 调用 sendOkHttpRequest 方法。传入请求地址吗，并注册一个回调来处理服务器响应就可以了。

    }

}
