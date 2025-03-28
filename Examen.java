
import java.util.Scanner;

public class Examen {
    public static void main(String[] args){
        // Menú de Operaciones matematicas 
        System.out.println("[1] La suma de un número y su triple");
        System.out.println("[2] El doble de un número menos 5");
        System.out.println("[3] La mitad de un número más su cuadrado");
        System.out.println("[4] La suma de un número, su doble y su triple");
        System.out.print("[?]");
        Scanner scanner = new Scanner(System.in);

        int Menu = scanner.nextInt();

        switch (Menu) {
            case 1:
                System.out.print("Ingresa un número: ");
                int x = scanner.nextInt();
                int suma = x + (x*3); 
                System.out.println("La suma del valor más su triple es: "+suma);
                System.out.println("*-------------------------------------------------------------------------*\n");
                break;
            case 2:
                System.out.print("Ingresa un número: ");
                int num= scanner.nextInt();
                int resultado = (num*2)-5;
                System.out.println("El doble del número menos 5 es: "+resultado);
                System.out.println("*-------------------------------------------------------------------------*\n");
                break;
            case 3:
                System.out.print("Ingresa un número: ");
                int num2 = scanner.nextInt();
                int resultado2 = (num2/2)+(num2*num2);
                System.out.println("La mita del número más su cuadrado es: "+resultado2);
                System.out.println("*-------------------------------------------------------------------------*\n");
                break;
            case 4:
                System.out.print("Ingresa un número: ");
                int num3 = scanner.nextInt();
                int resultado3 = num3+(num3*2)+(num3*3);
                System.out.println("La suma del número mas su doble y su triple es: " +resultado3);
                System.out.println("*-------------------------------------------------------------------------*\n");
                break;
        
            default:
                break;
                
        }




























    }
}