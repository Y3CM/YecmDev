public class Restaurante {
    private Cocina cocina;
    private Caja caja;
    private Mesero mesero;

    public Restaurante(){
        this.cocina = new Cocina();
        this.mesero = new Mesero();
        this.caja = new Caja();
    }
    

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public void operarRestuarente(){
       cocina.prepararPlato();
       mesero.servir();
       caja.procesarPago();
    }    
}
