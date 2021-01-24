import java.util.Vector;

/**
 * 2021/01/20
 * @author 95739
 *
 */
public final class aj {
	public static byte field_byte = -1;
	private static byte field_int = -1;
	public static byte field_for = 0;
	private static byte[] field_long = new byte[] { -1, -1 };
	private static byte field_if = 0;
	public static byte field_do = 0;
	public static byte field_goto = -1;
	public static Vector field_new = new Vector();
	public static Vector a = new Vector();
	public static byte field_case = -1;
	public static byte field_void = 0;
	private static boolean field_else;
	public static String field_try;
	public static byte field_char;

	public aj() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 2228225:
		case 2228240:
			c_a5.fR = true;
			if (var0 == 2228240) {
				field_else = true;
			}
			break;
		case 2228226:
			c_a5.fR = true;
			var1.a(field_int);
			var1.a(field_byte);
			var1.a(field_for);
			var1.a(field_void);
			break;
		case 2228227:
			c_a5.fR = true;
			var1.a(field_byte);
			var1.a(field_for);
			if (field_long[0] == -1 && field_long[1] != -1) {
				field_long[0] = field_long[1];
				field_long[1] = -1;
			}

			var1.a(field_long[0]);
			var1.a(field_long[1]);
			break;
		case 2228228:
			c_a5.fR = true;
			var1.a(field_byte);
			var1.a((byte) 0);
			var1.a(field_for);
			break;
		case 2228229:
		case 2228230:
			c_a5.fR = true;
			var1.a(field_byte);
			var1.a((byte) 0);
			boolean var2 = false;
			var1.a((byte) field_new.size());

			int var3;
			for (var3 = 0; var3 < field_new.size(); ++var3) {
				var1.a((Byte) field_new.elementAt(var3));
			}

			for (var3 = 0; var3 < a.size(); ++var3) {
				var1.a((Byte) a.elementAt(var3));
			}

			if (var0 == 2228229) {
				var1.a(field_for);
			}
			break;
		case 2228231:
			c_a5.fR = true;
			var1.a(field_case);
		case 2228232:
		case 2228233:
		case 2228234:
		case 2228235:
		case 2228236:
		case 2228237:
		case 2228238:
		case 2228239:
		case 2228241:
		case 2228243:
		case 2228244:
		case 2228245:
		case 2228246:
		case 2228247:
		case 2228248:
		case 2228249:
		case 2228250:
		case 2228251:
		case 2228252:
		case 2228253:
		case 2228254:
		case 2228255:
		case 2228259:
		default:
			break;
		case 2228242:
		case 2228256:
		case 2228258:
		case 2228260:
			c_a5.fR = true;
			break;
		case 2228257:
			field_byte = (byte) c_r.mY[0];
			c_a5.fR = true;
			var1.a(field_byte);
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		short var5;
		switch (var0) {
		case -2145255416:
			if ((field_int = var1.method_if()) >= 0) {
				a7 var7 = (a7) c_a5.es.cf().elementAt(4);
				c_r var8 = (c_r) c_a5.es.cf().elementAt(7);
				if (field_do > 5) {
					var7.a(true, (byte) 5);
				} else {
					var7.a(true, field_do);
				}

				var7.fC = (byte) c_r.mY[2];
				short var12 = c_r.mY[1];
				var7.ft = true;
				var7.method_if(var12, false);
				var7.a(c_a5.gg);
				var7.a(true, c_a5.es);
				var8.a(false, c_a5.es);
				field_try = var8.mV[var8.mz];
				field_char = var8.ne[var8.mz];
				return;
			}
			break;
		case -2145255415:
			c_r var6 = (c_r) c_a5.es.cf().elementAt(7);
			byte var2 = var1.method_if();

			for (byte var9 = 0; var9 < var2; ++var9) {
				byte var11 = var1.method_if();
				var6.mQ[var11] = var1.method_byte();
				var5 = var1.method_new();
				var6.mW[var11] = var5;
				var6.mI[var11] = c_r.k((short) (var5 % 1000));
				var6.nu[var11] = var1.method_if();
				var6.mV[var11] = var1.method_goto();
				var6.ne[var11] = var1.method_if();
				var6.method_do(var11, var5);
				var6.method_if(var6.mV[var6.ep()], c_r.E(var6.ne[var6.ep()]));
			}

			if (field_else) {
				ah var10;
				(var10 = (ah) c_a5.es.cf().elementAt(14)).method_char(c_bm.bP);
				var10.a("此处放置原石");
				field_else = false;
			}

			a();
			return;
		case -2145255407:
			a();
			return;
		case -2145255391:
			if ((field_int = var1.method_if()) >= 0) {
				a7 var3 = (a7) c_a5.es.cf().elementAt(4);
				c_r var4 = (c_r) c_a5.es.cf().elementAt(7);
				var3.g(false);
				var3.fC = (byte) c_r.mY[2];
				var5 = c_r.mY[1];
				var3.ft = true;
				var3.method_if(var5, false);
				var3.a(c_a5.gg);
				var3.a(true, c_a5.es);
				var4.a(false, c_a5.es);
			}
		}

	}

	public static void method_if() {
		field_do += field_void;
		if (field_new.size() < 5) {
			field_byte = (byte) c_r.mY[0];
			field_new.addElement(new Byte(field_byte));
			a.addElement(new Byte(field_void));
		}

		c_a5.eQ.a(2228226);
	}

	public static void a() {
		if (field_byte != -1) {
			((c_r) c_a5.es.cf().elementAt(7)).a(false, c_a5.es);
			boolean var0 = true;
			var0 = true;
			a7 var2;
			(var2 = (a7) c_a5.es.cf().elementAt(4)).a(true, c_a5.es);
			var2.g(false);
			var2.ft = false;
			var2.a((bi) null);
			field_byte = -1;
			field_int = -1;
			field_for = 0;
			field_if = 0;
			field_do = 0;
			field_goto = -1;
			field_new = new Vector();
			a = new Vector();

			int var3;
			for (var3 = 0; var3 < field_long.length; ++var3) {
				field_long[var3] = -1;
			}

			for (var3 = 0; var3 < c_r.mY.length; ++var3) {
				c_r.mY[var3] = -1;
			}

			ah var4 = (ah) c_a5.es.cf().elementAt(14);
			if (c_a5.es.g9 != 2228256) {
				((ah) c_a5.es.cf().elementAt(12)).method_case(field_do);
				var4.method_char(c_bm.bP);
				var4.a("此处放置原石");
			} else {
				var4.method_char(c_bm.bP);
				var4.a("此处放置宝石");
			}

			((ah) c_a5.es.cf().elementAt(11)).a("0");
		}

	}
}
