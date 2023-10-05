import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String apellido;
    private String numDeCuenta;
    private int semestreActual;
    private double promedio;
    private int creditos;
    private int NP;
    static ArrayList<Alumno> totalAlumnos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public Alumno(String nombre, String apellido, String numDeCuenta, int semestreActual, double promedio, int creditos, int NP) {
      this.nombre= nombre;
      this.apellido= apellido;
      this.numDeCuenta=numDeCuenta;
      this.semestreActual=semestreActual;
      this.promedio= promedio;
      this.creditos= creditos;
      this.NP= NP;
        
    }
 
    public String getNombre() {
        return nombre;
    }
    public String getNumDeCuenta() {
        return numDeCuenta;
    }
    public String getApellido() {
        return apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumDeCuenta(String numDeCuenta) {
        this.numDeCuenta = numDeCuenta;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
        this.promedio = promedio;
        } else {
        System.out.println("El promedio debe ser un numero entre 0 y 10");
        }
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNP() {
        return NP;
    }

    public void setNP(int NP) {
        this.NP = NP;
    }

    public static void crearAlumno(){
      Alumno nuevoAl;
      String nombre, apellido, numC;
      int semestreActual, creditos, NP;
      double promedio;
      Scanner scanMan = new Scanner(System.in);
      System.out.println("Introduzca el nombre del alumno.");
      nombre = scanMan.nextLine();
      System.out.println("Introduzca el apellido del alumno.");
      apellido = scanMan.nextLine();
      System.out.println("Introduzca el no. de cuenta del alumno.");
      numC = scanMan.nextLine();
      System.out.println("Introduzca el semestre actual del alumno.");
      semestreActual = scanMan.nextInt();
      System.out.println("Introduzca los créditos que tiene el alumno.");
      creditos = scanMan.nextInt();
      System.out.println("Introduzca las materias NP del alumno.");
      NP = scanMan.nextInt();
      System.out.println("Introduzca el promedio del alumno.");
      promedio = scanMan.nextDouble();

      nuevoAl = new Alumno(nombre, apellido, numC, semestreActual, promedio, creditos, NP);

     totalAlumnos.add(nuevoAl);
      
    }

    public static void listarTodosAlumnos(){
        if (totalAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            int i = 0;
            for (Alumno alu : totalAlumnos) {
                System.out.println("ALUMNO " + i);
                System.out.println("NOMBRE: " + alu.getNombre() + " " + alu.getApellido());
                System.out.println("PROMEDIO: " + alu.getPromedio());
                System.out.println("NUMERO DE CUENTA: " + alu.getNumDeCuenta());
                System.out.println("SEMESTRE ACTUAL: " + alu.getSemestreActual());
                System.out.println("CREDITOS: " + alu.getCreditos());
                System.out.println("CANTIDAD DE NPs: " + alu.getNP());
                System.out.println();
                i++;
            }
        }
    }
    
    @Override
    public String toString(){
        return "Nombre del alumno: " + getNombre() + " " + getApellido() + "\n" +
                "Promedio del alumno: " + getPromedio() + "\n" + "Numero de cuenta: "
                + getNumDeCuenta() + "\n" + "Semestre actual: " + getSemestreActual() + "\n"
                + "Creditos: " + getCreditos() + "\n" + "NPs: " + getNP();
    }

    public static void darseDeBaja() {
        

        if (totalAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
        for (Alumno alumno : totalAlumnos) {
            System.out.println("Ingresa tu numero de cuenta:");
            String numDeCuenta = input.nextLine();
            if (alumno.getNumDeCuenta().equals(numDeCuenta)) {
                totalAlumnos.remove(alumno);
                System.out.println("Te has dado de baja exitosamenete");
                return; 
            }
        }
        System.out.println("No se encontro ningun alumno con ese numero de usuario");
        }
        }
}