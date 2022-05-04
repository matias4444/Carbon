package com.chawki.carbon.menu3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chawki.carbon.R;
import com.chawki.carbon.menu1.Category1;
import com.chawki.carbon.model.Product;
import com.chawki.carbon.product.Product2Activity;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.iconics.IconicsDrawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV-PC on 04/09/2017.
 */

public class Category7 extends Fragment {
    RecyclerAdapter2 adapter2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category7, container, false);
        RecyclerView rv2 = (RecyclerView) rootView.findViewById(R.id.rv2);
        RecyclerView rv1 = (RecyclerView) rootView.findViewById(R.id.rv1);
        List<Product> clients2 = new ArrayList<>();
        clients2.add(new Product());
        clients2.add(new Product());
        clients2.add(new Product());
        clients2.add(new Product());
        clients2.add(new Product());
        clients2.add(new Product());
        adapter2 = new RecyclerAdapter2(getActivity(), clients2);
        rv1.setAdapter(adapter2);
        rv1.setHasFixedSize(true);
        rv1.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        rv2.setAdapter(adapter2);
        rv2.setHasFixedSize(true);
        rv2.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        return rootView;
    }

    public static class RecyclerAdapter2 extends RecyclerView.Adapter<Category1.RecyclerViewHolder2> {
        public List<Product> source;
        Context context;
        LayoutInflater inflater;


        public RecyclerAdapter2(Context context, List<Product> source1) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            source = source1;
        }


        @Override
        public Category1.RecyclerViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.inflate(R.layout.product8, parent, false);
            Category1.RecyclerViewHolder2 viewHolder = new Category1.RecyclerViewHolder2(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final Category1.RecyclerViewHolder2 holder, final int position) {
            final Product doc = source.get(position);
            holder.imageView.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_dots_vertical).color(context.getResources().getColor(R.color.white)));
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
