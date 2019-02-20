/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolinea.Core;
import Logica.Core;
import Pojos.*;
import java.io.IOException;
/**
 *
 * @author Darkgrey93
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {        
        Core logica=new Core();
        logica.menu();
    }
    
}
