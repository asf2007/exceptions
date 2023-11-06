import controller.Controller;
import controller.exceptions.WrongNumberDataException;
import model.FileModel;
import model.PhoneNumData;
import view.ViewNameCard;

public class Main {
    public static void main(String[] args) throws WrongNumberDataException {
        Controller controller = new Controller(new ViewNameCard(), new FileModel());
        controller.start();
    }
}
