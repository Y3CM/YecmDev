import java.util.ArrayList;
import java.util.List;

public class GestionReservas {
List<Reserva> reservas;

    public GestionReservas(){
        reservas = new ArrayList<>();
    }

    public void crearReserva(String clienteId, String fechaInicio, String fechaFin){
        Reserva reserva = new Reserva(clienteId,fechaInicio,fechaFin);
        reservas.add(reserva);
    }
}
