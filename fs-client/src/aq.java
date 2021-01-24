/**
 * 2021/01/20
 * @author 95739
 *
 */
public final class aq {
	public static byte a = -1;
	public static byte field_int = -1;
	public static byte field_if = -1;
	public static byte field_do = -1;
	public static byte field_for = -1;

	public aq() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 2031617:
		case 2031635:
			c_a5.fR = true;
			var1.a(field_do);
			break;
		case 2031618:
		case 2031620:
			c_a5.fR = true;
			var1.a(a);
			var1.a(field_int);
			var1.a(field_if);
			break;
		case 2031619:
			c_a5.fR = true;
			var1.a(a);
			break;
		case 2031621:
		case 2031636:
		case 2031648:
		case 2031649:
		case 2031650:
		case 2031651:
			c_a5.fR = true;
			break;
		case 2031622:
			c_a5.fR = true;
			var1.a(a);
			break;
		case 2031623:
			var1.a(a);
			var1.a(field_int);
			break;
		case 2031624:
		case 2031634:
			c_a5.fR = true;
			var1.a(a);
			var1.a(field_int);
			var1.a(field_if);
			break;
		case 2031625:
			c_a5.fR = true;
			var1.a(a);
			var1.a(field_int);
		case 2031626:
		case 2031627:
		case 2031628:
		case 2031629:
		case 2031630:
		case 2031631:
		case 2031632:
		case 2031638:
		case 2031639:
		case 2031640:
		case 2031641:
		case 2031642:
		case 2031643:
		case 2031644:
		case 2031645:
		case 2031646:
		case 2031647:
		default:
			break;
		case 2031633:
			c_a5.fR = true;
			var1.a(a);
			var1.a(field_int);
			break;
		case 2031637:
			c_a5.fR = true;
			var1.a(a);
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		switch (var0) {
		case -2145452017:
			if (var1.method_case()) {
				a(4, true, 0, false);
			}
		default:
		}
	}

	public static void a() {
		a = -1;
		field_int = -1;
		field_if = -1;
		field_do = -1;
	}

	public static void method_if() {
		a(4, true);
		a(6, false);
		c_r var0 = (c_r) c_a5.es.cf().elementAt(9);
		a = -1;
		field_int = -1;
		field_if = -1;
		field_for = -1;
		var0.a(false, c_a5.es);
		field_do = -1;

		for (int var1 = 0; var1 < c_r.mY.length; ++var1) {
			c_r.mY[var1] = -1;
		}

	}

	private static void a(int var0, boolean var1) {
		a7 var2;
		(var2 = (a7) c_a5.es.cf().elementAt(var0)).a(var1, c_a5.es);
		var2.g(false);
		var2.ft = false;
		var2.a((bi) null);
	}

	public static void a(int var0, boolean var1, int var2, boolean var3) {
		a7 var5 = (a7) c_a5.es.cf().elementAt(var0);
		c_r var4 = (c_r) c_a5.es.cf().elementAt(9);
		if (var2 == 1) {
			field_int = (byte) c_r.mY[0];
		} else if (var2 == 2) {
			field_if = (byte) c_r.mY[0];
		} else if (var2 == 3) {
			a = (byte) c_r.mY[0];
		}

		var5.a(var3, (byte) 1);
		var5.fC = (byte) c_r.mY[2];
		short var6 = c_r.mY[1];
		var5.ft = true;
		var5.method_if(var6, false);
		var5.a(c_a5.gg);
		var5.a(var1, c_a5.es);
		var4.a(!var1, c_a5.es);
		field_for = -1;
	}
}
