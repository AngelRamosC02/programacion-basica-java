
package operadoreslogico;


public class Operadoreslogico {

    
    public static void main(String[] args) {
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //operador And(&&)
        boolean resultadoAnd = esVerdadero && esFalso;
        System.out.println("And:"+ resultadoAnd);
        
        
        //operador OR (||)
        boolean resultadoOr = esVerdadero || esFalso;
        System.out.println("OR: "+ resultadoOr);
         
        
        //operador NOT(!)
        boolean resultadoNot = !esVerdadero;
        System.out.println("OR: "+ resultadoNot);
    }
    
}
