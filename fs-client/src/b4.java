/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class b4 {
	public static int e = 0;
	public static int field_do = 0;
	public static String f;
	public static int field_case = 0;
	public static String field_byte;
	public static String field_goto;
	public static String d;
	public static String field_if;
	private static byte c = 0;
	public static boolean field_else = false;
	public static boolean field_char = true;

	public b4() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 2621441:
			bo.b = 1;
			c_a5.fR = true;
			break;
		case 2621442:
			bo.b = 0;
			c_a5.fR = true;
			break;
		case 2621443:
		case 2621444:
		case 2621447:
		case 2621448:
			c_a5.fR = true;
			break;
		case 2621445:
			c_a5.fR = true;
			var1.method_do(field_do);
			var1.a(bo.b);
			break;
		case 2621446:
			c_a5.fR = true;
			var1.a(bo.b);
			if (e == -100) {
				var1.method_do(field_do);
			} else {
				var1.method_do(0);
			}

			if (e == -100) {
				var1.method_do(field_case);
			} else {
				var1.method_do(e);
			}

			var1.method_if(d);
			var1.method_if(field_if);
			var1.method_if(field_goto);
			var1.method_if(field_byte);
			if (field_char) {
				var1.method_if("p");
			} else {
				var1.method_if("k");
			}
			break;
		case 2621449:
			c_a5.fR = true;
			if (e == -100) {
				var1.method_do(field_do);
			} else {
				var1.method_do(0);
			}

			var1.a(bo.b);
			var1.method_if(field_byte);
			break;
		case 2621450:
			c_a5.fR = true;
			c_a5.A();
			c_a5.eQ.a(2425024);
			break;
		case 2621451:
			c_a5.fR = true;
			if (e == -100) {
				var1.method_do(field_do);
			} else {
				var1.method_do(0);
			}
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		switch (var0) {
		case -2144862206:
			field_else = var1.method_case();
		default:
			return;
		case -2144796673:
			System.out.println("~~~~~~~~~~~~~~充值失败~~~~~~~~~~~~~~~");
			if (++c == 2) {
				System.out.println("第二次充值失败");
				c = 0;
				field_char = true;
				c_a5.eQ.a(2424998);
			} else {
				System.out.println("第一次充值失败");
				c_a5.eQ.a(2621446);
			}
		}
	}
}
