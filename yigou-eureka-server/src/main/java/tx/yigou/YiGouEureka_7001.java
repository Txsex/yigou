package tx.yigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //控制中心
public class YiGouEureka_7001 {

    public static void main(String[] args) {
        SpringApplication.run(YiGouEureka_7001.class);
    }
}
