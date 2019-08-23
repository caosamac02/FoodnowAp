package edu.csc.foodnowapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity {

    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home").setIcon(R.drawable.icon_home));
        tabLayout.addTab(tabLayout.newTab().setText("Order").setIcon(R.drawable.ic_order));
        tabLayout.addTab(tabLayout.newTab().setText("Profile").setIcon(R.drawable.icon_profile));

        displayFragment(0);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void displayFragment(int selectedTabPosition) {
        Fragment fragment = null;
        switch (selectedTabPosition){
            case 0 :
                fragment = new HomeFragment();
                break;
            case 1 :
                fragment = new OrderFragment();
                break;
            case 2 :
                fragment = new ProfileFragment();
                break;

        }
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content,fragment);
        fragmentTransaction.commit();
    }






}
