package Model;

/**
 * Created by VKanunnikov on 11.07.2016.
 */
public class Game {

    public Game() {
        start();
    }

    private void start() {

        View view = new View();
        Field field = new Field();
        view.showField(field);
    }

}
