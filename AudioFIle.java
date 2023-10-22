public class AudioFile {
	private String fileName;
	private String artistName;
	private String trackName;
	private int duration;
	private int releaseYear;

	public AudioFile(String fileName, String artistName, String trackName, int duration, int releaseYear) {
		this.fileName = fileName;
		this.artistName = artistName;
		this.trackName = trackName;
		this.duration = duration;
		this.releaseYear = releaseYear;
	}

	public void PrintInfo() {
		System.out.println(fileName + " " + artistName + " " + trackName + " " + duration + " " + releaseYear);
	}
}