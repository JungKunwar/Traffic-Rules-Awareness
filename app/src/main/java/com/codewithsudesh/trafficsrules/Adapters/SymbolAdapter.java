package com.codewithsudesh.trafficsrules.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codewithsudesh.trafficsrules.Models.SymbolModel;
import com.codewithsudesh.trafficsrules.R;

import java.util.ArrayList;

// implementing methods
public class SymbolAdapter extends RecyclerView.Adapter<SymbolAdapter.viewHolder>{

    // declaring variables and creating constructor
    ArrayList<SymbolModel> list;
    Context context;

    public SymbolAdapter(ArrayList<SymbolModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_tsymbols, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        SymbolModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // First Create viewHolder class
    public class viewHolder extends RecyclerView.ViewHolder {

        //2nd
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            //2nd
            imageView = itemView.findViewById(R.id.rv_img);
            textView = itemView.findViewById(R.id.rv_txt);
        }
    }


}
