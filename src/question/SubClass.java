package question;

public class SubClass extends SuperClass{
    public SubClass(){
        num = num + f(2);
    }
    public int f(int x){
        return x * x;
    }
    public void g(int x){
        super.num -= x;
    }
    public void h(double x){
        num /= x;
    }
}
