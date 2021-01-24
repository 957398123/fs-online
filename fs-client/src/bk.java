import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.TimeZone;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class bk implements Runnable {
	private static String[] field_do = new String[] { "", "1", "1" };
	private static String[] c = new String[] { "SMSPRICE", "PROVICE_NO_FOUND", "MOBILE_NO_FOUND" };
	private static String P = "";
	private static String au = "";
	private static String ab = "";
	public static String R = "";
	public static String az = null;
	public static String aa = "";
	private static String j = "";
	public static String F = "";
	private static String aV = "";
	public static String a5 = "";
	public static String a0 = "";
	private static String[][] Z;
	private static String[] aO;
	private String s;
	private String af;
	private int av = 0;
	public static int aj = -1;
	private byte aW = 0;
	private byte field_byte = 0;
	public static boolean b = true;
	public static boolean G = false;
	public static String[][] g;
	private static String[] Y;
	private static String[] an = new String[4];
	private byte[] t;
	private static String a4 = "";
	public static int ao = 2;
	public static String aJ;
	public static String q;
	public static String aG;
	public static String field_void;
	public static String aQ;
	public static String al;
	public static String U;
	public static String aH;
	public static String aX;
	private static String field_for;
	public static byte aT;
	public static String aK;
	public static int ai;
	public static boolean aw;
	public static boolean Q;
	public static String X;
	public static byte ay;
	public static byte field_if;
	public static int field_char;
	public static byte y;
	private byte aZ = 0;
	private String J;
	private String aq;
	private byte aI;
	public static boolean aP;
	public static boolean ax;
	public static boolean V;
	public static boolean e;
	public static boolean k;
	public static boolean at;
	public static boolean p;
	public static boolean ae;
	public static boolean ak;
	public static String B;
	private static String x;
	public static boolean d;
	public static boolean ap;
	public boolean N;
	private static int K;
	private static int ag;
	static boolean v;
	public static boolean W;
	public static String aB;
	public static String a;
	public static String m;
	public static String f;
	static long S;
	private static Thread C;
	public static bk H;
	private String[][] l = null;

	public bk(String var1, String var2, byte var3, byte var4) {
		c_b5.method_case("登录通行证服务器");
		if ((x = c_a5.dI.getAppProperty("suggest")) == null || "".equals(x.trim())) {
			x = "";
		}

		this.J = var1;
		this.aq = var2;
		this.aZ = var3;
		this.field_byte = var4;
		this.aI = 0;
	}

	public final void a(byte var1) {
		this.aI = 1;
		this.aW = var1;
		(new Thread(this)).start();
	}

	public final void run() {
		bk var1 = this;

		String var4;
		try {
			String var2 = null;
			if (var1.aZ == 0) {
				var2 = "http://10.0.0.172" + var1.aq;
			} else if (var1.aZ == 1) {
				var2 = "http://" + var1.J + var1.aq;
			}

			c_b5.method_case("tempAddress = " + var2);
			HttpConnection var7;
			(var7 = (HttpConnection) Connector.open(var2, 3)).setRequestProperty("X-Online-Host", var1.J);
			var1.method_if(var7);
			if (var1.aW == 13) {
				a(var7);
			}

			int var3;
			while ((var3 = var7.getResponseCode()) == 302 && var1.aW == 20) {
				String[] var5 = c_b5.a(var4 = var7.getHeaderField("location"), '/');
				u.m = var4;
				String var8 = var5[2];
				(new StringBuffer()).append("/").append(var4.substring(var4.indexOf(var5[3]))).toString();
				(var7 = (HttpConnection) Connector.open(var4)).setRequestProperty("X-Online-Host", var8);
				var1.method_if(var7);
			}

			if (var3 == 200) {
				ap = true;
				var4 = var7.getHeaderField("Content-Type");
				boolean var11 = false;
				if (var4 != null && var4.indexOf("vnd.wap.wml") != -1) {
					var11 = true;
				}

				if (var11) {
					var7.close();
					HttpConnection var9;
					(var9 = (HttpConnection) Connector.open("http://10.0.0.172" + var1.aq, 3))
							.setRequestProperty("X-Online-Host", var1.J);
					var1.method_if(var9);
					if (var1.aW == 13) {
						a(var9);
					}

					if (var9.getResponseCode() == 200) {
						if (var1.aW == 12) {
							if (aT != 2 && aT != 0) {
								if (aT == 3 || aT == 0) {
									method_void();
								}
							} else {
								e();
							}
						} else if (var1.aW == 13) {
							v = true;
						} else if (var1.aW == 14) {
							v = true;
							e();
						} else {
							var1.method_if(var9, (int) var9.getLength());
							var1.aI = 2;
						}
					}
				} else if (var1.aW == 12) {
					if (aT != 2 && aT != 0) {
						if (aT == 3 || aT == 0) {
							method_void();
						}
					} else {
						e();
					}
				} else if (var1.aW == 13) {
					v = true;
				} else if (var1.aW == 14) {
					v = true;
					e();
				} else if (!var1.a(var7, var3)) {
					var1.method_if(var7, 0);
					var1.aI = 2;
				}
			} else if (var3 == 302) {
				var1.a(var7, var3);
			} else if (var1.N) {
				var1.N = false;
				var1.aI = 0;
			} else {
				var1.aI = 3;
			}
		} catch (Exception var6) {
			var6.printStackTrace();
			c_b5.method_case("--------------------http连接错误---------------------------");
			if (this.N) {
				this.N = false;
				this.aI = 0;
			} else {
				this.aI = 3;
			}
		}

		this.k();
		if (this.aI == 2) {
			if (this.aW == 1) {
				c_a5.ae();
			}

			if (G && aj == 1 && this.aW == 1) {
				c_a5.ad();
				c_a5.g();
				c_a5.eQ.a(65537);
				return;
			}

			switch (this.aW) {
			case 0:
				if (b) {
					b = false;
				}
				break;
			case 1:
				if (b) {
					b = false;
				}
				break;
			case 2:
				if (b) {
					b = false;
				}
				break;
			case 3:
				if (b) {
					c_a5.ik = this.method_do();
					c_a5.iM = this.method_long();
					var4 = "/judgeserver/charge?&userId=" + c_a5.ik + "&key=" + c_a5.iM + "&game=fengshen&money=" + ai
							+ "&from=kong";
					(new bk(field_void, var4, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 3);
					b = false;
				}
			case 4:
			case 5:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			default:
				break;
			case 6:
				if (b) {
					c_a5.ik = this.method_do();
					c_a5.iM = this.method_long();
					b = false;
				}
				break;
			case 7:
				if (b) {
					c_a5.ik = this.method_do();
					c_a5.iM = this.method_long();
					var4 = "/judgeserver/QueryBalance?usr=&userId=" + c_a5.ik + "&game=fengshen&subgame=" + "fengshen"
							+ "&from=kong";
					(new bk(field_void, var4, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 7);
					b = false;
				}
				break;
			case 8:
				if (b) {
					c_a5.ik = this.method_do();
					c_a5.iM = this.method_long();
					var4 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + c_a5.ik
							+ "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100
							+ "&qtype=7&qtime=" + field_if + "&qmonth=" + field_char;
					(new bk(field_void, var4, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 8);
					b = false;
				}
				break;
			case 9:
				if (b) {
					c_a5.ik = this.method_do();
					c_a5.iM = this.method_long();
					var4 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + c_a5.ik
							+ "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype="
							+ ay + "&qtime=" + field_if + "&qmonth=" + field_char;
					(new bk(field_void, var4, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 9);
					b = false;
				}
				break;
			case 10:
				if (b) {
					c_a5.ik = this.method_do();
					c_a5.iM = this.method_long();
					var4 = "/judgeserver/BuyGameTool?usr=&userId=" + c_a5.ik
							+ "&game=fengshen&subgame=fengshen&from=kong&consumeCode=120122006001";
					(new bk(field_void, var4, (byte) (c_a5.dU ? 0 : 1), (byte) 3)).a((byte) 10);
					b = false;
				}
				break;
			case 20:
				if (b) {
					u.t = 0;
					if (this.t != null) {
						if (this.t.length % 256 != 0) {
							u.t = this.t.length / 256 + 1;
						} else {
							u.t = this.t.length / 256;
						}
					}

					b = false;
				}

				c_a5.eQ.a(2686977);
			}

			if (aj == -1 || this.aW == 1 && G && aj == 1) {
				return;
			}

			switch (aj) {
			case 1:
				switch (this.aW) {
				case 0:
					ax = true;
					return;
				case 1:
					this.method_try();
					aP = true;
					return;
				case 2:
					c_a5.method_do((byte) 11);
					V = true;
					return;
				case 3:
					aw = true;
					at = true;
					return;
				case 4:
					k = true;
					return;
				case 5:
				case 6:
				case 11:
				default:
					return;
				case 7:
					aw = true;
					p = true;
					return;
				case 8:
					ae = true;
					return;
				case 9:
					ak = true;
					return;
				case 10:
					c_a5.a((byte) 0, "购买成功！", "确定", "", -1, -120);
					return;
				}
			case 4:
				if (!"".equals(aa)) {
					if (d) {
						e = true;
					} else {
						if (c_a5.hQ == 1) {
							c_as.a((byte) 0, "此账号已存在，建议您修改为：" + aa, c_bm.a2[2], "", -24, -2);
							System.out.println("//glacier 游客转换为正式玩家的实验性代码");
						} else {
							c_a5.a((byte) 0, "此账号已存在，建议您修改为：" + aa, c_bm.a2[2], "", -9, -120);
						}

						if (c_a5.hC == null) {
							c_a5.hC = new String[2];
						}

						c_a5.hC[0] = aa;
						c_a5.hC[1] = aa;
					}
				} else if (d) {
					c_a5.a((byte) 0, "快速注册失败，请重试", c_bm.a2[2], "", -7, -120);
				} else {
					c_a5.a((byte) 0, az, c_bm.a2[2], "", -7, -120);
				}
				break;
			case 11:
				if (c_a5.gQ != null) {
					c_a5.gQ = null;
				}

				c_a5.a((byte) 0, "您好，游戏正在更新最新内容，需要下载最新客户端，欢迎您提前体验！", "下载", "返回", -8, -3);
				break;
			case 100:
				aw = false;
				if (this.aW == 3) {
					at = true;
				} else {
					if (this.aW != 7) {
						return;
					}

					p = true;
				}
				break;
			case 101:
				c_a5.a((byte) 0, "对不起，操作失败，请重新尝试或联系客服！", c_bm.a2[2], "", -7, -30);
				break;
			default:
				if (c_a5.gQ != null) {
					c_a5.gQ = null;
				}

				if (az == null) {
					az = "操作失败，请重新尝试";
					c_b5.method_case("错误码：" + aj);
				}

				c_a5.a((byte) 0, az, c_bm.a2[2], "", -7, -30);
				c_a5.cC = true;
				return;
			}
		} else if (this.aI == 3) {
			if (c_a5.hM && this.aZ == 0) {
				byte var10 = 1;
				switch (this.aW) {
				case 0:
					if (d) {
						if (c_a5.hQ == 1) {
							var10 = 0;
							c_a5.hC[0] = "tjuser";
							c_a5.hC[1] = "121212";
						} else {
							var10 = 5;
						}
					} else {
						var10 = 0;
					}
					break;
				case 1:
					var10 = 1;
					break;
				case 2:
					var10 = 2;
				}

				bk var12 = new bk(q, method_do(var10), (byte) 1, (byte) 2);
				b = true;
				var12.a(this.aW);
				return;
			}

			method_goto();
			if (c_a5.gQ != null) {
				c_a5.gQ = null;
			}

			if (this.aW == 1) {
				c_a5.a((byte) 0, "登录失败，请修改网络设置后重试", c_bm.a2[2], "", -10, -120);
				return;
			}

			c_b5.method_case("连接失败，请重新尝试");
			if (this.aW != 6 && this.aW != 11 && this.aW != 5) {
				c_a5.a((byte) 0, "连接失败，请重新尝试", c_bm.a2[2], "", -7, -120);
			}
		}

	}

	/**
	 * 
	 * @param var1 http对象
	 * @param var2 状态码
	 * @return
	 * @throws IOException
	 */
	private boolean a(HttpConnection var1, int var2) throws IOException {
		if (field_byte == 1 && aW == 6) {
			int var3;
			int var4;
			String var8;
			if (var2 == 200 && aT != 0) {
				DataInputStream var9 = var1.openDataInputStream();
				ByteArrayOutputStream var10 = new ByteArrayOutputStream();
				boolean var11 = false;

				while ((var4 = var9.read()) != -1) {
					var10.write(var4);
				}

				byte[] var12 = var10.toByteArray();
				var10.close();
				StringBuffer var13 = new StringBuffer();

				for (var2 = 0; var2 < var12.length; ++var2) {
					var13.append((char) var12[var2]);
				}

				int var7 = (var8 = var13.toString()).indexOf("userId=");
				var3 = var8.indexOf("\r", var7);
				if (var7 != -1 && var3 != -1) {
					this.s = var8.substring(var7 + 7, var3);
					var7 = var8.indexOf("key=", var3);
					var3 = var8.indexOf("\r", var7);
					this.af = var8.substring(var7 + 4, var3);
					if (!"".equals(this.s) && !c_a5.dJ) {
						c_a5.dJ = true;
					}
				} else {
					this.s = this.af = "";
				}

				if (this.s != null) {
					c_a5.ik = this.s;
				}

				if (this.af != null) {
					c_a5.iM = this.af;
				}

				if (!"".equals(this.s) && !c_a5.dJ) {
					c_a5.dJ = true;
				}

				aT = 0;
				aQ = "/bizcontrol/LoginOnlineGame?sender=202&cpId=C00002&cpServiceId=120120438000&channelId=1000&fid=1000";
				method_byte();
				return true;
			} else if (var2 != 302) {
				return false;
			} else {
				if ((var8 = var1.getHeaderField("Location")) != null) {
					var3 = var8.indexOf("userId");
					var4 = var8.indexOf("key");
					int var5 = var8.indexOf(38, 0);
					int var6 = var8.indexOf(38, var5 + 1);
					if (var3 != -1) {
						this.s = var8.substring(var3 + 7, var5);
						this.af = var8.substring(var4 + 4, var6);
						c_a5.ik = this.s;
						c_a5.iM = this.af;
					}

					var1.close();
					if (("".equals(this.s) || this.s == null)
							&& (var1 = (HttpConnection) Connector.open(var8, 3)).getResponseCode() == 200) {
						ap = true;
						this.s = var1.getHeaderField("userId");
						this.af = var1.getHeaderField("key");
						if (this.s != null) {
							c_a5.ik = this.s;
						}

						if (this.af != null) {
							c_a5.iM = this.af;
						}
					}

					aT = 0;
					aQ = "/bizcontrol/LoginOnlineGame?sender=202&cpId=C00002&cpServiceId=120120438000&channelId=1000&fid=1000";
					method_byte();
					if (!"".equals(this.s) && !c_a5.dJ) {
						c_a5.dJ = true;
					}
				} else {
					aT = 0;
					aQ = "/bizcontrol/LoginOnlineGame?sender=202&cpId=C00002&cpServiceId=120120438000&channelId=1000&fid=1000";
					method_byte();
				}

				return true;
			}
		} else {
			return false;
		}
	}

	private void k() {
		if (this.aI == 2) {
			ByteArrayInputStream var1;
			DataInputStream var2;
			String var3;
			int var5;
			int var13;
			switch (this.field_byte) {
			case 0:
				var1 = new ByteArrayInputStream(this.t);
				var2 = new DataInputStream(var1);

				try {
					if (ao == 1) {
						var2.readShort();
						boolean var15 = false;
						aj = var2.readByte();
						return;
					}

					if (ao == 2) {
						c_b5.method_case(var3 = var2.readUTF());
						this.method_if(var3);
						this.method_if();
					}
					break;
				} catch (Exception var8) {
					var8.printStackTrace();
					return;
				}
			case 1:
				if (aT == 1 && this.aW == 6) {
					aj = -1;
					c_b5.method_case("userId = " + this.s);
					c_b5.method_case("key = " + this.af);
					return;
				}

				try {
					StringBuffer var10 = new StringBuffer();

					for (int var11 = 0; var11 < this.t.length; ++var11) {
						var10.append((char) this.t[var11]);
					}

					String var12;
					var13 = (var12 = var10.toString()).indexOf("userId=");
					int var14 = var12.indexOf("\r", var13);
					if (var13 != -1 && var14 != -1) {
						this.s = var12.substring(var13 + 7, var14);
						var5 = var12.indexOf("key=", var14);
						var13 = var12.indexOf("\r", var5);
						this.af = var12.substring(var5 + 4, var13);
						if (!"".equals(this.s) && !c_a5.dJ) {
							c_a5.dJ = true;
						}
					} else {
						this.s = this.af = "";
					}

					aj = -1;
					c_b5.method_case("userId = " + this.s);
					c_b5.method_case("key = " + this.af);
				} catch (Exception var7) {
					var7.printStackTrace();
				}
				break;
			case 2:
				var1 = new ByteArrayInputStream(this.t);
				var2 = new DataInputStream(var1);

				try {
					if (ao != 1) {
						if (ao == 2) {
							c_b5.method_case(var3 = var2.readUTF());
							this.method_if(var3);
							this.method_if();
						}
					} else {
						var3 = "";
						short var4 = var2.readShort();
						aj = var2.readByte();
						c_b5.method_case("PassPort-----kongFirstResult: " + aj);

						for (var5 = 0; var5 < 32; ++var5) {
							var3 = var3 + var2.readChar();
						}

						c_a5.it = var3;
						c_b5.method_case("PassPort-----kongMD5: " + c_a5.it);
						StringBuffer var16 = new StringBuffer();
						var13 = 0;

						for (int var9 = var4 - 1 - 64 >> 1; var13 < var9; ++var13) {
							var16.append(var2.readChar());
						}

						a4 = var16.toString();
						c_b5.method_case("PassPort-----serverListString: " + a4);
					}

					var2.close();
					var1.close();
				} catch (Exception var6) {
					var6.printStackTrace();
				}
				break;
			case 3:
				aj = -1;
				if (au != null && !au.equals("1")) {
					if (ab == null) {
						this.aI = 3;
					} else {
						switch (this.aW) {
						case 3:
							if (ab.equals("1100")) {
								aj = 1;
							} else {
								aj = 100;
							}

							return;
						case 4:
						case 5:
						case 6:
						default:
							return;
						case 7:
							if (ab.equals("1105")) {
								aj = 1;
							} else {
								aj = 101;
							}

							return;
						case 8:
							if (!ab.equals("1104") && !ab.equals("1102")) {
								aj = 101;
							} else {
								aj = 1;
								this.i();
							}

							return;
						case 9:
							if (ab.equals("1102")) {
								aj = 1;
								this.i();
							} else {
								aj = 101;
							}

							return;
						case 10:
							aj = 1;
						}
					}
				} else {
					this.aI = 3;
				}
				break;
			default:
				return;
			}
		} else if (this.aI == 3) {
			this.s = this.af = null;
		}

	}

	private void method_try()

	{
		if ((Y = c_b5.a(a4, a4.length(), ';'))[0].indexOf("[荐]") != -1) {
			String var1;
			an = c_b5.a(var1 = Y[0], var1.length(), ',');
			c_b5.method_case("~~~~~~~~~~~~~~~~目前共有" + (Y.length - 1) + "个分区~~~~~~~~~~~~");
		} else {
			c_b5.method_case("~~~~~~~~~~~~~~~~目前共有" + Y.length + "个分区~~~~~~~~~~~~");
			an = null;
		}

		for (int var2 = 0; var2 < Y.length; ++var2) {
			a(Y[var2], var2);
		}

	}

	private static void a(String var0, int var1) {
		String[] var5;
		byte var2 = (byte) ((var5 = c_b5.a(var0, var0.length(), ',')).length / 4);
		if (var1 != 0 || an == null) {
			String[] var6;
			if (((var6 = c_b5.method_do("last_time_login", 4)) != null || an != null) && c_a5.e8.g0 != 1) {
				if (var6 != null && an != null) {
					g = new String[var2 + 1][4];
				} else {
					g = new String[var2][4];
				}
			} else {
				g = new String[var2 - 1][4];
			}

			byte var7;
			label74: {
				var7 = 0;
				if (var6 != null && c_a5.e8.g0 != 1) {
					String var3;
					int var8 = (var3 = var6[0]).indexOf(40);
					int var4 = var3.indexOf(93);
					if (var8 != -1) {
						var3 = var3.substring(var4 != -1 ? var4 + 1 : 0, var8) + "(上次登录)";
					} else {
						var3 = var3 + "(上次登录)";
					}

					var6[0] = var3;
					g[0] = var6;
					if (an != null) {
						g[1] = an;
						var7 = 2;
						break label74;
					}
				} else {
					if (an == null) {
						break label74;
					}

					g[0] = an;
				}

				var7 = 1;
			}

			for (int var9 = 0; var9 < g.length - var7; ++var9) {
				g[var9 + var7][0] = var5[var9 + 1 << 2];
				g[var9 + var7][1] = var5[(var9 + 1 << 2) + 1];
				g[var9 + var7][2] = var5[(var9 + 1 << 2) + 2];
				g[var9 + var7][3] = var5[(var9 + 1 << 2) + 3];
			}
		}

	}

	private static void n() {
		if (aV != null && !aV.equals("")) {
			String[] var0;
			int var1 = (var0 = c_b5.a(aV, aV.length(), '|', false)).length / 3;
			System.out.println("~~~~~~~~~~~~~~processServerUpdateInfo num = " + var1);
			Z = new String[var1][3];
			aO = new String[var1];

			for (int var2 = 0; var2 < var1; ++var2) {
				Z[var2][0] = var0[var2 * 3];
				Z[var2][1] = var0[var2 * 3 + 1];
				Z[var2][2] = var0[var2 * 3 + 2];
				aO[var2] = Z[var2][0];
			}

		} else {
			Z = null;
		}
	}

	public static String method_do(int var0) {
		return g[var0][1];
	}

	public static String a(int var0) {
		return g[var0][2];
	}

	public static String method_if(int var0) {
		return g[var0][3];
	}

	public static String method_do(byte var0) {
		String var1 = "";
		if (var0 == 0) {
			var1 = aJ + "usr=" + c_a5.hC[0] + "&pwd=" + c_a5.hC[1] + "&cmd=r" + "&game=fengshen&subgame=" + "fengshen"
					+ "&from=" + c_a5.gd + "&cver=" + c_a5.method_int(a1.field_for) + "&jar=" + "GOH_ALL2.jar"
					+ "&imei=" + B + "&charged=" + 0 + "&istest=" + c_a5.e8.g0 + "&reuid=" + x;
		} else if (var0 == 1) {
			var1 = aJ + "usr=" + c_a5.hC[0] + "&pwd=" + c_a5.hC[1] + "&cmd=l" + "&game=fengshen&subgame=" + "fengshen"
					+ "&from=" + c_a5.gd + "&cver=" + c_a5.method_int(a1.field_for) + "&jar=" + "GOH_ALL2.jar"
					+ "&imei=" + B + "&charged=" + 0 + "&istest=" + c_a5.e8.g0;

			try {
				if (((ay) c_a5.es.cf().elementAt(10)).bm() == 1) {
					var1 = var1 + "&auth=ko";
				}
			} catch (Exception var2) {
			}
		} else if (var0 == 2) {
			var1 = aJ + "usr=" + c_a5.fc[0] + "&pwd=" + c_a5.fc[1] + "&topd=" + c_a5.fc[2] + "&cmd=c";
		} else if (var0 == 3) {
			var1 = "/reportip/r.jsp?usr=" + c_a5.hC[0] + "&game=fengshen&from=" + c_a5.gd + "&cver="
					+ c_a5.method_int(a1.field_for) + "&jar=" + "GOH_ALL2.jar" + "&dest=";
		} else if (var0 == 4) {
			var1 = aJ + "usr=" + c_a5.hC[0] + "&pwd=" + c_a5.hC[1] + "&cmd=l" + "&game=fengshen&subgame=" + "fengshen"
					+ "&from=" + c_a5.gd + "&cver=" + c_a5.method_int(a1.field_for) + "&jar=" + "GOH_ALL2.jar"
					+ "&imei=" + B;
		} else if (var0 == 5) {
			var1 = aJ + "cmd=k" + "&game=fengshen&subgame=" + "fengshen" + "&from=" + c_a5.gd + "&cver="
					+ c_a5.method_int(a1.field_for) + "&jar=" + "GOH_ALL2.jar" + "&imei=" + B + "&reuid=" + x;
		} else if (var0 == 6) {
			var1 = aJ + "cmd=s&game=fengshen";
		}

		return var1;
	}

	private void method_if(HttpConnection var1) throws IOException {
		String var2 = "";
		String var3 = "fengshen";

		try {
			if ((var2 = System.getProperty("microedition.platform")) != null) {
				var2 = var2.trim();
			} else {
				var2 = "";
			}

			c_b5.method_case("--platform:" + var2);
		} catch (Exception var4) {
			c_b5.method_case("Can not get platform!! May be a Phone Emulator!");
		}

		var1.setRequestProperty("mammoth_ua", var2);
		var1.setRequestProperty("from", c_a5.gd);
		var1.setRequestProperty("game-service", var3);
		if (this.aW == 12) {
			field_for = U.substring(U.indexOf("uaStr=") + "uaStr=".length(), U.length());
			System.out.println("~~~~~~userAgent = " + field_for);
			var1.setRequestProperty("user-agent", field_for);
		}

		if (this.aW == 13) {
			var1.setRequestProperty("user-agent", field_for);
			var1.setRequestProperty("content-length", "11");
			var1.setRequestProperty("content-type", "text/plain");
			var1.setRequestProperty("accept", "*/*");
		}

		if (this.aW == 20) {
			var1.setRequestProperty("User-Agent", "NokiaN73");
			var1.setRequestProperty("accept-encoding", "deflate,gzip,x-gzip");
		}

	}

	public static String method_int(String var0) {
		return var0.substring(var0.indexOf(64) + 1, var0.length());
	}

	private void method_if(HttpConnection var1, int var2) throws IOException {
		if (var1 != null) {
			if (ao == 1) {
				for (int var3 = 0; var3 < field_do.length; ++var3) {
					field_do[var3] = var1.getHeaderField(c[var3]);
				}

				P = var1.getHeaderField("PASSPORT_BOND");
				az = a(az = var1.getHeaderField("resultmsg"));
				if ((a1.field_new = var1.getHeaderField("download")) == null) {
					a1.field_new = "";
				}

				c_b5.method_case("GameLogin.downloadAddress = " + a1.field_new);
				if ((aa = var1.getHeaderField("suggestion")) == null) {
					aa = var1.getHeaderField("PASS_NAME");
				}

				if ((j = var1.getHeaderField("PASSPORT_ID")) == null) {
					j = "";
				}

				if ((aV = var1.getHeaderField("SERVERCONTENT")) != null) {
					aV = a(aV);
					c_b5.method_case("~~~~~~~~~~~~~~~~~serverContent:~~~~~~~~~~~~~" + aV);
				}

				if (this.aW == 11) {
					if ((a5 = var1.getHeaderField("region")) == null) {
						a5 = "";
					} else {
						a5 = a(a5);
					}
				}

				String var4;
				String var5;
				if (this.aW == 20) {
					StringBuffer var7 = new StringBuffer();
					this.av = 0;

					while (true) {
						var4 = var1.getHeaderFieldKey(this.av);
						var5 = null;
						if (var4 != null) {
							var5 = var1.getHeaderField(var4);
							var7.append("" + var4 + "|" + var5 + "~");
						}

						if (var1.getHeaderFieldKey(this.av) == null) {
							u.method_if().field_case = var7.toString();
							this.av = 0;
							break;
						}

						++this.av;
					}
				}

				if (this.aW == 15 || this.aW == 1 || this.aW == 0) {
					String var8 = var1.getHeaderField("SMS_COIN");
					var4 = var1.getHeaderField("SMS_BOND");
					var5 = var1.getHeaderField("SMS_SEEK");
					String var6 = var1.getHeaderField("SMS_DEL");
					if (var8 != null) {
						aB = var8;
					}

					if (var4 != null) {
						a = var4;
					}

					if (var5 != null) {
						m = var5;
					}

					if (var6 != null) {
						f = var6;
					}
				}

				n();
			}

			DataInputStream var9 = var1.openDataInputStream();
			if (var2 > 0) {
				this.t = new byte[var2];

				for (int var11 = 0; var11 < var2; ++var11) {
					this.t[var11] = (byte) var9.read();
				}
			} else {
				ByteArrayOutputStream var10 = new ByteArrayOutputStream();
				boolean var12 = false;

				int var13;
				while ((var13 = var9.read()) != -1) {
					var10.write(var13);
				}

				this.t = null;
				this.t = var10.toByteArray();
				var10.close();
			}

			var9.close();
			var1.close();
		}

	}

	private static String a(String var0) {
		if (var0 == null) {
			return null;
		} else {
			StringBuffer var1 = new StringBuffer();

			for (int var3 = 0; var3 < var0.length(); ++var3) {
				int var4;
				if ((var4 = var0.charAt(var3)) == 37) {
					int var2 = var3++;
					if (var0.length() >= var3 + 4) {
						var4 = Integer.parseInt(var0.substring(var3, var3 + 4), 16);
						var3 += 3;
					} else {
						var3 = var2;
					}
				}

				var1.append((char) var4);
			}

			return var1.toString();
		}
	}

	public final void method_for(byte var1) {
		this.aI = 0;
	}

	private String method_do() {
		return this.s == null ? "" : this.s;
	}

	private String method_long() {
		return this.af == null ? "" : this.af;
	}

	public final byte[] d() {
		return this.t;
	}

	public static void l() {
		if (!c_a5.dU) {
			c_a5.a((byte) 0, "您当前连接设置错误，请使用cmwap连接方式！", c_bm.a2[2], "", -7, -120);
		} else if (c_a5.ik == null || "".equals(c_a5.ik.trim())) {
			method_byte();
		}
	}

	public static boolean h() {
		return P == null ? false : P.toLowerCase().equals("true");
	}

	public static void method_byte()

	{
		(new Thread(new Runnable() {
			public final void run() {
				if ((c_a5.ik == null || "".equals(c_a5.ik.trim())) && c_a5.dU) {
					bk var1 = new bk(bk.aG, bk.aQ, (byte) (c_a5.dU ? 0 : 1), (byte) 1);
					bk.b = true;
					var1.a((byte) 6);
				}

			}
		})).start();
	}

	public static void a() {
		if (c_a5.dU) {
			(new Thread(new Runnable() {
				public final void run() {
					while (c_a5.ik == null || "".equals(c_a5.ik.trim())) {
						try {
							Thread.sleep(150L);
						} catch (Exception var1) {
							var1.printStackTrace();
						}
					}

					if (c_a5.gD.a() != null) {
						bk.S = System.currentTimeMillis();
						bk.access$000();
					}

					bk var2 = new bk(bk.al, bk.U, (byte) (c_a5.dU ? 0 : 1), (byte) 1);
					bk.b = true;
					var2.a((byte) 12);
				}
			})).start();
		}
	}

	private static void e() {
		if (c_a5.dU) {
			(new Thread(new Runnable() {
				public final void run() {
					bk var1 = new bk(bk.al, bk.aH, (byte) (c_a5.dU ? 0 : 1), (byte) 1);
					bk.b = true;
					var1.a((byte) 13);
				}
			})).start();
		}
	}

	private static void method_void() {
		if (c_a5.dU) {
			(new Thread(new Runnable() {
				public final void run() {
					bk var1 = new bk(bk.al, bk.aX, (byte) (c_a5.dU ? 0 : 1), (byte) 1);
					bk.b = true;
					var1.a((byte) 14);
				}
			})).start();
		}
	}

	public static boolean method_if(byte var0) {
		if (Z == null) {
			return false;
		} else {
			String var1 = null;
			if (!G) {
				var1 = g[var0][1] + ":" + g[var0][2] + ":" + g[var0][3];
			} else {
				var1 = c_a5.hR[var0] + ":" + c_a5.is;
			}

			for (int var2 = 0; var2 < aO.length; ++var2) {
				if (var1.equals(aO[var2])) {
					c_a5.a((byte) 0, Z[var2][1] + "\n\n" + Z[var2][2], c_bm.a2[2], "", -1, -120);
					return true;
				}
			}

			return false;
		}
	}

	public static void method_goto() {
		if (y == 0) {
			c_b5.method_case("error in loseConnect()...");
		} else if (!c_a5.dU) {
			y = 0;
			c_b5.method_case("loseConnect is not CMWAP");
		} else {
			String var0 = "";
			switch (y) {
			case 1:
				var0 = "passport";
				break;
			case 2:
				var0 = "" + c_a5.is;
			}

			var0 = method_do((byte) 3) + var0;
			c_b5.method_case("loseURL = " + var0);
			(new bk("61.135.154.43", var0, (byte) (c_a5.dU ? 0 : 1), (byte) 0)).a((byte) 5);
			y = 0;
		}
	}

	public static boolean m() {
		return !"".equals(c_a5.ik) && !"".equals(c_a5.iM);
	}

	public static void g() {
		Calendar var0;
		K = (var0 = Calendar.getInstance(TimeZone.getDefault())).get(1);
		ag = var0.get(2) + 1;
	}

	private void i() {
		if (this.t != null) {
			try {
				X = new String(this.t, "gb2312");
			} catch (Exception var1) {
				var1.printStackTrace();
			}
		}
	}

	public static boolean f() {
		int var0 = field_char / 100;
		int var1 = field_char % 100;
		if (var0 >= 2009 && var0 <= K) {
			if (var0 == K) {
				if (var1 > 0 && var1 <= ag) {
					return true;
				} else {
					c_a5.a((byte) 0, "请输入正确的月份,不要超出当前月份", c_bm.a2[2], "", -7, -120);
					return false;
				}
			} else if (var1 > 0 && var1 <= 12) {
				return true;
			} else {
				c_a5.a((byte) 0, "请输入正确的月份", c_bm.a2[2], "", -7, -120);
				return false;
			}
		} else {
			c_a5.a((byte) 0, "输入年份错误，请输入2009年至今的年份。", c_bm.a2[2], "", -7, -120);
			return false;
		}
	}

	public static void a(final String var0, final String var1) {
		if (c_a5.dU) {
			(new Thread(new Runnable() {
				public final void run() {
					bk.H = new bk(var0, var1, (byte) (c_a5.dU ? 0 : 1), (byte) 0);
					bk.b = true;
					bk.H.a((byte) 20);
				}
			})).start();
		}
	}

	public static void b() {
		if (c_a5.dU) {
			(new bk(q, method_do((byte) 4), (byte) (c_a5.dU ? 0 : 1), (byte) 2)).a((byte) 11);
		}

	}

	public static void method_new() {
		if (aB == null) {
			(new bk(q, method_do((byte) 6), (byte) (c_a5.dU ? 0 : 1), (byte) 2)).a((byte) 15);
		}

	}

	private static void a(HttpConnection var0) throws IOException {
		String var1 = "900 Success";
		OutputStream var2 = null;
		var0.setRequestMethod("POST");
		var2 = var0.openOutputStream();
		byte[] var3 = var1.getBytes();

		for (int var4 = 0; var4 < var3.length; ++var4) {
			var2.write(var3[var4]);
		}

		var2.close();
	}

	private void method_if(String var1) {
		String[] var2 = null;
		var2 = c_b5.a(var1, '\n');
		this.l = new String[var2.length][2];

		for (int var3 = 0; var3 < var2.length; ++var3) {
			if (var2[var3].indexOf(58) != -1) {
				this.l[var3][0] = var2[var3].substring(0, var2[var3].indexOf(58)).trim();
				this.l[var3][1] = var2[var3].substring(var2[var3].indexOf(58, 0) + 1).trim();
				System.out.println("body key = " + this.l[var3][0]);
				System.out.println("body value = " + this.l[var3][1]);
			}
		}

	}

	private String method_for(String s) {
		// $FF: Couldn't be decompiled
		// TODO 反编译失败,需要反编译
		try
	    {
	      for (int i = 0; i < this.l.length; i++)
	        if (s.equals(this.l[i][0]))
	          return this.l[i][1];
	      return "";
	    }
	    catch (Exception localException)
	    {
	    }
	    return "";
	}

	private void method_if() {
		try {
			aj = Integer.parseInt(this.method_for("result"));
			System.out.println("PassPort-----kongFirstResult: " + aj);
		} catch (Exception var3) {
			aj = -1;
			this.aI = 3;
		}

		az = a(az = this.method_for("resultmsg"));
		n();
		c_a5.it = this.method_for("md5");

		for (int var1 = 0; var1 < field_do.length; ++var1) {
			field_do[var1] = this.method_for(c[var1]);
		}

		aV = this.method_for("SERVERCONTENT");
		P = this.method_for("PASSPORT_BOND");
		this.method_for("MOBILE_VIP");
		a1.field_new = this.method_for("download");
		aa = this.method_for("suggestion");
		if ("".equals(aa)) {
			aa = this.method_for("PASS_NAME");
		}

		this.method_for("charged");
		j = this.method_for("PASSPORT_ID");
		a5 = this.method_for("REGION");
		a5 = a(a5 = this.method_for("REGION"));
		aB = this.method_for("SMS_COIN");
		a = this.method_for("SMS_BOND");
		f = this.method_for("SMS_DEL");
		m = this.method_for("SMS_SEEK");

		try {
			String var4 = this.method_for("GHEART");
			if (!"".equals(var4)) {
				String[] var5 = c_b5.a(var4, ':');
				c_a5.gD.a(var5[0]);
				c_a5.gD.method_do(var5[1]);
				c_a5.gD.method_if(var5[2]);
			}
		} catch (Exception var2) {
			var2.printStackTrace();
		}

		if (c_a5.f6 != null && c_a5.f6[0] == 1) {
			F = this.method_for("VIR_USER");
		}

		a0 = this.method_for("SMSPRICE");
		if ((a4 = this.method_for("body")) != null) {
			a4 = a(a4);
		}

	}

	static void access$000() {
		if (bk.C == null) {
			bk.C = new Thread(new Runnable() {
				public void run() {
					c_a5.gD.a(1);
					while (true) {
						while (true) {
							try {
								if (System.currentTimeMillis() - bk.S >= 60000L) {
									c_a5.gD.a(0);
									bk.S = System.currentTimeMillis();
								}

								Thread.sleep(2000L);
							} catch (Exception var3) {
							}
						}
					}
				}
			});
			bk.C.start();
		}
	}

	static {
		aJ = "/mammoth/judgeserver/judge?ver=" + ao + "&";
		q = "61.135.147.34";
		aG = "gmp.i139.cn";
		field_void = "221.179.216.39";
		aQ = "/bizcontrol/LoginWapOnlineGame?sender=202&cpId=C00042&cpServiceId=220121871000&channelId=15042000&p=client";
		field_for = "";
		aT = 0;
		aK = "1000";
		ai = 0;
		aw = false;
		Q = false;
		X = "";
		ay = 0;
		field_if = 0;
		field_char = 0;
		y = 0;
		aP = false;
		ax = false;
		V = false;
		e = false;
		k = false;
		at = false;
		p = false;
		ae = false;
		ak = false;
		B = "";
		x = "";
		d = false;
		ap = false;
		v = false;
		W = false;
		C = null;
		H = null;
	}
}
