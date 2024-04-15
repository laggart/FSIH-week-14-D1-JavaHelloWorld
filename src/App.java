import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = teclado.nextLine();

        System.out.println("Cual es tu apellido?");
        String apellido = teclado.nextLine();

        System.out.println("Que edad tienes?");
        int edad = teclado.nextInt();

        teclado.close();
        
        System.out.println("Hola, tu nombre es " + nombre + " " + apellido + " y tienes " + edad + " años"
        );
    }
}
