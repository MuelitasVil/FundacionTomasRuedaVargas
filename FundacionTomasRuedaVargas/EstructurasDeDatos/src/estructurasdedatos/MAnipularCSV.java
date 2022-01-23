package estructurasdedatos;

import estructurasdedatos.QueueRef;
import estructurasdedatos.StackRef;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;


public class MAnipularCSV {
 
	private BufferedReader lector; //Leer archivo
	private String linea;  //Recibe cada fila
	private String partes[] = null;  //Almacena cada linea leida
	
	
	public QueueRef_Colas leerArchivo(String nombreArchivo) {
		
            try {
                        QueueRef_Colas colas = new QueueRef_Colas();
			lector = new BufferedReader(new FileReader(nombreArchivo));
			while((linea = lector.readLine()) != null) {
                                QueueRef cola = new QueueRef();
                                partes = linea.split(",");
                                
                                cola.push(partes[0]);
                                cola.push(partes[1]);
                                cola.push(partes[2]);
                                cola.push(partes[3]);
                                cola.push(partes[4]);
                                cola.push(partes[5]);
				
                                imprimirLinea();
                                colas.push(cola);
				System.out.println();
			}
			lector.close();
			linea = null;
			partes = null;
                        return colas;
                        
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);			
		}
            return null;
            
	}
	
	public void imprimirLinea() {
		for (int i = 0; i < partes.length; i++) {
			System.out.print(partes[i]+"		|	");
		}
	}
}
