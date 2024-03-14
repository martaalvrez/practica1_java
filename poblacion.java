import java.util.*;

public class poblacion ()
{
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private double temperatura;
    protected Luminosidad luminosidad;
    private Dosis dosisComida;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public Date getfechaInicio() {
    return fechaInicio;
}

public void setfechaInicio(Date fechaInicio) {
    this.fechaInicio = fechaInicio;
}

public Date getfechaFin() {
    return fechaFin;
}

public void setfechaFin(Date fechaFin) {
    this.fechaFin = fechaFin;
}

public Double gettemperatura() {
    return temperatura;
}

public void settemperatura(Double tempera) {
    this.temperatura = temperatura;
}

public Luminosidad getluminosidad() {
    return luminosidad;
}

public void setluminosidad(Luminosidad luminosidad) {
    this.luminosidad = luminosidad;
}

public Dosis getdosisComida() {
    return dosisComida;
}

public void setdosisComida(Dosis dosisComida) {
    this.dosisComida = dosisComida;
}







