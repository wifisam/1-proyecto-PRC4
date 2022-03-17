package edu.sv.ujmd.farmaciafiorella;

import java.util.Scanner;
import edu.sv.ujmd.farmaciafiorella.Menu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    public static void login() {

        try {
            String usuario;
            String contrasena;
            String temp = "";
            boolean encontrar = false;
            // CAPTURA DE DATOS DE CONTRASENA

            Scanner teclado;
            teclado = new Scanner(System.in);

            System.out.println(
                    "Ingrese su usuario: ");
            usuario = teclado.nextLine();

            System.out.println(
                    "Ingrese su contraseña: ");
            contrasena = teclado.nextLine();
            // TERMINAMOS DE CAPTURAR DATOS Y ASIGNAMOS VALORES A LAS VARIABLES USUARIO Y CONTRASENA 

            // CREAMOS LAS VARIABLES DE EL ARCHIVO DE TEXTO
            String ruta = System.getProperty("user.dir"); // ruta relativa
            String rutabs = "\\textos\\login.txt"; // ruta absoluta
            String allruta = ruta + rutabs; // tenemos la suma de las dos rutas para poder trabajar en la comparacion
            // leemos el archivo de texto para comprobar  nuestros usuarios y contrasenas
            File archivo;
            FileReader fr;
            BufferedReader br;
            archivo = new File(allruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // lectura del fichero
            String user, contra;
//            int i = 0;
            while ((temp = br.readLine()) != null) {
                String[] account = temp.split(",");
                user = account[0];
                contra = account[1];
                if (user.equals(usuario) && contra.equals(contrasena)) {
                    encontrar = true;

                }
            }
            if (encontrar == true) {
                System.out.println("acceso concedido");
                Menu.menuprincipal();

            } else {
                System.out.println("acceso denegado");
                
                
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
