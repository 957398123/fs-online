import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class b2 {
	static av field_try;
	private static c_ad field_do;
	private static c_bu field_int;
	public static int field_new;
	public static int field_if = 0;
	private static b2 a = null;

	public b2() {
		if (c_a5.gZ) {
			field_if = 2 + c_a5.gF.a;
			field_new = c_a5.ic - c_a5.gF.field_if.getWidth() >> 1;
		}

		field_try = new av();
		field_do = new c_ad();
		field_int = new c_bu();
		if (c_a5.d8) {
			c_ad.a = 0;
		} else {
			c_ad.a = 1;
		}
	}

	public static b2 a() {
		if (a == null) {
			a = new b2();
		}

		return a;
	}

	public static void method_if() {
		a = null;
		if (field_do != null) {
			c_ad.method_int();
		}

		if (field_int != null) {
			c_bu.method_if();
		}

	}

	public static void method_do() {
		field_do.method_if();
	}

	public static void a(Graphics var0) {
		c_ad.method_if(var0);
		field_try.a(var0);
		field_int.a(var0);
		c_ad.a(var0);
		if (c_a5.gZ) {
			c_a5.gF.a(var0, field_new, 2, 0);
		}

		switch (bp.ag().field_byte) {
		case 3:
			bp.ag().method_char(var0);
		default:
		}
	}
}
