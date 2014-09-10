package com.yoko.dp.behavioral.state;

public class AudioPlayer {

    protected AudioPlayerState playState;
    protected AudioPlayerState stopState;
    
    protected AudioPlayerState state;
    
    public AudioPlayer(){
    	playState = new PlayState(this);
    	stopState = new StopState(this);
    	
    	state = stopState;
    }

    public void setState(AudioPlayerState state) {
    	this.state = state;
    }

    public void startPlay() {
        System.out.println("Start playing");
        this.state.playButton();
    }

    public void stopPlay() {
        System.out.println("Stop playing");
        this.state.stopButton();
    }

	public AudioPlayerState getPlayState() {
		return playState;
	}

	public void setPlayState(AudioPlayerState playState) {
		this.playState = playState;
	}

	public AudioPlayerState getStopState() {
		return stopState;
	}

	public void setStopState(AudioPlayerState stopState) {
		this.stopState = stopState;
	}

}
