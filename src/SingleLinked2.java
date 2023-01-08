public class SingleLinked2 {
    ListNode firstlink;
    ListNode sedondlink;
    ListNode thirdlink;
    ListNode head;

    public void insert(){

        firstlink = new ListNode();
        head = new ListNode();

        head.next = firstlink;
        firstlink.next = sedondlink;
        sedondlink.next = thirdlink;
        thirdlink.next = null;



    }
}
