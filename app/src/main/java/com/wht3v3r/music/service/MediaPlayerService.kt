package com.wht3v3r.music.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder

class MediaPlayerService: Service(), MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener {

    private val binder = LocalBinder()


    override fun onCompletion(p0: MediaPlayer?) {
        TODO("Not yet implemented")
    }

    override fun onSeekComplete(p0: MediaPlayer?) {
        TODO("Not yet implemented")
    }

    override fun onPrepared(p0: MediaPlayer?) {
        TODO("Not yet implemented")
    }

    override fun onError(p0: MediaPlayer?, p1: Int, p2: Int): Boolean {
        TODO("Not yet implemented")
    }

    inner class LocalBinder : Binder() { fun service(): MediaPlayerService = this@MediaPlayerService }

    override fun onBind(p0: Intent?): IBinder { return binder }


}