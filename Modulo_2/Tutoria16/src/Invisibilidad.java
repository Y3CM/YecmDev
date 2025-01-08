public class Invisibilidad implements Habilidad{

    @Override
    public void usar() {
       System.out.println("Activando invisibilidad...");
    }

    @Override
    public void detalles() {
       System.out.println("Invisibildad: las personas no pueden verte cuando la usas");
    }

}
