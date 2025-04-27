import java.util.ArrayList;
import java.util.List;

public class GestionReservas {
private List<Reserva> reservas;
private GestionClientes clientes;



    public GestionReservas(GestionClientes clientes){
        reservas = new ArrayList<>();
        this.clientes = clientes;
    }

    public void crearReserva(String clienteId, String fechaInicio, String fechaFin) throws ReservaInvalidaException{
        //Cliente no existe
        try {
            Cliente cliente = clientes.buscarCliente(clienteId);
            
        } catch (ClienteNoEncontradoException e) {
            throw new ReservaInvalidaException("El cliente con el id: "+ clienteId +" no existe");
        }


        //fecha inicio invalida
        if (fechaInicio.isEmpty()) {
            throw new ReservaInvalidaException("La fecha inicio no puede estar vacia");
        }

        //fecha fin invalida

        if (fechaFin.isEmpty()) {
            throw new ReservaInvalidaException("La fecha fin no puede estar vacia");
        }

        Reserva reserva = new Reserva(clienteId,fechaInicio,fechaFin);
        reservas.add(reserva);
        System.out.println("Reserva creada correctamente.");
    }

    public Reserva buscarReserva(String clienteId, String fechaInicio){

            Cliente cliente = clientes.buscarCliente(clienteId);
            
        for (Reserva reserva : reservas) {
            if (reserva.getClienteId().equals(clienteId) && reserva.getFechaInicio().equals(fechaInicio)) {
                return reserva;
            }
        }
        return null;

    }

    public void showReservas(){
        System.out.println("Reservas:");
        if (!reservas.isEmpty()) {
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
            return;
        } 
            System.out.println("No hay reservas registradas");
        
    }

}