import javax.microedition.io.Connector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
/**
 * 2021/01/20
 * @author 95739
 *
 */
public final class bo {
	public static String[] n;
	public static byte[] l;
	public static int[] G;
	public static String[] P;
	public static byte[] g;
	public static int[] K;
	public static byte[] I;
	public static byte q = 0;
	public static byte b = 0;
	public static byte[] s = new byte[2];
	public static String o;
	public static boolean D;
	private static byte field_try = 0;
	public static int N = 0;
	private static int field_void;
	public static byte t;
	public static int w = 0;
	public static byte field_char = 0;
	private static String field_byte = "106633552";
	public static byte C = 0;
	public static boolean y = false;
	public static String field_new;
	public static int e;
	private static String L;
	private static MessageConnection B;
	private static TextMessage E;
	public static int H;
	public static int x;
	private static int h;
	public static byte field_long;
	private static String A;
	public static boolean p = false;
	public static boolean j = false;

	public bo() {
	}

	public static byte[] method_if(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		int var2;
		a9 var3;
		switch (var0) {
		case 2424833:
		case 2424834:
		case 2424836:
		case 2424840:
		case 2424841:
		case 2424842:
		case 2424843:
		case 2425008:
		case 2425026:
			c_a5.fR = true;
			break;
		case 2424835:
		case 2425029:
			c_a5.fR = true;
			var1.a(q);
			break;
		case 2424839:
			c_a5.fR = true;
			var1.a((byte) 0);
			break;
		case 2424993:
			c_a5.fR = true;
			var1.a(q);
			var1.method_if(c_a5.gd);
			if (!D) {
				var1.method_do(field_void);
				if (t == 0) {
					var1.a((byte) c_as.c4);
				}
			} else {
				var1.method_do(K[N]);
				if (g[N] == 1) {
					var1.a(I[N]);
				} else if (g[N] == 0) {
					var1.a((byte) c_as.c4);
				}
			}

			var1.a(field_char);
			var1.method_if(c_a5.ik);
			break;
		case 2424994:
			c_a5.fR = true;
			var1.a(s[0]);
			break;
		case 2424995:
			c_a5.fR = true;
			var1.a(s[0]);
			var2 = N;
			var1.a((byte) var2);
			break;
		case 2424996:
			c_a5.fR = true;
			var1.method_do(w);
			break;
		case 2424997:
			c_a5.fR = true;
			var1.method_if(c_a5.ik);
			break;
		case 2424998:
			c_a5.fR = true;
			var1.a(b);
			var3 = null;
			String[] var4 = c_b5.method_do("name_password", 2);
			var1.method_if(var4[1]);
			break;
		case 2425009:
			c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
			var3 = (a9) c_a5.es.cf().elementAt(5);
			var1.method_if(c_a5.ik);
			var1.method_if(c_a5.iM);
			var1.method_do(Integer.parseInt(var3.cc().toString().trim()));
			break;
		case 2425010:
			var1.method_if(c_a5.ik);
			break;
		case 2425011:
			var1.method_if(c_a5.ik);
			break;
		case 2425012:
			var1.method_if(c_a5.ik);
			var1.a((byte) 7);
			var1.a(bk.field_if);
			var1.method_do(bk.field_char);
			break;
		case 2425013:
			var1.method_if(c_a5.ik);
			var1.a(bk.ay);
			var1.a(bk.field_if);
			var1.method_do(bk.field_char);
			break;
		case 2425024:
			c_a5.fR = true;
			var1.method_if(c_a5.ik);
			break;
		case 2425072:
			c_a5.fR = true;
			if (a7.fF == 22) {
				p = true;
			}

			if (a7.fF == 23) {
				j = true;
			}

			var1.a(a7.fF);
			var1.method_if(c_a5.ik);
			break;
		case 2425076:
			c_a5.fR = true;
			var1.a(aa.field_void[aa.field_do]);
			var1.a(aa.d);
			break;
		case 2425077:
			c_a5.fR = true;
			var1.method_if(c_a5.ik);
			break;
		case 2425078:
			c_a5.fR = true;
			var1.a(q);
			break;
		case 2425079:
		case 2425080:
			c_a5.fR = true;
			var1.a(q);
			var2 = N;
			var1.a((byte) var2);
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		String var7;
		switch (var0) {
		case -2145058656:
			field_void = var1.method_byte();
			t = var1.method_if();
			var1.method_if();
			return;
		case -2145058650:
			field_new = var1.method_goto();
			c_b5.method_case("大额充值地址 = " + field_new);
			if (field_new == null && field_new.equals("")) {
				c_b5.method_case("没有接收到大额充值地址，地址为空");
				return;
			}

			c_a5.fR = false;
			if (b == 0) {
				a("猛犸币大额充值", "点击“确定”转到猛犸币大额充值充值网页，点击“返回”返回游戏");
				return;
			}

			if (b == 1) {
				a("元宝充值", "点击“确定”转到元宝充值网页，点击“返回”返回游戏");
				if (c_a5.d6.size() > 0) {
					c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
					return;
				}
			}
			break;
		case -2145058649:
			A = var1.method_goto();
			return;
		case -2145058639:
			if (c_a5.gQ != null) {
				c_a5.gQ = null;
			}

			c_br.c6();
			var0 = var1.method_byte();
			int var6 = var1.method_byte();
			(c_a5.es = c_e.a("/cm/ui/charger.ui")).g9 = -1610612688;
			var7 = null;
			if (var0 != 0) {
				var7 = "恭喜您，充值" + var0 + "元成功，您已获得" + var0 * 100 + "点点数！您目前的点数余额为" + var6 + "点！";
			} else {
				var7 = "对不起，充值失败，请尝试重新充值或联系客服！";
			}

			((ak) c_a5.es.cf().elementAt(3)).method_if(var7);
			return;
		case -2145058638:
			if (c_a5.gQ != null) {
				c_a5.gQ = null;
			}

			var0 = var1.method_byte();
			var7 = null;
			if (var0 >= 0) {
				var7 = "您当前的点数余额为" + var0 + "点！";
			} else {
				var7 = "对不起，查询失败，请尝试重新查询或联系客服！";
			}

			((ak) c_a5.es.cf().elementAt(3)).method_if(var7);
			return;
		case -2145058637:
			if (c_a5.gQ != null) {
				c_a5.gQ = null;
			}

			var0 = var1.method_byte();
			var7 = null;
			if (var0 >= 0) {
				var7 = "您当前的点数余额为" + var0 + "点！";
			} else {
				var7 = "对不起，查询失败，请尝试重新查询或联系客服！";
			}

			((ak) c_a5.es.cf().elementAt(3)).method_if(var7);
			return;
		case -2145058636:
		case -2145058635:
			if (c_a5.gQ != null) {
				c_a5.gQ = null;
			}

			String var5 = var1.method_goto();
			c_br.c6();
			c_a5.es = c_e.a("/cm/ui/result.ui");
			if (var0 == -2145058636) {
				c_a5.es.g9 = -1610612640;
			} else if (var0 == -2145058635) {
				c_a5.es.g9 = -1610612639;
			}

			ak var4;
			(var4 = (ak) c_a5.es.cf().elementAt(3)).method_if(var5);
			var4.ap();
			return;
		case -2145058634:
			bk.aG = var1.method_goto();
			bk.field_void = var1.method_goto();
			bk.aQ = var1.method_goto();
			if ((bk.aT = var1.method_if()) == 2) {
				bk.al = var1.method_goto();
				bk.U = var1.method_goto();
				bk.aH = var1.method_goto();
			} else if (bk.aT == 3) {
				bk.al = var1.method_goto();
				bk.U = var1.method_goto();
				bk.aH = var1.method_goto();
				bk.aX = var1.method_goto();
			}

			bk.method_byte();
			bk.a();
			return;
		case -2145058623:
			byte var3;
			c_be.gM = new String[var3 = var1.method_if()];
			c_be.hE = new byte[var3];

			for (int var2 = 0; var2 < var3; ++var2) {
				c_be.hE[var2] = var1.method_if();
				c_be.gM[var2] = var1.method_goto();
			}

			return;
		case -2145058620:
			System.out.println("重新获取UserID");
			c_a5.ik = "";
			bk.method_byte();
			break;
		case -2145058575:
			q = var1.method_if();
			o = var1.method_goto();
			s[0] = var1.method_if();
			System.out.println("S_INCREMENT_GET_PAY = " + q + " 标题: " + o);
			return;
		}

	}

	public static void method_if(byte var0) {
		try {
			if (var0 == 1) {
				if (bk.aB != null) {
					field_byte = bk.method_int(bk.aB);
				}
			} else if (bk.a != null) {
				field_byte = bk.method_int(bk.a);
			}

			TextMessage var10000 = E = (TextMessage) (B = (MessageConnection) Connector.open(L = "sms://" + field_byte))
					.newMessage("text");
			StringBuffer var2 = null;
			var2 = new StringBuffer(4);
			String var10001;
			String var1;
			String var4;
			if (var0 == 1) {
				if (bk.aB != null) {
					if ((var4 = c_b5.a(c_b5.a(c_b5.a(bk.aB, "[name]", c_a5.n()), "[game]", "fengshen"), "[check]", A))
							.indexOf(64) > 0) {
						var4 = var4.substring(0, var4.indexOf(64));
					}

					var10001 = var4;
				} else {
					var10001 = null;
				}

				var1 = var10001;
				if (var10001 == null) {
					var2.append("AP").append(c_a5.n()).append(".fengshen").append(".").append(A);
				} else {
					var2 = new StringBuffer(var1);
				}
			} else {
				a9 var3;
				a9 var7;
				String var8;
				if (var0 == 2) {
					var7 = (a9) c_a5.es.cf().elementAt(4);
					var3 = (a9) c_a5.es.cf().elementAt(6);
					var1 = var7.cc().toString().trim();
					var8 = var3.cc().toString().trim();
					if (bk.a != null) {
						if ((var4 = c_b5.a(c_b5.a(bk.a, "[name]", var1), "[password]", var8)).indexOf(64) > 0) {
							var4 = var4.substring(0, var4.indexOf(64));
						}

						var10001 = var4;
					} else {
						var10001 = null;
					}

					var4 = var10001;
					if (var10001 == null) {
						var2.append("AGB").append(":").append(var1).append(":").append(var8);
					} else {
						var2 = new StringBuffer(var4);
					}
				} else if (var0 == 3) {
					var7 = (a9) c_a5.es.cf().elementAt(4);
					var3 = (a9) c_a5.es.cf().elementAt(6);
					var1 = var7.cc().toString().trim();
					var8 = var3.cc().toString().trim();
					if (bk.f != null) {
						if ((var4 = c_b5.a(c_b5.a(bk.f, "[name]", var1), "[password]", var8)).indexOf(64) > 0) {
							var4 = var4.substring(0, var4.indexOf(64));
						}

						var10001 = var4;
					} else {
						var10001 = null;
					}

					var4 = var10001;
					if (var10001 == null) {
						var2.append("AGD").append(":").append(var1).append(":").append(var8);
					} else {
						var2 = new StringBuffer(var4);
					}
				} else if (var0 == 4) {
					var4 = var8 = ((a9) c_a5.es.cf().elementAt(4)).cc().toString().trim();
					if (bk.m != null) {
						String var5;
						if ((var5 = c_b5.a(bk.m, "[name]", var4)).indexOf(64) > 0) {
							var5 = var5.substring(0, var5.indexOf(64));
						}

						var10001 = var5;
					} else {
						var10001 = null;
					}

					var1 = var10001;
					if (var10001 == null) {
						var2.append("AGC").append(":").append(var8);
					} else {
						var2 = new StringBuffer(var1);
					}
				}
			}

			var10000.setPayloadText(var2.toString().trim());
			if (var0 == 2 || var0 == 3 || var0 == 4) {
				B.send(E);
				y = true;
			}

		} catch (Exception var6) {
			var6.printStackTrace();
			if (var0 == 2 || var0 == 3 || var0 == 4) {
				y = false;
			}

		}
	}

	public static void a(int var0) {
		for (int var1 = 0; var1 < var0; ++var1) {
			try {
				++H;
				B.send(E);
			} catch (Exception var5) {
				--H;
				var5.printStackTrace();
			} finally {
				++h;
			}
		}

	}

	public static void method_int() {
		H = 0;
		h = 0;
	}

	public static boolean method_for() {
		return h >= e;
	}

	private static void a(String var0, String var1) {
		final Form var4 = new Form(var0);
		final Command var2 = new Command(c_bm.a2[2], 4, 0);
		final Command var3 = new Command(c_bm.a2[1], 3, 1);
		var4.append(var1);
		var4.addCommand(var2);
		var4.addCommand(var3);
		var4.setCommandListener(new CommandListener() {
			public final void commandAction(Command var1, Displayable var2x) {
				if (var1 == var2) {
					try {
						c_a5.dI.platformRequest(bo.field_new);
					} catch (Exception var3x) {
					}
				} else {
					if (var1 == var3) {
						var4.removeCommand(var2);
						var4.removeCommand(var3);
						c_a5.e8.setFullScreenMode(true);
						c_a5.dI.display.setCurrent(c_a5.e8);
					}

				}
			}
		});
		c_a5.dI.display.setCurrent(var4);
	}

	public static void method_do(byte var0) {
		C = var0;
		(new Thread() {
			public final void run() {
				bo.method_if(bo.C);
				c_a5.a((byte) 0, bo.y ? "命令已发送，请及时查收短信查看结果" : "发送失败", c_bm.a2[2], "", -1, -120);
			}
		}).start();
	}

	public static void method_if() {
		C = 1;
		method_if((byte) 1);
		method_int();
		(new Thread() {
			public final void run() {
				bo.a(bo.e);
			}
		}).start();
		field_long = 2;
		c_as.a((byte) 0, "正在充值，请您稍候...", "", "", -2, -2);
	}
}
