package ALpractice.chain;

public class DeleteReverseCountingN {


      public class ListNode {
        int val;
        ListNode next = null;
      }


    /**
     *
     * @param head ListNode类
     * @param n int整型
     * @return ListNode类
     */

    public ListNode removeNthFromEnd (ListNode head, int n) {
        int i =0;
        ListNode index1 = head;
        ListNode index2 = head;
        int length = 1;
        ListNode count = head;
        if(head==null){
            return null;
        }
        while(count.next!=null){
            length++;
            count = count.next;
        }
        if(n>length){
            return head;
        }
        if(length==1){
            return null;
        }
        if (n==1) {
            ListNode temp = head;
            ListNode pre = null;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = null;
        }
        if(n==length){
            head = head.next;
        }
//        if (head==null){
//            return head;
//        }
//        if (head.next==null){
//            return null;
//        }
//        if (head.next.next==null){
//            if(n==1){
//                head.next =null;
//                return head;
//            }
//            else if(n==2){
//                head=head.next;
//                return head;
//            }
//        }
//        if (n==1) {
//            ListNode temp = head;
//            ListNode pre = null;
//            while (temp.next != null) {
//                pre = temp;
//                temp = temp.next;
//            }
//            pre.next = null;
//        }

        for (int j=1;j<n;j++){
            index1=index1.next;
        }
        while (index1.next!=null){
            index1=index1.next;
            i++;
        }

        for (int k=0; k<i-1; k++){
            index2 = index2.next;
        }
        index2.next = index2.next.next;
        return head;
    }
}
