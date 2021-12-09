/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

/**
 *
 * @author Manuel Martinez
 */
public class QueueRef_Colas {
    
    private class Node {

        private QueueRef data;
        private Node next;

        public Node() {
            this(null);
        }

        public Node(QueueRef data) {
            this.data = data;
            next = null;
        }

        public QueueRef getData() {
            return data;
        }

        public void setData(QueueRef data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node front, rear;

    public QueueRef_Colas(){
        front = null;
        rear = null;
    }

    public void push(QueueRef item) {
        Node newp = new Node(item);
        if (rear != null) {
            rear.setNext(newp);
        } else {
            front = newp;
        }
        rear = newp;
    }
    
    public QueueRef pop() {
        
        if(rear != null) {
            QueueRef dato = front.getData();
            front = front.getNext();
            return dato;
        } else {
            return null;
        }     
// insert code
    }

    public boolean empty() {
        if(front != null){
            return false;
        }else{
            return true;
        }
// insert code
    }
    
    
}
