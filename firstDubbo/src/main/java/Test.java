import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by jimmy on 2016/11/23.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        A a = new A();
        B b = new B();
        System.out.println(a.getB());
        System.out.println(a.getB().getA());
    }
}
