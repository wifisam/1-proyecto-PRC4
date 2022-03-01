/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.farmaciafiorella;

import java.util.Scanner;
import  edu.sv.ujmd.farmaciafiorella.Menu;

/**
 *
 * @author reyee
 */
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
