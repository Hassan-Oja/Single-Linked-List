 public class singel_LL {
    Node head;
    public singel_LL(){
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void insertfirst(int x){
        Node n = new Node(x);
        n.next = head;
        head = n ;
    }
    public void insertlast(int x){
        Node n = new Node(x);
        if(head == null){
            head = n ;
            return ;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = n;
    }
    public int count(){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertpos(int data , int pos){
        Node current = head;
        Node n = new Node(data);
        int c = count();
        if(pos == 0){
            insertfirst(data);
        }else if(pos == c){
            insertlast(data);
        }else if(pos<0 || pos >c){
            return;
        }else{
            for(int i =0 ; i <pos-1 ; i++){
                current = current.next;
            }
            n.next = current.next;
            current.next = n;
        }
    }
    public boolean search(int data){
        Node current = head;
        if(isEmpty()){
            return false;
        }else{
            while (current!=null) {
                if(data == current.data){
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }
    public int delete_first(){
        if(isEmpty()){
            return 0;
        }else{
            int x = head.data;
            head = head.next;
            return x;
        }
    }
    public int delete_last(){
        int data;
        if(isEmpty()){
            return 0;
        }
        else{
            if(head.next == null){
                data = head.data;
                head = null;
                return data;
            }else{
                Node temp = head;
                Node temp1 = temp.next;
                while(temp1.next != null){
                    temp = temp1;
                    temp1 = temp1.next;
                }
                data = temp1.data;
                temp.next= null;
                return data;
            }
        }
    }
     public Object delete_pos(int pos) {
         int c = count();

         if (pos == 0) {
             delete_first();
         } else if (pos == c - 1) {
             delete_last();
         } else if (pos < 0 || pos >= c) {
             System.out.println("Invalid Position");
             return null;  // Return null for invalid position
         } else {
             Node temp = head;
             for (int i = 0; i < pos - 1; i++) {
                 temp = temp.next;
             }
             Node toDelete = temp.next;
             temp.next = toDelete.next;
         }

         return this;  // Return the modified list
     }

     public void insert_sort(int data){
        Node new_node = new Node(data);
        if(isEmpty()){
            insertfirst(data);
        }else if(head.next==null){
            if(head.data>data){
                insertfirst(data);
            }else{
                insertlast(data);
            }
        }else{
            if(head.data>data){
                insertfirst(data);
            }else{
                Node temp = head;
                Node temp1 = temp.next;
                while (temp1 != null && temp1.data<data){
                    temp = temp1;
                    temp1 = temp1.next;
                }
                if(temp1 == null){
                    insertlast(data);
                }else{
                    temp.next = new_node;
                    new_node.next = temp1;

                }
            }
        }
    }
     public int getLen(){
         int length = 0;
         Node temp = head;
         while (temp != null) {
             length++;
             temp = temp.next;
         }
         return length;
     }
     public void printMiddle() {
         if (head != null) {
             int length = getLen();
             Node temp = head;
             int middleLength = length / 2;
             while (middleLength != 0) {
                 temp = temp.next;
                 middleLength--;
             }
             System.out.print("The middle element is ["
                     + temp.data + "]");
             System.out.println();
         }
     }
     public int sum(){
         singel_LL temp = new singel_LL();
         int sum = 0;
         int x;
         while(!isEmpty()){
             x = delete_first();
             sum += x;
         }
         while(!temp.isEmpty()){
             x = temp.delete_first();
             insertfirst(x);
         }
         return sum;
     }
     public Object reverse(){
         singel_LL temp = new singel_LL();
         while (!isEmpty()){
             int x = delete_first();
             temp.insertfirst(x);
         }
         while (!temp.isEmpty()){
             int x = temp.delete_first();
             insertlast(x);
         }
          return this;
     }
    public void display(){
        Node current = head;
        if(current == null){
            System.out.println("The List is Empty");
        }else{
            System.out.println("List Values are:\n");
            while(current!=null){
                System.out.print(current.data+"");
                current = current.next;
            }
        }
    }

    public void clear (){
     head = null;
    }

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("singel_LL{");
         Node current = head;
         while (current != null) {
             sb.append(current.data);
             if (current.next != null) {
                 sb.append(" -> ");
             }
             current = current.next;
         }
         sb.append("}");
         return sb.toString();
     }

 }
