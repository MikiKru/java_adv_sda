package exercises.ex1_lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Video v1 = new Video("Ex", "ex.pl/ex", VideoType.EPISODE);
////        System.out.println(v1);
////        Episode e1 = new Episode("E1",1, new ArrayList<>(Arrays.asList(v1)));
////        System.out.println(e1);
////        Season s1 = new Season("S1", 1, new ArrayList<>(Arrays.asList(e1)));
////        System.out.println(s1);
        SerialRepository sr = new SerialRepositoryImpl();
        System.out.println("EPISODES");
        sr.getAllEpisodes(SerialData.seasons).forEach(System.out::println);
        System.out.println("VIDEOS");
        sr.getAllVideos(SerialData.seasons).forEach(System.out::println);
        System.out.println("VIDEO NAMES");
        sr.getAllVideoNames(SerialData.seasons).forEach(System.out::println);
        System.out.println("EVEN E AND EVEN S");
        sr.getAllVideosWithEvenSeasonsAndEvenEpisodes(SerialData.seasons).forEach(System.out::println);
        System.out.println("ODD E AND EVEN S PREVIEW");
        sr.getAllVideosWithPreviewAndOddEpisodesAndEvenSeasons(SerialData.seasons).forEach(System.out::println);
    }
}
