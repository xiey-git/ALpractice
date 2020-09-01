package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;

public class Demo2 {
    //1.获取私有属性
    //2.获取私有方法
    //3.调用私有方法
    public static void main(String[] args) {
        //1.获取私有属性
        User user = new User("张三","27");
        Field[] fields = user.getClass().getDeclaredFields();

        for (int i=0; i<fields.length; i++){
            fields[i].setAccessible(true);
            System.out.println("私有属性"+i+fields[i].getName());
        }

        //2.获取私有方法
        Method[] methods = user.getClass().getDeclaredMethods();
        for (int i=0; i<methods.length; i++){
            methods[i].setAccessible(true);
            System.out.println("私有方法"+i+methods[i].getName());
        }

        //3.调用私有方法
        for (int i=0; i< methods.length; i++){
            try {
                System.out.println("开始调用方法");
                methods[i].invoke(user, "李四");
            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }
}
