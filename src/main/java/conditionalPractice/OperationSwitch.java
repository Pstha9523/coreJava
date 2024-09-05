package conditionalPractice;

public class OperationSwitch {

    private int num1;
    private int num2;

    public OperationSwitch(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }


    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return  a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public void operate(String operation){
        switch (operation) {
            case "add":
                System.out.println(add(num1, num2));
                break;
            case "subtract":
                System.out.println(subtract(num1, num2));
                break;
            case "multiply":
                System.out.println(multiply(num1, num2));
                break;
            case "divide":
                System.out.println(divide(num1, num2));
                break;
            default:
                System.out.println("This program can only add, subtract, multiply, or divide.");
                break;
        }
    }


    public static void main(String[] args) {
        OperationSwitch operate1 = new OperationSwitch(10,20);
        operate1.operate("add");
        operate1.operate("subtract");
        operate1.operate("multiply");
        operate1.operate("divide");

    }

}
