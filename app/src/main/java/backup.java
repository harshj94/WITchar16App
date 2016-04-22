/**
 * Created by Abhijeet on 09-Mar-16.
 */
public class backup {

    ///////////////////////////////////////////////////////////////////////////////////////////////////

   /* package com.walchand.witchar16.grid_view;

    import android.app.FragmentManager;
    import android.content.Intent;
    import android.net.Uri;
    import android.os.Bundle;
    import android.support.v4.app.Fragment;
    import android.support.v4.app.FragmentActivity;
    import android.view.View;
    import android.support.design.widget.NavigationView;
    import android.support.v4.view.GravityCompat;
    import android.support.v4.widget.DrawerLayout;
    import android.support.v7.app.ActionBarDrawerToggle;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.Toolbar;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.widget.AdapterView;
    import android.widget.GridView;


    import com.all.Testing;
    import com.coding_sub_B;

    import com.remaining_branches;

    import fragements.Initiative;

    public class MainActivity extends AppCompatActivity
            implements NavigationView.OnNavigationItemSelectedListener,AdapterView.OnItemClickListener{

        public static int position;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            GridView gridView = (GridView)findViewById(R.id.gridview);
            gridView.setAdapter(new My_adapter(this));
            gridView.setOnItemClickListener(this);

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

        }

        @Override
        public void onBackPressed() {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.

            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();

            return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            // Handle navigation view item clicks here.
            FragmentManager fm=getFragmentManager();
            int id = item.getItemId();

            if (id == R.id.nav_camera) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setType("plain/text");
                sendIntent.setData(Uri.parse("test@gmail.com"));
                sendIntent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
                sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "witchar-2k16feedback@gmai.com" });
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback for App");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Type Here");
                startActivity(sendIntent);

            } else if (id == R.id.nav_gallery) {

                fm.beginTransaction().replace(R.id.Frame_layout, new Initiative()).commit();

            } else if (id == R.id.nav_slideshow) {

            } else if (id == R.id.nav_manage) {

            } else if (id == R.id.nav_share) {

            } else if (id == R.id.nav_send) {


            }


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }





        @Override
        public void onItemClick(AdapterView<?> parent, View view,int  pos, long id) {


            if(pos==3)
            {
                position = pos;
                Intent i = new Intent(MainActivity.this, coding_sub_B.class);
                startActivity(i);

            }
            else if(pos==11||pos==12||pos==15)
            {
                position = pos;
                Intent i = new Intent(MainActivity.this, remaining_branches.class);
                startActivity(i);

            }

            else {
                position = pos;
                Intent i = new Intent(MainActivity.this, Testing.class);
                startActivity(i);

            }
        }
    }

*/

    /////////////////////////////////////////////////////////////////////////////////////////////////
}
