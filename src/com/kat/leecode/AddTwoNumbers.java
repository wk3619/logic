package com.kat.leecode;

import java.util.List;

public class AddTwoNumbers {
public static  ListNode add(ListNode l1,ListNode l2){
    // 初始化节点头，并将curr指向他
    ListNode head=new ListNode(0);
    ListNode p=l1,q=l2,curr=head;
    // 进位
    int carry=0;
    while (p!=null||q!=null){
        int x=(p==null)?0:p.val;
        int y=q==null?0:q.val;
        int sum=x+y+carry;
        carry=sum/10;
        curr.next=new ListNode(sum%10);
        // 移动
        curr=curr.next;
        if (p!=null){
            p=p.next;
        }
        if (q!=null){
            q=q.next;
        }

    }
//    if (carry>0){
//        curr.next=new ListNode(carry);
//    }
    return head.next;
}

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
     ListNode ll=   add(l1,l2);
        while (ll!=null){
            System.out.println(ll.val);
            ll=ll.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode (int x){
        val=x;
    }
}