package reflect;

public class User{
    private String name;
    private String age;
    public User(){}
    public User(String name,String age) {
        this.name = name;
        this.age = age;
        System.out.println("构造");
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }

    public void fight(){
        System.out.println("pingpong");
    }



}
