/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.util.Scanner; //Esta clase se encarga de recivir datos por consola
/**
 *
 * @author Darkgrey93
 */
public class Core {
    Scanner entradaEscaner = new Scanner (System.in);
    String entradaTeclado = "";
    String palabra;
    Short clave;
    //entradaTeclado= entradaEscaner.nextLine();
    
    /** 
     * 
     * Metodo que sirve para decodificar la palabra
     * @author darkgranadier
     * 
     */
    public String decodificar(String palabra, Short clave){
        System.out.println("Digite la palabra a decodificar");
        entradaTeclado= entradaEscaner.nextLine();
        palabra=entradaTeclado;
        System.out.println("Digite la clave");
        entradaTeclado= entradaEscaner.nextLine();
        clave=Short.parseShort(entradaTeclado);
        return;
    }
}
