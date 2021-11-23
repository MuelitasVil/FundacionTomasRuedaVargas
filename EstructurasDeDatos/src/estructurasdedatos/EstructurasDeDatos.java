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
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        QueueRef colas = new QueueRef();
        QueueRef_Colas cola = new QueueRef_Colas();
        MAnipularCSV file = new MAnipularCSV();
        
        
        cola = file.leerArchivo("E:\\Manuel Martinez\\Descargas\\prueba_1.csv");
        
        
        while(! cola.empty()){            
            
            colas = cola.pop();
            System.out.println(colas.pop()+"\t"+colas.pop()+"\t"+colas.pop()+"\t"+colas.pop()+"\t"+colas.pop()+"\t"+colas.pop());                          
        
        
        
        }
        
        
        
        
        
        
    
        
    }
    
}
