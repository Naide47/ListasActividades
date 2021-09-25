package edu.idgs1002.macrobios.aplicacionlistas.controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import edu.idgs1002.macrobios.aplicacionlistas.model.ConexionBaseDatos;

public class ActividadController extends ConexionBaseDatos {

    private final Context context;
    private ConexionBaseDatos conexion;
    private SQLiteDatabase database;
    private ContentValues values;

    public ActividadController(Context context) {
        super(context);
        this.context = context;
    }
}
