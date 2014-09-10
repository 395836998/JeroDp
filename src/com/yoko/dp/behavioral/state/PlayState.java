package com.yoko.dp.behavioral.state;

public class PlayState extends AudioPlayerState{
	
    public PlayState(AudioPlayer player) {
        super(player);
    }

    public void stopButton() {
    	player.setState(player.getStopState());
    }

	@Override
	void playButton() {
		
	}
}
