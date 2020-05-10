/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inma.viera.ejercicio4;

import java.util.Scanner;
/**
 * clase Libro con los atributos Titulo, Autor, Editorial, Fecha de compra, Precio.
 *
 * @author SemiDAW
 */
public class Libro {
    String titulo;
    String autor;
    String editorial;
    String fCompra;
    float precio;
    int identificador;
    public static int totalLibros;
    public Libro(){
    }

    public Libro (int identificador,String titulo, String autor, String editorial, String fCompra, float precio){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fCompra = fCompra;
        asignaPrecio(precio);
        totalLibros++;
        this.identificador=identificador;
    }
    
    public void asignaPrecio(float precio){
        if (precio>=0)
            this.precio=precio;
        else
             throw new ArithmeticException("El precio no puede ser 0.");
    }
    public String getTitulo(){
        return titulo;
    }
 
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
 
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getEditorial(){
        return editorial;
    }
 
    public void setEditorial(String editorial){
        this.editorial=editorial;
    }    
    public String getFCompra(){
        return fCompra;
    }
    public void setIdentificador(int identificador){
        this.identificador=identificador;
    }    
    public int getIdentificador(){
        return identificador;
    } 
    public void setPrecio(float precio){
        this.precio=precio;
    } 
    
    public float getPrecio(){
        return precio;
    }
 
    public void setFCompra(String fCompra){
        this.fCompra=fCompra;
    }        
    
    public String mostrarLibro(){
        return  "Libro: " + titulo + 
                ", escrito por "+ autor +
                " de la editorial "+ editorial +
                " lo compré " + fCompra + 
                " y me costó " + precio + " €.";
        
    }
    public void rellenaLibro(){
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Dime el título:");
        titulo=teclado.nextLine();
        System.out.println("Dime el autor:");
        autor=teclado.nextLine();
        System.out.println("Dime la editorial:");
        editorial=teclado.nextLine();
        System.out.println("Dime la fecha de compra:");
        fCompra=teclado.nextLine();
        System.out.println("Dime el precio:");
        precio=teclado.nextFloat();
    }
    public float devuelvePrecio(){
        return precio;
    }
    
    public void operacionOptima(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Esta tardando mas de la cuenta.");
        }
    }
    public int total(){
        return totalLibros;
    }
}
