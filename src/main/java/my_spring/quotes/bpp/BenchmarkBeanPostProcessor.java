package my_spring.quotes.bpp;

import my_spring.Benchmark;
import my_spring.BenchmarkProxyConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.HashMap;
import java.util.Map;

public class BenchmarkBeanPostProcessor implements BeanPostProcessor {
    BenchmarkProxyConfigurator configurator = new BenchmarkProxyConfigurator();
    Map<String, Class> map = new HashMap();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass().isAnnotationPresent(Benchmark.class)) {
            map.put(beanName, bean.getClass());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> aClass = map.get(beanName);
        if(aClass!=null){
            configurator.wrapWithProxy(bean, aClass);
        }
        return bean;
    }
}
