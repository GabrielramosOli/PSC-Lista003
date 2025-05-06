import java.util.Scanner;

public class VetorInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Escreva um numero: ");
            nums[i] = sc.nextInt();
        }
        for (int i = 7; i >= 0;i--) {
            System.out.println(" " + nums[i]);
        }
        sc.close();
    }
}
