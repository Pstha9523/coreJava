package loopPractice;

public class LoopPractice {

    public static void add(){
        int total = 0;

        for(int i = 1; i <= 5; i++){
            total += i;
        }
        System.out.println(total);
    }

    public static void sum(){
        int sumTotal = 0;
        for(int i = 1; i <= 10; i++){
            sumTotal += i;
        }

        System.out.println(sumTotal);

    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }

        for(int i = 2; i < number; i++ ){
            if(number % i == 0){
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        add();
        sum();
        System.out.println(isPrime(7));

    }
}
