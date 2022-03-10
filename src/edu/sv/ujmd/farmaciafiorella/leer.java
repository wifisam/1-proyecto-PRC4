
package edu.sv.ujmd.farmaciafiorella;

import java.io.*;

public class leer { //direccion del archivo 
    public String leerTxt(String direccion){

    String texto = "";

    
        try{
BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String temp = "";
        String bfRead;
        while ((bfRead = bf.readLine()) != null) {
            temp = temp + bfRead;
        }
        texto = temp;

    }catch(IOException e){
            System.out.println("Usuario o contrasena incorrecta");
}
return texto; 
    }
}
