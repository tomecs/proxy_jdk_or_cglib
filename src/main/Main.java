package main;

import handler.UserInvocationHandler;
import service.UserSerivceImpl;
import service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Tomecs on 2017/9/20.
 */
public class Main {
    public static void main(String[] args) {
        UserService service = new UserSerivceImpl();
        InvocationHandler handler = new UserInvocationHandler(service);
        UserService serviceProxy = (UserService) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(), handler);
        serviceProxy.say("feng");
    }
}
