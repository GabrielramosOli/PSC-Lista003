import java.util.Scanner;

public class RemoverElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {12, 45, 78, 3, 91, 56, 23, 67, 34, 89};
        String numexcluido;
        System.out.println("12, 45, 78, 3, 91, 56, 23, 67, 34, 89");
        System.out.println("Escreva qual dos numero acima voce deseja excluir: ");
        numexcluido = sc.next();
        switch (numexcluido.toLowerCase()) {
            case "12":
                nums[0] = nums[0] - nums[0];
                System.out.println("O numero excluido estava no vetor " + 0);
                break;
            case "45":
                nums[1] = nums[1] - nums[1];
                System.out.println("O numero excluido estava no vetor " + 1);
                break;
            case "78":
                nums[2] = nums[2] - nums[2];
                System.out.println("O numero excluido estava no vetor " + 2);
                break;
            case "3":
                nums[3] = nums[3] - nums[3];
                System.out.println("O numero excluido estava no vetor " + 3);
                break;
            case "91":
                nums[4] = nums[4] - nums[4];
                System.out.println("O numero excluido estava no vetor " + 4);
                break;
            case "56":
                nums[5] = nums[5] - nums[5];
                System.out.println("O numero excluido estava no vetor " + 5);
                break;
            case "23":
                nums[6] = nums[6] - nums[6];
                System.out.println("O numero excluido estava no vetor " + 6);
                break;
            case "67":
                nums[7] = nums[7] - nums[7];
                System.out.println("O numero excluido estava no vetor " + 7);
                break;
            case "34":
                nums[8] = nums[8] - nums[8];
                System.out.println("O numero excluido estava no vetor " + 8);
                break;
            case "89":
                nums[9] = nums[9] - nums[9];
                System.out.println("O numero excluido estava no vetor " + 9);
                break;
               

        
    
        }
        sc.close();
    }
}
