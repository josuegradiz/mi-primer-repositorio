/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intrefaz_gráfica_grupo6;

import javax.swing.JFrame;

/**
 *
 * @author jdgl2
 */
public class Intrefaz_Gráfica_Grupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        interfaz panel = new interfaz();
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        aplicacion.add( panel );
        aplicacion.setSize( 800, 600 );
        aplicacion.setVisible( true );
    }
    
}
