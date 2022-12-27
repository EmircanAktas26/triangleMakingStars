import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 28.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Enter a number :");
        number = inp.nextInt();
        for (int i = 0; i < number; i++) {   //Satır
            for (int j = i; j < number; j++) { //Boşluk
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) { //Yıldız
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();

        }

        for (int a = number-1; a > 0; a--){
            for (int b = 0; b < (number-a)+1; b++){
                System.out.print(" ");
            }
            for (int c = 0; c <= a-1; c++ ){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}