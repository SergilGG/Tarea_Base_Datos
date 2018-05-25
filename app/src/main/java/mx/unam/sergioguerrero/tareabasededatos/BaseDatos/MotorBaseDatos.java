package mx.unam.sergioguerrero.tareabasededatos.BaseDatos;

import android.content.Context;

/**
 * Created by sergioguerrero on 25/05/18.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic.Album;

public class MotorBaseDatos extends SQLiteOpenHelper{

    private Context context;

    public MotorBaseDatos(Context context ) {
        super(context,ConstantesBD.DATABASE_NAME, null, ConstantesBD.DATABASE_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryCrearTableAlbum="CREATE TABLE " + ConstantesBD.TABLE_ALBUMS_NAME + "(" +
                ConstantesBD.TABLE_ALBUMS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ConstantesBD.TABLE_ALBUMS_NOMBRE_ALBUM + " TEXT, "+
                ConstantesBD.TABLE_ALBUMS_ARTISTA + " TEXT, "+

                ConstantesBD.TABLE_ALBUMS_FOTO + " INTEGER" +
                ")";
        db.execSQL(queryCrearTableAlbum);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL( "DROP TABLE IF " + " EXISTS " + ConstantesBD.TABLE_ALBUMS_NAME);
        onCreate(db);

    }

    public ArrayList<Album> extraerAlbumsDataBase()
    {
        ArrayList <Album> albums=new ArrayList<>();
        String query="SELECT * FROM " + ConstantesBD.TABLE_ALBUMS_NAME;

        SQLiteDatabase db=this.getWritableDatabase();

        Cursor registros=db.rawQuery(query,null);

        while (registros.moveToNext())
        {
            Album albumactual=new Album (registros.getString(1),registros.getString(2),registros.getInt(3));
            albums.add(albumactual);
        }
        db.close();
        return albums;
    }

    public void InsertarAlbum(ContentValues contentValues)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        db.insert(ConstantesBD.TABLE_ALBUMS_NAME,null,contentValues);
        db.close();
    }


}