/**
 * Created by jimmy on 2016/11/30.
 */
public class Factory {
    private static A a = new A();
    private static B b = new B();
    public static A getA(){
        return a;
    }
    public static B getB(){
        return b;
    }
}
