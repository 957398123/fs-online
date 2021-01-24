import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/**
 * 2020/01/22
 * @author 95739
 *
 */
public final class bp extends c_b {
	public static int em = 0;
	public static bp fI = null;
	public static byte ef = 0;
	public static short fE = 0;
	public static short fD = 0;
	private byte fP = 0;
	private int eV = 0;
	private String eN = "";
	private int ft = 0;
	private byte eE = 0;
	private int ev = 0;
	private byte er = 0;
	long eY = 0L;
	long fR = 0L;
	public int fS = 0;
	public int eC = 0;
	private byte fJ = 0;
	public boolean ep = false;
	public int eU = 0;
	public byte eS = 0;
	private static byte ew = 0;
	private static int[] fe = new int[63];
	public static short[] fj = null;
	public static String[] eQ = null;
	private static short[] eB = null;
	public static short[] el = null;
	public static int[] fg = null;
	public static String[] fu = null;
	public static short[] eD = null;
	private static byte[] eZ = null;
	private static short[] fo = null;
	private static short[] fm = null;
	private static short[] ex = null;
	public static byte[] eW = null;
	public static int[] fN = null;
	public static byte[] en = null;
	private static byte[] eG = null;
	private static short[] eI = null;
	public static long[] et = null;
	public short e1 = 0;
	public short e0 = 0;
	public short e3 = 0;
	public short fb = 0;
	public byte eR = 0;
	public String[] ff = null;
	public byte[][] fc = null;
	public String[][] eF = null;
	public short[][] fO = null;
	public String[][] fl = null;
	private byte[][] eg = null;
	public boolean[][] eO = null;
	public byte[][] eH = null;
	public byte[][] ee = null;
	public byte[][] fL = null;
	public byte e7 = 0;
	public short[] ez = null;
	public byte[] fC = null;
	private byte[] eT = null;
	private static Vector eX = new Vector();
	private byte fF = 0;
	public short[] fG = new short[0];
	private short es = 6000;
	private short fs = 2000;
	private static int fd = 1000;
	private static int eo = 3600;
	private static int ey = 8100;
	private static int e8;
	private static int fa;
	private static int fB;
	private static int ej;
	private boolean eA = false;
	public boolean eK = true;
	private static int[] e4;
	public boolean fK;
	private static String[] fh;
	private long fp = 0L;
	static int fz;
	static int fM;
	private short fA = 200;
	private short e5;
	byte ei = 0;
	static boolean fq;

	public static bp ag() {
		if (fI == null) {
			fI = new bp();
		}

		return fI;
	}

	public static void af() {
		fI = null;
	}

	private bp() {
		super.field_try = 1;
		super.ct = 0;
		super.dt = 0;
		super.aI = new Vector();
		V();
		super.l = c_z.a(super.field_void, super.c);
		super.q = c_z.method_if(super.field_void, super.c);
		W();
		super.aT = 49;
		super.ap = 0;
		e$132be7();
	}

	public static void a(ac var0, boolean var1) {
		short var3;
		short var6;
		if (var1) {
			try {
				InputStream var8 = c_b5.int$3b9f0c8("/special/sk_des.data");
				DataInputStream var9;
				var6 = (var9 = new DataInputStream(var8)).readShort();
				var3 = var9.readShort();
				c_b5.method_case("skillConCount=" + var3 + "   tc_lengh=" + var6);
				fh = new String[var6];

				for (int var5 = 0; var5 < var3; ++var5) {
					var6 = var9.readShort();
					fh[var6] = var9.readUTF();
				}

			} catch (Exception var4) {
			}
		} else {
			var6 = var0.method_new();
			short var2 = var0.method_new();
			c_b5.method_case("skillConCount=" + var2 + "   tc_lengh=" + var6);
			fh = new String[var6];

			for (int var7 = 0; var7 < var2; ++var7) {
				var3 = var0.method_new();
				fh[var3] = var0.method_goto();
			}

		}
	}

	public static void a(byte var0, ac var1) {
		try {
			if (ew == var0) {
				for (int var7 = 0; var7 < et.length; ++var7) {
					et[var7] = 0L;
				}

				return;
			}

			ew = var0;
			short var2 = var1.method_new();
			c_b5.method_case("skillCount=" + var2 + "--pro=" + var0);
			fj = new short[var2 + 1];
			eQ = new String[var2 + 1];
			eB = new short[var2 + 1];
			el = new short[var2 + 1];
			fg = new int[var2 + 1];
			fu = new String[var2 + 1];
			eD = new short[var2 + 1];
			eZ = new byte[var2 + 1];
			fo = new short[var2 + 1];
			fm = new short[var2 + 1];
			ex = new short[var2 + 1];
			eW = new byte[var2 + 1];
			fN = new int[var2 + 1];
			en = new byte[var2 + 1];
			eG = new byte[var2 + 1];
			eI = new short[var2 + 1];
			et = new long[var2 + 1];

			for (int var6 = 0; var6 < var2 + 1; ++var6) {
				if (var6 == 0) {
					fj[var6] = 0;
					eQ[var6] = "普通攻击";
					eB[var6] = 0;
					el[var6] = 0;
					fg[var6] = 2000;
					fu[var6] = fh[0];
					eD[var6] = 0;
					eZ[var6] = 2;
					fo[var6] = 50;
					fm[var6] = 0;
					ex[var6] = 0;
					eW[var6] = 9;
					fN[var6] = 1;
					en[var6] = 1;
					eG[var6] = 0;
					eI[var6] = 32767;
					et[var6] = 0L;
				} else {
					fj[var6] = var1.method_new();
					eQ[var6] = var1.method_goto();
					eB[var6] = var1.method_new();
					el[var6] = var1.method_new();
					fg[var6] = var1.method_byte();
					short var3 = var1.method_new();

					try {
						fu[var6] = fh[var3];
					} catch (Exception var4) {
						fu[var6] = "此技能缺少策划数据";
					}

					eD[var6] = var1.method_new();
					eZ[var6] = var1.method_if();
					fo[var6] = var1.method_new();
					fm[var6] = var1.method_new();
					ex[var6] = var1.method_new();
					eW[var6] = var1.method_if();
					fN[var6] = var1.method_byte();
					en[var6] = var1.method_if();
					eG[var6] = var1.method_if();
					eI[var6] = var1.method_new();
					et[var6] = 0L;
				}
			}

			fh = null;
			var1.field_do = null;
		} catch (Exception var5) {
			var5.printStackTrace();
		}

	}

	public final void a(long[] var1) {
		fe = null;
		byte var10000 = ag().i();
		long[] var2 = var1;
		byte var12 = var10000;
		int[] var16;
		if (var1.length == 4) {
			int var13 = var12 << 12;
			int[] var3 = new int[63];

			for (int var4 = 0; var4 < 63; ++var4) {
				int var5 = var4 >> 4;
				int var6 = (var6 = var4 & 15) << 2;
				long var10 = 15L;
				if ((var10 = ((var10 = 15L << var6) & var2[var5]) >>> var6) != 0L) {
					var3[var4] = var13;
					var3[var4] |= var4 << 4;
					var3[var4] = (int) ((long) var3[var4] | var10);
				}
			}

			var16 = var3;
		} else {
			var16 = new int[0];
		}

		fe = var16;
		eX.removeAllElements();

		for (var12 = 0; var12 < 63; ++var12) {
			if (fe[var12] != 0 && method_void(fe[var12]) != -1) {
				eX.addElement(new Integer(fe[var12]));
			}
		}

		byte var14 = (byte) eX.size();
		fF = var14;
		fG = new short[fF];

		for (short var15 = 0; var15 < eX.size(); ++var15) {
			fG[var15] = (short) (Short) eX.elementAt(var15);
		}

	}

	public final int[] aH() {
		int var1 = fj.length - 1;
		char var2 = '\ufff0';
		boolean var3 = false;
		eX.removeAllElements();

		short var5;
		for (short var4 = 1; var4 <= var1; ++var4) {
			if (ag().r() >= en[var4]) {
				var3 = false;

				for (var5 = 0; var5 < fF; ++var5) {
					if ((fG[var5] & var2) == (fj[var4] & var2) && fG[var5] >= fj[var4]) {
						var3 = true;
						break;
					}
				}

				if (!var3) {
					if (ex[var4] == 0) {
						eX.addElement(new Short(var4));
					} else {
						for (var5 = 0; var5 < fF; ++var5) {
							if ((fG[var5] & var2) == (ex[var4] & var2) && fG[var5] >= ex[var4]) {
								eX.addElement(new Short(var4));
								break;
							}
						}
					}
				}
			}
		}

		int[] var7 = new int[eX.size()];

		for (var5 = 0; var5 < eX.size(); ++var5) {
			var7[var5] = (Short) eX.elementAt(var5);
		}

		return var7;
	}

	public final int[] m(byte var1) {
		c_b5.method_case("所选等级 = " + var1);
		int var2 = fj.length - 1;
		char var3 = '\ufff0';
		boolean var4 = false;
		int var8 = var1 * 10;
		eX.removeAllElements();

		short var6;
		for (short var5 = 1; var5 <= var2; ++var5) {
			if (en[var5] >= var8 - 9 && en[var5] <= var8) {
				var4 = false;

				for (var6 = 0; var6 < fF; ++var6) {
					if ((fG[var6] & var3) == (fj[var5] & var3) && fG[var6] >= fj[var5]) {
						var4 = true;
						break;
					}
				}

				if (!var4) {
					boolean var11 = false;

					for (short var9 = 0; var9 < fF; ++var9) {
						if ((fG[var9] & var3) == (fj[var5] & var3)) {
							var11 = true;
							if (fG[var9] == ex[var5] && en[var5] > r()) {
								eX.addElement(new Short(var5));
							} else if (fG[var9] != ex[var5]) {
								eX.addElement(new Short(var5));
							}
							break;
						}
					}

					if (!var11 && en[var5] > r()) {
						eX.addElement(new Short(var5));
					}
				}
			}
		}

		int[] var10 = new int[eX.size()];

		for (var6 = 0; var6 < eX.size(); ++var6) {
			var10[var6] = (Short) eX.elementAt(var6);
		}

		return var10;
	}

	public static short method_void(int var0) {
		short var1 = -1;
		short var2 = (short) fj.length;

		for (short var3 = 0; var3 < var2; ++var3) {
			if (var0 == fj[var3]) {
				var1 = var3;
				break;
			}
		}

		return var1;
	}

	public final void method_do(ac var1) {
		try {
			eR = var1.method_if();
			c_b5.method_case("talentTypeCount=" + eR);
			ff = new String[eR];
			fc = new byte[eR][];
			eF = new String[eR][];
			fO = new short[eR][];
			fl = new String[eR][];
			eg = new byte[eR][];
			eO = new boolean[eR][];
			eH = new byte[eR][];
			ee = new byte[eR][];
			fL = new byte[eR][];
			eT = new byte[eR];
			ez = new short[eR];
			fC = new byte[eR];

			for (int var2 = 0; var2 < eR; ++var2) {
				String var3 = var1.method_goto();
				ff[var2] = var3;
				byte var4 = var1.method_if();
				c_b5.method_case("talentTypeName=" + var3 + "  本系天赋个数=" + var4);
				fc[var2] = new byte[var4];
				eF[var2] = new String[var4];
				fO[var2] = new short[var4];
				fl[var2] = new String[var4];
				eg[var2] = new byte[var4];
				eO[var2] = new boolean[var4];
				eH[var2] = new byte[var4];
				ee[var2] = new byte[var4];
				fL[var2] = new byte[var4];

				for (int var6 = 0; var6 < var4; ++var6) {
					fc[var2][var6] = var1.method_if();
					if (eT[var2] < fc[var2][var6]) {
						eT[var2] = fc[var2][var6];
					}

					eF[var2][var6] = var1.method_goto();
					fO[var2][var6] = var1.method_new();
					fl[var2][var6] = var1.method_goto();
					eg[var2][var6] = var1.method_if();
					eH[var2][var6] = var1.method_if();
					c_b5.method_case("talentPosition=" + fc[var2][var6] + " talentSuperPosition=" + eg[var2][var6]);
				}

				if (var4 != 0) {
					fC[var2] = fc[var2][0];
				}
			}

			method_if(var1);
			var1.field_do = null;
		} catch (Exception var5) {
			var5.printStackTrace();
		}
	}

	public final void method_if(ac var1) {
		var1.method_if();

		for (int var2 = 0; var2 < eR; ++var2) {
			var1.method_if();
			ez[var2] = 0;

			for (int var3 = 0; var3 < ee[var2].length; ++var3) {
				ee[var2][var3] = var1.method_if();
				short[] var10000 = ez;
				var10000[var2] = (short) (var10000[var2] + ee[var2][var3]);
				method_if(var2, var3);
			}
		}

		e7 = var1.method_if();
	}

	public final void method_do(Graphics var1, int var2) {
		boolean var3 = false;
		boolean var4 = false;
		if (var2 == 524292) {
			var1.setColor(c_bm.dt);
			var1.drawRect(e1, e0, e3 - 1, fb - 1);
			var1.fillRect(e1, e0, 3, fb);
			var1.fillRect(e1 + e3 - 3, e0, 3, fb);
			var1.drawRect(e1 + 3 + 1, e0 + 1 + 1, e3 - 8 - 1, fb - 4 - 1);
			short var14 = (short) ((c_a5.ic >> 1) - 27 - (c_a5.gg.field_try >> 1));
			var1.setClip(0, e0 + 2, c_a5.ic, fb - 5);
			byte var5 = ((c_be) c_a5.fE.elementAt(0)).ht;
			c_ao var6 = (c_ao) c_a5.es.cf().elementAt(0);
			int var7 = fc[var5].length;
			short var8 = 0;
			short var9 = 0;

			for (int var10 = 0; var10 < var7; ++var10) {
				short var15 = (short) (var14 + (fc[var5][var10] - 1) % 3 * 27);
				short var16 = (short) (8 + e0 + ((fc[var5][var10] - 1) / 3 - var6.cb) * 27);
				var1.setColor(c_bm.O[fO[var5][var10] / 1000 - 1][0]);
				var1.fillRect(var15 - 1, var16 - 1, 16, 16);
				c_a5.gg.method_if(var1, var15, var16, c_r.k((short) (fO[var5][var10] % 1000)));
				var1.setColor(c_bm.O[fO[var5][var10] / 1000 - 1][1]);
				var1.drawRect(var15 - 1, var16 - 1, 15, 15);
				if (eO[var5][var10]) {
					c_a5.cG.method_if(var1, var15 + c_a5.gg.field_try - c_a5.cG.field_try,
							var16 + c_a5.gg.a - c_a5.cG.a, ee[var5][var10]);
				} else {
					var1.drawImage(c_a5.fT, var15, var16, 0);
				}

				if (eg[var5][var10] != 0) {
					byte var11 = (byte) ((fc[var5][var10] - eg[var5][var10]) / 3 - 1);
					var1.setColor(6045209);
					int var12 = var15 + (c_a5.gg.field_try - 8 >> 1);
					int var13 = var16 - 3 - 8;
					var1.fillRect(var12 + 2, var13 - var11 * 27, 4, var11 * 27);
					var1.fillTriangle(var12, var13, var12 + 4 + 4, var13, var12 + 4, var13 + 4);
				}

				if (fC[var5] == fc[var5][var10]) {
					var8 = var15;
					var9 = var16;
				}
			}

			var1.setColor(16711680);
			var1.drawRect(var8 - 3, var9 - 3, 19, 19);
			var6.cq.a(var1);
			var1.setClip(0, 0, c_a5.ic, c_a5.il);
		}

	}

	public final void method_if(int var1, int var2) {
		if ((fc[var1][var2] - 1) / 3 * 5 <= ez[var1]) {
			int var3 = -1;

			for (int var4 = 0; var4 < var2; ++var4) {
				if (fc[var1][var4] == eg[var1][var2]) {
					var3 = var4;
					break;
				}
			}

			if (var3 == -1) {
				eO[var1][var2] = true;
			} else {
				if (ee[var1][var3] != eH[var1][var3]) {
					eO[var1][var2] = false;
					return;
				}

				eO[var1][var2] = true;
			}
		} else {
			eO[var1][var2] = false;
		}

	}

	public final void method_goto(int var1) {
		boolean var2 = false;
		byte var3 = ((c_be) c_a5.fE.elementAt(0)).ht;
		byte var4 = fC[var3];
		c_ao var5 = (c_ao) c_a5.es.cf().elementAt(0);

		do {
			byte var6;
			byte var8;
			label108: switch (var1) {
			case 0:
				var5.cl = --var5.cl < 0 ? 0 : var5.cl;
				var4 = (byte) (var4 - 3);
				if (!k(var4)) {
					for (var8 = 0; var8 < 3; ++var8) {
						var6 = (byte) (var5.cl * 3 + var8 + 1);
						if (k(var6)) {
							fC[var3] = var6;
							c_a5.es.c(ag().fl[var3][a(var3, fC[var3])]);
							break;
						}
					}

					var2 = true;
					continue;
				}

				fC[var3] = var4;
				c_a5.es.c(ag().fl[var3][a(var3, fC[var3])]);
				break;
			case 1:
				var5.cl = (byte) (++var5.cl >= var5.b6 ? var5.b6 - 1 : var5.cl);
				var4 = (byte) (var4 + 3);
				if (!k(var4)) {
					for (var8 = 0; var8 < 3; ++var8) {
						var6 = (byte) (var5.cl * 3 + var8 + 1);
						if (k(var6)) {
							fC[var3] = var6;
							c_a5.es.c(ag().fl[var3][a(var3, fC[var3])]);
							break;
						}
					}

					var2 = true;
					continue;
				}

				fC[var3] = var4;
				c_a5.es.c(ag().fl[var3][a(var3, fC[var3])]);
				break;
			case 2:
				var8 = (byte) ((fc[var3][a(var3, fC[var3])] - 1) % 3);
				if (--var4 < 1 || var8 == 0) {
					var2 = true;
					continue;
				}

				if (!k(var4)) {
					for (byte var9 = 1; var9 < 2; var9 = 2) {
						var8 = (byte) (var4 - 1);
						if (k(var8)) {
							fC[var3] = var8;
							c_a5.es.c(ag().fl[var3][a(var3, fC[var3])]);
							break;
						}
					}

					var2 = true;
					continue;
				}

				fC[var3] = var4;
				c_a5.es.c(ag().fl[var3][a(var3, fC[var3])]);
				break;
			case 3:
				var6 = (byte) ((fc[var3][a(var3, fC[var3])] - 1) % 3);
				if (++var4 > eT[var3] || var6 == 2) {
					var2 = true;
				} else {
					if (k(var4)) {
						fC[var3] = var4;
						c_a5.es.c(ag().fl[var3][a(var3, fC[var3])]);
					} else if (var6 != 2) {
						for (var8 = 1; var8 < 3 - var6 - 1; ++var8) {
							byte var7 = (byte) (var4 + var8);
							if (k(var7)) {
								fC[var3] = var7;
								c_a5.es.c(ag().fl[var3][a(var3, fC[var3])]);
								break label108;
							}
						}
					}
					break;
				}
			default:
				continue;
			}

			var2 = true;
		} while (!var2);

		((ah) c_a5.es.cf().elementAt(6)).a(eF[var3][a(var3, fC[var3])]);
		var5.cq.a((short) var5.cl, true);
	}

	private boolean k(byte var1) {
		boolean var2 = false;
		byte var3 = ((c_be) c_a5.fE.elementAt(0)).ht;

		for (int var4 = 0; var4 < fc[var3].length; ++var4) {
			if (fc[var3][var4] == var1) {
				var2 = true;
				break;
			}
		}

		return var2;
	}

	public final int a(byte var1, byte var2) {
		int var3 = -1;

		for (int var4 = 0; var4 < fc[var1].length; ++var4) {
			if (fc[var1][var4] == var2) {
				var3 = var4;
				break;
			}
		}

		return var3;
	}

	public final void method_case() {
		++fA;
		if (fA > 200) {
			fA = 0;
			c_a5.eQ.a(196639);
		}

		if (!c_a5.fR && fM <= 20) {
			long var1 = System.currentTimeMillis() - fp;
			fp = System.currentTimeMillis();
			++fM;
			if (var1 < 92L && ++fz > 10) {
				c_a5.dI.notifyDestroyed();
			}
		}

		if (!aa.field_int && !c_a5.fR) {
			label387: {
				if (c_z.field_case) {
					if (c_a5.gQ != null) {
						method_do((byte) 0);
						break label387;
					}

					if (super.field_byte == 9) {
						break label387;
					}
				}

				label341: switch (super.field_byte) {
				case 3:
					++super.dF;
					++e5;
					if (Y() == 0 && (c_l.a().method_for() == 4 || c_l.a().method_for() == 5 || c_l.a().method_for() == 6
							|| c_l.a().method_for() == 7 || c_l.a().method_for() == 8 || c_l.a().method_for() == 11)) {
						if (super.dF > es / 120) {
							super.dF = 0;
							method_do((byte) 4);
							c_a5.eQ.a(1572866);
						}
					} else if (c_l.a().method_for() == 10 && ei != 0) {
						if (e5 > fs / 120) {
							e5 = 0;
							method_do((byte) 0);
							if (ei == 1) {
								c_a5.eQ.a(852000);
							} else if (ei == 2) {
								c_a5.eQ.a(852009);
							} else if (ei == 3) {
								c_a5.eQ.a(852003);
							}

							ei = 0;
						}
					} else {
						short var7;
						if ((var7 = ab()) != -1) {
							if (super.dF > el[var7] / 120) {
								super.dF = 0;
								et[var7] = System.currentTimeMillis();
								c_b5.method_case("到施法时间CD_Count[" + var7 + "] =" + et[var7]);
								switch (i()) {
								case 1:
								case 2:
									method_do((byte) 2);
									break;
								default:
									method_do((byte) 4);
								}

								aG();
								c_a5.eQ.a(196614);
								b2.a();
								av var2;
								(var2 = b2.field_try).a((byte) 1, fj[var7], true);
								et[0] = System.currentTimeMillis();
								var2.a((byte) 1, 0, true);
								var2.method_goto();
							}
						} else {
							method_do((byte) 0);
						}
					}
					break;
				case 100:
				case 101:
					l();
					if (super.field_byte == 0 || super.field_byte == 101) {
						method_case(((bz) c_l.g).F(), ((bz) c_l.g).z());
						if (super.aA.length > 0) {
							method_do((byte) 100);
						} else {
							method_do((byte) 101);
						}
					}
					break;
				case 102:
				case 103:
				case 105:
					byte var3 = super.field_byte;
					if (am()) {
						switch (var3) {
						case 102:
							if (super.aB) {
								break label341;
							}

							if (at()) {
								aL();
							}
							break;
						case 103:
							switch (c_l.g.field_try) {
							case 2:
							case 3:
								if (((bz) ((bz) c_l.g)).m() < 0) {
									az();
								} else {
									c_a5.eQ.a(851969);
									method_do((byte) 0);
								}
								break;
							case 4:
							case 5:
							case 6:
							case 7:
							case 8:
								eK = true;
								av();
								method_do((byte) 3);
							}
						case 104:
						default:
							break;
						case 105:
							if (super.aB) {
								break label341;
							}

							ag();
							if (et[0] <= 0L) {
								aL();
							}
						}

						method_byte(e(), method_void());
						super.aA = new int[0][];
					} else {
						l();
						if (super.field_byte == 0) {
							method_case(c_l.g.e(), c_l.g.method_void());
							if (super.aA.length == 0) {
								switch (y()) {
								case 1:
									method_new((byte) 3);
									super.g = false;
									break;
								case 2:
									method_new((byte) 4);
									super.g = true;
									break;
								case 3:
									method_new((byte) 1);
									super.g = false;
									break;
								case 4:
									method_new((byte) 2);
									super.g = false;
									break;
								case 5:
									method_new((byte) 8);
									super.g = true;
									break;
								case 6:
									method_new((byte) 7);
									super.g = false;
									break;
								case 7:
									method_new((byte) 6);
									super.g = true;
									break;
								case 8:
									method_new((byte) 5);
									super.g = false;
								}
							}

							if (var3 == 105) {
								if (super.aA.length > 0) {
									method_do((byte) 102);
								} else {
									method_do((byte) 105);
								}
							} else {
								method_do(var3);
							}
						}
					}
					break;
				case 104:
					l();
				}

				if (c_a5.V() == 0 && c_a5.gQ == null && c_a5.h4 == null) {
					label318: {
						if (c_a5.method_byte(c_a5.iq[17])) {
							e(0);
						} else if (c_a5.method_byte(c_a5.iq[18])) {
							e(1);
						} else if (c_a5.method_byte(c_a5.iq[19])) {
							e(2);
						} else if (c_a5.method_byte(c_a5.iq[20])) {
							e(3);
						} else if (ay()) {
							break label318;
						}

						switch (super.field_byte) {
						case 0:
							if (c_a5.method_try(c_a5.iq[0])) {
								if (super.a7 == 3) {
									method_do((byte) 1);
									l((byte) 3);
									c_b5.method_case("direction == DIRECT_UP");
								} else {
									method_new((byte) 3);
								}
							} else if (c_a5.method_try(c_a5.iq[1])) {
								if (super.a7 == 1) {
									method_do((byte) 1);
									l((byte) 1);
								} else {
									method_new((byte) 1);
								}
							} else if (c_a5.method_try(c_a5.iq[2])) {
								if (super.a7 == 2) {
									method_do((byte) 1);
									l((byte) 2);
								} else {
									method_new((byte) 2);
								}
							} else if (c_a5.method_try(c_a5.iq[3])) {
								if (super.a7 == 4) {
									method_do((byte) 1);
									l((byte) 4);
								} else {
									method_new((byte) 4);
								}
							} else if (c_a5.method_byte(c_a5.iq[4])) {
								switch (super.a7) {
								case 1:
								case 8:
									super.a7 = 1;
									break;
								case 2:
								case 7:
									super.a7 = 2;
									break;
								case 3:
								case 5:
									super.a7 = 3;
									break;
								case 4:
								case 6:
									super.a7 = 4;
								}

								method_do((byte) 10);
							} else if (c_a5.method_byte(c_a5.iq[5])) {
								method_do(false);
							} else if (c_a5.method_byte(131072)) {
								method_do(true);
							} else {
								au();
								if (ab() != -1 && fq && super.dF == 0) {
									az();
								}
							}
							break;
						case 1:
							fq = false;
							if (c_a5.method_try(c_a5.iq[0])) {
								l((byte) 3);
							} else if (c_a5.method_try(c_a5.iq[1])) {
								l((byte) 1);
							} else if (c_a5.method_try(c_a5.iq[2])) {
								l((byte) 2);
							} else if (c_a5.method_try(c_a5.iq[3])) {
								l((byte) 4);
							} else {
								method_do((byte) 0);
								if (super.W != null) {
									super.W.method_do((byte) 0);
								}
							}
							break;
						case 2:
							if (c_a5.method_byte(c_a5.iq[0] | c_a5.iq[1] | c_a5.iq[2] | c_a5.iq[3])) {
								method_do((byte) 0);
							}
							break;
						case 3:
							if (c_a5.method_try(c_a5.iq[0])) {
								super.dF = 0;
								e5 = 0;
								method_do((byte) 1);
								l((byte) 3);
							} else if (c_a5.method_try(c_a5.iq[1])) {
								super.dF = 0;
								e5 = 0;
								method_do((byte) 1);
								l((byte) 1);
							} else if (c_a5.method_try(c_a5.iq[2])) {
								super.dF = 0;
								e5 = 0;
								method_do((byte) 1);
								l((byte) 2);
							} else if (c_a5.method_try(c_a5.iq[3])) {
								super.dF = 0;
								e5 = 0;
								method_do((byte) 1);
								l((byte) 4);
							} else if (c_a5.method_byte(c_a5.iq[17] | c_a5.iq[18] | c_a5.iq[19] | c_a5.iq[20])) {
								super.dF = 0;
								e5 = 0;
								method_do((byte) 0);
							} else if (c_z.field_case) {
								if (c_l.a().method_for() == 10 && ei != 0 && eA) {
									super.dF = 0;
									e5 = 0;
									ei = 0;
									if (false)
										;
									method_do((byte) 0);
								}
							} else if (c_l.a().method_for() == 11 && eA) {
								super.dF = 0;
								e5 = 0;
								if (false)
									;
								method_do((byte) 0);
							}
							break;
						case 10:
							if (c_a5.V() == 0) {
								if (c_a5.method_byte(c_a5.iq[0])) {
									method_new((byte) 3);
								} else if (c_a5.method_byte(c_a5.iq[1])) {
									method_new((byte) 1);
								} else if (c_a5.method_byte(c_a5.iq[2])) {
									method_new((byte) 2);
								} else if (c_a5.method_byte(c_a5.iq[3])) {
									method_new((byte) 4);
								} else if (!c_a5.method_byte(c_a5.iq[5] | 131072) && !c_a5.method_byte(c_a5.iq[4])
										&& !c_a5.method_byte(c_a5.iq[17] | c_a5.iq[18] | c_a5.iq[19] | c_a5.iq[20])) {
									au();
								} else {
									method_do((byte) 0);
									if (super.W != null) {
										super.W.method_do((byte) 0);
									}
								}
							}

							l(super.a7);
							break;
						case 100:
						case 101:
							if (c_a5.method_byte(-262145)) {
								ar();
								method_byte(e(), method_void());
								super.aA = new int[0][];
							}
							break;
						case 102:
						case 103:
						case 105:
							if (c_a5.method_byte(-262145) && !c_a5.method_byte(c_a5.iq[5] | 131072)) {
								ar();
								method_byte(e(), method_void());
								super.aA = new int[0][];
							}
							break;
						case 104:
							fq = false;
							if (c_a5.method_byte(-262145)) {
								ar();
								method_byte(e(), method_void());
								super.aA = new int[0][];
							}
						}
					}
				} else if (super.field_byte == 10) {
					l(super.a7);
				}
			}
		}

		d();
		if (!c_z.field_int && !c_z.method_new()) {
			short var5 = c_a4.method_for(super.c, super.field_void);
			short var6 = c_a4.method_int(super.c, super.field_void);
			if (c_z.aI == 2) {
				if (c_z.w == 1) {
					method_if(var5, (short) (var6 + 1));
				} else if (c_z.w == 2) {
					method_if(var5, (short) (var6 - 1));
				}
			} else if (c_z.aI == 3) {
				method_if((short) (var5 + 1), var6);
			}

			super.c = c_z.method_for(method_void(), e());
			super.field_void = c_z.method_try(method_void(), e());
			c_as.a((byte) 0, "战场门没有开启,请稍等.", "确定", "", -1, -2);
		} else {
			method_if(c_a4.method_for(super.c, super.field_void), c_a4.method_int(super.c, super.field_void));
		}

		if (!aP()) {
			if (!super.cF) {
				super.cF = aU();
				if (super.cF) {
					c_a5.fR = true;
					W();
					c_a5.eQ.a(196612);
				}
			} else {
				super.cF = false;
			}

			if (c_a5.ht % 8 == 0 && c_f.field_else != null && super.cA && !c_a5.fR) {
				W();
				c_a5.eQ.a(196612);
			}
		}

		ap();
		I();
		t();
		U();
	}

	private void aG() {
		if (!aP()) {
			c_a5.eQ.a(196612);
			W();
		}

	}

	private boolean aU() {
		for (int var1 = 0; var1 < c_z.ah.length; ++var1) {
			if (method_void() == c_z.ah[var1][0] && e() == c_z.ah[var1][1]) {
				if (method_do() >= 100) {
					return false;
				}

				h();
				c_a5.fR = true;
				return true;
			}
		}

		return false;
	}

	private boolean aP() {
		return super.field_int == super.l && super.field_new == super.q;
	}

	private void au() {
		if (c_a5.gZ) {
			if (c_a5.method_byte(268435456)) {
				byte var2;
				if ((var2 = aN()) >= 0) {
					p(var2);
				}
			} else if (c_a5.method_if(268435456) && c_a5.method_char() && c_a5.a(0, c_a5.il - 36, c_a5.ic, 36)
					&& aN() < 0) {
				b2.a();
				b2.field_try.method_for();
			}
		}

		if (c_a5.method_byte(c_a5.iq[14])) {
			b2.a();
			b2.field_try.method_for();
		} else if (c_a5.method_byte(c_a5.iq[6])) {
			p((byte) 0);
		} else if (c_a5.method_byte(c_a5.iq[7])) {
			p((byte) 1);
		} else if (c_a5.method_byte(c_a5.iq[8])) {
			p((byte) 2);
		} else if (c_a5.method_byte(c_a5.iq[9])) {
			p((byte) 3);
		} else if (c_a5.method_byte(c_a5.iq[10])) {
			p((byte) 4);
		} else if (c_a5.method_byte(c_a5.iq[11])) {
			p((byte) 5);
		} else if (c_a5.method_byte(c_a5.iq[12])) {
			p((byte) 6);
		} else {
			if (c_a5.method_byte(c_a5.iq[13])) {
				p((byte) 7);
			}

		}
	}

	private static byte aN() {
		int var0 = av.C;
		if (c_a5.a(0, c_a5.il - var0, c_a5.ic, 36)) {
			boolean var1 = false;
			var0 = c_a5.il - var0 - 4;
			short var2 = c_a5.cV;
			short var3 = c_a5.cU;
			int var4 = 16 + av.t;

			for (byte var5 = 0; var5 < 8; ++var5) {
				int var6;
				if (var5 < 4) {
					var6 = 3 + var5 * (av.t + 16) - (av.t >> 1);
				} else {
					var6 = av.l - (7 - var5) * (av.t + 16) - (av.t >> 1);
				}

				if (var2 >= var6 && var2 <= var6 + var4 && var3 >= var0 && var3 <= var0 + 20) {
					return var5;
				}
			}
		}

		return -1;
	}

	private final void ar() {
		method_do((byte) 0);
		au();
	}

	private final void az() {
		eU = c_l.g.method_new();
		if (c_l.g != this && c_l.a().method_for() != 4 && c_l.a().method_for() != 5 && c_l.a().method_for() != 6
				&& c_l.a().method_for() != 7 && c_l.a().method_for() != 8) {
			if (am()) {
				if (super.aB) {
					return;
				}

				if (at()) {
					aL();
					return;
				}
			} else {
				method_do((byte) 102);
				method_case(((bz) c_l.g).e(), ((bz) c_l.g).method_void());
			}

		} else {
			av();
			method_do((byte) 2);
			super.h = -1;
		}
	}

	private final boolean at() {
		if (et[0] > 0L) {
			if (method_do() != 105) {
				method_do((byte) 105);
			}

			return false;
		} else {
			return true;
		}
	}

	private final void aL() {
		av();
		et[0] = System.currentTimeMillis();
		method_do((byte) 2);
		ag().method_int((short) 0);
		super.h = -1;
		eU = c_l.g.method_new();
		aG();
		c_a5.eQ.a(196614);
		b2.a();
		av var1;
		(var1 = b2.field_try).a((byte) 1, 0, true);
		var1.method_goto();
	}

	private void method_do(boolean var1) {
		if (c_l.g == this) {
			bp var9 = this;
			c_a4 var12 = null;
			int var10 = ey;
			int var5;
			int var11;
			if (c_l.field_long) {
				for (var11 = c_l.field_else.length - 1; var11 >= 0; --var11) {
					if (c_l.field_else[var11].field_try == 1 && ((bz) ((bz) c_l.field_else[var11])).m() < 0
							&& c_l.field_else[var11].method_do() != 9
							&& (var5 = (var9.c - c_l.field_else[var11].method_try())
									* (var9.c - c_l.field_else[var11].method_try())
									+ (var9.field_void - c_l.field_else[var11].b())
											* (var9.field_void - c_l.field_else[var11].b())) < var10) {
						var10 = var5;
						var12 = c_l.field_else[var11];
					}
				}
			}

			if (var12 == null) {
				var11 = c_l.field_else.length - 1;

				while (true) {
					if (var11 < 0) {
						if (var12 != null) {
							break;
						}

						var10 = eo;

						for (var11 = c_l.field_else.length - 1; var11 >= 0; --var11) {
							if ((c_l.field_else[var11].field_try == 4 || c_l.field_else[var11].field_try == 5
									|| c_l.field_else[var11].field_try == 6 || c_l.field_else[var11].field_try == 7
									|| c_l.field_else[var11].field_try == 8)
									&& (var5 = (var9.c - c_l.field_else[var11].method_try())
											* (var9.c - c_l.field_else[var11].method_try())
											+ (var9.field_void - c_l.field_else[var11].b())
													* (var9.field_void - c_l.field_else[var11].b())) < var10) {
								var10 = var5;
								var12 = c_l.field_else[var11];
							}
						}

						if (var12 != null) {
							break;
						}

						for (var11 = c_l.field_else.length - 1; var11 >= 0; --var11) {
							if ((c_l.field_else[var11].field_try == 2 || c_l.field_else[var11].field_try == 3)
									&& ((bz) ((bz) c_l.field_else[var11])).m() >= 0
									&& c_l.field_else[var11].method_do() != 9
									&& (var5 = (var9.c - c_l.field_else[var11].method_try())
											* (var9.c - c_l.field_else[var11].method_try())
											+ (var9.field_void - c_l.field_else[var11].b())
													* (var9.field_void - c_l.field_else[var11].b())) < var10) {
								var10 = var5;
								var12 = c_l.field_else[var11];
							}
						}

						if (var12 == null && c_l.field_long) {
							for (var11 = c_l.field_else.length - 1; var11 >= 0; --var11) {
								if (c_l.field_else[var11] != var9 && c_l.field_else[var11].field_try == 1
										&& ((bz) ((bz) c_l.field_else[var11])).m() >= 0
										&& c_l.field_else[var11].method_do() != 9
										&& (var5 = (var9.c - c_l.field_else[var11].method_try())
												* (var9.c - c_l.field_else[var11].method_try())
												+ (var9.field_void - c_l.field_else[var11].b())
														* (var9.field_void - c_l.field_else[var11].b())) < var10) {
									var10 = var5;
									var12 = c_l.field_else[var11];
								}
							}
						}
						break;
					}

					if ((c_l.field_else[var11].field_try == 2 || c_l.field_else[var11].field_try == 3)
							&& ((bz) ((bz) c_l.field_else[var11])).m() < 0 && c_l.field_else[var11].method_do() != 9
							&& (var5 = (var9.c - c_l.field_else[var11].method_try())
									* (var9.c - c_l.field_else[var11].method_try())
									+ (var9.field_void - c_l.field_else[var11].b())
											* (var9.field_void - c_l.field_else[var11].b())) < var10) {
						var10 = var5;
						var12 = c_l.field_else[var11];
					}

					--var11;
				}
			}

			if (var12 == null) {
				if (!super.aB) {
					av();
					method_do((byte) 2);
					super.h = -1;
				}

				return;
			}

			c_l.g = var12;
			switch (var12.field_try) {
			case 1:
				if (((bz) ((bz) c_l.g)).m() < 0) {
					fq = true;
					az();
				}
				break;
			case 2:
			case 3:
				if (((bz) ((bz) c_l.g)).m() < 0) {
					fq = true;
					az();
				} else if (am()) {
					c_a5.eQ.a(851969);
					method_do((byte) 0);
				} else {
					method_do((byte) 103);
					method_case(((bz) c_l.g).F(), ((bz) c_l.g).z());
				}
				break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				if (am()) {
					eK = true;
					av();
					method_do((byte) 3);
				} else {
					method_do((byte) 103);
					method_case(((ag) c_l.g).e(), ((ag) c_l.g).method_void());
				}
			}

			aA();
		} else if (c_l.g.field_try == 1) {
			if (((bz) c_l.g).m() >= 0) {
				c_br.iZ = new c_br((byte) 1);
				String[] var8 = new String[] { "查看", "好友资料", "加为好友", "屏蔽玩家", "私聊", "交易", "切磋邀请", "举报" };
				int[] var2 = new int[] { 393230, 393229, 589835, 589836, -268435452, 1376269, 196626, 196638 };
				String var3;
				int var4;
				if (c_bu.e == 0 || c_bu.h == ag().method_new()) {
					var3 = "组队邀请";
					var4 = 720897;
					var8 = c_b5.a(var8, var8.length, var3);
					var2 = c_b5.a(var2, var2.length, var4);
				}

				c_b5.method_case("clanRight" + eE);
				c_b5.method_case("kingRight" + er);
				if (er != c_i.field_for && er != c_i.field_void) {
					if (eE == c_bt.field_long || eE == c_bt.d) {
						var3 = "招入麾下";
						var4 = 1638405;
						var8 = c_b5.a(var8, var8.length, var3);
						var2 = c_b5.a(var2, var2.length, var4);
					}
				} else {
					var3 = "招入麾下";
					var4 = 1835013;
					var8 = c_b5.a(var8, var8.length, var3);
					var2 = c_b5.a(var2, var2.length, var4);
				}

				c_br.iZ.a(var8, var2);
				c_a5.method_try((byte) 6);
				return;
			}

			if (((bz) c_l.g).m() < 0) {
				if (var1 && ((bz) c_l.g).m() != -4 && !((bz) c_l.g).L()) {
					c_br.iZ = new c_br((byte) 1);
					String[] var6 = new String[] { "查看", "示好", "挑衅", "举报" };
					int[] var7 = new int[] { 393230, -268435451, -268435450, 196638 };
					c_br.iZ.a(var6, var7);
					c_a5.method_try((byte) 6);
					return;
				}

				fq = true;
				az();
				return;
			}
		} else if ((c_l.g.field_try == 3 || c_l.g.field_try == 2) && c_l.g.method_do() != 9) {
			if (((bz) ((bz) c_l.g)).m() < 0) {
				fq = true;
				az();
			} else {
				if (!am()) {
					method_do((byte) 103);
					method_case(((bz) c_l.g).F(), ((bz) c_l.g).z());
					return;
				}

				c_a5.eQ.a(851969);
				method_do((byte) 0);
			}
		} else {
			if (c_l.g.field_try == 4 || c_l.g.field_try == 5 || c_l.g.field_try == 6 || c_l.g.field_try == 7
					|| c_l.g.field_try == 8) {
				method_do((byte) 103);
				method_case(((ag) c_l.g).e(), ((ag) c_l.g).method_void());
				return;
			}

			if (c_l.g.field_try == 10) {
				c_a5.eQ.a(851969);
				method_do((byte) 0);
				return;
			}

			if (c_l.g.field_try == 11) {
				c_a5.eQ.a(852071);
				method_do((byte) 0);
			}
		}

	}

	private final void p(byte var1) {
		b2.a();
		av var2;
		byte var3 = (var2 = b2.field_try).field_else[var2.field_try][var1];
		int var9;
		if ((var9 = var2.F[var2.field_try][var1]) >= 0) {
			switch (var3) {
			case 1:
				av();
				short var10 = (short) var9;
				short var11 = method_void(var10);
				if (et[var11] > 0L) {
					return;
				}

				if (super.B) {
					if (i() == 1) {
						if (var10 < 4480 || var10 > 4495) {
							break;
						}
					} else if (i() == 5) {
						if (var10 < 21040 || var10 > 21055) {
							break;
						}
					} else if (i() == 2) {
						if (var10 < 8512 || var10 > 8527) {
							break;
						}
					} else if (i() != 4 || var10 < 16768 || var10 > 16783) {
						break;
					}
				}

				if (var10 <= 0) {
					az();
					return;
				}

				short var4 = eI[var11];
				bp var12 = this;
				boolean var5 = false;
				boolean var6 = false;
				short[] var7 = new short[] { 1, 2, 4, 8, 16, 32 };

				for (byte var8 = 0; var8 < var7.length; ++var8) {
					if ((var4 & var7[var8]) == var7[var8]) {
						switch (var8) {
						case 0:
							if (var12.bq == 0 && !var12.a4) {
								var5 = true;
							}
							break;
						case 1:
							if (var12.bq == 4 && !var12.a4) {
								var5 = true;
							}
							break;
						case 2:
							if (var12.bq == 1 && !var12.a4) {
								var5 = true;
							}
							break;
						case 3:
							if (var12.bq == 3 && !var12.a4) {
								var5 = true;
							}
							break;
						case 4:
							if (var12.bq == 2 && !var12.a4) {
								var5 = true;
							}
							break;
						case 5:
							if (var12.bq == 0 && var12.a4) {
								var5 = true;
							}
						}

						if (var5) {
							break;
						}
					}
				}

				if (!var5) {
					c_ad.a("当前形态不正确，无法使用" + eQ[var11] + "！", (Vector[]) null);
				} else {
					if (i() == 2) {
						switch (eG[var11]) {
						case 1:
							if (fJ == 0) {
								c_ad.a("连击点数不够，无法使用" + eQ[var11] + "！", (Vector[]) null);
								return;
							}
						}
					}

					boolean var13 = false;
					switch (eZ[var11]) {
					case 1:
						var13 = true;
						eU = method_new();
						break;
					case 2:
						if (c_l.a() instanceof bz && ((bz) ((bz) c_l.a())).m() < 0) {
							var13 = true;
							eU = c_l.a().method_new();
						}
						break;
					case 3:
						if (c_l.a() instanceof bz) {
							if (((bz) ((bz) c_l.a())).m() >= 0) {
								if (method_char(var10) && ((bz) ((bz) c_l.a())).method_do() != 9) {
									var13 = false;
								} else {
									var13 = true;
									eU = c_l.a().method_new();
								}
							} else if (!method_char(var10)) {
								var13 = true;
								eU = method_new();
							}
						} else if (!method_char(var10)) {
							var13 = true;
							eU = method_new();
						}
						break;
					case 4:
						eU = method_new();
						var13 = true;
					}

					if (!var13) {
						c_ad.a("施法对象错误，无法使用" + eQ[var11] + "！", (Vector[]) null);
					} else {
						if (eU != method_new()) {
							var5 = false;
							if ((super.c - c_l.a().method_try()) * (super.c - c_l.a().method_try())
									+ (super.field_void - c_l.a().b()) * (super.field_void - c_l.a().b()) > fm[var11]
											* fm[var11]) {
								var5 = true;
							}

							if (var5) {
								c_ad.a("超出施法距离，无法使用" + eQ[var11] + "！", (Vector[]) null);
								break;
							}
						}

						if (v() >= eB[var11]) {
							method_int(var10);
							c_b5.method_case("使用  ID=" + var10);
							method_for(var11);
							method_do((byte) 3);
							return;
						}

						c_ad.a("魔法值不足！", (Vector[]) null);
					}
				}
				break;
			case 2:
				av.g = var9;
				c_a5.eQ.a(458763);
			}
		}

	}

	private void av() {
		if (super.ap == 1) {
			c_a5.eQ.a(458766);
			if (super.W == null) {
				E();
				return;
			}

			g();
		}

	}

	private static void ap() {
		b2.a();
		av var0 = b2.field_try;
		eX.size();
		boolean var1 = false;

		for (byte var2 = 0; var2 < 63; ++var2) {
			short var3;
			if ((var3 = method_void(fe[var2])) != -1 && fe[var2] != 0 && et[var3] > 0L
					&& System.currentTimeMillis() - et[var3] >= (long) fg[var3]) {
				et[var3] = 0L;
				var0.a((byte) 1, fe[var2], false);
				var1 = true;
			}
		}

		if (et[0] > 0L && System.currentTimeMillis() - et[0] >= (long) fg[0]) {
			et[0] = 0L;
			var0.a((byte) 1, 0, false);
			var1 = true;
		}

		if (var1) {
			var0.method_goto();
		}

	}

	private static boolean method_char(short var0) {
		return var0 >= 16496 && var0 <= 16511 || var0 >= 20656 && var0 <= 20671;
	}

	private void e(int var1) {
		if (c_l.g != null && var1 != 1) {
			int var2 = c_l.field_else.length;
			int var3 = c_b5.method_if(c_l.field_else, c_l.g);

			for (int var4 = var2 - 1; var4 >= 0; --var4) {
				int var5 = (var4 + var3) % var2;
				if (c_l.field_else[var5].field_try != 9) {
					switch (var1) {
					case 0:
						if (!c_l.field_long && c_l.field_else[var5].field_try == 1 && c_l.field_else[var5] != this) {
							continue;
						}
					case 1:
					default:
						break;
					case 2:
						if (c_l.field_else[var5] instanceof bz && ((bz) c_l.field_else[var5]).m() < 0) {
							continue;
						}
						break;
					case 3:
						if (c_l.field_else[var5] instanceof ag || c_l.field_else[var5] instanceof bz
								&& ((bz) c_l.field_else[var5]).m() >= 0 && c_l.field_else[var5] != this) {
							continue;
						}
					}

					if (a(c_l.field_else[var5])) {
						c_l.g = c_l.field_else[var5];
						break;
					}
				}
			}
		} else {
			c_l.g = this;
		}

		aA();
	}

	public final void aA() {
		switch (c_l.g.method_for()) {
		case 1:
		case 2:
		case 3:
			switch (((bz) c_l.g).m()) {
			case -4:
			case -3:
			case -2:
			case -1:
			case 0:
				if (r() > ((bz) c_l.g).r() + 20) {
					c_l.field_char.a(c_l.g, (short) 2, (byte) -1);
					return;
				}

				c_l.field_char.a(c_l.g, (short) 1, (byte) -1);
				return;
			case 1:
			case 2:
			case 3:
			case 4:
				fq = false;
				c_l.field_char.a(c_l.g, (short) 0, (byte) -1);
			}
		case 9:
		default:
			return;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 10:
		case 11:
			c_l.field_char.a(c_l.g, (short) 0, (byte) -1);
		}
	}

	private boolean a(c_a4 var1) {
		boolean var2 = false;
		int var4;
		if (var1 instanceof bz) {
			bz var3;
			if ((var3 = (bz) var1).m() < 0) {
				var4 = ej;
			} else {
				var4 = fB;
			}
		} else {
			var4 = fB;
		}

		return (super.c - var1.method_try()) * (super.c - var1.method_try())
				+ (super.field_void - var1.b()) * (super.field_void - var1.b()) < var4;
	}

	public final boolean aF() {
		boolean var1 = false;
		int var2;
		if (c_l.g instanceof bz) {
			if (((bz) c_l.g).m() < 0) {
				var2 = fa;
			} else {
				var2 = e8;
			}
		} else {
			var2 = e8;
		}

		return method_do() != 102 && (super.c - c_l.g.method_try()) * (super.c - c_l.g.method_try())
				+ (super.field_void - c_l.g.b()) * (super.field_void - c_l.g.b()) > var2;
	}

	public final void ax() {
		for (int var1 = c_l.field_else.length - 1; var1 >= 0; --var1) {
			if (c_l.field_else[var1].l == super.l && c_l.field_else[var1].q == super.q
					&& c_l.field_else[var1].field_try == 3) {
				bz var2 = (bz) ((bz) (c_l.g = c_l.field_else[var1]));
				aA();
				if (var2.m() >= 0) {
					c_a5.eQ.a(851969);
				}

				return;
			}
		}

	}

	private boolean am() {
		c_a4 var1 = c_l.g;
		if ((super.c - var1.method_try()) * (super.c - var1.method_try())
				+ (super.field_void - var1.b()) * (super.field_void - var1.b()) <= fd) {
			boolean var2 = super.c >= var1.method_try();
			boolean var3 = super.field_void >= var1.b();
			switch (super.a7) {
			case 1:
			case 8:
				if (!var3) {
					return true;
				}

				return false;
			case 2:
			case 7:
				if (var2) {
					return true;
				}

				return false;
			case 3:
			case 5:
				if (var3) {
					return true;
				}

				return false;
			case 4:
			case 6:
				if (!var2) {
					return true;
				}

				return false;
			default:
				return false;
			}
		} else {
			return false;
		}
	}

	public final void a(long var1) {
		eY = var1;
	}

	public final void method_if(long var1) {
		fR = var1;
	}

	public final long aM() {
		return eY;
	}

	public final long aD() {
		return fR;
	}

	public final byte aj() {
		return fF;
	}

	public final int an() {
		return eV;
	}

	public final void method_long(int var1) {
		eV = var1;
	}

	public final int aR() {
		return fP;
	}

	public final void g(byte var1) {
		fP = var1;
	}

	public final String ah() {
		return eN;
	}

	public final void method_do(String var1) {
		eN = var1;
	}

	public final byte aI() {
		return fJ;
	}

	public final void n(byte var1) {
		fJ = var1;
	}

	public final boolean al() {
		return eA;
	}

	public final void method_if(boolean var1) {
		eA = var1;
		if (var1 && !c_be.hp) {
			c_be.hp = true;
			c_ad.a("你正在遭到攻击！", true);
		} else {
			c_be.hp = false;
		}
	}

	public final void a(Graphics var1) {
		super.a(var1);
	}

	public final void method_char(Graphics var1) {
		boolean var2 = false;
		int var3;
		if (c_a5.d8) {
			var3 = c_a5.il - 36 - c_ad.field_long.getHeight() - 7 - 20;
		} else {
			var3 = c_a5.il - 36 - 2 * c_a5.iG - 8;
		}

		if (Y() == 0 && (c_l.a().method_for() == 4 || c_l.a().method_for() == 5 || c_l.a().method_for() == 6
				|| c_l.a().method_for() == 7 || c_l.a().method_for() == 8 || c_l.a().method_for() == 11)) {
			method_if(var1, var3);
			c_b5.a(var1, c_a5.ic - 50 >> 1, var3 + 2, super.dF * 50 / (es / 120), 3, 16776960);
		} else if (c_l.a().method_for() == 10 && ei != 0) {
			method_if(var1, var3);
			c_b5.a(var1, c_a5.ic - 50 >> 1, var3 + 2, e5 * 50 / (fs / 120), 3, 16776960);
		} else {
			if (el[ab()] != 0) {
				method_if(var1, var3);
				c_b5.a(var1, c_a5.ic - 50 >> 1, var3 + 2, super.dF * 50 / (el[ab()] / 120), 3, 16776960);
			}

		}
	}

	private static void method_if(Graphics var0, int var1) {
		c_b5.method_if(var0, c_a5.ic - 50 - 4 >> 1, var1, 54, 7, c_bm.aR);
		c_b5.method_if(var0, (c_a5.ic - 50 - 4 >> 1) + 1, var1 + 1, 52, 5, c_bm.aP);
		c_b5.a(var0, c_a5.ic - 50 >> 1, var1 + 2, 50, 3, 0);
	}

	private void l(byte var1) {
		if (super.a7 != var1) {
			method_new(var1);
		}

		method_long(var1);
		int var2 = super.aT % 7;
		switch (super.a7) {
		case 1:
			if (!c_z.a().method_int(super.l + 1, super.q + 1)) {
				if (super.c <= c_z.method_for(super.l, super.q)) {
					if (!c_z.a().method_int(super.l, super.q + 1)) {
						if (c_z.a().method_int(super.l + 1, super.q)) {
							method_long((byte) 8);
						}
					} else {
						method_long((byte) 7);
					}
				} else if (!c_z.a().method_int(super.l + 1, super.q)) {
					if (c_z.a().method_int(super.l, super.q + 1)) {
						method_long((byte) 7);
					}
				} else {
					method_long((byte) 8);
				}

				super.field_void = (short) (super.field_void - bz.bj[var2][1]);
			} else if (!c_z.a().method_int(super.l, super.q + 1)) {
				if (c_z.a().method_int(super.l + 1, super.q)) {
					method_long((byte) 8);
				}

				super.field_void = (short) (super.field_void - bz.bj[var2][1]);
			} else if (!c_z.a().method_int(super.l + 1, super.q)) {
				if (c_z.a().method_int(super.l, super.q + 1)) {
					method_long((byte) 7);
				}

				super.field_void = (short) (super.field_void - bz.bj[var2][1]);
			}
			break;
		case 2:
			if (!c_z.a().method_int(super.l - 1, super.q + 1)) {
				if (super.field_void <= c_z.method_try(super.l, super.q)) {
					if (!c_z.a().method_int(super.l - 1, super.q)) {
						if (c_z.a().method_int(super.l, super.q + 1)) {
							method_long((byte) 7);
						}
					} else {
						method_long((byte) 5);
					}
				} else if (!c_z.a().method_int(super.l, super.q + 1)) {
					if (c_z.a().method_int(super.l - 1, super.q)) {
						method_long((byte) 5);
					}
				} else {
					method_long((byte) 7);
				}

				super.c = (short) (super.c + bz.bj[var2][0]);
			} else if (!c_z.a().method_int(super.l - 1, super.q)) {
				if (c_z.a().method_int(super.l, super.q + 1)) {
					method_long((byte) 7);
				}

				super.c = (short) (super.c + bz.bj[var2][0]);
			} else if (!c_z.a().method_int(super.l, super.q + 1)) {
				if (c_z.a().method_int(super.l - 1, super.q)) {
					method_long((byte) 5);
				}

				super.c = (short) (super.c + bz.bj[var2][0]);
			}
			break;
		case 3:
			if (!c_z.a().method_int(super.l - 1, super.q - 1)) {
				if (super.c <= c_z.method_for(super.l, super.q)) {
					if (!c_z.a().method_int(super.l - 1, super.q)) {
						if (c_z.a().method_int(super.l, super.q - 1)) {
							method_long((byte) 6);
						}
					} else {
						method_long((byte) 5);
					}
				} else if (!c_z.a().method_int(super.l, super.q - 1)) {
					if (c_z.a().method_int(super.l - 1, super.q)) {
						method_long((byte) 5);
					}
				} else {
					method_long((byte) 6);
				}

				super.field_void = (short) (super.field_void + bz.bj[var2][1]);
			} else if (!c_z.a().method_int(super.l - 1, super.q)) {
				if (c_z.a().method_int(super.l, super.q - 1)) {
					method_long((byte) 6);
				}

				super.field_void = (short) (super.field_void + bz.bj[var2][1]);
			} else if (!c_z.a().method_int(super.l, super.q - 1)) {
				if (c_z.a().method_int(super.l - 1, super.q)) {
					method_long((byte) 5);
				}

				super.field_void = (short) (super.field_void + bz.bj[var2][1]);
			}
			break;
		case 4:
			if (!c_z.a().method_int(super.l + 1, super.q - 1)) {
				if (super.field_void <= c_z.method_try(super.l, super.q)) {
					if (!c_z.a().method_int(super.l, super.q - 1)) {
						if (c_z.a().method_int(super.l + 1, super.q)) {
							method_long((byte) 8);
						}
					} else {
						method_long((byte) 6);
					}
				} else if (!c_z.a().method_int(super.l + 1, super.q)) {
					if (c_z.a().method_int(super.l, super.q - 1)) {
						method_long((byte) 6);
					}
				} else {
					method_long((byte) 8);
				}

				super.c = (short) (super.c - bz.bj[var2][0]);
			} else if (!c_z.a().method_int(super.l, super.q - 1)) {
				if (c_z.a().method_int(super.l + 1, super.q)) {
					method_long((byte) 8);
				}

				super.c = (short) (super.c - bz.bj[var2][0]);
			} else if (!c_z.a().method_int(super.l + 1, super.q)) {
				if (c_z.a().method_int(super.l, super.q - 1)) {
					method_long((byte) 6);
				}

				super.c = (short) (super.c - bz.bj[var2][0]);
			}
		}

		boolean var10000 = false;
	}

	public final void aq() {
		if (c_a5.gZ && c_a5.method_byte(268435456) && c_br.iZ.df()) {
			c_a5.a(131072);
		}

		int var1;
		switch (var1 = (Integer) ((Integer) c_br.iZ.db().elementAt(c_br.iZ.de()))) {
		case -268435452:
			a3.a(c_l.g.method_new(), c_l.g.method_byte(), true);
			break;
		case -268435451:
			eS = 1;
			c_a5.eQ.a(393233);
			c_a5.method_try((byte) 0);
			break;
		case -268435450:
			eS = 2;
			c_a5.eQ.a(393233);
			c_a5.method_try((byte) 0);
			break;
		case 196626:
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		case 196638:
			c_l.field_try = c_l.g.method_new();
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		case 393229:
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		case 393230:
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		case 589835:
		case 589836:
			c_bg.hP = c_l.g.method_new();
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		case 720897:
			c_bu.k = c_l.g.method_new();
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		case 1376269:
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		case 1638405:
			c_b5.method_case("加氏族--------------------------");
			c_bt.f = c_l.g.method_new();
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		case 1835013:
			c_b5.method_case("加诸侯--------------------------");
			c_i.field_long = c_l.g.method_new();
			c_a5.eQ.a(var1);
			c_a5.method_try((byte) 0);
			break;
		default:
			c_ad.method_int((byte) 7, "此功能尚未开启。", -1, "", (Vector) null, (Vector[]) null);
			c_a5.method_try((byte) 0);
		}

		c_br.iZ = null;
	}

	public final int ai() {
		return ft;
	}

	public final void b(int var1) {
		ft = var1;
	}

	public final byte aT() {
		return eE;
	}

	public final void i(byte var1) {
		eE = var1;
	}

	public final int aS() {
		return ev;
	}

	public final void d(int var1) {
		ev = var1;
	}

	public final byte as() {
		return er;
	}

	public final void h(byte var1) {
		er = var1;
	}

	private boolean ay() {
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4 = false;
		if (c_a5.gZ && c_a5.method_byte(268435456)) {
			boolean var5;
			int var6;
			int var7;
			int var8;
			if (c_a5.method_else() == 5 && c_a5.V() == 0 && c_ad.a == 0) {
				var5 = false;
				var6 = c_a5.il - 36 - c_ad.field_long.getHeight();
				var7 = c_a5.ic;
				var8 = c_ad.field_long.getHeight();
				if (c_a5.a(0, var6, var7, var8)) {
					var4 = true;
					c_a5.a(c_a5.iq[16]);
				}
			}

			if (c_bu.n != null) {
				int var12 = -1;
				var6 = 26;
				var7 = 2 + b2.field_if;
				if (c_bu.c) {
					var6 = 26 + c_a5.iG;
					var7 += c_a5.iG;
				}

				boolean var16 = false;
				boolean var9 = false;
				boolean var10 = false;
				int var11 = 0;

				for (var8 = c_bu.n.length; var11 < var8; ++var11) {
					int var19 = var7 + var11 * var6;
					if (c_a5.a(2, var19, 48, 14)) {
						var1 = true;
						var12 = var11;
						break;
					}
				}

				if (var1) {
					for (var11 = c_l.field_else.length - 1; var11 >= 0; --var11) {
						if (c_l.field_else[var11].field_goto == c_bu.n[var12].field_goto) {
							if ((super.c - c_l.field_else[var11].method_try())
									* (super.c - c_l.field_else[var11].method_try())
									+ (super.field_void - c_l.field_else[var11].b())
											* (super.field_void - c_l.field_else[var11].b()) <= eo) {
								c_l.method_do(c_l.field_else[var11]);
								aA();
							}
							break;
						}
					}
				}
			}

			short var13 = c_a5.gF.field_try;
			short var15 = c_a5.gF.a;
			var8 = -1;
			byte var20 = c_a5.gF.field_int;

			for (int var21 = 0; var21 < var20; ++var21) {
				if (c_a5.a(b2.field_new + var13 * var21, 2, var13, var15)) {
					var2 = true;
					var8 = var21;
					break;
				}
			}

			if (var2) {
				boolean var14;
				switch (var8) {
				case 0:
					c_a5.a(c_a5.iq[16]);
					break;
				case 1:
					b1.v(1);
					break;
				case 2:
					c_a5.eQ.a(458760);
					break;
				case 3:
					b1.v(3);
					break;
				case 4:
					b1.v(4);
					break;
				case 5:
					b1.v(8);
					break;
				case 6:
					b1.v(6);
					break;
				case 7:
					b1.dK();
					break;
				case 8:
					b1.v(9);
					break;
				case 9:
					b1.dN();
					b1.lx.method_if((byte) 10);
					b1.lx.method_char();
					var14 = false;
					b1.lx.field_new = var14;
					break;
				case 10:
					c_a5.eQ.a(2425024);
					break;
				case 11:
					b1.dN();
					b1.lx.method_if((byte) 11);
					b1.lx.method_char();
					var14 = false;
					b1.lx.field_new = var14;
					break;
				case 12:
					c_a5.eQ.a(2355697);
				}
			}

			if (!var2 && !var1 && c_a5.method_for(0, 0, c_a5.ic, c_z.aS)) {
				var3 = true;
				var5 = false;
				var6 = c_l.field_else.length - 1;

				while (true) {
					if (var6 < 0) {
						var13 = (short) (c_a5.eF + c_z.aE);
						short var17 = c_z.a(var15 = (short) (c_a5.eD + c_z.aD), var13);
						var13 = c_z.method_if(var15, var13);
						if (c_z.a().method_int(var17, var13)) {
							super.dF = 0;
							e5 = 0;
							fq = false;
							method_do((byte) 104);
							method_case(var13, var17);
							ef = c_a5.hN.field_new;
							fE = (short) (c_a5.eF - (c_a5.hN.field_try >> 1) + c_z.aE);
							fD = (short) (c_a5.eD - (c_a5.hN.a >> 1) + c_z.aD);
						}
						break;
					}

					if ((c_l.field_else[var6].field_try != 1 && c_l.field_else[var6].field_try != 2
							&& c_l.field_else[var6].field_try != 3 || c_l.field_else[var6].method_do() == 9)
							&& (c_l.field_else[var6].field_try != 1 || c_l.field_else[var6].method_do() != 9)) {
						if (c_l.field_else[var6].field_try != 4 && c_l.field_else[var6].field_try != 5
								&& c_l.field_else[var6].field_try != 6 && c_l.field_else[var6].field_try != 7
								&& c_l.field_else[var6].field_try != 8) {
							if ((c_l.field_else[var6].field_try == 10 || c_l.field_else[var6].field_try == 11)
									&& c_a5.a(c_l.field_else[var6].o - (c_a5.hk.field_try >> 1),
											c_l.field_else[var6].n - (c_a5.hk.a >> 1), c_a5.hk.field_try, c_a5.hk.a)) {
								var5 = true;
							}
						} else if (c_a5.a(c_l.field_else[var6].o - (c_a5.ch.field_try >> 1),
								c_l.field_else[var6].n - (c_a5.ch.a >> 1), c_a5.ch.field_try, c_a5.ch.a)) {
							var5 = true;
						}
					} else {
						bz var18;
						if (c_a5.a((var18 = (bz) c_l.field_else[var6]).D() + var18.method_long(), var18.M() + var18.a(),
								var18.G(), var18.x())) {
							var5 = true;
							if (var18.field_try == 1 && var18 != ag() && !c_l.field_long) {
								var5 = false;
							}
						}
					}

					if (var5) {
						if (a(c_l.field_else[var6])) {
							if (c_l.field_else[var6] == c_l.a()) {
								if (c_l.field_else[var6].field_try == 2
										|| c_l.field_else[var6].field_try == 1 && c_l.field_else[var6] != ag()) {
									if (!fq) {
										method_do(false);
										fq = true;
									}

									if (c_l.field_else[var6].field_try == 1
											&& ((bz) ((bz) c_l.field_else[var6])).m() >= 0) {
										fq = false;
									}
								} else {
									method_do(false);
								}
							} else {
								fq = false;
								c_l.method_do(c_l.field_else[var6]);
								aA();
								super.dF = 0;
								e5 = 0;
								method_do((byte) 0);
							}
						}
						break;
					}

					--var6;
				}
			}
		}

		return var2 || var1 || var3 || var4;
	}

	public static boolean c(int var0) {
		for (int var1 = 0; var1 < e4.length; ++var1) {
			if (var0 == e4[var1]) {
				return true;
			}
		}

		return false;
	}

	static {
		e8 = eo;
		fa = ey;
		fB = e8;
		ej = fa;
		e4 = new int[] { 27, 44, 93 };
		fh = null;
		fz = 0;
		fM = 0;
		fq = false;
	}
}
