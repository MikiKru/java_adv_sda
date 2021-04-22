package exercises.ex1_lambda;

import java.util.ArrayList;
import java.util.Arrays;

public interface SerialData {
    Video v1 = new Video("GOT1", "got1.com", VideoType.CLIP);
    Video v2 = new Video("GOT2", "got2.com", VideoType.EPISODE);
    Video v3 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
    Video v4 = new Video("GOT4", "got4.com", VideoType.PREVIEW);
    Video v5 = new Video("GOT5", "got5.com", VideoType.CLIP);
    Video v6 = new Video("GOT6", "got6.com", VideoType.EPISODE);

    Episode e1 = new Episode("got1", 1, new ArrayList<>(Arrays.asList(v1,v2)));
    Episode e2 = new Episode("got2", 2, new ArrayList<>(Arrays.asList(v3,v4)));
    Episode e3 = new Episode("got3", 1, new ArrayList<>(Arrays.asList(v5,v6)));

    Season s1 = new Season("GOTS1", 1, new ArrayList<>(Arrays.asList(e1,e2)));
    Season s2 = new Season("GOTS2", 2, new ArrayList<>(Arrays.asList(e3)));


}
