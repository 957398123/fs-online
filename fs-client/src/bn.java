import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

/**
 * 2021/01/22
 * 
 * @author 95739
 *
 */
public final class bn extends ba {
	private Vector ip;
	private short iB;
	private static short iz = 13;
	private Form iy;
	private String iw;
	private Command iD;
	private Command iF;
	private ChoiceGroup in;
	private String[] iE;
	private TextField ix;
	private ChoiceGroup is;
	private String[] im;
	private TextField iq;
	private TextField iH;
	private TextField iG;
	private TextField it;
	private TextField ir;
	private TextField iu;
	private TextField io;
	public static final String[] iv = new String[] { "以下资料", "昵称", "性别", "年龄", "血型", "生肖", "星座", "城市", "职业", "个人说明" };
	public String[] iA;
	public static Vector iI = new Vector();

	private bn(short var1, short var2, short var3, short var4, c_be var5) {
		super((short) 0, (short) 0, (short) 0, (short) 0, var5);
		this.ip = null;
		this.iB = 0;
		this.iy = null;
		this.iw = "资料";
		this.iD = null;
		this.iF = null;
		this.in = null;
		this.iE = new String[] { "好友可见", "完全公开", "完全保密" };
		this.ix = null;
		this.is = null;
		this.im = new String[] { "女", "男" };
		this.iq = null;
		this.iH = null;
		this.iG = null;
		this.it = null;
		this.ir = null;
		this.iu = null;
		this.io = null;
		this.iA = new String[iv.length];
	}

	public bn(int var1, c_be var2) {
		this((short) 0, (short) 0, (short) 0, (short) 0, var2);
		switch (var1) {
		case 393218:
		case 393225:
		case 393229:
		case 1245185:
			super.b = true;
			this.a(true, var2);
		default:
			if (this.ip != null) {
				this.ip.removeAllElements();
			} else {
				c_b5.method_case("Vector已经为空，删除完毕！");
			}
		}
	}

	public final void cZ() {
		bn var1 = this;
		int var2;
		int var3;
		ba var4;
		if (c_a5.gZ && c_a5.method_byte(268435456) && !super.field_byte) {
			var2 = 0;

			for (var3 = this.ip.size(); var2 < var3; ++var2) {
				if ((var4 = (ba) ((ba) var1.ip.elementAt(var2))) instanceof af) {
					((af) var4).b();
					break;
				}
			}
		}

		af var10000;
		short var6;
		int var7;
		ba var8;
		switch (c_a5.es.g9) {
		case 393218:
			if (c_a5.method_try(4096)) {
				--this.iB;
				if (this.iB < 0) {
					this.iB = 0;
					return;
				}

				if (this.ip != null) {
					var7 = 0;

					for (var2 = this.ip.size(); var7 < var2; ++var7) {
						if ((var8 = (ba) ((ba) this.ip.elementAt(var7))) instanceof af) {
							var10000 = (af) var8;
							var6 = this.iB;
							var10000.aj = var6;
							((af) var8).a(this.iB, false);
						} else {
							var8.j = (short) (var8.j + 16 * c_a5.il / 208);
						}
					}

					return;
				}
			} else if (c_a5.method_try(8192)) {
				++this.iB;
				var7 = 0;
				if (this.ip != null) {
					var2 = 0;

					for (var3 = this.ip.size(); var2 < var3; ++var2) {
						if ((var4 = (ba) this.ip.elementAt(var2)) instanceof af) {
							var7 = ((af) var4).az - ((af) var4).ay;
						}
					}
				}

				if (this.iB > var7) {
					this.iB = (short) var7;
					return;
				}

				if (this.ip != null) {
					var2 = 0;

					for (var3 = this.ip.size(); var2 < var3; ++var2) {
						if ((var4 = (ba) ((ba) this.ip.elementAt(var2))) instanceof af) {
							var10000 = (af) var4;
							var6 = this.iB;
							var10000.aj = var6;
							((af) var4).a(this.iB, false);
						} else {
							var4.j = (short) (var4.j - 16 * c_a5.il / 208);
						}
					}
				}

				return;
			}
			break;
		case 393225:
		case 393229:
			if (super.field_byte) {
				if (c_a5.method_try(4096)) {
					this.y().c8();
				} else if (c_a5.method_try(8192)) {
					this.y().c9();
				} else if (!c_a5.method_byte(65536) && !c_a5.method_byte(131072)) {
					if (c_a5.method_byte(262144)) {
						super.field_byte = false;
					}
				} else if (c_a5.es.g9 == 393225) {
					this.y().dc();
					switch (this.y().de()) {
					case 0:
						this.iy = new Form(this.iw);
						this.iD = new Command("保存", 4, 2);
						this.iF = new Command(c_bm.a2[3], 3, 2);
						this.in = new ChoiceGroup("资料权限", 1, this.iE, (Image[]) null);
						this.ix = new TextField("昵称", "", 6, 0);
						this.is = new ChoiceGroup("性别", 1, this.im, (Image[]) null);
						this.iq = new TextField("年龄", "", 6, 0);
						this.iH = new TextField("血型", "", 6, 0);
						this.iG = new TextField("生肖", "", 6, 0);
						this.it = new TextField("星座", "", 6, 0);
						this.ir = new TextField("城市", "", 6, 0);
						this.iu = new TextField("职业", "", 6, 0);
						this.io = new TextField("个人说明", "", 50, 0);
						this.cY();
						this.iy.append(this.in);
						this.iy.append(this.ix);
						this.iy.append(this.is);
						this.iy.append(this.iq);
						this.iy.append(this.iH);
						this.iy.append(this.iG);
						this.iy.append(this.it);
						this.iy.append(this.ir);
						this.iy.append(this.iu);
						this.iy.append(this.io);
						this.iy.addCommand(this.iD);
						this.iy.addCommand(this.iF);
						this.iy.setCommandListener(new CommandListener() {
							public final void commandAction(Command var1, Displayable var2) {
								if (var1 == bn.this.iD) {
									bn.iI.addElement(bn.this.in.getString(bn.this.in.getSelectedIndex()));
									bn.this.iA[0] = bn.this.in.getString(bn.this.in.getSelectedIndex());
									bn.iI.addElement(bn.this.ix.getString());
									bn.this.iA[1] = bn.this.ix.getString();
									bn.iI.addElement(bn.this.is.getString(bn.this.is.getSelectedIndex()));
									bn.this.iA[2] = bn.this.is.getString(bn.this.is.getSelectedIndex());
									bn.iI.addElement(bn.this.iq.getString());
									bn.this.iA[3] = bn.this.iq.getString();
									bn.iI.addElement(bn.this.iH.getString());
									bn.this.iA[4] = bn.this.iH.getString();
									bn.iI.addElement(bn.this.iG.getString());
									bn.this.iA[5] = bn.this.iG.getString();
									bn.iI.addElement(bn.this.it.getString());
									bn.this.iA[6] = bn.this.it.getString();
									bn.iI.addElement(bn.this.ir.getString());
									bn.this.iA[7] = bn.this.ir.getString();
									bn.iI.addElement(bn.this.iu.getString());
									bn.this.iA[8] = bn.this.iu.getString();
									bn.iI.addElement(bn.this.io.getString());
									bn.this.iA[9] = bn.this.io.getString();
									int var4 = 0;

									for (int var5 = bn.this.c1().size(); var4 < var5; ++var4) {
										if (var4 % 2 != 0) {
											if (bn.this.q(var4) instanceof ah) {
												((ah) bn.this.q(var4)).a(bn.iI.elementAt(var4 >> 1).toString());
											} else if (bn.this.q(var4) instanceof ak) {
												((ak) bn.this.q(var4)).method_if(bn.iI.elementAt(var4 >> 1).toString());
											}
										}
									}

									c_a5.eQ.a(393226);
									c_a5.e8.setFullScreenMode(true);
									c_a5.dI.display.setCurrent(c_a5.e8);
									bn.this.c5();
								} else {
									if (var1 == bn.this.iF) {
										c_a5.e8.setFullScreenMode(true);
										c_a5.dI.display.setCurrent(c_a5.e8);
										bn.this.c5();
									}

								}
							}
						});
						c_a5.dI.display.setCurrent(this.iy);
					default:
						super.field_byte = false;
					}
				}

				c_b5.method_case("clientCommand = " + Integer.toHexString(c_a5.es.g9));
				return;
			}

			if (c_a5.method_try(4096)) {
				if (this.iB <= 0) {
					this.iB = 0;
					return;
				}

				--this.iB;
				if (this.ip != null) {
					var7 = 0;

					for (var2 = this.ip.size(); var7 < var2; ++var7) {
						if ((var8 = (ba) ((ba) this.ip.elementAt(var7))) instanceof af) {
							var10000 = (af) var8;
							var6 = this.iB;
							var10000.aj = var6;
							((af) var8).a(this.iB, false);
						} else {
							var8.j = (short) (var8.j + 16);
						}
					}

					return;
				}
			} else if (c_a5.method_try(8192)) {
				if (this.iB >= iz) {
					this.iB = iz;
					return;
				}

				++this.iB;
				if (this.ip != null) {
					var7 = 0;

					for (var2 = this.ip.size(); var7 < var2; ++var7) {
						if ((var8 = (ba) ((ba) this.ip.elementAt(var7))) instanceof af) {
							var10000 = (af) var8;
							var6 = this.iB;
							var10000.aj = var6;
							((af) var8).a(this.iB, false);
						} else {
							var8.j = (short) (var8.j - 16);
						}
					}

					return;
				}
			} else if (c_a5.method_byte(65536) || c_a5.method_byte(131072)) {
				c_br var9 = new c_br((byte) 0);
				if (c_a5.es.g9 == 393225) {
					int[] var10 = new int[] { 1 };
					int[] var11 = new int[] { 3 };
					var9.a(c_bm.b3, var10, var11);
					this.a(var9);
					super.field_byte = true;
					this.y().da();
				}

				return;
			}
			break;
		case 1245185:
			if (c_a5.method_try(4096)) {
				--this.iB;
				if (this.iB < 0) {
					this.iB = 0;
					return;
				}

				if (this.ip != null) {
					var7 = 0;

					for (var2 = this.ip.size(); var7 < var2; ++var7) {
						if ((var8 = (ba) ((ba) this.ip.elementAt(var7))) instanceof af) {
							var10000 = (af) var8;
							var6 = this.iB;
							var10000.aj = var6;
							((af) var8).a(this.iB, false);
						} else if (var8 instanceof ah) {
							var8.j = (short) (var8.j + c_a5.iG);
						}
					}

					return;
				}
			} else if (c_a5.method_try(8192)) {
				++this.iB;
				var7 = 0;
				if (this.ip != null) {
					var2 = 0;

					for (var3 = this.ip.size(); var2 < var3; ++var2) {
						if ((var4 = (ba) this.ip.elementAt(var2)) instanceof af) {
							var7 = ((af) var4).az - ((af) var4).ay;
						}
					}
				}

				if (this.iB > var7) {
					this.iB = (short) var7;
					return;
				}

				if (this.ip != null) {
					var2 = 0;

					for (var3 = this.ip.size(); var2 < var3; ++var2) {
						if ((var4 = (ba) ((ba) this.ip.elementAt(var2))) instanceof af) {
							var10000 = (af) var4;
							var6 = this.iB;
							var10000.aj = var6;
							((af) var4).a(this.iB, false);
						} else if (var4 instanceof ah) {
							var4.j = (short) (var4.j - c_a5.iG);
						}
					}
				}
			}
		}

	}

	public final void a(Graphics var1) {
		int var3;
		switch (c_a5.es.g9) {
		case 393218:
			int var8 = 0;

			for (var3 = this.c1().size(); var8 < var3; ++var8) {
				ba var9;
				if ((var9 = this.q(var8)) instanceof ah && var8 >= this.iB << 1 && var8 < 8 + this.iB << 1) {
					var9.a(var1);
				}
			}

			return;
		case 1245185:
			c_y var2 = null;
			var3 = 0;
			int var4 = 0;

			for (int var5 = this.c1().size(); var4 < var5; ++var4) {
				ba var6;
				if ((var6 = this.q(var4)) instanceof c_y) {
					var2 = (c_y) var6;
					var6.a(var1);
					var1.setColor(c_bm.ad);
					var1.fillRect(var2.I[0] - 4, var2.I[1] + 2, (c_a5.iA << 1) + 2, var2.I[3] - 5);
					var1.setColor(c_bm.b4);
					var1.drawLine(var2.I[0] + (c_a5.iA << 1) + 2 - 4, var2.I[1] + 2, var2.I[0] + (c_a5.iA << 1) + 2 - 4,
							var2.I[1] + var2.I[3] - 3);
					var3 = var2.I[0] + (var2.I[2] + (c_a5.iA << 1) + 2 + 1) / 2 + 4;
					var1.drawLine(var3 - 4, var2.I[1] + 2, var3 - 4, var2.I[1] + var2.I[3] - 3);
				} else if (var6 instanceof ah) {
					ah var10 = (ah) var6;
					if ((var4 - 4) / 3 >= this.iB && (var4 - 4) / 3 < this.iB + var2.G) {
						switch (var4) {
						case 5:
						case 23:
						case 26:
						case 29:
						case 32:
							c_b5.a(var1, var10.aj(), var2.I[0] + (c_a5.iA << 1) + 2, var10.method_long(),
									var3 - (var2.I[0] + (c_a5.iA << 1) + 2) - 3, (byte) 0, (byte) 1);
							break;
						case 6:
						case 24:
						case 27:
						case 30:
						case 33:
							c_b5.a(var1, var10.aj(), var3 + 2, var10.method_long(),
									var3 - (var2.I[0] + (c_a5.iA << 1) + 2) - 3, (byte) 0, (byte) 1);
							break;
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						case 13:
						case 14:
						case 15:
						case 16:
						case 17:
						case 18:
						case 19:
						case 20:
						case 21:
						case 22:
						case 25:
						case 28:
						case 31:
						default:
							var10.a(var1);
						}
					}
				} else {
					var6.a(var1);
				}
			}
		default:
		}
	}

	public final Vector c1() {
		if (this.ip == null) {
			this.ip = new Vector();
		}

		return this.ip;
	}

	public final void method_do(ba var1) {
		if (this.ip == null) {
			this.ip = new Vector();
		}

		this.ip.addElement(var1);
	}

	public final ba q(int var1) {
		return this.ip != null ? (ba) ((ba) this.ip.elementAt(var1)) : null;
	}

	public final void c5() {
		this.iy = null;
		this.iD = null;
		this.iF = null;
		this.in = null;
		this.ix = null;
		this.iq = null;
		this.iH = null;
		this.iG = null;
		this.it = null;
		this.ir = null;
		this.iu = null;
		this.io = null;
		iI.removeAllElements();
	}

	private void cY() {
		int var1;
		if (this.iA[0] != null) {
			c_b5.method_case("saveStr[0] = " + this.iA[0]);

			for (var1 = 0; var1 < this.iE.length; ++var1) {
				if (this.iA[0].equals(this.iE[var1])) {
					this.in.setSelectedIndex(var1, true);
				}
			}
		}

		if (this.iA[1] != null) {
			this.ix.setString(this.iA[1]);
		}

		if (this.iA[2] != null) {
			for (var1 = 0; var1 < this.im.length; ++var1) {
				if (this.iA[2].equals(this.im[var1])) {
					this.is.setSelectedIndex(var1, true);
				}
			}
		}

		if (this.iA[3] != null) {
			this.iq.setString(this.iA[3]);
		}

		if (this.iA[4] != null) {
			this.iH.setString(this.iA[4]);
		}

		if (this.iA[5] != null) {
			this.iG.setString(this.iA[5]);
		}

		if (this.iA[6] != null) {
			this.it.setString(this.iA[6]);
		}

		if (this.iA[7] != null) {
			this.ir.setString(this.iA[7]);
		}

		if (this.iA[8] != null) {
			this.iu.setString(this.iA[8]);
		}

		if (this.iA[9] != null) {
			this.io.setString(this.iA[9]);
		}

	}
}
