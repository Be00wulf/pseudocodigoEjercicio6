//EjercicioRepositorio6
import java.util.Scanner;
public class EjercicioRepositorio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad, contadorMenores25 = 0, menores25 = 0, contadorMayores25 = 0, mayores25 = 0;
        double promedioMenores, promedioMayores;
        
            for(int i = 1; i <= 100; i++){
                System.out.print("Ingrese la edad: ");
                edad = entrada.nextInt();        
                
                if (edad < 25) {
                    ++contadorMenores25;
                    menores25 += edad;
               
                }   else if (edad >= 25) {
                    ++contadorMayores25;
                    mayores25 += edad;
                }
                
            }
            
        promedioMenores = (double)menores25/contadorMenores25;
    promedioMayores = (double)mayores25/contadorMayores25;
        
        System.out.println("El promedio de edades para menores de 25 años es de: " + promedioMenores);
        System.out.println("El promedio de edades para mayores de 25 años es de: " + promedioMayores);
    }
}