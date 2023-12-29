package practice_questions;

import practice_questions.DrumKit;

public class TestClassForObjects {

    public static void main(String[] args) {

        StreamingSong st = new StreamingSong();
        DrumKit dk = new DrumKit();

        Echo[] array = new Echo[4];

        array[0] = new Echo();
        array[1] = array[0];

        array[0].hello();


        st.artist = "Anirudh";

        st.title = "Hukum";

        st.duration = 5;

        st.play();
        st.printDetails();


        dk.playSnare();
        dk.playTopHat();

        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;

        while (x < 4){
            e1.hello();

           e1.count = e1.count + 1;

            if(x == 3){
                e2.count = e2.count + 1;
            }

            if(x > 0){
                e2.count = e2.count + e1.count;
            }

            x = x + 1;

        }
        System.out.println(e2.count);

    }


}
