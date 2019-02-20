/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Pojos.Letras;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; //Esta clase se encarga de recivir datos por consola
/**
 * 
 * @author Darkgrey93
 */
public class Core {
    public static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    Scanner entradaEscaner = new Scanner (System.in);
    String palabra;
    short clave;
    short indice;
    String entradaTeclado="";
    //Short i=0;
    //entradaTeclado= entradaEscaner.nextLine();
    public void menu() throws IOException{
        int rta=1;
        int opcion;
        while(rta!=2){
            System.out.println("digite lo que desea hacer... recuerde que debe ser un digito:\n"
                + "1. para codificar palabra\n"
                + "2. para decodificar palabra \n"
                + "3. para salir");
            opcion = Integer.parseInt((entrada.readLine()));
            switch(opcion){
                case 1:
                    codificar();
                    System.out.println("Desea continuar? 1 si, 2 no");
                    rta = Integer.parseInt((entrada.readLine()));
                    break;
                case 2:
                    decodificar();
                    System.out.println("Desea continuar? 1 si, 2 no");
                    rta = Integer.parseInt((entrada.readLine()));
                    break;
                case 3:
                    System.out.println("terminando programa...");
                    System.exit(0);
                    break;
    
            }
        }
        System.exit(0);
    }
    /** 
     * 
     * Metodo que sirve para decodificar la palabra
     * @author darkgranadier
     * 
     */
    public void decodificar(/*String palabra, Short clave*/){
        Letras letras=new Letras();
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
            int key=(indice-clave)%26;
            if(key<0){                
                key=letras.letras.length+key;               
            }            
            System.out.print(letras.devolverLetra(key));            
        }
        System.out.println("");
        //return entradaTeclado;
    }
    public void codificar(/*String palabra, Short clave*/){
        Letras letras=new Letras();
        System.out.println("Digite la palabra a codificar");
        entradaTeclado=entradaEscaner.nextLine();
        palabra=entradaTeclado;
        System.out.println("Digite la clave");
        entradaTeclado= entradaEscaner.nextLine();
        clave=Short.parseShort(entradaTeclado);
        for(Short i=0;i<palabra.length();i++){
            //System.out.println("iteracion");
            char l=palabra.charAt(i);           
            indice=letras.devolverPosicion(l);
            int key=(indice+clave)%26;
            if(key>26){                
                key=letras.letras.length-key;               
            }            
            System.out.print(letras.devolverLetra(key));            
        }
        System.out.println("");
        //return entradaTeclado;
    }
}
