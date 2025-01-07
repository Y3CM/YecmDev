public class EditorTexto {
    private Exportador exportador;
    private String contenido;

    public EditorTexto(Exportador exportador, String contenido) {
        this.exportador = exportador;
        this.contenido = contenido;
    }

    public EditorTexto(String contenido){
        this.contenido = contenido;
    };

    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }

    public void exportar() {
        if (exportador == null) {
            System.out.println("Por favor elija un exportador");
        }else{
            exportador.exportar(contenido);
        }
    }
}
