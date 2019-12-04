# spring 中 BeanNameAware\ApplicationContextAware\InitializingBean\DisposableBean
## 示例
``` java
public class Test implements BeanFactoryPostProcessor, BeanPostProcessor,InitializingBean, DisposableBean, ApplicationContextAware{
@Override
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
// TODO Auto-generated method stub
System.out.println("==postProcessBeforeInitialization=========================");
return bean;
}


@Override
public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
// TODO Auto-generated method stub
System.out.println("==postProcessAfterInitialization=========================");
return bean;
}


@Override
public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
// TODO Auto-generated method stub
System.out.println("==postProcessBeanFactory=========================");
}


@Override
public void destroy() throws Exception {
// TODO Auto-generated method stub
System.out.println("==destroy=========================");
}


@Override
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
// TODO Auto-generated method stub
System.out.println("== setApplicationContext========================");
}


@Override
public void afterPropertiesSet() throws Exception {
System.out.println("== initiailBean afterPropertiesSet=========================");

}
}
```

**总结：**
- 实现了BeanNameAware接口类,在注入时，会调用setBeanName方法
- 实现了ApplicationContextAware接口类,在注入时，会调用setApplicationContext方法
- 实现了InitializingBean接口的类,在实例初始化时，会调用afterPropertiesSet方法
- 实现了DisposableBean接口的类,在容器关闭（applicationContext.close()）时，会调用destroy方法
- 实现了FactoryBean接口的类，在获取Bean（applicationContext.getBean()）时,会调用其getObject方法
- 实现了BeanFactoryPostProcessor的类，在容器启动时，只调用一次postProcessBeanFactory方法
- 同时实现了BeanFactoryPostProcessor和BeanPostProcessor的类，postProcessBeforeInitialization/postProcessAfterInitialization方法不会被调用
- 同时实现了BeanFactoryPostProcessor和InitializingBean的类,afterPropertiesSet方法先于postProcessBeanFactory方法被调用
- 同时实现了BeanNameAware/ApplicationContextAware/InitializingBean的类，调用顺序：setBeanName>setApplicationContext>afterPropertiesSet


原文链接：https://blog.csdn.net/avenccssddnn/article/details/78318366