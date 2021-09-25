package edu.idgs1002.macrobios.aplicacionlistas.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Lista implements Parcelable {
    private int ListaId;
    private String NombreLista;
    private String FechaCreacion;
    private int posicion;
    private List<Actividad> actividadList;

    public Lista() {
    }

    public Lista(int listaId, String nombreLista, String fechaCreacion, int posicion, List<Actividad> actividadList) {
        ListaId = listaId;
        NombreLista = nombreLista;
        FechaCreacion = fechaCreacion;
        this.posicion = posicion;
        this.actividadList = actividadList;
    }

    protected Lista(Parcel in) {
        ListaId = in.readInt();
        NombreLista = in.readString();
        FechaCreacion = in.readString();
        posicion = in.readInt();
    }

    public static final Creator<Lista> CREATOR = new Creator<Lista>() {
        @Override
        public Lista createFromParcel(Parcel in) {
            return new Lista(in);
        }

        @Override
        public Lista[] newArray(int size) {
            return new Lista[size];
        }
    };

    public int getListaId() {
        return ListaId;
    }

    public void setListaId(int listaId) {
        ListaId = listaId;
    }

    public String getNombreLista() {
        return NombreLista;
    }

    public void setNombreLista(String nombreLista) {
        NombreLista = nombreLista;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public List<Actividad> getActividadList() {
        return actividadList;
    }

    public void setActividadList(List<Actividad> actividadList) {
        this.actividadList = actividadList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ListaId);
        dest.writeString(NombreLista);
        dest.writeString(FechaCreacion);
        dest.writeInt(posicion);
    }
}
