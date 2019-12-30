import com.gitto.TemplateApplication;
import com.gitto.template.ClassA;
import com.gitto.template.ClassB;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest(classes = TemplateApplication.class)
public class TemplateTest {
    @Test
    public void test() {
        log.info("############# A START #############");
        new ClassA().process();
        log.info("############# B START #############");
        new ClassB().process();
    }
}
