package AddTwoNumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		   ListNode result = new ListNode(0);
		    ListNode temp1 = l1;
			ListNode temp2 = l2;
	        ListNode tempres = result;
	        int carry = 0;
			while (temp1 != null || temp2 != null) {
			    int x = (temp1 != null) ? temp1.val : 0;
			    int y = (temp2 != null) ? temp2.val : 0;
			    int sum = carry + x + y;
			    carry = sum/10;
				tempres.next = new ListNode(sum%10);
				if (temp1 != null) temp1 = temp1.next;
				if (temp2 != null) temp2 = temp2.next;
				tempres = tempres.next;
			}
			if (carry > 0) {
			    tempres.next = new ListNode(carry);
			}
			return result.next;
	}
}
