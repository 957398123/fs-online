import javax.microedition.lcdui.Graphics;

/**
 * 2020/01/20
 * 
 * @author 95739
 *
 */
public final class c_r extends ba {
	private byte nc;
	private ah mA;
	private af na;
	private short mO;
	private short ms;
	private short nx;
	public short mt;
	public int[] mQ;
	public short[] mW;
	public short[] mI;
	public byte[] nu;
	public String[] mV;
	public byte[] ne;
	public short[] mM;
	public boolean[] m5;
	public boolean[] nq;
	public byte[] nD;
	public int[] mN;
	public boolean[] nv;
	public byte[] nm;
	public byte[] mu;
	public byte[] mo;
	public byte[] mx;
	public boolean[] m4;
	public boolean[] mZ;
	public boolean[] mS;
	public static int m3 = 0;
	public static byte mv = -1;
	public byte mz;
	public static byte mp;
	private byte nb;
	private byte nA;
	private short nz;
	private boolean mw;
	private static byte m0 = 0;
	public static int mg = 0;
	private byte ng;
	public int[] mF;
	public static boolean nf = false;
	private int me;
	private int mc;
	private int mT;
	public static int m8 = -1;
	public static int ny = 0;
	public static byte nj = 0;
	public static byte[] mG = new byte[] { -1, -1, -1, -1, -1, -1 };
	public static short[][] mE = new short[][] { { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 },
			{ -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 } };
	public static byte[] md = new byte[] { 1, 1, 1, 1, 1, 1 };
	public static short[] mY = new short[] { -1, -1, -1, -1 };
	public static String m2 = "";
	private static short[] mj = new short[] { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10,
			10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 33, 33,
			25, 26, 27, 28, 28, 29, 30, 30, 31, 32, 33, 34, 35, 37, 36, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
			48, 49, 50, 51, 52, 53 };

	public static byte dS() {
		return m0;
	}

	private void I(byte var1) {
		m0 = var1;
		c_b5.method_case("背包里第 " + this.mz + " 格 = " + m0);
	}

	public final void F(byte var1) {
		this.nc = var1;
	}

	public final byte el() {
		return this.ng;
	}

	public final void J(byte var1) {
		this.ng = var1;
	}

	private c_r(short var1, short var2, short var3, short var4, String var5, short var6, short var7, short var8,
			byte var9, c_be var10) {
		super(var1, var2, (short) 0, (short) 0, var10);
		this.nc = 0;
		this.nx = 8;
		this.mt = 16;
		this.mQ = null;
		this.mW = null;
		this.mI = null;
		this.nu = null;
		this.mV = null;
		this.ne = null;
		this.mM = null;
		this.m5 = null;
		this.nq = null;
		this.nD = null;
		this.mN = null;
		this.nv = null;
		this.nm = null;
		this.mu = null;
		this.mo = null;
		this.mx = null;
		this.m4 = null;
		this.mZ = null;
		this.mS = null;
		this.nb = -1;
		this.nA = -1;
		this.nz = 0;
		this.mw = true;
		this.ng = 0;
		this.mF = new int[] { -1, -1 };
		this.me = 0;
		this.mc = 0;
		this.mT = 0;
		this.nc = var9;
		super.k = (short) (c_a5.ic - (18 * c_a5.ic / 176 * var8 + c_a5.ca.getWidth()) >> 1);
		super.b = true;
		this.mQ = new int[this.mt];
		this.mW = new short[this.mt];
		this.mI = new short[this.mt];
		this.nu = new byte[this.mt];
		this.mV = new String[this.mt];
		this.ne = new byte[this.mt];
		this.mM = new short[this.mt];
		this.m5 = new boolean[this.mt];
		this.nq = new boolean[this.mt];
		this.nD = new byte[this.mt];
		this.mN = new int[this.mt];
		this.nv = new boolean[this.mt];
		this.nm = new byte[this.mt];
		this.mu = new byte[this.mt];
		this.mo = new byte[this.mt];
		this.mx = new byte[this.mt];
		this.m4 = new boolean[this.mt];
		this.mZ = new boolean[this.mt];
		this.mS = new boolean[this.mt];

		for (int var11 = 0; var11 < this.mt; ++var11) {
			this.mQ[var11] = this.mI[var11] = -1;
		}

		this.ms = var6;
		this.mO = var7;
		this.nx = var8;
		if (var1 < 0) {
			var1 = 8;
		}

		super.a = (short) (this.d2() * c_a5.ic / 176);
		super.field_int = (short) ((this.mw ? (short) (ah.ad() + 2 + 18 * this.ms) : (short) (2 + 18 * this.ms)) * c_a5.il
				/ 208);
		var3 = (short) (this.d2() - 6);
		var4 = (short) ah.ad();
		var1 = (short) (var1 + 3);
		this.mA = new ah(var1, var2, var3, var4, (byte) 1, var5, var10);
		this.mA.a(false);
		this.method_do(var10);
	}

	private void method_do(c_be var1) {
		if (this.ms > 2) {
			if (!this.mw) {
				this.na = new af((short) (super.k + 18 * c_a5.ic / 176 * this.nx), (short) (super.j + 2), (short) 0,
						(short) (18 * c_a5.il / 208 * this.ms - 2 * c_a5.il / 208), (byte) 0, false, var1);
				return;
			}

			this.na = new af((short) (super.k + 18 * c_a5.ic / 176 * this.nx), (short) (super.j + ah.ad() + 2), (short) 0,
					(short) (18 * c_a5.il / 208 * this.ms - 2 * c_a5.il / 208), (byte) 0, false, var1);
		} else {
			this.na = null;
		}

	}

	public c_r(short var1, short var2, String var3, short var4, short var5, short var6, byte var7, c_be var8) {
		this(var1, var2, (short) 0, (short) 0, var3, var4, var5, var6, (byte) 0, var8);
	}

	public final void a(Graphics var1) {
		int var2;
		if (this.mV.length > 0) {
			var2 = this.mz / this.nx;
			this.mz = (byte) (var2 * this.nx + super.field_new.hD);
			if (this.q()) {
				this.d(this.mV[this.mz]);
			} else {
				this.d("");
			}
		}

		if (this.mw) {
			this.mT = super.j + ah.ad() + 2;
		} else {
			this.mT = super.j + 2;
		}

		var2 = this.mt % this.nx == 0 ? this.mt / this.nx : this.mt / this.nx + 1;
		if ((var2 = this.nz + this.ms > var2 ? var2 : this.nz + this.ms) < this.ms) {
			var2 = this.ms;
		}

		int var3 = 18 * c_a5.ic / 176;
		int var4 = 18 * c_a5.il / 208;
		boolean var5 = this.ms <= 2;

		for (int var6 = this.nz; var6 < var2; ++var6) {
			for (int var7 = 0; var7 < this.nx; ++var7) {
				if (var6 * this.nx + var7 + 1 <= this.mt) {
					a7.method_if(var1, super.k + (var5 ? 5 : 0) + var7 * var3, this.mT + (var6 - this.nz) * var4, 14,
							14);
					if (this.mI != null && this.mI[var6 * this.nx + var7] != -1) {
						var1.setColor(c_bm.O[this.mo[var6 * this.nx + var7]][0]);
						var1.fillRect(super.k + (var5 ? 5 : 0) + var7 * var3, this.mT + (var6 - this.nz) * var4, 16,
								16);
						c_a5.gg.method_if(var1, super.k + (var5 ? 5 : 0) + var7 * var3 + 1,
								this.mT + (var6 - this.nz) * var4 + 1, this.mI[var6 * this.nx + var7]);
						var1.setColor(c_bm.O[this.mo[var6 * this.nx + var7]][1]);
						var1.drawRect(super.k + (var5 ? 5 : 0) + var7 * var3, this.mT + (var6 - this.nz) * var4, 15,
								15);
						if (this.nu != null && this.nu[var6 * this.nx + var7] != -1 && this.nv[var6 * this.nx + var7]) {
							a7.a(var1, super.k + (var5 ? 5 : 0) + var7 * var3, this.mT + (var6 - this.nz) * var4,
									this.nu[var6 * this.nx + var7]);
						}

						if (this.m4[var6 * this.nx + var7]) {
							var1.drawImage(c_a5.fT, super.k + (var5 ? 5 : 0) + var7 * var3 + 1,
									this.mT + (var6 - this.nz) * var4 + 1, 20);
						}
					}

					if (this.mZ[var6 * this.nx + var7]) {
						var1.drawImage(c_a5.fz, super.k + (var5 ? 5 : 0) + var7 * var3, this.mT + (var6 - this.nz) * var4,
								20);
					}

					if (c_a5.es.g9 == -1610612734) {
						c_a5.cG.method_if(var1, super.k + (var5 ? 5 : 0) + var7 * var3, this.mT + (var6 - this.nz) * var4,
								var7 + 1);
					}
				} else {
					var1.drawImage(c_a5.e3, super.k + (var5 ? 5 : 0) + var7 * var3, this.mT + (var6 - this.nz) * var4,
							20);
				}

				if (this.mF[0] != -1 && this.mF[0] / this.nx >= this.nz && this.mF[0] / this.nx - this.nz < this.ms) {
					c_b5.method_int(var1, super.k + (var5 ? 5 : 0) + this.mF[0] % this.nx * var3,
							this.mT + (this.mF[0] / this.nx - this.nz) * var4, 16, 16);
				}

				int var8;
				int var9;
				label180: switch (c_a5.es.g9) {
				case 458760:
				case 2555911:
					if (this.nb != -1 && this.nA != -1 && var6 * this.nx + var7 >= this.nb
							&& var6 * this.nx + var7 < this.nA) {
						c_b5.method_int(var1, super.k + var7 * var3, this.mT + (var6 - this.nz) * var4, 16, 16);
					}
					break;
				case 1376263:
					var8 = 0;
					var9 = mG.length;

					while (true) {
						if (var8 >= var9) {
							break label180;
						}

						if (mG[var8] != -1) {
							c_b5.method_int(var1, super.k + mG[var8] % this.nx * var3,
									this.mT + (mG[var8] / this.nx - this.nz) * var4, 16, 16);
						}

						++var8;
					}
				case 1703946:
					var8 = 0;

					for (var9 = mE.length; var8 < var9; ++var8) {
						if (mE[var8][0] != -1) {
							c_b5.method_int(var1, super.k + mE[var8][0] % this.nx * var3,
									this.mT + (mE[var8][0] / this.nx - this.nz) * var4, 16, 16);
						}
					}
				}

				if (var6 * this.nx + var7 == this.mz) {
					if (this.mA != null && this.mw) {
						this.mA.a(var1);
					}

					this.me = var6;
					this.mc = var7;
				}
			}
		}

		if (this.na != null) {
			this.na.a(var1);
		}

	}

	public final void p(Graphics var1) {
		if (this.me * this.nx + this.mc == this.mz) {
			c_b5.a(var1, super.k + this.mc * 18 * c_a5.ic / 176 + 10,
					this.mT + (this.me - this.nz) * 18 * c_a5.il / 208 + 12);
		}

	}

	public final ah dT() {
		return this.mA;
	}

	public final short dY() {
		return this.mt;
	}

	public final void l(short var1) {
		if (var1 > this.mt) {
			this.mt = var1;
			int[] var2 = this.mQ;
			short[] var3 = this.mI;
			byte[] var4 = this.nu;
			String[] var5 = this.mV;
			byte[] var6 = this.ne;
			short[] var7 = this.mM;
			boolean[] var8 = this.m5;
			boolean[] var9 = this.nq;
			byte[] var10 = this.nD;
			int[] var11 = this.mN;
			boolean[] var12 = this.nv;
			byte[] var13 = this.nm;
			byte[] var14 = this.mu;
			byte[] var15 = this.mo;
			byte[] var16 = this.mx;
			boolean[] var17 = this.m4;
			boolean[] var18 = this.mS;
			boolean[] var19 = this.mZ;
			this.mQ = new int[var1];
			this.mW = new short[var1];
			this.mI = new short[var1];
			this.nu = new byte[var1];
			this.mV = new String[var1];
			this.ne = new byte[var1];
			this.mM = new short[var1];
			this.m5 = new boolean[var1];
			this.nq = new boolean[var1];
			this.nD = new byte[var1];
			this.mN = new int[var1];
			this.nv = new boolean[var1];
			this.nm = new byte[var1];
			this.mu = new byte[var1];
			this.mo = new byte[var1];
			this.mx = new byte[var1];
			this.m4 = new boolean[var1];
			this.mS = new boolean[var1];
			this.mZ = new boolean[var1];
			System.arraycopy(var2, 0, this.mQ, 0, var2.length);
			System.arraycopy(var3, 0, this.mI, 0, var3.length);
			System.arraycopy(var4, 0, this.nu, 0, var4.length);
			System.arraycopy(var5, 0, this.mV, 0, var5.length);
			System.arraycopy(var6, 0, this.ne, 0, var6.length);
			System.arraycopy(var7, 0, this.mM, 0, var7.length);
			System.arraycopy(var8, 0, this.m5, 0, var8.length);
			System.arraycopy(var9, 0, this.nq, 0, var9.length);
			System.arraycopy(var10, 0, this.nD, 0, var10.length);
			System.arraycopy(var11, 0, this.mN, 0, var11.length);
			System.arraycopy(var12, 0, this.nv, 0, var12.length);
			System.arraycopy(var13, 0, this.nm, 0, var13.length);
			System.arraycopy(var14, 0, this.mu, 0, var14.length);
			System.arraycopy(var15, 0, this.mo, 0, var15.length);
			System.arraycopy(var16, 0, this.mx, 0, var16.length);
			System.arraycopy(var17, 0, this.m4, 0, var17.length);
			System.arraycopy(var18, 0, this.mS, 0, var18.length);
			System.arraycopy(var19, 0, this.mZ, 0, var19.length);
		}

	}

	public final void j(short var1) {
		this.mt = var1;
		this.mQ = new int[var1];
		this.mW = new short[var1];
		this.mI = new short[var1];
		this.nu = new byte[var1];
		this.mV = new String[var1];
		this.ne = new byte[var1];
		this.mM = new short[var1];
		this.m5 = new boolean[var1];
		this.nq = new boolean[var1];
		this.nD = new byte[var1];
		this.mN = new int[var1];
		this.nv = new boolean[var1];
		this.nm = new byte[var1];
		this.mu = new byte[var1];
		this.mo = new byte[var1];
		this.mx = new byte[var1];
		this.m4 = new boolean[var1];
		this.mS = new boolean[var1];
		this.mZ = new boolean[var1];
	}

	public final void method_do(int var1, short var2) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			this.mI[var1] = k(var2);
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final void a(int var1, byte var2) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			this.ne[var1] = var2;
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final byte F(int var1) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			return this.ne[var1];
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final void method_if(int var1, int var2) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			this.mQ[var1] = var2;
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final int G(int var1) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			return this.mQ[var1];
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final void method_if(int var1, short var2) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			this.mM[var1] = var2;
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final boolean E(int var1) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			return this.m4[var1];
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final void method_if(int var1, boolean var2) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			this.m4[var1] = var2;
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final short A(int var1) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			return this.mM[var1];
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final void method_if(int var1, String var2) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			this.mV[var1] = var2;
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final String z(int var1) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			return this.mV[var1];
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	public final void method_if(int var1, byte var2) {
		if (var1 >= 0 && var1 <= this.mt - 1) {
			this.mo[var1] = var2;
		} else {
			throw new IndexOutOfBoundsException("设定值超出范围！");
		}
	}

	private short d2() {
		return (short) (18 * this.nx + c_a5.ca.getWidth());
	}

	public final void method_if(String var1, int var2) {
		if (this.mA != null) {
			this.mA.method_char(var2);
			this.mA.a(var1);
		}

	}

	private void d(String var1) {
		if (this.mA != null) {
			this.mA.a(var1);
		}

	}

	public final short ep() {
		return (short) this.mz;
	}

	public final void K(byte var1) {
		c_b5.for$505cff1c("当前格越界");
		if (var1 >= 0 && var1 <= this.mt - 1) {
			this.mz = var1;
			mp = this.mz;
			c_b5.method_case("======当前背包格子索引 = " + this.mz);
		}
	}

	private void G(byte var1) {
		c_be var2 = (c_be) c_a5.fE.elementAt(0);

		for (int var3 = 0; var3 < 3; ++var3) {
			c_r var4;
			if ((var4 = (c_r) var2.cf().elementAt(var3 + 3)).q()) {
				short var5 = (short) var4.mz;
				var4.mQ[var5] = this.mQ[this.mz];
				var4.mW[var5] = this.mW[this.mz];
				var4.mI[var5] = this.mI[this.mz];
				var4.ne[var5] = this.ne[this.mz];
				var4.mV[var5] = this.mV[this.mz];
				var4.mM[var5] = (short) var1;
				var4.mo[var5] = this.mo[this.mz];
				var4.m4[var5] = this.m4[this.mz];
				var4.d(var4.mV[var5]);
				var4.mA.method_char(E(var4.ne[(short) var4.mz]));
				break;
			}
		}

		c_a5.es = var2;
	}

	public final boolean b() {
		if (c_a5.gZ) {
			if (this.na != null && this.na.b()) {
				return true;
			}

			if (this.mw) {
				this.mT = super.j + ah.ad() + 2;
			} else {
				this.mT = super.j + 2;
			}

			int var1 = this.mt % this.nx == 0 ? this.mt / this.nx : this.mt / this.nx + 1;
			if ((var1 = this.nz + this.ms > var1 ? var1 : this.nz + this.ms) < this.ms) {
				var1 = this.ms;
			}

			int var2 = 18 * c_a5.ic / 176;
			int var3 = 18 * c_a5.il / 208;
			boolean var4 = this.ms <= 2;

			for (int var5 = this.nz; var5 < var1; ++var5) {
				for (int var6 = 0; var6 < this.nx; ++var6) {
					if (c_a5.a(super.k + (var4 ? 5 : 0) + var6 * var2, this.mT + (var5 - this.nz) * var3, 18, 18)) {
						if ((var1 = var5 * this.nx + var6) >= this.mt) {
							var1 = this.mt - 1;
						}

						if (this.mz == var1) {
							return false;
						}

						this.K((byte) var1);
						c_a5.es.hD = (byte) (this.mz % this.nx);
						this.dV();
						if (c_a5.es.g9 == 2424994 || c_a5.es.g9 == 2425072) {
							ah var7 = (ah) c_a5.es.cf().elementAt(6);
							if (bo.q != 3) {
								var7.method_case(bo.G[this.mz]);
							} else {
								var7.a((byte) 0);
								var7.a(bo.P[this.mz]);
							}
						}

						return true;
					}
				}
			}
		}

		return true;
	}

	private void dV() {
		if (this.ng == 5 || this.ng == 10 || this.ng == 11 || this.ng == 12 || this.ng == 13 || this.ng == 14
				|| this.ng == 19 || this.ng == 20 || this.ng == 18) {
			c_ao var1 = (c_ao) c_a5.es.cf().elementAt(1);
			if (this.mQ[this.mz] != -1) {
				var1.a("操作", 0);
			} else {
				var1.a("", 0);
			}
		}

		this.mA.a(this.mV[this.mz]);
		this.mA.method_char(E(this.ne[this.mz]));
		switch (c_a5.es.g9) {
		case -1610612733:
		case -1610612732:
		case -1610612620:
		case -1610612618:
			this.d1();
		default:
			ba.g();
		}
	}

	public final void f() {
		if (super.field_byte) {
			this.s();
		} else {
			int var1;
			byte var2;
			ba var6;
			ah var7;
			c_ao var8;
			c_r var9;
			if (c_a5.method_try(4096)) {
				var1 = this.mz / this.nx - 1;
				var2 = this.mz = (byte) (var1 * this.nx + c_a5.es.hD);
				if (this.mz < 0) {
					++var1;
					this.mz = (byte) (var1 * this.nx + c_a5.es.hD);
				}

				if (var2 < 0) {
					if (c_a5.es.g9 == 3342341) {
						return;
					}

					if ((var6 = this.method_if(c_a5.es, (byte) 0)) != this) {
						if (c_a5.es.g9 == 1966097) {
							au.field_char = -1;
						} else if (c_a5.es.g9 == 2228225) {
							aj.field_goto = -1;
						} else if (c_a5.es.g9 == 2031621 || c_a5.es.g9 == 2031636) {
							aq.field_for = -1;
						}

						this.a(false, c_a5.es);
						var6.a(true, c_a5.es);
						if (var6 instanceof c_r) {
							int var3;
							byte var4;
							if ((var4 = (byte) ((var3 = (var9 = (c_r) var6).mt / var9.nx + 1) * var9.nx - 1
									- (var9.nx - 1 - c_a5.es.hD))) >= var9.mt) {
								if ((var4 = (byte) ((var3 - 1) * var9.nx - 1 - (var9.nx - 1 - c_a5.es.hD))) < var9.mt
										&& var4 >= 0) {
									var9.K(var4);
									var9.mA.method_char(E(var9.ne[var9.mz]));
								} else {
									this.a(true, c_a5.es);
									var6.a(false, c_a5.es);
								}
							} else {
								var9.K(var4);
								var9.mA.method_char(E(var9.ne[var9.mz]));
							}
						}
					}
				}

				this.ee();
				if (c_a5.es.g9 == 2424994 || c_a5.es.g9 == 2425072) {
					var7 = (ah) c_a5.es.cf().elementAt(6);
					if (bo.q != 3) {
						var7.method_case(bo.G[this.mz]);
					} else {
						var7.a((byte) 0);
						var7.a(bo.P[this.mz]);
					}
				}

				this.dV();
				if (c_a5.es.g9 == 3342341) {
					var8 = (c_ao) c_a5.es.cf().elementAt(1);
					if (this.mQ[this.mz] != -1) {
						var8.a("使用", 0);
					} else {
						var8.a("", 0);
					}
				}
			} else if (c_a5.method_try(8192)) {
				var1 = this.mz / this.nx + 1;
				var2 = this.mz = (byte) (var1 * this.nx + c_a5.es.hD);
				if (this.mz >= this.mt) {
					--var1;
					this.mz = (byte) (var1 * this.nx + c_a5.es.hD);
				}

				if (var2 >= this.mt && (var6 = this.method_if(c_a5.es, (byte) 1)) != this) {
					this.a(false, c_a5.es);
					var6.a(true, c_a5.es);
					if (var6 instanceof c_r) {
						var9 = (c_r) var6;
						byte var11;
						if ((var11 = c_a5.es.hD) >= var9.mt) {
							this.a(true, c_a5.es);
							var6.a(false, c_a5.es);
						} else {
							var9.K(var11);
						}

						var9.mA.method_char(E(var9.ne[var9.mz]));
					}
				}

				this.ea();
				if (c_a5.es.g9 == 2424994 || c_a5.es.g9 == 2425072) {
					var7 = (ah) c_a5.es.cf().elementAt(6);
					if (bo.q != 3) {
						var7.method_case(bo.G[this.mz]);
					} else {
						var7.a((byte) 0);
						var7.a(bo.P[this.mz]);
					}
				}

				this.dV();
				if (c_a5.es.g9 == 3342341) {
					var8 = (c_ao) c_a5.es.cf().elementAt(1);
					if (this.mQ[this.mz] != -1) {
						var8.a("使用", 0);
					} else {
						var8.a("", 0);
					}
				}
			} else {
				ah var10;
				c_ao var12;
				if (c_a5.method_try(16384)) {
					var1 = this.mz / this.nx;
					--c_a5.es.hD;
					if (c_a5.es.hD < 0) {
						if (var1 == 0) {
							c_a5.es.hD = 0;
						} else {
							c_a5.es.hD = (byte) (this.nx - 1);
						}

						--var1;
						if (var1 < 0) {
							var1 = 0;
						}
					}

					this.mz = (byte) (var1 * this.nx + c_a5.es.hD);
					this.ee();
					if (c_a5.es.g9 == 2424994 || c_a5.es.g9 == 2425072) {
						var10 = (ah) c_a5.es.cf().elementAt(6);
						if (bo.q != 3) {
							var10.method_case(bo.G[this.mz]);
						} else {
							var10.a((byte) 0);
							var10.a(bo.P[this.mz]);
						}
					}

					this.dV();
					if (c_a5.es.g9 == 3342341) {
						var12 = (c_ao) c_a5.es.cf().elementAt(1);
						if (this.mQ[this.mz] != -1) {
							var12.a("使用", 0);
						} else {
							var12.a("", 0);
						}
					}
				} else if (c_a5.method_try(32768)) {
					var1 = this.mz / this.nx;
					++c_a5.es.hD;
					if (c_a5.es.hD >= this.nx) {
						if (var1 >= this.mO - 1) {
							c_a5.es.hD = (byte) (this.nx - 1);
						} else {
							c_a5.es.hD = 0;
						}

						++var1;
						if (var1 >= this.mO) {
							var1 = this.mO - 1;
						}
					}

					this.mz = (byte) (var1 * this.nx + c_a5.es.hD);
					if (this.mz >= this.mt) {
						this.mz = (byte) (this.mt - 1);
						c_a5.es.hD = (byte) (this.mz % this.nx);
					}

					this.ea();
					if (c_a5.es.g9 == 2424994 || c_a5.es.g9 == 2425072) {
						var10 = (ah) c_a5.es.cf().elementAt(6);
						if (bo.q != 3) {
							var10.method_case(bo.G[this.mz]);
						} else {
							var10.a((byte) 0);
							var10.a(bo.P[this.mz]);
						}
					}

					this.dV();
					if (c_a5.es.g9 == 3342341) {
						var12 = (c_ao) c_a5.es.cf().elementAt(1);
						if (this.mQ[this.mz] != -1) {
							var12.a("使用", 0);
						} else {
							var12.a("", 0);
						}
					}
				} else if (c_a5.method_byte(196608)) {
					switch (this.nc) {
					case 0:
						if (!this.mZ[this.mz]) {
							this.eb();
						}
						break;
					case 1:
						if (c_a5.es.g9 == -1610612732) {
							c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
							this.G((byte) 1);
							c_a5.es.ht = 0;
							c_a5.es.ck();
						} else if (c_a5.es.g9 == -1610612620 || c_a5.es.g9 == -1610612618) {
							if (c_a5.es.g9 == -1610612620) {
								aa.field_goto[aa.field_case] = this.mQ[this.mz];
							} else if (c_a5.es.g9 == -1610612618) {
								aa.field_try[aa.field_case] = this.mQ[this.mz];
							}

							c_be.ci();
							a7 var15;
							(var15 = (a7) c_a5.es.cf().elementAt(aa.field_case + 3)).a(false, (byte) 1);
							var15.fC = this.mo[this.mz];
							short var13 = this.mI[this.mz];
							var15.ft = true;
							var15.method_if(var13, false);
							var15.a(c_a5.gg);
							if (c_a5.d6.size() > 0) {
								c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
							}
						}
					}

					switch (c_a5.es.g9) {
					case 458773:
						if (c_be.gu.B.length() + 4 >= 30) {
							c_as.a((byte) 5, "您输入的聊天字数已达上限！", "确定", "", -1, -2);
						} else {
							StringBuffer var18 = new StringBuffer();
							a3 var10002 = c_be.gu;
							var10002.B = var18.append(var10002.B).append("[b").append(this.mz + 1).append("]")
									.toString();
							c_be.gu.method_if(false);
						}
					default:
						ba.g();
					}
				} else if (c_a5.method_byte(2048)) {
					switch (this.nc) {
					case 1:
						ak var16;
						if ((var16 = (ak) c_a5.es.cf().elementAt(4)) != null) {
							var16.method_new((byte) 1);
							this.a(false, c_a5.es);
							var16.a(true, c_a5.es);
						}
					default:
						switch (c_a5.es.g9) {
						case -1610612734:
							av.a();
							break;
						case 1376263:
							c_a5.eQ.a(1376261);
							break;
						case 1703946:
							this.d5();
						}

						ba.g();
					}
				} else if (c_a5.method_byte(1024)) {
					switch (c_a5.es.g9) {
					case -1610612734:
						av.method_int();
						break;
					case 1376263:
						this.d7();
						break;
					case 1703946:
						if (this.mQ[this.mz] == -1) {
							c_b5.method_case("无物品");
							return;
						}

						if (this.mQ[this.mz] != -1 && !this.nq[this.mz]) {
							c_as.a((byte) 0, "此物品不可邮寄", "确定", "", -1, -2);
							return;
						}

						boolean var17 = false;

						int var14;
						for (var14 = 0; var14 < mE.length; ++var14) {
							if (mE[var14][0] == this.mz) {
								var17 = true;
								break;
							}
						}

						for (var14 = 0; var14 < mE.length; ++var14) {
							if (mE[var14][0] == this.mz) {
								mE[var14][0] = -1;
								mE[var14][1] = -1;
								mE[var14][2] = -1;
								mE[var14][3] = -1;
								if (c_q.j > 0) {
									--c_q.j;
								}
								break;
							}

							if (mE[var14][0] == -1 && !var17) {
								if (c_q.j < mE.length) {
									++c_q.j;
								}

								mE[var14][0] = (short) this.mz;
								mE[var14][1] = this.mI[this.mz];
								mE[var14][2] = (short) this.mo[this.mz];
								mE[var14][3] = (short) this.nu[this.mz];
								if (this.nv[this.mz] && this.nu[this.mz] > 1) {
									c_as.cH = this.nu[this.mz];
									c_as.a((byte) 1, "物品数量:", "确定", "返回", -1, -1, var14, this.mz);
								}
								break;
							}
						}
					}

					ba.g();
				}
			}

			if (this.na != null) {
				this.na.a((short) (this.mz / this.nx), true);
			}

		}
	}

	private void s() {
		if (c_a5.method_try(4096)) {
			this.y().c8();
		} else if (c_a5.method_try(8192)) {
			this.y().c9();
		} else {
			if (!c_a5.method_byte(196608)) {
				if (c_a5.method_byte(262144)) {
					super.field_byte = false;
				}
			} else {
				label1236: {
					label1018: {
						this.y().dc();
						mp = this.mz;
						int var1;
						ah var2;
						boolean var6;
						switch (super.r) {
						case 6:
							label928: switch (this.el()) {
							case 0:
								switch (c_a5.es.g9) {
								case -1610612734:
									if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) != -1) {
										switch (var1) {
										case -268435455:
											b2.a();
											av.a(this, this.mz);
											break;
										case -268435454:
											b2.a();
											b2.field_try.method_byte();
											break;
										case -268435453:
											switch (this.mM[this.mz]) {
											case 1:
												bp.ag();
												c_bv.a(-1610612730, bp.method_void(this.mQ[this.mz]));
												break;
											case 2:
												av.g = this.mQ[this.mz];
												c_a5.eQ.a(458762);
											}
										case -268435452:
										default:
											break;
										case -268435451:
											av.method_int();
											break;
										case -268435450:
											av.a();
											break;
										case -268435449:
											b1.dM();
										}
									}

									super.field_byte = false;
									return;
								case 458761:
									if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) != -1) {
										switch (var1) {
										case 0:
											if (this.mM[this.mz] == 1) {
												c_b5.method_case("1111111111111111111111111111");
												c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
												this.G((byte) 2);
												c_a5.es.ht = 0;
												c_a5.es.ck();
											} else {
												c_b5.method_case("22222222222222222222222");
											}
											break;
										case 458753:
											c_a5.eQ.a(458753);
										}
									}

									super.field_byte = false;
									return;
								case 1966082:
									var1 = (Integer) this.y().db().elementAt(this.y().de());
									au.field_try = this.mz;
									c_a5.eQ.a(var1);
									super.field_byte = false;
									return;
								default:
									if (this.mQ[this.mz] != -1) {
										var1 = (Integer) this.y().db().elementAt(this.y().de());
										if (am.field_void) {
											c_a5.eQ.a(var1);
											super.field_byte = false;
											return;
										}

										switch (var1) {
										case 458753:
											if ((m3 = this.mQ[this.mz]) / 10000 >= 101 && m3 / 10000 <= 120) {
												mv = this.mz;
												au.field_case = 0;
												au.a = 1;
											} else {
												mv = -1;
												au.a = 0;
												au.field_case = 0;
											}

											c_a5.eQ.a(var1);
											super.field_byte = false;
											return;
										case 458754:
											if ((this.mQ[this.mz] / 10000 < 1011 || this.mQ[this.mz] / 10000 > 1016)
													&& this.mQ[this.mz] / 10000 != 1027) {
												if (this.mQ[this.mz] / 10000 == 1204) {
													bx.field_if = this.mz;
												} else {
													au.field_try = -1;
													au.field_case = 0;
													au.a = 0;
												}
											} else {
												au.field_try = this.mz;
												au.field_case = 0;
												au.a = 0;
											}

											nj = this.mz;
										case 3342337:
											c_a5.eQ.a(var1);
											super.field_byte = false;
											return;
										case 458755:
											au.a = 0;
											c_a5.eQ.a(var1);
											this.I(this.mx[this.mz]);
											super.field_byte = false;
											return;
										case 458756:
											if (this.mF[0] == -1) {
												at.field_int[0] = this.mz;
												this.mF[0] = this.mz;
											}

											super.field_byte = false;
											return;
										case 458758:
											c_a5.eQ.a(var1);
											super.field_byte = false;
											return;
										case 458759:
											c_a5.gQ = new c_as((byte) 0, (c_be) null);
											m8 = this.mz;
											c_a5.gQ.a((byte) 5, c_bm.dt, "确定丢掉此物品吗？", c_bm.a2[2], c_bm.a2[3], var1, -1);
											super.field_byte = false;
											return;
										case 1245185:
											c_be.a((byte) 0, (int)this.mz);
											super.field_byte = false;
											return;
										default:
											return;
										}
									}

									c_a5.eQ.a(458758);
									super.field_byte = false;
									return;
								}
							case 1:
								if (this.mQ[this.mz] != -1) {
									switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
									case 458753:
										c_a5.eQ.a(var1);
										super.field_byte = false;
										return;
									case 983043:
										if (!this.nv[this.mz]) {
											c_as.c4 = 1;
											if (this.ne[this.mz] != 4 && this.ne[this.mz] != 5
													&& this.ne[this.mz] != 6) {
												c_a5.eQ.a(var1);
											} else {
												c_as.a((byte) 0, "你是否确定要卖掉" + this.mV[this.mz], "确定", "取消", var1, -18);
											}
										} else if (this.nu[this.mz] == 1) {
											c_as.c4 = 1;
											c_a5.eQ.a(var1);
										} else {
											c_as.cH = this.nu[this.mz];
											c_as.a((byte) 1, "卖出数量：", "确定", "取消", var1, -1);
											c_a5.gQ.method_goto(this.nu[this.mz]);
										}

										super.field_byte = false;
										return;
									case 983044:
										c_a5.eQ.a(var1);
										super.field_byte = false;
										return;
									case 983045:
										c_a5.gQ = new c_as((byte) 0, (c_be) null);
										m8 = this.mz;
										c_a5.gQ.a((byte) 5, c_bm.dt, "确定丢掉此物品吗？", c_bm.a2[2], c_bm.a2[3], var1, -1);
										super.field_byte = false;
										return;
									case 983201:
										c_a5.eQ.a(var1);
										super.field_byte = false;
										return;
									case 1245185:
										c_be.a((byte) 0, (int)this.mz);
										super.field_byte = false;
										return;
									case 3342337:
										am.a = false;
										c_a5.eQ.a(var1);
										super.field_byte = false;
									}
								} else {
									c_a5.eQ.a(983044);
									super.field_byte = false;
								}

								return;
							case 2:
								if (this.mQ[this.mz] != -1) {
									switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
									case 458753:
										c_a5.eQ.a(var1);
										super.field_byte = false;
										return;
									case 1179651:
										if (this.nu[this.mz] == 1) {
											bs.field_if = 1;
											c_a5.eQ.a(var1);
										} else {
											c_as.cH = this.nu[this.mz];
											c_as.a((byte) 1, "请输入存入物品的个数：", "确定", "取消", var1, -1);
											c_a5.gQ.method_goto(this.nu[this.mz]);
										}

										super.field_byte = false;
										return;
									case 1179652:
										var6 = false;
										ah var8 = (ah) c_a5.es.cf().elementAt(10);

										try {
											ny = var8.ag();
										} catch (NumberFormatException var5) {
											ny = 0;
										}

										c_as.cH = ny;
										c_as.a((byte) 1, "存入金额：", "确定", "取消", var1, -1);
										super.field_byte = false;
										return;
									case 1179656:
										bs.a = 1;
										if (this.mF[0] == -1) {
											at.field_int[0] = this.mz;
											this.mF[0] = this.mz;
											bs.method_if(false);
										}

										super.field_byte = false;
										return;
									case 1179657:
										c_a5.eQ.a(var1);
										super.field_byte = false;
										return;
									case 1179658:
										c_a5.eQ.a(var1);
										super.field_byte = false;
										return;
									case 1245185:
										c_be.a((byte) 0, (int)this.mz);
										super.field_byte = false;
										return;
									case 3342337:
										c_a5.eQ.a(var1);
										super.field_byte = false;
									}
								} else {
									switch (this.y().de()) {
									case 0:
										boolean var11 = false;
										var2 = (ah) c_a5.es.cf().elementAt(10);

										try {
											ny = var2.ag();
										} catch (NumberFormatException var4) {
											ny = 0;
										}

										c_as.cH = ny;
										c_as.a((byte) 1, "存入金额：", "确定", "取消", 1179652, -1);
										super.field_byte = false;
										return;
									case 1:
										c_a5.eQ.a(1179657);
										super.field_byte = false;
										return;
									case 2:
										c_a5.eQ.a(1179658);
										super.field_byte = false;
									}
								}

								return;
							case 3:
							case 16:
							default:
								return;
							case 4:
								if (this.mQ[this.mz] == -1) {
									return;
								}

								if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) == 0) {
									super.field_byte = false;
									this.d7();
									return;
								}

								if (var1 == 3342337) {
									am.a = false;
								}

								c_a5.eQ.a(var1);
								super.field_byte = false;
								return;
							case 5:
								int var9;
								if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) == -1610612702) {
									if (this.mQ[this.mz] == -1) {
										c_b5.method_case("无物品");
										return;
									}

									if (this.mQ[this.mz] != -1 && !this.nq[this.mz]) {
										super.field_byte = false;
										c_as.a((byte) 0, "此物品不可邮寄", "确定", "", -1, -2);
										return;
									}

									for (var9 = 0; var9 < mE.length; ++var9) {
										if (mE[var9][0] == -1) {
											mE[var9][0] = (short) this.mz;
											mE[var9][1] = this.mI[this.mz];
											mE[var9][2] = (short) this.mo[this.mz];
											mE[var9][3] = (short) this.nu[this.mz];
											if (this.nv[this.mz] && this.nu[this.mz] > 1) {
												c_as.cH = this.nu[this.mz];
												c_as.a((byte) 1, "物品数量:", "确定", "返回", -1, -1, var9, this.mz);
												c_a5.gQ.method_goto(this.nu[this.mz]);
											}
											break;
										}
									}

									if (c_q.j < mE.length) {
										++c_q.j;
										c_b5.method_case("PCMail.m_bAccessoriesAmount=" + c_q.j);
									}

									super.field_byte = false;
									return;
								}

								if (var1 == -1610612701) {
									super.field_byte = false;
									this.d5();
									return;
								}

								if (var1 == 458753) {
									c_a5.eQ.a(458753);
									c_q.m = 1;
									break label1236;
								}

								if (var1 == -1610612700) {
									super.field_byte = false;

									for (var9 = 0; var9 < mE.length; ++var9) {
										if (mE[var9][0] == this.mz) {
											mE[var9][0] = -1;
											mE[var9][1] = -1;
											mE[var9][2] = -1;
											mE[var9][3] = -1;
											break;
										}
									}

									if (c_q.j <= 0) {
										return;
									}

									--c_q.j;
									return;
								}

								if (var1 != 3342337) {
									return;
								}
								break;
							case 6:
								if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) == 3342337) {
									am.a = false;
								}

								c_a5.eQ.a(var1);
								break label1236;
							case 7:
								switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612715:
									if (this.mQ[this.mz] != -1 && !this.nq[this.mz]) {
										c_as.a((byte) 0, "此物品不可进行拍卖！", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									mY[0] = (short) this.mz;
									mY[1] = this.mI[this.mz];
									mY[2] = (short) this.mo[this.mz];
									mY[3] = (short) this.nu[this.mz];
									m2 = this.mV[this.mz];
									bw.field_char = false;
									if (this.nv[this.mz]) {
										bw.field_char = true;
										c_b5.method_case("----------------------------PCAuction.m_bWhetherAccumulate="
												+ bw.field_char);
									}

									if (mY[3] == 1 && this.nv[this.mz]) {
										c_as.cH = this.nu[this.mz];
										bw.a((byte) 1);
										super.field_byte = false;
									} else if (mY[3] > 1) {
										c_as.cH = this.nu[this.mz];
										c_as.a((byte) 1, "请输入数量", "确定", "返回", -1, -1);
										c_a5.gQ.method_goto(this.nu[this.mz]);
										super.field_byte = false;
									} else {
										this.nv[this.mz] = false;
										bw.a((byte) mY[3]);
									}
									break;
								case -1610612714:
									bw.method_if((byte) 1);
									break;
								case -1610612713:
									bw.method_do();
									break;
								default:
									if (var1 == 3342337) {
										am.a = false;
									}

									bw.field_do = 1;
									c_a5.eQ.a(var1);
								}

								super.field_byte = false;
								return;
							case 8:
								if (this.mQ[this.mz] != -1) {
									switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
									case 458753:
										if (this.mQ[this.mz] / 10000 >= 101 && this.mQ[this.mz] / 10000 <= 120) {
											m3 = this.mQ[this.mz];
											mv = this.mz;
											au.field_case = 0;
										} else {
											mv = -1;
											m3 = 0;
											au.field_case = 0;
										}

										c_a5.eQ.a(var1);
										super.field_byte = false;
										return;
									case 458755:
										this.I(this.mx[this.mz]);
										switch (m0) {
										case 1:
										case 2:
										case 3:
											c_be.cx();
											break;
										default:
											c_a5.eQ.a(var1);
										}

										super.field_byte = false;
										return;
									case 458757:
										c_be.a((byte) 0, (int)this.mz);
										super.field_byte = false;
										return;
									case 917510:
										c_a5.eQ.a(var1);
										super.field_byte = false;
										return;
									case 917511:
										c_a5.gQ = new c_as((byte) 0, (c_be) null);
										m8 = this.mz;
										c_a5.gQ.a((byte) 5, c_bm.dt, "确定丢掉此物品吗？", c_bm.a2[2], c_bm.a2[3], var1, -1);
										super.field_byte = false;
										return;
									case 2031636:
										nf = true;
										aq.a = this.mz;
									case 3342337:
										c_a5.eQ.a(var1);
										super.field_byte = false;
									}
								} else {
									c_a5.eQ.a(917510);
									super.field_byte = false;
								}

								return;
							case 9:
								var1 = (Integer) this.y().db().elementAt(this.y().de());
								c_a5.eQ.a(var1);
								break label1236;
							case 10:
								var1 = (Integer) this.y().db().elementAt(this.y().de());
								au.field_if = 1;
								au.field_int = this.mz;
								switch (var1) {
								case 1966087:
									c_a5.eQ.a(1966087);
									break;
								case 1966093:
									c_a5.eQ.a(1966093);
									break;
								case 3342337:
									am.a = false;
									c_a5.eQ.a(3342337);
								}

								super.field_byte = false;
								return;
							case 11:
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612705:
									this.dU();
									break;
								case 2031617:
									aq.field_do = this.mz;
									c_a5.eQ.a(2031617);
									break;
								case 2031618:
									if (aq.a == -1) {
										c_as.a((byte) 0, "请选择要开封的装备。", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									if (aq.field_int == -1) {
										c_as.a((byte) 0, "请选择开封卷轴对装备进行开封。", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									c_a5.eQ.a(2031618);
									break;
								case 2031648:
									c_a5.eQ.a(2031648);
									break;
								case 3342337:
									am.a = false;
									c_a5.eQ.a(3342337);
								}

								super.field_byte = false;
								return;
							case 12:
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612705:
									mY[0] = (short) this.mz;
									mY[1] = this.mI[this.mz];
									mY[2] = (short) this.mo[this.mz];
									mY[3] = (short) this.nu[this.mz];
									if (aq.field_for == 1) {
										if (this.mQ[this.mz] / 10000 >= 1014 && this.mQ[this.mz] / 10000 <= 1016) {
											aq.a(4, true, 3, true);
											c_a5.eQ.a(2031622);
											break;
										}

										c_as.a((byte) 0, "只有原石才可放入当前位置。", "确定", "", -1, -2);
									} else if (aq.field_for == 2) {
										if (this.mQ[this.mz] / 10000 >= 1017 && this.mQ[this.mz] / 10000 <= 1019) {
											aq.a(6, true, 1, true);
											break;
										}

										c_as.a((byte) 0, "只有雕琢符才能放入当前位置。", "确定", "", -1, -2);
									} else if (aq.field_for == 3) {
										if (this.mQ[this.mz] / 10000 == 1021) {
											aq.a(8, true, 2, true);
										} else {
											c_as.a((byte) 0, "只有原石雕琢安全符才能放入当前位置。", "确定", "", -1, -2);
										}
									} else {
										if (this.mQ[this.mz] / 10000 >= 1014 && this.mQ[this.mz] / 10000 <= 1016
												|| this.mQ[this.mz] / 10000 == 1021 || this.mQ[this.mz] / 10000 >= 1017
														&& this.mQ[this.mz] / 10000 <= 1019) {
											if (this.mQ[this.mz] / 10000 >= 1014 && this.mQ[this.mz] / 10000 <= 1016) {
												if (aq.a == -1) {
													aq.a(4, true, 3, true);
													c_a5.eQ.a(2031622);
												} else if (aq.a != this.mz) {
													c_as.a((byte) 0, "是否覆盖当前所选的原石？", "确定", "取消", -6, -9);
												}
												break;
											}

											if (this.mQ[this.mz] / 10000 >= 1017 && this.mQ[this.mz] / 10000 <= 1019) {
												if (aq.field_int == -1) {
													aq.a(6, true, 1, true);
												} else if (aq.field_int != this.mz) {
													c_as.a((byte) 0, "是否覆盖当前所选的雕琢符？", "确定", "取消", -7, -9);
												}
												break;
											}

											if (this.mQ[this.mz] / 10000 == 1021) {
												if (aq.field_if == -1) {
													aq.a(8, true, 2, true);
												} else if (aq.field_if != this.mz) {
													c_as.a((byte) 0, "是否覆盖当前所选的原石雕琢安全符？", "确定", "取消", -8, -9);
												}
											}
											break;
										}

										c_as.a((byte) 0, "此物品不能用于物品雕琢。", "确定", "", -1, -2);
									}
									break;
								case 2031623:
									if (aq.a == -1) {
										c_as.a((byte) 0, "请选择要雕琢的原石。", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									if (aq.field_int == -1) {
										c_as.a((byte) 0, "请选择雕琢符对原石进行雕琢。", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									c_a5.eQ.a(2031623);
									break;
								case 2031635:
									aq.field_do = this.mz;
									c_a5.eQ.a(2031635);
									break;
								case 2031649:
									c_a5.eQ.a(2031649);
									break;
								case 3342337:
									am.a = false;
									c_a5.eQ.a(3342337);
								}

								super.field_byte = false;
								return;
							case 13:
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612705:
									mY[0] = (short) this.mz;
									mY[1] = this.mI[this.mz];
									mY[2] = (short) this.mo[this.mz];
									mY[3] = (short) this.nu[this.mz];
									if (aj.field_goto == 1) {
										if (this.mQ[this.mz] / 10000 >= 1014 && this.mQ[this.mz] / 10000 <= 1016) {
											if (aj.field_do >= 5) {
												c_as.a((byte) 0, "已经放入5颗原石，不可再添加。", "确定", "", -1, -2);
												super.field_byte = false;
												return;
											}

											if (aj.field_do == 0) {
												c_as.cH = this.nu[this.mz];
											} else if (this.nu[this.mz] <= (byte) (5 - aj.field_do)) {
												c_as.cH = this.nu[this.mz];
											} else if (this.nu[this.mz] > (byte) (5 - aj.field_do)) {
												c_as.cH = (byte) (5 - aj.field_do);
											}

											c_as.a((byte) 1, "请输入原石数量：", "确定", "取消", -1610612617, -1);
											break;
										}

										c_as.a((byte) 0, "只有原石才可放入当前位置。", "确定", "", -1, -2);
									} else {
										if ((this.mQ[this.mz] / 10000 < 1014 || this.mQ[this.mz] / 10000 > 1016)
												&& this.mQ[this.mz] / 10000 != 1024) {
											c_as.a((byte) 0, "此物品不能用于原石合成。", "确定", "", -1, -2);
											super.field_byte = false;
											return;
										}

										if (this.mQ[this.mz] / 10000 >= 1014 && this.mQ[this.mz] / 10000 <= 1016) {
											if (aj.field_do >= 5) {
												c_as.a((byte) 0, "已经放入5颗原石，不可再添加。", "确定", "", -1, -2);
												super.field_byte = false;
												return;
											}

											if (aj.field_do == 0) {
												c_as.cH = this.nu[this.mz];
											} else if (this.nu[this.mz] <= (byte) (5 - aj.field_do)) {
												c_as.cH = this.nu[this.mz];
											} else if (this.nu[this.mz] > (byte) (5 - aj.field_do)) {
												c_as.cH = (byte) (5 - aj.field_do);
											}

											c_as.a((byte) 1, "请输入原石数量：", "确定", "取消", -1610612617, -1);
										}
									}
									break;
								case 2031650:
									c_a5.eQ.a(2031650);
									break;
								case 2228227:
									if (aj.field_byte == -1) {
										c_as.a((byte) 0, "请放入原石进行合成。", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									c_a5.eQ.a(2228227);
									break;
								case 2228231:
									aj.field_case = this.mz;
									c_a5.eQ.a(2228231);
									break;
								case 3342337:
									am.a = false;
									c_a5.eQ.a(3342337);
								}

								super.field_byte = false;
								return;
							case 14:
								a7 var10 = (a7) c_a5.es.cf().elementAt(4);
								a7 var7 = (a7) c_a5.es.cf().elementAt(6);
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612705:
									mY[0] = (short) this.mz;
									mY[1] = this.mI[this.mz];
									mY[2] = (short) this.mo[this.mz];
									mY[3] = (short) this.nu[this.mz];
									if (au.field_char == 1) {
										if (this.mQ[this.mz] / 10000 == 118) {
											c_as.a((byte) 0, "只有装备才能放入当前位置。", "确定", "", -1, -2);
											super.field_byte = false;
											return;
										}

										if (this.mQ[this.mz] / 10000 >= 101 && this.mQ[this.mz] / 10000 <= 120) {
											au.field_int = this.mz;
											var10.a(true, c_a5.es);
											this.a(false, c_a5.es);
											c_a5.eQ.a(1966098);
											break;
										}

										c_as.a((byte) 0, "只有装备才能放入当前位置。", "确定", "", -1, -2);
									} else {
										short var3;
										if (au.field_char == 2) {
											if (this.mQ[this.mz] / 10000 == 1025) {
												au.field_try = this.mz;
												var7.a(true, (byte) 1);
												var7.fC = (byte) mY[2];
												var3 = mY[1];
												var7.ft = true;
												var7.method_if(var3, false);
												var7.a(c_a5.gg);
												var7.a(true, c_a5.es);
												this.a(false, c_a5.es);
											} else {
												c_as.a((byte) 0, "只有宝石解除符才能放入当前位置。", "确定", "", -1, -2);
											}
										} else {
											if (this.mQ[this.mz] / 10000 == 118) {
												c_as.a((byte) 0, "此物品不能用于宝石解除。", "确定", "", -1, -2);
												super.field_byte = false;
												return;
											}

											if ((this.mQ[this.mz] / 10000 < 101 || this.mQ[this.mz] / 10000 > 120)
													&& this.mQ[this.mz] / 10000 != 1025) {
												c_as.a((byte) 0, "此物品不能用于宝石解除。", "确定", "", -1, -2);
											} else if (this.mQ[this.mz] / 10000 >= 101
													&& this.mQ[this.mz] / 10000 <= 120) {
												if (au.field_int == -1) {
													au.field_int = this.mz;
													var10.a(true, c_a5.es);
													this.a(false, c_a5.es);
													c_a5.eQ.a(1966098);
												} else if (au.field_int != this.mz) {
													c_as.a((byte) 0, "是否覆盖当前所选的装备？", "确定", "取消", -13, -9);
												}
											} else if (this.mQ[this.mz] / 10000 == 1025) {
												if (au.field_try == -1) {
													au.field_try = this.mz;
													var7.a(true, (byte) 1);
													var7.fC = (byte) mY[2];
													var3 = mY[1];
													var7.ft = true;
													var7.method_if(var3, false);
													var7.a(c_a5.gg);
													var7.a(true, c_a5.es);
													this.a(false, c_a5.es);
												} else if (au.field_try != this.mz) {
													c_as.a((byte) 0, "是否覆盖当前所选的宝石解除符？", "确定", "取消", -14, -9);
												}
											}
										}
									}
									break;
								case 1966099:
									if (au.field_int == -1) {
										if (c_a5.d6.size() > 0) {
											c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
										}

										c_as.a((byte) 0, "请放入装备进行宝石解除。", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									c_a5.eQ.a(1966099);
									break;
								case 1966113:
									au.field_byte = this.mz;
									c_a5.eQ.a(1966113);
									break;
								case 2031651:
									c_a5.eQ.a(2031651);
									break;
								case 3342337:
									am.a = false;
									c_a5.eQ.a(3342337);
								}

								super.field_byte = false;
								return;
							case 15:
								var1 = (Integer) this.y().db().elementAt(this.y().de());
								bb.field_void = mp;
								bb.field_do = 1;
								if (var1 == 3342337) {
									am.a = false;
								}

								c_a5.eQ.a(var1);
								break label1236;
							case 17:
								var1 = (Integer) this.y().db().elementAt(this.y().de());
								bx.a = 0;
								bx.field_for = mp;
								if (var1 == 3342337) {
									am.a = false;
								}

								c_a5.eQ.a(var1);
								break label1236;
							case 18:
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612705:
									mY[0] = (short) this.mz;
									mY[1] = this.mI[this.mz];
									mY[2] = (short) this.mo[this.mz];
									mY[3] = (short) this.nu[this.mz];
									aj.field_try = this.mV[this.mz];
									aj.field_char = this.ne[this.mz];
									c_a5.eQ.a(2228257);
									super.field_byte = false;
									break label1236;
								case 2228227:
									if (aj.field_byte == -1) {
										c_as.a((byte) 0, "请放入原石进行合成。", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									c_a5.eQ.a(2228227);
									break label1236;
								case 2228231:
									aj.field_case = this.mz;
									c_a5.eQ.a(2228231);
									break label1236;
								case 2228258:
									if (aj.field_byte == -1) {
										c_as.a((byte) 0, "请放入宝石进行还原。", "确定", "", -1, -2);
										super.field_byte = false;
										return;
									}

									c_a5.eQ.a(2228258);
									break label1236;
								case 2228260:
									c_a5.eQ.a(2228260);
									break label1236;
								case 3342337:
									break label928;
								default:
									break label1236;
								}
							case 19:
								switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
								case 2031617:
									aq.field_do = this.mz;
									break;
								case 3342337:
									am.a = false;
									break;
								case 3342357:
								case 3342358:
									this.ek();
								case 3342359:
								case 3342361:
								}

								c_a5.eQ.a(var1);
								break label1236;
							case 20:
								switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
								case 917526:
								case 917527:
									this.ek();
								case 917528:
								case 917530:
								default:
									break;
								case 2031617:
									aq.field_do = this.mz;
									break;
								case 3342337:
									am.a = false;
								}

								c_a5.eQ.a(var1);
								break label1236;
							}

							am.a = false;
							c_a5.eQ.a(3342337);
							break label1236;
						case 15:
						case 42:
							if (this.mQ[this.mz] != -1) {
								switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
								case 3:
									break label1018;
								case 983041:
									c_a5.eQ.a(var1);
									break label1018;
								case 983042:
									if (!this.nv[this.mz]) {
										if (this.nm[this.mz] == 1) {
											c_as.c4 = 1;
											c_a5.eQ.a(var1);
										} else {
											c_as.cH = this.nm[this.mz];
											(c_a5.gQ = new c_as((byte) 1, (c_be) null)).a((byte) 5, c_bm.dt, "请输入个数",
													c_bm.a2[2], c_bm.a2[3], var1, -1);
											c_a5.gQ.method_goto(1);
										}
									} else if (this.nu[this.mz] == 1) {
										c_as.c4 = 1;
										c_a5.eQ.a(var1);
									} else {
										if (this.nm[this.mz] < this.nu[this.mz]) {
											c_as.cH = this.nm[this.mz];
										} else {
											c_as.cH = this.nu[this.mz];
										}

										(c_a5.gQ = new c_as((byte) 1, (c_be) null)).a((byte) 5, c_bm.dt, "请输入个数", c_bm.a2[2],
												c_bm.a2[3], var1, -1);
										c_a5.gQ.method_goto(1);
									}

									super.field_byte = false;
									break;
								case 1245185:
									c_be.a((byte) 2, (int)this.mz);
									break label1018;
								default:
									return;
								}
							}
							break;
						case 29:
							if (this.mQ[this.mz] != -1) {
								switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
								case 1179650:
									c_a5.eQ.a(var1);
									super.field_byte = false;
									return;
								case 1179653:
									if (this.nu[this.mz] == 1) {
										bs.field_if = 1;
										c_a5.eQ.a(var1);
									} else {
										c_as.cH = this.nu[this.mz];
										c_as.a((byte) 1, "请输入取出物品的个数：", "确定", "取消", var1, -1);
										c_a5.gQ.method_goto(this.nu[this.mz]);
									}

									super.field_byte = false;
									return;
								case 1179654:
									var6 = false;
									c_as.cH = ny = Integer.parseInt(((ah) c_a5.es.cf().elementAt(5)).aj());
									c_as.a((byte) 1, "取出金额：", "确定", "取消", var1, -1);
									super.field_byte = false;
									return;
								case 1179655:
									c_a5.eQ.a(var1);
									super.field_byte = false;
									return;
								case 1179656:
									bs.a = 0;
									if (this.mF[0] == -1) {
										at.field_int[0] = this.mz;
										this.mF[0] = this.mz;
										bs.method_if(false);
									}

									super.field_byte = false;
									return;
								case 1245185:
									c_be.a((byte) 3, (int)this.mz);
									super.field_byte = false;
									return;
								case 3342339:
									c_a5.eQ.a(var1);
									super.field_byte = false;
									return;
								}
							} else {
								switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
								case 1179654:
									var6 = false;
									c_as.cH = ny = Integer.parseInt(((ah) c_a5.es.cf().elementAt(5)).aj());
									c_as.a((byte) 1, "取出金额：", "确定", "取消", var1, -1);
									super.field_byte = false;
									return;
								case 1179655:
									c_a5.eQ.a(var1);
									super.field_byte = false;
									return;
								}
							}
						case 53:
							if (this.mQ[this.mz] != -1) {
								switch (this.y().de()) {
								case 0:
									c_a5.eQ.a(1769475);
									super.field_byte = false;
									break;
								case 1:
									c_a5.eQ.a(1769481);
									super.field_byte = false;
									return;
								default:
									return;
								}
							}
							break;
						case 148:
							if (this.mQ[this.mz] != -1) {
								var1 = (Integer) this.y().db().elementAt(this.y().de());
								bo.N = this.mz;
								bo.field_char = 8;
								switch (var1) {
								case 2424993:
									bo.D = true;
									if (bo.g[this.mz] == 0) {
										if (!c_a5.dU && (bo.q == 3 || bo.q == 8)) {
											c_as.aY();
										} else {
											c_as.cH = 20;
											c_as.a((byte) 1, "请您输入数量", "确定", "返回", 2424993, -1, -1, -1);
											c_a5.gQ.method_goto(1);
										}
									} else if (bo.g[this.mz] == 1) {
										if (!c_a5.dU && (bo.q == 3 || bo.q == 8)) {
											c_as.aY();
										} else {
											c_a5.eQ.a(2424993);
										}
									}

									super.field_byte = false;
									break;
								case 2424995:
									c_a5.eQ.a(2424995);
									super.field_byte = false;
									break;
								case 2425079:
									c_a5.eQ.a(2425079);
									super.field_byte = false;
									break;
								case 2425080:
									c_a5.eQ.a(2425080);
									super.field_byte = false;
									return;
								case 2686977:
									u.method_if().field_for = this.mQ[this.mz];
									c_a5.eQ.a(2686977);
									super.field_byte = false;
									break;
								default:
									return;
								}
							}
							break;
						case 160:
							switch (c_a5.es.g9) {
							case 2555908:
								if (this.mQ[this.mz] != -1) {
									switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
									case 2555909:
										var2 = (ah) c_a5.es.cf().elementAt(9);
										if (az.a[this.mz] > var2.ag()) {
											c_as.a((byte) 0, "您的菜币不足无法购买" + this.mV[this.mz], "确定", "", -1, -2);
											super.field_byte = false;
											return;
										}

										az.field_long = this.mz;
										if ((c_as.cH = var2.ag() / az.a[this.mz]) >= 99) {
											c_as.cH = 99;
										}

										c_as.a((byte) 1, "请输入购买数量", "确定", "取消", var1, -1);
										c_a5.gQ.method_goto(1);
										break;
									case 2555968:
										az.field_long = this.mz;
										c_a5.eQ.a(var1);
									}
								}
								break;
							case 2555957:
								if (this.mQ[this.mz] != -1) {
									switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
									case 2555958:
										var2 = (ah) c_a5.es.cf().elementAt(9);
										if (az.a[this.mz] > var2.ag()) {
											c_as.a((byte) 0, "您的菜币不足无法购买" + this.mV[this.mz], "确定", "", -1, -2);
											super.field_byte = false;
											return;
										}

										az.field_long = this.mz;
										if ((c_as.cH = var2.ag() / az.a[this.mz]) >= 99) {
											c_as.cH = 99;
										}

										c_as.a((byte) 1, "请输入购买数量", "确定", "取消", var1, -1);
										c_a5.gQ.method_goto(1);
										break;
									case 2555969:
										az.field_long = this.mz;
										c_a5.eQ.a(var1);
									}
								}
							}

							super.field_byte = false;
							return;
						case 164:
							switch (c_a5.es.g9) {
							case 2555907:
								if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
									if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) == 2555962) {
										az.field_long = this.mz;
									} else {
										if (var1 == 2555963) {
											az.field_long = this.mz;
											c_as.cH = this.nu[this.mz];
											c_as.a((byte) 1, "请输入丢弃数量", "确定", "取消", 2555963, -1);
											c_a5.gQ.method_goto(this.nu[this.mz]);
											super.field_byte = false;
											return;
										}

										if (var1 == 2555943) {
											az.field_long = this.mz;
											c_as.cH = this.nu[this.mz];
											c_as.a((byte) 1, "请输入赠送数量", "确定", "取消", 2555943, -16);
											c_a5.gQ.method_goto(this.nu[this.mz]);
											super.field_byte = false;
											return;
										}
									}

									c_a5.eQ.a(var1);
								}
								break;
							case 2555908:
								if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
									if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) == 2555962) {
										az.field_long = this.mz;
									} else if (var1 == 2555970) {
										az.field_long = this.mz;
										c_as.cH = this.nu[this.mz];
										c_as.a((byte) 1, "请输入贩卖数量", "确定", "取消", 2555970, -16);
										c_a5.gQ.method_goto(this.nu[this.mz]);
										super.field_byte = false;
										return;
									}

									c_a5.eQ.a(var1);
								}
								break;
							case 2555936:
								if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
									var1 = (Integer) this.y().db().elementAt(this.y().de());
									az.field_long = this.mz;
									c_a5.eQ.a(var1);
								}
							}

							super.field_byte = false;
							return;
						case 165:
							if (this.mQ[this.mz] != -1) {
								switch (var1 = (Integer) this.y().db().elementAt(this.y().de())) {
								case 2555945:
									az.field_long = this.mz;
									c_as.cH = this.nu[this.mz];
									c_as.a((byte) 1, "请输入赠送数量", "确定", "取消", 2555945, -16);
									c_a5.gQ.method_goto(this.nu[this.mz]);
									super.field_byte = false;
									break;
								case 2555954:
									c_as.cH = this.nu[this.mz];
									az.field_int = this.mz;
									c_as.a((byte) 1, "请输入贩卖数量", "确定", "取消", var1, -1);
									c_a5.gQ.method_goto(this.nu[this.mz]);
									super.field_byte = false;
									break;
								case 2555955:
									c_as.a((byte) 0, "是否贩卖掉仓库中的所有作物？", "确定", "取消", -29, -1);
									super.field_byte = false;
									break;
								case 2555956:
									az.field_long = this.mz;
									c_a5.eQ.a(2555956);
									super.field_byte = false;
									break;
								case 2555972:
									c_a5.eQ.a(2555972);
									super.field_byte = false;
									break;
								case 2555975:
									c_as.cH = this.nu[this.mz];
									az.field_int = this.mz;
									c_as.a((byte) 1, "请输入要移动的数量", "确定", "取消", var1, -1);
									c_a5.gQ.method_goto(this.nu[this.mz]);
									super.field_byte = false;
									return;
								default:
									return;
								}
							}
							break;
						case 167:
							switch (c_a5.es.g9) {
							case 2555915:
							case 2555936:
								if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
									if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) == 2555940) {
										az.field_long = this.mz;
										c_as.cH = this.nu[this.mz];
										c_as.a((byte) 1, "请输入丢弃数量", "确定", "取消", 2555940, -1);
										c_a5.gQ.method_goto(this.nu[this.mz]);
										super.field_byte = false;
										return;
									}

									if (var1 == 2555941) {
										az.field_long = this.mz;
										c_as.cH = this.nu[this.mz];
										c_as.a((byte) 1, "请输入赠送数量", "确定", "取消", 2555941, -16);
										c_a5.gQ.method_goto(this.nu[this.mz]);
										super.field_byte = false;
										return;
									}

									if (var1 == 2555938 || var1 == 2555939) {
										az.field_long = this.mz;
									}

									c_a5.eQ.a(var1);
								}
								break;
							case 2555957:
								if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
									if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) == 2555939) {
										az.field_long = this.mz;
									} else if (var1 == 2555971) {
										az.field_long = this.mz;
										c_as.cH = this.nu[this.mz];
										c_as.a((byte) 1, "请输入贩卖数量", "确定", "取消", 2555971, -16);
										c_a5.gQ.method_goto(this.nu[this.mz]);
										super.field_byte = false;
										return;
									}

									c_a5.eQ.a(var1);
								}
							}

							super.field_byte = false;
						}

						return;
					}

					super.field_byte = false;
					return;
				}

				super.field_byte = false;
			}

		}
	}

	public static void dX() {
		for (int var0 = 0; var0 < mG.length; ++var0) {
			mG[var0] = -1;
			md[var0] = 1;
		}

	}

	public static void ed() {
		int var0;
		for (var0 = 0; var0 < 6; ++var0) {
			for (int var1 = 0; var1 < 4; ++var1) {
				mE[var0][var1] = -1;
				c_q.field_int[var0][var1] = -1;
			}
		}

		for (var0 = 0; var0 < c_q.field_int.length; ++var0) {
			a7 var2;
			(var2 = (a7) c_a5.es.cf().elementAt(var0 + 7)).fC = 0;
			var2.ft = false;
			var2.method_if((short) -1, false);
			var2.a((bi) null);
			var2.g(false);
		}

		c_a5.es.cf().elementAt(13);
	}

	public static void eg() {
		for (int var0 = 0; var0 < mE.length; ++var0) {
			if (var0 == c_a5.em) {
				mE[var0][0] = -1;
				mE[var0][1] = -1;
				mE[var0][2] = -1;
				mE[var0][3] = -1;
				c_q.field_int[var0][0] = mE[var0][0];
				c_q.field_int[var0][1] = mE[var0][1];
				c_q.field_int[var0][2] = mE[var0][2];
				c_q.field_int[var0][3] = mE[var0][3];
				if (c_q.j > 0) {
					--c_q.j;
				}
			}
		}

		((a7) c_a5.es.cf().elementAt(c_a5.em + 7)).g(false);
		c_a5.es.cf().elementAt(13);
	}

	private void eb() {
		if (c_a5.es.g9 != 458773) {
			c_br var1;
			int[] var2;
			int[] var3;
			String[] var4;
			switch (super.r) {
			case 6:
				int[] var5;
				int[] var8;
				String[] var10;
				String[] var11;
				switch (this.ng) {
				case 0:
					c_b5.method_case("******************背包*****************" + c_a5.es.g9 + "---------" + this.ng);
					switch (c_a5.es.g9) {
					case -1610612734:
						if (this.mQ[this.mz] != -1) {
							var1 = new c_br((byte) 0);
							var10 = new String[] { "设置技能", "设置物品", "设置功能", "清空本键", "清空所有", "查看" };
							var3 = new int[] { -268435451, -268435450, -268435449, -268435455, -268435454, -268435453 };
							var8 = new int[] { 3, 3, 0, 3, 3, 2 };
							var1.a(var10, var3, var8);
							this.a(var1);
						} else {
							var1 = new c_br((byte) 0);
							var10 = new String[] { "设置技能", "设置物品", "设置功能", "清空所有" };
							var3 = new int[] { -268435451, -268435450, -268435449, -268435454 };
							var8 = new int[] { 3, 3, 0, 3 };
							var1.a(var10, var3, var8);
							this.a(var1);
						}

						super.field_byte = true;
						return;
					case 458761:
						if (this.mQ[this.mz] == -1) {
							return;
						}

						var1 = new c_br((byte) 0);
						var10 = new String[] { "查看" };
						var3 = new int[] { 458753 };
						var8 = new int[] { 2 };
						if (this.mM[this.mz] == 1) {
							var10 = c_b5.a(var10, 0, "选择");
							var3 = c_b5.a(var3, 0, 0);
							var8 = c_b5.a(var8, 0, 4);
						}

						var1.a(var10, var3, var8);
						this.a(var1);
						super.field_byte = true;
						return;
					case 1966082:
						if (this.mQ[this.mz] != -1
								&& (this.mQ[this.mz] / 10000 >= 1011 && this.mQ[this.mz] / 10000 <= 1016
										|| this.mQ[this.mz] / 10000 == 1027)) {
							var1 = new c_br((byte) 0);
							var2 = new int[] { au.field_else == 0 ? 1966084 : 1966090 };
							var3 = new int[] { 3 };
							var1.a(c_bm.ak, var2, var3);
							this.a(var1);
							super.field_byte = true;
						} else {
							c_as.a((byte) 0, "此物品不可镶嵌！", "确定", "", -1, -2);
						}

						return;
					case 3342341:
						if (this.mQ[this.mz] == -1) {
							return;
						}

						c_a5.eQ.a(3342342);
						return;
					default:
						if (this.mF[0] != -1) {
							if (this.mF[0] != this.mz) {
								this.mF[1] = this.mz;
								at.field_int[0] = this.mF[0];
								at.field_int[1] = this.mF[1];
								if (this.mQ[this.mz] == -1 && this.nm[this.mF[0]] != 1 && this.nu[this.mF[0]] != 1) {
									c_as.cH = this.nu[this.mF[0]];
									c_as.a((byte) 1, "请输入移动物品的个数：", "确定", "取消", 458756, -1);
									c_a5.gQ.method_goto(this.nu[this.mF[0]]);
									return;
								}

								at.field_new = this.nu[this.mF[0]];
								c_a5.eQ.a(458756);
								return;
							}

							return;
						}

						if (this.mQ[this.mz] != -1) {
							var1 = new c_br((byte) 0);
							if (am.field_void) {
								var1.a(am.b[0], 3342352, 3);
								var1.a(am.b[1], 3342354, 3);
								this.a(var1);
								super.field_byte = true;
								this.y().da();
								return;
							}

							am.field_for = this.mz;
							if (y(this.mQ[this.mz]) || this.m5[this.mz]) {
								boolean var16 = false;
								byte var17;
								if ((this.mQ[this.mz] / 10000 < 1011 || this.mQ[this.mz] / 10000 > 1016)
										&& this.mQ[this.mz] / 10000 != 1027 && this.mQ[this.mz] / 10000 != 1204) {
									var17 = 3;
								} else {
									var17 = 1;
									au.field_case = 0;
								}

								var1.a("使　用", 458754, var17);
							}

							if (this.d3()) {
								var1.a("装　备", 458755, 3);
							}

							var1.a("查　看", this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337,
									this.mQ[this.mz] / 10000 != 118 ? 2 : 1);
							var1.a("移　动", 458756, 3);
							if (this.d3() && this.mQ[this.mz] / 10000 != 118) {
								var1.a("比　较", 1245185, 2);
							}

							var1.a("整　理", 458758, 3);
							var1.a("丢　弃", 458759, 3);
							this.a(var1);
						} else {
							if (am.field_void) {
								return;
							}

							var1 = new c_br((byte) 0);
							var2 = new int[] { 458758 };
							var11 = new String[] { "整理" };
							var1.a(var11, var2);
							this.a(var1);
						}

						super.field_byte = true;
						this.y().da();
						return;
					}
				case 1:
					c_b5.method_case("***************商店背包***************");
					if (this.mQ[this.mz] != -1) {
						var1 = new c_br((byte) 0);
						if (c_a5.es.g9 == 983046) {
							var1.a("卖出物品", 983043, 3);
							var1.a("自动出售", 983201, 3);
						}

						var1.a("查看详情", this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, 2);
						if (!y(this.mQ[this.mz]) && this.mQ[this.mz] / 10000 != 118) {
							var1.a("比　较", 1245185, 2);
						}

						var1.a("整　理", 983044, 3);
						var1.a("丢　弃", 983045, 3);
						this.a(var1);
					} else {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 983044 };
						var11 = new String[] { "整理" };
						var1.a(var11, var2);
						this.a(var1);
					}

					super.field_byte = true;
					this.y().da();
					return;
				case 2:
					c_b5.method_case("***************仓库背包***************");
					if (this.mF[0] != -1) {
						if (this.mF[0] != this.mz) {
							this.mF[1] = this.mz;
							at.field_int[0] = this.mF[0];
							at.field_int[1] = this.mF[1];
							if (this.mQ[this.mz] == -1 && this.nm[this.mF[0]] != 1 && this.nu[this.mF[0]] != 1) {
								c_as.cH = this.nu[this.mF[0]];
								c_as.a((byte) 1, "请输入移动物品的个数：", "确定", "取消", 1179656, -1);
								c_a5.gQ.method_goto(this.nu[this.mF[0]]);
								return;
							}

							at.field_new = this.nu[this.mF[0]];
							c_a5.eQ.a(1179656);
							return;
						}

						return;
					}

					if (this.mQ[this.mz] != -1) {
						(var1 = new c_br((byte) 0)).a("存入物品", 1179651, 3);
						var1.a("存入金钱", 1179652, 3);
						var1.a("查看物品", this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337,
								this.mQ[this.mz] / 10000 != 118 ? 2 : 1);
						if (!y(this.mQ[this.mz]) && this.mQ[this.mz] / 10000 != 118) {
							var1.a("比　较", 1245185, 2);
						}

						var1.a("整　理", 1179657, 3);
						var1.a("移　动", 1179656, 3);
						if (c_a5.es.g9 == 1179649) {
							var1.a("仓库扩容", 1179658, 1);
						}

						this.a(var1);
					} else {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 1179652, 1179657 };
						var11 = new String[] { "存入金钱", "整　理" };
						var8 = new int[] { 3, 3 };
						var1.a(var11, var2, var8);
						if (c_a5.es.g9 == 1179649) {
							var1.a("仓库扩容", 1179658, 1);
						}

						this.a(var1);
					}

					super.field_byte = true;
					this.y().da();
					return;
				case 3:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					c_be.a((byte) 0, (int)this.mz);
					return;
				case 4:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					String var14 = "";

					for (int var15 = 0; var15 < mG.length; ++var15) {
						if (mG[var15] == this.mz) {
							var14 = "取消选择";
							break;
						}

						var14 = "选择物品";
					}

					var11 = new String[] { var14, "确认放置", "查　看" };
					var8 = new int[] { 0, 1376261, this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337 };
					var5 = new int[] { 3, 3, 2 };
					var1.a(var11, var8, var5);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 5:
					boolean var9 = false;
					if (this.mQ[this.mz] == -1) {
						return;
					}

					for (int var12 = 0; var12 < mE.length; ++var12) {
						if (mE[var12][0] != -1 && mE[var12][0] == this.mz) {
							var9 = true;
						}
					}

					c_br var13 = new c_br((byte) 0);
					var3 = new int[] { var9 ? -1610612700 : -1610612702, -1610612701,
							this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337 };
					if (!var9) {
						c_bm.field_goto[0] = "选择物品";
					} else {
						c_bm.field_goto[0] = "取回物品";
					}

					var8 = new int[] { 3, 3, 2 };
					var13.a(c_bm.field_goto, var3, var8);
					this.a(var13);
					super.field_byte = true;
					this.y().da();
					return;
				case 6:
					if (this.mQ[this.mz] != -1) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, 1769477 };
						var3 = new int[] { 2, 3 };
						var1.a(c_bm.a4, var2, var3);
						this.a(var1);
					} else {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 1769477 };
						var3 = new int[] { 3 };
						var1.a(c_bm.e, var2, var3);
						this.a(var1);
					}

					super.field_byte = true;
					this.y().da();
					return;
				case 7:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var10 = new String[] { "查　看", "选择物品" };
					var11 = new String[] { "查　看", "替换物品", "确定拍卖", "取回物品" };
					var8 = new int[] { this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, -1610612715 };
					var5 = new int[] { this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, -1610612715, -1610612713,
							-1610612714 };
					int[] var6 = new int[] { 2, 3 };
					int[] var7 = new int[] { 2, 3, 3, 3 };
					var1.a(bw.a == 0 ? var10 : var11, bw.a == 0 ? var8 : var5, bw.a == 0 ? var6 : var7);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 8:
					if (a7.bU()) {
						return;
					}

					c_b5.method_case("************* 装备背包 ****************");
					if (this.mQ[this.mz] != -1) {
						var1 = new c_br((byte) 0);
						if (y(this.mQ[this.mz])) {
							var2 = new int[] { 458753, 917510, 917511 };
							var3 = new int[] { 2, 3, 3 };
							var4 = new String[] { "查看物品", "整　理", "丢　弃" };
							var1.a(var4, var2, var3);
						} else {
							var1.a("装备物品", 458755, 3);
							var1.a("查看物品", this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337,
									this.mQ[this.mz] / 10000 != 118 ? 2 : 1);
							if (this.mQ[this.mz] / 10000 != 118) {
								var1.a("开　封", 2031636, 1);
								var1.a("比　较", 458757, 2);
							}

							var1.a("整　理", 917510, 3);
							var1.a("丢　弃", 917511, 3);
						}

						this.a(var1);
					} else {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 917510 };
						var11 = new String[] { "整理" };
						var1.a(var11, var2);
						this.a(var1);
					}

					super.field_byte = true;
					this.y().da();
					return;
				case 9:
					c_b5.method_case("************* 仓库扩容背包 ****************");
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { 458753, 1179659 };
					var11 = new String[] { "查　看", "使　用" };
					var8 = new int[] { 2, 2 };
					var1.a(var11, var2, var8);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 10:
					if (this.mQ[this.mz] != -1 && this.mQ[this.mz] / 10000 >= 101 && this.mQ[this.mz] / 10000 <= 120) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 1966087, this.mQ[this.mz] / 10000 != 118 ? 1966093 : 3342337 };
						var3 = new int[] { 2, 2 };
						var1.a(c_bm.f, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
					} else {
						c_as.a((byte) 0, "此物品不可镶嵌宝石。", "确定", "", -1, -2);
					}

					return;
				case 11:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 2031617 : 3342337, 2031618,
							2031648 };
					var3 = new int[] { 3, 2, 3, 2 };
					var1.a(c_bm.bU, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 12:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 2031635 : 3342337, 2031623,
							2031649 };
					var3 = new int[] { 3, 2, 3, 2 };
					var1.a(c_bm.c6, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 13:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 2228231 : 3342337, 2228227,
							2031650 };
					var3 = new int[] { 3, 2, 3, 2 };
					var1.a(c_bm.cp, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 14:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 1966113 : 3342337, 1966099,
							2031651 };
					var3 = new int[] { 3, 2, 1, 2 };
					var1.a(c_bm.dc, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 15:
					if (this.mQ[this.mz] != -1) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, 2162754 };
						var3 = new int[] { 2, 3 };
						var4 = new String[] { "查　看", "凝　元" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
						return;
					}

					return;
				case 16:
				default:
					return;
				case 17:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					if (bx.field_if != -1) {
						if (this.mQ[this.mz] / 10000 >= 101 && this.mQ[this.mz] / 10000 <= 120) {
							var1 = new c_br((byte) 0);
							var2 = new int[] { 917524, this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337 };
							var3 = new int[] { 3, 2 };
							var4 = new String[] { "修理", "查看" };
							var1.a(var4, var2, var3);
							this.a(var1);
							super.field_byte = true;
							this.y().da();
						} else {
							var1 = new c_br((byte) 0);
							var2 = new int[] { 458753 };
							var3 = new int[] { 2 };
							var4 = new String[] { "查看" };
							var1.a(var4, var2, var3);
							this.a(var1);
							super.field_byte = true;
							this.y().da();
						}

						return;
					} else {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 458753 };
						var3 = new int[] { 2 };
						var4 = new String[] { "查看" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
						return;
					}
				case 18:
					if (this.mQ[this.mz] != -1) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 2228231 : 3342337, 2228258,
								2228260 };
						var3 = new int[] { 3, 2, 1, 2 };
						var4 = new String[] { "放置道具", "查看详情", "宝石还原", "还原说明" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
					}

					return;
				case 19:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { 3342357, 3342358, this.mQ[this.mz] / 10000 != 118 ? 2031617 : 3342337, 3342359,
							3342361 };
					var3 = new int[] { 3, 3, 2, 3, 2 };
					var4 = new String[] { "放置法宝", "放置铭文", "查看详情", "法宝铭刻", "铭刻说明" };
					var1.a(var4, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 20:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { 917526, 917527, this.mQ[this.mz] / 10000 != 118 ? 2031617 : 3342337, 917528,
							917530 };
					var3 = new int[] { 3, 3, 2, 3, 2 };
					var4 = new String[] { "放置装备", "放置强化符", "查看详情", "装备强化", "强化说明" };
					var1.a(var4, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				}
			case 15:
			case 42:
				c_b5.method_case("****************商店*******************");
				if (this.mQ[this.mz] != -1) {
					(var1 = new c_br((byte) 0)).a("买入物品", 983042, 3);
					var1.a("查看详情", 983041, 2);
					if (!y(this.mQ[this.mz]) && this.mQ[this.mz] / 10000 != 118) {
						var1.a("比　较", 1245185, 2);
					}

					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				}
				break;
			case 29:
				c_b5.method_case("****************仓库*******************");
				if (this.mF[0] != -1) {
					if (this.mF[0] != this.mz) {
						this.mF[1] = this.mz;
						at.field_int[0] = this.mF[0];
						at.field_int[1] = this.mF[1];
						if (this.mQ[this.mz] == -1 && this.nm[this.mF[0]] != 1 && this.nu[this.mF[0]] != 1) {
							c_as.cH = this.nu[this.mF[0]];
							c_as.a((byte) 1, "请输入移动物品的个数：", "确定", "取消", 1179656, -1);
							c_a5.gQ.method_goto(this.nu[this.mF[0]]);
							return;
						}

						at.field_new = this.nu[this.mF[0]];
						c_a5.eQ.a(1179656);
						return;
					}

					return;
				}

				if (this.mQ[this.mz] != -1) {
					(var1 = new c_br((byte) 0)).a("取出物品", 1179653, 3);
					var1.a("取出金钱", 1179654, 3);
					var1.a("查看物品", this.mQ[this.mz] / 10000 != 118 ? 1179650 : 3342339,
							this.mQ[this.mz] / 10000 != 118 ? 2 : 1);
					if (!y(this.mQ[this.mz]) && this.mQ[this.mz] / 10000 != 118) {
						var1.a("比　较", 1245185, 2);
					}

					var1.a("整　理", 1179655, 3);
					var1.a("移　动", 1179656, 3);
					this.a(var1);
				} else {
					(var1 = new c_br((byte) 0)).a("取出金钱", 1179654, 3);
					var1.a("整　理", 1179655, 3);
					this.a(var1);
				}

				super.field_byte = true;
				this.y().da();
				return;
			case 53:
				c_b5.method_case("****************物品兑换商店*******************");
				if (this.mQ[this.mz] != -1) {
					var1 = new c_br((byte) 0);
					var2 = new int[] { 1769475, 1 };
					var3 = new int[] { 2, 3 };
					var1.a(c_bm.ap, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				}
				break;
			case 148:
				if (this.mQ[this.mz] != -1) {
					var1 = new c_br((byte) 0);
					if (c_a5.es.g9 == 2425078) {
						var2 = new int[] { 2425080, 2425079 };
						var3 = new int[] { 3, 1 };
						var4 = new String[] { "5折购买", "查    看" };
						var1.a(var4, var2, var3);
					} else if (this.mQ[this.mz] / 10000 == 1616) {
						var2 = new int[] { 2424993, 2686977, 2424995 };
						var3 = new int[] { 3, 3, 1 };
						var4 = new String[] { "购    买", "包    月", "查    看" };
						var1.a(var4, var2, var3);
					} else {
						var2 = new int[] { 2424993, 2424995 };
						var3 = new int[] { 3, 1 };
						var4 = new String[] { "购    买", "查    看" };
						var1.a(var4, var2, var3);
					}

					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				}
				break;
			case 160:
				switch (c_a5.es.g9) {
				case 2555908:
					if (this.mQ[this.mz] == -1) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { 2555909, 2555968 };
					var3 = new int[] { 3, 2 };
					var4 = new String[] { "购    买", "查    看" };
					var1.a(var4, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 2555957:
					if (this.mQ[this.mz] != -1) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 2555958, 2555969 };
						var3 = new int[] { 3, 2 };
						var4 = new String[] { "购    买", "查    看" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
					}

					return;
				default:
					return;
				}
			case 164:
				switch (c_a5.es.g9) {
				case 2555907:
					if (this.mV[this.mz].equals("") || this.mV[this.mz] == null) {
						return;
					}

					var1 = new c_br((byte) 0);
					var2 = new int[] { 2555962, 2555963, 2555943 };
					var3 = new int[] { 2, 3, 2 };
					var4 = new String[] { "查    看", "丢    弃", "赠送好友" };
					var1.a(var4, var2, var3);
					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				case 2555908:
					if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 2555962, 2555970 };
						var3 = new int[] { 2, 3 };
						var4 = new String[] { "查    看", "贩    卖" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
					}

					return;
				case 2555936:
					if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 2555937, 2555962 };
						var3 = new int[] { 3, 2 };
						var4 = new String[] { "播    种", "查    看" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
						return;
					}

					return;
				default:
					return;
				}
			case 165:
				if (this.mQ[this.mz] != -1) {
					var1 = new c_br((byte) 0);
					if (this.mQ[this.mz] / 10000 == 1613) {
						var2 = new int[] { 2555954, 2555956, 2555955, 2555945, -1610612636, 2555972, 2555975 };
						var3 = new int[] { 3, 2, 3, 2, 2, 3, 3 };
						var4 = new String[] { "贩    卖", "查    看", "全部贩卖", "赠送好友", "作物加工", "整   理", "放入背包" };
						var1.a(var4, var2, var3);
					} else {
						var2 = new int[] { 2555954, 2555956, 2555955, 2555945, 2555972, 2555975 };
						var3 = new int[] { 3, 2, 3, 2, 3, 3 };
						var4 = new String[] { "贩    卖", "查    看", "全部贩卖", "赠送好友", "整   理", "放入背包" };
						var1.a(var4, var2, var3);
					}

					this.a(var1);
					super.field_byte = true;
					this.y().da();
					return;
				}

				c_a5.eQ.a(2555972);
				return;
			case 167:
				switch (c_a5.es.g9) {
				case 2555915:
					if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 2555939, 2555940, 2555941 };
						var3 = new int[] { 2, 3, 2 };
						var4 = new String[] { "查    看", "丢    弃", "赠送好友" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
						return;
					}
					break;
				case 2555936:
					if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 2555939, 2555940, 2555938, 2555941 };
						var3 = new int[] { 2, 3, 3, 2 };
						var4 = new String[] { "查    看", "丢    弃", "使用道具", "赠送好友" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
					}
					break;
				case 2555957:
					if (!this.mV[this.mz].equals("") && this.mV[this.mz] != null) {
						var1 = new c_br((byte) 0);
						var2 = new int[] { 2555939, 2555971 };
						var3 = new int[] { 2, 3 };
						var4 = new String[] { "查    看", "贩    卖" };
						var1.a(var4, var2, var3);
						this.a(var1);
						super.field_byte = true;
						this.y().da();
						return;
					}
				}
			}

		}
	}

	public final af ei() {
		return this.na;
	}

	private void ea() {
		if (this.mz / this.nx + 1 > this.nz + this.ms) {
			++this.nz;
			int var1 = this.mt % this.nx == 0 ? this.mt / this.nx : this.mt / this.nx + 1;
			if (this.nz > var1 - this.ms) {
				this.nz = (short) (var1 - this.ms);
			}
		}

	}

	private void ee() {
		if (this.mz / this.nx < this.nz) {
			--this.nz;
		}

	}

	public final void q(boolean var1) {
		this.mw = var1;
		if (var1) {
			if (this.na != null) {
				this.na.method_for((short) (super.j + ah.ad() + 2));
			}
		} else if (this.na != null) {
			this.na.method_for((short) (super.j + 2));
		}

		if (this.na != null) {
			this.na.aa();
		}

	}

	public final void method_do(int var1, int var2) {
		this.mo[var1] = (byte) (var2 / 1000 - 1);
		c_b5.method_case("------(" + var2 + ") stuffQuality[" + var1 + "] = " + this.mo[var1]);
	}

	public final void d9() {
		if (this.na != null) {
			this.na.az = (short) (this.mt % this.nx == 0 ? this.mt / this.nx : this.mt / this.nx + 1);
			this.na.ay = this.ms;
			af var10000 = this.na;
			byte var2 = 0;
			var10000.aj = var2;
		}
	}

	public final void d1() {
		if (this.mt != 0) {
			ak var1 = (ak) c_a5.es.cf().elementAt(4);
			short var2 = bp.method_void(this.mQ[this.mz]);
			String var3 = bp.fu[var2] + "\n";
			var1.method_if(var3);
			var1.ap();
		}

	}

	public static void d6() {
		a7[] var0 = new a7[] { (a7) c_a5.es.cf().elementAt(3), (a7) c_a5.es.cf().elementAt(5), (a7) c_a5.es.cf().elementAt(7),
				(a7) c_a5.es.cf().elementAt(9) };
		c_r var1 = (c_r) c_a5.es.cf().elementAt(10);

		for (int var2 = 0; var2 < var0.length; ++var2) {
			if (var0[var2].q()) {
				var1.nb = 0;

				for (int var3 = 0; var3 < var2; ++var3) {
					var1.nb += var0[var3].b0();
				}

				var1.nA = (byte) (var1.nb + var0[var2].b0());
				c_b5.method_case("beginShockIndex = " + var1.nb + " endShockIndex = " + var1.nA);
				return;
			}

			var1.nb = var1.nA = -1;
		}

	}

	public static int E(byte var0) {
		boolean var1 = false;
		int var2;
		if (var0 < 0) {
			var2 = c_bm.bP;
		} else if (var0 != 1) {
			var2 = c_bm.c0[var0];
		} else {
			var2 = 0;
		}

		mg = var2;
		return var2;
	}

	private static boolean y(int var0) {
		return (var0 + "").length() == 8;
	}

	private boolean d3() {
		return !y(this.mQ[this.mz]);
	}

	private void d7() {
		if (this.mQ[this.mz] == -1) {
			c_b5.method_case("无物品");
		} else {
			boolean var1 = false;

			int var2;
			for (var2 = 0; var2 < mG.length; ++var2) {
				if (mG[var2] == this.mz) {
					var1 = true;
					break;
				}
			}

			for (var2 = 0; var2 < mG.length; ++var2) {
				if (mG[var2] == this.mz) {
					mG[var2] = -1;
					md[var2] = 1;
					return;
				}

				if (mG[var2] == -1 && !var1) {
					if (!this.nq[this.mz]) {
						c_as.a((byte) 0, "该物品已经被$绑定$不能交易！", "确定", "", -1, -2);
						return;
					}

					if (this.nu[this.mz] != 1) {
						c_as.cH = this.nu[this.mz];
						c_as.a((byte) 1, "交易数量:", "确定", "返回", -1, -1, var2, this.mz);
						return;
					}

					mG[var2] = this.mz;
					return;
				}
			}

		}
	}

	private void d5() {
		c_be.cn();

		int var1;
		for (var1 = 0; var1 < 6; ++var1) {
			for (int var2 = 0; var2 < 4; ++var2) {
				c_q.field_int[var1][var2] = mE[var1][var2];
			}
		}

		for (var1 = 0; var1 < c_q.field_int.length; ++var1) {
			a7 var4;
			(var4 = (a7) c_a5.es.cf().elementAt(var1 + 7)).fC = (byte) c_q.field_int[var1][2];
			short var3 = c_q.field_int[var1][1];
			var4.ft = true;
			var4.method_if(var3, false);
			var4.a(c_a5.gg);
			if (c_q.field_int[var1][3] == 1) {
				if (this.nv[c_q.field_int[var1][0]]) {
					var4.a(true, (byte) 1);
				} else {
					var4.g(false);
				}
			} else {
				this.nv[var1] = true;
				if (c_q.field_int[var1][3] > 0) {
					var4.a(true, (byte) c_q.field_int[var1][3]);
				} else {
					var4.g(false);
				}
			}
		}

		c_q.method_if();
	}

	public final void d0() {
		for (int var1 = 0; var1 < this.mt; ++var1) {
			this.mQ[var1] = -1;
			this.mI[var1] = -1;
			this.nu[var1] = -1;
			this.mV[var1] = null;
			this.ne[var1] = -1;
			this.mM[var1] = -1;
			this.m5[var1] = false;
			this.nq[var1] = false;
			this.nD[var1] = -1;
			this.mN[var1] = -1;
			this.nm[var1] = -1;
			this.mx[var1] = -1;
			this.m4[var1] = false;
			this.mS[var1] = false;
			this.mZ[var1] = false;
			this.nv[var1] = false;
			this.mo[var1] = -1;
		}

	}

	public final void method_new(short var1) {
		super.method_new(var1);
		if (this.mA != null) {
			this.mA.method_new((short) (var1 + 3));
		}

		this.method_do(super.field_new);
	}

	public final void method_for(short var1) {
		super.method_for(var1);
		if (this.mA != null) {
			this.mA.method_for(var1);
		}

		this.method_do(super.field_new);
	}

	public static short k(short var0) {
		if (var0 == -1) {
			return var0;
		} else {
			for (int var1 = 0; var1 < mj.length; ++var1) {
				if (var1 == var0) {
					return mj[var1];
				}
			}

			c_b5.method_case("imgId = " + var0);
			throw new IllegalArgumentException("物品ID参数不匹配");
		}
	}

	public final void dU() {
		a7 var1 = (a7) c_a5.es.cf().elementAt(4);
		mY[0] = (short) this.mz;
		mY[1] = this.mI[this.mz];
		mY[2] = (short) this.mo[this.mz];
		mY[3] = (short) this.nu[this.mz];
		if (aq.field_for == 1) {
			if (this.mQ[this.mz] / 10000 >= 101 && this.mQ[this.mz] / 10000 <= 120) {
				var1.a(true, c_a5.es);
				this.a(false, c_a5.es);
				aq.a = this.mz;
				c_a5.eQ.a(2031637);
			} else {
				c_as.a((byte) 0, "这不是一件装备，不能开封。", "确定", "", -1, -2);
			}
		} else if (aq.field_for == 2) {
			if (this.mQ[this.mz] / 10000 == 1023) {
				aq.a(6, true, 1, true);
			} else {
				c_as.a((byte) 0, "只有开封卷轴才能放入当前位置。", "确定", "", -1, -2);
			}
		} else if (aq.field_for == 3) {
			if (this.mQ[this.mz] / 10000 == 1022) {
				aq.a(8, true, 2, true);
			} else {
				c_as.a((byte) 0, "只有机率提升符才能放入当前位置。", "确定", "", -1, -2);
			}
		} else if ((this.mQ[this.mz] / 10000 < 101 || this.mQ[this.mz] / 10000 > 120)
				&& this.mQ[this.mz] / 10000 != 1023 && this.mQ[this.mz] / 10000 != 1022) {
			c_as.a((byte) 0, "此物品不能用于装备开封。", "确定", "", -1, -2);
		} else {
			if (this.mQ[this.mz] / 10000 >= 101 && this.mQ[this.mz] / 10000 <= 120) {
				if (aq.a == -1) {
					aq.a = this.mz;
					c_a5.eQ.a(2031637);
					return;
				}

				if (aq.a != this.mz) {
					c_as.a((byte) 0, "是否覆盖当前所选的装备？", "确定", "取消", -10, -9);
					return;
				}
			} else if (this.mQ[this.mz] / 10000 == 1023) {
				if (aq.field_int == -1) {
					aq.a(6, true, 1, true);
					return;
				}

				if (aq.a != this.mz) {
					c_as.a((byte) 0, "是否覆盖当前所选的开封卷轴？", "确定", "取消", -7, -9);
					return;
				}
			} else if (this.mQ[this.mz] / 10000 == 1022) {
				if (aq.field_if == -1) {
					aq.a(8, true, 2, true);
					return;
				}

				if (aq.a != this.mz) {
					c_as.a((byte) 0, "是否覆盖当前所选的机率提升符？", "确定", "取消", -8, -9);
				}
			}

		}
	}

	private void ek() {
		am.field_do = this.mz;
		mY[0] = (short) this.mz;
		mY[1] = this.mI[this.mz];
		mY[2] = (short) this.mo[this.mz];
		mY[3] = (short) this.nu[this.mz];
	}
}
