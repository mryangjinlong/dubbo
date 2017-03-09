/**
 * Created by jimmy on 2016/11/30.
 */
public class A {
    private B b = Factory.getB();

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
