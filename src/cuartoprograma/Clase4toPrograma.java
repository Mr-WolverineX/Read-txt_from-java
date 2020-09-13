                  ////////// NOTA \\\\\\
/*
FileReader es utilizado para leer archivos de caracteres, 
es decir archivos de texto plano que contengan caracteres ASCII

BufferedReader También se puede usar para leer archivos de texto,
pero sin embargo puede ser utilizado para leer otro tipo de contenido 
que no necesariamente provenga de un archivo de texto, 
además de que BufferedReader soporta UTF.


BufferedWriter también tendría las mismas características que BufferedReader 
sólo que se usa para escribir contenido en archivos u otros lados.


FileWriter tiene las mismas características que FileReader sólo que se usa 
para escribir texto en archivos.
*/
 
package cuartoprograma;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Clase4toPrograma {
    
    
    
    
public void leerLista ( String NombreArchivo ) throws IOException{

    try {
        FileReader FR = new FileReader(NombreArchivo); // Este es el archivo
        BufferedReader BR = new BufferedReader(FR);    // Este leera letra por letra al FileReader "FR"
        
        String texto = ""; // significa que texto es igual a "vacio"
        while(!(texto==null)){  // si texto "vacio"  es diferente a nulo...
        texto = BR.readLine();  //  entonces "texto" es igual al BufferedReader
        
        if(texto==null){
           break;
        }
        
        
        String vector;   // Se define una variable en string para hacer el vector 
        vector = texto;  // en este caso la variable vector = BR " BufferedReader
        
        String[]Arreglo = vector.split("-"); // guarda los nombres del archivo al vector cuando lee un espacio.
        
        for (int i= Arreglo.length-1; i>=0; i--){  // para ingresar a los nombres del vector de dicho archivo (Y EN INVERSA)
             System.out.println( i+"."+Arreglo[i]);       // imprime los nombre que estan en el vector  de dicho archivo
        }
             System.out.println("---- Fin del Proseso ----");
        }    // aqui finaliza el while
        
        
       
    } catch (IOException Error) {
        System.out.println(Error.getMessage());
    }

    
    

}    
    
}
