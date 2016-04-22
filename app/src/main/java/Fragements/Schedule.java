package Fragements;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.walchand.witchar16.R;

/**
 * Created by Abhijeet on 09-Mar-16.
 */
public class Schedule extends Fragment {

    WebView wv;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.schedule, container, false);
        getActivity().setTitle("Schedule");
        wv = (WebView) rootView.findViewById(R.id.query);
        wv.loadUrl("file:///android_asset/finallll.html");
        return rootView;

    }

}
