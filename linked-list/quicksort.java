/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class ListNode{
    public int value;
    public ListNode next;
    public ListNode(int value)
    {
        this.value = value;
        this.next = null;
    }
    public void atEnd(int k)
    {
        ListNode li = new ListNode(k);
        
            ListNode p=this;
            while(p.next != null)
            p = p.next;
            p.next = li;
        
    }
    public void print(){
        ListNode head = this;
        while(head != null){
            System.out.print(head.value+" ");
            head = head.next;
        }
        System.out.println();
    }
}
class MyClass {
    public static ListNode quicksort(ListNode start,ListNode end){
        if(start == end || start == null)
           return start;
        ListNode[] result = partition(start,end);
        ListNode leftresult = quicksort(result[0],result[1]);
        ListNode rightresult = quicksort(result[1].next,end);
        return leftresult;
    }
    public static ListNode[] partition(ListNode start,ListNode end){
        //System.out.println(start.value+" "+end.value);
        if(start == end || start == null)
            return new ListNode[] {start,end};
        
        ListNode dummy = new ListNode(0);
        dummy.next = start;
        System.out.println(start.value+" "+end.value);
        for(ListNode j = start;j != end&&j!=null ;j=j.next)
        {
            if( start.value >= j.next.value){
                ListNode temp = new ListNode(j.next.value);
                int ii = j.next.value;
                System.out.println("swap:"+ii);
                j.next = j.next.next;
                temp.next = start;
                dummy.next = temp;
                
            }
        }
        System.out.println("par");
        dummy.next.print();
        return new ListNode[] {dummy.next,start};
        
    }
    
	public static void main (String[] args) {
		
		ListNode l = new ListNode(4);
		l.atEnd(7);
		l.atEnd(2);
		l.atEnd(56);
		l.atEnd(32);
		l.print();
		//linkedlist quicksort
		ListNode end = l;
		while(end.next!=null)
		end = end.next;
		ListNode k=quicksort(l,end);
		
		System.out.println("sorting:");
		k.print();
	    
	}
}
