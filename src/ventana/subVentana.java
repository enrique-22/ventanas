/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rafael
 */
public class subVentana extends JFrame {
    
    public JPanel panel;
    
    public subVentana(){
        this.setSize(500,500);//Se establece el tamaño de ventana.
        this.setTitle("Solicitudes");//Se establece el titulo de la ventana
        //this.setLocation(100,200);
        //this.setBounds(100, 200, 500, 500);
        this.setLocationRelativeTo(null); //Ventana en el centro
        
        iniciarComponentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        
        
    }
    
    private void colocarPaneles(){
        panel = new JPanel(); //Crreacion de un panel
        panel.setLayout(null); //desactivando el diseño
        
        panel.setBackground(Color.WHITE); //Establecemos el color del panel
        this.getContentPane().add(panel);//Se agrega el panel a la ventana
        
    }
    
        private void colocarEtiquetas(){
            JLabel etiqueta = new JLabel(); //creamos una etiqueta
        etiqueta.setText("prueba"); //establecemos el texto a la etiqueta
        etiqueta.setBounds(10, 10, 50,30);
        panel.add(etiqueta); //agregamos la etiqueta al panel
        
        
        JLabel etiqueta1 = new JLabel(); //se agrega otra etiqueta
        etiqueta1.setText("hola"); //establecemos el texto a la etiqueta
        etiqueta1.setBounds(20,20,60,50);
        panel.add(etiqueta1);//se agrega texto
        
}
     private void colocarBotones(){
      JButton boton1 = new JButton();
        boton1.setText("Salirse"); //se establece texto en el boton
        boton1.setBounds(10, 400, 80, 30);
        panel.add(boton1);
        
        boton1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
}
        });
    }
}
