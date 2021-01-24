import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public abstract class bz extends c_a4 {
	public short[][] aR = null;
	public c_b W = null;
	byte ap = 0;
	short[][] al = null;
	short x = 0;
	short w = 0;
	short[][] aw = new short[10][4];
	byte X = 1;
	byte bo = 0;
	private static String[] au = new String[] { "未命中", "躲闪", "招架", "格挡", "吸收" };
	public byte[] aH = new byte[20];
	public static final byte[][] bj = new byte[][] { { 5, 4, 4, 2 }, { 2, 2, 2, 1 }, { 7, 6, 6, 3 }, { 7, 6, 8, 4 },
			{ 7, 6, 8, 4 }, { 7, 6, 8, 4 }, { 0, 0, 0, 0 } };
	public static final short[][] aL = new short[][] { { 369, 370, 371 }, { 25, 27, 28, 29, 30, 31, 32, 33, 34 },
			{ 46, 53, 54, 55 }, { 372 }, { 373, 377 }, { 374 }, { 369, 370, 371 },
			{ 225, 226, 227, 228, 229, 230, 231, 232, 233 }, { 46, 53, 54, 55 }, { 372 }, { 373, 377 }, { 374 } };
	public byte bq = 0;
	public boolean a4 = false;
	private byte aa = 1;
	private byte a6 = 1;
	private byte ai = 0;
	byte aq = 1;
	private byte av = 0;
	short aO;
	private byte V = 0;
	short bm = 0;
	short bi = 0;
	int a2 = 0;
	int L = 0;
	int bg = 0;
	int ad = 0;
	public byte aT;
	public boolean aB = false;
	public boolean B = false;
	public boolean Y = false;
	public boolean J = false;
	public boolean A = false;
	private boolean a8 = false;
	public byte a7;
	public short bt;
	public short ax;
	protected int[][] aA = new int[0][];
	private byte y;
	private static byte[][] bs = new byte[][] { { 5, 5 }, { 11, 9 }, { 16, 11 }, { 17, 12 }, { 18, 13 }, { 19, 13 },
			{ 20, 13 }, { 21, 12 }, { 23, 10 }, { 25, 8 }, { 29, 2 } };
	private static byte[][] af = new byte[][] { { 17, -5 }, { 0, 10 }, { 0, 11 }, { 0, 12 }, { 0, 13 }, { 0, 14 },
			{ 0, 15 }, { 0, 16 }, { 0, 21 }, { 0, 29 }, { 0, 39 } };
	private static byte aK;
	private Vector aG = new Vector();
	private static int aQ;
	public static int z;
	public static int bf;
	private byte az = 0;
	public Vector aI = new Vector();
	private byte U = 1;
	private int bd = 0;

	public bz() {
	}

	public final void method_byte(byte var1) {
		aa = var1;
	}

	public final byte o() {
		return aa;
	}

	public final void method_char(byte var1) {
		a6 = var1;
	}

	public final byte C() {
		return a6;
	}

	public final void b(byte var1) {
		ai = var1;
	}

	public final byte K() {
		return ai;
	}

	public final void method_case(byte var1) {
		aq = var1;
	}

	public final byte i() {
		return aq;
	}

	public final void method_void(byte var1) {
		av = var1;
	}

	public final byte m() {
		return av;
	}

	public final void method_if(short var1) {
		aO = var1;
	}

	public final short r() {
		return aO;
	}

	public final void method_else(byte var1) {
		V = var1;
	}

	public final void method_try(short var1, short var2) {
		bm = var1;
		bi = var2;
	}

	public final short n() {
		return bm;
	}

	public final short A() {
		return bi;
	}

	public final boolean method_case(short var1, short var2) {
		ax = var2;
		bt = var1;
		if (super.l == ax && super.q == bt) {
			aA = new int[0][];
			return false;
		} else {
			aA = (new b0()).a(super.l, super.q, ax, bt);
			return true;
		}
	}

	public final void method_byte(short var1, short var2) {
		bt = var1;
		ax = var2;
	}

	public final short F() {
		return bt;
	}

	public final short z() {
		return ax;
	}

	public final byte y() {
		return a7;
	}

	public final void method_int(int var1) {
		a2 = var1;
	}

	public final void method_for(int var1) {
		L = var1;
	}

	public final int J() {
		return a2;
	}

	public final int s() {
		return L;
	}

	public final void method_try(int var1) {
		bg = var1;
	}

	public final void method_byte(int var1) {
		ad = var1;
	}

	public final int v() {
		return bg;
	}

	public final int N() {
		return ad;
	}

	public final boolean L() {
		return a8;
	}

	public final void a(boolean var1) {
		a8 = var1;
	}

	public void method_goto(byte var1) {
	}

	public final void l() {
		bz var1 = this;

		boolean var10000;
		while (true) {
			if (var1.aA.length > 0) {
				int var2 = var1.aA[0][0] - var1.l;
				int var3 = var1.aA[0][1] - var1.q;
				if (var2 == 0 && var3 == 0) {
					var1.aA = b0.a(var1.aA, 0, -1);
					continue;
				}

				if (var2 > 0) {
					if (var3 > 0) {
						var1.method_new((byte) 1);
					} else if (var3 < 0) {
						var1.method_new((byte) 4);
					} else {
						var1.method_new((byte) 8);
					}
				} else if (var2 < 0) {
					if (var3 > 0) {
						var1.method_new((byte) 2);
					} else if (var3 < 0) {
						var1.method_new((byte) 3);
					} else {
						var1.method_new((byte) 5);
					}
				} else if (var3 > 0) {
					var1.method_new((byte) 7);
				} else if (var3 < 0) {
					var1.method_new((byte) 6);
				}

				var10000 = true;
				break;
			}

			if (var1.method_do() == 104) {
				bp.ag().ax();
			}

			var1.aA = new int[0][];
			var1.method_do((byte) 0);
			var10000 = false;
			break;
		}

		if (var10000) {
			method_long(a7);
		}

		++y;
		method_if(c_a4.method_for(super.c, super.field_void), c_a4.method_int(super.c, super.field_void));
	}

	protected final void method_long(byte var1) {
		int var2 = aT % 7;
		switch (var1) {
		case 1:
			super.field_void = (short) (super.field_void + bj[var2][1]);
			break;
		case 2:
			super.c = (short) (super.c - bj[var2][0]);
			break;
		case 3:
			super.field_void = (short) (super.field_void - bj[var2][1]);
			break;
		case 4:
			super.c = (short) (super.c + bj[var2][0]);
			break;
		case 5:
			super.c = (short) (super.c - bj[var2][2]);
			super.field_void = (short) (super.field_void - bj[var2][3]);
			break;
		case 6:
			super.c = (short) (super.c + bj[var2][2]);
			super.field_void = (short) (super.field_void - bj[var2][3]);
			break;
		case 7:
			super.c = (short) (super.c - bj[var2][2]);
			super.field_void = (short) (super.field_void + bj[var2][3]);
			break;
		case 8:
			super.c = (short) (super.c + bj[var2][2]);
			super.field_void = (short) (super.field_void + bj[var2][3]);
		}

		Y = true;
	}

	public final void u() {
		method_do((byte) 1);
	}

	public final void h() {
		method_do((byte) 0);
	}

	public abstract void method_new(byte var1);

	public abstract byte D();

	public abstract byte M();

	public abstract byte G();

	public abstract byte x();

	public void method_if(Graphics var1) {
		int var2 = c_a5.iG + bf - M();
		byte var3 = 0;
		if (ap != 0) {
			var2 = z;
			var3 = 12;
		}

		if (method_int().length() == 0) {
			if (method_new() != bp.ag().method_new()) {
				if (method_for() == 3) {
					if (av <= 0) {
						c_b5.method_if(var1, method_byte(), super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
								super.n - var2, method_do((int) av), 0);
					} else {
						c_b5.method_if(var1, method_byte(), super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
								super.n - var2, 55551, 0);
					}

					a(var1, var2);
					return;
				}

				c_b5.method_if(var1, method_byte(), super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
						super.n - var2, method_do((int) av), 0);
				return;
			}

			az = (byte) (az ^ 1);
			if (!c_z.field_case) {
				var1.setColor(1479680);
				var1.fillTriangle(super.o - 4 - 1, super.n - aQ - az - var3 + 12, super.o + 4 + 1,
						super.n - aQ - az - var3 + 12, super.o, super.n - aQ - az - var3 + 13 + 6);
			}

			if (bp.ag().aI() != 0) {
				var1.setColor(2625633);
				var1.drawRect(super.o + 3 - 13, super.n - aQ - az - var3 + 21, 21, 2);
				var1.setColor(16776960);
				if (bp.ag().aI() == 5 && az == 0) {
					var1.setColor(16711680);
				}

				var1.fillRect(super.o + 3 - 13 + 1, super.n - aQ - az - var3 + 21 + 1, bp.ag().aI() << 2, 1);
				return;
			}
		} else {
			if (method_for() == 3) {
				if (av <= 0) {
					c_b5.method_if(var1, method_byte(), super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
							super.n - var2 - c_a5.iG, method_do((int) av), 0);
					c_b5.method_if(var1, method_int(), super.o - (var1.getFont().stringWidth(method_int()) >> 1),
							super.n - var2, method_do((int) av), 0);
				} else {
					c_b5.method_if(var1, method_byte(), super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
							super.n - var2 - c_a5.iG, 55551, 0);
					c_b5.method_if(var1, method_int(), super.o - (var1.getFont().stringWidth(method_int()) >> 1),
							super.n - var2, 55551, 0);
				}

				a(var1, var2 + c_a5.iG);
				return;
			}

			if (method_new() == bp.ag().method_new()) {
				az = (byte) (az ^ 1);
				if (!c_z.field_case) {
					var1.setColor(1479680);
					var1.fillTriangle(super.o - 4 - 1, super.n - aQ - az - var3 + 12, super.o + 4 + 1,
							super.n - aQ - az - var3 + 12, super.o, super.n - aQ - az - var3 + 13 + 6);
				}

				if (bp.ag().aI() != 0) {
					var1.setColor(2625633);
					var1.drawRect(super.o + 3 - 13, super.n - aQ - az - var3 + 21, 21, 2);
					var1.setColor(16776960);
					if (bp.ag().aI() == 5 && az == 0) {
						var1.setColor(16711680);
					}

					var1.fillRect(super.o + 3 - 13 + 1, super.n - aQ - az - var3 + 21 + 1, bp.ag().aI() << 2, 1);
				}
			} else {
				c_b5.method_if(var1, method_byte(), super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
						super.n - var2 - c_a5.iG, method_do((int) av), 0);
			}

			c_b5.method_if(var1, method_int(), super.o - (var1.getFont().stringWidth(method_int()) >> 1),
					super.n - var2, method_do((int) av), 0);
		}

	}

	public static int method_do(int var0) {
		int var1 = 0;
		switch (var0) {
		case -4:
		case -3:
		case -2:
			var1 = c_bm.cf[0];
			break;
		case -1:
			var1 = c_bm.cf[1];
			break;
		case 0:
			var1 = c_bm.cf[2];
			break;
		case 1:
		case 2:
		case 3:
		case 4:
			var1 = c_bm.cf[3];
		}

		return var1;
	}

	public abstract void method_do(byte var1);

	public abstract void d();

	public final void a$11c44857(Graphics var1) {
		if (aI.size() != 0) {
			var1.setColor(16711680);

			for (int var2 = 0; var2 < aI.size(); ++var2) {
				int[] var3 = (int[]) ((int[]) aI.elementAt(var2));
				Font var4 = null;
				int var5;
				int var6 = var5 = var3[2];
				byte var7 = 0;
				byte var8 = 0;
				if (var3[1] < 0) {
					var7 = -1;
				} else if (var3[1] > 0) {
					var7 = 1;
				}

				byte var9 = (byte) Math.abs(var3[1]);
				if (var5 == 0) {
					switch (V) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						c_b5.method_if(var1, au[V - 1], super.c - (var1.getFont().stringWidth(au[V - 1]) >> 1) - c_z.aE,
								super.field_void - c_z.aD - af[var9][1] - 18, 16777215, 0);
					}
				} else {
					if (var5 < 0) {
						var6 = var5 = -var5;
					}

					int var10;
					int[] var11 = new int[var10 = (new String(var5 + "")).length()];
					--var10;

					while (var10 >= 0) {
						var11[var10] = var5 % 10 + 1;
						var5 /= 10;
						--var10;
					}

					var10 = 0;
					switch (V) {
					case 4:
					case 5:
						c_b5.method_if(var1, au[V - 1], super.c - (var1.getFont().stringWidth(au[V - 1]) >> 1) - c_z.aE,
								super.field_void - c_z.aD - af[var9][1] - 18, 16777215, 0);
						c_b5.method_case("getChanHPType()" + V);
						if (method_new() == bp.ag().method_new()) {
							var10 = 16711680;
						} else if (var3[0] == 1) {
							var10 = 16776960;
						} else {
							var10 = 16777215;
						}

						c_b5.method_if(var1, "-", super.c - c_z.aE - 6 + var7 * bs[var9][0],
								super.field_void - c_z.aD - bs[var9][1] - 18, var10, 0);
						c_b5.method_if(var1, "" + var6, super.c - c_z.aE + var7 * bs[var9][0],
								super.field_void - c_z.aD - bs[var9][1] - 18, var10, 0);
						break;
					default:
						if (V == 6) {
							if (var3[2] > 0) {
								if (var9 == 0) {
									var8 = 3;
									var10 = 65280;
								} else {
									var4 = Font.getFont(0, 0, 16);
									var1.setFont(var4);
									var8 = 7;
									var10 = 65280;
								}
							} else if (var3[2] < 0) {
								if (var9 == 0) {
									if (method_new() == bp.ag().method_new()) {
										var8 = 0;
										var10 = 16711680;
									} else if (var3[0] == 1) {
										var8 = 1;
										var10 = 16776960;
									} else {
										var8 = 2;
										var10 = 16777215;
									}
								} else {
									var4 = Font.getFont(0, 0, 16);
									var1.setFont(var4);
									if (method_new() == bp.ag().method_new()) {
										var8 = 4;
										var10 = 16711680;
									} else if (var3[0] == 1) {
										var8 = 5;
										var10 = 16776960;
									} else {
										var8 = 6;
										var10 = 16777215;
									}
								}
							}

							var1.setColor(var10);
							switch (var8) {
							case 3:
							case 7:
								c_b5.method_if(var1, "+", super.c - c_z.aE - 6 + var7 * af[var9][0],
										super.field_void - c_z.aD - af[var9][1] - 18, var10, 0);
								break;
							default:
								c_b5.method_if(var1, "-", super.c - c_z.aE - 6 + var7 * af[var9][0],
										super.field_void - c_z.aD - af[var9][1] - 18, var10, 0);
							}

							c_b5.method_if(var1, "" + var6, super.c - c_z.aE + var7 * af[var9][0],
									super.field_void - c_z.aD - af[var9][1] - 18, var10, 0);
							var1.setFont(c_a5.fq);
						} else {
							if (var3[2] > 0) {
								var8 = 3;
								var10 = 65280;
							} else if (var3[2] < 0) {
								if (method_new() == bp.ag().method_new()) {
									var8 = 0;
									var10 = 16711680;
								} else if (var3[0] == 1) {
									var8 = 1;
									var10 = 16776960;
								} else {
									var8 = 2;
									var10 = 16777215;
								}
							}

							switch (var8) {
							case 3:
								c_b5.method_if(var1, "+", super.c - c_z.aE - 6 + var7 * bs[var9][0],
										super.field_void - c_z.aD - bs[var9][1] - 18, var10, 0);
								break;
							default:
								c_b5.method_if(var1, "-", super.c - c_z.aE - 6 + var7 * bs[var9][0],
										super.field_void - c_z.aD - bs[var9][1] - 18, var10, 0);
							}

							c_b5.method_if(var1, "" + var6, super.c - c_z.aE + var7 * bs[var9][0],
									super.field_void - c_z.aD - bs[var9][1] - 18, var10, 0);
						}
					}
				}
			}

		}
	}

	public final void a(int[] var1) {
		aI.addElement(var1);
	}

	public final void I() {
		if (aI.size() != 0) {
			for (int var1 = 0; var1 < aI.size(); ++var1) {
				U = (byte) (-U);
				int[] var2;
				if ((var2 = (int[]) ((int[]) aI.elementAt(var1)))[1] >= aK - 1) {
					var2[1] = (byte) (aK - 1);
					aI.removeElementAt(var1);
				} else if (var2[1] <= -(aK - 1)) {
					var2[1] = (byte) (-(aK - 1));
					aI.removeElementAt(var1);
				} else {
					if (var2[1] == 0) {
						var2[1] = U;
					} else {
						int var10002;
						if (var2[1] < 0) {
							var10002 = var2[1]--;
						} else {
							var10002 = var2[1]++;
						}
					}

					aI.setElementAt(var2, var1);
				}
			}

		}
	}

	public static bz a(c_a4 var0, byte var1) {
		c_b var4;
		c_b var5;
		switch (var1) {
		case 0:
			switch (var0.field_try) {
			case 1:
				var4 = (c_b) var0;
				(var5 = new c_b()).field_try = var0.method_for();
				var5.h = 0;
				var5.co = var4.co;
				var5.aR = var4.aR;
				var5.aT = var4.aT;
				var5.method_do((byte) 0);
				var5.method_new((byte) 1);
				return var5;
			case 3:
				w var3 = (w) var0;
				w var2;
				(var2 = new w()).field_try = var0.method_for();
				var2.bI = var3.bI;
				var2.bH = var3.bH;
				c_b5.method_case("copyGameObject__type=" + var2.field_try);
				var2.h = 0;
				var2.bZ = 0;
				var2.bE = 0;
				var2.aT = var3.aT;
				var2.method_do((byte) 0);
				var2.method_new((byte) 1);
				return var2;
			}
		case 1:
			var4 = (c_b) var0;
			(var5 = new c_b()).field_try = 9;
			var5.field_goto = 0;
			var5.aR = var4.aR;
			var5.co = var4.co;
			var5.h = 0;
			var5.dt = var4.dt;
			var5.ap = 2;
			var5.method_do((byte) 0);
			var5.aT = var4.aT;
			var5.method_new(var4.a7);
			var5.W = null;
			return var5;
		default:
			return null;
		}
	}

	public final void p() {
		if (W == null) {
			E();
		} else {
			g();
		}
	}

	public final void a$7efcb6ee(byte var1, short[][] var2) {
		int var4;
		for (short var3 = 94; var3 < 124; ++var3) {
			var4 = aR[var3].length;

			for (byte var5 = 0; var5 < var4; ++var5) {
				for (int var6 = 0; var6 < var1; ++var6) {
					for (int var7 = 0; var7 < al[var6].length; ++var7) {
						if (aR[var3][var5] == al[var6][var7]) {
							aR[var3][var5] = var2[var6][var7];
						}
					}
				}
			}
		}

		for (int var8 = 0; var8 < var1; ++var8) {
			for (var4 = 0; var4 < var2[var8].length; ++var4) {
				al[var8][var4] = var2[var8][var4];
			}
		}

	}

	public final void k() {
		c_l.method_if(W);
		W = null;
		x = 0;
		w = 0;
		Y = false;
		X = 1;
		bo = 0;
		ap = 1;
		method_do((byte) 0);
	}

	public final void j() {
		g();
		W = (c_b) a((c_a4) this, (byte) 1);
		W.c = aw[0][0] = super.c;
		W.field_void = aw[0][1] = super.field_void;
		aw[0][2] = (short) a7;
		W.method_new((byte) aw[0][2]);
		ap = 1;
		method_do((byte) 0);
	}

	public final void E() {
		ap = 0;
		if (method_do() != 9) {
			method_do((byte) 0);
		}

		short[][] var1 = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 },
				{ 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 } };
		a$7efcb6ee((byte) 6, var1);
	}

	public final void g() {
		c_l.method_if(W);
		W = null;
		x = 0;
		w = 0;
		Y = false;

		for (int var1 = 0; var1 < aw.length; ++var1) {
			for (int var2 = 0; var2 < aw[var1].length; ++var2) {
				aw[var1][var2] = 0;
			}
		}

		X = 1;
		bo = 0;
		ap = 0;
		if (method_do() != 9) {
			method_do((byte) 0);
		}

		short[][] var3 = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 },
				{ 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 },
				{ 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 }, { 571, 572, 573 }, { 574 },
				{ 575, 576, 577 }, { 578, 579 } };
		a$7efcb6ee((byte) 13, var3);
	}

	public final boolean a(c_a4 var1, short var2, byte var3, byte var4) {
		a6 var5 = new a6(var1, var2, var3, var4);
		aG.addElement(var5);
		return true;
	}

	public final void method_new(int var1) {
		for (int var2 = 0; var2 < aG.size(); ++var2) {
			a6 var3;
			if ((var3 = (a6) aG.elementAt(var2)) != null && var3.field_byte != null
					&& var3.field_byte.method_new() == var1 && var3.a != 2) {
				aG.removeElement(var3);
				--var2;
			}
		}

	}

	public final void t() {
		bz var2 = this;
		byte var3 = 0;

		int var1;
		for (var1 = 0; var1 < var2.aG.size(); ++var1) {
			a6 var4;
			if ((var4 = (a6) var2.aG.elementAt(var1)).a == 0) {
				var2.aG.removeElementAt(var1);
				var2.aG.insertElementAt(var4, 0);
				++var3;
			} else if (var4.a == 1) {
				var2.aG.removeElementAt(var1);
				var2.aG.insertElementAt(var4, var3);
			}
		}

		for (var1 = aG.size() - 1; var1 >= 0; --var1) {
			a6 var5;
			(var5 = (a6) aG.elementAt(var1)).method_do();
			if (var5.method_if()) {
				aG.removeElement(var5);
			}
		}

	}

	public final void method_do(Graphics var1) {
		for (int var2 = 0; var2 < aG.size(); ++var2) {
			a6 var3 = (a6) aG.elementAt(var2);
			if (this instanceof bp) {
				bp.ag();
				if (bp.c(var3.field_if) && (c_a5.V() != 0 || c_a5.gQ != null)) {
					continue;
				}
			}

			var3.a(var1);
		}

	}

	private void a(Graphics var1, int var2) {
		if (this instanceof w && ((w) this).Q() != 0) {
			int var3 = c_a5.iG - c_a5.gz.a >> 1;
			switch (((w) this).Q()) {
			case 4:
				if (c_a5.ht % 6 >= 3) {
					c_a5.gz.method_if(var1, super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
							super.n - var2 + var3, 0);
					return;
				}
				break;
			case 6:
				if (c_a5.ht % 6 >= 3) {
					c_a5.gz.method_if(var1, super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
							super.n - var2 + var3, 1);
				}
			}
		}

	}

	public final void method_for(Graphics var1) {
		if (bp.ag().fK && c_a5.V() == 0 && c_a5.gQ == null) {
			int var2 = super.o - (c_a5.eP.getWidth() >> 1);
			int var3 = super.n - (c_a5.eP.getHeight() << 2);
			c_b5.a(var1, c_a5.eP, var2, var3 - bd, 0);
			++bd;
		}

		if (bd != 0 && bd > 6) {
			bd = 0;
			if (bp.ag().fK) {
				bp.ag().fK = false;
			}
		}

	}

	static {
		aK = (byte) bs.length;
		aQ = 53;
		z = 60;
		bf = 3;
	}
}
