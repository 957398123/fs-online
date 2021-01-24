/**
 * 2020/01/21
 * 
 * @author 95739
 *
 */
public final class an {
	public static boolean a = false;

	public an() {
	}

	public static byte[] a(int var0) {
		c_a5.fR = true;
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 1245185:
			c_b5.method_case("--------------- 比较选择界面 -------------");
			break;
		case 1245186:
			if (a) {
				var1.method_do(bp.ag().method_new());
				c_b5.method_case("任务比较 自身ID " + bp.ag().method_new());
			} else if (c_be.ct()[0] == 2) {
				var1.method_do(c_l.g.method_new());
			} else {
				var1.method_do(bp.ag().method_new());
			}

			for (var0 = 0; var0 < c_be.cj().length; ++var0) {
				var1.a(c_be.ct()[var0]);
				var1.method_do(c_be.cj()[var0]);
				c_b5.method_case("任务比较 IndexType " + var0 + ":" + c_be.ct()[var0]);
				c_b5.method_case("任务比较 CompareIndex " + var0 + ":" + c_be.cj()[var0]);
			}

			if (a) {
				var1.method_do(c_bv.jI);
				c_b5.method_case("任务比较 任务ID " + c_bv.jI);
				a = false;
			}

			c_b5.method_case("--------------- 请求 比较界面 -------------");
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		switch (var0) {
		case -2146238462:
			c_a5.dh = var0;
			c_a5.gb = var1.method_int(var1.field_do.length - 6);
			c_b5.method_case("--------------- 接收 比较界面 -------------");
		default:
		}
	}
}
