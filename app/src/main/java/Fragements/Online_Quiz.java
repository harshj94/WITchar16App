package Fragements;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.walchand.witchar16.MainScreen;
import com.walchand.witchar16.R;

/**
 * Created by Abhijeet on 09-Mar-16.
 */
public class Online_Quiz extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.online_quiz, container, false);
        getActivity().setTitle("Online Quiz");
        CharSequence ch;
        Context cn=rootView.getContext();
        Resources res=cn.getResources();
        ch=res.getText(R.string.online_quiz);


        TextView t1=(TextView)rootView.findViewById(R.id.appquiz);
        Button b1=(Button)rootView.findViewById(R.id.GoToQuiz);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(rootView.getContext(),MainScreen.class);
                startActivity(i);
            }
        });
        t1.setText(ch);
        return rootView;


    }

}
