public class first20PrimeNumberGenerator {
    public static boolean checkPrime(int inputNumber){
        int count_divisible_times = 0;
        for (int i = 1; i <= inputNumber; i++) {
            boolean is_divisible = inputNumber%i==0;
            if (is_divisible){
                count_divisible_times++;
            }
        }
        return (count_divisible_times == 2);
    }
    public static void primeNumberGenerator(int numberOfPrimeToPrint){
       int number = 1;
       int count_prime_number = 1;
        while  (count_prime_number <= numberOfPrimeToPrint){
            if (checkPrime(number)){
                System.out.print(number+" ");
                count_prime_number++;
            }
            number++;
        }
    }
    public static void main(String[] args) {
        int number_of_prime_to_print = 20;
        System.out.println("The first "+ number_of_prime_to_print+
                                        " number of prime to print :");
        primeNumberGenerator(number_of_prime_to_print );
    }
}
