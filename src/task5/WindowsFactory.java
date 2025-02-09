package task5;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }


    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
