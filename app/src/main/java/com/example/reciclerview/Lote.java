package com.example.reciclerview;

public class Lote {
    private String idLote;
    private String refLote;
    private String descripcion;
    private String salida;
    private String imgLote;

    public Lote(String idLote, String refLote, String descripcion, String salida, String imgLote) {
        this.idLote = idLote;
        this.refLote = refLote;
        this.descripcion = descripcion;
        this.salida = salida;
        this.imgLote = imgLote;
    }

    public String getIdLote() {
        return idLote;
    }

    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    public String getRefLote() {
        return refLote;
    }

    public void setRefLote(String refLote) {
        this.refLote = refLote;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getImgLote() {
        return imgLote;
    }

    public void setImgLote(String imgLote) {
        this.imgLote = imgLote;
    }
}
