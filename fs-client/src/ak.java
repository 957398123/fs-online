import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class ak extends ba {
	private byte br = 0;
	private byte bz = 0;
	private String bk = null;
	private String[] bV = null;
	private short bg = 0;
	private short bx = 0;
	private short bo = 0;
	private Font bm = null;
	private af bj = null;
	private short bi = 0;
	private short bh = 0;
	private short bl = 0;
	private short bq = 0;
	private int bD = -1;
	public boolean bv = false;
	private short bR = 3;
	private short bc = 1;
	public byte bQ = -1;
	private String bt = "";
	public static byte bP;
	public static byte bJ;
	public static long bu;
	private static String bG;
	private byte[][] bN;

	public ak(short var1, short var2, short var3, short var4, c_be var5) {
		super(var1, var2, var3, var4, var5);
		super.b = true;
		this.bm = c_a5.fq;
		this.bj = new af(super.k, super.j, super.a, super.field_int, (byte) 0, true, var5);
		byte var6 = 0;
		this.br = var6;
	}

	public final boolean b() {
		return this.bj != null && this.bj.b();
	}

	public final void f() {
		int var9;
		if (super.field_byte) {
			if (this.y() == null) {
				return;
			}

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
				switch (c_a5.es.g9) {
				case 196641:
					c_l.field_goto = (byte) (this.y().de() + 1);
					var9 = (Integer) this.y().db().elementAt(this.y().de());
					c_a5.eQ.a(var9);
					this.bv = false;
					super.field_byte = false;
					return;
				case 458753:
					if ((var9 = (Integer) this.y().db().elementAt(this.y().de())) == 1966081) {
						au.field_if = 1;
						au.field_int = c_r.mv;
					}

					c_a5.eQ.a(var9);
					super.field_byte = false;
					return;
				case 720913:
					c_a5.eQ.a(720911);
					c_be.cn();
					return;
				case 917507:
					if (au.a == 1) {
						au.field_int = a7.fF;
						var9 = (Integer) this.y().db().elementAt(this.y().de());
						c_a5.eQ.a(var9);
						super.field_byte = false;
						return;
					}
					break;
				case 1441805:
					switch (var9 = (Integer) this.y().db().elementAt(this.y().de())) {
					case -1610612726:
						a3.a(bp.ag().an(), bp.ag().ah(), true);
						break;
					case 589831:
						c_bg.hP = bp.ag().an();
						c_a5.eQ.a(var9);
						break;
					case 720897:
						c_bu.k = bp.ag().an();
						c_a5.eQ.a(var9);
						break;
					case 1441804:
						c_as.a((byte) 0, "真的要解除伴侣吗！", "确定", "取消", 1441804, -1);
						break;
					case 1441808:
						c_a5.A();
						c_a5.aj();
						c_a5.eQ.a(var9);
					}

					super.field_byte = false;
					return;
				case 1638401:
					c_bt.method_for((Integer) this.y().db().elementAt(this.y().de()));
					super.field_byte = false;
					return;
				case 1638417:
					c_bt.a((Integer) this.y().db().elementAt(this.y().de()));
					super.field_byte = false;
					return;
				case 1638419:
					switch (var9 = (Integer) this.y().db().elementAt(this.y().de())) {
					case 1638420:
						c_a5.eQ.a(var9);
					default:
						super.field_byte = false;
						return;
					}
				case 1638426:
					switch (var9 = (Integer) this.y().db().elementAt(this.y().de())) {
					case 1638428:
						c_a5.eQ.a(var9);
					default:
						super.field_byte = false;
						return;
					}
				case 1703937:
				case 1703938:
				case 1703952:
					switch ((Integer) this.y().db().elementAt(this.y().de())) {
					case -1610612711:
						c_q.method_for();
						break;
					case -1610612709:
						c_q.method_do();
					}

					super.field_byte = false;
					return;
				case 1703971:
					switch ((Integer) this.y().db().elementAt(this.y().de())) {
					case -1610612698:
						an();
						break;
					case 1703956:
						if (bG != null && !bG.equals("") && this.bk != null && !this.bk.equals("") && bG.equals(this.bk)
								&& c_q.b != 5) {
							c_as.a((byte) 0, "请您不要发送相同的内容！", "确定", "", -1, -2);
							super.field_byte = false;
							return;
						}

						if (!bG.equals(this.bk)) {
							bG = this.bk;
						}

						c_a5.eQ.a(1703956);
					}

					super.field_byte = false;
					return;
				case 1835009:
					c_i.a((Integer) this.y().db().elementAt(this.y().de()));
					super.field_byte = false;
					return;
				case 1835027:
					switch (var9 = (Integer) this.y().db().elementAt(this.y().de())) {
					case 1835031:
						c_a5.eQ.a(var9);
						break;
					case 1835034:
						c_i.method_if(var9);
					}

					super.field_byte = false;
					return;
				default:
					if (this.bQ != 1) {
						if ((var9 = (Integer) this.y().db().elementAt(this.y().de())) != -1) {
							super.field_byte = false;
							c_a5.eQ.a(var9);
							return;
						}

						super.field_byte = false;
					}
				}
			}
		} else {
			if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
				short var15;
				if (c_a5.method_try(4096)) {
					if (!this.au()) {
						return;
					}

					if (this.bo <= 0) {
						this.bo = 0;
					} else {
						--this.bo;
					}

					var15 = this.bo;
					this.bj.aj = var15;
				} else if (c_a5.method_try(8192)) {
					if (!this.au()) {
						return;
					}

					c_b5.method_case("----------in UITextArea down--------------");
					if (this.bo >= this.bg - this.bx) {
						this.bo = (short) (this.bg - this.bx);
					} else {
						++this.bo;
					}

					var15 = this.bo;
					this.bj.aj = var15;
				} else if (c_a5.method_byte(2048)) {
					switch (this.br) {
					case 1:
						c_r var16;
						if ((var16 = (c_r) c_a5.es.cf().elementAt(3)) != null) {
							this.a(false, c_a5.es);
							var16.a(true, c_a5.es);
						}
						break;
					case 2:
						c_bv var17 = (c_bv) c_a5.es.cf().elementAt(4);
						if (this.q()) {
							this.a(false, c_a5.es);
							var17.a(true, c_a5.es);
						}
					}
				}
			} else {
				c_br var1;
				String[] var2;
				int[] var3;
				int[] var4;
				if (this.bQ != 1) {
					var1 = new c_br((byte) 0);
					if (this.bQ != 0) {
						if (this.bQ == 2) {
							switch (c_a5.es.g9) {
							case 262154:
								if (c_bv.jP) {
									c_br.dk();
									c_a5.eQ.a(262149);
								}
								break;
							case 262157:
								if (c_bv.jp) {
									if (bf.field_for) {
										c_br.c6();
									}

									c_a5.eQ.a(262188);
								}
								break;
							case 262178:
								var2 = new String[] { "刷　新" };
								var3 = new int[] { 262179 };
								var4 = new int[] { 0 };
								var1.a(var2, var3, var4);
							}
						} else if (this.bQ == 6) {
							var2 = new String[] { "重　置", "查看报酬" };
							var3 = new int[] { 262173, 262175 };
							var4 = new int[] { 0, 2 };
							var1.a(var2, var3, var4);
						} else if (this.bQ != 7) {
							if (this.bQ == 8) {
								var2 = new String[] { "接受任务" };
								var3 = new int[] { 262180 };
								var4 = new int[] { 0 };
								var1.a(var2, var3, var4);
							} else if (this.bQ == 10) {
								c_a5.eQ.a(2162696);
							} else if (this.bQ == 11) {
								c_a5.eQ.a(2162709);
							} else if (this.bQ == 12) {
								c_a5.eQ.a(2162720);
							} else if (this.bQ == 13) {
								c_a5.eQ.a(2162731);
							} else if (this.bQ == 14) {
								c_a5.eQ.a(2162740);
							} else if (this.bQ == 15) {
								c_a5.eQ.a(2162748);
							} else if (this.bQ == 16) {
								c_a5.eQ.a(2162761);
							} else if (this.bQ == 17) {
								c_a5.eQ.a(2162768);
							} else if (this.bQ == 18) {
								c_a5.eQ.a(2162775);
							} else if (this.bQ == 19) {
								c_a5.eQ.a(2162782);
							}
						}
					}

					if (var1.dj().size() > 0) {
						this.a(var1);
						super.field_byte = true;
						if (this.y() != null) {
							this.y().da();
						}
					}
				}

				int[] var12;
				switch (c_a5.es.g9) {
				case 196641:
					var1 = new c_br((byte) 0);
					var12 = new int[] { 196642, 196642, 196642 };
					var3 = new int[] { 3, 3, 3 };
					String[] var18 = new String[] { "天人排名", "修罗排名", "总排名" };
					var1.a(var18, var12, var3);
					this.a(var1);
					this.y().da();
					super.field_byte = true;
					break;
				case 458753:
					if (c_q.m == 1 || bw.field_do == 1) {
						return;
					}

					if (c_r.m3 / 10000 >= 101 && c_r.m3 / 10000 <= 120 && au.a == 1) {
						var1 = new c_br((byte) 0);
						var2 = new String[] { "宝石镶嵌" };
						var3 = new int[] { 1966081 };
						var4 = new int[] { 2 };
						var1.a(var2, var3, var4);
						this.a(var1);
						this.y().da();
						super.field_byte = true;
					}
					break;
				case 720913:
					c_a5.eQ.a(720911);
					c_be.cn();
					break;
				case 720915:
					c_b5.method_case("CommandList.C_TEAM_EQUIP_VIEW_HEADER://队长查看分配");
					c_a5.eQ.a(720916);
					break;
				case 851975:
					c_be.cn();
					break;
				case 917507:
					if (au.a == 1) {
						var1 = new c_br((byte) 0);
						var2 = new String[] { "宝石镶嵌" };
						var3 = new int[] { 1966081 };
						var4 = new int[] { 2 };
						var1.a(var2, var3, var4);
						this.a(var1);
						this.y().da();
						super.field_byte = true;
					}
					break;
				case 1441805:
					if (bp.ag().aR() != 0) {
						var1 = new c_br((byte) 0);
						var2 = new String[0];
						var3 = new int[0];
						var4 = new int[0];
						String[] var14 = new String[] { "查看详情", "私聊 ", "传送" };
						int[] var6 = new int[] { 589831, -1610612726, 1441808 };
						int[] var7 = new int[] { 2, 2, 3 };
						if (c_bu.e == 0 || c_bu.h == bp.ag().method_new()) {
							var14 = c_b5.a(var14, var14.length, "组队邀请");
							var6 = c_b5.a(var6, var6.length, 720897);
							var7 = c_b5.a(var7, var7.length, 2);
						}

						if (bp.ag().aR() == 1) {
							var14 = c_b5.a(var14, var14.length, "解除伴侣");
							var6 = c_b5.a(var6, var6.length, 1441804);
							var7 = c_b5.a(var7, var7.length, 3);
						}

						var2 = c_b5.a(var2, 0, var14);
						var3 = c_b5.a(var3, 0, var6);
						var4 = c_b5.a(var4, 0, var7);
						var1.a(var2, var3, var4);
						this.a(var1);
						this.y().da();
						super.field_byte = true;
					}
					break;
				case 1638401:
					this.a(c_bt.method_for());
					super.field_byte = true;
					break;
				case 1638417:
					this.a(c_bt.method_new());
					super.field_byte = true;
					break;
				case 1638419:
					if (bp.ag().aT() == c_bt.d || bp.ag().aT() == c_bt.field_long) {
						this.a(c_bt.method_if());
						super.field_byte = true;
					}
					break;
				case 1638426:
					var1 = new c_br((byte) 0);
					var2 = new String[] { "上交详情" };
					var3 = new int[] { 1638428 };
					var4 = new int[] { 2 };
					var1.a(var2, var3, var4);
					this.a(var1);
					super.field_byte = true;
					break;
				case 1703937:
				case 1703938:
				case 1703952:
					var1 = new c_br((byte) 0);
					var12 = new int[] { -1610612709, -1610612711 };
					var3 = new int[] { 3, 3 };
					var1.a(c_bm.cb, var12, var3);
					this.a(var1);
					this.y().da();
					super.field_byte = true;
					break;
				case 1703940:
				case 1703941:
					if (super.field_byte) {
						if (c_a5.method_try(4096)) {
							this.y().c8();
						} else if (c_a5.method_try(8192)) {
							this.y().c9();
						} else if (c_a5.method_byte(262144)) {
							super.field_byte = false;
						} else if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
							if ((var9 = (Integer) this.y().db().elementAt(this.y().de())) == 1703952) {
								c_q.l = true;
								c_a5.eQ.a(var9);
								super.field_byte = false;
							} else if (var9 != -1) {
								c_a5.eQ.a(var9);
								super.field_byte = false;
							}
						}
					} else if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
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
								this.a(var1);
								this.y().da();
								super.field_byte = true;
							}
						} else if (c_a5.es.g9 == 1703941) {
							var1 = new c_br((byte) 0);
							if (!c_q.field_else) {
								var1.a("付　款", 1703953, 3);
								var1.a("退　信", 1703957, 0);
								if (c_q.r) {
									var1.a("回复邮件", 1703952, 2);
								}
							} else {
								if (c_q.field_for || c_q.field_char > 0) {
									var1.a("接收所有", 1703950, 3);
								}

								if (c_q.r) {
									var1.a("回复邮件", 1703952, 2);
								}
							}

							if (var1.dj().size() > 0) {
								this.a(var1);
								this.y().da();
								super.field_byte = true;
							}
						}
					}
					break;
				case 1703969:
					if (this.q() && !this.bk.equals("") && this.bk != null) {
						c_q.o = ((c_bv) c_a5.es.cf().elementAt(4)).la;
						c_a5.eQ.a(1703972);
					}
					break;
				case 1703971:
					if (this.bk.toString().trim().equals("")) {
						an();
					} else {
						var1 = new c_br((byte) 0);
						var2 = new String[] { "修改", "发送" };
						var3 = new int[] { -1610612698, 1703956 };
						var4 = new int[] { 3, 3 };
						var1.a(var2, var3, var4);
						this.a(var1);
						this.y().da();
						super.field_byte = true;
					}
					break;
				case 1835009:
					this.a(c_i.a());
					super.field_byte = true;
					break;
				case 1835027:
					c_b5.method_case("Player.getInstance().getKingRight()" + bp.ag().as());
					if (bp.ag().as() == c_i.field_for) {
						var1 = new c_br((byte) 0);
						var2 = new String[] { "变更职位" };
						var3 = new int[] { 1835031 };
						var4 = new int[] { 1 };
						var1.a(var2, var3, var4);
						this.a(var1);
						this.y().da();
						super.field_byte = true;
					} else if (bp.ag().as() != c_i.field_char) {
						var1 = new c_br((byte) 0);
						var2 = new String[] { "卸任职位" };
						var3 = new int[] { 1835034 };
						var4 = new int[] { 3 };
						var1.a(var2, var3, var4);
						this.a(var1);
						this.y().da();
						super.field_byte = true;
					}
					break;
				case 2555906:
					if (this.q() && az.h == 0) {
						final Form var8 = new Form("农场宣言");
						final Command var10 = new Command(c_bm.a2[2], 4, 0);
						final Command var11 = new Command(c_bm.a2[1], 3, 1);
						final TextField var13 = new TextField("请您输入内容", "", 100, 0);
						var8.addCommand(var10);
						var8.addCommand(var11);
						var8.append(var13);
						ak var5;
						if ((var5 = (ak) c_a5.es.cf().elementAt(15)).bk != null && !var5.bk.equals("")) {
							var13.setString(var5.bk);
						}

						var8.setCommandListener(new CommandListener() {
							public final void commandAction(Command var1, Displayable var2) {
								if (var1 == var10) {
									if (!c_a5.a(var13.getString(), (byte) 3)) {
										Alert var4 = new Alert(c_bm.a2[9], "您输入的内容含有非法字符，请您重新输入！", (Image) null,
												AlertType.ERROR);
										c_a5.dI.display.setCurrent(var4, var8);
									} else {
										ak var3;
										(var3 = (ak) c_a5.es.cf().elementAt(15)).method_if(var13.getString());
										if (!var13.getString().equals("") && var13.getString() != null) {
											az.field_try = var13.getString();
										} else {
											az.field_try = "";
										}

										c_a5.eQ.a(2555920);
										var3.ap();
										c_a5.dI.display.setCurrent(c_a5.e8);
									}
								} else {
									if (var1 == var11) {
										var8.removeCommand(var10);
										var8.removeCommand(var11);
										c_a5.e8.setFullScreenMode(true);
										c_a5.dI.display.setCurrent(c_a5.e8);
									}

								}
							}
						});
						c_a5.dI.display.setCurrent(var8);
					}
				}

				if (c_a5.method_else() == 27) {
					c_a5.method_do(c_a5.method_case());
				}
			}

			if (this.bj != null) {
				this.bj.a(this.bo, false);
			}
		}

	}

	public final void a(Graphics var1) {
        var1.setColor(c_bm.field_try);
        var1.fillRect(super.k, super.j, super.a, super.field_int);
        switch(this.bz) {
        case 0:
        default:
            break;
        case 1:
            var1.setColor(c_bm.field_try);
            var1.fillRect(super.k + 1, super.j + 1, super.a - 2, super.field_int - 2);
            var1.setColor(c_bm.dt);
            var1.drawRect(super.k, super.j, super.a - 1, super.field_int - 1);
            break;
        case 2:
            var1.setColor(c_bm.dt);
            var1.drawRect(super.k, super.j, super.a - 1, super.field_int - 1);
            var1.fillRect(super.k, super.j, this.bR, super.field_int);
            var1.fillRect(super.k + super.a - this.bR, super.j, this.bR, super.field_int);
            var1.drawRect(super.k + this.bR + 1, super.j + this.bc + 1, super.a - 2 * (this.bR + 1) - 1, super.field_int - 2 * (this.bc + 1) - 1);
        }

        Graphics var3 = var1;
        ak var2 = this;
        if (this.bV != null) {
            switch(this.bz) {
            case 0:
                this.bi = super.k;
                this.bh = super.j;
                this.bl = super.a;
                this.bq = super.field_int;
                break;
            case 1:
                this.bi = (short)(super.k + 1);
                this.bh = (short)(super.j + 1);
                this.bl = (short)(super.a - 2);
                this.bq = (short)(super.field_int - 2);
                break;
            case 2:
                this.bi = (short)(super.k + this.bR + 1 + 1);
                this.bh = (short)(super.j + this.bc + 1 + 1);
                this.bl = (short)(super.a - 2 * (this.bR + 1 + 1));
                this.bq = (short)(super.field_int - 2 * (this.bc + 1 + 1));
            }

            boolean var4 = false;
            int var11;
            if ((var11 = this.bV.length) > this.bx) {
                var11 = this.bo + this.bx;
            }

            int var5 = this.bo;

            for(int var6 = 0; var5 < var11; ++var6) {
                int var7 = 0;
                char[] var8 = var2.bV[var5].toCharArray();

                for(int var9 = 0; var9 < var8.length; ++var9) {
                    if (var2.bN[var5][var9] == 0) {
                        var3.setColor(c_bm.dt);
                    } else {
                        if (var2.bD == -1) {
                            var2.bD = c_bm.F;
                        }

                        var3.setColor(var2.bD);
                    }

                    if (var8[var9] == 949) {
                        int var10001 = var2.bi + var7 + 4 + 1;
                        int var13 = var2.bh + 3 + var6 * (c_a5.iG + 1);
                        var7 = var10001;
                        StringBuffer var14;
                        (var14 = new StringBuffer()).append(bP).append(":").append(bJ);
                        if (bP == 0 && bJ == 0) {
                            var3.setColor(16711680);
                        } else {
                            var3.setColor(c_bm.dt);
                        }

                        var3.drawString(var14.toString(), var7, var13, 20);
                        break;
                    }

                    var3.drawChar(var8[var9], var2.bi + var7 + 4 + 1, var2.bh + 3 + var6 * (c_a5.iG + 1), 20);
                    var7 += var2.bm.charWidth(var8[var9]);
                }

                ++var5;
            }

            if (c_a5.method_else() == 18) {
                ay var12 = (ay)c_a5.es.cf().elementAt(7);
                if (c_a5.ht % 50 == 1 && !var12.q()) {
                    if (var2.bo >= var2.bg - var2.bx) {
                        var2.bo = 0;
                    } else {
                        ++var2.bo;
                    }
                }
            }
        }

        if (this.bj != null && this.au() && c_a5.method_else() != 18) {
            this.bj.a(var1);
        }

        if (c_a5.es != null) {
            if (this.q()) {
                if (c_a5.method_else() == 8 || c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703938 || c_a5.es.g9 == 1703940 || c_a5.es.g9 == 1703941 || c_a5.es.g9 == 262147 || c_a5.es.g9 == 1703952 || c_a5.es.g9 == 262176 || c_a5.es.g9 == 393230 || c_a5.es.g9 == 262157 || c_a5.es.g9 == 262154 || c_a5.es.g9 == 458754 || c_a5.es.g9 == 458775 || c_a5.es.g9 == 262178 || c_a5.es.g9 == 2293874 || c_a5.es.g9 == 1703969 || c_a5.es.g9 == 2490385 || c_a5.es.g9 == 262188 || c_a5.es.g9 == 2555906 || c_a5.es.g9 == 2621443 || c_a5.es.g9 == 2621442 || c_a5.es.g9 == 2621446 || c_a5.es.g9 == -1610612632) {
                    c_b5.method_int(var1, super.k, super.j, super.a, super.field_int);
                    return;
                }
            } else if (c_a5.es != null && c_a5.es.g9 == 393230) {
                this.az();
            }
        }

    }

	public final String as() {
		return this.bk;
	}

	public final void method_if(String var1) {
        this.bk = var1;
        if (this.bk == null) {
            this.bk = " ";
        }

        this.bV = this.a(this.bk, this.bl - this.bm.charWidth('正') / 2 - c_a5.ca.getWidth(), this.bm);
        if (this.bV != null) {
            this.bg = (short)this.bV.length;
        }

        this.bx = (short)(this.bq / (c_a5.iG + 1));
        c_b5.method_case("总行数 = " + this.bg);
        c_b5.method_case("能够显示的行数 = " + this.bx);
        c_b5.method_case("文本区域宽度 = " + this.bl);
        c_b5.method_case("文本区域高度 = " + this.bq);
        this.az();
    }

	private void az() {
		this.bo = 0;
		this.bj.aa();
	}

	private boolean au() {
		return this.bx < this.bg;
	}

	public final void method_try(byte var1) {
        this.bz = var1;
        short var4 = 0;
        short var2 = 0;
        short var3 = 0;
        switch(this.bz) {
        case 0:
            this.bi = super.k;
            this.bh = super.j;
            this.bl = super.a;
            this.bq = super.field_int;
            var4 = (short)(this.bi + this.bl - c_a5.ca.getWidth());
            var2 = this.bh;
            var3 = this.bq;
            break;
        case 1:
            this.bi = (short)(super.k + 1);
            this.bh = (short)(super.j + 1);
            this.bl = (short)(super.a - 2);
            this.bq = (short)(super.field_int - 2);
            var4 = (short)(super.k + super.a - c_a5.ca.getWidth());
            var2 = super.j;
            var3 = super.field_int;
            break;
        case 2:
            this.bi = (short)(super.k + this.bR + 1 + 1);
            this.bh = (short)(super.j + this.bc + 1 + 1);
            this.bl = (short)(super.a - 2 * (this.bR + 1 + 1));
            this.bq = (short)(super.field_int - 2 * (this.bc + 1 + 1));
            var4 = (short)(super.k + super.a - this.bR - 1 - c_a5.ca.getWidth());
            var2 = (short)(super.j + this.bc + 1);
            var3 = (short)(super.field_int - 2 * (this.bc + 1));
        }

        this.bj.method_new(var4);
        this.bj.method_for(var2);
        this.bj.method_do((short)0);
        this.bj.a(var3);
    }

	public final void method_else(int var1) {
		this.bD = var1;
	}

	public final short ax() {
		return this.bg;
	}

	public final short ao() {
		return this.bx;
	}

	public final void method_new(

	byte var1)
	{
		this.br = var1;
	}

	private String[] a(String var1, int var2, Font var3) {
        char[] var13;
        int var4 = (var13 = var1.toCharArray()).length;
        int[] var5 = new int[34];
        int var6 = 0;
        StringBuffer var7 = new StringBuffer();
        Vector var8 = new Vector();

        int var9;
        for(var9 = 0; var9 < var4; ++var9) {
            if (var13[var9] != '\n') {
                var8.addElement(new Character(var13[var9]));
            }

            if (var13[var9] != '$') {
                var7.append(var13[var9]);
            }
        }

        var9 = 0;
        StringBuffer var14 = new StringBuffer();
        int var10 = 0;

        for(int var11 = var8.size(); var10 < var11; ++var10) {
            if (var8.elementAt(var10).toString().charAt(0) == '$') {
                var5[var6] = var10;
                ++var6;
            }

            if (var9 == 1) {
                var14.append(var8.elementAt(var10).toString().charAt(0));
            } else if (var9 == 2) {
                var14.setLength(var14.length() - 1);
                this.bt = var14.toString();
                c_b5.method_case("~~~~~~~~~~~~~~~~~~ timeStr = " + this.bt);

                try {
                    bP = (byte)((var9 = Integer.parseInt(this.bt)) / 60);
                    bJ = (byte)(var9 % 60);
                } catch (NumberFormatException var12) {
                    var12.printStackTrace();
                    bP = 0;
                    bJ = 0;
                }

                var9 = 0;
            }

            if (var8.elementAt(var10).toString().charAt(0) == 949) {
                ++var9;
            }
        }

        String[] var24;
        var4 = (var24 = c_b5.a(var7.toString(), var2, var3)).length;
        this.bN = new byte[var4][];
        int[][] var25 = new int[var4][2];

        int var15;
        for(var9 = 0; var9 < var4; ++var9) {
            var15 = var24[var9].length();
            this.bN[var9] = new byte[var15];
            if (var9 == 0) {
                var25[var9][0] = 0;
                var25[var9][1] = var15 - 1;
            } else {
                var25[var9][0] = var25[var9 - 1][1] + 1;
                var25[var9][1] = var25[var9][0] + var15 - 1;
            }
        }

        Vector var26 = new Vector(4);
        if (var6 % 2 != 0) {
            --var6;
        }

        int var18;
        int var22;
        for(var15 = 0; var15 < var6; var15 += 2) {
            var5[var15] -= var15;
            var5[var15 + 1] -= var15 + 1 + 1;
            var2 = c_b5.a(var5[var15], var25);
            var18 = c_b5.a(var5[var15 + 1], var25);
            if (var2 == var18) {
                int[] var20;
                (var20 = new int[3])[0] = var2;
                var20[1] = var5[var15] - var25[var2][0];
                var20[2] = var5[var15 + 1] - var25[var2][0];
                var26.addElement(var20);
            } else {
                if (var18 - var2 > 1) {
                    for(var22 = var2 + 1; var22 < var18; ++var22) {
                        int[] var19;
                        (var19 = new int[3])[0] = var22;
                        var19[1] = 0;
                        var19[2] = var24[var22].length() - 1;
                        var26.addElement(var19);
                    }
                }

                int[] var23;
                (var23 = new int[3])[0] = var2;
                var23[1] = var5[var15] - var25[var2][0];
                var23[2] = var25[var2][1] - var25[var2][0];
                var26.addElement(var23);
                (var23 = new int[3])[0] = var18;
                var23[1] = 0;
                var23[2] = var5[var15 + 1] - var25[var18][0];
                var26.addElement(var23);
            }
        }

        int[][] var17 = new int[var4 = var26.size()][];
        Enumeration var16 = var26.elements();

        for(var18 = 0; var16.hasMoreElements(); ++var18) {
            var17[var18] = (int[])((int[])var16.nextElement());
        }

        int var21;
        for(var21 = 0; var21 < var4; ++var21) {
            for(var22 = var17[var21][1]; var22 <= var17[var21][2]; ++var22) {
                this.bN[var17[var21][0]][var22] = 1;
            }
        }

        for(var21 = 0; var21 < var24.length; ++var21) {
            var24[var21] = var24[var21].trim();
        }

        return var24;
    }

	public final void ap() {
		if (this.bj != null) {
			this.bj.az = this.bg;
			this.bj.ay = this.bx;
			af var10000 = this.bj;
			byte var2 = 0;
			var10000.aj = var2;
		}
	}

	public final short ar() {
		return this.bo;
	}

	private static final void an() {
        final Form var0 = new Form("客服中心");
        final Command var1 = new Command(c_bm.a2[2], 4, 0);
        final Command var2 = new Command(c_bm.a2[1], 3, 1);
        final TextField var3 = new TextField("请输入问题内容", "", 100, 0);
        final TextField var4 = new TextField("请输入机型", "", 20, 0);
        var0.addCommand(var1);
        var0.addCommand(var2);
        var0.append(var4);
        var0.append(var3);
        ak var5 = (ak)c_a5.es.cf().elementAt(3);
        a9 var6 = (a9)c_a5.es.cf().elementAt(4);
        if (var5.bk != null && !var5.bk.equals("")) {
            var3.setString(var5.bk);
        }

        if (var6.cc().toString().trim() != null && !var6.cc().toString().trim().equals("")) {
            var4.setString(var6.cc().toString().trim());
        }

        var0.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                if (var1x == var1) {
                    Alert var4x;
                    if (!var4.getString().equals("") && var4.getString() != null) {
                        if (!var3.getString().equals("") && var3.getString() != null) {
                            if (ak.bG.equals(var3.getString()) && c_q.b != 5) {
                                var4x = new Alert(c_bm.a2[9], "请您不要输入相同的内容！", (Image)null, AlertType.ERROR);
                                c_a5.dI.display.setCurrent(var4x, var0);
                            } else if (c_a5.a(var3.getString(), (byte)3) && c_a5.a(var4.getString(), (byte)3)) {
                                ak var5 = (ak)c_a5.es.cf().elementAt(3);
                                a9 var6 = (a9)c_a5.es.cf().elementAt(4);
                                c_ao var3x = (c_ao)c_a5.es.cf().elementAt(1);
                                var5.method_if(var3.getString());
                                var6.a(new StringBuffer(var4.getString()));
                                var5.ap();
                                var3x.a("操作", 0);
                                c_a5.dI.display.setCurrent(c_a5.e8);
                            } else {
                                var4x = new Alert(c_bm.a2[9], "您输入的内容含有非法字符，请您重新输入！", (Image)null, AlertType.ERROR);
                                c_a5.dI.display.setCurrent(var4x, var0);
                            }
                        } else {
                            var4x = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                            c_a5.dI.display.setCurrent(var4x, var0);
                        }
                    } else {
                        var4x = new Alert(c_bm.a2[9], "请您输入机型内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var4x, var0);
                    }
                } else {
                    if (var1x == var2) {
                        var0.removeCommand(var1);
                        var0.removeCommand(var2);
                        ((ak)c_a5.es.cf().elementAt(3)).method_if("");
                        ((a9)c_a5.es.cf().elementAt(4)).a(new StringBuffer(""));
                        ((c_ao)c_a5.es.cf().elementAt(1)).a("输入", 0);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var0);
    }

	static {
		System.getProperty("line.separator");
		bP = 0;
		bJ = 0;
		bu = 0L;
		bG = "";
	}
}
