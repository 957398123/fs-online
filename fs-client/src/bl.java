/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class bl {
	public bl() {
	}

	public static void a(int var0, ac var1) {
		int var2;
		switch (var0) {
		case -2147155967:
			if (c_ao.ct) {
				c_ao.ct = false;
				c_z.ai = 1;
				c_ad.method_new();
				c_br.dm();
			}

			c_a5.h7 = var1.method_int(var1.field_do.length - 6);
			c_b5.method_case("-------------------接收UI界面");
			return;
		case -2147155966:
			c_a5.dO = var1.method_int(var1.field_do.length - 6);
			c_a5.fR = false;
			return;
		case -2147155965:
			c_b5.method_case("接收NPC提示");
			w.cc = (w.b6 = c_b5.method_if(var1.method_goto(), w.b7, c_a5.fq)).length * (c_a5.iG + 2) + 8;
			var0 = w.b7 / 10;
			int var4 = w.cc / 10;

			for (var2 = 0; var2 < 10; ++var2) {
				w.b9[var2] = (var2 + 1) * var0;
				w.b3[var2] = (var2 + 1) * var4;
			}

			w.ca = true;
			break;
		case -2147151599:
			c_a5.gV = c_b5.a(c_a5.gV, c_a5.gV.length, var1.method_int(var1.field_do.length - 6));
			c_a5.dW = c_b5.a(c_a5.dW, c_a5.dW.length, c_a5.gV[c_a5.gV.length - 1][0]);
			c_b5.method_case("接收UI弹板");
			return;
		case -2147147230:
			byte var3;
			c_as.db = new String[var3 = var1.method_if()];
			System.out.println("悬浮版收到" + var3 + "行内容");

			for (var2 = 0; var2 < var3; ++var2) {
				c_as.db[var2] = var1.method_goto();
				System.out.println("第" + (var2 + 1) + "行内容:" + c_as.db[var2]);
			}

			c_as.cu = var1.method_if();
			System.out.println("停留" + c_as.cu + "秒");
			c_as.dk = var1.method_byte();
			c_as.cB = 0;
			c_as.cX = 0;
			c_as.cY = true;
			return;
		case -2147129754:
			c_as.a8();
			return;
		case -2147121016:
			c_as.a6();
			return;
		case -2147112278:
			c_a5.fR = false;
			if (c_a5.es == null) {
				return;
			}

			if ((c_a5.es.g9 == 1900548 || c_a5.es.g9 == 1900546 || c_a5.es.g9 == 458753 || c_a5.es.g9 == 917507
					|| c_a5.es.g9 == 983041 || c_a5.es.g9 == 458760 || c_a5.es.g9 == 1179650 || c_a5.es.g9 == 1179658
					|| c_a5.es.g9 == 393230 || c_a5.es.g9 == 262187 || c_a5.es.g9 == 458771 || c_a5.es.g9 == 589825
					|| c_a5.es.g9 == 589828 || c_a5.es.g9 == 589833 || c_a5.es.g9 == 2424840 || c_a5.es.g9 == 2424833
					|| c_a5.es.g9 == 1966097 || c_a5.es.g9 == 589845 || c_a5.es.g9 == 589832 || c_a5.es.g9 == 2424835
					|| c_a5.es.g9 == 2425029 || c_a5.es.g9 == 393217 || c_a5.es.g9 == 2490390 || c_a5.es.g9 == 2490391)
					&& c_a5.d6.size() > 0) {
				c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
				return;
			}
			break;
		case -2147107909:
			c_a5.fR = true;
			return;
		case -2147090433:
			c_a5.h2 = var1.method_int(var1.field_do.length - 6);
			return;
		}

	}
}
