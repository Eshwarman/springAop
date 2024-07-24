package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspectclass {

@Before("execution(* demo.shopping.checkout(..))")
public void as(){
    System.out.println("logger class");
}
@After("execution(* *.*.checkout(..))")
public void afterLogger(){
    System.out.println("after logger");
}

}
