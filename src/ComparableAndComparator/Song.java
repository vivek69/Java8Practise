package ComparableAndComparator;

public class Song implements Comparable<Song> {
private String title;
private String artist;
private Integer year;
public Song(String title, String artist, int year) {
	this.title=title;
	this.artist=artist;
	this.year=year;
	
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
@Override
public String toString() {
	return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
}
@Override
public int compareTo(Song o) {
	// TODO Auto-generated method stub
	//return -this.getYear().compareTo(o.getYear());//desc
	return this.getYear().compareTo(o.getYear());//asc
}

}
