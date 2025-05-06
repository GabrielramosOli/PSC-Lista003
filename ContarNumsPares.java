public class ContarNumsPares {
    public static void main(String[] args) {
        int[] nums = {14, 37, 82, 5, 63, 29, 91, 46, 55, 72, 18, 33, 67, 24, 88, 11, 50, 95, 7, 42};
        int soma = 0;
        for (int i = 0; i < 20; i++) {
            int x = 1;
            if (nums[i] % 2 == 0) {
                soma = soma + x;
            }
        }
        System.out.printf("%d desses numeros são pares.", soma);
    }
}
