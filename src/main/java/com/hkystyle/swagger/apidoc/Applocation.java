
package com.hkystyle.swagger.apidoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by hukaiyang on 2017/9/15.
 */

@SpringBootApplication(scanBasePackages = "com.hkystyle.swagger.apidoc")
public class Applocation {
    public static void main(String[] args) {
        SpringApplication.run(Applocation.class, args);
    }
}
