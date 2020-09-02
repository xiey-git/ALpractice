package ALpractice.chain;

import java.util.List;

/**
 * @author: XieY
 * @date: 2020/9/1
 */
public class MergeTwoChain {


    public static class ListNode {
        int val;
        ListNode next = null;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode l1= new ListNode(1);
    static ListNode l2 = new ListNode(2);
    static ListNode l3 = new ListNode(3) ;
    static ListNode l4 = new ListNode(4);
    static ListNode l5 = new ListNode(5);
    static ListNode l6 = new ListNode(6);

    public static void main(String[] args) {

        l1.next = l3;
        l2.next = l4;
        mergeTwoLists(l1,l2);
    }


    public static ListNode mergeTwoLists (ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode indexNode = null;
        ListNode preHead ;
        preHead = indexNode;
        while(temp1.next!=null&&temp2.next!=null){
            if(temp1.val<=temp2.val){
                indexNode.next = temp1;
                temp1=temp1.next;
                indexNode = indexNode.next;
            }
            else{
                indexNode.next = temp2;
                temp2=temp2.next;
                indexNode = indexNode.next;
            }
        }
        return preHead.next ;
    }


}
