package info.krogulec.kotlinpractice.basics;

import java.util.List;

public class BasicsFilmJava {
    private final String title;
    private final int year;
    private boolean available = true;
    private boolean isPlaying = false;
    private List<BasicsFilmJava> sequels = List.of();

    BasicsFilmJava(String title, int year) {
        this.title = title;
        this.year = year;
    }

    void play() {
        if (available) {
            isPlaying = true;
            System.out.println("playing " + title);
        }
    }

    /*
     * getting film title
     */
    public String getTitle() {
        return title;
    }

    // film is available for playing
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void addSequels(BasicsFilmJava... sequels){
        this.sequels.addAll(List.of(sequels));
    }
}
