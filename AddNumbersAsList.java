package testPackage;

public class AddNumbersAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode A = new ListNode(9);
		A.next = new ListNode(9);
		A = A.next;
		A.next = new ListNode(1);
		ListNode B = new ListNode(1);
		
		ListNode res = (addTwoNumbers(A, B));
	
	}
	
	public static ListNode addTwoNumbers(ListNode A, ListNode B) {
        return (add(A, B));
    }
    
    public static ListNode add(ListNode A, ListNode B) {

        ListNode res = new ListNode(-1);
        ListNode temp = res;
        int carry = 0;
        while(A != null && B != null) {
            int data = (carry+A.val+B.val)%10;
            res.next = new ListNode(data);
            carry = (carry+A.val+B.val)/10;
            A = A.next;
            B = B.next;
            res = res.next;
        }
        while(A != null) {
            if(carry + A.val >= 10) {
                int data = (carry+A.val)%10;
                res.next = new ListNode(data);
                carry = (carry+A.val)/10;
            }
            else {
                int data = carry + A.val;
                res.next = new ListNode(data);
                carry = 0;
            }
            res = res.next;
             A = A.next;
        }
        while(B != null) {
            if(carry + B.val >= 10) {
                int data = (carry+B.val)%10;
                res.next = new ListNode(data);
                carry = (carry+B.val)/10;
            }
            else {
                int data = carry + B.val;
                res.next = new ListNode(data);
                carry = 0;
            }
            res = res.next;
            B = B.next;
        }
        if(carry > 0) {
            res.next = new ListNode(carry);
            res = res.next;
        }
        return temp.next;
    }
}
