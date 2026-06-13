public class Trabajador {
    private int id;
    private String nombre;
    private String puesto;
    private boolean ocupado;

    public Trabajador(int id, String nombre, String puesto, boolean ocupado) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.ocupado = ocupado;
    }
    
    public boolean isOcupado() { return ocupado; }
    public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
    public String getNombre() { return nombre; }
}