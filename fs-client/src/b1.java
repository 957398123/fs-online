import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextField;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class b1 extends ba {
	private static final String[] lY = new String[] { "人物", "背包", "能力", "社交", "商城", "地图", "队伍", "任务", "设置", "服务", "离开",
			"活动" };
	private static final String[] l9 = new String[] { "人物", "背包", "能力", "社交", "注册", "地图", "队伍", "任务", "设置", "服务", "离开",
			"活动" };
	private static final String[] lG = new String[] { "人物", "背包", "能力", "社交", "改昵称", "地图", "队伍", "任务", "设置", "服务", "离开",
			"活动" };
	private static final String[] lP = new String[] { "基础", "攻防", "装备", "声望", "战绩", "资料", "时间", "排行榜", "挂机" };
	private static final String[] lX = new String[] { "菜单选项", "能　力", "社　交", "地　图", "设　置", "服　务", "人　物", "离开", "氏族",
			"诸侯", "生产", "采集", "任务", "商      城", "客      服", "师　徒", "宝　石", "挂　机" };
	private static final String[] l3 = new String[] { "天赋树", "技能栏", "快捷键", "生产", "采集", "宝石", "铭刻", "强化" };
	private static final String[] lI = new String[] { "搜索", "交友", "好友", "黑名单", "氏族", "诸侯", "聊天", "仇人", "伴侣", "师徒", "论坛",
			"兄弟" };
	private static final String[] l8 = new String[] { "创建", "氏族", "详情", "权限", "个人", "上交", "公告", "成员" };
	private static final String[] lJ = new String[] { "详情", "编制", "公告", "职位" };
	private static final String[] l4 = new String[] { "锻造", "铸甲", "制革", "裁缝", "凝元", "分解" };
	private static final String[] lE = new String[] { "可接", "任务", "可重置", "收藏夹" };
	private static final String[] ln = new String[] { "采矿", "采药", "织布", "剥皮" };
	private static final String[] lA = new String[] { "本地", "寻路", "世界", "农场", "战场" };
	private static final String[] lF = new String[] { "按键", "快捷键", "显示", "聊天", "其他" };
	private static final String[] lo = new String[] { "论坛", "客服", "帮助", "绑定" };
	private static final String[] l2 = new String[] { "客服", "帮助" };
	private static final String[] l1 = new String[] { "提问", "回复" };
	private static final String[] lW = new String[] { "换角色", "主菜单", "活动", "官网" };
	private static final String[] lR = new String[] { "师傅", "徒弟" };
	private static final String[] lV = new String[] { "开封", "雕琢", "合成", "解除", "还原" };
	private static final String[] lp = new String[] { "挂机", "攻击技", "守护技", "帮助" };
	public Stack l6 = new Stack();
	public static String lN = "";
	int lB = 0;
	int lz = 0;
	int lC = 0;
	int lK = 0;
	public static b1.a lx = null;
	private b1.a lM = null;
	private b1.a l7 = null;
	private b1.a lv = null;
	private b1.a lu = null;
	private b1.a lS = null;
	private b1.a l0 = null;
	private b1.a lU = null;
	private b1.a lL = null;
	private b1.a lZ = null;
	private b1.a lw = null;
	private b1.a lH = null;
	private b1.a lT = null;
	private b1.a lr = null;
	private b1.a ls = null;
	private b1.a lq = null;
	private b1.a ma = null;
	private b1.a mb = null;
	private b1.a l5 = null;

	public b1() {
		super((short) 0, (short) 0, (short) 0, (short) 0, (c_be) null);
		if (c_a5.hQ == 1) {
			lM = new b1.a(lX[0], l9);
		} else if (c_a5.hQ == 2) {
			lM = new b1.a(lX[0], lG);
		} else {
			lM = new b1.a(lX[0], lY);
		}

		lv = new b1.a(lX[1], l3);
		lu = new b1.a(lX[2], lI);
		lS = new b1.a(lX[3], lA);
		l0 = new b1.a(lX[4], lF);
		lU = new b1.a(lX[5], lo);
		l7 = new b1.a(lX[6], lP);
		lL = new b1.a(lX[7], lW);
		lZ = new b1.a(lX[8], l8);
		lw = new b1.a(lX[9], lJ);
		lH = new b1.a(lX[10], l4);
		lT = new b1.a(lX[11], ln);
		ls = new b1.a(lX[12], lE);
		lq = new b1.a(lX[14], l1);
		ma = new b1.a(lX[15], lR);
		mb = new b1.a(lX[16], lV);
		l5 = new b1.a(lX[17], lp);
		if (bp.ag().aS() == 0) {
			lr = new b1.a("聊天频道", new String[] { "综合", "私聊", "世界", "氏族", "场景", "队伍", "系统", "喇叭" });
		} else {
			lr = new b1.a("聊天频道", new String[] { "综合", "私聊", "世界", "诸侯", "场景", "队伍", "系统", "喇叭" });
		}

		lM.a((byte) 3, lv);
		lM.a((byte) 4, lu);
		lM.a((byte) 6, lS);
		lM.a((byte) 9, l0);
		lM.a((byte) 10, lU);
		lM.a((byte) 1, l7);
		lM.a((byte) 11, lL);
		lM.a((byte) 8, ls);
		lu.a((byte) 5, lZ);
		lu.a((byte) 6, lw);
		lu.a((byte) 7, lr);
		lv.a((byte) 4, lH);
		lv.a((byte) 5, lT);
		lv.a((byte) 6, mb);
		lU.a((byte) 2, lq);
		lu.a((byte) 10, ma);
		l7.a((byte) 9, l5);
		(lx = lM).method_if((byte) 5);
		super.j = (short) (c_a5.il >> 3);
		a(true, (c_be) null);
	}

	public final void f() {
		if (lx != null) {
			if (lx != null && c_a5.V() == 1) {
				b1.a var8;
				// FIXME 存在争议
				var8 = lx;
				b1 var1 = lx.this$0();
				if (c_a5.gZ && c_a5.method_byte(268435456)) {
					int var2 = var1.j + (c_a5.iG + 14) * c_a5.il / 208;
					int var3 = 166 * c_a5.ic / 176;
					int var4 = 81 * c_a5.il / 208;
					var3 -= 21;
					int var5 = var4 - 13;
					int var6 = c_a5.ic - var3 >> 1;
					var2 += var4 - var5 >> 1;
					var4 = c_a5.ic;
					int var7 = c_a5.il;
					if (c_a5.a(var6, var2, var3, var5)) {
						short var10 = c_a5.cV;
						short var11 = c_a5.cU;
						int var9 = (var10 - var6) / var1.lC + (var11 - var2) / var1.lK * 3 + 1;
						lx.method_if((byte) var9);
						lx.method_char();
					} else if (c_a5.a(0, 0, var4, var7)) {
						c_a5.a(262144);
					}
				}

				if (c_a5.method_try(4096)) {
					switch (var8.field_for) {
					case 1:
					case 2:
					case 3:
						return;
					default:
						var8.method_if((byte) (var8.field_for - 3));
						if (!var8.field_do[var8.field_for - 1].field_for) {
							var8.method_if(var8.field_byte);
							return;
						}
					}
				} else if (c_a5.method_try(8192)) {
					switch (var8.field_for) {
					case 10:
					case 11:
					case 12:
						return;
					default:
						var8.method_if((byte) (var8.field_for + 3));
						if (!var8.field_do[var8.field_for - 1].field_for) {
							var8.method_if(var8.field_byte);
							return;
						}
					}
				} else if (c_a5.method_try(16384)) {
					switch (var8.field_for) {
					case 1:
						return;
					default:
						var8.method_if((byte) (var8.field_for - 1));
						if (!var8.field_do[var8.field_for - 1].field_for) {
							var8.method_if(var8.field_byte);
							return;
						}
					}
				} else if (c_a5.method_try(32768)) {
					switch (var8.field_for) {
					case 12:
						return;
					default:
						var8.method_if((byte) (var8.field_for + 1));
						if (!var8.field_do[var8.field_for - 1].field_for) {
							var8.method_if(var8.field_byte);
							return;
						}
					}
				} else {
					if (c_a5.method_byte(2)) {
						var8.method_if((byte) 1);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(4)) {
						var8.method_if((byte) 2);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(8)) {
						var8.method_if((byte) 3);
						var8.method_char();
						c_b5.method_case("positionIndex = " + var8.field_for);
						return;
					}

					if (c_a5.method_byte(16)) {
						var8.method_if((byte) 4);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(32)) {
						var8.method_if((byte) 5);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(64)) {
						var8.method_if((byte) 6);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(128)) {
						var8.method_if((byte) 7);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(256)) {
						var8.method_if((byte) 8);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(512)) {
						var8.method_if((byte) 9);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(1)) {
						var8.method_if((byte) 11);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(1024)) {
						var8.method_if((byte) 10);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(2048)) {
						var8.method_if((byte) 12);
						var8.method_char();
						return;
					}

					if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
						var8.method_byte();
						return;
					}

					if (c_a5.method_byte(262144)) {
						if (lx.field_new) {
							lx = var8.field_if;
							var8.this$0().l6.pop();
							return;
						}

						var8.this$0().a(false, (c_be) null);
						c_a5.aj();
					}
				}
			}

		}
	}

	public final void a(Graphics var1) {
		if (lx != null) {
			int var4 = (4 * c_a5.iA + 22) * c_a5.ic / 176;
			int var5 = (c_a5.iG + 12) * c_a5.il / 208;
			int var6 = c_a5.ic - var4 >> 1;
			var1.setColor(c_bm.ay);
			var1.drawRect(var6, super.j - 1, var4, var5);
			var1.setColor(c_bm.ax);
			var1.drawRect(var6 + 1, super.j, var4 - 2, var5 - 2);
			var1.setColor(c_bm.aw);
			var1.fillRect(var6 + 2, super.j + 1, var4 - 3, var5 - 3);
			var1.setColor(c_bm.ay);
			var1.drawRect(var6 + 5, super.j + 2, var4 - 10, var5 - 6);
			var1.drawRect(var6 + 6, super.j + 2, var4 - 12, var5 - 6);
			var1.drawRect(var6 + 7, super.j + 2, var4 - 14, var5 - 6);
			var1.drawRect(var6 + 9, super.j + 4, var4 - 18, var5 - 10);
			Graphics var3 = var1;
			var4 = super.j + (c_a5.iG + 14) * c_a5.il / 208;
			var5 = 166 * c_a5.ic / 176;
			var6 = c_a5.ic - var5 >> 1;
			int var13 = 81 * c_a5.il / 208;
			var1.setColor(c_bm.ay);
			var1.drawRect(var6, var4, var5, var13);
			var1.setColor(c_bm.ax);
			var1.drawRect(var6 + 1, var4 + 1, var5 - 2, var13 - 2);
			var1.setColor(c_bm.aw);
			var1.fillRect(var6 + 2, var4 + 2, var5 - 3, var13 - 3);
			var1.setColor(c_bm.ay);
			var6 = var5 - 13;
			int var7 = var13 - 9;
			var1.drawRect(c_a5.ic - var6 >> 1, var4 + (var13 - var7 >> 1), var6, var7);
			var6 = var5 - 15;
			var7 = var13 - 9;
			var1.drawRect(c_a5.ic - var6 >> 1, var4 + (var13 - var7 >> 1), var6, var7);
			var6 = var5 - 17;
			var7 = var13 - 9;
			var1.drawRect(c_a5.ic - var6 >> 1, var4 + (var13 - var7 >> 1), var6, var7);
			var6 = var5 - 21;
			var7 = var13 - 13;
			var5 = c_a5.ic - var6 >> 1;
			int var8 = var4 + (var13 - var7 >> 1);
			var1.setColor(14602158);
			int var9 = (var7 + 1) / 4;
			int var10 = (var6 + 1) / 3;
			lB = var5;
			lz = var8;
			lC = var10;
			lK = var9;

			int var14;
			for (var14 = 0; var14 < 12; ++var14) {
				if (var14 % 2 == 0) {
					int var11 = var14 / 3;
					int var12 = var14 % 3;
					var3.fillRect(var5 + var12 * var10, var8 + var11 * var9, var10 + 1, var9);
				}
			}

			var3.setColor(c_bm.ay);
			var3.drawRect(c_a5.ic - var6 >> 1, var4 + (var13 - var7 >> 1), var6, var7);
			var3.drawImage(c_a5.gu, -2, var4 + 4, 20);
			var3.drawImage(c_a5.gu, -2, var4 + var13 - c_a5.gu.getHeight() - 4, 20);
			c_b5.a(var3, c_a5.gu, c_a5.ic - c_a5.gu.getWidth() + 2, var4 + 4, 2);
			c_b5.a(var3, c_a5.gu, c_a5.ic - c_a5.gu.getWidth() + 2, var4 + var13 - c_a5.gu.getHeight() - 4, 2);
			var3.setColor(c_bm.ay);

			for (var14 = 0; var14 < 3; ++var14) {
				var3.drawLine(var5, var8 + var9 * (var14 + 1), var5 + var6, var8 + var9 * (var14 + 1));
			}

			for (var14 = 0; var14 < 2; ++var14) {
				var3.drawLine(var5 + var10 * (var14 + 1), var8, var5 + var10 * (var14 + 1), var8 + var7);
			}

			if (lx != null) {
				lx.method_for(var1);
				Graphics var16 = var1;
				b1.a var15 = lx;

				for (var5 = 0; var5 < var15.a.length; ++var5) {
					var6 = var5 / 3;
					var13 = var5 % 3;
					if (!var15.a[var5].equals("改昵称") && !var15.a[var5].equals("注册") && !var15.a[var5].equals("喇叭")) {
						var16.setColor(c_bm.aZ);
					} else {
						var16.setColor(16711680);
					}

					access$200(var15.this$0(), var16, var15.a[var5], var15.this$0().lB + var13 * var15.this$0().lC,
							var15.this$0().lz + var6 * var15.this$0().lK, var15.this$0().lC, var15.this$0().lK,
							c_a5.fq);
				}

				var15 = lx;
				var1.setColor(c_bm.ay);
				var5 = (var15.field_for - 1) / 3;
				var6 = (var15.field_for - 1) % 3;
				var1.fillRect(var15.this$0().lB + var6 * var15.this$0().lC + 2,
						var15.this$0().lz + var5 * var15.this$0().lK + 2, var15.this$0().lC - (var6 == 2 ? 2 : 3),
						var15.this$0().lK - 3);
				if (!var15.a[var15.field_for - 1].equals("改昵称") && !var15.a[var15.field_for - 1].equals("注册")) {
					var1.setColor(c_bm.aw);
				} else {
					var1.setColor(16711680);
				}

				access$200(var15.this$0(), var1, var15.a[var15.field_for - 1],
						var15.this$0().lB + var6 * var15.this$0().lC, var15.this$0().lz + var5 * var15.this$0().lK,
						var15.this$0().lC, var15.this$0().lK, c_a5.fq);
			}

		}
	}

	public static void v(int var0) {
		dN();

		for (int var1 = (new String(var0 + "")).length() - 1; var1 >= 0; --var1) {
			int var2 = 1;

			int var3;
			for (var3 = 0; var3 < var1; ++var3) {
				var2 <<= 4;
			}

			var3 = var0 / var2;
			var0 %= var2;
			lx.method_if((byte) var3);
			lx.method_char();
			boolean var4 = false;
			lx.field_new = var4;
		}

	}

	public static void dN() {
		c_a5.ea = new b1();
		c_a5.method_try((byte) 1);
	}

	public final int dR() {
		int var1 = 0;
		int var2 = l6.size();
		int var3 = 0;

		for (var2 = var2; var3 < var2; ++var3) {
			var1 = (var1 << 4) + (Byte) l6.elementAt(var3);
		}

		return var1;
	}

	public static final void dK() {
		switch (c_bu.e) {
		case 0:
			c_as.a((byte) 0, "您不在队伍中", c_bm.a2[2], "", -1, -2);
			return;
		case 1:
			c_a5.eQ.a(720904);
			return;
		case 2:
			c_a5.eQ.a(new int[] { 720905, 720906, 720907 });
		default:
		}
	}

	public static final void w(int var0) {
		(c_a5.es = c_e.a("/ui/skillbar.ui")).g9 = var0;
		if (var0 == -1610612732) {
			((c_ao) c_a5.es.cf().elementAt(1)).a("选择", 0);
		}

		c_r var3;
		(var3 = (c_r) c_a5.es.cf().elementAt(3)).F((byte) 1);
		var3.j((short) (bp.ag().aj() + 1));
		var3.mQ[0] = bp.fj[0];
		var3.mW[0] = 1000;
		var3.mV[0] = bp.eQ[0];
		var3.mI[0] = c_r.k((short) (bp.eD[0] % 1000));
		var3.mo[0] = 0;
		var3.ne[0] = 1;

		for (byte var1 = 1; var1 <= bp.ag().aj(); ++var1) {
			short var2;
			if (bp.ag().fG[var1 - 1] != 0 && (var2 = bp.method_void(bp.ag().fG[var1 - 1])) != -1) {
				var3.mQ[var1] = bp.fj[var2];
				var3.mV[var1] = bp.eQ[var2];
				c_b5.method_case("stuffImageId=" + bp.eD[var2] % 1000 + "--stuffQuality=" + (bp.eD[var2] / 1000 - 1));
				short[] var10000 = var3.mW;
				bp.ag();
				var10000[var1] = bp.eD[var2];
				var3.mI[var1] = c_r.k((short) (bp.eD[var2] % 1000));
				var3.mo[var1] = (byte) (bp.eD[var2] / 1000 - 1);
				var3.ne[var1] = 1;
			}
		}

		var3.method_if(var3.mV[var3.ep()], c_r.E(var3.ne[var3.ep()]));
		var3.ei().az = 8;
		var3.ei().ay = 4;
		af var5 = var3.ei();
		byte var4 = 0;
		var5.aj = var4;
		var3.d1();
		c_a5.es.c("#键切换查看技能描述");
	}

	public static void dM() {
		c_a5.a("/ui/keysetup.ui");
		c_a5.es.g9 = -1610612735;
		c_bv var0;
		(var0 = (c_bv) c_a5.es.cf().elementAt(2)).a((byte) 2);
		Vector var1;
		c_bv.ju = new int[(var1 = var0.dt()).size()];

		for (int var2 = 0; var2 < var1.size(); ++var2) {
			c_m var3;
			(var3 = (c_m) var1.elementAt(var2)).a((byte) 4);
			c_bv.ju[var2] = c_a5.iq[var2];
			var3.method_if(c_m.a(c_bv.ju[var2]));
		}

		c_bv.a(var0, (byte) 4);
		if (!c_a5.gZ) {
			c_a5.es.c("*键清空本键，#键进行设置");
		}

	}

	public static final void x(int var0) {
		(c_a5.es = c_e.a("/ui/skillbar.ui")).g9 = var0;
		((c_ao) c_a5.es.cf().elementAt(1)).a("选择", 0);
		c_r var3;
		(var3 = (c_r) c_a5.es.cf().elementAt(3)).F((byte) 1);
		var3.j(aa.f);

		for (int var1 = 0; var1 < aa.f; ++var1) {
			var3.mQ[var1] = aa.e[var1];
			var3.mV[var1] = aa.field_else[var1];
			var3.mW[var1] = aa.field_byte[var1];
			var3.mI[var1] = c_r.k(aa.c[var1]);
			var3.mo[var1] = aa.field_char[var1];
			var3.ne[var1] = 1;
		}

		var3.method_if(var3.mV[var3.ep()], c_r.E(var3.ne[var3.ep()]));
		var3.ei().az = 8;
		var3.ei().ay = 4;
		af var10000 = var3.ei();
		byte var2 = 0;
		var10000.aj = var2;
		var3.d1();
		c_a5.es.c("#键切换查看技能描述");
	}

	public class b {
		boolean field_for = true;
		boolean a = false;

		public b(b1 var1, String var2) {
		}
	}

	public class a {
		b1.b[] field_do = null;
		String[] a = null;
		private String field_else = null;
		private Hashtable field_case = new Hashtable();
		b1.a field_if = null;
		boolean field_new = false;
		byte field_for = 1;
		public byte field_byte = 1;
		private boolean field_char = false;

		public b1 this$0() {
			return b1.this;
		}

		public a(String var2, String[] var3) {
			field_else = var2;
			a = var3;
			field_do = new b1.b[var3.length];
			int var5 = 0;

			for (int var4 = field_do.length; var5 < var4; ++var5) {
				field_do[var5] = b1.this.new b(b1.this, var3[var5]);
			}

			method_if((byte) 1);
			b1.lx = this;
		}

		public final void a(byte var1, b1.a var2) {
			b1.b var10000 = field_do[var1 - 1];
			boolean var4 = true;
			var10000.a = true;
			var4 = true;
			var2.field_new = var4;
			var2.field_if = this;
			field_case.put(new Byte(var1), var2);
		}

		public final void method_if(byte var1) {
			field_byte = field_for;
			if (a(var1 - 1)) {
				field_for = var1;
				field_char = false;
			} else {
				field_char = true;
			}
		}

		private boolean a(int var1) {
			return var1 < field_do.length;
		}

		public final void method_char() {
			if (!field_char) {
				method_byte();
			}
		}

		void method_byte() {
			a(false);
			if (field_do[field_for - 1].a) {
				if ((b1.lx = (b1.a) ((b1.a) field_case.get(new Byte(field_for)))).a(4)) {
					b1.lx.method_if((byte) 5);
				} else if (b1.lx.a(1)) {
					b1.lx.method_if((byte) 2);
				} else {
					b1.lx.method_if((byte) 1);
				}

				a(true);
			} else {
				method_goto();
			}
		}

		private void a(boolean var1) {
			if (!var1) {
				if (!b1.this.l6.empty()) {
					b1.this.l6.pop();
				}

				b1.this.l6.push(new Byte(b1.lx.field_for));
			} else {
				b1.this.l6.push(new Byte(b1.lx.field_for));
			}
		}

		private void method_goto() {
			int var3;
			switch (b1.this.dR()) {
			case 2:
				c_a5.eQ.a(458760);
				return;
			case 5:
				if (c_a5.hQ == 0) {
					c_a5.eQ.a(2425024);
					return;
				}

				if (c_a5.hQ == 1) {
					c_as.a0();
					return;
				}

				if (c_a5.hQ == 2) {
					c_as.a((byte) 0, "您确定要修改昵称吗？", "确定", "取消", 65549, -1);
					return;
				}
				break;
			case 7:
				b1.dK();
				return;
			case 12:
				c_a5.eQ.a(2355697);
				break;
			case 17:
				c_a5.eQ.a(393219);
				return;
			case 18:
				c_a5.eQ.a(393220);
				return;
			case 19:
				au.a = 0;
				c_a5.eQ.a(917505);
				return;
			case 20:
				c_a5.eQ.a(393223);
				return;
			case 21:
				c_a5.eQ.a(393224);
				return;
			case 22:
				c_a5.eQ.a(393225);
				return;
			case 23:
				c_a5.eQ.a(393234);
				return;
			case 24:
				c_a5.eQ.a(1507331);
				return;
			case 49:
				c_a5.eQ.a(1572868);
				return;
			case 50:
				b1.w(-1610612733);
				c_a5.method_try((byte) 4);
				return;
			case 51:
				method_for();
				return;
			case 52:
				return;
			case 53:
				return;
			case 55:
				c_a5.eQ.a(3342356);
				return;
			case 56:
				c_a5.eQ.a(917525);
				return;
			case 65:
				c_a5.eQ.a(589832);
				return;
			case 66:
				ar.a("添加好友", "请输入好友昵称：", 589833);
				return;
			case 67:
				c_a5.eQ.a(589825);
				return;
			case 68:
				c_a5.eQ.a(589828);
				return;
			case 69:
				return;
			case 70:
				return;
			case 71:
				return;
			case 72:
				c_a5.eQ.a(589845);
				c_b5.method_case("**************社交-仇人**********************");
				return;
			case 73:
				c_a5.eQ.a(1441805);
				return;
			case 75:
				b1.access$000((byte) 1);
				return;
			case 76:
				c_a5.eQ.a(3407878);
				return;
			case 97:
				c_z.F = false;
				c_z.T = 1;
				c_a5.eQ.a(131079);
				return;
			case 98:
				c_a5.eQ.a(851976);
				return;
			case 99:
				c_z.T = 2;
				c_a5.eQ.a(131078);
				return;
			case 100:
				c_a5.eQ.a(2555905);
				return;
			case 101:
				c_a5.eQ.a(852020);
				return;
			case 129:
				c_a5.eQ.a(262168);
				return;
			case 130:
				c_a5.eQ.a(262187);
				return;
			case 131:
				c_a5.eQ.a(262165);
				return;
			case 132:
				c_a5.eQ.a(262185);
				return;
			case 145:
				c_a5.method_try((byte) 4);
				b1.dM();
				return;
			case 146:
				method_for();
				return;
			case 147:
				c_a5.a("/ui/showsetup.ui");
				c_a5.es.g9 = -1610612728;
				var3 = c_a5.es.cf().size();
				c_a5.es.cf().removeElementAt(var3 - 1);

				for (var3 = 0; var3 < 5; ++var3) {
					ay var1 = (ay) c_a5.es.cf().elementAt(var3 + 3);
					if (var3 == 0) {
						var1.method_case(c_a5.gn);
					} else {
						var1.method_case((byte) ((c_a5.dM >> var3 - 1) % 2));
					}
				}

				c_a5.method_try((byte) 4);
				return;
			case 148:
				c_a5.a("/ui/chatsetup.ui");
				c_a5.es.g9 = -1610612699;

				for (var3 = 0; var3 < 5; ++var3) {
					((ay) c_a5.es.cf().elementAt(var3 + 4)).method_case((byte) ((c_ad.I >> var3) % 2));
				}

				c_a5.method_try((byte) 4);
				return;
			case 149:
				c_a5.a("/ui/elsesetup.ui");
				c_a5.es.g9 = -1610612727;
				ay var2 = (ay) c_a5.es.cf().elementAt(3);
				if (bp.ag().r() >= 20) {
					c_a5.gK = 0;
				}

				var2.method_case(c_a5.gK);
				((ay) c_a5.es.cf().elementAt(9)).method_case((byte) (c_a5.hi ^ 1));
				c_a5.method_try((byte) 4);
				return;
			case 161:
				b1.access$000((byte) 1);
				return;
			case 162:
				return;
			case 163:
				c_a5.eQ.a(458772);
				return;
			case 164:
				c_a5.eQ.a(1703958);
				return;
			case 177:
				if (c_a5.hQ != 0 && c_a5.hQ != 2) {
					c_as.a((byte) 0, "此功能不对游客开放", c_bm.a2[2], "", -1, -2);
					return;
				}

				c_a5.eQ.a(65544);
				return;
			case 178:
				if (c_a5.hQ != 0 && c_a5.hQ != 2) {
					c_a5.eQ.a(65550);
					return;
				}

				c_a5.eQ.a(65545);
				return;
			case 179:
				c_a5.eQ.a(2355697);
				return;
			case 180:
				b1.access$100();
				return;
			case 401:
				c_a5.eQ.a(3145732);
				return;
			case 402:
				c_a5.eQ.a(3145729);
				return;
			case 403:
				c_a5.eQ.a(3145730);
				return;
			case 404:
				c_a5.eQ.a(3145741);
				return;
			case 833:
				c_a5.eQ.a(new int[] { 2162689, 2162691 });
				return;
			case 834:
				c_a5.eQ.a(new int[] { 2162702, 2162703 });
				return;
			case 835:
				c_a5.eQ.a(new int[] { 2162713, 2162714 });
				return;
			case 836:
				c_a5.eQ.a(new int[] { 2162724, 2162725 });
				return;
			case 837:
				c_a5.eQ.a(new int[] { 2162735, 2162736 });
				return;
			case 838:
				c_a5.eQ.a(new int[] { 2162744, 2162745 });
				return;
			case 839:
				return;
			case 840:
				return;
			case 841:
				return;
			case 842:
				c_b5.method_case("养生");
				return;
			case 849:
				c_a5.eQ.a(new int[] { 2162756, 2162757 });
				return;
			case 850:
				c_as.a((byte) 0, "此功能暂未开放！", "确定", "", -1, -2);
				if (c_a5.eQ.e) {
					c_a5.eQ.e = false;
					return;
				}
				break;
			case 851:
				c_a5.eQ.a(new int[] { 2162770, 2162771 });
				return;
			case 852:
				c_a5.eQ.a(new int[] { 2162777, 2162778 });
				return;
			case 865:
				c_r.nf = false;
				c_a5.eQ.a(2031636);
				return;
			case 866:
				c_a5.eQ.a(2031621);
				return;
			case 867:
				c_a5.eQ.a(2228225);
				return;
			case 868:
				c_a5.eQ.a(1966097);
				return;
			case 869:
				c_a5.eQ.a(2228256);
				return;
			case 1105:
				c_a5.eQ.a(1638401);
				return;
			case 1106:
				c_a5.eQ.a(1638426);
				return;
			case 1107:
				c_a5.eQ.a(1638403);
				return;
			case 1108:
				c_a5.eQ.a(1638419);
				return;
			case 1109:
				c_a5.eQ.a(1638425);
				return;
			case 1110:
				c_a5.eQ.a(1638427);
				return;
			case 1111:
				c_a5.eQ.a(1638417);
				return;
			case 1112:
				c_a5.eQ.a(1638404);
				return;
			case 1121:
				c_a5.eQ.a(1835011);
				return;
			case 1122:
				c_a5.eQ.a(1835012);
				return;
			case 1123:
				c_a5.eQ.a(1835021);
				return;
			case 1124:
				c_a5.eQ.a(1835027);
				return;
			case 1137:
				if (b1.this.dR() != 1) {
					b1.this.dR();
				}

				(c_be.gu = new a3((byte) 100)).method_byte();
				c_a5.method_try((byte) 3);
				return;
			case 1138:
				(c_be.gu = new a3((byte) 0)).method_byte();
				c_a5.method_try((byte) 3);
				return;
			case 1139:
				(c_be.gu = new a3((byte) 1)).method_byte();
				c_a5.method_try((byte) 3);
				return;
			case 1140:
				(c_be.gu = new a3((byte) 2)).method_byte();
				c_a5.method_try((byte) 3);
				return;
			case 1141:
				(c_be.gu = new a3((byte) 3)).method_byte();
				c_a5.method_try((byte) 3);
				return;
			case 1142:
				(c_be.gu = new a3((byte) 4)).method_byte();
				c_a5.method_try((byte) 3);
				return;
			case 1143:
				(c_be.gu = new a3((byte) 5)).method_byte();
				c_a5.method_try((byte) 3);
				return;
			case 1144:
				(c_be.gu = new a3((byte) 6)).method_byte();
				c_a5.method_try((byte) 3);
				return;
			case 1185:
				c_a5.eQ.a(2490386);
				return;
			case 1186:
				c_a5.eQ.a(2490385);
				return;
			case 2577:
				return;
			case 2578:
				return;
			case 2593:
				c_a5.eQ.a(1703968);
				return;
			case 2594:
				c_a5.eQ.a(1703969);
				return;
			}

		}

		private void method_for() {
			c_a5.es = c_e.a("/ui/shortcutkey.ui");
			c_a5.fE.addElement(c_a5.es);
			c_a5.fE.addElement((Object) null);
			c_a5.fE.addElement((Object) null);
			c_a5.es.g9 = -1610612734;
			b2.a();
			av var10000 = b2.field_try;
			b2.a();
			var10000.method_if(b2.field_try.p);
			ay var1 = (ay) c_a5.es.cf().elementAt(6);
			b2.a();
			var1.method_case((byte) (b2.field_try.p - 1));
			if (!c_a5.gZ) {
				c_a5.es.c("*键设置技能，#键设置物品");
			}

			c_a5.method_try((byte) 4);
		}

		public final void method_for(Graphics var1) {
			int var2 = 76 * c_a5.ic / 176;
			int var3 = 25 * c_a5.il / 208;
			int var4 = c_a5.ic - var2 >> 1;
			var1.setColor(c_bm.aZ);
			b1.access$200(b1.this, var1, field_else, var4, b1.super.j, var2, var3, c_a5.fq);
		}
	}

	static void access$000(byte var0) {
		final byte var8 = 1;
		final Form var1 = new Form(var8 == 1 ? "封神论坛" : "客服中心");
		String var2 = var8 == 1
				? "点击“确定”将关闭游戏，转到封神论坛网页，点击“返回”返回游戏。\n自动链接可能无法操作，建议手动到http://game.kong.net/gk/ko/ko_wy/bbs/fsbbs.jsp链接。\n          是否自动链接？"
				: "客服电话010-88575067，\n15811397530，\n官方网站fs.kong.net";
		final Command var3 = new Command(c_bm.a2[2], 4, 0);
		final Command var4 = new Command(c_bm.a2[1], 3, 1);
		ChoiceGroup var5 = new ChoiceGroup("问题种类", 1, c_bm.au, null);
		TextField var6 = new TextField("请输入内容", "", 100, 0);
		TextField var7 = new TextField("请输入机型", "", 20, 0);
		if (var8 == 2) {
			var1.append(var7);
			var1.append(var5);
			var1.append(var6);
		}

		var1.append(var2);
		var1.addCommand(var3);
		var1.addCommand(var4);
		var1.setCommandListener(new CommandListener() {

			public void commandAction(Command cmd, Displayable display) {
				if (cmd == var3) {
					if (var8 == 1) {
						c_a5.eQ.a(65543);

						try {
							c_a5.dI.platformRequest("http://game.kong.net/gk/ko/ko_wy/bbs/fsbbs.jsp");
						} catch (Exception var3) {
						}

						c_a5.dI.notifyDestroyed();
						return;
					}
				} else if (cmd == var4) {
					var1.removeCommand(var3);
					var1.removeCommand(var4);
					c_a5.e8.setFullScreenMode(true);
					c_a5.dI.display.setCurrent(c_a5.e8);
				}
			}

		});
		c_a5.dI.display.setCurrent(var1);
	}

	static void access$100() {
		final Form var0 = new Form("访问官网");
		final Command var1 = new Command(c_bm.a2[2], 4, 0);
		final Command var2 = new Command(c_bm.a2[1], 3, 1);
		var0.append("点击“确定”将关闭游戏，转到官方网站网页，点击“返回”返回游戏。\n自动链接可能无法操作，建议手动到http://fs.kong.net链接。\n          是否自动链接？");
		var0.addCommand(var1);
		var0.addCommand(var2);
		var0.setCommandListener(new CommandListener() {

			public void commandAction(Command cmd, Displayable display) {
				if (cmd == var1) {
					c_a5.eQ.a(65543);

					try {
						c_a5.dI.platformRequest("http://fs.kong.net");
					} catch (Exception var3) {
					}

					c_a5.dI.notifyDestroyed();
				} else {
					if (cmd == var2) {
						var0.removeCommand(var1);
						var0.removeCommand(var2);
						c_a5.e8.setFullScreenMode(true);
						c_a5.dI.display.setCurrent(c_a5.e8);
					}

				}
			}
		});
		c_a5.dI.display.setCurrent(var0);
	}

	static void access$200(b1 var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, Font var7) {
		Graphics var10000 = var1;
		String var10001 = var2;
		int var10002 = var3;
		int var10003 = var4;
		int var10004 = var5;
		var5 = var6;
		var4 = var10004;
		var3 = var10003;
		int var10 = var10002;
		String var9 = var10001;
		Graphics var8 = var10000;
		var6 = var7.stringWidth(var9);
		int var11 = c_a5.iG;
		var10 += (var4 - var6) % 2 == 0 ? (var4 - var6) / 2 : (var4 - var6) / 2 + 1;
		var3 += (var5 - var11) / 2;
		var8.drawString(var9, var10, var3, 20);
	}
}
