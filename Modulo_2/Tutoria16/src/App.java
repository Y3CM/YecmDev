public class App {
    public static void main(String[] args) throws Exception {
        SuperHeroe yecm = new SuperHeroe("Jones", new Volar());

        yecm.addHabilidad(new SuperFuerza()); 
        yecm.showDetailsHeroe();
        yecm.useHabilidades();
        yecm.daño();
        yecm.daño();
        yecm.daño();
    }
}
