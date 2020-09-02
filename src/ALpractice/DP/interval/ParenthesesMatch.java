package ALpractice.DP.interval;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ParenthesesMatch {

    public boolean isValid (String s) {
        //使用栈
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        for (int i=0; i<s.length(); i++){
            if("(".equals(s.charAt(i))||")".equals(s.charAt(i))){

            }
        }


        //复杂度过大
//        ArrayList list = new ArrayList();
//        for (int i=0; i<s.length(); i++){
//            list.add(s.charAt(i)) ;
//        }
//
//        while(list.size()>0){
//            if(list.get(0)=="("){
//                for( int i=0; i< list.size(); i++){
//                    if (list.get(i)==")"){
//                        list.remove(i);
//                        list.remove(0);
//                    }else{
//                        return false;
//                    }
//                }
//            }
//            if(list.get(0)=="{"){
//                for( int i=0; i< list.size(); i++){
//                    if (list.get(i)=="}"){
//                        list.remove(i);
//                        list.remove(0);
//                    }else{
//                        return false;
//                    }
//                }
//            }
//            if(list.get(0)=="["){
//                for( int i=0; i< list.size(); i++){
//                    if (list.get(i)=="]"){
//                        list.remove(i);
//                        list.remove(0);
//                    }else{
//                        return false;
//                    }
//                }
//            }
//
//        }
//        return true;
//    }
}
