import java.util.ArrayList;
import java.util.LinkedList;

public class Profesor {
    private double salarioMinimo = 15000;
    private String nombre;
    private String apellido;
    private String numDeCuenta;
    private LinkedList<Grupo> horario;
    private static ArrayList<Profesor> totalProfesores = new ArrayList<>();

    public Profesor(String nombre, String apellido, String numDeCuenta) {
      this.nombre= nombre;
      this.apellido= apellido;
      this.numDeCuenta= numDeCuenta;
    }
    
    public void anadirProfesor(Profesor profe){
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

    public void getHorario() {
        for(int i = 0;i<horario.size();i++){
            System.out.println((horario.get(i).getSalon()));
        }
    }

    public void setHorario(Grupo grupo) {
        horario.add(grupo);
    }
    
    public static void crearProfesor(){
      Profesor newProf;
      String nombre, apellido, numC;
      Scanner scanMan = new Scanner(System.in);
      System.out.println("Introduzca el nombre del profesor.");
      nombre = scanMan.nextLine();
      System.out.println("Introduzca el apellido del profesor.");
      apellido = scanMan.nextLine();
      System.out.println("Introduzca el no. de cuenta del profesor.");
      numC = scanMan.nextLine();

      newProf = new Profesor(nombre, apellido, numC);
    } 

    public static void listarProfesores(){
      for(Profesor profesor : totalProfesores){       
        System.out.println("Salario: " + profesor.getSalarioMinimo());
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Apellido: " + profesor.getApellido());
        System.out.println("Num de cuenta: " + profesor.getNumDeCuenta());
        System.out.println("Horario: ");
        profesor.getHorario();
        
      }
    }
}
