/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.claseunoo.Clases;

/**
 *
 * @author PERSONAL
 */
public class Persona {
 
    // aqui va los atributos
     private int id;
     private String nombre;
    private String apellido;
    private String nacionalidad;
    private int fechaNacimiento;
    
    //contructor
    
    
    
    //setter y getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
    // aqui va los metodos
    
    public void imprimir (){
         System.out.println("Nombre:"+this.nombre);
         System.out.println("Apellido:"+this.apellido);
         System.out.println("Nacionalidad:"+this.nacionalidad);
         System.out.println("FechaNacimiento:"+this.fechaNacimiento);
    }
    
    public String imprimirDatos(){
        
        
        return "Nombre:"+this.nombre+"\n Apellido:"+this.apellido+"\n Nacionalidad:"+this.nacionalidad+"\n fechaNacimiento:"+this.fechaNacimiento;
    }
    
    public String calcularEdad(int edad ){
        String msm;
        if (edad > 0){
        if (edad > 18){
            msm = "eres mayor de edad...";
        }else{
            msm = "eres menor de edad...";
        }   
        } else{
              msm = "no existen edades negativas";
                      
           }        
      return msm;
    }
    public String situacionTrabajo (Horarioo objHorarioo){
        String msm;
        if (objHorarioo.getNumeroHorasTrabajo() > 8){
            msm = "Estas trabajando mas de los establecido..";
        }else if (objHorarioo.getNumeroHorasTrabajo()==8) {
            msm = "Estas trabajando mas de los establecido..";
        } else {
            msm = "Estas trabajando mas de los establecido..";
            
        }
    return msm ;
}
         
 public String identificarDiaTrabajo(Horarioo objHorarioo){
     String msm;
     switch (objHorarioo.getDiaDeTrabajo()) {
         case "lunes":
             msm = "Es un dia laborable";
             
             break;
             
         case "martes":
             
             msm = "Es un dia laborable";
             
             break;
             
          case "miercoles":
             
             msm = "Es un dia laborable";
             
             break; 
             
             
              case "jueve":
             
             msm = "Es un dia laborable";
             
             break;
             
              case "viernes":
             
             msm = "Es un dia laborable";
             
             break;
             
              case "sabado":
             
             msm = "Es un dia laborable";
             
             break;
             
              case "domindo":
             
             msm = "Es un dia laborable";
             
             break;
         default:
             msm = "Es un nfin de semana";
             
             
              }
    return msm;
    
}
}
