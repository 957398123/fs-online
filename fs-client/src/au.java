/**
 * 2020/01/22
 * @author 95739
 *
 */
public final class au {
	public static byte field_if = 0;
	public static byte field_for = 0;
	public static byte field_int = -1;
	public static byte field_try = -1;
	public static int[] field_new;
	public static byte a = 0;
	public static byte field_else = 0;
	public static byte field_char = -1;
	public static byte field_case = 0;
	public static byte field_byte = -1;
	public static byte field_do = -1;

	public au() {
	}

	public static byte[] a(int var0) {
		c_a5.fR = true;
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 1966081:
			var1.a(field_int);
			var1.a(field_if);
			return var1.method_long();
		case 1966082:
		case 1966086:
		case 1966091:
		case 1966094:
		case 1966095:
		case 1966096:
		case 1966097:
		case 1966106:
		case 1966107:
		case 1966108:
		case 1966109:
		case 1966110:
		case 1966111:
		case 1966112:
		default:
			return var1.method_long();
		case 1966083:
			var1.a(field_for);
			break;
		case 1966084:
			var1.a(field_try);
			break;
		case 1966085:
			var1.a(field_int);
			var1.a(field_if);
			var1.a(field_for);
			var1.a(field_try);
			field_case = 1;
			return var1.method_long();
		case 1966087:
			var1.a(field_if);
			var1.a(field_int);
			return var1.method_long();
		case 1966088:
			var1.a(field_int);
			var1.a(field_if);
			var1.a(field_try);
			return var1.method_long();
		case 1966089:
			var1.a(field_int);
			var1.a(field_if);
			var1.a(field_for);
			var1.a(field_try);
			return var1.method_long();
		case 1966090:
			var1.a(field_int);
			var1.a(field_if);
			var1.a(field_for);
			var1.a(field_try);
			return var1.method_long();
		case 1966092:
			var1.a(field_int);
			var1.a(field_if);
			var1.a(field_for);
			var1.a(field_try);
			return var1.method_long();
		case 1966093:
			break;
		case 1966098:
			var1.a(field_int);
			return var1.method_long();
		case 1966099:
			var1.a(field_int);
			var1.a(field_try);
			return var1.method_long();
		case 1966100:
			var1.a(field_int);
			return var1.method_long();
		case 1966101:
			var1.a(field_for);
			var1.a(field_int);
			return var1.method_long();
		case 1966102:
		case 1966104:
			var1.a(field_int);
			var1.a(field_for);
			var1.a(field_try);
			return var1.method_long();
		case 1966103:
		case 1966105:
			var1.a(field_int);
			var1.a(field_for);
			return var1.method_long();
		case 1966113:
			var1.a(field_byte);
			return var1.method_long();
		}

		var1.a(field_int);
		var1.a(field_if);
		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		switch (var0) {
		case -2145517564:
			c_be.cn();
			return;
		case -2145517550:
			if (var1.method_case()) {
				a7 var2;
				(var2 = (a7) c_a5.es.cf().elementAt(4)).g(false);
				var2.fC = (byte) c_r.mY[2];
				short var3 = c_r.mY[1];
				var2.ft = true;
				var2.method_if(var3, false);
				var2.a(c_a5.gg);
				return;
			}
			break;
		case -2145517536:
			c_a5.dh = var0;
			c_a5.gb = var1.method_int(var1.field_do.length - 6);
		}

	}

	public static void a() {
		field_if = 0;
		field_for = 0;
		field_int = -1;
		field_try = -1;
		field_else = 0;
		field_char = -1;
		field_case = 0;
	}
}
