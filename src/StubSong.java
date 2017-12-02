import java.util.Hashtable;

import org.junit.Assert;

public class StubSong implements Song {
		private String song;
		private JukeBox jukeBox;
	    private Hashtable<String, Song> playlist = new Hashtable<String, Song>();
	    
		public StubSong(String song) {
			this.song = song;

		}
		public boolean isPlaying() {
			song = "Coldplay";
			return false;
		}
		public String getTitle() {
			return "Talk";
		}
		public void addSong(Song song) {
			playlist.put(song.getTitle(), song);
		}
		public void start() throws JukeBoxException {
			jukeBox.playTitle("Coldplay - Talk");
		}
		public double getPlayTime() {
			return 1.3;
		}
}
