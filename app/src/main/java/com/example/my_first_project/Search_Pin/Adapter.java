package com.example.my_first_project.Search_Pin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_first_project.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<Model> modelArrayList;

    public Adapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.id.setText(modelArrayList.get(position).getCenter_id());
        holder.name.setText(modelArrayList.get(position).getName());
        holder.address.setText(modelArrayList.get(position).getAddress());
        holder.state.setText(modelArrayList.get(position).getState_name());
        holder.district.setText(modelArrayList.get(position).getDistrict_name());
        holder.pincode.setText(modelArrayList.get(position).getPincode());
        holder.availity.setText(modelArrayList.get(position).getAvailable_capacity());
        holder.vaciine.setText(modelArrayList.get(position).getVaccine());
        holder.type.setText(modelArrayList.get(position).getFee_type());
        holder.date.setText(modelArrayList.get(position).getDate());



    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView id, name, address,state, district, pincode,availity, vaciine, type, date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.centre_id);
            name= itemView.findViewById(R.id.centre_name_id);
            address = itemView.findViewById(R.id.address_id);
            state = itemView.findViewById(R.id.state_id);
            district = itemView.findViewById(R.id.district_id);
            pincode = itemView.findViewById(R.id.pincode_id);
            availity = itemView.findViewById(R.id.current_vaccine_id);
            vaciine = itemView.findViewById(R.id.type_vaccine_id);
            type = itemView.findViewById(R.id.type_id);
            date = itemView.findViewById(R.id.date_id);

        }
    }
}
