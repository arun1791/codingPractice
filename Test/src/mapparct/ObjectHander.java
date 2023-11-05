package mapparct;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectHander implements InvocationHandler {

    private Object object;
    public ObjectHander(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'invoke'");
        //logic before lofic 
        System.out.println("before method call");
        arg1.invoke(object, arg2);
        System.out.println("after method call");
        //after logic 
        return null;

    }
    
}