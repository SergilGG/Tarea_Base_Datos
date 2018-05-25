package mx.unam.sergioguerrero.tareabasededatos;

import android.support.v4.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;
import android.support.v4.view.ViewPager;


import java.util.ArrayList;

import mx.unam.sergioguerrero.tareabasededatos.Fragments.Fragment01;
import mx.unam.sergioguerrero.tareabasededatos.Fragments.Fragment2;
import mx.unam.sergioguerrero.tareabasededatos.Fragments.PageAdapter;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.miTablayout);
        tabLayout=findViewById(R.id.miTablayout);
        viewPager=findViewById(R.id.viewPager);

        setUpViewPager();

        if (toolbar !=null )
        {
            setSupportActionBar(toolbar);
        }



    }
    private ArrayList<Fragment>AgregarFragments()

    {
        ArrayList<Fragment> fragments =new ArrayList<>();
        /*fragments.add(new Fragment01());
        fragments.add(new Fragment2());*/
        return fragments;
    }

    private void setSupportActionBar(Toolbar toolbar)
    {

    }


    private void setUpViewPager() {

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),AgregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
    }
}
