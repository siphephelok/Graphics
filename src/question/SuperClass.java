package question;

public class SuperClass {
    protected int num = 2;

    public SuperClass() {
        num = num + f(1);
    }
    int f(int x){
        return 2 * x;
    }
    void g(double x){
        num += x;
    }
    void h(double x){
        num *= x;
    }
}
