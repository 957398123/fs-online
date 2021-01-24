import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/22
 * 
 * @author 95739
 *
 */
public final class c_ao extends ba {
	private String cj;
	private String[] cs;
	public static String bX = "";
	public static int b3 = 0;
	public static boolean ct = false;
	public byte b6;
	public byte ca;
	public byte cl;
	private byte b0;
	private byte b4;
	public short b1;
	private short cn;
	public short cr;
	public af cq;
	private static byte cc = 0;
	public byte cb;
	public static boolean ci = false;
	private int bW;
	private byte cm;
	private static int bZ;
	static boolean cf;
	static boolean cg;
	static int ch;
	private static int b7;
	private static int cp;
	private static int bY;
	static boolean cd;

	private c_ao(short var1, short var2, short var3, short var4, byte var5, c_be var6) {
		super((short) 0, (short) 0, (short) 0, (short) 0, var6);
		this.cs = new String[2];
		this.b6 = 0;
		this.ca = 0;
		this.cl = 0;
		this.b0 = 0;
		this.b4 = 0;
		this.b1 = 0;
		this.cn = 0;
		this.cr = 0;
		this.cq = null;
		this.cb = 0;
		this.bW = c_z.au;
		super.y = var5;
		if (super.k <= 0) {
			super.k = 0;
		}

		if (super.j <= 0) {
			var2 = 0;
			if (super.y == 1) {
				var2 = (short) (0 + (short) (c_a5.il - 18));
			}

			super.j = var2;
		}

		if (super.a <= 0) {
			super.a = (short) c_a5.ic;
		}

		if (super.field_int <= 0) {
			super.field_int = 18;
		}

		if (super.y == 1) {
			this.method_do(c_bm.field_byte);
		}

		try {
			c_be.gf.toString();
		} catch (Exception var7) {
			c_a5.dI.notifyDestroyed();
		}
	}

	public c_ao(byte var1, c_be var2) {
		this((short) 0, (short) 0, (short) 0, (short) 0, var1, var2);
	}

	public final void a(Graphics var1) {
		short var2 = super.field_int;
		short var3 = super.j;
		var1.setColor(c_bm.aD);
		var1.drawRect(super.k, var3, super.a - 1, var2 - 1);
		var1.setColor(c_bm.aB);
		var1.drawRect(super.k + 1, var3 + 1, super.a - 3, var2 - 3);
		var1.setColor(c_bm.A);
		var1.fillRect(super.k + 2, var3 + 2, super.a - 4, var2 - 4);
		if (super.y == 0) {
			if (this.cj != null) {
				c_b5.method_do(var1, this.cj, super.a, super.k, super.j, c_bm.bP);
				return;
			}
		} else if (super.y == 1) {
			var1.setColor(7755053);
			var1.drawLine(9, super.j, 9, super.j + super.field_int);
			var1.drawLine(super.k + super.a - 9 - 1, super.j, super.k + super.a - 9 - 1, super.j + super.field_int);
			var1.setColor(14728078);
			var1.fillRect(1, super.j + 1, 8, super.field_int - 2);
			var1.fillRect(super.k + super.a - 9, super.j + 1, 8, super.field_int - 2);
			var1.setColor(16637613);
			var1.fillRect(3, super.j + 3, 4, super.field_int - 6);
			var1.fillRect(super.k + super.a - 7, super.j + 3, 4, super.field_int - 6);
			int var7;
			if (this.cs != null) {
				var1.setColor(c_bm.bP);
				var1.drawString(this.cs[0], super.k + 4 + 7, super.j, 20);
				var1.setColor(c_bm.bP);
				var7 = this.cs[1].length() * c_a5.iA;
				var1.drawString(this.cs[1], super.k + super.a - 4 - var7 - 7, super.j, 20);
			}

			bY = var7 = super.k + 4 + 2 * c_a5.iA + 8;
			if (bX.length() != 0) {
				var1.setColor(c_bm.aD);
				var1.drawRect(var7, super.j, bZ - 1, super.field_int - 1);
				var1.setColor(c_bm.aB);
				var1.drawRect(var7 + 1, super.j + 1, bZ - 3, super.field_int - 3);
				var1.setColor(c_bm.cQ);
				var1.fillRect(var7 + 2, super.j + 2, bZ - 4, super.field_int - 4);
				Graphics var10000 = var1;
				int var10001 = var7 + 2;
				int var10002 = super.j + 2;
				int var10003 = bZ - 4;
				int var4 = super.field_int - 4;
				int var8 = var10003;
				var7 = var10002;
				int var6 = var10001;
				Graphics var5 = var10000;
				cp = c_a5.fq.stringWidth(bX);
				var5.setClip(var6, var7, var8, var4);
				var5.setColor(c_bm.bR[7]);
				var5.setFont(c_a5.fq);
				if (!cd) {
					if (cg) {
						if ((var4 = var6 + var8 + b3) + cp + b7 < bY + bZ) {
							cf = true;
						}

						c_ad.a(var5, bX, c_bm.bR[7], var4, var7, (int[][]) null, (int[]) null, (int[]) null);
					}

					if (cf) {
						if ((var4 = var6 + var8 + ch) + cp + b7 < bY + bZ) {
							cg = true;
						}

						c_ad.a(var5, bX, c_bm.bR[7], var4, var7, (int[][]) null, (int[]) null, (int[]) null);
					}
				} else {
					var5.setColor(16711680);
					if (c_a5.ht % 4 < 2) {
						var4 = var6 + (var8 - c_b5.method_do(bX)) / 2;
						c_ad.a(var5, bX, c_bm.bR[7], var4, var7, (int[][]) null, (int[]) null, (int[]) null);
					}
				}

				var5.setClip(0, 0, c_a5.ic, c_a5.il);
			}
		}

	}

	protected final void f() {
		int var1;
		short var3;
		short var5;
		int var8;
		byte var10;
		int var11;
		int var13;
		String var14;
		if (c_a5.gZ && c_a5.method_byte(268435456)) {
			switch (c_a5.es.g9) {
			case 131078:
			case 131079:
				var11 = c_a5.ic;
				var13 = c_a5.il - 36;
				var8 = this.bW;
				if (c_a5.a(0, 18, var11, var13) && this.aJ()) {
					if (var8 == this.bW) {
						c_a5.a(131072);
					}

					short var17;
					if ((var17 = c_z.a(c_z.ay[this.bW])) != -1) {
						c_z.au = var17;
						var14 = c_z.o[c_z.au];
						this.cj = var14;
					}
				}
				break;
			case 524292:
				bp var4;
				short var2 = (var4 = bp.ag()).e1;
				var3 = var4.e0;
				var5 = var4.e3;
				short var6 = var4.fb;
				byte var7 = this.cm;
				if (c_a5.a(var2, var3, var5, var6) && this.aJ()) {
					if (var7 == this.cm) {
						c_a5.a(65536);
					}

					var10 = ((c_be) c_a5.fE.elementAt(0)).ht;
					var4.fC[var10] = var4.fc[var10][this.cm];
					c_a5.es.c(var4.fl[var10][var4.a(var10, var4.fC[var10])]);
					((ah) c_a5.es.cf().elementAt(6)).a(var4.eF[var10][var4.a(var10, var4.fC[var10])]);
				}

				var8 = var4.e1 + var4.e3 - c_a5.ca.getWidth() - 5;
				var11 = var4.e0 + 3;
				int var19 = c_a5.ca.getWidth();
				var13 = c_a5.ca.getHeight();
				if (c_a5.a(var8, var11, var19, var13)) {
					c_a5.a(4096);
				}

				var1 = var11 + this.cq.z() - c_a5.ca.getHeight();
				if (c_a5.a(var8, var1, var19, var13)) {
					c_a5.a(8192);
				}
			}
		}

		byte var9;
		int[] var23;
		if (super.field_byte) {
			if (c_a5.method_try(4096)) {
				this.y().c8();
				return;
			}

			if (c_a5.method_try(8192)) {
				this.y().c9();
				return;
			}

			if (c_a5.method_byte(65536) || c_a5.method_byte(131072)) {
				label244: {
					ah var16;
					switch (c_a5.es.g9) {
					case 131079:
						if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) == -1) {
							super.field_byte = false;
							c_b5.method_case("退出菜单");
						} else {
							if (var1 == 131079) {
								var23 = new int[] { 131080, 131081 };
								c_a5.eQ.a(var23);
								c_b5.method_case("查看地图详情和怪物分布");
								ct = true;
							} else if (var1 == 131078) {
								c_a5.eQ.a(var1);
								c_b5.method_case("转入世界地图");
							}

							super.field_byte = false;
						}
						break label244;
					case 393219:
						switch (this.y().de()) {
						case 0:
							ah var12 = (ah) c_a5.es.cf().elementAt(33);
							var16 = (ah) c_a5.es.cf().elementAt(35);
							if (var12.al() >= var16.al()) {
								(c_a5.gQ = new c_as((byte) 0, (c_be) null)).a((byte) 5, c_as.a2(),
										"此次升级将扣除您 $" + var16.al() + "$" + " 经验，是否升级？", "确定", "返回", 393228, -1);
							} else {
								c_as.a((byte) 0, "您尚未达到升级所需的经验！", "确定", "返回", -1, -1);
							}

							super.field_byte = false;
							break label244;
						case 1:
							c_a5.eQ.a(393217);
							super.field_byte = false;
						default:
							break label244;
						}
					case 524292:
						if ((var8 = (Integer) this.y().db().elementAt(this.y().de())) != -1) {
							if (var8 == 524289) {
								var9 = cc;
								c_ao var29 = (c_ao) (c_a5.es = c_e.a("/ui/skilldetail.ui")).cf().elementAt(0);
								var14 = "天赋详情";
								var29.cj = var14;
								(var16 = (ah) c_a5.es.cf().elementAt(3)).a((byte) 5);
								var11 = bp.ag().a(var9, bp.ag().fC[var9]);
								String var20 = bp.ag().eF[var9][var11];
								var16.a(var20);
								ak var18 = (ak) c_a5.es.cf().elementAt(4);
								var20 = bp.ag().fl[var9][var11];
								var18.method_if(var20);
								var18.ap();
								a7 var21 = (a7) c_a5.es.cf().elementAt(5);
								var3 = bp.ag().fO[var9][var11];
								var21.fC = (byte) (var3 / 1000 - 1);
								var21.ft = true;
								var5 = (short) (var3 % 1000);
								var21.method_if(var5, true);
								var21.a(c_a5.gg);
							} else if (var8 == 1572869) {
								ci = false;
								c_a5.eQ.a(var8);
							} else if (var8 == 524291 && ci) {
								ci = false;
								var1 = 0;

								label236: while (true) {
									if (var1 >= bp.ag().eR) {
										for (var1 = 0; var1 < bp.ag().eR; ++var1) {
											for (var8 = 0; var8 < bp.ag().ee[var1].length; ++var8) {
												bp.ag().method_if(var1, var8);
											}
										}

										var9 = 0;

										while (true) {
											if (var9 >= bp.ag().eR) {
												break label236;
											}

											((ah) ((c_be) c_a5.fE.elementAt(var9)).cf().elementAt(8))
													.a(bp.ag().e7 + "");
											++var9;
										}
									}

									for (var8 = 0; var8 < bp.ag().ee[var1].length; ++var8) {
										bp var10000 = bp.ag();
										var10000.e7 += bp.ag().fL[var1][var8];
										byte[] var27 = bp.ag().ee[var1];
										var27[var8] -= bp.ag().fL[var1][var8];
										short[] var28 = bp.ag().ez;
										var28[var1] = (short) (var28[var1] - bp.ag().fL[var1][var8]);
										bp.ag().fL[var1][var8] = 0;
									}

									++var1;
								}
							}

							super.field_byte = false;
							break label244;
						}
						break;
					case 2490386:
						var1 = (Integer) this.y().db().elementAt(this.y().de());
						c_bg.hP = c.field_do;
						if (var1 == -268435452) {
							a3.a(c.field_do, c.field_if, true);
						} else {
							if (var1 == 720897) {
								c_bu.k = c.field_do;
							}

							c_a5.eQ.a(var1);
						}
						break;
					default:
						break label244;
					}

					super.field_byte = false;
				}

				this.y().dc();
				return;
			}

			if (c_a5.method_byte(262144)) {
				super.field_byte = false;
				this.y().da();
				return;
			}
		} else {
			short var15;
			if (c_a5.method_try(4096)) {
				switch (c_a5.es.g9) {
				case 131078:
				case 131079:
					if ((var15 = c_z.a(c_z.v[c_z.au][0])) != -1) {
						c_z.au = var15;
						var14 = c_z.o[c_z.au];
						this.cj = var14;
					}
					break;
				case 524292:
					bp.ag().method_goto(0);
					--this.b4;
					if (this.b4 < 0) {
						this.b4 = 0;
						this.cb = this.cl;
					}
				}
			} else if (c_a5.method_try(8192)) {
				switch (c_a5.es.g9) {
				case 131078:
				case 131079:
					if ((var15 = c_z.a(c_z.v[c_z.au][1])) != -1) {
						c_z.au = var15;
						var14 = c_z.o[c_z.au];
						this.cj = var14;
					}
					break;
				case 524292:
					bp.ag().method_goto(1);
					++this.b4;
					if (this.b4 >= this.ca) {
						this.b4 = (byte) (this.ca - 1);
						this.cb = (byte) (this.cl - (this.ca - 1));
					}

					if (this.cl >= this.ca) {
						this.cn += this.b1;
						c_b5.method_case("scrollPositionY= " + this.cn + "slipperEndY = " + this.cr);
					}

					if (this.cn > this.cr) {
						this.cn = this.cr;
					}
				}
			} else if (c_a5.method_try(16384)) {
				switch (c_a5.es.g9) {
				case 131078:
				case 131079:
					if ((var15 = c_z.a(c_z.v[c_z.au][2])) != -1) {
						c_z.au = var15;
						var14 = c_z.o[c_z.au];
						this.cj = var14;
					}
					break;
				case 524292:
					if (this.b0 < 0) {
						this.b0 = 0;
					} else {
						bp.ag().method_goto(2);
					}
				}
			} else if (c_a5.method_try(32768)) {
				switch (c_a5.es.g9) {
				case 131078:
				case 131079:
					if ((var15 = c_z.a(c_z.v[c_z.au][3])) != -1) {
						c_z.au = var15;
						var14 = c_z.o[c_z.au];
						this.cj = var14;
					}
					break;
				case 524292:
					if (this.b0 >= 3) {
						this.b0 = 2;
					} else {
						bp.ag().method_goto(3);
					}
				}
			}

			if (c_a5.method_byte(65536) || c_a5.method_byte(131072)) {
				c_br var22;
				String[] var24;
				int[] var25;
				int[] var26;
				switch (c_a5.es.g9) {
				case 131078:
					c_a5.fR = true;
					c_z.p = c_z.ay[c_z.au];
					c_a5.eQ.a(131079);
					return;
				case 131079:
					var22 = new c_br((byte) 0);
					var24 = new String[] { "地图详情", "世　界" };
					var26 = new int[] { 131079, 131078 };
					var25 = new int[] { 1, 1 };
					var22.a(var24, var26, var25);
					this.a(var22);
					super.field_byte = true;
					this.y().da();
					return;
				case 393219:
					var22 = new c_br((byte) 0);
					var23 = new int[] { 393228, 393217 };
					var22.a(c_bm.dF, var23, c_bm.b7);
					this.a(var22);
					super.field_byte = true;
					this.y().da();
					return;
				case 524292:
					if (c_a5.method_byte(131072)) {
						cc = ((c_be) c_a5.fE.elementAt(0)).ht;
						var22 = new c_br((byte) 0);
						var24 = new String[] { "天赋详情", "确认升级", "恢复操作" };
						var26 = new int[] { 524289, 1572869, 524291 };
						var25 = new int[] { 2, 3, 3 };
						var22.a(var24, var26, var25);
						this.a(var22);
						super.field_byte = true;
						this.y().da();
						return;
					}

					if (c_a5.method_byte(65536)) {
						var9 = ((c_be) c_a5.fE.elementAt(0)).ht;
						var8 = bp.ag().a(var9, bp.ag().fC[var9]);
						if (bp.ag().ee[var9][var8] < bp.ag().eH[var9][var8] && bp.ag().e7 != 0
								&& bp.ag().eO[var9][var8]) {
							ci = true;
							++bp.ag().ee[var9][var8];
							++bp.ag().fL[var9][var8];
							++bp.ag().ez[var9];
							--bp.ag().e7;

							for (var11 = 0; var11 < bp.ag().eR; ++var11) {
								for (var13 = 0; var13 < bp.ag().ee[var11].length; ++var13) {
									bp.ag().method_if(var11, var13);
								}
							}
						}

						for (var10 = 0; var10 < bp.ag().eR; ++var10) {
							((ah) ((c_be) c_a5.fE.elementAt(var10)).cf().elementAt(8)).a(bp.ag().e7 + "");
						}

						return;
					}
					break;
				case 2490386:
					(var22 = new c_br((byte) 0)).a("加为好友", 589835, 3);
					if (c.field_int) {
						var22.a("私　聊", -268435452, 2);
					}

					if (c.field_int && c_bu.e == 0) {
						var22.a("组队邀请", 720897, 3);
					}

					this.a(var22);
					super.field_byte = true;
					this.y().da();
				}
			}
		}

	}

	private boolean aJ() {
		boolean var1 = false;
		int var2;
		int var5;
		switch (c_a5.es.g9) {
		case 131078:
		case 131079:
			for (var2 = 0; var2 < c_z.b; ++var2) {
				int var9 = c_z.a3[var2] - c_z.field_do;
				int var10 = c_z.a1[var2] - c_z.field_if;
				var5 = c_z.ak.getWidth();
				int var11 = c_z.ak.getHeight();
				if (c_a5.cV >= var9 && c_a5.cV <= var9 + var5 && c_a5.cU >= var10 && c_a5.cU <= var10 + var11) {
					var1 = true;
					this.bW = var2;
					return var1;
				}
			}

			return var1;
		case 524292:
			byte var3 = ((c_be) c_a5.fE.elementAt(0)).ht;
			bp var4;
			var5 = (var4 = bp.ag()).fc[var3].length;
			short var6 = (short) ((c_a5.ic >> 1) - 27 - (c_a5.gg.field_try >> 1));

			for (var2 = 0; var2 < var5; ++var2) {
				short var7 = (short) (var6 + (var4.fc[var3][var2] - 1) % 3 * 27);
				short var8 = (short) (8 + var4.e0 + ((var4.fc[var3][var2] - 1) / 3 - this.cb) * 27);
				if (c_a5.cV >= var7 && c_a5.cV <= var7 + 16 && c_a5.cU >= var8 && c_a5.cU <= var8 + 16) {
					var1 = true;
					this.cm = (byte) var2;
					this.b4 = (byte) ((var8 - 8 - var4.e0) / 25);
					if (this.cl >= this.ca - 1) {
						this.cl = (byte) (this.cl + 1 - this.ca + this.b4);
					} else {
						this.cl = this.b4;
					}
					break;
				}
			}
		}

		return var1;
	}

	public static void aH() {
		if (bX.length() != 0) {
			if (cg && (b3 -= 3) < -(cp + bZ - 4)) {
				cg = false;
				b3 = 0;
			}

			if (cf && (ch -= 3) < -(cp + bZ - 4)) {
				cf = false;
				ch = 0;
			}

		}
	}

	public final String aC() {
		return this.cj;
	}

	public final void method_do(String var1) {
		this.cj = var1;
	}

	public final void method_do(String[] var1) {
		if (var1 != null && var1.length == this.cs.length) {
			System.arraycopy(var1, 0, this.cs, 0, var1.length);
		}

	}

	public final void a(String var1, int var2) {
		if (var1 != null && var2 >= 0 && var2 < 2) {
			this.cs[var2] = var1;
		}

	}

	public static int aA() {
		return c_a5.iG + 4 + 3;
	}

	static {
		bZ = c_a5.ic - 2 * (4 + 2 * c_a5.iA + 8);
		cg = true;
		b7 = bZ / 2;
		cp = c_a5.fq.stringWidth(bX);
		cd = false;
	}
}
