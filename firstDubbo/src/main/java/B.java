/**
 * Created by jimmy on 2016/11/30.
 */
public class B {
    private A a = Factory.getA();

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
