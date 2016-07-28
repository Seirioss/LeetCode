package RemoveNthNodeFromEnd;

import java.util.ArrayList;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ArrayList<ListNode> buff = new ArrayList<ListNode>();
		ListNode dummyHead = head;
		while(dummyHead != null) {
			buff.add(dummyHead);
			dummyHead = dummyHead.next;
		}
		
		if(n == buff.size()) return head.next;
		else if(head.next == null) return null;
		else if(n == 1) buff.get(buff.size() - n -1).next = null;
		else buff.get(buff.size() - n - 1).next = buff.get(buff.size() - n + 1);
		return buff.get(0);
	}
}
