package com.jsnx.jzzy.datamonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@ServletComponentScan(basePackages = "com.jsnx")
@SpringBootApplication(scanBasePackages = "com.jsnx")
public class DataMonintorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMonintorApplication.class, args);
	}

}
