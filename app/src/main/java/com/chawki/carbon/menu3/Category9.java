package com.chawki.carbon.menu3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.chawki.carbon.R;
import com.chawki.carbon.model.Product;
import com.chawki.carbon.product.Product2Activity;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.iconics.IconicsDrawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV-PC on 04/09/2017.
 */

public class Category9 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
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
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv1.setLayoutManager(layoutManager);
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
            View v = inflater.inflate(R.layout.product10, parent, false);
            RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
            final Product doc = source.get(position);
            holder.dots.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_dots_vertical).color(context.getResources().getColor(R.color.primary)));
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


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView dots;
        LinearLayout cardView;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            dots = (ImageView) itemView.findViewById(R.id.dots);
            cardView = (LinearLayout) itemView.findViewById(R.id.cardy);


        }

    }
}
