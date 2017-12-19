
import java.util.ArrayList;
import java.util.List;

public class Comparar {
    
    private boolean hayJugadoresRepetidos(Equipos e1, Equipos e2){
        boolean s=false;
        
        if(e1.getJugador().equals(e2.getJugador())){
            System.out.println("Hay jugadores repetidos");
            return true;
        }
        return s;
    }
    
    public static void main (String []args){
        
        Equipos equipo1 =new Equipos ("Team 1");
        Equipos equipo2= new Equipos ("Team 2");
        
        equipo1.addIntegrantes("Juan");
        equipo1.addIntegrantes("Pedro");
        equipo1.addIntegrantes("Carlos");
        equipo1.addIntegrantes("Federico");
        equipo1.addIntegrantes("Javier");
        
        equipo2.addIntegrantes("Martin");
        equipo2.addIntegrantes("Pablo");
        equipo2.addIntegrantes("Sebastian");
        equipo2.addIntegrantes("Gonzalo");
        equipo2.addIntegrantes("Lucas");
        


        
        
    }
}
