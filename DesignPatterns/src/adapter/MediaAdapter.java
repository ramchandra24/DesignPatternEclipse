package adapter;

public class MediaAdapter implements IMediaAdapter {

	IMp3MediaPlayer mp3Player = null;
	IMp4MediaPlayer mp4Player = null;
	
	public MediaAdapter(String type){
		if("mp3" == type) {
			mp3Player = new Mp3MediaPlayer();
		}
		else if("mp4" == type) {
			mp4Player = new Mp4MediaPlayer();
		}
		else {
			System.out.println("Invalid media type");
		}
	}
	@Override
	public void playMedia() {
		// TODO Auto-generated method stub
		if(null != mp3Player) {
			mp3Player.playMp3Media();
		}
		else if(null != mp4Player) {
			mp4Player.playMp4Media();
		}
		else {
			System.out.println("Invalid media player");
		}
	}

}
