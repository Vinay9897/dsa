package dsaQuestion;

public class LeetSolutio {
    public static void main(String[] args) {
        ListNode tail = new ListNode(0);
        ListNode head = tail;
        for (int i = 1; i <= 5; i++) {
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        int k = 2;
        reverseKGroup(head.next, k);
        display(head.next);

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode res = head;
        int end = 0;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;

        int i = 0;
        while (res != null && end <= count) {
            System.out.print(i + "--->" + res.val + " ");
            int[] arr = new int[k];
            arr[i] = res.val;
            i++;
            if (i == k) {
                // System.out.print(arr[0] + " " + arr[1]);
                while (i > 0) {
                    i--;
                    if (temp != null) {
                        temp.val = arr[i];
                        // System.out.print(temp.val + " " + arr[i]);
                        temp = temp.next;
                    }
                }
                end += k;
                i = 0;
            }
            res = res.next;
        }
        return res;
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
