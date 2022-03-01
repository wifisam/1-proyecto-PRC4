/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.farmaciafiorella;

import java.util.Scanner;

/**
 *
 * @author reyee
 */
public class Menu {

    public static int menuprincipal() {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int op;
        System.out.print("¡Bienvenido a Farmacia Fiorella!\n"
                +"-----  MENU -----\n"
                + "Seleccione una opcion:\n"
                + "1. Venta nueva\n"
                + "2. Consultar inventarios\n"
                + "3. Cambiar contraseña\n"
                + "4. Salir del sistema \n"
        );

        op = teclado.nextInt();
        return op;
    }
}
