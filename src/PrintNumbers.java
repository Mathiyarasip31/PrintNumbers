import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();
        Print(input);
        System.out.println();
    }
    public static void Print(int input) {
        int result = 0;
        if (input == 1) {
            System.out.print("1"+" ");
        } else {
            Print(input - 1);
            System.out.print(input+" ");
        }
    }
}
