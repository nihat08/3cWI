package at.nihat.projects;

public class ue {
    //jede 3. zahl und wenn durch 4 teilbar dann nicht ausgeben
    public static void main(String[] args) {
        for (int i=-4; i<150; i+=3){
            if (i%4 != 0){
                System.out.println(i);
            }
        }
    }
}
