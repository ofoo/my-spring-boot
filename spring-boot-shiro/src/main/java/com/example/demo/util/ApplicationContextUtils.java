package com.example.demo.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    // 工厂就是该方法的参数，当Spring Boot启动时，该参数就会接收到工厂
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    // 根据Bean的名字获取工厂中指定对象
    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }

}
