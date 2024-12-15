package ComparableAndComparator;

import java.util.Comparator;

public class SortWithCYearWithComparator implements Comparator<Song>{

	@Override
	public int compare(Song song, Song anotherSong) {
		// TODO Auto-generated method stub
		if(song.getYear()<anotherSong.getYear())
			return -1;
		if(song.getYear()>anotherSong.getYear())
		return +1;
		else
			return 0;
	}

}
