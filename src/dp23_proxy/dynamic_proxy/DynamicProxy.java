package dp23_proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {


    //被代理的对象
    private  Ticket target;
    /**
     * 获取动态代理对象
     * @return 代理对象
     */
    public Ticket getProxy(Ticket t) {
        target=t;
        return (Ticket) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理" + proxy.getClass().getSimpleName());
        return method.invoke(target, args);
    }
}
