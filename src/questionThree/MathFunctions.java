package questionThree;

public class MathFunctions {
    public int x;
    private int y;
    int z;
    public MathFunctions(){
        int x = 3;
        y = 4;
        z = 5;
    }
    public int calculate(){
        z = 1;
        class Calculator{
            private int y;
            public Calculator(){
                z = 2;
                x = 7;
                y = 8;
            }
            public int add(){
                return x + Calculator.this.y;
            }
            public int multiply(){
                return this.y * MathFunctions.this.z;
            }
        }
        Calculator calculator = new Calculator();
        return calculator.add() + calculator.multiply() + z;
    }
}
