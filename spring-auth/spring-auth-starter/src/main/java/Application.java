import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages  = {"com.spring.cloud"})
@EnableEurekaClient
@EnableAuthorizationServer
@EnableFeignClients(basePackages = {"com.spring.cloud.service.feign"})
@EnableHystrix
@EnableCircuitBreaker
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.spring.cloud.repository"})
@EntityScan(basePackages = {"com.spring.cloud.entity"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}