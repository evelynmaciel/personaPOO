import java.util.Scanner;

public class MainPersona {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner op1 = new Scanner(System.in);

        System.out.println("introduce tu nombre");
        String nombre = op1 .next();
        System.out.println("ingresa tu apellido");
        String apellido = op1 .next();
        System.out.println("introduce tu edad");
        int edad = op1 .nextInt();
        System.out.println("introduce tu estatura");
        double estatura = op1.nextInt();
        Persona persona1 = new Persona();
        persona1.nombre = nombre;
        persona1.apellido = apellido;
        persona1.edad = edad;
        persona1. estatura = estatura;
        persona1.mostrarNombre();
        persona1.mostrarApellido();
        persona1.mostrarEdad();
        persona1.mostrarEstatura();





    }
    
}
