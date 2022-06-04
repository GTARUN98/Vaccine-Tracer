package com.example.my_first_project.Search_Pin;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_first_project.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView id, name, address, state, district, pincode, availability, vaccine, type, date;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.centre_id);
        name = itemView.findViewById(R.id.centre_name_id);
        address = itemView.findViewById(R.id.address_id);
        state = itemView.findViewById(R.id.state_id);
        district = itemView.findViewById(R.id.district_id);
        pincode = itemView.findViewById(R.id.pincode_id);
        availability = itemView.findViewById(R.id.current_vaccine_id);
        vaccine = itemView.findViewById(R.id.type_vaccine_id);
        type = itemView.findViewById(R.id.type_id);
        date = itemView.findViewById(R.id.date_id);

    }
}
