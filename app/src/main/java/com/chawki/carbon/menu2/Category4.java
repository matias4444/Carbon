package com.chawki.carbon.menu2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.chawki.carbon.R;
import com.chawki.carbon.model.Product;
import com.chawki.carbon.product.Product2Activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by DEV-PC on 03/09/2017.
 */

public class Category4 extends Fragment {
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category3, container, false);

        RecyclerView rv1 = (RecyclerView) rootView.findViewById(R.id.rv1);
        rv1.setHasFixedSize(true);
        rv1.setPadding(10,10,10,10);
        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        rv1.setLayoutManager(gaggeredGridLayoutManager);

        List<Product> gaggeredList = getListItemData();

        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(getActivity(), gaggeredList);
        rv1.setAdapter(rcAdapter);
        return rootView;
    }

    private List<Product> getListItemData() {
        List<Product> listViewItems = new ArrayList<Product>();
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));
        listViewItems.add(new Product(R.drawable.rsz_1image1));


        return listViewItems;
    }

    public class SolventRecyclerViewAdapter extends RecyclerView.Adapter<SolventViewHolders> {

        private List<Product> itemList;
        private Context context;

        public SolventRecyclerViewAdapter(Context context, List<Product> itemList) {
            this.itemList = itemList;
            this.context = context;
        }

        @Override
        public SolventViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product5, null);
            SolventViewHolders rcv = new SolventViewHolders(layoutView);
            return rcv;
        }

        @Override
        public void onBindViewHolder(SolventViewHolders holder, int position) {
            Product product = itemList.get(position);
            holder. Photo.setImageResource(product.photo);
            Random r = new Random();
            int i1 = r.nextInt(700 - 350) + 350;
            holder. Photo.getLayoutParams().height = i1;
        }

        @Override
        public int getItemCount() {
            return this.itemList.size();
        }
    }

    public class SolventViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView  Photo;

        public SolventViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
             Photo = (ImageView) itemView.findViewById(R.id.photo);
        }

        @Override
        public void onClick(View view) {
             startActivity(new Intent(getActivity(), Product2Activity.class));

        }
    }
}
