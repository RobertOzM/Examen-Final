package parte3;
//Roberto Orozco C.i:30.008.097
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Personas {

    public String nombre;
    public int apuesta;
    public int num;
    private int a;
    public int ID;
    int contador = 1;

    Scanner entrada = new Scanner(System.in);

    Personas(int a) {
        this.a = a;
    }
}
