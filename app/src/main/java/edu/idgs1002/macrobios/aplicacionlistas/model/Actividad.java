package edu.idgs1002.macrobios.aplicacionlistas.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Actividad implements Parcelable {
    private int ActividadId;
    private String Actividad;
    private int posicion;
    private boolean estado;

    public Actividad() {
    }

    public Actividad(int actividadId, String actividad, int posicion, boolean estado) {
        ActividadId = actividadId;
        Actividad = actividad;
        this.posicion = posicion;
        this.estado = estado;
    }

    protected Actividad(Parcel in) {
        ActividadId = in.readInt();
        Actividad = in.readString();
        posicion = in.readInt();
        estado = in.readByte() != 0;
    }

    public static final Creator<Actividad> CREATOR = new Creator<Actividad>() {
        @Override
        public Actividad createFromParcel(Parcel in) {
            return new Actividad(in);
        }

        @Override
        public Actividad[] newArray(int size) {
            return new Actividad[size];
        }
    };

    public int getActividadId() {
        return ActividadId;
    }

    public void setActividadId(int actividadId) {
        ActividadId = actividadId;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String actividad) {
        Actividad = actividad;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ActividadId);
        dest.writeString(Actividad);
        dest.writeInt(posicion);
        dest.writeByte((byte) (estado ? 1 : 0));
    }
}
