package com.chawki.carbon.menu2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chawki.carbon.R;
import com.chawki.carbon.model.Product;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV-PC on 04/09/2017.
 */

public class Category6 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category3, container, false);

        RecyclerView rv1 = (RecyclerView) rootView.findViewById(R.id.rv1);
        rv1.setHasFixedSize(true);
        List<Product> clients1 = new ArrayList<>();
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());
        RecyclerAdapter adapter1 = new RecyclerAdapter(getActivity(), clients1);
        rv1.setAdapter(adapter1);
        rv1.setHasFixedSize(true);
        rv1.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        return rootView;
    }

    public static class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
        public List<Product> source;
        Context context;
        LayoutInflater inflater;


        public RecyclerAdapter(Context context, List<Product> source1) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            source = source1;
        }


        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.inflate(R.layout.product7, parent, false);
            RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
            final Product doc = source.get(position);
            holder.dots.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_dots_vertical).color(context.getResources().getColor(R.color.white)));

            holder.basket.setImageDrawable(new IconicsDrawable(context, GoogleMaterial.Icon.gmd_shopping_basket).color(context.getResources().getColor(R.color.white)));
            holder.love.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_heart).color(context.getResources().getColor(R.color.white)));
            holder.cardView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    holder.relativeLayout.setVisibility(View.VISIBLE);
                    holder.product.setVisibility(View.GONE);
                    return true;
                }
            });

        }

        @Override
        public int getItemCount() {
            return source.size();
        }
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        RelativeLayout relativeLayout;
        ImageView dots, love, basket;
        TextView product;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardy);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout);
            dots = (ImageView) itemView.findViewById(R.id.dots);
            basket = (ImageView) itemView.findViewById(R.id.basket);
            love = (ImageView) itemView.findViewById(R.id.love);
            product = (TextView) itemView.findViewById(R.id.product);
        }

    }
}
