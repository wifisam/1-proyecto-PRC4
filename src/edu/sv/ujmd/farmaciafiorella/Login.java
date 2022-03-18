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

    String usuario;
    String contrasena;

    public Login() {

    }

    public static void login() {
        //Inicializan variables
        Menu m = new Menu();
        Login l = new Login();
        try {

            String temp = "";
            boolean encontrar = false;
            // CAPTURA DE DATOS DE CONTRASENA

            Scanner teclado;
            teclado = new Scanner(System.in);
            //Se le solicitan las credenciales al usuario
            System.out.println(
                    "Ingrese su usuario: ");
            l.usuario = teclado.nextLine();
            m.usuario = l.usuario;

            System.out.println(
                    "Ingrese su contraseña: ");
            l.contrasena = teclado.nextLine();

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
                user = account[1];
                contra = account[2];
                if (user.equals(l.usuario) && contra.equals(l.contrasena)) {
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

    public static void cambiarContrasena() throws FileNotFoundException {
        Login l = new Login();
        String contraTemp;
        int codigo;
        Scanner teclado;
        teclado = new Scanner(System.in);

        String ruta = System.getProperty("user.dir"); // ruta relativa
        String rutabs = "\\textos\\login.txt"; // ruta absoluta
        String allruta = ruta + rutabs;

        File archivo;
        FileReader fr;
        BufferedReader br;
        archivo = new File(allruta);
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);

        String user, contra;
        try {

            String temp = "";
            boolean encontrar = false;
            //Menu que muestra las opciones de contraseñas a cambiar
            System.out.println("Digite el codigo de la contraseña que desea modificar: \n"
                    + "1.   Administrador\n"
                    + "2.   Vendedor\n"
                    + "3.   Invitado\n");

            //Solicitud de la variable codigo al usuario
            codigo = teclado.nextInt();
            //Switch segun se haya elegido en la solicitud anterior, segun se haya elegido se solicita que se ingrese la contraseña actual y si coincide se le pide el cambio de la contraseña...
            switch (codigo) {
                case 1:
                    teclado.nextLine();
                    //Solicitud de la contraseña actual
                    System.out.println("Ingrese la contraseña actual: ");
                    contraTemp = teclado.nextLine();

                    //Se evalua si lo ingresado coincide con el archivo y la variable ingresada
                    while ((temp = br.readLine()) != null) {
                        String[] account = temp.split(",");
                        user = account[1];
                        contra = account[2];
                        if (user.equals("admin") && contra.equals(contraTemp)) {

                            encontrar = true;
                            //Si coincide, encontrar se vuelve verdadero

                        }
                        if (encontrar = true) {
                            //Se le pide la nueva contraseña
                            System.out.println("Ingrese la nueva contraseña: ");
                            l.contrasena = teclado.nextLine();
                            //Se le dice que la contraseña se cambio correctamente, recordemos que solo se cambio a nivel de variables segun lo solicitado.
                            System.out.println("La contraseña ha sido cambiada exitosamente...");

                            System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                            teclado.nextLine(); //El programa se detiene hasta que se presione una tecla
                            Menu.menuprincipal(); //Regresa al menu
                        } else {
                            //Si la contraseña no coincide se muestra el siguiente mensaje
                            System.out.println("La contraseña no coincide...");
                        }

                    }
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Ingrese la contraseña actual: ");
                    contraTemp = teclado.nextLine();

                    while ((temp = br.readLine()) != null) {
                        String[] account = temp.split(",");
                        user = account[1];
                        contra = account[2];
                        if (user.equals("vendedor") && contra.equals(contraTemp)) {
//                        teclado.nextLine();
                            encontrar = true;

                        }
                        if (encontrar = true) {
                            System.out.println("Ingrese la nueva contraseña: ");
                            l.contrasena = teclado.nextLine();

                            System.out.println("La contraseña ha sido cambiada exitosamente...");

                            System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                            teclado.nextLine(); //El programa se detiene hasta que se presione una tecla
                            Menu.menuprincipal();
                        } else {
                            System.out.println("La contraseña no coincide...");
                        }
                    }
                    break;

                case 3:
                    teclado.nextLine();
                    System.out.println("Ingrese la contraseña actual: ");
                    contraTemp = teclado.nextLine();

                    while ((temp = br.readLine()) != null) {
                        String[] account = temp.split(",");
                        user = account[1];
                        contra = account[2];
                        if (user.equals("invitado") && contra.equals(contraTemp)) {
//                        teclado.nextLine();
                            encontrar = true;

                        }
                        if (encontrar = true) {
                            System.out.println("Ingrese la nueva contraseña: ");
                            l.contrasena = teclado.nextLine();

                            System.out.println("La contraseña ha sido cambiada exitosamente...");

                            System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                            teclado.nextLine(); //El programa se detiene hasta que se presione una tecla
                            Menu.menuprincipal();
                        } else {
                            System.out.println("La contraseña no coincide...");
                        }
                    }
                    break;
            }

        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        //Se carga la clase login
        login();
    }
}
