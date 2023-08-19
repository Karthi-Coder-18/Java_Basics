package practice.objects;

public class StreamingSong {

    String title;
    String artist;

    int duration;


    public void play() {
        System.out.println("Playing song");
    }

    public void printDetails() {
        System.out.println("This is " + title +
                " by " + artist + " Which plays for " + duration + " min");
    }


}
