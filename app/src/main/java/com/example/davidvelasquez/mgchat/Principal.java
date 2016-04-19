package com.example.davidvelasquez.mgchat;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Principal extends AppCompatActivity {
<<<<<<< HEAD
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    String username;
    String password;
=======
>>>>>>> parent of 0b40406... pre-inicio -session

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
<<<<<<< HEAD

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        if(iniciar_session()==true)
        {
            Toast.makeText(this, "Iniciado Session", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"No inicio session", Toast.LENGTH_LONG).show();
        }
=======
>>>>>>> parent of 0b40406... pre-inicio -session




    }
<<<<<<< HEAD

    public boolean iniciar_session() // iniciar sesion-------------------
    {
        Datos datos = new Datos();
        String [] sdatos = datos.leer(this);
       if(sdatos[0]!="" && sdatos[1]!="") // si no esta vacio
        {
            username= sdatos[0];
            password= sdatos[1];
            return true;
        }
        else {
           return false;
       }

    }



    // funciones para los tab material
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new inicio(), "ONE");

        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
=======
}
>>>>>>> parent of 0b40406... pre-inicio -session
