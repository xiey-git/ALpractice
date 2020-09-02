package ALpractice.DP.simple.recursion;

import java.util.Scanner;

public class StoryOfCow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[85];
        numbers[1]=1;
        numbers[2]=2;
        numbers[3]=3;
        numbers[4]=4;
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=5;i<85;i++){
                numbers[i]=numbers[i-1]+numbers[i-3];
            }
            System.out.println(numbers[n]);
        }
    }
}
