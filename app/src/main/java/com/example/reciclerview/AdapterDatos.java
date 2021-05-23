package com.example.reciclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterDatos
        extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>
        implements View.OnClickListener  {
    Context mCtx;
    ArrayList<Lote> listLotes;
    //escuchador para la implementacion
    private View.OnClickListener listener;

    public AdapterDatos(Context mCtx, ArrayList<Lote> listLotes) {
        this.mCtx=mCtx;
        this.listLotes = listLotes;
    }


    @Override
    public ViewHolderDatos onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from (mCtx);
        View view = inflater.inflate(R.layout.item_list, null);
        //escuchador
        view.setOnClickListener(this);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder( AdapterDatos.ViewHolderDatos holder, int position) {

        Lote lote = listLotes.get(position);

        String nombreFoto=lote.getImgLote();
        String url = "http://194.30.35.183/subasta/img_monedas/120/"+nombreFoto+".png";

        //cargamos la imagen
        Glide.with(mCtx)
                .load(url)
                .error(R.drawable.fruits)
             .into(holder.imgFoto);
        holder.txtrefLote.setText("Lote número: "+lote.getRefLote());
        holder.txtdescripcion.setText(""+lote.getDescripcion());
        holder.txtsalida.setText("Precio de salida: "+lote.getSalida());
    }
    //cuantos registros hay
    @Override
    public int getItemCount() {
        return listLotes.size();
    }

    public void setOnClickListener(View.OnClickListener listener)
    {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if (listener!=null)
        {
            listener.onClick(v);
        }
    }


    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView txtrefLote, txtdescripcion, txtsalida;
        ImageView imgFoto;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            txtrefLote=itemView.findViewById(R.id.txtrefLote);
            txtdescripcion = itemView.findViewById(R.id.txtdescripcion);
            txtsalida=itemView.findViewById(R.id.txtsalida);
            imgFoto = itemView.findViewById(R.id.imgLote);
        }
    }
}
