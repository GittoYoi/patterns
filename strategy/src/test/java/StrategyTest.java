import com.gitto.StrategyApplication;
import com.gitto.strategy.StrategyContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest(classes = StrategyApplication.class)
public class StrategyTest {
    @Resource
    private StrategyContext context;

    @Test
    public void test() {
        log.info(context.strategySelect("resourceA").doSomething());
        log.info(context.strategySelect("resourceB").doSomething());
        log.info(context.strategySelect("resourceDefault").doSomething());
    }
}
