/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;
import java.time.LocalDate;



/**
 *
 * @author luca
 */
public class PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Metodo de ingreso de datos por el usuario
        Scanner leer = new Scanner(System.in);
       
        LocalDate hoy = LocalDate.of(2020,12,1);
        System.out.println("fecha"+hoy);
        System.out.println("Año actual:"+hoy.getYear());
        System.out.println("Mes actual:"+hoy.getMonthValue());
        System.out.println("Dia actual:"+hoy.getDayOfMonth());
       
        String fecha = "2022/12/05";
        
        String fechaArray[] = fecha.split("/"); 
        //["2021","12","05"]
        
        String fechaAño = fechaArray[0];
        
        int año = Integer.parseInt(fechaAño);
        
        System.out.println("El año es: "+año);
        
    }
    
}
