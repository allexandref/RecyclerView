package br.com.unipe.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter {

    private LinkedList<String> palavras;
    private Context context;

    public Adapter(LinkedList<String> palavras, Context context){
        this.palavras = palavras;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.word_item, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        String palavra = palavras.get(position);
        ViewHolder holder = (ViewHolder)  viewHolder;
        holder.getTextView().setText(palavra);
    }

    /*
    * Retorna a quantidade de itens.
    * */
    @Override
    public int getItemCount() {
        return palavras.size();
    }

    public LinkedList<String> getPalavras() {
        return palavras;
    }

    public void setPalavras(LinkedList<String> palavras) {
        this.palavras = palavras;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
