package LinkedList;
// public class LL {
//     private Node head;
//     private Node tail;
//     private int size;

//     public LL() {
//         this.size = 0;
//     }

//     // public void insertFirst(int val) {
//     //     Node node = new Node(val);
//     //     node.next = head;
//     //     head = node;
//     //     if (tail == null) {
//     //         tail = head;
//     //     }
//     //     size += 1;
//     // }
//     // public void insertLast(int val){
//     //     Node node =new Node(val);
//     //     if(tail==null){
//     //         System.out.println("Insert First");
//     //     }
//     //     tail.next=node;
//     //     tail=node;
//     //     size+=1;        
//     // }
//     // public void insert(int val,int index){
//     //     if(index==0){
//     //         insertFirst(val);
//     //     }
//     //     else if(index==size){
//     //         insertLast(val); 
//     //     }
//     //     else{
//     //         Node temp=head;
//     //         for(int i=1;i<index;i++){
//     //             temp=temp.next;
//     //         }
//     //      Node node =new Node(val);
//     //      node.next=temp.next;
//     //      temp.next=node;
//     //      size+=1;
//     //     }
//     // }

//     public void insertFirst(int val){
//         Node node = new Node(val);
//         node.next=head;
//         head=node;
//         if(tail==null){
//             tail=head;
//         }
//         size++;
//     }
//     public void insertLast(int val){
//         Node node = new Node(val);
//         if(tail==null){
//             insertFirst(val);
//             return;
//         }
//         tail.next=node;
//         tail=node;
//         size++;
//     }
//     public void insert(int val,int index){
//         if(index==0){
//             insertFirst(val);
//         }
//         else if(index==size){
//             insertLast(val);
//         }
//         else{
//             Node temp=head;

//             for(int i=1;i<index;i++){
//                 temp=temp.next;
//             }
//             Node node =new Node(val);
//             node.next=temp.next;
//             temp.next=node;
//             size++;
//         }
//     }
//     public void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + "--->");
//             temp = temp.next;
//         }
//         System.out.println("END");
//     }

//     private class Node {
//         private int val;
//         private Node next;

//         public Node(int val) {
//             this.val = val;
//         }

//         public Node(int val, Node next) {
//             this.val = val;
//             this.next = next;
//         }
//     }
// }
