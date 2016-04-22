
package com.walchand.witchar16;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.walchand.witchar16.R;

import Fragements.Accomodation;
import Fragements.Developers;
import Fragements.Events;
import Fragements.Initiative;
import Fragements.Online_Quiz;
import Fragements.Out_of_box;
import Fragements.Schedule;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    int backpressed = 0;
    Handler hand = new Handler();
    FragmentManager fm = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fm.beginTransaction().replace(R.id.Frame_layout, new Events()).commit();
    }

    @Override
    public void onBackPressed() {
        if (backpressed == 0) {
            fm.beginTransaction().replace(R.id.Frame_layout, new Events()).commit();
            backpressed = 1;
        }
        else if (backpressed == 1) {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        backpressed=0;
        final FragmentManager fm = getFragmentManager();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        int id = item.getItemId();

        if (id == R.id.nav_events) {
            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after 100ms
                    fm.beginTransaction().replace(R.id.Frame_layout, new Events()).commit();
                }
            }, 600);


        } else if (id == R.id.nav_outofbox) {
            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after 100ms
                    fm.beginTransaction().replace(R.id.Frame_layout, new Out_of_box()).commit();
                }
            }, 600);


        } else if (id == R.id.nav_Initiative) {
            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after 100ms
                    fm.beginTransaction().replace(R.id.Frame_layout, new Initiative()).commit();
                }
            }, 300);


        } else if (id == R.id.nav_Online_quiz) {
            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after 100ms
                    fm.beginTransaction().replace(R.id.Frame_layout, new Online_Quiz()).commit();
                }
            }, 300);


        } else if (id == R.id.nav_schedule) {
            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after 100ms
                    fm.beginTransaction().replace(R.id.Frame_layout, new Schedule()).commit();
                }
            }, 300);


        } else if (id == R.id.nav_accom) {
            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after 100ms
                    fm.beginTransaction().replace(R.id.Frame_layout, new Accomodation()).commit();
                }
            }, 300);


        } else if (id == R.id.nav_feedback) {
            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                    sendIntent.setType("plain/text");
                    sendIntent.setData(Uri.parse("witchar2k16developers@gmail.com"));
                    sendIntent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
                    //   sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"test@gmail.com"});
                    sendIntent.putExtra(Intent.EXTRA_SUBJECT, "App Feedback");
                    //  sendIntent.putExtra(Intent.EXTRA_TEXT, "hello. this is a message sent from my demo app :-)");
                    startActivity(sendIntent);

                }
            }, 300);


        } else if (id == R.id.nav_developers) {

            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after 100ms
                    fm.beginTransaction().replace(R.id.Frame_layout, new Developers()).commit();
                }
            }, 300);


        }

        return true;
    }
}
