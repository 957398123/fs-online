import javax.microedition.lcdui.Graphics;

/**
 * 2020/01/21
 * @author 95739
 *
 */
public final class a9 extends ba {
	private long gb;
	private long f4;
	private int ga;
	private int f8;
	private int f1;
	private long fR;
	private long fW;
	private byte fS;
	private byte f9;
	private short f7;
	private StringBuffer fP;
	private StringBuffer f6;
	private String fZ;
	private static String[] f5;
	private static String fY;
	private int fQ;
	private boolean f2;

	public final void method_if(long var1) {
		this.fR = var1;
	}

	public final void j(boolean var1) {
		this.f2 = false;
	}

	private a9(short var1, short var2, short var3, short var4, String var5, String var6, byte var7, short var8,
			c_be var9) {
		super(var1, var2, var3, (short) 0, var9);
		this.gb = 0L;
		this.f4 = 1000L;
		this.ga = 0;
		this.f8 = -1;
		this.f1 = 0;
		this.fR = -1L;
		this.fW = 0L;
		this.fS = 0;
		this.f9 = 0;
		this.f7 = 0;
		this.fP = null;
		this.f6 = null;
		this.fQ = 0;
		this.f2 = true;
		if (var5 != null) {
			this.fP = new StringBuffer(var5);
		} else {
			this.fP = new StringBuffer();
		}

		this.fZ = var6;
		this.f9 = var7;
		this.f7 = var8;
		if (var7 == 2) {
			this.f6 = new StringBuffer();
			int var10 = 0;

			for (int var11 = this.fP.length(); var10 < var11; ++var10) {
				this.f6.append('*');
			}
		} else if (var7 == 1) {
			long var13 = 0L;

			for (int var12 = 0; var12 < this.f7; ++var12) {
				var13 = (var13 *= 10L) + 1L;
			}

			this.fR = var13 * 9L;
		}

		if (c_be.gf == null) {
			c_a5.dI.notifyDestroyed();
		}

		if (super.field_int <= 0) {
			super.field_int = (short) (c_a5.iG + 2);
		}

		super.b = true;
	}

	public a9(short var1, short var2, short var3, String var4, byte var5, short var6, c_be var7) {
		this(var1, var2, var3, (short) 0, var4, "", var5, var6, var7);
	}

	public final void a(Graphics var1) {
		int var2 = 0;
		if (this.fZ != null) {
			var1.setColor(c_bm.bP);
			var1.drawString(this.fZ, super.k, super.j + 1, 20);
		}

		short var3 = super.k;
		short var4 = super.a;
		if (this.fZ != null && !this.fZ.equals("")) {
			var3 = (short) (var3 + this.fZ.length() * c_a5.iA + 2);
			var4 = (short) (var4 - (this.fZ.length() * c_a5.iA + 2));
		}

		var1.setColor(c_bm.ci);
		var1.drawRect(var3, super.j, var4 - 1, super.field_int - 1);
		var1.setColor(c_bm.y);
		var1.fillRect(var3 + 1, super.j + 1, var4 - 2, super.field_int - 2);
		int var5 = super.k + 2;
		if (this.fZ != null && !this.fZ.equals("")) {
			var5 += this.fZ.length() * c_a5.iA + 2;
		}

		int var6;
		int var7;
		String var8;
		switch (this.f9) {
		case 0:
		case 2:
			var1.setColor(c_bm.F);
			if (this.f9 == 2) {
				if (this.fS > 0) {
					--this.fS;
					if (this.fS == 0 && this.f6.length() > 0) {
						this.f6.setCharAt(this.f6.length() - 1, '*');
					}
				}

				var6 = this.f6.toString().trim().length();
				var7 = 0;
				var8 = this.f6.toString().trim();

				for (var2 = c_a5.fq.stringWidth(var8); var2 + 4 > var4
						&& var7 <= var6 - 1; var2 = c_a5.fq.stringWidth(var8)) {
					++var7;
					var8 = this.f6.toString().substring(var7).trim();
				}

				var1.drawString(var8, var5, super.j + 2, 20);
			} else {
				var6 = this.fP.toString().trim().length();
				var7 = 0;
				var8 = this.fP.toString().trim();

				for (var2 = c_a5.fq.stringWidth(var8); var2 + 4 > var4
						&& var7 <= var6 - 1; var2 = c_a5.fq.stringWidth(var8)) {
					++var7;
					var8 = this.fP.toString().substring(var7).trim();
				}

				if (c_a5.es.g9 != 1638401 && c_a5.es.g9 != 1703941) {
					var1.drawString(var8, var5, super.j + 2, 20);
				} else {
					c_b5.a(var1, this.fP.toString().trim(), var5, super.j + 2, var4 - 4, (byte) 0, (byte) 3);
				}
			}
			break;
		case 1:
			var1.setColor(c_bm.F);
			var6 = this.fP.toString().trim().length();
			var7 = 0;
			var8 = this.fP.toString().trim();

			for (var2 = c_a5.fq.stringWidth(var8); var2 + 4 > var4
					&& var7 <= var6 - 1; var2 = c_a5.fq.stringWidth(var8)) {
				++var7;
				var8 = this.fP.toString().substring(var7).trim();
			}

			if (this.f9 == 1) {
				var1.drawString(var8, var5, super.j + 2, 20);
			}
		}

		if (this.q()) {
			if ((c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703938 || c_a5.es.g9 == 1703952)
					&& this != (ba) c_a5.es.cf().elementAt(13) || c_a5.es.g9 == 1703940 || c_a5.es.g9 == 1703941) {
				c_b5.method_int(var1, var3, super.j, var4, super.field_int);
				return;
			}

			if (++this.ga > 5) {
				this.ga = 0;
			}

			if (this.ga < 3) {
				this.fQ = super.k + 4 + var2;
				if (this.fZ != null && !this.fZ.equals("")) {
					this.fQ += this.fZ.length() * c_a5.iA + 2;
				}

				if (this.f2) {
					if (this.f9 == 1) {
						var1.setColor(c_bm.F);
						var1.drawLine(this.fQ, super.j + 1, this.fQ, super.j + 12);
						return;
					}

					var1.setColor(c_bm.F);
					var1.drawLine(this.fQ, super.j + 2, this.fQ, super.j + c_a5.iG);
				}
			}
		}

	}

	public final short b9() {
		return this.f7;
	}

	public final byte b2() {
		return this.f9;
	}

	public final StringBuffer cc() {
		return this.fP;
	}

	public final void a(StringBuffer var1) {
		this.fP = var1;
		if (this.f9 == 2) {
			this.f6 = new StringBuffer();
			int var2 = 0;

			for (int var3 = var1.length(); var2 < var3; ++var2) {
				this.f6.append('*');
			}
		}

	}

	public final String b8() {
		return this.fZ;
	}

	public final void b(String var1) {
		this.fZ = var1;
	}

	public final void a(boolean var1, c_be var2) {
		super.a(var1, var2);
		this.ga = 0;
		this.f8 = 0;
		this.f1 = 0;
	}

	private void l(int var1) {
		for (int var2 = 0; var2 < 10; ++var2) {
			if (1 << var2 == var1) {
				if (this.f9 != 0 && this.f9 != 2) {
					this.method_if(fY.charAt(var2));
					return;
				}

				if (this.f8 == var1 && System.currentTimeMillis() - this.gb <= this.f4) {
					if (this.fP.length() > 0) {
						this.fP.deleteCharAt(this.fP.length() - 1);
					}

					if (++this.f1 >= f5[var2].length()) {
						this.f1 = 0;
					}

					this.method_if(f5[var2].charAt(this.f1));
				} else {
					this.f1 = 0;
					if (this.fP.length() < this.f7) {
						this.method_if(f5[var2].charAt(this.f1));
						this.f8 = var1;
					} else {
						this.f8 = 0;
					}
				}

				this.gb = System.currentTimeMillis();
				return;
			}
		}

	}

	private void method_if(char var1) {
		if (this.fP.length() < this.f7) {
			if (this.f9 == 1 && this.fP.length() == 1 && this.fP.toString().equals("0")) {
				this.fP.deleteCharAt(0);
			}

			this.fP.append(var1);
			if (this.f9 == 2) {
				this.f6.delete(0, this.f6.length());
				int var5 = this.fP.length();

				for (int var3 = 0; var3 < var5 - 1; ++var3) {
					this.f6.append('*');
				}

				if (var5 > 0) {
					this.f6.append(this.fP.charAt(this.fP.length() - 1));
				}

				this.fS = 10;
				return;
			}

			if (this.f9 == 1) {
				long var2 = Long.parseLong(this.fP.toString());
				if (this.fR >= 0L) {
					try {
						if ((var2 = Long.parseLong(this.fP.toString())) > this.fR) {
							this.method_void(Long.toString(this.fR));
						} else {
							this.method_void(Long.toString(var2));
						}
					} catch (Exception var4) {
					}
				}

				if (var2 < 0L) {
					this.method_void(0L + "");
				}
			}
		}

	}

	private void b6() {
		if (this.fP.length() > 0) {
			this.fP.deleteCharAt(this.fP.length() - 1);
			if (this.f9 == 2) {
				this.f6.deleteCharAt(this.f6.length() - 1);
			} else if (this.f9 == 1 && (this.fP.length() == 0 || (long) this.b3() < 0L)) {
				this.method_void(0L + "");
			}
		}

		this.ga = 0;
		this.f8 = 0;
		this.f1 = 0;
	}

	public final int b3() {
		try {
			return this.fP.toString().trim().equals("") ? 0 : Integer.parseInt(this.fP.toString());
		} catch (Exception var1) {
			return 0;
		}
	}

	public final void method_void(String var1) {
		if (var1 != null && var1.length() != 0) {
			if (this.f9 == 1) {
				int var2 = 0;

				for (int var3 = var1.length(); var2 < var3; ++var2) {
					if (!Character.isDigit(var1.charAt(var2))) {
						return;
					}
				}
			}

			this.fP.delete(0, this.fP.length());
			this.fP.append(var1);
		} else {
			this.fP.delete(0, this.fP.length());
			if (this.f9 == 2) {
				this.f6.delete(0, this.f6.length());
			}

		}
	}

	public final void f() {
		if (c_a5.es.g9 != 1376260 && c_a5.es.g9 != 1376265 && c_a5.es.g9 != 1376268 && c_a5.es.g9 != 1376267
				&& c_a5.es.g9 != 1376261 || !a7.ej) {
			int var1 = 0;

			String var3;
			a9 var16;
			for (int var2 = c_a5.eT.length; var1 < var2; ++var1) {
				if (this.f2 && c_a5.method_else() != 18) {
					if (!c_a5.method_byte(c_a5.eT[var1])) {
						if (c_a5.method_byte(1024) || c_a5.method_byte(1048576)) {
							if (c_a5.es.g9 == 2097155) {
								by.a((byte) 2);
							}

							this.b6();
							if (c_a5.es.g9 == 2097155) {
								by.a((byte) 1);
							}

							c_a5.D();
						}
					} else if (c_a5.es.g9 != 1703937 && c_a5.es.g9 != 1703952 && c_a5.es.g9 != 1703938) {
						if (c_a5.es.g9 == 2097155) {
							if (Integer.parseInt(((ah) c_a5.es.cf().elementAt(37)).aj()) <= 0) {
								c_as.a((byte) 0, "您的代币不足", "确定", "", -1, -2);
								return;
							}

							by.a((byte) 2);
						} else if (c_a5.es.g9 == 1900547) {
							if (this.q() && this.fP.toString().trim().length() == 8) {
								this.a(new StringBuffer("99999999"));
								return;
							}
						} else if (c_a5.es.g9 == 2424836 && Integer.parseInt(this.fP.toString().trim()) >= 9) {
							this.a(new StringBuffer("9"));
							return;
						}

						this.l(c_a5.eT[var1]);
						if (c_a5.es.g9 == 1376260) {
							((c_ao) c_a5.es.cf().elementAt(1)).a("修改", 0);
						} else if (c_a5.es.g9 == 2097155) {
							ah var18 = (ah) c_a5.es.cf().elementAt(37);
							if (Integer.parseInt(this.fP.toString().trim()) > Integer.parseInt(var18.aj())) {
								this.a(new StringBuffer(var18.aj()));
							}

							by.a((byte) 1);
						} else {
							a9 var4;
							a9 var14;
							c_ao var19;
							if (c_a5.method_else() == 11) {
								var14 = (a9) c_a5.es.cf().elementAt(4);
								var4 = (a9) c_a5.es.cf().elementAt(5);
								var19 = (c_ao) c_a5.es.cf().elementAt(1);
								if (var14.fP.toString().trim() != null && !var14.fP.toString().trim().equals("")
										&& var4.fP.toString().trim() != null && !var4.fP.toString().trim().equals("")) {
									var19.a("登录", 0);
								}
							} else {
								c_ao var15;
								if (c_a5.es.g9 == 2297358) {
									var14 = (a9) c_a5.es.cf().elementAt(4);
									var15 = (c_ao) c_a5.es.cf().elementAt(1);
									if (var14.fP.toString().trim() != null && !var14.fP.toString().trim().equals("")) {
										var15.a("确定", 0);
									}
								} else if (c_a5.method_else() == 19) {
									var14 = (a9) c_a5.es.cf().elementAt(9);
									var15 = (c_ao) c_a5.es.cf().elementAt(1);
									if (var14.fP.toString().trim() != null && !var14.fP.toString().trim().equals("")) {
										var15.a("确定", 0);
									}
								} else if (c_a5.method_else() == 14) {
									var14 = (a9) c_a5.es.cf().elementAt(9);
									var4 = (a9) c_a5.es.cf().elementAt(10);
									var19 = (c_ao) c_a5.es.cf().elementAt(1);
									if (var14.fP.toString().trim() != null && !var14.fP.toString().trim().equals("")
											&& var4.fP.toString().trim() != null
											&& !var4.fP.toString().trim().equals("")) {
										var19.a("确定", 0);
									}
								} else if (c_a5.method_else() == 15) {
									var14 = (a9) c_a5.es.cf().elementAt(10);
									var4 = (a9) c_a5.es.cf().elementAt(11);
									var16 = (a9) c_a5.es.cf().elementAt(12);
									a9 var21 = (a9) c_a5.es.cf().elementAt(13);
									c_ao var7 = (c_ao) c_a5.es.cf().elementAt(1);
									if (var14.fP.toString().trim() != null && !var14.fP.toString().trim().equals("")
											&& var4.fP.toString().trim() != null
											&& !var4.fP.toString().trim().equals("")
											&& var21.fP.toString().trim() != null
											&& !var21.fP.toString().trim().equals("")
											&& var16.fP.toString().trim() != null
											&& !var16.fP.toString().trim().equals("")) {
										var7.a("确定", 0);
									}
								} else if (c_a5.es.g9 == 2424836) {
									if (Integer.parseInt(this.fP.toString().trim()) >= 9) {
										this.a(new StringBuffer("9"));
										return;
									}
								} else if (c_a5.es.g9 == -1610612638) {
									var14 = (a9) c_a5.es.cf().elementAt(10);
									var4 = (a9) c_a5.es.cf().elementAt(11);
									var16 = (a9) c_a5.es.cf().elementAt(12);
									c_ao var6 = (c_ao) c_a5.es.cf().elementAt(1);
									if (var14.fP.toString().trim() != null && !var14.fP.toString().trim().equals("")
											&& var4.fP.toString().trim() != null
											&& !var4.fP.toString().trim().equals("")
											&& var4.fP.toString().trim() != null
											&& !var4.fP.toString().trim().equals("")
											&& var16.fP.toString().trim() != null
											&& !var16.fP.toString().trim().equals("")) {
										var6.a("确定", 0);
									}
								} else if (c_a5.es.g9 == 1638427) {
									var3 = this.fP.toString();
									int var5 = ((ah) c_a5.es.cf().elementAt(4)).ag();
									if (var3 == null || var3.equals("")) {
										var3 = "0";
									}

									if (Integer.parseInt(this.fP.toString().trim()) > var5) {
										this.a(new StringBuffer(String.valueOf(var5)));
									} else {
										this.a(new StringBuffer(var3));
									}
								}
							}
						}
					} else if (this.f9 == 1 && this.q()) {
						if (c_a5.es.g9 == 1703937) {
							if (c_q.field_void <= 0) {
								c_as.a((byte) 0, "金钱不足！", "确定", "", -1, -2);
								return;
							}

							if (c_q.field_void - c_q.e <= 10) {
								c_as.a((byte) 0, "您所剩下的金钱不足以支付邮费了！", "确定", "", -1, -2);
								return;
							}
						} else if ((c_a5.es.g9 == 1703938 || c_a5.es.g9 == 2424843) && this.q()
								&& this.fP.toString().trim().length() == 8) {
							this.a(new StringBuffer("99999999"));
							return;
						}

						this.l(c_a5.eT[var1]);
						if ((c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703952)
								&& !((a9) c_a5.es.cf().elementAt(13)).fP.toString().trim().equals("0")) {
							c_q.q = true;
							c_q.method_if();
						}
					}
				}
			}

			a9 var9;
			a9 var11;
			if (super.field_byte) {
				if (c_a5.method_try(4096)) {
					this.y().c8();
					return;
				}

				if (c_a5.method_try(8192)) {
					this.y().c9();
					return;
				}

				if (!c_a5.method_byte(65536) && !c_a5.method_byte(131072)) {
					if (c_a5.method_byte(262144)) {
						super.field_byte = false;
						return;
					}
				} else {
					this.y().dc();
					if (c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703952 || c_a5.es.g9 == 1703938) {
						var9 = (a9) c_a5.es.cf().elementAt(3);
						var11 = (a9) c_a5.es.cf().elementAt(4);
						if (!var9.q() || c_a5.es.g9 != 1703937 && c_a5.es.g9 != 1703938) {
							if (var9.q() && c_a5.es.g9 == 1703952) {
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612711:
									c_q.method_for();
									break;
								case -1610612709:
									c_q.method_do();
								}
							} else if (var11.q()) {
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612711:
									c_q.method_for();
									break;
								case -1610612709:
									c_q.method_do();
								}
							} else if (this.f9 == 1 && this.q()) {
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612711:
									c_q.method_for();
									break;
								case -1610612709:
									c_q.method_do();
								}
							}
						} else {
							int var26;
							switch (var26 = (Integer) this.y().db().elementAt(this.y().de())) {
							case -1610612711:
								c_q.method_for();
								break;
							case -1610612709:
								c_q.method_do();
								break;
							default:
								c_q.t = 1;
								c_a5.eQ.a(var26);
							}
						}

						super.field_byte = false;
						return;
					}

					if (c_a5.es.g9 != 1703940 && c_a5.es.g9 != 1703941) {
						label404: switch (c_a5.es.g9) {
						case 1638401:
							c_bt.method_for((Integer) this.y().db().elementAt(this.y().de()));
							break;
						case 1835009:
							c_i.a((Integer) this.y().db().elementAt(this.y().de()));
							break;
						case 1900547:
							if (bw.a == 1) {
								switch ((Integer) this.y().db().elementAt(this.y().de())) {
								case -1610612714:
									bw.method_if((byte) 1);
									break label404;
								case -1610612713:
									bw.method_do();
								default:
									break label404;
								}
							}

							return;
						default:
							return;
						}

						super.field_byte = false;
						return;
					}

					if ((var1 = (Integer) this.y().db().elementAt(this.y().de())) != 1703952) {
						if (var1 != -1) {
							c_a5.eQ.a(var1);
							super.field_byte = false;
						}

						return;
					}

					c_q.l = true;
					c_a5.eQ.a(var1);
					super.field_byte = false;
				}
			} else if (c_a5.method_byte(65536) || c_a5.method_byte(131072)) {
				if (c_a5.es.g9 != 1703937 && c_a5.es.g9 != 1703952 && c_a5.es.g9 != 1703938) {
					c_br var10;
					if (c_a5.es.g9 != 1703940 && c_a5.es.g9 != 1703941) {
						String var23;
						bk var25;
						switch (c_a5.es.g9) {
						case -1610612697:
							if (Integer.parseInt(this.fP.toString().trim()) == 0) {
								c_a5.a((byte) 0, "请您输入金额", "确定", "", -1, -120);
								return;
							}

							c_a5.eQ.a(2425009);
							return;
						case 1376260:
							c_b5.a("请输入金钱", "请输入金额", 8, this.fP.toString().trim(), 27, (byte) 6);
							return;
						case 1638401:
							this.a(c_bt.method_for());
							super.field_byte = true;
							return;
						case 1638427:
							c_bt.b = ((a9) c_a5.es.cf().elementAt(6)).b3();
							c_a5.eQ.a(1638429);
							return;
						case 1638445:
							if (this.fP.toString().trim() != null && !this.fP.toString().trim().equals("")) {
								c_bt.field_if = this.fP.toString().trim();
								c_a5.eQ.a(1638446);
								return;
							}

							if (this.fP.toString().trim() == null || this.fP.toString().trim().equals("")) {
								c_b5.a("氏族改名", "请您输入名称", 6, this.fP.toString().trim(), 6, (byte) 3);
							}
							break;
						case 1703959:
							var9 = (a9) c_a5.es.cf().elementAt(4);
							var11 = (a9) c_a5.es.cf().elementAt(6);
							if (var9.fP.toString().trim() != null && !var9.fP.toString().trim().equals("")
									&& var11.fP.toString().trim() != null && !var11.fP.toString().trim().equals("")) {
								if (var9.fP.length() >= 6 && var9.fP.length() <= 16 && var11.fP.length() >= 6
										&& var11.fP.length() <= 16) {
									var3 = c_a5.hC[0];
									var23 = c_a5.hC[1];
									c_a5.hC[0] = var9.fP.toString().trim();
									c_a5.hC[1] = var11.fP.toString().trim();
									bo.C = 2;
									var16 = null;
									var25 = new bk(bk.q, bk.method_do((byte) 1), (byte) (c_a5.dU ? 0 : 1), (byte) 0);
									bk.b = true;
									var25.a((byte) 4);
									c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
									c_a5.hC[0] = var3;
									c_a5.hC[1] = var23;
									return;
								}

								c_a5.a((byte) 0, "请您正确输入用户名及密码", "确定", "", -1, -120);
								return;
							}

							c_b5.method_if(4, 6);
							return;
						case 1703960:
							var9 = (a9) c_a5.es.cf().elementAt(4);
							var11 = (a9) c_a5.es.cf().elementAt(6);
							if (var9.fP.toString().trim() != null && !var9.fP.toString().trim().equals("")
									&& var11.fP.toString().trim() != null && !var11.fP.toString().trim().equals("")) {
								if (var9.fP.length() >= 6 && var9.fP.length() <= 16 && var11.fP.length() >= 6
										&& var11.fP.length() <= 16) {
									var3 = c_a5.hC[0];
									var23 = c_a5.hC[1];
									c_a5.hC[0] = var9.fP.toString().trim();
									c_a5.hC[1] = var11.fP.toString().trim();
									bo.C = 3;
									var16 = null;
									var25 = new bk(bk.q, bk.method_do((byte) 1), (byte) (c_a5.dU ? 0 : 1), (byte) 0);
									bk.b = true;
									var25.a((byte) 4);
									c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
									c_a5.hC[0] = var3;
									c_a5.hC[1] = var23;
									return;
								}

								c_a5.a((byte) 0, "请您正确输入用户名及密码", "确定", "", -1, -120);
								return;
							}

							c_b5.method_if(4, 6);
							return;
						case 1703961:
							if ((var9 = (a9) c_a5.es.cf().elementAt(4)).fP.toString().trim() != null
									&& !var9.fP.toString().trim().equals("")) {
								if (var9.fP.length() >= 6 && var9.fP.length() <= 16) {
									String var13 = c_a5.hC[0];
									c_a5.hC[0] = var9.fP.toString().trim();
									c_a5.a((byte) 0, "请稍候...", "", "", -120, -120);
									bo.method_do((byte) 4);
									c_a5.hC[0] = var13;
									return;
								}

								c_a5.a((byte) 0, "请您正确输入用户名", "确定", "", -1, -120);
								return;
							}

							c_b5.a("请输入用户名", "请输入您的用户名", 16, var9.fP.toString().trim(), 4, (byte) 1);
							return;
						case 1835009:
							this.a(c_i.a());
							super.field_byte = true;
							return;
						case 1900547:
							if (bw.a == 1) {
								var10 = new c_br((byte) 0);
								int[] var12 = new int[] { -1610612713, -1610612714 };
								int[] var24 = new int[] { 3, 3 };
								var10.a(c_bm.at, var12, var24);
								this.a(var10);
								this.y().da();
								super.field_byte = true;
								return;
							}
							break;
						case 2424836:
							bo.e = Integer.parseInt(this.fP.toString());
							if (this.f9 == 1 && this.q()) {
								if (bo.e == 0) {
									c_as.a((byte) 0, "请输入要发送短信的条数", "确定", "", -1, -2);
									return;
								}

								c_as.a((byte) 0, "您确实要消费" + (bo.e << 1) + "元购买" + bo.e * 20 + "猛犸币吗？", "确定", "取消", -23,
										-1);
								return;
							}
							break;
						case 2424843:
							if (this.fP.toString().trim().equals("0")) {
								c_as.a((byte) 0, "请输入兑换的金额", "确定", "", -1, -2);
								return;
							}

							bo.w = Integer.parseInt(this.fP.toString().trim());
							c_a5.eQ.a(2424996);
							return;
						}
					} else {
						if (c_a5.es.g9 == 1703940) {
							var10 = new c_br((byte) 0);
							if (c_q.field_char > 0) {
								var10.a("接收金钱", 1703951, 3);
							}

							if (c_q.field_for || c_q.field_char > 0) {
								var10.a("接收所有", 1703950, 3);
							}

							if (c_q.r) {
								var10.a("回复邮件", 1703952, 2);
							}

							if (var10.dj().size() > 0) {
								this.a(var10);
								this.y().da();
								super.field_byte = true;
							}

							return;
						}

						if (c_a5.es.g9 == 1703941) {
							var10 = new c_br((byte) 0);
							if (c_q.field_else) {
								if (c_q.field_for || c_q.field_char > 0) {
									var10.a("接收所有", 1703950, 3);
								}

								if (c_q.r) {
									var10.a("回复邮件", 1703952, 2);
								}
							} else {
								var10.a("付　款", 1703953, 3);
								var10.a("退　信", 1703957, 0);
								if (c_q.r) {
									var10.a("回复邮件", 1703952, 2);
								}
							}

							if (var10.dj().size() > 0) {
								this.a(var10);
								this.y().da();
								super.field_byte = true;
							}

							return;
						}
					}
				} else {
					var9 = (a9) c_a5.es.cf().elementAt(3);
					var11 = (a9) c_a5.es.cf().elementAt(4);
					int[] var17;
					c_br var20;
					int[] var22;
					if (var9.q() && (c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703938)) {
						var20 = new c_br((byte) 0);
						var17 = new int[] { 1703945, -1610612709, -1610612711 };
						var22 = new int[] { 2, 3, 3 };
						var20.a(c_bm.cj, var17, var22);
						this.a(var20);
						this.y().da();
						super.field_byte = true;
					} else if (var9.q() && c_a5.es.g9 == 1703952) {
						var20 = new c_br((byte) 0);
						var17 = new int[] { -1610612709, -1610612711 };
						var22 = new int[] { 3, 3 };
						var20.a(c_bm.cb, var17, var22);
						this.a(var20);
						this.y().da();
						super.field_byte = true;
					} else {
						if (!var11.q()) {
							if (this.f9 == 1 && this.q()) {
								var20 = new c_br((byte) 0);
								var17 = new int[] { -1610612709, -1610612711 };
								var22 = new int[] { 3, 3 };
								var20.a(c_bm.cb, var17, var22);
								this.a(var20);
								this.y().da();
								super.field_byte = true;
							}

							return;
						}

						var20 = new c_br((byte) 0);
						var17 = new int[] { -1610612709, -1610612711 };
						var22 = new int[] { 3, 3 };
						var20.a(c_bm.cb, var17, var22);
						this.a(var20);
						this.y().da();
						super.field_byte = true;
					}
				}
			}

		}
	}

	public final byte method_if(byte var1) {
		if (var1 == 2 && c_a5.es.g9 != 2097155 && c_a5.method_else() != 18) {
			if ((c_a5.es.g9 == 1376260 || c_a5.es.g9 == 1376265 || c_a5.es.g9 == 1376268 || c_a5.es.g9 == 1376267
					|| c_a5.es.g9 == 1376261) && a7.ej) {
				return -1;
			} else {
				if (this.f2) {
					this.b6();
					if ((c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703952) && this.b3() == 0) {
						c_q.q = false;
						c_q.method_if();
					} else if (c_a5.method_else() == 11 || c_a5.method_else() == 14 || c_a5.method_else() == 15
							|| c_a5.method_else() == 21 || c_a5.method_else() == 22 || c_a5.method_else() == 23
							|| c_a5.method_else() == 18 || c_a5.method_else() == 19 || c_a5.es.g9 == 2297615
							|| c_a5.es.g9 == -1610612638) {
						c_ao var2 = (c_ao) c_a5.es.cf().elementAt(1);
						if (this.fP.length() == 0) {
							var2.a("输入", 0);
						}
					}
				}

				return -1;
			}
		} else {
			if (c_a5.es.g9 == 2097155) {
				((c_ao) c_a5.es.cf().elementAt(1)).a("", 0);
			}

			return super.method_if(var1);
		}
	}

	public final boolean b() {
		boolean var1 = false;
		if (c_a5.gZ && c_a5.a(super.k, super.j, super.a, super.field_int)) {
			switch (c_a5.method_else()) {
			case 11:
				c_b5.method_for(4, 5);
				var1 = true;
			case 12:
			case 13:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			default:
				break;
			case 14:
				b5();
				var1 = true;
				break;
			case 15:
				c_a5.fc[0] = null;
				c_a5.fc[1] = null;
				c_a5.fc[2] = null;
				c_a5.fc[3] = null;
				c_b5.method_if();
				var1 = true;
				break;
			case 21:
			case 22:
				c_b5.method_for(4, 6);
				var1 = true;
				break;
			case 23:
				c_b5.a("请输入用户名", "请输入您的用户名", 16, this.fP.toString().trim(), 4, (byte) 1);
				var1 = true;
			}

			switch (c_a5.es.g9) {
			case -2145124351:
				c_b5.method_case("兑换触摸还没做呢！！！！！！兑换触摸还没做呢！！");
				break;
			case -1610612638:
				b5();
				var1 = true;
				break;
			case 1638427:
				c_b5.a(new int[] { 6 });
				var1 = true;
				break;
			case 1703937:
			case 1703938:
				a9 var2;
				if ((var2 = (a9) c_a5.es.cf().elementAt(13)).v() == super.k && var2.method_long() == super.j) {
					c_b5.method_case();
					var1 = true;
				}
				break;
			case 1703959:
			case 1703960:
				c_b5.method_if(4, 6);
				var1 = true;
				break;
			case 1703961:
				c_b5.a("请输入用户名", "请输入您的用户名", 16, this.fP.toString().trim(), 4, (byte) 1);
				var1 = true;
				break;
			case 1900547:
				c_b5.method_new();
				var1 = true;
				break;
			case 2424836:
				c_b5.method_try();
				var1 = true;
				break;
			case 2621443:
			case 2621445:
				c_b5.a(4, 6, "请输入充值卡卡号和密码", "请输入充值卡卡号", "请输入充值卡密码");
				var1 = true;
				break;
			case 2621447:
				c_b5.a(5, 7, "请输入", "您要充值的通行证", "确认您的通行证");
				var1 = true;
			}
		}

		return var1;
	}

	private static void b5() {
		c_a5.fr = null;
		c_a5.hC[0] = null;
		c_a5.hC[1] = null;
		a9 var0 = (a9) c_a5.es.cf().elementAt(9);
		c_a5.hC[0] = var0.fP.toString().trim();
		var0 = (a9) c_a5.es.cf().elementAt(10);
		c_a5.hC[1] = var0.fP.toString().trim();
		c_b5.a();
	}

	static {
		String[] var10000 = new String[] { "任意", "数字", "密码", "字母" };
		f5 = new String[] { "0", "1,.+_)(*&^%$#@", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9" };
		fY = "0123456789";
	}
}
