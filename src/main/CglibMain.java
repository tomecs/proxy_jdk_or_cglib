package main;

import net.sf.cglib.proxy.Enhancer;
import proxy.CglibProxy;
import service.StudentServiceImpl;

/**
 * Created by Tomecs on 2017/9/20.
 */
public class CglibMain {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(StudentServiceImpl.class);
        enhancer.setCallback(proxy);

        StudentServiceImpl studentService = (StudentServiceImpl) enhancer.create();
        studentService.name("feng");
    }
}
