import java.time.LocalDate;

public class PedidoObra {
    private int nroPedido;
    private String ubicacion;
    private double tamano;
    private LocalDate fechaCreacion;
    private LocalDate fechaReparacion; // null inicial
    private String observaciones;
    private Brigada brigada;

    public PedidoObra(int nroPedido, String ubicacion, double tamano, String observaciones) {
        this.nroPedido = nroPedido;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.fechaCreacion = LocalDate.now();
        this.fechaReparacion = null;
        this.observaciones = observaciones;
    }
    
    public Brigada getBrigada() { return brigada; }
    public void setBrigada(Brigada brigada) { this.brigada = brigada; }

    public void finalizarObra(LocalDate fecha, String observacionesExtras) {
        this.fechaReparacion = fecha;
        this.observaciones += " | " + observacionesExtras;
    }
}