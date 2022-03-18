
package edu.sv.ujmd.farmaciafiorella;

import java.util.Scanner;
import edu.sv.ujmd.farmaciafiorella.Inventario;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Menu {
    static String usuario;
    public Menu(){
        
    }
    public static void menuprincipal() {
        Login l = new Login();
        Scanner teclado;
        teclado = new Scanner(System.in);
        String user;
        
        user = l.usuario;

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
        
        boolean salir = false;
        
        
        do {
            switch (op) {
                case 1:
                    if(usuario.equals("admin") || usuario.equals("vendedor")){
                        Ventas.ventas();
                    }
                    else{
                        System.out.println("No tiene permisos...");
                    }
                    break;

                case 2:
                   if(usuario.equals("admin") || usuario.equals("vendedor") || usuario.equals("invitado")){
                    Inventario.main(null);
                }
                    
                    break;

                case 3:
                    if(usuario.equals("admin")){
                try {
                    Login.cambiarContrasena();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                    
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    System.exit(0);
                    break;
            }
        } while (!salir);
    }
    
    
}
