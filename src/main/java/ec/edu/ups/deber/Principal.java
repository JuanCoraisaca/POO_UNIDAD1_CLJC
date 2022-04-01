/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.deber;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto Persona
        var persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido= "Coraisaca";
        
        System.out.println("El nombre de la persona es;"+persona1.nombre);
        System.out.println("El apellido de la persona es;"+persona1.apellido);
        System.out.println("-------------------------------------------------");
        
        //Objeto Auto
        var auto1= new Auto();
        auto1.modelo= "Chevrolet";
        auto1.color= "Blanco";
        
        System.out.println("El modelo del auto es;"+auto1.modelo);
        System.out.println("El color del auto es;"+auto1.color);
        System.out.println("-------------------------------------------------");
        //Objeto Computadora
        var computadora1= new Computadora();
        computadora1.color="Negro";
        computadora1.marca="MacBook";
        
        System.out.println("El color de la computadora es;"+computadora1.color);
        System.out.println("La marca de la computadora es;"+computadora1.marca);
        System.out.println("-------------------------------------------------");
        
        //Objeto Factura
        var factura1= new Factura();
        factura1.cliente="Mauricio Lopez";
        factura1.direccion="Miraflores";
        
        System.out.println("El cliente es;"+factura1.cliente);
        System.out.println("La direccion es;"+factura1.direccion);
        System.out.println("-------------------------------------------------");
        
        //Objeto Restaurant
        var restaurant1= new Restaurant();
        restaurant1.cliente="Sergio Sacoto";
        restaurant1.direccion="Calle Larga";
        
         
        System.out.println("El cliente es;"+restaurant1.cliente);
        System.out.println("La direccion es;"+restaurant1.direccion);
        
        System.out.println("-------------------------------------------------");
        
        
        
        
        
    }
    
}
