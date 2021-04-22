package exercises.ex1_lambda;

import java.util.List;

public interface SerialRepository {
    // lista wszystkich epizodów
    List<Episode> getAllEpisodes(List<Season> seasons);
    // lista wszystkch filmów
    List<Video> getAllVideos(List<Season> seasons);
    // lista wsztskich nazw video
    List<String> getAllVideoNames(List<Season> seasons);
    // lista video z parzystych epizodów i sezonów
    List<Video> getAllVideosWithEvenSeasonsAndEvenEpisodes(List<Season> seasons);
    // lista video typu Preview z nieparzystych epizodów i parzystych sezonów
    List<Video> getAllVideosWithPreviewAndEooEpisodesAndEvenSeasons(List<Season> seasons);


}
