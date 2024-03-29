import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Profesor {
    private double salarioMinimo = 15000;
    private String nombre;
    private String apellido;
    private String numDeCuenta;
    ArrayList<Alumno> alumnos = new ArrayList<>();
    private Asignatura materia;
    static ArrayList<Profesor> totalProfesores = new ArrayList<>();

    public Profesor(String nombre, String apellido, String numDeCuenta, Asignatura materia) {
      this.nombre= nombre;
      this.apellido= apellido;
      this.numDeCuenta= numDeCuenta;
      this.materia = materia;
    }
    
    public static void anadirProfesor(Profesor profe){
        totalProfesores.add(profe);
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumDeCuenta() {
        return numDeCuenta;
    }

    public void setNumDeCuenta(String numDeCuenta) {
        this.numDeCuenta = numDeCuenta;
    }
    
    public static void crearProfesor(Asignatura materia){
      Profesor newProf;
      String nombre, apellido, numC;
      Scanner scanMan = new Scanner(System.in);
      System.out.println("Introduzca el nombre del profesor.");
      nombre = scanMan.nextLine();
      System.out.println("Introduzca el apellido del profesor.");
      apellido = scanMan.nextLine();
      System.out.println("Introduzca el no. de cuenta del profesor.");
      numC = scanMan.nextLine();

      newProf = new Profesor(nombre, apellido, numC, materia);
      anadirProfesor(newProf);
    } 

    public static void listarProfesores(){
        int i = 0;
      for(Profesor profesor : totalProfesores){ 
          System.out.println("PROFESOR NUMERO " + i + ":");
          System.out.println(profesor);
          System.out.println("");
          i++;
      }
    }
    
    public void anadirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    @Override
    public String toString(){
        return "Nombre del profesor: " + getNombre() + "\n"
                + "Apellido del profesor: " + getApellido() + "\n"
                + "Numero de cuenta: " + getNumDeCuenta() + "\n" + materia.toString();
    }

    public static Profesor profesorAleatorio() {
        Random random = new Random();
        int p = random.nextInt(totalProfesores.size());
        return totalProfesores.get(p);
    }
    
    public void listarAlumnosProfesor(){
        System.out.println("ALUMNOS REGISTRADOS CON EL PROFESOR " + getNombre() + " " +
                getApellido());
        for(Alumno a: this.alumnos){
            System.out.println(a);
        }
    }
    
}