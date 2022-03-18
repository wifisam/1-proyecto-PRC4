/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.farmaciafiorella;

import java.util.Scanner;
import edu.sv.ujmd.farmaciafiorella.Menu;

public class Inventario {

    int codigoProducto[];
    String producto[];
    double precio[];
    int cantidad[];

    public Inventario() {
        //Asignacion de los datos
        codigoProducto = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        producto = new String[]{"Acetaminofen", "Panadol", "Clorfeniramina", "Diclofenac", "Jarabe para Tos", "SudaGrip", "Micardis", "Gammaflux", "Metocarbamol", "Anaflat"};
        precio = new double[]{0.10, 5.00, 3.00, 0.50, 3.00, 0.50, 0.80, 0.30, 2.25, 2.75, 1.80, 3.25};
        cantidad = new int[]{5, 10, 18, 3, 6, 8, 5, 2, 7, 20};
    }

    public static void main(String[] args) {
        // definicion de la matriz del inventario
        // Se utiliza para almacenar codigo, producto, precio y la cantidad
        int[] codigoProducto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] producto = {"Acetaminofen", "Panadol", "Clorfeniramina", "Diclofenac", "Jarabe para Tos", "SudaGrip", "Micardis", "Gammaflux", "Metocarbamol", "Anaflat"};
        double[] precio = {0.10, 5.00, 3.00, 0.50, 3.00, 0.50, 0.80, 0.30, 2.25, 2.75, 1.80, 3.25};
        int[] cantidad = {5, 10, 18, 3, 6, 8, 5, 2, 7, 20};

        while (true) {
            //Se carga el menu, luego se genera el switch donde si la eleccion es TODOS, muestra todo el inventario, si ingresa el nombre de un medicamento, muestra la informacion de ese medicamento, y si ingresa la palabra regresar, regresa al menu.
            String choose = menuInventario();
            switch (choose) {
                // Ver lista de inventario
                case "TODOS":
                case "todos":
                case "Todos":
                    imprimirInventario(codigoProducto, producto, precio, cantidad);
                    break;
                case "Acetaminofen":
                case "acetaminofen":
                case "ACETAMINOFEN":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[0] + "\t" + producto[0] + "\t" + cantidad[0]);

                    break;
                case "Panadol":
                case "panadol":
                case "PANADOL":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[1] + "\t" + producto[1] + "\t" + cantidad[0]);

                    break;
                case "Clorfeniramina":
                case "clorfeniramina":
                case "CLORFENIRAMINA":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[2] + "\t" + producto[2] + "\t" + cantidad[0]);

                    break;
                case "Diclofenac":
                case "diclofenac":
                case "DICLOFENAC":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[3] + "\t" + producto[3] + "\t" + cantidad[0]);

                    break;
                case "Jarabe para Tos":
                case "jarabe para tos":
                case "JARABE PARA TOS":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[4] + "\t" + producto[4] + "\t" + cantidad[0]);

                    break;
                case "SudaGrip":
                case "sudagrip":
                case "SUDAGRIP":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[5] + "\t" + producto[5] + "\t" + cantidad[0]);

                    break;
                case "Micardis":
                case "micardis":
                case "MICARDIS":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[6] + "\t" + producto[6] + "\t" + cantidad[0]);

                    break;
                case "Gammaflux":
                case "gammaflux":
                case "GAMMAFLUX":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[7] + "\t" + producto[7] + "\t" + cantidad[0]);

                    break;
                case "Metocarbamol":
                case "metocarbamol":
                case "METOCARBAMOL":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[8] + "\t" + producto[8] + "\t" + cantidad[0]);

                    break;
                case "Anaflat":
                case "anaflat":
                case "ANAFLAT":
                    System.out.println("Codigo\tProducto\tCantidad");
                    System.out.println(codigoProducto[9] + "\t" + producto[9] + "\t" + cantidad[0]);

                    break;
                case "REGRESAR":
                case "regresar":
                case "Regresar":
                    Menu.menuprincipal();
                    break;
                default:
                    System.out.println("Lo sentimos, esta función no está disponible actualmente");
                    break;
            }
        }
    }

    public static void cambiarCantidad(String[] producto, int[] cantidad) {
        //Metodo para cambiar la cantidad segun el producto ingresado
        Scanner ran = new Scanner(System.in);
        //int number_1 = ran.nextInt();
        for (int i = 0; i < producto.length; i++) {
            System.out.println(producto[i]);
            cantidad[i] = ran.nextInt();
        }
    }

    public static void imprimirInventario(int[] codigoProducto, String[] producto, double[] precio, int[] cantidad) {
        //Metodo para mostrar el inventario
        Scanner s = new Scanner(System.in);
        int totalInventario = 0;
        double totalDinero = 0;
        System.out.println("—————————————— Inventario de Farmacia Fiorella ————————————————");
        System.out.println("Codigo \t\t Producto\t\t precio\t\t cantidad");
        for (int i = 0; i < producto.length; i++) {
            System.out.println(codigoProducto[i] + "\t\t" + producto[i] + "\t\t" + precio[i] + "\t\t" + cantidad[i]);
            totalInventario += cantidad[i];
            totalDinero += precio[i] * cantidad[i];
        }

        System.out.println("Stock total: " + totalInventario);
        System.out.println("Cantidad en dinero: $" + totalDinero);
        
        s.nextLine(); //Limpiamos buffer del System.in
        System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
        s.nextLine(); //El programa se detiene hasta que se presione una tecla
    }

    /*
		 Interfaz de gestión de inventario
		 @return devuelve la función seleccionada por el usuario
     */
    public static String menuInventario() {
        //Menu de inventario
        System.out.println("------------- Gestión de inventario ------------");
        System.out.println("TODOS: Mostrará todo el inventario");
        System.out.println("Nombre del producto: mostrara solo ese producto");
        System.out.println("REGRESAR: regresara al menu principal");
        System.out.println("Seleccione una opción:");
        Scanner ran = new Scanner(System.in);
        String op = ran.nextLine();
        return op;
    }

};
