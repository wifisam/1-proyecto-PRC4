/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.farmaciafiorella;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author enaq9
 */
public class Escribir {
    
     static  String[] listadeproductos = new String[10];
    static  String rutaabsoluta = "\\archivo\\bitacora.txt";
    
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
             String path = (System.getProperty("user.dir"));
            fichero = new FileWriter(path + rutaabsoluta,true);
            pw = new PrintWriter(fichero);
            for (int i = 0; i < 10; i++) {
                pw.println("Linea " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}