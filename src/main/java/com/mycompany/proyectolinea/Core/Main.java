/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.Core;
import Pojos.*;
/**
 *
 * @author Darkgrey93
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Letras letras=new Letras(); 
        int num=letras.devolverposicion('b');
        System.out.println(num);
        System.out.println("ese es el numero");
    }
    
}