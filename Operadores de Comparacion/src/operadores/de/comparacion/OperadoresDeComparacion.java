
package operadores.de.comparacion;

public class OperadoresDeComparacion {

   
    public static void main(String[] args) {
        int numero1 = 12;
        int numero2 = 40;
        int numero3 = 12;
        int numero4 = 23;
        //operador mayor 
        if(numero2 > numero1 )
            System.out.println("el numero mayor es : " + numero2);
        
       
        //operador menor
        if(numero1 < numero2 )
            System.out.println("el numero menor es : " + numero1); 
            
        //operador igual igual que  
         if(numero1 == numero3)
            System.out.println("Los numeros "+numero1+ " y "+numero3+" son iguales ");
         
        //operador menor igual que  
        if(numero1 <= numero2)
            System.out.println("el numero " + numero1 +" es menor o igual que "+numero2);
        
        
        //operador mayor igual que 
         if(numero4 >= numero1)
            System.out.println("el numero " + numero4 +" es mayor o igual que "+numero1);
         
        // operador diferente de  
         if(numero1 != numero2)
            System.out.println(numero1+ " es diferente de  "+numero2 );
                
    }
    
}
