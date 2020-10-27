package com.xiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiao.mapper") //@MapperScan 用户扫描MyBatis的Mapper接口
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

