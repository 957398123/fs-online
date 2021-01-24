import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2020/01/22
 * @author 95739
 *
 */
public class c_b extends bz {
	byte dw = -1;
	int cK = 0;
	private short cC = -1;
	private byte[][] cW = new byte[][] { { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 },
			{ 0, 1, 10, 11, 12, 13, 14, 15, 16, 19, 20 }, { 4, 5, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 } };
	private static short[][] cY = null;
	private static byte[][] d5 = null;
	private static short[][] d8 = null;
	private static byte[][] dn = null;
	private short[][] c0 = null;
	private boolean cm = true;
	public static Image[] cw = null;
	public static byte[] dZ = null;
	public static short[] cI = null;
	public static byte[] c4 = null;
	private static byte[] df = null;
	public byte[][] co = null;
	public byte ct = 0;
	public short dt = -1;
	public byte cL = 0;
	private boolean ci = false;
	private short d7 = 0;
	private short dc = -1;
	public short dF = 0;
	public boolean cA = false;
	public boolean cF = false;
	public boolean cH = false;
	protected static c_g dJ = null;
	public boolean eb = false;
	public byte dp;
	private byte dV;
	private int cj;
	private static byte ch = 10;
	private static byte cg = 40;
	private static byte c9 = 18;
	private static byte c7 = 37;
	private static byte[][] dG = new byte[][] { { 10, 20 }, { 10, 20 }, { 10, 20 }, { 10, 22 }, { 10, 20 },
			{ 10, 20 } };
	private static int[] dl;
	private byte[][] cV = new byte[20][7];
	private byte dP = 0;
	private byte db = 1;
	private short c8;
	private short c6;

	public c_b(short var1, short var2, byte var3, byte var4, byte var5) {
		super.field_try = 1;
		this.ct = 0;
		this.dt = 0;
		super.bq = 0;
		super.aI = new Vector();
		this.method_char(var3);
		c_b5.method_case("ADD_OtherPlayer--phyle=" + var3 + "---pro=" + var4 + "--sex2=" + var5);
		this.f(var5);
		this.d(a(var3, var5));
		this.V();
		super.c = super.bm = var1;
		super.field_void = super.bi = var2;
		super.q = super.bt = c_z.method_if(var2, var1);
		super.l = super.ax = c_z.a(var2, var1);
		this.method_new((byte) 1);
		c_b5.method_case("zhan_X=" + super.c + "----zhan_Y=" + super.field_void + "zhan_col=" + super.l
				+ "----zhan_row=" + super.q);
		super.aT = 49;
		super.ap = 0;
		this.method_do((byte) 0);
	}

	protected c_b() {
	}

	public static void S() {
		InputStream var0 = c_b5.int$3b9f0c8("/m_refe00.dat");
		DataInputStream var7 = new DataInputStream(var0);

		try {
			short var1 = var7.readShort();
			c_b5.method_case("GameObject.LoadStaticTiles()=" + var1);
			cw = new Image[var1];
			dZ = new byte[var1 << 1];
			cI = new short[var1];
			c4 = new byte[var1];
			df = new byte[var1];
			String[] var2 = new String[var1];

			for (short var3 = 0; var3 < var1; ++var3) {
				cI[var3] = var7.readShort();
				c4[var3] = 0;
				short var4 = var3;

				while (--var4 >= 0) {
					if (c4[var4] != 1 && cI[var4] == cI[var3]) {
						cI[var3] = var4;
						c4[var3] = 1;
						break;
					}
				}

				if (c4[var3] == 0) {
					var2[var3] = cI[var3] + ".png";
				}

				dZ[var3 * 2] = var7.readByte();
				dZ[var3 * 2 + 1] = var7.readByte();
				int var8 = var7.readInt();
				boolean var5 = false;
				df[var3] = var8 < 1000000 ? -1 : Integer.valueOf(Integer.toString(var8).substring(1, 3)).byteValue();
			}

			cw = c_b5.a(cw, "/mimage/rolebody.pkg", var2);
			var7.close();
		} catch (IOException var6) {
			var6.printStackTrace();
		}
	}

	public static void ac() {
		try {
			c_b5.method_case("loadNPC_HUMANData");
			cY = new short[992][];
			d5 = new byte[992][];
			InputStream var0 = null;
			var0 = null;

			for (int var1 = 0; var1 < 8; ++var1) {
				var0 = c_b5.int$3b9f0c8("/pd/npc" + (var1 + 1) + ".dat");
				DataInputStream var6;
				(var6 = new DataInputStream(var0)).readShort();

				for (int var2 = var1 * 124; var2 < 124 * (var1 + 1); ++var2) {
					var6.readShort();
					byte var3 = var6.readByte();
					cY[var2] = new short[var3];
					d5[var2] = new byte[var3];

					for (byte var4 = 0; var4 < var3; ++var4) {
						cY[var2][var4] = var6.readShort();
						d5[var2][var4] = var6.readByte();
					}
				}

				var6.close();
			}

		} catch (IOException var5) {
			var5.printStackTrace();
		}
	}

	public static void T() {
		try {
			InputStream var0 = c_b5.int$3b9f0c8("/pd/npc4444.dat");
			DataInputStream var5;
			(var5 = new DataInputStream(var0)).readShort();
			d8 = new short[132][];
			dn = new byte[132][];

			for (short var1 = 0; var1 < 132; ++var1) {
				var5.readShort();
				byte var2 = var5.readByte();
				d8[var1] = new short[var2];
				dn[var1] = new byte[var2];

				for (byte var3 = 0; var3 < var2; ++var3) {
					d8[var1][var3] = var5.readShort();
					dn[var1][var3] = var5.readByte();
				}
			}

			var5.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}
	}

	public final void d(byte var1) {
		c_b5.method_case("NPCXXXX_______load_humanIMG()=" + var1);
		super.aR = new short[124][];
		this.co = new byte[124][];

		int var2;
		byte var3;
		for (var2 = 124 * (var1 - 1); var2 < var1 * 124; ++var2) {
			super.aR[var2 - 124 * (var1 - 1)] = new short[cY[var2].length];

			for (var3 = 0; var3 < cY[var2].length; ++var3) {
				super.aR[var2 - 124 * (var1 - 1)][var3] = cY[var2][var3];
			}
		}

		for (var2 = 124 * (var1 - 1); var2 < var1 * 124; ++var2) {
			this.co[var2 - 124 * (var1 - 1)] = new byte[d5[var2].length];

			for (var3 = 0; var3 < d5[var2].length; ++var3) {
				this.co[var2 - 124 * (var1 - 1)][var3] = d5[var2][var3];
			}
		}

	}

	public final void f(byte var1) {
		c_b5.method_case("load_OrgEquip=" + var1);
		int var2 = bz.aL.length / 2;
		this.c0 = new short[var2][];

		for (int var3 = var1 * var2; var3 < var2 * (var1 + 1); ++var3) {
			this.c0[var3 - var1 * var2] = new short[bz.aL[var3].length];

			for (int var4 = 0; var4 < bz.aL[var3].length; ++var4) {
				this.c0[var3 - var1 * var2][var4] = bz.aL[var3][var4];
			}
		}

	}

	public static byte a(int var0, int var1) {
		return (byte) (var0 + (var0 - 1) + var1);
	}

	public final void a(byte var1, boolean var2) {
		this.cL = var1;
		this.ci = var2;
	}

	public final short ad() {
		return (short) this.cL;
	}

	public final void method_int(short var1) {
		this.d7 = var1;
	}

	public final short Y() {
		return this.d7;
	}

	public final void method_for(short var1) {
		this.dc = var1;
	}

	public final short ab() {
		return this.dc;
	}

	public final void method_char(int var1) {
		this.cj = var1;
	}

	public final void a(byte[] var1, short[][] var2) {
		int var4;
		for (short var3 = 0; var3 < 124; ++var3) {
			var4 = super.aR[var3].length;

			for (byte var5 = 0; var5 < var4; ++var5) {
				for (int var6 = 0; var6 < var1.length; ++var6) {
					for (int var7 = 0; var7 < this.c0[Math.abs(var1[var6]) - 1].length; ++var7) {
						if (Math.abs(var1[var6]) != 1 && Math.abs(var1[var6]) != 2 && Math.abs(var1[var6]) != 3
								&& super.aR[var3][var5] == this.c0[Math.abs(var1[var6]) - 1][var7]) {
							super.aR[var3][var5] = var2[var6][var7];
							if (var1[var6] >= 0 && var1[var6] > 0) {
								byte[] var10000 = this.co[var3];
								var10000[var5] = (byte) (var10000[var5] & 239);
							}
						}
					}
				}
			}
		}

		for (int var8 = 0; var8 < var1.length; ++var8) {
			for (var4 = 0; var4 < var2[var8].length; ++var4) {
				this.c0[Math.abs(var1[var8]) - 1][var4] = var2[var8][var4];
			}
		}

	}

	public final void V() {
		int var1 = 0;
		if (super.bq == 1) {
			var1 = 29;
		} else if (super.bq > 1) {
			var1 = 29 + (super.bq - 1) * 9;
		}

		if (this.ct + var1 >= dJ.field_for.length) {
			this.ct = 0;
			c_b5.method_case("GameObject.checkState()...invalid");
		}

	}

	public void method_case() {
		if (super.field_try != 9) {
			switch (super.field_byte) {
			case 1:
				this.l();
			case 0:
			default:
				this.d();
				this.I();
			}
		}

		this.t();
		this.U();
	}

	protected final void U() {
		super.o = (short) (super.c - c_z.aE);
		super.n = (short) (super.field_void - c_z.aD + 3);
		if (super.W != null) {
			byte var2 = (byte) (super.X - 1);
			if (super.Y) {
				if (var2 < 0) {
					var2 = (byte) (super.aw.length - 1);
				}

				if (super.c != super.aw[var2][0] || super.field_void != super.aw[var2][1]) {
					super.aw[super.X][0] = super.c;
					super.aw[super.X][1] = super.field_void;
					super.aw[super.X][2] = (short) this.y();
					super.aw[super.X][3] = (short) this.method_do();
					super.X = ++super.X >= super.aw.length ? 0 : super.X;
					if (Math.abs(super.X - super.bo) == 5) {
						super.W.c = super.aw[super.bo][0];
						super.W.field_void = super.aw[super.bo][1];
						super.W.method_new((byte) super.aw[super.bo][2]);
						if (super.W.method_do() != 1) {
							super.W.method_do((byte) 1);
						}

						super.bo = ++super.bo >= super.aw.length ? 0 : super.bo;
					}
				}

				super.Y = false;
				super.W.method_if(c_a4.method_for(super.W.c, super.W.field_void),
						c_a4.method_int(super.W.c, super.W.field_void));
			} else if (super.W.method_do() != 0) {
				c_b5.method_case("cartPlayer.!=STATE_STAND=" + super.W.ct);
				super.W.method_do((byte) 0);
			}

			super.x = (short) (super.W.c - c_z.aE);
			super.w = (short) (super.W.field_void - c_z.aD + 3);
		}

		if (this.cK > 0) {
			--this.cK;
		} else {
			this.dw = -1;
		}
	}

	public final void W() {
		super.field_int = super.l;
		super.field_new = super.q;
	}

	public final void d() {
		if (super.A) {
			if (super.h == -1) {
				super.h = 0;
			}

		} else {
			short var1 = 0;
			short var2 = 0;
			if (super.bq >= 1) {
				var1 = (short) (41 + (super.bq - 1) * 9);
				var2 = 0;
			}

			if (super.bq == 0 && this.ct >= 6 && this.ct <= 8) {
				if ((short) this.cL == 4) {
					var2 = 3;
				} else {
					var2 = (short) (this.cL * 3);
				}
			}

			if (super.bq == 0 && this.ct >= 3 && this.ct <= 5 && super.a4) {
				var2 = (short) (var2 + 23);
			}

			this.dt = (short) (this.ct + var1 + var2);
			if (this.dt >= dJ.field_for.length) {
				this.dt = 0;
			}

			if (super.h < dJ.field_for[this.dt].length - 1) {
				++super.h;
			} else {
				label143: {
					switch (this.method_do()) {
					case 2:
						if ((short) this.cL == 4) {
							if (this.ci) {
								this.a((byte) 3, true);
							}
						} else {
							var2 = 0;
							if ((short) this.cL == 3 && this.ci) {
								this.a((byte) 4, true);
							}

							if (this == bp.ag()) {
								if (c_l.g.field_try == 2 || c_l.g.field_try == 1 || c_l.g.field_try == 3) {
									if (c_l.g.field_try == 2 && c_l.g.method_do() != 9) {
										this.method_do((byte) 102);
									} else if (((bz) c_l.g).m() < 0) {
										if (c_l.g.method_do() != 9) {
											this.method_do((byte) 102);
										} else {
											this.method_do((byte) 0);
										}
									} else {
										this.method_do((byte) 0);
									}
								}
							} else if (super.aA.length > 0) {
								this.method_do((byte) 1);
							} else {
								this.method_do((byte) 0);
							}
						}
					case 3:
					default:
						break label143;
					case 4:
					}

					if (c_l.a() != null && this.d7 == 0 && (c_l.a().method_for() == 4 || c_l.a().method_for() == 5
							|| c_l.a().method_for() == 6 || c_l.a().method_for() == 7 || c_l.a().method_for() == 8)) {
						if (bp.ag().eK) {
							this.method_do((byte) 3);
						} else {
							this.method_do((byte) 0);
						}
					} else {
						this.method_do((byte) 0);
					}
				}

				super.h = 0;
				if (this.ct == 24) {
					this.ct = 25;
				}

				this.dt = (short) (this.ct + var1 + var2);
			}

			if (super.W != null) {
				if (super.W.h < dJ.field_for[super.W.dt].length - 1) {
					++super.W.h;
					return;
				}

				super.W.h = 0;
				super.W.dt = (short) (super.W.ct + var1 + var2);
			}

		}
	}

	public void a(Graphics var1) {
		if (c_l.field_long || bp.ag() == this) {
			this.a(var1, super.o, super.n);
			this.method_do(var1);
		}

	}

	public final void a(Graphics var1, short var2, short var3) {
		if (!super.J) {
			if (super.W != null) {
				this.a(var1, var2, var3, false);
			} else {
				this.a(var1, var2, var3, true);
			}
		}
	}

	public final void a(Graphics var1, short var2, short var3, boolean var4) {
		short var5 = dJ.field_for[this.dt][super.h];
		int var6 = dJ.field_do[var5].length;

		for (int var9 = 0; var9 < var6; var9 += 2) {
			int var8;
			boolean var11;
			if (!var4) {
				int var10 = var9 >> 1;
				c_b var7 = this;
				var11 = false;
				if (super.W != null) {
					label122: switch (var5) {
					case 94:
					case 97:
					case 98:
					case 99:
					case 100:
						var8 = 0;

						while (true) {
							if (var8 >= var7.cW[0].length) {
								break label122;
							}

							if (var10 == var7.cW[0][var8]) {
								var11 = true;
								break label122;
							}

							++var8;
						}
					case 95:
					case 101:
					case 102:
					case 103:
					case 104:
						var8 = 0;

						while (true) {
							if (var8 >= var7.cW[1].length) {
								break label122;
							}

							if (var10 == var7.cW[1][var8]) {
								var11 = true;
								break label122;
							}

							++var8;
						}
					case 96:
					case 105:
					case 106:
					case 107:
					case 108:
						for (var8 = 0; var8 < var7.cW[2].length; ++var8) {
							if (var10 == var7.cW[2][var8]) {
								var11 = true;
								break;
							}
						}
					}
				} else {
					var11 = true;
				}

				if (var11) {
					continue;
				}
			}

			var8 = var3 + dJ.field_do[var5][var9 + 1];
			int var17;
			if (super.g) {
				var17 = var2 - dJ.field_do[var5][var9] + 2;
			} else {
				var17 = var2 + dJ.field_do[var5][var9];
			}

			try {
				boolean var18 = false;
				var11 = false;
				boolean var12 = false;
				short var19;
				byte var20;
				byte var21;
				if (super.bq == 0) {
					var19 = super.aR[var5][var9 >> 1];
					var21 = (byte) ((var20 = this.co[var5][var9 >> 1]) & 7);
				} else {
					if (var5 - 124 < 0) {
						return;
					}

					var19 = d8[var5 - 124][var9 >> 1];
					var21 = (byte) ((var20 = dn[var5 - 124][var9 >> 1]) & 7);
				}

				if ((var20 & 16) == 0) {
					Image var22 = null;
					if (c4[var19] == 0) {
						var22 = cw[var19];
					} else {
						var22 = cw[cI[var19]];
					}

					boolean var13 = false;
					boolean var14 = false;
					int var23;
					int var24;
					switch (var21) {
					case 0:
						var24 = var8 - dZ[var19 * 2 + 1];
						if (super.g) {
							var23 = var17 - (var22.getWidth() - dZ[var19 * 2]);
							c_b5.a(var1, var22, var23, var24, 2);
						} else {
							var23 = var17 - dZ[var19 * 2];
							c_b5.a(var1, var22, var23, var24, 0);
						}
						break;
					case 1:
						var24 = var8 - dZ[var19 * 2];
						if (super.g) {
							var23 = var17 - dZ[var19 * 2 + 1] - 1;
							c_b5.a(var1, var22, var23, var24, 4);
						} else {
							var23 = var17 - (var22.getHeight() - dZ[var19 * 2 + 1]) + 1;
							c_b5.a(var1, var22, var23, var24, 5);
						}
						break;
					case 2:
						var24 = var8 - (var22.getHeight() - dZ[var19 * 2 + 1]) + 1;
						if (super.g) {
							var23 = var17 - dZ[var19 * 2] - 1;
							c_b5.a(var1, var22, var23, var24, 1);
						} else {
							var23 = var17 - (var22.getWidth() - dZ[var19 * 2]) + 1;
							c_b5.a(var1, var22, var23, var24, 3);
						}
						break;
					case 3:
						var24 = var8 - (var22.getWidth() - dZ[var19 * 2]) + 1;
						if (super.g) {
							var23 = var17 - (var22.getHeight() - dZ[var19 * 2 + 1]);
							c_b5.a(var1, var22, var23, var24, 7);
						} else {
							var23 = var17 - dZ[var19 * 2 + 1];
							c_b5.a(var1, var22, var23, var24, 6);
						}
						break;
					case 4:
						var24 = var8 - dZ[var19 * 2 + 1];
						if (super.g) {
							var23 = var17 - dZ[var19 * 2] - 1;
							c_b5.a(var1, var22, var23, var24, 0);
						} else {
							var23 = var17 - (var22.getWidth() - dZ[var19 * 2]) + 1;
							c_b5.a(var1, var22, var23, var24, 2);
						}
						break;
					case 5:
						var24 = var8 - dZ[var19 * 2];
						if (super.g) {
							var23 = var17 - (var22.getHeight() - dZ[var19 * 2 + 1]);
							c_b5.a(var1, var22, var23, var24, 5);
						} else {
							var23 = var17 - dZ[var19 * 2 + 1];
							c_b5.a(var1, var22, var23, var24, 4);
						}
						break;
					case 6:
						var24 = var8 - (var22.getHeight() - dZ[var19 * 2 + 1]) + 1;
						if (super.g) {
							var23 = var17 - (var22.getWidth() - dZ[var19 * 2]);
							c_b5.a(var1, var22, var23, var24, 3);
						} else {
							var23 = var17 - dZ[var19 * 2];
							c_b5.a(var1, var22, var23, var24, 1);
						}
						break;
					case 7:
						var24 = var8 - (var22.getWidth() - dZ[var19 * 2]) + 1;
						if (super.g) {
							var23 = var17 - dZ[var19 * 2 + 1] - 1;
							c_b5.a(var1, var22, var23, var24, 6);
						} else {
							var23 = var17 - (var22.getHeight() - dZ[var19 * 2 + 1]) + 1;
							c_b5.a(var1, var22, var23, var24, 7);
						}
					}
				}
			} catch (NullPointerException var15) {
				c_b5.method_case("NullPointerGameObject.DrawHORSE()..." + var5 + "..." + (var9 >> 1));
				var15.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException var16) {
				c_b5.method_case("ArrayGameObject.DrawHORSE()..." + var5 + "..." + (var9 >> 1));
				var16.printStackTrace();
			}
		}

	}

	public final void method_if(Graphics var1) {
		if (c_l.field_long) {
			int var2 = c_a5.iG + bz.bf - this.M();
			if (super.ap != 0) {
				var2 = bz.z;
			}

			if (this.m() == -4) {
				if (this.method_int().length() == 0) {
					c_b5.method_if(var1, this.method_byte(),
							super.o - (var1.getFont().stringWidth(this.method_byte()) >> 1), super.n - var2, 16711680,
							0);
				} else {
					c_b5.method_if(var1, this.method_byte(),
							super.o - (var1.getFont().stringWidth(this.method_byte()) >> 1), super.n - var2 - c_a5.iG,
							16711680, 0);
					c_b5.method_if(var1, this.method_int(),
							super.o - (var1.getFont().stringWidth(this.method_int()) >> 1), super.n - var2, 16711680,
							0);
				}
			} else if (bp.ag() != this && !this.cH) {
				if (this.method_int().length() == 0) {
					c_b5.method_if(var1, this.method_byte(),
							super.o - (var1.getFont().stringWidth(this.method_byte()) >> 1), super.n - var2, 16765952,
							0);
				} else {
					c_b5.method_if(var1, this.method_byte(),
							super.o - (var1.getFont().stringWidth(this.method_byte()) >> 1), super.n - var2 - c_a5.iG,
							16765952, 0);
					c_b5.method_if(var1, this.method_int(),
							super.o - (var1.getFont().stringWidth(this.method_int()) >> 1), super.n - var2, 16765952,
							0);
				}
			} else {
				super.method_if(var1);
			}
		} else if ((bp.ag() == this || this.cH) && bp.ag().aI() != 0) {
			super.method_if(var1);
		}

		if (this.dw >= 0) {
			var1.setColor(0);
			var1.drawLine(super.o + ch, super.n - cg + 18, super.o + ch + 7, super.n - cg + 18);
			var1.drawLine(super.o + ch, super.n - cg + 18, super.o + ch + 4, super.n - cg + 13);
			var1.drawRoundRect(super.o + ch + 4, super.n - cg, 24, 18, 15, 15);
			var1.setColor(16777215);
			var1.fillRoundRect(super.o + ch + 5, super.n - cg + 1, 23, 17, 16, 16);
			c_a5.cJ.method_if(var1, super.o + c9 + 2, super.n - c7 + (this.cK % 4 > 1 ? 0 : -1) + 1, this.dw);
		}

		if (c_z.field_case && this.eb) {
			if (this.method_new() == bp.ag().method_new()) {
				if (this.dp == 1) {
					c_a5.cO.method_if(var1, super.o - 7,
							super.n - (c_a5.iG + bz.bf - this.M()) + (this.method_int().length() == 0 ? 5 : -10),
							this.dV);
				} else {
					c_a5.fQ.method_if(var1, super.o - 7,
							super.n - (c_a5.iG + bz.bf - this.M()) + (this.method_int().length() == 0 ? 5 : -10),
							this.dV);
				}
			} else if (this.dp == 1) {
				c_a5.cO.method_if(var1, super.o - 7,
						super.n - (c_a5.iG + bz.bf - this.M()) + (this.method_int().length() == 0 ? -10 : -20),
						this.dV);
			} else {
				c_a5.fQ.method_if(var1, super.o - 7,
						super.n - (c_a5.iG + bz.bf - this.M()) + (this.method_int().length() == 0 ? -10 : -20),
						this.dV);
			}

			++this.dV;
			if (this.dV > 3) {
				this.dV = 0;
			}
		}

		this.db = (byte) (this.db ^ 1);
		if (this.cj > 0) {
			this.c6 = (short) (super.n - 25 + this.db);
			if (this.y() != 1 && this.y() != 7 && this.y() != 8) {
				if (this.y() != 3 && this.y() != 5 && this.y() != 6) {
					if (this.y() == 2) {
						this.c8 = (short) (super.o + 12);
					} else if (this.y() == 4) {
						this.c8 = (short) (super.o - 18);
					}
				} else {
					this.c8 = (short) (super.o - 20);
				}
			} else {
				this.c8 = (short) (super.o + 13);
			}

			short var3 = this.c6;
			short var5 = this.c8;
			var1.drawImage(c_a5.fh, var5, var3, 20);
		}

		this.method_for(var1);
	}

	public final void e$132be7() {
		for (byte var1 = this.dP; var1 < this.cV.length; ++var1) {
			this.dP = var1;
			byte var2 = (byte) c_b5.method_new(2);
			this.cV[var1][0] = var2;
			if (var2 == 0) {
				this.cV[var1][0] = -1;
			}

			var2 = (byte) c_b5.method_new(2);
			this.cV[var1][1] = var2;
			if (var2 == 0) {
				this.cV[var1][1] = -1;
			}

			this.cV[var1][4] = (byte) (c_b5.method_new(3) + 1);
			this.cV[var1][5] = 0;
			this.cV[var1][6] = (byte) c_b5.method_new(dl.length);
			if (this.dP % 2 == 1) {
				if (this.dP == (byte) (this.cV.length - 1)) {
					this.dP = 0;
					return;
				}
				break;
			}
		}

	}

	private void a(byte var1) {
		label127: switch (var1) {
		case 0:
		case 101:
		case 105:
			switch (super.ap) {
			case 0:
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 0;
					super.g = false;
					break label127;
				case 2:
				case 7:
					this.ct = 1;
					super.g = false;
					break label127;
				case 3:
				case 5:
					this.ct = 2;
					super.g = false;
					break label127;
				case 4:
				case 6:
					this.ct = 1;
					super.g = true;
				default:
					break label127;
				}
			case 1:
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 29;
					super.g = false;
					break label127;
				case 2:
				case 7:
					this.ct = 30;
					super.g = false;
					break label127;
				case 3:
				case 5:
					this.ct = 31;
					super.g = false;
					break label127;
				case 4:
				case 6:
					this.ct = 30;
					super.g = true;
				default:
					break label127;
				}
			case 2:
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 35;
					super.g = false;
					break label127;
				case 2:
				case 7:
					this.ct = 36;
					super.g = false;
					break label127;
				case 3:
				case 5:
					this.ct = 37;
					super.g = false;
					break label127;
				case 4:
				case 6:
					this.ct = 36;
					super.g = true;
				}
			default:
				break label127;
			}
		case 1:
		case 10:
		case 100:
		case 102:
		case 103:
		case 104:
			switch (super.ap) {
			case 0:
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 3;
					super.g = false;
					break label127;
				case 2:
				case 7:
					this.ct = 4;
					super.g = false;
					break label127;
				case 3:
				case 5:
					this.ct = 5;
					super.g = false;
					break label127;
				case 4:
				case 6:
					this.ct = 4;
					super.g = true;
				default:
					break label127;
				}
			case 1:
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 32;
					super.g = false;
					break label127;
				case 2:
				case 7:
					this.ct = 33;
					super.g = false;
					break label127;
				case 3:
				case 5:
					this.ct = 34;
					super.g = false;
					break label127;
				case 4:
				case 6:
					this.ct = 33;
					super.g = true;
				default:
					break label127;
				}
			case 2:
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 38;
					super.g = false;
					break label127;
				case 2:
				case 7:
					this.ct = 39;
					super.g = false;
					break label127;
				case 3:
				case 5:
					this.ct = 40;
					super.g = false;
					break label127;
				case 4:
				case 6:
					this.ct = 39;
					super.g = true;
				}
			default:
				break label127;
			}
		case 2:
			if (!this.cm) {
				this.cm = true;
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 6;
					super.g = false;
					break;
				case 2:
				case 7:
					this.ct = 7;
					super.g = false;
					break;
				case 3:
				case 5:
					this.ct = 8;
					super.g = false;
					break;
				case 4:
				case 6:
					this.ct = 7;
					super.g = true;
				}
			}
			break;
		case 3:
			if (super.bq == 0) {
				this.dF = 0;
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 18;
					super.g = false;
					break;
				case 2:
				case 7:
					this.ct = 19;
					super.g = false;
					break;
				case 3:
				case 5:
					this.ct = 20;
					super.g = false;
					break;
				case 4:
				case 6:
					this.ct = 19;
					super.g = true;
				}
			}
			break;
		case 4:
			if (super.bq == 0) {
				switch (this.y()) {
				case 1:
				case 8:
					this.ct = 21;
					super.g = false;
					break;
				case 2:
				case 7:
					this.ct = 22;
					super.g = false;
					break;
				case 3:
				case 5:
					this.ct = 23;
					super.g = false;
					break;
				case 4:
				case 6:
					this.ct = 22;
					super.g = true;
				}
			}
			break;
		case 9:
			this.ct = 24;
		}

		short var3 = 0;
		short var2 = 0;
		if (super.bq >= 1) {
			var3 = (short) (41 + (super.bq - 1) * 9);
			var2 = 0;
		}

		if (super.bq == 0 && this.ct >= 6 && this.ct <= 8) {
			if ((short) this.cL == 4) {
				var2 = 3;
			} else {
				var2 = (short) (this.cL * 3);
			}
		}

		if (super.bq == 0 && this.ct >= 3 && this.ct <= 5 && super.a4) {
			var2 = (short) (var2 + 23);
		}

		this.dt = (short) (this.ct + var3 + var2);
	}

	public final void method_do(byte var1) {
		this.cm = false;
		super.field_byte = var1;
		super.h = 0;
		this.a(super.field_byte);
	}

	public final void method_new(byte var1) {
		if (super.a7 != var1) {
			super.a7 = var1;
			this.a(super.field_byte);
		}

	}

	public final short aa() {
		return this.cC;
	}

	public final void method_do(short var1) {
		this.cC = var1;
	}

	public final byte D() {
		return c_g.a[dJ.field_if][0];
	}

	public final byte M() {
		return c_g.a[dJ.field_if][1];
	}

	public final byte G() {
		return c_g.a[dJ.field_if][2];
	}

	public final byte x() {
		return c_g.a[dJ.field_if][3];
	}

	static {
		byte[][] var10000 = new byte[][] { { 1, 1 }, { 3, 3 }, { 6, 6 }, { 7, 8 }, { 8, 6 }, { 9, 8 } };
		dl = new int[] { 16446976, 16523786, 1506314 };
	}
}
