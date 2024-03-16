import java.util.Scanner;

public class MainP1{
    public static void main (String[]args){
        Scanner entradad_n = new Scanner(System.in);
        Scanner entradad_t = new Scanner(System.in);
        
        Persona lista [] = new Persona [5]; 

        int personasRegistradas = 0; 
        int posActual = 0;
        int i = 0;
        while (i<1){
            System.out.println("||----------------------------||");
            System.out.println("||----------PERSONAS----------||");
            System.out.println("||    Personas registradas: "+personasRegistradas+"||");
            System.out.println("||1. Registrar personas.      ||");
            System.out.println("||2. Ver lista de personas.   ||");
            System.out.println("||3. Ordenar lista Personas.  ||");
            System.out.println("||4. Salir.                   ||");
            int opcion = entradad_n.nextInt();
            if (opcion==1){
                System.out.print("Ingrese el documento ");
                int documento = entradad_n.nextInt();
                System.out.print("Ingrese el nombre ");
                String nombre = entradad_t.nextLine();
                System.out.print("Ingrese el apellido ");
                String apellido = entradad_t.nextLine();
                System.out.print("Ingrese la direccin ");
                String direccin = entradad_t.nextLine();
                System.out.print("Ingrese el telefono ");
                int telefono = entradad_n.nextInt();
                System.out.print("Ingrese el email ");
                String email = entradad_t.nextLine();
                lista [posActual] = new Persona(documento ,nombre, apellido, direccin, telefono, email);
                posActual++;
                personasRegistradas++;
            }else if (opcion==2){
                for (int j = 0; j<posActual;j++){
                    lista[j].mostrarDatosPersonales();
                }
            }else if(opcion==3){
                Persona documento1 [] = new Persona [posActual];
                for (int Q = 0; Q<posActual; Q++){
                    documento1 [Q] = lista [Q];
                }

                for (int j = 0; j<documento1.length-1;j++){
                    for (int A = 0; A<documento1.length-1-j;A++){
                        if (documento1[A].getdocumento()>documento1[A+1].getdocumento()){
                            Persona guardar = documento1[A];
                            documento1 [A] = documento1[A+1];
                            documento1 [A+1] = guardar;
                        }
                    }
                }

                for (int W = 0; W<documento1.length;W++){
                    System.out.println(documento1[W].getdocumento());
                }
            }else if(opcion==4){
                System.out.println("SALIENDO...");
                i++;
            }
        }
    }
}