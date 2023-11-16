package com.dubbo.provider.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dubbo.demo.api.HealthService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HealthServiceImpl implements HealthService {

    @Override
    public String readiness(String type) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] readiness " + type + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "readiness " + type + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String liveness(String type) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] liveness " + type + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "liveness " + type + ", response from provider: " + RpcContext.getContext().getLocalAddress();

    }
}
