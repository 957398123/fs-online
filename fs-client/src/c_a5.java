import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2020/01/22
 * @author 95739
 *
 */
public final class c_a5 extends Canvas implements Runnable {
	public static boolean gB = false;
	public static String ik = "";
	public static String iM = "";
	byte g0 = 0;
	public static String gd = "kong";
	public static String it = "";
	public static boolean hG = false;
	public static boolean d8;
	public static c_f eQ;
	public static bc gD;
	public static int ix;
	public static String[] gH;
	public static String[] hC;
	public static byte[] hs;
	public static byte is;
	public static String fr;
	public static String[] hR;
	private static byte[] fm;
	public static byte[] f6;
	public static byte fN = 0;
	public static b1 ea = null;
	static boolean cf = true;
	static boolean g9 = true;
	static boolean fA = true;
	static boolean gW = true;
	private static boolean en = false;
	private int fe = 0;
	public static boolean ir = false;
	public static c_a dI = null;
	public static int ic = 0;
	public static int il = 0;
	public static int cX = 0;
	public static int iA = 0;
	public static int iG = 0;
	public static Font fq = null;
	public static int dA = 0;
	public static byte fF = a1.a();
	private static byte gh = 0;
	public static byte cg = 0;
	private static boolean de = false;
	private static byte iK = 0;
	public static byte df = 0;
	public static c_a5 e8;
	private static int d5;
	private long el;
	private volatile Thread dQ;
	private long[] ee = new long[1];
	private Image gm = null;
	private Image eH = null;
	private byte c6 = 0;
	private static Image hf = null;
	private static Image c1 = null;
	private static Image cS = null;
	private int[] ij = new int[] { 13440024, 16165675, 14952962, 16432904 };
	private byte hW = 0;
	private byte eW = 0;
	private byte ct = 0;
	public static Image ge;
	public static Image ed;
	public static Image e4;
	private static Image dP;
	private static Image h1;
	public static bi gF = null;
	public static bi dF = null;
	public static bi fj = null;
	public static bi ch;
	public static bi b9;
	public static bi hN;
	public static bi cJ;
	public static bi hk;
	public static bi dE;
	public static bi eh;
	public static bi cO;
	public static bi fQ;
	public static Image fh;
	public static Image gu;
	public static Image hI;
	public static Image ca;
	public static Image ec;
	public static Image iJ;
	public static Image gU;
	public static Image eb;
	public static Image cY;
	public static Image e3;
	public static Image fz;
	public static Image gr;
	public static Image e9;
	public static Image f7;
	public static bi cG;
	public static Image fv = null;
	public static bi dY;
	public static Image fT = null;
	public static bi eR;
	public static bi dx;
	private static Image f5;
	public static bi hL;
	public static bi gz;
	public static Image eP;
	public static c_be es;
	public static c_be h4;
	public static c_be dS;
	public static Vector fE = new Vector();
	public static byte dK = -1;
	public static byte c9 = -1;
	public static Vector d6 = new Vector();
	private static String fu = "";
	private static int gO = 0;
	public static bi gg = null;
	public static boolean fR = false;
	public static boolean ep = false;
	public static Image gA;
	public static bi eq;
	public static int ht;
	public static byte[] h7 = null;
	public static byte[] h2 = null;
	public static byte[] gb = null;
	public static byte[][] gV = new byte[0][];
	public static byte[] dW = new byte[0];
	public static byte[] dO = null;
	public static int dh = -1;
	public static boolean dU;
	public static boolean hM = false;
	public static boolean cn = false;
	public static byte ci = 1;
	public static byte ck = 1;
	public static byte fW = 0;
	public static byte ig = 1;
	public static String fY = null;
	public static byte h6 = 0;
	public static byte hg = 0;
	public static a7[] iC = new a7[3];
	public static ah[] iD = new ah[5];
	public static int[] cy = new int[3];
	public static String[] e0 = new String[3];
	public static int[] im = new int[3];
	public static byte[] fZ = new byte[3];
	public static byte[] hE = new byte[3];
	public static byte[] eI = new byte[3];
	public static String[] d3 = new String[3];
	public static byte[] hV = new byte[3];
	public static boolean[] g3 = new boolean[3];
	public static boolean hw;
	public static String[] fc = new String[4];
	public byte cQ = 0;
	public static int gx;
	public static byte em = 0;
	public static byte eg = 0;
	public static boolean hH = false;
	public boolean ia = false;
	public byte[] cP;
	public byte[] fo;
	public static byte hq = 0;
	public byte cT = 0;
	public static byte iB = 0;
	public static byte[] fS;
	public static short[][] eS;
	public static short[] eJ;
	public static Image fM;
	public static short[][] g8;
	public static byte hQ = 0;
	public static boolean cC;
	public static boolean iE;
	private static boolean gE;
	public static byte hY;
	public static boolean dJ = false;
	private long cv;
	private long cB;
	public static int ek;
	private int h0;
	private long dz;
	private static c_a5.a ff = null;
	public static String gG = null;
	public static short dM;
	public static byte gK = 1;
	public static byte hi = 1;
	public static byte dv = 0;
	public static final String[] f9 = new String[] { "数字键0", "数字键1", "数字键2", "数字键3", "数字键4", "数字键5", "数字键6", "数字键7",
			"数字键8", "数字键9", "*键", "#键", "方向键上", "方向键下", "方向键左", "方向键右", "确认键" };
	public static final int[] iH = new int[] { 4096, 8192, 16384, 32768, 0, 65536, 2, 4, 8, 16, 32, 64, 128, 256, 512,
			1, 1024, 2048, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	public static int[] iq = null;
	public static final int[] eT = new int[] { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };
	private static int hh = 0;
	private static int eL = 0;
	private static int cl = 0;
	private static int cD = 0;
	public static int et = 0;
	private static int hl = 0;
	private static boolean in = false;
	public static short cV;
	public static short cU;
	private static boolean dk = false;
	public static short eF;
	public static short eD;
	static int[] gw;
	private static int e5;
	public static byte f3 = 0;
	public static boolean da = false;
	public static boolean gZ;
	private Image eN = null;
	private Image[] cI = new Image[3];
	private byte ds = 0;
	private static boolean d9 = false;
	private static boolean ie;
	private static String[] fC;
	private static boolean cF;
	private int gc;
	private int cd;
	public static c_as gQ;
	public static byte[][] gR;
	static byte gn;
	private static boolean cu;
	private static boolean iy;
	public static byte c3;
	private static byte[] hO;
	private static byte[] gy;
	private Image dG = null;
	private Image c4 = null;
	private Image[] g2 = new Image[2];

	public c_a5(c_a var1) {
		try {
			dI = var1;
			e8 = this;
			eQ = c_f.method_byte();
			gD = bc.method_if();
			bk.v = false;
			String var2;
			String var10;
			if ((hC = c_b5.method_do("name_password", 2)) == null) {
				var10 = dI.getAppProperty("username");
				var2 = dI.getAppProperty("userpsw");
				if (var10 != null && !"".equals(var10) && var2 != null && !"".equals(var2)) {
					c_b5.a(hC = new String[] { var10, var2 }, "name_password");
				}
			}

			if ((bk.B = System.getProperty("com.nokia.mid.imei")) != null && !"".equals(bk.B.trim())) {
				StringBuffer var11 = new StringBuffer();
				int var12 = 0;

				while (true) {
					if (var12 >= bk.B.length()) {
						bk.B = var11.toString();
						break;
					}

					if (bk.B.charAt(var12) >= '0' && bk.B.charAt(var12) <= '9'
							|| bk.B.charAt(var12) >= 'a' && bk.B.charAt(var12) <= 'z'
							|| bk.B.charAt(var12) >= 'A' && bk.B.charAt(var12) <= 'Z') {
						var11.append(bk.B.charAt(var12));
					}

					++var12;
				}
			} else {
				bk.B = String.valueOf(System.currentTimeMillis());
			}

			c_b5.method_case("PassPort.imei = " + bk.B);
			ad();
			g();

			try {
				var1 = null;
				if ((var10 = dI.getAppProperty("isTest")) != null && !"".equals(var10.trim())) {
					this.g0 = (byte) Integer.parseInt(var10.trim());
				}
			} catch (Exception var5) {
			}

			try {
				if ((var10 = dI.getAppProperty("passport")) != null && "true".equals(var10)) {
					bk.q = "202.108.44.149:9081";
					bk.aJ = "/judgeserver/judge?ver=2&";
					bk.ao = 2;
				}
			} catch (Exception var4) {
			}

			try {
				if ((bk.aK = dI.getAppProperty("fid")) == null || "".equals(bk.aK.trim())) {
					bk.aK = "1000";
				}
			} catch (Exception var7) {
			}

			gZ = this.hasPointerMotionEvents();
			this.setFullScreenMode(true);
			ic = this.getWidth();
			if ((il = this.getHeight()) >= 300) {
				d8 = true;
			} else {
				d8 = false;
			}

			iG = (fq = Font.getFont(0, 0, 8)).getHeight();
			iA = fq.stringWidth("正");
			if ((var2 = dI.getAppProperty("nativeserver")) != null && !var2.equals("")) {
				if (var2.equals("true")) {
					bk.G = true;
				} else if (var2.equals("false")) {
					bk.G = false;
				}
			} else {
				bk.G = false;
				System.out.println("没有得到nativeserver");
			}

			String var9;
			if ((var9 = dI.getAppProperty("round")) != null && !var9.equals("")) {
				if (var9.equals("true")) {
					da = true;
				} else if (var9.equals("false")) {
					da = false;
				}
			} else {
				da = false;
			}

			gw = c_b5.method_int("keyValue", ai.field_if.length);
			bk.g();

			try {
				if ((var10 = dI.getAppProperty("Ver")) != null && !var10.equals("") && method_int(var10) != 0) {
					a1.field_for = method_int(var10.trim());
				}
			} catch (Exception var3) {
			}

			try {
				if ((gd = dI.getAppProperty("JarSrc")) != null && !gd.equals("")) {
					gd = gd.trim();
				} else {
					gd = "kong";
				}
			} catch (Exception var6) {
				c_b5.method_case("Can not get platform!! May be a phoneEmu!");
			}

			System.out.println("jarFrom = " + gd);
			c_b5.method_byte();
		} catch (Exception var8) {
			var8.printStackTrace();
		}

		c_b5.a("mammoth.png");
		method_do((byte) 3);
	}

	public final synchronized void H() {
		this.dQ = new Thread(this);
		this.dQ.start();
	}

	private synchronized void method_goto() {
		this.dQ = null;
	}

	public final void run() {
		this.h0 = c_be.cA();
		Thread var1 = Thread.currentThread();
		c_b5.method_case("main:" + var1);

		while (var1 == this.dQ) {
			try {
				long var2 = l();
				et = eL;
				cD = hh;
				hl = cl;
				eL = 0;
				cl = 0;
				if (ff != null || fR && bp.ag().method_do() != 9) {
					D();
				}

				if (gZ) {
					dk = in;
					eF = cV;
					eD = cU;
				}

				synchronized (this) {
					eQ.method_do();
					if (!eQ.method_char()) {
						this.method_goto();
					}

					if (iy) {
						iy = false;
						c_f.method_byte().method_for();
					}
				}

				if (ir && iK == 2) {
					ir = false;
				}

				this.el += 120L;
				if (++ht >= 6000) {
					ht = 0;
				}

				++c_b5.field_int;
				this.method_byte();
				if (a1.field_do) {
					String var5;
					if (a1.field_if == 1) {
						var5 = "您输入的账号或密码有错误，请重新输入";
						a((byte) 0, var5, c_bm.a2[2], "", -6, -120);
					} else if (a1.field_if == 2) {
						var5 = "您的客户端与当前服务器版本号不符";
						a((byte) 0, var5, c_bm.a2[2], "", -6, -120);
					} else if (a1.field_if == 3 || a1.field_if == 4) {
						var5 = "您的通行证验证未通过";
						a((byte) 0, var5, c_bm.a2[2], "", -6, -120);
					}

					a1.field_do = false;
				}

				if ((iK == 5 || iK == 17 || iK == 18 || iK == 19 || iK == 27) && ht % 50 == 0) {
					eQ.a(3);
				}

				w.P();
				if ((System.currentTimeMillis() - ak.bu) / 1000L >= 1L) {
					ak.bu = System.currentTimeMillis();
					if (ak.bJ > 0) {
						--ak.bJ;
					} else if (ak.bP > 0) {
						--ak.bP;
						ak.bJ = 59;
					}
				}

				if (bk.aP) {
					if (!a1.field_new.equals("")) {
						if (gQ != null) {
							gQ = null;
						}

						if (this.g0 != 1) {
							a((byte) 0, "版本号已不是最新，但仍能使用，请选择是否更新", "下载", "继续", -8, -2);
						}
					} else {
						method_do((byte) 12);
					}

					bk.aP = false;
				}

				if (bk.ax) {
					if (gQ != null) {
						gQ = null;
					}

					if (bk.d) {
						hC[0] = bk.aa;
						hC[1] = bk.aa;
					}

					String var10;
					if (hQ == 1) {
						var10 = "您的账号为:" + hC[0] + "\n" + "您的密码为:" + hC[1] + "\n";
						a((byte) 0, var10, "确定", "", -25, -2);
					} else if (bk.d) {
						var10 = "您的账号为:" + hC[0] + "\n" + "您的密码为:" + hC[1] + "\n";
						a((byte) 0, var10, "确定", "取消", -31, -17);
					} else {
						a((byte) 0, bk.az, c_bm.a2[2], "", -30, -120);
					}

					bk.ax = false;
				}

				if (bk.V) {
					if (gQ != null) {
						gQ = null;
					}

					c_b5.method_do("name_password", hC.length);
					c_b5.a(hC, "name_password");
					a((byte) 0, bk.az, c_bm.a2[2], "", -6, -120);
					bk.V = false;
				}

				a9 var11;
				if (bk.e) {
					if (gQ != null) {
						gQ = null;
					}

					if (hQ == 1) {
						a9 var18 = (a9) es.cf().elementAt(9);
						var11 = (a9) es.cf().elementAt(10);
						if (bk.d) {
							var18.a(new StringBuffer(bk.aa));
							var11.a(new StringBuffer(bk.aa));
							hC[0] = var18.cc().toString();
							hC[1] = var11.cc().toString();
							bk.d = false;
						}
					} else {
						method_do((byte) 14);
					}

					bk.e = false;
				}

				label495: {
					if (bk.k) {
						if (bo.C == 2) {
							if (bk.h()) {
								a((byte) 0, "您的帐号已经绑定", "确定", "", -1, -120);
								bk.k = false;
								break label495;
							}

							bo.method_do((byte) 2);
							bk.k = false;
						} else if (bo.C == 3) {
							if (!bk.h()) {
								a((byte) 0, "您的帐号未绑定", "确定", "", -1, -120);
								bk.k = false;
								break label495;
							}

							bo.method_do((byte) 3);
							bk.k = false;
						}
					}

					if (bk.at) {
						if (gQ != null) {
							gQ = null;
						}

						method_do((byte) 32);
						bk.at = false;
					}

					if (bk.p) {
						if (gQ != null) {
							gQ = null;
						}

						if (bk.Q) {
							method_do((byte) 34);
						} else {
							method_do((byte) 33);
						}

						bk.p = false;
					}

					if (bk.ae) {
						if (gQ != null) {
							gQ = null;
						}

						method_do((byte) 38);
						bk.ae = false;
					}

					if (bk.ak) {
						if (gQ != null) {
							gQ = null;
						}

						method_do((byte) 38);
						bk.ak = false;
					}
				}

				if (hG) {
					method_do((byte) 12);
					hG = false;
					if (hY == 1) {
						hY = 0;
					}
				}

				if (es != null) {
					c_z.method_do(es.g9);
				}

				if (gZ && method_byte(268435456)) {
					switch (iK) {
					case 4:
						this.Y();
						break;
					case 5:
						switch (gh) {
						case 5:
							if (c_br.iW != null && !fR && c_br.iW.df()) {
								a(131072);
							}
							break;
						case 6:
							if (c_br.iZ != null && c_br.iZ.df()) {
								a(131072);
							}
						}

						if (h4 != null && !((ak) h4.cf().elementAt(3)).b() && a(0, 0, ic, il)) {
							a(262144);
						}
					case 6:
					case 7:
					default:
						break;
					case 8:
						ai.a();
					}
				}

				label423: switch (iK) {
				case 4:
					if (gQ != null) {
						gQ.a7();
					} else if (method_byte(196608)) {
						switch (this.hW) {
						case 0:
							if (cF) {
								this.x();
							} else {
								this.K();
							}
							break label423;
						case 1:
							if (cF) {
								this.Z();
							} else {
								this.x();
							}
							break label423;
						case 2:
							if (cF) {
								this.K();
							} else {
								this.Z();
							}
							break label423;
						case 3:
							if (hC == null) {
								hC = new String[2];
							}

							this.cT = 3;
							method_do((byte) 16);
							hQ = 0;
							break label423;
						case 4:
							h();
							break label423;
						case 5:
							s();
							break label423;
						case 6:
							X();
							break label423;
						case 7:
							this.L();
							break label423;
						case 8:
							a((byte) 0, "请等待服务器认证...", "", "", -120, -120);
							if (hC == null) {
								hC = new String[2];
							}

							hC[0] = "1241506146031";
							hC[1] = "1241506146031";
							var11 = null;
							(new bk(bk.q, bk.method_do((byte) 1), (byte) (dU ? 0 : 1), (byte) 2)).a((byte) 1);
							hQ = 1;
						}
					} else if (method_try((int) 4096)) {
						if (gQ == null) {
							--this.hW;
							if (this.hW < 0) {
								this.hW = (byte) (fC.length - 1);
							}

							--this.ct;
							if (this.ct < 0) {
								this.ct = 0;
								--this.eW;
								if (this.eW < 0) {
									this.eW = (byte) (fC.length - 1);
								}
							}
						}
					} else if (method_try((int) 8192) && gQ == null) {
						++this.hW;
						if (this.hW == fC.length) {
							this.hW = 0;
						}

						++this.ct;
						if (this.ct == 5) {
							this.ct = 4;
							++this.eW;
							if (this.eW == fC.length) {
								this.eW = 0;
							}
						}
					}
					break;
				case 5:
					de = false;
					if (bp.fI != null) {
						c_z.a();
						c_z.method_do(bp.ag().c, bp.ag().field_void);
					}

					c_l.method_do();
					c_l.method_if();
					b2.a();
					b2.method_do();
					if (aa.field_int) {
						if (gh == 3 && gQ == null) {
							c_ao.aH();
							c_be.gu.method_for();
						} else if (gh == 4 && gQ == null) {
							es.cw();
							c_ao.aH();
						} else if (gQ != null) {
							gQ.a7();
						} else if (ea != null) {
							ea.f();
						} else {
							if (!method_byte(1024)) {
								boolean var10000;
								label406: {
									if (gZ && ea == null) {
										int var9 = ic - gF.field_if.getWidth() >> 1;
										short var15 = gF.a;
										int var6 = il - 36 - c_ad.field_long.getHeight();
										int var7 = ic;
										int var8 = c_ad.field_long.getHeight();
										if (method_for(var9, 2, 196, var15) || method_for(0, var6, var7, var8)) {
											var10000 = true;
											break label406;
										}
									}

									var10000 = false;
								}

								if (!var10000) {
									if (!method_byte(1024) && method_byte(-1)) {
										eQ.a(3145734);
									}
									break;
								}
							}

							b1.v(71);
						}
					} else {
						this.aa();
					}
					break;
				case 6:
				case 9:
				case 10:
				case 13:
				case 20:
				case 24:
				case 25:
				case 26:
				case 27:
				case 29:
				default:
					if (es != null) {
						es.cw();
						c_ao.aH();
					}
				case 7:
					break;
				case 8:
					if (e5 != 0) {
						if (gZ) {
							ai.method_do(e5);
						} else {
							ai.method_for(e5);
						}

						e5 = 0;
					}
					break;
				case 11:
				case 12:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 21:
				case 22:
				case 23:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
					if (es != null && gQ != null) {
						gQ.a7();
					} else if (es != null && gQ == null) {
						es.cw();
						c_ao.aH();
					}

					if (iK == 11 && hM && !bk.ap && c_be.gd != 0L && System.currentTimeMillis() - c_be.gd > 30000L) {
						es.gT.N = true;
						c_be.gd = 0L;
						es.gT.method_for((byte) 0);
						(new bk(bk.q, bk.method_do((byte) 1), (byte) 1, (byte) 2)).a((byte) 1);
					}
					break;
				case 28:
					if (e5 != 0) {
						ai.a(e5);
						e5 = 0;
					}

					ai.method_for();
				}

				e5 = 0;
				if (es != null && gQ == null) {
					if (es.g9 == 196641) {
						ak var16 = (ak) es.cf().elementAt(3);
						if (ht % 300 == 1 && !c_l.d && var16.bv) {
							c_as.a((byte) 0, "您确定退出战场吗？", "确定", "取消", 852005, -1);
						}
					} else if (es.g9 == 196642) {
						c_bg var17 = (c_bg) es.cf().elementAt(3);
						if (ht % 300 == 1 && !c_l.d && var17.ie) {
							c_as.a((byte) 0, "您确定退出战场吗？", "确定", "取消", 852005, -1);
						}
					}
				}

				if (fR) {
					if (this.dz > 0L) {
						if (System.currentTimeMillis() - this.dz >= 60000L) {
							fR = false;
							this.dz = 0L;
							c_as.a((byte) 0, "请求服务器连接超时，请重新尝试", "确定", "", -1, -2);
						}
					} else {
						this.dz = System.currentTimeMillis();
					}
				} else {
					this.dz = 0L;
				}

				this.repaint();
				if (!dJ) {
					this.cB = System.currentTimeMillis();
				} else {
					this.cv = System.currentTimeMillis() - this.cB;
					if (this.cv > 6000000L) {
						ik = "";
						dJ = false;
						bk.l();
					}
				}

				d5 = (int) (l() - var2);
				synchronized (this) {
					this.wait((long) Math.max(1, this.h0 - d5));
				}

				ek = (int) (l() - var2);
				if (fF != 0 && ek < this.h0) {
					this.h0 = this.h0 * c_be.cA() / ek;
				}
			} catch (Exception var14) {
				var14.printStackTrace();
			}
		}

	}

	public static void method_void() {
		ff = new c_a5.a();
	}

	public static void B() {
		if (ff != null) {
			ff.a = null;
			ff = null;
		}

	}

	public final void paint(Graphics var1) {
		try {
			var1.setColor(0);
			var1.fillRect(0, 0, ic, il);
			var1.setFont(fq);
			boolean var6;
			switch (iK) {
			case 2:
				method_byte(var1);
				break;
			case 3:
				var1.setColor(16777215);
				var1.fillRect(0, 0, ic, il);
				if (this.gm != null) {
					if (this.c6 == 1) {
						var1.drawImage(this.gm, ic >> 1, il >> 1, 3);
					} else if (this.c6 == 2) {
						var1.drawImage(this.gm, ic >> 1, il >> 2, 17);
						if (this.eH == null) {
							this.eH = c_b5.a("/logo_ko.png");
						}

						var1.drawImage(this.eH, ic >> 1, (il >> 1) + (this.eH.getHeight() >> 1), 17);
					}
				}

				if (this.c6 >= 0) {
					int var10001 = this.c6 == 0 ? 0 : (this.c6 == 1 ? 1000 : 2000);
					var6 = false;
					int var7 = var10001;
					boolean var10000;
					if (this.ee[0] + (long) var7 > this.el) {
						var10000 = false;
					} else {
						this.ee[0] = 0L;
						var10000 = true;
					}

					if (var10000) {
						if (this.c6 < 2) {
							var6 = false;
							this.ee[0] = this.el;
							this.gm = c_b5.a("/logo_" + this.c6 + ".png");
							++this.c6;
						} else {
							this.gm = null;
							this.eH = null;
							this.c6 = 0;
							hf = c_b5.a("/logo.png");
							method_do((byte) 24);
						}
					}
				}
				break;
			case 4:
				var1.setColor(0);
				var1.fillRect(0, 0, ic, il);
				this.method_long();
				var1.drawImage(cS, 0, 0, 20);
				var1.setColor(16498698);
				StringBuffer var2;
				(var2 = new StringBuffer(4)).append("版本:");
				int var4 = a1.field_for;
				var2.append(String.valueOf(var4 >>> 24)).append(".");
				var4 = a1.field_for;
				var2.append(String.valueOf(var4 >>> 16 & 255)).append(".");
				var4 = a1.field_for;
				var2.append(String.valueOf(var4 >>> 8 & 255)).append(".");
				var4 = a1.field_for;
				var2.append(String.valueOf(var4 & 255));
				var1.drawString(var2.toString(), ic - var1.getFont().stringWidth(var2.toString()) - 2, 5, 20);
				this.method_char(var1);
				method_if(var1);
				break;
			case 5:
				switch (gh) {
				case 0:
					this.method_void(var1);
					w.method_new(var1);
					break;
				case 1:
					this.method_void(var1);
					if (ea != null) {
						ea.a(var1);
					}

					w.method_new(var1);
				case 2:
				default:
					break;
				case 3:
					c_be.gu.method_if(var1);
					break;
				case 4:
					if (!fR) {
						if (ep) {
							if (es != null && ep) {
								es.a(var1);
							}
						} else {
							this.method_void(var1);
						}
					} else if (dS != null) {
						dS.a(var1);
					}

					w.method_new(var1);
					break;
				case 5:
					this.method_void(var1);
					if (c_br.iW != null) {
						c_br.iW.a(var1);
					}

					w.method_new(var1);
					break;
				case 6:
					this.method_void(var1);
					if (c_br.iZ != null) {
						c_br.iZ.a(var1);
					}
				}

				if (gQ != null) {
					method_if(var1);
				}

				if (h4 != null && ep) {
					h4.a(var1);
				}

				if (gh != 4 && h4 == null) {
					c_ad.a(var1, false);
					c_ad.method_if(var1, false);
				} else {
					c_ad.a(var1, true);
					c_ad.method_if(var1, true);
				}
				break;
			case 6:
			case 8:
			case 9:
			case 10:
			case 13:
			case 20:
			case 25:
			case 26:
			case 27:
			case 29:
			default:
				if (es != null) {
					es.a(var1);
				}
			case 7:
				break;
			case 11:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 23:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
				if (es != null) {
					es.a(var1);
					method_if(var1);
				}
				break;
			case 24:
				this.d(var1);
				break;
			case 28:
				var1.setColor(0);
				var1.fillRect(0, 0, ic, il);
				ai.a(var1);
			}

			if (iK == 5 && fR) {
				method_case(var1);
			} else if (iK == 21 || iK == 22 || iK == 23 || iK == 5 && iE) {
				var1.setColor(16711680);
				var1.drawString("此操作将以短信形", ic >> 1, il - (iG << 1) - 25, 17);
				var1.drawString("式发送", ic >> 1, il - (iG << 1) - 10, 17);
			} else if (gE) {
				a9 var3 = (a9) es.cf().elementAt(9);
				var1.setColor(6045209);
				var1.drawString("请输入", (ic >> 1) - (iA << 1) - 5, var3.method_long() + var3.z() - 10 - (iG << 1), 17);
				var1.setColor(16711680);
				var1.drawString("DEL", ic >> 1, var3.method_long() + var3.z() - 10 - (iG << 1), 17);
				var1.setColor(6045209);
				var1.drawString("确认", (ic >> 1) + (iA << 1), var3.method_long() + var3.z() - 10 - (iG << 1), 17);
			}

			var6 = false;
			var1.setColor(255);
		} catch (Exception var5) {
			var5.printStackTrace();
		}
	}

	private static void method_case(Graphics var0) {
		for (int var1 = 0; var1 < 3; ++var1) {
			var0.setColor(0);
			var0.fillRect(ic - 60 + var1 * 12 + 2, iG + 5, 6, 6);
			var0.setColor(51204);
			var0.fillRect(ic - 60 + var1 * 12 + 3, iG + 5 + 1, 4, 4);
		}

		if (gO == 0) {
			var0.setColor(0);
			var0.fillRect(ic - 60, iG + 3, 10, 10);
			var0.setColor(51204);
			var0.fillRect(ic - 60 + 1, iG + 4, 8, 8);
		} else if (gO == 1) {
			var0.setColor(0);
			var0.fillRect(ic - 60 + 12, iG + 3, 10, 10);
			var0.setColor(51204);
			var0.fillRect(ic - 60 + 13, iG + 4, 8, 8);
		} else if (gO == 2) {
			var0.setColor(0);
			var0.fillRect(ic - 60 + 24, iG + 3, 10, 10);
			var0.setColor(51204);
			var0.fillRect(ic - 60 + 25, iG + 4, 8, 8);
		}

		if (++gO > 2) {
			gO = 0;
		}

	}

	private static final int method_case(int var0) {
		if (gw != null) {
			if (var0 == gw[0]) {
				return 131072;
			}

			if (var0 == gw[1]) {
				return 262144;
			}

			if (var0 == gw[2]) {
				return 65536;
			}
		}

		switch (var0) {
		case -50:
			return 8388608;
		case -49:
		case -48:
		case -47:
		case -46:
		case -45:
		case -44:
		case -43:
		case -42:
		case -41:
		case -40:
		case -39:
		case -38:
		case -37:
		case -36:
		case -35:
		case -34:
		case -33:
		case -32:
		case -29:
		case -28:
		case -27:
		case -26:
		case -25:
		case -24:
		case -19:
		case -18:
		case -17:
		case -16:
		case -15:
		case -14:
		case -13:
		case 0:
		case 3:
		case 4:
		case 7:
		case 8:
		case 9:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
		case 36:
		case 37:
		case 38:
		case 39:
		case 40:
		case 41:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		default:
			return -2147483648;
		case -31:
			return 134217728;
		case -30:
		case -9:
			return 67108864;
		case -23:
		case 23:
			return 16777216;
		case -22:
		case -11:
		case -7:
		case 22:
			return 262144;
		case -21:
		case -6:
		case 21:
			return 131072;
		case -20:
		case -5:
		case 20:
			return 65536;
		case -12:
			return 33554432;
		case -10:
		case 10:
			return 2097152;
		case -8:
			return 135266304;
		case -4:
		case 5:
			return 32768;
		case -3:
		case 2:
			return 16384;
		case -2:
		case 6:
			return 8192;
		case -1:
		case 1:
			return 4096;
		case 35:
			return 2048;
		case 42:
			return 1024;
		case 48:
			return 1;
		case 49:
			return 2;
		case 50:
			return 4;
		case 51:
			return 8;
		case 52:
			return 16;
		case 53:
			return 32;
		case 54:
			return 64;
		case 55:
			return 128;
		case 56:
			return 256;
		case 57:
			return 512;
		}
	}

	public static void a(int var0) {
		et |= var0;
		cD |= var0;
	}

	private static void method_for(int var0) {
		hl |= 8192;
		et &= -8193;
		cD &= -8193;
	}

	public final void keyPressed(int var1) {
		c_b5.a(var1);
		e5 = var1;
		int var2 = method_case(var1);
		eL |= var2;
		hh |= var2;
	}

	public final void keyReleased(int var1) {
		int var2 = method_case(var1);
		cl |= var2;
		hh &= ~var2;
	}

	protected final void pointerPressed(int var1, int var2) {
		if (gZ) {
			eL |= 268435456;
			hh |= 268435456;
			in = false;
			cV = (short) var1;
			cU = (short) var2;
		}

	}

	protected final void pointerReleased(int var1, int var2) {
		if (gZ) {
			cl |= 268435456;
			hh &= -268435457;
			cV = (short) var1;
			cU = (short) var2;
		}

	}

	protected final void pointerDragged(int var1, int var2) {
		if (gZ) {
			in = true;
			cV = (short) var1;
			cU = (short) var2;
		}

	}

	public static final void D() {
		eL = 0;
		hh = 0;
		cl = 0;
		et = 0;
		cD = 0;
		hl = 0;
		if (gZ) {
			in = false;
			dk = false;
		}

	}

	public static final boolean method_byte(int var0) {
		return (et & var0) != 0;
	}

	public static final boolean method_if(int var0) {
		return (hl & var0) != 0;
	}

	public static final boolean method_try(int var0) {
		return ((et | cD) & var0) != 0;
	}

	public static final boolean method_char() {
		return gZ ? dk : false;
	}

	public static final boolean method_for(int var0, int var1, int var2, int var3) {
		if (gZ) {
			return method_byte(268435456) && a(var0, var1, var2, var3);
		} else {
			return false;
		}
	}

	public static final boolean a(int var0, int var1, int var2, int var3) {
		return eF >= var0 && eF <= var0 + var2 && eD >= var1 && eD <= var1 + var3;
	}

	protected final void hideNotify() {
		D();
	}

	public static final void method_do(byte var0) {
		df = iK;
		iK = var0;
		if (var0 == 5) {
			a((c_be) null);
		}

		int var1;
		ak var3;
		String var4;
		c_ao var5;
		ah var7;
		c_bv var10;
		a9 var12;
		int var14;
		ah var16;
		switch (iK) {
		case 4:
			if (gQ != null) {
				gQ = null;
			}

			if (c1 == null) {
				c1 = c_b5.a("/mammoth.png");
				z();
				return;
			}
			break;
		case 5:
			method_try((byte) 0);
			return;
		case 6:
			a("/ui/list.ui");
			((c_ao) es.cf().elementAt(0)).method_do("帮　助");
			(var10 = (c_bv) es.cf().elementAt(2)).dy();

			for (var1 = 0; var1 < c_bm.bL.length; ++var1) {
				var10.a(new c_m(c_bm.bL[var1], (byte) 0, (byte) 0, var10.dF()));
			}

			return;
		case 7:
		case 9:
		case 20:
		case 24:
		case 25:
		case 26:
		case 28:
		default:
			break;
		case 8:
			ai.method_do();
			a("/ui/networksetup.ui");
			es.cf().elementAt(2);
			byte[] var18;
			if ((var18 = c_b5.method_byte("gamemount")) == null) {
				ai.field_byte = 2;
			} else {
				ai.field_byte = var18[0];
			}

			ai.method_int();
			if (gZ) {
				var16 = (ah) es.cf().elementAt(3);
				var7 = (ah) es.cf().elementAt(4);
				ah var8 = (ah) es.cf().elementAt(5);
				var16.a("");
				var7.a("");
				var8.a("");
				return;
			}
			break;
		case 10:
			a("/ui/about.ui");
			((ak) es.cf().elementAt(3)).ap();
			return;
		case 11:
			if (gQ != null) {
				gQ = null;
			}

			a("/ui/debarkation.ui");
			var12 = (a9) es.cf().elementAt(4);
			var5 = (c_ao) es.cf().elementAt(1);
			t();
			if ((f6 = c_b5.method_byte("login_type")) == null) {
				f6 = new byte[1];
			} else if (f6[0] == 1) {
				((ay) es.cf().elementAt(10)).method_case((byte) 1);
			}

			if (var12.cc().toString().trim() != null && !var12.cc().toString().trim().equals("")) {
				var5.a("登录", 0);
			} else {
				var5.a("输入", 0);
			}

			(var16 = (ah) es.cf().elementAt(3)).method_new((short) (ic >> 1));
			var16.method_void(true);
			ay var17;
			(var17 = (ay) es.cf().elementAt(10)).method_new((short) (ic - var17.method_for() >> 1));

			for (var14 = 0; var14 < 4; ++var14) {
				(var7 = (ah) es.cf().elementAt(var14 + 6)).method_new((short) (ic >> 1));
				var7.method_void(true);
			}

			return;
		case 12:
			c_as.a6();
			a("/ui/list.ui");
			(var10 = (c_bv) es.cf().elementAt(2)).dy();
			if (!bk.G) {
				if (bk.g == null || bk.g[0][0] == null) {
					method_do((byte) 4);
					return;
				}

				cS = null;
				c1 = null;
				hf = null;
				method_try();

				for (var1 = 0; var1 < bk.g.length; ++var1) {
					c_b5.method_case("serverListContent[i][0] = " + bk.g[var1][0]);
					var10.a(new c_m(bk.g[var1][0], (byte) 0, (byte) 0, var10.dF()));
				}

				((c_ao) es.cf().elementAt(0)).method_do("请选择服务器");
			} else {
				if ((fS = c_b5.method_if("serverlist", 1)) == null) {
					fS = new byte[1];
				}

				if (gH == null) {
					method_do((byte) 4);
					return;
				}

				cS = null;
				c1 = null;
				hf = null;
				method_try();

				for (var1 = 0; var1 < gH.length; ++var1) {
					var10.a(new c_m(gH[var1], (byte) 0, (byte) 0, var10.dF()));
				}
			}

			if (var10.dt().size() > var10.z$132bd3() && var10.dr().U == null) {
				var10.dr().method_new(false);
			}

			var10.dr().a((short) var10.dt().size(), (short) var10.z$132bd3());
			if (bk.G) {
				for (short var11 = 0; var11 < fS[0]; ++var11) {
					a((int) 8192);
					var10.f();
					method_for(8192);
				}

				return;
			}
			break;
		case 13:
			return;
		case 14:
			a("/ui/login.ui");
			var12 = (a9) es.cf().elementAt(9);
			a9 var9 = (a9) es.cf().elementAt(10);
			if (bk.d) {
				var12.a(new StringBuffer(bk.aa));
				var9.a(new StringBuffer(bk.aa));
				hC[0] = var12.cc().toString();
				hC[1] = var9.cc().toString();
				bk.d = false;
			}

			c_ao var6 = (c_ao) es.cf().elementAt(1);
			if (var12.cc().toString().trim() != null && !var12.cc().toString().trim().equals("")) {
				var6.a("确定", 0);
				return;
			}

			var6.a("输入", 0);
			return;
		case 15:
			a("/ui/amendcipher.ui");
			var12 = (a9) es.cf().elementAt(10);
			var5 = (c_ao) es.cf().elementAt(1);
			if (var12.cc().toString().trim() != null && !var12.cc().toString().trim().equals("")) {
				var5.a("确定", 0);
				return;
			}

			var5.a("输入", 0);
			return;
		case 16:
			a("/ui/seizing.ui");
			es.c("#键切换选项和内容");
			if ((var10 = (c_bv) es.cf().elementAt(3)).jl < 0) {
				var10.jl = 0;
			}

			if (var10.dt().size() > var10.z$132bd3() && var10.dr().U == null) {
				var10.dr().method_new(false);
			}

			c_bv.a(var10, (byte) 0);
			((ak) es.cf().elementAt(4)).method_if(c_bm.bd[0]);
			bk.method_new();
			return;
		case 17:
			if (!bk.W) {
				eQ.a(2425014);
				System.out.println("send C_CM_GET_ADDRESS");
				bk.W = true;
			}

			eQ.a(65557);
			eQ.a(65558);
			if (f6 != null && f6[0] == 1) {
				eQ.a(65568);
			}
			break;
		case 18:
			a("/ui/found_role.ui");

			for (var14 = 0; var14 < 5; ++var14) {
				ay.d4[var14] = 0;
			}

			((c_ao) es.cf().elementAt(1)).a("介绍", 0);
			a7 var15 = (a7) es.cf().elementAt(3);
			iC[0] = var15;
			iC[0].eo = new c_b((short) 0, (short) 0, ck, ig, fW);
			a(true);
			var16 = (ah) es.cf().elementAt(4);
			if (gZ) {
				var16.a("触摸此处确定所选角色");
			}

			var16.method_new((short) (ic - var16.method_for() >> 1));
			((ak) es.cf().elementAt(10)).method_if(c_bm.bp[ci - 1]);
			return;
		case 19:
			a("/ui/delete_part.ui");

			for (var14 = 0; var14 < 5; ++var14) {
				(var7 = (ah) es.cf().elementAt(var14 + 3)).method_new((short) 20);
				((ah) es.cf().elementAt(var14 + 10)).method_new((short) (17 + var7.method_for()));
			}

			es.cf().setElementAt(new bd((short) 0, (short) 0, (short) 0, (short) 0, es), 8);
			method_if((byte) 10);
			var12 = (a9) es.cf().elementAt(9);
			var5 = (c_ao) es.cf().elementAt(1);
			if (var12.cc().toString().trim() != null && !var12.cc().toString().trim().equals("")) {
				var5.a("确定", 0);
			} else {
				var5.a("输入", 0);
			}

			gE = true;
			return;
		case 21:
			a("/ui/seed_seizing.ui");
			a9 var2 = (a9) es.cf().elementAt(4);
			c_ao var13 = (c_ao) es.cf().elementAt(1);
			if (var2.cc().toString().trim() != null && !var2.cc().toString().trim().equals("")) {
				var13.a("确定", 0);
				return;
			}

			var13.a("输入", 0);
			return;
		case 22:
			a("/ui/seed_colligation.ui");
			var12 = (a9) es.cf().elementAt(4);
			var5 = (c_ao) es.cf().elementAt(1);
			if (var12.cc().toString().trim() != null && !var12.cc().toString().trim().equals("")) {
				var5.a("确定", 0);
				return;
			}

			var5.a("输入", 0);
			return;
		case 23:
			a("/ui/seed_password.ui");
			var12 = (a9) es.cf().elementAt(4);
			var5 = (c_ao) es.cf().elementAt(1);
			if (var12.cc().toString().trim() != null && !var12.cc().toString().trim().equals("")) {
				var5.a("确定", 0);
				return;
			}

			var5.a("输入", 0);
			return;
		case 27:
			a("/ui/introduce.ui");
			return;
		case 29:
			var10 = (c_bv) es.cf().elementAt(2);
			a("/ui/about.ui");
			var5 = (c_ao) es.cf().elementAt(0);
			f3 = var10.dw();
			var5.method_do(c_bm.bL[f3]);
			(var3 = (ak) es.cf().elementAt(3)).method_if(c_bm.c9[f3]);
			var3.ap();
			return;
		case 30:
			a("/ui/list.ui");
			((c_ao) es.cf().elementAt(0)).method_do("点数专区");
			(var10 = (c_bv) es.cf().elementAt(2)).dy();

			for (var1 = 0; var1 < c_bm.c1.length; ++var1) {
				var10.a(new c_m(c_bm.c1[var1], (byte) 0, (byte) 0, var10.dF()));
			}

			return;
		case 31:
			a("/cm/ui/charge.ui");
			((a9) es.cf().elementAt(5)).method_if(100L);
			return;
		case 32:
			a("/cm/ui/charger.ui");
			var3 = null;
			if (bk.aw) {
				var4 = "恭喜您，充值" + bk.ai + "元成功，您已获得" + bk.ai * 100 + "点点数！您目前的点数余额为" + bk.R + "点！";
			} else {
				var4 = "对不起，充值失败，请尝试重新充值或联系客服！";
			}

			((ak) es.cf().elementAt(3)).method_if(var4);
			return;
		case 33:
			a("/cm/ui/remain.ui");
			var3 = null;
			if (bk.aw) {
				var4 = "您当前的点数余额为" + bk.R + "点！";
			} else {
				var4 = "对不起，查询失败，请尝试重新查询或联系客服！";
			}

			((ak) es.cf().elementAt(3)).method_if(var4);
			return;
		case 34:
			a("/cm/ui/detail.ui");
			var3 = null;
			if (bk.aw) {
				var4 = "您当前的点数余额为" + bk.R + "点！";
			} else {
				var4 = "对不起，查询失败，请尝试重新查询或联系客服！";
			}

			((ak) es.cf().elementAt(3)).method_if(var4);
			return;
		case 35:
			a("/cm/ui/pcrecord.ui");
			return;
		case 36:
			a("/cm/ui/pbrecord.ui");
			return;
		case 37:
			a("/cm/ui/phelp.ui");
			return;
		case 38:
			a("/cm/ui/result.ui");
			(var3 = (ak) es.cf().elementAt(3)).method_if(bk.X);
			var3.ap();
			return;
		}

	}

	public static void a(String var0) {
		if (es != null) {
			es.cy();
			es = null;
			fE.removeAllElements();
		}

		es = c_e.a(var0);
	}

	public static final byte method_else() {
		return iK;
	}

	public static void a(String var0, String var1) {
		int[] var2 = c_b5.method_int(var0 = "gameKey" + var0, iH.length);
		c_b5.method_try(var0);
		var0 = "gameKey" + var1;
		c_b5.a(var2, var0);
	}

	public static void method_for(String var0) {
		gG = var0;
		var0 = "gameKey" + gG;

		int var4;
		try {
			iq = c_b5.method_int(var0, iH.length);
		} catch (Exception var8) {
			iq = c_b5.method_int(var0, iH.length - 1);
			int[] var2 = new int[iH.length];
			int var3 = 0;

			for (var4 = iH.length; var3 < var4; ++var3) {
				if (var3 < 4) {
					var2[var3] = iq[var3];
				} else if (var3 == 4) {
					var2[var3] = iH[4];
				} else {
					var2[var3] = iq[var3 - 1];
				}
			}

			iq = new int[iH.length];
			iq = var2;
		}

		if (iq == null) {
			c_b5.a(iH, var0);
			iq = c_b5.method_int(var0, iH.length);
		}

		short[] var1 = new short[] { 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		short var9 = 0;

		try {
			if (c_b5.a("showSetup", 2) == null) {
				gn = 1;

				for (var4 = 0; var4 < 5; ++var4) {
					var9 = (short) (var9 | var1[var4] << var4);
				}

				dM = var9;
				c_b5.a(new short[] { var9, (short) gn }, "showSetup");
			} else {
				dM = c_b5.a("showSetup", 2)[0];
				gn = (byte) c_b5.a("showSetup", 2)[1];
			}
		} catch (Exception var7) {
			gn = 1;

			for (var4 = 0; var4 < 5; ++var4) {
				var9 = (short) (var9 | var1[var4] << var4);
			}

			dM = var9;
			c_b5.a(new short[] { var9, (short) gn }, "showSetup");
		}

		J();

		try {
			if (c_b5.method_if("quantitySetup", 1) == null) {
				hi = 1;
				c_b5.a(new byte[] { hi }, "quantitySetup");
			} else {
				hi = c_b5.method_byte("quantitySetup")[0];
			}
		} catch (Exception var6) {
			hi = 1;
			c_b5.a(new byte[] { hi }, "quantitySetup");
		}

		b2.a();
		b2.field_try.method_goto();

		try {
			String var10;
			byte[] var11;
			if ((var11 = c_b5.method_if(var10 = "pvpSetup" + gG, 1)) != null) {
				gK = var11[0];
				return;
			}

			if (bp.ag().r() >= 20) {
				gK = 0;
			} else {
				gK = 1;
			}

			c_b5.a(new byte[] { gK }, var10);
		} catch (Exception var5) {
		}

	}

	public static final void J() {
		c_l.field_long = dM % 2 != 0;
		c_l.field_for = (dM >> 1) % 2 != 0;
		c_l.field_new = (dM >> 3) % 2 != 0;
		c_bu.c = (dM >> 2) % 2 != 0;
	}

	private static void z() {
		Image[] var0;
		f5 = (var0 = c_b5.method_if(fu, new String[] { "b_a2.png", "smenu.png", "menu_j.png" }))[0];
		dP = var0[1];
		h1 = var0[2];
	}

	private static void method_try() {
		f5 = null;
		dP = null;
		h1 = null;
	}

	private final void d(Graphics var1) {
		var1.setColor(5508390);
		var1.fillRect(0, 0, ic, il);
		var1.setColor(16513768);
		var1.drawString("请稍候5到10秒钟...", ic >> 1, il - (iG << 1) - 10, 17);

		for (int var2 = 0; var2 < c_bm.bn.length; ++var2) {
			var1.drawString(c_bm.bn[var2], (ic >> 1) - (iA * c_bm.bn[var2].length() >> 1), iG * var2 + (il >> 1) - 50,
					20);
		}

		this.repaint();

		try {
			switch (dA) {
			case 0:
			case 5:
			case 96:
			default:
				break;
			case 10:
				gA = c_b5.a("/cursor.png");
				break;
			case 15:
				if (fM == null) {
					fM = c_b5.a("/special/TJ2.png");
				}
				break;
			case 50:
				if (eS == null) {
					eS = c_b5.a("/special/TJ2.fdat", 0, true);
				}
				break;
			case 55:
				if (eJ == null) {
					eJ = c_b5.method_for("/special/TJ2.pdat", true);
				}
				break;
			case 60:
				if (g8 == null) {
					g8 = c_b5.method_if("/special/TJ2.mdat", true);
				}
				break;
			case 70:
				if (gZ) {
					gF = new bi("/special/touchMenu.png", 15, 15);
				}
				break;
			case 75:
				new a3((byte) 1);
				Object var6 = null;
				if ((fm = c_b5.method_byte("gamemount")) == null) {
					(fm = new byte[1])[0] = 2;
				}

				if (fm[0] == 0) {
					hM = false;
					dU = true;
					c_b5.method_case("m_bCMWAPorCMNERT=" + dU);
				} else if (fm[0] == 1) {
					hM = false;
					dU = false;
					c_b5.method_case("m_bCMWAPorCMNERT=" + dU);
				} else if (fm[0] == 2) {
					hM = true;
					dU = true;
				}

				boolean var4 = false;
				fu = "/ui_1.pkg";
				Image[] var5 = c_b5.method_if("/ui_1.pkg",
						new String[] { "cao.png", "hua.png", "b_l.png", "b_s.png", "b_a.png", null, "b_b.png",
								"f_x.png", "f_j.png", "a_a.png", "gx1.png", "gx2.png", "l_b.png", null, "k_f.png",
								"dong.png", "taiji.png", "num.png", "num_data.png", "arr.png", "num_lv.png", "p_j.png",
								null, "newnum_lv.png" });
				z();
				ge = var5[0];
				ed = var5[1];
				gu = var5[2];
				hI = var5[3];
				ca = var5[4];
				ec = var5[6];
				iJ = var5[7];
				gU = var5[8];
				eb = var5[9];
				e9 = var5[10];
				f7 = var5[11];
				cY = var5[12];
				e3 = var5[14];
				fz = var5[15];
				fv = var5[16];
				gr = var5[21];
				cG = new bi(var5[17], 5, 7);
				dY = new bi(var5[18], 4, 8);
				new bi(var5[19], 8, 4);
				eR = new bi(var5[20], 10, 9);
				dx = new bi(var5[23], 6, 9);
				break;
			case 80:
				c_b.dJ = c_a4.d.method_if(c_a4.d.method_for((byte) 0));
				new b1();
				break;
			case 94:
				c_e.a("/ui/list.ui");
				break;
			case 98:
				c1 = c_b5.a("/mammoth.png");
				this.method_long();
				break;
			case 100:
				if ((hC = c_b5.method_do("name_password", 2)) != null) {
					cF = true;
					fC = c_bm.cI;
				} else {
					cF = false;
					fC = c_bm.Y;
				}

				if (gw == null) {
					if (gZ) {
						method_do((byte) 4);
					} else {
						method_do((byte) 28);
					}
				} else {
					method_do((byte) 4);
				}
			}

			++dA;
			var1.drawRect(ic - 100 >> 1, il - (iG << 1) + iG, 102, 6);

			for (byte var7 = 0; var7 < dA / 5; ++var7) {
				var1.setColor(16579274);
				var1.fillRect((ic - 100 >> 1) + 2 + var7 * 5, il - (iG << 1) + 2 + iG, 4, 3);
				var1.setColor(460544);
				var1.drawLine((ic - 100 >> 1) + 2 + var7 * 5 + 1, il - (iG << 1) + 2 + 1 + iG,
						(ic - 100 >> 1) + 2 + var7 * 5 + 1 + 1, il - (iG << 1) + 2 + 1 + iG);
			}
		} catch (Exception var3) {
			var3.printStackTrace();
		}

		var1.drawImage(hf, 5, 5, 0);
	}

	public static void ae() {
		if (!d9) {
			c_b.S();
			c_b.ac();
			c_b.T();
			d9 = true;
		}

	}

	private final void method_long() {
		if (cS == null) {
			Graphics var1;
			(var1 = (cS = Image.createImage(ic, il)).getGraphics()).setColor(this.ij[0]);
			var1.fillRect(0, 0, ic, il);
			int var10000 = this.ij[1];
			boolean var6 = true;
			int var2 = il;
			int var7 = var10000;
			int var3 = var2;
			int[] var9 = new int[var2 <<= 2];

			for (int var5 = 0; var5 < var3; ++var5) {
				int var4 = var5;
				if (var5 > 255) {
					var4 = 255;
				}

				var4 = var7 | var4 << 24;
				var9[var5 << 2] = var4;
				var9[(var5 << 2) + 1] = var4;
				var9[(var5 << 2) + 2] = var4;
				var9[(var5 << 2) + 3] = var4;
			}

			int[] var8 = var9;

			for (var2 = 0; var2 < ic; var2 += 4) {
				var3 = (var3 = 0 + ic - var2) > 4 ? 4 : var3;
				var1.drawRGB(var8, 0, 4, var2, 0, var3, il, true);
			}
		}

	}

	private static void method_byte(Graphics var0) {
		var0.setColor(5508390);
		var0.fillRect(0, 0, ic, il);
		var0.setColor(16513768);
		var0.drawString("请稍候5到10秒钟...", ic >> 1, il - (iG << 1) - 10 - iG, 17);
		var0.drawRect(ic - 100 >> 1, il - (iG << 1), 102, 6);

		for (byte var1 = 0; var1 < dA / 5; ++var1) {
			var0.setColor(16579274);
			var0.fillRect((ic - 100 >> 1) + 2 + var1 * 5, il - (iG << 1) + 2, 4, 3);
			var0.setColor(460544);
			var0.drawLine((ic - 100 >> 1) + 2 + var1 * 5 + 1, il - (iG << 1) + 2 + 1,
					(ic - 100 >> 1) + 2 + var1 * 5 + 1 + 1, il - (iG << 1) + 2 + 1);
		}

		if (dA >= 100) {
			B();
		}

	}

	public static void method_if() {
		if (!ie) {
			if (!ie) {
				gg = new bi("/special/stuff.png", 14, 14);
				hL = new bi("/zy.png", 10, 10);
				fT = c_b5.a("/shadow.png");
				eq = new bi("/taskicon.png", 10, 12);
				b9 = new bi("/special/mark.png", 11, 15);
				gz = new bi("/special/task.png", 28, 10);
				hN = new bi("/special/mouse.png", 14, 7);
				cJ = new bi("/special/face.png", 12, 12);
				c_b5.a("/special/star.png");
				e4 = c_b5.a("/HPMP.png");
				fj = new bi("/special/bf.png", 10, 10);
				ch = new bi("/special/passive.png", 24, 20);
				hk = new bi("/special/flag_red.png", 33, 52);
				dE = new bi("/special/flag_blue.png", 33, 52);
				eh = new bi("/special/flag_gray.png", 33, 52);
				cO = new bi("/special/small_redflag.png", 16, 14);
				fQ = new bi("/special/small_blueflag.png", 16, 14);
				eP = c_b5.a("/special/upgrade.png");
				fh = c_b5.a("/special/treasure1.png");
				c_z.ak = c_b5.method_if("/wm/wm.pkg", "city1.png");

				int var0;
				for (var0 = 0; var0 < c_z.ao.length; ++var0) {
					c_z.ao[var0] = c_b5.method_if("/wm/wm.pkg", var0 + ".png");
				}

				for (var0 = 0; var0 < c_z.m.length; ++var0) {
					if (var0 == 6) {
						c_z.m[var0] = c_b5.method_if("/wm/wm.pkg", "rt4.png");
					} else if (var0 == 7) {
						c_z.m[var0] = c_b5.method_if("/wm/wm.pkg", "rt6.png");
					} else {
						c_z.m[var0] = c_b5.method_if("/wm/wm.pkg", "rt" + var0 + ".png");
					}
				}

				ie = true;
			}

		}
	}

	public static String method_int(int var0) {
		StringBuffer var1 = new StringBuffer(4);
		var1.append(String.valueOf(var0 >>> 24)).append(".");
		var1.append(String.valueOf(var0 >>> 16 & 255)).append(".");
		var1.append(String.valueOf(var0 >>> 8 & 255)).append(".");
		var1.append(String.valueOf(var0 & 255));
		return var1.toString();
	}

	private void method_char(Graphics var1) {
		int var2 = (iA << 2) + 40;
		int var3 = (ic - var2) / 2;
		int var4 = (iG + 4) * 5 + 16;
		int var5 = (il - var4) / 2;
		int var6 = var3 + 4 + 10 - 1;
		int var7 = var5 + 5 - 1;
		int var8 = var2 - 28 + 2;
		int var9 = var4 - 10 + 2;
		var1.setColor(14527877);
		var1.fillRect(var6 + 1, var7 + 1, var8 - 1, var9 - 1);
		var1.setColor(4930874);
		var1.drawRect(var6, var7, var8, var9);
		int var10 = var6 + 2;
		int var11 = var7 + 2;
		int var12 = var8 - 4;
		int var13 = var9 - 4;
		var1.setColor(16575691);
		var1.fillRect(var10 + 1, var11 + 1, var12 - 1, var13 - 1);
		var1.setColor(4930874);
		var1.drawRect(var10, var11, var12, var13);
		var10 += 2;
		var11 += 2;
		var12 -= 4;
		var13 -= 4;
		var1.setColor(14397060);
		var1.drawRect(var10, var11, var12, var13);
		var13 = var10 + 1;
		++var11;
		c_b5.a(var1, dP, var6 - dP.getWidth(), var7 + (iG + 3 >> 1) - 5, 2);
		c_b5.a(var1, dP, var6 + var8, var7 + 4 * (iG + 3) + 2, 0);
		c_b5.a(var1, h1, var6 + var8 - 6, var7 - h1.getHeight() + 7, 3);
		c_b5.a(var1, h1, var6 - h1.getWidth() + 7, var7 + var9 - 6, 0);
		boolean var21 = false;
		var7 = var11 - 1;
		c_br.method_new(fC);

		for (var8 = 0; var8 < 5; ++var8) {
			int var14;
			int var15;
			if (var8 != fC.length - 1) {
				var9 = var10 + 1;
				var14 = var7 + (var8 + 1) * (iG + 4);
				var15 = var9 + var12 - 2;
				var1.setColor(c_bm.bY);
				var1.drawLine(var9, var14, var15, var14);
			}

			var14 = var11 + var8 * (iG + 4);
			var15 = var12 - 1;
			int var16 = iG + 3;
			if (var8 % 2 == 0) {
				var1.setColor(c_bm.y);
				var1.fillRect(var13, var14, var15, var16);
			}

			int var17;
			if ((var17 = this.eW + var8) >= fC.length) {
				var17 -= fC.length;
			}

			if (var17 == this.hW) {
				var6 = c_bm.field_try;
				var9 = var13 + 1;
				++var14;
				--var15;
				var16 -= 2;
				var1.setColor(c_bm.bo);
				var1.fillRect(var9, var14, var15, var16);
			} else {
				var6 = c_bm.bP;
			}

			c_b5.method_do(var1, fC[var17], var2, var3, var7 + 4 + var8 * (iG + 4), var6);
		}

		var8 = var3 + (var2 - f5.getWidth() >> 1);
		var9 = var5 + var4 - f5.getHeight() + 1;
		this.gc ^= 1;
		var1.drawImage(f5, var8, var5 - 3 - this.gc, 20);
		c_b5.a(var1, f5, var8, var9 + 3 + this.gc, 1);
		var1.drawImage(c1, ic >> 1, il - c1.getHeight(), 17);
		Graphics var18 = var1;
		int var19 = il - 4 - 2 * iG;
		var1.setColor(11809066);
		var1.drawRoundRect(ic - 4 - 2 * iA, var19 - 2, 2 * iA + 2, 2 * (iG + 1) + 2, 6, 6);
		var1.setColor(16710106);
		var1.fillRoundRect(ic - 4 - 2 * iA + 1, var19 - 2 + 1, 2 * iA + 2 - 1, 2 * (iG + 1) + 2 - 1, 6, 6);
		String[] var20 = new String[] { "永久", "免费" };

		for (var3 = 0; var3 < 2; ++var3) {
			var18.setColor(11809066);
			var18.drawString(var20[var3], ic - 4 - 2 * iA + 2, var19 + var3 * (iG + 1), 20);
		}

	}

	private void Y() {
		if (gZ && method_byte(268435456)) {
			if (gQ != null) {
				gQ.aV();
				return;
			}

			int var1 = (iA << 2) + 40;
			int var2 = (ic - var1) / 2;
			int var3 = (iG + 4) * 5 + 16;
			int var4 = (il - var3) / 2;
			int var5 = var2 + 4 + 10 + 3 + 1 + 1;
			int var6 = var4 + 5 + 1 + 1 + 1;
			int var7 = c_br.method_new(c_bm.cI);
			var5 = var5;
			var7 = var7 * iA + 2;
			int var8 = iG + 3;

			int var10;
			for (byte var9 = 0; var9 < 5; ++var9) {
				var10 = var6 + var9 * (iG + 4);
				if (a(var5, var10, var7, var8)) {
					this.hW = (byte) (this.eW + var9);
					if (this.hW >= c_bm.cI.length) {
						this.hW = (byte) (this.hW - c_bm.cI.length);
					}

					this.ct = var9;
					a(131072);
					return;
				}
			}

			int var12 = ca.getHeight();
			var10 = var2;
			int var11 = var1;
			var1 = var4 + var12;
			var2 = var4 + var3 - var12;
			var3 = il - var2;
			if (a(var10, 0, var11, var1)) {
				a((int) 4096);
			}

			if (a(var10, var2, var11, var3)) {
				a((int) 8192);
			}
		}

	}

	private void x() {
		method_do((byte) 11);
		hQ = 0;
	}

	private void K() {
		if (this.g0 == 1) {
			a((byte) 0, "测试人员不能注册", "确定", "", -7, -120);
		} else {
			this.cT = 2;
			if (hC == null) {
				hC = new String[2];
			}

			String var1 = "请您稍候...";
			a((byte) 0, var1, "", "", -120, -120);
			bk.d = true;
			var1 = null;
			var1 = bk.q;
			(new bk(var1, bk.method_do((byte) 5), (byte) (dU ? 0 : 1), (byte) 2)).a((byte) 0);
			hQ = 0;
		}
	}

	private void Z() {
		if (this.g0 == 1) {
			a((byte) 0, "测试人员不能注册", "确定", "", -7, -120);
		} else {
			method_do((byte) 14);
			this.cT = 2;
			if (hC == null) {
				hC = new String[2];
			}

			hQ = 0;
		}
	}

	private static void h() {
		method_do((byte) 8);
		hQ = 0;
	}

	private static void s() {
		method_do((byte) 6);
		hQ = 0;
	}

	private static void X() {
		method_do((byte) 10);
		hQ = 0;
	}

	private void L() {
		this.method_goto();

		try {
			String var2 = null;
			if (!"2dcn".equals(gd) && gd.indexOf("dj") == -1) {
				if ("2sna".equals(gd)) {
					var2 = "http://3g.sina.com.cn/game/s/3g/?from=60755";
				} else {
					if (hC == null) {
						hC = c_b5.method_do("name_password", 2);
					}

					if (hC != null && !"".equals(hC[0]) && !"".equals(hC[1])) {
						var2 = "http://g.ko.cn/gk/fswap/popup.jsp?wun=" + hC[0] + "&wpw=" + hC[1] + "&wtp="
								+ ((f6 = c_b5.method_byte("login_type")) != null && f6[0] == 1 ? "k" : "ko") + "&from="
								+ gd;
					} else {
						var2 = "http://g.ko.cn/gk/fswap/popup.jsp?from=" + gd;
					}
				}
			} else {
				var2 = "http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=3973&cid=108";
			}

			c_b5.method_case("popURL = " + var2);
			dI.platformRequest(var2);
		} catch (Exception var1) {
			var1.printStackTrace();
		}

		dI.notifyDestroyed();
	}

	public static void method_try(byte var0) {
		cg = gh;
		gh = var0;
		de = true;
	}

	public static void method_case(byte var0) {
		gh = var0;
		de = true;
	}

	public static final byte V() {
		return gh;
	}

	private void method_void(Graphics var1) {
		var1.setColor(0);
		var1.fillRect(0, 0, ic, il);
		c_z.a().method_for(var1);
		b2.a();
		b2.a(var1);
		if (cu) {
			++this.cd;
			if (this.cd > 15) {
				cu = false;
				this.cd = 0;
			}

			var1.setColor(16711680);
			var1.drawString(c_bm.aJ[gn], ic >> 1, 20, 17);
		}

	}

	private static void method_if(Graphics var0) {
		if (gQ != null) {
			gQ.a(var0);
		}

	}

	public static void aj() {
		if (ea != null) {
			ea = null;
			c_b5.method_case("离开右键菜单");
			method_try((byte) 0);
		}

	}

	private final void aa() {
		if (!de) {
			short var2;
			short var7;
			if (h4 != null) {
				c_ao.aH();
				if (method_byte(458752)) {
					h4 = null;
					if (bp.ag().r() < 20) {
						eQ.a(196635);
						System.out.println("发送新手保护命令！！！");
					}

					if (u.field_byte) {
						a("/ui/maturity.ui");
						es.g9 = -1610612632;
						method_try((byte) 4);
						ak var8;
						(var8 = (ak) es.cf().elementAt(3)).method_else(u.l);
						var8.method_if(u.d);
						var8.ap();
						var7 = (short) (var8.v() + 2);
						var2 = (short) (var8.z() + 2);
						String var11 = "请您选择：";
						byte var4 = u.field_long;
						ay var9;
						(var9 = new ay(var7, var2, (byte) 2, var11, es)).d1 = new boolean[var4];

						for (byte var10 = 0; var10 < var4; ++var10) {
							var11 = u.u[var10];
							var9.method_try(var11);
							var9.d1[var10] = false;
						}

						es.method_if(var9);
						var8.a((byte) 1, (byte) 5);
						var9.a((byte) 0, (byte) 4);
						return;
					}
				} else if (method_byte(12288)) {
					((ak) h4.cf().elementAt(3)).f();
				}

			} else if (gQ != null) {
				gQ.a7();
			} else {
				c_as.aL();
				int var5;
				switch (gh) {
				case 0:
					if (method_byte(262144)) {
						ea = new b1();
						c_b5.method_case("创建右键菜单");
						method_try((byte) 1);
					} else if (method_byte(iq[15])) {
						this.cd = 0;
						cu = true;
						if (++gn > 2) {
							gn = 0;
						}

						byte var6 = gn;
						var7 = 0;
						var2 = (short) var6;
						short[] var3 = null;
						switch (var6) {
						case 0:
							var3 = new short[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
							break;
						case 1:
							var3 = new short[] { 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
							break;
						case 2:
							var3 = new short[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
						}

						for (var5 = 0; var5 < 5; ++var5) {
							var7 = (short) (var7 | var3[var5] << var5);
						}

						dM = var7;
						c_b5.a(new short[] { dM, var2 }, "showSetup");
						J();
						if (gn == 2 && c_l.a().field_try == 1 && c_l.a() != bp.ag()) {
							c_l.method_do(bp.ag());
							bp.ag().aA();
						}

						c_b5.method_case("----------" + c_bm.aJ[gn] + "-------------");
						eQ.a(196632);
					} else if (method_byte(iq[16])) {
						b1.v(71);
					} else if (method_byte(iq[21])) {
						b1.v(6);
					} else if (method_byte(iq[22])) {
						eQ.a(851976);
					} else if (method_byte(iq[23])) {
						eQ.a(458760);
					} else if (method_byte(iq[24])) {
						b1.v(1);
					} else if (method_byte(iq[25])) {
						b1.dK();
					} else if (method_byte(iq[26])) {
						eQ.a(262187);
					} else if (method_byte(iq[27])) {
						b1.v(4);
					} else if (method_byte(iq[28])) {
						b1.v(3);
					} else if (method_byte(iq[29])) {
						b1.v(9);
					}
					break;
				case 1:
					if (ea != null) {
						ea.f();
					}
				case 2:
				default:
					break;
				case 3:
					c_ao.aH();
					c_be.gu.method_for();
					break;
				case 4:
					if (es != null) {
						es.cw();
						c_ao.aH();
					}
					break;
				case 5:
					if (c_br.iW != null && !fR) {
						if (method_byte(262144)) {
							c_br.iW = null;
							method_try((byte) 0);
						} else if (method_byte(4096)) {
							c_br.iW.c8();
						} else if (method_byte(8192)) {
							c_br.iW.c9();
						} else if (method_byte(196608)) {
							var5 = (Integer) c_br.iW.db().elementAt(c_br.iW.de());
							if (c_br.iW.iV == 2 && al.field_for != null) {
								ah.aQ = al.field_for[c_br.iW.de()];
							}

							if (c_br.iW.iV == 3) {
								c_bv.jI = bf.field_do[c_br.iW.de()];
								byte var1;
								if ((var1 = bf.field_new[c_br.iW.de()]) == 2) {
									c_bv.jP = false;
								} else if (var1 == 1) {
									c_bv.jP = true;
								} else if (var1 == 4) {
									c_bv.jp = false;
								} else if (var1 == 3) {
									c_bv.jp = true;
								}

								if (var5 == 0) {
									method_try((byte) 0);
									return;
								}
							}

							if (var5 == 0) {
								c_ad.method_int((byte) 7, "此功能尚未开启。", -1, "", (Vector) null, (Vector[]) null);
								method_try((byte) 0);
								return;
							}

							if (c_br.iW.iV != 2) {
								c_br.iW = null;
							}

							eQ.a(var5);
							c_b5.method_case("cmdcmdcmdcmd" + Integer.toHexString(var5));
							method_try((byte) 0);
						}
					}
					break;
				case 6:
					if (c_br.iZ != null) {
						if (method_byte(262144)) {
							c_br.iZ = null;
							method_try((byte) 0);
						} else if (method_byte(4096)) {
							c_br.iZ.c8();
						} else if (method_byte(8192)) {
							c_br.iZ.c9();
						} else if (method_byte(196608)) {
							bp.ag().aq();
						}
					}
				}

				if (method_byte(-1) && w.ca) {
					w.cd = true;
				}

			}
		}
	}

	public static final boolean a(String var0, byte var1) {
		for (int var2 = 0; var2 < var0.length(); ++var2) {
			char var3 = var0.charAt(var2);
			if (var1 == 1) {
				if (!method_char(var3)) {
					return false;
				}
			} else if (var1 == 2) {
				if (!method_char(var3) && !method_do((int) var3)) {
					return false;
				}
			} else if (var1 == 3) {
				if (!method_char(var3) && !method_do((int) var3)) {
					var3 = var3;
					int var4 = 0;

					boolean var10000;
					while (true) {
						if (var4 >= c_bm.c5.length) {
							var10000 = false;
							break;
						}

						if (var3 == c_bm.c5[var4]) {
							var10000 = true;
							break;
						}

						++var4;
					}

					if (!var10000) {
						return false;
					}
				}
			} else if (var1 == 4 && (!method_char(var3) || var0.length() < 6 || var0.length() > 16)) {
				return false;
			}
		}

		return true;
	}

	private static final boolean method_char(int var0) {
		return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122 || var0 >= 48 && var0 <= 57;
	}

	private static final boolean method_do(int var0) {
		return var0 >= 19968 && var0 <= 40868;
	}

	public static void a(c_be var0) {
		if (var0 == null) {
			dS = null;
			es = null;
		} else {
			dS = es;
			es = var0;
		}
	}

	private static void af() {
		a9 var0 = (a9) es.cf().elementAt(27);
		StringBuffer var1;
		(var1 = new StringBuffer()).append(c_be.gs);
		var0.a(var1);
	}

	private static void O() {
		ah var0 = (ah) es.cf().elementAt(5);
		int var1 = 0;

		for (int var2 = es.cf().size(); var1 < var2; ++var1) {
			a7 var3;
			if ((ba) es.cf().elementAt(var1) instanceof a7 && ((ba) es.cf().elementAt(var1)).method_char() == 1
					&& ((ba) es.cf().elementAt(var1)).q() && (var3 = (a7) es.cf().elementAt(var1)).r == 34) {
				c_be.hd = false;
				var0.a(var3.bv());
				c_be.hH = (byte) (var1 - 7);
				var0.method_char(c_r.E(var3.bD()));
			}
		}

	}

	private void method_byte() {
		if (h7 != null) {
			c_b5.method_case("uiDatacountTick" + ht);
			a(c_e.a(h7, true));
			h7 = null;
			if (fE.size() > 0) {
				if (dK == -1) {
					es = (c_be) fE.elementAt(0);
				} else {
					es = (c_be) fE.elementAt(dK);
				}
			}
		}

		byte[] var1;
		int var15;
		byte var26;
		if (h2 != null) {
			c_b5.method_case("userDatacountTick" + ht);
			var1 = h2;

			try {
				c_e.a(new DataInputStream(new ByteArrayInputStream(var1)));
			} catch (Exception var6) {
				var6.printStackTrace();
			}

			N();
			h2 = null;
			ep = true;
			if (es.g9 != 1900548 && es.g9 != 1900546) {
				fR = false;
			}

			if (eQ.e) {
				if (eQ.field_int.length > 0) {
					fR = true;
					eQ.method_if();
				} else {
					if (c9 != -1) {
						((c_be) fE.elementAt(0)).ht = c9;
						a((c_be) fE.elementAt(c9));
						c9 = -1;
					}

					eQ.e = false;
				}
			}

			dK = -1;
			if (gh != 4) {
				if (gh != 3) {
					method_try((byte) 4);
				} else {
					method_case((byte) 4);
				}
			}

			if (iK == 12 || da && iK == 11 || iK == 18) {
				gQ = null;
				method_do((byte) 17);
			}

			if (es.g9 == 1638421) {
				((c_ao) es.cf().elementAt(0)).method_do(c_bt.field_do);
			}

			if (es.g9 == 262147 || es.g9 == 262176) {
				es.c("#键切换任务详情和任务提示");
				((c_ao) es.cf().elementAt(1)).a("移动", 0);
			}

			if (es.g9 == 262157) {
				bf.method_if();
			}

			if (es.g9 == 262154) {
				bf.a();
			}

			ah var2;
			if (es.g9 == 1638401 || es.g9 == 1835009) {
				((a9) es.cf().elementAt(3)).j(false);
				var2 = (ah) es.cf().elementAt(6);
				((ah) es.cf().elementAt(7)).method_new((short) (var2.v() + iA * 6 + 2));
			}

			c_ao var8;
			if (es.g9 == 393219 || es.g9 == 2490386) {
				(var8 = (c_ao) es.cf().elementAt(0)).method_for(true);
				var8.a(true, es);
				var8.w();
			}

			if (es.g9 == 1376260) {
				c_b5.method_case("curForm.clientCommand == CommandList.C_TRADE_VIEW");
				af();
				O();
			}

			if (es.g9 == 1376268) {
				((a9) es.cf().elementAt(27)).a(new StringBuffer(c_be.gs + ""));
			}

			int var11;
			if (es.g9 == 1703939) {
				c_b5.method_case("curForm.clientCommand == CommandList.C_MAIL_INBOX");
				c_bg var9;
				if ((var9 = (c_bg) es.cf().elementAt(3)).cD().size() > 0) {
					if (c_q.g >= var9.cD().size()) {
						c_q.g = (byte) (var9.cD().size() - 1);
					}

					for (var11 = 0; var11 < c_q.g; ++var11) {
						a((int) 8192);
						var9.f();
						method_for(8192);
					}

					c_q.g = 0;
				}
			}

			if (es.g9 == 1703954 || es.g9 == 458753 && c_q.m == 1) {
				if (es.g9 == 1703954 && am.field_else) {
					return;
				}

				((c_ao) es.cf().elementAt(1)).a("", 0);
			}

			if (es.g9 == 851978) {
				((c_ao) es.cf().elementAt(1)).a("", 0);
			}

			if (es.g9 == 1703958) {
				es.c("#键切换选项和内容");
			}

			if (es.g9 == 2490390) {
				((c_ao) es.cf().elementAt(0)).method_do("寻找师傅");
			}

			if (es.g9 == 2490391) {
				((c_ao) es.cf().elementAt(0)).method_do("寻找徒弟");
			}

			if (es.g9 == 458755 || es.g9 == 458768) {
				((ba) es.cf().elementAt(4)).a(false, es);
				((ba) es.cf().elementAt(at.field_do)).a(true, es);
			}

			if ((es.g9 == 2424839 || es.g9 == 2424994 || es.g9 == 2425072) && bo.q != 1) {
				bk.method_byte();
				if (!bk.v) {
					bk.a();
				}
			}

			a7 var13;
			if (es.g9 == 2031636 && c_r.nf && (aq.a != -1 || aq.field_int != -1)) {
				c_r var10 = (c_r) es.cf().elementAt(9);
				if (aq.field_int != -1) {
					aq.field_for = 2;
					var10.K(aq.field_int);
					var10.dU();
				}

				if (aq.a != -1) {
					aq.field_for = 1;
					var10.K(aq.a);
					var10.dU();
				}

				if ((var13 = (a7) es.cf().elementAt(6)).q()) {
					var13.a(false, es);
					((a7) es.cf().elementAt(4)).a(true, es);
				}
			}

			if (es.g9 == 2621443) {
				((c_ao) es.cf().elementAt(0)).method_do(b4.f);
			}

			if (es.g9 == 2621445) {
				((c_ao) es.cf().elementAt(0)).method_do(b4.f);
				((ay) es.cf().elementAt(8)).method_case((byte) 1);
			}

			if (es.g9 == 2621442) {
				bk.method_new();
			}

			if (es.g9 == 2162692 || es.g9 == 2162694 || es.g9 == 2162698 || es.g9 == 2162699 || es.g9 == 2162705
					|| es.g9 == 2162707 || es.g9 == 2162704 || es.g9 == 2162706 || es.g9 == 2162716 || es.g9 == 2162718
					|| es.g9 == 2162715 || es.g9 == 2162717 || es.g9 == 2162727 || es.g9 == 2162729 || es.g9 == 2162726
					|| es.g9 == 2162728 || es.g9 == 2162738 || es.g9 == 2162737 || es.g9 == 2162746 || es.g9 == 2162758
					|| es.g9 == 2162759 || es.g9 == 2162765 || es.g9 == 2162766 || es.g9 == 2162772 || es.g9 == 2162773
					|| es.g9 == 2162779 || es.g9 == 2162780) {
				((c_ao) es.cf().elementAt(0)).method_do(bb.field_int);
			}

			if (es.g9 == 1703969) {
				es.c("#键切换选项和内容");
			}

			if (es.g9 == 1703959 || es.g9 == 1703960 || es.g9 == 1703961) {
				iE = true;
			}

			ah var12;
			int var14;
			if (es.g9 == 2097155) {
				(var12 = (ah) es.cf().elementAt(38)).method_new((short) (ic - var12.method_for() >> 1));
				(var2 = (ah) es.cf().elementAt(34)).method_new((short) ((ic >> 1) - var2.method_for() >> 1));
				ah var3;
				(var3 = (ah) es.cf().elementAt(35))
						.method_new((short) ((ic << 1) - (ic >> 1) - var3.method_for() >> 1));
				(var2 = (ah) es.cf().elementAt(36)).method_new((short) ((ic >> 1) - var2.method_for() >> 1));
				(var12 = (ah) es.cf().elementAt(37))
						.method_new((short) ((ic << 1) - (ic >> 1) - var12.method_for() >> 1));

				for (var14 = 0; var14 < 7; ++var14) {
					var2 = (ah) es.cf().elementAt(var14 + 17);
					a7 var4 = (a7) es.cf().elementAt(var14 + 10);
					var2.method_new((short) (var4.v() + (var4.method_for() >> 1) - (var2.method_for() >> 1) + 4));
					if (var14 == 0) {
						var2.a("2");
					} else if (var14 == 1) {
						var2.a("3");
					} else if (var14 == 2) {
						var2.a("5");
					} else if (var14 == 3) {
						var2.a("10");
					} else if (var14 == 4) {
						var2.a("15");
					} else if (var14 == 5) {
						var2.a("25");
					} else if (var14 == 6) {
						var2.a("30");
					}
				}
			}

			if (hH) {
				c_b5.method_case("接收完数据后退到选人界面");
				method_do((byte) 17);
				hH = false;
			}

			if (iK == 17) {
				if (gQ != null) {
					gQ = null;
				}

				this.cP = c_b5.method_byte("debarkation");
				if (this.cP == null) {
					this.cP = new byte[3];
				}

				this.fo = c_b5.method_byte("debarkation1");
				if (this.fo == null) {
					this.fo = new byte[3];
				}

				gE = false;
				var12 = (ah) es.cf().elementAt(16);
				c_ao var16 = (c_ao) es.cf().elementAt(1);

				for (var14 = 0; var14 < iC.length; ++var14) {
					iC[var14] = (a7) es.cf().elementAt(var14 + 3);
					if (var14 == hg) {
						iC[var14].a(true, es);
						if (iC[hg].eo != null) {
							var16.a("确定", 0);
						} else {
							var16.a("创建", 0);
						}

						if (hV[hg] == 1 && iC[hg].eo != null) {
							var12.a("三天后可以删除");
							var12.method_new((short) (ic - var12.method_for() >> 1));
						} else if (hV[hg] == 2 && iC[hg].eo != null) {
							var12.a("删除角色且不可恢复");
							var12.method_new((short) (ic - var12.method_for() >> 1));
						} else if (g3[hg]) {
							var12.a("修改昵称");
							var12.method_new((short) (ic - var12.method_for() >> 1));
						} else {
							var12.a("删除角色");
							var12.method_new((short) (ic - var12.method_for() >> 1));
						}
					} else {
						iC[var14].a(false, es);
					}
				}
			}

			if (e0[hg] == null && iK == 17) {
				for (var15 = 0; var15 < 5; ++var15) {
					((ah) es.cf().elementAt(var15 + 11)).a("");
				}
			}

			if (iC[hg] != null && iC[hg].eo != null && iK == 17) {
				iC[hg].eo.method_do((byte) 1);
				method_if((byte) 11);

				for (var15 = 0; var15 < 5; ++var15) {
					(var2 = (ah) es.cf().elementAt(var15 + 11)).method_new((short) (var2.v() + 1));
				}
			}

			if (es.g9 == 2097155) {
				by.c = Integer.parseInt(((ah) es.cf().elementAt(37)).aj());
				if (gZ) {
					((ah) es.cf().elementAt(38)).a("");
				}
			}

			if (es.g9 == 1966100) {
				c_as.a((byte) 0, "请选择想要解除的宝石。", "确定", "", -1, -2);
			}

			if (es.g9 == 1966086) {
				((c_ao) es.cf().elementAt(0)).method_do("宝石镶嵌");
				c_as.a((byte) 0, "请选择一件想要镶嵌宝石的装备。", "确定", "", -1, -2);
			}

			if (es.g9 == 939349) {
				((c_ao) es.cf().elementAt(0)).method_do("修理装备");
				c_as.a((byte) 0, "请选择一件想要修理的装备。", "确定", "", -1, -2);
			}

			if (es.g9 == 2031636 || es.g9 == 2031621) {
				(var12 = (ah) es.cf().elementAt(14)).method_char(c_bm.bP);
				var12.a("此处放置开封的装备");
				var2 = (ah) es.cf().elementAt(5);
				((a7) es.cf().elementAt(6)).method_new((short) (var2.v() + var2.method_for() + 2));
			}

			if (es.g9 == 3342356) {
				(var12 = (ah) es.cf().elementAt(14)).method_char(c_bm.bP);
				var12.a("此处放置需要铭刻的法宝");
				var2 = (ah) es.cf().elementAt(5);
				((a7) es.cf().elementAt(6)).method_new((short) (var2.v() + var2.method_for() + 2));
			}

			if (es.g9 == 917525) {
				(var12 = (ah) es.cf().elementAt(14)).method_char(c_bm.bP);
				var12.a("此处放置需要强化的装备");
				var2 = (ah) es.cf().elementAt(5);
				((a7) es.cf().elementAt(6)).method_new((short) (var2.v() + var2.method_for() + 2));
			}

			if (es.g9 == 2031621) {
				(var12 = (ah) es.cf().elementAt(14)).method_char(c_bm.bP);
				var12.a("此处放置原石");
			}

			if (es.g9 == 2228225) {
				(var12 = (ah) es.cf().elementAt(14)).method_char(c_bm.bP);
				var12.a("此处放置原石");
			}

			if (es.g9 == 1966097) {
				(var12 = (ah) es.cf().elementAt(10)).method_char(c_bm.bP);
				var12.a("此处放置装备");
			}

			if (es.g9 == 1900547) {
				a9 var23;
				(var23 = (a9) es.cf().elementAt(4)).method_for((short) (var23.method_long() + 5));
				a9 var19;
				(var19 = (a9) es.cf().elementAt(5)).method_for((short) (var19.method_long() + 5));
				bw.method_if((byte) 2);
			}

			if (es.g9 == 393224) {
				var12 = (ah) es.cf().elementAt(6);
				((ah) es.cf().elementAt(12)).method_new((short) (var12.v() + iA * 7 + 2));
				((ah) es.cf().elementAt(13)).method_new((short) (var12.v() + iA * 7 + 2));
				((ah) es.cf().elementAt(14)).method_new((short) (var12.v() + iA * 7 + 2));
			}

			if (es.g9 == 2424833) {
				for (var15 = 0; var15 < 5; ++var15) {
					(var2 = (ah) es.cf().elementAt(var15 + 3)).method_new((short) (ic - var2.method_for() >> 1));
				}

				(var12 = (ah) es.cf().elementAt(9)).method_new((short) (ic - var12.method_for() >> 1));
			}

			if (es.g9 == 2424836) {
				(var12 = (ah) es.cf().elementAt(3)).method_new((short) (ic - var12.method_for() >> 1));
			}

			if (es.g9 == 2424840) {
				(var12 = (ah) es.cf().elementAt(3)).method_new((short) (ic - var12.method_for() >> 1));
				(var2 = (ah) es.cf().elementAt(4)).method_new((short) (ic - var2.method_for() >> 1));
			}

			if ((es.g9 == 2424839 || es.g9 == 2424995) && bo.q != 3) {
				var12 = (ah) es.cf().elementAt(18);
				((ah) es.cf().elementAt(19)).method_new((short) (var12.v() + (iA << 1) + 4));
			}

			if (es.g9 == 2424994) {
				var12 = (ah) es.cf().elementAt(5);
				((ah) es.cf().elementAt(6)).method_new((short) (var12.v() + (iA << 1) + 4));
			}

			ay var27;
			if (es.g9 == 1703972) {
				(var27 = (ay) es.cf().elementAt(4)).method_case((byte) 1);
				var27.method_char((byte) 1);
			}

			if (es.g9 == 1703971) {
				var8 = (c_ao) es.cf().elementAt(1);
				if (c_q.b == 5) {
					var8.a("", 1);
				}
			}

			if (es.g9 == 720920) {
				var27 = (ay) es.cf().elementAt(3);
				if (c_bu.d != 0) {
					var27.method_char(c_bu.d);
					var27.method_case(c_bu.d);
				}
			}

			if (es.g9 == 3145731) {
				aa.a();
				int[] var29;
				ay[] var24 = new ay[(var29 = new int[] { 6, 10, 12 }).length];

				for (var14 = 0; var14 < var29.length; ++var14) {
					var24[var14] = (ay) es.cf().elementAt(var29[var14]);
					var24[var14].method_char(aa.field_for[var14]);
					var24[var14].method_case(aa.field_for[var14]);
				}

				((ak) es.cf().elementAt(13)).method_if(aa.a[0]);
			}

			if (es.g9 == 3145729 || es.g9 == 3145730) {
				var15 = 0;

				label592: while (true) {
					short var18;
					if (var15 >= aa.field_new) {
						if (es.g9 != 3145730) {
							break;
						}

						short var25 = (var12 = (ah) es.cf().elementAt(11)).v();
						var18 = (short) (var12.z() + var12.method_long());
						byte var30 = (byte) aa.field_long.length;
						ba.q = false;
						ay var20 = new ay(var25, var18, (byte) 0, "", es);
						ba.q = true;

						for (var26 = 0; var26 < var30; ++var26) {
							var20.method_try(aa.field_long[var26]);
							var20.e(true);
							var20.method_do(var20.bg());
							var20.a(var20.bb());
							var20.ef = new boolean[var30];

							for (int var17 = 0; var17 < var30; ++var17) {
								var20.a(var17, true);
							}
						}

						var20.method_char(aa.field_if);
						var20.method_case(aa.field_if);
						es.method_if(var20);
						var11 = 0;

						while (true) {
							if (var11 >= aa.field_try.length) {
								break label592;
							}

							((a7) es.cf().elementAt(var11 + 3)).a((byte) 1, (byte) 14);
							++var11;
						}
					}

					var13 = (a7) es.cf().elementAt(var15 + 3);
					if (es.g9 == 3145729 && aa.field_goto[var15] != -1
							|| es.g9 == 3145730 && aa.field_try[var15] != -1) {
						var13.a(false, (byte) 1);
						if (aa.b[var15] != 0) {
							var13.fC = (byte) (aa.b[var15] / 1000 - 1);
						} else {
							var13.fC = 0;
						}

						var18 = c_r.k((short) (aa.b[var15] % 1000));
						var13.ft = true;
						var13.method_if(var18, false);
						var13.a(gg);
					}

					++var15;
				}
			}

			if (es.g9 == 3145739) {
				((ah) es.cf().elementAt(5)).b(true);
			}

			if (es.g9 == 3145738) {
				((ah) es.cf().elementAt(9)).b(true);
			}

			if (es.g9 == 2031648 || es.g9 == 2031649 || es.g9 == 2031650 || es.g9 == 2031651 || es.g9 == 3211269
					|| es.g9 == 3342361 || es.g9 == 917530 || es.g9 == 2228260) {
				var8 = (c_ao) es.cf().elementAt(0);
				if (es.g9 == 2031648) {
					var8.method_do("开封说明");
				} else if (es.g9 == 2031649) {
					var8.method_do("雕琢说明");
				} else if (es.g9 == 2031650) {
					var8.method_do("合成说明");
				} else if (es.g9 == 2031651) {
					var8.method_do("解除说明");
				} else if (es.g9 == 3211269) {
					var8.method_do("道具兑换说明");
				} else if (es.g9 == 2228260) {
					var8.method_do("还原说明");
				} else if (es.g9 == 3342361) {
					var8.method_do("铭刻说明");
				} else if (es.g9 == 917530) {
					var8.method_do("强化说明");
				}
			}

			if ((es.g9 == 3342337 || es.g9 == 3342338 || es.g9 == 3342339 || es.g9 == 1900552 || es.g9 == 1703954
					|| es.g9 == 1703948 || es.g9 == 1376267 || es.g9 == 655363 || es.g9 == 393231) && am.field_else) {
				var12 = (ah) es.cf().elementAt(6);
				var2 = (ah) es.cf().elementAt(8);
				a7 var21 = (a7) es.cf().elementAt(3);
				var12.a((byte) 7);
				var2.a((byte) 7);
				var12.a(am.field_if);
				var2.a(am.c);
				var21.method_void(am.field_byte);
			}

			if (es.g9 == 3342340 && !am.a) {
				((c_ao) es.cf().elementAt(1)).a("", 0);
			}

			if (es.g9 == 3342341) {
				((c_ao) es.cf().elementAt(1)).a("使用", 0);
			}

			if (es.g9 == 3342341) {
				c_as.a((byte) 0, "请选择一本技能书。", "确定", "", -1, -2);
			}

			c_b5.method_case("curForm.clientCommand = " + Integer.toHexString(es.g9));
			switch (es.g9) {
			case 458755:
				c_be.cx();
				break;
			case 1376265:
				af();
			}

			if (es != null) {
				switch (es.g9) {
				case 1376263:
					es.c("按*键选择物品，按#键确认放置。");
					break;
				case 1703946:
					es.c("按*键选择邮寄物品，按#键放置物品");
				}
			}

			if (es.g9 == 655364) {
				h4 = es;
				if (gZ) {
					((ah) h4.cf().elementAt(4)).a("触摸任意处进入游戏");
				}

				es = null;
				method_try((byte) 0);
			}
		} else {
			if (iK == 17) {
				for (var15 = 0; var15 < iC.length; ++var15) {
					if (iC[var15] != null && iC[var15].eo != null) {
						iC[var15].eo.d();
					}
				}
			}

			if (iK == 18) {
				iC[0].eo.d();
			}
		}

		if (gb != null) {
			es = c_e.a(gb, dh);
			N();
			dh = -1;
			gb = null;
			ep = true;
			fR = false;
			if (eQ.e) {
				fE.addElement(es);
				a((c_be) fE.elementAt(0));
				if (eQ.field_int.length > 0) {
					fR = true;
					eQ.method_if();
				} else {
					eQ.e = false;
				}
			}

			if (gh != 4) {
				if (gh != 3) {
					method_try((byte) 4);
				} else {
					method_case((byte) 4);
				}
			}
		}

		while (true) {
			while (gV.length != 0) {
				var1 = gV[0];
				var26 = dW[0];
				gV = c_b5.a(gV, 0);
				dW = c_b5.method_if(dW, 0);
				if (iK != 5) {
					if ((iK == 14 || iK == 15 || iK == 18) && gQ != null) {
						gQ = null;
					}

					gQ = c_e.a(var1);
				} else {
					byte var22;
					label521: {
						var22 = 0;
						switch (var26) {
						case 0:
							if (gQ != null) {
								break label521;
							}
							break;
						case 1:
							if (gQ != null || iK != 5 || gh != 0) {
								break label521;
							}
							break;
						case 2:
							if (gQ != null || iK != 5 || gh != 0 && gh != 1) {
								c_e.a(var1);
								var22 = 2;
							} else {
								var22 = 1;
							}
							break label521;
						case 3:
						case 4:
							if (gQ != null && gQ.dl == 4) {
								var22 = 2;
								break label521;
							}
							break;
						default:
							break label521;
						}

						var22 = 1;
					}

					c_b5.method_case("popDatapopDatapopDatapopDatapopData" + dW);
					switch (var22) {
					case 0:
						gR = c_b5.a(gR, gR.length, var1);
						break;
					case 1:
						gQ = c_e.a(var1);
					}

					if (var26 == 4) {
						gR = new byte[0][];
					}
				}
			}

			if (dO != null) {
				byte[] var28 = dO;
				c_be var31 = es;

				try {
					DataInputStream var7 = new DataInputStream(new ByteArrayInputStream(var28));
					c_e.a(var31, var7);
				} catch (Exception var5) {
					var5.printStackTrace();
				}

				dO = null;
			}

			return;
		}
	}

	public static byte method_case() {
		return df;
	}

	public static void t() {
		if ((hC = c_b5.method_do("name_password", 2)) == null) {
			hC = new String[2];
		}

		a9 var0 = null;
		a9 var1 = null;
		int var2 = 0;

		for (int var3 = es.cf().size(); var2 < var3; ++var2) {
			ba var4;
			if ((var4 = (ba) es.cf().elementAt(var2)) instanceof a9) {
				a9 var5;
				if ((var5 = (a9) var4).b2() == 0) {
					var0 = var5;
				} else if (var5.b2() == 2) {
					var1 = var5;
				}
			}
		}

		if (var0 != null && var1 != null) {
			var0.a(new StringBuffer(hC[0] == null ? "" : hC[0]));
			var1.a(new StringBuffer(hC[1] == null ? "" : hC[1]));
		} else {
			c_b5.method_case("找不到对应控件");
		}
	}

	public static void r() {
		ay var0 = (ay) es.cf().elementAt(10);
		if (f6 == null) {
			f6 = new byte[1];
		}

		f6[0] = var0.bm();
		c_b5.a(f6, "login_type");
	}

	public static byte a(String var0, String var1, String var2) {
		if (!var0.equals("") && !var1.equals("") && !var2.equals("")) {
			if (c_b5.method_int(var0) && c_b5.method_int(var1)) {
				if (!var1.equals(var2)) {
					return 3;
				} else if (!a(var0, (byte) 1)) {
					return 4;
				} else {
					return (byte) (!a(var1, (byte) 1) ? 5 : 0);
				}
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}

	public static void a(byte var0, String var1, String var2, String var3, int var4, int var5) {
		(gQ = new c_as((byte) 0, (c_be) null)).a((byte) 5, c_bm.dt, var1, var2, var3, var4, var5);
	}

	public static void q() {
		iy = true;
		eQ.a(65543);
		e8.a((byte) 1);
	}

	public final void a(byte var1) {
        if (ea != null) {
            ea.l6.removeAllElements();
            ea = null;
        }

        if (hQ == 0) {
            if (e8.cP[0] == 1 && e8.fo[0] == 1) {
                e8.ia = false;
            }

            e8.cP[0] = 0;
            e8.fo[0] = 0;
            c_b5.method_if(this.cP, "debarkation");
            c_b5.method_if(this.fo, "debarkation1");
        } else {
            hQ = 0;
        }

        c_ad.b = ic;
        c_z.method_do();
        c_l.method_for();
        A();
        bp.af();
        b2.method_if();
        ah();
        G();
        switch(var1) {
        case 0:
            return;
        case 1:
        	method_do((byte)4);
        default:
        }
    }

	public static void C() {
        if (hQ != 0) {
            hQ = 0;
        }

        if (ea != null) {
            ea.l6.removeAllElements();
            ea = null;
        }

        c_ad.b = ic;
        c_z.method_do();
        c_l.method_for();
        bp.af();
        b2.method_if();
        A();
        c_f.method_byte().method_for();
        bw.method_int();
        au.a();
        c_q.method_int();
        aq.a();
        az.method_if();
        gV = new byte[0][];
        dW = new byte[0];
        method_do((byte)4);
        if (gQ != null) {
            c_as.a8();
        }

        ad();
        if (c_z.field_case) {
            c_z.field_case = false;
        }

        if (c_l.field_goto != 3) {
            c_l.field_goto = 3;
        }

        c_z.ag = new Vector();
        if (c_bu.d != 0) {
            c_bu.d = 0;
        }

        if (aa.field_int) {
            aa.field_int = false;
        }

        am.method_if();
        am.a();
    }

	public static void ad() {
		try {
			String var0;
			if ((var0 = dI.getAppProperty("url")) != null && !var0.trim().equals("")) {
				c_f.f = var0.trim();
				return;
			}

			c_f.f = "socket://218.206.77.164:30000";
		} catch (Exception var1) {
		}

	}

	public static void g() {
		try {
			String var0;
			if ((var0 = dI.getAppProperty("jumpID")) != null && !var0.trim().equals("")) {
				c3 = Byte.parseByte(var0);
				return;
			}

			c3 = 22;
		} catch (Exception var1) {
		}

	}

	public static void A() {
        //FIXME 存在争议
        d6.removeAllElements();
        ep = true;
        fE.removeAllElements();
        es = null;
        dK = -1;
        c9 = -1;
        c_be.gL = -1;
        fR = false;
        if (bp.ag() != null) {
            bp.ag().method_if(false);
        }

        w.ca = false;
        at.field_byte = false;
    }

	public static void ah() {
		h6 = 0;

		for (int var0 = 0; var0 < iC.length; ++var0) {
			cy[var0] = 0;
			e0[var0] = null;
			im[var0] = 0;
			fZ[var0] = 0;
			hE[var0] = 0;
			d3[var0] = null;
			hV[var0] = 0;
			g3[var0] = false;
		}

	}

	public static void G() {
		ci = 1;
		ck = 1;
		fW = 0;
		ig = 1;
		fY = null;
	}

	public static void d() {
		if ((ci = (byte) c_b5.a(1, 2)) == 1) {
			ck = (byte) c_b5.a(1, 2);
		} else if (ci == 2) {
			ck = (byte) c_b5.a(3, 4);
		}

		fW = (byte) c_b5.a(0, 1);
		switch (ck) {
		case 1:
			ig = hO[c_b5.a(0, hO.length - 1)];
			return;
		case 2:
			ig = (byte) c_b5.a(2, 5);
			return;
		case 3:
			ig = (byte) c_b5.a(1, 5);
			return;
		case 4:
			ig = gy[c_b5.a(0, gy.length - 1)];
		default:
		}
	}

	public static void I() {
		for (int var0 = 0; var0 < 4; ++var0) {
			fc[var0] = null;
		}

	}

	public static void method_if(byte var0) {
		((ah) es.cf().elementAt(var0)).a(e0[hg]);
		String var1 = "" + im[hg];
		((ah) es.cf().elementAt(var0 + 1)).a(var1);
		var1 = null;
		var1 = c_bm.aW[fZ[hg] - 1];
		((ah) es.cf().elementAt(var0 + 2)).a(var1);
		var1 = null;
		var1 = c_bm.bh[hE[hg] - 1];
		((ah) es.cf().elementAt(var0 + 3)).a((eI[hg] == 0 ? "男" : "女") + var1);
		((ah) es.cf().elementAt(var0 + 4)).a(d3[hg]);
	}

	public static void a(boolean var0) {
        if (var0) {
            c_ao var6 = (c_ao)es.cf().elementAt(1);
            ay var1 = (ay)es.cf().elementAt(5);
            ay var2 = (ay)es.cf().elementAt(6);
            ay var3 = (ay)es.cf().elementAt(7);
            ay var4 = (ay)es.cf().elementAt(8);
            a9 var5 = (a9)es.cf().elementAt(9);
            var1.method_case((byte)(ci - 1));
            var2.method_case((byte)(ck - 1));
            var3.method_case(fW);
            var4.method_case((byte)(ig - 1));
            if (gx == 0) {
                var1.a(true, es);
                var2.a(false, es);
                var3.a(false, es);
                var4.a(false, es);
                var5.a(false, es);
            } else if (gx == 1) {
                var1.a(false, es);
                var2.a(true, es);
                var3.a(false, es);
                var4.a(false, es);
                var5.a(false, es);
            } else if (gx == 2) {
                var1.a(false, es);
                var2.a(false, es);
                var3.a(true, es);
                var4.a(false, es);
                var5.a(false, es);
                var6.a("", 0);
            } else if (gx == 3) {
                var1.a(false, es);
                var2.a(false, es);
                var3.a(false, es);
                var4.a(true, es);
                var5.a(false, es);
                var4.a = var4.bg();
            } else if (gx == 4) {
                var1.a(false, es);
                var2.a(false, es);
                var3.a(false, es);
                var4.a(false, es);
                var5.a(true, es);
                if (var5.cc().toString().trim() != null && !var5.cc().toString().trim().trim().equals("")) {
                    var6.a("修改", 0);
                } else {
                    var6.a("输入", 0);
                }
            }

            if (fY == null || fY.equals("")) {
                var5.a(new StringBuffer(""));
                return;
            }

            var5.a(new StringBuffer(fY));
        }

    }

	private static int method_int(String var0) {
        c_b5.method_case("in transformVerStr");
        int var1 = 0;
        if (var0 != null && !var0.equals("")) {
            String[] var4;
            byte[] var2 = new byte[(var4 = c_b5.a(var0, '.')).length];

            try {
                for(var1 = 0; var1 < var4.length; ++var1) {
                    var2[var1] = Byte.parseByte(var4[var1]);
                }
            } catch (Exception var3) {
                return 0;
            }

            var1 = (var2[0] << 24) + (var2[1] << 16) + (var2[2] << 8) + var2[3];
            c_b5.method_case("The result is " + Integer.toHexString(var1));
        }

        return var1;
    }

	private static void N() {
        c_be var0 = null;
        if (fE.size() != 0) {
            if (dK != -1) {
                var0 = (c_be)fE.elementAt(dK);
            } else {
                var0 = (c_be)fE.elementAt(fE.size() - 1);
            }
        } else {
            var0 = es;
        }

        int var1;
        for(var1 = 0; var1 < var0.cf().size(); ++var1) {
            ba var2 = (ba)var0.cf().elementAt(var1);
            if (bb.a(var0) && var2 instanceof ah && var2.method_char() == 2) {
                var2.a(12);
                var2.method_for(3);
            }

            if (bb.method_if(var0)) {
                if (var1 == 4) {
                    var2.method_for(4);
                    var2.method_do(-2);
                }

                if (var1 == 5) {
                    var2.method_for(4);
                }
            }
        }

        c_b5.method_case("in adjustUI tmpForm.clientCommand = " + var0.g9);
        ah var3;
        ah var4;
        ah var5;
        ah var6;
        ah var7;
        ah var8;
        ah var9;
        ah var10;
        ah var11;
        ah var12;
        a7 var13;
        a7 var15;
        int var16;
        a7 var18;
        ah[] var19;
        int var21;
        int[] var25;
        c_ao var31;
        c_ao var36;
        switch(var0.g9) {
        case 196641:
            var36 = (c_ao)es.cf().elementAt(0);
            ak var30 = (ak)es.cf().elementAt(3);
            var36.method_do("人物详情");
            var31 = (c_ao)es.cf().elementAt(1);
            if (c_l.d) {
                var31.a("返回", 1);
                var30.bv = false;
            } else {
                var31.a("退出", 1);
                var30.bv = true;
            }

            var31.a("操作", 0);
            return;
        case 196642:
            var36 = (c_ao)es.cf().elementAt(0);
            c_bg var29 = (c_bg)es.cf().elementAt(3);
            var31 = (c_ao)es.cf().elementAt(1);
            if (c_l.field_goto == 1) {
                var36.method_do("天人排名");
            } else if (c_l.field_goto == 2) {
                var36.method_do("修罗排名");
            } else if (c_l.field_goto == 3) {
                var36.method_do("总排名");
            }

            if (c_l.d) {
                var31.a("返回", 1);
                var29.ie = false;
                return;
            }

            var31.a("退出", 1);
            var29.ie = true;
            return;
        case 393219:
            ((ah)var0.cf().elementAt(3)).method_for(-2);
            ((a7)var0.cf().elementAt(8)).method_for(3);
            var3 = (ah)var0.cf().elementAt(33);
            var4 = (ah)var0.cf().elementAt(35);
            var3.a(8);
            var4.a(8);
            var3.method_for(3);
            var4.method_for(5);
            ((ah)var0.cf().elementAt(34)).method_for(3);
            var0.cf().setElementAt(new bd((short)0, (short)0, (short)0, (short)0, var0), 10);
            ((ah)var0.cf().elementAt(36)).method_do(5);
            var5 = (ah)var0.cf().elementAt(18);
            var7 = (ah)var0.cf().elementAt(19);
            var5.a(3);
            var7.a(5);
            var5.method_for(3);
            var7.method_for(3);
            var5 = (ah)var0.cf().elementAt(20);
            var8 = (ah)var0.cf().elementAt(22);
            var5.a(11);
            var8.a(11);
            var5.method_for(3);
            var8.method_for(3);
            var9 = (ah)var0.cf().elementAt(12);
            var11 = (ah)var0.cf().elementAt(14);
            var10 = (ah)var0.cf().elementAt(16);
            var4 = (ah)var0.cf().elementAt(21);
            var3 = (ah)var0.cf().elementAt(23);
            var11.method_new(var9.v());
            var10.method_new(var9.v());
            var4.method_new((short)(var7.v() + 5));
            var3.method_new((short)(var7.v() + 5));
            var4.method_for(3);
            var3.method_for(3);
            var0.cf().setElementAt(new bd((short)0, (short)0, (short)0, (short)0, var0), 25);
            ah[] var34 = new ah[6];

            for(var16 = 0; var16 < var34.length; ++var16) {
                var34[var16] = (ah)var0.cf().elementAt(var16 + 37);
                var34[var16].method_for(-2);
            }

            var19 = new ah[6];

            for(var1 = 0; var1 < var19.length; ++var1) {
                var19[var1] = (ah)var0.cf().elementAt(var1 + 26);
                if (var1 != 0 && var1 != 3) {
                    var19[var1].a(3);
                } else {
                    var19[var1].a(4);
                }
            }

            return;
        case 458760:
        case 458761:
            a7[] var33 = new a7[4];

            for(var16 = 0; var16 < var33.length; ++var16) {
                var33[var16] = (a7)var0.cf().elementAt((var16 << 1) + 3);
                var33[var16].a(8);
                var33[var16].method_for(4);
            }

            return;
        case 589831:
            var19 = new ah[(var25 = new int[]{4, 6, 8, 9, 11, 13, 15, 17, 19}).length];

            for(var21 = 0; var21 < var19.length; ++var21) {
                var19[var21] = (ah)var0.cf().elementAt(var25[var21]);
                var19[var21].a(6);
                if (var21 == 3) {
                    var19[var21].a(8);
                }
            }

            int[] var28;
            var19 = new ah[(var28 = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19}).length];

            for(int var20 = 0; var20 < var28.length; ++var20) {
                var19[var20] = (ah)var0.cf().elementAt(var28[var20]);
                var19[var20].method_for(var20 + 2);
            }

            return;
        case 655364:
            (var11 = (ah)var0.cf().elementAt(4)).a(-15);
            var11.method_for(-4);
            return;
        case 852022:
            var19 = new ah[(var25 = new int[]{3, 4}).length];

            for(var21 = 0; var21 < var25.length; ++var21) {
                var19[var21] = (ah)es.cf().elementAt(var25[var21]);
                var19[var21].b(true);
            }

            return;
        case 917525:
        case 2031636:
        case 3342356:
            var18 = (a7)var0.cf().elementAt(4);
            var13 = (a7)var0.cf().elementAt(6);
            var18.a(7);
            var18.method_for(3);
            var13.a(18);
            var13.method_for(3);
            return;
        case 1507330:
            (var11 = (ah)var0.cf().elementAt(3)).a((short)(var11.z() + 5));
            return;
        case 1638427:
            var11 = (ah)var0.cf().elementAt(3);
            ((ah)var0.cf().elementAt(4)).method_new((short)(var11.v() + var11.method_for() + 1));
            (var3 = (ah)var0.cf().elementAt(5)).method_new((short)(var3.v() - 18));
            return;
        case 1638445:
            var19 = new ah[(var25 = new int[]{3, 4, 5}).length];

            for(var21 = 0; var21 < var25.length; ++var21) {
                var19[var21] = (ah)es.cf().elementAt(var25[var21]);
                var19[var21].b(true);
            }

            return;
        case 1703937:
        case 1703938:
            ((ak)var0.cf().elementAt(5)).method_for(4);

            for(var16 = 0; var16 < 6; ++var16) {
                (var15 = (a7)var0.cf().elementAt(var16 + 7)).method_for(3);
                var15.a(6);
            }

            ((a9)var0.cf().elementAt(13)).method_for(-3);
            return;
        case 1900546:
        case 1900548:
            (var11 = (ah)var0.cf().elementAt(6)).a("最高价");
            var12 = (ah)var0.cf().elementAt(9);
            var3 = (ah)var0.cf().elementAt(11);
            var4 = (ah)var0.cf().elementAt(13);
            var12.method_new(var11.v());
            var3.method_new(var11.v());
            var4.method_new(var11.v());
            ((a7)var0.cf().elementAt(5)).method_for(-4);
            ((ah)var0.cf().elementAt(8)).method_for(-4);
            ((ah)var0.cf().elementAt(16)).method_for(-6);
            a9 var26 = (a9)var0.cf().elementAt(7);
            a9 var23 = (a9)var0.cf().elementAt(10);
            a9 var27 = (a9)var0.cf().elementAt(12);
            a9 var32 = (a9)var0.cf().elementAt(14);
            ba[] var24 = new ba[]{var11, var12, var3, var4, var26, var23, var27, var32};

            for(int var35 = 0; var35 < var24.length; ++var35) {
                var24[var35].method_for(-6);
            }

            var12.method_for(1);
            var23.method_for(1);
            var3.method_for(2);
            var27.method_for(4);
            var4.method_for(5);
            var32.method_for(6);
            return;
        case 1900547:
            a9 var22 = (a9)var0.cf().elementAt(4);
            a9 var14 = (a9)var0.cf().elementAt(5);
            var22.method_for(-3);
            var14.method_for(-3);
            ((ay)var0.cf().elementAt(6)).method_byte("持续时间");
            return;
        case 1966097:
            (var18 = (a7)var0.cf().elementAt(4)).a(7);
            var18.method_for(3);
            ((ah)var0.cf().elementAt(5)).method_for(-2);
            (var15 = (a7)var0.cf().elementAt(6)).a(20);
            var15.method_for(2);
            return;
        case 2031621:
            var11 = (ah)var0.cf().elementAt(3);
            var12 = (ah)var0.cf().elementAt(5);
            var11.method_for(-4);
            var12.method_for(-4);
            var15 = (a7)var0.cf().elementAt(4);
            a7 var17 = (a7)var0.cf().elementAt(6);
            var15.a(8);
            var17.a(12);
            return;
        case 2162693:
        case 2162708:
        case 2162719:
        case 2162730:
        case 2162739:
        case 2162747:
        case 2162760:
        case 2162767:
        case 2162774:
        case 2162781:
            var11 = (ah)var0.cf().elementAt(6);
            var12 = (ah)var0.cf().elementAt(8);
            var3 = (ah)var0.cf().elementAt(10);
            var4 = (ah)var0.cf().elementAt(12);
            var11.a(12);
            var11.method_for(3);
            var12.a(12);
            var12.method_for(3);
            var3.a(12);
            var3.method_for(3);
            var4.a(12);
            var4.method_for(3);
            return;
        case 2162758:
        case 2162765:
        case 2162772:
        case 2162779:
            ((ah)var0.cf().elementAt(6)).method_do(6);
            return;
        case 2228225:
            (var18 = (a7)var0.cf().elementAt(4)).a(7);
            var18.method_for(3);
            ((ah)var0.cf().elementAt(12)).a(3);
            (var3 = (ah)var0.cf().elementAt(11)).method_for(-2);
            var3.a(14);
            return;
        case 2424839:
        case 2424994:
        case 2425072:
            if (es.g9 == 2424839) {
                ((ak)es.cf().elementAt(15)).a(true, es);
            }

            if (bo.q != 3) {
                break;
            }

            if (es.g9 != 2424994 && es.g9 != 2425072) {
                if (es.g9 == 2424839) {
                    es.cf().removeElementAt(es.cf().size() - 1);
                    es.cf().removeElementAt(17);
                    var11 = (ah)es.cf().elementAt(17);
                    ((ah)es.cf().elementAt(18)).method_for(var11.method_long());
                    return;
                }
                break;
            }

            es.cf().removeElementAt(es.cf().size() - 1);
            es.cf().removeElementAt(es.cf().size() - 1);
            var11 = (ah)es.cf().elementAt(5);
            ((ah)es.cf().elementAt(6)).method_for(var11.method_long());
            return;
        case 2424995:
        case 2425079:
            ((ak)es.cf().elementAt(15)).a(true, es);
            if (es.g9 == 2424995 && bo.q == 3 || es.g9 == 2425079 && bo.q == 8) {
                es.cf().removeElementAt(es.cf().size() - 1);
                es.cf().removeElementAt(17);
                var12 = (ah)es.cf().elementAt(17);
                ((ah)es.cf().elementAt(18)).method_for(var12.method_long());
                return;
            }
            break;
        case 2425024:
            c_be.g3 = 0;
            return;
        case 2425078:
            if (bo.q == 8) {
                es.cf().removeElementAt(es.cf().size() - 1);
                es.cf().removeElementAt(es.cf().size() - 1);
                var11 = (ah)es.cf().elementAt(5);
                ((ah)es.cf().elementAt(6)).method_for(var11.method_long());
            }

            ((c_ao)es.cf().elementAt(0)).method_do(c_be.gM[bo.q - 8]);
            return;
        case 2555905:
            if (d6.size() > 0) {
                d6.removeAllElements();
            }

            ((c_ao)var0.cf().elementAt(0)).method_do(az.field_new);
            var13 = (a7)var0.cf().elementAt(11);
            (var3 = (ah)var0.cf().elementAt(5)).method_new((short)(var3.v() - 12));
            var3.method_for((short)(var3.method_long() - 1));
            (var4 = (ah)var0.cf().elementAt(6)).method_new((short)(var3.v() + var3.method_for() + 1));
            var4.method_case(var13.bz());
            var5 = (ah)var0.cf().elementAt(7);
            var6 = (ah)var0.cf().elementAt(8);
            var5.method_new((short)(ic - (var6.method_for() + var5.method_for() + 36)));
            var5.method_for((short)(var5.method_long() - 1));
            var6.method_for((short)(var6.method_long() - 1));
            (var5 = (ah)var0.cf().elementAt(9)).method_new((short)(var5.v() - 5));
            var5.method_for((short)(var5.method_long() - 1));
            (var7 = (ah)var0.cf().elementAt(10)).method_new((short)(var5.v() + var5.method_for() + 1));
            var7.method_for(var5.method_long());
            var7.a(var13.by());
            (var5 = (ah)var0.cf().elementAt(24)).method_new((short)(var5.v() - 5));
            var5.method_for((short)(var5.method_long() - 1));
            var8 = (ah)var0.cf().elementAt(32);
            var9 = (ah)var0.cf().elementAt(31);
            var8.method_new((short)(var9.v() + var9.method_for() + 1));
            (var11 = (ah)var0.cf().elementAt(3)).method_for((short)(var11.method_long() - 2));
            var11.method_new((short)((ic >> 1) - var11.method_for() >> 1));
            var11.a(var13.bY());
            (var10 = (ah)var0.cf().elementAt(4)).method_for((short)(var10.method_long() - 2));
            var10.method_new((short)(ic + (ic >> 1) - var10.method_for() >> 1));
            var10.a(var13.bY());
            (var4 = (ah)var0.cf().elementAt(38)).a(az.c);
            var4.a((short)(var3.z() + 5));
            var4.method_for((short)(var4.method_long() - 2));
            if (az.h == 1) {
                ((ah)var0.cf().elementAt(36)).a("");
            }

            if (var13.bJ() == -1) {
                var6.a(az.i[0]);
            } else if (var13.bJ() == 0) {
                var6.a(az.i[1]);
            } else if (var13.bJ() >= 1 && var13.bJ() <= 30) {
                var6.a(az.i[2]);
            } else if (var13.bJ() >= 31 && var13.bJ() <= 70) {
                var6.a(az.i[3]);
            } else if (var13.bJ() >= 71 && var13.bJ() <= 100) {
                var6.a(az.i[4]);
            }

            az.m = 1;
            eQ.a(2555952);
            return;
        case 2555906:
            var11 = (ah)var0.cf().elementAt(7);
            ((ah)var0.cf().elementAt(8)).method_new((short)(var11.v() + var11.method_for() + 1));
            var3 = (ah)var0.cf().elementAt(16);
            ((ah)var0.cf().elementAt(17)).method_new((short)(var3.v() + var3.method_for() + 1));
            var5 = (ah)var0.cf().elementAt(9);
            (var6 = (ah)var0.cf().elementAt(10)).method_new((short)(var5.v() + var5.method_for() + 1));
            var6.a(az.field_byte[0]);
            if (az.h == 1) {
                ((c_ao)var0.cf().elementAt(1)).a("查看", 0);
            }

            var5 = (ah)var0.cf().elementAt(4);
            ((ah)var0.cf().elementAt(19)).method_new((short)(var5.v() + var5.method_for() + 1));
            return;
        case 2555907:
        case 2555915:
            var11 = (ah)var0.cf().elementAt(4);
            ((ah)var0.cf().elementAt(5)).method_new((short)(var11.v() + var11.method_for() + 1));
            return;
        case 2555908:
        case 2555957:
            (var11 = (ah)var0.cf().elementAt(6)).method_for((short)(var11.method_long() - 5));
            (var12 = (ah)var0.cf().elementAt(8)).method_for((short)(var12.method_long() - 3));
            ((ah)var0.cf().elementAt(7)).method_new((short)(var11.v() + var11.method_for() + 1));
            ((ah)var0.cf().elementAt(9)).method_new((short)(var12.v() + var12.method_for() + 1));
            if (var0.g9 == 2555908) {
                ((c_ao)var0.cf().elementAt(0)).method_do("种子商店");
                return;
            }
            break;
        case 2555911:
            (var11 = (ah)var0.cf().elementAt(13)).method_new((short)(var11.v() - 5));
            var11.method_for((short)(var11.method_long() - 3));
            var12 = (ah)var0.cf().elementAt(11);
            ((ah)var0.cf().elementAt(12)).method_new((short)(var12.v() + var12.method_for() + 1));
            return;
        case 2555936:
            if (az.o == 0 || az.o == 10) {
                var11 = (ah)var0.cf().elementAt(4);
                ((ah)var0.cf().elementAt(5)).method_new((short)(var11.v() + var11.method_for() + 1));
                return;
            }

            if (az.o == 4) {
                var11 = (ah)var0.cf().elementAt(4);
                ((ah)var0.cf().elementAt(5)).method_new((short)(var11.v() + var11.method_for() + 1));
                var3 = (ah)var0.cf().elementAt(6);
                ((ah)var0.cf().elementAt(7)).method_new((short)(var3.v() + var3.method_for() + 1));
                var5 = (ah)var0.cf().elementAt(8);
                ((ah)var0.cf().elementAt(9)).method_new((short)(var5.v() + var5.method_for() + 1));
                return;
            }
        }

    }

	public static String n() {
		if (f6 == null) {
			return hC[0];
		} else {
			return f6[0] == 1 ? bk.F : hC[0];
		}
	}

	private static long l() {
		long var0 = 0L;
		if (fF != 0) {
			var0 = (new Date()).getTime();
		} else {
			var0 = System.currentTimeMillis();
		}

		return var0;
	}

	static {
		fC = new String[c_bm.cI.length];
		cF = true;
		gQ = null;
		gR = new byte[0][];
		gn = 1;
		cu = false;
		iy = false;
		c3 = 0;
		hO = new byte[] { 1, 2, 3, 4, 6 };
		gy = new byte[] { 1, 2, 4, 6 };
	}

	private static class a implements Runnable {
		Thread a = new Thread(this);

		public a() {
			this.a.start();
		}

		public final void run() {
			Thread var1 = Thread.currentThread();

			while (this.a == var1) {
				try {
					c_a5.e8.repaint();
					synchronized (this) {
						this.wait(101L);
					}
				} catch (Exception var5) {
				}
			}

		}
	}
}
