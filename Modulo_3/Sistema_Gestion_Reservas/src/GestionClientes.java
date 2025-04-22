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
    }
    public void buscarCliente(String id){ 
        if(!clientes.isEmpty()){
            try{
                for (Cliente cliente : clientes) {
                    if(cliente.getId().equals(id)){
                        System.out.println(cliente);
                        break;
                    }else{
                        throw new ClienteNoEncontradoException("Cliente no encontrado");
                    }
                }
            }catch(ClienteNoEncontradoException e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("No hay clientes registrados");
        }
    }
  
}
