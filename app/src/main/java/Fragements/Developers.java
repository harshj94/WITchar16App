package Fragements;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.walchand.witchar16.R;


public class Developers extends Fragment implements View.OnClickListener {

    View rootview;
    ImageView im1, im2, im3, im4, im5, im6, im7, im8, im9, im10, im11, im12, im13, im14, im15, im16, im17, im18;

    View rootViewDev=null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        rootViewDev = inflater.inflate(R.layout.developers, container, false);
        getActivity().setTitle("Developers");

        return rootViewDev;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        im1 = (ImageView) getView().findViewById(R.id.imageView_1116);
        im2 = (ImageView) getView().findViewById(R.id.imageView21116);
        im3 = (ImageView) getView().findViewById(R.id.imageView31116);
        im4 = (ImageView) getView().findViewById(R.id.imageView11116);
        im5 = (ImageView) getView().findViewById(R.id.imageView211116);
        im6 = (ImageView) getView().findViewById(R.id.imageView311116);
        im7 = (ImageView) getView().findViewById(R.id.imageView121116);
        im8 = (ImageView) getView().findViewById(R.id.imageView221116);
        im9 = (ImageView) getView().findViewById(R.id.imageView321116);
        im10 = (ImageView) getView().findViewById(R.id.imageView131116);
        im11 = (ImageView) getView().findViewById(R.id.imageView231116);
        im12 = (ImageView) getView().findViewById(R.id.imageView331116);
        im13 = (ImageView) getView().findViewById(R.id.imageView141116);
        im14 = (ImageView) getView().findViewById(R.id.imageView241116);
        im15 = (ImageView) getView().findViewById(R.id.imageView341116);
        im16 = (ImageView) getView().findViewById(R.id.imageView151116);
        im17 = (ImageView) getView().findViewById(R.id.imageView251116);
        im18 = (ImageView) getView().findViewById(R.id.imageView351116);
        im1.setOnClickListener(this);
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
        im4.setOnClickListener(this);
        im5.setOnClickListener(this);
        im6.setOnClickListener(this);
        im7.setOnClickListener(this);
        im8.setOnClickListener(this);
        im9.setOnClickListener(this);
        im10.setOnClickListener(this);
        im11.setOnClickListener(this);
        im12.setOnClickListener(this);
        im13.setOnClickListener(this);
        im14.setOnClickListener(this);
        im15.setOnClickListener(this);
        im16.setOnClickListener(this);
        im17.setOnClickListener(this);
        im18.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView_1116:
//abhi linked in
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/abhijeet-kothari-665911a1"));
                startActivity(i);

                break;


            case R.id.imageView21116:
                Intent i2 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+AbhijeetKothari02"));
                startActivity(i2);

                break;


            case R.id.imageView31116:
                Intent i3 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/abhijeet.kothari.313?ref=bookmarks"));
                startActivity(i3);

                break;

            case R.id.imageView11116:
                Intent i1 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rishabh-jain-598486a0?trk=nav_responsive_tab_profile"));
                startActivity(i1);

                break;


            case R.id.imageView211116:
                Intent i21 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/0/110773487327787900335/posts"));
                startActivity(i21);
                break;


            case R.id.imageView311116:
                Intent i31 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rishabh.jain.98478"));
                startActivity(i31);
                break;
            case R.id.imageView121116:
//praj linked in
                Intent i12 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/prajyot-gulhane-76b1859b"));
                startActivity(i12);

                break;


            case R.id.imageView221116:
                Intent i22 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+PrajyotGulhane"));
                startActivity(i22);
                break;


            case R.id.imageView321116:
                Intent i32 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/prajyot.gulhane?fref=ts"));
                startActivity(i32);
                break;
            case R.id.imageView131116:
//ruch linked in
                Intent i13 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/ruchika-patil-3ba422104"));
                startActivity(i13);

                break;


            case R.id.imageView231116:
                Intent i23 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/112138445393012510145"));
                startActivity(i23);
                break;


            case R.id.imageView331116:
                Intent i33 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/patil.ruchii?fref=ts"));
                startActivity(i33);
                break;
            case R.id.imageView141116:

                Intent i14 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/harshj94"));
                startActivity(i14);

                break;


            case R.id.imageView241116:
                Intent i24 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/0/+HarshJain94"));
                startActivity(i24);
                break;


            case R.id.imageView341116:
                Intent i34 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/harshj94"));
                startActivity(i34);
                break;
            case R.id.imageView151116:

                Intent i15 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/prakhar-sharma-180a07116"));
                startActivity(i15);

                break;


            case R.id.imageView251116:
                Intent i25 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/111464057176865708735"));
                startActivity(i25);
                break;


            case R.id.imageView351116:
                Intent i35 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/profile.php?id=100002203643892"));
                startActivity(i35);
                break;

        }
    }

}
