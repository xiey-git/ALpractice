package ALpractice.other;

import java.util.*;

public class LRU {
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */

    public static int[] LRU (int[][] operators, int k) {
        LinkedHashMap<Integer,Integer> map =new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList();

        for (int [] op : operators){
            int key = op[1];
            switch(op[0]){
                case 1:{
                    int value = op[2];
                    if (map.size()<k){
                        map.put(key,value);
                    }else{
                        Iterator iterator = map.keySet().iterator();
                        map.remove(iterator.next());
                        map.put(key,value);
                    }
                }
                break;
                case 2:{
                    if (map.containsKey(key)){
                        int value = map.get(key);
                        list.add(value);
                        map.remove(key);
                        map.put(key,value);
                    }else{
                        list.add(-1);
                    }
                }
                break;
                default:
            }
        }
//        int[] array = list.toArray(new int[list.size()]);

        int[] arr = new int[list.size()];
        for (int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,1,1}, {1,2,2},{1,3,2}, {2,1}, {1,4,4}, {2,2}};
        int [] arrRe = LRU(arr,3);
        for (int i=0;i< arrRe.length;i++){
            System.out.println(arrRe[i]);
        }
    }
}
