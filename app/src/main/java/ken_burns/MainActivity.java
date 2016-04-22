package ken_burns;

import android.support.v7.app.AppCompatActivity;

import com.walchand.witchar16.R;


public class MainActivity extends AppCompatActivity {/*


    private KenBurnsView kenBurnsView;
    private boolean isPlay = true;
    public static int j= com.walchand.witchar16.MainActivity.position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newparallax);

        kenBurnsView = (KenBurnsView) findViewById(R.id.image);
        // int[] pics={R.drawable.newparallax,R.drawable.cad,R.drawable.pic0};
        //int j= com.walchand.witchar16.MainActivity.position;

        //kenBurnsView.setImageResource(pics[j]);

        AccelerateDecelerateInterpolator ACCELERATE_DECELERATE = new AccelerateDecelerateInterpolator();
        RandomTransitionGenerator generator = new RandomTransitionGenerator(10000, ACCELERATE_DECELERATE);
        kenBurnsView.setTransitionGenerator(generator); //set new transition on kenburns view

        kenBurnsView.setTransitionListener(onTransittionListener());

    }

    private KenBurnsView.TransitionListener onTransittionListener() {
        return new KenBurnsView.TransitionListener() {

            @Override
            public void onTransitionStart(Transition transition) {
                Toast.makeText(MainActivity.this, "start", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTransitionEnd(Transition transition) {
                Toast.makeText(MainActivity.this, "end", Toast.LENGTH_SHORT).show();
            }
        };
    }

*/

}
