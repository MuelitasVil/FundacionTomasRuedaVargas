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
public class LinkedList {

    private class Node {

        private String data;
        private LinkedList next;

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

        public LinkedList getNext() {
            return next;
        }

        public void setNext(LinkedList next) {
            this.next = next;
        }
    }
    
    
    
}
