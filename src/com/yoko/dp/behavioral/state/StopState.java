package com.yoko.dp.behavioral.state;

public class StopState extends AudioPlayerState{
	
    public StopState(AudioPlayer player) {
        super(player);
    }

    public void playButton(){
    	player.setState(player.getPlayState());
    }

	@Override
	void stopButton() {
		
	}
}
