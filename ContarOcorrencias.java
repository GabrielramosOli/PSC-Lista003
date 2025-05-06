import java.util.Random;
import java.util.Scanner;

public class ContarOcorrencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            Integer num = random.nextInt(15);
            nums[i] = num;
        }
        Integer escolha;
        int aparecimento = 0;
        System.out.println("escolha um numero entre 1 e 20: ");
        escolha = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (escolha == nums[i]) {
                aparecimento = aparecimento + 1;
            }
        }
        System.out.printf("O seu numero se repetiu %d", aparecimento);

        sc.close();

    }
}
