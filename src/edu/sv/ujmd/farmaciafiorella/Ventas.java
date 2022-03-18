package edu.sv.ujmd.farmaciafiorella;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ventas {

    public static void ventas() {
        //Inicializacion de vaira
        Login l = new Login();
        Inventario in = new Inventario();

        Scanner s = new Scanner(System.in);
        String cont;
        //Impresion de menu de ventas
        System.out.println("**MENU DE VENTAS**");
        System.out.println("Ingrese la venta que desea realizar:");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        String seguir;
        int compra;
        int productos;
        int cod[] = new int[10];
        int cantidad[] = new int[10];
        int c = 0;
        double descuento = 0.03;
        double totaldescuento = 0;
        double totalfinal = 0;
        double total[] = new double[10];

        do {
            //Catalogo de productos para que vea el usuario
            System.out.println("—————————————— Catalogo de Productos ————————————————");
            System.out.println("Codigo \t\t Producto\t\t precio");
            for (int i = 0; i < in.producto.length; i++) {
                System.out.println(in.codigoProducto[i] + "\t\t" + in.producto[i] + "\t\t" + in.precio[i]);

            }
            //Solicitud al usuario de datos de venta
            System.out.println("Digite codigo del producto a adquirir");
            cod[c] = s.nextInt();
            System.out.println("Digite la cantidad de productos a adquirir");
            cantidad[c] = s.nextInt();
            c++;
            System.out.println("Desea agregar mas productos(Presionar 1 y si no 0");

            compra = s.nextInt();
            //Si es 1, sigue pidiendo productios, sino rompe el bucle

        } while (compra == 1);//se evalua si el cliente quiso agregar mas productos.
        //Salida de texto de facturas
        System.out.println("------------------------------------");
        System.out.println("FACTURA DE COMPRA");
        System.out.println("FARMACIA FIORELA");
        System.out.println("------------------------------------");
        for (int i = 0; i < c; i++) {

            if (cod[i] == in.codigoProducto[0]) {

                if (cantidad[i] <= in.cantidad[0]) {

                    total[0] = cantidad[i] * in.precio[0];
                    System.out.println("Acetaminofen--" + cantidad[i] + " x $" + in.precio[0] + " = " + total[0]);

                } else {

                    System.out.println("Medicina agotada");

                }

            }

            if (cod[i] == in.codigoProducto[1]) {
                int producto = 5;
                if (cantidad[i] <= in.cantidad[1]) {

                    total[1] = cantidad[i] * in.precio[1];
                    System.out.println("Panadol--" + cantidad[i] + " x $" + in.precio[1] + " = " + total[1]);
                } else {

                    System.out.println("Medicina agotada");

                }
            }
            if (cod[i] == in.codigoProducto[2]) {
                int producto = 60;
                if (cantidad[i] <= in.cantidad[2]) {
                    total[2] = cantidad[i] * in.precio[2];

                    System.out.println("Clorfeniramina--" + cantidad[i] + " x $" + in.precio[2] + " = " + total[2]);

                } else {

                    System.out.println("Medicina agotada");
                }
            }

            if (cod[i] == in.codigoProducto[3]) {
                int producto = 60;
                if (cantidad[i] <= in.cantidad[3]) {
                    total[3] = cantidad[i] * in.precio[3];

                    System.out.println("Diclofenac--" + cantidad[i] + " x $" + in.precio[3] + " = " + total[3]);
                } else {
                    System.out.println("Medicina agotada");

                }
            }
            if (cod[i] == in.codigoProducto[4]) {
                int producto = 500;
                if (cantidad[i] <= in.cantidad[4]) {
                    total[4] = cantidad[i] * in.precio[4];

                    System.out.println("Jarabe para Tos--" + cantidad[i] + " x $" + in.precio[4] + " = " + total[4]);

                } else {
                    System.out.println("Medicina agotada");
                }
            }
            if (cod[i] == in.codigoProducto[5]) {
                int producto = 20;
                if (cantidad[i] <= in.cantidad[5]) {
                    total[5] = cantidad[i] * in.precio[5];

                    System.out.println("SudaGrip--" + cantidad[i] + " x $" + in.precio[5] + " = " + total[5]);

                } else {
                    System.out.println("Medicina agotada");
                }
            }
            if (cod[i] == in.codigoProducto[6]) {
                int producto = 25;
                if (cantidad[i] <= in.cantidad[6]) {
                    total[6] = cantidad[i] * in.precio[6];

                    System.out.println("Micardis--" + cantidad[i] + " x $" + in.precio[6] + " = " + total[6]);

                } else {
                    System.out.println("Medicina agotada");

                }
            }
            if (cod[i] == in.codigoProducto[7]) {
                int producto = 30;
                if (cantidad[i] <= in.cantidad[7]) {
                    total[7] = cantidad[i] * in.precio[7];

                    System.out.println("Gammaflux--" + cantidad[i] + " x $" + in.precio[7] + " = " + total[7]);

                } else {
                    System.out.println("Medicina agotada");
                }
            }
            if (cod[i] == in.codigoProducto[8]) {
                int producto = 180;
                if (cantidad[i] <= in.cantidad[8]) {
                    total[8] = cantidad[i] * in.precio[8];

                    System.out.println("Metocarbamol--" + cantidad[i] + " x $" + in.precio[8] + " = " + total[8]);
                } else {
                    System.out.println("Medicina agotada");

                }
            }
            if (cod[i] == in.codigoProducto[9]) {
                int producto = 50;
                if (cantidad[i] <= in.cantidad[9]) {
                    total[9] = cantidad[i] * in.precio[9];

                    System.out.println("Anaflat--" + cantidad[i] + " x $" + in.precio[9] + " = " + total[9]);
                } else {
                    System.out.println("Medicina agotada");

                }
            }
        }

        double totalproducto;
        //Formula para sacar total
        totalproducto = total[0] + total[1] + total[2] + total[3] + total[4] + total[5] + total[6] + total[7] + total[8] + total[9];

        //evaluacion si es mas de 20 el total de productos, se hace descuento
        if (totalproducto > 20) {
            totalfinal = totalproducto;

            totaldescuento = totalproducto * descuento;

            totalproducto = totalproducto - totaldescuento;

        }
        // Salida de texto del total
        System.out.println("------------------------------------");
        if (totaldescuento == 0) {
            System.out.println("No hay descuento");
            System.out.println("Total final: $" + totalproducto);
            System.out.println("------------------------------------");
        } else {
            System.out.println("Descuento del 3% $" + totaldescuento);
            System.out.println("Total final: $" + totalproducto);
            System.out.println("------------------------------------");
        }

        s.nextLine(); //Limpiamos buffer del System.in
        System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
        s.nextLine(); //El programa se detiene hasta que se presione una tecla

        Menu.menuprincipal();
    }
}
