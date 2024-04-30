package EjemploEstrucDatos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EjemploEstrucDatos{

  
    public static void main(String[] args) {
        
        try {
            
        
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            
            System.out.println("Estructura de datos ");
            System.out.println("1.- Array ");
            System.out.println("2.- ArrayList ");
            System.out.println("3.- HasMap ");
            System.out.println("4.- Salir ");
            
            System.out.print("Ingrese una opcion ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println(" Bienvenido a la ED Array ");
                    int[] edades = {12,40,30,50,7,5,60,70,100};
                    String[] nombres = {"Daniel","Marcos","Diego","Ariel"};
                    
                    //Longitud de array
                    System.out.println("Longitud de edades "+edades.length);
                    System.out.println("Longitud nombres "+nombres.length);
                    
                    // Cambiar un valor 
                    edades[1] = 38;
                    nombres[3] = "David";
                    System.out.println("Nuevo array edades "+edades[1]);
                    System.out.println("Nuevo array edades "+nombres[3]);
                    
                    // Convertir un array en String
                    
                    System.out.println(Arrays.toString(edades));
                    System.out.println(Arrays.toString(nombres));
                 
                    //Clonar 
                    int[] edadesClon = edades.clone();
                    System.out.println(Arrays.toString(edadesClon));
                    break;
                case 2:
                    System.out.println(" Bienvenido a ArrayList");
                    
                    ArrayList<String> ListaNombres = new ArrayList<>();
                    ListaNombres.add("David");
                    ListaNombres.add("Marco");
                    ListaNombres.add("Julio");
                    
                    // LONGITUD DE LA LISTA 
                    System.out.println(" Tamaño Lista"+ListaNombres.size());
               
                    
                    // Remover un elemento de la lista 
                    
                    ListaNombres.remove(2);
                    
                    // Obtener un elemento de la lista 
                    System.out.println(" Elemento obtenido "+ListaNombres.get(2));
                    
                    // Comprobar si mi lista esta vacia 
                    System.out.println("Lista vacia "+ListaNombres.isEmpty());
                    
                    //Comprobar si un elemento existe 
                    System.out.println("Existe "+ListaNombres.contains("David"));
                    break;
                case 3:
                    System.out.println(" Bienvenido a HasMap ");
                    Map<String,Integer> edades1 = new HashMap<>();
                    
                     // Insertando data 
                    edades1.put("Angel",22);
                    edades1.put("Marco",20);
                    edades1.put("Javier",21);
                    edades1.put("Pedro",26);
        
                    // Eliminar un dato
        
                    edades1.remove("Pedro");
        
                    //Recuperar un valor 
        
                    System.out.println("Edad Angel"+edades1.get("Angel"));
                    
                    // Longitud del Mapa
                    edades1.size();
                    
                    
                    // Imprimir las llaves (key)
                    for(String key : edades1.keySet())
                        System.out.println("Llave: "+key);
                    
                    //Imprimir los valores (Value)
                    for(Integer value : edades1.values())
                        System.out.println(" Valor: "+value);
                    
                    //Imprimir las llaves y los valores 
                    for(Map.Entry<String,Integer>lv : edades1.entrySet()){
                        System.out.println("llave: "+lv.getKey() + " valor: "+ lv.getValue());
                    }
                    
                    
                    break;
                case 4:
                    salir = true;
                    break;
                    
                default:
                    System.out.println("Elija una opcion válida ");
                    throw new AssertionError();
            }
            
        }
        
         } catch (Exception e) {
             System.out.println("Ocurrio un error "+e.getMessage());
        } finally {
             System.out.println(" Gracias por usar el programa");
        }
    }
    
}
