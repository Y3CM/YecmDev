import java.util.ArrayList;

public class List {
private ArrayList<String> nombres = new ArrayList<>();

public void showNombres(){
    nombres.add("Yecm");
    nombres.add("Jones");
    nombres.add("Aleja");
    nombres.add("Shannon");
    nombres.add("Romanu");

    for (String nombre : nombres) {
        System.out.println("Lista de nombres: " + nombre);
    }
}
public void removeNameA(){
    nombres.removeIf(nombre -> nombre.startsWith("A"));
    System.out.println(nombres);
}

public boolean existName(String nombre){
    for (String name : nombres) {
        if (name.equals(nombre)) {
            System.out.println("el nombre "+ nombre + " si exite en la lista");
            return true;
        }
    }
    System.out.println("el nombre " + nombre + " no exite en la lista");
    return false;
}
}
