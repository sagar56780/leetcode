package linkedListQuestion;

public class MergeTwoShortedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode();
        while(list1.next!=null||list2.next!=null)
        {
            if(list1.next==null)
            {
                list3=new ListNode(list2.val);
            }

        }
        return  null;


    }
    public static void main(String[] args) {
        mergeTwoLists(new ListNode(),new ListNode());
    }
    
}
