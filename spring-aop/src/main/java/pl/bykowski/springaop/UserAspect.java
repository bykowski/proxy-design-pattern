package pl.bykowski.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

    @Before("execution(* pl.bykowski.springaop.UserService.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("before = " + jp.getSignature().getName());
    }
}
