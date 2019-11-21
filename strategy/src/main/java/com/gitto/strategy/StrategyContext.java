package com.gitto.strategy;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
