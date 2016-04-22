package Fragements;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Parallax_out_of_box;
import com.walchand.witchar16.R;


public class Out_of_box extends Fragment implements View.OnClickListener{
    View rootView;
    public static int px;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.out_of_box,container,false);
        getActivity().setTitle("Out of Box Events");
        CardView cvv1=(CardView)rootView.findViewById(R.id.cvv1);
        CardView cvv2=(CardView)rootView.findViewById(R.id.cvv2);
        cvv1.setOnClickListener(this);
        cvv2.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.cvv1:
                px=0;
                Intent i= new Intent(rootView.getContext(), Parallax_out_of_box.class);
                startActivity(i);
                break;


            case R.id.cvv2:

                px=1;
                Intent ii= new Intent(rootView.getContext(), Parallax_out_of_box.class);
                startActivity(ii);
                break;
        }

    }
}
