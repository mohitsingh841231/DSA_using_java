public class leetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head.next;
        if(head == null&&head.next == null)return null;
        while(temp != null){
            count ++;
            temp = temp.next;
            
        }
        int steps = count-n;
        if(steps == 0){
            return head.next;
        }
        temp = head;
        for(int i =1;i<steps;i++){
            temp = temp.next;

        }
       temp.next = temp.next.next;
        
    return head;
    }
}
