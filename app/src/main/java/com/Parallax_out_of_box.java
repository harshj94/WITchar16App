package com;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.walchand.witchar16.R;
import com.flaviofaria.kenburnsview.KenBurnsView;

import java.util.ArrayList;

import Fragements.Out_of_box;

public class Parallax_out_of_box extends AppCompatActivity {

    public static ImageView Fc,Sc;
   int j= Out_of_box.px;




    // Need this to link with the Snackbar
    private CoordinatorLayout mCoordinator;
    //Need this to set the title of the app bar
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    //private FloatingActionButton mFab;
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private ViewPager mPager;
    private YourTestingPagerAdapter mAdapter;
    private TabLayout mTabLayout;


    ImageView parallax_image;
    com.flaviofaria.kenburnsview.KenBurnsView picture;
    int[] pics={R.drawable.googleit,R.drawable.bmw};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newparallax);

        KenBurnsView kenBurnsView = (KenBurnsView) findViewById(R.id.image);
        //set Image Here
        kenBurnsView.setImageResource(pics[j]);

        mCoordinator = (CoordinatorLayout) findViewById(R.id.root_coordinator);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        //     mFab = (FloatingActionButton) findViewById(R.id.fab);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToolbar = (Toolbar) findViewById(R.id.app_bar);
//        setSupportActionBar(mToolbar);


       // mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        //mDrawerLayout.setDrawerListener(mDrawerToggle);
        //mDrawerToggle.syncState();

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mAdapter = new YourTestingPagerAdapter(getSupportFragmentManager());
        mPager = (ViewPager) findViewById(R.id.view_pager);
        mPager.setAdapter(mAdapter);
        //Notice how the Tab Layout links with the Pager Adapter
        mTabLayout.setTabsFromPagerAdapter(mAdapter);

        //Notice how The Tab Layout adn View Pager object are linked
        mTabLayout.setupWithViewPager(mPager);
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        //Notice how the title is set on the Collapsing Toolbar Layout instead of the Toolbar

     int px=Out_of_box.px;

        if(px==0) {
            mCollapsingToolbarLayout.setTitle("Google It");
            mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.white);

        }
        else {
            mCollapsingToolbarLayout.setTitle("Logo Quiz");
            mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.white);
        }

        Fc=(ImageView)findViewById(R.id.imageView);
        Sc=(ImageView)findViewById(R.id.imageView1);
    }

//////////////////////////////////////////////////////////////////////////////////////////////

    public static class MyFragment extends Fragment {
        public static final java.lang.String ARG_PAGE = "arg_page";

        public static  int pageNumber=0;


        public MyFragment() {

        }

        public static MyFragment newInstance(int pageNumber) {
            MyFragment myFragment = new MyFragment();
            Bundle arguments = new Bundle();
            arguments.putInt(ARG_PAGE, pageNumber + 1);
            myFragment.setArguments(arguments);
            return myFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            Bundle arguments = getArguments();
            int pageNumber = arguments.getInt(ARG_PAGE);
            RecyclerView recyclerView = new RecyclerView(getActivity());
            recyclerView.setAdapter(new YourTestingRecyclerAdapter(getActivity()));
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            return recyclerView;
        }
    }




    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public static class MySecondFragment extends Fragment {
        public static final java.lang.String ARG_PAGE = "arg_page";

        public static  int pageNumber=0;


        public MySecondFragment() {

        }

        public static MySecondFragment newInstance(int pageNumber) {
            MySecondFragment mySecFragment = new MySecondFragment();
            Bundle arguments = new Bundle();
            arguments.putInt(ARG_PAGE, pageNumber + 1);
            mySecFragment.setArguments(arguments);
            return mySecFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            Bundle arguments = getArguments();
            int pageNumber = arguments.getInt(ARG_PAGE);
            RecyclerView recyclerView = new RecyclerView(getActivity());
            recyclerView.setAdapter(new YourSecondTestingRecyclerAdapter(getActivity()));
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            return recyclerView;
        }
    }






    // ***************************************************************************************************




    public static class MyThirdFragment extends Fragment {
        public static final java.lang.String ARG_PAGE = "arg_page";

        public static  int pageNumber=0;


        public MyThirdFragment() {

        }

        public static MyThirdFragment newInstance(int pageNumber) {
            MyThirdFragment myThdFragment = new MyThirdFragment();
            Bundle arguments = new Bundle();
            arguments.putInt(ARG_PAGE, pageNumber + 1);
            myThdFragment.setArguments(arguments);
            return myThdFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            Bundle arguments = getArguments();
            int pageNumber = arguments.getInt(ARG_PAGE);
            RecyclerView recyclerView = new RecyclerView(getActivity());
            recyclerView.setAdapter(new YourThirdTestingRecyclerAdapter(getActivity()));
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            return recyclerView;
        }
    }
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}

class YourTestingPagerAdapter extends FragmentStatePagerAdapter {

    public YourTestingPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            Parallax_out_of_box.MyFragment myFragment = Parallax_out_of_box.MyFragment.newInstance(position);
            return myFragment;
        }
        if(position==1) {
            Parallax_out_of_box.MySecondFragment mySecFragment = Parallax_out_of_box.MySecondFragment.newInstance(position);
            return  mySecFragment;
        }
        if(position==2) {
            Parallax_out_of_box.MyThirdFragment myThdFragement = Parallax_out_of_box.MyThirdFragment.newInstance(position);
            return myThdFragement;
        }
        return null;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String TabName="Hi";
        if(position==0)
            TabName="Basic Info";
        if(position==1)
            TabName="Rules";
        if(position==2)
            TabName="Contact Us";

        return TabName;
    }
}



//1.//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class YourTestingRecyclerAdapter extends RecyclerView.Adapter<YourTestingRecyclerAdapter.YourRecyclerViewHolder> {
    private ArrayList<CharSequence> list = new ArrayList<>();
    private LayoutInflater inflater;

    public YourTestingRecyclerAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        Resources rec=context.getResources();
        int j=Out_of_box.px;
        CharSequence[] css = rec.getTextArray(R.array.Out_of_box_basic_info);
        list.add(css[j]);

       /* int j=Events.position;
        int z=coding_sub_B.sub_position;
        int p=remaining_branches.remaining_sub_position;
        int px=Out_of_box.px;*/

    /*    if(j==3)
        {
            CharSequence[] css = rec.getTextArray(R.array.code_base_info);
            list.add(css[z]);
        }
        else if(j==11)
        {
            CharSequence[] css = rec.getTextArray(R.array.paper_base_info);
            list.add(css[p]);
        }
        else if(j==12)
        {
            CharSequence[] css = rec.getTextArray(R.array.project_base_info);
            list.add(css[p]);
        }
        else if(j==15)
        {
            CharSequence[] css = rec.getTextArray(R.array.robotics_base_info);
            list.add(css[p]);
        }

        else {
            CharSequence[] css = rec.getTextArray(R.array.Basic_Info);
            list.add(css[j]);
        } */


    }

    @Override
    public YourRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View root = inflater.inflate(R.layout.custom_row, viewGroup, false);
        YourRecyclerViewHolder holder = new YourRecyclerViewHolder(root);
        return holder;
    }

    @Override
    public void onBindViewHolder(YourRecyclerViewHolder yourRecyclerViewHolder, int i) {

        yourRecyclerViewHolder.textView.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class YourRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public YourRecyclerViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text_superhero);
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////







//2.//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class YourSecondTestingRecyclerAdapter extends RecyclerView.Adapter<YourSecondTestingRecyclerAdapter.YourRecyclerViewHolder> {
    private ArrayList<CharSequence> list = new ArrayList<>();
    private LayoutInflater inflater;

    public YourSecondTestingRecyclerAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        Resources rec=context.getResources();
        int j=Out_of_box.px;
        CharSequence[] css = rec.getTextArray(R.array.Out_of_box_basic_rules);
        list.add(css[j]);
       /* int j=Events.position;
        int z=coding_sub_B.sub_position;
        int p= remaining_branches.remaining_sub_position; */

        //for specific cool code

       /* if(j==3)
        {
            CharSequence[] css = rec.getTextArray(R.array.code_rules);
            list.add(css[z]);
        }
        else if(j==11)
        {
            CharSequence[] css = rec.getTextArray(R.array.paper_rules);
            list.add(css[p]);
        }
        else if(j==12)
        {
            CharSequence[] css = rec.getTextArray(R.array.project_rules);
            list.add(css[p]);
        }
        else if(j==15)
        {
            CharSequence[] css = rec.getTextArray(R.array.robotics_rules);
            list.add(css[p]);
        }

        else
        {
            CharSequence[] css = rec.getTextArray(R.array.Rule);
            list.add(css[j]);
        }

         */
    }

    @Override
    public YourRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View root = inflater.inflate(R.layout.custom_row, viewGroup, false);
        YourRecyclerViewHolder holder = new YourRecyclerViewHolder(root);
        return holder;
    }

    @Override
    public void onBindViewHolder(YourRecyclerViewHolder yourRecyclerViewHolder, int i) {

        yourRecyclerViewHolder.textView.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class YourRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public YourRecyclerViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text_superhero);
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////







//3.//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class YourThirdTestingRecyclerAdapter extends RecyclerView.Adapter<YourThirdTestingRecyclerAdapter.YourRecyclerViewHolder> {
    // private ArrayList<CharSequence> list = new ArrayList<>();

    private LayoutInflater inflater;
    String[] Faculty_Names,code_faculty_Names,paper_faculty_Names,project_faculty_Names,robotics_faculty_Names;
    String[] Student_Names,code_students_Names,paper_students_Names,project_students_Names,robotics_students_Names;
    int j,p;

    String[] out_of_box_names;


    /*int[] Faculty_pics={R.mipmap.trupti_indi,
            R.mipmap.t_meenakshi,
            R.mipmap.pg_chitte,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.thalange_a_v,
            R.mipmap.shelke_rj,
            R.mipmap.karpe,
            R.mipmap.kulkarni_civil,
            R.mipmap.dj_doshi,
            R.mipmap.patnaik,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.paliwal,
            R.mipmap.kulkarni_vs,
            R.mipmap.ic_launcher,
            R.mipmap.cg_konapure,
            R.mipmap.ambarkar,
            R.mipmap.narkar,
            R.mipmap.sb_gosavi};


    int[] Student_pics={R.mipmap.namita_thakur,
            R.mipmap.mayur,
            R.mipmap.sourabh_patil,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.aish_mehta,
            R.mipmap.prashant_kore,
            R.mipmap.nisha,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.akash_kamboj,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.gautami_madas,
            R.mipmap.nikhil,
            R.mipmap.ic_launcher,
            R.mipmap.akash,
            R.mipmap.akshay_kolhapure,
            R.mipmap.prajyot,
            R.mipmap.chetan};
    /////////////////////////////////////////change here//////////////////////////////////////////////////////////////////////////////////////////////////
    int[] code_faculty_pics={R.mipmap.deshpande,
            R.mipmap.gundale,
            R.mipmap.kondekar};
    int[] code_students_pics={R.mipmap.jay
            ,R.mipmap.samruddhi,
            R.mipmap.ashwin};


    int[] paper_faculty_pics={R.mipmap.hiremath,R.mipmap.dixit_maam,R.mipmap.chavan_rn,R.mipmap.naik_sb};
    int[] paper_students_pics={R.mipmap.shrey_shah,R.mipmap.jainil,R.mipmap.sayali_mithari,R.mipmap.shubham_patni};

    int[] project_faculty_pics={R.mipmap.sc_deshmukh,R.mipmap.dixit_maam,R.mipmap.mergu,R.mipmap.ic_launcher,};
    int[] project_students_pics={R.mipmap.pravin_bansode,R.mipmap.jainil,R.mipmap.saharsh,R.mipmap.ic_launcher};




    int[] robotics_faculty_pics={R.mipmap.rd_mistry,R.mipmap.rd_mistry,R.mipmap.rd_mistry,R.mipmap.rd_mistry};
    int[] robotics_students_pics={R.mipmap.swapnil_patil,R.mipmap.swapnil_patil,R.mipmap.swapnil_patil,R.mipmap.swapnil_patil};

*/
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public YourThirdTestingRecyclerAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        Resources rec=context.getResources();
        //Faculty_Names=rec.getStringArray(R.array.Faculty_Name);
        //Student_Names=rec.getStringArray(R.array.Student_Name);

        //code_faculty_Names=rec.getStringArray(R.array.code_faculty);
        //code_students_Names=rec.getStringArray(R.array.code_student);

        //paper_faculty_Names=rec.getStringArray(R.array.paper_faculty);
        //paper_students_Names=rec.getStringArray(R.array.paper_student);

        //project_faculty_Names=rec.getStringArray(R.array.project_faculty);
        //project_students_Names=rec.getStringArray(R.array.project_student);

        //robotics_faculty_Names =rec.getStringArray(R.array.robotics_faculty);
        //robotics_students_Names=rec.getStringArray(R.array.robotics_student);

        out_of_box_names=rec.getStringArray(R.array.Out_of_box_coordinator);

        }

    @Override
    public YourRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View root = inflater.inflate(R.layout.card_set_outofbox, viewGroup, false);
        YourRecyclerViewHolder holder = new YourRecyclerViewHolder(root);
        return holder;
    }

    @Override
    public void onBindViewHolder(YourRecyclerViewHolder yourRecyclerViewHolder, int i) {

        int px=Out_of_box.px;
        int[] image_array={R.mipmap.renuka,R.mipmap.harsh_jain};
        yourRecyclerViewHolder.F_Name.setText(out_of_box_names[px]);

        yourRecyclerViewHolder.F_image.setImageResource(image_array[px]);
        yourRecyclerViewHolder.Fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int px=Out_of_box.px;
                String[] rec = v.getResources().getStringArray(R.array.Out_of_box_coordinator_mobile_no);
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[px]));
                v.getContext().startActivity(i);
            }
        });


       /* if(j==3)
        {
            final int z=coding_sub_B.sub_position;
            yourRecyclerViewHolder.F_Name.setText(code_faculty_Names[z]);
            yourRecyclerViewHolder.S_Name.setText(code_students_Names[z]);
            yourRecyclerViewHolder.F_image.setImageResource(code_faculty_pics[z]);
            yourRecyclerViewHolder.S_image.setImageResource(code_students_pics[z]);
            yourRecyclerViewHolder.Fc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.code_faculty_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[z]));
                    v.getContext().startActivity(i);
                }
            });

            yourRecyclerViewHolder.Sc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.code_student_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[z]));
                    v.getContext().startActivity(i);
                }
            });
        }




        else if(j==11)
        {

            yourRecyclerViewHolder.F_Name.setText(paper_faculty_Names[p]);
            yourRecyclerViewHolder.S_Name.setText(paper_students_Names[p]);
            yourRecyclerViewHolder.F_image.setImageResource(paper_faculty_pics[p]);
            yourRecyclerViewHolder.S_image.setImageResource(paper_students_pics[p]);
            yourRecyclerViewHolder.Fc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.paper_faculty_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[p]));
                    v.getContext().startActivity(i);
                }
            });

            yourRecyclerViewHolder.Sc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.paper_student_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[p]));
                    v.getContext().startActivity(i);
                }
            });
        }





        else if(j==12)
        {
            final int z=coding_sub_B.sub_position;
            yourRecyclerViewHolder.F_Name.setText(project_faculty_Names[p]);
            yourRecyclerViewHolder.S_Name.setText(project_students_Names[p]);
            yourRecyclerViewHolder.F_image.setImageResource(project_faculty_pics[p]);
            yourRecyclerViewHolder.S_image.setImageResource(project_students_pics[p]);
            yourRecyclerViewHolder.Fc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.project_faculty_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[p]));
                    v.getContext().startActivity(i);
                }
            });

            yourRecyclerViewHolder.Sc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.project_student_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[p]));
                    v.getContext().startActivity(i);
                }
            });
        }





        else if(j==15)
        {

            yourRecyclerViewHolder.F_Name.setText(robotics_faculty_Names[p]);
            yourRecyclerViewHolder.S_Name.setText(robotics_students_Names[p]);
            yourRecyclerViewHolder.F_image.setImageResource(robotics_faculty_pics[p]);
            yourRecyclerViewHolder.S_image.setImageResource(robotics_students_pics[p]);
            yourRecyclerViewHolder.Fc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.robotics_faculty_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[p]));
                    v.getContext().startActivity(i);
                }
            });

            yourRecyclerViewHolder.Sc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.robotics_student_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[p]));
                    v.getContext().startActivity(i);
                }
            });
        }


        else {

            yourRecyclerViewHolder.F_Name.setText(Faculty_Names[j]);
            yourRecyclerViewHolder.S_Name.setText(Student_Names[j]);
            yourRecyclerViewHolder.F_image.setImageResource(Faculty_pics[j]);
            yourRecyclerViewHolder.S_image.setImageResource(Student_pics[j]);
            yourRecyclerViewHolder.Fc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.Faculty_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[j]));
                    v.getContext().startActivity(i);
                }
            });

            yourRecyclerViewHolder.Sc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String[] rec = v.getResources().getStringArray(R.array.Student_Mobile);
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+" + rec[j]));
                    v.getContext().startActivity(i);
                }
            });

        }
                        */
        //////////////////////
    }



    @Override
    public int getItemCount() {
        return 1;
    }

    static class YourRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView F_Name,S_Name;
        ImageView F_image,S_image,Fc,Sc;

        public YourRecyclerViewHolder(final View itemView) {
            super(itemView);
            F_Name = (TextView) itemView.findViewById(R.id.Faculty_Name);
            S_Name = (TextView) itemView.findViewById(R.id.student_name);
            F_image=(ImageView)itemView.findViewById(R.id.faculty_pic);
            S_image=(ImageView)itemView.findViewById(R.id.student_pic);
            Fc=(ImageView)itemView.findViewById(R.id.imageView);
            Sc=(ImageView)itemView.findViewById(R.id.imageView1);

          /*  itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (getAdapterPosition()!=RecyclerView.NO_POSITION)
                    {
                        Context c= itemView.getContext();
                        Intent i= new Intent(c,MainActivity.class);
                        c.startActivity(i);
                    }
                }
            });*/




        }


    }
}




