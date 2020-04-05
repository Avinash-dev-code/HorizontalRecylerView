package com.example.horizontalrecylerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;
public class ListAdpater extends RecyclerView.Adapter<ListAdpater.ProgrammingViewHolder> {
    private  String[] data;

    public ListAdpater(String[] data)
    {
        this.data=data;

    }

    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.fragment_list_fragments,parent,false);

        return new ProgrammingViewHolder(view);


    }


    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title=data[position];



        holder.txtTitle.setText(title );







    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class  ProgrammingViewHolder extends RecyclerView.ViewHolder{

        TextView  txtTitle;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);

            txtTitle = (TextView) itemView.findViewById(R.id.textView);
            txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getAdapterPosition()){
                        case 0:
                        Intent in=new Intent(v.getContext(),Main2Activity.class);
                        in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NO_ANIMATION);


                        v.getContext().startActivity(in);
                        break;
                        case 1:


                            break;
                    }


                }

            });
        }
    }
}