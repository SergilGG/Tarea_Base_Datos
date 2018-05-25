package mx.unam.sergioguerrero.tareabasededatos.Fragments;

/**
 * Created by sergioguerrero on 25/05/18.
 */

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.ButtonBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Button;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.widget.EditText;


import java.util.ArrayList;

import mx.unam.sergioguerrero.tareabasededatos.BaseDatos.ConstantesBD;
import mx.unam.sergioguerrero.tareabasededatos.BaseDatos.GestorAlbums;
import mx.unam.sergioguerrero.tareabasededatos.BaseDatos.MotorBaseDatos;
import mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic.Album;
import mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic.Adaptador;

import mx.unam.sergioguerrero.tareabasededatos.R;

public class Fragment01 extends Fragment {

    Button btnagregar;
    EditText Album,Artista;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragment1,container, false);

        btnagregar = (Button) v.findViewById(R.id.btningresar);
        Album=(EditText) v.findViewById(R.id.album);
        Artista=(EditText) v.findViewById(R.id.artista);
        btnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotorBaseDatos datab=new MotorBaseDatos(context);
                SQLiteDatabase db =datab.getWritableDatabase();

                ContentValues contentValues=new ContentValues();
                contentValues.put(ConstantesBD.TABLE_ALBUMS_NOMBRE_ALBUM, Album.getText().toString());
                contentValues.put(ConstantesBD.TABLE_ALBUMS_ARTISTA,Artista.getText().toString());

            }
        });

        return v;

    }



}
