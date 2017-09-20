package proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Tomecs on 2017/9/20.
 */
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行前：" + method.getName());
        Object obj = methodProxy.invokeSuper(o, args);
        System.out.println("执行后："+method.getName());
        return obj;
    }
}
