package org.bk.consumer;

import org.bk.noscan.consumer.ribbon.PersonalDirectCallRibbonConfiguration;
import org.bk.noscan.consumer.ribbon.PongDirectCallRibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@RibbonClients({
        @RibbonClient(name = "samplepongdirect", configuration = PongDirectCallRibbonConfiguration.class),
        @RibbonClient(name = "personaldirect", configuration = PersonalDirectCallRibbonConfiguration.class),
})
public class PingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingApplication.class, args);
    }

}
