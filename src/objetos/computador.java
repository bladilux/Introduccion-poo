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
public class computador {
    // fuera del main psvm

    // declaro atributos

    private int año;
    private String modelño;
    private String marca;
    private double procesador;
    private boolean portatil;

    // declaro metodos

    public void guardarInformacion() {
        System.out.println("hola soy la computadora guardo informacion");
    }

    public void leerInformacion() {
        System.out.println(" soy la computadora leo informacion");

    }//opcional
     public void imprimirInformacion(String info){//opcional
         System.out.println(info);//opcional
     }
    
    public static void main(String[] args) {
        // objetos
        computador primerobjeto=new computador();// he creado mi primer objeto
        primerobjeto.leerInformacion();// llama metodos  primerobjeto.guardarInformacion();
        primerobjeto.imprimirInformacion("chao");
    
        
         
        
    }

}
