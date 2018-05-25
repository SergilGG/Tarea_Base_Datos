package mx.unam.sergioguerrero.tareabasededatos.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecycleView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mx.unam.sergioguerrero.tareabasededatos.BaseDatos.GestorAlbums;
import mx.unam.sergioguerrero.tareabasededatos.R;
import mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic.Adaptador;
import mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic.Album;

/**
 * Created by sergioguerrero on 25/05/18.
 */

public class Fragment2 {
    public class Fragment2 extends Fragment {

        ArrayList<Album> albums;
        private RecyclerView listaAlbums;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            View v=inflater.inflate(R.layout.fragment_fragment2,container, false);


            listaAlbums= v.findViewById(R.id.rcListaContactos);

            LinearLayoutManager llm = new LinearLayoutManager(getActivity());
            llm.setOrientation(LinearLayoutManager.VERTICAL);
            listaAlbums.setLayoutManager(llm);

            IniciarlizarListaContactos();
            IniciarAdaptador();

            return v;

        }

        private void IniciarAdaptador()
        {
            Adaptador miAdaptador = new Adaptador (albums);
            listaAlbums.setAdapter(miAdaptador);


        }

        private void IniciarlizarListaContactos() {

            GestorAlbums gestorAlbums = new GestorAlbums(this.getActivity());
            albums = gestorAlbums.AsignarAlbum();


        }


    }
