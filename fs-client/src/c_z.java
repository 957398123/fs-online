import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class c_z {
	public static short field_try;
	public static short U;
	public static short aE;
	public static short aD;
	private static short aY;
	private byte[][] a6;
	private short[][] a2;
	private short[][] aN;
	private short[][] Z;
	private static int aF;
	private static int u;
	private static int az;
	private static int d;
	private static Image[] aX = null;
	private static String[] aR = null;
	public static boolean F = false;
	public static int aS = 0;
	private boolean field_long = true;
	private String A = "";
	private String af = "";
	private static byte[] W = null;
	public static short field_do = 0;
	public static short field_if = 0;
	private static byte k = 0;
	private static byte aQ = 0;
	public static Image ak = null;
	public static Image[] ao = new Image[30];
	public static Image[] m = new Image[8];
	private static byte[][] n = null;
	public static short b = 0;
	private static short aU = 0;
	static short[] ay = null;
	static String[] o = null;
	private static byte[] aG = null;
	private static byte[] l = null;
	private static byte[] f = null;
	static short[][] v = null;
	private static byte[] X = null;
	static short[] a3 = null;
	static short[] a1 = null;
	private static short Q = 0;
	public static short au = 0;
	private static boolean V = false;
	private static short R = 0;
	public static short p = 0;
	public static byte T = 0;
	public static byte ai = 0;
	public static short[][] ah = null;
	private static byte e = 0;
	private static String[] q = null;
	private static byte[] field_for = null;
	private static boolean[] a4 = null;
	private static short[] O = null;
	private static short[] N = null;
	private static byte[] aw = null;
	public static boolean field_case = false;
	private static int an;
	private static int al;
	private static int aj;
	private static int L;
	private static int a0;
	public static int[] ad = new int[2];
	public static Vector ag = new Vector();
	public static boolean aK;
	private static c_z aV = null;
	private short E = 0;
	private int[] am = null;
	private int aT = 0;
	private static final int z;
	private static final int y;
	private int aC;
	private int aA;
	private int as;
	private int field_void;
	private int aL;
	private int aa;
	private int aq;
	private int t;
	private static boolean at;
	private static byte ac;
	private static byte ax;
	private int field_else;
	static boolean field_int;
	private static byte[][] ap;
	private static byte[][] a;
	private Image r;
	public static byte aI;
	public static byte w;

	private c_z() {
		aC = z;
		aA = y;
		as = 0;
		field_void = 0;
		aL = 0;
		aa = 0;
		aq = 0;
		t = 0;
		field_else = 0;
		r = null;
		aS = c_a5.il - 36 - (c_a5.d8 ? c_ad.m : 0);
	}

	/**
	 * 获取单例
	 */
	public static c_z a() {
		if (aV == null) {
			aV = new c_z();
		}
		return aV;
	}

	public static void method_do() {
		aV = null;
	}

	public final void method_for(Graphics var1) {
		c_z var2;
		Graphics var3;
		short var7;
		short var8;
		int var9;
		int var10;
		boolean var11;
		int var13;
		int var14;
		int var15;
		int var16;
		int var19;
		int var20;
		int var21;
		int var23;
		int var24;
		int var25;
		int var44;
		int var47;
		if (c_a5.cf) {
			var3 = var1;
			var2 = this;
			aF = (aD + (aE - aY) * 10 / 20) / 10;
			u = (aD + aS + (aE + c_a5.ic - aY) * 10 / 20) / 10 + 1;
			az = (aD - (aE + c_a5.ic - aY) * 10 / 20) / 10;
			d = (aD + aS - (aE - aY) * 10 / 20) / 10 + 1;
			if (aF < 0) {
				aF = 0;
			}

			if (az < 0) {
				az = 0;
			}

			if (u >= field_try) {
				u = field_try;
			}

			if (d >= U) {
				d = U;
			}

			try {
				var3.setColor(c_a5.cX);
				var3.fillRect(0, 0, c_a5.ic, aS + 10);
				var10 = aS + 10;
				var9 = c_a5.ic;
				var8 = aD;
				var7 = aE;
				Graphics var6 = var3;
				c_z var5 = var2;
				var11 = false;
				boolean var12 = false;
				var13 = (var8 + (var7 - aY) * 10 / 20) / 10;
				var14 = (var8 - (var7 - aY) * 10 / 20) / 10;
				--var13;
				--var14;
				var44 = (20 * (var13 - var14) >> 1) + aY - aE;
				var47 = (10 * (var13 + var14) >> 1) + 10 - aD;
				var15 = 0;

				for (var16 = var10 / 10 + 2; var15 < var16; ++var15) {
					int var17 = -1;

					for (int var18 = var9 / 20 + 2; var17 < var18; ++var17) {
						for (var19 = 1; var19 >= 0; --var19) {
							var20 = var13 + var17;
							var21 = var14 - var17 - var19;
							if (var20 >= 0 && var20 < field_try && var21 >= 0 && var21 < U) {
								short var22 = var5.a2[var20][var21];
								var23 = var5.a6[var20][var21] >> 1 & 3;
								var24 = var44 + var17 * 20 - var5.aN[var22][2] + var19 * 10;
								var25 = var47 - var5.aN[var22][3] - var19 * 5;
								if (var22 != 0 && var22 >= 1) {
									if (var23 == 0) {
										c_b5.a(var6, aX[var22 - 1], var24, var25, 0);
									} else if (var23 == 1) {
										c_b5.a(var6, aX[var22 - 1],
												var24 + 0 + (2 * (var5.aN[var22][2] + 1) - aX[var22 - 1].getWidth()),
												var25, 2);
									} else if (var23 == 2) {
										c_b5.a(var6, aX[var22 - 1], var24, var25 + aX[var22 - 1].getHeight() - 10, 1);
									} else if (var23 == 3) {
										c_b5.a(var6, aX[var22 - 1],
												var24 + 0 + (2 * (var5.aN[var22][2] + 1) - aX[var22 - 1].getWidth()),
												var25 + aX[var22 - 1].getHeight() - 9, 3);
									} else {
										c_b5.method_case("Error!! Map:drawBufferTileTemp()");
									}
								}
							}
						}
					}

					var47 += 10;
					++var13;
					++var14;
				}

				if (field_case && !field_int && (aI == 3 || aI == 2 && w == 1)) {
					var2.method_case(var3);
				}
			} catch (Exception var26) {
				var26.printStackTrace();
			}
		}

		if (c_l.field_char != null) {
			c_l.field_char.method_do();
			if (!c_l.field_char.method_if()) {
				c_l.field_char.a(var1);
			}
		}

		if (bp.ef > -c_a5.hN.field_new) {
			--bp.ef;
			c_a5.hN.method_if(var1, bp.fE - aE, bp.fD - aD, c_a5.hN.field_new - Math.abs(bp.ef) - 1);
		}

		int var4;
		int var31;
		int var32;
		int var35;
		c_a4 var52;
		short var59;
		if (c_a5.fA) {
			var35 = d;
			var32 = u;
			var31 = az;
			var4 = aF;
			var2 = this;
			if (var4 < 0) {
				var4 = 0;
			}

			if (var31 < 0) {
				var31 = 0;
			}

			if (var32 > field_try) {
				var32 = field_try;
			}

			if (var35 > U) {
				var35 = U;
			}

			boolean[] var39 = new boolean[Z.length];
			E = 0;

			c_z var48;
			for (var9 = var31; var9 < var35; ++var9) {
				for (var10 = var4; var10 < var32; ++var10) {
					if ((var2.a6[var10][var9] & 16) != 0) {
						var14 = var9;
						var13 = var10;
						var48 = var2;
						var15 = var2.Z.length;
						var16 = 0;

						int var10000;
						while (true) {
							if (var16 >= var15) {
								var10000 = -1;
								break;
							}

							if (var48.Z[var16][0] == var13 && var48.Z[var16][1] == var14) {
								short var67 = var48.Z[var16][0];
								short var69 = var48.Z[var16][1];
								short var71 = var48.Z[var16][3];
								if ((var48.a6[var67][var69] >>> 3 & 1) == 1) {
									var23 = (20 * (var67 - var69) >> 1) + aY - aE + var48.aN[var71][2] + 2
											- aX[var71 - 1].getWidth();
								} else {
									var23 = (20 * (var67 - var69) >> 1) + aY - aE - var48.aN[var71][2];
								}

								var24 = (10 * (var67 + var69) >> 1) + 10 - aD - var48.aN[var71][3];
								var25 = var23 + aX[var71 - 1].getWidth();
								var20 = var24 + aX[var71 - 1].getHeight();
								if (var25 > 0 && var23 < c_a5.ic && var20 > 0 && var24 < aS) {
									++var48.E;
									var10000 = var16;
									break;
								}
							}

							++var16;
						}

						var44 = var10000;
						if (var10000 != -1) {
							var39[var44] = true;
						}
					}
				}
			}

			for (var47 = c_l.field_else.length - 1; var47 > 0; --var47) {
				for (var13 = var47 - 1; var13 >= 0; --var13) {
					if (c_l.field_else[var47].b() < c_l.field_else[var13].b()) {
						var52 = c_l.field_else[var47];
						c_l.field_else[var47] = c_l.field_else[var13];
						c_l.field_else[var13] = var52;
					}
				}
			}

			boolean[] var50 = var39;
			var48 = var2;
			c_a4[] var53 = c_l.field_else;
			var2.am = new int[var2.E + var53.length];
			var2.aT = var2.am.length - 1;

			for (var15 = var2.Z.length - 1; var15 >= 0; --var15) {
				if (var50[var15]) {
					var59 = var48.Z[var15][0];
					short var62 = var48.Z[var15][1];
					short var66 = var48.Z[var15][3];
					var19 = var48.a6[var59][var62] >>> 3 & 1;
					int var10002 = var59 - var48.aN[var66][var19] + 1;
					var23 = var62 - var48.aN[var66][1 - var19] + 1;
					int var73 = var10002;
					var21 = var15;
					c_z var70 = var48;

					for (var24 = c_l.field_else.length - 1; var24 >= 0; --var24) {
						c_a4 var74;
						if ((var74 = c_l.field_else[var24]) != null && var74.method_void() >= var73
								&& var74.e() >= var23 && var74.method_char() == -1) {
							var74.a(var21);
							var70.am[var70.aT--] = -var24 - 1;
						}
					}

					var48.am[var48.aT--] = var15;
				}
			}

			for (var15 = c_l.field_else.length - 1; var15 >= 0; --var15) {
				c_a4 var61;
				if ((var61 = c_l.field_else[var15]) != null && var61.method_char() == -1) {
					var61.a(-5);
					var48.am[var48.aT--] = -var15 - 1;
				}
			}

			var2.method_try(var1);
		}

		int var29;
		if (c_a5.g9) {
			var31 = d;
			var4 = u;
			var29 = az;
			int var27 = aF;

			for (int var40 = 0; var40 < e; ++var40) {
				if (N[var40] >= var29 && N[var40] <= var31 && O[var40] >= var27 && O[var40] <= var4) {
					byte[] var75 = aw;
					var75[var40] = (byte) (var75[var40] ^ 1);
				}
			}
		}

		Graphics var28 = var1;
		var3 = null;

		for (var4 = c_l.field_else.length - 1; var4 >= 0; --var4) {
			c_a4 var30;
			if (a(var30 = c_l.field_else[var4])) {
				if (c_l.field_for && var30.method_for() != 2 || c_l.g == var30 || var30.method_for() == 3
						|| var30.method_for() == 2 && c_l.field_new) {
					var30.method_if(var28);
				}

				w var34;
				if (var30.field_try == 3 && (var34 = (w) var30).Q() != 0) {
					var34.method_int(var28);
				}

				if (var30.method_for() == 1 || var30.method_for() == 3 || var30.method_for() == 2) {
					((bz) var30).a$11c44857(var28);
				}
			}
		}

		var32 = d;
		var31 = u;
		var4 = az;
		var29 = aF;
		var28 = var1;
		boolean var38 = false;
		boolean var41 = false;

		for (var9 = 0; var9 < e; ++var9) {
			if (N[var9] >= var4 && N[var9] <= var32 && O[var9] >= var29 && O[var9] <= var31) {
				var7 = method_for(O[var9], N[var9]);
				var8 = method_try(O[var9], N[var9]);
				var10 = var7 - aE - (c_b5.method_do(q[var9]) >> 1);
				var44 = var8 - aD - 70;
				var28.setColor(16768941);
				var28.fillRoundRect(var10 - 2, var44 - 2, c_b5.method_do(q[var9]) + 4, c_a5.iG + 4, 6, 6);
				var28.setColor(2955522);
				var28.drawRoundRect(var10 - 2, var44 - 2, c_b5.method_do(q[var9]) + 4, c_a5.iG + 4, 6, 6);
				var28.drawString(q[var9], var10, var44, 20);
			}
		}

		var2 = this;
		if (field_long) {
			int[][] var33 = new int[][] { { 0, 0 }, { aq, 0 }, { aq, t }, { 0, t } };
			int[] var36 = new int[4];
			int[] var37 = new int[4];

			for (var35 = 0; var35 < 4; ++var35) {
				var36[var35] = var2.a(var33[var35][0], var33[var35][1]);
				var37[var35] = var2.method_new(var33[var35][0], var33[var35][1]);
			}

			var1.setColor(16777173);
			var1.drawLine(var36[0], var37[0] + 1, var36[1] - 1, var37[1]);
			var1.drawLine(var36[1] - 1, var37[1], var36[2], var37[2] - 1);
			var1.drawLine(var36[2], var37[2] - 1, var36[3] + 1, var37[3]);
			var1.drawLine(var36[0], var37[0] + 1, var36[3] + 1, var37[3]);
			Graphics var43 = var1;
			c_z var42 = var2;
			short var55;
			short var60;
			if (ah != null) {
				var1.setColor(16524288);
				boolean var46 = false;
				var11 = false;
				var47 = 0;

				for (var13 = ah.length; var47 < var13; ++var47) {
					var55 = ah[var47][0];
					var60 = ah[var47][1];
					if (var55 != -1 || var60 != -1) {
						var10 = var42.a((int) var55, (int) var60);
						var44 = var42.method_new(var55, var60);
						var43.fillRect(var10 - 1, var44 - 1, 3, 3);
					}
				}
			}

			var43 = var1;
			var42 = var2;
			if (field_case) {
				label643: {
					byte var54 = aI;
					switch (var54) {
					case 1:
					case 4:
					default:
						break label643;
					case 2:
						var2.a(var1, 130823, bp.ag().l, bp.ag().q);
						break label643;
					case 3:
					}

					var52 = null;
					c_b var63 = null;
					c_b var57 = (c_b) c_l.a(ad[0]);
					var63 = (c_b) c_l.a(ad[1]);
					if (var57 == null || var63 == null) {
						var2.a(var1, 130823, bp.ag().l, bp.ag().q);
					}

					boolean var64;
					if (var57 != null && var63 == null) {
						if (var57.eb) {
							var64 = false;
							if (var57.dp == 1) {
								var16 = 14024807;
							} else {
								var16 = 87551;
							}

							if (var57.method_new() != bp.ag().method_new() || var63 == null) {
								var2.a(var1, 130823, bp.ag().l, bp.ag().q);
							}

							var2.a(var1, var16, var57.method_void(), var57.e());
						}
					} else if (var57 == null && var63 != null) {
						if (var63.eb) {
							var64 = false;
							if (var63.dp == 1) {
								var16 = 14024807;
							} else {
								var16 = 87551;
							}

							if (var63.method_new() != bp.ag().method_new() || var57 == null) {
								var2.a(var1, 130823, bp.ag().l, bp.ag().q);
							}

							var2.a(var1, var16, var63.method_void(), var63.e());
						}
					} else if (var57 != null && var63 != null) {
						if (var57.method_new() != bp.ag().method_new() && var63.method_new() != bp.ag().method_new()
								|| var57.method_new() == bp.ag().method_new() && !var57.eb
								|| var63.method_new() == bp.ag().method_new() && !var63.eb) {
							var2.a(var1, 130823, bp.ag().l, bp.ag().q);
						}

						if (var57.method_new() != bp.ag().method_new() && var57.eb) {
							var2.a(var1, 14024807, var57.method_void(), var57.e());
						}

						if (var63.method_new() != bp.ag().method_new() && var63.eb) {
							var2.a(var1, 87551, var63.method_void(), var63.e());
						}

						if (var57.method_new() == bp.ag().method_new() && var57.eb) {
							var2.a(var1, 14024807, bp.ag().l, bp.ag().q);
						}

						if (var63.method_new() == bp.ag().method_new() && var63.eb) {
							var2.a(var1, 87551, bp.ag().l, bp.ag().q);
						}
					}
				}

				Graphics var51 = var1;
				c_z var49 = var2;
				ag var56 = null;

				for (var14 = 0; var14 < ag.size(); ++var14) {
					if ((var56 = (ag) c_l.a((Integer) ag.elementAt(var14))) != null) {
						if (var56.r == 5) {
							var51.setColor(14024807);
						} else if (var56.r == 6) {
							var51.setColor(87551);
						} else if (var56.r == 7) {
							var51.setColor(8157496);
						}

						var51.fillRect(var49.a((int) var56.l, (int) var56.q), var49.method_new(var56.l, var56.q), 3, 3);
					}
				}
			} else {
				var2.a(var1, 130823, bp.ag().l, bp.ag().q);
				var1.setColor(87551);
				if (c_bu.n != null) {
					for (var10 = 0; var10 < c_bu.n.length; ++var10) {
						if (bp.ag().aa() == c_bu.n[var10].aa()) {
							c_b var58 = c_bu.n[var10];
							if (var58 != null) {
								var55 = a(var58.field_void, var58.c);
								var60 = method_if(var58.field_void, var58.c);
								if (var55 >= 0 && var60 >= 0) {
									var43.fillRect(var42.a((int) var55, (int) var60), var42.method_new(var55, var60), 3,
											3);
								}
							}
						}
					}
				}
			}
		}

		if (c_q.h) {
			c_be.a(var1, c_a5.ic - 10 - 2, aA - 10, (byte) 1);
		}

		var3 = var1;
		if (at) {
			var4 = c_a5.fq.stringWidth(A);
			var31 = c_a5.fq.stringWidth(af);
			var32 = (var4 > var31 ? var4 : var31) + 20;
			var35 = 76 > var32 ? 76 : var32;
			short var45;
			var10 = (var45 = (short) ((c_a5.il - 60 - 36 >> 1) - 40)) + (60 - (c_a5.iG << 1) >> 1);
			int[][] var65 = new int[][] {
					{ 16765320, 13740650, 8023640, 4866613, 4866613, 8023640, 13740650, 16765320 },
					{ 1461506, 2392068, 3455750, 4718344, 4718344, 3455750, 2392068, 1461506 },
					{ 5046786, 8389892, 12257286, 16714504, 16714504, 12257286, 8389892, 5046786 },
					{ 5064450, 8418820, 12299782, 16772360, 16772360, 12299782, 8418820, 5064450 } };
			var15 = c_a5.ic - var35 >> 1;
			var59 = var45;
			if (++ac == 16) {
				ac = 0;
				at = false;
				ax = 0;
			} else if (ac % 2 == 0) {
				++ax;
			}

			var1.setColor(c_bm.aG);
			var1.fillRect(var15 + 1, var45 + 1, var35 - 2, 58);
			int[] var68 = new int[] { c_bm.cW, c_bm.cV, c_bm.cU };

			for (var20 = 0; var20 < 3; ++var20) {
				var3.setColor(var68[var20]);
				var3.drawRect(var15 + var20, var59 + var20, var35 - var20 * 2, 60 - var20 * 2);
			}

			int[] var72 = new int[] { c_bm.a9, c_bm.a8, c_bm.a7, c_bm.a5 };

			for (var21 = 0; var21 < 4; ++var21) {
				var3.setColor(var72[var21]);
				var3.drawRect(var15 + 3 + 2 + var21, var59 + 3 + 2 + var21, var35 - 4 - 2 * (5 + var21),
						56 - 2 * (5 + var21));
			}

			var3.setColor(var65[0][ax]);
			var3.drawString(A, c_a5.ic >> 1, var10, 17);
			var3.drawString(af, c_a5.ic >> 1, var10 + c_a5.iG + 2, 17);
		}

		if (field_case && !field_int && aI == 2 && w == 2) {
			method_case(var1);
		}

		c_as.b(var1);
	}

	private final void method_try(

			Graphics var1) {
		int var2 = am.length;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4;
			if ((var4 = am[var3]) >= 0) {
				short var7 = Z[var4][0];
				short var8 = Z[var4][1];
				short var6 = Z[var4][3];
				int var9;
				int var10;
				if ((var9 = a6[var7][var8] >>> 3 & 1) == 1) {
					var10 = (20 * (var7 - var8) >> 1) + aY - aE + aN[var6][2] + 2 - aX[var6 - 1].getWidth();
				} else {
					var10 = (20 * (var7 - var8) >> 1) + aY - aE - aN[var6][2];
				}

				if ((var4 = (10 * (var7 + var8) >> 1) + 10 - aD - aN[var6][3]) < aS) {
					if (var9 == 1) {
						c_b5.a(var1, aX[var6 - 1], var10, var4, 2);
					} else {
						c_b5.a(var1, aX[var6 - 1], var10, var4, 0);
					}
				}
			} else {
				try {
					c_a4 var12;
					if (a(var12 = c_l.field_else[-var4 - 1])) {
						if (var12.field_try == 1) {
							if (!c_l.field_long) {
								a(var1, var12, true);
							} else {
								a(var1, var12, false);
							}
						} else {
							var12.a(var1);
						}
					}

					var12.a(-1);
				} catch (Exception var11) {
					c_b5.method_case("线程同步出错");
				}
			}
		}

	}

	private static void a(Graphics var0, c_a4 var1, boolean var2) {
		if (!var2 || var1.method_new() == bp.ag().method_new()) {
			c_b var3 = (c_b) var1;
			if (var3.W != null && var3.ap == 1) {
				if (var3.W.b() <= var1.b()) {
					var3.W.a(var0, var3.x, var3.w);
					var3.a(var0);
				} else {
					var3.a(var0);
					var3.W.a(var0, var3.x, var3.w);
				}
			} else {
				var3.W = null;
				var1.a(var0);
			}
		}
	}

	private static boolean a(c_a4 var0) {
		if (var0.field_try != 1 && var0.field_try != 2 && var0.field_try != 3 && var0.field_try != 9) {
			if (var0.field_try != 4 && var0.field_try != 5 && var0.field_try != 6 && var0.field_try != 7
					&& var0.field_try != 8) {
				if (var0.field_try != 10 && var0.field_try != 11) {
					return false;
				} else {
					return var0.o - (c_a5.hk.field_try >> 1) < c_a5.ic
							&& var0.o - (c_a5.hk.field_try >> 1) + c_a5.hk.field_try > 0 && var0.n - (c_a5.hk.a >> 1) < aS
							&& var0.n - (c_a5.hk.a >> 1) + c_a5.hk.a > 0;
				}
			} else {
				return var0.o - (c_a5.ch.field_try >> 1) < c_a5.ic && var0.o - (c_a5.ch.field_try >> 1) + c_a5.ch.field_try > 0
						&& var0.n - (c_a5.ch.a >> 1) < aS && var0.n - (c_a5.ch.a >> 1) + c_a5.ch.a > 0;
			}
		} else {
			bz var1;
			return (var1 = (bz) var0).D() + var1.method_long() < c_a5.ic && var1.D() + var1.method_long() + var1.G() > 0
					&& var1.M() + var1.a() < aS && var1.M() + var1.a() + var1.x() > 0;
		}
	}

	private int a(int var1, int var2) {
		return (var1 - var2) * as / 2000 + (aL >> 1) + aC;
	}

	private int method_new(int var1, int var2) {
		return (var1 + var2) * field_void / 2000 + aA;
	}

	private void a(Graphics var1, int var2, int var3, int var4) {
		var1.setColor(var2);
		var1.fillRect(a(var3, var4), method_new(var3, var4), 3, 3);
	}

	public static void method_do(int var0, int var1) {
		aE = (short) (var0 - (c_a5.ic >> 1));
		aD = (short) (var1 - (aS >> 1));
	}

	public final String method_try() {
		return A;
	}

	public static short method_if(short var0, short var1) {
		return (short) ((var0 - (var1 - aY) * 10 / 20) / 10);
	}

	public static short a(short var0, short var1) {
		return (short) ((var0 + (var1 - aY) * 10 / 20) / 10);
	}

	public static short method_for(int var0, int var1) {
		return (short) ((20 * (var0 - var1) >> 1) + aY);
	}

	public static short method_try(int var0, int var1) {
		return (short) ((10 * (var0 + var1) >> 1) + 5);
	}

	public final boolean method_int(int var1, int var2) {
        if (var1 < field_try && var2 < U && var1 >= 0 && var2 >= 0) {
            return (a6[var1][var2] >>> 5 & 1) == 0;
        } else {
            return false;
        }
    }

	private boolean a(byte[] var1) {
        try {
            if (aX == null) {
                aX = new Image[aN.length - 1];
                aR = new String[aN.length - 1];
            }

            ByteArrayInputStream var8 = new ByteArrayInputStream(var1);
            DataInputStream var9;
            (var9 = new DataInputStream(var8)).readUTF();
            field_try = (short)var9.readInt();
            U = (short)var9.readInt();
            a6 = new byte[field_try][U];
            a2 = new short[field_try][U];
            Z = new short[0][];

            int var4;
            int var5;
            for(int var2 = 0; var2 < U; ++var2) {
                for(int var3 = 0; var3 < field_try; ++var3) {
                    a6[var3][var2] = var9.readByte();
                    if ((var4 = a6[var3][var2] >>> 4 & 1) == 0) {
                        a2[var3][var2] = (short)(var9.readShort() >>> 6);
                    } else if (var4 == 1 && (var5 = var9.readInt()) != 0) {
                        a2[var3][var2] = (short)(var5 >>> 22);
                        short[] var11;
                        (var11 = new short[4])[0] = (short)var3;
                        var11[1] = (short)var2;
                        var11[2] = (short)(var5 >> 10 & 4095);
                        var11[3] = (short)(var5 & 1023);
                        Z = c_b5.a(Z, var11);
                    }
                }
            }

            c_a5.cX = var9.readInt();
            method_for();

            short var10;
            while((var10 = var9.readShort()) != -1) {
                aR[var10 - 1] = "f-" + var10 + ".png";
            }

            for(var4 = 0; var4 < aX.length; ++var4) {
                if (aX[var4] != null && aR[var4] == null) {
                    aX[var4] = null;
                }
            }

            InputStream var12 = null;

            for(var5 = 0; var5 < aR.length; ++var5) {
                if (aR[var5] != null) {
                    var12 = (new Object()).getClass().getResourceAsStream("/pkg_npc/tiles/" + aR[var5]);
                    DataInputStream var13;
                    byte[] var7 = new byte[(var13 = new DataInputStream(var12)).available()];
                    var13.read(var7);
                    aX[var5] = c_j.method_if(var7);
                }
            }

            for(var5 = 0; var5 < aR.length; ++var5) {
                aR[var5] = null;
            }

            var9.close();
            return true;
        } catch (Exception var6) {
            var6.printStackTrace();
            return false;
        }
    }

	private final void method_for()

	{
		for (int var1 = Z.length - 1; var1 > 0; --var1) {
			for (int var2 = var1 - 1; var2 >= 0; --var2) {
				if (Z[var1][2] < Z[var2][2]) {
					short[] var3 = Z[var1];
					Z[var1] = Z[var2];
					Z[var2] = var3;
				}
			}
		}

	}

	private static void a(ac var0) {
        try {
            V = false;
            var0.method_new();
            byte var1 = k;
            byte var2 = aQ;
            k = var0.method_if();
            aQ = var0.method_if();
            System.err.println("WorldMap--cols=" + k + "---rows=" + aQ);
            Object var3 = null;
            byte[][] var8 = n;
            n = null;
            n = new byte[k][aQ];

            int var4;
            for(var4 = 0; var4 < k; ++var4) {
                for(int var5 = 0; var5 < aQ; ++var5) {
                    byte var6 = var0.method_if();
                    var6 = (byte)(255 & var6);
                    n[var4][var5] = var6;
                }
            }

            aU = b;
            b = (short)var0.method_if();
            System.err.println("regionCount=" + b);
            if (b == 0) {
                if (c_a5.es != null) {
                    c_a5.es.g9 = 131078;
                }

                k = var1;
                aQ = var2;
                n = var8;
                V = true;
                c_as.a((byte)0, "该地图尚未开放，无法查看", "确定", "", -1, -2);
            } else {
                ay = null;
                o = null;
                aG = null;
                l = null;
                f = null;
                v = null;
                X = null;
                a3 = null;
                a1 = null;
                ay = new short[b];
                o = new String[b];
                aG = new byte[b];
                l = new byte[b];
                f = new byte[b];
                v = new short[b][4];
                X = new byte[b];
                a3 = new short[b];
                a1 = new short[b];

                for(var4 = 0; var4 < b; ++var4) {
                    ay[var4] = var0.method_new();
                    o[var4] = var0.method_goto();
                    aG[var4] = var0.method_if();
                    l[var4] = var0.method_if();
                    f[var4] = var0.method_if();
                    v[var4][0] = var0.method_new();
                    v[var4][1] = var0.method_new();
                    v[var4][2] = var0.method_new();
                    v[var4][3] = var0.method_new();
                    X[var4] = 2;
                    a3[var4] = (short)(16 * aG[var4]);
                    a1[var4] = (short)(16 * l[var4]);
                }

                V = true;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }
    }

	public final void method_if(Graphics var1, int var2) {
        var1.setClip(0, c_ao.aA(), c_a5.ic, c_a5.il - c_ao.aA() - 18);
        if (var2 == 131078 || var2 == 131079) {
            Graphics var7 = var1;
            if (V) {
                var1.setColor(0);
                var1.fillRect(0, 0, c_a5.ic, c_a5.il);

                int var4;
                for(var4 = 0; var4 < n.length; ++var4) {
                    for(int var5 = 0; var5 < n[var4].length; ++var5) {
                        if (n[var4][var5] != -1) {
                            var2 = var4 << 4;
                            int var3 = var5 << 4;
                            var2 -= field_do;
                            var3 -= field_if;
                            if (var2 >= -16 && var2 <= c_a5.ic + 16 && var3 >= -16 && var3 <= c_a5.il + 16) {
                                int var6 = n[var4][var5] & 31;
                                switch((n[var4][var5] & 224) >> 5) {
                                case 0:
                                    c_b5.a(var7, ao[var6], var2, var3, 0);
                                    break;
                                case 1:
                                    c_b5.a(var7, ao[var6], var2, var3, 5);
                                    break;
                                case 2:
                                    c_b5.a(var7, ao[var6], var2, var3, 3);
                                    break;
                                case 3:
                                    c_b5.a(var7, ao[var6], var2, var3, 6);
                                    break;
                                case 4:
                                    c_b5.a(var7, ao[var6], var2, var3, 2);
                                    break;
                                case 5:
                                    c_b5.a(var7, ao[var6], var2, var3, 4);
                                    break;
                                case 6:
                                    c_b5.a(var7, ao[var6], var2, var3, 1);
                                    break;
                                case 7:
                                    c_b5.a(var7, ao[var6], var2, var3, 7);
                                }
                            }
                        }
                    }
                }

                for(var4 = 0; var4 < b; ++var4) {
                    var7.drawImage(m[f[var4]], a3[var4] - field_do, a1[var4] - field_if, 20);
                }

                if (Q != -1 && a3.length != 0) {
                    var7.drawImage(ak, a3[Q] - field_do, a1[Q] - field_if, 20);
                }

                if (a3.length != 0) {
                    var7.drawImage(c_a5.gA, a3[au] - field_do + c_a5.gA.getWidth() / 2 + 1, a1[au] - field_if + c_a5.gA.getHeight() / 2, 20);
                }
            }
        }

        var1.setClip(0, 0, c_a5.ic, c_a5.il);
    }

	public static void method_do(int var0) {
        try {
            if (var0 == 131078 || var0 == 131079) {
                short var1;
                if ((var1 = (short)(a3[au] - field_do - (c_a5.ic >> 1))) < 0) {
                    if (Math.abs(var1) < 16) {
                    	field_do = (short)(field_do - Math.abs(var1));
                    } else {
                    	field_do = (short)(field_do - 16);
                    }
                } else if (var1 > 0) {
                    if (var1 < 16) {
                    	field_do += var1;
                    } else {
                    	field_do = (short)(field_do + 16);
                    }
                }

                if ((var1 = (short)(a1[au] - field_if - (c_a5.il - c_ao.aA() - 18 >> 1))) < 0) {
                    if (Math.abs(var1) < 16) {
                    	field_if = (short)(field_if - Math.abs(var1));
                    } else {
                    	field_if = (short)(field_if - 16);
                    }
                } else if (var1 > 0) {
                    if (var1 < 16) {
                    	field_if += var1;
                    } else {
                    	field_if = (short)(field_if + 16);
                    }
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        if (var0 == 131078 || var0 == 131079) {
            if (field_do < 0) {
            	field_do = 0;
            } else if (0 < (k << 4) - c_a5.ic && field_do > (k << 4) - c_a5.ic) {
            	field_do = (short)((k << 4) - c_a5.ic);
            }

            if (field_if < -c_ao.aA()) {
            	field_if = (short)(-c_ao.aA());
                return;
            }

            if (0 < (aQ << 4) - (c_a5.il - 18) && field_if > (aQ << 4) - (c_a5.il - 18)) {
            	field_if = (short)((aQ << 4) - (c_a5.il - 18));
            }
        }

    }

	public static short a(short var0) {
        short var1 = -1;

        for(short var2 = 0; var2 < b; ++var2) {
            if (ay[var2] == var0) {
                var1 = var2;
                break;
            }
        }

        if (var1 == -1) {
            c_b5.method_case("出错了，没有找到服务器传送过来的地图ID=" + var0);
        }

        return var1;
    }

	public static byte[] a(int var0) {
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 131075:
            c_a5.fR = true;
            var1.method_do(c_l.a().method_new());
            c_b5.method_case("C_TRANSMITTAL_DK=" + c_l.a().method_new());
            break;
        case 131076:
            c_a5.fR = true;
            var1.method_do(c_bv.ks);
            var1.a(c_bv.k6);
            c_b5.method_case("GOManager-cmd-C_TRANSMITTAL_MAP=" + c_bv.ks + "---dian=" + c_bv.k6);
            break;
        case 131078:
            c_a5.fR = true;
            c_b5.method_case("C_WORLDMAPREGION=");
            break;
        case 131079:
            c_a5.fR = true;
            if (T == 1) {
                if (!F) {
                    F = true;
                    p = 32767;
                    c_b5.method_case("第一次进入右键菜单-地图-本地，");
                }

                var1.a(p);
                p = 32767;
            } else if (T == 2) {
                var1.a(p);
            }

            c_b5.method_case("请求区域地图C_REGION_INFO=" + p);
            break;
        case 131080:
        case 131081:
            var1.a(ay[au]);
            c_b5.method_case("C_SEARCH_NPCLIST=" + ay[au]);
            break;
        case 131103:
            var1.method_do(an);
            var1.method_do(al);
            var1.method_do(aj);
            var1.method_do(L);
            var1.method_do(a0);
            if (c_bu.d == 0) {
                var1.method_do(4122);
            } else if (c_bu.d == 1) {
                var1.method_do(4123);
            } else if (c_bu.d == 2) {
                var1.method_do(4124);
            }
        }

        return var1.method_long();
    }

	public static void a(int var0, ac var1) {
        int var2;
        String var3;
        boolean var4;
        int var5;
        byte var12;
        short var13;
        short var17;
        byte[] var18;
        short var23;
        switch(var0) {
        case -2147352575:
            if (c_a5.gQ != null && c_a5.gQ.y == 0) {
                c_a5.gQ = null;
            }

            c_a5.method_void();
            c_b5.method_case("Map-cmd-S_LOAD_MAP");
            c_a5.dA = 0;
            ac = 0;
            at = false;
            ax = 0;
            c_a5.method_do((byte)2);
            c_a5.method_if();
            c_a5.dA = 10;
            c_a5.dA = 20;
            bp.ag().cF = false;
            c_l.method_for();
            c_a5.dA = 30;
            c_a5.eg = 0;
            c_a5.hg = 0;
            c_a5.d6.removeAllElements();
            c_a5.ep = true;
            c_a5.fE.removeAllElements();
            c_a5.dK = -1;
            c_a5.a((c_be)null);
            c_a5.dA = 40;
            c_a5.A();
            c_a5.aj();
            bp.ag().ap = 0;
            bp.ag().method_do(var1.method_new());
            String var16 = var1.method_goto();
            var2 = var1.method_byte();
            W = null;
            W = var1.method_int(var2);
            c_a5.ir = true;
            c_z var24 = a();

            try {
                if (var24.aN == null) {
                    String var30 = "/refe.dat";
                    c_z var27 = var24;
                    boolean var6 = false;

                    try {
                        InputStream var31 = c_b5.int$3b9f0c8(var30);
                        DataInputStream var32;
                        (var32 = new DataInputStream(var31)).readByte();
                        var32.readByte();
                        short var28 = var32.readShort();
                        byte var7 = var32.readByte();
                        int var29 = var28 + 1;
                        c_b5.method_case("*****iconCount=" + var29 + "******refeCount=" + var7);
                        var27.aN = new short[var29][var7];
                        int var8 = 0;

                        while(true) {
                            if (var8 >= var29) {
                                var32.close();
                                break;
                            }

                            for(int var9 = 0; var9 < var7; ++var9) {
                                var27.aN[var8][var9] = var32.readShort();
                            }

                            ++var8;
                        }
                    } catch (Exception var10) {
                        var10.printStackTrace();
                    }
                }

                var24.a(c_b5.a$1cf9d9ca(W));
                var24.aq = field_try;
                var24.t = U;
                if (var24.aq != 0 && var24.t != 0) {
                    if (var24.aq > var24.t) {
                        var24.aL = 50;
                        var24.as = var24.aL * 1000;
                        var24.as /= var24.aq;
                        var24.field_void = var24.as >> 1;
                        var24.aa = var24.field_void * var24.t;
                        var24.aa /= 1000;
                    } else {
                        var24.aa = 25;
                        var24.field_void = var24.aa * 1000;
                        var24.field_void /= var24.t;
                        var24.as = var24.field_void << 1;
                        var24.aL = var24.as * var24.aq;
                        var24.aL /= 1000;
                    }

                    var24.aC = z - (var24.aL >> 1);
                    var24.aA = y - (var24.aa >> 1);
                }

                aY = (short)(20 * (U >> 1));
                c_a5.fR = false;
            } catch (Exception var11) {
                var11.printStackTrace();
            }

            c_a5.dA = 50;
            a().A = var16;
            c_b5.method_case("---------MapName=" + var16 + "--dl=" + var2 + "--=" + bp.ag().aa());
            c_l.method_do(bp.ag());
            var12 = var1.method_if();
            e = var1.method_if();
            c_b5.method_case("传送点小块的数量=" + var12 + "   传送点大门的数量=" + e);
            ah = new short[var12][2];
            q = new String[e];
            field_for = new byte[e];
            O = new short[e];
            N = new short[e];
            aw = new byte[e];
            a4 = new boolean[e];
            byte var20 = 0;

            for(byte var26 = 0; var20 < var12; ++var20) {
                ah[var20][0] = var1.method_new();
                ah[var20][1] = var1.method_new();
                c_b5.method_case("CarryPoint[" + var20 + "]=-Col=" + ah[var20][0] + "--Row=" + ah[var20][1]);
                if (var1.method_case()) {
                    q[var26] = var1.method_goto();
                    field_for[var26] = var1.method_if();
                    O[var26] = ah[var20][0];
                    N[var26] = ah[var20][1];
                    a4[var26] = false;
                    ++var26;
                }
            }

            var1.method_if();
            var1.method_if();
            a().af = var1.method_goto();
            System.out.println("收到地图等级：" + a().af);
            c_a5.dA = 100;
            at = true;
            return;
        case -2147352574:
            c_l.method_for();
            c_t.a(var1);
            return;
        case -2147352573:
        case -2147352572:
        case -2147352571:
        case -2147352568:
        case -2147352567:
        case -2147352566:
        case -2147352565:
        case -2147352564:
        case -2147352560:
        case -2147352559:
        case -2147352558:
        case -2147352557:
        case -2147352556:
        case -2147352555:
        case -2147352554:
        case -2147352553:
        case -2147352552:
        case -2147352551:
        case -2147352550:
        case -2147352549:
        case -2147352548:
        case -2147352547:
        case -2147352546:
        default:
            break;
        case -2147352570:
            c_a5.fR = false;
            if (c_a5.es != null && c_a5.d6.size() > 0 && T != 1) {
                c_a5.d6.removeAllElements();
            }

            c_a5.fE.removeAllElements();
            var13 = var1.method_new();
            a(var1);
            Q = au = a(var13);
            c_b5.method_case("Map-cmd-S_WORLDMAPREGION=" + var13 + "--selRegionIND=" + au);
            field_do = (short)(a3[au] - (c_a5.ic >> 1));
            field_if = (short)(a1[au] - (c_a5.il - c_ao.aA() - 18 >> 1));
            c_be var19 = new c_be((short)0, (short)0, (short)c_a5.ic, (short)c_a5.il);
            c_ao var22;
            (var22 = new c_ao((byte)0, var19)).method_do(o[au]);
            var22.method_for(true);
            var22.a(true, var19);
            var22.w();
            var19.method_if(var22);
            c_ao var25;
            (var25 = new c_ao((byte)1, var19)).method_do(new String[]{"进入", "返回"});
            var19.method_if(var25);
            var19.g9 = 131078;
            c_a5.es = var19;
            if (c_a5.V() != 4) {
                c_a5.method_try((byte)4);
                return;
            }
            break;
        case -2147352569:
            c_a5.fR = false;
            var23 = var1.method_new();
            var17 = R;
            R = var1.method_new();
            a(var1);
            if (b == 0) {
                b = aU;
                R = var17;
                return;
            }

            if (T == 2 && ai == 0) {
                c_ad.method_new();
                c_br.dm();
            } else if (ai == 1) {
                ai = 0;
            }

            if (c_a5.es != null && c_a5.d6.size() > 0 && T != 2) {
                c_a5.d6.removeAllElements();
            }

            c_a5.fE.removeAllElements();
            Q = au = a(var23);
            c_b5.method_case("区域地图-人物玩家所在的具体地图=" + var23 + "--selRegionIND=" + au + "--playerMT=" + R);
            if (Q == -1) {
                au = 0;
            }

            field_do = (short)(a3[au] - (c_a5.ic >> 1));
            field_if = (short)(a1[au] - (c_a5.il - c_ao.aA() - 18 >> 1));
            c_be var21 = new c_be((short)0, (short)0, (short)c_a5.ic, (short)c_a5.il);
            c_ao var15;
            (var15 = new c_ao((byte)0, var21)).method_do(o[au]);
            var15.method_for(true);
            var15.a(true, var21);
            var15.w();
            c_ao var14;
            (var14 = new c_ao((byte)1, var21)).method_do(new String[]{"操作", "返回"});
            var21.method_if(var15);
            var21.method_if(var14);
            var21.g9 = 131079;
            c_a5.es = var21;
            if (c_a5.V() != 4) {
                c_a5.method_try((byte)4);
                return;
            }
            break;
        case -2147352563:
            var13 = var1.method_new();
            System.out.println("MonsterImgNum" + var13);

            for(var2 = 0; var2 < var13; ++var2) {
                var3 = var1.method_new() + ".png";
                var4 = false;

                for(var5 = 0; var5 < c_t.bR.length; ++var5) {
                    if (c_t.bU[var5] != null && c_t.bU[var5].equals(var3)) {
                        if ((var17 = var1.method_new()) > 0) {
                            var18 = var1.method_int(var17);
                            c_t.bR[var5] = c_j.method_if(var18);
                        }

                        var4 = true;
                        break;
                    }
                }

                if (!var4 && (var23 = var1.method_new()) > 0) {
                    var1.method_int(var23);
                }
            }

            return;
        case -2147352562:
            var13 = var1.method_new();
            System.out.println("mapImgNum" + var13);

            for(var2 = 0; var2 < var13; ++var2) {
                var3 = "f-" + var1.method_new() + ".png";
                var4 = false;

                for(var5 = 0; var5 < aX.length; ++var5) {
                    if (aR[var5] != null && aR[var5].equals(var3)) {
                        if ((var17 = var1.method_new()) > 0) {
                            var18 = var1.method_int(var17);
                            aX[var5] = c_j.method_if(var18);
                        }

                        var4 = true;
                        break;
                    }
                }

                if (!var4 && (var23 = var1.method_new()) > 0) {
                    var1.method_int(var23);
                }
            }

            return;
        case -2147352561:
            field_case = true;
            if (!(field_int = var1.method_case())) {
                ap = new byte[var12 = var1.method_if()][2];
                a = new byte[var12][2];

                for(var0 = 0; var0 < ap.length; ++var0) {
                    for(var2 = 0; var2 < 2; ++var2) {
                        ap[var0][var2] = var1.method_if();
                    }

                    a[var0][0] = (byte)(ap[var0][0] - 4);
                    a[var0][1] = (byte)(ap[var0][1] - 5);
                }
            }

            aI = var1.method_if();
            w = var1.method_if();
            return;
        case -2147352545:
            an = var1.method_byte();
            al = var1.method_byte();
            aj = var1.method_byte();
            L = var1.method_byte();
            a0 = var1.method_byte();
            c_a5.eQ.a(131103);
            return;
        case -2147352544:
            aK = var1.method_case();
        }

    }

	public static boolean method_new()

	{
        short var0 = bp.ag().e();
        short var1 = bp.ag().method_void();

        for(int var2 = 0; var2 < ap.length; ++var2) {
            if (var0 == ap[var2][0] && var1 == ap[var2][1]) {
                return false;
            }
        }

        return true;
    }

	private void method_case(Graphics var1) {
        if (r == null) {
            r = c_b5.a("/special/gate.png");
        }

        if (aI != 1) {
            int var2;
            int var3;
            int var4;
            if (aI == 2) {
                for(var2 = 0; var2 < a.length; ++var2) {
                    var3 = method_for(a[var2][1], a[var2][0]) - aE;
                    var4 = method_try(a[var2][1], a[var2][0]) - aD;
                    c_b5.a(var1, r, var3, var4, 2);
                }

                return;
            }

            if (aI == 3 && (w == 1 || w == 2)) {
                for(var2 = 0; var2 < a.length; ++var2) {
                    var3 = method_for(a[var2][1], a[var2][0]) - aE;
                    var4 = method_try(a[var2][1], a[var2][0]) - aD;
                    c_b5.a(var1, r, var3, var4, 0);
                }
            }
        }

    }

	static {
		z = c_a5.ic - 29;
		y = c_a5.d8 ? c_a5.il - 36 - c_ad.m - 25 : c_a5.il - 36 - 25;
		field_int = true;
	}
}
