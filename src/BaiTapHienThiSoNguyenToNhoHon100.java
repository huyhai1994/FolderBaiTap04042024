public class BaiTapHienThiSoNguyenToNhoHon100 {
    public static boolean checkPrime(int input_number){
        int count_divisible_times = 0;
        for (int i = 1; i <= input_number; i++) {
            boolean is_divisible = input_number%i==0;
            if (is_divisible){
                count_divisible_times++;
            }
        }
        return (count_divisible_times == 2);
    }
    public static void primeNumberGenerator(int prime_number_limit){
       int number = 1;
        while  (number <= prime_number_limit){
            if (checkPrime(number)){
                System.out.print(number+" ");
            }
            number++;
        }
    }
    public static void main(String[] args) {
        int number_of_prime_to_print = 100;
        primeNumberGenerator(number_of_prime_to_print);
    }
}
