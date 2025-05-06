public class IntersecaoVetores {
    public static void main(String[] args) {
        int[] a = {12,45,78,67,91,10};
        int[] b = {12,23,34,67,89,10};
        int tamanhoc = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[i]) {
                    tamanhoc = tamanhoc + 1;
                }   
            }
        }
        System.out.println("Os numeros da Intersecao C sao:");
        int[] c = new int[tamanhoc];
        for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[i] = a[i];
                    System.out.println(c[i]);
                    break;
                   }
               }
        }
        

    }
}
