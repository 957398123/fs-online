import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class c_q {
	public static String[] f = new String[3];
	public static long n = -1L;
	private static int i = 0;
	private static boolean d;
	private static int field_if = 0;
	public static boolean l;
	public static byte j;
	private static byte c = -1;
	private static byte p;
	public static byte e = 10;
	public static boolean q;
	public static byte t = 0;
	public static int field_void = 0;
	public static long field_long = -1L;
	public static byte g = 0;
	public static byte a = -1;
	public static boolean h = false;
	public static boolean field_else = false;
	public static long s = 0L;
	public static String field_new = "";
	public static String field_try = "";
	public static byte m = 0;
	public static short[][] field_int = new short[][] { { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 },
			{ -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 } };
	private static byte field_goto = 0;
	public static boolean r = false;
	public static int field_char = 0;
	public static boolean field_for = false;
	public static String[] field_byte;
	public static byte o;
	public static int[] u;
	public static String[] field_case;
	public static byte b;
	public static byte[] k;
	private static int field_do;

	public c_q() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 1703937:
			c_a5.fR = true;
			var1.method_do(c_l.g.method_new());
			c_b5.method_case("Mail.snd_Parse() C_MAIL_SEND_NORMAL...");
			return var1.method_long();
		case 1703938:
			c_a5.fR = true;
			var1.method_do(c_l.g.method_new());
			c_b5.method_case("Mail.snd_Parse() C_MAIL_SEND_COST...");
			return var1.method_long();
		case 1703939:
			c_a5.fR = true;
			var1.method_do(c_l.g.method_new());
			c_b5.method_case("Mail.snd_Parse() C_MAIL_INBOX...");
			return var1.method_long();
		case 1703940:
		case 1703941:
		case 1703953:
		case 1703955:
		case 1703962:
		case 1703963:
		case 1703964:
		case 1703965:
		case 1703966:
		case 1703967:
		default:
			return var1.method_long();
		case 1703942:
			c_a5.fR = true;
			var1.a(field_long);
			c_b5.method_case("Mail.snd_Parse() C_MAIL_INBOX_VIEW...");
			return var1.method_long();
		case 1703943:
			c_a5.fR = true;
			var1.a(field_long);
			c_b5.method_case("Mail.snd_Parse() C_MAIL_INBOX_DEL...");
			return var1.method_long();
		case 1703944:
			c_a5.fR = true;
			c_b5.method_case("Mail.snd_Parse() C_MAIL_INBOX_CLEAR...");
			return var1.method_long();
		case 1703945:
		case 1703958:
		case 1703959:
		case 1703960:
		case 1703961:
		case 1703968:
		case 1703969:
		case 1703971:
		case 1703972:
			c_a5.fR = true;
			return var1.method_long();
		case 1703946:
			c_a5.fR = true;
			return var1.method_long();
		case 1703947:
			c_b5.method_case("m_nPostage=" + e);
			c_a5.fR = true;
			if (!l) {
				var1.a(n);
			} else {
				var1.a(s);
			}

			var1.method_if(f[0]);
			var1.method_if(f[1]);
			var1.method_if(f[2]);
			var1.method_do(i);
			var1.a(d);
			c_b5.method_case("--------------------------------------m_bComeDownWith=" + d);
			var1.method_do(field_if);
			var1.a(l);
			var1.a(j);
			if (j > 0) {
				for (var0 = 0; var0 < field_int.length; ++var0) {
					if (field_int[var0][0] != -1) {
						c = (byte) field_int[var0][0];
						p = (byte) field_int[var0][3];
						var1.a(c);
						var1.a(p);
					}
				}
			}

			c_b5.method_case("Mail.snd_Parse() C_MAIL_SEND...");
			return var1.method_long();
		case 1703948:
			c_a5.fR = true;
			var1.a(a);
			am.a = false;
			c_b5.method_case("Mail.snd_Parse() C_MAIL_VIEW_GOODS...");
			return var1.method_long();
		case 1703949:
			c_a5.fR = true;
			var1.a(a);
			c_b5.method_case("Mail.snd_Parse() C_MAIL_GET_ONE...");
			return var1.method_long();
		case 1703950:
			c_a5.fR = true;
			c_b5.method_case("Mail.snd_Parse() C_MAIL_GET_ALL...");
			return var1.method_long();
		case 1703951:
			c_a5.fR = true;
			c_b5.method_case("Mail.snd_Parse() C_MAIL_GET_MONEY...");
			return var1.method_long();
		case 1703952:
			c_a5.fR = true;
			c_b5.method_case("Mail.snd_Parse() C_MAIL_RETURN...");
			return var1.method_long();
		case 1703954:
			c_a5.fR = true;
			var1.a((byte) c_r.mE[c_a5.em][0]);
			am.a = false;
			return var1.method_long();
		case 1703956:
			c_a5.fR = true;
			StringBuffer var4;
			(var4 = new StringBuffer(4)).append("小屏幕通用版:");
			int var2 = a1.field_for;
			var4.append(String.valueOf(var2 >>> 24)).append(".");
			var2 = a1.field_for;
			var4.append(String.valueOf(var2 >>> 16 & 255)).append(".");
			var2 = a1.field_for;
			var4.append(String.valueOf(var2 >>> 8 & 255)).append(".");
			var2 = a1.field_for;
			var4.append(String.valueOf(var2 & 255));
			ak var5 = (ak) c_a5.es.cf().elementAt(3);
			a9 var3 = (a9) c_a5.es.cf().elementAt(4);
			var1.a(o);
			var1.method_if(var5.as());
			var1.method_if(var4.toString());
			var1.method_if(var3.cc().toString().trim());
			if (b != 5) {
				var1.method_do(0);
				return var1.method_long();
			}

			var1.method_do(field_do);
			b = 0;
			break;
		case 1703957:
			c_b5.method_case("Mail.snd_Parse() C_MAIL_BACK_MAIL...");
			return var1.method_long();
		case 1703970:
			c_a5.fR = true;
			field_do = u[o];
			var1.method_do(field_do);
			var1.a(b);
			if (b == 5) {
				o = k[o];
				c_a5.eQ.a(1703971);
				return var1.method_long();
			}
		}

		c_be.cn();
		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		switch (var0) {
		case -2145779711:
		case -2145779710:
		case -2145779707:
			c_b5.method_case("Mail.rec_Parse() S_MAIL_RECEIVE_NORMAL or COST...");
			c_a5.dh = var0;
			c_a5.gb = var1.method_int(var1.field_do.length - 6);
			return;
		case -2145779709:
			c_b5.method_case("Mail.rec_Parse() S_MAIL_NEW...");
			byte var3;
			if ((var3 = var1.method_if()) == 0) {
				c_b5.method_case("没有新邮件！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				h = false;
				return;
			}

			if (var3 == 1) {
				c_b5.method_case("有新邮件！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				h = true;
				return;
			}
			break;
		case -2145779708:
			field_else = var1.method_case();
			c_b5.method_case("Mail.rec_Parse() S_MAIL_PAY_STATE..." + (field_else ? "已付费" : "未付费"));
			a9 var2;
			if ((var2 = (a9) c_a5.es.cf().elementAt(13)) != null) {
				var2.a(new StringBuffer("0"));
				return;
			}
		case -2145779706:
		case -2145779705:
		case -2145779704:
		case -2145779703:
		case -2145779702:
		case -2145779701:
		case -2145779700:
		case -2145779699:
		case -2145779698:
		case -2145779697:
		case -2145779696:
		case -2145779695:
		case -2145779694:
		default:
			break;
		case -2145779693:
			field_void = var1.method_byte();
			c_b5.method_case("-----------------------m_nBackpackMoney--------------=" + field_void);
		}

	}

	public static void method_do() {
		final Form var0 = new Form("编辑邮件");
		final TextField var1 = new TextField("请输入收件人姓名", "", 6, 0);
		final TextField var2 = new TextField("请输入邮件主题", "", 6, 0);
		final TextField var3 = new TextField("请输入邮件内容", "", 50, 0);
		var0.append(var1);
		var0.append(var2);
		var0.append(var3);
		if (f[0] != null) {
			var1.setString(f[0]);
		}

		if (f[1] != null) {
			var2.setString(f[1]);
		}

		if (f[2] != null) {
			var3.setString(f[2]);
		}

		final Command var4 = new Command(c_bm.a2[2], 4, 0);
		final Command var5 = new Command(c_bm.a2[1], 3, 1);
		var0.addCommand(var4);
		var0.addCommand(var5);
		var0.setCommandListener(new CommandListener() {
			public final void commandAction(Command var1x, Displayable var2x) {
				a9 var6 = (a9) c_a5.es.cf().elementAt(3);
				a9 var3x = (a9) c_a5.es.cf().elementAt(4);
				ak var4x = (ak) c_a5.es.cf().elementAt(5);
				if (var1x == var4) {
					if (c_q.t == 1 && !c_q.f[0].equals(var1.getString())) {
						c_q.n = -1L;
					}

					c_q.f[0] = var1.getString();
					c_q.f[1] = var2.getString();
					if (var3.getString().equals("")) {
						c_q.f[2] = "";
					} else {
						c_q.f[2] = var3.getString();
					}

					Alert var5x;
					if (!c_a5.a(var1.getString(), (byte) 2)) {
						var5x = new Alert(c_bm.a2[9], "您输入的玩家名称含有非法字符请重新输入", (Image) null, AlertType.ERROR);
						var1.setString("");
						c_a5.dI.display.setCurrent(var5x, var0);
						if (!c_q.f[0].equals("")) {
							c_q.f[0] = "";
						}

						c_q.field_goto = 1;
					} else if (!c_a5.a(var2.getString(), (byte) 2)) {
						var5x = new Alert(c_bm.a2[9], "您输入的邮件主题含有非法字符请重新输入", (Image) null, AlertType.ERROR);
						var2.setString("");
						c_a5.dI.display.setCurrent(var5x, var0);
						if (!c_q.f[1].equals("")) {
							c_q.f[1] = "";
						}

					} else if (!c_a5.a(var3.getString(), (byte) 3)) {
						var5x = new Alert(c_bm.a2[9], "您输入的邮件内容含有非法字符请重新输入", (Image) null, AlertType.ERROR);
						var3.setString("");
						c_a5.dI.display.setCurrent(var5x, var0);
						if (!c_q.f[2].equals("")) {
							c_q.f[2] = "";
						}

					} else {
						var6.a(new StringBuffer(c_q.f[0]));
						var3x.a(new StringBuffer(c_q.f[1]));
						var4x.method_if(c_q.f[2]);
						var4x.ap();
						c_a5.dI.display.setCurrent(c_a5.e8);
					}
				} else {
					if (var1x == var5) {
						var0.removeCommand(var4);
						var0.removeCommand(var5);
						if (c_q.field_goto == 1) {
							var6.a(new StringBuffer(""));
							c_q.field_goto = 0;
						}

						c_a5.e8.setFullScreenMode(true);
						c_a5.dI.display.setCurrent(c_a5.e8);
					}

				}
			}
		});
		c_a5.dI.display.setCurrent(var0);
	}

	public static void method_for() {
		a9 var0 = (a9) c_a5.es.cf().elementAt(3);
		a9 var1 = (a9) c_a5.es.cf().elementAt(4);
		ak var2 = (ak) c_a5.es.cf().elementAt(5);
		a9 var3 = (a9) c_a5.es.cf().elementAt(13);
		if ((!var0.cc().toString().trim().equals("") || !var1.cc().toString().trim().equals(""))
				&& !var0.cc().toString().trim().equals("")) {
			if (var1.cc().toString().trim().equals("")) {
				c_as.a((byte) 0, "请填写邮件主题", "确定", "", -1, -2);
			} else {
				if (var2.as().equals("")) {
					f[2] = "";
				}

				if (c_a5.es.g9 != 1703937 && c_a5.es.g9 != 1703952) {
					if (c_a5.es.g9 == 1703938) {
						if (j <= 0) {
							c_as.a((byte) 0, "您的付费邮件中没有物品", "确定", "", -1, -2);
							return;
						}

						if (Integer.parseInt(var3.cc().toString().trim()) == 0 && j <= 0
								|| Integer.parseInt(var3.cc().toString().trim()) == 0) {
							c_as.a((byte) 0, "请您设定收款金额", "确定", "", -1, -2);
							return;
						}

						d = true;

						try {
							field_if = Integer.parseInt(var3.cc().toString().trim());
						} catch (NumberFormatException var5) {
							var5.printStackTrace();
						}
					}
				} else {
					d = false;
					i = Integer.parseInt(var3.cc().toString().trim());
					if (field_void - i < e) {
						c_b5.method_case("m_nPostage=" + e);
						c_b5.method_case("m_nBackpackMoney=" + field_void);
						c_b5.method_case("m_nRemit=" + i);
						c_as.a((byte) 0, "您已经没有足够的金钱支付邮费了！", "确定", "", -1, -2);
						return;
					}

					try {
						if ((i = Integer.parseInt(var3.cc().toString().trim())) >= field_void - e) {
							String var7 = "";

							try {
								var7 = Integer.toString(i);
							} catch (NumberFormatException var4) {
							}

							var3.method_void(var7);
							if (i > 0 && i >= field_void - e) {
								c_as.a((byte) 0, "您是否要汇出您的全部金钱？", "确定", "取消", 1703947, -1);
								return;
							}

							c_a5.eQ.a(1703947);
							return;
						}
					} catch (NumberFormatException var6) {
						i = 0;
					}
				}

				c_a5.eQ.a(1703947);
			}
		} else {
			c_as.a((byte) 0, "请填写收件人", "确定", "", -1, -2);
		}
	}

	public static void a() {
		a9 var0 = (a9) c_a5.es.cf().elementAt(3);
		a9 var1 = (a9) c_a5.es.cf().elementAt(4);
		ak var2 = (ak) c_a5.es.cf().elementAt(5);
		a9 var3 = (a9) c_a5.es.cf().elementAt(13);
		ah var4 = (ah) c_a5.es.cf().elementAt(15);
		var0.method_void("");
		var1.method_void("");
		var2.method_if("");
		var3.method_void("0");
		var4.a("10");

		for (int var5 = 0; var5 < f.length; ++var5) {
			f[var5] = null;
		}

		c_a5.em = 0;
		t = 0;
		l = false;
		n = -1L;
		i = 0;
		d = false;
		field_if = 0;
		j = 0;
		c = 0;
		p = 0;
		q = false;
		m = 0;
	}

	public static void method_if() {
		ah var0 = (ah) c_a5.es.cf().elementAt(15);
		if (j > 0) {
			e = (byte) (q ? 10 * j + 20 : 10 * j + 10);
		} else {
			e = (byte) (q ? 20 : 10);
		}

		try {
			var0.a(Integer.toString(e));
		} catch (NumberFormatException var2) {
			var2.printStackTrace();
		}

		int var1;
		a9 var3;
		if ((var1 = Integer.parseInt((var3 = (a9) c_a5.es.cf().elementAt(13)).cc().toString().trim())) <= 0) {
			var3.a(new StringBuffer(Integer.toString(0)));
		} else {
			if (var1 + e >= field_void && (c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703952)) {
				if ((var1 = field_void - e) > 0) {
					var3.a(new StringBuffer(Integer.toString(var1)));
					return;
				}

				var3.a(new StringBuffer(Integer.toString(0)));
			}

		}
	}

	public static void method_int() {
		n = -1L;
		i = 0;
		d = false;
		field_if = 0;
		l = false;
		j = 0;
		c = -1;
		p = 0;
		e = 0;
		q = false;
		t = 0;
		field_void = 0;
		field_long = -1L;
		g = 0;
		a = -1;
		h = false;
		field_else = false;
		s = 0L;
		field_new = "";
		field_try = "";
		m = 0;
		field_goto = 0;
	}
}
