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
public class QueueRef {

    private class Node {

        private String data;
        private Node next;

        public Node() {
            this("");
        }

        public Node(String data) {
            this.data = data;
            next = null;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
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

    public QueueRef() {
        front = null;
        rear = null;
    }

    public void push(String item) {
        Node newp = new Node(item);
        if (rear != null) {
            rear.setNext(newp);
        } else {
            front = newp;
        }
        rear = newp;
    }
    
    public String top(){
       
        if(rear != null) {
            String dato = front.getData();
            return dato;
        } else {
            return null;
        }     
    }
    
    public String pop() {
        
        if(rear != null) {
            String dato = front.getData();
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
