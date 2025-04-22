public class Reserva {
String clienteId;
String fechaInicio;
String fechaFin;

public Reserva(String clienteId, String fechaInicio, String fechaFin)
{
this.clienteId = clienteId;
this.fechaInicio = fechaInicio;
this.fechaFin = fechaFin;
}

public String getClienteId() {
    return clienteId;
}

public void setClienteId(String clienteId) {
    this.clienteId = clienteId;
}

public String getFechaInicio() {
    return fechaInicio;
}

public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
}

public String getFechaFin() {
    return fechaFin;
}

public void setFechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
}

@Override
public String toString() {
    return "Reserva [clienteId=" + clienteId + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
}

}
