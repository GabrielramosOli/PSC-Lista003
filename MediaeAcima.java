import java.util.Scanner;

public class MediaeAcima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[12];
        Double soma = 0.0;
        Double media = 0.0;
        for (int i = 0; i < 12; i++) {
            System.out.printf("Escreva o numero do indice %d: ", i);
            nums[i] = sc.nextInt();
            soma = soma + nums[i];
            media = soma/12;
        }
        int acimamedia = 0;
        for (int i = 0; i < 12; i++) {
            if (nums[i] > media) {
                acimamedia = acimamedia + 1;
            }
        }
        System.out.println("A media dos numeros é " + media);
        System.out.println(acimamedia + " numeros ficaram acima da media.");
        sc.close();
    }
}
