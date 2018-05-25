package mx.unam.sergioguerrero.tareabasededatos.BaseDatos;

/**
 * Created by sergioguerrero on 25/05/18.
 */

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import mx.unam.sergioguerrero.tareabasededatos.R;
import mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic.Album;

public class GestorAlbums {

    private Context context;

    public GestorAlbums(Context context)
    {
        this.context=context;
    }
    public ArrayList<Album> AsignarAlbum()
    {
        MotorBaseDatos db=new MotorBaseDatos(context);
        InsertarDosAlbums(db);

        return db.extraerAlbumsDataBase();
    }

    private void InsertarDosAlbums(MotorBaseDatos db) {
        ContentValues contentValues=new ContentValues();
        contentValues.put(ConstantesBD.TABLE_ALBUMS_NOMBRE_ALBUM," deadpool");
        contentValues.put(ConstantesBD.TABLE_ALBUMS_ARTISTA," MC");
        contentValues.put(ConstantesBD.TABLE_ALBUMS_FOTO, R.drawable.olsen);
        db.InsertarAlbum(contentValues);

        contentValues.put(ConstantesBD.TABLE_ALBUMS_NOMBRE_ALBUM," Superman");
        contentValues.put(ConstantesBD.TABLE_ALBUMS_ARTISTA," MC");
        contentValues.put(ConstantesBD.TABLE_ALBUMS_FOTO, R.drawable.emma);
        db.InsertarAlbum(contentValues);

    }

}