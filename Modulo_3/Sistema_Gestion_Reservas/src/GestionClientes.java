import java.util.ArrayList;
import java.util.List;

public class GestionClientes {

    private List<Cliente> clientes;


    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public GestionClientes(){
        clientes = new ArrayList<>();
    }

    public void registrarCliente(String id, String nombre){
        Cliente cliente = new Cliente(id, nombre);
        clientes.add(cliente);
        System.out.println("Cliente registrado con exito");
    }
    public Cliente buscarCliente(String id){ 

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        throw new ClienteNoEncontradoException("Cliente con el ID: "+ id +" no encontrado");
    }

    public void showClientes(){
        System.out.println("Clientes:");
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
            return;
        } 
            System.out.println("No hay clientes registrados");
        
    }
  
}
