/**
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

public class IntersectionOf2LinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
    int lenA = 0;
    ListNode currA = headA;
    while (currA != null) {
      currA = currA.next;
      lenA++;
    }
    int lenB = 0;
    ListNode currB = headB;
    while (currB != null) {
      currB = currB.next;
      lenB++;
    }
    currA = headA;
    currB = headB;
    while (lenA > lenB) {
      currA = currA.next;
      lenA--;
    }
    while (lenB > lenA) {
      currB = currB.next;
      lenB--;
    }
    while (currA != currB) {
      currA = currA.next;
      currB = currB.next;
    }
    return currA;
  }

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
