/**
 * 2021/01/21
 * @author 95739
 *
 */
public final class aa {
	public static boolean field_int;
	public static byte[] field_for;
	public static byte field_case;
	public static int[] field_goto;
	public static int[] field_try;
	public static byte field_if;
	public static String[] field_long;
	public static String[] a;
	public static short f = 0;
	public static int[] e;
	public static String[] field_else;
	public static short[] field_byte;
	public static short[] c;
	public static byte[] field_char;
	public static short[] b;
	public static byte field_new;
	public static byte field_do;
	public static byte d;
	public static byte[] field_void;

	public aa() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 3145729:
		case 3145730:
		case 3145731:
		case 3145732:
		case 3145734:
		case 3145735:
		case 3145738:
		case 3145741:
			c_a5.fR = true;
			break;
		case 3145733:
			c_a5.fR = true;
			if (c_a5.ea != null) {
				c_a5.ea.l6.removeAllElements();
				c_a5.ea = null;
				c_a5.method_try((byte) 0);
			}
			break;
		case 3145736:
			var1.a((byte) field_goto.length);

			for (var0 = 0; var0 < field_goto.length; ++var0) {
				var1.method_do(field_goto[var0]);
			}

			return var1.method_long();
		case 3145737:
			var1.a((byte) field_try.length);

			for (var0 = 0; var0 < field_try.length; ++var0) {
				var1.method_do(field_try[var0]);
			}

			var1.a(field_if);
			break;
		case 3145739:
			c_a5.fR = true;
			var1.a(field_do);
			break;
		case 3145740:
			a();
			int var2 = field_for.length;
			var1.a((byte) var2);

			for (var0 = 0; var0 < field_for.length; ++var0) {
				var1.a(field_for[var0]);
			}
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		int var2;
		byte var4;
		switch (var0) {
		case -2144337919:
			a = new String[var4 = var1.method_if()];

			for (var0 = 0; var0 < var4; ++var0) {
				a[var0] = var1.method_goto();
			}

			byte var3;
			field_for = new byte[var3 = var1.method_if()];

			for (var2 = 0; var2 < var3; ++var2) {
				field_for[var2] = var1.method_if();
			}

			return;
		case -2144337918:
		case -2144337917:
			e = new int[f = var1.method_new()];
			field_else = new String[f];
			field_byte = new short[f];
			c = new short[f];
			field_char = new byte[f];

			for (var2 = 0; var2 < f; ++var2) {
				e[var2] = var1.method_byte();
				field_else[var2] = var1.method_goto();
				field_byte[var2] = var1.method_new();
				c[var2] = (short) (field_byte[var2] % 1000);
				field_char[var2] = (byte) (field_byte[var2] / 1000 - 1);
			}

			field_new = var1.method_if();
			if (var0 == -2144337918) {
				field_goto = new int[field_new];
			} else if (var0 == -2144337917) {
				field_try = new int[field_new];
			}

			b = new short[field_new];

			for (var2 = 0; var2 < field_new; ++var2) {
				if (var0 == -2144337918) {
					field_goto[var2] = var1.method_byte();
				} else if (var0 == -2144337917) {
					field_try[var2] = var1.method_byte();
				}

				b[var2] = var1.method_new();
			}

			if (var0 == -2144337917) {
				field_if = var1.method_if();
				field_long = new String[var4 = var1.method_if()];

				for (var0 = 0; var0 < var4; ++var0) {
					field_long[var0] = var1.method_goto();
				}

				return;
			}
			break;
		case -2144337916:
		case -2144337915:
			field_int = var1.method_case();
		}

	}

	public static void a() {
		if (field_for == null) {
			field_for = new byte[3];

			for (int var0 = 0; var0 < field_for.length; ++var0) {
				field_for[var0] = 1;
			}
		}

	}
}
