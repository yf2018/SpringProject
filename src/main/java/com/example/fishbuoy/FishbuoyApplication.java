// 主程序入口
package com.example.fishbuoy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication() //来标注一个主程序类，说明这是一个spring boot应用
public class FishbuoyApplication {
    public static void main(String[] args) {
        SpringApplication.run(FishbuoyApplication.class, args);
    }
}
