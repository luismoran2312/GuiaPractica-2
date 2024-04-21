package com.mycompany.mc16105;
import javax.swing.JOptionPane;
public class MC16105 {
    public static void main(String[] args) {
       char lleno='*', vacio=' ';
    int base, altura, asteriscos, espacio;
    do{
    altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Altura (Entre 5 y 25) e Impar"));
    if(altura%2==0){
    JOptionPane.showMessageDialog(null, "Error el numero : "+altura+" es par");
    }
    else if(altura<5 || altura>25){
    JOptionPane.showMessageDialog(null, "Error el numero : "+altura+" esta fuera del Rango Permitido");
    }
    }while(altura<5||altura>25||altura%2==0);
        for(base=0;base<=altura-1;base++){
           for(espacio=altura-1;espacio>=base;espacio--){
           System.out.print(vacio);
           }
           for(asteriscos=0;asteriscos<=(base*2);asteriscos++){
           System.out.print(lleno);
           }
       System.out.println( );
      }
      
    }
}
