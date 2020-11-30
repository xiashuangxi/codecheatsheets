// -----------------------------------------------------------------------------
// 说明： springboot的启动
// 主题词：springboot 微服务
// -----------------------------------------------------------------------------


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args );
    }
}
