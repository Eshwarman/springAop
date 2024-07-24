package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(beanclass.class);
        shopping cart=context.getBean(shopping.class);
        cart.checkout(5);
    }
}
