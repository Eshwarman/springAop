package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class authenticationClass {
    @Pointcut("within(demo..*)")
    public void authenticationPointcut(){

    }
    @Pointcut("within(demo..*)")
    public void authorizationPointcut(){

    }
    @Before("authenticationPointcut() && authorizationPointcut()")
    public void authentication(){
        System.out.println("authentication started");
    }

}
