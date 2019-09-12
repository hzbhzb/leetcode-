package leetcode;

/**
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

 *你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * @author huangzhebin
 *
 */
public class SwapPairs {

	/**
	 * 新建一个头部，把给出的节点依次添加进去，n为奇数时添加该节点下一个节点，偶数是添加该节点
	 * @param head
	 * @return
	 */
	public ListNode swapPairs(ListNode head) {
		
		ListNode h = new ListNode(0);
		ListNode p = h;
		int count = 1;
		
		while (head != null) {
			if (count % 2 != 0) {  
				p.next = head.next;
                if (head.next != null) { 
                    head.next = head.next.next;
                    p = p.next;
                } else {
                	//当前节点为最后一个节点，直接添加进去跳出循环
                	p.next = head;
                	head.next = null;
                	break;
                }
							
			} else {
				p.next = head;
				p = p.next;
				head = head.next;
			}
			
			count += 1;
		}
		return h.next;
	}
	
	

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
