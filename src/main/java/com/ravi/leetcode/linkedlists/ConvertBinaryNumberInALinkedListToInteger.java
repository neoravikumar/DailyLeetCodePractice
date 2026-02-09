import com.ravi.Utils;
import com.ravi.leetcode.linkedlists.ListNode;

void main() {
    int[] original1 = {1, 0,1};
    ListNode head = Utils.createLinkedList(original1);
    int result = getDecimalValue(head);
    System.out.println(result);
}

public static int getDecimalValue(ListNode head) {
    StringBuilder sb = new StringBuilder();
    while(head != null){
        sb.append(head.val);
        head = head.next;
    }
    int decimalValue = Integer.parseInt(sb.toString(), 2);
    return decimalValue;
}