public class ExportarHTML implements Exportador{

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a HTML: " + contenido);
    }

}
