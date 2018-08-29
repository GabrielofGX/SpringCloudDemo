package com.gabriel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Application_1
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(Application_1.class, args);
    }
}
