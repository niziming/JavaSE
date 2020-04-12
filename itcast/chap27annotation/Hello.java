package itcast.chap27annotation;

public class Hello {
    // @MyTarget //修饰属性报错
    // String name;
    public static void main(String[] args) {
        method(10, 20, 30);
        method(10, 20, "30");
    }

    public static <T> void method(T... array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
    @MyTarget
    public static void MyTarget(){
        System.out.println("修饰为方法通过");
    }

}
