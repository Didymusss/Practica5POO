import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Asignaturas
    Asignatura asignatura1 = new Asignatura("POO", 10, 1323);
    Asignatura asignatura2 = new Asignatura("EDA I", 12, 1123);
    Asignatura asignatura3 = new Asignatura("EDA II", 12, 1124);
    Asignatura asignatura4 = new Asignatura("FUNDAMENTOS", 8, 1122);
    Asignatura asignatura5 = new Asignatura("CALCULO VECTORIAL", 10, 1212);

    //Grupos
    Grupo grupo1 = new Grupo("J101", "11:00-13:00", 1, "LUNES");
    grupo1.setMateria(asignatura1);
    Grupo grupo2 = new Grupo("Y101", "13:00-15:00", 2, "MARTES");
    grupo2.setMateria(asignatura1);
    Grupo grupo3 = new Grupo("A102", "08:00-09:00", 3, "MIERCOLES");
    grupo3.setMateria(asignatura2);
    Grupo grupo4 = new Grupo("Q102", "10:00-11:00", 4, "JUEVES");
    grupo4.setMateria(asignatura2);
    Grupo grupo5 = new Grupo("J151", "13:00-15:00", 5, "VIERNES");
    grupo5.setMateria(asignatura3);
    Grupo grupo6 = new Grupo("B101", "13:00-15:00", 6, "SABADO");
    grupo6.setMateria(asignatura3);
    Grupo grupo7 = new Grupo("R102", "08:00-09:00", 7, "DOMINGO");
    grupo7.setMateria(asignatura4);
    Grupo grupo8 = new Grupo("T102", "10:00-1:00", 8, "LUNES");
    grupo8.setMateria(asignatura4);
    Grupo grupo9 = new Grupo("H102", "08:00-09:00", 9, "MARTES");
    grupo9.setMateria(asignatura5);
    Grupo grupo10 = new Grupo("S102", "10:00-1:00", 10, "MIERCOLES");
    grupo10.setMateria(asignatura5);


    //Profesores
    Profesor profesor1 = new Profesor("Juan Carlos", "de la Rosa", "513");
    profesor1.setHorario(grupo1);
    profesor1.setHorario(grupo4);
    Profesor profesor2 = new Profesor("Panfilo", "Ramirez", "827");
    profesor2.setHorario(grupo8);
    profesor2.setHorario(grupo10);
    Profesor profesor3 = new Profesor("Jayla", "Sevaun", "1337");
    profesor3.setHorario(grupo3);
    profesor3.setHorario(grupo5);
    profesor3.setHorario(grupo6);
    Profesor profesor4 = new Profesor("Wensel", "Lieselotte", "6969");
    profesor4.setHorario(grupo2);
    profesor4.setHorario(grupo7);
    profesor4.setHorario(grupo9);


    System.out.println("Bienvenido al sistema de Inscripciones");
    int opcion;
    Scanner input = new Scanner(System.in);
    do{
      System.out.println("\nMENU");
      System.out.println("1. Ver alumnos, profesores, grupos y asignaturas");      
      System.out.println("2. Crear alumno");
      System.out.println("3. Crear profesor");
      System.out.println("4. Crear grupo");
      System.out.println("5. Crear asignatura");
      System.out.println("6. Darse de baja");
      System.out.println("7. Salir");
      
      System.out.print("Eligue una opcion: ");
      opcion = input.nextInt();

      switch (opcion){
        case 1:
          System.out.println("Alumnos:");
          listarTodosAlumnos();
          System.out.println("Profesores:");
          listarProfesores();
          System.out.println("Grupos:");
          listarGrupo();
          System.out.println("Asignaturas:");
          listarAsignaturas();
          
        break;

        case 2://Alumno
          crearAlumno();
          
        break;

        case 3://Profesor
          crearProfesor();
        break;
          
        case 4://Grupos
          
        break;

        case 5://Asignatura
          crearAsignatura();
        break;

        case 6://Darse de baja
          
        break;
          
        case 7:
          System.out.println("\nSaliendo...");
        break;

        default:
        System.out.println("\nIngresa una opcion valida");
      }
      
      
    }while (opcion != 7);
    input.close();
    
  }
}