/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;



/**
 *
 * @author Darkgrey93
 */
public class Letras {
    char[] letras={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    
   public int devolverposicion(char letra){
       byte numPosicion=0;
       boolean respuesta=false; 
       while(respuesta==false){
           if(letra==letras[numPosicion]){
               respuesta=true;
           }
           numPosicion++;
       }
       return numPosicion;
   }
    
    
    
}
