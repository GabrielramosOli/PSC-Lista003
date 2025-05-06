public class UniaoVetores {
    public static void main(String[] args) {
        int[] a = {12,45,78,3,91};
        int[] b = {56,23,67,34,89};
        int[] c = new int [a.length + b.length]; 

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(" " + c[i]);
        }
        
        
    }
}
