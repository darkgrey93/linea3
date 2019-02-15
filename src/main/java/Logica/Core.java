/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Pojos.Letras;
import java.util.Scanner; //Esta clase se encarga de recivir datos por consola
/**
 *
 * @author Darkgrey93
 */
public class Core {
    Scanner entradaEscaner = new Scanner (System.in);
    String entradaTeclado = "";
    String palabra;
    short clave;
    short indice;
    //Short i=0;
    //entradaTeclado= entradaEscaner.nextLine();
    
    /** 
     * 
     * Metodo que sirve para decodificar la palabra
     * @author darkgranadier
     * 
     */
    public void decodificar(/*String palabra, Short clave*/){
        Letras letras=new Letras();
        System.out.println("Digite la palabra a decodificar");
        entradaTeclado= entradaEscaner.nextLine();
        palabra=entradaTeclado;
        System.out.println("Digite la clave");
        entradaTeclado= entradaEscaner.nextLine();
        clave=Short.parseShort(entradaTeclado);
        for(Short i=0;i<palabra.length();i++){
            //System.out.println("iteracion");
            char l=palabra.charAt(i);           
            indice=letras.devolverPosicion(l);
            indice=(short) (indice-this.clave);
            if(indice<-26){
                indice=(short)(indice/26);
                indice=(short)(26+indice);
                    
            }
            if(indice<0){
                
                indice=(short)(26+indice);
            }
            System.out.print(letras.devolverLetra(indice));            
            
        }
        //return entradaTeclado;
    }
}
