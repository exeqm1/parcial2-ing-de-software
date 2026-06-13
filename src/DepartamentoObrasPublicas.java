import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class DepartamentoObrasPublicas {
    private List<InformeRotura> informes = new ArrayList<>();
    private List<PedidoObra> pedidos = new ArrayList<>();
    private List<Brigada> brigadas = new ArrayList<>();
    private List<Bache> baches = new ArrayList<>();

    public List<InformeRotura> informesPorCiudadano(Ciudadano c) {
        List<InformeRotura> resultado = new ArrayList<>();
        for (InformeRotura i : informes) {
            if (i.getCiudadano().equals(c)) {
                resultado.add(i);
            }
        }
        return resultado;
    }

    public List<InformeRotura> informesSinPedidos() {
        List<InformeRotura> resultado = new ArrayList<>();
        for (InformeRotura i : informes) {
            if (i.getPedidoObra() == null) {
                resultado.add(i);
            }
        }
        return resultado;
    }

    public List<Brigada> informeBrigadasOciosas() {
        List<Brigada> resultado = new ArrayList<>();
        for (Brigada b : brigadas) {
            if (b.isOciosa()) {
                resultado.add(b);
            }
        }
        return resultado;
    }

    public List<PedidoObra> pedidosPorBrigada(Brigada b) {
        List<PedidoObra> resultado = new ArrayList<>();
        for (PedidoObra p : pedidos) {
            if (p.getBrigada() != null && p.getBrigada().equals(b)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Bache> bachesSinReparar() {
        List<Bache> resultado = new ArrayList<>();
        for (Bache b : baches) {
            if (b.getEstado() == EstadoBache.SIN_REPARAR) {
                resultado.add(b);
            }
        }
        return resultado;
    }

    public List<Trabajador> trabajadoresPorBrigada(Brigada b) {
        return b.getTrabajadores();
    }

    public void registrarReparacion(PedidoObra pedido, LocalDate fecha, String observaciones) {
        pedido.finalizarObra(fecha, observaciones);
        
        if (pedido.getBrigada() != null) {
            pedido.getBrigada().liberar();
        }
        
        for (InformeRotura inf : informes) {
            if (pedido.equals(inf.getPedidoObra())) {
                inf.getBache().setEstado(EstadoBache.REPARADO);
                break; // Terminamos de buscar
            }
        }
    }
}