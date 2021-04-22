package exercises.ex1_lambda;

import java.util.List;
import java.util.stream.Collectors;

public class SerialRepositoryImpl implements SerialRepository {
    @Override
    public List<Episode> getAllEpisodes(List<Season> seasons) {
        return SerialData.seasons.stream()                  // Stream<Season>
                .flatMap(s -> s.getEpisodes().stream())     // Stream<Season> -> Streams<Episode>
                .collect(Collectors.toList());              // List<Episodes>
    }
    @Override
    public List<Video> getAllVideos(List<Season> seasons) {
        return null;
    }
    @Override
    public List<String> getAllVideoNames(List<Season> seasons) {
        return null;
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
