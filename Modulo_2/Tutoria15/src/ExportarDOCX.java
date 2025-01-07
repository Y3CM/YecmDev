public class ExportarDOCX implements Exportador{

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Docx: " + contenido);
    }

}
