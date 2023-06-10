public class Principal{
    public static void main (String[]args){

        Persona lista [] = new Persona[10];

        //Instancia de la clase persona 
        lista [0] = new Persona();
        lista [1] = new Persona(108880, "Jhon Alberth", "ARicapa Pinto","Masculino", 17, 50000, 160);
        lista [2] = new Persona(108882,"Juan David", "Monsalve");

        lista [0].ImprimirCartaPresentacion();
        lista [1].ImprimirCartaPresentacion();
        lista [2].ImprimirCartaPresentacion();

        // mauricio.ImprimirCartaPresentacion(); // Imprimir

        // alberth.ImprimirCartaPresentacion(); // Imprimir

        // monsalve.ImprimirCartaPresentacion(); // Imprimir

        // alberth.comer(850);
        // alberth.ImprimirCartaPresentacion();

        // alberth.comer(2000);
        // alberth.ImprimirCartaPresentacion();
    }
}