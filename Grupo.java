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
        this.salon= salon;
        this.intervaloHorario= intervaloHorario;
        this.numeroDeGrupo= numeroDeGrupo;
        this.dia= dia;
        this.materia= materia;
        totalGrupos.add(this);
      
    }

      
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

    public static void listarGrupo(){
      for(Grupo grupo : totalGrupos){
        System.out.println("Salon: " + grupo.getSalon());
        System.out.println("Hora de clase: " + grupo.getIntervaloHorario());
        System.out.println("Numero de grupo: " + grupo.getNumeroDeGrupo());
        System.out.println("Dias: " + grupo.getDia());
        System.out.println("Materia: " + grupo.getMateria());
        
    }
    }
    
}