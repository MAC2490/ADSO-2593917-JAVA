import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        Scanner entradaN = new Scanner(System.in);
        Scanner entradaT = new Scanner(System.in);

        Persona lista [] = new Persona [5];

        int pos = 0;
        int i = 0;
        while (i<1) {
            System.out.println("||---------------------------------------||");
            System.out.println("||----------------PERSONAS---------------||");
            System.out.println("||---------------------------------------||");
            System.out.println("||              Personas registradas: "+((pos<10)? "0":"")+pos+"-||");
            System.out.println("||1. Registrar personas.-----------------||");
            System.out.println("||2. Ver clientes registrados.-----------||");
            System.out.println("||3. Modificar clientes registrados.-----||");
            System.out.println("||4. Ver informacion clientes.-----------||");
            System.out.println("||5. Eliminar cliente.-------------------||");
            System.out.println("||6. Salir.------------------------------||");
            System.out.println("||---------------------------------------||");
            int opcion = entradaN.nextInt();

            if (opcion == 1){
                System.out.print("Ingrese el documento ");
                int documento = entradaN.nextInt();

                System.out.print("Ingrese el nombre ");
                String nombre = entradaT.nextLine();

                System.out.print("Ingrese el apellido ");
                String apellido = entradaT.nextLine();

                System.out.print("Ingrese la direccion ");
                String direccion = entradaT.nextLine();

                System.out.print("Ingrese el telefono ");
                int telefono = entradaN.nextInt();

                System.out.print("Ingrese el email ");
                String email = entradaT.nextLine();
                
                boolean valido = false; 
                int guardar = documento;
                for (int j = 0; j<pos;j++){
                    if (guardar == lista[j].getdocumento()){
                        valido = true;
                    }
                }
                
                if (valido == true){
                    System.out.println("EL DOCUMENTO YA FUE INGRESADO ");
                    pos--;
                }else{
                    lista [pos] = new Persona (documento, nombre, apellido, direccion, telefono, email);
                }   
                pos++;
            }else if (opcion == 2){
                for (int j = 0; j<pos;j++){
                    lista [j].mostrarClientesRegistrados();
                }         
            }else if (opcion == 3){
                for (int j = 0; j<pos;j++){
                    lista [j].mostrarListaDeClientes();
                }
                System.out.println(" ");
                System.out.print("Ingrese el documento del usuario que quiere modificar ");
                int modificar = entradaN.nextInt();
                int L = 0;
                for (int j = 0; j<pos;j++){
                    if (modificar == lista [j].getdocumento()){
                        while (L<1){
                            System.out.println("||---------------------------------------||");
                            System.out.println("||---------------MODIFICAR---------------||");
                            System.out.println("||---------------------------------------||");
                            System.out.println("||1. Documento.                          ||");
                            System.out.println("||2. Nombre.                             ||");
                            System.out.println("||3. Apellido.                           ||");
                            System.out.println("||4. Direccion.                          ||");
                            System.out.println("||5. Telefono.                           ||");
                            System.out.println("||6. Email.                              ||");
                            System.out.println("||7. Salir.                              ||");
                            System.out.println("||---------------------------------------||");
                            int datoModificado = entradaN.nextInt();

                            if(datoModificado == 1){
                                System.out.print("Ingrese el nuevo documento ");
                                int nuevoDocumento = entradaN.nextInt(); 
                                boolean valido = false; 
                                int guardar = nuevoDocumento;
                                for (int A = 0; A<pos;A++){
                                    if (guardar == lista[A].getdocumento()){
                                        valido = true;
                                    }
                                }
                                
                                if (valido == true){
                                    System.out.println("EL DOCUMENTO YA FUE INGRESADO ");
                                }else{
                                    lista [j].setdocumento(nuevoDocumento);
                                }   
                            }else if(datoModificado == 2){
                                System.out.print("Ingrese el nuevo nombre ");
                                String nuevoNombre = entradaT.nextLine();
                                lista [j].setnombre(nuevoNombre);
                            }else if(datoModificado == 3){
                                System.out.print("Ingrese el nuevo apellido ");
                                String nuevoApellido = entradaT.nextLine();
                                lista [j].setapellido(nuevoApellido);
                            }else if(datoModificado == 4){
                                System.out.print("Ingrese el nueva direccion ");
                                String nuevaDireccion = entradaT.nextLine();
                                lista [j].setdireccion(nuevaDireccion);
                            }else if(datoModificado == 5){
                                System.out.print("Ingrese el nuevo telefono ");
                                int nuevoTelefono = entradaN.nextInt();
                                lista [j].settelefono(nuevoTelefono);
                            }else if(datoModificado == 6){
                                System.out.print("Ingrese el nueva email ");
                                String nuevoEmail = entradaT.nextLine();
                                lista [j].setemail(nuevoEmail);
                            }else if(datoModificado == 7){
                                L++;
                            }else{
                                System.out.println("Opcion incorrecta");
                            }
                        }
                    }
                }
            }else if (opcion == 4){
                for (int j = 0; j<pos;j++){
                    lista [j].mostrarClientesRegistrados();
                }
                System.out.println(" ");
                System.out.print("Ingrese el documento de la persona que quiere ver ");
                int verDocumento = entradaN.nextInt();
                for (int j = 0; j<pos;j++){
                    if (verDocumento == lista[j].getdocumento()){
                        lista[j].mostrarListaDeClientes();
                        break;
                    }
                }
            }else if (opcion == 5){
                for (int j = 0; j<pos;j++){
                    lista[j].mostrarClientesRegistrados();
                }
                System.out.println(" ");
                System.out.print("Ingrese el documento del cliente a elimianar ");
                int elimianar = entradaN.nextInt();
                int elimiando = 0;
                for (int j = 0; j<pos;j++){
                    if (elimianar == lista[j].getdocumento()){
                        elimiando = j;
                        pos--;
                        break;
                    }
                }

                for (int j = elimiando; j<lista.length-1;j++){
                    lista [j] = lista [j+1];
                }  
            }else if (opcion == 6){
                System.out.println("SALIENDO...");
                i++;
            }
        }
        
    }
}