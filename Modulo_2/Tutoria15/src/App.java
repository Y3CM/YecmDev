public class App {
    public static void main(String[] args) throws Exception {
        EditorTexto editor = new EditorTexto("Este es el contenido del texto");

        editor.setExportador(new ExportarPDF());
        editor.exportar();
    }
}
