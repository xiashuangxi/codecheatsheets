// -----------------------------------------------------------------------------
// 说明： spring mvc 的控制器
// 主题词：springboot springmvc 微服务
// -----------------------------------------------------------------------------

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/say")
    public String say() {
        return  "say";
    }
}
