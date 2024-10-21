import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        // Capacidad de 100 tareas
        // Para saber si una tarea está completada
        // Contador de tareas

        Scanner scanner = new Scanner(System.in);
        String comando;

        System.out.println("Bienvenido al Gestor de Tareas Sencillo");

        while (true) {
            System.out.println("\nComandos disponibles: [agregar, eliminar, completar, listar, salir]");
            comando = scanner.nextLine();

            if (comando.equals("salir")) {
                break;
            }

            switch (comando) {
                case "agregar":
                    //Llamar a metodo Agregar

                case "eliminar":
                    //llamar a metodo Eliminar

                case "completar":
                    //llenar algoritmo que indique que se completo la tarea
                case "listar":
                    //Listar las tareas que estan tanto completadas como las que aun no estan hechas
                    //puntos extras si logran estilizar los prints!!!!

                default:
                    System.out.println("Comando no reconocido.");
            }
        }

        scanner.close();
    }
}
