import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Grupo {
    private String salon;
    private String intervaloHorario;
    private int numeroDeGrupo;
    private String dia;
    private Profesor docente;
    static ArrayList<Grupo> totalGrupos = new ArrayList<>();
    static int contadorGrupos= 0;

    public Grupo(String salon, String intervaloHorario, int numeroDeGrupo, String dia, Profesor docente) {
        this.salon= salon;
        this.intervaloHorario= intervaloHorario;
        this.numeroDeGrupo= numeroDeGrupo;
        this.dia= dia;
        this.docente = docente;
        contadorGrupos ++;
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

    public Profesor getDocente() {
        return docente;
    }
    
    public static void crearGrupo(Profesor docente){
        Scanner scanMan = new Scanner(System.in);
        String salon, horario, dias;
        int numGrupo;
        System.out.println("Introduzca el salon del grupo.");
        salon = scanMan.nextLine();
        System.out.println("Introduzca el horario del grupo.");
        horario = scanMan.nextLine();
        System.out.println("Introduzca los dias que se presentara el grupo.");
        dias = scanMan.nextLine();
        System.out.println("Introduzca el numero del grupo");
        numGrupo = scanMan.nextInt();
        
        Grupo newGrupo = new Grupo(salon, horario, numGrupo, dias, docente);
        totalGrupos.add(newGrupo);
        
    }

    public static void listarGrupo(){
      for(Grupo grupo : totalGrupos){
        System.out.println("Numero de grupo: " + grupo.getNumeroDeGrupo());
        System.out.println("Salon: " + grupo.getSalon());
        System.out.println("Hora de clase: " + grupo.getIntervaloHorario());
        
        System.out.println("Dias: " + grupo.getDia());
        System.out.println(grupo.docente.toString());
        System.out.println();
        }
    }
    
}