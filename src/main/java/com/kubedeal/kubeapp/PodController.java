package com.kubedeal.kubeapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class PodController {
    @Value("${POD_NAME:unknown}")
    private String podName;

    @Value("${POD_NAMESPACE:unknown}")
    private String namespace;

    @Value("${HOSTNAME:unknown}")
    private String hostname;

    @Value("${MY_SERVICE_SERVICE_HOST:unknown}")
    private String serviceHost;

    @Value("${MY_SERVICE_SERVICE_PORT:unknown}")
    private String servicePort;

    @GetMapping("/pod")
    public String getPodInfo() {
        return "Pod Name: " + podName +
                "\nNamespace: " + namespace +
                "\nHostname: " + hostname +
                "\nService Host: " + serviceHost +
                "\nService Port: " + servicePort;
    }


    @GetMapping("/podinfo")
    public String getPodName() {
        return "Hello! This request is served by pod: " + podName;
    }

}
