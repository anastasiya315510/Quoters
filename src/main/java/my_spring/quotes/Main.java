package my_spring.quotes;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com.xml");
        context.getBean(ShakespeareQuoter.class);



    }
}






















































































































































