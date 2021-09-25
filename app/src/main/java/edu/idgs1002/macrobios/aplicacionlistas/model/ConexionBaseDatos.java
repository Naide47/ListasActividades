package edu.idgs1002.macrobios.aplicacionlistas.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionBaseDatos extends SQLiteOpenHelper {

    // TODO Ponerle nombre a la base datos
    private static final String DB_NAME = "ListasActividades";
    private static final int DB_VERSION = 1;

    public static String TB_LISTAS = "Listas";
    public static String K_LISTAS_ID = "ListaId";
    public static String K_LISTAS_NOMBRE = "NombreLista";
    public static String K_LISTAS_FECHA = "FechaCreacion";
    public static String K_LISTAS_POSICION = "Posicion";

    public static String TB_ACTIVIDAD = "Actividades";
    public static String K_ACTIVIDAD_ID = "ActividadId";
    public static String K_ACTIVIDAD_ACTIVIDAD = "Actividad";
    public static String K_ACTIVIDAD_POSICION = "Posicion";
    public static String K_ACTIVIDAD_ESTATUS = "Estatus";

    public ConexionBaseDatos(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TB_LISTAS + "(" +
                K_LISTAS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                K_LISTAS_NOMBRE + " TEXT, " +
                K_LISTAS_FECHA + " TEXT, " +
                K_LISTAS_POSICION + " INTEGER DEFAULT 0)");
        db.execSQL("CREATE TABLE " + TB_ACTIVIDAD + "(" +
                K_ACTIVIDAD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                K_LISTAS_ID + " INTEGER, " +
                K_ACTIVIDAD_ACTIVIDAD + " TEXT, " +
                K_ACTIVIDAD_POSICION + " INTEGER, " +
                K_ACTIVIDAD_ESTATUS + " INTEGER, " +
                "FOREIGN KEY (" + K_LISTAS_ID + ") REFERENCES " +
                TB_LISTAS + " (" + K_LISTAS_ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TB_LISTAS);
        db.execSQL("DROP TABLE IF EXISTS " + TB_ACTIVIDAD);
    }
}
