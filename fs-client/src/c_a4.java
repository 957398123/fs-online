import javax.microedition.lcdui.Graphics;

/**
 * 2020/01/19
 * @author 95739
 *
 */
public abstract class c_a4 {
	public static final p d = new p();
	public boolean g = false;
	public int field_goto = 0;
	private int field_case = -1;
	byte field_try = -1;
	public byte field_byte;
	short c = 0;
	short field_void = 0;
	short o = 0;
	public byte h = 0;
	short n = 0;
	public short q;
	public short l;
	public short field_new;
	public short field_int;
	String e = "";
	private String p = "";
	public static long a;

	public c_a4() {
	}

	public final void method_if(int var1) {
		field_goto = var1;
	}

	public final int method_new() {
		return field_goto;
	}

	public final void a(int var1) {
		field_case = var1;
	}

	public final int method_char() {
		return field_case;
	}

	public final byte method_for() {
		return field_try;
	}

	public final byte method_do() {
		return field_byte;
	}

	public final short method_try() {
		return c;
	}

	public final short b() {
		return field_void;
	}

	public final short method_long() {
		return o;
	}

	public final short a() {
		return n;
	}

	public final void method_for(byte var1) {
		h = 0;
	}

	public final void method_if(short var1, short var2) {
		q = var1;
		l = var2;
	}

	public final short e() {
		return q;
	}

	public final short method_void() {
		return l;
	}

	public static short method_for(short var0, short var1) {
		return c_z.method_if(var1, var0);
	}

	public static short method_int(short var0, short var1) {
		return c_z.a(var1, var0);
	}

	public final void method_if(String var1) {
		e = var1;
	}

	public final String method_byte() {
		return e;
	}

	public final void a(String var1) {
		if (var1 != null & var1.length() > 0) {
			var1 = "<" + var1 + ">";
		}

		p = var1;
	}

	public final String method_int() {
		return p;
	}

	public abstract void a(Graphics var1);

	public abstract void a(Graphics var1, short var2, short var3);

	public abstract void method_if(Graphics var1);

	public abstract void method_case();
}
