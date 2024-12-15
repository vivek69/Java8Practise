package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {
public static void main(String[] args) {
	Song song1=new Song("rab ne bana di zori","sharukh",2011);
	Song song2=new Song("maharan pratap","akshay",2022);
	Song song3=new Song("partner","govinda",2008);
	Song song4=new Song("bahubali","south",2001);
	Song song5=new Song("RRR","aryan",2020);
	ArrayList<Song>musicList=new ArrayList<>();
	
	musicList.add(song1);
	musicList.add(song2);
	musicList.add(song3);
	musicList.add(song4);
	musicList.add(song5);
	MyUtils.iterateList(musicList);
	//Collections.sort(musicList);
	Collections.sort(musicList, new SortWithCYearWithComparator());
	System.out.println("After sorting");
	
	MyUtils.iterateList(musicList);
}
}
