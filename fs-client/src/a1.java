/**
 * 2020/01/21
 * @author 95739
 *
 */
public final class a1 {
	public static int field_for = 67109379;
	public static String field_new = "";
	private static boolean field_int = true;
	public static boolean field_do = false;
	public static byte field_if = -1;

	private a1() {
	}

	public static byte a() {
		String var0 = null;

		try {
			if (Class.forName("javax.microedition.lcdui.a") != null) {
				return 5;
			}
		} catch (Exception var5) {
		}

		try {
			if (Class.forName("emulator.Emulator") != null) {
				return 1;
			}
		} catch (Exception var4) {
		}

		try {
			if (Runtime.getRuntime().totalMemory() == 8000000L) {
				return 2;
			}
		} catch (Exception var3) {
		}

		try {
			if ((var0 = System.getProperty("microedition.platform")) != null && var0.equals("SunMicrosystems_wtk")) {
				return 3;
			}
		} catch (Exception var2) {
		}

		try {
			if (Class.forName("java.applet.Applet") != null) {
				return 4;
			}
		} catch (Exception var1) {
		}

		return 0;
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		byte var2;
		switch (var0) {
		case 3:
			var1.method_do(c_a5.ek);
			break;
		case 4:
			var1.a(c_a5.eQ.field_try);
			break;
		case 65537:
			if (!field_int) {
				var2 = 18;
				var1.a((byte) var2);
			}

			var1.a(c_a5.c3);
			var1.method_if(c_a5.n());
			var1.method_if(c_a5.hC[1]);
			c_b5.method_case("GameLogin-cmd-C_LOGIN_FIRST");
			break;
		case 65539:
			bp.fM = 0;
			bp.fz = 0;

			try {
				c_be.gf.getHeight();
			} catch (Exception var3) {
				c_a5.dI.notifyDestroyed();
			}

			var1.a(c_a5.hg);
			var1.method_if(c_a5.gd);
			var1.method_if(bk.B);
			var1.method_if(c_a5.ik);
			var1.a(c_a5.fF);
			var1.a(Runtime.getRuntime().totalMemory());
			c_b5.method_case("GameLogin-cmd-C_LOGIN_ROLE");
			break;
		case 65544:
		case 65545:
		case 65550:
			c_a5.fR = true;
			break;
		case 65546:
			var1.a(c_a5.is);
			var1.method_do(field_for);
			var1.a((byte) 6);
			var1.method_if(c_a5.gd);
		case 65547:
		case 65551:
		default:
			break;
		case 65548:
			var1.method_if(c_a5.hC[0]);
			var1.method_if(c_a5.hC[1]);
			var1.method_if(c_a5.it);
			break;
		case 65557:
			var1.method_if(bk.a5);
			break;
		case 65558:
			var1.method_if(bk.a0);
			break;
		case 65568:
			var1.method_if(bk.F);
			break;
		case 65569:
			var1.method_if(c_a5.ik);
			break;
		case 117502:
			if (!field_int) {
				var2 = 18;
				var1.a((byte) var2);
			}

			var1.a(c_a5.c3);
			var1.method_do(field_for);
			var1.a((byte) 6);
			var1.method_if(c_a5.n());
			var1.method_if(c_a5.hC[1]);
			break;
		case 131071:
			if (!field_int) {
				var2 = 18;
				var1.a((byte) var2);
			}

			var1.a(c_a5.is);
			var1.method_do(field_for);
			var1.a((byte) 6);
			var1.method_if(c_a5.n());
			var1.method_if(c_a5.hC[1]);
			var1.method_if("l");
			int var4 = bk.aj;
			var1.a((byte) var4);
			var1.method_if(c_a5.it);
			var1.method_if(c_a5.hC[0]);
			c_b5.method_case("GameLogin-cmd-C_LOGIN_GAME");
			break;
		case 1114113:
			var1.method_if(c_a5.hC[0]);
			var1.method_if(c_a5.hC[1]);
			var1.method_if((String) null);
			c_b5.method_case("GameLogin-cmd-C_GAME_ENROL");
			break;
		case 1114114:
			c_b5.method_case("MainCanvas.m_bChoose=" + c_a5.hg);
			c_b5.method_case("MainCanvas.m_bCamp=" + c_a5.ci);
			c_b5.method_case("MainCanvas.m_bPhyle=" + c_a5.ck);
			c_b5.method_case("MainCanvas.m_bGender=" + c_a5.fW);
			c_b5.method_case("MainCanvas.m_bVocation=" + c_a5.ig);
			c_b5.method_case("MainCanvas.m_sName=" + c_a5.fY);
			var1.a(c_a5.hg);
			var1.a(c_a5.ck);
			var1.a(c_a5.fW);
			var1.a(c_a5.ig);
			var1.method_if(c_a5.fY);
			break;
		case 1114115:
			var1.method_if(c_a5.fc[0]);
			var1.method_if(c_a5.fc[1]);
			var1.method_if(c_a5.fc[2]);
			var1.method_if(c_a5.fc[3]);
			break;
		case 1114116:
		case 1114118:
		case 1114120:
			var1.a(c_a5.hg);
			break;
		case 1114119:
			var1.a(c_a5.hg);
			var1.method_if(c_be.gU[1]);
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		String var3;
		a9 var6;
		byte var9;
		switch (var0) {
		case -2147483644:
			c_a5.eQ.field_try = var1.method_new();
			c_a5.eQ.a(4);

			try {
				c_a5.eQ.method_char();
			} catch (Exception var5) {
				c_b5.method_case("加密命令出错");
			}

			var9 = var1.method_if();
			c_a5.eQ.j = new byte[var9];

			for (int var10 = 0; var10 < var9; ++var10) {
				c_a5.eQ.j[var10] = var1.method_if();
			}

			return;
		case -2147418111:
			field_if = var1.method_if();
			field_do = true;
			return;
		case -2147418109:
			var9 = var1.method_if();
			c_b5.method_case("GameLogin-cmd-S_ROLERESULT=" + var9);
			return;
		case -2147418107:
			c_b5.method_case("GameLogin-cmd-S_SERVERLIST");
			byte var2;
			c_a5.gH = new String[c_a5.fN = var2 = var1.method_if()];
			c_a5.hR = new String[c_a5.fN];
			c_a5.hs = new byte[c_a5.fN];

			for (var0 = 0; var0 < var2; ++var0) {
				var3 = var1.method_goto();
				String var11 = var1.method_goto();
				c_b5.method_case("----serverip----" + var11);
				c_a5.hs[var0] = var1.method_if();
				c_b5.method_case("--------------m_bjumpIP--------------" + 0);
				c_a5.gH[var0] = var3;
				c_a5.hR[var0] = var11;
			}

			c_f.method_byte().method_for();
			return;
		case -2147418098:
			var6 = null;
			String var7 = var1.method_goto();
			if (c_a5.ea != null) {
				c_a5.ea.l6.removeAllElements();
				c_a5.ea = null;
			}

			if (c_a5.V() != 0) {
				c_a5.method_try((byte) 0);
			}

			c_as.a((byte) 0, var7, "注册", "退出", -27, -12);
			return;
		case -2147418093:
			bq.field_byte = var1.method_goto();
			System.out.println("testDownloadUrl = " + bq.field_byte);
			c_a5.a((byte) 0, "版本号已不是最新，但仍能使用，请选择是否更新", "下载", "继续", -8, -2);
			return;
		case -2147418089:
			c_as.dM = var1.method_goto();
			bo.x = var1.method_byte();
			return;
		case -2147418078:
			c_a5.eQ.a(65569);
		default:
			return;
		case -2146369531:
			var3 = null;
			var3 = var1.method_goto();
			c_a5.hC[0] = var3;
			c_a5.hC[1] = var3;
			c_a5.method_do((byte) 14);
			c_as.a8();
			a9 var4 = (a9) c_a5.es.cf().elementAt(10);
			var6 = (a9) c_a5.es.cf().elementAt(11);
			a9 var8 = (a9) c_a5.es.cf().elementAt(12);
			var4.a(new StringBuffer(c_a5.hC[0]));
			var6.a(new StringBuffer(c_a5.hC[1]));
			var8.a(new StringBuffer(var3));
			c_b5.method_case("MainCanvas.name_password[0]=" + c_a5.hC[0]);
			c_b5.method_case("MainCanvas.name_password[1]=" + c_a5.hC[1]);
			return;
		case 1114117:
			c_b5.method_case("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		}
	}
}
