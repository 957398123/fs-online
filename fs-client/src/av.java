import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class av {
	public static int g = -1;
	private static int D;
	private Image field_long = null;
	private static Graphics G = null;
	private byte m = 0;
	private byte field_if = 0;
	private int E = 0;
	private int v = 0;
	public static int C = 0;
	static int t = 0;
	public static int l = 0;
	public byte[][] field_else = null;
	public int[][] F = null;
	private short[][] d = null;
	private byte[][] z = null;
	private String[][] n = null;
	private boolean[][] field_char = null;
	public byte field_try = 0;
	public byte p;

	public av() {
		method_try();
	}

	private void method_try() {
		field_long = Image.createImage(c_a5.ic, 36);
		c_b5.a(G = field_long.getGraphics(), 0, 0, field_long.getWidth(), field_long.getHeight(), c_bm.cF);
		c_b5.method_if(G, 0, 0, field_long.getWidth(), field_long.getHeight(), c_bm.cD);
		c_b5.method_if(G, 1, 1, field_long.getWidth() - 2, field_long.getHeight() - 2, c_bm.cA);
		E = (field_long.getWidth() >> 1) - c_a5.ge.getWidth() - 3 - 1 - 1;
		int var1 = E / c_a5.ed.getWidth();
		int var2 = field_long.getWidth() - 3 - c_a5.ed.getWidth();

		int var3;
		for (var3 = 0; var3 < var1; ++var3) {
			c_b5.a(G, c_a5.ed, 3 + var3 * (c_a5.ed.getWidth() + 1), 3, 0);
			c_b5.a(G, c_a5.ed, var2 + 0 - var3 * (c_a5.ed.getWidth() + 1), 3, 0);
		}

		var2 = (var1 = (var3 = E / 5) * 5 + 1) - 2;
		v = c_a5.ic - 3 - var1;
		c_b5.a(G, 4, 13, var2, 2, c_bm.cH);
		c_b5.a(G, v + 1, 13, var2, 2, c_bm.cH);
		c_b5.method_if(G, 3, 12, var1, 4, c_bm.av);
		c_b5.method_if(G, v, 12, var1, 4, c_bm.av);
		D = var3 - 1;

		for (var1 = 1; var1 < 5; ++var1) {
			G.drawLine(3 + var3 * var1, 13, 3 + var3 * var1, 15);
			G.drawLine(v + var3 * var1, 13, v + var3 * var1, 15);
		}

		C = field_long.getHeight() - 3 - 16;
		t = (E + 1 - 64) / 4;
		l = field_long.getWidth() - 3 - 16;
		if (c_a5.d8) {
			for (var1 = 0; var1 < 4; ++var1) {
				c_b5.a(G, c_a5.ed, 19 + (t - c_a5.ed.getHeight() >> 1) + var1 * (t + 16), C + (16 - c_a5.ed.getWidth() >> 1),
						6);
				c_b5.a(G, c_a5.ed, l - t + (t - c_a5.ed.getHeight() >> 1) - var1 * (t + 16),
						C + (16 - c_a5.ed.getWidth() >> 1), 6);
			}
		}

		c_b5.a(G, c_a5.ge, (field_long.getWidth() >> 1) - c_a5.ge.getWidth(), 33 - c_a5.ge.getHeight() + 1, 0);
		c_b5.a(G, c_a5.ge, field_long.getWidth() >> 1, 33 - c_a5.ge.getHeight() + 1, 2);
		method_goto();
	}

	public final void a(byte var1, int var2, boolean var3) {
		for (int var4 = 0; var4 < p; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				if (field_else[var4][var5] == var1 && F[var4][var5] == var2) {
					field_char[var4][var5] = var3;
				}
			}
		}

	}

	public final void a(int var1) {
		boolean var2 = false;

		for (int var3 = 0; var3 < p; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				if (field_else[var3][var4] == 2 && F[var3][var4] == var1) {
					field_else[var3][var4] = 0;
					F[var3][var4] = -1;
					d[var3][var4] = -1;
					z[var3][var4] = -1;
					n[var3][var4] = "";
					field_char[var3][var4] = false;
					var2 = true;
				}
			}
		}

		if (var2) {
			c_a5.eQ.a(196633);
			method_goto();
		}
	}

	public final void method_goto() {
		for (byte var1 = 0; var1 < 8; ++var1) {
			if (d != null) {
				short var4 = c_r.k((short) (d[field_try][var1] % 1000));
				byte var5 = method_if(d[field_try][var1]);
				int var6;
				if (var1 < 4) {
					var6 = 3 + var1 * (t + 16);
					if (field_else[field_try][var1] > 0 && var4 >= 0) {
						c_b5.a(G, var6 + 1, C + 1, 14, 14, c_bm.O[var5][0]);
						c_a5.gg.method_if(G, var6 + 1, C + 1, var4);
						c_b5.method_if(G, var6, C, 16, 16, c_bm.O[var5][1]);
						if (field_char[field_try][var1]) {
							G.drawImage(c_a5.fT, var6 + 1, C + 1, 0);
						}
					} else {
						c_b5.a(G, var6 + 1, C + 1, 14, 14, c_bm.cH);
						c_b5.method_if(G, var6, C, 16, 16, c_bm.av);
					}

					c_a5.cG.method_if(G, var6, C, var1 + 1);
				} else {
					var6 = l - (7 - var1) * (t + 16);
					if (field_else[field_try][var1] > 0 && var4 >= 0) {
						c_b5.a(G, var6 + 1, C + 1, 14, 14, c_bm.O[var5][0]);
						c_a5.gg.method_if(G, var6 + 1, C + 1, var4);
						c_b5.method_if(G, var6, C, 16, 16, c_bm.O[var5][1]);
						if (field_char[field_try][var1]) {
							G.drawImage(c_a5.fT, var6 + 1, C + 1, 0);
						}
					} else {
						c_b5.a(G, var6 + 1, C + 1, 14, 14, c_bm.cH);
						c_b5.method_if(G, var6, C, 16, 16, c_bm.av);
					}

					c_a5.cG.method_if(G, var6, C, 8 - (7 - var1));
				}
			}
		}

	}

	public final void a(Graphics var1) {
		int var2 = c_a5.il - field_long.getHeight();
		var1.drawImage(field_long, 0, var2, 20);
		c_a5.dx.method_if(var1, 0 + (field_long.getWidth() >> 1) - c_a5.dx.field_try,
				var2 + 4 + (c_a5.e4.getHeight() >> 1) - (c_a5.dx.a >> 1), bp.ag().r() / 10);
		c_a5.dx.method_if(var1, 0 + (field_long.getWidth() >> 1), var2 + 4 + (c_a5.e4.getHeight() >> 1) - (c_a5.dx.a >> 1),
				bp.ag().r() % 10);
		if (bp.ag().ep) {
			field_if = (byte) (field_if ^ 1);
			c_b5.method_for(var1, field_long.getWidth() >> 1, c_a5.ge.getWidth() >> 1, var2 + 2, field_if + 2);
		} else {
			byte var3 = 0;
			if (bp.ag().cH) {
				var3 = 4;
			}

			if (bp.ag().aM() >= bp.ag().aD()) {
				if (m >= 31 && m <= 36) {
					field_if = (byte) (field_if ^ 1);
					++m;
				} else if (m > 36) {
					field_if = 0;
					m = 0;
				} else {
					++m;
					field_if = (byte) (m % 31 == 0 ? 1 : 0);
				}
			}

			c_b5.method_for(var1, field_long.getWidth() >> 1, c_a5.ge.getWidth() >> 1, var2 + 2, field_if + var3);
		}

		int var4;
		int var6;
		if (bp.ag().s() != 0) {
			var6 = c_a5.e4.getHeight() * bp.ag().J() / bp.ag().s();
			var4 = c_a5.e4.getHeight() - var6;
			c_b5.a(var1, c_a5.e4, 0, var4, c_a5.e4.getWidth() >> 1, var6,
					0 + (field_long.getWidth() >> 1) - c_a5.ge.getWidth() + 2,
					var2 + 36 - 3 - c_a5.ge.getHeight() + var4 + 2);
			if (bp.ag().N() != 0) {
				var6 = c_a5.e4.getHeight() * bp.ag().v() / bp.ag().N();
				var4 = c_a5.e4.getHeight() - var6;
				c_b5.a(var1, c_a5.e4, c_a5.e4.getWidth() >> 1, var4, (c_a5.e4.getWidth() >> 1) + 1, var6,
						0 + (field_long.getWidth() >> 1) + 1 - 1, var2 + 36 - 3 - c_a5.ge.getHeight() + var4 + 2);
			}

			var1.setClip(0, 0, c_a5.ic, c_a5.il);
		}

		if (bp.ag().aD() > 0L) {
			if ((var6 = (int) (bp.ag().aM() * 10L / bp.ag().aD())) > 10) {
				var6 = 10;
			}

			for (var4 = 0; var4 < var6; ++var4) {
				if (var4 < 10) {
					c_b5.a(var1, var4 < 5 ? 4 + (D + 1) * var4 : 0 + v + 1 + (D + 1) * (var4 - 5), var2 + 13, D, 2,
							c_bm.bK);
				}
			}

			if (var6 < 10) {
				var4 = (int) ((bp.ag().aM() * 10L - (long) var6 * bp.ag().aD()) * (long) D / bp.ag().aD());
				c_b5.a(var1, var6 < 5 ? 4 + (D + 1) * var6 : 0 + v + 1 + (D + 1) * (var6 - 5), var2 + 13, var4, 2,
						c_bm.bK);
			}
		}

		var2 = var2 + 12 - c_a5.ed.getHeight() - 2;
		var1 = var1;
		av var5 = this;

		for (byte var7 = 0; var7 < c_a5.fj.field_int; ++var7) {
			if (bp.ag().aH[var7] != 0) {
				if (var7 < 6) {
					c_a5.fj.method_if(var1, 3 + var7 * 10, var2, bp.ag().aH[var7] - 1);
				} else {
					c_a5.fj.method_if(var1,
							(var5.field_long.getWidth() >> 1) + 1 + c_a5.ge.getWidth() + 1 + (var7 - 6) * 10, var2,
							bp.ag().aH[var7] - 1);
				}
			}
		}

	}

	public final void method_for() {
		++field_try;
		if (field_try >= p) {
			field_try = 0;
		}

		method_goto();
	}

	public final void method_if(byte var1) {
		for (int var2 = 0; var2 < 3; ++var2) {
			c_r var3;
			(var3 = (c_r) c_a5.es.cf().elementAt(var2 + 3)).method_int((short) 6);
			var3.j((short) 8);
			int var4;
			if (var2 < var1) {
				for (var4 = 0; var4 < var3.dY(); ++var4) {
					var3.method_if(var4, (short) field_else[var2][var4]);
					if (field_else[var2][var4] > 0) {
						var3.method_if(var4, F[var2][var4]);
						var3.method_do(var4, (short) (d[var2][var4] % 1000));
						var3.method_if(var4, method_if(d[var2][var4]));
						var3.a(var4, z[var2][var4]);
						var3.method_if(var4, n[var2][var4]);
						var3.method_if(var4, field_char[var2][var4]);
						var3.mW[var4] = d[var2][var4];
					} else {
						var3.method_if(var4, -1);
						var3.method_do(var4, (short) -1);
						var3.method_if(var4, (byte) -1);
						var3.method_if(var4, "");
						var3.method_if(var4, false);
					}
				}
			} else {
				for (var4 = 0; var4 < var3.dY(); ++var4) {
					a(var3, var4);
				}
			}

			if (var2 < var1) {
				var3.mt = 8;
				var3.method_for(true);
			} else {
				var3.mt = 0;
				var3.method_for(false);
			}

			var3.dT().method_char(c_r.E(var3.ne[var3.ep()]));
		}

	}

	public static void a(byte var0) {
		for (int var1 = 0; var1 < 3; ++var1) {
			c_r var2 = (c_r) c_a5.es.cf().elementAt(var1 + 3);
			if (var1 < var0) {
				var2.mt = 8;
				var2.method_for(true);
			} else {
				var2.mt = 0;
				var2.method_for(false);
			}
		}

	}

	public final void method_else() {
		ay var1 = (ay) c_a5.es.cf().elementAt(6);
		p = (byte) (var1.bm() + 1);
		field_else = new byte[p][8];
		F = new int[p][8];
		d = new short[p][8];
		n = new String[p][8];
		z = new byte[p][8];
		field_char = new boolean[p][8];

		for (int var5 = 0; var5 < p; ++var5) {
			c_r var2 = (c_r) c_a5.es.cf().elementAt(var5 + 3);

			for (int var3 = 0; var3 < 8; ++var3) {
				field_else[var5][var3] = (byte) var2.A(var3);
				F[var5][var3] = var2.G(var3);
				d[var5][var3] = var2.mW[var3];
				n[var5][var3] = var2.z(var3);
				z[var5][var3] = var2.F(var3);
				if (var2.A(var3) == 1) {
					bp.ag();
					short var4 = bp.method_void(var2.G(var3));
					boolean[] var10000 = field_char[var5];
					bp.ag();
					var10000[var3] = bp.et[var4] > 0L;
				} else {
					field_char[var5][var3] = var2.E(var3);
				}
			}
		}

		if (field_try >= p) {
			field_try = 0;
		}

		c_a5.eQ.a(196633);
		method_goto();
	}

	public final void method_byte() {
		for (int var1 = 0; var1 < p; ++var1) {
			c_r var2 = (c_r) c_a5.es.cf().elementAt(var1 + 3);

			for (int var3 = 0; var3 < var2.dY(); ++var3) {
				a(var2, var3);
			}
		}

	}

	public static void a(c_r var0, int var1) {
		var0.method_if(var1, (short) -1);
		var0.method_if(var1, -1);
		var0.method_do(var1, (short) -1);
		var0.method_if(var1, (byte) -1);
		var0.method_if(var1, "");
	}

	public static void method_int() {
		c_a5.es.ht = 1;
		if (c_a5.fE.elementAt(1) == null) {
			b1.w(-1610612732);
			c_a5.fE.setElementAt(c_a5.es, 1);
		} else {
			(c_a5.es = (c_be)c_a5.fE.elementAt(1)).ck();
		}

		c_a5.d6.addElement(new Byte((byte) 0));
	}

	public static void a() {
		c_a5.es.ht = 2;
		if (c_a5.fE.elementAt(2) == null) {
			c_a5.fR = true;
			c_a5.dK = 2;
			c_a5.eQ.a(458761);
		} else {
			(c_a5.es = (c_be) c_a5.fE.elementAt(2)).ck();
		}

		c_a5.d6.addElement(new Byte((byte) 0));
	}

	public final void method_if() {
		p = 2;
		field_else = new byte[p][8];
		F = new int[p][8];
		d = new short[p][8];
		n = new String[p][8];
		z = new byte[p][8];
		field_char = new boolean[p][8];

		int var1;
		for (var1 = 0; var1 < p; ++var1) {
			for (int var2 = 0; var2 < 8; ++var2) {
				F[var1][var2] = -1;
			}
		}

		byte var4 = 0;
		field_else[0][0] = 1;
		F[0][0] = 0;
		d[0][0] = 1000;
		n[0][0] = "普通攻击";
		z[0][0] = 1;
		var1 = var4 + 1;

		for (short var5 = 0; var5 < bp.ag().aj(); ++var5) {
			bp.ag();
			short var3;
			if ((var3 = bp.method_void(bp.ag().fG[var5])) != -1) {
				field_else[0][var1] = 1;
				int[] var10000 = F[0];
				bp.ag();
				var10000[var1] = bp.fj[var3];
				short[] var6 = d[0];
				bp.ag();
				var6[var1] = bp.eD[var3];
				String[] var7 = n[0];
				bp.ag();
				var7[var1] = bp.eQ[var3];
				z[0][var1] = 1;
				++var1;
				if (var1 >= 8) {
					break;
				}
			}
		}

		c_a5.eQ.a(196633);
		b2.a();
		b2.field_try.method_goto();
	}

	public final void method_do() {
		char var1 = '\ufff0';

		for (int var2 = 0; var2 < p; ++var2) {
			for (int var3 = 0; var3 < 8; ++var3) {
				if (field_else[var2][var3] == 1) {
					for (short var4 = 0; var4 < bp.ag().aj(); ++var4) {
						if ((bp.ag().fG[var4] & var1) == (F[var2][var3] & var1)) {
							bp.ag();
							var4 = bp.method_void(bp.ag().fG[var4]);
							int[] var10000 = F[var2];
							bp.ag();
							var10000[var3] = bp.fj[var4];
							byte[] var5 = z[var2];
							bp.ag();
							var5[var3] = (byte) (bp.eD[var4] / 1000 - 1);
							String[] var6 = n[var2];
							bp.ag();
							var6[var3] = bp.eQ[var4];
							break;
						}
					}
				}
			}
		}

		c_a5.eQ.a(196633);
		method_goto();
	}

	public final String method_case() {
		String var1 = p + "";

		for (int var2 = 0; var2 < p; ++var2) {
			for (int var3 = 0; var3 < 8; ++var3) {
				var1 = var1 + "," + F[var2][var3];
			}
		}

		return var1;
	}

	public final void a(String var1) {
		try {
			String[] var9 = c_b5.a(var1, ',');

			try {
				p = Byte.parseByte(var9[0]);
			} catch (Exception var7) {
				method_if();
				return;
			}

			if (p <= 0) {
				method_if();
			} else {
				p = Byte.parseByte(var9[0]);
				field_else = new byte[p][8];
				F = new int[p][8];
				d = new short[p][8];
				n = new String[p][8];
				z = new byte[p][8];
				field_char = new boolean[p][8];
				if (p <= 0) {
					method_if();
				} else {
					boolean var2 = false;
					int var3 = 1;

					for (int var4 = 0; var4 < p; ++var4) {
						for (int var5 = 0; var5 < 8; ++var5) {
							F[var4][var5] = Integer.parseInt(var9[var3]);
							if (F[var4][var5] < 0) {
								field_else[var4][var5] = 0;
								d[var4][var5] = -1;
								n[var4][var5] = "";
								z[var4][var5] = -1;
							} else if (var9[var3].length() <= 5) {
								field_else[var4][var5] = 1;
								if (F[var4][var5] == 0) {
									d[var4][var5] = 1000;
									n[var4][var5] = "普通攻击";
									z[var4][var5] = 1;
								} else {
									bp.ag();
									short var6 = bp.method_void(F[var4][var5]);
									short[] var10000 = d[var4];
									bp.ag();
									var10000[var5] = bp.eD[var6];
									System.out.println(d[var4][var5]);
									String[] var10 = n[var4];
									bp.ag();
									var10[var5] = bp.eQ[var6];
									z[var4][var5] = 1;
								}
							} else {
								field_else[var4][var5] = 2;
								d[var4][var5] = -1;
								n[var4][var5] = "";
								z[var4][var5] = -1;
								var2 = true;
							}

							++var3;
						}
					}

					if (var2) {
						c_a5.eQ.a(196634);
					}

					method_goto();
				}
			}
		} catch (Exception var8) {
			method_if();
		}
	}

	public final int[] method_new() {
		int[] var1 = new int[0];

		for (int var2 = 0; var2 < p; ++var2) {
			for (int var3 = 0; var3 < 8; ++var3) {
				if (field_else[var2][var3] == 2) {
					var1 = c_b5.a(var1, var1.length, F[var2][var3]);
				}
			}
		}

		return var1;
	}

	public final void a(int var1, short var2, String var3, byte var4, int var5) {
		for (int var6 = 0; var6 < p; ++var6) {
			for (int var7 = 0; var7 < 8; ++var7) {
				if (F[var6][var7] == var1) {
					d[var6][var7] = var2;
					n[var6][var7] = var3;
					z[var6][var7] = var4;
					field_char[var6][var7] = var5 != 0;
				}
			}
		}

	}

	private static byte method_if(short var0) {
		return (byte) (var0 / 1000 - 1);
	}
}
