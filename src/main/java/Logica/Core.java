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
    String palabra;
    short clave;
    short indice;
    String entradaTeclado="";
    //Short i=0;
    //entradaTeclado= entradaEscaner.nextLine();
    public void menu(){
        int opcion;
        System.out.println("digite lo que desea hacer... recuerde que debe ser un digito:\n"
                + "1. para codificar palabra\n"
                + "2. para decodificar palabra \n"
                + "3. para salir");
        opcion = entradaEscaner.nextInt();
        switch(opcion){
            case 1:
                codificar();
                break;
            case 2:
                decodificar();
                break;
            case 3:
                System.out.println("terminando programa...");
                System.exit(0);
                break;
    
        }
    }
    /** 
     * 
     * Metodo que sirve para decodificar la palabra
     * @author darkgranadier
     * 
     */
    public void decodificar(/*String palabra, Short clave*/){
        Letras letras=new Letras();
        /*boolean bandera=false;
        while(true){
            System.out.println("Digite la palabra a decodificar");
            entradaTeclado=entradaEscaner.nextLine();
            if(entradaTeclado!=""){
                break;
            }
            
        }*/
        System.out.println("Digite la palabra a decodificar");
        entradaTeclado=entradaEscaner.nextLine();
        palabra=entradaTeclado;
        System.out.println("Digite la clave");
        entradaTeclado= entradaEscaner.nextLine();
        clave=Short.parseShort(entradaTeclado);
        for(Short i=0;i<palabra.length();i++){
            //System.out.println("iteracion");
            char l=palabra.charAt(i);           
            indice=letras.devolverPosicion(l);
            int key=indice-clave%26;
            if(key!=-1){                
                key=letras.letras.length+key;
                
            }            
            System.out.print(letras.devolverLetra(key));            
            
        }
        //return entradaTeclado;
    }
    public void codificar(/*String palabra, Short clave*/){
        Letras letras=new Letras();        entradaTeclado= entradaEscaner.nextLine();

        System.out.println("Digite la palabra a codificar");
        entradaTeclado= entradaEscaner.nextLine();
        palabra=entradaTeclado;
        System.out.println("Digite la clave");
        entradaTeclado= entradaEscaner.nextLine();
        clave=Short.parseShort(entradaTeclado);
        for(Short i=0;i<palabra.length();i++){
            //System.out.println("iteracion");
            char l=palabra.charAt(i);           
            indice=letras.devolverPosicion(l);
            indice=(short) (indice+this.clave);
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
