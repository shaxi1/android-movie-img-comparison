package com.androidfactory.howto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

import android.os.Bundle;

public class ExoPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo_player);

        PlayerView playerView = findViewById(R.id.exoplayer);
        ExoPlayer player = new ExoPlayer.Builder(this).build();

        playerView.setPlayer(player);


        MediaItem mediaItem = MediaItem.fromUri(AssetsURL.VIDEO_URL);

        player.setMediaItem(mediaItem);

        player.prepare();

        player.play();
    }
}