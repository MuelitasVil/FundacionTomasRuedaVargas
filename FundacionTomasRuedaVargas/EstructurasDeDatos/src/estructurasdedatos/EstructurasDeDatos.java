/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel Martinez
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        MainWindow interfaz = new MainWindow();
        interfaz.setVisible(true);
        
        /*
        ArbolAvlArrays tree = new ArbolAvlArrays();
        BufferedReader lector; //Leer archivo
        String linea;  //Recibe cada fila
        String partes[] = null;  //Almacena cada linea leida
        DefaultTableModel model = new DefaultTableModel();

        */
        /*
        
        Probar ingreso de datos : 
        
        try {
            lector = new BufferedReader(new FileReader("E:\\Manuel Martinez\\Descargas\\prueba_1_10.csv"));
            while ((linea = lector.readLine()) != null) {
                QueueRef cola = new QueueRef();
                partes = linea.split(",");

                *//*
                cola.push(partes[0]);
                cola.push(partes[1]);
                cola.push(partes[2]);
                cola.push(partes[3]);
                cola.push(partes[4]);
                cola.push(partes[5]);
                cola.push(partes[6]);
                
                colas.push(cola);
                 */
                //colas.push(cola);
               /* tree.root = tree.insert(tree.root, partes);
                System.out.println();*/
            //}
            
            
/*
            lector.close();
            linea = null;
            partes = null;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        tree.preOrder(tree.root);
        System.out.println("");

        */
    
        //Probar arbol Avl
        /*
        
        
        ArbolAvlArrays tree2 = new ArbolAvlArrays();
        
        String arr[] = {"1","2","3","4","a","a","7"};
        tree2.root = tree2.insert(tree2.root, arr);
        String arr2[] = {"1","2","3","4","bb","bb","7"};
        tree2.root = tree2.insert(tree2.root, arr2);
        String arr3[] = {"1","2","3","4","cc","cc","7"};
        tree2.root = tree2.insert(tree2.root, arr3);

        
        tree2.preOrder(tree2.root);
        System.out.println("-------------------");
        
        String datos = tree2.Shearch(tree2.root, "a a");
        System.out.println(datos);
        
        System.out.println("Preorder traversal" +
                        " of constructed tree is : ");
*/
       
 
        
        /* 
        QueueRef colas = new QueueRef();
        QueueRef_Colas cola = new QueueRef_Colas();
        MAnipularCSV file = new MAnipularCSV();
        
        
        cola = file.leerArchivo("E:\\Manuel Martinez\\Descargas\\prueba_1_10.csv");
        
        
        while(! cola.empty()){            
            
            colas = cola.pop();
            System.out.println(colas.pop()+"\t"+colas.pop()+"\t"+colas.pop()+"\t"+colas.pop()+"\t"+colas.pop()+"\t"+colas.pop());                          
         */
    }

}
