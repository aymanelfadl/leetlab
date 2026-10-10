class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None

        stack = []
        tmp = head

        while tmp:
            stack.append(tmp)
            tmp = tmp.next

        new_head = stack.pop()
        current = new_head

        while stack:
            node = stack.pop()
            current.next = node
            current = node

        current.next = None

        return new_head