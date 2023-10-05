import java.util. *;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //Asignaturas
    Asignatura asignatura1 = new Asignatura("POO", 10, 1323);
    Asignatura asignatura2 = new Asignatura("EDA I", 12, 1123);
    Asignatura asignatura3 = new Asignatura("EDA II", 12, 1124);
    Asignatura asignatura4 = new Asignatura("FUNDAMENTOS", 8, 1122);

    //Profesor
    Profesor profesor1 = new Profesor("Juan", "Perez", "12345", asignatura1);
    Profesor profesor2 = new Profesor("Ana", "González", "67890", asignatura2);
    Profesor profesor3 = new Profesor("Carlos", "Lopez", "54321", asignatura3);
    Profesor profesor4 = new Profesor("Maria", "Rodriguez", "98765", asignatura4);

    //Grupos
    Grupo grupo1 = new Grupo("A001", "11:00-13:00", 1, "Lunes y Miércoles", profesor1);
    Grupo grupo2 = new Grupo("B89", "08:00-09:00", 2, "Martes y Jueves", profesor2);
    Grupo grupo3 = new Grupo("G001", "13:00-15:00", 3, "Lunes y Viernes", profesor3);
    Grupo grupo4 = new Grupo("D45", "10:00-1:00", 4, "Martes y Miércoles", profesor4);
    Grupo grupo5 = new Grupo("E230", "13:00-15:00", 5, "Jueves y Viernes", profesor1);
    Grupo grupo6 = new Grupo("F002", "11:00-13:00", 6, "Lunes y Jueves", profesor2);
    Grupo grupo7 = new Grupo("G102", "10:00-1:00", 7, "Martes y Viernes", profesor3);
    Grupo grupo8 = new Grupo("J711", "10:00-1:00", 8, "Miércoles y Jueves", profesor4);
    Grupo grupo9 = new Grupo("I809", "08:00-09:00", 9, "Lunes y Viernes", profesor1);
    Grupo grupo10 = new Grupo("J203", "11:00-13:00", 10, "Martes y Miércoles", profesor2);


    Grupo.totalGrupos.add(grupo1);
    Grupo.totalGrupos.add(grupo2);
    Grupo.totalGrupos.add(grupo3);
    Grupo.totalGrupos.add(grupo4);
    Grupo.totalGrupos.add(grupo5);
    Grupo.totalGrupos.add(grupo6);
    Grupo.totalGrupos.add(grupo7);
    Grupo.totalGrupos.add(grupo8);
    Grupo.totalGrupos.add(grupo9);
    Grupo.totalGrupos.add(grupo10);

    Profesor.totalProfesores.add(profesor1);
    Profesor.totalProfesores.add(profesor2);
    Profesor.totalProfesores.add(profesor3);
    Profesor.totalProfesores.add(profesor4);

    Asignatura.totalAsignaturas.add(asignatura1);
    Asignatura.totalAsignaturas.add(asignatura2);
    Asignatura.totalAsignaturas.add(asignatura3);
    Asignatura.totalAsignaturas.add(asignatura4);


    System.out.println("Bienvenido al sistema de Inscripciones");
    int opcion;
    
    do{
      System.out.println("\nMENU");
      System.out.println("0. Enlistar grupos");
      System.out.println("1. Enlistar profesores y signaturas");      
      System.out.println("2. Crear alumno");
      System.out.println("3. Crear profesor");
      System.out.println("4. Crear grupo");
      System.out.println("5. Crear asignatura");
      System.out.println("6. Darse de baja");
      System.out.println("7. Enlistar alumnos");
      System.out.println("8. Salir");
      
      System.out.print("Eligue una opcion: ");
      opcion = input.nextInt();

      switch (opcion){
        case 0:
          int gruposContador= Grupo.contadorGrupos;
          System.out.println("Cantidad de grupos registrados: " + gruposContador);

          System.out.println("\nGrupos:");
          Grupo.listarGrupo();
          System.out.println("----------------------------------------");

        break;
        case 1:
          System.out.println("\nProfesores:");
          Profesor.listarProfesores();
          System.out.println("----------------------------------------");
          System.out.println("Asignaturas:");
          Asignatura.listarAsignaturas();
          System.out.println("----------------------------------------");
          
        break;

        case 2://Alumno
          Alumno.crearAlumno();
          
        break;

        case 3://Profesor
          Asignatura asignaturaAleatoria = Asignatura.asignaturaAleatoria();
          Profesor.crearProfesor(asignaturaAleatoria);
        break;
          
        case 4://Grupos
        Profesor profesorAleatorio = Profesor.profesorAleatorio();
          Grupo.crearGrupo(profesorAleatorio);
        break;

        case 5://Asignatura
          Asignatura.crearAsignatura();
        break;

        case 6://Darse de baja
          Alumno.darseDeBaja();
        break;
        
        case 7:
          System.out.println("\nAlumnos:");
          Alumno.listarTodosAlumnos();
          System.out.println("----------------------------------------");

          int alimnitos= Alumno.contadorAlumno;
          System.out.println("Cantidad de alumnos registrados: " + alimnitos);

        break;
        case 8:
          System.out.println("\nSaliendo...");
        break;

        default:
        System.out.println("\nIngresa una opcion valida");
      }
      
      
    }while (opcion != 8);
    input.close();
    
  }
}