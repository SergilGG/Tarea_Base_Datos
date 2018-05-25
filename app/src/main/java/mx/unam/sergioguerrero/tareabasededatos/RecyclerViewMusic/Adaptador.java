package mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic;

/**
 * Created by sergioguerrero on 25/05/18.
 */

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import java.util.ArrayList;

import mx.unam.sergioguerrero.tareabasededatos.R;

public class Adaptador extends RecycleView.Adapter<Adaptador.AlbumViewHolder> {

    private ArrayList<Album> albums;

    public Adaptador(ArrayList<Album> albums) {
        this.albums = albums;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgAlbum;
        private TextView txtvNombreAlbum;
        private TextView txtvNombreArtista;

        public AlbumViewHolder(View itemView) {
            super(itemView);
            imgAlbum= itemView.findViewById(R.id.imgFoto);
            txtvNombreAlbum=itemView.findViewById(R.id.txtvNombreAlbum);
            txtvNombreArtista=itemView.findViewById(R.id.txtvNombreArtista);


            return;

        }


    }



}

