/**
 * 2020/01/21
 * @author 95739
 *
 */
public final class am {
	public static long field_if;
	public static long c;
	public static short field_byte;
	public static int field_new;
	public static String[] field_case = new String[5];
	public static byte field_try = 0;
	public static boolean field_else;
	private static int d;
	private static long field_int;
	private static boolean field_char;
	public static byte field_goto;
	public static boolean a = true;
	public static boolean field_void;
	public static String[] b = new String[2];
	public static byte field_for = -1;
	private static byte field_long = -1;
	public static byte field_do = -1;

	public am() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 3342337:
		case 3342339:
			var1.a(c_r.mp);
			c_a5.fR = true;
			break;
		case 3342338:
			var1.a(a7.fF);
			c_a5.fR = true;
			break;
		case 3342340:
			var1.method_do(d);
			var1.a(field_int);
			var1.a(field_char);
			c_a5.fR = true;
			break;
		case 3342341:
		case 3342343:
			var1.a(field_goto);
			var1.method_do(d);
			var1.a(field_int);
			var1.a(field_char);
			c_a5.fR = true;
			break;
		case 3342342:
		case 3342344:
			c_r var2 = (c_r) c_a5.es.cf().elementAt(10);
			var1.a(var2.mz);
			var1.a(field_goto);
			var1.method_do(d);
			var1.a(field_int);
			var1.a(field_char);
			c_a5.fR = true;
		case 3342345:
		case 3342346:
		case 3342347:
		case 3342348:
		case 3342349:
		case 3342350:
		case 3342351:
		case 3342355:
		default:
			break;
		case 3342352:
			field_long = c_r.mp;
			var1.a(c_r.mp);
			c_a5.fR = true;
			break;
		case 3342353:
			var1.a(field_for);
			var1.a(field_long);
			c_a5.fR = true;
			break;
		case 3342354:
		case 3342356:
		case 3342361:
			c_a5.fR = true;
			break;
		case 3342357:
		case 3342358:
			var1.a(field_do);
			c_a5.fR = true;
			break;
		case 3342359:
			c_a5.fR = true;
			var1.a(aq.a);
			var1.a(aq.field_int);
			break;
		case 3342360:
			c_a5.fR = true;
			var1.a(aq.a);
			var1.a(aq.field_int);
			aq.method_if();
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		switch (var0) {
		case -2144141311:
			field_if = var1.method_char();
			c = var1.method_char();
			field_byte = var1.method_new();
			field_new = var1.method_byte();
			d = var1.method_byte();
			field_int = var1.method_char();
			field_char = var1.method_case();
			field_else = true;
			return;
		case -2144141310:
			field_void = var1.method_case();
			b[0] = var1.method_goto();
			b[1] = var1.method_goto();
			if (!field_void) {
				field_for = -1;
				field_long = -1;
				return;
			}
			break;
		case -2144141309:
			aq.a = var1.method_if();
			aq.a(4, true, 0, false);
			return;
		case -2144141308:
			aq.field_int = var1.method_if();
			aq.a(6, true, 0, true);
		}

	}

	public static void method_if() {
		if (field_new != 0) {
			field_new = 0;
		}

		if (field_else) {
			field_else = false;
		}

		if (!a) {
			a = true;
		}

	}

	public static void a() {
		if (field_void) {
			field_void = false;

			for (int var0 = 0; var0 < 2; ++var0) {
				b[var0] = "";
			}

			field_for = -1;
			field_long = -1;
		}

	}
}
