class Solutions:

    #876
    def middleNode(head: [ListNode]) -> [ListNode]:
        slo, fas = head, head
        while fas and fas.next:
            slo, fas = slo.next, fas.next.next
        return slo.val

    a, a.val = ListNode.ListNode(), 1
    b, b.val = ListNode.ListNode(), 2
    c, c.val = ListNode.ListNode(), 3
    a.next = b
    b.next = c
    
    print(middleNode(a))