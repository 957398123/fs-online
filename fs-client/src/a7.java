import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2021/01/21
 * 
 * @author 95739
 *
 */
public final class a7 extends ba {
	private short fK;
	private short fA;
	private bi eW;
	private String fx;
	private byte fL;
	private bz fe;
	private boolean e5;
	private byte eA;
	private boolean eI;
	private Image[] eV;
	private Image e0;
	private short ff;
	public boolean eT;
	public byte ei;
	public boolean ft;
	private short eC;
	public boolean fz;
	private short fm;
	public byte fd;
	private boolean fG;
	private String eH;
	private short et;
	private short eU;
	private int fD;
	private byte fy;
	private byte ew;
	public static byte fF;
	public byte el;
	private boolean fI;
	public byte eK;
	public byte eD;
	public int fg;
	private short eu;
	private short eF;
	private short es;
	private short er;
	public byte eJ;
	public static byte fs;
	public static byte eB;
	public static byte e3;
	public c_b eo;
	private short eQ;
	public boolean eY;
	private byte e8;
	private String en;
	private String eR;
	private byte eG;
	private String fq;
	private byte fB;
	private int eE;
	private int e6;
	private byte e2;
	private byte eO;
	public byte fC;
	public static boolean ej;
	public static boolean em;

	public final void method_if(short var1, boolean var2) {
		if (var2) {
			eC = c_r.k(var1);
		} else {
			eC = var1;
		}
	}

	public final short bK() {
		return fm;
	}

	public final void e(short var1) {
		fm = c_r.k(var1);
	}

	public final short bu() {
		return eQ;
	}

	public final void c(short var1) {
		eQ = var1;
	}

	public final void method_void(short var1) {
		ff = var1;
	}

	public a7(short var1, short var2, short var3, short var4, String var5, byte var6, c_be var7) {
		super(var1, var2, var3, var4, var7);
		fL = -1;
		fe = null;
		e5 = false;
		eA = 0;
		eI = false;
		eV = new Image[3];
		e0 = null;
		ff = 1;
		eT = false;
		ei = -1;
		ft = false;
		eC = -1;
		fz = false;
		fm = -1;
		fd = -1;
		fG = false;
		eH = null;
		et = 0;
		eU = 0;
		fD = 0;
		fy = -1;
		ew = -1;
		el = -1;
		fI = false;
		eK = -1;
		eD = -1;
		fg = 0;
		eu = 0;
		eF = 0;
		es = 0;
		er = 0;
		eJ = -1;
		eQ = 0;
		eY = false;
		e8 = 0;
		en = "";
		eR = "";
		eG = 0;
		fq = "";
		fB = 0;
		eE = 0;
		e6 = 0;
		e2 = 1;
		eO = 0;
		fC = 0;

		try {
			c_be.gf.getClass();
		} catch (Exception var8) {
			c_a5.dI.notifyDestroyed();
		}

		super.y = var6;
		if (var6 != 4 && var6 != 5) {
			if (var5 != null && !var5.equals("")) {
				bi var9;
				if (var5.equals("exp.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 43, true);
				} else if (var5.equals("t-0.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 10, true);
				} else if (var5.equals("u-6.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 57, true);
				} else if (var5.equals("u-7.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 58, true);
				} else if (var5.equals("u-8.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 67, true);
				} else if (var5.equals("u-9.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 64, true);
				} else if (var5.equals("u-4.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					if (bo.q != 1 && bo.q != 9) {
						if (bo.q == 0 || bo.q == 10) {
							method_if((short) 63, true);
						}
					} else {
						method_if((short) 65, true);
					}
				} else if (var5.equals("u-1.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 65, true);
				} else if (var5.equals("u-3.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 63, true);
				} else if (var5.equals("long.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 72, true);
					fC = 5;
				} else if (var5.equals("cross.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					method_if((short) 73, true);
					fC = 4;
				} else if (var5.equals("clanctr.png")) {
					var9 = c_a5.gg;
					eW = var9;
					ft = true;
					eC = 44;
					fC = 2;
				}
			} else {
				eW = null;
			}
		}

		if (var6 == 3 || var6 == 1 || var6 == 2 || var6 == 0) {
			super.b = true;
		}

		if (super.y == 1 || super.y == 3) {
			if (eW != null && eW.field_if != null && !ft) {
				fK = (short) eW.field_if.getWidth();
			} else {
				fK = 14;
			}

			super.a = fK;
		}

		if (super.y == 1 || super.y == 3) {
			if (eW != null && eW.field_if != null && !ft) {
				fA = (short) eW.field_if.getHeight();
			} else {
				fA = 14;
			}

			super.field_int = fA;
		}

	}

	public a7(short var1, short var2, String var3, String var4, byte var5, c_be var6) {
		this(var1, var2, (short) 0, (short) 0, var3, var5, var6);
	}

	public a7(short var1, short var2, c_be var3) {
		this((short) 21, var2, (short) 0, (short) 0, "", (byte) 5, var3);
	}

	public final void a(Graphics var1) {
		int var2;
		int var3;
		if (super.y == 0) {
			var1.setColor(c_bm.an);
			var1.drawRect(super.k, super.j, super.a - 1, super.field_int - 1);
			var1.setColor(c_bm.am);
			var1.drawRect(super.k + 1, super.j + 1, super.a - 3, super.field_int - 3);
			var1.setColor(c_bm.an);
			var1.drawRect(super.k + 2, super.j + 2, super.a - 5, super.field_int - 5);
			var1.setColor(c_bm.o);
			var1.fillRect(super.k + 3, super.j + 3, super.a - 6, super.field_int - 6);
			var1.drawImage(c_a5.gr, super.k, super.j, 20);
			c_b5.a(var1, c_a5.gr, super.k + super.a - c_a5.gr.getWidth(), super.j, 2);
			c_b5.a(var1, c_a5.gr, super.k, super.j + super.field_int - c_a5.gr.getHeight(), 1);
			c_b5.a(var1, c_a5.gr, super.k + super.a - c_a5.gr.getWidth(),
					super.j + super.field_int - c_a5.gr.getHeight(), 3);
			boolean var6 = false;
			boolean var7 = false;
			if (c_a5.method_else() == 5) {
				if (fG) {
					if (ff < 100) {
						var2 = super.k + (super.a - (c_a5.eR.field_try << 1) - 2) / 2;
					} else if ((var2 = super.k + (super.a - c_a5.eR.field_try * 3 - 4) / 2) < super.k) {
						var2 = super.k;
					}

					if ((var3 = super.j + (super.field_int - 30 - c_a5.eR.a - 3) / 2) < super.j) {
						var3 = super.j;
					}

					c_b5.a(var1, ff, var2, var3 - 1);
					eu = 27;
					eF = 30;
					es = (short) (super.a >= eu ? super.k + (super.a - eu) / 2 : super.k - (eu - super.a) / 2);
					er = (short) (var3 + c_a5.eR.a + 3);
				} else {
					eu = 27;
					eF = 30;
					es = (short) (super.a >= eu ? super.k + (super.a - eu) / 2 : super.k - (eu - super.a) / 2);
					er = (short) (super.j + (super.field_int - 30) / 2);
				}

				if (fe != null) {
					fe.d();
					fe.a(var1, (short) (eu / 2 + es), (short) (er + 30));
				}

				if (am.field_new > 0) {
					eu = (short) c_a5.fh.getWidth();
					eF = (short) c_a5.fh.getHeight();
					es = (short) (super.a >= eu ? super.k + (super.a - eu) / 2 : super.k - (eu - super.a) / 2);
					er = (short) (super.j + (super.field_int - c_a5.fh.getHeight()) / 2);
					e2 = (byte) (e2 ^ 1);
					short var4 = (short) (er + e2);
					short var8 = es;
					var1.drawImage(c_a5.fh, var8, var4, 20);
				}
			}

			if (c_a5.gA == null || c_a5.method_else() != 17 && c_a5.df != 17) {
				if (c_a5.method_else() == 18 || c_a5.df == 18 || c_a5.method_else() == 18) {
					eu = 27;
					eF = 30;
					es = (short) (super.a >= eu ? super.k + (super.a - eu) / 2 : super.k - (eu - super.a) / 2);
					er = (short) (super.j + (super.field_int - eF) / 2 + eF / 2 + 15);
					if (eo != null) {
						eo.a(var1, (short) (eu / 2 + es), er, true);
					}
				}
			} else {
				eu = 27;
				eF = 30;
				es = (short) (super.a >= eu ? super.k + (super.a - eu) / 2 : super.k - (eu - super.a) / 2);
				if (eW != null && eW.field_if != null) {
					if ((var3 = super.j + (super.field_int - eW.field_if.getHeight()) / 2) < super.j) {
						var3 = super.j;
					}

					er = (short) var3;
					er = (short) (er + eF / 2 + 12);
				} else {
					if ((var3 = super.j + (super.field_int - eF) / 2) < super.j) {
						var3 = super.j;
					}

					er = (short) var3;
					er = (short) (er + eF / 2 + 15);
				}

				if (eo != null) {
					eo.a(var1, (short) (eu / 2 + es), er, true);
				}

				if (q()) {
					var1.drawImage(c_a5.gA, super.k + super.a - c_a5.gA.getWidth() / 2,
							super.j + super.field_int - c_a5.gA.getHeight() / 2, 20);
				}
			}

			if (c_a5.es != null && c_a5.es.g9 == 2097155) {
				for (int var5 = 0; var5 < 7; ++var5) {
					by.field_goto[var5] = (a7) c_a5.es.cf().elementAt(var5 + 10);
					c_a5.gg.method_if(var1, by.field_goto[var5].k + (by.field_goto[var5].method_for() >> 1) - 7,
							by.field_goto[var5].j + (by.field_goto[var5].z() >> 1) - 7, by.field_byte[var5]);
				}
			}

		} else {
			if (super.y == 1) {
				if (!eI) {
					method_if(var1, fK, fA);
				}

				if (eW != null) {
					if (eW.field_if == null) {
						throw new IllegalArgumentException("图像不存在");
					}

					var2 = eI ? super.k : super.k + 1;
					var3 = eI ? super.j : super.j + 1;
					if (ft) {
						if (fC > -1) {
							var1.setColor(c_bm.O[fC][0]);
							var1.fillRect(var2, var3, eW.field_try, eW.a);
							eW.method_if(var1, var2, var3, eC);
							var1.setColor(c_bm.O[fC][1]);
							var1.drawRect(var2 - 1, var3 - 1, eW.field_try + 1, eW.a + 1);
						}
					} else {
						eW.a(var1, var2, var3, 0);
					}
				}

				if (eI) {
					var1.setColor(c_bm.V);
					var1.drawRect(super.k, super.j, fK - 1, fA - 1);
				}

				if (e5) {
					a(var1, super.k, super.j, eA);
				}

				if (c_a5.es.g9 == 2555905) {
					if (e8 == 0) {
						var1.drawImage(c_a5.e3, super.k, super.j, 20);
					} else {
						var1.setColor(eE);
						var1.drawRect(super.k, super.j, method_for() + 1, z() + 1);
					}
				}

				if (c_a5.es.g9 == 3342340 && e8 == 0) {
					var1.drawImage(c_a5.e3, super.k, super.j, 20);
				}

				if (q() && c_a5.gA != null) {
					if (eJ != -1) {
						c_b5.a(var1, c_a5.gA, super.k - 12, super.j + 2, 2);
					} else if (c_a5.es.g9 != 1900547 && c_a5.es.g9 != 2031621 && c_a5.es.g9 != 2031636
							&& c_a5.es.g9 != 2228225 && c_a5.es.g9 != 1966097 && c_a5.es.g9 != 458760
							&& c_a5.es.g9 != 1179658 && c_a5.es.g9 != 2555905 && c_a5.es.g9 != 2555911
							&& c_a5.es.g9 != 3145729 && c_a5.es.g9 != 3145730 && c_a5.es.g9 != 2228256
							&& c_a5.es.g9 != 3342340 && c_a5.es.g9 != 3342356 && c_a5.es.g9 != 917525) {
						var1.drawImage(c_a5.gA, super.k + 10, super.j + 10, 20);
					} else {
						c_b5.method_int(var1, super.k, super.j, super.a + 2, super.field_int + 2);
					}
				}

				if (fI) {
					c_b5.method_int(var1, super.k, super.j, fK + 2, fA + 2);
					return;
				}
			} else if (super.y == 2) {
				if (eW != null) {
					if (eW.field_if == null) {
						throw new IllegalArgumentException("图像不存在");
					}

					if (eT) {
						eW.method_if(var1, super.k, super.j, ei);
					} else {
						eW.a(var1, super.k, super.j, fg);
					}
				}

				if (q() && c_a5.gA != null) {
					var1.drawImage(c_a5.gA, super.k + 10, super.j + 10, 20);
					return;
				}
			} else if (super.y == 3) {
				method_if(var1, 14, 14);
				if (fx != null && !fx.equals("")) {
					var2 = super.k + (16 - c_b5.method_do(fx)) / 2;
					var3 = super.j + (16 - c_a5.iG) / 2;
					var1.setColor(c_bm.a1);
					var1.drawString(fx, var2, var3, 20);
				}

				if (eW != null) {
					if (eW.field_if == null) {
						throw new IllegalArgumentException("图像不存在");
					}

					if (fz) {
						if (fC > -1) {
							var1.setColor(c_bm.O[fC][0]);
							var1.fillRect(super.k + 1, super.j + 1, eW.field_try, eW.a);
							eW.method_if(var1, super.k + 1, super.j + 1, fm);
							var1.setColor(c_bm.O[fC][1]);
							var1.drawRect(super.k, super.j, eW.field_try + 1, eW.a + 1);
						}
					} else {
						eW.a(var1, super.k + 1, super.j + 1, 0);
					}
				}

				if (fI) {
					c_b5.method_int(var1, super.k, super.j, eW.field_try + 1, eW.a + 1);
					return;
				}
			} else {
				if (super.y == 4) {
					switch (fL) {
					case 0:
						eV[0] = c_a5.e9;
						eV[1] = c_a5.e9;
						eV[2] = c_a5.e9;
						break;
					case 1:
						eV[0] = c_a5.f7;
						eV[1] = c_a5.f7;
						eV[2] = c_a5.f7;
						break;
					case 2:
						eV[0] = c_a5.f7;
						eV[1] = c_a5.f7;
						eV[2] = c_a5.e9;
						break;
					case 3:
						eV[0] = c_a5.e9;
						eV[1] = c_a5.f7;
						eV[2] = c_a5.f7;
						break;
					case 4:
						eV[0] = c_a5.e9;
						eV[1] = c_a5.f7;
						eV[2] = c_a5.e9;
						break;
					case 5:
						eV[0] = c_a5.f7;
						eV[1] = c_a5.e9;
						eV[2] = c_a5.f7;
						break;
					case 6:
						eV[0] = c_a5.f7;
						eV[1] = c_a5.e9;
						eV[2] = c_a5.e9;
						break;
					case 7:
						eV[0] = c_a5.e9;
						eV[1] = c_a5.e9;
						eV[2] = c_a5.f7;
					}

					for (var2 = 0; var2 < eV.length; ++var2) {
						var1.drawImage(eV[var2], super.k, super.j + var2 * (c_a5.e9.getHeight() + 1), 20);
					}

					return;
				}

				if (super.y == 5) {
					e0 = c_a5.fv;
					var1.drawImage(e0, super.k, super.j, 20);
				}
			}

		}
	}

	public final void f(Graphics var1) {
		if (c_a5.es.g9 == 2097155) {
			a7 var2;
			if ((var2 = this).q()) {
				c_b5.a(var1, var2.fx, var2.k + (16 - c_b5.method_do(var2.fx)) / 2, var2.j + (16 - c_a5.iG) / 2, c_bm.a1,
						c_bm.cE);
			}

		} else {
			if (q() && c_a5.gA != null) {
				var1.drawImage(c_a5.gA, super.k + 10, super.j + 10, 20);
			}

		}
	}

	public final bi bE() {
		return eW;
	}

	public final void a(bi var1) {
		eW = var1;
	}

	public final void method_case(String var1) {
		if (var1 != null && var1.length() == 1 && super.y == 3) {
			c_b5.method_case("---设置文字 = " + var1);
			fx = var1;
		}
	}

	private void method_if(Graphics var1, int var2, int var3) {
		method_if(var1, super.k, super.j, var2, var3);
	}

	public static void method_if(Graphics var0, int var1, int var2, int var3, int var4) {
		var0.setColor(c_bm.V);
		var0.drawRect(var1, var2, var3 + 1, var4 + 1);
		var0.setColor(c_bm.bX);
		var0.fillRect(var1 + 1, var2 + 1, var3, var4);
	}

	public static void a(Graphics var0, int var1, int var2, int var3) {
		var1 = var1 + 14 + 2 - 2 * c_a5.cG.field_try + 1;
		var2 = var2 + 14 + 2 - c_a5.cG.a;
		c_a5.cG.method_if(var0, var1, var2, var3 / 10);
		c_a5.cG.method_if(var0, var1 + c_a5.cG.field_try - 1, var2, var3 % 10);
	}

	public final void f(byte var1) {
		if (var1 >= 0 && var1 <= 7) {
			fL = var1;
		} else {
			throw new IllegalArgumentException("八卦类型不符合");
		}
	}

	public final void g(boolean var1) {
		e5 = var1;
	}

	public final void a(boolean var1, byte var2) {
		e5 = var1;
		if (var1) {
			method_long(var2);
		}

	}

	public final byte b0() {
		return eA;
	}

	public final void method_long(byte var1) {
		if (var1 >= 0 && var1 <= 99) {
			eA = var1;
		} else {
			throw new IllegalArgumentException("物品数量参数不符合要求");
		}
	}

	public final void i(boolean var1) {
		eI = var1;
	}

	public final void f(boolean var1) {
		fG = var1;
	}

	public final String bv() {
		return eH;
	}

	public final void method_else(String var1) {
		eH = var1;
	}

	public final void f() {
		if (q()) {
			int[] var7;
			a7 var12;
			a7 var23;
			if (super.field_byte) {
				if (c_a5.method_try(4096)) {
					y().c8();
					return;
				}

				if (c_a5.method_try(8192)) {
					y().c9();
					return;
				}

				if (!c_a5.method_byte(65536) && !c_a5.method_byte(131072)) {
					if (c_a5.method_byte(262144)) {
						super.field_byte = false;
						y().da();
						return;
					}
				} else {
					y().dc();
					int var17;
					if (super.y == 3) {
						switch (super.r) {
						case 16:
							switch (eO) {
							case 0:
								switch (c_a5.es.g9) {
								case 458817:
									var17 = (Integer) y().db().elementAt(y().de());
									bb.field_void = fF;
									bb.field_do = 2;
									if (var17 == 3342338) {
										am.a = false;
									}

									c_a5.eQ.a(var17);
									super.field_byte = false;
									return;
								case 939349:
									var17 = (Integer) y().db().elementAt(y().de());
									bx.a = 1;
									bx.field_for = fF;
									if (var17 == 3342338) {
										am.a = false;
									}

									c_a5.eQ.a(var17);
									super.field_byte = false;
									return;
								case 1966086:
									var17 = (Integer) y().db().elementAt(y().de());
									au.field_if = 2;
									au.field_int = fF;
									if (var17 == 3342338) {
										am.a = false;
									}

									c_a5.eQ.a(var17);
									super.field_byte = false;
									return;
								default:
									if (fm == -1) {
										c_a5.eQ.a(2425072);
										super.field_byte = false;
										return;
									}

									switch (var17 = (Integer) y().db().elementAt(y().de())) {
									case 917506:
										c_a5.eQ.a(var17);
										super.field_byte = false;
										return;
									case 917507:
										au.field_if = 2;
										au.field_case = 0;
									case 3342338:
										c_a5.eQ.a(var17);
										super.field_byte = false;
										return;
									case 1245185:
										c_be.a((byte) 1, (int) ew);
										super.field_byte = false;
										return;
									case 2425072:
										c_a5.eQ.a(var17);
										super.field_byte = false;
										return;
									}
								}
							default:
								return;
							}
						case 115:
							switch (eO) {
							case 0:
								if ((var17 = (Integer) y().db().elementAt(y().de())) == 3342338) {
									am.a = false;
								}

								c_a5.eQ.a(var17);
								super.field_byte = false;
								return;
							}
						default:
							return;
						}
					} else if (super.y != 1) {
						if (super.y == 0) {
							return;
						}
					} else {
						int var24;
						if (eJ != -1) {
							fs = eK;
							eB = eD;
							if ((var17 = (Integer) y().db().elementAt(y().de())) == 0) {
								if (eK == 1) {
									c_b5.method_int();
									e3 = eD;
									fI = true;
									super.field_byte = false;
								}
							} else if (var17 == 262150) {
								if (bf.field_for) {
									if (e3 == -1) {
										(c_a5.gQ = new c_as((byte) 0, (c_be) null)).a((byte) 5, c_bm.dt,
												"请于下方选择一样物品作为您的附加奖励", c_bm.a2[2], "", -1, -1);
										super.field_byte = false;
									} else {
										c_a5.eQ.a(var17);
										super.field_byte = false;
									}
								} else {
									c_a5.eQ.a(var17);
									super.field_byte = false;
								}
							} else if (var17 == 1245185) {
								var24 = fs * 10 + eB;
								c_b5.method_case("物品IDEX " + var24);
								an.a = true;
								c_be.a((byte) 5, var24);
								super.field_byte = false;
							} else if (var17 == -1) {
								super.field_byte = false;
							} else {
								c_a5.eQ.a(var17);
								super.field_byte = false;
							}
						} else {
							label913: switch (super.r) {
							case 34:
								if (ej && em) {
									if (eC != -1) {
										switch (y().de()) {
										case 0:
											ba.i();
											c_a5.eQ.a(1376267);
											super.field_byte = false;
											break label913;
										case 1:
											c_a5.eQ.a(1376266);
											super.field_byte = false;
										}
									} else {
										switch (y().de()) {
										case 0:
											c_a5.eQ.a(1376266);
											super.field_byte = false;
										}
									}
								} else if (ej && !em) {
									if (eC != -1) {
										switch (y().de()) {
										case 0:
											ba.i();
											c_a5.eQ.a(1376267);
											super.field_byte = false;
										}
									}
								} else if (!ej) {
									if (eC != -1) {
										switch (y().de()) {
										case 0:
											ba.i();
											c_a5.eQ.a(1376267);
											super.field_byte = false;
											break label913;
										case 1:
											ba.i();
											c_a5.eQ.a(1376268);
											super.field_byte = false;
											break label913;
										case 2:
											c_a5.eQ.a(1376264);
											super.field_byte = false;
											break label913;
										case 3:
											c_a5.eQ.a(1376265);
											super.field_byte = false;
											break label913;
										case 4:
											c_a5.eQ.a(1376266);
											super.field_byte = false;
										}
									} else {
										switch (y().de()) {
										case 0:
											if (c_a5.fE.size() == 0) {
												c_a5.eQ.a(1376263);
											} else {
												c_a5.es = (c_be) c_a5.fE.elementAt(0);
											}

											super.field_byte = false;
											break label913;
										case 1:
											c_a5.eQ.a(1376264);
											super.field_byte = false;
											break label913;
										case 2:
											c_a5.eQ.a(1376265);
											super.field_byte = false;
											break label913;
										case 3:
											c_a5.eQ.a(1376266);
											super.field_byte = false;
										}
									}
								}
								break;
							case 35:
								if (em && ej) {
									if (eC != -1) {
										switch (y().de()) {
										case 0:
											ba.i();
											c_a5.eQ.a(1376267);
											super.field_byte = false;
											break;
										case 1:
											c_a5.eQ.a(1376266);
											super.field_byte = false;
										}
									}
								} else if (eC != -1) {
									switch (y().de()) {
									case 0:
										ba.i();
										c_a5.eQ.a(1376267);
										super.field_byte = false;
									}
								}
							}
						}

						int var14;
						Object var21;
						if (c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703952 || c_a5.es.g9 == 1703938) {
							var17 = (Integer) y().db().elementAt(y().de());
							if (eC == -1) {
								switch (var17) {
								case -1610612712:
									c_q.j = 0;
									c_r.ed();
									c_q.method_if();
									break;
								case -1610612711:
									c_q.method_for();
									break;
								case 1703946:
									c_q.j = 0;

									for (var24 = 0; var24 < 6; ++var24) {
										for (var14 = 0; var14 < 4; ++var14) {
											c_r.mE[var24][var14] = c_q.field_int[var24][var14];
										}
									}

									for (var24 = 0; var24 < c_r.mE.length; ++var24) {
										if (c_r.mE[var24][0] != -1 && c_q.j < c_r.mE.length) {
											++c_q.j;
										}
									}

									c_a5.eQ.a(1703946);
									break;
								default:
									c_a5.eQ.a(var17);
								}
							} else if (eC != -1) {
								switch (var17) {
								case -1610612712:
									c_q.j = 0;
									c_r.ed();
									c_q.method_if();
									break;
								case -1610612711:
									c_q.method_for();
									break;
								case -1610612710:
									fC = 0;
									ft = false;
									eC = -1;
									var21 = null;
									eW = (bi) var21;
									c_r.eg();
									c_q.method_if();
									break;
								default:
									c_a5.eQ.a(var17);
								}
							}

							super.field_byte = false;
							return;
						}

						if (c_a5.es.g9 != 1703940 && c_a5.es.g9 != 1703941) {
							if (c_a5.es.g9 == 1900547) {
								if (bw.a == 1) {
									switch ((Integer) y().db().elementAt(y().de())) {
									case -1610612714:
										bw.method_if((byte) 1);
										break;
									case -1610612713:
										bw.method_do();
									}

									super.field_byte = false;
									return;
								}
							} else {
								boolean var6;
								int var19;
								ah var20;
								if (c_a5.es.g9 == 2031621) {
									var12 = (a7) c_a5.es.cf().elementAt(4);
									var23 = (a7) c_a5.es.cf().elementAt(6);
									var20 = (ah) c_a5.es.cf().elementAt(14);
									switch ((Integer) y().db().elementAt(y().de())) {
									case -1610612707:
										if (var12.q()) {
											aq.field_for = 1;
											var12.a(false, c_a5.es);
										} else if (var23.q()) {
											aq.field_for = 2;
											var23.a(false, c_a5.es);
										}

										((c_r) c_a5.es.cf().elementAt(9)).a(true, c_a5.es);
										break;
									case -1610612704:
										for (var19 = 0; var19 < c_r.mY.length; ++var19) {
											c_r.mY[var19] = -1;
										}

										if (var12.q()) {
											var6 = false;
											var12.e5 = var6;
											var12.ft = false;
											var21 = null;
											var12.eW = (bi) var21;
											aq.a = -1;
											var20.method_char(c_bm.bP);
											var20.a("此处放置原石");
										} else if (var23.q()) {
											var6 = false;
											var23.e5 = var6;
											var23.ft = false;
											var21 = null;
											var23.eW = (bi) var21;
											aq.field_int = -1;
											var20.method_char(c_bm.bP);
											var20.a("此处放置雕琢符");
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
										if (var12.q()) {
											aq.field_do = aq.a;
										} else if (var23.q()) {
											aq.field_do = aq.field_int;
										}

										c_a5.eQ.a(2031635);
										break;
									case 2031649:
										c_a5.eQ.a(2031649);
									}

									super.field_byte = false;
									return;
								}

								if (c_a5.es.g9 == 2031636) {
									var12 = (a7) c_a5.es.cf().elementAt(4);
									var23 = (a7) c_a5.es.cf().elementAt(6);
									var20 = (ah) c_a5.es.cf().elementAt(14);
									switch ((Integer) y().db().elementAt(y().de())) {
									case -1610612707:
										if (var12.q()) {
											aq.field_for = 1;
											var12.a(false, c_a5.es);
										} else if (var23.q()) {
											aq.field_for = 2;
											var23.a(false, c_a5.es);
										}

										((c_r) c_a5.es.cf().elementAt(9)).a(true, c_a5.es);
										break;
									case -1610612704:
										var20.method_char(c_bm.bP);
										var20.a("此处放置开封的装备");

										for (var19 = 0; var19 < c_r.mY.length; ++var19) {
											c_r.mY[var19] = -1;
										}

										if (var12.q()) {
											var6 = false;
											var12.e5 = var6;
											var12.ft = false;
											var21 = null;
											var12.eW = (bi) var21;
											aq.a = -1;
											var20.method_char(c_bm.bP);
											var20.a("此处放置开封的装备");
										} else if (var23.q()) {
											var6 = false;
											var23.e5 = var6;
											var23.ft = false;
											var21 = null;
											var23.eW = (bi) var21;
											aq.field_int = -1;
											var20.method_char(c_bm.bP);
											var20.a("此处放置开封卷轴");
										}
										break;
									case -1610612635:
										fF = 20;
										c_r.nf = true;
										c_a5.eQ.a(2425072);
										break;
									case -1610612634:
										fF = 21;
										c_r.nf = true;
										c_a5.eQ.a(2425072);
										break;
									case 2031617:
										if (var12.q()) {
											aq.field_do = aq.a;
										} else if (var23.q()) {
											aq.field_do = aq.field_int;
										}

										c_a5.eQ.a(2031635);
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
									}

									super.field_byte = false;
									return;
								}

								byte var5;
								if (c_a5.es.g9 == 3342356) {
									var12 = (a7) c_a5.es.cf().elementAt(4);
									var23 = (a7) c_a5.es.cf().elementAt(6);
									var20 = (ah) c_a5.es.cf().elementAt(14);
									switch ((Integer) y().db().elementAt(y().de())) {
									case -1610612707:
										if (var12.q()) {
											var12.a(false, c_a5.es);
										} else if (var23.q()) {
											var23.a(false, c_a5.es);
										}

										((c_r) c_a5.es.cf().elementAt(9)).a(true, c_a5.es);
										break;
									case -1610612704:
										var20.method_char(c_bm.bP);
										var20.a("此处放置需要铭刻的法宝");

										for (var19 = 0; var19 < c_r.mY.length; ++var19) {
											c_r.mY[var19] = -1;
										}

										if (var12.q()) {
											var6 = false;
											var12.e5 = var6;
											var12.ft = false;
											var21 = null;
											var12.eW = (bi) var21;
											aq.a = -1;
											var20.method_char(c_bm.bP);
											var20.a("此处放置需要铭刻的法宝");
										} else if (var23.q()) {
											var6 = false;
											var23.e5 = var6;
											var23.ft = false;
											var21 = null;
											var23.eW = (bi) var21;
											aq.field_int = -1;
											var20.method_char(c_bm.bP);
											var20.a("此处放置法宝铭文");
										}
										break;
									case 2031617:
										if (var12.q()) {
											aq.field_do = aq.a;
											var5 = c_r.mp;
											c_r.mp = aq.a;
											am.a = false;
											c_a5.eQ.a(3342337);
											c_r.mp = var5;
										} else if (var23.q()) {
											aq.field_do = aq.field_int;
											c_a5.eQ.a(2031635);
										}
										break;
									case 3342359:
										if (aq.a == -1) {
											c_as.a((byte) 0, "您还没有放入法宝，无法进行铭刻。", "确定", "", -1, -2);
											super.field_byte = false;
											return;
										}

										if (aq.field_int == -1) {
											c_as.a((byte) 0, "您还没有放入法宝铭文，无法进行铭刻。。", "确定", "", -1, -2);
											super.field_byte = false;
											return;
										}

										c_a5.eQ.a(3342359);
										break;
									case 3342361:
										c_a5.eQ.a(3342361);
									}

									super.field_byte = false;
									return;
								}

								if (c_a5.es.g9 == 917525) {
									var12 = (a7) c_a5.es.cf().elementAt(4);
									var23 = (a7) c_a5.es.cf().elementAt(6);
									var20 = (ah) c_a5.es.cf().elementAt(14);
									switch ((Integer) y().db().elementAt(y().de())) {
									case -1610612707:
										if (var12.q()) {
											var12.a(false, c_a5.es);
										} else if (var23.q()) {
											var23.a(false, c_a5.es);
										}

										((c_r) c_a5.es.cf().elementAt(9)).a(true, c_a5.es);
										break;
									case -1610612704:
										var20.method_char(c_bm.bP);
										var20.a("此处放置需要强化的装备");

										for (var19 = 0; var19 < c_r.mY.length; ++var19) {
											c_r.mY[var19] = -1;
										}

										if (var12.q()) {
											var6 = false;
											var12.e5 = var6;
											var12.ft = false;
											var21 = null;
											var12.eW = (bi) var21;
											aq.a = -1;
											var20.method_char(c_bm.bP);
											var20.a("此处放置需要强化的装备");
										} else if (var23.q()) {
											var6 = false;
											var23.e5 = var6;
											var23.ft = false;
											var21 = null;
											var23.eW = (bi) var21;
											aq.field_int = -1;
											var20.method_char(c_bm.bP);
											var20.a("此处放置装备强化符");
										}
										break;
									case 917528:
										c_a5.eQ.a(917528);
										break;
									case 917530:
										c_a5.eQ.a(917530);
										break;
									case 2031617:
										if (var12.q()) {
											aq.field_do = aq.a;
										} else if (var23.q()) {
											aq.field_do = aq.field_int;
										}

										c_a5.eQ.a(2031635);
									}

									super.field_byte = false;
									return;
								}

								if (c_a5.es.g9 == 2228225) {
									var17 = (Integer) y().db().elementAt(y().de());
									var23 = (a7) c_a5.es.cf().elementAt(4);
									switch (var17) {
									case -1610612707:
										if (var23.q()) {
											aj.field_goto = 1;
											var23.a(false, c_a5.es);
										}

										((c_r) c_a5.es.cf().elementAt(7)).a(true, c_a5.es);
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
										if (var23.q()) {
											aj.field_case = aj.field_byte;
										}

										c_a5.eQ.a(2228231);
										break;
									case 2228240:
										c_a5.eQ.a(2228240);
									}

									super.field_byte = false;
									return;
								}

								if (c_a5.es.g9 == 1966097) {
									var17 = (Integer) y().db().elementAt(y().de());
									var23 = (a7) c_a5.es.cf().elementAt(4);
									a7 var18 = (a7) c_a5.es.cf().elementAt(6);
									ah var30 = (ah) c_a5.es.cf().elementAt(10);
									switch (var17) {
									case -1610612707:
										if (var23.q()) {
											var23.a(false, c_a5.es);
											au.field_char = 1;
										} else if (var18.q()) {
											au.field_char = 2;
											var18.a(false, c_a5.es);
										}

										((c_r) c_a5.es.cf().elementAt(7)).a(true, c_a5.es);
										break;
									case -1610612704:
										for (var19 = 0; var19 < c_r.mY.length; ++var19) {
											c_r.mY[var19] = -1;
										}

										if (var23.q()) {
											var6 = false;
											var23.e5 = var6;
											var23.ft = false;
											var21 = null;
											var23.eW = (bi) var21;
											au.field_int = -1;
											var30.method_char(c_bm.bP);
											var30.a("此处放置装备");
										} else if (var18.q()) {
											var6 = false;
											var18.e5 = var6;
											var18.ft = false;
											var21 = null;
											var18.eW = (bi) var21;
											au.field_try = -1;
											var30.method_char(c_bm.bP);
											var30.a("此处放置解除符");
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
										if (var23.q()) {
											au.field_byte = au.field_int;
										} else if (var18.q()) {
											au.field_byte = au.field_try;
										}

										c_a5.eQ.a(1966113);
										break;
									case 2031651:
										c_a5.eQ.a(2031651);
									}

									super.field_byte = false;
									return;
								}

								if (c_a5.es.g9 == 458760) {
									var17 = (Integer) y().db().elementAt(y().de());
									at.field_try = at.a();
									c_a5.eQ.a(var17);
									super.field_byte = false;
									return;
								}

								if (c_a5.es.g9 == 1179658) {
									var17 = (Integer) y().db().elementAt(y().de());
									at.field_try = bs.a();
									fF = 22;
									c_a5.eQ.a(var17);
									super.field_byte = false;
									return;
								}

								if (c_a5.es.g9 == 2555905) {
									var17 = (Integer) y().db().elementAt(y().de());

									for (var24 = 0; var24 < 12; ++var24) {
										if (((a7) c_a5.es.cf().elementAt(var24 + 11)).q()) {
											az.field_if = 0;
											az.f = (byte) var24;
										}
									}

									for (var24 = 0; var24 < 6; ++var24) {
										if (((a7) c_a5.es.cf().elementAt(var24 + 25)).q()) {
											az.field_if = 1;
											az.f = (byte) var24;
										}
									}

									if (((az.o = (Byte) az.g.elementAt(y().de())) == 0 || az.o == 10 || az.o == 4)
											&& az.o == 4) {
										az.field_for = 1;
									}

									c_a5.eQ.a(var17);
									super.field_byte = false;
									return;
								}

								if (c_a5.es.g9 == 2555906) {
									if (az.h == 0) {
										var17 = (Integer) y().db().elementAt(y().de());
										c_a5.eQ.a(var17);
										super.field_byte = false;
										return;
									}
								} else {
									a7[] var11;
									int var22;
									if (c_a5.es.g9 == 3145729 || c_a5.es.g9 == 3145730) {
										var17 = (Integer) y().db().elementAt(y().de());
										var11 = new a7[(var7 = new int[] { 3, 4, 5, 6, 7, 8, 9, 10 }).length];

										for (var22 = 0; var22 < var7.length; ++var22) {
											var11[var22] = (a7) c_a5.es.cf().elementAt(var7[var22]);
											if (var11[var22].q()) {
												aa.field_case = (byte) var22;
											}
										}

										switch (var17) {
										case -1610612730:
											if (c_a5.es.g9 == 3145729) {
												bp.ag();
												c_bv.a(-1610612730, bp.method_void(aa.field_goto[aa.field_case]));
											} else if (c_a5.es.g9 == 3145730) {
												bp.ag();
												c_bv.a(-1610612730, bp.method_void(aa.field_try[aa.field_case]));
											}
											break;
										case -1610612620:
											b1.x(-1610612620);
											break;
										case -1610612619:
											var6 = false;
											e5 = var6;
											ft = false;
											var21 = null;
											eW = (bi) var21;
											if (c_a5.es.g9 == 3145729) {
												aa.field_goto[aa.field_case] = -1;
											} else if (c_a5.es.g9 == 3145730) {
												byte var29 = 0;
												byte var28 = (byte) aa.field_try.length;
												aa.field_try[aa.field_case] = -1;

												for (var5 = 0; var5 < var28; ++var5) {
													if (aa.field_try[var5] == -1) {
														++var29;
													}
												}

												if (var29 == var28) {
													aa.field_if = 0;
													ay var16;
													(var16 = (ay) c_a5.es.cf().elementAt(13)).method_char(aa.field_if);
													var16.method_case(aa.field_if);
												}
											}
											break;
										case -1610612618:
											b1.x(-1610612618);
										}

										super.field_byte = false;
										return;
									}

									if (c_a5.es.g9 == 2228256) {
										ah var25 = (ah) c_a5.es.cf().elementAt(14);
										ah var27 = (ah) c_a5.es.cf().elementAt(11);
										var14 = (Integer) y().db().elementAt(y().de());
										a7 var26 = (a7) c_a5.es.cf().elementAt(4);
										switch (var14) {
										case -1610612707:
											if (var26.q()) {
												var26.a(false, c_a5.es);
											}

											((c_r) c_a5.es.cf().elementAt(7)).a(true, c_a5.es);
											break;
										case -1610612704:
											if (var26.q()) {
												var6 = false;
												var26.e5 = var6;
												var26.ft = false;
												var21 = null;
												var26.eW = (bi) var21;
												aj.field_byte = -1;
												var27.a("0");
												var25.method_char(c_bm.bP);
												var25.a("此处放置宝石");
											}
											break;
										case 2228231:
											if (var26.q()) {
												aj.field_case = aj.field_byte;
											}

											c_a5.eQ.a(2228231);
											break;
										case 2228258:
											if (aj.field_byte == -1) {
												c_as.a((byte) 0, "请放入宝石进行还原。", "确定", "", -1, -2);
												super.field_byte = false;
												return;
											}

											c_a5.eQ.a(2228258);
											break;
										case 2228260:
											c_a5.eQ.a(2228260);
										}

										super.field_byte = false;
										return;
									}

									if (c_a5.es.g9 == 3342340 && am.a) {
										var17 = (Integer) y().db().elementAt(y().de());
										var11 = new a7[(var7 = new int[] { 3, 5, 7, 9, 11 }).length];

										for (var22 = 0; var22 < var7.length; ++var22) {
											var11[var22] = (a7) c_a5.es.cf().elementAt(var7[var22]);
											if (var11[var22].q()) {
												am.field_goto = (byte) var22;
											}
										}

										if (var17 == 3342341) {
											am.field_try = 0;
										}

										c_a5.eQ.a(var17);
										super.field_byte = false;
										return;
									}
								}
							}
						} else {
							var17 = (Integer) y().db().elementAt(y().de());
							c_q.a = fd;
							c_r.E(fy);
							if (var17 != 1703952) {
								if (var17 != -1) {
									c_a5.eQ.a(var17);
									super.field_byte = false;
								}

								return;
							}

							c_q.l = true;
							c_a5.eQ.a(var17);
							super.field_byte = false;
						}
					}
				}
			} else if (c_a5.method_byte(65536) || c_a5.method_byte(131072)) {
				c_b5.method_case("---------------- clientType" + super.r);
				c_b5.method_case("---------------- clientCommand = " + c_a5.es.g9);
				if (super.y == 3) {
					c_br var2;
					String[] var4;
					switch (super.r) {
					case 16:
						label835: switch (eO) {
						case 0:
							c_br var1;
							int[] var3;
							switch (c_a5.es.g9) {
							case 458817:
								if (fm != -1) {
									var1 = new c_br((byte) 0);
									var2 = null;
									if (fF != 14 && fF != 15) {
										var7 = new int[] { 917507, 2162754 };
									} else {
										var7 = new int[] { 3342338, 2162754 };
									}

									var3 = new int[] { 2, 3 };
									var4 = new String[] { "查　看", "凝　元" };
									var1.a(var4, var7, var3);
									a(var1);
									super.field_byte = true;
									y().da();
								}
								break label835;
							case 939349:
								if (fm != -1) {
									if (bx.field_if != -1) {
										var1 = new c_br((byte) 0);
										var2 = null;
										if (fF != 14 && fF != 15) {
											var7 = new int[] { 917524, 917507 };
										} else {
											var7 = new int[] { 917524, 3342338 };
										}

										var3 = new int[] { 3, 2 };
										var4 = new String[] { "修理", "查看" };
										var1.a(var4, var7, var3);
										a(var1);
										super.field_byte = true;
										y().da();
									} else {
										var1 = new c_br((byte) 0);
										var7 = new int[] { 917507 };
										var3 = new int[] { 2 };
										var4 = new String[] { "查看" };
										var1.a(var4, var7, var3);
										a(var1);
										super.field_byte = true;
										y().da();
									}
								}
								break label835;
							case 1966086:
								if (fm != -1) {
									var1 = new c_br((byte) 0);
									var2 = null;
									if (fF != 14 && fF != 15) {
										var7 = new int[] { 1966087, 1966093 };
									} else {
										var7 = new int[] { 1966087, 3342338 };
									}

									var3 = new int[] { 2, 2 };
									var1.a(c_bm.f, var7, var3);
									a(var1);
									super.field_byte = true;
									y().da();
								}
								break label835;
							default:
								if (q() && fI) {
									c_a5.eQ.a(917509);
									bF();
									return;
								}

								if (fm != -1) {
									var1 = new c_br((byte) 0);
									if (c_a5.hQ == 0 && fF != 14 && fF != 15) {
										if (c_a5.es.g9 == 458755) {
											var1.a("购　买", 2425072, 3);
										} else {
											var1.a("购　买", 2425072, 1);
										}
									}

									if (fF != 14 && fF != 15) {
										var1.a("查　看", 917507, 2);
									} else if (c_a5.es.g9 == 458755) {
										var1.a("查　看", 3342338, 3);
									} else {
										var1.a("查　看", 3342338, 1);
									}

									var1.a("卸　下", 917506, 3);
									if (fF != 14 && fF != 15) {
										var1.a("比　较", 1245185, 2);
									}

									a(var1);
									super.field_byte = true;
									y().da();
								} else if (c_a5.hQ == 0 && fF != 14 && fF != 15) {
									var1 = new c_br((byte) 0);
									if (c_a5.es.g9 == 458755) {
										var1.a("购　买", 2425072, 3);
									} else {
										var1.a("购　买", 2425072, 1);
									}

									a(var1);
									super.field_byte = true;
									y().da();
								}
								break label835;
							}
						case 1:
							if (fm != -1) {
								c_be.a((byte) 1, (int) ew);
							}
							break;
						case 2:
							if (fm != -1) {
								c_a5.eQ.a(393231);
								c_br.c6();
							} else {
								c_as.a((byte) 0, "此位置无装备", "确定", "", -1, -2);
							}
						}
					case 115:
						switch (eO) {
						case 0:
							switch (c_a5.es.g9) {
							case 917520:
							case 1638431:
								boolean var8 = false;
								if (c_a5.es.g9 == 1638431) {
									var8 = true;
								}

								String[] var9;
								int[] var10;
								int[] var13;
								if (fm != -1) {
									var2 = new c_br((byte) 0);
									var9 = new String[] { "修理单个", "修理全部", "查　看" };
									var4 = null;
									if (fF != 14 && fF != 15) {
										var13 = new int[] { var8 ? 1638432 : 917521, var8 ? 1638433 : 917522, 917507 };
									} else {
										var13 = new int[] { var8 ? 1638432 : 917521, var8 ? 1638433 : 917522, 3342338 };
									}

									var10 = new int[] { 3, 3, 2 };
									var2.a(var9, var13, var10);
									a(var2);
									super.field_byte = true;
									y().da();
								} else {
									var2 = new c_br((byte) 0);
									var9 = new String[] { "修理全部" };
									var13 = new int[] { var8 ? 1638433 : 917522 };
									var10 = new int[] { 3 };
									var2.a(var9, var13, var10);
									a(var2);
									super.field_byte = true;
									y().da();
								}
							}
						}
					}

					if (c_a5.es.g9 != 2097155 || by.d) {
						return;
					}

					var12 = (a7) c_a5.es.cf().elementAt(31);
					var23 = (a7) c_a5.es.cf().elementAt(33);
					by.field_else = true;
					if (!var12.q()) {
						if (var23.q()) {
							by.field_case = 2;
							var23.a(false, c_a5.es);
							c_a5.eQ.a(2097154);
						}

						return;
					}

					by.field_case = 1;
					var12.a(false, c_a5.es);
					c_a5.eQ.a(2097154);
				} else {
					if (super.y == 1) {
						bV();
						return;
					}

					if (super.y == 0 && c_a5.method_else() == 17) {
						if (c_a5.iC[c_a5.hg].eo != null) {
							String var15 = "正在进入游戏，请等待...";
							c_a5.a((byte) 0, var15, "", "", -120, -120);
							c_a5.eQ.a(65539);
							c_a5.method_for(c_a5.e0[c_a5.hg]);
							c_a5.e8.fo[0] = 1;
							if (c_a5.e8.cP[0] != 1 || c_a5.e8.fo[0] != 1) {
								if (c_a5.e8.fo[0] == 1) {
									c_a5.e8.ia = false;
									c_b5.method_case("MainCanvas.mc.Debarkation=" + c_a5.e8.ia);
								}

								return;
							}

							c_a5.e8.ia = true;
							c_b5.method_case("MainCanvas.mc.Debarkation=" + c_a5.e8.ia);
						} else {
							c_a5.G();
							c_a5.d();
							c_a5.method_do((byte) 18);
						}
					}
				}
			}

		}
	}

	public final void k(byte var1) {
		eO = var1;
	}

	public static void bF() {
		try {
			a7 var10000 = (a7) ((a7) c_a5.es.cf().elementAt(9));
			boolean var1 = false;
			var10000.fI = var1;
			var10000 = (a7) ((a7) c_a5.es.cf().elementAt(10));
			var1 = false;
			var10000.fI = var1;
			var10000 = (a7) ((a7) c_a5.es.cf().elementAt(17));
			var1 = false;
			var10000.fI = var1;
			var10000 = (a7) ((a7) c_a5.es.cf().elementAt(16));
			var1 = false;
			var10000.fI = var1;
			var10000 = (a7) ((a7) c_a5.es.cf().elementAt(19));
			var1 = false;
			var10000.fI = var1;
			var10000 = (a7) ((a7) c_a5.es.cf().elementAt(18));
			var1 = false;
			var10000.fI = var1;
		} catch (Exception var2) {
		}
	}

	public static boolean bU() {
		return ((a7) ((a7) c_a5.es.cf().elementAt(9))).fI || ((a7) ((a7) c_a5.es.cf().elementAt(10))).fI
				|| ((a7) ((a7) c_a5.es.cf().elementAt(17))).fI || ((a7) ((a7) c_a5.es.cf().elementAt(16))).fI
				|| ((a7) ((a7) c_a5.es.cf().elementAt(19))).fI || ((a7) ((a7) c_a5.es.cf().elementAt(18))).fI;
	}

	private void bV() {
		c_br var1;
		String[] var2;
		c_br var3;
		String[] var4;
		int[] var7;
		int[] var8;
		if (eJ != -1) {
			var1 = new c_br((byte) 0);
			var2 = null;
			var3 = null;
			var4 = null;
			if (eJ == 0 && c_bv.jp) {
				if (el == 1) {
					var4 = new String[] { "完成任务", "选择报酬", "查看物品" };
					var7 = new int[] { 262150, 0, 262156 };
					var8 = new int[] { 0, 3, 2 };
					var1.a(var4, var7, var8);
				} else {
					var4 = new String[] { "完成任务", "选择报酬" };
					var7 = new int[] { 262150, 0 };
					var8 = new int[] { 0, 3 };
					var1.a(var4, var7, var8);
				}
			}

			if (var1.dj().size() > 0) {
				a(var1);
				super.field_byte = true;
				y().da();
			}
		} else {
			switch (super.r) {
			case 34:
				if (ej && em) {
					if (eC != -1) {
						var1 = new c_br((byte) 0);
						var7 = new int[] { 1376267, 1376266 };
						var8 = new int[] { 3, 3 };
						var1.a(c_bm.a6, var7, var8);
						a(var1);
						super.field_byte = true;
						y().da();
					} else {
						var1 = new c_br((byte) 0);
						var7 = new int[] { 1376266 };
						var8 = new int[] { 3 };
						var1.a(c_bm.aY, var7, var8);
						a(var1);
						super.field_byte = true;
						y().da();
					}
				} else if (ej && !em) {
					if (eC != -1) {
						var1 = new c_br((byte) 0);
						var7 = new int[] { 1376267 };
						var8 = new int[] { 3 };
						var4 = new String[] { "查看" };
						var1.a(var4, var7, var8);
						a(var1);
						super.field_byte = true;
						y().da();
					}
				} else if (!ej) {
					if (eC != -1) {
						var1 = new c_br((byte) 0);
						var7 = new int[] { 1376267, 1376268, 1376264, 1376265 };
						var8 = new int[] { 3, 3, 3, 3 };
						var1.a(c_bm.ac, var7, var8);
						a(var1);
						super.field_byte = true;
						y().da();
					} else {
						var1 = new c_br((byte) 0);
						var7 = new int[] { 1376263, 1376264, 1376265 };
						var8 = new int[] { 2, 3, 3 };
						var1.a(c_bm.w, var7, var8);
						a(var1);
						super.field_byte = true;
						y().da();
					}
				}
				break;
			case 35:
				if (em && ej) {
					if (eC != -1) {
						var1 = new c_br((byte) 0);
						var7 = new int[] { 1376267, 1376266 };
						var8 = new int[] { 3, 3 };
						var1.a(c_bm.a6, var7, var8);
						a(var1);
						super.field_byte = true;
						y().da();
					}
				} else if (eC != -1) {
					var1 = new c_br((byte) 0);
					var7 = new int[] { 1376267 };
					var8 = new int[] { 3 };
					var4 = new String[] { "查看" };
					var1.a(var4, var7, var8);
					a(var1);
					super.field_byte = true;
					y().da();
				}
			}
		}

		if (c_a5.es.g9 != 1703937 && c_a5.es.g9 != 1703952 && c_a5.es.g9 != 1703938) {
			if (c_a5.es.g9 != 1703940 && c_a5.es.g9 != 1703941) {
				if (c_a5.es.g9 == 1900547) {
					if (bw.a == 1) {
						var1 = new c_br((byte) 0);
						var7 = new int[] { -1610612713, -1610612714 };
						var8 = new int[] { 3, 3 };
						var1.a(c_bm.at, var7, var8);
						a(var1);
						y().da();
						super.field_byte = true;
						return;
					}
				} else {
					a7 var14;
					a7 var16;
					if (c_a5.es.g9 == 2031621) {
						var16 = (a7) c_a5.es.cf().elementAt(4);
						var14 = (a7) c_a5.es.cf().elementAt(6);
						if (var16.q()) {
							method_void(aq.a);
						} else if (var14.q()) {
							method_void(aq.field_int);
						}

						y().da();
						super.field_byte = true;
						return;
					}

					if (c_a5.es.g9 == 2031636) {
						var16 = (a7) c_a5.es.cf().elementAt(4);
						var14 = (a7) c_a5.es.cf().elementAt(6);
						if (var16.q()) {
							method_if(aq.a, (byte) 1);
						} else if (var14.q()) {
							method_if(aq.field_int, (byte) 2);
						}

						y().da();
						super.field_byte = true;
						return;
					}

					if (c_a5.es.g9 == 3342356) {
						var16 = (a7) c_a5.es.cf().elementAt(4);
						var14 = (a7) c_a5.es.cf().elementAt(6);
						if (var16.q()) {
							i(aq.a);
						} else if (var14.q()) {
							i(aq.field_int);
						}

						y().da();
						super.field_byte = true;
						return;
					}

					if (c_a5.es.g9 == 917525) {
						var16 = (a7) c_a5.es.cf().elementAt(4);
						var14 = (a7) c_a5.es.cf().elementAt(6);
						if (var16.q()) {
							o(aq.a);
						} else if (var14.q()) {
							o(aq.field_int);
						}

						y().da();
						super.field_byte = true;
						return;
					}

					int[] var5;
					int[] var10;
					byte var11;
					if (c_a5.es.g9 == 2228225) {
						if (((a7) c_a5.es.cf().elementAt(4)).q()) {
							var11 = aj.field_byte;
							var3 = new c_br((byte) 0);
							if (var11 == -1) {
								var10 = new int[] { -1610612707, 2228227, 2031650 };
								var5 = new int[] { 3, 3, 2 };
								var3.a(c_bm.ct, var10, var5);
							} else {
								var10 = new int[] { c_a5.es.g9 == 2228225 ? 2228240 : -1610612704, 2228231, 2228227,
										2031650 };
								var5 = new int[] { 3, 2, 3, 2 };
								var3.a(c_bm.cr, var10, var5);
							}

							a(var3);
						}

						y().da();
						super.field_byte = true;
						return;
					}

					if (c_a5.es.g9 == 1966097) {
						var16 = (a7) c_a5.es.cf().elementAt(4);
						var14 = (a7) c_a5.es.cf().elementAt(6);
						if (var16.q()) {
							p(au.field_int);
						} else if (var14.q()) {
							p(au.field_try);
						}

						y().da();
						super.field_byte = true;
						return;
					}

					if (c_a5.es.g9 == 458760) {
						var1 = new c_br((byte) 0);
						if (at.field_byte && eY) {
							var1.a("扩　容", 458769, 3);
						}

						var1.a("查　看", 458770, 2);
						a(var1);
						y().da();
						super.field_byte = true;
						return;
					}

					if (c_a5.es.g9 == 1179658) {
						var1 = new c_br((byte) 0);
						if (at.field_byte && eY) {
							var1.a("扩　容", 1179661, 2);
						} else {
							var1.a("购　买", 2425072, 1);
						}

						var1.a("查　看", 1179662, 2);
						a(var1);
						y().da();
						super.field_byte = true;
						return;
					}

					if (c_a5.es.g9 == 2555905) {
						var14 = this;
						az.g = new Vector();

						for (int var13 = 0; var13 < az.field_do.length; ++var13) {
							if ((var14.e6 & 1 << var13) != 0) {
								az.g.addElement(new Byte((byte) var13));
							}

							var8 = new int[az.g.size()];
							var10 = new int[az.g.size()];
							String[] var9 = new String[az.g.size()];

							for (int var12 = 0; var12 < az.g.size(); ++var12) {
								var8[var12] = 2555936;
								var10[var12] = az.e[(Byte) az.g.elementAt(var12)];
								var9[var12] = az.field_do[(Byte) az.g.elementAt(var12)];
							}

							c_br var15;
							(var15 = new c_br((byte) 0)).a(var9, var8, var10);
							var14.a(var15);
							var14.field_byte = true;
							var14.y().da();
						}

						return;
					}

					if (c_a5.es.g9 == 2555906) {
						if (az.h == 0) {
							var1 = new c_br((byte) 0);
							var7 = new int[] { 2555959, 2555960, 2555961 };
							var8 = new int[] { 3, 3, 3 };
							var4 = new String[] { "查    看", "撤    销", "添    加" };
							var1.a(var4, var7, var8);
							a(var1);
							y().da();
							super.field_byte = true;
							return;
						}

						if (az.h == 1) {
							c_a5.eQ.a(2555959);
							return;
						}
					} else {
						if (c_a5.es.g9 == 3145729 || c_a5.es.g9 == 3145730) {
							var1 = new c_br((byte) 0);
							if (eW == null) {
								var7 = new int[] { c_a5.es.g9 == 3145729 ? -1610612620 : -1610612618 };
								var8 = new int[] { 2 };
								var4 = new String[] { "设置技能" };
								var1.a(var4, var7, var8);
								a(var1);
							} else {
								var7 = new int[] { c_a5.es.g9 == 3145729 ? -1610612620 : -1610612618, -1610612619,
										-1610612730 };
								var8 = new int[] { 2, 3, 2 };
								var4 = new String[] { "设置技能", "清空本键", "技能详情" };
								var1.a(var4, var7, var8);
								a(var1);
							}

							super.field_byte = true;
							y().da();
							return;
						}

						if (c_a5.es.g9 == 2228256) {
							if (((a7) c_a5.es.cf().elementAt(4)).q()) {
								var11 = aj.field_byte;
								var3 = new c_br((byte) 0);
								String[] var6;
								if (var11 == -1) {
									var10 = new int[] { -1610612707, 2228258, 2228260 };
									var5 = new int[] { 3, 3, 2 };
									var6 = new String[] { "选择道具", "宝石还原", "还原说明" };
									var3.a(var6, var10, var5);
								} else {
									var10 = new int[] { -1610612704, 2228231, 2228258, 2228260 };
									var5 = new int[] { 3, 2, 3, 2 };
									var6 = new String[] { "重置道具", "查看详情", "宝石还原", "还原说明" };
									var3.a(var6, var10, var5);
								}

								a(var3);
							}

							y().da();
							super.field_byte = true;
							return;
						}

						if (c_a5.es.g9 == 3342340 && am.a) {
							var1 = new c_br((byte) 0);
							var2 = new String[] { "学习技能", "技能解封" };
							var8 = new int[] { 3342341, 3342343 };
							var10 = new int[] { 1, 3 };
							var1.a(var2, var8, var10);
							a(var1);
							super.field_byte = true;
							y().da();
						}
					}
				}
			} else if (eQ == 0) {
				if (c_a5.es.g9 == 1703940) {
					var1 = new c_br((byte) 0);
					if (c_q.field_char > 0) {
						var1.a("接收金钱", 1703951, 3);
					}

					if (c_q.field_for || c_q.field_char > 0) {
						var1.a("接收所有", 1703950, 3);
					}

					if (c_q.r) {
						var1.a("回复邮件", 1703952, 2);
					}

					if (var1.dj().size() > 0) {
						a(var1);
						y().da();
						super.field_byte = true;
					}

					return;
				}

				if (c_a5.es.g9 == 1703941) {
					var1 = new c_br((byte) 0);
					if (c_q.field_else) {
						if (c_q.field_for || c_q.field_char > 0) {
							var1.a("接收所有", 1703950, 3);
						}

						if (c_q.r) {
							var1.a("回复邮件", 1703952, 2);
						}
					} else {
						var1.a("付　款", 1703953, 3);
						var1.a("退　信", 1703957, 0);
						if (c_q.r) {
							var1.a("回复邮件", 1703952, 2);
						}
					}

					if (var1.dj().size() > 0) {
						a(var1);
						y().da();
						super.field_byte = true;
					}

					return;
				}
			} else {
				if (c_a5.es.g9 == 1703940) {
					(var1 = new c_br((byte) 0)).a("查看物品", 1703948, 2);
					var1.a("接收物品", 1703949, 3);
					if (c_q.field_char > 0) {
						var1.a("接收金钱", 1703951, 3);
					}

					if (c_q.field_for || c_q.field_char > 0) {
						var1.a("接收所有", 1703950, 3);
					}

					if (c_q.r) {
						var1.a("回复邮件", 1703952, 2);
					}

					if (var1.dj().size() > 0) {
						a(var1);
						y().da();
						super.field_byte = true;
					}

					return;
				}

				if (c_a5.es.g9 == 1703941) {
					var1 = new c_br((byte) 0);
					if (c_q.field_else) {
						var1.a("查看物品", 1703948, 2);
						var1.a("接收物品", 1703949, 3);
						if (c_q.field_for || c_q.field_char > 0) {
							var1.a("接收所有", 1703950, 3);
						}

						if (c_q.r) {
							var1.a("回复邮件", 1703952, 2);
						}
					} else {
						var1.a("查看物品", 1703948, 2);
						var1.a("付　款", 1703953, 3);
						var1.a("退　信", 1703957, 0);
						if (c_q.r) {
							var1.a("回复邮件", 1703952, 2);
						}
					}

					if (var1.dj().size() > 0) {
						a(var1);
						y().da();
						super.field_byte = true;
					}

					return;
				}
			}
		} else if (q()) {
			if (eC == -1) {
				var1 = new c_br((byte) 0);
				var7 = new int[] { 1703946, -1610612712, -1610612711 };
				var8 = new int[] { 2, 3, 3 };
				var1.a(c_bm.m, var7, var8);
				a(var1);
				y().da();
				super.field_byte = true;
				return;
			}

			if (eC != -1) {
				var1 = new c_br((byte) 0);
				var7 = new int[] { 1703954, -1610612710, -1610612712, -1610612711 };
				var8 = new int[] { 2, 3, 3, 3 };
				var1.a(c_bm.dl, var7, var8);
				a(var1);
				y().da();
				super.field_byte = true;
				return;
			}
		}

	}

	public final byte bC() {
		return ew;
	}

	public final void h(byte var1) {
		ew = var1;
	}

	public final void h(boolean var1) {
		fI = var1;
	}

	public final void g(int var1) {
		fC = (byte) (var1 / 1000 - 1);
	}

	public final byte bD() {
		return fy;
	}

	public final void l(byte var1) {
		fy = var1;
	}

	public final void k(int var1) {
		if (c_l.a().method_new() == var1) {
			fe = bz.a(c_l.a(), (byte) 0);
		} else if (bp.ag().method_new() == var1) {
			fe = bz.a(bp.ag(), (byte) 0);
		} else {
			for (int var2 = c_l.field_else.length - 1; var2 >= 0; --var2) {
				if (c_l.field_else[var2].method_new() == var1) {
					fe = bz.a(c_l.field_else[var2], (byte) 0);
					return;
				}
			}

		}
	}

	private void method_void(byte var1) {
		c_br var2 = new c_br((byte) 0);
		int[] var3;
		int[] var4;
		if (var1 == -1) {
			var4 = new int[] { -1610612707, 2031623, 2031649 };
			var3 = new int[] { 3, 3, 2 };
			var2.a(c_bm.c7, var4, var3);
		} else {
			var4 = new int[] { -1610612704, 2031635, 2031623, 2031649 };
			var3 = new int[] { 3, 2, 3, 2 };
			var2.a(c_bm.c4, var4, var3);
		}

		a(var2);
	}

	private void method_if(byte var1, byte var2) {
		c_br var3 = new c_br((byte) 0);
		if (var1 == -1) {
			if (var2 == 2) {
				var3.a("购　买", -1610612635, 1);
			}

			if (var2 == 3) {
				var3.a("购　买", -1610612634, 1);
			}

			var3.a("选择道具", -1610612707, 3);
			var3.a("装备开封", 2031618, 3);
			var3.a("开封说明", 2031648, 2);
		} else {
			if (var2 == 2) {
				var3.a("购　买", -1610612635, 1);
			}

			if (var2 == 3) {
				var3.a("购　买", -1610612634, 1);
			}

			var3.a("重置道具", -1610612704, 3);
			var3.a("查看详情", 2031617, 2);
			var3.a("装备开封", 2031618, 3);
			var3.a("开封说明", 2031648, 2);
		}

		a(var3);
	}

	private void i(byte var1) {
		c_br var2 = new c_br((byte) 0);
		if (var1 == -1) {
			var2.a("选择道具", -1610612707, 3);
			var2.a("法宝铭刻", 3342359, 3);
			var2.a("铭刻说明", 3342361, 2);
		} else {
			var2.a("重置道具", -1610612704, 3);
			var2.a("查看详情", 2031617, 2);
			var2.a("法宝铭刻", 3342359, 3);
			var2.a("铭刻说明", 3342361, 2);
		}

		a(var2);
	}

	private void o(byte var1) {
		c_br var2 = new c_br((byte) 0);
		if (var1 == -1) {
			var2.a("选择道具", -1610612707, 3);
			var2.a("装备强化", 917528, 3);
			var2.a("强化说明", 917530, 2);
		} else {
			var2.a("重置道具", -1610612704, 3);
			var2.a("查看详情", 2031617, 2);
			var2.a("装备强化", 917528, 3);
			var2.a("强化说明", 917530, 2);
		}

		a(var2);
	}

	private void p(byte var1) {
		c_br var2 = new c_br((byte) 0);
		int[] var3;
		int[] var4;
		if (var1 == -1) {
			var4 = new int[] { -1610612707, 1966099, 2031651 };
			var3 = new int[] { 3, 1, 2 };
			var2.a(c_bm.de, var4, var3);
		} else {
			var4 = new int[] { -1610612704, 1966113, 1966099, 2031651 };
			var3 = new int[] { 3, 2, 1, 2 };
			var2.a(c_bm.dd, var4, var3);
		}

		a(var2);
	}

	public final short bH() {
		return et;
	}

	public final void f(short var1) {
		et = var1;
	}

	public final short br() {
		return eU;
	}

	public final void d(short var1) {
		eU = var1;
	}

	public final int bo() {
		return fD;
	}

	public final void h(int var1) {
		fD = var1;
	}

	public final byte bN() {
		return e8;
	}

	public final void method_goto(byte var1) {
		e8 = var1;
	}

	public final String bn() {
		return en;
	}

	public final void method_long(String var1) {
		en = var1;
	}

	public final String bY() {
		return eR;
	}

	public final void method_goto(String var1) {
		eR = var1;
	}

	public final byte bz() {
		return eG;
	}

	public final void d(byte var1) {
		eG = var1;
	}

	public final String by() {
		return fq;
	}

	public final void method_char(String var1) {
		fq = var1;
	}

	public final byte bJ() {
		return fB;
	}

	public final void m(byte var1) {
		fB = var1;
	}

	public final void i(int var1) {
		eE = var1;
	}

	public final void j(int var1) {
		e6 = var1;
	}

	static {
		String[] var10000 = new String[] { "乾", "坤", "震", "艮", "离", "坎", "兑", "巽" };
		fF = -1;
		e3 = -1;
		ej = false;
		em = false;
	}
}
