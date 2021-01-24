import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/**
 * 程序主入口
 * 
 * @author FS
 * 
 */
public class c_a extends MIDlet {
	public Display display = null;

	private c_a5 a = null;

	public c_a() {
	}

	public void startApp() {
		display = Display.getDisplay(this);

		try {
			if (a == null) {
				a = new c_a5(this);
			}

			a.H();
			display.setCurrent(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pauseApp() {
		c_a5.D();
	}

	protected void destroyApp(boolean var1) {
		notifyDestroyed();
	}
}
