import java.util.ArrayList;
import java.util.List;

public class Brigada {
    private int nroBrigada;
    private NombreBrigada nombre;
    private int cantTrabajadores;
    private String equipamiento;
    private String materiales;
    private List<Trabajador> trabajadores;
    private Trabajador jefe;

    public Brigada(int nroBrigada, NombreBrigada nombre, String equipamiento, String materiales) {
        this.nroBrigada = nroBrigada;
        this.nombre = nombre;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
        this.trabajadores = new ArrayList<>();
        this.cantTrabajadores = 0;
    }

    public boolean isOciosa() { return !trabajadores.isEmpty() && trabajadores.stream().noneMatch(Trabajador::isOcupado); }
    public List<Trabajador> getTrabajadores() { return trabajadores; }

    public void liberar() {
        for (Trabajador t : trabajadores) {
            t.setOcupado(false);
        }
    }
}