package Fragements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.walchand.witchar16.R;


import android.widget.ViewFlipper;



public class Initiative extends android.app.Fragment implements View.OnClickListener {


    ViewFlipper flippy;
    View rtView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        rtView = inflater.inflate(R.layout.fragment_init, container, false);

        getActivity().setTitle("Initiatives");
        flippy = (ViewFlipper) rtView.findViewById(R.id.myviewFlipper);

        flippy.setOnClickListener(this);
        flippy.setFlipInterval(2000);
        flippy.startFlipping();
        flippy.setAutoStart(true);

        return rtView;
    }

    @Override
    public void onClick(View v) {

        flippy.showNext();

    }

    @Override
    public void onResume() {
        super.onResume();

    }
}
