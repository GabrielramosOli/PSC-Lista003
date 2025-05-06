public class SomaElemnetos {
    public static void main(String[] args) {
       int[] nums = {7, 23, 42, 56, 68, 15, 89, 34, 91, 5}; 
       int soma = 0;
       for (int i = 0; i < 10; i++) {
        soma = soma + nums[i];
       }
       System.out.println("o resultado da soma é: " + soma);
    }
}
