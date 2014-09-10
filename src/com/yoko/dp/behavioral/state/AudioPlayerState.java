package com.yoko.dp.behavioral.state;

abstract public class AudioPlayerState{

	protected AudioPlayer player;
	
    protected AudioPlayerState(AudioPlayer player){
    	this.player = player;
    }

    public AudioPlayerState() {
    }

    abstract void playButton();

    abstract void stopButton();
}
