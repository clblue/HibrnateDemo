package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Watch implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("欢迎光临！");
        Object proceed = methodInvocation.proceed();
        System.out.println("欢迎再次光临！");
        return proceed;
    }
}
