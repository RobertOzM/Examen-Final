package parte3;
//Roberto Orozco C.i:30.008.097
import java.io.IOException;
import java.util.Scanner;

public class Saime {

    public static void main(String[] args) throws IOException {

        System.out.println("///////////////////////"); ///MENÚ DE PRUEBAS
        System.out.println("//     BIENVENIDO    //");
        System.out.println("///////////////////////");
        System.out.println("VERSIÓN 1.0");
        System.out.println("");

        ////Variables
        String nombre = "";
        String apellido = "";
        int Cedula = 0;

        int opc = 0;
        int opc1 = 0;
        int a = 0;
        int ID = 0;
        
        Scanner entrada = new Scanner(System.in);

        ////////////////////Para comunicar la clase Personas con la principal (Por ahora)
        Personas mensajero = new Personas(a);
        //////////////////////

        ////////////////////Para comunicar la clase Cola con la principal (Por ahora)
            
             System.out.println("**********************************");
        Cola cola = new Cola();
        ////////////////////

        do {
            
             System.out.println("**********************************");
            System.out.println("**********************************");
            System.out.println("BIENVENIDO AL SAIME");
            System.out.println("**********************************");
            System.out.println("**********************************");
            
            
            System.out.println("1.- Insertar ciudadanos");       //MENÚ DE PRUEBAS
            System.out.println("2.- Mostrar ciudadanos");
            System.out.println("3-  Leer archivos");
            System.out.println("4- Salir");
            System.out.println("____________________________________");
            System.out.print(" Opción: ");
            opc = entrada.nextInt();
            System.out.println("____________________________________");

            switch (opc) {

                case 1:
                    do {
                        cola.insertar(nombre, apellido, Cedula, ID, nombre, ID);
                        

                    } while (opc1 < 6);
                    break;

                case 2:
                    do {
                        cola.Mostrar();                        
                    }while(opc1<4);
                    
                     System.out.println("");
                    break;

                case 3:
                    cola.leer();
                    break;

                case 4:
                    opc = 8;
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    System.out.println("////////////////////////////");

            }

        } while (opc < 5);
    }

}
