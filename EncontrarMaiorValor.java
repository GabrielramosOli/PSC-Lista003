import java.util.Scanner;

public class EncontrarMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[15];
        for (int i = 0; i < 15; i++ ) {
            System.out.println("Escreva o numero do indice " + i + ": ");
            nums[i] = sc.nextInt();
        }
        int maiorvalor = nums[0];
        int posicao = 0;

        for(int i = 0; i < 15; i++){  
            if (nums[i] > maiorvalor) {
                maiorvalor = nums[i];
                posicao = i;
            }
        }
        System.out.printf("O maior valor é %d no indice %d.", maiorvalor, posicao);
        sc.close();
    }
}
