package com.capgemini.springBootZuulServiceproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.capgemini.springBootZuulServiceproxy.filters.ErrorFilter;
import com.capgemini.springBootZuulServiceproxy.filters.PostFilter;
import com.capgemini.springBootZuulServiceproxy.filters.PreFilter;
import com.capgemini.springBootZuulServiceproxy.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulServiceproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulServiceproxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
