import java.util.Scanner;

public class ThucHanhHienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle ");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print ososeles triangle ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j <7; j++) {
                            System.out.print('*');
                            System.out.print(' ');
                        }
                        System.out.println(' ');
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print('*');
                            System.out.print(' ');
                        }
                        System.out.println(' ');
                    }
                    break;
                case 3:
                    for (int i = 7; i >=1; i--) {
                        for (int j = 1 ; j <=i; j++) {
                            System.out.print('*');
                            System.out.print(' ');
                        }
                        System.out.println(' ');
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
