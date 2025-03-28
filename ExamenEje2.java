
import java.util.Scanner;

public class ExamenEje2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            //Menu 
            System.out.println("[1] Calcular el Promedio ");
            System.out.println("[2] Saludar por tu nombre");
            System.out.println("[3] Dí hola mundo");
            System.out.println("[4] Salir");
            System.out.print("[?]: ");
            
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                System.out.print("Ingresa el 1er número: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingresa el 2er número: ");
                int num2 = scanner.nextInt();
                System.out.print("Ingresa el 3er número: ");
                int num3 = scanner.nextInt();
                System.out.print("Ingresa el 4er número: ");
                int num4 = scanner.nextInt();
                
                double promedio = (num1+num2+num3+num4)/4;
                System.out.println("El promedio de los números ingresados es: "+promedio);
                System.out.println("*-------------------------------------------------------------------------*\n");
                break;
                
                case 2: 
                System.out.println("Ingresa tu nombre: ");
                String nombre = scanner.next();
                System.out.println("Hola "+nombre);
                System.out.println("*-------------------------------------------------------------------------*\n");
                break;
                
                case 3: 
                System.out.println("Hola Mundo!");
                System.out.println("*-------------------------------------------------------------------------*\n");
                break;
               
                case 4:
                System.out.println("El programa termino, Byee...");
                break;

                default:
                System.out.println("ERROR");
            }
        
        
    } while ( opcion != 4);
    }
}