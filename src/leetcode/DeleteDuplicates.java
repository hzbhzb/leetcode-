package leetcode;

/**
 * 83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * @author huangzhebin
 *
 */
public class DeleteDuplicates {
	
	/**
	  Definition for singly-linked list.
	  */
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	}
	 

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
            return head;
		ListNode p = head;
		while (p.next != null) {
			if (p.next.val == p.val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
        return head;
	}

}
