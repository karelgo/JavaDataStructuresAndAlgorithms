package BinarySearch;
// Array/list must be sorted

public class App {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,3,4,5,22,44}, 22));
    }

    public static int LinearSearch(int [] a, int x) {
        int answer = -1;
        for(int i=0; i<a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int [] a, int x) {
        int p = 0;
        int r = a.length - 1;

        while (p <= r) {
            int q = (p+r)/2;
            if(x <a[q]) r = q-1;
            else if (x> a[q]) p = q+1;
            else return q;
        }
        return -1;
    }
}
