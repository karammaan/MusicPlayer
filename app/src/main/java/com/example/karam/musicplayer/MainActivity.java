package com.example.karam.musicplayer;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;
    Boolean music_state = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayer = MediaPlayer.create(MainActivity.this, R.raw.birthday_audio);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
    }

    public void play(View v)
    {
        if(music_state)
        {
            mPlayer.pause();
            music_state = false;
        }
        else
        {
            mPlayer.start();
            music_state = true;
        }
    }
}




























