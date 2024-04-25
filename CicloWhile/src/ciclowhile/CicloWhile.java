
package ciclowhile;

import java.util.Scanner;


public class CicloWhile {

   
    public static void main(String[] args) {
        boolean salir = false;
        
        while(!salir){
        System.out.println("============================");  
        System.out.println("Bienvenido a ....");
        System.out.println("1.- Saludar ");
        System.out.println("2.- Despedir ");
        System.out.println("3.- Cobrar ");
        System.out.println("4.- Escapar ");
        System.out.println("5.- Salir ");
        System.out.println("============================ ");
        
        Scanner Scanner = new Scanner(System.in);
        int opcion = Scanner.nextInt();
                
        
        switch (opcion) {
            case 1:
                System.out.println("Buenos dias ");
                break;
            case 2:
                int[] numeros={1,2,3,4,5};
                Object[] numerosLetras = {12,"Angel",123.34,true,"Carlos" };
                for(Object nl:numerosLetras){
                    System.out.println(nl);
                }
                for(int n = 0 ; n < numeros.length; n++ ){
                    if(numeros[n] == 2 ){
                        System.out.println("Numero encontrado ");   
                    }else{
                        System.out.println("numero 2 no encontrado");
                            
                    }        
                    System.out.println(numeros[n]);
                }
                System.out.println(" Hasta luego ");
                break;   
            case 3:
                System.out.println(" Quiero que me pagues ");
                break;
            case 4:
                System.out.println(" Se esccapo ");
                break;
            case 5:
                salir = true;
                System.out.println(" Gracias por usar nuestro menu ");
                break;    
            default:
               System.out.println(" ingrese una opcion valida ");
               break;  
            
        }
        Scanner.close();        
       
               
        } 
        
    }
    
}
