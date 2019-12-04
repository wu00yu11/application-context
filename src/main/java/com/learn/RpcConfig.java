package com.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: applicationcontext
 * @description:
 * @author: zjj
 * @create: 2019-12-04 17:03
 **/
@Configuration
public class RpcConfig {
    private static final Logger logger = LoggerFactory.getLogger(RpcConfig.class);
    @Bean
    public ApplicationContextAwareTest applicationContextAwareTest(){
        ApplicationContextAwareTest applicationContextAwareTest = new ApplicationContextAwareTest();
        logger.info(">>>>>>>>>>> rpc provider config init finish.");
        return applicationContextAwareTest;
   }
}
