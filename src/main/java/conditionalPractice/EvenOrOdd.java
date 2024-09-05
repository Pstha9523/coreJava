package conditionalPractice;

public class EvenOrOdd {
    int number;

    public EvenOrOdd(int num){
        this.number = num;
    }

    public boolean isEven(){
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        EvenOrOdd evenOrOdd1 = new EvenOrOdd(5);
        System.out.println(evenOrOdd1.isEven());
        EvenOrOdd evenOrOdd2 = new EvenOrOdd(4);
        System.out.println(evenOrOdd2.isEven());
    }
}
