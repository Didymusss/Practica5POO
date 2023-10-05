import java.util.ArrayList;
import java.util.LinkedList;

public class Grupo {
    private String salon;
    private String intervaloHorario;
    private int numeroDeGrupo;
    private LinkedList<Alumno> alumnito;
    private String dia;
    private Asignatura Materia;
    private static ArrayList<Grupo> totalGrupos = new ArrayList<>();
    
    public Grupo(String salon, String intervaloHorario, int numeroDeGrupo, String dia, Materia materia) {
        setSalon(salon);
        setIntervaloHorario(intervaloHorario);
        setNumeroDeGrupo(numeroDeGrupo);
        setDia(dia);
        setMateria(materia);
        totalGrupos.add(this);
      
    }

    /*public void crearGrupo(){
      Grupo nuevoGrupo;
      String salon, horario, dia;
      int numero;
      Asignatura materia;

      Scanner scanMan = new Scanner(System.in);
      System.out.println("Introduzca el salon.");
      salon = scanMan.nextLine();
      System.out.println("Introduzca el horario de la clase.");
      horario = scanMan.nextLine();
      System.out.println("Introduzca el dia de la clase.");
      dia = scanMan.nextLine();
      System.out.println("Introduzca el numero del grupo");
      numero = scanMan.nextInt();
      System.out.println("Introduzca la materia");
      

      nuevoGrupo = new Grupo(salon, horario, numero, dia, materia);
      
    }*/
      
    public String getSalon() {
        return salon;
    }

    public String getDia() {
        return dia;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getIntervaloHorario() {
        return intervaloHorario;
    }

    public void setIntervaloHorario(String intervaloHorario) {
        this.intervaloHorario = intervaloHorario;
    }

    public int getNumeroDeGrupo() {
        return numeroDeGrupo;
    }

    public void setNumeroDeGrupo(int numeroDeGrupo) {
        this.numeroDeGrupo = numeroDeGrupo;
    }

    public void getAlumnito() {
        for(int i = 0;i<alumnito.size();i++){
            System.out.println(alumnito.get(i));
        }
    }

    public void setAlumnito(LinkedList<Alumno> alumnito, Alumno alumno) {
        alumnito.add(alumno);
    }

    public Asignatura getMateria() {
        return Materia;
    }

    public void setMateria(Asignatura Materia) {
        this.Materia = Materia;
    }

    public void listarGrupo(){
      for(Grupo grupo : totalGrupos){
        System.out.println("Salon: " + grupo.getSalon());
        System.out.println("Hora de clase: " + grupo.getIntervaloHorario());
        System.out.println("Numero de grupo: " + grupo.getNumeroDeGrupo());
        System.out.println("Dias: " + grupo.getDia());
        System.out.println("Materia: " + grupo.getMateria());
        
    }
    }
    
}