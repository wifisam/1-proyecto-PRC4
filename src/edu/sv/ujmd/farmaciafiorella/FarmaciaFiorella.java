
package edu.sv.ujmd.farmaciafiorella;


public class FarmaciaFiorella {

  
    public static void main(String[] args) {
        Login.login();
        leer a = new leer();
        String s1 = a.leerTxt("C:\\Users\\wilfr\\Desktop\\Estudios\\PRC4\\proyecto final\\textos\\pruebajava.txt");
        System.out.println(s1);
        
    }
    
}
