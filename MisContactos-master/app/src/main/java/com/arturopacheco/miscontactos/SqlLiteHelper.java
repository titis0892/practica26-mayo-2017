package com.arturopacheco.miscontactos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arturopacheco on 25/05/17.
 */

public class SqlLiteHelper extends SQLiteOpenHelper{ //conexion de base de datos clase "SQLite"


    private static final String TABLE_NAME= "contact"; //Dijitaar variables tabla y el id
    private static final String KEY_ROWID = "id";

    private static final String DATABASE_NAME = "contacts.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

    private static final String DATABASE_CREATE = "create table "+TABLE_NAME+" ( "+KEY_ROWID+" integer primary key autoincrement," +
            "nombre text not null, telefono text not null , email text);";//Crear base datos su respectivo nobre y crear la tabla con los atributos

    public SqlLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
        db.execSQL("insert into " + TABLE_NAME + "("
                +   "nombre,telefono,email) values('Juan Perez','5534334455','juan@perez.com')"); // agregar los campos

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Realiza la conexión
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
