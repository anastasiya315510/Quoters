package my_spring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;


public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Set<Field> fields = ReflectionUtils.getAllFields(t.getClass(), field -> field.isAnnotationPresent(InjectByType.class));
        for (Field field : fields) {
            field.setAccessible(true);
            Object object = ObjectFactory.getInstance().createObject(field.getType());
            field.set(t,object);
        }
    }
}

