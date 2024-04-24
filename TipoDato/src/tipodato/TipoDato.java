
package tipodato;
 class TipoDato {
    public static void main(String[] args) {
        String Nombre;
        int Edad;
        boolean Estado;
        double Saldo;
        Object TodoTipoDato;
        //Asignado
        Nombre = "Angel Ramos Cutipa";
        Edad = 22;
        Saldo = 1000.34;
        TodoTipoDato =  "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = true;
        TodoTipoDato = 23.28;
        //Imprimiendo
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Dinamico: " + TodoTipoDato);
    }
    
}
