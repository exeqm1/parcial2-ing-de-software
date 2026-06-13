public class Bache {
    private int idBache;
    private double tamano;
    private String calleA;
    private String calleB;
    private int altura;
    private String barrio;
    private int prioridad; // 1 al 5
    private EstadoBache estado;

    public Bache(int idBache, double tamano, String calleA, String calleB, int altura, String barrio, int prioridad) {
        this.idBache = idBache;
        this.tamano = tamano;
        this.calleA = calleA;
        this.calleB = calleB;
        this.altura = altura;
        this.barrio = barrio;
        this.prioridad = prioridad;
        this.estado = EstadoBache.SIN_REPARAR;
    }
    
    public EstadoBache getEstado() { return estado; }
    public void setEstado(EstadoBache estado) { this.estado = estado; }
}