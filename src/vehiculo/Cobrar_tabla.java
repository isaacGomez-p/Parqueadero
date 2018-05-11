package vehiculo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ISAACELEAZAR
 */
public class Cobrar_tabla {
    String placa;
    Integer tiempo, valor;
    Date fecha_ac;

    public Cobrar_tabla(String placa_, Integer tiempo_, Integer valor_, Date fecha_ac_) {
        this.placa = placa_;
        this.tiempo = tiempo_;
        this.valor = valor_;
        this.fecha_ac = fecha_ac_;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Date getFecha_ac() {
        return fecha_ac;
    }

    public void setFecha_ac(Date fecha_ac) {
        this.fecha_ac = fecha_ac;
    }
    
    
    
}
