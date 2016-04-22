package Fragements;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.all.Testing;
import com.coding_sub_B;
import com.walchand.witchar16.My_adapter;
import com.walchand.witchar16.R;
import com.remaining_branches;

/**
 * Created by Abhijeet on 09-Mar-16.
 */
public class Events extends Fragment {

    @Nullable
     public static int position;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView=inflater.inflate(R.layout.activity_main_fragement,container,false);
        getActivity().setTitle("Events");

        GridView gridView = (GridView)rootView.findViewById(R.id.gridview);
       gridView.setAdapter(new My_adapter(rootView.getContext()));
       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {

               if (pos == 3) {
                   position = pos;
                   Intent i = new Intent(rootView.getContext(), coding_sub_B.class);
                   startActivity(i);

               } else if (pos == 11 || pos == 12 || pos == 15) {
                   position = pos;
                   Intent i = new Intent(rootView.getContext(), remaining_branches.class);
                   startActivity(i);

               } else {
                   position = pos;
                   Intent i = new Intent(rootView.getContext(), Testing.class);
                   startActivity(i);

               }
           }
       });




        return rootView;
    }


}
