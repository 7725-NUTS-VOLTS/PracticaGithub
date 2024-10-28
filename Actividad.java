import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        // Capacidad de 100 tareas
        // Para saber si una tarea está completada
        // Contador de tareas
       String[]tareas = new String[100];
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
                    agregar(tareas, scanner);
                case "eliminar":
                     eliminar(tareas, scanner);
                    //llamar a metodo Eliminar
                case "completar":
                    //llenar algoritmo que indique que se completo la tarea
                    completar(tareas, scanner);
                case "listar":
                    //Listar las tareas que estan tanto completadas como las que aun no estan hechas
                    //puntos extras si logran estilizar los prints!!!!
                    System.out.println(comando);
                    listar(tareas, scanner);
                    
                default:
                    System.out.println("Comando no reconocido.");

            }
        }
        scanner.close();
    }

    //AGREGAR
        public static void agregar(String[] tareas, Scanner scanner){
            System.out.println("lol");
           // if(tareas[0]==null){
             //   tareas[0]= prueba;
               // System.out.println(tareas[0]);
               // System.out.println("lol2");

            //}else{
           for (int i = 0; i < tareas.length; i++){
            System.out.println("Introduzca la tarea " + (i+1)+ " que desea agregar o Presiona 0 para salir");
            String prueba = scanner.nextLine();
            tareas[i]= prueba;
               if(tareas[i]!= null){
               System.out.println(tareas[i]);
               }
            if (prueba.equals("0")) {
                break; 
            }
         }
         System.out.println("\nLista de tareas:");
            for (int i = 0; i < tareas.length; i++) {
                 if (tareas[i] != null) {
                    System.out.println((i + 1) + ": " + tareas[i]); // Imprime la tarea
             } 
            
}

         }
     //ELIMINAR
        public static void eliminar(String[] tareas, Scanner scanner){
            System.out.println("\nLista de tareas:");
          for (int i = 0; i < tareas.length; i++) {
                 if (tareas[i] != null) {
                    System.out.println((i + 1) + ": " + tareas[i]); // Imprime la tarea
             } 
            System.out.println("Inserte el número de tarea que quieres eliminar o presiona 0 para salir");
            int eliminar = scanner.nextInt() - 1;
            scanner.nextLine();

          if (eliminar >= 0 && eliminar < tareas.length) {
             if (tareas[eliminar] != null) {
                 System.out.println("Tarea eliminada: " + tareas[eliminar]);
                     tareas[eliminar] = null; // Establecer el elemento en null
              }
              
                }else if (eliminar==-1){
                    break; 
                }


                listar(tareas, scanner);
            }
        }

// IMPRIMIR NUEVA LISTA
public static void listar(String[] tareas, Scanner scanner) {
    System.out.println("\nLista de tareas actualizada:");
    for (int i = 0; i < tareas.length; i++) {
        if (tareas[i] != null) {
            System.out.println((i + 1) + ": " + tareas[i]);
        }
            }
        }
    
//COMPLETAR

public static void completar(String[] tareas, Scanner scanner){
    System.out.println("Inserte el número de tarea que se completó o presiona 0 para salir");
    int yaporolo = scanner.nextInt() - 1;
    scanner.nextLine();

  if (yaporolo >= 0 && yaporolo < tareas.length) {
     if (tareas[yaporolo] != null) {
         System.out.println("Tarea eliminada: " + tareas[yaporolo]);
             tareas[yaporolo] = tareas[yaporolo]+" completa"; // Establecer el elemento en null
      
            }else if (yaporolo==-1){
                return; 
            }


        listar(tareas, scanner);
    }
}
}






    


      
    

          


    

