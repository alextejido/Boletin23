/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author atejidosolla
 */
public class ventana extends JFrame {
    
     private JFrame base;
    private JPanel panel1, panel2;
    private JLabel nombre,contra;
    private JTextField texto1;
    private JTextArea texto2;
    private JPasswordField contraseña;
    private JButton premer, limpar, boton;
    private JList<String> lista;
    private String nomes[]= {"Elementolista 1","Elementolista 2" ,"Elementolista 3"};  
    
   
    public void crearVentana() {
        base = new JFrame("Boletin 23");
        base.setLayout(null);
        base.setSize(400, 600);
        base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setSize(300, 250);
        panel1.setLocation(50,25);
        panel1.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setSize(300,250);
        panel2.setLocation(50,300);
        panel2.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        
        nombre = new JLabel("nombre");
        contra = new JLabel("Contrasinal");
        nombre.setSize(100, 20);
        nombre.setLocation(20,20);
        contra.setSize(100, 20);
        contra.setLocation(20,50);
        panel1.add(nombre);
        panel1.add(contra);
        
        texto1 = new JTextField("nombre");
        texto1.setSize(100, 20);
        texto1.setLocation(170, 20);
        panel1.add(texto1);
        
        
        contraseña = new JPasswordField("contrasinal");
        contraseña.setSize(100, 20);
        contraseña.setLocation(170,50);
        panel1.add(contraseña);
        
        
        premer = new JButton("Premer");
        premer.setSize(100,20);
        premer.setLocation(35,200);
        
        limpar = new JButton("Limpar");
        limpar.setSize(100,20);
        limpar.setLocation(165,200);
        panel1.add(premer);
        panel1.add(limpar);
        
       
        lista = new JList<>(nomes);
        lista.setSize(119, 100);
        lista.setLocation(5,50);
        lista.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel2.add(lista);
        
       
        boton = new JButton("Boton");
        boton.setSize(76,20);
        boton.setLocation(140,100);
        panel2.add(boton);
        
        
        texto2 = new JTextArea();
        texto2.setSize(60, 100);
        texto2.setLocation(230, 50);
        texto2.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel2.add(texto2);
        
        
        base.add(panel1);
        base.add(panel2);
        base.setVisible(true);
    }
}