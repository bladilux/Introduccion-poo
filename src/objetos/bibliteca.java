/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author ist loja
 */
public class bibliteca {
    //atributos
    private String tamaño,diseño,autor,editorial;
    private int precio;
    //metodos
    public void abrir(){
        System.out.println("abrir el libro");
    }
    private void cerrar(){
        System.out.println("cerrar el libro");
    }
    public static void main(String[] args) {
        bibliteca objeto=new bibliteca();
        objeto.abrir();
    }
   
    
}
