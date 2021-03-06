package com.ubb.covidchile.Retrofit.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestWS {
    @SerializedName("info")
    @Expose
    private String info;

    @SerializedName("estado")
    @Expose
    private boolean estado;

    @SerializedName("regiones")
    @Expose
    private List<Regiones> regiones;

    @SerializedName("fecha")
    @Expose
    private String fecha;

    @SerializedName("reporte")
    @Expose
    private Reporte reporte;

    public RequestWS(String info, boolean estado, List<Regiones> regiones, String fecha, Reporte reporte) {
        this.info = info;
        this.estado = estado;
        this.regiones = regiones;
        this.fecha = fecha;
        this.reporte = reporte;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Regiones> getRegiones() {
        return regiones;
    }

    public void setRegiones(List<Regiones> regiones) {
        this.regiones = regiones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public String toString() {
        return "RequestWS{" +
                "info='" + info + '\'' +
                ", estado=" + estado +
                ", regiones=" + regiones +
                ", fecha='" + fecha + '\'' +
                ", reporte=" + reporte +
                '}';
    }
}
