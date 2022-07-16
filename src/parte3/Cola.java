package parte3;
//Roberto Orozco C.i:30.008.097

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OROZCO
 */
public class Cola {

    String Cola;
    Scanner entrada = new Scanner(System.in);
    int contador = 1;
    int partida = 0;

    private Nodo iniciocola, finalcola;

    public Cola() {
        iniciocola = null;
        finalcola = null;
    }

    //Método para saber si está vacia
    public boolean colavacia() {
        if (iniciocola == null) {
            return true;
        } else {
            return false;

        }
    }

    // Método adicional para decir que está vacia
    public void vacio() {
        if (iniciocola == null) {
            System.out.println("No hay nadie todavía");

        } else {
            System.out.println("Hay jugadores");
        }

        System.out.println("____________________________________");
    }

    // Método para insertar
    public void insertar(String nombre, String apellido, int cedula, int tramite, String t_tramite, int ID) {

        Nodo nuevo_nodo = new Nodo();
        contador++;
        System.out.print("Ingrese el nombre del ciudadano " + contador + ": ");
        nombre = entrada.next();
        System.out.print("Ingrese el apellido: ");
        apellido = entrada.next();
        System.out.print("Ingrese su cedula: ");
        cedula = entrada.nextInt();
        System.out.println("__________________________________________");
        System.out.println("1.- Cedulación");
        System.out.println("2.- Cita de pasaporte");
        System.out.println("3.- Retiro de documento");
        System.out.print("Seleccione el tramite a realizar: ");
        tramite = entrada.nextInt();

        if (tramite == 1) {

            t_tramite = "Ha escogido cedulación";

        }
        if (tramite == 2) {
            t_tramite = "Ha escogido cita de pasaporte";
        }
        if (tramite == 3) {
            t_tramite = "Ha escogido retiro de documento";

        } else {
            System.out.println("No ha escogido ninguna opción");
        }

        ID = contador;

        nuevo_nodo.nombre = nombre;
        nuevo_nodo.apellido = apellido;
        nuevo_nodo.cedula = cedula;
        nuevo_nodo.ID = ID;
        nuevo_nodo.t_tramite = t_tramite;

        try {

            FileWriter fw = new FileWriter("C:\\Users\\OROZCO\\Downloads\\Telegram Desktop\\Ciudadano" + contador + ".txt");

            fw.write(+contador + " Jugador\n\n");
            fw.write("Nombre: " + nombre + "\n Apellido: " + apellido);
            fw.write("\n");
            fw.write("Su cedula es: " + cedula);
            fw.write("\n");
            fw.write("El tramite que escogió fue:  " + t_tramite);
            fw.write("\n");
            fw.write("Su número de identificación es: " + ID + "\n");
            fw.write("Los datos del ciudadano " + contador + " se guardaron exitosamente \n");

            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
        }
        nuevo_nodo.siguiente = null;

        contador++;

        if (colavacia()) {
            iniciocola = nuevo_nodo;
            finalcola = nuevo_nodo;
        } else {
            finalcola.siguiente = nuevo_nodo;
            finalcola = nuevo_nodo;
        }

        System.out.println("");

    }

    public void leer() throws IOException {

        int contadorlec = 1; //lec porque lo estamos usando para escoger si leeremos el 1, el 2, el 3, etc (Es una variable local)
        System.out.println("Por favor ingrese el número del jugador al que desea ingresar:");
        contadorlec = entrada.nextInt();

        try {
            FileReader fr = new FileReader("C:\\Users\\OROZCO\\Downloads\\Telegram Desktop\\Ciudadano" + contadorlec + ".txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;

            while ((cadena = br.readLine()) != null) {
                System.out.println("" + cadena);
            }

        } catch (Exception ex) {

        }

        System.out.println("____________________________________");
    



    

    

    public void Mostrar() { //Método para mostrar ciudadanos y registrarlos en archivos

        Nodo recorrer = iniciocola; //Recorrer es un Nodo auxiliar

        //Necesitamos recorrer todo desde el inicio
        while (recorrer != null) {
            System.out.println("Nombre:---[" + recorrer.nombre + "]---");
            System.out.println("Apellido: [" + recorrer.apellido + "]");
            System.out.println("cedula: [" + recorrer.cedula + "]");
            System.out.println("tramite: [" + recorrer.t_tramite + "]");
            System.out.println("");
            recorrer = recorrer.siguiente;

            try {

                FileWriter fw = new FileWriter("C:\\Users\\OROZCO\\Downloads\\Telegram Desktop\\Ciudadano" + contador + ".txt");

                fw.write("Nombre: " + recorrer.nombre + "\n Apellido: " + recorrer.apellido + " ");
                fw.write("\n");
                fw.write("Su cedula es: " + recorrer.cedula);
                fw.write("\n");
                fw.write("Su tramite es: " + recorrer.t_tramite);
                fw.write("Su número de identificación es: " + recorrer.ID + "\n");

                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(Personas.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            recorrer = recorrer.siguiente;
        }

    }

    public void leerciudadanos() throws IOException {

        int contadorg = 1;
        System.out.print("Por favor ingrese el ID del ciudadano otorgado por el sistema: ");
        contadorg = entrada.nextInt();

        try {
            FileReader fr = new FileReader("C:\\Users\\OROZCO\\Downloads\\Telegram Desktop\\Ciudadano" + contadorg + ".txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;

            while ((cadena = br.readLine()) != null) {
                System.out.println("" + cadena);
            }

        } catch (Exception ex) {

        }

        System.out.println("____________________________________");

    }

}
