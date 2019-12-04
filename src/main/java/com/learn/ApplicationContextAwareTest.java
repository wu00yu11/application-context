package com.learn;

import com.learn.annotation.RpcService;
import com.learn.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @program: applicationcontext
 * @description:
 * @author: zjj
 * @create: 2019-12-04 15:00
 **/
public class ApplicationContextAwareTest implements ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationContextAwareTest.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info(">>>>>>>>>>>>>>>> applicationContext is {}",applicationContext);
       String[] services =  applicationContext.getBeanNamesForAnnotation(RpcService.class);
        for (String service : services) {
            HelloService helloService = (HelloService) applicationContext.getBean(service);
            logger.info(">>>>>>>>>>>>>   service: {}",helloService.hello());
        }
    }
}
