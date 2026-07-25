import java.util.Scanner;
public class CalculadoraEdad {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Ingreso de datos por el usuario
        System.out.println("Ingrese su nombre completo: ");
        String nombre = scan.nextLine();

        System.out.println("Ingrese su número de carné: ");
        String numero_Carne = scan.nextLine();

        System.out.println("Ingrese su año de nacimiento: ");
        int nacimiento = scan.nextInt();

        System.out.println("Ingrese el año actual: ");
        int anio_actual = scan.nextInt();

        //Calculos con datos ingresados por el usuario
        int edad_Aprox = anio_actual - nacimiento;
        int edad_Meses = edad_Aprox * 12;
        boolean mayoriadeEdad = edad_Aprox >= 18;

        String autor = "Emerson Omar Martínez Porras";

        //Información mostrada en consola
        System.out.println("---------- Resultados -----------");
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su número de carné es: " + numero_Carne);
        System.out.println("Su edad aproximada es de: " + edad_Aprox);
        System.out.println("Su edad aproximada en meses es de: " + edad_Meses);
        System.out.println("¿Es mayor de edad?: " + mayoriadeEdad);
        System.out.println("---------- Fin -----------");
        System.out.println("Autor: " + autor);

    }
}
