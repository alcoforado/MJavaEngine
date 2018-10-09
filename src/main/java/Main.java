import org.lwjgl.*;
import org.lwjgl.glfw.*;

import static org.lwjgl.glfw.GLFW.glfwInit;

public class Main {
/*    public Main() {
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();

            while(!Display.isCloseRequested()) {
                Display.update();
            }

            Display.destroy();
        } catch(LWJGLException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {


        glfwInit();
        System.out.println("Hello World");
    }
}