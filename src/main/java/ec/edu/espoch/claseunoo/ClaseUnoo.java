/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.claseunoo;

import ec.edu.espoch.claseunoo.Clases.Horarioo;
import ec.edu.espoch.claseunoo.Clases.Persona;

/**
 *
 * @author PERSONAL
 */
public class ClaseUnoo {

    public static void main(String[] args) {
        
        //Instanciciar una clase
        
       /* Persona objPersona = new Persona();
        objPersona.setNombre("Cristhian");
        objPersona.setApellido("Valencia");
        objPersona.setNacionalidad("Ecuador");
        objPersona.setId(3016);
        objPersona.setFechaNacimiento(2004);
        
        String result=objPersona.calcularEdad(20);
        System.out.println("Resultado:"+result);
        
        objPersona.imprimir();
        System.out.println("Datos:"+objPersona.imprimirDatos());*/
       
       /*Horarioo objHorarioo = new Horarioo();
       objHorarioo.setNumeroHorasTrabajo();
       Persona objPersona = new Persona();
        System.out.println("Result:"+objPersona.situacionTrabajando(objHorarioo));*/
       
       
       Horarioo objHorarioo = new Horarioo();
       objHorarioo.setDiaDeTrabajo("domingo");
       Persona objPersona = new Persona();
        System.out.println("Result:"+objPersona.identificarDiaTrabajo(objHorarioo));
  
    }
}
