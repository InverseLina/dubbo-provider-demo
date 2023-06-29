package com.dubbo.provider.dubboproviderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:META-INF/spring/dubbo-demo-provider.xml"})
public class DubboProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderDemoApplication.class, args);
	}

}
