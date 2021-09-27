package org.excavator.boot.mysqldriververify;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

import static java.lang.System.out;

@SpringBootApplication
public class MysqlDriverVerifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlDriverVerifyApplication.class, args);
	}

}


