package ALpractice.other;

import java.util.Arrays;
import java.util.Comparator;

public class Kbig {
    public static class Finder {
        public static int findKth(int[] a, int n, int K) {
            Comparator cp =new Comparator<Integer>() {
                @Override
                public int compare( Integer o1, Integer o2) {
                    return  o2-o1;
                }
            };
            int length = a.length;
            Integer[] arr = new Integer[length];
            for(int i =0; i<length; i++){
                arr[i] = a[i];
            }
            Arrays.sort(arr ,cp);
            int result = arr[K-1];
            return result;
        }

        public static void main(String[] args) {
            int [] a ={4,8,1,5,2};
            System.out.println(findKth(a,5,2));
        }
    }
}
