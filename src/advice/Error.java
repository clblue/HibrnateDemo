package advice;

import org.springframework.aop.ThrowsAdvice;

public class Error implements ThrowsAdvice {

    public void afterThrowing(Exception e)
    {
        System.out.println("错误信息如下：");
        System.out.println(e.getMessage());
    }

}
