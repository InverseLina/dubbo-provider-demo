package com.dubbo.demo.api;

public interface HealthService {

    String readiness(String type);

    String liveness(String type);

}
