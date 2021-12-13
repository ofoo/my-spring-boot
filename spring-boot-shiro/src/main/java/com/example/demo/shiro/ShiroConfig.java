package com.example.demo.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
//    shiro 的三个
// Subject 用户
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        return shiroFilterFactoryBean;

    }
//    SecurityManager 管理所有的用户
@Bean
public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
    DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
//   关联 Realm
    defaultWebSecurityManager.setRealm(userRealm);
    return defaultWebSecurityManager;
}

    // Realm 连接数据
@Bean
public UserRealm userRealm(){
    return new UserRealm();
}
}

