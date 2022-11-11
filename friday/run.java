/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ange
 */
public class run extends MyLinkedList {
    public static void main(String[]args){
       MyLinkedList l=new MyLinkedList();
       MyLinkedList l2=new MyLinkedList();
       MyLinkedList l3=new MyLinkedList();
       MyLinkedList l4=new MyLinkedList();
       l4.insertAtFront(3);
       l4.insertAtFront(2);
       l4.insertAtFront(1);
       l2.insertAtFront(1);
       l2.insertAtBack(2);
       l2.insertAtBack(3);
       l.insertAtFront(4);
       l.insertAtBack(69);
       l.insertAtBack(70);
       System.out.println(l3.isSorted(l));
       System.out.println(" The concatination is"+l2.concatenate(l));
       System.out.println(" The merge of two linked list is"+l.merge(l4));
       
       
       
       
       
 //System.out.println(l);
//       System.out.println(l2);
//       System.out.println(l.concatenate(l2));
      
    }
    
    
    
}
