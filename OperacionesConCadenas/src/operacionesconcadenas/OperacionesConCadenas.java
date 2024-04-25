
package operacionesconcadenas;

public class OperacionesConCadenas {

    public static void main(String[] args) {
        String Nombre = "Angel";
        String Apellidos = "Ramos Cutipa"; 
       
        //Concatenar
        String NombreCompleto = Nombre +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto);
        
        //Nombre en minusculas
        String NombreCompleto1 = Nombre +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto1.toUpperCase());
        
        //Nombres en minusculas
        String NombreCompleto2 = Nombre +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto2.toLowerCase());
       
       //Conteo de cadenas cantidad de caracteres
       String NombreCompleto3 = Nombre +" "+ Apellidos;
       System.out.println("Cantidad de Caracteres: "+ NombreCompleto3.length());
       
       //slpit cortar una cadena
       String NombreCompleto4 = Nombre +" "+ Apellidos;
       // ["Angel","Ramos","Cutipa"] i++ numero se incrementa en uno y se actualiza
       String[] NombreCortado = NombreCompleto4.split(" ");
       //forma1
       //for(int i = 0; i< NombreCortado.length ; i++){
         //  System.out.println(NombreCortado[i]);
       //}
       
       // for sencillo 
       for(String nombre : NombreCortado){
            System.out.println(nombre);
       
       }
       // Equals
       boolean comparacion = Nombre.equals(Apellidos);
       boolean Comparacion = Nombre == Apellidos;
       System.out.println("Comparacion: "+ Comparacion);
       
       
       //System.out.println("Nombre Completo: "+ NombreCompleto4);
       
       //Interpolacion de variables 
       String n ="Angel";
       String a =" Ramos";
       int e = 22;
       
       String mensaje = String.format("Mi nombre es %s y mi aprellido es %s y tengo %d años",n,a , e);
       System.out.println(mensaje);
     
       
    }
    
    
}
