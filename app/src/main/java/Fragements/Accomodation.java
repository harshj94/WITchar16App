package Fragements;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.walchand.witchar16.R;

/**
 * Created by Abhijeet on 09-Mar-16.
 */
public class Accomodation extends Fragment implements View.OnClickListener {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_accommodation, container, false);
        getActivity().setTitle("Accomodation");

        ImageView  im1= (ImageView)rootView.findViewById(R.id.imageView11);
        ImageView  im2= (ImageView)rootView.findViewById(R.id.imageView12);

        ImageView  im3= (ImageView)rootView.findViewById(R.id.imageView13);
        ImageView  im4= (ImageView)rootView.findViewById(R.id.imageView14);

        im1.setOnClickListener(this);
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
        im4.setOnClickListener(this);


        return rootView;


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.imageView11:


                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+918956980649" ));
                v.getContext().startActivity(i);

                break;

            case R.id.imageView12:



                Intent ii = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+917588980385" ));
                v.getContext().startActivity(ii);


                break;



            case R.id.imageView13:



                Intent iii = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919689223868" ));
                v.getContext().startActivity(iii);


                break;



            case R.id.imageView14:



                Intent i2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919970387550" ));
                v.getContext().startActivity(i2);


                break;

        }


    }
}
