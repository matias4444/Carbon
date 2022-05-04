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
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chawki.carbon.R;
import com.chawki.carbon.model.Product;
import com.chawki.carbon.product.ProductActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by DEV-PC on 04/09/2017.
 */

public class Category8 extends Fragment {
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
            View v = inflater.inflate(R.layout.product9, parent, false);
            RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
            final Product doc = source.get(position);
            Random r = new Random();
            int i1 = r.nextInt(50 - 10) + 10;
            holder.products.setText(i1 + " Products");
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, ProductActivity.class));
                }
            });
        }

        @Override
        public int getItemCount() {
            return source.size();
        }
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView products;
        ImageView imageView;
        RelativeLayout cardView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            products = (TextView) itemView.findViewById(R.id.products);
            imageView = (ImageView) itemView.findViewById(R.id.dots);
            cardView = (RelativeLayout) itemView.findViewById(R.id.cardy);


        }

    }
}
