
package ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.*;
//import java.awt.event.*;

/**
 *
 * @author Rafael
 */
public class Ventana extends JFrame {
    
    public JPanel panel;
    
    public Ventana(){
        this.setSize(500,500);//Se establece el tamaño de ventana.
        this.setTitle("CATALOGACIONES");//Se establece el titulo de la ventana
        //this.setLocation(100,200);
        //this.setBounds(100, 200, 500, 500);
        this.setLocationRelativeTo(null); //Ventana en el centro
        
        iniciarComponentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
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
        boton1.setText("solicitudes"); //se establece texto en el boton
        boton1.setBounds(100, 100, 100, 40);
        panel.add(boton1);
        
        boton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                                subVentana v2 = new subVentana();

                        v2.setVisible(true);
            }
        });
        
        JButton boton2 = new JButton();
        boton2.setText("quejas");
        boton2.setBounds(300, 100, 100,40);
        panel.add(boton2);
        
          boton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                                subVentana1 v3 = new subVentana1();

                        v3.setVisible(true);
            }
        });
          
        JButton boton3 = new JButton();
        boton3.setText("reclamos");
        boton3.setBounds(200, 200, 100, 40);
        panel.add(boton3);
        
          boton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                                subVentana2 v4 = new subVentana2();

                        v4.setVisible(true);
            }
        });
        
    }
    }
  

