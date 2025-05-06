import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Escreva um numero: ");
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        
        
        
        System.out.println("Numeros ordenados em forma crescente: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        
        sc.close();
    }
}
