package task5;

    public class AbstractFactoryPattern {
        public static void main(String[] args) {

            GUIFactory factory = new WindowsFactory();

            Button windowsButton = factory.createButton();
            Window windowsWindow = factory.createWindow();

            windowsButton.paint();
            windowsWindow.render();
        }
    }

