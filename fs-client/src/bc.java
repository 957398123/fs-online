import java.io.DataOutputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class bc {
	private Random field_long = new Random();
	private static SocketConnection b = null;
	private DataOutputStream a = null;
	private bc.a field_int = null;
	private Vector field_try = new Vector();
	private String field_char;
	private String field_else;
	private String field_case;
	private static bc field_void = null;

	private bc() {
		this.field_long.setSeed(System.currentTimeMillis());
	}

	public static bc method_if() {
		if (field_void == null) {
			field_void = new bc();
		}

		return field_void;
	}

	private synchronized boolean method_new() {
		try {
			String var1 = "socket://" + this.field_char + ":" + this.field_else;
			System.out.println("url = " + var1);
			(b = (SocketConnection) Connector.open(var1, 3, false)).setSocketOption((byte) 2, 0);
			b.setSocketOption((byte) 0, 10);
			b.setSocketOption((byte) 1, 5);
			this.a = b.openDataOutputStream();
			this.field_int = new bc.a();
			return true;
		} catch (Exception var2) {
			if (this.field_try != null) {
				this.field_try = new Vector();
			}

			c_b5.method_case("first close KEmulator");
			var2.printStackTrace();
			return false;
		}
	}

	public final void method_int() {
		try {
			if (this.field_int != null) {
				this.field_int.a = null;
				this.field_int = null;
			}

			if (b != null) {
				b.close();
				b = null;
			}

			b = null;
			if (this.a != null) {
				this.a.close();
				this.a = null;
			}

		} catch (Exception var2) {
		}
	}

	public final void a(int var1) {
		Object var2 = null;
		System.out.println("gi send " + var1);
		byte[] var5 = method_if(var1);
		this.field_try.addElement(var5);
		synchronized (this) {
			if (b == null) {
				try {
					c_b5.method_case("socket_start");
					this.method_new();
				} catch (Exception var3) {
					var3.printStackTrace();
				}
			}

		}
	}

	public final boolean method_case() {
		if (this.a == null) {
			return true;
		} else {
			try {
				if (this.field_try.size() != 0) {
					for (; this.field_try.size() != 0; this.field_try.removeElementAt(0)) {
						byte[] var1;
						if ((var1 = (byte[]) ((byte[]) this.field_try.elementAt(0))) != null) {
							this.a.write(var1);
						}
					}
				}

				this.a.flush();
				return true;
			} catch (Exception var2) {
				var2.printStackTrace();
				return false;
			}
		}
	}

	private static byte[] method_if(int var0) {
		ac var1 = new ac();
		if (var0 == 1) {
			byte[] var4 = new byte[10];

			for (int var2 = 0; var2 < var4.length; ++var2) {
				var4[var2] = (byte) Integer.parseInt(c_a5.gD.field_case);
			}

			var1.method_if(var4);
		} else {
			String var5 = c_a5.ik;
			byte[] var6 = new byte[10];

			int var3;
			for (var3 = 0; var3 < var6.length; ++var3) {
				var6[var3] = 32;
			}

			if ((var3 = var5.getBytes().length) < var6.length) {
				System.arraycopy(var5.getBytes(), 0, var6, 0, var3);
			} else {
				var6 = var5.getBytes();
			}

			var5 = "CMCCGAME_userId=" + new String(var6);
			System.out.println("s = " + var5);
			var1.method_if(var5.getBytes());
		}

		return var1.method_long();
	}

	public final String a() {
		return this.field_char;
	}

	public final void a(String var1) {
		this.field_char = var1;
	}

	public final void method_do(String var1) {
		this.field_else = var1;
	}

	public final void method_if(String var1) {
		this.field_case = var1;
	}

	private class a implements Runnable {
		Thread a = new Thread(this);

		a() {
			this.a.start();
		}

		public final void run() {
			Thread var1 = Thread.currentThread();

			while (this.a == var1) {
				try {
					if (!bc.this.method_case()) {
						this.a = null;
					}

					synchronized (this) {
						this.wait(100L);
					}

					Thread.yield();
				} catch (Exception var5) {
					this.a = null;
					var5.printStackTrace();
				}
			}

			bc.method_if().method_int();
		}
	}
}
