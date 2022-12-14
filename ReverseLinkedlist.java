public class ReverseLinkedlist {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr.next != null){
//            System.out.println((prev!=null?prev.val:"null") + "---*****" + curr.val);
            ListNode newCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newCurr;
//            System.out.println(prev.val + "*****" + (curr!=null?curr.val:";;"));
        }

        curr.next = prev;

        return curr;
    }

    public static void main(String[] args) {

        ListNode list = new ListNode();
        list.val = 1;
        list.next = new ListNode(2, new ListNode(3,new ListNode(4, new ListNode(5))));
        ReverseLinkedlist reverseLinkedlist = new ReverseLinkedlist();
        ListNode reversed = reverseLinkedlist.reverseList(list);

        while(reversed != null)
        {
            System.out.println(reversed.val);

            reversed = reversed.next;
        }

    }
}



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
