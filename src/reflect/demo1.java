package reflect;

public class demo1 {
    //反射创建实例
    public static void main(String[] args) {
        try {
            //获取类实例 然后newInstance()
            User user = (User) Class.forName("reflect.User").newInstance();

            //获取构造器实例 然后newInstance()
            User user1 = (User) Class.forName("reflect.User").getConstructor(String.class, String.class).newInstance("张三", "20");
            System.out.println(user);
            System.out.println(user1);
        }catch (Exception e){
        }
    }
}
