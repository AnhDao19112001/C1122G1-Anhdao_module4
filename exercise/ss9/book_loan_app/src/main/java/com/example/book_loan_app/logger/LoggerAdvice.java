package com.example.book_loan_app.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class LoggerAdvice {
    private int count = 0;
    @Pointcut("within(com.example.book_loan_app.controller.BookController*)")
    public void methodPointcut(){

    }
    @After("methodPointcut()")
    public void methodAfter(JoinPoint joinPoint){
        count++;
        System.err.println(joinPoint.getSignature().getName()+" the number of visitors to the library: "+ count);
    }
    @Pointcut("execution(* com.example.book_loan_app.controller.BookController.get*(..))")
    public void borrowAndPay(){

    }
    @After("borrowAndPay()")
    public void borrowAnhPayAfter(JoinPoint joinPoint){
        System.err.println(joinPoint.getSignature().getName()+ " Time: "+ LocalDateTime.now());
    }
}
