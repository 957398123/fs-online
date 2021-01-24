/**
 * 2021/01/20
 * 
 * @author 95739
 *
 */
public final class u {
	private static int b = 30;
	private byte field_int = 0;
	String field_case = "";
	private byte[] c = null;
	private String field_void = "";
	private String h = "";
	private static byte p = 0;
	static int t = 0;
	static String m = "";
	private byte o = 0;
	int field_for = 0;
	private byte n = 0;
	private static byte field_if = 0;
	private static boolean e = false;
	private short[] field_try = null;
	private String[] field_do = null;
	private int[] k = null;
	private byte[] g = null;
	private static u q;
	public static String d;
	public static String[] u;
	public static int l;
	private static int[] field_goto;
	private static int[] j;
	public static byte field_long;
	public static boolean[] r;
	public static boolean field_byte;

	public u() {
	}

	public static u method_if() {
		if (q == null) {
			q = new u();
		}

		return q;
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		int var3;
		switch (var0) {
		case 2686977:
			var1.method_if(c_f.method_case());
			var1.a(method_if().field_int);
			var1.method_do(method_if().field_for);
			var1.a(method_if().o);
			var1.method_if(m);
			var1.method_if(method_if().field_case);
			var3 = t;
			var1.a((byte) var3);
			if (b > 4) {
				b -= 4;
			}

			c_as.a((byte) 0, "命令发送中，预计需要等待" + b + "秒", "", "", -2, -2);
			break;
		case 2686978:
			var1.a(p);
			var0 = 0;
			if (t > 0) {
				if (t == 1) {
					var0 = bk.H.d().length;
				} else if (p == t) {
					var0 = bk.H.d().length - (p - 1 << 8);
				} else {
					var0 = 256;
				}

				byte[] var5 = new byte[var0];

				for (var3 = 0; var3 < var0; ++var3) {
					var5[var3] = bk.H.d()[var3 + (p - 1 << 8)];
				}

				method_if().c = var5;
			}

			var1.a((short) var0);
			var1.method_if(method_if().c);
			break;
		case 2686979:
			field_if = (byte) method_if().field_do.length;
			method_if().n = 0;
			e = false;
			var1.a(field_if);

			int var4;
			for (var4 = 0; var4 < field_if; ++var4) {
				method_if();
				// FIXME 存在争议
				// var3 = ((Object[])null)[var4] ? 0 : 1;
				var1.a((byte) 0);
				var1.method_do(method_if().field_try[var4]);
				var1.method_do(method_if().k[var4]);
				if (method_if().g[var4] == 1) {
					method_if().n = (byte) var4;
				}
			}

			for (var4 = 0; var4 < method_if().n; ++var4) {
				method_if();
				// FIXME 存在争议
//                if (((Object[])null)[var4]) {
//                	method_if().a(1, method_if().field_try[var4]);
//                    c_a5.eQ.a(2686977);
//                    break;
//                }
				method_if().a(1, method_if().field_try[var4]);
				c_a5.eQ.a(2686977);
				break;
			}

			for (var4 = method_if().n; var4 < field_if; ++var4) {
				method_if();
				// FIXME 存在争议
//				if (((Object[]) null)[var4]) {
//					method_if().a(1, method_if().field_try[var4]);
//					c_a5.eQ.a(2686977);
//					e = true;
//					return var1.method_long();
//				}
			}

			return var1.method_long();
		case 2686980:
			var1.a(field_long);

			for (byte var2 = 0; var2 < field_long; ++var2) {
				var1.a(r[var2]);
				var1.method_do(field_goto[var2]);
				var1.method_do(j[var2]);
			}
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		switch (var0) {
		case -2144796671:
			if (var1.method_if() == 1) {
				p = 1;
				c_a5.eQ.a(2686978);
				return;
			}

			c_as.a((byte) 0, "请求失败，请重试", "确定", "", -1, -2);
			c_a5.fR = false;
			return;
		case -2144796670:
			switch (var1.method_if()) {
			case 1:
				method_if().field_int = var1.method_if();
				method_if().field_void = var1.method_goto();
				method_if().h = var1.method_goto();
				c_a5.fR = true;
				bk.a(method_if().field_void, method_if().h);
				m = "http://" + method_if().field_void + method_if().h;
				if (b > 4) {
					b -= 4;
				}

				c_as.a((byte) 0, "信息获取中，预计需要等待" + b + "秒", "", "", -2, -2);
				return;
			case 2:
				return;
			case 3:
				c_as.a((byte) 0, var1.method_goto(), "确定", "", -1, -2);
				return;
			case 4:
				if (!e) {
					for (var0 = method_if().n; var0 < field_if; ++var0) {
						method_if();
						// FIXME 存在争议
//						if (((Object[]) null)[var0]) {
//							method_if().a(1, method_if().field_try[var0]);
//							c_a5.eQ.a(2686977);
//							return;
//						}
					}

					return;
				}

				return;
			case 5:
				++p;
				c_a5.eQ.a(2686978);
				return;
			default:
				c_as.a((byte) 0, "请求失败，请重试", "确定", "", -1, -2);
				c_a5.fR = false;
				return;
			}
		case -2144796669:
			method_if();
			if (var1.method_if() == 1) {
				bk.method_byte();
				method_if();
				var1.method_goto();
				byte var3;
				if ((var3 = var1.method_if()) > 0) {
					method_if();
					method_if().field_try = null;
					method_if().field_do = null;
					method_if().k = null;
					method_if().g = null;
					method_if().field_try = new short[var3];
					method_if().field_do = new String[var3];
					method_if().k = new int[var3];
					method_if().g = new byte[var3];

					for (int var2 = 0; var2 < var3; ++var2) {
						method_if().field_try[var2] = var1.method_new();
						method_if().field_do[var2] = var1.method_goto();
						method_if().k[var2] = var1.method_byte();
						method_if().g[var2] = var1.method_if();
					}
				}

				return;
			}
			break;
		case -2144796668:
			d = var1.method_goto();
			l = var1.method_byte();
			field_goto = new int[field_long = var1.method_if()];
			j = new int[field_long];
			u = new String[field_long];
			r = new boolean[field_long];

			for (var0 = 0; var0 < field_long; ++var0) {
				field_goto[var0] = var1.method_byte();
				j[var0] = var1.method_byte();
				u[var0] = var1.method_goto();
			}

			field_byte = true;
			return;
		case -2144796667:
			if (c_a5.gQ != null) {
				c_as.a8();
			}

			c_be.ci();
			return;
		case -2144796666:
			method_if().field_int = 0;
			p = 0;
			t = 0;
		}

	}

	private void a(int var1, int var2) {
		b = 45;
		field_int = 0;
		t = 0;
		m = "";
		o = 1;
		field_for = var2;
		c_a5.fR = true;
	}
}
