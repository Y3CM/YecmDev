public class Volar implements Habilidad{

    @Override
    public void usar() {
       System.out.println("Iniciando vuelo...");
    }

    @Override
    public void detalles() {
       System.out.println("Volar: puedes moverte por el aire con libertad");
    }

}
