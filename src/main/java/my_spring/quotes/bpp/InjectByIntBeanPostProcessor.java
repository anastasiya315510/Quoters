package my_spring.quotes.bpp;

import lombok.SneakyThrows;
import my_spring.InjectRandomIntAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class InjectByIntBeanPostProcessor implements BeanPostProcessor{
    InjectRandomIntAnnotationObjectConfigurator configurator=new InjectRandomIntAnnotationObjectConfigurator();

    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        configurator.configure(bean);
        return bean;
    }
}
