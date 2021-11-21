package intrefaz_gráfica_grupo6;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author jdgl2
 */
public class interfaz extends JPanel{
    public void paintComponent( Graphics g ){
        super.paintComponent( g );

        // dibuja la cara
        g.setColor( Color.BLUE);
        g.fillOval( 10, 10, 200, 200 );

        // dibuja los ojos
        g.setColor( Color.BLACK );
        g.fillOval( 55, 65, 30, 30 );
        g.fillOval( 135, 65, 30, 30 );

        // dibuja la boca
        g.fillOval( 50, 110, 120, 60 );

        // convierte la boca en una sonrisa
        g.setColor( Color.BLUE );
        g.fillRect( 50, 110, 120, 30 );
        
        // dibuja la cara 2
        g.setColor( Color.RED);
        g.fillOval( 10, 300, 200, 200 );

        // dibuja los ojos 2
        g.setColor( Color.BLACK );
        g.fillOval( 55, 365, 30, 30 );
        g.fillOval( 135, 365, 30, 30 );

        // dibuja la boca 2
        g.fillOval( 50, 410, 120, 60 );

        // convierte la boca 2 en una sonrisa
        g.setColor( Color.RED );
        g.fillRect( 50, 410, 120, 30 );
        
        // dibuja la cara 3
        g.setColor( Color.ORANGE);
        g.fillOval( 510, 10, 200, 200 );

        // dibuja los ojos 3
        g.setColor( Color.BLACK );
        g.fillOval( 555, 65, 30, 30 );
        g.fillOval( 635, 65, 30, 30 );

        // dibuja la boca 3
        g.fillOval( 550, 110, 120, 60 );

        // convierte la boca 3 en una sonrisa
        g.setColor( Color.ORANGE );
        g.fillRect( 550, 110, 120, 30 );
        
        // dibuja la cara 4
        g.setColor( Color.MAGENTA);
        g.fillOval( 510, 300, 200, 200 );

        // dibuja los ojos 4
        g.setColor( Color.BLACK );
        g.fillOval( 555, 365, 30, 30 );
        g.fillOval( 635, 365, 30, 30 );

        // dibuja la boca 4
        g.fillOval( 550, 410, 120, 60 );

        // convierte la boca 4 en una sonrisa
        g.setColor( Color.MAGENTA);
        g.fillRect( 550, 410, 120, 30 );
    } // fin del método paintComponent
} // fin de la clase DibujarCaraSonriente