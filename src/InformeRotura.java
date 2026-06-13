import java.time.LocalDate;

public class InformeRotura {
    private int codInf;
    private LocalDate fechaInforme;
    private String problema;
    private int codigoUrgencia;
    private Bache bache;
    private Ciudadano ciudadano;
    private PedidoObra pedidoObra; // null inicial

    public InformeRotura(int codInf, String problema, int codigoUrgencia, Bache bache, Ciudadano ciudadano) {
        this.codInf = codInf;
        this.fechaInforme = LocalDate.now();
        this.problema = problema;
        this.codigoUrgencia = codigoUrgencia;
        this.bache = bache;
        this.ciudadano = ciudadano;
        this.pedidoObra = null;
    }
    
    public Ciudadano getCiudadano() { return ciudadano; }
    public PedidoObra getPedidoObra() { return pedidoObra; }
    public Bache getBache() { return bache; }
}