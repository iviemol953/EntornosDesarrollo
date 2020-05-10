/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inma.viera.ejercicio4;

/**
 * clase Biblioteca que rellena libros con los atributos Titulo, Autor, Editorial, Fecha de compra, Precio.
 *
 * @author SemiDAW
 */
import java.util.Scanner;
public class Biblioteca {

    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        byte total=0;
        float mediaPrecios=0;

        // TODO code application logic here
        Libro libro1=new Libro(1,"El principito","Antoine de Saint-Exupéry","Salamandra","05/02/2016",11.25f);
        total++;
        mediaPrecios=libro1.devuelvePrecio();
        
        Libro libro2=new Libro(2,"Patria","Fernando Aramburu","TUSQUETS EDITORES","20/10/2019",15.25f);
        total++; 
        mediaPrecios+=libro2.devuelvePrecio();
        
        System.out.println("*************** LISTADO DE LIBROS ******************");
        System.out.println(libro1.mostrarLibro());
        System.out.println(libro2.mostrarLibro());

        System.out.println("****************************************************");
        System.out.println("Has comprado en total "+ total+ " libros.");
        System.out.println("\nLa media de dinero que he gastado en libros es: "+calculaMedia(total,mediaPrecios)+" €.");
        
    }

    static float calculaMedia(byte cantidad, float precio){
        if (cantidad > 0 )
                return (float)(precio/cantidad);
        else
                System.out.println("No hay libros comprados.");
                return (float)0;
    }
}
