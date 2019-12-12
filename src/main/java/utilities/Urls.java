package utilities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Urls {
    public int id;
    public String code;
    public String url;
    public Integer cantidad;
    public Timestamp fecha;
    public List<Accesos> datos = new ArrayList<>();
    public String usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public List<Accesos> getDatos() {
        return datos;
    }

    public void setDatos(List<Accesos> datos) {
        this.datos = datos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
