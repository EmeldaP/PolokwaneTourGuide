package com.example.codetribe.polokwanetourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by codetribe on 2017/08/16.
 */

public class PlaceDetails extends RecyclerView.Adapter<PlaceDetails.ViewHolder> {

    Context context ;
    List<Places> placesList;

    public PlaceDetails(Context context,List<Places>placesList){
        this.context = context;
        this.placesList = placesList;
    }

    @Override
    public PlaceDetails.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.place_list,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PlaceDetails.ViewHolder holder, final int position) {


        final Places places = placesList.get(position);
        holder.Name.setText(places.getName());
        holder.Telephone.setText(places.getPhone_number());
        holder.Address.setText(places.getAddress());
        holder.image.setImageResource(places.getIcon());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position==0)
                {
                    Intent intent=new Intent(context, Bakone.class);
                    context.startActivity(intent);
                }
                else if (position==1){
                    Intent intent1 = new Intent(context,Cricket.class);
                    context.startActivity(intent1);
                }
                else if(position ==2){
                    Intent intent2 = new Intent(context,ImageWild.class);
                    context.startActivity(intent2);
                }
                else if(position==3){
                    Intent intent3 = new Intent(context,LionTour.class);
                    context.startActivity(intent3);
                }
                else if (position==4){
                    Intent intent4 = new Intent(context,Mall.class);
                    context.startActivity(intent4);
                    }
                else if (position==5){
                   Intent intent5 = new Intent( context,Meropa.class);
                    context.startActivity(intent5);
                }
                else if (position==6){
                    Intent intent6 = new Intent(context,OldPlace.class);
                    context.startActivity(intent6);
                }
                else  if (position==7){
                    Intent intent7 = new Intent(context,Park.class);
                    context.startActivity(intent7);
                }
                else if (position==8){
                    Intent intent8 = new Intent(context,Peter.class);
                    context.startActivity(intent8);
                }
                else if (position==9){
                    Intent intent9 = new Intent(context,Sculpture.class);
                    context.startActivity(intent9);
                }

                else if (position==10){
                    Intent intent91 = new Intent(context,Musician.class);
                    context.startActivity(intent91);
                }
                else if (position==12){
                    Intent intent12 =new Intent(context,Resorts.class);
                    context.startActivity(intent12);
                }
                else if (position==11){
                    Intent intent01 = new Intent(context,TownLodge.class);
                    context.startActivity(intent01);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Telephone,Name,Address;
        CardView cv;
        ImageView image;
        RecyclerView recycle;

        public ViewHolder(View itemView) {
            super(itemView);

            //cast textviews into items view by id
            Name =(TextView)itemView.findViewById(R.id.txtName);
            Telephone=(TextView)itemView.findViewById(R.id.txtTel);
            Address =(TextView)itemView.findViewById(R.id.txtAddress);
            cv =(CardView)itemView.findViewById(R.id.cardList);
            image =(ImageView)itemView.findViewById(R.id.imageIcon);
            recycle =(RecyclerView)itemView.findViewById(R.id.recycle_view);


        }
    }
}
