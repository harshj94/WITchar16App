package com.walchand.witchar16;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseObject;
import com.parse.ParseUser;

public class Quiz extends AppCompatActivity {

    ParseObject question1, question2;
    Button submitQuiz;
    TextView ques1, ques2, timer;
    RadioGroup quest1, quest2;
    String correct;
    String ans1, ans2;
    String correct1, correct2;
    private RadioButton radioSexButton;
    RadioButton q1opt1, q1opt2, q1opt3, q1opt4, q2opt1, q2opt2, q2opt3, q2opt4;
    ParseUser user;
    CountDownTimer cdt;
    static int flag;
    int p;
    Handler hm = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        user = LoggedIn.user;

        submitQuiz = (Button) findViewById(R.id.submitquiz);
        q1opt1 = (RadioButton) findViewById(R.id.q1opt1);
        q2opt1 = (RadioButton) findViewById(R.id.q2opt1);
        q1opt2 = (RadioButton) findViewById(R.id.q1opt2);
        q2opt2 = (RadioButton) findViewById(R.id.q2opt2);
        q1opt3 = (RadioButton) findViewById(R.id.q1opt3);
        q2opt3 = (RadioButton) findViewById(R.id.q2opt3);
        q1opt4 = (RadioButton) findViewById(R.id.q1opt4);
        q2opt4 = (RadioButton) findViewById(R.id.q2opt4);
        ques1 = (TextView) findViewById(R.id.ques1);
        ques2 = (TextView) findViewById(R.id.ques2);
        quest1 = (RadioGroup) findViewById(R.id.quest1);
        quest2 = (RadioGroup) findViewById(R.id.quest2);
        timer = (TextView) findViewById(R.id.timer);

        question1 = LoggedIn.ques1;
        question2 = LoggedIn.ques2;

        ques1.setText(question1.getString("Question"));
        ques2.setText(question2.getString("Question"));
        q1opt1.setText(question1.getString("Option1"));
        q1opt2.setText(question1.getString("Option2"));
        q1opt3.setText(question1.getString("Option3"));
        q1opt4.setText(question1.getString("Option4"));
        q2opt1.setText(question2.getString("Option1"));
        q2opt2.setText(question2.getString("Option2"));
        q2opt3.setText(question2.getString("Option3"));
        q2opt4.setText(question2.getString("Option4"));

        correct = question1.getString("Answer");
        correct1 = question1.getString("Option" + correct + "");

        correct = question2.getString("Answer");
        correct2 = question2.getString("Option" + correct + "");

        submitQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = quest1.getCheckedRadioButtonId();
                radioSexButton = (RadioButton) findViewById(selectedId);
                if (radioSexButton != null)
                    ans1 = radioSexButton.getText().toString();

                selectedId = quest2.getCheckedRadioButtonId();
                radioSexButton = (RadioButton) findViewById(selectedId);
                if (radioSexButton != null)
                    ans2 = radioSexButton.getText().toString();
                if (ans1 != null) {
                    if (ans1.equals(correct1)) {
                        user.increment("score");
                    }
                }
                if (ans2 != null) {
                    if (ans2.equals(correct2)) {
                        user.increment("score");
                    }
                }
                user.saveInBackground();
                cdt.cancel();
                p = 1;
                gonow();
            }
        });

        cdt = new CountDownTimer(45000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("Seconds remaining: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                timer.setText("Time's up!!!");
                flag = 1;
                hm.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        gonow();
                    }
                }, 700);
            }
        }.start();

    }

    @Override
    public void onBackPressed() {
        cdt.cancel();
        gonow();
    }

    @Override
    protected void onPause() {
        super.onPause();
        cdt.cancel();
        if (flag == 1) {

        } else {
            if (p == 1) {
            } else {
                Toast.makeText(getApplicationContext(), "Disqualified", Toast.LENGTH_SHORT).show();
                cdt.cancel();
                gonow();
            }
        }
    }

    private void gonow() {
        Intent ii = new Intent(getApplicationContext(), QuizEnded.class);
        startActivity(ii);
        finish();
    }
}
