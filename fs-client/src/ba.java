import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/21
 * 
 * @author 95739
 *
 */
public abstract class ba {
	public static boolean q = true;
	protected byte y;
	protected short a;
	protected short field_int;
	protected short k;
	protected short j;
	protected boolean b;
	protected boolean field_char;
	protected c_be field_new;
	private byte g;
	private byte o;
	private byte f;
	private byte u;
	protected short r = -1;
	private boolean h = false;
	protected boolean d = false;
	private c_br s = null;
	public boolean field_byte = false;
	private boolean field_long = false;
	public boolean field_else = true;
	public long n;
	public long m;
	public boolean e = true;
	public boolean field_if = false;

	public ba(short var1, short var2, short var3, short var4, c_be var5) {
		field_new = var5;
		if (q) {
			k = (short) (var1 * c_a5.ic / 176);
			j = (short) (var2 * c_a5.il / 208);
			a = (short) (var3 * c_a5.ic / 176);
			field_int = (short) (var4 * c_a5.il / 208);
		} else {
			k = var1;
			j = var2;
			a = var3;
			field_int = var4;
		}
	}

	public final void a(byte var1, byte var2) {
		switch (var1) {
		case 0:
			g = var2;
			return;
		case 1:
			o = var2;
			return;
		case 2:
			f = var2;
			return;
		case 3:
			u = var2;
		default:
		}
	}

	public final void w() {
		a((byte) 0, (byte) -1);
		a((byte) 1, (byte) -1);
		a((byte) 2, (byte) -1);
		a((byte) 3, (byte) -1);
	}

	public byte method_if(byte var1) {
		switch (var1) {
		case 0:
			return g;
		case 1:
			return o;
		case 2:
			return f;
		case 3:
			return u;
		default:
			return -1;
		}
	}

	private ba a(c_be var1, byte var2) {
		byte var3;
		return (var3 = method_if(var2)) >= 1 && var3 - 1 < var1.cf().size() ? (ba) var1.cf().elementAt(var3 - 1) : null;
	}

	public abstract void a(Graphics var1);

	public final void method_if(Graphics var1) {
		var1.setColor(5450262);
		var1.drawRoundRect(0, 0, 0, 0, 8, 8);
		var1.setColor(16117971);
		var1.fillRoundRect(1, 1, -1, -1, 8, 8);
	}

	protected void f() {
	}

	public static void method_goto() {
		switch (c_a5.es.g9) {
		case 1245185:
			ah var0 = null;
			c_r var1 = null;
			int var2 = 0;

			for (int var3 = c_a5.es.cf().size(); var2 < var3; ++var2) {
				if ((ba) c_a5.es.cf().elementAt(var2) instanceof a7
						&& ((ba) c_a5.es.cf().elementAt(var2)).method_char() == 3
						&& ((ba) c_a5.es.cf().elementAt(var2)).field_char) {
					a7 var4;
					(var4 = (a7) c_a5.es.cf().elementAt(var2)).k((byte) 1);
					a7.fF = var4.bC();
					if ((ba) c_a5.es.cf().elementAt(22) instanceof ah
							&& (var0 = (ah) c_a5.es.cf().elementAt(22)).method_char() == 1) {
						var0.a(var4.bv());
						var0.method_char(c_r.E(var4.bD()));
					}
				}

				if ((ba) c_a5.es.cf().elementAt(23) instanceof c_r && ((ba) c_a5.es.cf().elementAt(23)).r == 6
						&& ((ba) c_a5.es.cf().elementAt(23)).field_char) {
					var1 = (c_r) c_a5.es.cf().elementAt(23);
				}

				if (var1 != null && (ba) c_a5.es.cf().elementAt(22) instanceof ah
						&& (var0 = (ah) c_a5.es.cf().elementAt(22)).method_char() == 1) {
					var0.a(var1.mV[0]);
					if (var1.mQ[var1.ep()] != -1) {
						var0.a(var1.mV[var1.ep()]);
						var0.method_char(c_r.E(var1.ne[var1.ep()]));
					} else {
						var0.a("");
					}
				}
			}
		default:
		}
	}

	public static void method_byte() {
		switch (c_a5.es.g9) {
		case 393230:
			ah var0 = null;
			int var1 = 0;

			for (int var2 = c_a5.es.cf().size(); var1 < var2; ++var1) {
				if ((ba) c_a5.es.cf().elementAt(var1) instanceof a7
						&& ((ba) c_a5.es.cf().elementAt(var1)).method_char() == 3
						&& ((ba) c_a5.es.cf().elementAt(var1)).field_char) {
					a7 var3;
					(var3 = (a7) c_a5.es.cf().elementAt(var1)).k((byte) 2);
					a7.fF = var3.bC();
					(var0 = (ah) c_a5.es.cf().elementAt(4)).a(var3.bv());
					if (var3.bD() == -1) {
						var0.method_char(c_bm.bP);
					} else {
						var0.method_char(c_r.E(var3.bD()));
					}
				}
			}
		default:
		}
	}

	public static void r() {
		switch (c_a5.es.g9) {
		case 458755:
		case 458817:
		case 917505:
		case 917506:
		case 917509:
		case 917510:
		case 917511:
		case 939349:
		case 1966086:
			ah var10000 = (ah) c_a5.es.cf().elementAt(22);
			Object var10001 = null;
			ah var0 = var10000;
			c_ao var1 = (c_ao) c_a5.es.cf().elementAt(1);
			if (c_a5.es.hf instanceof a7 && c_a5.es.hf.method_char() == 3) {
				if (c_a5.es.g9 == 1966086) {
					var1.a("操作", 0);
				}

				a7 var3;
				(var3 = (a7) c_a5.es.hf).k((byte) 0);
				a7.fF = var3.bC();
				var0.a(var3.bv());
				if (var3.bD() != -1) {
					var0.method_char(c_r.E(var3.bD()));
					return;
				} else {
					var0.method_char(c_bm.bP);
				}
			} else if (c_a5.es.hf instanceof c_r) {
				c_r var2 = (c_r) c_a5.es.hf;
				a7.fF = -1;
				var0 = (ah) c_a5.es.cf().elementAt(22);
				if (var2.mQ[var2.ep()] != -1) {
					var0.a(var2.mV[var2.ep()]);
					var0.method_char(c_r.E(var2.ne[var2.ep()]));
					return;
				} else {
					var0.a("");
					if (c_a5.es.g9 == 1966086) {
						var1.a("", 0);
					}
				}
			}
		default:
		}
	}

	public static void method_int() {
		switch (c_a5.es.g9) {
		case 917520:
		case 917521:
		case 917522:
		case 1638431:
		case 1638432:
		case 1638433:
			ah var0 = null;
			var0 = null;
			var0 = null;
			var0 = null;
			int var1 = 0;
			int var2 = 0;

			int var3;
			a7 var4;
			for (var3 = c_a5.es.cf().size(); var2 < var3; ++var2) {
				if ((ba) c_a5.es.cf().elementAt(var2) instanceof a7
						&& ((ba) c_a5.es.cf().elementAt(var2)).method_char() == 3) {
					var4 = (a7) c_a5.es.cf().elementAt(var2);
					var1 += var4.bo();
				}
			}

			var2 = 0;

			for (var3 = c_a5.es.cf().size(); var2 < var3; ++var2) {
				if ((ba) c_a5.es.cf().elementAt(var2) instanceof a7
						&& ((ba) c_a5.es.cf().elementAt(var2)).method_char() == 3
						&& ((ba) c_a5.es.cf().elementAt(var2)).field_char) {
					(var4 = (a7) c_a5.es.cf().elementAt(var2)).k((byte) 0);
					a7.fF = var4.bC();
					if ((var0 = (ah) c_a5.es.cf().elementAt(22)).method_char() == 1) {
						var0.a(var4.bv());
						if (var4.bD() == -1) {
							var0.method_char(c_bm.bP);
						} else {
							var0.method_char(c_r.E(var4.bD()));
						}
					}

					var0 = (ah) c_a5.es.cf().elementAt(25);
					if (var4.bK() != -1) {
						var0.a(var4.bH() + "/" + var4.br());
					} else {
						var0.a("");
					}

					((ah) c_a5.es.cf().elementAt(27)).a(var1 + "");
					var0 = (ah) c_a5.es.cf().elementAt(29);
					if (var4.bK() != -1) {
						var0.a(var4.bo() + "");
					} else {
						var0.a("0");
					}
				}
			}
		default:
		}
	}

	public static void a() {
		switch (c_a5.es.g9) {
		case 1376260:
		case 1376261:
		case 1376265:
		case 1376268:
			ah var0;
			(var0 = (ah) c_a5.es.cf().elementAt(4)).method_void(true);
			var0.method_new((short) (c_a5.ic >> 1));
			(var0 = (ah) c_a5.es.cf().elementAt(16)).method_void(true);
			var0.method_new((short) (c_a5.ic >> 1));
		case 1376262:
		case 1376263:
		case 1376264:
		case 1376266:
		case 1376267:
		default:
		}
	}

	public static void i() {
		switch (c_a5.es.g9) {
		case 1376260:
		case 1376261:
		case 1376265:
		case 1376268:
			ah var0 = (ah) c_a5.es.cf().elementAt(5);
			ah var1 = (ah) c_a5.es.cf().elementAt(17);
			if ((ba) c_a5.es.cf().elementAt(27) instanceof a9) {
				a9 var2;
				(var2 = (a9) c_a5.es.cf().elementAt(27)).method_if((long) c_be.gG);
				c_be.gs = var2.b3();
				if (c_be.hC) {
					c_be.gs = 0;
					c_be.hC = false;
				}

				var2.method_void(Integer.toString(c_be.gs));
			}

			int var5 = 0;

			for (int var3 = c_a5.es.cf().size(); var5 < var3; ++var5) {
				if ((ba) c_a5.es.cf().elementAt(var5) instanceof a7
						&& ((ba) c_a5.es.cf().elementAt(var5)).method_char() == 1
						&& ((ba) c_a5.es.cf().elementAt(var5)).field_char) {
					c_b5.method_case("？！？！？！------------交易图片索引：  " + var5);
					a7 var4;
					if ((var4 = (a7) c_a5.es.cf().elementAt(var5)).r == 34) {
						var0.a(var4.bv());
						c_be.hd = false;
						c_be.hH = (byte) (var5 - 7);
						var0.method_char(c_r.E(var4.bD()));
					} else if (var4.r == 35) {
						var1.a(var4.bv());
						c_be.hd = true;
						c_be.hH = (byte) (var5 - 20);
						var1.method_char(c_r.E(var4.bD()));
					}
				} else if (((ba) c_a5.es.cf().elementAt(var5)).field_char
						&& !((ba) c_a5.es.cf().elementAt(var5) instanceof a7)) {
					var0.a("");
					var1.a("");
				}
			}
		case 1376262:
		case 1376263:
		case 1376264:
		case 1376266:
		case 1376267:
		default:
		}
	}

	public static void j() {
		switch (c_a5.es.g9) {
		case 1769473:
		case 1769474:
		case 1769476:
		case 1769478:
		case 1769479:
		case 1769480:
		case 1769488:
		case 1769489:
		case 1769490:
		case 1769491:
		case 1769492:
			c_r var0 = null;
			ah var1 = null;
			if (((ba) c_a5.es.cf().elementAt(3)).field_char) {
				var0 = (c_r) c_a5.es.cf().elementAt(3);
			} else if (((ba) c_a5.es.cf().elementAt(5)).field_char) {
				var0 = (c_r) c_a5.es.cf().elementAt(5);
			}

			if (var0 != null) {
				(var1 = (ah) c_a5.es.cf().elementAt(4)).a(var0.mV[0]);
				if (var0.mQ[var0.ep()] != -1) {
					var1.a(var0.mV[var0.ep()]);
					var1.method_char(c_r.E(var0.ne[var0.ep()]));
					return;
				} else {
					var1.a("");
				}
			}
		case 1769475:
		case 1769477:
		case 1769481:
		case 1769482:
		case 1769483:
		case 1769484:
		case 1769485:
		case 1769486:
		case 1769487:
		default:
		}
	}

	public static void method_void() {
		switch (c_a5.es.g9) {
		case 983041:
		case 983042:
		case 983043:
		case 983044:
		case 983045:
		case 983046:
		case 983047:
		case 983048:
		case 983049:
		case 983056:
		case 983057:
		case 983058:
			c_r var0 = null;
			ah var1 = null;
			var1 = null;
			var1 = null;
			var1 = (ah) c_a5.es.cf().elementAt(11);
			if ((ba) c_a5.es.cf().elementAt(3) instanceof c_r
					&& (((ba) c_a5.es.cf().elementAt(3)).r == 15 || ((ba) c_a5.es.cf().elementAt(3)).r == 42)
					&& ((ba) c_a5.es.cf().elementAt(3)).field_char) {
				var0 = (c_r) c_a5.es.cf().elementAt(3);
				var1.a(var1.a1[0]);
			} else if ((ba) c_a5.es.cf().elementAt(5) instanceof c_r && ((ba) c_a5.es.cf().elementAt(5)).r == 6
					&& ((ba) c_a5.es.cf().elementAt(5)).field_char) {
				var0 = (c_r) c_a5.es.cf().elementAt(5);
				var1.a(var1.a1[1]);
			}

			if (var0 != null) {
				if ((ba) c_a5.es.cf().elementAt(4) instanceof ah
						&& (var1 = (ah) c_a5.es.cf().elementAt(4)).method_char() == 1) {
					if (var0.mQ[var0.ep()] != -1) {
						var1.a(var0.mV[var0.ep()]);
						var1.method_char(c_r.E(var0.ne[var0.ep()]));
					} else {
						var1.a("");
					}
				}

				if ((ba) c_a5.es.cf().elementAt(10) instanceof ah
						&& (var1 = (ah) c_a5.es.cf().elementAt(10)).method_char() == 4) {
					var1.a(Integer.toString(var0.mN[0]));
					if (var0.mQ[var0.ep()] != -1) {
						var1.a(Integer.toString(var0.mN[var0.ep()]));
					} else {
						var1.a("");
					}
				}

				if ((ba) c_a5.es.cf().elementAt(7) instanceof ah) {
					c_a5.es.cf().elementAt(7);
				}
			}
		case 983050:
		case 983051:
		case 983052:
		case 983053:
		case 983054:
		case 983055:
		default:
		}
	}

	public static void x() {
		switch (c_a5.es.g9) {
		case 1179649:
		case 1179650:
		case 1179651:
		case 1179652:
		case 1179653:
		case 1179654:
		case 1179655:
		case 1179657:
		case 1638423:
			c_r var0 = null;
			ah var1 = null;
			if (((ba) c_a5.es.cf().elementAt(6)).field_char) {
				var0 = (c_r) c_a5.es.cf().elementAt(6);
			} else if (((ba) c_a5.es.cf().elementAt(8)).field_char) {
				var0 = (c_r) c_a5.es.cf().elementAt(8);
			}

			if (var0 != null) {
				var1 = (ah) c_a5.es.cf().elementAt(7);
				if (var0.mQ[var0.ep()] != -1) {
					var1.a(var0.mV[var0.ep()]);
					var1.method_char(c_r.E(var0.ne[var0.ep()]));
					return;
				} else {
					var1.a("");
				}
			}
		default:
		}
	}

	public static void g() {
		if (c_a5.es != null) {
			try {
				j();
				i();
				r();
				method_int();
				method_byte();
				method_goto();
				method_void();
				x();
				c_ao var0 = (c_ao) c_a5.es.cf().elementAt(1);
				ak var1;
				int[] var2;
				a7[] var3;
				int var4;
				ah var9;
				c_r var11;
				ah var12;
				int var13;
				ah var15;
				a7 var16;
				c_r var17;
				ah var18;
				a7 var20;
				c_r var22;
				ah var24;
				label326: switch (c_a5.es.g9) {
				case 917525:
				case 2031621:
				case 2031636:
				case 3342356:
					var12 = (ah) c_a5.es.cf().elementAt(14);
					var20 = (a7) c_a5.es.cf().elementAt(4);
					var16 = (a7) c_a5.es.cf().elementAt(6);
					var22 = (c_r) c_a5.es.cf().elementAt(9);
					if (var22.field_char) {
						if (var22.mQ[var22.ep()] != -1) {
							var0.a("操作", 0);
							var12.a(var22.mV[var22.ep()]);
							var12.method_char(c_r.E(var22.ne[var22.ep()]));
						} else {
							var0.a("", 0);
							var12.a("");
						}
					} else {
						var0.a("操作", 0);
						if (var20.field_char) {
							if (aq.a != -1) {
								var12.a(var22.mV[aq.a]);
								var12.method_char(c_r.E(var22.ne[aq.a]));
							} else {
								var12.method_char(c_bm.bP);
								if (c_a5.es.g9 == 2031636) {
									var12.a("此处放置开封的装备");
								} else if (c_a5.es.g9 == 2031621) {
									var12.a("此处放置原石");
								} else if (c_a5.es.g9 == 3342356) {
									var12.a("此处放置需要铭刻的法宝");
								} else if (c_a5.es.g9 == 917525) {
									var12.a("此处放置需要强化的装备");
								}
							}
						} else if (var16.field_char) {
							if (aq.field_int != -1) {
								var12.a(var22.mV[aq.field_int]);
								var12.method_char(c_r.E(var22.ne[aq.field_int]));
							} else {
								var12.method_char(c_bm.bP);
								if (c_a5.es.g9 == 2031636) {
									var12.a("此处放置开封卷轴");
								} else if (c_a5.es.g9 == 2031621) {
									var12.a("此处放置雕琢符");
								} else if (c_a5.es.g9 == 3342356) {
									var12.a("此处放置法宝铭文");
								} else if (c_a5.es.g9 == 917525) {
									var12.a("此处放置装备强化符");
								}
							}
						}
					}
					break;
				case 1376260:
					a9 var25;
					if ((var25 = (a9) c_a5.es.cf().elementAt(27)).field_char && var25.cc().toString().equals("0")) {
						var0.a("输入", 0);
					} else {
						if (var25.field_char && !var25.cc().toString().equals("0")) {
							var0.a("修改", 0);
							break;
						}

						var0.a("操作", 0);
					}
					break;
				case 1900547:
					a7 var21 = (a7) c_a5.es.cf().elementAt(3);
					a9 var26 = (a9) c_a5.es.cf().elementAt(4);
					ay var27 = (ay) c_a5.es.cf().elementAt(6);
					var22 = (c_r) c_a5.es.cf().elementAt(8);
					if (!var21.field_char && !var26.field_char && !var27.field_char) {
						if (var22.field_char) {
							var0.a("操作", 0);
						}
					} else if (bw.a == 1) {
						var0.a("操作", 0);
					} else if (bw.a == 0) {
						var0.a("", 0);
					}
					break;
				case 1966097:
					var12 = (ah) c_a5.es.cf().elementAt(10);
					var20 = (a7) c_a5.es.cf().elementAt(4);
					var16 = (a7) c_a5.es.cf().elementAt(6);
					if ((var22 = (c_r) c_a5.es.cf().elementAt(7)).field_char) {
						if (var22.mQ[var22.ep()] != -1) {
							var0.a("操作", 0);
							var12.a(var22.mV[var22.ep()]);
							var12.method_char(c_r.E(var22.ne[var22.ep()]));
						} else {
							var0.a("", 0);
							var12.a("");
						}
					} else {
						var0.a("操作", 0);
						if (var20.field_char) {
							if (au.field_int != -1) {
								var12.a(var22.mV[au.field_int]);
								var12.method_char(c_r.E(var22.ne[au.field_int]));
							} else {
								var12.method_char(c_bm.bP);
								var12.a("此处放置装备");
							}
						} else if (var16.field_char) {
							if (au.field_try != -1) {
								var12.a(var22.mV[au.field_try]);
								var12.method_char(c_r.E(var22.ne[au.field_try]));
							} else {
								var12.method_char(c_bm.bP);
								var12.a("此处放置解除符");
							}
						}
					}
					break;
				case 2228225:
					var12 = (ah) c_a5.es.cf().elementAt(14);
					var20 = (a7) c_a5.es.cf().elementAt(4);
					if ((var17 = (c_r) c_a5.es.cf().elementAt(7)).field_char) {
						if (var17.mQ[var17.ep()] != -1) {
							var0.a("操作", 0);
							var12.a(var17.mV[var17.ep()]);
							var12.method_char(c_r.E(var17.ne[var17.ep()]));
						} else {
							var0.a("", 0);
							var12.a("");
						}
					} else {
						var0.a("操作", 0);
						if (var20.field_char) {
							if (aj.field_byte != -1) {
								if (var17.mQ[aj.field_byte] != -1) {
									var12.a(var17.mV[aj.field_byte]);
									var12.method_char(c_r.E(var17.ne[aj.field_byte]));
								} else {
									var12.a(aj.field_try);
									var12.method_char(c_r.E(aj.field_char));
								}
							} else {
								var12.method_char(c_bm.bP);
								var12.a("此处放置原石");
							}
						}
					}
					break;
				case 2228256:
					var12 = (ah) c_a5.es.cf().elementAt(14);
					var20 = (a7) c_a5.es.cf().elementAt(4);
					if ((var17 = (c_r) c_a5.es.cf().elementAt(7)).field_char) {
						if (var17.mQ[var17.ep()] != -1) {
							var0.a("操作", 0);
							var12.a(var17.mV[var17.ep()]);
							var12.method_char(c_r.E(var17.ne[var17.ep()]));
						} else {
							var0.a("", 0);
							var12.a("");
						}
					} else {
						var0.a("操作", 0);
						if (var20.field_char) {
							if (aj.field_byte != -1) {
								if (var17.mQ[aj.field_byte] != -1) {
									var12.a(var17.mV[aj.field_byte]);
									var12.method_char(c_r.E(var17.ne[aj.field_byte]));
								} else {
									var12.a(aj.field_try);
									var12.method_char(c_r.E(aj.field_char));
								}
							} else {
								var12.method_char(c_bm.bP);
								var12.a("此处放置宝石");
							}
						}
					}
					break;
				case 2424833:
					var12 = (ah) c_a5.es.cf().elementAt(3);
					var15 = (ah) c_a5.es.cf().elementAt(4);
					var18 = (ah) c_a5.es.cf().elementAt(5);
					var24 = (ah) c_a5.es.cf().elementAt(6);
					var9 = (ah) c_a5.es.cf().elementAt(7);
					ah var23 = (ah) c_a5.es.cf().elementAt(9);
					ak var28 = (ak) c_a5.es.cf().elementAt(8);
					if (var12.field_char) {
						var28.method_if(bo.n[0]);
					} else if (var15.field_char) {
						var28.method_if(bo.n[1]);
					} else if (var18.field_char) {
						var28.method_if(bo.n[2]);
					} else if (var24.field_char) {
						var28.method_if(bo.n[3]);
					} else if (var9.field_char) {
						var28.method_if(bo.n[4]);
					} else if (var23.field_char) {
						var28.method_if(bo.n[5]);
					}
					break;
				case 2424840:
					var12 = (ah) c_a5.es.cf().elementAt(3);
					var15 = (ah) c_a5.es.cf().elementAt(4);
					ak var19 = (ak) c_a5.es.cf().elementAt(5);
					if (var12.field_char) {
						var19.method_if(bo.n[0]);
					} else if (var15.field_char) {
						var19.method_if(bo.n[1]);
					}
					break;
				case 2555905:
					var12 = (ah) c_a5.es.cf().elementAt(3);
					var15 = (ah) c_a5.es.cf().elementAt(4);
					var18 = (ah) c_a5.es.cf().elementAt(6);
					var24 = (ah) c_a5.es.cf().elementAt(10);
					var9 = (ah) c_a5.es.cf().elementAt(8);

					int var5;
					a7 var6;
					for (var5 = 0; var5 < 12; ++var5) {
						if ((var6 = (a7) c_a5.es.cf().elementAt(var5 + 11)).field_char && var6.bN() != 0) {
							var12.a(var6.bn());
							var15.a(var6.bY());
							var18.method_case(var6.bz());
							var24.a(var6.by());
							if (var6.bJ() == -1) {
								var9.a(az.i[0]);
							} else if (var6.bJ() == 0) {
								var9.a(az.i[1]);
							} else if (var6.bJ() >= 1 && var6.bJ() <= 30) {
								var9.a(az.i[2]);
							} else if (var6.bJ() >= 31 && var6.bJ() <= 70) {
								var9.a(az.i[3]);
							} else if (var6.bJ() >= 71 && var6.bJ() <= 100) {
								var9.a(az.i[4]);
							}
						}
					}

					var5 = 0;

					while (true) {
						if (var5 >= 6) {
							break label326;
						}

						if ((var6 = (a7) c_a5.es.cf().elementAt(var5 + 25)).field_char && var6.bN() != 0) {
							var12.a(var6.bn());
							var15.a(var6.bY());
							var18.method_case(var6.bz());
							var24.a(var6.by());
							if (var6.bJ() == -1) {
								var9.a(az.i[0]);
							} else if (var6.bJ() == 0) {
								var9.a(az.i[1]);
							} else if (var6.bJ() >= 1 && var6.bJ() <= 30) {
								var9.a(az.i[2]);
							} else if (var6.bJ() >= 31 && var6.bJ() <= 70) {
								var9.a(az.i[3]);
							} else if (var6.bJ() >= 71 && var6.bJ() <= 100) {
								var9.a(az.i[4]);
							}
						}

						++var5;
					}
				case 2555906:
					var12 = (ah) c_a5.es.cf().elementAt(10);

					for (var13 = 0; var13 < 3; ++var13) {
						if (((a7) c_a5.es.cf().elementAt(var13 + 11)).field_char) {
							var12.a(az.field_byte[var13]);
						}
					}

					if (((ak) c_a5.es.cf().elementAt(15)).field_char) {
						if (az.h == 0) {
							var0.a("编辑", 0);
						} else {
							var0.a("", 0);
						}
					} else if (az.h == 0) {
						var0.a("操作", 0);
					} else {
						var0.a("查看", 0);
					}
					break;
				case 2555907:
				case 2555915:
					if (!(var11 = (c_r) c_a5.es.cf().elementAt(3)).mV[var11.mz].equals("")
							&& var11.mV[var11.mz] != null) {
						var0.a("操作", 0);
						break;
					}

					var0.a("", 0);
					break;
				case 2555908:
				case 2555957:
					var12 = (ah) c_a5.es.cf().elementAt(4);
					var15 = (ah) c_a5.es.cf().elementAt(7);
					var17 = (c_r) c_a5.es.cf().elementAt(3);
					var22 = (c_r) c_a5.es.cf().elementAt(5);
					if (var17.field_char) {
						var12.a(var17.mV[var17.ep()]);
						var12.method_char(c_r.E(var17.ne[var17.ep()]));
						var15.method_case(az.a[var17.ep()]);
						if (!var17.mV[var17.mz].equals("") && var17.mV[var17.mz] != null) {
							var0.a("操作", 0);
							break;
						}

						var0.a("", 0);
					} else {
						if (!var22.field_char) {
							break;
						}

						var12.a(var22.mV[var22.ep()]);
						var12.method_char(c_r.E(var22.ne[var22.ep()]));
						if (!var22.mV[var22.mz].equals("") && var22.mV[var22.mz] != null) {
							var15.method_case(var22.mN[var22.ep()]);
							var0.a("操作", 0);
							break;
						}

						var15.method_case(0);
						var0.a("", 0);
					}
					break;
				case 2555911:
					if ((var11 = (c_r) c_a5.es.cf().elementAt(10)).mQ[var11.mz] != -1) {
						var0.a("操作", 0);
					} else {
						var0.a("整理", 0);
					}

					var13 = 0;

					while (true) {
						if (var13 >= 10) {
							break label326;
						}

						if ((var16 = (a7) c_a5.es.cf().elementAt(var13 + 3)).field_char) {
							var16.a(false, c_a5.es);
							var11.a(true, c_a5.es);
						}

						var13 += 2;
					}
				case 2555936:
					if (((ba) c_a5.es.cf().elementAt(3)).r == 164) {
						if (!(var11 = (c_r) c_a5.es.cf().elementAt(3)).mV[var11.mz].equals("")
								&& var11.mV[var11.mz] != null) {
							var0.a("操作", 0);
							break;
						}

						var0.a("", 0);
					} else {
						if (((ba) c_a5.es.cf().elementAt(3)).r != 167) {
							break;
						}

						if (!(var11 = (c_r) c_a5.es.cf().elementAt(3)).mV[var11.mz].equals("")
								&& var11.mV[var11.mz] != null) {
							var0.a("操作", 0);
							break;
						}

						var0.a("", 0);
					}
					break;
				case 3145730:
					ay var10 = (ay) c_a5.es.cf().elementAt(13);
					var3 = new a7[(var2 = new int[] { 3, 4, 5, 6, 7, 8, 9, 10 }).length];

					for (var4 = 0; var4 < var2.length; ++var4) {
						var3[var4] = (a7) c_a5.es.cf().elementAt(var2[var4]);
						if (var3[var4].field_char) {
							aa.field_case = (byte) var4;
						}
					}

					if (var10.field_char) {
						var0.a("确定", 0);
					} else {
						var0.a("操作", 0);
					}
					break;
				case 3145731:
					var1 = (ak) c_a5.es.cf().elementAt(13);
					ay[] var14 = new ay[(var2 = new int[] { 4, 6, 10, 12 }).length];
					var4 = 0;

					while (true) {
						if (var4 >= var2.length) {
							break label326;
						}

						var14[var4] = (ay) c_a5.es.cf().elementAt(var2[var4]);
						if (var14[var4].field_char) {
							var1.method_if(aa.a[var4]);
						}

						++var4;
					}
				case 3342340:
					var1 = (ak) c_a5.es.cf().elementAt(13);
					var3 = new a7[(var2 = new int[] { 3, 5, 7, 9, 11 }).length];

					for (var4 = 0; var4 < var2.length; ++var4) {
						var3[var4] = (a7) c_a5.es.cf().elementAt(var2[var4]);
						if (var3[var4].field_char) {
							var1.method_if(am.field_case[var4]);
						}
					}
				}

				if (c_a5.method_else() == 18) {
					c_be.cu();
				}

				return;
			} catch (Exception var8) {
			}
		}

	}

	private static void a(ba var0) {
		if (c_a5.method_else() == 11) {
			if (var0 instanceof ay) {
				ay var2;
				if (!(var2 = (ay) var0).field_char) {
					c_ad.method_new();
					return;
				}

				if (var2.bm() == 0) {
					c_ad.a("使用天劫|封神|梦天通行证均可登录");
				} else {
					if (var2.bm() != 1) {
						return;
					}

					c_ad.a("使用Kong.net账号登录");
				}
			} else {
				c_ad.method_new();
			}
		}

	}

	public final void a(c_be var1) {
		if (field_char && c_a5.es != null && !field_byte) {
			c_ao var4;
			c_bv var11;
			ay var12;
			int var13;
			a7 var18;
			if (c_a5.gZ && c_a5.method_byte(268435456)) {
				if (c_a5.es.g9 != 1703937 && c_a5.es.g9 != 1703952 && c_a5.es.g9 != 1703938) {
					if (c_a5.es.g9 == 852020) {
						c_m var3 = (c_m) (var11 = (c_bv) c_a5.es.cf().elementAt(2)).dt().elementAt(var11.la);
						var4 = (c_ao) c_a5.es.cf().elementAt(1);
						if (var3.field_else == 4125) {
							var4.a("", 0);
						} else {
							var4.a("操作", 0);
						}
					} else if (c_a5.es.g9 == 3145730) {
						var12 = (ay) c_a5.es.cf().elementAt(13);

						for (var13 = 0; var13 < aa.field_try.length; ++var13) {
							if (!(var18 = (a7) c_a5.es.cf().elementAt(var13 + 3)).field_char && var12.field_char) {
								if (c_a5.a(var18.k, var18.j, var18.a, var18.field_int)) {
									var18.a(true, c_a5.es);
								}
							} else if (!var12.field_char && var18.field_char
									&& c_a5.a(var12.k, var12.j, var12.a, var12.field_int)) {
								var18.a(false, c_a5.es);
								var12.a(true, c_a5.es);
								var12.b();
							}
						}
					}
				} else {
					for (int var2 = 0; var2 < 6; ++var2) {
						if (((a7) c_a5.es.cf().elementAt(var2 + 7)).field_char) {
							c_a5.em = (byte) var2;
						}
					}
				}
			}

			ay var7;
			c_ao var9;
			ba var16;
			c_ao var17;
			a7 var20;
			ak var21;
			a9 var22;
			a9 var25;
			if (c_a5.method_try(4096)) {
				if (this instanceof ak) {
					if ((var21 = (ak) this).ar() > 0) {
						return;
					}
				} else if (this instanceof c_bg) {
					c_bg var23;
					if ((var23 = (c_bg) this).cJ() > 0 || !var23.h5) {
						return;
					}
				} else if (this instanceof c_bv) {
					if ((var11 = (c_bv) this).dw() > 0 || !var11.kl) {
						return;
					}
				} else if (this instanceof ay && (y == 0 || y == 2) && !((ay) this).bl()) {
					if (!(var12 = (ay) this).ec) {
						return;
					}
				} else if (c_a5.es.g9 == 2097155 && ((ah) c_a5.es.cf().elementAt(32)).aj().equals("结算")) {
					return;
				}

				if ((var16 = method_if(c_a5.es, (byte) 0)) != null) {
					a(false, var1);
					if (c_a5.method_else() == 17) {
						var16.a(false, var1);
					} else {
						var16.a(true, var1);
					}

					a(var16);
					if (c_a5.es.g9 == 2097155) {
						var17 = (c_ao) c_a5.es.cf().elementAt(1);
						if (var16 instanceof a9) {
							var17.a("", 0);
						}
					} else if (c_a5.method_else() == 18) {
						var17 = (c_ao) c_a5.es.cf().elementAt(1);
						ay var24 = (ay) c_a5.es.cf().elementAt(7);
						var7 = (ay) c_a5.es.cf().elementAt(8);
						if (var24.field_char) {
							var17.a("", 0);
						} else {
							var17.a("介绍", 0);
						}

						if (var7.field_char) {
							var7.a = var7.bg();
						}
					} else if (c_a5.method_else() == 17 && var16 instanceof a7) {
						for (var13 = 0; var13 < c_a5.iC.length; ++var13) {
							c_a5.iC[var13] = (a7) c_a5.es.cf().elementAt(var13 + 3);
							if (var13 == c_a5.hg) {
								c_a5.iC[var13].a(true, c_a5.es);
							} else {
								c_a5.iC[var13].a(false, c_a5.es);
							}
						}
					} else if (c_a5.method_else() != 11 && c_a5.es.g9 != 2297615) {
						if (c_a5.es.g9 == 2555905) {
							var20 = (a7) c_a5.es.cf().elementAt(11);
							if (var16 instanceof a7 && (var18 = (a7) var16).bN() == 0) {
								a(false, var1);
								var16.a(false, var1);
								var20.a(true, var1);
							}
						} else if (c_a5.es.g9 == 3145730) {
							var20 = (a7) c_a5.es.cf().elementAt(aa.field_case + 3);
							var16.a(false, var1);
							var20.a(true, var1);
						}
					} else {
						var25 = (a9) c_a5.es.cf().elementAt(4);
						var22 = (a9) c_a5.es.cf().elementAt(5);
						var9 = (c_ao) c_a5.es.cf().elementAt(1);
						if (!var25.field_char && !var22.field_char) {
							var9.a("确定", 0);
						} else if (!var25.cc().toString().equals("") && var25.cc().toString() != null
								&& !var22.cc().toString().equals("") && var22.cc().toString() != null) {
							if (c_a5.method_else() == 11) {
								var9.a("登录", 0);
							} else {
								var9.a("确定", 0);
							}
						} else {
							var9.a("输入", 0);
						}
					}
				}

				if (c_a5.method_else() == 18 && --c_a5.gx < 0) {
					c_a5.gx = 0;
				}

			} else {
				ah var14;
				ah var19;
				if (c_a5.method_try(8192)) {
					if (this instanceof ak) {
						if ((var21 = (ak) this).ar() < var21.ax() - var21.ao()) {
							return;
						}
					} else if (this instanceof ay && (y == 0 || y == 2) && !((ay) this).bl()) {
						if (!(var12 = (ay) this).eg) {
							return;
						}
					} else if (c_a5.method_else() == 17) {
						var14 = (ah) c_a5.es.cf().elementAt(16);
						if (c_a5.iC[c_a5.hg].eo == null) {
							return;
						}

						if (var14.aj().equals("三天后可以删除")) {
							return;
						}
					}

					if ((var16 = method_if(c_a5.es, (byte) 1)) != null) {
						a(false, var1);
						var16.a(true, var1);
						a(var16);
						if (c_a5.es.g9 == 2097155) {
							var19 = (ah) c_a5.es.cf().elementAt(32);
							var4 = (c_ao) c_a5.es.cf().elementAt(1);
							if (var19.aj().equals("开局")) {
								var4.a("开局", 0);
							}
						} else if (c_a5.method_else() == 17) {
							var17 = (c_ao) c_a5.es.cf().elementAt(1);
							if (c_a5.g3[c_a5.hg]) {
								var17.a("修改", 0);
							} else {
								var17.a("确定", 0);
							}
						} else if (c_a5.method_else() == 18) {
							var17 = (c_ao) c_a5.es.cf().elementAt(1);
							var22 = (a9) c_a5.es.cf().elementAt(9);
							var7 = (ay) c_a5.es.cf().elementAt(7);
							ay var8 = (ay) c_a5.es.cf().elementAt(8);
							if (!var22.field_char || var22.cc().toString().trim() != null
									&& !var22.cc().toString().trim().equals("")) {
								if (var22.field_char && var22.cc().toString().trim() != null
										&& !var22.cc().toString().trim().equals("")) {
									var17.a("修改", 0);
								} else if (var7.field_char) {
									var17.a("", 0);
								} else {
									var17.a("介绍", 0);
								}
							} else {
								var17.a("输入", 0);
							}

							if (var8.field_char) {
								var8.a = var8.bg();
							}
						} else if (c_a5.method_else() != 11 && c_a5.es.g9 != 2297615) {
							if (c_a5.es.g9 == 2555905) {
								var19 = (ah) c_a5.es.cf().elementAt(35);
								var18 = (a7) c_a5.es.cf().elementAt(25);
								a7 var10;
								if (var16 instanceof a7 && (var10 = (a7) var16).bN() == 0) {
									var16.a(false, var1);
									if (var18.bN() == 0) {
										var19.a(true, var1);
									} else {
										var18.a(true, var1);
									}
								}
							}
						} else {
							var25 = (a9) c_a5.es.cf().elementAt(4);
							var22 = (a9) c_a5.es.cf().elementAt(5);
							var9 = (c_ao) c_a5.es.cf().elementAt(1);
							if (!var25.field_char && !var22.field_char) {
								var9.a("确定", 0);
							} else if (!var25.cc().toString().equals("") && var25.cc().toString() != null
									&& !var22.cc().toString().equals("") && var22.cc().toString() != null) {
								if (c_a5.method_else() == 11) {
									var9.a("登录", 0);
								} else {
									var9.a("确定", 0);
								}
							} else {
								var9.a("输入", 0);
							}
						}
					}

					if (c_a5.method_else() == 18 && ++c_a5.gx > 4) {
						c_a5.gx = 4;
					}

				} else {
					ah var6;
					if (c_a5.method_try(16384)) {
						if (c_a5.es.g9 == 2097155 && (var14 = (ah) c_a5.es.cf().elementAt(32)).aj().equals("开局")
								&& var14.field_char) {
							return;
						}

						if ((var16 = method_if(c_a5.es, (byte) 2)) == null) {
							return;
						}

						a(false, var1);
						var16.a(true, var1);
						a(var16);
						if (c_a5.es.g9 != 1703937 && c_a5.es.g9 != 1703952 && c_a5.es.g9 != 1703938) {
							if (c_a5.es.g9 != 2097155) {
								if (c_a5.es.g9 == 2555905) {
									if (az.h == 1 && this instanceof ah) {
										var19 = (ah) c_a5.es.cf().elementAt(35);
										a(false, var1);
										var16.a(false, var1);
										var19.a(true, var1);
									}

									if (var16 instanceof a7 && (var20 = (a7) var16).bN() == 0) {
										a(true, var1);
										var16.a(false, var1);
										return;
									}
								}

								return;
							}

							var17 = (c_ao) c_a5.es.cf().elementAt(1);
							var18 = (a7) c_a5.es.cf().elementAt(31);
							var6 = (ah) c_a5.es.cf().elementAt(32);
							if (var18.field_char && var6.aj().equals("结算")) {
								var17.a("开始", 0);
								return;
							}

							if (var6.aj().equals("结算") && var6.field_char) {
								var17.a("结算", 0);
							}
						} else {
							for (var13 = 0; var13 < 6; ++var13) {
								if (((a7) c_a5.es.cf().elementAt(var13 + 7)).field_char && --c_a5.em < 0) {
									c_a5.em = 0;
								}
							}
						}
					} else if (c_a5.method_try(32768)) {
						if (c_a5.es.g9 == 2097155) {
							if ((var14 = (ah) c_a5.es.cf().elementAt(32)).aj().equals("开局") && var14.field_char) {
								return;
							}
						} else {
							a7 var15;
							if (c_a5.es.g9 == 2555905 && this instanceof a7 && (var15 = (a7) this).bN() == 0) {
								return;
							}
						}

						if ((var16 = method_if(c_a5.es, (byte) 3)) != null) {
							a(false, var1);
							var16.a(true, var1);
							a(var16);
							if (c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703952 || c_a5.es.g9 == 1703938) {
								for (var13 = 0; var13 < 6; ++var13) {
									if (((a7) c_a5.es.cf().elementAt(var13 + 7)).field_char && ++c_a5.em > 5) {
										c_a5.em = 5;
									}
								}

								return;
							}

							if (c_a5.es.g9 == 2097155) {
								var17 = (c_ao) c_a5.es.cf().elementAt(1);
								var18 = (a7) c_a5.es.cf().elementAt(33);
								var6 = (ah) c_a5.es.cf().elementAt(32);
								if (!var18.field_char) {
									if (var6.aj().equals("结算") && var6.field_char) {
										var17.a("结算", 0);
									}

									return;
								}

								var17.a("开始", 0);
							} else if (c_a5.es.g9 == 2555905) {
								if (az.h == 1 && this instanceof ah) {
									var19 = (ah) c_a5.es.cf().elementAt(37);
									a(false, var1);
									var16.a(false, var1);
									var19.a(true, var1);
								}

								if (var16 instanceof a7 && (var20 = (a7) var16).bN() == 0) {
									a(true, var1);
									var16.a(false, var1);
								}
							}
						}
					}

				}
			}
		}
	}

	public final void e() {
		field_else = true;
		e = true;
		field_if = false;
		n = m = 0L;
	}

	public final boolean k() {
		if (field_char) {
			return true;
		} else {
			for (byte var1 = 0; var1 <= 3; ++var1) {
				if (a(c_a5.es, var1) != null) {
					return true;
				}
			}

			return false;
		}
	}

	public final ba method_if(c_be var1, byte var2) {
		ba var3 = this;

		while ((var3 = var3.a(var1, var2)) != null) {
			if (var3.b) {
				return var3;
			}
		}

		return this;
	}

	public final boolean u() {
		return b;
	}

	public final void method_for(boolean var1) {
		b = var1;
	}

	public final short z() {
		return field_int;
	}

	public void a(short var1) {
		field_int = var1;
	}

	public final boolean q() {
		return field_char;
	}

	public void a(boolean var1, c_be var2) {
		field_char = var1;
		if (var1 && var2 != null) {
			var2.hf = this;
			switch (c_a5.method_else()) {
			case 17:
				ah var4 = (ah) c_a5.es.cf().elementAt(16);
				c_ao var5 = (c_ao) c_a5.es.cf().elementAt(1);
				int var6 = 0;

				for (; var6 < c_a5.iC.length; ++var6) {
					c_a5.iC[var6] = (a7) c_a5.es.cf().elementAt(var6 + 3);
					if (c_a5.iC[var6].field_char) {
						c_a5.hg = (byte) var6;
					}
				}

				if (c_a5.iC[c_a5.hg].eo == null) {
					var5.a("创建", 0);

					for (var6 = 0; var6 < c_a5.iD.length; ++var6) {
						c_a5.iD[var6] = (ah) c_a5.es.cf().elementAt(var6 + 11);
						c_a5.iD[var6].a("");
					}
				} else {
					var5.a("确定", 0);
					c_a5.method_if((byte) 11);
				}

				for (var6 = 0; var6 < c_a5.iC.length; ++var6) {
					c_a5.iC[var6] = (a7) c_a5.es.cf().elementAt(var6 + 3);
					if (c_a5.iC[var6].eo != null) {
						if (var6 == c_a5.hg) {
							c_a5.iC[var6].eo.method_do((byte) 1);
						} else {
							c_a5.iC[var6].eo.method_do((byte) 0);
						}
					}
				}

				if (c_a5.iC[c_a5.hg].eo != null && c_a5.hV[c_a5.hg] == 1) {
					var4.a("三天后可以删除");
					var4.method_new((short) (c_a5.ic - var4.a >> 1));
				} else if (c_a5.iC[c_a5.hg].eo != null && c_a5.hV[c_a5.hg] == 2) {
					var4.a("删除角色且不可恢复");
					var4.method_new((short) (c_a5.ic - var4.a >> 1));
				} else if (c_a5.iC[c_a5.hg].eo == null || c_a5.iC[c_a5.hg].eo != null && c_a5.hV[c_a5.hg] == 0) {
					if (c_a5.g3[c_a5.hg]) {
						var4.a("修改昵称");
						var4.method_new((short) (c_a5.ic - var4.a >> 1));
					} else {
						var4.a("删除角色");
						var4.method_new((short) (c_a5.ic - var4.a >> 1));
					}
				}
			}

			if (c_a5.es != null) {
				switch (c_a5.es.g9) {
				case 458760:
				case 2555911:
					c_r.d6();
				}
			}

			g();
		}

	}

	public final short v() {
		return k;
	}

	public boolean b() {
		return false;
	}

	public void method_new(short var1) {
		k = var1;
	}

	public final short method_long() {
		return j;
	}

	public void method_for(short var1) {
		j = var1;
	}

	public final void a(int var1) {
		method_new((short) (k + var1));
	}

	public final void method_for(int var1) {
		method_for((short) (j + var1));
	}

	public final void method_do(int var1) {
		a((short) (field_int + var1));
	}

	public final short method_for() {
		return a;
	}

	public void method_do(short var1) {
		a = var1;
	}

	public byte method_char() {
		return y;
	}

	public void a(byte var1) {
		y = var1;
	}

	public final boolean o() {
		return h;
	}

	public final void a(boolean var1) {
		h = var1;
	}

	public final void method_if(boolean var1) {
		d = var1;
	}

	public final c_br y() {
		return s;
	}

	public final void a(c_br var1) {
		s = var1;
	}

	public final short p() {
		return r;
	}

	public final void method_int(short var1) {
		r = var1;
	}

	public final c_be c() {
		return field_new;
	}

	public final void m() {
		n = System.currentTimeMillis();
	}

	public final boolean method_if() {
		return false;
	}
}
