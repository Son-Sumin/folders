package chapter03;

public class T6SongTest {

	public static void main(String[] args) {
		T7Song song = new T7Song();

		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
	}

}
