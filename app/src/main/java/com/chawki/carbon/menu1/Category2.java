package com.chawki.carbon.menu1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.chawki.carbon.R;
import com.chawki.carbon.model.Product;
import com.chawki.carbon.product.Product2Activity;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV-PC on 03/09/2017.
 */

public class Category2 extends Fragment {

    private Category1.RecyclerAdapter2 adapter2;
    private RecyclerAdapter1 adapter1;

    public Category2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category1, container, false);
        RecyclerView rv1 = (RecyclerView) rootView.findViewById(R.id.rv1);
        List<Product> clients1 = new ArrayList<>();
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        adapter1 = new RecyclerAdapter1(getActivity(), clients1);
        rv1.setAdapter(adapter1);
        rv1.setHasFixedSize(true);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv1.setLayoutManager(layoutManager);


        RecyclerView rv2 = (RecyclerView) rootView.findViewById(R.id.rv2);
        List<Product> clients2 = new ArrayList<>();
        clients2.add(new Product());
        clients2.add(new Product());
        clients2.add(new Product());
        clients2.add(new Product());
        clients2.add(new Product());
        clients2.add(new Product());
        adapter2 = new Category1.RecyclerAdapter2(getActivity(), clients2);
        rv2.setAdapter(adapter2);
        rv2.setHasFixedSize(true);
        rv2.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        return rootView;
    }


    public static class RecyclerViewHolder1 extends RecyclerView.ViewHolder {
        ImageView basket, love, dots;
        CardView cardView;

        public RecyclerViewHolder1(View itemView) {
            super(itemView);
            basket = (ImageView) itemView.findViewById(R.id.basket);
            dots = (ImageView) itemView.findViewById(R.id.dots);
            love = (ImageView) itemView.findViewById(R.id.love);
            cardView = (CardView) itemView.findViewById(R.id.cardy);

        }

    }

    public static class RecyclerAdapter1 extends RecyclerView.Adapter<RecyclerViewHolder1> {
        public List<Product> source;
        Context context;
        LayoutInflater inflater;

        public RecyclerAdapter1(Context context, List<Product> source1) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            source = source1;
        }

        @Override
        public RecyclerViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.inflate(R.layout.product3, parent, false);
            RecyclerViewHolder1 viewHolder = new RecyclerViewHolder1(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final RecyclerViewHolder1 holder, final int position) {
            final Product doc = source.get(position);
            holder.dots.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_dots_vertical).color(context.getResources().getColor(R.color.primary)));
            holder.basket.setImageDrawable(new IconicsDrawable(context, GoogleMaterial.Icon.gmd_shopping_basket).color(context.getResources().getColor(R.color.primary)));
            holder.love.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_heart).color(context.getResources().getColor(R.color.primary)));
            holder.basket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.basket.setImageDrawable(new IconicsDrawable(context, GoogleMaterial.Icon.gmd_shopping_basket).color(context.getResources().getColor(R.color.accent)));

                }
            });
            holder.love.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.love.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_heart).color(context.getResources().getColor(R.color.accent)));

                }
            });
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, Product2Activity.class));
                }
            });
        }

        @Override
        public int getItemCount() {
            return source.size();
        }


    }


}
