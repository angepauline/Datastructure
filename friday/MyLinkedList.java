/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ange
 */
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ange
 */

/**
 *
 * @author Ange
 */
    public class MyLinkedList {
    class Node
    {
        int data;
        Node next;
        Node(){next=null;}
        Node(int a){this.data=a; next =null;}
        public int value(){return data;}
    }
    Node head;
    Node tail;
    int size;
    public MyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    public MyLinkedList(int a) {
        head = tail = new Node(a);
        size=1;
    }
    public void insertAtFront(int a)
    {
        Node newNode = new Node(a);
        if(head!=null) {

            newNode.next = head;
            head = newNode;
        }
        else
        {
            head=newNode;
            tail=newNode;
        }
        ++size;

    }
    public void insertAtBack(int a)
    {
        Node newNode=new Node(a);
        tail.next=newNode;
        tail=newNode;
        ++size;
    }
    public int size()
    {
        return size;
    }

    public String toString()
    {
        if(isEmpty())
            return new String("[ ]");

        else {
            Node current = head;
            String s = new String("[");
            while (current != null) {
                s += current.data;
                if (current.next == null)
                    s += "]";
                else
                    s += ",";
                current = current.next;
            }
            return s;
        }

    }
    public boolean isEmpty()
    {
        return head==null;
    }
  public void reverse()
  {
      if(this.size()<=1)// empty or we have one node!
          return;
      else
      {

          Node previous =this.head;
          Node forward=previous.next;
          Node other;
          while(forward.next!=null)
          {
              other=forward.next;
              forward.next=previous;
              previous=forward;
              forward=other;
          }
          forward.next=previous;
          Node temp=head;
          head=tail;
          tail=temp;
          tail.next=null;
      }
  }
  public void insertAt(int a, int i)
  {
      if(i<0||i>this.size())
          return;
      else if(i==0)
          insertAtFront(a);
      else if(i==size())
          insertAtBack(a);
      else
      {
          Node current=head;
          Node forward=head.next;
          for(int j=1;j<i;++j)
          {
              current=current.next;
              forward=forward.next;
          }
          Node newNode =new Node(a);
          current.next=newNode;
          newNode.next=forward;
      }
  }
  public boolean equals(MyLinkedList l)
  {
      if(this.size()!=l.size())
          return false;
      Node h1= this.head;
      Node h2=l.head;
      while(h1!=null)
      {
          if(h1.data !=h2 .data)
              return false;
          h1=h1.next;
          h2=h2.next;
      }
      return true;
  }
  public MyLinkedList concatenate(MyLinkedList l)
  {
    Node last_node=this.tail;
    last_node.next=l.head;
     return this;
    
      //this method concatenates two linked lists.
      //the call is of the form l1.concatenate(l2);
      //it will modify l1 by append to it l2 and then returns it.
     
  }
  public boolean isSorted(MyLinkedList l) //helper method to check if a linked list is sorted
  {//returns true if the Linked List is sorted in ascending order.
     Node current =l.head; 
     Node t;
     
     for( t=current;t.next!=null;t=t.next){
     if(t.data>t.next.data){
         
         return false;
     }
     
     }
        
           return true;
  }

  public MyLinkedList merge(MyLinkedList l)//Merges two sorted lists into a sorted one
  {
    
     Node current =this.head, index = null;
 
        int temp;
        //We will merge two linked list once each and every list is sorted
        if(!isSorted(this)||!isSorted(l)){
            return null;
        }
        else{
            this.concatenate(l);
            if (this.head == null) {
            return null;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;
 
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
 
                    index = index.next;
                }
                current = current.next;
            }
        }
           return this; 
        }
        
 
        
    
      //This method merges two sorted Linked Lists. If one of the two lists
      //is not sorted, it returns null. You will receive extra credit if you don't create
      // a new Linked list. l1.merge(l2)
      
  }
//Submission: (1) Work in groups of 4 max
// Each group creates a Github account
// Create a repository containing the MyLinkedList class with the
//required methods implemented.
//Send the link to your repository to tmurangira@gmail.com
//Deadline today midnight!
}

    


    


    
