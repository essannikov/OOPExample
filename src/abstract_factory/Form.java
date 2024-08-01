package abstract_factory;

public class Form {
    private final Button button;
    private final TextField textField;

    public Form(GUIFactory guiFactory){
        button = guiFactory.createButton();
        textField = guiFactory.createTextField();
    }

    public Button getButton() {
        return button;
    }

    public TextField getTextField() {
        return textField;
    }
}
