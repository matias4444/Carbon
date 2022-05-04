package com.chawki.carbon.product;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.chawki.carbon.BasketActivity;
import com.chawki.carbon.R;
import com.chawki.carbon.model.Product;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;

import java.util.ArrayList;
import java.util.List;

import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getResources().getString(R.string.product));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        toolbar.setBackgroundColor(getResources().getColor(R.color.lightgrey));

        BannerSlider bannerSlider = (BannerSlider) findViewById(R.id.banner_slider1);
        List<Banner> banners = new ArrayList<>();
        //add banner using resource drawable
        banners.add(new DrawableBanner(R.drawable.rsz_1image1));
        banners.add(new DrawableBanner(R.drawable.rsz_1image1));
        banners.add(new DrawableBanner(R.drawable.rsz_1image1));
        banners.add(new DrawableBanner(R.drawable.rsz_1image1));
        bannerSlider.setBanners(banners);

        final TextView a = (TextView) findViewById(R.id.a);
        final TextView b = (TextView) findViewById(R.id.b);
        b.setTextColor(getResources().getColor(R.color.white));
        b.setBackground(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.primary)).sizeDp(35));
        final TextView c = (TextView) findViewById(R.id.c);
        final TextView d = (TextView) findViewById(R.id.d);
        final TextView e = (TextView) findViewById(R.id.e);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setTextColor(getResources().getColor(R.color.white));
                a.setBackground(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.primary)).sizeDp(35));
                b.setTextColor(getResources().getColor(R.color.primary));
                b.setBackgroundResource(android.R.color.transparent);
                c.setTextColor(getResources().getColor(R.color.primary));
                c.setBackgroundResource(android.R.color.transparent);
                d.setTextColor(getResources().getColor(R.color.primary));
                d.setBackgroundResource(android.R.color.transparent);
                e.setTextColor(getResources().getColor(R.color.primary));
                e.setBackgroundResource(android.R.color.transparent);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setTextColor(getResources().getColor(R.color.white));
                b.setBackground(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.primary)).sizeDp(35));
                a.setTextColor(getResources().getColor(R.color.primary));
                a.setBackgroundResource(android.R.color.transparent);
                c.setTextColor(getResources().getColor(R.color.primary));
                c.setBackgroundResource(android.R.color.transparent);
                d.setTextColor(getResources().getColor(R.color.primary));
                d.setBackgroundResource(android.R.color.transparent);
                e.setTextColor(getResources().getColor(R.color.primary));
                e.setBackgroundResource(android.R.color.transparent);

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.setTextColor(getResources().getColor(R.color.white));
                c.setBackground(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.primary)).sizeDp(35));
                a.setTextColor(getResources().getColor(R.color.primary));
                a.setBackgroundResource(android.R.color.transparent);
                b.setTextColor(getResources().getColor(R.color.primary));
                b.setBackgroundResource(android.R.color.transparent);
                d.setTextColor(getResources().getColor(R.color.primary));
                d.setBackgroundResource(android.R.color.transparent);
                e.setTextColor(getResources().getColor(R.color.primary));
                e.setBackgroundResource(android.R.color.transparent);

            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.setTextColor(getResources().getColor(R.color.white));
                d.setBackground(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.primary)).sizeDp(35));
                a.setTextColor(getResources().getColor(R.color.primary));
                a.setBackgroundResource(android.R.color.transparent);
                b.setTextColor(getResources().getColor(R.color.primary));
                b.setBackgroundResource(android.R.color.transparent);
                c.setTextColor(getResources().getColor(R.color.primary));
                c.setBackgroundResource(android.R.color.transparent);
                e.setTextColor(getResources().getColor(R.color.primary));
                e.setBackgroundResource(android.R.color.transparent);

            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setTextColor(getResources().getColor(R.color.white));
                e.setBackground(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.primary)).sizeDp(35));
                a.setTextColor(getResources().getColor(R.color.primary));
                a.setBackgroundResource(android.R.color.transparent);
                b.setTextColor(getResources().getColor(R.color.primary));
                b.setBackgroundResource(android.R.color.transparent);
                c.setTextColor(getResources().getColor(R.color.primary));
                c.setBackgroundResource(android.R.color.transparent);
                d.setTextColor(getResources().getColor(R.color.primary));
                d.setBackgroundResource(android.R.color.transparent);

            }
        });
        final ImageView i1 = (ImageView) findViewById(R.id.i1);
        i1.setImageDrawable(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.i1)));
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageDrawable(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_check_circle).color(getResources().getColor(R.color.i1)));

            }
        });
        final ImageView i2 = (ImageView) findViewById(R.id.i2);
        i2.setImageDrawable(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.i2)));
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2.setImageDrawable(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_check_circle).color(getResources().getColor(R.color.i2)));

            }
        });
        final ImageView i3 = (ImageView) findViewById(R.id.i3);
        i3.setImageDrawable(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.i3)));
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.setImageDrawable(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_check_circle).color(getResources().getColor(R.color.i3)));

            }
        });
        final ImageView i4 = (ImageView) findViewById(R.id.i4);
        i4.setImageDrawable(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_checkbox_blank_circle).color(getResources().getColor(R.color.i4)));
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i4.setImageDrawable(new IconicsDrawable(getBaseContext(), CommunityMaterial.Icon.cmd_check_circle).color(getResources().getColor(R.color.i4)));

            }
        });

        RecyclerView rv1 = (RecyclerView) findViewById(R.id.rv1);
        rv1.setHasFixedSize(true);
        List<Product> clients1 = new ArrayList<>();
        clients1.add(new Product());
        clients1.add(new Product());
        clients1.add(new Product());

        RecyclerAdapter adapter1 = new RecyclerAdapter(this, clients1);
        rv1.setAdapter(adapter1);
        rv1.setHasFixedSize(true);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv1.setLayoutManager(layoutManager);
        Button checkout=(Button) findViewById(R.id.checkout);
        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), BasketActivity.class));
            }
        });
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
            View v = inflater.inflate(R.layout.review, parent, false);
            RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
            final Product doc = source.get(position);
//            holder.imageView.setImageDrawable(new IconicsDrawable(context, CommunityMaterial.Icon.cmd_dots_vertical).color(context.getResources().getColor(R.color.primary)));

        }

        @Override
        public int getItemCount() {
            return source.size();
        }
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;


        public RecyclerViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.dots);


        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater4 = getMenuInflater();
        inflater4.inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_card).setIcon(new IconicsDrawable(this, CommunityMaterial.Icon.cmd_basket).color(Color.WHITE).sizeDp(24).respectFontBounds(true)).setVisible(true);
        menu.findItem(R.id.search).setIcon(new IconicsDrawable(this, GoogleMaterial.Icon.gmd_search).color(Color.WHITE).sizeDp(24).respectFontBounds(true)).setVisible(true);


        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_card:
                startActivity(new Intent(this, BasketActivity.class));


                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
