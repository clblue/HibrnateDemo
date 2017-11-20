package advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Welcome implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("欢迎光临！");
    }
}
