import java.util.ArrayList;
import java.util.List;
public class Equipos {
    private String nombre;
    private List <String> Integrantes;
    
    public Equipos(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void addIntegrantes(String integrante){
        this.Integrantes.add(integrante);
    }
    public List <String> getJugador(){
        return this.Integrantes;
    }
    
}
