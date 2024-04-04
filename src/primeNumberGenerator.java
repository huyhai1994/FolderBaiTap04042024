import java.util.Scanner;

public class primeNumberGenerator {
// class name -> camelCase
    public static void main(String[] args) {
        Scanner user_input_number_to_check_prime = new Scanner(System.in);
        System.out.print("Enter a number");
        int number_to_check_is_prime = user_input_number_to_check_prime.nextInt();
        boolean is_number_is_2 = number_to_check_is_prime ==2;
        if (is_number_is_2){
            System.out.println(number_to_check_is_prime+ " is not a prime number");
        } else{
            int number_divisible_in_loop = 2;
            boolean check_divisible = true;
            while (number_divisible_in_loop<=Math.sqrt(number_to_check_is_prime)){
                if (number_to_check_is_prime%number_divisible_in_loop ==0){
                    check_divisible = false;
                    break;
                }
                number_divisible_in_loop ++;
            }
            if(check_divisible)
                System.out.println(number_to_check_is_prime + "is prime number");
            else
                System.out.println(number_to_check_is_prime+ "is not prime number");
        }
    }
}
