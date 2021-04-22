package exercises.ex1_lambda;

import java.util.List;
import java.util.stream.Collectors;

public class SerialRepositoryImpl implements SerialRepository {
    @Override
    public List<Episode> getAllEpisodes(List<Season> seasons) {
        return seasons.stream()                             // Stream<Season>
                .flatMap(s -> s.getEpisodes().stream())     // Stream<Season> -> Streams<Episode>
                .collect(Collectors.toList());              // List<Episodes>
    }
    @Override
    public List<Video> getAllVideos(List<Season> seasons) {
        return seasons.stream()                                 //stream season
                .flatMap(s -> s.getEpisodes().stream())        //stream <Season> -> Streams<Episode>
                .flatMap(e -> e.getVideos().stream())          //stream <Video>
                .collect(Collectors.toList());
    }
    @Override
    public List<String> getAllVideoNames(List<Season> seasons) {
        return getAllVideos(seasons).stream()                   // Stream<Video>
                .map(video -> video.getTitle())                 // Stream<String>
                .collect(Collectors.toList());
    }
    @Override
    public List<Video> getAllVideosWithEvenSeasonsAndEvenEpisodes(List<Season> seasons) {
        return null;
    }
    @Override
    public List<Video> getAllVideosWithPreviewAndEooEpisodesAndEvenSeasons(List<Season> seasons) {
        return null;
    }
}
