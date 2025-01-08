import java.util.ArrayList;
import java.util.List;

public class SuperHeroe {

    private String name;
    
    private List<Habilidad> habilidades;

    public SuperHeroe(String name, Habilidad habilidad) {
        this.name = name;
        habilidades = new ArrayList<>();
        habilidades.add(habilidad);
    }

    public void addHabilidad(Habilidad habilidad) {
        this.habilidades.add(habilidad);
    }

    public void showDetailsHeroe(){
        System.out.println("Nombre: " + name);
        System.out.println("Habilidades:");
        for (Habilidad habilidad : habilidades) {
           habilidad.detalles();
        }
    }
    
    public void useHabilidades(){
        System.out.println("Usando habilidades de " + name);
        for (Habilidad habilidad : habilidades) {
            habilidad.usar();
        }
    }


    public void daño(){
         
        System.out.println("El SuperHeroe " + name + " ha recibido daño");
        if(habilidades.size() > 0){
            System.out.println("has recibido un ataque que te hizo perder la habilidad: ");
            habilidades.get(habilidades.size() - 1).detalles();
            habilidades.remove(habilidades.size() - 1);
            System.out.println("Nuevas habilidades:");
            for (Habilidad habilidad : habilidades) {
                habilidad.detalles();
            }
        } else {
            System.out.println("has muerto no tienes habilidades");
        }
    }
}
