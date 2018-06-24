package adapter;

public class TestAdapterPattern {

	public static void main(String[] args) {
		
		IMediaAdapter adapter = new MediaAdapter("mp3");
		adapter.playMedia();
		
		adapter = new MediaAdapter("mp4");
		adapter.playMedia();
		
		adapter = new MediaAdapter("mp5");
		adapter.playMedia();

	}
}
