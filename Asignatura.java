import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Asignatura {
    private String nombre;
    private int creditos;
    private int codigo;
    static ArrayList<Asignatura> totalAsignaturas = new ArrayList<>();

    public Asignatura(String nombre, int creditos, int codigo) {
        this.nombre= nombre;
        this.creditos= creditos;
        this.codigo= codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static void listarAsignaturas(){
      int i = 0;
      for(Asignatura materia : totalAsignaturas){
        System.out.println("MATERIA " + i + ":");
        System.out.println("NOMBRE: " + materia.getNombre());
        System.out.println("CREDITOS: " + materia.getCreditos());
        System.out.println("CODIGO: " + materia.getCodigo());
        System.out.println();
        i++;
      }
    }

    public static void crearAsignatura(){
      Asignatura newAsignatura;
      String nombre;
      int creditos, codigo;
      Scanner scanMan = new Scanner(System.in);
      System.out.println("Introduzca el nombre de la asignatura");
      nombre = scanMan.nextLine();
      System.out.println("Introduzca los creditos de la asignatura");
      creditos = scanMan.nextInt();
      System.out.println("Introduzca el codigo de la asignatura");
      codigo = scanMan.nextInt();
      
      newAsignatura = new Asignatura(nombre, creditos, codigo);
      anadirAsignatura(newAsignatura);
      
    }
    
    public static void anadirAsignatura(Asignatura asignatura){
        totalAsignaturas.add(asignatura);
    }

    public static Asignatura asignaturaAleatoria() {
        Random random = new Random();
        int a = random.nextInt(totalAsignaturas.size());
        return totalAsignaturas.get(a);
    }

    
    @Override
    public String toString(){
        return "Nombre de la materia enseñada: " + getNombre() + "\n"
                + "Código de la materia enseñada: " + getCodigo() + "\n"
                + "Créditos dados por pasar la materia: " + getCreditos();
        
    }
    
}