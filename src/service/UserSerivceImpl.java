package service;

/**
 * Created by Tomecs on 2017/9/20.
 */
public class UserSerivceImpl implements UserService {
    @Override
    public void say(String name) {
        System.out.println(name);
    }
}
