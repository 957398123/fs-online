import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

/**
 * 2021/01/23
 * 
 * @author 95739
 *
 */
public final class c_be extends ba {
	public byte hD = 0;
	private Vector hc = new Vector();
	public int g9 = 0;
	public byte ht = 0;
	private String gE = "";
	public static byte gL = -1;
	public static short gp = 0;
	private static String gn;
	private static String gl;
	public static boolean g8 = false;
	public static boolean g1;
	public ba hf = null;
	private static byte[] g4 = new byte[] { -1, -1 };
	private static int[] gw = new int[] { -1, -1 };
	public static int gs = 0;
	public static int hm = 0;
	public static boolean hd = false;
	public static byte hH = 0;
	public static boolean hC = false;
	public static int gG = 0;
	private byte hB = 0;
	private byte g6 = 0;
	private byte gz = 0;
	private boolean gV;
	private int gS;
	public static Image gf = null;
	static long gd;
	bk gT = null;
	public static a3 gu;
	public static boolean gJ;
	public static boolean hp = false;
	private static int[] hy = new int[] { 16777215, 16711680 };
	public static String[] gU = new String[2];
	public static int[] hl;
	public static int[] hk;
	public static byte[] gq;
	public static String[] gM;
	public static byte[] hE;
	public static int g3 = 0;

	public c_be(short var1, short var2, short var3, short var4) {
		super((short) 0, (short) 0, var3, var4, (c_be) null);
		gL = -1;
	}

	public final void c(String var1) {
		if (!c_a5.gZ) {
			this.gE = var1;
			this.ck();
		}

	}

	public final void ck() {
		if (this.gE.length() > 0) {
			c_ad.a(this.gE);
		} else {
			c_ad.a("");
		}
	}

	public static byte[] ct() {
		return g4;
	}

	public static int[] cj() {
		return gw;
	}

	public static void a(byte var0, int var1) {
		if (gw[0] == -1) {
			g4[0] = var0;
			gw[0] = var1;
			switch (c_a5.es.g9) {
			case 1245185:
			case 1245186:
				return;
			default:
				c_a5.eQ.a(1245185);
			}
		} else {
			g4[1] = var0;
			gw[1] = var1;
			c_a5.eQ.a(1245186);
		}
	}

	public static void cr() {
		for (int var0 = 0; var0 < 2; ++var0) {
			g4[var0] = -1;
			gw[var0] = -1;
		}

	}

	public final void cg() {
		int var1 = 0;

		for (int var2 = at.field_int.length; var1 < var2; ++var1) {
			at.field_int[var1] = -1;
		}

		for (var1 = 0; var1 < this.hc.size(); ++var1) {
			if ((ba) this.hc.elementAt(var1) instanceof c_r) {
				c_r var3;
				(var3 = (c_r) this.hc.elementAt(var1)).mF[0] = var3.mF[1] = -1;
				if (var3.r == 6 && var3.el() == 2) {
					bs.method_if(true);
				}

				if (var3.r == 29) {
					bs.method_if(true);
				}
			}
		}

		at.field_new = 0;
	}

	public static void cx() {
		switch (c_r.dS()) {
		case 1:
			((a7) c_a5.es.hc.elementAt(9)).h(true);
			((a7) c_a5.es.hc.elementAt(10)).h(true);
			return;
		case 2:
			((a7) c_a5.es.hc.elementAt(16)).h(true);
			((a7) c_a5.es.hc.elementAt(17)).h(true);
			return;
		case 3:
			((a7) c_a5.es.hc.elementAt(18)).h(true);
			((a7) c_a5.es.hc.elementAt(19)).h(true);
		default:
		}
	}

	public static void ch() {
		gs = 0;
		hm = 0;
		c_r.dX();
		a7.ej = false;
		a7.em = false;
		hH = 0;
		hd = false;
	}

	public final void a(Graphics var1) {
		try {
			ba.j();
			ba.r();
			ba.method_int();
			ba.method_byte();
			ba.method_goto();
			ba.method_void();
			ba.x();
			ba.a();
		} catch (Exception var20) {
		}

		var1.setColor(c_bm.bY);
		var1.fillRect(0, 0, c_a5.ic, c_a5.il);
		ba var2 = null;
		ba var3 = null;
		ba var4 = null;
		c_y var5 = null;
		c_z.a().method_if(var1, this.g9);
		int var6 = 0;

		int var7;
		ba var8;
		for (var7 = this.hc.size(); var6 < var7; ++var6) {
			if ((var8 = (ba) this.hc.elementAt(var6)) instanceof c_y) {
				var5 = (c_y) var8;
			}

			ah var9;
			if (this != null && (this.g9 == 393225 || this.g9 == 393229 || g1)) {
				if (!(var8 instanceof ah) && !(var8 instanceof ak)) {
					var1.setClip(0, 0, c_a5.ic, c_a5.il);
					var8.a(var1);
				} else {
					var1.setClip(var5.I[0], var5.I[1] + 2, var5.I[2], var5.I[3] - 10);
					var8.a(var1);
					var1.setClip(0, 0, c_a5.ic, c_a5.il);
				}
			} else if (this != null && this.g9 == 2293873 && var6 == 4) {
				if (var8 instanceof ah) {
					var9 = (ah) var8;
					if (!"".equals(var9.aj())) {
						var1.setColor(8519935);
						var1.fillRect(12, var9.method_long(), c_a5.ic - 24, c_a5.iG);
						var1.setColor(16777215);
						var9.a(var1, var9.aj(), 24, var9.method_long(), c_a5.ic - 48, (byte) 0, (byte) 3, true);
					}
				}
			} else if (this != null && c_a5.method_else() == 18 && var6 == 4) {
				((ah) var8).a(var1, 16711680);
			} else if (this != null && c_a5.method_else() == 17 && var6 == 16) {
				if (var8 instanceof ah) {
					if (!(var9 = (ah) var8).q()) {
						if (var9.aj().equals("修改昵称")) {
							((ah) var8).a(var1, 16711680);
						} else {
							((ah) var8).a(var1, 6045209);
						}
					} else {
						var9.a(var1);
					}
				}
			} else {
				((ba) this.hc.elementAt(var6)).a(var1);
			}

			if (((ba) this.hc.elementAt(var6)).field_byte && ((ba) this.hc.elementAt(var6)).q()) {
				var2 = (ba) this.hc.elementAt(var6);
			}

			if ((ba) this.hc.elementAt(var6) instanceof c_r && ((ba) this.hc.elementAt(var6)).q()) {
				var3 = (ba) this.hc.elementAt(var6);
			}

			if ((ba) this.hc.elementAt(var6) instanceof a7 && ((ba) this.hc.elementAt(var6)).q()) {
				var4 = (ba) this.hc.elementAt(var6);
			}

			try {
				switch (this.g9) {
				case 393219:
					var9 = (ah) this.hc.elementAt(36);
					ah var10 = (ah) this.hc.elementAt(33);
					ah var11 = (ah) this.hc.elementAt(35);
					if (var10.al() >= var11.al()) {
						int[] var34 = new int[] { c_bm.ci, c_bm.y, c_bm.F };
						int[] var26 = new int[] { c_bm.ci, c_bm.ci, c_bm.field_try };
						var9.a(var1, var34, var26, 4);
					}
				}
			} catch (Exception var19) {
			}
		}

		var6 = 0;

		for (var7 = this.hc.size(); var6 < var7; ++var6) {
			if ((var8 = (ba) this.hc.elementAt(var6)).q() && var8.method_if() && var8.field_else && c_a5.gQ == null) {
				if (var8.m != 0L && System.currentTimeMillis() - var8.m > 4000L || var8.field_if) {
					var8.field_else = false;
				}

				if (var8.n != 0L && System.currentTimeMillis() - var8.n > 2000L) {
					var8.method_if(var1);
					if (var8.e) {
						var8.m = System.currentTimeMillis();
						var8.e = false;
					}

					if (c_a5.method_byte(-1)) {
						var8.field_if = true;
					}
				}
			}
		}

		if (bp.ag().al()) {
			if (c_a5.ht % 4 < 2) {
				var1.setColor(hy[0]);
			} else {
				var1.setColor(hy[1]);
			}

			var1.drawRect(0, 0, c_a5.ic - 1, c_a5.il - 1);
			var1.drawRect(1, 1, c_a5.ic - 3, c_a5.il - 3);
		}

		a7 var22;
		a7 var23;
		if (this.g9 == 2097155) {
			var22 = (a7) c_a5.es.hc.elementAt(8);
			var23 = (a7) c_a5.es.hc.elementAt(7);
			a7 var28 = (a7) c_a5.es.hc.elementAt(9);
			if (by.field_do) {
				c_a5.gg.method_if(var1, var22.k + (var22.method_for() >> 1) - 7, var22.j + (var22.z() >> 1) - 7,
						by.field_byte[by.field_new]);
			}

			if (!by.d) {
				if (by.field_do && by.f) {
					if (by.field_long > by.e) {
						if (c_a5.ht % 9 == 1) {
							by.field_new = by.a;
							++this.hB;
						}

						if (this.hB >= 4) {
							this.hB = 0;
							by.a();
						}
					} else if (by.field_long >= 0 && by.field_long < by.e / 2) {
						++by.field_new;
					} else if (by.field_long >= by.e / 2 && by.field_long < by.e - 1) {
						if (c_a5.ht % 3 == 1) {
							by.field_new += c_b5.a(0, 6);
						}
					} else if (by.field_long >= by.e - 1 && c_a5.ht % 7 == 1) {
						by.field_new += c_b5.a(0, 6);
					}

					if (by.field_new > 6) {
						++by.field_long;
						by.field_new = 0;
					}
				}
			} else {
				var1.setColor(c_bm.cE);
				if (this.g6 % 2 == 0) {
					var1.drawString("阴", var23.k + (16 - c_b5.method_do("阴")) / 2, var23.j + (16 - c_a5.iG) / 2, 20);
				} else if (this.g6 % 2 == 1) {
					var1.drawString("阳", var28.k + (16 - c_b5.method_do("阳")) / 2, var28.j + (16 - c_a5.iG) / 2, 20);
				}

				if (this.g6 >= 0 && this.g6 <= 20) {
					if (c_a5.ht % 2 == 1) {
						++this.g6;
					}
				} else if (this.g6 >= 20 && this.g6 < 40 && c_a5.ht % 6 == 1) {
					++this.g6;
				}

				if (this.g6 >= 35) {
					by.d = false;
					this.gV = true;
					if (by.field_void) {
						if (by.field_case == 1) {
							var23.a(true, c_a5.es);
							var28.a(false, c_a5.es);
						} else if (by.field_case == 2) {
							var28.a(true, c_a5.es);
							var23.a(false, c_a5.es);
						}
					} else if (by.field_case == 1) {
						var23.a(false, c_a5.es);
						var28.a(true, c_a5.es);
					} else if (by.field_case == 2) {
						var28.a(false, c_a5.es);
						var23.a(true, c_a5.es);
					}
				}
			}

			if (this.g6 == 35) {
				++this.gz;
			}

			if (this.gV && this.gz > 15) {
				this.gV = false;
				by.field_case = 0;
				this.g6 = 0;
				by.a();
				this.gz = 0;
			}
		} else if (this.g9 == 1376260) {
			var22 = (a7) c_a5.es.hc.elementAt(14);
			var23 = (a7) c_a5.es.hc.elementAt(15);
			if (a7.ej) {
				var1.setColor(16746240);
			} else {
				var1.setColor(6154240);
			}

			var1.fillTriangle(var22.v() - 3, var22.method_long() + 6, var22.v() + 6, var22.method_long() + 16,
					var22.v() + 16, var22.method_long() + 6);
			var1.fillRect(var22.v() + 1, var22.method_long() - 4, 11, 10);
			if (a7.em) {
				var1.setColor(16746240);
			} else {
				var1.setColor(6154240);
			}

			var1.fillTriangle(var23.v() - 4, var23.method_long() + 10, var23.v() + 6, var22.method_long() - 2,
					var23.v() + 16, var23.method_long() + 10);
			var1.fillRect(var23.v() + 1, var23.method_long() + 9, 11, 10);
		} else if (this.g9 == 1703939) {
			c_bg var24 = (c_bg) c_a5.es.hc.elementAt(3);
			var1.setClip(var24.v(), var24.method_long(), var24.method_for(), var24.z() - 10);

			for (var7 = 0; var7 < gq.length; ++var7) {
				a(var1, hl[var7], hk[var7], gq[var7]);
			}

			var1.setClip(0, 0, c_a5.ic, c_a5.il);
		} else if (this.g9 != 2425024 && this.g9 != 2425077) {
			a9 var27;
			a9 var30;
			c_ao var31;
			ay var38;
			String var40;
			String var42;
			if (this.g9 == 2621443) {
				var27 = (a9) c_a5.es.hc.elementAt(4);
				var30 = (a9) c_a5.es.hc.elementAt(6);
				var31 = (c_ao) this.hc.elementAt(1);
				var38 = (ay) this.hc.elementAt(7);
				ak var39 = (ak) this.hc.elementAt(8);
				if (!var27.q() && !var30.q()) {
					if (var38.q()) {
						if (var38.bm() == var38.bj()) {
							var31.a("充值 ", 0);
						} else {
							var31.a("选择", 0);
						}
					} else if (var39.q()) {
						var31.a("", 0);
					}
				} else {
					var42 = var27.cc().toString().trim();
					var40 = var30.cc().toString().trim();
					if (var42 != null && !"".equals(var42) && var40 != null && !"".equals(var40)) {
						var31.a("充值", 0);
					} else {
						var31.a("输入", 0);
					}
				}
			} else if (this.g9 == 2621445) {
				var27 = (a9) c_a5.es.hc.elementAt(4);
				var30 = (a9) c_a5.es.hc.elementAt(6);
				var31 = (c_ao) this.hc.elementAt(1);
				var38 = (ay) this.hc.elementAt(7);
				ay var41 = (ay) this.hc.elementAt(8);
				if (!var27.q() && !var30.q()) {
					if (var38.q()) {
						if (var38.bm() == var38.bj()) {
							var31.a("充值 ", 0);
						} else {
							var31.a("选择", 0);
						}
					} else if (var41.q()) {
						var31.a("", 0);
					}
				} else {
					var42 = var27.cc().toString().trim();
					var40 = var30.cc().toString().trim();
					if (var42 != null && !"".equals(var42) && var40 != null && !"".equals(var40)) {
						var31.a("充值", 0);
					} else {
						var31.a("输入", 0);
					}
				}
			} else if (this.g9 == 2621447) {
				var27 = (a9) c_a5.es.hc.elementAt(5);
				var30 = (a9) c_a5.es.hc.elementAt(7);
				var31 = (c_ao) this.hc.elementAt(1);
				if (var27.q() || var30.q()) {
					String var44 = var27.cc().toString().trim();
					var40 = var30.cc().toString().trim();
					if (var44 != null && !"".equals(var44) && var40 != null && !"".equals(var40)) {
						var31.a("充值", 0);
					} else {
						var31.a("输入", 0);
					}
				}
			} else if (this.g9 == 131079) {
				var1.setColor(16777215);
				var1.drawString("欢迎访问ko.cn", c_a5.ic - 5, c_a5.il - 18 - 5, 40);
			}
		} else {
			Graphics var25 = var1;
			var7 = c_a5.iA * c_b5.a(gM) + 70;
			int var29 = (c_a5.ic - var7) / 2;
			int var33 = c_a5.iG * gM.length + 16;
			int var21 = (((ba) this.hc.elementAt(3)).method_long() - ((ba) this.hc.elementAt(2)).method_long() - var33)
					/ 2 + ((ba) this.hc.elementAt(2)).method_long();
			int var36 = var29 + 4 + 10 - 1;
			var21 = var21 + 5 - 1;
			int var37 = var7 - 28 + 2;
			var33 = var33 - 10 + 2;
			var1.setColor(14527877);
			var1.fillRect(var36 + 1, var21 + 1, var37 - 1, var33 - 1);
			var1.setColor(4930874);
			var1.drawRect(var36, var21, var37, var33);
			var36 += 2;
			var21 += 2;
			var37 -= 4;
			var33 -= 4;
			var1.setColor(16575691);
			var1.fillRect(var36 + 1, var21 + 1, var37 - 1, var33 - 1);
			var1.setColor(4930874);
			var1.drawRect(var36, var21, var37, var33);
			var36 += 2;
			var21 += 2;
			var37 -= 4;
			var33 -= 4;
			var1.setColor(14397060);
			var1.drawRect(var36, var21, var37, var33);
			var33 = var36 + 1;
			++var21;
			boolean var12 = false;
			int var13 = var21 - 1;

			for (int var14 = 0; var14 < gM.length; ++var14) {
				int var16 = var21 + var14 * c_a5.iG;
				int var17 = var37 - 1;
				int var18 = c_a5.iG;
				if (var14 % 2 == 0) {
					var25.setColor(c_bm.y);
					var25.fillRect(var33, var16, var17, var18);
				}

				int var15;
				int var43;
				if (var14 == g3) {
					var43 = c_bm.field_try;
					var15 = var33 + 1;
					++var16;
					--var17;
					var18 -= 2;
					var25.setColor(c_bm.bo);
					var25.fillRect(var15, var16, var17, var18);
				} else {
					var43 = c_bm.bP;
				}

				c_b5.method_do(var25, gM[var14], var7, var29, var13 + 2 + var14 * c_a5.iG - 1, var43);
				if (var14 != gM.length - 1) {
					var15 = var36 + 1;
					var16 = var13 + (var14 + 1) * c_a5.iG;
					var17 = var15 + var37 - 2;
					var25.setColor(c_bm.bY);
					var25.drawLine(var15, var16, var17, var16);
				}
			}
		}

		if (var3 != null && var3 instanceof c_r && var3.q()) {
			c_r var32;
			(var32 = (c_r) var3).p(var1);
		}

		bp.ag().method_do(var1, this.g9);
		if (var2 != null && var2.field_byte && var2.y() != null) {
			var2.y().a(var1);
		}

		if (super.field_byte && this.y() != null) {
			this.y().a(var1);
		}

		if (var4 != null && var4 instanceof a7 && var4.q()
				&& ((var22 = (a7) var4).method_char() == 3
						|| var22.method_char() == 1 && (this.g9 == 1376260 || this.g9 == 1376261) || this.g9 == 1376265
						|| this.g9 == 1376268 || this.g9 == 1376264)) {
			var22.f(var1);
		}

		if (this.g9 == 1900546 && !this.cl()) {
			if (bw.c > 1) {
				if (bw.field_void == 1) {
					bw.a(this, var1, false, true);
				} else if (bw.field_void == bw.c) {
					bw.a(this, var1, true, false);
				} else {
					bw.a(this, var1, true, true);
				}
			}
		} else if (this.g9 == 2621442 && !this.cl() && bo.field_long == 2 && bo.method_for()) {
			String var35;
			if (bo.H == 0) {
				var35 = "充值失败";
			} else {
				var35 = "您已成功发送" + bo.H + "条短信，得到猛犸币" + bo.x + "个，是否进入商城？";
			}

			c_as.a((byte) 0, var35, "是", "否", 2621450, -1);
			bo.field_long = 1;
		}

		if (this.g9 == -1610612687) {
			this.i(var1);
		}

	}

	private void i(Graphics var1) {
		short var2 = c_a5.cJ.field_try;
		short var3 = c_a5.cJ.a;
		int var4 = (c_a5.ic - var2 * 3) / 4;
		int var5 = (c_a5.il - 40 - var2 * 4) / 5;
		int var6 = var2 + var4;
		int var7 = var3 + var5;
		var4 = var4;
		var5 += 16;
		byte var8 = c_a5.cJ.field_int;

		for (int var9 = 0; var9 < var8; ++var9) {
			int var10 = var9 / 3;
			int var11 = var9 % 3;
			var11 = var4 + var6 * var11;
			var10 = var5 + var10 * var7;
			var1.setColor(5450263);
			if (var9 == this.gS) {
				var1.drawRect(var11 - 8, var10 - 8, var2 + 16, var3 + 8 + c_a5.iG);
			}

			var1.drawString("" + var9, var11 + (var2 >> 1), var10 + var3 + 1, 17);
			c_a5.cJ.method_if(var1, var11, var10, var9);
		}

	}

	public static final int cA() {
		try {
			if (gf == null) {
				gf = c_b5.method_if("/special/mm.pkg", "tt.png");
			}

			return gf.getWidth() + 110;
		} catch (Exception var1) {
			c_a5.dI.notifyDestroyed();
			return gf.getWidth() + 110;
		}
	}

	public final Vector cf() {
		return this.hc;
	}

	public final void method_if(ba var1) {
		this.hc.addElement(var1);
	}

	public final void cy() {
		this.hc.removeAllElements();
	}

	private final void ce() {
		if (c_a5.gZ && c_a5.es != null && !c_a5.eQ.e && c_a5.method_byte(268435456)) {
			boolean var1 = false;
			c_br var2;
			if (this.hf != null && (var2 = this.hf.y()) != null && this.hf.field_byte && var2.df()) {
				c_a5.a(131072);
				var1 = true;
			}

			int var17;
			int var20;
			a7 var23;
			if (!var1) {
				var17 = c_a5.ic - (c_a5.iA + 4 << 1);
				boolean var3 = false;
				int var4 = c_a5.il - 18;
				var20 = c_a5.iA + 4 << 1;
				if (c_a5.a(var17, var4, var20, 18)) {
					c_a5.a(262144);
					var1 = true;
				}

				if (c_a5.a(0, var4, var20, 18)) {
					c_a5.a(131072);
					var1 = true;
				}

				if (!this.cl()) {
					ah var18;
					short var19;
					short var22;
					switch (c_a5.method_else()) {
					case 17:
						if (c_a5.a((var18 = (ah) c_a5.es.hc.elementAt(16)).k, var18.j, var18.method_for(), var18.z())
								&& !var18.q()) {
							c_a5.a(8192);
							var1 = true;
						}
						break;
					case 18:
						var22 = (var18 = (ah) this.hc.elementAt(4)).v();
						short var24 = var18.method_long();
						short var5 = var18.method_for();
						var19 = var18.z();
						if (c_a5.a(var22, var24, var5, var19)) {
							c_a5.a(65536);
							var1 = true;
						}
					}

					int var10;
					int var11;
					int var12;
					int var13;
					int var28;
					label221: switch (this.g9) {
					case -1610612687:
						var19 = c_a5.cJ.field_try;
						var22 = c_a5.cJ.a;
						var4 = (c_a5.ic - var19 * 3) / 4;
						var28 = (c_a5.il - 40 - var19 * 4) / 5;
						int var30 = var19 + var4;
						int var31 = var22 + var28;
						var4 = var4;
						var28 += 16;
						byte var32 = c_a5.cJ.field_int;
						int var33 = this.gS;
						var10 = 0;

						while (true) {
							if (var10 >= var32) {
								break label221;
							}

							var11 = var10 / 3;
							var12 = var10 % 3;
							var13 = var4 + var30 * var12;
							var12 = var28 + var11 * var31;
							if (c_a5.a(var13 - 8, var12 - 8, var19 + 16, var22 + 8 + c_a5.iG)) {
								this.gS = var10;
								if (var33 == this.gS) {
									c_a5.a(131072);
								}
								break label221;
							}

							++var10;
						}
					case 1900546:
						var22 = (var18 = (ah) this.hc.elementAt(15)).method_long();
						var4 = var18.v() - 5 - 6;
						var28 = var18.v() + var18.method_for() + 5;
						if (c_a5.a(var4, var22, 6, 8)) {
							c_a5.a(16384);
						} else if (c_a5.a(var28, var22, 6, 8)) {
							c_a5.a(32768);
						}
						break;
					case 2097155:
						c_be var21 = this;
						c_ao var25 = (c_ao) c_a5.es.hc.elementAt(1);
						var23 = (a7) c_a5.es.hc.elementAt(31);
						ah var26 = (ah) c_a5.es.hc.elementAt(32);
						a7 var27 = (a7) c_a5.es.hc.elementAt(33);
						short var6 = var26.v();
						short var7 = var26.method_long();
						short var8 = var26.method_for();
						short var9 = var26.z();
						boolean var34 = var26.aj().equals("结算");
						if (!by.d && !by.f && !this.gV) {
							label251: {
								short var14;
								short var15;
								short var16;
								short var37;
								if (!var34) {
									c_b5.method_case("开局界面-----开局界面");

									for (var11 = 0; var11 < 7; ++var11) {
										a9 var36;
										var37 = (var36 = (a9) c_a5.es.hc.elementAt(var11 + 24)).v();
										var14 = var36.method_long();
										var15 = var36.method_for();
										var16 = var36.z();
										if (c_a5.a(var37, var14, var15, var16)) {
											var36.a(true, this);

											for (var12 = 0; var12 < 7; ++var12) {
												if (var12 != var11) {
													((a9) c_a5.es.hc.elementAt(var12 + 24)).a(false, var21);
												}
											}

											c_b5.method_try(var11);
											var26.a(false, var21);
											var25.a("", 0);
											break;
										}
									}
								} else {
									c_b5.method_case("结算界面-----结算界面");
									short var35 = var23.v();
									short var38 = var23.method_long();
									var37 = var27.v();
									var14 = var27.method_long();
									var15 = var23.method_for();
									var16 = var23.z();
									if (c_a5.a(var35, var38, var15, var16)) {
										by.field_case = 1;
										if (var23.q()) {
											c_a5.a(65536);
										} else {
											var25.a("开始", 0);
											var23.a(true, this);
											var27.a(false, this);
											var26.a(false, this);
										}
										break label251;
									}

									if (c_a5.a(var37, var14, var15, var16)) {
										by.field_case = 2;
										if (var27.q()) {
											c_a5.a(65536);
										} else {
											var25.a("开始", 0);
											var23.a(false, this);
											var27.a(true, this);
											var26.a(false, this);
										}
										break label251;
									}
								}

								if (c_a5.a(var6, var7, var8, var9)) {
									if (var26.q()) {
										c_a5.a(65536);
									} else {
										if (!var34) {
											var25.a("开局", 0);
										} else {
											var25.a("结算", 0);
										}

										var26.a(true, var21);
										var23.a(false, var21);
										var27.a(false, var21);

										for (var11 = 0; var11 < 7; ++var11) {
											((a9) c_a5.es.hc.elementAt(var11 + 24)).a(false, var21);
										}
									}
								}
							}
						}

						var1 = true;
						break;
					case 2425024:
					case 2425077:
						var10 = c_a5.iA * c_b5.a(gM) + 70;
						var11 = c_a5.iG;
						var12 = c_a5.iG * gM.length + 16;
						var13 = (c_a5.ic - var10) / 2;
						var12 = (((ba) this.hc.elementAt(3)).method_long() - ((ba) this.hc.elementAt(2)).method_long()
								- var12) / 2 + ((ba) this.hc.elementAt(2)).method_long();

						for (var17 = 0; var17 < gM.length; ++var17) {
							if (c_a5.a(var13, var12 + var17 * var11 + 8, var10, var11)) {
								g3 = var17;
								cz();
							}
						}
					}
				}
			}

			if (!var1) {
				var17 = 0;

				for (var20 = this.hc.size(); var17 < var20; ++var17) {
					ba var29;
					if ((var29 = (ba) this.hc.elementAt(var17)).k()) {
						if (c_a5.a(var29.v(), var29.method_long(), var29.method_for(), var29.z())) {
							if (this.hf == var29) {
								if (var29.b()) {
									this.hf.field_byte = false;
								} else {
									if (var29.field_byte) {
										break;
									}

									if (c_a5.method_else() != 18) {
										c_a5.a(131072);
										break;
									}

									c_a5.a(65536);
								}
							} else {
								if (this.g9 == 2555905 && var29 instanceof a7 && (var23 = (a7) var29).bN() == 0) {
									return;
								}

								this.hf.field_byte = false;
								this.hf.a(false, this);
								var29.a(true, this);
								if (var29.method_if()) {
									var29.e();
									var29.m();
								}

								if (this.hf instanceof c_r || this.hf instanceof ay) {
									this.hf.b();
								}
							}

							return;
						}
					} else if ((var29 instanceof ak || var29 instanceof c_bv || var29 instanceof a9)
							&& c_a5.a(var29.v(), var29.method_long(), var29.method_for(), var29.z())) {
						switch (this.g9) {
						case 1703969:
							c_a5.a(2048);
							break;
						case 1703971:
							c_a5.a(131072);
						}
					}
				}
			}
		}

	}

	public final void cw() {
		ay var1;
		String var2;
		String var3;
		ah var4;
		ah var8;
		a9 var9;
		ah var10;
		int var11;
		ah var12;
		a9 var14;
		ah var18;
		c_bv var22;
		ak var26;
		this.ce();
		String var13;
		a9 var15;
		bk var16;
		int var19;
		ay var24;
		String var30;
		label1424: switch (c_a5.method_else()) {
		case 6:
			if (c_a5.method_byte(196608)) {
				c_a5.method_do((byte) 29);
			} else if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 4);
			}
			break;
		case 7:
		case 9:
		case 13:
		case 20:
		case 24:
		case 25:
		case 26:
		case 28:
		default:
			if (c_a5.method_byte(262144)) {
				c_b5.method_case("---------当前命令号------- = " + Integer.toHexString(this.g9));
				if (c_a5.method_else() != 4 && !this.cl()) {
					new c_br((short) 0, (short) 0, (short) 0, (short) 0, (byte) 0);
					var1 = null;
					c_b5.method_case("当前状态是： " + c_a5.V());
					cr();
					c_q.a = -1;
					c_b5.p = 0;
					c_b5.d = 0;
					if (this.g9 == 1376260 || this.g9 == 1376265 || this.g9 == 1376264 || this.g9 == 1376268
							|| this.g9 == 1376261) {
						(c_a5.gQ = new c_as((byte) 0, (c_be) null)).a((byte) 5, c_bm.dt, "是否确认取消交易？", "确定", "取消",
								1376274, -1);
						return;
					}

					if (this.g9 == 1376263) {
						c_a5.eQ.a(1376261);
						return;
					}

					if (this.g9 == 1376267) {
						c_a5.eQ.a(1376273);
						if (am.field_new > 0) {
							am.field_new = 0;
						}

						if (am.field_else) {
							am.field_else = false;
						}

						if (!am.a) {
							am.a = true;
						}

						return;
					}

					if (this.g9 == 458760 && at.field_byte) {
						((c_ao) this.cf().elementAt(1)).a("返回", 1);
						at.a(true);
						at.field_byte = false;
						return;
					}

					if (this.g9 == 1179658 && at.field_byte) {
						((c_ao) this.cf().elementAt(1)).a("返回", 1);
						bs.a(true);
						at.field_byte = false;
						return;
					}

					if (this.g9 == 262152) {
						a7.e3 = -1;
					} else if (this.g9 == 458755) {
						c_b5.method_case("退出当前界面");
						a7.bF();
					}

					if (gL == -1) {
						ci();
					}
				}
			} else if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(2)) {
					switch (this.g9) {
					case 2555905:
						r((byte) 35);
					}
				} else if (c_a5.method_byte(4)) {
					switch (this.g9) {
					case 2555905:
						if (az.h == 1) {
							return;
						}

						r((byte) 36);
					}
				} else if (c_a5.method_byte(8)) {
					switch (this.g9) {
					case 2555905:
						r((byte) 37);
					}
				}
			} else if (this.g9 == 2097155) {
				c_ao var33 = (c_ao) c_a5.es.cf().elementAt(1);
				var10 = (ah) this.hc.elementAt(32);
				var12 = (ah) this.hc.elementAt(36);
				var4 = (ah) this.hc.elementAt(37);
				int var21;
				if (var10.q() && var10.aj().equals("开局")) {
					if (!by.field_do) {
						for (var21 = 0; var21 < 7; ++var21) {
							by.field_try[var21] = (a9) c_a5.es.cf().elementAt(var21 + 24);
							if (by.field_try[var21].b3() == 0) {
								++by.field_int;
							}
						}

						if (by.field_int == 7) {
							c_as.a((byte) 0, "请输入金额", "确定", "", -1, -2);
							by.field_int = 0;
							return;
						}

						var10.a(false, c_a5.es);
						by.e = c_b5.a(5, 8);
						c_b5.method_case("---------PCGamble.m_nCircle----------=" + by.e);
						c_a5.eQ.a(2097153);
						by.field_else = true;
					}
				} else if (var10.q() && var10.aj().equals("结算")) {
					var21 = Integer.parseInt(var12.aj());
					int var32 = Integer.parseInt(var4.aj()) + var21;
					var12.a("0");
					var4.a("" + var32);
					var10.a("开局");
					var33.a("开局", 0);
					by.field_do = false;
					by.f = false;
					by.e = 0;
					by.field_long = 0;

					for (var19 = 0; var19 < 7; ++var19) {
						by.field_try[var19].method_void("0");
					}

					by.field_new = 0;
					by.a = 0;
					by.b = false;
					by.field_void = false;
					by.field_if = 0;
				}
			} else {
				String var17;
				String var28;
				if (this.g9 == 2621443) {
					var9 = (a9) c_a5.es.cf().elementAt(4);
					var14 = (a9) c_a5.es.cf().elementAt(6);
					var24 = (ay) this.cf().elementAt(7);
					var17 = var9.cc().toString().trim();
					var28 = var14.cc().toString().trim();
					if (!var9.q() && !var14.q()) {
						if (var24.q()) {
							if (var24.bm() == var24.bj()) {
								if (var17 != null && !var17.equals("") && var28 != null && !var28.equals("")) {
									b4.d = var17;
									b4.field_if = var28;
									if (var24.bj() == 0) {
										b4.field_byte = b4.field_goto = c_a5.n();
										c_a5.eQ.a(2621451);
									} else if (var24.bj() == 1) {
										c_a5.eQ.a(2621447);
										c_br.c6();
									}
								} else {
									c_as.a((byte) 0, "请输入充值卡卡号或密码", "确定", "", -1, -2);
								}
							} else {
								var24.method_char(var24.bm());
							}
						}
					} else if (var17 != null && !var17.equals("") && var28 != null && !var28.equals("")) {
						b4.d = var17;
						b4.field_if = var28;
						if (var24.bj() == 0) {
							b4.field_byte = b4.field_goto = c_a5.n();
							c_a5.eQ.a(2621451);
						} else if (var24.bj() == 1) {
							c_a5.eQ.a(2621447);
							c_br.c6();
						}
					} else {
						c_b5.a(4, 6, "请输入充值卡卡号和密码", "请输入充值卡卡号", "请输入充值卡密码");
					}
				} else if (this.g9 == 2621445) {
					var9 = (a9) c_a5.es.cf().elementAt(4);
					var14 = (a9) c_a5.es.cf().elementAt(6);
					var24 = (ay) this.cf().elementAt(7);
					ay var20 = (ay) this.cf().elementAt(8);
					var28 = var9.cc().toString().trim();
					var30 = var14.cc().toString().trim();
					if (!var9.q() && !var14.q()) {
						if (var24.q()) {
							if (var24.bm() == var24.bj()) {
								if (var28 != null && !var28.equals("") && var30 != null && !var30.equals("")) {
									b4.d = var28;
									b4.field_if = var30;
									b4.field_case = Integer.parseInt(var20.be()[var20.bm()]);
									if (var24.bj() == 0) {
										b4.field_byte = b4.field_goto = c_a5.n();
										c_a5.eQ.a(2621451);
									} else if (var24.bj() == 1) {
										c_a5.eQ.a(2621447);
										c_br.c6();
									}
								} else {
									c_as.a((byte) 0, "请输入充值卡卡号或密码", "确定", "", -1, -2);
								}
							} else {
								var24.method_char(var24.bm());
							}
						}
					} else if (var28 != null && !var28.equals("") && var30 != null && !var30.equals("")) {
						b4.d = var28;
						b4.field_if = var30;
						b4.field_case = Integer.parseInt(var20.be()[var20.bm()]);
						if (var24.bj() == 0) {
							b4.field_byte = b4.field_goto = c_a5.n();
							c_a5.eQ.a(2621451);
						} else if (var24.bj() == 1) {
							c_a5.eQ.a(2621447);
							c_br.c6();
						}
					} else {
						c_b5.a(4, 6, "请输入充值卡卡号和密码", "请输入充值卡卡号", "请输入充值卡密码");
					}
				} else if (this.g9 == 2621447) {
					var9 = (a9) c_a5.es.cf().elementAt(5);
					var14 = (a9) c_a5.es.cf().elementAt(7);
					var24 = (ay) c_a5.es.cf().elementAt(8);
					var17 = var9.cc().toString().trim();
					var28 = var14.cc().toString().trim();
					if (var9.q() || var14.q()) {
						if (var17 != null && !var17.equals("") && var28 != null && !var28.equals("")) {
							b4.field_byte = var17;
							b4.field_goto = c_a5.n();
							if (var24.bm() == 0) {
								b4.field_char = true;
							} else if (var24.bm() == 1) {
								b4.field_char = false;
							}

							if (!var17.equals(var28)) {
								c_as.a((byte) 0, "您输入的通行证账号不正确", "确定", "", -1, -100);
							} else {
								c_a5.eQ.a(2621451);
							}
						} else {
							c_b5.a(5, 7, "请输入", "您要充值的通行证", "确认您的通行证");
						}
					}
				} else if ((this.g9 == 3342337 || this.g9 == 3342338 || this.g9 == 3342339 || this.g9 == 1900552
						|| this.g9 == 1703954 || this.g9 == 1703948 || this.g9 == 1376267 || this.g9 == 655363
						|| this.g9 == 393231) && am.field_else) {
					c_a5.eQ.a(3342340);
					c_br.c6();
				}
			}
			break;
		case 8:
			if (!this.cl() && c_a5.method_byte(262144)) {
				ai.method_if();
			}
			break;
		case 10:
			if (c_a5.method_byte(262144)) {
				c_a5.method_do(c_a5.method_case());
			}
			break;
		case 11:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					c_a5.method_do((byte) 4);
				}
			} else {
				var9 = (a9) c_a5.es.cf().elementAt(4);
				var14 = (a9) c_a5.es.cf().elementAt(5);
				var12 = (ah) c_a5.es.cf().elementAt(6);
				var4 = (ah) c_a5.es.cf().elementAt(7);
				var18 = (ah) c_a5.es.cf().elementAt(8);
				if (var9.q() || var14.q()) {
					c_a5.hC[0] = var9.cc().toString().trim();
					c_a5.hC[1] = var14.cc().toString().trim();
					if (c_a5.hC[0] != null && !c_a5.hC[0].equals("") && c_a5.hC[1] != null && !c_a5.hC[1].equals("")) {
						c_b5.a(c_a5.hC, "name_password");
						if (c_a5.hC[0].equals("")) {
							var30 = "您输入的账号或密码有错误，请重新输入！";
							c_a5.a((byte) 0, var30, "确定", "", -3, -120);
							return;
						} else if (c_a5.hC[1].equals("")) {
							var30 = "您输入的账号或密码有错误，请重新输入！";
							c_a5.a((byte) 0, var30, "确定", "", -3, -120);
							return;
						} else {
							c_a5.r();
							var30 = "请等待服务器认证...";
							c_a5.a((byte) 0, var30, "", "", -120, -120);
							c_a5.eg = 0;
							c_a5.hg = 0;
							c_a5.ah();
							bk.y = 1;
							if (c_a5.da) {
								c_a5.eQ.a(117502);
								return;
							} else {
								this.gT = new bk(bk.q, bk.method_do((byte) 1), (byte) (c_a5.dU ? 0 : 1), (byte) 2);
								if (bk.ao == 1) {
									bk.b();
								}

								if (c_a5.hM) {
									gd = System.currentTimeMillis();
								}

								this.gT.a((byte) 1);
								return;
							}
						}
					} else {
						c_b5.method_for(4, 5);
						return;
					}
				}

				if (var12.q()) {
					if (c_a5.e8.g0 == 1) {
						c_a5.a((byte) 0, "测试人员不能注册", "确定", "", -7, -120);
						return;
					}

					c_a5.method_do((byte) 14);
					c_a5.e8.cT = 1;
				} else if (var4.q()) {
					if (c_a5.e8.g0 == 1) {
						c_a5.a((byte) 0, "测试人员不能注册", "确定", "", -7, -120);
						return;
					}

					ay var27;
					if ((var27 = (ay) c_a5.es.cf().elementAt(10)).bm() == 1) {
						var27.method_case((byte) 0);
					}

					c_a5.e8.cT = 1;
					var3 = "请您稍候...";
					c_a5.a((byte) 0, var3, "", "", -120, -120);
					bk.d = true;
					(new bk(bk.q, bk.method_do((byte) 5), (byte) (c_a5.dU ? 0 : 1), (byte) 2)).a((byte) 0);
				} else if (var18.q()) {
					if (((ay) c_a5.es.cf().elementAt(10)).bm() == 1) {
						c_a5.a((byte) 0, "空中网账号不能修改密码，请登录kong.net进行修改", "确定", "", -7, -120);
						return;
					}

					c_a5.method_do((byte) 15);
				} else {
					ah var29 = (ah) c_a5.es.cf().elementAt(9);
					var24 = (ay) c_a5.es.cf().elementAt(10);
					if (var29.q() && var24.bm() == 1) {
						c_a5.a((byte) 0, "空中网账号不能账号绑定，请登录kong.net进行账号绑定", "确定", "", -7, -120);
						return;
					}

					if (var29.q() && !var29.aj().equals("") && var29.aj() != null) {
						c_a5.e8.cT = 4;
						c_a5.method_do((byte) 16);
					}
				}
			}
			break;
		case 12:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					c_a5.method_do((byte) 4);
				}
			} else {
				byte var31;
				if (bk.method_if(var31 = ((c_bv) c_a5.es.cf().elementAt(2)).dw())) {
					return;
				}

				bk.y = 2;
				var3 = "网络连接中，请等候...";
				c_a5.a((byte) 0, var3, "", "", -120, -120);
				if (!bk.G) {
					c_a5.is = Byte.parseByte(bk.method_if((int) var31));
					c_f.f = "socket://" + bk.method_do((int) var31) + ":" + bk.a((int) var31);
					if (c_a5.e8.g0 != 1) {
						c_b5.a(bk.g[var31], "last_time_login");
					}
				} else {
					c_a5.is = c_a5.hs[var31];
					c_f.f = "socket://" + c_a5.hR[var31];
					c_a5.fS[0] = var31;
					c_b5.method_if(c_a5.fS, "serverlist");
				}

				c_a5.G();
				c_br.c6();
				if (c_a5.hQ == 1) {
					c_a5.eQ.a(65546);
				} else {
					c_a5.eQ.a(131071);
				}
			}
			break;
		case 14:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					if (c_a5.e8.cT == 1) {
						c_a5.method_do((byte) 11);
					} else if (c_a5.e8.cT == 2) {
						c_a5.method_do((byte) 4);
					}

					c_a5.I();
					c_a5.t();
				}
				break;
			} else {
				c_a5.hC[0] = null;
				c_a5.hC[1] = null;
				var9 = (a9) c_a5.es.cf().elementAt(9);
				c_a5.hC[0] = var9.cc().toString().trim();
				var14 = (a9) c_a5.es.cf().elementAt(10);
				c_a5.hC[1] = var14.cc().toString().trim();
				c_a5.fc[0] = c_a5.hC[0];
				c_a5.fc[1] = c_a5.hC[1];
				if (c_a5.hC[0] != null && !c_a5.hC[0].equals("") && c_a5.hC[1] != null && !c_a5.hC[1].equals("")) {
					var3 = "账号：" + c_a5.hC[0] + "\n" + "密码：" + c_a5.hC[1] + "\n" + "是否确定此账号、密码？";
					c_a5.a((byte) 0, var3, "确定", "修改", -11, -1);
					break;
				}

				c_b5.a();
				return;
			}
		case 15:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					c_a5.method_do((byte) 11);
					c_a5.I();
				}
				break;
			} else {
				var1 = null;
				var2 = null;
				c_a5.hC[0] = null;
				c_a5.hC[1] = null;
				a9 var25 = (a9) c_a5.es.cf().elementAt(10);
				c_a5.hC[0] = var25.cc().toString().trim();
				var15 = (a9) c_a5.es.cf().elementAt(11);
				c_a5.hC[1] = var15.cc().toString().trim();
				var2 = ((a9) c_a5.es.cf().elementAt(12)).cc().toString().trim();
				var13 = ((a9) c_a5.es.cf().elementAt(13)).cc().toString().trim();
				c_a5.fc[0] = c_a5.hC[0];
				c_a5.fc[1] = c_a5.hC[1];
				c_a5.fc[2] = var2;
				c_a5.fc[3] = var13;
				if (c_a5.fc[0] != null && !c_a5.fc[0].equals("") && c_a5.fc[1] != null && !c_a5.fc[1].equals("")
						&& c_a5.fc[2] != null && !c_a5.fc[2].equals("") && c_a5.fc[3] != null
						&& !c_a5.fc[3].equals("")) {
					var3 = null;
					switch (c_a5.a(c_a5.hC[1], var2, var13)) {
					case 0:
						var3 = "请稍候...";
						c_a5.a((byte) 0, var3, "", "", -120, -120);
						var1 = null;
						(new bk(bk.q, bk.method_do((byte) 2), (byte) (c_a5.dU ? 0 : 1), (byte) 2)).a((byte) 2);
						break label1424;
					case 1:
						var3 = "账号或密码不能为空，请重新输入!";
						c_a5.a((byte) 0, var3, c_bm.a2[2], "", -3, -120);
						c_b5.method_case("用户名或密码不能为空，请重新输入!");
						break label1424;
					case 2:
						var3 = "密码长度不符合要求，请重新输入!";
						c_a5.a((byte) 0, var3, c_bm.a2[2], "", -3, -120);
						c_b5.method_case("用户名或密码长度不符合要求，请重新输入!");
						break label1424;
					case 3:
						var3 = "密码输入有误，请重新输入！";
						c_a5.a((byte) 0, var3, c_bm.a2[2], "", -3, -120);
						c_b5.method_case("密码输入有误，请重新输入！");
					default:
						break label1424;
					}
				}

				c_b5.method_if();
				return;
			}
		case 16:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					if (c_a5.e8.cT == 3) {
						c_a5.method_do((byte) 4);
					} else if (c_a5.e8.cT == 4) {
						c_a5.method_do((byte) 11);
					}
				} else if (c_a5.method_byte(2048)) {
					var22 = (c_bv) this.cf().elementAt(3);
					var26 = (ak) this.cf().elementAt(4);
					if (var22.q()) {
						var22.a(false, this);
						var26.a(true, this);
						var26.ap();
					} else if (var26.q()) {
						var22.a(true, this);
						var26.a(false, this);
					}
				}
			} else {
				if (c_a5.e8.cQ == 0) {
					c_a5.method_do((byte) 21);
				} else if (c_a5.e8.cQ == 1) {
					c_a5.method_do((byte) 22);
				} else if (c_a5.e8.cQ == 2) {
					c_a5.method_do((byte) 23);
				}

				if (c_a5.hC[0] != null && !c_a5.hC[0].equals("")) {
					gn = c_a5.hC[0];
					c_a5.hC[0] = null;
				}

				if (c_a5.hC[1] != null && !c_a5.hC[1].equals("")) {
					gl = c_a5.hC[1];
					c_a5.hC[1] = null;
				}
			}
			break;
		case 17:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (!this.cl() && c_a5.method_byte(262144)) {
					c_a5.method_do((byte) 4);
					c_a5.eQ.method_for();
					c_a5.ah();
					c_a5.G();
					c_a5.eg = 0;
					c_a5.hg = 0;
				}
			} else if (((ah) c_a5.es.cf().elementAt(16)).q() && c_a5.e0[c_a5.hg] != null) {
				if ((c_a5.hV[c_a5.hg] == 0 || c_a5.hV[c_a5.hg] == 2) && !c_a5.g3[c_a5.hg]) {
					c_a5.method_do((byte) 19);
				} else if (c_a5.hV[c_a5.hg] == 0 && c_a5.g3[c_a5.hg]) {
					this.cq();
				}
			}
			break;
		case 18:
			if (c_a5.method_byte(65536)) {
				if ((var9 = (a9) c_a5.es.cf().elementAt(9)).cc().toString().trim() != null
						&& !var9.cc().toString().trim().trim().equals("")) {
					if (!c_a5.fY.equals(var9.cc().toString().trim())) {
						c_a5.fY.equals(var9.cc().toString().trim());
					}

					var2 = null;
					var2 = "请稍候...";
					c_a5.a((byte) 0, var2, "", "", -120, -120);
					c_a5.eQ.a(1114114);
					var19 = 0;

					while (true) {
						if (var19 >= 5) {
							break label1424;
						}

						ay.d4[var19] = 0;
						++var19;
					}
				} else {
					c_b5.a("输入昵称", "输入昵称，最多输入六个汉字或字母（包括数字）", 6, var9.cc().toString().trim(), 9, (byte) 2);
				}
			} else if (c_a5.method_byte(262144)) {
				var1 = null;
				var13 = "请稍候...";
				c_a5.a((byte) 0, var13, "", "", -120, -120);
				c_a5.eQ.a(131071);
				c_a5.ah();
				c_a5.G();
				c_a5.gx = 0;
				var11 = 0;

				while (true) {
					if (var11 >= 5) {
						break label1424;
					}

					ay.d4[var11] = 0;
					++var11;
				}
			} else if (c_a5.method_byte(131072)) {
				var1 = (ay) c_a5.es.cf().elementAt(5);
				ay var23 = (ay) c_a5.es.cf().elementAt(6);
				var24 = (ay) c_a5.es.cf().elementAt(8);
				if ((var15 = (a9) c_a5.es.cf().elementAt(9)).q()) {
					if (var15.cc().toString().trim() == null || var15.cc().toString().trim().trim().equals("")
							|| var15.cc().toString().trim() != null && !var15.cc().toString().trim().equals("")) {
						c_b5.a("输入昵称", "输入昵称，最多输入六个汉字或字母（包括数字）", 6, var15.cc().toString().trim(), 9, (byte) 2);
					}
				} else {
					c_ao var5;
					ak var6;
					if (var1.q()) {
						c_a5.method_do((byte) 27);
						var5 = (c_ao) c_a5.es.cf().elementAt(0);
						var6 = (ak) c_a5.es.cf().elementAt(4);
						if (c_a5.ci == 1) {
							var5.method_do("天人");
							var6.method_if(c_bm.aU[0]);
						} else if (c_a5.ci == 2) {
							var5.method_do("修罗");
							var6.method_if(c_bm.aU[1]);
						}

						var6.ap();
					} else if (var23.q()) {
						c_a5.method_do((byte) 27);
						var5 = (c_ao) c_a5.es.cf().elementAt(0);
						var6 = (ak) c_a5.es.cf().elementAt(4);
						if (c_a5.ck == 1) {
							var5.method_do("人族");
							var6.method_if(c_bm.aU[2]);
						} else if (c_a5.ck == 2) {
							var5.method_do("仙族");
							var6.method_if(c_bm.aU[3]);
						} else if (c_a5.ck == 3) {
							var5.method_do("妖族");
							var6.method_if(c_bm.aU[4]);
						} else if (c_a5.ck == 4) {
							var5.method_do("魔族");
							var6.method_if(c_bm.aU[5]);
						}

						var6.ap();
					} else if (var24.q()) {
						c_a5.method_do((byte) 27);
						var5 = (c_ao) c_a5.es.cf().elementAt(0);
						var6 = (ak) c_a5.es.cf().elementAt(4);
						if (c_a5.ig == 1) {
							var5.method_do("剑客");
							var6.method_if(c_bm.aU[6]);
						} else if (c_a5.ig == 2) {
							var5.method_do("刺客");
							var6.method_if(c_bm.aU[7]);
						} else if (c_a5.ig == 3) {
							var5.method_do("道士");
							var6.method_if(c_bm.aU[8]);
						} else if (c_a5.ig == 4) {
							var5.method_do("医师");
							var6.method_if(c_bm.aU[9]);
						} else if (c_a5.ig == 5) {
							var5.method_do("幻术师");
							var6.method_if(c_bm.aU[10]);
						} else if (c_a5.ig == 6) {
							var5.method_do("暗巫");
							var6.method_if(c_bm.aU[11]);
						}

						var6.ap();
					}
				}
			}
			break;
		case 19:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					var1 = null;
					var13 = "请稍候...";
					c_a5.a((byte) 0, var13, "", "", -120, -120);
					c_a5.ah();
					c_a5.method_do((byte) 17);
					c_a5.eQ.a(131071);
				}
			} else {
				var1 = null;
				if ((var14 = (a9) c_a5.es.cf().elementAt(9)).cc().toString().trim() == null
						|| var14.cc().toString().trim().equals("")) {
					c_b5.a("删除角色", "请输入del确认删除", 3, (String) null, 9, (byte) 5);
					return;
				}

				var13 = var14.cc().toString().trim();
				if ("del".equals(var13)) {
					if (c_a5.hV[c_a5.hg] == 2) {
						c_a5.eQ.a(1114118);
					} else {
						c_a5.eQ.a(1114116);
					}
				} else {
					var13 = "输入有误，请重新输入";
					c_a5.a((byte) 0, var13, c_bm.a2[2], "", -3, -120);
				}
			}
			break;
		case 21:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					if (gn != null && !gn.equals("")) {
						c_a5.hC[0] = gn;
					}

					if (gl != null && !gl.equals("")) {
						c_a5.hC[1] = gl;
					}

					c_a5.e8.cQ = 0;
					c_a5.method_do(c_a5.method_case());
					((c_bv) c_a5.es.cf().elementAt(3)).a(true, c_a5.es);
				}
				break;
			}

			var9 = (a9) c_a5.es.cf().elementAt(4);
			var14 = (a9) c_a5.es.cf().elementAt(6);
			if (var9.cc().toString().trim() == null || var9.cc().toString().trim().equals("")
					|| var14.cc().toString().trim() == null || var14.cc().toString().trim().equals("")) {
				c_b5.method_for(4, 6);
				return;
			}

			c_a5.hC[0] = var9.cc().toString().trim();
			c_a5.hC[1] = var14.cc().toString().trim();
			bo.C = 2;
			var3 = null;
			var16 = new bk(bk.q, bk.method_do((byte) 1), (byte) (c_a5.dU ? 0 : 1), (byte) 0);
			bk.b = true;
			var16.a((byte) 4);
			c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
			break;
		case 22:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					if (gn != null && !gn.equals("")) {
						c_a5.hC[0] = gn;
					}

					if (gl != null && !gl.equals("")) {
						c_a5.hC[1] = gl;
					}

					c_a5.e8.cQ = 0;
					c_a5.method_do(c_a5.method_case());
					((c_bv) c_a5.es.cf().elementAt(3)).a(true, c_a5.es);
				}
				break;
			} else {
				var9 = (a9) c_a5.es.cf().elementAt(4);
				var14 = (a9) c_a5.es.cf().elementAt(6);
				if (var9.cc().toString().trim() != null && !var9.cc().toString().trim().equals("")
						&& var14.cc().toString().trim() != null && !var14.cc().toString().trim().equals("")) {
					c_a5.hC[0] = var9.cc().toString().trim();
					c_a5.hC[1] = var14.cc().toString().trim();
					bo.C = 3;
					var3 = null;
					var16 = new bk(bk.q, bk.method_do((byte) 1), (byte) (c_a5.dU ? 0 : 1), (byte) 0);
					bk.b = true;
					var16.a((byte) 4);
					c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
					break;
				}

				c_b5.method_for(4, 6);
				return;
			}
		case 23:
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_byte(262144)) {
					c_a5.e8.cQ = 0;
					c_a5.method_do(c_a5.method_case());
					((c_bv) c_a5.es.cf().elementAt(3)).a(true, c_a5.es);
					if (gn != null && !gn.equals("")) {
						c_a5.hC[0] = gn;
					}
				}
				break;
			} else {
				if ((var9 = (a9) c_a5.es.cf().elementAt(4)).cc().toString().trim() != null
						&& !var9.cc().toString().trim().equals("")) {
					c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
					bo.method_do((byte) 4);
					break;
				}

				c_b5.a("请输入用户名", "请输入您的用户名", 16, var9.cc().toString().trim(), 4, (byte) 1);
				return;
			}
		case 27:
			if (c_a5.method_byte(262144)) {
				c_a5.method_do(c_a5.method_case());
				cu();
			}
			break;
		case 29:
			if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 6);
				((c_bv) c_a5.es.cf().elementAt(2)).y(c_a5.f3);
			}
			break;
		case 30:
			if (c_a5.method_byte(196608)) {
				switch (((c_bv) c_a5.es.cf().elementAt(2)).dw()) {
				case 0:
					c_a5.method_do((byte) 31);
					break label1424;
				case 1:
					cp();
					break label1424;
				case 2:
					co();
					break label1424;
				case 3:
					c_a5.method_do((byte) 37);
				}
			} else if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 4);
			}
			break;
		case 31:
			if (c_a5.method_byte(196608)) {
				var9 = (a9) c_a5.es.cf().elementAt(5);
				var11 = 0;

				try {
					var11 = Integer.parseInt(var9.cc().toString());
				} catch (Exception var7) {
					var7.printStackTrace();
				}

				if (var11 >= 1 && var11 <= 100) {
					bk.ai = var11;
					if (bk.m()) {
						var3 = "/judgeserver/charge?&userId=" + c_a5.ik + "&key=" + c_a5.iM + "&game=fengshen&money="
								+ var11 + "&from=kong";
						(new bk(bk.field_void, var3, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 3);
					} else {
						bk.b = true;
						(new bk(bk.aG, bk.aQ, (byte) (c_a5.dU ? 0 : 1), (byte) 1)).a((byte) 3);
					}

					c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
				} else {
					var3 = "输入非法，请重新输入“1-100”之间整数";
					c_a5.a((byte) 0, var3, c_bm.a2[2], "", -3, -120);
				}
			} else if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 30);
			}
			break;
		case 32:
			if (c_a5.method_byte(196608)) {
				var8 = (ah) c_a5.es.cf().elementAt(4);
				var10 = (ah) c_a5.es.cf().elementAt(5);
				var12 = (ah) c_a5.es.cf().elementAt(6);
				var4 = (ah) c_a5.es.cf().elementAt(7);
				if (var8.q()) {
					c_a5.method_do((byte) 31);
				} else if (var10.q()) {
					cp();
				} else if (var12.q()) {
					co();
				} else if (var4.q()) {
					c_a5.method_do((byte) 37);
				}
			} else if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 30);
			}
			break;
		case 33:
			if (c_a5.method_byte(196608)) {
				var8 = (ah) c_a5.es.cf().elementAt(4);
				var10 = (ah) c_a5.es.cf().elementAt(5);
				var12 = (ah) c_a5.es.cf().elementAt(6);
				if (var8.q()) {
					c_a5.method_do((byte) 31);
				} else if (var10.q()) {
					co();
				} else if (var12.q()) {
					c_a5.method_do((byte) 37);
				}
			} else if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 30);
			}
			break;
		case 34:
			if (c_a5.method_byte(196608)) {
				var8 = (ah) c_a5.es.cf().elementAt(4);
				var10 = (ah) c_a5.es.cf().elementAt(5);
				if (var8.q()) {
					c_a5.method_do((byte) 35);
				} else if (var10.q()) {
					c_a5.method_do((byte) 36);
				}
			} else if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 30);
			}
			break;
		case 35:
			if (c_a5.method_byte(196608)) {
				if ((bk.field_if = (byte) (((ay) c_a5.es.cf().elementAt(3)).bm() + 1)) == 2) {
					c_as.cH = 999999;
					c_as.a((byte) 1, "请输入查询年月：\n（例：200906）", "确定", "取消", -1610612640, -1, -1, -1);
					c_a5.gQ.cA = 6;
				} else if (bk.m()) {
					var2 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + c_a5.ik
							+ "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100
							+ "&qtype=7&qtime=" + bk.field_if + "&qmonth=" + bk.field_char;
					c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
					(new bk(bk.field_void, var2, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 8);
				} else {
					c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
					bk.b = true;
					(new bk(bk.aG, bk.aQ, (byte) (c_a5.dU ? 0 : 1), (byte) 1)).a((byte) 8);
				}
			} else if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 34);
			}
			break;
		case 36:
			if (c_a5.method_byte(196608)) {
				var1 = (ay) c_a5.es.cf().elementAt(3);
				bk.field_if = (byte) (((ay) c_a5.es.cf().elementAt(5)).bm() + 1);
				switch (var1.bm()) {
				case 0:
					bk.ay = 3;
					break;
				case 1:
					bk.ay = 5;
					break;
				case 2:
					bk.ay = 13;
				}

				if (bk.field_if == 2) {
					c_as.cH = 999999;
					c_as.a((byte) 1, "请输入查询年月：\n（例：200906）", "确定", "取消", -1610612639, -1, -1, -1);
					c_a5.gQ.cA = 6;
				} else if (bk.m()) {
					var3 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + c_a5.ik
							+ "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype="
							+ bk.ay + "&qtime=" + bk.field_if + "&qmonth=" + bk.field_char;
					c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
					(new bk(bk.field_void, var3, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 9);
				} else {
					c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
					bk.b = true;
					(new bk(bk.aG, bk.aQ, (byte) (c_a5.dU ? 0 : 1), (byte) 1)).a((byte) 9);
				}
			} else if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 34);
			}
			break;
		case 37:
			if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 30);
			}
			break;
		case 38:
			if (c_a5.method_byte(262144)) {
				c_a5.method_do((byte) 34);
			}
		}

		if (c_a5.es != null && !c_a5.eQ.e) {
			int var34 = 0;

			for (var11 = this.hc.size(); var34 < var11; ++var34) {
				ba var37;
				if ((var37 = (ba) this.hc.elementAt(var34)) instanceof ae) {
					((ae) var37).U();
				}

				if (var37 instanceof bn) {
					((bn) var37).cZ();
				}
			}

			if (this.hf != null) {
				if (this.hf instanceof c_r) {
					this.hf.f();
				} else {
					this.hf.f();
					this.hf.a(this);
				}
			}

			if (this != null && (this.g9 == 262147 || this.g9 == 262176) && c_a5.method_byte(2048)) {
				ba var36 = (ba) c_a5.es.cf().elementAt(4);
				ba var35 = (ba) c_a5.es.cf().elementAt(5);
				if (var36.q()) {
					var36.a(false, this);
					var35.a(true, this);
				} else if (var35.q()) {
					var35.a(false, this);
					var36.a(true, this);
				}
			}

			if (this.g9 == 1900548 && c_a5.method_byte(2048)) {
				c_a5.eQ.a(1900548);
			}

			if (this.g9 == 1900546) {
				if (c_a5.method_byte(2048)) {
					if (bw.e) {
						c_a5.eQ.a(1900546);
					} else {
						c_a5.eQ.a(1900554);
					}
				} else if (c_a5.method_try(16384) && !this.cl()) {
					if (--bw.field_void < 1) {
						bw.field_void = 1;
					} else if (bw.e) {
						c_a5.eQ.a(1900546);
					} else {
						c_a5.eQ.a(1900554);
					}
				} else if (c_a5.method_try(32768) && !this.cl()) {
					if (++bw.field_void > bw.c) {
						bw.field_void = bw.c;
					} else if (bw.e) {
						c_a5.eQ.a(1900546);
					} else {
						c_a5.eQ.a(1900554);
					}
				}
			} else if (this.g9 != 2425024 && this.g9 != 2425077) {
				if (this.g9 == 2621446) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						var8 = (ah) this.cf().elementAt(4);
						var10 = (ah) this.cf().elementAt(5);
						if (var8.q()) {
							c_a5.eQ.a(2621449);
						} else if (var10.q()) {
							c_a5.eQ.a(2621448);
							c_br.c6();
						}
					}
				} else if (this.g9 == 2424839) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						bo.field_char = 20;
						if (bo.t == 0) {
							if (c_a5.dU || bo.q != 3 && bo.q != 8) {
								c_as.cH = 20;
								c_as.a((byte) 1, "请您输入数量", "确定", "返回", 2424993, -1, -1, -1);
								c_a5.gQ.method_goto(1);
							} else {
								c_as.aY();
							}
						} else if (bo.t == 1) {
							if (!c_a5.dU && (bo.q == 3 || bo.q == 8)) {
								c_as.aY();
							} else {
								c_a5.eQ.a(2424993);
							}
						}
					}
				} else if (this.g9 == 2424995) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						bo.D = true;
						bo.field_char = 20;
						if (bo.g[bo.N] == 0) {
							if (!c_a5.dU && (bo.q == 3 || bo.q == 8)) {
								c_as.aY();
							} else {
								c_as.cH = 20;
								c_as.a((byte) 1, "请您输入数量", "确定", "返回", 2424993, -1, -1, -1);
								c_a5.gQ.method_goto(1);
							}
						} else if (bo.g[bo.N] == 1) {
							if (!c_a5.dU && (bo.q == 3 || bo.q == 8)) {
								c_as.aY();
							} else {
								ak var38;
								if (c_a5.method_for((var38 = (ak) this.cf().elementAt(15)).v(), var38.method_long(),
										var38.method_for(), var38.z())) {
									return;
								}

								c_a5.eQ.a(2424993);
							}
						}
					}
				} else if (this.g9 == 2297615) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						var9 = (a9) this.cf().elementAt(4);
						var14 = (a9) this.cf().elementAt(5);
						if (var9.q() || var14.q()) {
							c_a5.hC[0] = var9.cc().toString().trim();
							c_a5.hC[1] = var14.cc().toString().trim();
							if (c_a5.hC[0] == null || c_a5.hC[0].equals("") || c_a5.hC[1] == null
									|| c_a5.hC[1].equals("")) {
								c_b5.method_for(4, 5);
								return;
							}

							if (c_a5.hC[0].equals("")) {
								var3 = "您输入的账号或密码有错误，请重新输入！";
								c_a5.a((byte) 0, var3, "确定", "", -3, -120);
								return;
							}

							if (c_a5.hC[1].equals("")) {
								var3 = "您输入的账号或密码有错误，请重新输入！";
								c_a5.a((byte) 0, var3, "确定", "", -3, -120);
								return;
							}

							c_a5.eQ.a(2297615);
						}
					}
				} else if (this.g9 == 2297358) {
					if ((c_a5.method_byte(131072) || c_a5.method_byte(65536))
							&& (var9 = (a9) this.cf().elementAt(4)).q()) {
						c_a5.hC[0] = var9.cc().toString().trim();
						c_a5.hC[1] = "";
						if (c_a5.hC[0] == null || c_a5.hC[0].equals("")) {
							c_b5.method_if(4);
							return;
						}

						if (c_a5.hC[0].equals("")) {
							var2 = "您输入的账号或密码有错误，请重新输入！";
							c_a5.a((byte) 0, var2, "确定", "", -3, -120);
							return;
						}

						c_a5.eQ.a(2297615);
					}
				} else if (this.g9 == 1703958) {
					if (c_a5.method_byte(2048)) {
						var22 = (c_bv) this.cf().elementAt(3);
						var26 = (ak) this.cf().elementAt(4);
						if (var22.q()) {
							var22.a(false, this);
							var26.a(true, this);
							var26.ap();
						} else if (var26.q()) {
							var22.a(true, this);
							var26.a(false, this);
						}
					}
				} else if (this.g9 == 2425008) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						c_br.c6();
						var8 = (ah) c_a5.es.cf().elementAt(3);
						var10 = (ah) c_a5.es.cf().elementAt(4);
						var12 = (ah) c_a5.es.cf().elementAt(5);
						var4 = (ah) c_a5.es.cf().elementAt(6);
						var18 = (ah) c_a5.es.cf().elementAt(7);
						if (var8.q()) {
							c_a5.eQ.a(2425029);
						} else if (var10.q()) {
							(c_a5.es = c_e.a("/cm/ui/charge.ui")).g9 = -1610612697;
							((a9) c_a5.es.cf().elementAt(5)).method_if(100L);
						} else if (var12.q()) {
							c_a5.eQ.a(2425010);
							c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
							(c_a5.es = c_e.a("/cm/ui/remain.ui")).g9 = -1610612696;
							((ak) c_a5.es.cf().elementAt(3)).method_if("");
						} else if (var4.q()) {
							c_a5.eQ.a(2425011);
							c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
							(c_a5.es = c_e.a("/cm/ui/detail.ui")).g9 = -1610612695;
							((ak) c_a5.es.cf().elementAt(3)).method_if("");
						} else if (var18.q()) {
							(c_a5.es = c_e.a("/cm/ui/phelp.ui")).g9 = -1610612686;
							((ak) c_a5.es.cf().elementAt(3)).ap();
						}
					}
				} else if (this.g9 == -1610612688) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						var8 = (ah) c_a5.es.cf().elementAt(4);
						var10 = (ah) c_a5.es.cf().elementAt(5);
						var12 = (ah) c_a5.es.cf().elementAt(6);
						var4 = (ah) c_a5.es.cf().elementAt(7);
						if (var8.q()) {
							ci();
						} else if (var10.q()) {
							c_br.c6();
							c_a5.eQ.a(2425010);
							c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
							(c_a5.es = c_e.a("/cm/ui/remain.ui")).g9 = -1610612696;
							((ak) c_a5.es.cf().elementAt(3)).method_if("");
						} else if (var12.q()) {
							c_br.c6();
							c_a5.eQ.a(2425011);
							c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
							(c_a5.es = c_e.a("/cm/ui/detail.ui")).g9 = -1610612695;
							((ak) c_a5.es.cf().elementAt(3)).method_if("");
						} else if (var4.q()) {
							ci();
							ci();
						}
					}
				} else if (this.g9 == -1610612696) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						var8 = (ah) c_a5.es.cf().elementAt(4);
						var10 = (ah) c_a5.es.cf().elementAt(5);
						var12 = (ah) c_a5.es.cf().elementAt(6);
						if (var8.q()) {
							c_br.c6();
							(c_a5.es = c_e.a("/cm/ui/charge.ui")).g9 = -1610612697;
							((a9) c_a5.es.cf().elementAt(5)).method_if(100L);
						} else if (var10.q()) {
							c_br.c6();
							c_a5.eQ.a(2425011);
							c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
							(c_a5.es = c_e.a("/cm/ui/detail.ui")).g9 = -1610612695;
							((ak) c_a5.es.cf().elementAt(3)).method_if("");
						} else if (var12.q()) {
							ci();
						}
					}
				} else if (this.g9 == -1610612695) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						c_br.c6();
						var8 = (ah) c_a5.es.cf().elementAt(4);
						var10 = (ah) c_a5.es.cf().elementAt(5);
						if (var8.q()) {
							(c_a5.es = c_e.a("/cm/ui/pcrecord.ui")).g9 = -1610612640;
						} else if (var10.q()) {
							(c_a5.es = c_e.a("/cm/ui/pbrecord.ui")).g9 = -1610612639;
						}
					}
				} else if (this.g9 == -1610612640) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						if ((bk.field_if = (byte) (((ay) c_a5.es.cf().elementAt(3)).bm() + 1)) == 2) {
							c_as.cH = 999999;
							c_as.a((byte) 1, "请输入查询年月：\n（例：200906）", "确定", "取消", -1610612640, -1, -1, -1);
							c_a5.gQ.cA = 6;
						} else {
							c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
							c_a5.eQ.a(2425012);
						}
					}
				} else if (this.g9 == -1610612639) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						var1 = (ay) c_a5.es.cf().elementAt(3);
						bk.field_if = (byte) (((ay) c_a5.es.cf().elementAt(5)).bm() + 1);
						switch (var1.bm()) {
						case 0:
							bk.ay = 3;
							break;
						case 1:
							bk.ay = 5;
							break;
						case 2:
							bk.ay = 13;
						}

						if (bk.field_if == 2) {
							c_as.cH = 999999;
							c_as.a((byte) 1, "请输入查询年月：\n（例：200906）", "确定", "取消", -1610612639, -1, -1, -1);
							c_a5.gQ.cA = 6;
						} else {
							c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
							c_a5.eQ.a(2425013);
						}
					}
				} else if (this.g9 == 2424993) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						var8 = (ah) c_a5.es.cf().elementAt(4);
						var10 = (ah) c_a5.es.cf().elementAt(5);
						if (var8.q()) {
							ci();
						} else if (var10.q()) {
							c_a5.A();
						}
					}
				} else if (this.g9 == -1610612638) {
					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						c_a5.hC[0] = null;
						c_a5.hC[1] = null;
						var9 = (a9) c_a5.es.cf().elementAt(9);
						c_a5.hC[0] = var9.cc().toString().trim();
						var14 = (a9) c_a5.es.cf().elementAt(10);
						c_a5.hC[1] = var14.cc().toString().trim();
						c_a5.fc[0] = c_a5.hC[0];
						c_a5.fc[1] = c_a5.hC[1];
						if (c_a5.hC[0] == null || c_a5.hC[0].equals("") || c_a5.hC[1] == null
								|| c_a5.hC[1].equals("")) {
							c_b5.a();
							return;
						}

						var3 = "账号：" + c_a5.hC[0] + "\n" + "密码：" + c_a5.hC[1] + "\n" + "是否确定此账号、密码？";
						c_as.a((byte) 0, var3, "确定", "修改", -28, -1);
					}
				} else if (this.g9 == 2425079 && c_a5.method_byte(196608)) {
					c_a5.eQ.a(2425080);
				}
			} else if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				if (c_a5.method_try(4096)) {
					if (--g3 < 0) {
						g3 = hE.length - 1;
					}
				} else if (c_a5.method_try(8192) && ++g3 > hE.length - 1) {
					g3 = 0;
				}
			} else {
				cz();
			}

			if (this.g9 == -1610612687) {
				if (c_a5.method_byte(4096)) {
					if (this.gS >= 3) {
						this.gS -= 3;
						return;
					}
				} else if (c_a5.method_byte(8192)) {
					if (this.gS <= c_a5.cJ.field_int - 1 - 3) {
						this.gS += 3;
						return;
					}
				} else if (c_a5.method_byte(16384)) {
					--this.gS;
					if (this.gS < 0) {
						this.gS = 0;
						return;
					}
				} else if (c_a5.method_byte(32768)) {
					++this.gS;
					if (this.gS > c_a5.cJ.field_int - 1) {
						this.gS = c_a5.cJ.field_int - 1;
						return;
					}
				} else if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
					if (gu.B.length() + 4 >= 30) {
						c_as.a((byte) 5, "您输入的聊天字数已达上限！", "确定", "", -1, -2);
						return;
					}

					StringBuffer var10000 = new StringBuffer();
					a3 var10002 = gu;
					var10002.B = var10000.append(var10002.B).append("#").append(c_a5.es.gS).toString();
					gu.method_if(false);
				}
			}
		}

	}

	public static void ci() {
		try {
			if (at.field_int[0] != -1) {
				c_a5.es.cg();
			} else {
				boolean var0 = true;
				int var1;
				int var12;
				short var13;
				switch (c_a5.es.g9) {
				case -1610612735:
					c_b5.a(c_bv.ju, "gameKey" + c_a5.gG);
					c_a5.iq = c_b5.method_int("gameKey" + c_a5.gG, c_a5.iH.length);
					break;
				case -1610612734:
					b2.a();
					b2.field_try.method_else();
					break;
				case -1610612728:
					var13 = 0;
					short var10 = 0;

					for (var12 = 0; var12 < 5; ++var12) {
						ay var16 = (ay) c_a5.es.hc.elementAt(var12 + 3);
						if (var12 == 0) {
							var10 = (short) var16.bm();
						} else {
							var13 = (short) (var13 | var16.bm() << var12 - 1);
						}
					}

					c_a5.dM = var13;
					c_a5.gn = (byte) var10;
					c_b5.a(new short[] { c_a5.dM, var10 }, "showSetup");
					c_a5.J();
					if (c_l.a().field_try == 1 && c_l.a() != bp.ag() && var10 == 2) {
						c_l.method_do(bp.ag());
						bp.ag().aA();
					}

					c_a5.eQ.a(196632);
					break;
				case -1610612727:
					c_a5.gK = ((ay) c_a5.es.hc.elementAt(3)).bm();
					if (bp.ag().r() < 20) {
						c_a5.eQ.a(196635);
					}

					c_a5.hi = (byte) (((ay) c_a5.es.hc.elementAt(9)).bm() ^ 1);
					c_b5.a(new byte[] { c_a5.hi }, "quantitySetup");
					c_b5.a(new byte[] { c_a5.gK }, "pvpSetup" + c_a5.gG);
					c_a5.eQ.a(196637);
					break;
				case -1610612699:
					var13 = 0;

					for (int var9 = 0; var9 < 5; ++var9) {
						ay var14 = (ay) c_a5.es.hc.elementAt(var9 + 4);
						var13 = (short) (var13 | var14.bm() << var9);
					}

					c_ad.I = var13;
					c_a5.eQ.a(655362);
					break;
				case -1610612687:
					gu.method_if(false);
					var0 = false;
					break;
				case -1610612632:
					u.field_byte = false;
					break;
				case 196641:
				case 196642:
					if (c_l.d) {
						c_l.d = false;
					} else {
						c_as.a((byte) 0, "您确定退出战场吗？", "确定", "取消", 852005, -1);
					}
					break;
				case 262154:
					if (bf.field_if) {
						bf.field_if = false;
					}

					c_bv.jP = true;
					break;
				case 262193:
					gu.method_if(false);
					var0 = false;
					break;
				case 393225:
				case 393229:
					c_y.S = false;
					break;
				case 393231:
				case 655363:
				case 1703948:
				case 1703954:
				case 1900552:
				case 3342337:
				case 3342338:
				case 3342339:
					if (am.field_new > 0) {
						am.field_new = 0;
					}

					if (am.field_else) {
						am.field_else = false;
					}

					if (!am.a) {
						am.a = true;
					}
					break;
				case 458760:
					au.a = 0;
					am.a();
					break;
				case 458773:
					gu.method_if(false);
					var0 = false;
					break;
				case 524292:
					if (c_ao.ci) {
						c_as.a((byte) 35, "已有天赋增加了点数，是否退出？", "是", "否", -2, -2);
						var0 = false;
					}
					break;
				case 720910:
					c_bu.q = ((ay) c_a5.es.hc.elementAt(3)).bj();
					c_a5.eQ.a(720903);
					break;
				case 720913:
					c_a5.eQ.a(720912);
					break;
				case 720915:
				case 720916:
					c_a5.eQ.a(720917);
					break;
				case 852020:
					c_l.d = false;
					if (c_l.field_goto != 3) {
						c_l.field_goto = 3;
					}
					break;
				case 917505:
					au.field_int = -1;
					au.a = 0;
					break;
				case 917525:
				case 2031621:
				case 2031636:
				case 3342356:
					aq.method_if();
					break;
				case 1245185:
					g1 = false;
					c_y.S = false;
					c_y.M = false;
					break;
				case 1638401:
					c_bt.field_else = "";
					c_bt.field_case = "";
					break;
				case 1638421:
					c_bt.a();
					break;
				case 1703937:
				case 1703938:
				case 1703952:
					c_r.ed();
					c_q.a();
					break;
				case 1703945:
					c_q.t = 0;
					break;
				case 1703946:
					c_r var11 = (c_r) c_a5.es.hc.elementAt(10);
					c_be var8;
					if ((var8 = (c_be) c_a5.d6.elementAt(c_a5.d6.size() - 1)) != null) {
						for (var12 = 0; var12 < c_q.field_int.length; ++var12) {
							a7 var15;
							(var15 = (a7) var8.hc.elementAt(var12 + 7)).fC = (byte) c_q.field_int[var12][2];
							short var5 = c_q.field_int[var12][1];
							var15.ft = true;
							var15.method_if(var5, false);
							var15.a(c_a5.gg);
							if (c_q.field_int[var12][3] == 1) {
								if (var11.nv[c_q.field_int[var12][0]]) {
									var15.a(true, (byte) 1);
								} else {
									var15.g(false);
								}
							} else {
								var11.nv[var12] = true;
								if (c_q.field_int[var12][3] > 0) {
									var15.a(true, (byte) c_q.field_int[var12][3]);
								} else {
									var15.g(false);
								}
							}
						}
					}
					break;
				case 1703959:
				case 1703960:
				case 1703961:
					c_a5.iE = false;
					break;
				case 1703969:
					var0 = false;
					break;
				case 1703971:
					if (c_q.b == 5) {
						var0 = false;
					}
					break;
				case 1703972:
					var0 = false;
					break;
				case 1835009:
					c_i.field_goto = "";
					c_i.field_int = "";
					break;
				case 1900547:
					bw.method_if((byte) 2);
					break;
				case 1966081:
					if (au.field_if == 2) {
						c_a5.eQ.a(917507);
					} else if (au.field_if == 1) {
						c_r.mp = au.field_int;
						c_a5.eQ.a(458753);
					}

					au.field_int = -1;
					au.field_try = -1;
					break;
				case 1966087:
				case 1966089:
					for (var1 = 0; var1 < c_a5.d6.size() - 1; ++var1) {
						c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
					}

					au.field_int = -1;
					au.field_try = -1;
					break;
				case 1966097:
					a7 var7 = (a7) c_a5.es.hc.elementAt(4);
					a7 var2 = (a7) c_a5.es.hc.elementAt(6);
					c_r var3 = (c_r) c_a5.es.hc.elementAt(7);

					for (int var4 = 0; var4 < c_r.mY.length; ++var4) {
						c_r.mY[var4] = -1;
					}

					var7.g(false);
					var7.ft = false;
					var7.a((bi) null);
					var2.g(false);
					var2.ft = false;
					var2.a((bi) null);
					var3.a(false, c_a5.es);
					var7.a(true, c_a5.es);
					var2.a(false, c_a5.es);
					var7.g(false);
					var7.ft = false;
					var7.a((bi) null);
					var2.g(false);
					var2.ft = false;
					var2.a((bi) null);
					au.field_int = -1;
					au.field_try = -1;
					au.field_char = -1;
					au.field_for = 0;
					au.field_byte = -1;
					break;
				case 1966100:
					au.field_for = 0;

					for (var1 = 0; var1 < c_r.mY.length; ++var1) {
						c_r.mY[var1] = -1;
					}

					au.field_int = -1;
					au.field_try = -1;
					au.field_char = -1;
					au.field_for = 0;
					au.field_byte = -1;
					au.field_do = -1;
					break;
				case 2097155:
					if (!by.field_else) {
						by.field_do = false;
						by.field_int = 0;
						by.e = 0;
						by.c = 0;
						by.b = false;
						by.field_void = false;
						by.f = false;
						by.d = false;
						by.field_if = 0;
						by.field_case = 0;
						by.field_new = 0;
						by.a = 0;
						by.field_long = 0;
						by.c = 0;

						for (var1 = 0; var1 < 7; ++var1) {
							by.field_try[var1] = null;
						}
					}
					break;
				case 2228225:
				case 2228256:
					aj.a();
					break;
				case 2425024:
				case 2425029:
				case 2425072:
					bo.q = 0;
					System.out.println("清空购买类型变量！！！");
					if (c_a5.es.g9 == 2425029 && c_a5.d6.size() > 1) {
						c_a5.d6.removeElementAt(1);
					}

					if (bo.p) {
						bo.p = false;
						var0 = false;
						c_a5.eQ.a(1179658);
					}

					if (bo.j) {
						bo.j = false;
						var0 = false;
						cn();
						(gu = new a3((byte) 6)).method_byte();
						c_a5.method_case((byte) 3);
					}
					break;
				case 2555905:
					if (az.field_else != 0) {
						az.field_else = 0;
					}

					az.m = 0;
					c_a5.eQ.a(2555952);
					break;
				case 2555906:
					az.field_byte = new String[3];
					az.n = 0;
					break;
				case 2555908:
				case 2555911:
				case 2555957:
					c_a5.eQ.a(2555973);
					break;
				case 2555936:
					if (az.field_for == 1) {
						az.field_for = -1;
					}
					break;
				case 2555941:
				case 2555943:
				case 2555945:
					if (c_a5.es.g9 == 2555945) {
						az.field_char = 1;
					} else if (c_a5.es.g9 == 2555943) {
						az.field_char = 2;
					} else if (c_a5.es.g9 == 2555941) {
						az.field_char = 3;
					}

					c_a5.eQ.a(2555974);
					break;
				case 2621442:
					if (bo.e > 0) {
						bo.e = 0;
						c_a5.eQ.a(2425024);
					}
					break;
				case 3145729:
					c_a5.eQ.a(3145736);
					break;
				case 3145730:
					c_a5.eQ.a(3145737);
					break;
				case 3342340:
					if (am.field_try != 0) {
						am.field_try = 0;
					}
				}

				if (var0) {
					if (c_a5.es.g9 == 589834 || c_a5.es.g9 == 655363 || gJ) {
						gJ = false;
						c_a5.method_case((byte) 3);
						cn();
						return;
					}

					if (c_a5.es.g9 == 2097155 && by.field_else) {
						return;
					}

					if ((c_a5.es.g9 == 196642 || c_a5.es.g9 == 196641) && c_a5.gQ != null) {
						return;
					}

					cn();
				}

				return;
			}
		} catch (Exception var6) {
			var6.getMessage();
		}

	}

	public static final void cn() {
		c_ad.method_new();
		int var0;
		if ((var0 = c_a5.d6.size()) > 0) {
			Object var1 = c_a5.d6.elementAt(var0 - 1);
			c_a5.d6.removeElementAt(var0 - 1);
			if (var1 instanceof Integer) {
				c_a5.fE.removeAllElements();
				if ((var0 = (Integer) var1) == 0) {
					c_a5.A();
					return;
				}

				c_a5.eQ.a(var0);
			} else if (var1 instanceof c_be) {
				c_a5.fE.removeAllElements();
				(c_a5.es = (c_be) var1).ck();
			} else {
				if (!(var1 instanceof Vector)) {
					if (var1 instanceof Byte) {
						byte var3 = (Byte) var1;
						c_a5.es = (c_be) c_a5.fE.elementAt(var3);
						((c_be) c_a5.fE.elementAt(0)).ht = var3;
						c_a5.es.ck();
					}

					return;
				}

				c_a5.fE.removeAllElements();
				Vector var2;
				if ((var1 = (var2 = (Vector) var1).elementAt(0)) instanceof c_be) {
					c_a5.fE = var2;
					(c_a5.es = (c_be) var2.elementAt(((c_be) var1).ht)).ck();
					return;
				}

				if (var1 instanceof Integer) {
					c_a5.eQ.a(var2);
				}
			}
		} else {
			c_a5.A();
			if (c_br.iW != null) {
				c_a5.method_try((byte) 5);
			}
		}

	}

	private boolean cl() {
		for (int var1 = 0; var1 < this.hc.size(); ++var1) {
			if (((ba) this.hc.elementAt(var1)).field_byte) {
				return true;
			}
		}

		return false;
	}

	public final void cs() {
		for (int var1 = 0; var1 < this.hc.size(); ++var1) {
			((ba) this.hc.elementAt(var1)).field_byte = false;
		}

	}

	private void cq() {
		final Form var1 = new Form("修改昵称");
		final TextField var2 = new TextField("修改昵称，最多输入六个汉字或字母（包括数字）", "", 6, 0);
		var1.append(var2);
		final Command var3 = new Command(c_bm.a2[2], 4, 0);
		final Command var4 = new Command(c_bm.a2[1], 3, 1);
		var1.addCommand(var3);
		var1.addCommand(var4);
		var1.setCommandListener(new CommandListener() {
			public final void commandAction(Command var1x, Displayable var2x) {
				if (var1x == var3) {
					Alert var3x;
					if (c_a5.e0[c_a5.hg].equals(var2.getString())) {
						var2.setString("");
						var3x = new Alert(c_bm.a2[9], "请您更换昵称！", (Image) null, AlertType.ERROR);
						c_a5.dI.display.setCurrent(var3x, var1);
					} else if (!c_a5.a(var2.getString(), (byte) 2)) {
						var3x = new Alert(c_bm.a2[9], "您输入的内容不符合要求，请您重新输入！", (Image) null, AlertType.ERROR);
						var2.setString("");
						c_a5.dI.display.setCurrent(var3x, var1);
					} else if (var2.getString() != null && !var2.getString().equals("")) {
						c_be.gU[0] = c_a5.e0[c_a5.hg];
						c_be.gU[1] = var2.getString();
						c_a5.eQ.a(1114119);
						c_a5.dI.display.setCurrent(c_a5.e8);
						String var4x = "请稍候...";
						c_a5.a((byte) 0, var4x, "", "", -120, -120);
					} else {
						var3x = new Alert(c_bm.a2[9], "请您输入内容！", (Image) null, AlertType.ERROR);
						c_a5.dI.display.setCurrent(var3x, var1);
					}
				} else {
					if (var1x == var4) {
						var2.setString("");
						var1.removeCommand(var3);
						var1.removeCommand(var4);
						c_a5.e8.setFullScreenMode(true);
						c_a5.dI.display.setCurrent(c_a5.e8);
					}

				}
			}
		});
		c_a5.dI.display.setCurrent(var1);
	}

	private static void cp() {
		c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
		bk.Q = false;
		if (bk.m()) {
			String var0 = "/judgeserver/QueryBalance?usr=&userId=" + c_a5.ik + "&game=fengshen&subgame=" + "fengshen"
					+ "&from=kong";
			(new bk(bk.field_void, var0, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 7);
		} else {
			bk.b = true;
			(new bk(bk.aG, bk.aQ, (byte) (c_a5.dU ? 0 : 1), (byte) 1)).a((byte) 7);
		}
	}

	private static void co() {
		c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
		bk.Q = true;
		if (bk.m()) {
			String var0 = "/judgeserver/QueryBalance?usr=&userId=" + c_a5.ik + "&game=fengshen&subgame=" + "fengshen"
					+ "&from=kong";
			(new bk(bk.field_void, var0, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 7);
		} else {
			bk.b = true;
			(new bk(bk.aG, bk.aQ, (byte) (c_a5.dU ? 0 : 1), (byte) 1)).a((byte) 7);
		}
	}

	public static void cu() {
		ay var0 = (ay) c_a5.es.hc.elementAt(5);
		ay var1 = (ay) c_a5.es.hc.elementAt(6);
		ay var2 = (ay) c_a5.es.hc.elementAt(8);
		ak var3 = (ak) c_a5.es.hc.elementAt(10);
		a9 var4 = (a9) c_a5.es.hc.elementAt(9);
		if (var0.q()) {
			if (c_a5.ci == 1) {
				var3.method_if(c_bm.bp[0]);
				return;
			}

			if (c_a5.ci == 2) {
				var3.method_if(c_bm.bp[1]);
				return;
			}
		} else if (var1.q()) {
			if (c_a5.ck == 1) {
				var3.method_if(c_bm.bp[2]);
				return;
			}

			if (c_a5.ck == 2) {
				var3.method_if(c_bm.bp[3]);
				return;
			}

			if (c_a5.ck == 3) {
				var3.method_if(c_bm.bp[4]);
				return;
			}

			if (c_a5.ck == 4) {
				var3.method_if(c_bm.bp[5]);
				return;
			}
		} else if (var2.q()) {
			if (c_a5.ig == 1) {
				var3.method_if(c_bm.bp[6]);
				return;
			}

			if (c_a5.ig == 2) {
				var3.method_if(c_bm.bp[7]);
				return;
			}

			if (c_a5.ig == 3) {
				var3.method_if(c_bm.bp[8]);
				return;
			}

			if (c_a5.ig == 4) {
				var3.method_if(c_bm.bp[9]);
				return;
			}

			if (c_a5.ig == 5) {
				var3.method_if(c_bm.bp[10]);
				return;
			}

			if (c_a5.ig == 6) {
				var3.method_if(c_bm.bp[11]);
				return;
			}
		} else if (var4.q()) {
			var3.method_if("请输入昵称");
		}

	}

	private static void r(byte var0) {
		for (int var1 = 0; var1 < 3; ++var1) {
			ah var2;
			if ((var2 = (ah) c_a5.es.hc.elementAt(var1 + 35)).q() && var2.field_byte) {
				return;
			}

			if (var2.q()) {
				var2.a(false, c_a5.es);
			}
		}

		ah var5;
		if (!(var5 = (ah) c_a5.es.hc.elementAt(var0)).q()) {
			var5.a(true, c_a5.es);
			var5.af();
		} else if (var5.q() && !var5.field_byte) {
			var5.af();
		}

		a7 var4;
		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			if ((var4 = (a7) c_a5.es.hc.elementAt(var6 + 11)).q()) {
				var4.a(false, c_a5.es);
			}
		}

		for (var6 = 0; var6 < 6; ++var6) {
			if ((var4 = (a7) c_a5.es.hc.elementAt(var6 + 25)).q()) {
				var4.a(false, c_a5.es);
			}
		}

	}

	public static void a(Graphics var0, int var1, int var2, byte var3) {
		if (var3 == 1) {
			var0.setColor(7934208);
			var0.fillRect(var1, var2, 10, 8);
			var0.setColor(16721152);
			var0.fillRect(var1 + 1, var2 + 1, 8, 6);
			var0.setColor(7934208);
			var0.drawLine(var1, var2, var1 + 5, var2 + 5);
			var0.drawLine(var1 + 9, var2, var1 + 4, var2 + 5);
		}

		if (var3 == 2) {
			var0.setColor(4144959);
			var0.fillRect(var1 - 3, var2, 13, 8);
			var0.fillTriangle(var1 - 3, var2, var1 + 3, var2 - 5, var1 + 10, var2);
			var0.setColor(8947848);
			var0.fillRect(var1 - 2, var2 + 1, 11, 6);
			var0.fillTriangle(var1 - 2, var2 + 1, var1 + 3, var2 - 4, var1 + 10, var2 + 2);
			var0.setColor(4144959);
			var0.drawLine(var1 - 3, var2, var1 - 3 + 12, var2);
			var0.drawLine(var1 - 3, var2, var1 + 2, var2 + 5);
			var0.drawLine(var1 - 3 + 12, var2, var1 + 4, var2 + 5);
			var0.fillRect(var1 + 2 + 1, var2 + 5, 1, 1);
		}

	}

	private static void cz() {
		switch (bo.q = hE[g3]) {
		case 0:
			c_br.dm();
			c_a5.eQ.a(2425029);
			return;
		case 1:
			c_br.dm();
			c_a5.eQ.a(2425029);
			return;
		case 2:
			c_a5.eQ.a(2425029);
			c_br.c6();
			return;
		case 3:
			c_a5.eQ.a(2425029);
			c_br.c6();
			return;
		case 4:
			c_br.dm();
			c_a5.eQ.a(2621441);
			return;
		case 5:
			c_br.dm();
			c_a5.eQ.a(2621442);
			return;
		case 6:
			c_a5.eQ.a(new int[] { 2424834, 2424842 });
			c_br.c6();
			return;
		case 7:
			c_br.dm();
			c_a5.eQ.a(2425077);
			return;
		case 8:
		case 9:
		case 10:
			c_br.c6();
			c_a5.eQ.a(2425078);
			return;
		default:
			System.out.println("未知消费类型！");
		}
	}
}
