//Roberto Orozco C.i:30.008.097
package parte1;
/**
 *
 * @author OROZCO
 */
public class Arrays {
    public static void main(String[] args) {
        
        String[] Person = {"Silvestre Cárdenas", "Andrés López", "Andreina Gonzalez", "María Perez", "Armando Paredes"};
        int[] Sat = {8, 1, 5, 0, 10};   
        
        for (int i = 0; i<Sat.length; i++){
              if (Sat[i] == 0) {
                  System.out.println(Person[3]+" :No se atendió");
                  
            }else if (Sat[i] >= 1 && Sat[i] <= 4) {
                  System.out.println(Person[1]+" :No satisfecho");
                  
            }else if (Sat[i] == 5) {
                  System.out.println(Person[2]+" :Neutro"); 
                  
            }else if (Sat[i] >= 6 && Sat[i] <= 8) {
                  System.out.println(Person[0]+" :Satisfecho");
                  
            }else if (Sat[i] >= 9 && Sat[i] <= 10) {
                  System.out.println(Person[4]+" :Muy satisfecho");

            }else {
            }
        }    
    }
}
