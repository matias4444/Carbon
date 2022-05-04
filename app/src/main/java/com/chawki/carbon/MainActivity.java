package com.chawki.carbon;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.amulyakhare.textdrawable.TextDrawable;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class MainActivity extends AppCompatActivity {

    private Drawer drawer;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("MyStore");
        final IProfile p;
        Drawable drawable = TextDrawable.builder()
                .buildRound("MM", getResources().getColor(R.color.lightgrey));
        p = new ProfileDrawerItem().withName("Material Mockups").withEmail("username@materialmockups.com").withIcon(drawable);
        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withAccountHeader(R.layout.material_drawer_header)
                .withHeaderBackground(R.color.primary)
                .addProfiles(p).build();
        drawer = new DrawerBuilder().withActivity(this).withToolbar(toolbar).withTranslucentStatusBar(true).withAccountHeader(headerResult).build();

        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu Item").withIcon(CommunityMaterial.Icon.cmd_checkbox_blank_circle).withIconColor(getResources().getColor(R.color.primary));
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Menu Item").withIcon(CommunityMaterial.Icon.cmd_checkbox_blank_circle).withIconColor(getResources().getColor(R.color.primary));
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(3).withName("Menu Item").withIcon(CommunityMaterial.Icon.cmd_checkbox_blank_circle).withIconColor(getResources().getColor(R.color.primary));

        SecondaryDrawerItem item7 = new SecondaryDrawerItem().withIdentifier(7).withName("Menu Item").withIcon(CommunityMaterial.Icon.cmd_checkbox_blank_circle).withIconColor(getResources().getColor(R.color.primary));
        SecondaryDrawerItem item8 = new SecondaryDrawerItem().withIdentifier(8).withName("Menu Item").withIcon(CommunityMaterial.Icon.cmd_checkbox_blank_circle).withIconColor(getResources().getColor(R.color.primary));

        drawer.addItems(item1, item2, item3, new SectionDrawerItem().withName("Subheader"), item7, item8);
        drawer.setOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener()

                                            {
                                                @Override
                                                public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                                                    switch ((int) drawerItem.getIdentifier()) {

                                                        case 1:
                                                            // Create an adapter that knows which fragment should be shown on each page
                                                            SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getBaseContext(), getSupportFragmentManager());

                                                            // Set the adapter onto the view pager
                                                            viewPager.setAdapter(adapter);

                                                            // Give the TabLayout the ViewPager

                                                            tabLayout.setupWithViewPager(viewPager);
                                                            break;
                                                        case 2:
                                                            startActivity(new Intent(getBaseContext(), Menu2Activity.class));
                                                            break;
                                                        case 3:
                                                            startActivity(new Intent(getBaseContext(), Menu3Activity.class));
                                                            break;
                                                    }
                                                    return false;
                                                }
                                            }

        );

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
