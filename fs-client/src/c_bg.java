import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class c_bg extends ba {
	private Vector h2;
	private v ib = null;
	private byte hT;
	private af hZ;
	private byte hN = -1;
	public boolean h5 = false;
	public static int hP = -1;
	public boolean ie = false;
	public byte h0 = -1;
	private int hQ = 0;
	private boolean hU = true;

	public c_bg(short var1, short var2, short var3, short var4, byte var5, v var6, c_be var7) {
		super(var1, var2, var3, var4, var7);
		super.a = (short) (c_a5.ic - (super.k << 1));
		this.hT = var5;
		this.ib = var6;
		super.b = true;
		if (var6 != null) {
			this.hN = 0;
		}

		this.h2 = new Vector();
	}

	public final void a(Graphics var1) {
		short var2 = super.k;
		short var3 = super.j;
		short var4 = super.a;
		short var5 = super.field_int;
		var1.setColor(c_bm.dt);
		var1.fillRect(var2, var3, var4, var5);
		int var6 = var2 + 3;
		int var7 = var3 + 1;
		int var8 = var4 - 6;
		int var9 = var5 - 2;
		var1.setColor(c_bm.field_try);
		var1.fillRect(var6, var7, var8, var9);
		++var6;
		++var7;
		var8 -= 2;
		var9 -= 2;
		var1.setColor(c_bm.dt);
		var1.fillRect(var6, var7, var8, var9);
		++var6;
		++var7;
		var8 -= 2;
		var9 -= 2;
		var1.setColor(c_bm.field_try);
		var1.fillRect(var6, var7, var8, var9);
		if (this.ib != null) {
			var1.setColor(c_bm.ad);
			var1.fillRect(super.k + 3 + 1 + 1, super.j + 1 + 1 + 1, super.a - 10, this.ib.b);
			this.ib.a(var1, false);
		}

		var6 = this.h2.size() < this.cU() ? this.h2.size() : this.cU() + this.hQ;

		for (var7 = this.hQ; var7 < var6; ++var7) {
			v var10 = (v) this.h2.elementAt(var7);
			if (var7 == this.hN && this.hU) {
				var1.setColor(c_bm.ab);
				var1.fillRect(var10.method_try(), var10.method_byte(), this.cG() - c_a5.ca.getWidth(), var10.b);
				var10.a(var1, true);
			} else {
				var10.a(var1, false);
			}
		}

		if (this.ib != null) {
			var1.setColor(c_bm.dt);
			var1.drawLine(super.k + 3 + 1 + 1, super.j + 1 + 1 + 1 + (short) (c_a5.iG + 2) - 1,
					super.k + 3 + 1 + 1 + super.a - 10, super.j + 1 + 1 + 1 + (short) (c_a5.iG + 2) - 1);
		}

		if (this.h2.size() > 0) {
			var7 = 1;

			for (var8 = ((v) this.h2.elementAt(0)).field_if.size(); var7 < var8; ++var7) {
				var1.setColor(c_bm.dt);
				var1.drawLine(super.k + (5 + ((v) this.h2.elementAt(0)).method_if((byte) var7) - 1) * c_a5.ic / 176,
						super.j + 1 + 1 + 1,
						super.k + (5 + ((v) this.h2.elementAt(0)).method_if((byte) var7) - 1) * c_a5.ic / 176,
						super.j + 1 + 1 + 1 + this.cH());
			}
		}

		if (this.hZ != null) {
			this.hZ.a(var1);
		}

	}

	public final void f() {
		int var9;
		v var12;
		String var26;
		String var27;
		if (super.field_byte) {
			if (c_a5.method_try(4096)) {
				if (this.h2.size() == 0 && this.h0 != 19 && c_a5.es.g9 != 196642) {
					return;
				} else {
					this.y().c8();
					return;
				}
			}

			if (c_a5.method_try(8192)) {
				if (this.h2.size() == 0 && this.h0 != 19 && c_a5.es.g9 != 196642) {
					return;
				}

				this.y().c9();
				return;
			}

			if (!c_a5.method_byte(65536) && !c_a5.method_byte(131072)) {
				if (c_a5.method_byte(262144)) {
					super.field_byte = false;
					return;
				}
			} else {
				this.y().dc();
				int var24;
				int var32;
				switch (this.h0) {
				case 0:
					var9 = (Integer) this.y().db().elementAt(this.y().de());
					if (this.h2.size() == 0) {
						if (var9 == 1) {
							ar.a("添加好友", "请输入好友昵称：", 589833);
						}

						return;
					}

					var24 = ((v) this.h2.elementAt(this.hN)).field_new;
					switch (var9) {
					case -1610612729:
						int var22 = ((v) this.h2.elementAt(this.hN)).field_new;
						ah var23 = (ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2);
						c_q.n = (long) var22;
						c_q.f[0] = var23.aj();
						c_be.cn();
						((a9) c_a5.es.cf().elementAt(3)).method_void(c_q.f[0]);
						break;
					case -1610612726:
						var26 = ((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj();
						a3.a(var24, var26, true);
						break;
					case 1:
						ar.a("添加好友", "请输入好友昵称：", 589833);
						break;
					case 589827:
					case 589829:
						hP = var24;
						c_a5.eQ.a(var9);
						break;
					case 589831:
						hP = var24;
						c_a5.eQ.a(var9);
						break;
					case 589846:
						c_a5.A();
						c_a5.aj();
						hP = var24;
						c_a5.eQ.a(var9);
						break;
					case 720897:
						c_bu.k = var24;
						c_a5.eQ.a(var9);
					}

					super.field_byte = false;
					return;
				case 1:
					if ((var9 = (Integer) this.y().db().elementAt(this.y().de())) == 1) {
						ar.a("添加黑名单", "请输入玩家昵称：", 589847);
					} else {
						hP = ((v) this.h2.elementAt(this.hN)).field_new;
						c_b5.method_case("选中玩家ID：" + hP);
						c_a5.eQ.a(var9);
					}

					super.field_byte = false;
					return;
				case 2:
					label518: {
						hP = ((v) this.h2.elementAt(this.hN)).field_new;
						c_b5.method_case("选中玩家ID：" + hP);
						switch (var9 = (Integer) this.y().db().elementAt(this.y().de())) {
						case -1610612726:
							var12 = (v) this.h2.elementAt(this.hN);
							a3.a(hP, ((ah) var12.field_if.elementAt(2)).aj(), true);
							break label518;
						case 720897:
							c_bu.k = hP;
							break;
						case 1638405:
							c_bt.f = hP;
							break;
						case 1835013:
							c_i.field_long = hP;
						}

						c_a5.eQ.a(var9);
					}

					super.field_byte = false;
					return;
				case 3:
					return;
				case 4:
				case 9:
				case 14:
				case 18:
				default:
					break;
				case 5:
					var27 = ((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj();
					c_be.cn();
					a3.a(((v) this.h2.elementAt(this.hN)).field_new, var27, false);
					return;
				case 6:
					c_q.g = this.hN;
					c_q.field_long = ((v) this.h2.elementAt(this.hN)).field_try;
					if ((var9 = (Integer) this.y().db().elementAt(this.y().de())) != -1) {
						if (var9 == 0) {
							super.field_byte = false;
							c_as.a((byte) 0, "您确定要删除所有邮件？", "是", "否", -250, -1);
						} else {
							c_a5.eQ.a(var9);
							super.field_byte = false;
						}

						return;
					}
					break;
				case 7:
					var9 = (Integer) this.y().db().elementAt(this.y().de());
					var24 = ((v) this.h2.elementAt(this.hN)).field_new;
					if (var9 != -1) {
						v var33 = (v) this.h2.elementAt(this.hN);
						switch (var9) {
						case -1610612726:
							a3.a(var24, ((ah) var33.field_if.elementAt(2)).aj(), true);
							break;
						case 589831:
						case 1638444:
							hP = var24;
							c_a5.eQ.a(var9);
							break;
						case 589835:
							hP = var24;
							c_a5.eQ.a(var9);
							break;
						case 1638408:
						case 1638413:
						case 1638416:
							c_bt.method_if(var9);
							break;
						case 1638409:
						case 1638410:
							c_bt.f = var24;
							c_bt.method_if(var9);
							break;
						case 1638411:
						case 1638412:
						case 1638415:
							c_bt.f = var24;
							c_a5.eQ.a(var9);
							break;
						case 1835030:
							c_i.field_long = var24;
							c_a5.eQ.a(var9);
							break;
						case 1835035:
							c_i.field_long = var24;
							c_i.method_if(var9);
						}
					}

					super.field_byte = false;
					return;
				case 8:
					var9 = (Integer) this.y().db().elementAt(this.y().de());
					if (this.h2.size() == 0) {
						if (var9 == -1610612703) {
							ar.a("添加仇人", "请输入仇人昵称：", 589848);
						}
					} else {
						hP = ((v) this.h2.elementAt(this.hN)).field_new;
						if (var9 == -1610612708) {
							c_as.a((byte) 0, "您确定要从仇人列表中删除此人吗？", "确定", "取消", 589842, -1);
						} else if (var9 == -1610612703) {
							ar.a("添加仇人", "请输入仇人昵称：", 589848);
						} else {
							c_a5.eQ.a(var9);
						}
					}

					super.field_byte = false;
					return;
				case 10:
					var9 = (Integer) this.y().db().elementAt(this.y().de());
					c_a5.eQ.a(var9);
					super.field_byte = false;
					return;
				case 11:
					if (!((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj().equals("")) {
						if ((var32 = (Integer) this.y().db().elementAt(this.y().de())) == 1966082) {
							au.field_else = 1;
						}

						c_a5.eQ.a(var32);
						super.field_byte = false;
						return;
					}
					break;
				case 12:
					if (!((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj().equals("")) {
						if ((var32 = (Integer) this.y().db().elementAt(this.y().de())) == 1966092) {
							au.field_else = 1;
						}

						c_a5.eQ.a(var32);
						super.field_byte = false;
						return;
					}
					break;
				case 13:
					switch ((Integer) this.y().db().elementAt(this.y().de())) {
					case 1966101:
						au.field_for = this.hN;
						c_a5.eQ.a(1966101);
						break;
					case 1966102:
						if (!((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj().equals("")) {
							au.field_for = this.hN;
							c_a5.eQ.a(1966102);
						} else {
							c_as.a((byte) 0, "您所选的位置上没有宝石，请您重新选择！", "确定", "", -1, -2);
						}
						break;
					case 2031651:
						c_a5.eQ.a(2031651);
					}

					super.field_byte = false;
					return;
				case 15:
					var9 = (Integer) this.y().db().elementAt(this.y().de());
					hP = var24 = ((v) this.h2.elementAt(this.hN)).field_new;
					if (var9 == -1610612726) {
						var26 = ((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj();
						a3.a(var24, var26, true);
					} else {
						if (var9 == 720897) {
							c_bu.k = var24;
						}

						if (var9 == 589831) {
							hP = var24;
						}

						if (var9 == 2490407 || var9 == 2490417) {
							c.a = var24;
						}

						c_a5.eQ.a(var9);
					}

					super.field_byte = false;
					return;
				case 16:
				case 17:
					var9 = (Integer) this.y().db().elementAt(this.y().de());
					az.field_else = ((v) this.h2.elementAt(this.hN)).field_new;
					if (var9 == 2555905) {
						az.m = 0;
						c_a5.eQ.a(2555952);
					}

					c_a5.eQ.a(var9);
					super.field_byte = false;
					return;
				case 19:
					c_ao var17;
					if ((var17 = (c_ao) c_a5.es.cf().elementAt(0)).aC().equals("总排名")) {
						c_l.field_goto = this.y().de();
					} else if (var17.aC().equals("天人排名")) {
						c_l.field_goto = (byte) (this.y().de() + 1);
					} else if (var17.aC().equals("修罗排名") && (c_l.field_goto = this.y().de()) == 2) {
						c_l.field_goto = 3;
					}

					if ((var24 = (Integer) this.y().db().elementAt(this.y().de())) == 196641 && this.h2.size() == 0) {
						c_as.a((byte) 0, "该排名榜没有信息！", "确定", "", -1, -2);
						super.field_byte = false;
						return;
					}

					c_a5.eQ.a(var24);
					this.ie = false;
					super.field_byte = false;
					return;
				case 20:
					var9 = (Integer) this.y().db().elementAt(this.y().de());
					c_bt.l = ((v) this.h2.elementAt(this.hN)).field_new;
					c_a5.eQ.a(var9);
					super.field_byte = false;
				}

				return;
			}
		} else {
			short var10;
			c_ao var29;
			int var30;
			ba var31;
			if (c_a5.method_try(4096)) {
				--this.hN;
				if (this.hN < 0) {
					this.hN = 0;
					this.h5 = true;
				} else {
					this.h5 = false;
				}

				if (this.h0 == 11 || this.h0 == 12) {
					var27 = ((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj();
					if (au.field_case == 1) {
						var29 = (c_ao) c_a5.es.cf().elementAt(1);
						if (!var27.equals("")) {
							var29.a("查看", 0);
						} else {
							var29.a("", 0);
						}
					} else if (var27.equals("")) {
						((c_ao) c_a5.es.cf().elementAt(1)).a("镶嵌", 0);
					} else {
						((c_ao) c_a5.es.cf().elementAt(1)).a("操作", 0);
					}
				}

				if (this.hZ == null) {
					return;
				}

				if (this.hU) {
					if (this.hN < this.hZ.aj) {
						--this.hQ;

						for (var9 = 0; var9 < this.h2.size(); ++var9) {
							(var12 = (v) this.h2.elementAt(var9)).a((short) (var12.method_byte() + var12.b));

							for (var30 = 0; var30 < var12.field_if.size(); ++var30) {
								(var31 = (ba) var12.field_if.elementAt(var30))
										.method_for((short) (var31.method_long() + var12.b));
							}
						}
					}
				} else {
					--this.hQ;
					if (this.hQ < 0) {
						this.hQ = 0;
					} else {
						for (var9 = 0; var9 < this.h2.size(); ++var9) {
							(var12 = (v) this.h2.elementAt(var9)).a((short) (var12.method_byte() + var12.b));

							for (var30 = 0; var30 < var12.field_if.size(); ++var30) {
								(var31 = (ba) var12.field_if.elementAt(var30))
										.method_for((short) (var31.method_long() + var12.b));
							}
						}
					}

					var10 = (short) this.hQ;
					this.hZ.aj = var10;
				}

				if (c_a5.es.g9 == 1703939) {
					for (var9 = 0; var9 < this.h2.size(); ++var9) {
						var12 = (v) this.h2.elementAt(var9);
						c_be.hk[var9] = var12.method_byte() + 9;
					}
				}

				if (c_a5.es.g9 == 262157) {
					bf.method_if();
				}

				if (c_a5.es.g9 == 262154) {
					bf.a();
				}
			} else if (c_a5.method_try(8192)) {
				++this.hN;
				this.h5 = false;
				if (this.hU && this.hN > this.h2.size() - 1) {
					this.hN = (byte) (this.h2.size() - 1);
				}

				if (this.h0 == 11 || this.h0 == 12) {
					var27 = ((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj();
					if (au.field_case == 1) {
						var29 = (c_ao) c_a5.es.cf().elementAt(1);
						if (!var27.equals("")) {
							var29.a("查看", 0);
						} else {
							var29.a("", 0);
						}
					} else if (var27.equals("")) {
						((c_ao) c_a5.es.cf().elementAt(1)).a("镶嵌", 0);
					} else {
						((c_ao) c_a5.es.cf().elementAt(1)).a("操作", 0);
					}
				}

				if (this.hZ == null) {
					return;
				}

				if (this.hU) {
					if (this.hN >= this.hZ.aj + this.hZ.ay) {
						++this.hQ;

						for (var9 = 0; var9 < this.h2.size(); ++var9) {
							(var12 = (v) this.h2.elementAt(var9)).a((short) (var12.method_byte() - var12.b));

							for (var30 = 0; var30 < var12.field_if.size(); ++var30) {
								(var31 = (ba) var12.field_if.elementAt(var30))
										.method_for((short) (var31.method_long() - var12.b));
							}
						}
					}
				} else {
					++this.hQ;
					if (this.hQ > this.h2.size() - this.cU()) {
						this.hQ = this.h2.size() - this.cU();
					} else {
						for (var9 = 0; var9 < this.h2.size(); ++var9) {
							(var12 = (v) this.h2.elementAt(var9)).a((short) (var12.method_byte() - var12.b));

							for (var30 = 0; var30 < var12.field_if.size(); ++var30) {
								(var31 = (ba) var12.field_if.elementAt(var30))
										.method_for((short) (var31.method_long() - var12.b));
							}
						}
					}

					var10 = (short) this.hQ;
					this.hZ.aj = var10;
				}

				if (c_a5.es.g9 == 1703939) {
					for (var9 = 0; var9 < this.h2.size(); ++var9) {
						var12 = (v) this.h2.elementAt(var9);
						c_be.hk[var9] = var12.method_byte() + 9;
					}
				}

				if (c_a5.es.g9 == 262157) {
					bf.method_if();
				}

				if (c_a5.es.g9 == 262154) {
					bf.a();
				}
			} else if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
				c_br var1;
				var1 = new c_br((byte) 0);
				int[] var2;
				int[] var3;
				String[] var4;
				String[] var5;
				int[] var6;
				int[] var7;
				int[] var8;
				c_ao var11;
				String[] var13;
				int[] var14;
				String[] var15;
				String var16;
				int[] var18;
				String[] var19;
				label688: switch (this.h0) {
				case 0:
					var11 = null;
					var15 = null;
					var4 = null;
					if (c_a5.es.g9 == 1703945) {
						if (this.h2.size() == 0) {
							return;
						}

						var13 = new String[] { "收件人" };
						var3 = new int[] { -1610612729 };
						var14 = new int[] { 3 };
						var1.a(var13, var3, var14);
					} else if (this.h2.size() == 0) {
						var13 = new String[] { "添加好友" };
						var3 = new int[] { 1 };
						var14 = new int[] { 3 };
						var1.a(var13, var3, var14);
					} else {
						v var25 = (v) this.h2.elementAt(this.hN);
						var1.a("查看详情", 589831, 2);
						if (var25.field_else) {
							var1.a("私　聊", -1610612726, 2);
						}

						if ((c_bu.e == 0 || c_bu.h == bp.ag().method_new()) && var25.field_else) {
							var1.a("组队邀请", 720897, 3);
						}

						var1.a("删除好友", 589827, 3);
						var1.a("屏蔽此人", 589829, 0);
						if (var25.field_else) {
							var1.a("传　送", 589846, 0);
						}

						var1.a("添加好友", 1, 3);
					}
					break;
				case 1:
					if (this.h2.size() == 0) {
						var2 = new int[] { 1 };
						var3 = new int[] { 3 };
						var1.a(new String[] { "添加黑名单" }, var2, var3);
					} else {
						var2 = new int[] { 589831, 589830, 1 };
						var3 = new int[] { 2, 3, 3 };
						var1.a(c_bm.aX, var2, var3);
					}
					break;
				case 2:
					if (this.h2.size() == 0) {
						return;
					}

					byte var20 = ((v) this.h2.elementAt(this.hN)).field_byte;
					c_b5.method_case("camp=" + var20);
					c_b5.method_case("Player.getInstance().getCamp()=" + bp.ag().o());
					if (bp.ag().o() == var20) {
						var15 = new String[] { c_bm.a2[6], "私聊", "加为好友", "屏蔽此人" };
						var14 = new int[] { 589831, -1610612726, 589826, 589829 };
						var18 = new int[] { 2, 2, 3, 2 };
						if (c_bu.e == 0 || c_bu.h == bp.ag().method_new()) {
							var19 = new String[] { "组队邀请" };
							var7 = new int[] { 720897 };
							var8 = new int[] { 3 };
							var15 = c_b5.a(var15, var15.length, var19);
							var14 = c_b5.a(var14, var14.length, var7);
							var18 = c_b5.a(var18, var18.length, var8);
						}

						if (bp.ag().as() != c_i.field_for && bp.ag().as() != c_i.field_void) {
							if (bp.ag().aT() == c_bt.d || bp.ag().aT() == c_bt.field_long) {
								var19 = new String[] { "招入麾下" };
								var7 = new int[] { 1638405 };
								var8 = new int[] { 3 };
								var15 = c_b5.a(var15, var15.length, var19);
								var14 = c_b5.a(var14, var14.length, var7);
								var18 = c_b5.a(var18, var18.length, var8);
							}
						} else {
							var19 = new String[] { "招入麾下" };
							var7 = new int[] { 1835013 };
							var8 = new int[] { 3 };
							var15 = c_b5.a(var15, var15.length, var19);
							var14 = c_b5.a(var14, var14.length, var7);
							var18 = c_b5.a(var18, var18.length, var8);
						}

						var1.a(var15, var14, var18);
					} else {
						var15 = null;
						var16 = "添加仇人";
						var15 = new String[] { c_bm.a2[6], var16 };
						var18 = new int[] { 589831, 589841 };
						var6 = new int[] { 2, 3 };
						var1.a(var15, var18, var6);
					}
					break;
				case 3:
					if (this.h2.size() == 0) {
						return;
					}
					break;
				case 4:
					if (this.h2.size() == 0) {
						return;
					}

					if (c_a5.es.g9 == 851978) {
						return;
					}

					c_b5.method_case("寻径！！！！！！！！！！！！！！！！！！");
					var12 = (v) this.h2.elementAt(this.hN);
					bp.ag().aA = (new b0()).a(bp.ag().l, bp.ag().q, var12.field_void, var12.field_goto);
					bp.ag().method_do((byte) 104);
					c_a5.A();
					c_a5.aj();
					return;
				case 5:
					if (this.h2.size() == 0) {
						return;
					}

					var2 = new int[] { -1 };
					var3 = new int[] { 3 };
					var1.a(c_bm.S, var2, var3);
					break;
				case 6:
					if (this.h2.size() == 0) {
						return;
					}

					var2 = new int[] { 1703942, 1703943, 1703944 };
					var3 = new int[] { 1, 3, 3 };
					var1.a(c_bm.h, var2, var3);
					break;
				case 7:
					if (this.h2.size() == 0) {
						return;
					}

					var13 = null;
					var3 = null;
					var14 = null;
					int var21 = ((v) this.h2.elementAt(this.hN)).field_new;
					switch (c_a5.es.g9) {
					case 1638404:
						if (var21 == bp.ag().method_new()) {
							var13 = new String[] { "退出氏族" };
							var3 = new int[] { 1638413 };
							var14 = new int[] { 0 };
							if (bp.ag().aT() == c_bt.d) {
								var19 = new String[] { "解散氏族" };
								var7 = new int[] { 1638408 };
								var8 = new int[] { 0 };
								var13 = c_b5.a(var13, var13.length, var19);
								var3 = c_b5.a(var3, var3.length, var7);
								var14 = c_b5.a(var14, var14.length, var8);
							} else if (bp.ag().aT() == c_bt.field_long || bp.ag().aT() == 15) {
								var19 = new String[] { "卸任职务" };
								var7 = new int[] { 1638416 };
								var8 = new int[] { 3 };
								var13 = c_b5.a(var13, var13.length, var19);
								var3 = c_b5.a(var3, var3.length, var7);
								var14 = c_b5.a(var14, var14.length, var8);
							}
						} else {
							var13 = new String[] { "查看", "加为好友", "私聊" };
							var3 = new int[] { 1638444, 589835, -1610612726 };
							var14 = new int[] { 2, 3, 2 };
							if (bp.ag().aT() == c_bt.d) {
								var19 = new String[] { "升副族长", "升为长老", "降低职位", "禅让族长", "开除此人" };
								var7 = new int[] { 1638411, 1638415, 1638412, 1638410, 1638409 };
								var8 = new int[] { 3, 3, 3, 3, 3 };
								var13 = c_b5.a(var13, var13.length, var19);
								var3 = c_b5.a(var3, var3.length, var7);
								var14 = c_b5.a(var14, var14.length, var8);
							} else if (bp.ag().aT() == c_bt.field_long) {
								var19 = new String[] { "升为长老", "降低职位", "开除此人" };
								var7 = new int[] { 1638415, 1638412, 1638409 };
								var8 = new int[] { 3, 3, 3 };
								var13 = c_b5.a(var13, var13.length, var19);
								var3 = c_b5.a(var3, var3.length, var7);
								var14 = c_b5.a(var14, var14.length, var8);
							}
						}
						break;
					case 1835028:
						if (bp.ag().method_new() != var21) {
							var13 = new String[] { "查看", "加为好友", "私聊" };
							var3 = new int[] { 1638444, 589835, -1610612726 };
							var14 = new int[] { 2, 3, 2 };
							if (bp.ag().as() == c_i.field_for) {
								var19 = new String[] { "给予职务", "禅让侯主" };
								var7 = new int[] { 1835030, 1835035 };
								var8 = new int[] { 2, 3 };
								var13 = c_b5.a(var13, var13.length, var19);
								var3 = c_b5.a(var3, var3.length, var7);
								var14 = c_b5.a(var14, var14.length, var8);
							}
						}
					}

					var1.a(var13, var3, var14);
					break;
				case 8:
					if (this.h2.size() == 0) {
						var2 = new int[] { -1610612703 };
						var3 = new int[] { 3 };
						var1.a(c_bm.ch, var2, var3);
					} else if (((v) this.h2.elementAt(this.hN)).field_else) {
						var3 = new int[] { 589843, -1610612708, -1610612703, 589844 };
						var14 = new int[] { 2, 3, 3, 3 };
						var1.a(c_bm.c3, var3, var14);
					} else {
						var3 = new int[] { 589843, -1610612708, -1610612703 };
						var14 = new int[] { 2, 3, 3 };
						var1.a(c_bm.q, var3, var14);
					}
				case 9:
				default:
					break;
				case 10:
					switch (c_a5.es.g9) {
					case 262154:
						if (this.h2.size() != 0) {
							if (((v) this.h2.elementAt(this.hN)).c == 1) {
								bf.field_int = (byte) (this.hN + 1);
								var15 = new String[] { "接受任务", "查看物品" };
								var14 = new int[] { 262149, 262189 };
								var18 = new int[] { 6, 2 };
								var1.a(var15, var14, var18);
							} else {
								c_br.dk();
								c_a5.eQ.a(262149);
							}
						}
						break label688;
					case 262157:
						if (this.h2.size() != 0) {
							var12 = (v) this.h2.elementAt(this.hN);
							if (c_bv.jp) {
								if (var12.c == 1) {
									bf.field_int = (byte) (this.hN + 1);
									var15 = new String[] { "完成任务", "查看物品" };
									var14 = new int[] { 262188, 262189 };
									var18 = new int[] { bf.field_for ? 2 : 0, 2 };
									var1.a(var15, var14, var18);
								} else {
									if (bf.field_for) {
										c_br.c6();
									}

									c_a5.eQ.a(262188);
								}
							} else if (var12.c == 1) {
								bf.field_int = (byte) (this.hN + 1);
								c_br.c6();
								c_a5.eQ.a(262189);
							}
						}
						break label688;
					case 262159:
						if (this.h2.size() != 0 && ((v) this.h2.elementAt(this.hN)).c == 1) {
							bf.field_int = (byte) (this.hN + 1);
							var15 = new String[] { "查看物品" };
							var14 = new int[] { 262189 };
							var18 = new int[] { 2 };
							var1.a(var15, var14, var18);
						}
						break label688;
					case 262178:
						if (this.h2.size() != 0) {
							if (((v) this.h2.elementAt(this.hN)).c == 1) {
								bf.field_int = (byte) (this.hN + 1);
								var15 = new String[] { "刷　新", "查看物品" };
								var14 = new int[] { 262179, 262189 };
								var18 = new int[] { 0, 2 };
								var1.a(var15, var14, var18);
							} else {
								var15 = new String[] { "刷　新" };
								var14 = new int[] { 262179 };
								var18 = new int[] { 0 };
								var1.a(var15, var14, var18);
							}
						}
						break label688;
					case 458754:
						if (this.h2.size() != 0) {
							if (((v) this.h2.elementAt(this.hN)).c == 1) {
								bf.field_int = (byte) (this.hN + 1);
								var15 = new String[] { "接受任务", "查看物品" };
								var14 = new int[] { 262180, 262182 };
								var18 = new int[] { 0, 2 };
								var1.a(var15, var14, var18);
							} else {
								var15 = new String[] { "接受任务" };
								var14 = new int[] { 262180 };
								var18 = new int[] { 0 };
								var1.a(var15, var14, var18);
							}
						}
					default:
						break label688;
					}
				case 11:
					au.field_for = this.hN;
					var16 = ((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj();
					if (au.field_case == 1) {
						if (!var16.equals("")) {
							c_br.c6();
							c_a5.eQ.a(1966083);
						}
					} else if (var16.equals("")) {
						au.field_else = 0;
						c_br.c6();
						c_a5.eQ.a(1966082);
					} else {
						var18 = new int[] { 1966083, 1966082 };
						var6 = new int[] { 2, 2 };
						var1.a(c_bm.co, var18, var6);
					}
					break;
				case 12:
					au.field_for = this.hN;
					var16 = ((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj();
					if (au.field_case == 1) {
						if (!var16.equals("")) {
							c_br.c6();
							c_a5.eQ.a(1966083);
						}
					} else if (var16.equals("")) {
						au.field_else = 0;
						c_a5.eQ.a(1966088);
					} else {
						var18 = new int[] { 1966083, 1966092 };
						var6 = new int[] { 2, 3 };
						var1.a(c_bm.co, var18, var6);
					}
					break;
				case 13:
					var16 = ((ah) ((v) this.h2.elementAt(this.hN)).field_if.elementAt(2)).aj();
					if (au.field_do == -1) {
						var5 = new String[] { "查看详情", "宝石解除", "解除说明" };
						var6 = new int[] { 1966101, 1966102, 2031651 };
						var7 = new int[] { var16.equals("") ? 3 : 2, 3, 2 };
						var1.a(var5, var6, var7);
					} else if (au.field_do == 1) {
						var5 = new String[] { "查看详情", "解除说明" };
						var6 = new int[] { 1966101, 2031651 };
						var7 = new int[] { var16.equals("") ? 3 : 2, 2 };
						var1.a(var5, var6, var7);
					}
					break;
				case 14:
					if (this.h2.size() > 0) {
						al.field_if = ((v) this.h2.elementAt(this.hN)).field_new;
						c_br.c6();
						c_a5.eQ.a(2293874);
					}
					break;
				case 15:
					if (this.h2.size() != 0) {
						var12 = (v) this.h2.elementAt(this.hN);
						if (c_a5.es.g9 == 2490390) {
							var1.a("拜　师", 2490407, 3);
						} else if (c_a5.es.g9 == 2490391) {
							var1.a("收　徒", 2490417, 3);
						}

						var1.a("查　看", 589831, 2);
						if ((c_bu.e == 0 || c_bu.h == bp.ag().method_new()) && var12.field_else) {
							var1.a("组队邀请", 720897, 3);
						}

						if (var12.field_else) {
							var1.a("私　聊", -1610612726, 2);
						}

						var1.a("加为好友", 589826, 3);
					}
					break;
				case 16:
				case 17:
					if (this.h2.size() != 0) {
						var2 = new int[] { 2555905, this.h0 == 16 ? 2555964 : 2555965 };
						var3 = new int[] { 3, 2 };
						var4 = new String[] { "去他农场", "查看详情" };
						var1.a(var4, var2, var3);
					}
					break;
				case 18:
					if (this.h2.size() != 0) {
						az.d = ((v) this.h2.elementAt(this.hN)).field_new;
						if (c_a5.es.g9 == 2555941) {
							c_a5.eQ.a(2555942);
						} else if (c_a5.es.g9 == 2555943) {
							c_a5.eQ.a(2555944);
						} else if (c_a5.es.g9 == 2555945) {
							c_a5.eQ.a(2555946);
						}
					}
					break;
				case 19:
					if ((var11 = (c_ao) c_a5.es.cf().elementAt(0)).aC().equals("总排名")) {
						var3 = new int[] { 196641, 196642, 196642 };
						var14 = new int[] { 3, 3, 3 };
						var5 = new String[] { "人物详情", "天人排名", "修罗排名" };
						var1.a(var5, var3, var14);
					} else if (var11.aC().equals("天人排名")) {
						var3 = new int[] { 196641, 196642, 196642 };
						var14 = new int[] { 3, 3, 3 };
						var5 = new String[] { "人物详情", "修罗排名", "总排名" };
						var1.a(var5, var3, var14);
					} else if (var11.aC().equals("修罗排名")) {
						var3 = new int[] { 196641, 196642, 196642 };
						var14 = new int[] { 3, 3, 3 };
						var5 = new String[] { "人物详情", "天人排名", "总排名" };
						var1.a(var5, var3, var14);
					}

					if (this.h2.size() != 0) {
						c_a4.a = ((v) this.h2.elementAt(this.hN)).field_for;
					}
					break;
				case 20:
					if (this.h2.size() != 0) {
						var2 = new int[] { 1638449 };
						var3 = new int[] { 3 };
						var4 = new String[] { "申请挑战" };
						var1.a(var4, var2, var3);
					}
				}

				switch (c_a5.es.g9) {
				case 1638421:
					ah var28;
					var26 = (var28 = (ah) ((v) ((c_bg) ((c_bg) c_a5.es.cf().elementAt(3))).h2
							.elementAt(this.hN)).field_if.elementAt(2)).aj();
					var28.a(var26 == "无" ? "有" : "无");
				default:
					if (var1.dj().size() > 0) {
						this.a(var1);
						this.y().da();
						super.field_byte = true;
					}
				}
			}

			if (this.hZ != null) {
				this.hZ.a((short) this.hN, this.hU);
			}
		}

	}

	public final byte cJ() {
		return this.hN;
	}

	public final Vector cD() {
		return this.h2;
	}

	public final void method_if(v var1) {
		if (var1 != null) {
			this.h2.addElement(var1);
			c_bg var2;
			if ((var2 = this).h2.size() * ((v) var2.h2.elementAt(0)).b + (this.ib == null ? 0 : this.ib.b) > this
					.cH()) {
				this.hZ = new af((short) (super.k + super.a - 5 - c_a5.ca.getWidth()), (short) (super.j + 1 + 1 + 1),
						(short) 0, this.cH(), (byte) 0, !this.hU, (c_be) null);
				return;
			}

			this.hZ = null;
		}

	}

	public final void cM() {
		for (int var1 = 0; var1 < this.h2.size(); ++var1) {
			v var2 = (v) this.h2.elementAt(var1);

			for (int var3 = 0; var3 < var2.field_if.size(); ++var3) {
				ba var4;
				if ((var4 = (ba) var2.field_if.elementAt(var3)) instanceof ah) {
					((ah) var4).method_long(((v) this.h2.elementAt(var1)).field_byte == bp.ag().o());
				}
			}
		}

	}

	public final void cS() {
		for (int var1 = 0; var1 < this.h2.size(); ++var1) {
			v var2 = (v) this.h2.elementAt(var1);

			for (int var3 = 0; var3 < var2.field_if.size(); ++var3) {
				ba var4;
				if ((var4 = (ba) var2.field_if.elementAt(var3)) instanceof ah) {
					((ah) var4).method_goto(((v) this.h2.elementAt(var1)).field_else);
				}
			}
		}

	}

	public final void cN() {
		if (this.h2.size() != 0) {
			c_bg var1 = new c_bg(this.v(), this.method_long(), this.method_for(), this.z(), this.hT, this.ib, this.c());
			Vector var2 = new Vector();
			Vector var3 = new Vector();

			v var5;
			for (int var4 = 0; var4 < this.h2.size(); ++var4) {
				var5 = (v) this.h2.elementAt(var4);
				if (((v) ((v) this.h2.elementAt(var4))).field_else) {
					var2.addElement(var5);
				} else {
					var3.addElement(var5);
				}
			}

			short var10 = (short) (this.method_long() + 1 + 1 + 1 + (this.ib == null ? 0 : this.ib.b));

			for (int var11 = 0; var11 < var2.size(); ++var11) {
				c_b5.method_case("add ol");
				v var6 = (v) var2.elementAt(var11);

				for (int var7 = 0; var7 < var6.field_if.size(); ++var7) {
					a(var6, var11, var7, var10);
				}

				var1.method_if(var6);
			}

			var5 = null;
			if (var2.size() > 0) {
				var5 = (v) var2.elementAt(0);
			} else if (var3.size() > 0) {
				var5 = (v) var3.elementAt(0);
			}

			var10 = (short) (var10 + var2.size() * var5.b);

			int var12;
			for (var12 = 0; var12 < var3.size(); ++var12) {
				c_b5.method_case("add off");
				v var13 = (v) var3.elementAt(var12);

				for (int var9 = 0; var9 < var13.field_if.size(); ++var9) {
					a(var13, var12, var9, var10);
				}

				var1.method_if(var13);
			}

			this.cE();

			for (var12 = 0; var12 < var1.h2.size(); ++var12) {
				this.method_if((v) var1.h2.elementAt(var12));
			}

		}
	}

	private static void a(v var0, int var1, int var2, short var3) {
		ba var5 = (ba) var0.field_if.elementAt(var2);
		var0.a((short) (var3 + var1 * var0.b));
		if (var5 instanceof a7) {
			a7 var7;
			(var7 = (a7) var5).method_for((short) (var3 + var1 * var0.b + (var0.b - var7.bE().a) / 2));
		} else {
			if (var5 instanceof ah) {
				c_b5.method_case("in resetTableItemPositionY uic instanceof UILabel");
				ah var6;
				if ((var6 = (ah) var5).method_char() == 0) {
					var6.method_for((short) (var3 + var1 * var0.b + (var0.b - c_a5.iG) / 2));
					return;
				}

				if (var6.method_char() == 2) {
					var6.method_for((short) (var3 + var1 * var0.b + (var0.b - c_a5.dY.a) / 2 + 1));
				}
			}

		}
	}

	public final void k(boolean var1) {
		this.hU = var1;
	}

	public final void cE() {
		for (int var1 = 0; var1 < this.h2.size(); ++var1) {
			this.h2.removeElementAt(var1);
		}

		this.h2 = new Vector();
		if (this.hZ != null) {
			this.hZ = null;
		}

	}

	private byte cU() {
		byte var1 = 0;
		boolean var2 = false;
		short var4;
		if (this.h2.size() > 0) {
			var4 = ((v) this.h2.elementAt(0)).b;
		} else {
			var4 = (short) (c_a5.iG + 2);
		}

		short var3 = var4;
		if (this.ib != null) {
			var3 = (short) (var4 + var4);
		}

		while (var3 <= this.cH()) {
			++var1;
			var3 += var4;
		}

		return var1;
	}

	private short cH() {
		return (short) (super.field_int - 6);
	}

	private short cG() {
		return (short) (super.a - 10);
	}

	public final byte cF() {
		return this.hT;
	}

	public final void method_new(short var1) {
		super.method_new(var1);
		int var2;
		if (this.ib != null) {
			for (var2 = 0; var2 < this.ib.field_if.size(); ++var2) {
				ba var3;
				(var3 = (ba) this.ib.field_if.elementAt(var2)).method_new((short) (var1 + 3 + 1 + 1
						+ this.ib.method_if((byte) var2) + (this.ib.method_case()[var2] - var3.method_for()) / 2));
			}
		}

		for (var2 = 0; var2 < this.h2.size(); ++var2) {
			v var7;
			(var7 = (v) this.h2.elementAt(var2)).method_if((short) (var1 + 3 + 1 + 1));

			for (int var4 = 0; var4 < var7.field_if.size(); ++var4) {
				ba var5 = (ba) var7.field_if.elementAt(var4);
				short var6 = 0;
				if (var7.method_if()[var4]) {
					var6 = (short) ((var7.method_case()[var4] - var5.method_for()) / 2);
				}

				var5.method_new((short) (var1 + 3 + 1 + 1 + var7.method_if((byte) var4) + var6 + 1));
			}
		}

		if (this.hZ != null) {
			this.hZ.method_new((short) (var1 + super.a - 5 - c_a5.ca.getWidth()));
		}

	}

	public final void method_for(short var1) {
		super.method_for(var1);
		int var2;
		if (this.ib != null) {
			for (var2 = 0; var2 < this.ib.field_if.size(); ++var2) {
				((ba) this.ib.field_if.elementAt(var2)).method_for((short) (var1 + 1 + 1 + 1));
			}
		}

		for (var2 = 0; var2 < this.h2.size(); ++var2) {
			v var3;
			short var4 = (var3 = (v) this.h2.elementAt(var2)).b;
			var3.a((short) (var1 + 1 + 1 + 1 + (this.ib == null ? 0 : this.ib.b) + var2 * var4));

			for (int var6 = 0; var6 < var3.field_if.size(); ++var6) {
				((ba) var3.field_if.elementAt(var6)).method_for(var3.method_byte());
			}
		}

		if (this.hZ != null) {
			this.hZ.method_for((short) (var1 + 1 + 1 + 1));
			this.hZ.aa();
		}

	}

	public final v cI() {
		return this.ib;
	}

	public final void a(v var1) {
		this.ib = null;
	}

	public final void cP() {
		if (this.hZ != null) {
			this.hZ.az = (short) this.h2.size();
			this.hZ.ay = (short) this.cU();
			af var10000 = this.hZ;
			byte var2 = 0;
			var10000.aj = var2;
		}
	}

	public final boolean b() {
		if (c_a5.gZ) {
			if (this.hZ != null && this.hZ.b()) {
				return true;
			}

			int var1 = this.h2.size() < this.cU() ? this.h2.size() : this.cU() + this.hQ;

			for (int var2 = this.hQ; var2 < var1; ++var2) {
				v var3;
				if (c_a5.a((var3 = (v) this.h2.elementAt(var2)).method_try(), var3.method_byte(),
						this.cG() - c_a5.ca.getWidth(), var3.b)) {
					if (this.hN == var2) {
						return false;
					}

					this.hN = (byte) var2;
					return true;
				}
			}
		}

		return true;
	}
}
