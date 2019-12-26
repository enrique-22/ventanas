/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rafael
 */
public class subVentana1 extends JFrame {
    
    public JPanel panel;
    
    public subVentana1(){
        this.setSize(500,500);//Se establece el tamaño de ventana.
        this.setTitle("Quejas");//Se establece el titulo de la ventana
        //this.setLocation(100,200);
        //this.setBounds(100, 200, 500, 500);
        this.setLocationRelativeTo(null); //Ventana en el centro
        
        iniciarComponentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        //colocarBotones();
        
        
    }
    
    private void colocarPaneles(){
        panel = new JPanel(); //Crreacion de un panel
        panel.setLayout(null); //desactivando el diseño
        
        panel.setBackground(Color.WHITE); //Establecemos el color del panel
        this.getContentPane().add(panel);//Se agrega el panel a la ventana
        
    }
    
        private void colocarEtiquetas(){
            JLabel etiqueta = new JLabel(); //creamos una etiqueta
        etiqueta.setText("reversion"); //establecemos el texto a la etiqueta
        etiqueta.setBounds(10, 10, 70,30);
        panel.add(etiqueta); //agregamos la etiqueta al panel
        
        
        JLabel etiqueta1 = new JLabel(); //se agrega otra etiqueta
        etiqueta1.setText("llamada en cola"); //establecemos el texto a la etiqueta
        etiqueta1.setBounds(10,20,100,50);
        panel.add(etiqueta1);//se agrega texto
        
}
    
    
}
