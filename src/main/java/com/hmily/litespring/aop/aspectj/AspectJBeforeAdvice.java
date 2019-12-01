package com.hmily.litespring.aop.aspectj;

import com.hmily.litespring.aop.Advice;
import com.hmily.litespring.aop.Pointcut;
import com.hmily.litespring.tx.TransactionManager;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class AspectJBeforeAdvice extends AbstractAspectJAdvice {

    public AspectJBeforeAdvice(Method adviceMethod,AspectJExpressionPointcut pointcut,Object adviceObject){
        super(adviceMethod,pointcut,adviceObject);
    }

    public Object invoke(MethodInvocation mi) throws Throwable {
        //例如： 调用TransactionManager的start方法
        this.invokeAdviceMethod();
        Object o = mi.proceed();
        return o;
    }
}
