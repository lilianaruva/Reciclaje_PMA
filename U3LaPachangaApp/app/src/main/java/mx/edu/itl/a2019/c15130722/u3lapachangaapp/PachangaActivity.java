package mx.edu.itl.a2019.c15130722.u3lapachangaapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class PachangaActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pachanga);
        mediaPlayer = MediaPlayer.create(this,R.raw.ashes_of_the_dawn);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }

    public void ClickVideo(View v){
        Intent intent = new Intent(this, VideoActivity.class);
        startActivity(intent);
    }

    public void Rep(View v){
        reproducir_audio();
    }

    public void Stop(View v) {
        detener_audio();
    }

    private void reproducir_audio()
    {
        if(mediaPlayer == null)
        {
            mediaPlayer = MediaPlayer.create(this,R.raw.ashes_of_the_dawn);
        }
        mediaPlayer.start();
    }

    private void detener_audio()
    {
        if(mediaPlayer != null)
        {
            mediaPlayer.stop();
            mediaPlayer = null;
        }
    }

}

