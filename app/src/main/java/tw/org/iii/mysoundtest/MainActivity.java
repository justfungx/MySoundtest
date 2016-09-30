package tw.org.iii.mysoundtest;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mesg;
    private SoundPool soundPool;
    private  int soundBome , soundScream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC,0);

        soundBome = soundPool.load(this,R.raw.soundbome,1);
        soundScream =soundPool.load(this,R.raw.soundscream,1);
    }

    public void test1 (View v){
        soundPool.play(soundBome,2f,2f,1,1,1);
    }
    public void test2 (View v){
        soundPool.play(soundScream,2f,2f,1,1,1);
    }

}
