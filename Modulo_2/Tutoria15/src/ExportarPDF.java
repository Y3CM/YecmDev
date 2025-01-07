public class ExportarPDF implements Exportador{

    @Override
    public void exportar(String contenido) {
       System.out.println("Exportando a PDF: " + contenido);
    }

}
