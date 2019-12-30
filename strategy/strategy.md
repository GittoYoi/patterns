### 策略模式
##### 主要思想
+ 使不同算法可以被相互替换而不影响系统运行
##### 实现
![binaryTree](src/main/resources/uml.png "binaryTree")
###### 接口
```
public interface Strategy {

    default String doSomething() {
        return "default";
    }
}
```
###### 算法具体实现
```
@Component
public class ResourceA implements Strategy {
    @Override
    public String doSomething() {
        return "A";
    }
}
```
...
###### 策略上下文
```
@Component
public class StrategyContext {
    private final Map<String, Strategy> strategyMap = new ConcurrentHashMap<>();

    @Resource
    public void strategyInterface(Map<String, Strategy> strategyMap) {
        this.strategyMap.clear();
        this.strategyMap.putAll(strategyMap);
    }

    public Strategy strategySelect(String mode) {
        Preconditions.checkArgument(!StringUtils.isEmpty(mode), "方法索引不能为空");
        return this.strategyMap.get(mode);
    }
}
```
###### 单元测试
```
    public void test() {
        log.info(context.strategySelect("resourceA").doSomething());
        log.info(context.strategySelect("resourceB").doSomething());
        log.info(context.strategySelect("resourceDefault").doSomething());
    }
```
![binaryTree](src/main/resources/testRes.png "binaryTree")