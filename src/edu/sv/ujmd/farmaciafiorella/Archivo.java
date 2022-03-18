/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.farmaciafiorella;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author reyee
 */
public class Archivo {
    static String[] lista = new String[11];
    static  String rutaabsoluta = "\\hist\\Bitacora.txt";
    static  String rutaproducto = "\\hist\\Producto.txt";
    static  String rutainventario = "\\hist\\Inventario.txt";

    public String[] LeerFichero() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
        
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            String path = (System.getProperty("user.dir"));

            archivo = new File(path + rutaproducto);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                lista[i] = linea;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lista;
    }

    public void EscribirFichero(String Valor,String Hora, int h, int m, int s,String Fecha ,int dia, int mes, int anio) {

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            String path = (System.getProperty("user.dir"));
            fichero = new FileWriter(path + rutaabsoluta, true);
            pw = new PrintWriter(fichero);
            pw.print("-------------");
            pw.print(Valor);
            pw.print(Hora+"");
            pw.print(h+":");
            pw.print(m+":");
            pw.print(s+"");
            pw.print(Fecha+"");
            pw.print(dia+"-");
            pw.print(mes+"-");
            pw.print(anio+"\n");
    
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
    
     public String[] LeerProductos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
        
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            String path = (System.getProperty("user.dir"));

            archivo = new File(path + rutainventario);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                lista[i] = linea;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lista;
    }
}
