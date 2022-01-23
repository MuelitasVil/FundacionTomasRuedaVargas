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
public class ArbolAvlArrays {
    
    class Node {

        String key[] = new String[7];
        int height;
        Node left, right;

        Node(String d[]) {
            key = d;
            height = 1;
        }
    }

        Node root;

        // A utility function to get the height of the tree
        int height(Node N) {
            if (N == null) {
                return 0;
            }

            return N.height;
        }

        // A utility function to get maximum of two integers
        int max(int a, int b) {
            return (a > b) ? a : b;
        }

        // A utility function to right rotate subtree rooted with y
        // See the diagram given above.
        Node rightRotate(Node y) {
            Node x = y.left;
            Node T2 = x.right;

            // Perform rotation
            x.right = y;
            y.left = T2;

            // Update heights
            y.height = max(height(y.left), height(y.right)) + 1;
            x.height = max(height(x.left), height(x.right)) + 1;

            // Return new root
            return x;
        }

        // A utility function to left rotate subtree rooted with x
        // See the diagram given above.
        Node leftRotate(Node x) {
            Node y = x.right;
            Node T2 = y.left;

            // Perform rotation
            y.left = x;
            x.right = T2;

            //  Update heights
            x.height = max(height(x.left), height(x.right)) + 1;
            y.height = max(height(y.left), height(y.right)) + 1;

            // Return new root
            return y;
        }

        // Get Balance factor of node N
        int getBalance(Node N) {
            if (N == null) {
                return 0;
            }

            return height(N.left) - height(N.right);
        }
       
        
        
         Node insert(Node node, String key[]) {

            /* 1.  Perform the normal BST insertion */
            if (node == null) {
                //System.out.println("Efectivamente se inserto");
                return (new Node(key));
            }
            
            String nombre_insertar = key[4] + key[5];
            String nombre_comparar = node.key[4] + node.key[5];
            
            //System.out.println(nombre_insertar);
            //System.out.println(nombre_comparar);
           
            if (nombre_insertar.compareTo(nombre_comparar) < 0 /*key < node.key*/) {
                //System.out.println("inserta menor");
                node.left = insert(node.left, key);
            } else if (nombre_insertar.compareTo(nombre_comparar) > 0 /*key > node.key*/) {
                //System.out.println("inserta mayor");
                node.right = insert(node.right, key);
            } else // Duplicate keys not allowed
            {
                return node;
            }

            //System.out.println(nombre_insertar);
            //System.out.println(nombre_comparar);
            
            /* 2. Update height of this ancestor node */
            node.height = 1 + max(height(node.left),
                    height(node.right));

            /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
            int balance = getBalance(node);
            
            //System.out.println(nombre_insertar);
            //System.out.println(nombre_comparar);
            
            /*
            String Comprar_balance_izquiera = node.left.key[4] + node.left.key[5];
            String Comprar_balance_derecha = node.right.key[4] + node.right.key[5];
            
            System.out.println("izquierda "+  Comprar_balance_izquiera);
            System.out.println("derecha "+ Comprar_balance_derecha);
            
            */
            // If this node becomes unbalanced, then there
            // are 4 cases Left Left Case
            if (balance > 1 && nombre_insertar.compareTo(node.left.key[4]+node.left.key[5]) < 0 /*key < node.left.key*/) {
                return rightRotate(node);
            }

            // Right Right Case
            if (balance < -1 && nombre_insertar.compareTo(node.right.key[4]+node.right.key[5]) > 0 /*key > node.right.key*/) {
                return leftRotate(node);
            }

            // Left Right Case
            if (balance > 1 && nombre_insertar.compareTo(node.left.key[4]+node.left.key[5]) > 0 /*key > node.left.key*/) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

            // Right Left Case
            if (balance < -1 && nombre_insertar.compareTo(node.right.key[4]+node.right.key[5]) < 0 /*key < node.right.key*/) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

            /* return the (unchanged) node pointer */
            return node;
        }
         
         String Shearch(Node node, String key) {

            /* 1.  Perform the normal BST insertion */
            String datos = "";
            if (node == null) {
                //System.out.println("Efectivamente se inserto");
                return datos;
            }
            String nombre_comparar = node.key[4] +" "+node.key[5];
            System.out.println(nombre_comparar);
            if (key.compareTo(nombre_comparar) < 0 /*key < node.key*/) {
                datos = datos + Shearch(node.left, key);
            } else if (key.compareTo(nombre_comparar) > 0 /*key > node.key*/) {
                datos = datos + Shearch(node.right, key);
            } else // Duplicate keys not allowed
            {
                datos = " | "+ node.key[0] + " | " + node.key[1] + " | " + node.key[2] + " | " +node.key[3] + " | " +node.key[4] + " | " +node.key[5] + " | " + node.key[6];
                return datos;
            }
            
            return datos;
         }
         
        // A utility function to print preorder traversal
        // of the tree.
        // The function also prints height of every node
        void preOrder(Node node) {
            if (node != null) {
                System.out.println(" | "+ node.key[0] + " | " + node.key[1] + " | " + node.key[2] + " | " +node.key[3] + " | " +node.key[4] + " | " +node.key[5] + " | " + node.key[6]);
                preOrder(node.left);
                preOrder(node.right);
            }
        }
        
        int Contar_universidades(Node node, String key) {
            
            int cont = 0;
            if (node != null) {
                
                if(node.key[0].equals(key)){
                    System.out.println("Igual U");
                    cont = cont + 1;
                }
                
                if(node.key[2].equals(key)){
                    System.out.println("Igual U");
                    cont = cont + 1;
                }
                

                cont = cont + Contar_universidades(node.left,key);
                cont = cont + Contar_universidades(node.right,key);
                System.out.println(cont);
                return cont;
            }
        
            return 0;
            
        }
         
        int Contar_carreras(Node node,String key) {
            int cont = 0;
            if (node != null) {
                
                if(node.key[1].equals(key)){
                    System.out.println("Igual C");
                    cont = cont + 1;
                }
                
                if(node.key[3].equals(key)){
                    System.out.println("Igual C");
                    cont = cont + 1;
                }
                
                
                cont = cont + Contar_carreras(node.left, key);
                cont = cont + Contar_carreras(node.right, key);
                System.out.println(cont);
                
                return cont;
            }
        return 0;
        }
        
    
}
