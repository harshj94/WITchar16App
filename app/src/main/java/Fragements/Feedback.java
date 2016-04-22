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
public class Feedback extends Fragment {
    WebView wv;
    String url=null;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.feedback, container, false);

        getActivity().setTitle("Feedback");
        wv = (WebView) rootView.findViewById(R.id.webview12);
        url="https://docs.google.com/forms/d/1rM_5XN11w7sQG2lNmBn5GoKqbZeP3hJxH0PUiwu3YPQ/viewform?c=0&w=1ri";
        wv.loadUrl("url");
        return rootView;

    }

}
