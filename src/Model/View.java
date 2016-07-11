package Model;

/**
 * Created by VKanunnikov on 11.07.2016.
 */
public class View {

    public void showField(Field field) {

        Field.Cell[][] cells = field.getCells();

        for (Field.Cell[] cell : cells) {
            for (Field.Cell cell1 : cell) {
                switch (cell1){
                    case EMPTY:
                        System.out.print(" _ ");
                        break;
                }
                System.out.println();
            }
        }

    }

}
