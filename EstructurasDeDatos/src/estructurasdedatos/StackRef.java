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
public class StackRef {
    
     private class Node {

        private QueueRef data;
        private Node next;

        public Node() {
            this("");
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

    private Node top;
     
    public StackRef() {
        top = null;
    }

    public void push(QueueRef item) {
        
        Node newp = new Node(item);
        newp.setNext(top);
        top = newp;
    }

    public QueueRef pop() {
        if (top != null){
            
            QueueRef cola = top.getData();
            top = top.getNext();
            return cola;
            
        }else{
            
            return null;
        
        }
        
        
        
    }

    public boolean empty() {
        if (top != null){
            return false;
        }else{
            return true;
        }
// insert code
    }

}
