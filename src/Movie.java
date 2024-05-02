public class Movie implements INetflixMedia {
    private String title;
    private int durationInMinutes;
    private String Synopsis;

    public Movie(String title, int durationInMinutes, String Synopsis){
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.Synopsis = Synopsis;
    }
    public String getTitle(){
        return title;
    }
    public int getDurationInMinutes(){
        return durationInMinutes;
    }
    public void play(){
        System.out.println("Playing the Movie");
    }
    public void pause(){
        System.out.println(" The Movie Paused");
    }
    public void stop(){
        System.out.println(" The Movie Stopped");
    }
    public String getSynopsis(){
        return Synopsis;
    }
    public void setSynopsis(String Synopsis){
        this.Synopsis = Synopsis;
    }

}
