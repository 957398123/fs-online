import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

/**
 * 2020/01/21
 * @author 95739
 *
 */
public final class a3 {
	private c_ao a = null;
	private c_ao A = null;
	private af Z = null;
	private c_br i = null;
	private String[] w = null;
	private int[] h = null;
	private byte[] ao = null;
	public String[] k = null;
	public byte C;
	private int[][][] aF = null;
	public static String[] t = new String[0];
	public static String[] u = new String[0];
	public static int[] ak = new int[0];
	public static byte[] aB = new byte[0];
	public static Object[] aE = new Object[0];
	public static Object[] W = new Object[0];
	public static String[] aI = new String[0];
	public static String[] aJ = new String[0];
	public static int[] s = new int[0];
	public static byte[] K = new byte[0];
	public static Object[] field_if = new Object[0];
	public static Object[] l = new Object[0];
	public static String[][] ai = new String[5][0];
	public static String[][] z = new String[5][0];
	public static int[][] aq = new int[5][0];
	public static Object[][] field_int = new Object[5][0];
	public static Object[][] H = new Object[5][0];
	public static String[] d = new String[0];
	public static String[] af = new String[0];
	public static int[] y = new int[0];
	public static byte[] aH = new byte[0];
	public static Object[] as = new Object[0];
	public static Object[] field_long = new Object[0];
	public static String[] field_new = new String[0];
	public static int[] field_for = new int[0];
	public static int[] c = new int[0];
	private String[] ad = new String[] { "私聊频道", "世界频道", "氏族测试", "场景频道", "队伍频道", "系统频道" };
	private short ap;
	private short an;
	private short R;
	private short az;
	private byte field_try;
	private short ar;
	private short b;
	private byte O;
	private byte field_char;
	private byte at;
	public byte n = 0;
	private byte aa = -1;
	private byte aA = -1;
	private int[] P = null;
	public int[] G = null;
	private short N;
	private short ay;
	private byte U = 0;
	public byte m = 0;
	public static byte T = 4;
	public static String Q = "";
	public static Vector[] ag = new Vector[0];
	public static int aD = -1;
	private static String Y = null;
	private int[][][] ax;
	private int[][][] field_void;
	private int[][] v;
	private int ae = 100;
	private int[][] o;
	private int[][] j;
	private boolean F;
	String B = "";

	public a3(byte var1) {
		this.C = var1;
	}

	public final void method_byte() {
		if (bp.ag().aS() == 0) {
			this.ad[2] = "氏族频道";
		} else {
			this.ad[2] = "诸侯频道";
		}

		c_a5.fE.addElement(c_e.a("/ui/chatface.ui"));
		c_a5.fE.addElement((Object) null);
		c_a5.fE.addElement((Object) null);
		c_a5.es = (c_be) c_a5.fE.elementAt(0);
		c_br.c6();
		if (bp.ag() != null) {
			bp.ag().method_if(false);
		}

		c_ad.a("");
		this.a = new c_ao((byte) 0, (c_be) null);
		this.A = new c_ao((byte) 1, (c_be) null);
		if (this.C == 100) {
			this.k = t;
			this.a.method_do("综合频道");
		} else if (this.C == 5) {
			this.k = d;
			this.a.method_do(this.ad[this.C]);
		} else if (this.C == 6) {
			this.k = aI;
			this.a.method_do("喇叭频道");
		} else {
			this.k = ai[this.C];
			this.a.method_do(this.ad[this.C]);
		}

		if ((this.C < 1 || this.C > 4) && this.C != 6) {
			if (this.k.length > 0) {
				this.m = 2;
			} else {
				this.m = 0;
			}

			if (this.C == 5) {
				this.A.a("", 0);
			} else {
				this.A.a("操作", 0);
			}

			this.b = 0;
		} else {
			this.m = 1;
			this.A.a("输入", 0);
			this.b = (short) (c_a5.iG << 1);
		}

		this.ar = this.a.field_int;
		this.an = (short) (this.ar + this.b);
		this.az = (short) (c_a5.il - this.ar - this.b - this.A.field_int);
		this.Z = new af((short) 0, this.an, (short) 0, this.az, (byte) 0, true, (c_be) null);
		this.Z.k = (short) (c_a5.ic - this.Z.a);
		this.ap = this.Z.a;
		this.R = (short) (c_a5.ic - (this.Z.a << 1));
		this.field_try = (byte) (this.az / c_a5.iG);
		this.n = 0;
		this.aa = -1;
		this.aA = -1;
		this.w = new String[0];
		this.aF = new int[0][][];
		this.ao = new byte[0];
		this.h = new int[0];
		this.method_try();
	}

	public final void method_if(Graphics var1) {
		if (this.C >= 1 && this.C <= 4) {
			var1.setColor(2167563);
			var1.fillRect(0, this.ar, c_a5.ic, this.b);
			var1.setColor(this.m == 1 ? 16776960 : c_bm.bR[this.C + 1]);
			var1.drawString("发送到" + this.ad[this.C] + ":", this.ap, this.ar, 20);
			var1.drawRect(this.ap, this.ar + c_a5.iG + 1, this.R - 1, c_a5.iG - 5);
		} else if (this.C == 6) {
			var1.setColor(2167563);
			var1.fillRect(0, this.ar, c_a5.ic, this.b);
			var1.setColor(this.m == 1 ? 16776960 : c_bm.bR[11]);
			var1.drawString("发送到喇叭频道:", this.ap, this.ar, 20);
			var1.drawRect(this.ap, this.ar + c_a5.iG + 1, this.R - 1, c_a5.iG - 5);
		}

		var1.setColor(2167563);
		var1.fillRect(0, this.an, c_a5.ic, this.az);
		this.a(var1, this.N);
		var1.setColor(c_bm.bY);
		var1.fillRect(0, 0, c_a5.ic, this.a.field_int);
		this.a.a(var1);
		this.A.a(var1);
		if (this.w.length > this.field_try) {
			this.Z.a(var1);
		}

		if (this.i != null) {
			this.i.a(var1);
		}

	}

	public final void method_try() {
		if (this.k != null && this.k.length != 0) {
			if (this.m == 0) {
				this.m = 2;
			}

			this.O = 0;
			this.field_char = 0;
			this.at = 0;
			this.N = 0;
			this.w = new String[0];
			this.ao = new byte[0];
			this.h = new int[0];
			this.aF = new int[0][][];
			this.ax = new int[this.k.length][][];
			this.field_void = new int[this.k.length][][];
			this.v = new int[this.k.length][];
			if (this.k.length > 0) {
				boolean var1;
				byte var2;
				if (this.U == 0) {
					this.ae = 100;
					var1 = false;
					this.field_char = this.n;
					this.O = this.n;

					for (var2 = this.n; var2 < this.k.length; this.at = var2++) {
						this.a(var2, true, this.a((int) var2));
						if (this.w.length > this.field_try) {
							var1 = true;
							break;
						}
					}

					this.N = 0;
					if (!var1) {
						var1 = false;

						for (var2 = (byte) (this.n - 1); var2 >= 0; this.field_char = var2--) {
							this.a(var2, false, this.a((int) var2));
							this.O = var2;
							if (this.w.length > this.field_try) {
								var1 = true;
								break;
							}
						}

						if (var1) {
							this.N = (short) (this.az - this.w.length * c_a5.iG);
						} else {
							this.N = 0;
						}
					}
				} else if (this.U == 1) {
					this.ae = 100;
					var1 = false;
					this.at = this.n;

					for (var2 = this.n; var2 >= 0; this.field_char = var2--) {
						this.a(var2, false, this.a((int) var2));
						this.O = var2;
						if (this.w.length > this.field_try) {
							var1 = true;
							break;
						}
					}

					this.N = (short) (this.az - this.w.length * c_a5.iG);
					if (!var1) {
						for (var2 = (byte) (this.n + 1); var2 < this.k.length; this.at = var2++) {
							this.a(var2, true, this.a((int) var2));
							if (this.w.length > this.field_try) {
								break;
							}
						}

						this.N = 0;
					}
				}
			}

			this.method_do();
			this.Z.a((short) this.k.length, (short) (this.ao.length - 1), (short) this.field_char);
			this.c();
		}
	}

	private final int a(int var1) {
		boolean var2 = false;
		int var3;
		if (this.C == 100) {
			var3 = c_bm.bR[aB[var1]];
		} else if (this.C == 5) {
			var3 = c_bm.bR[aH[var1]];
		} else if (this.C == 6) {
			var3 = c_bm.bR[K[var1]];
		} else {
			var3 = c_bm.bR[this.C + 1];
		}

		return var3;
	}

	private final void method_do() {
		this.ay = 0;

		for (int var1 = 0; var1 < this.n - this.O; ++var1) {
			this.ay = (short) (this.ay + this.ao[var1]);
		}

	}

	private final void a(int var1, boolean var2, int var3) {
		int[][] var4 = new int[0][];
		int[][] var5 = new int[0][];
		int[] var6 = new int[2];
		if (this.ae > var1) {
			this.ae = var1;
		}

		String[] var7 = c_b5.a(this.k[var1], this.R, c_a5.fq);
		int var8 = 0;

		int var9;
		int var22;
		for (var9 = var7.length; var8 < var9; ++var8) {
			boolean var10 = false;
			int var11 = var7[var8].length();
			if (var9 > 1 && var8 != var9 - 1 && (var22 = var7[var8].lastIndexOf(35)) == var11 - 1) {
				var7[var8] = var7[var8].substring(0, var22);
				var7[var8 + 1] = "#" + var7[var8 + 1];
			}
		}

		int[] var19 = new int[var7.length];

		for (var9 = 0; var9 < var19.length; ++var9) {
			var19[var9] = var3;
		}

		this.w = c_b5.a(this.w, var2 ? this.w.length : 0, var7);
		this.ao = c_b5.a(this.ao, var2 ? this.ao.length : 0, (byte) var7.length);
		this.h = c_b5.a(this.h, var2 ? this.h.length : 0, var19);
		Vector[] var21 = null;
		Vector var23 = null;
		if (this.C == 100) {
			var21 = (Vector[]) ((Vector[]) aE[var1]);
			var23 = (Vector) W[var1];
		} else if (this.C == 5) {
			var21 = (Vector[]) ((Vector[]) as[var1]);
			var23 = (Vector) field_long[var1];
		} else if (this.C == 6) {
			var21 = (Vector[]) ((Vector[]) field_if[var1]);
			var23 = (Vector) l[var1];
		} else {
			var21 = (Vector[]) ((Vector[]) field_int[this.C][var1]);
			var23 = (Vector) H[this.C][var1];
		}

		if (var23 != null) {
			var6[0] = Integer.parseInt(var23.elementAt(0).toString());
			var6[1] = Integer.parseInt(var23.elementAt(1).toString());
		} else {
			var6 = null;
		}

		int[][][] var24 = new int[var7.length][][];
		if (var21 != null) {
			var3 = 0;
			int[][] var20 = new int[0][];

			for (var22 = 0; var22 < var21.length; ++var22) {
				int[] var12;
				int var13 = (var12 = (int[]) ((int[]) var21[var22].elementAt(5)))[0];
				int var14 = var12[1];
				boolean var15 = false;

				int var16;
				for (var16 = 0; var16 < var3; ++var16) {
					var13 -= var7[var16].length();
					var14 -= var7[var16].length();
				}

				while (true) {
					boolean var17 = false;
					int var25;
					if (var13 < 0) {
						if (var14 < 0) {
							break;
						}

						if (var14 < var7[var3].length()) {
							var16 = 0;
							var25 = var14;
						} else {
							var16 = 0;
							var25 = var7[var3].length() - 1;
							var15 = true;
						}
					} else if (var13 < var7[var3].length()) {
						if (var14 < 0) {
							var16 = -1;
							var25 = -1;
						} else if (var14 < var7[var3].length()) {
							var16 = var13;
							var25 = var14;
						} else {
							var16 = var13;
							var25 = var7[var3].length() - 1;
							var15 = true;
						}
					} else {
						var16 = -1;
						var25 = -1;
						var15 = true;
					}

					if (var16 >= 0 && var25 >= 0) {
						String var18;
						if ((var18 = var7[var3]).charAt(var16) == '[') {
							var4 = c_b5.a(var4, var4.length, new int[] { var3, var16 });
						}

						if (var18.charAt(var25) == ']') {
							var5 = c_b5.a(var5, var5.length, new int[] { var3, var25 });
						}

						var20 = c_b5.a(var20, var20.length, new int[] { var16, var25, var12[2] });
					}

					if (!var15) {
						break;
					}

					var15 = false;
					var24[var3] = var20;
					var20 = new int[0][];
					var13 -= var7[var3].length();
					var14 -= var7[var3].length();
					++var3;
				}
			}

			var24[var3] = var20;
		} else {
			var4 = null;
			var5 = null;
		}

		this.v[var1] = var6;
		this.ax[var1] = var4;
		this.field_void[var1] = var5;
		this.aF = c_b5.a(this.aF, var2 ? this.aF.length : 0, var24);
	}

	private void c() {
		int var1 = this.w.length;
		this.o = new int[var1][];
		this.j = new int[var1][];

		for (int var2 = 0; var2 < var1; ++var2) {
			if ((this.m == 2 || this.m == 3 || this.m == 4) && var2 >= this.ay
					&& var2 < this.ay + this.ao[this.n - this.O]) {
				int var3;
				int var4;
				if (this.P != null && this.m == 3) {
					var3 = this.ay + this.ao[this.n - this.O];
					var4 = this.P[0];
					int var5 = this.P[1];

					for (int var6 = this.ay; var6 < var3; ++var6) {
						int var7 = this.w[var6].length();
						if (var2 == var6) {
							label54: {
								boolean var8 = false;
								boolean var10 = false;
								if (var4 < 0) {
									if (var5 >= 0) {
										if (var5 < var7) {
											var3 = 0;
											var6 = var5;
										} else {
											var3 = 0;
											var6 = var7 - 1;
										}
										break label54;
									}
								} else if (var4 < var7 && var5 >= 0) {
									if (var5 < var7) {
										var3 = var4;
										var6 = var5;
									} else {
										var3 = var4;
										var6 = var7 - 1;
									}
									break label54;
								}

								var3 = -1;
								var6 = -1;
							}

							if (var3 >= 0 && var6 >= 0) {
								this.o[var2] = new int[] { var3, var6 };
							}
							break;
						}

						var4 -= var7;
						var5 -= var7;
					}
				}

				if (this.G != null) {
					var3 = this.G[0];
					var4 = this.G[1];
					short var9 = this.ay;
					if (var2 == var9) {
						this.j[var2] = new int[] { var3, var3 + var4 };
					}
				}
			}
		}

	}

	private final void a(Graphics var1, int var2) {
		int var3 = var1.getClipX();
		int var4 = var1.getClipY();
		int var5 = var1.getClipWidth();
		int var6 = var1.getClipHeight();
		var1.setClip(this.ap, this.an, this.R, this.az);

		for (int var7 = 0; var7 < this.w.length; ++var7) {
			int var8 = this.h[var7];
			if ((this.m == 2 || this.m == 3 || this.m == 4) && var7 >= this.ay
					&& var7 < this.ay + this.ao[this.n - this.O]) {
				var8 = 16776960;
			}

			c_ad.a(var1, this.w[var7], var8, this.ap, var2 + this.an + c_a5.iG * var7, this.aF[var7], this.o[var7],
					this.j[var7]);
		}

		var1.setClip(var3, var4, var5, var6);
	}

	private void method_new() {
		short var1 = this.ap;
		short var2 = this.an;
		short var3 = this.R;
		short var4 = this.az;
		short var5 = this.ar;
		int var6 = this.an - this.ar;
		byte var7 = -1;
		boolean var8 = false;
		boolean var9 = false;
		byte var10 = -1;
		if (c_a5.a(var1, var5, var3, var6)) {
			if (this.k.length == 0) {
				c_a5.a(131072);
				return;
			}

			this.F = !this.F;
			if (!this.F) {
				c_a5.a(131072);
			} else if (this.C >= 1 && this.C <= 4) {
				this.a((byte) 1);
			}
		}

		if (c_a5.a(var1, var2, var3, var4)) {
			if (this.k.length == 0) {
				return;
			}

			this.F = false;
			boolean var28 = false;
			byte var19;
			int var22 = var19 = c_a5.cU < this.an ? 0
					: (c_a5.cU > this.an + (this.w.length - 1) * c_a5.iG ? (byte) (this.w.length - 1)
							: (byte) ((c_a5.cU - this.an - this.N) / c_a5.iG));
			int var25;
			if (this.ae > 0) {
				var25 = this.method_if(this.ae);
				var22 += var25;
			}

			boolean var26 = false;
			int var30 = 0;
			int var31 = 0;

			for (var6 = this.k.length; var31 < var6; ++var31) {
				var25 = c_b5.a(this.k[var31], this.R, c_a5.fq).length;
				if ((var30 += var25) >= var22 + 1) {
					if (this.m != 1 && this.m != 3) {
						var7 = this.n;
					}

					var10 = this.n;
					this.n = (byte) var31;
					break;
				}
			}

			if (this.m == 2 || this.m == 3 || this.m == 1 || this.m == 4) {
				if (this.m == 1 && this.k.length > 0) {
					this.a((byte) 2);
				}

				byte var34 = this.aa;
				byte var35 = this.aA;
				this.U = 1;
				if (this.n >= this.field_char && this.n <= this.at) {
					this.method_do();
				} else {
					this.method_try();
				}

				String var32 = this.w[var19];
				Object var33 = null;
				Object var29 = null;
				if (this.C == 100) {
					var33 = aE[this.n];
					var29 = W[this.n];
				} else if (this.C == 6) {
					var33 = field_if[this.n];
					var29 = l[this.n];
				} else if (this.C == 5) {
					var33 = as[this.n];
					var29 = field_long[this.n];
				} else {
					var33 = field_int[this.C][this.n];
					var29 = H[this.C][this.n];
				}

				if (var33 == null && var29 == null) {
					if (var33 == null && var29 == null) {
						this.G = null;
						this.a((byte) 2);
						if (var7 == this.n) {
							c_a5.a(131072);
						}
					}
				} else {
					byte var12 = -1;
					int var13 = 0;
					if (this.n > 0) {
						var13 = this.method_if(this.n);
					}

					int[] var14;
					byte var10001;
					boolean var17;
					int var43;
					if ((var14 = this.v[this.n]) == null) {
						var10001 = -1;
					} else {
						char[] var15 = var32.toCharArray();
						var17 = false;
						boolean var11 = false;
						if (var13 == var22) {
							var43 = c_a5.fq.charsWidth(var15, 0, var14[0]);
							int var36 = c_a5.fq.charsWidth(var15, 0, var14[0] + var14[1]);
							if (c_a5.cV >= var43 + this.ap && c_a5.cV <= var36 + this.ap) {
								var12 = 0;
							}
						}

						var10001 = var12;
					}

					this.aA = var10001;
					var30 = var22;
					a3 var20 = this;
					int var38 = 0;
					if (this.n > 0) {
						var38 = this.method_if(this.n);
					}

					int[][] var39 = this.ax[this.n];
					int[][] var40 = this.field_void[this.n];
					if (var39 != null && var40 != null) {
						byte var41 = -1;
						boolean var16 = false;
						var17 = false;
						char[] var37 = var32.toCharArray();

						for (byte var27 = 0; var27 < var39.length; ++var27) {
							var31 = var39[var27][0] + var38;
							int var18 = var40[var27][0] + var38;
							int var42;
							if (var31 == var30 && var18 != var30) {
								var42 = c_a5.fq.charsWidth(var37, 0, var39[var27][1]);
								if (c_a5.cV >= var42 + var20.ap) {
									var41 = var27;
								}
							}

							if (var31 != var30 && var18 == var30) {
								var43 = c_a5.fq.charsWidth(var37, 0, var40[var27][1]);
								if (c_a5.cV <= var43 + var20.ap) {
									var41 = var27;
								}
							}

							if (var31 == var30 && var18 == var30) {
								var42 = c_a5.fq.charsWidth(var37, 0, var39[var27][1]);
								var43 = c_a5.fq.charsWidth(var37, 0, var40[var27][1]);
								if (c_a5.cV >= var42 + var20.ap && c_a5.cV <= var43 + var20.ap) {
									var41 = var27;
								}
							}
						}

						var10001 = var41;
					} else {
						var10001 = -1;
					}

					this.aa = var10001;
					if (this.aa == -1 && this.aA == -1) {
						this.G = null;
						if (this.m != 2) {
							this.a((byte) 2);
							return;
						}

						if (var7 == this.n) {
							c_a5.a(131072);
						}

						return;
					}

					int var23;
					if (this.aA != -1 && this.aa == -1) {
						this.G = null;
						this.a((byte) 4);
						if (var10 == this.n && var35 == this.aA && var35 != -1) {
							c_a5.a(131072);
						}

						Vector var24;
						var22 = Integer.parseInt((var24 = (Vector) var29).elementAt(0).toString());
						var23 = Integer.parseInt(var24.elementAt(1).toString());
						this.G = new int[] { var22, var23 };
						return;
					}

					if (this.aA == -1 && this.aa != -1) {
						this.G = null;
						this.a((byte) 3);
						if (var10 == this.n && var34 == this.aa) {
							c_a5.a(131072);
						}

						Vector[] var21;
						var2 = (Short) ((Short) (var21 = (Vector[]) ((Vector[]) var33))[this.aa].elementAt(0));
						var23 = ((String) ((String) var21[this.aa].elementAt(1))).length();
						this.P = new int[] { var2, var2 + var23 - 1 };
						return;
					}
				}
			}
		}

	}

	private int method_if(int var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			int var4 = c_b5.a(this.k[var3], this.R, c_a5.fq).length;
			var2 += var4;
		}

		return var2;
	}

	public final void method_for() {
		int var3;
		int var6;
		if (c_a5.gZ && c_a5.method_byte(268435456)) {
			boolean var2 = false;
			if (this.i != null) {
				if (this.i.df()) {
					c_a5.a(131072);
					var2 = true;
				} else {
					this.i = null;
					this.method_new();
					var2 = true;
				}
			} else {
				this.method_new();
			}

			var3 = c_a5.il - 18;
			int var4 = c_a5.iA + 4 << 1;
			if (c_a5.a(0, var3, var4, 18)) {
				c_a5.a(131072);
			}

			if (this.Z != null && this.w.length > this.field_try && this.Z.b()) {
				var2 = true;
			}

			if (!var2) {
				var6 = c_a5.ic - (c_a5.iA + 4 << 1);
				var3 = c_a5.il - 18;
				var4 = c_a5.iA + 4 << 1;
				if (c_a5.a(var6, var3, var4, 18)) {
					c_a5.a(262144);
				}
			}
		}

		this.c();
		if (c_a5.method_try(4096)) {
			if (this.i != null) {
				this.i.c8();
			} else if (this.m == 2 || this.m == 3 || this.m == 4) {
				if (this.G != null) {
					this.G = null;
				}

				this.a((byte) 2);
				this.U = 0;
				if (--this.n < 0) {
					this.U = 1;
					this.n = 0;
					if (this.C >= 1 && this.C <= 4 || this.C == 6) {
						this.a((byte) 1);
					}
				} else if (this.n < this.field_char) {
					this.method_try();
				} else {
					this.method_do();
				}
			}

			this.c();
		} else if (c_a5.method_try(8192)) {
			if (this.i != null) {
				this.i.c9();
			} else if (this.m == 1) {
				if (this.k.length > 0) {
					this.a((byte) 2);
				}
			} else if (this.m == 2 || this.m == 3 || this.m == 4) {
				if (this.G != null) {
					this.G = null;
				}

				this.a((byte) 2);
				this.U = 1;
				if (++this.n > this.k.length - 1) {
					this.n = (byte) (this.k.length - 1);
				} else if (this.n > this.at) {
					this.method_try();
				} else {
					this.method_do();
				}
			}

			this.c();
		} else {
			Object var1;
			Vector[] var8;
			Object var11;
			Vector[] var12;
			Vector var14;
			if (c_a5.method_try(16384)) {
				if (this.i == null) {
					var1 = null;
					var8 = null;
					if (this.m == 3 || this.m == 4) {
						if (this.C == 100) {
							var1 = aE[this.n];
							var11 = W[this.n];
						} else if (this.C == 5) {
							var1 = as[this.n];
							var11 = field_long[this.n];
						} else if (this.C == 6) {
							var1 = field_if[this.n];
							var11 = l[this.n];
						} else {
							var1 = field_int[this.C][this.n];
							var11 = H[this.C][this.n];
						}

						if (var1 != null && this.m == 3) {
							if (this.aa >= 0) {
								--this.aa;
								if (this.aa == -1) {
									if (var11 != null) {
										this.a((byte) 4);
										var6 = Integer.parseInt((var14 = (Vector) var11).elementAt(0).toString());
										var3 = Integer.parseInt(var14.elementAt(1).toString());
										this.G = new int[] { var6, var3 };
									} else {
										this.a((byte) 2);
									}

									this.P = null;
								} else {
									short var15 = (Short) ((Short) (var12 = (Vector[]) ((Vector[]) var1))[this.aa]
											.elementAt(0));
									var3 = ((String) ((String) var12[this.aa].elementAt(1))).length();
									this.P = new int[] { var15, var15 + var3 - 1 };
								}
							}
						} else if (this.m == 4) {
							this.a((byte) 2);
							this.G = null;
						}
					}

					this.c();
				}
			} else if (c_a5.method_try(32768)) {
				if (this.i == null) {
					if (this.m == 2 || this.m == 3 || this.m == 4) {
						var1 = null;
						var8 = null;
						if (this.C == 100) {
							var11 = aE[this.n];
							var1 = W[this.n];
						} else if (this.C == 5) {
							var11 = as[this.n];
							var1 = field_long[this.n];
						} else if (this.C == 6) {
							var11 = field_if[this.n];
							var1 = l[this.n];
						} else {
							var11 = field_int[this.C][this.n];
							var1 = H[this.C][this.n];
						}

						if (var1 != null && this.m == 2) {
							this.a((byte) 4);
							var6 = Integer.parseInt((var14 = (Vector) var1).elementAt(0).toString());
							var3 = Integer.parseInt(var14.elementAt(1).toString());
							this.G = new int[] { var6, var3 };
						} else if (var11 != null) {
							if (this.aa == -1) {
								this.a((byte) 3);
								this.G = null;
							}

							++this.aa;
							var6 = (var12 = (Vector[]) ((Vector[]) var11)).length;
							if (this.aa >= var6) {
								this.aa = (byte) (var6 - 1);
							} else {
								short var7 = (Short) ((Short) var12[this.aa].elementAt(0));
								int var13 = ((String) ((String) var12[this.aa].elementAt(1))).length();
								this.P = new int[] { var7, var7 + var13 - 1 };
							}
						}
					}

					this.c();
				}
			} else {
				if (c_a5.method_byte(196608)) {
					if (this.i != null) {
						a3 var9 = this;
						switch (var6 = (Integer) ((Integer) this.i.db().elementAt(this.i.de()))) {
						case -268435456:
							if (this.C == 100) {
								a(ak[this.n], u[this.n], false);
							} else if (this.C == 6) {
								a(s[this.n], aJ[this.n], false);
							} else {
								a(aq[this.C][this.n], z[this.C][this.n], false);
							}
							break;
						case -268435455:
							if (this.C == 6) {
								T = 11;
							} else {
								T = (byte) (this.C + 1);
							}

							aD = -1;
							Y = null;
							this.method_if(true);
							break;
						case -268435454:
						case -268435453:
						case -268435452:
						case -268435451:
						case -268435450:
							if (var6 == -268435450) {
								T = 11;
							} else {
								T = (byte) (var6 - -268435454 + 2);
							}

							aD = -1;
							Y = null;
							this.method_if(true);
							break;
						case 196638:
							if (this.C == 100) {
								c_l.field_try = ak[this.n];
							} else if (this.C == 6) {
								c_l.field_try = s[this.n];
							} else {
								c_l.field_try = aq[this.C][this.n];
							}

							c_a5.eQ.a(196638);
							if (this.i != null) {
								this.i = null;
							}
							break;
						case 589831:
							c_be.gJ = true;
							if (this.C == 100) {
								c_bu.k = ak[this.n];
							} else if (this.C == 6) {
								c_bu.k = s[this.n];
							} else {
								c_bu.k = aq[this.C][this.n];
							}

							c_bg.hP = c_bu.k;
							c_a5.eQ.a(var6);
							c_br.c6();
							break;
						case 589834:
							c_a5.eQ.a(589834);
							c_br.c6();
							break;
						case 589835:
							if (this.C == 100) {
								c_bg.hP = ak[this.n];
							} else if (this.C == 6) {
								c_bg.hP = s[this.n];
							} else {
								c_bg.hP = aq[this.C][this.n];
							}

							c_a5.eQ.a(589835);
							break;
						case 589836:
							if (this.C == 100) {
								c_bg.hP = ak[this.n];
							} else if (this.C == 6) {
								c_bg.hP = s[this.n];
							} else {
								c_bg.hP = aq[this.C][this.n];
							}

							c_a5.eQ.a(589836);
							break;
						case 720897:
							if (this.C == 100) {
								c_bu.k = ak[this.n];
							} else if (this.C == 6) {
								c_bu.k = s[this.n];
							} else {
								c_bu.k = aq[this.C][this.n];
							}

							c_a5.eQ.a(720897);
							break;
						case 1638405:
							c_b5.method_case("聊天加氏族--------------------------");
							if (this.C == 100) {
								c_bt.f = ak[this.n];
							} else if (this.C == 6) {
								c_bt.f = s[this.n];
							} else {
								c_bt.f = aq[this.C][this.n];
							}

							c_a5.eQ.a(var6);
							break;
						case 1835013:
							c_b5.method_case("聊天加诸侯--------------------------");
							if (this.C == 100) {
								c_i.field_long = ak[this.n];
							} else if (this.C == 6) {
								c_i.field_long = s[this.n];
							} else {
								c_i.field_long = aq[this.C][this.n];
							}

							c_a5.eQ.a(var6);
							break;
						default:
							int i = (var6 - -16777216);
							if (i >= 0 && i < c.length) {
								a(c[i], (String) ((String) var9.i.dj().elementAt(var9.i.de())), false);
							}
						}

						this.i = null;
						return;
					}

					switch (this.m) {
					case 0:
						switch (this.C) {
						case 0:
							this.method_do(false);
							return;
						case 100:
							this.a(false);
							return;
						default:
							return;
						}
					case 1:
						if (this.C == 6) {
							T = 11;
						} else {
							T = (byte) (this.C + 1);
						}

						aD = -1;
						Y = null;
						this.method_if(true);
						return;
					case 2:
						switch (this.C) {
						case 0:
							this.method_do(bp.ag().method_new() != aq[this.C][this.n]);
							return;
						case 5:
							return;
						case 100:
							this.a(false);
							return;
						default:
							var1 = null;
							var8 = null;
							String[] var5;
							int[] var10;
							if (this.C != 6 && bp.ag().method_new() != aq[this.C][this.n] && u[this.n].length() != 0) {
								var5 = new String[] { "回复", "输入" };
								var10 = new int[] { -268435456, -268435455 };
							} else {
								var5 = new String[] { "输入" };
								var10 = new int[] { -268435455 };
							}

							this.i = new c_br((byte) 0);
							this.i.a(var5, var10);
							return;
						}
					case 3:
						c_br.c6();
						var1 = null;
						if (this.C == 100) {
							c_ad.k = ak[this.n];
							var1 = aE[this.n];
						} else if (this.C == 5) {
							c_ad.k = y[this.n];
							var1 = as[this.n];
						} else if (this.C == 6) {
							c_ad.k = s[this.n];
							var1 = field_if[this.n];
						} else {
							c_ad.k = aq[this.C][this.n];
							var1 = field_int[this.C][this.n];
						}

						if (var1 != null) {
							c_ad.field_if = (Long) ((Long) (var8 = (Vector[]) ((Vector[]) var1))[this.aa].elementAt(2));
							c_ad.field_new = (Byte) ((Byte) var8[this.aa].elementAt(3));
							c_r.mg = ((int[]) ((int[]) var8[this.aa].elementAt(5)))[2];
							c_a5.eQ.a(655363);
							return;
						}
						break;
					case 4:
						this.a(true);
					}

					return;
				} else if (c_a5.method_byte(262144)) {
					if (this.i != null) {
						this.i = null;
						return;
					}

					c_be.gu = null;
					this.a = null;
					this.A = null;
					this.Z = null;
					this.i = null;
					this.w = null;
					this.h = null;
					this.ao = null;
					this.k = null;
					this.aF = null;
					this.ax = null;
					this.v = null;
					this.field_void = null;
					this.o = null;
					this.j = null;
					c_a5.fE.removeAllElements();
					c_be.cn();
					c_be.cn();
					if (c_a5.es != null
							&& (c_a5.es.g9 == -1610612687 || c_a5.es.g9 == 458773 || c_a5.es.g9 == 262193)) {
						c_a5.A();
					}

					if (c_a5.es != null) {
						c_a5.method_case((byte) 4);
						return;
					}

					if (c_a5.ea != null) {
						c_a5.method_case((byte) 1);
						return;
					}

					c_a5.method_case((byte) 0);
				}

			}
		}
	}

	private final void a(boolean var1) {
		String[] var2 = null;
		Object var3 = null;
		int[] var6;
		if (var1) {
			var2 = new String[] { "回复", "查看详情", "加为好友", "屏蔽玩家", "举报玩家" };
			var6 = new int[] { -268435456, 589831, 589835, 589836, 196638 };
			int var4;
			String var5;
			if (c_bu.e == 0 || c_bu.h == bp.ag().method_new()) {
				var5 = "组队邀请";
				var4 = 720897;
				var2 = c_b5.a(var2, var2.length, var5);
				var6 = c_b5.a(var6, var6.length, var4);
			}

			if (bp.ag().as() != c_i.field_for && bp.ag().as() != c_i.field_void) {
				if (bp.ag().aT() == c_bt.d || bp.ag().aT() == c_bt.field_long) {
					var5 = "招入麾下";
					var4 = 1638405;
					var2 = c_b5.a(var2, var2.length, var5);
					var6 = c_b5.a(var6, var6.length, var4);
				}
			} else {
				var5 = "招入麾下";
				var4 = 1835013;
				var2 = c_b5.a(var2, var2.length, var5);
				var6 = c_b5.a(var6, var6.length, var4);
			}
		} else if (t.length != 0 && u[this.n].length() != 0 && bp.ag().method_new() != ak[this.n]) {
			if (c_z.field_case) {
				var2 = new String[] { "回复", "世界频道", "氏族频道", "场景频道", "组队频道", "喇叭频道" };
				var6 = new int[] { -268435456, -268435454, -268435453, -268435452, -268435451, -268435450 };
			} else {
				var2 = new String[] { "回复", "世界频道", "氏族频道", "场景频道", "组队频道", "喇叭频道", "[好友]" };
				var6 = new int[] { -268435456, -268435454, -268435453, -268435452, -268435451, -268435450, 589834 };
			}
		} else if (c_z.field_case) {
			var2 = new String[] { "世界频道", "氏族频道", "场景频道", "组队频道", "喇叭频道" };
			var6 = new int[] { -268435454, -268435453, -268435452, -268435451, -268435450 };
		} else {
			var2 = new String[] { "世界频道", "氏族频道", "场景频道", "组队频道", "喇叭频道", "[好友]" };
			var6 = new int[] { -268435454, -268435453, -268435452, -268435451, -268435450, 589834 };
		}

		this.i = new c_br((byte) 0);
		this.i.a(var2, var6);
	}

	private final void method_do(boolean var1) {
		String[] var2 = null;
		Object var3 = null;
		int[] var6;
		if (var1) {
			var1 = c_bu.e == 0 || c_bu.h == bp.ag().method_new();
			var6 = new int[(var2 = new String[field_new.length + (var1 ? 3 : 2)]).length];
			var2[0] = "回复";
			var6[0] = -268435456;
			System.arraycopy(field_new, 0, var2, 1, field_new.length);

			int var4;
			for (var4 = 0; var4 < field_for.length; ++var4) {
				var6[var4 + 1] = var4 + -16777216;
			}

			++var4;
			if (!c_z.field_case) {
				var2[var4] = "[好友]";
				var6[var4] = 589834;
			}

			if (var1) {
				++var4;
				var2[var4] = "组队邀请";
				var6[var4] = 720897;
			}

			c = new int[field_for.length];
			System.arraycopy(field_for, 0, c, 0, field_for.length);
		} else {
			if (c_z.field_case) {
				return;
			}

			var6 = new int[(var2 = new String[field_new.length + 1]).length];
			System.arraycopy(field_new, 0, var2, 0, field_new.length);

			for (int var5 = 0; var5 < var6.length - 1; ++var5) {
				var6[var5] = var5 + -16777216;
			}

			var2[var2.length - 1] = "[好友]";
			var6[var6.length - 1] = 589834;
			c = new int[field_for.length];
			System.arraycopy(field_for, 0, c, 0, field_for.length);
		}

		this.i = new c_br((byte) 0);
		this.i.a(var2, var6);
	}

	public final void a(byte var1) {
		this.m = var1;
		switch (var1) {
		case 1:
			this.aa = -1;
			this.aA = -1;
			this.A.a("输入", 0);
			return;
		case 2:
			this.aa = -1;
			this.aA = -1;
			if (this.C == 5) {
				this.A.a("", 0);
				return;
			}

			this.A.a("操作", 0);
			return;
		case 3:
			this.aA = -1;
			this.A.a("查看", 0);
			return;
		case 4:
			this.aa = -1;
			this.A.a("操作", 0);
		default:
		}
	}

	public final void method_if(boolean var1) {
		if (var1) {
			c_be.cn();
		}

		Form var9 = new Form(this.a.aC());
		Image var2 = c_b5.a("/special/face.png");
		final TextField var3 = new TextField("", this.B, 30, 0);
		StringItem var4 = new StringItem("输入物品及任务方式:\n[b数字]背包物品: [b1]", "");
		StringItem var5 = new StringItem("[c数字]仓库物品: [c1]", "");
		StringItem var6 = new StringItem("[z数字]装备物品: [z1]", "");
		StringItem var7 = new StringItem("[r数字]任务名字: [r1]", "");
		StringItem var8 = new StringItem("输入#0~9显示人物表情: #0", "");
		ImageItem var10 = new ImageItem((String) null, var2, 3, (String) null);
		System.out.println("频道：" + T);
		if (T == 1) {
			var3.setLabel("与" + Y + "聊天:");
		} else if (T == 11) {
			var3.setLabel("发送到喇叭频道");
		} else {
			var3.setLabel("发送到" + this.ad[T - 1]);
		}

		var9.append(var3);
		var9.append(var8);
		var9.append(var10);
		var9.append(var4);
		var9.append(var5);
		var9.append(var6);
		var9.append(var7);
		final Command var11 = new Command("发送", 4, 0);
		final Command var12 = new Command(c_bm.a2[1], 2, 1);
		final Command var13 = new Command("插入表情", 4, 1);
		final Command var14 = new Command("插入物品", 4, 1);
		final Command var15 = new Command("插入任务", 4, 1);
		var9.addCommand(var11);
		var9.addCommand(var12);
		var9.addCommand(var13);
		var9.addCommand(var14);
		var9.addCommand(var15);
		var9.setCommandListener(new CommandListener() {
			public final void commandAction(Command var1, Displayable var2) {
				if (var1 == var11) {
					if ("".equals(var3.getString().trim())) {
						return;
					}

					String var3x = var3.getString();
					var3.setString("");
					a3.this.B = "";
					if (var3x.trim().equals("")) {
						return;
					}

					if (a3.T != 11 && System.currentTimeMillis() - c_bm.br[a3.T] < (long) c_bm.c[a3.T]) {
						c_as.a((byte) 0, "您的发言太频繁！", c_bm.a2[2], "", -1, -2);
						c_br.c6();
						c_a5.method_case((byte) 3);
						c_a5.e8.setFullScreenMode(true);
						c_a5.dI.display.setCurrent(c_a5.e8);
						return;
					}

					a3.access$000(a3.this, var3x);
					if (a3.T != 11) {
						c_bm.br[a3.T] = System.currentTimeMillis();
					}

					if (a3.T == 1 && a3.this.C >= 1 && a3.this.C <= 4) {
						(c_be.gu = new a3((byte) 0)).method_byte();
					} else {
						c_br.c6();
					}

					c_a5.method_case((byte) 3);
				} else {
					if (var1 == var12) {
						a3.this.B = "";
						c_a5.method_case((byte) 3);
						c_a5.e8.setFullScreenMode(true);
						c_a5.dI.display.setCurrent(c_a5.e8);
						c_br.c6();
						return;
					}

					if (var1 == var13) {
						a3.this.B = var3.getString();
						c_a5.es = (c_be) c_a5.fE.elementAt(0);
						c_a5.method_case((byte) 4);
						c_a5.es.g9 = -1610612687;
					} else {
						if (var1 == var14) {
							a3.this.B = var3.getString();
							c_a5.es = (c_be) c_a5.fE.elementAt(1);
							if (c_a5.fE.elementAt(1) == null) {
								c_a5.dK = 1;
								c_a5.eQ.a(458773);
								c_a5.method_case((byte) 3);
							} else {
								c_a5.method_case((byte) 4);
								c_a5.es.ck();
							}

							c_a5.e8.setFullScreenMode(true);
							c_a5.dI.display.setCurrent(c_a5.e8);
							return;
						}

						if (var1 != var15) {
							return;
						}

						a3.this.B = var3.getString();
						c_a5.es = (c_be) c_a5.fE.elementAt(2);
						if (c_a5.fE.elementAt(2) == null) {
							c_a5.dK = 2;
							c_a5.eQ.a(262193);
							c_a5.method_case((byte) 3);
						} else {
							c_a5.method_case((byte) 4);
							c_a5.es.ck();
						}
					}
				}

				c_a5.e8.setFullScreenMode(true);
				c_a5.dI.display.setCurrent(c_a5.e8);
			}
		});
		c_a5.dI.display.setCurrent(var9);
	}

	public static final void a(int var0, String var1, boolean var2) {
		T = 1;
		aD = var0;
		Y = var1;
		if (var2) {
			(c_be.gu = new a3((byte) 0)).method_byte();
		}

		c_a5.method_case((byte) 3);
		c_be.gu.method_if(true);
	}

	static void access$000(a3 parama3, String paramString) {
		// FIXME 自定义反编译
		char[] c = paramString.toCharArray();
		ag = new Vector[0];
		for (int i = 0; i < c.length; i++) {
			if (c[i] != '[')
				continue;
			int i1 = 0;
			if (i + 2 > c.length - 1)
				break;
			if ((i + 3 < c.length) && (c[(i + 3)] == ']'))
				i1 = 1;
			else if ((i + 4 < c.length) && (c[(i + 4)] == ']'))
				i1 = 2;
			byte b1 = 0;
			switch (c[(i + 1)]) {
			case 'b':
				b1 = 1;
				break;
			case 'c':
				b1 = 2;
				break;
			case 'z':
				b1 = 3;
				break;
			case 'r':
				b1 = 20;
				break;
			case 't':
				if (c[(i + 2)] != ']')
					break;
				c = c_b5.method_if(c, i, 3);
				c_l.method_do();
				String str = c_l.g.method_byte();
				c = c_b5.a(c, i, str.toCharArray());
				i = (i + (str.length() - 1));
			}
			if (b1 == 0)
				continue;
			byte b2 = -1;
			switch (i1) {
			case 1:
				if ((c[(i + 2)] < '0') || (c[(i + 2)] > '9'))
					break;
				b2 = (byte) (c[(i + 2)] - '0' - 1);
				break;
			case 2:
				if ((c[(i + 2)] < '0') || (c[(i + 2)] > '9')
						|| (c[(i + 3)] < '0') || (c[(i + 3)] > '9'))
					break;
				b2 = (byte) ((c[(i + 2)] - '0') * 10 + (c[(i + 3)] - '0') - 1);
			}
			if (b2 < 0)
				{continue;}
			Vector v = new Vector();
			v.addElement(new Short((short)i));
			v.addElement(new Byte(b1));
			v.addElement(new Byte(b2));
			ag = c_b5.a(ag, ag.length, v);
			i1 = i1 == 1 ? 4 : 5;
			c = c_b5.method_if(c, i, i1);
			--i;
		}
		Q = new String(c);
		c_a5.eQ.a(655361);
	}
}
