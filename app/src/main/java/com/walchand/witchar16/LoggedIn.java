package com.walchand.witchar16;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Random;

public class LoggedIn extends AppCompatActivity {

    public static ParseUser user;
    Button startQuiz;
    String quizStatus;
    ParseQuery<ParseObject> query;
    public static List<ParseObject> list;
    public static ParseObject ques1, ques2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        startQuiz = (Button) findViewById(R.id.startquiz);
        user = ParseUser.getCurrentUser();
        startQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NetAsync(v);
            }
        });
    }

    private class NetCheck extends AsyncTask<String, String, Boolean> {
        private ProgressDialog nDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            nDialog = new ProgressDialog(LoggedIn.this);
            nDialog.setTitle("Checking Network");
            nDialog.setMessage("Loading...");
            nDialog.setIndeterminate(false);
            nDialog.setCancelable(true);
            nDialog.show();
        }

        /**
         * Gets current device state and checks for working internet connection by trying Google.
         */
        @Override
        protected Boolean doInBackground(String... args) {

            ConnectionDetector cd = new ConnectionDetector(getApplicationContext());
            return cd.isConnectingToInternet();
        }

        @Override
        protected void onPostExecute(Boolean th) {

            if (th) {
                nDialog.dismiss();
                new ProcessLogin().execute();
            } else {
                nDialog.dismiss();
                new AlertDialog.Builder(LoggedIn.this)
                        .setTitle("Error")
                        .setMessage("You are not connected to internet")
                        .setNegativeButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        }
    }

    private class ProcessLogin extends AsyncTask<String, String, String> {
        private ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(LoggedIn.this);
            pDialog.setTitle("Contacting Servers");
            pDialog.setMessage("Fetching Data...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... args) {
            try {
                user = user.fetch();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            quizStatus = user.getString("QuizAttempted");
            if (quizStatus.equals("no")) {
                user.put("QuizAttempted", "yes");
                try {
                    user.save();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                ParseQuery<ParseObject> query2 = ParseQuery.getQuery("TestObject");
                ParseObject obj = null;
                try {
                    obj = query2.get("DnljuOA9nT");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                assert obj != null;
                int start = obj.getInt("start");
                int end = obj.getInt("end");
                query = ParseQuery.getQuery("Questions");
                Random r = new Random();
                int i1 = r.nextInt(end - start) + start;
                query.whereEqualTo("index", i1);
                try {
                    list = query.find();
                    ques1 = list.get(0);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                query = ParseQuery.getQuery("Questions");
                int i2 = r.nextInt(end - start) + start;
                if (i1 == i2) {
                    i2 += 1;
                    if (i2 == end) {
                        i2 = start;
                    }
                }
                query.whereEqualTo("index", i2);
                try {
                    list = query.find();
                    ques2 = list.get(0);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            return quizStatus;
        }

        @Override
        protected void onPostExecute(String i) {
            pDialog.dismiss();
            if (i.equals("yes")) {
                startActivity(new Intent(getApplicationContext(), QuizEnded.class));
                finish();
            } else {
                startActivity(new Intent(getApplicationContext(), Quiz.class));
                finish();
            }
        }
    }

    public void NetAsync(View view) {
        new NetCheck().execute();
    }
}
