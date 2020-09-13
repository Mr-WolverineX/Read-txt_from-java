
package cuartoprograma;

import java.io.IOException;



public class CuartoPrograma {

    
    public static void main(String[] args) throws IOException {
      
                
        Clase4toPrograma ArchivoTXT = new Clase4toPrograma();
        
        ArchivoTXT.leerLista("ListaNombres.txt"); // dentro de la carpeta del proyecto
        
        
//////////// Esta linea de codigo, es cuando el archivo esta afuera de la carpeta de tu proyecto \\\\\\\\\\\\\\\\\
       /* ArchivoTXT.leerLista("C:\\Users\\Name\\Desktop\\HashLaboratorio.txt"); */  
        
       
       
    }
    
}
