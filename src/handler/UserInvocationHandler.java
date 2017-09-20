package handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Tomecs on 2017/9/20.
 */
public class UserInvocationHandler implements InvocationHandler {

    private Object target;

    public UserInvocationHandler() {
    }

    public UserInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前name:--------"+method.getName());
        Object obj = method.invoke(target, args);
        System.out.println("调用后name:--------"+method.getName());
        return obj;
    }
}
