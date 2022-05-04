package com.chawki.carbon.menu1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.chawki.carbon.R;
import com.chawki.carbon.model.Label;
import com.chawki.carbon.model.Product;
import com.chawki.carbon.product.ProductActivity;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.iconics.IconicsDrawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV-PC on 03/09/2017.
 */

public class Category3 extends Fragment {

    private ChargeAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category3, container, false);
        List<Object> ls = new ArrayList<>();
        ls.add(new Label());
        ls.add(new Product());
        ls.add(new Product());
        ls.add(new Label());
        ls.add(new Product());
        ls.add(new Product());
        ls.add(new Label());
        ls.add(new Product());
        ls.add(new Product());
        adapter = new ChargeAdapter(getActivity(), ls);
        RecyclerView rv1 = (RecyclerView) rootView.findViewById(R.id.rv1);

        rv1.setAdapter(adapter);
        rv1.setPadding(10, 10, 10, 10);
        rv1.setHasFixedSize(true);
        GridLayoutManager llManager = new GridLayoutManager(getActivity(), 1);
        rv1.setLayoutManager(llManager);
        return rootView;
    }

    class ChargeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private static final int LABEL_MODEL = 1;
        private static final int PRODUCT_MODEL = 0;
        Context context;
        LayoutInflater inflater;
        List<Object> data;

        public ChargeAdapter(Context context, List<Object> source1) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            data = source1;
        }

        public class ProductHolder2 extends RecyclerView.ViewHolder {
            CardView cardView;
            ImageView dots;

            public ProductHolder2(View row) {
                super(row);
                dots = (ImageView) itemView.findViewById(R.id.dots);
                cardView = (CardView) itemView.findViewById(R.id.cardy);
            }
        }

        @Override
        public int getItemViewType(int position) {
            if (data.get(position) instanceof Label)
                return LABEL_MODEL;
            else if (data.get(position) instanceof Product)
                return PRODUCT_MODEL;
            return LABEL_MODEL;

        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater li = LayoutInflater.from(context);
            switch (viewType) {
                case LABEL_MODEL:
                    View itemView0 = li.inflate(R.layout.label, parent, false);
                    return new LabelViewHolder(itemView0);

                case PRODUCT_MODEL:
                    View itemView2 = li.inflate(R.layout.product4, parent, false);
                    return new ProductHolder2(itemView2);


                default:
                    break;
            }
            return null;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            switch (getItemViewType(position)) {
                case LABEL_MODEL:

                    break;
                case PRODUCT_MODEL:
                    final ProductHolder2 ViewHolder = (ProductHolder2) holder;
                    ViewHolder.dots.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_dots_vertical).color(context.getResources().getColor(R.color.primary)));
                    ViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            context.startActivity(new Intent(context, ProductActivity.class));
                        }
                    });

                    break;
            }


        }

        @Override
        public int getItemCount() {
            return data.size();
        }


    }

    private class LabelViewHolder extends RecyclerView.ViewHolder {
        public LabelViewHolder(View itemView0) {
            super(itemView0);
        }
    }
}
