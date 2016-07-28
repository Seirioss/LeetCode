package MergeTwoSortedLists;

import java.util.HashMap;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyhead1 = new ListNode(0);
		ListNode dummyhead2 = new ListNode(0);
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        ListNode output = new ListNode(0);
        dummyhead1.next = l1;
        dummyhead2.next = l2;
        
        if(pointer1 == null) return l2;
        else if(pointer2 == null) return l1;
        
        HashMap<Integer, ListNode> buff = new HashMap<Integer, ListNode>();
        while(pointer1 != null) {
        	buff.put(pointer1.val, pointer1);
        	pointer1 = pointer2.next;
        }
        while(pointer2 != null) {
        	buff.put(pointer2.val, pointer2);
        	pointer2 = pointer2.next;
        }
        for(int i = 0; i < buff.size(); i++) {
        	if(buff.get(i) != null) {
        		output = buff.get(i);
        		output = output.next;
        		
        		System.out.println(buff.get(i));
        		
        	} else output = output.next; 
        }

        return output;
        
	}
}
