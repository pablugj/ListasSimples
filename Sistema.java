/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author PABLO ULISES G
 */
public class Sistema {

    public static void main(String[] args) 
    {
        Scanner x=new Scanner(System.in);
        List <Persona> Registros=new ArrayList<>();
        int n;
        do
        {
        System.out.println("1.Registro");
        System.out.println("2.Imprimir");
        System.out.println("3.Mostrar Alumnos del TEC");
        System.out.println("4.Salir");
        n=x.nextInt();
        Registros.add(new Persona ("Pablo",28,10,"TEC"));
        Registros.add(new Persona ("Luis",20,10,"UTT"));

        switch(n)
        {
            
            case 1:
                System.out.println("ingrese nombre");
                String nombre=x.next();
                System.out.println("ingrese edad");
                int edad=x.nextInt();
                System.out.println("ingrese pago");
                double dinero=x.nextDouble();
                System.out.println("ingrese escuela");
                String escuela=x.next();
                Persona sujeto=new Persona(nombre,edad,dinero,escuela);
                Registros.add(sujeto);
                break;
            case 2:
                //System.out.println(Registros.);
                for(Persona p:Registros)
                {
                    System.out.println(p.ImprimirDatos());
                    
                }
                break;
                
            case 3:
                int sumaEdad = 0;
                for(Persona p:Registros)
                {
                    sumaEdad = p.getEdad() + sumaEdad;
                }
                System.out.println(sumaEdad/Registros.size());
                break;
            case 4:
                break;
        
        }
        }while(n==1 ||n==2 || n==3);
    }
    
}
