
package edu.sv.ujmd.farmaciafiorella;

import java.util.Scanner;
import  edu.sv.ujmd.farmaciafiorella.Menu;


public class Login {
    public static void login(){
        String usuario;
        String contrasena;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        usuario = teclado.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contrasena = teclado.nextLine();
       
        Menu.menuprincipal();
    }
}
