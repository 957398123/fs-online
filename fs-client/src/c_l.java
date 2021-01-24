import java.util.Vector;

/**
 * 2020/01/20
 * 
 * @author 95739
 *
 */
public final class c_l {
	public static boolean field_long;
	public static boolean field_for;
	public static boolean field_new;
	private static c_l f = null;
	static c_a4 g = null;
	static a6 field_char = null;
	private static c_a4[] field_byte = new c_a4[0];
	public static c_a4[] field_else = new c_a4[0];
	private byte c = 0;
	private long a = 0L;
	private long b = 0L;
	private static short field_int = 0;
	private static short field_do = 0;
	static int field_try;
	public static byte field_goto = 3;
	public static boolean d;
	private static int field_case;
	public static short field_void = 0;
	public static short field_if;

	public static c_l method_do() {
		if (f == null) {
			f = new c_l();
		}

		return f;
	}

	private c_l() {
	}

	public static void method_if() {
		field_else = field_byte;
		if (g == null || bp.ag().aF()) {
			g = bp.ag();
			field_char.a(g, (short) 0, (byte) -1);
			if (c_br.iZ != null) {
				c_br.iZ = null;
				c_a5.method_try((byte) 0);
			}
		}

		for (int var0 = field_else.length - 1; var0 >= 0; --var0) {
			field_else[var0].method_case();
			field_else[var0].a(-1);
		}

	}

	public static void a(c_a4 var0) {
		if (var0 != null) {
			if (c_b5.method_if(field_byte, var0) == -1) {
				field_byte = c_b5.a(field_byte, var0);
			}

		}
	}

	private static void method_if(int var0) {
		if ((var0 = method_for(var0)) != -1) {
			if (field_byte[var0] == g) {
				g = null;
				if (bp.ag().field_byte == 102) {
					bp.ag().method_do((byte) 0);
				}
			}

			if (field_byte[var0].field_try == 1) {
				c_b var1 = (c_b) field_byte[var0];
				field_byte = c_b5.a(field_byte, var0);
				method_if(var1.W);
			} else {
				field_byte = c_b5.a(field_byte, var0);
			}
		}
	}

	public static void method_if(c_a4 var0) {
		if (var0 != null) {
			int var1;
			if ((var1 = c_b5.method_if(field_byte, var0)) != -1) {
				if (field_byte[var1] == g) {
					g = null;
				}

				field_byte = c_b5.a(field_byte, var1);
			}
		}
	}

	public static void method_for() {
		g = null;
		field_byte = new c_a4[0];
		field_else = new c_a4[0];
	}

	public static c_a4 a(int var0) {
		method_do();
		return (var0 = method_for(var0)) == -1 ? null : field_byte[var0];
	}

	private static int method_for(int var0) {
		for (int var1 = field_byte.length - 1; var1 >= 0; --var1) {
			if (var0 == field_byte[var1].method_new()) {
				return var1;
			}
		}

		return -1;
	}

	public static void method_do(c_a4 var0) {
		if (var0 != null) {
			g = var0;
		}
	}

	public static c_a4 a() {
		return g;
	}

	public final byte[] method_do(int var1) {
		ac var2;
		(var2 = new ac()).method_do(var1);
		switch (var1) {
		case 196612:
			var2.a(bp.ag().c);
			var2.a(bp.ag().field_void);
			break;
		case 196614:
			var2.a(bp.ag().Y());
			var2.method_do(bp.ag().eU);
			bp.ag().method_int((short) 0);
			c_b5.method_case("GOManager-cmd-USE_SKILL=" + bp.ag().eU);
			break;
		case 196621:
			c_b5.method_case("GOManager-cmd-C_PLAYER_REVIVE");
			break;
		case 196626:
			var2.method_do(g.method_new());
			c_b5.method_case("GOManager-cmd-C_PLAYER_DUEL");
			break;
		case 196627:
		case 196628:
			var2.method_do(bp.ag().fS);
			c_b5.method_case("GOManager-cmd-C_ACCEPT_DUEL=" + bp.ag().fS);
			break;
		case 196630:
			var2.method_do(bp.em);
			break;
		case 196632:
			var2.a(c_a5.gn);
			break;
		case 196633:
			b2.a();
			var2.method_if(b2.field_try.method_case());
			break;
		case 196634:
			int[] var5;
			var1 = (var5 = b2.field_try.method_new()).length;
			var2.a((byte) var1);

			for (int var3 = 0; var3 < var1; ++var3) {
				var2.method_do(var5[var3]);
			}

			return var2.method_long();
		case 196635:
			var2.a(c_a5.gK == 0);
			break;
		case 196637:
			var2.a(c_a5.hi);
			break;
		case 196638:
			var2.method_do(field_try);
			break;
		case 196639:
			var2.a(this.c);
			if (this.b < 0L) {
				var2.method_do(120000);
			} else {
				var2.method_do((int) (this.b - this.a));
			}

			++this.c;
			this.a = System.currentTimeMillis();
			this.b = -1L;
			break;
		case 196641:
			c_a5.fR = true;
			var2.a(c_a4.a);
			break;
		case 196642:
			c_a5.fR = true;
			var2.a(field_goto);
			break;
		case 851969:
			c_a5.fR = true;
			c_b5.method_case("Gffffffffffffffffffffff");
			c_b5.method_case("GOManager-cmd-C_PLAYER_NPC_TALK=" + g.method_new());
			var2.method_do(g.method_new());
			c_b5.method_case("NPCID" + g.method_new());
			break;
		case 851974:
			c_a5.fR = true;
			c_b5.method_case("GOManager-cmd-C_PLAYER_NPC_TALK=" + g.method_new());
			var2.method_do(g.method_new());
			break;
		case 851975:
			c_a5.fR = true;
			c_b5.method_case("GOManager-cmd-C_PLAYER_NPC_TALK=" + g.method_new());
			var2.method_do(g.method_new());
			var2.a(c_b5.X);
			break;
		case 851976:
			c_a5.fR = true;
			c_b5.method_case("GOManager-cmd-C_UI_NPC_LOCATION");
			break;
		case 851978:
			var2.method_do(at.field_for);
			break;
		case 851988:
		case 851989:
		case 852018:
		case 852019:
		case 852033:
		case 852034:
		case 852035:
		case 852036:
			if (var1 == 852018) {
				if (c_a5.es != null) {
					c_a5.es = null;
				}

				if (c_a5.ea != null) {
					c_a5.ea.l6.removeAllElements();
					c_a5.ea = null;
					c_a5.method_try((byte) 0);
				}
			}

			var2.a(field_if);
			break;
		case 851992:
			bp.ag().method_if(false);
			bp.ag().ei = 1;
			bp.ag().method_do((byte) 3);
			var2.method_do(g.method_new());
			break;
		case 851993:
		case 852009:
			var2.method_do(g.method_new());
			break;
		case 852000:
			var2.method_do(g.method_new());
			break;
		case 852001:
		case 852005:
			c_a5.fR = true;
			c_z.field_case = false;
			if (field_goto != 3) {
				field_goto = 3;
			}

			c_z.ag = new Vector();
			break;
		case 852003:
			var2.method_do(g.method_new());
			break;
		case 852006:
			c_a5.fR = true;
			d = true;
			break;
		case 852008:
			c_a5.fR = true;
			var2.method_do(g.method_new());
			break;
		case 852016:
		case 852017:
			bp.ag().method_if(false);
			if (var1 == 852016) {
				bp.ag().ei = 2;
			} else if (var1 == 852017) {
				bp.ag().ei = 3;
			}

			bp.ag().method_do((byte) 3);
			break;
		case 852020:
		case 852022:
			c_a5.fR = true;
			break;
		case 852021:
		case 852023:
			c_a5.fR = true;
			var2.a(field_void);
			break;
		case 852071:
			c_a5.fR = true;
			var2.method_do(g.method_new());
			c_b5.method_case("NPCID" + g.method_new());
			break;
		case 852072:
			bp.ag().method_if(false);
			bp.ag().method_do((byte) 3);
			var2.method_do(g.method_new());
		}

		return var2.method_long();
	}

	public final void a(int var1, ac var2) {
		boolean var3 = false;
		byte var4;
		byte var5;
		byte var9;
		c_b var14;
		String[] var16;
		int var17;
		String var18;
		String var21;
		short var22;
		byte var23;
		int var25;
		byte var26;
		byte var27;
		int var29;
		short[][] var34;
		byte var35;
		int var39;
		byte var40;
		bz var42;
		byte var44;
		bz var53;
		bz var57;
		switch (var1) {
		case -2147287039:
			String var56;
			w var58;
			switch (var27 = var2.method_if()) {
			case 1:
				var2.method_if();
				var39 = var2.method_byte();
				var18 = var2.method_goto();
				var21 = var2.method_goto();
				c_b5.method_case("GOManager-ID=" + var39 + "--其他玩家=" + var18 + "--称号=" + var21);
				var5 = var2.method_if();
				var35 = var2.method_if();
				var40 = var2.method_if();
				var44 = var2.method_if();
				short var65 = var2.method_new();
				field_int = var2.method_new();
				field_do = var2.method_new();
				c_b var47;
				(var47 = new c_b(field_int, field_do, var35, var40, var44)).method_int(var2.method_byte());
				var47.method_for(var2.method_byte());
				var47.method_try(var2.method_byte());
				var47.method_byte(var2.method_byte());
				boolean var61 = var2.method_case();
				var47.cH = var2.method_case();
				var47.method_if(var39);
				var47.method_if(var18);
				var47.a(var21);
				var47.method_void(var5);
				var47.method_char(var35);
				var47.method_case(var40);
				var47.b(var44);
				var47.method_if(var65);
				boolean var36;
				if (var61) {
					var47.method_do((byte) 9);
					var36 = false;
					if (var47.ad() == 4) {
						var22 = 3;
					} else {
						var22 = (short) (var47.cL * 3);
					}

					var47.ct = 25;
					var47.dt = (short) (var47.ct + var22);
				}

				var36 = false;

				try {
					var36 = var2.method_case();
				} catch (Exception var13) {
				}

				var47.a(var36);
				if (var36) {
					var16 = null;
					var58 = null;
					short[][] var64 = new short[var5 = var2.method_if()][];
					byte[] var67 = new byte[var5];
					var35 = 0;

					while (true) {
						if (var35 >= var5) {
							var47.a(var67, var64);
							break;
						}

						var67[var35] = var2.method_if();
						var40 = var2.method_if();
						var64[var35] = new short[var40];

						for (var44 = 0; var44 < var40; ++var44) {
							var64[var35][var44] = var2.method_new();
						}

						++var35;
					}
				}

				a(var47);
				c_b5.method_case("---P1.x=" + var47.c + "---P1.y=" + var47.field_void + "---P1.ID=" + var47.field_goto);
				return;
			case 2:
				var23 = var2.method_if();
				c_t var60;
				(var60 = new c_t(var27, var23)).bH = var23;
				var29 = var2.method_byte();
				var56 = var2.method_goto();
				String var66 = var2.method_goto();
				var44 = var2.method_if();
				var26 = var2.method_if();
				var23 = var2.method_if();
				short var46 = var2.method_new();
				field_int = var2.method_new();
				field_do = var2.method_new();
				var60.c = var60.bm = field_int;
				var60.field_void = var60.bi = field_do;
				var60.q = var60.bt = c_z.method_if(var60.field_void, var60.c);
				var60.l = var60.ax = c_z.a(var60.field_void, var60.c);
				var60.method_int(var2.method_byte());
				var60.method_for(var2.method_byte());

				try {
					var60.method_case(var2.method_byte() + 8);
				} catch (Exception var12) {
				}

				var60.method_if(var29);
				var60.method_if(var56);
				var60.a(var66);
				var60.method_void(var44);
				var60.method_char(var26);
				var60.method_case(var23);
				var60.method_if(var46);
				a(var60);
				return;
			case 3:
				var9 = var2.method_if();
				(var58 = new w(var27, var9)).bH = var9;
				var29 = var2.method_byte();
				var21 = var2.method_goto();
				var56 = var2.method_goto();
				var40 = var2.method_if();
				var44 = var2.method_if();
				var9 = var2.method_if();
				var22 = var2.method_new();
				field_int = var2.method_new();
				field_do = var2.method_new();
				var58.c = var58.bm = field_int;
				var58.field_void = var58.bi = field_do;
				var58.q = var58.bt = c_z.method_if(var58.field_void, var58.c);
				var58.l = var58.ax = c_z.a(var58.field_void, var58.c);
				var58.method_int(var2.method_byte());
				var58.method_for(var2.method_byte());
				var27 = var2.method_if();
				var58.method_goto(var27);
				var58.method_if(var29);
				var58.method_if(var21);
				var58.a(var56);
				var58.method_void(var40);
				var58.method_char(var44);
				var58.method_case(var9);
				var58.method_if(var22);
				var58.method_do((byte) 0);
				var58.method_new((byte) 1);
				a(var58);
				return;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 10:
			case 11:
				ag var30 = new ag(var27);
				var23 = var2.method_if();
				var39 = var2.method_byte();
				String var54 = var2.method_goto();
				var30.method_int(var23);
				var30.method_if(var39);
				var30.method_if(var54);
				field_int = var2.method_new();
				field_do = var2.method_new();
				var30.c = field_int;
				var30.field_void = field_do;
				var30.q = c_z.method_if(var30.field_void, var30.c);
				var30.l = c_z.a(var30.field_void, var30.c);
				a(var30);
				if (var27 == 10) {
					c_z.ag.addElement(new Integer(var39));
				}
			case 9:
			default:
				return;
			}
		case -2147287038:
			switch (var27 = var2.method_if()) {
			case 0:
				c_b5.method_case("Wrong Player delete");
				return;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 10:
			case 11:
				var39 = var2.method_byte();
				if (var27 == 10) {
					for (var17 = 0; var17 < c_z.ag.size(); ++var17) {
						if (a(var39) == a((Integer) c_z.ag.elementAt(var17))) {
							c_z.ag.removeElementAt(var17);
						}
					}
				}

				method_do();
				method_if(var39);
			case 9:
			default:
				return;
			}
		case -2147287037:
			var27 = var2.method_if();
			var39 = var2.method_byte();
			var18 = var2.method_goto();
			var23 = var2.method_if();
			field_int = var2.method_new();
			field_do = var2.method_new();
			var29 = var2.method_byte();
			int var52 = var2.method_byte();
			var53 = null;
			if (a(var39) instanceof bz) {
				var53 = (bz) a(var39);
			}

			if (var53 == null) {
				c_b5.method_case("**********NO Player***********=" + var39);
				return;
			}

			var53.method_if(var18);
			var53.method_void(var23);
			var53.method_int(var29);
			var53.method_for(var52);
			var53.method_try(field_int, field_do);
			if (var53.method_case(c_z.method_if(field_do, field_int), c_z.a(field_do, field_int))
					&& var53.method_do() != 9) {
				var53.u();
			}

			if (g == var53) {
				bp.ag().aA();
			}

			switch (var27) {
			case 1:
				int var63 = var2.method_byte();
				var25 = var2.method_byte();
				String var59 = var2.method_goto();
				var53.method_try(var63);
				var53.method_byte(var25);
				var53.a(var59);

				try {
					((c_b) var53).cH = var2.method_case();
				} catch (Exception var11) {
				}

				return;
			case 3:
				var26 = var2.method_if();
				var53.method_goto(var26);
			default:
				return;
			}
		case -2147287036:
			method_for();
			field_int = var2.method_new();
			field_do = var2.method_new();
			bp.ag().c = bp.ag().bm = field_int;
			bp.ag().field_void = bp.ag().bi = field_do;
			bp.ag().q = bp.ag().bt = c_z.method_if(bp.ag().field_void, bp.ag().c);
			bp.ag().l = bp.ag().ax = c_z.a(bp.ag().field_void, bp.ag().c);
			bp.ag().method_do((byte) 0);
			return;
		case -2147287035:
			Object var50 = null;
			var57 = null;
			var25 = var2.method_byte();
			c_b5.method_case("GOManager-cmd-S_UPD_CHANGEEQUIPOBJECT--oit=" + var25);
			c_b var10;
			if ((var10 = (c_b) a(var25)) == null) {
				c_b5.method_case("**********NO Found Player***********");
				return;
			}

			short[][] var62 = new short[var27 = var2.method_if()][];
			byte[] var55 = new byte[var27];

			for (var26 = 0; var26 < var27; ++var26) {
				var2.method_if();
				var55[var26] = var2.method_if();
				if (var55[var26] > 0) {
					var23 = var2.method_if();
					var62[var26] = new short[var23];

					for (var4 = 0; var4 < var23; ++var4) {
						var62[var26][var4] = var2.method_new();
					}
				} else if (var55[var26] < 0) {
					var23 = (byte) bz.aL[Math.abs(var55[var26]) - 1 + var10.K() * (bz.aL.length / 2)].length;
					var62[var26] = new short[var23];

					for (var4 = 0; var4 < var23; ++var4) {
						var62[var26][var4] = bz.aL[Math.abs(var55[var26]) - 1 + var10.K() * (bz.aL.length / 2)][var4];
					}
				} else {
					c_b5.method_case("出错了，不应该有0数值传输！");
				}
			}

			if ((var26 = var2.method_if()) != 4) {
				var10.a(var26, false);
			} else {
				var10.a(var26, true);
			}

			var10.a(var55, var62);
			return;
		case -2147287033:
			var17 = var2.method_byte();
			var1 = var2.method_byte();
			var39 = var2.method_byte();
			var29 = var2.method_byte();
			var35 = var2.method_if();
			var53 = null;
			if (a(var17) instanceof bz) {
				var53 = (bz) a(var17);
			}

			if (var53 == null) {
				c_b5.method_case("**********NO Found hp_change***********");
				return;
			}

			var53.method_int(var1);
			var53.method_for(var39);
			int[] var48 = new int[3];
			if ((var35 & 128) != 0) {
				var48[0] = 1;
			} else {
				var48[0] = 0;
			}

			var48[1] = 0;
			var48[2] = var29;
			var53.a(var48);
			var35 = (byte) (var35 & 127);
			var53.method_else(var35);
			if (var17 == bp.ag().method_new() && var48[2] < 0) {
				bp.ag().method_if(true);
			}

			return;
		case -2147287032:
			if ((var1 = var2.method_byte()) == bp.ag().method_new()) {
				bp.ag().J = bp.ag().A = false;
				if (bp.ag().method_do() != 9) {
					bp.ag().bq = 0;
					bp.ag().a4 = false;
					bp.ag().method_do((byte) 9);
					bp.fq = false;
					return;
				}
			} else {
				bz var32;
				if ((var32 = (bz) a(var1)) != null) {
					var32.J = var32.A = false;
					var32.method_new(var32.method_new());
					if (var32.method_do() != 9) {
						var32.method_do((byte) 9);
						if (g == var32) {
							bp.ag();
							if (bp.el[0] == 0) {
								bp.fq = false;
							}

							if (bp.ag().method_do() != 2) {
								if (bp.ag().method_do() != 9) {
									bp.ag().method_do((byte) 0);
								}

								g = bp.ag();
								field_char.a(g, (short) 0, (byte) -1);
							}
						}
					}

					return;
				}

				c_b5.method_case("**********NO Found dier***********");
			}
			break;
		case -2147287031:
			var2.method_if();
			var2.method_new();
			var2.method_new();
			return;
		case -2147287030:
			var5 = var2.method_if();
			if ((var42 = (bz) a(var2.method_byte())) == null) {
				c_b5.method_case("**********NO Found dier***********");
				return;
			}

			var42.a(var42, (short) var5, (byte) 1, (byte) 2);
			return;
		case -2147287029:
			int var51 = var2.method_byte();
			boolean var45 = var2.method_case();
			if ((var57 = (bz) a(var51)) == null) {
				c_b5.method_case("**********NO Found dier***********");
				return;
			}

			if (var45) {
				var57.method_do((byte) 4);
			} else {
				var57.method_do((byte) 2);
			}

			var57.method_for((byte) 0);
			return;
		case -2147287028:
			var22 = var2.method_new();
			if (bp.ag().r() != 0 && var22 > bp.ag().r()) {
				bp.ag().fK = true;
			}

			bp.ag().method_if(var22);
			bp.ag().method_int(var2.method_byte());
			bp.ag().method_for(var2.method_byte());
			bp.ag().method_try(var2.method_byte());
			bp.ag().method_byte(var2.method_byte());
			bp.ag().a(var2.method_char());
			bp.ag().method_if(var2.method_char());
			bp.ag().n(var2.method_if());
			bp.ag().ep = var2.method_case();
			c_b5.method_case("***GOManager-cmd-S_PLAYER_XP_HP_CHANGE****" + bp.ag().aI());
			return;
		case -2147287026:
			int var8;
			bz var20 = (bz) a(var8 = var2.method_byte());
			c_b5.method_case("S_OBJECT_BUFFCHANGE___OBGID" + var8);
			if (var20 == null) {
				c_b5.method_case("**********NO Found BUFF_change***********");
				return;
			}

			for (var23 = 0; var23 < 12; ++var23) {
				var20.aH[var23] = var2.method_if();
			}

			short var49 = var2.method_new();
			var3 = var2.method_case();
			var20.aB = var2.method_case();
			var20.B = var2.method_case();
			if (var8 == bp.ag().method_new() && (var20.aB || var20.B || var3)) {
				bp.ag().method_if(true);
			}

			var9 = var2.method_if();
			var20.J = var20.A = false;
			var20.method_new(var20.method_new());
			var20.bq = 0;
			var20.a4 = false;

			for (var4 = 0; var4 < var9; ++var4) {
				short var37 = var2.method_new();
				c_b5.method_case("持续特效   speID=" + var37);
				if (var37 != 79 && var37 != 80 && var37 != 81) {
					if (var37 == 13) {
						var20.A = true;
						var20.a(var20, var37, (byte) -2, (byte) 1);
					} else if (var37 != -1 && var37 != -2 && var37 != -3 && var37 != -4) {
						if (var37 == -5) {
							var20.bq = 0;
							var20.a4 = true;
						}
					} else {
						var20.bq = (byte) (-var37);
						var20.a4 = false;
						if (var20.method_do() != 3) {
							var20.method_do((byte) 0);
						}
					}
				} else {
					var20.J = true;
					var20.a(var20, var37, (byte) -2, (byte) 0);
					if (var8 == bp.ag().method_new()) {
						bp.ag().method_if(true);
					}
				}
			}

			if (var49 == 200) {
				var20.aT = 18;
			} else if (var49 == 100) {
				var20.aT = 49;
			} else if (var49 > 100) {
				var20.aT = 58;
			} else if (var49 < 100) {
				var20.aT = 43;
			}

			if (var3) {
				var20.aT = 27;
			}

			if (!var2.method_case()) {
				if (var20.ap != 0) {
					var20.p();
				}

				return;
			}

			byte var38 = 0;
			var23 = var20.ap;
			var20.ap = var2.method_if();
			c_b5.method_case("上、下马走buff命令 horc=" + var20.ap);
			if (var20.ap == 1) {
				if (var23 == 0) {
					var20.al = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 },
							{ 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 },
							{ 607, 608 } };
				} else if (var23 == 1 && var20.W != null) {
					var34 = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 },
							{ 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 },
							{ 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 },
							{ 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
					var20.a$7efcb6ee((byte) 13, var34);
					short[][] var43 = new short[][] { var20.al[0], var20.al[1], var20.al[2], var20.al[3], var20.al[4],
							var20.al[5] };
					var20.al = var43;
				}

				var38 = 6;
				var20.k();
			} else if (var20.ap == 2) {
				if (var20.W == null) {
					if (var23 == 0) {
						var20.al = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 },
								{ 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 },
								{ 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 },
								{ 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
					} else if (var23 == 1) {
						var34 = new short[][] { var20.al[0], var20.al[1], var20.al[2], var20.al[3], var20.al[4],
								var20.al[5], { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 },
								{ 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
						var20.al = var34;
					}
				}

				var38 = 13;
				var20.j();
			}

			var42 = null;
			var34 = new short[var27 = var2.method_if()][];

			for (var40 = 0; var40 < var27; ++var40) {
				var2.method_if();
				var44 = var2.method_if();
				var34[var40] = new short[var44];

				for (var9 = 0; var9 < var44; ++var9) {
					var34[var40][var9] = var2.method_new();
				}
			}

			var20.a$7efcb6ee(var38, var34);
			break;
		case -2147287024:
			var2.method_if();
			var2.method_if();
			var17 = var2.method_byte();
			bp.ag().method_if(var17);
			c_b5.method_case("GOManager-cmd-S_ADD_SHOWPLAYER=" + bp.ag().field_goto);
			var18 = var2.method_goto();
			var21 = var2.method_goto();
			bp.ag().method_if(var18);
			bp.ag().a(var21);
			var23 = var2.method_if();
			bp.ag().method_byte(var23);
			var23 = var2.method_if();
			bp.ag().method_char(var23);
			var23 = var2.method_if();
			bp.ag().method_case(var23);
			var23 = var2.method_if();
			bp.ag().b(var23);
			var1 = var2.method_byte();
			bp.ag().g(var2.method_if());
			bp.ag().method_do(var2.method_goto());
			bp.ag().method_long(var1);
			var1 = var2.method_byte();
			bp.ag().b(var1);
			var23 = var2.method_if();
			bp.ag().i(var23);
			var1 = var2.method_byte();
			c_b5.method_case("kingId" + var1);
			bp.ag().d(var1);
			var23 = var2.method_if();
			c_b5.method_case("kingRight" + var23);
			bp.ag().h(var23);
			bp.ag().method_void((byte) 4);
			field_int = var2.method_new();
			field_do = var2.method_new();
			c_b5.method_case("Player ADD --x=" + field_int + "--y=" + field_do);
			bp.ag().method_int(var2.method_byte());
			bp.ag().method_for(var2.method_byte());
			bp.ag().c = bp.ag().bm = field_int;
			bp.ag().field_void = bp.ag().bi = field_do;
			bp.ag().q = bp.ag().bt = c_z.method_if(bp.ag().field_void, bp.ag().c);
			bp.ag().l = bp.ag().ax = c_z.a(bp.ag().field_void, bp.ag().c);
			bp.ag().W();
			bp.ag().cA = true;
			bp.ag().f(bp.ag().K());
			bp.ag();
			var23 = c_b.a(bp.ag().C(), bp.ag().K());
			bp.ag().d(var23);
			bp.ag().method_do((byte) 0);
			bp.ag().method_new((byte) 1);
			long[] var41 = new long[4];

			for (var27 = 0; var27 < 4; ++var27) {
				var41[var27] = var2.method_char();
			}

			var3 = var2.method_case();
			bp.ag().cH = var2.method_case();
			if (var3) {
				bp.ag().method_do((byte) 9);
				boolean var31 = false;
				short var33;
				if (bp.ag().ad() == 4) {
					var33 = 3;
				} else {
					var33 = (short) (bp.ag().cL * 3);
				}

				bp var10000 = bp.ag();
				bp.ag();
				var10000.ct = 25;
				bp.ag().dt = (short) (bp.ag().ct + var33);
			} else {
				c_as.a6();
			}

			if (c_a5.hQ == 1) {
				c_a5.method_for(var18);
				bp.a(bp.ag().i(), var2);
			}

			bp.ag().a(var41);
			a(bp.ag());
			c_a5.method_do((byte) 5);
			c_a5.B();
			c_a5.dA = 0;
			field_char = new a6(bp.ag(), (short) 0, (byte) -1, (byte) 2);
			c_a5.eQ.a(196637);
			return;
		case -2147287023:
			bp.ag();
			bp.fg[0] = var2.method_byte();
			return;
		case -2147287019:
			if ((var14 = (c_b) a(var2.method_byte())) == null) {
				c_b5.method_case("**********NO Found HORSECART***********");
				return;
			}

			var23 = var2.method_if();
			c_b5.method_case("S_OBJECT_HORSECART***t=" + var23);
			if (var23 == 1) {
				var14.bq = 0;
				var14.a4 = false;
				byte var28 = 0;
				var5 = var14.ap;
				var14.ap = var2.method_if();
				c_b5.method_case("S_OBJECT_HORSECART***horc=" + var14.ap);
				short[][] var24;
				if (var14.ap == 1) {
					if (var5 == 0) {
						var14.al = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 },
								{ 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 },
								{ 607, 608 } };
					} else if (var5 == 1 && var14.W != null) {
						var24 = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 },
								{ 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 },
								{ 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 },
								{ 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
						var14.a$7efcb6ee((byte) 13, var24);
						var34 = new short[][] { var14.al[0], var14.al[1], var14.al[2], var14.al[3], var14.al[4],
								var14.al[5] };
						var14.al = var34;
					}

					var28 = 6;
					var14.k();
				} else if (var14.ap == 2) {
					if (var14.W == null) {
						if (var5 == 0) {
							var14.al = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 },
									{ 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 },
									{ 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 },
									{ 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
						} else if (var5 == 1) {
							var24 = new short[][] { var14.al[0], var14.al[1], var14.al[2], var14.al[3], var14.al[4],
									var14.al[5], { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 },
									{ 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
							var14.al = var24;
						}
					}

					var28 = 13;
					var14.j();
				}

				var16 = null;
				var24 = new short[var27 = var2.method_if()][];

				for (var35 = 0; var35 < var27; ++var35) {
					var2.method_if();
					var5 = var2.method_if();
					var24[var35] = new short[var5];

					for (var40 = 0; var40 < var5; ++var40) {
						var24[var35][var40] = var2.method_new();
					}
				}

				var14.a$7efcb6ee(var28, var24);
				break;
			} else {
				if (var23 == 0) {
					var14.ap = var2.method_if();
					if (var14.al != null) {
						if (var14.ap == 1) {
							var14.ap = 0;
							var14.E();
							var14.al = null;
							break;
						}

						if (var14.ap == 2) {
							var14.ap = 0;
							var14.g();
							var14.al = null;
							break;
						}
					} else {
						var14.ap = 0;
					}
				}

				return;
			}
		case -2147287018:
			bp.ag().eK = false;
			return;
		case -2147287015:
			var21 = var2.method_goto();
			if (b2.field_try == null) {
				b2.field_try = new av();
			}

			b2.field_try.field_try = 0;
			if (var21.length() == 0) {
				b2.a();
				b2.field_try.method_if();
				return;
			}

			b2.field_try.a(var21);
			return;
		case -2147287014:
			c_b5.a(var4 = var2.method_if());

			for (var29 = 0; var29 < var4; ++var29) {
				b2.field_try.a(var2.method_byte(), var2.method_new(), var2.method_goto(), var2.method_if(),
						var2.method_byte());
			}

			b2.field_try.method_goto();
			return;
		case -2147287012:
			var29 = var2.method_byte();
			c_b5.method_case("GOManager-cmd-S_SKILL_CD_OK=" + var29);
			av var19 = b2.field_try;
			bp.ag();
			short var6;
			if ((var6 = bp.method_void(var29)) == -1) {
				c_b5.method_case("GOManager-cmd-S_技能ID没有找到！");
				return;
			}

			bp.ag();
			bp.et[var6] = 0L;
			var19.a((byte) 1, var29, false);
			var19.method_goto();
			return;
		case -2147287009:
			var2.method_if();
			this.b = System.currentTimeMillis();
			return;
		case -2147287005:
			bp.ag().method_char(var2.method_byte());
			return;
		case -2147287004:
			var14 = (c_b) a(var2.method_byte());
			var1 = var2.method_byte();
			if (var14 == null) {
				return;
			}

			var14.method_char(var1);
			break;
		case -2147155967:
			c_a5.h7 = var2.method_int(var2.method_do() - 6);
			c_b5.method_case("********商店，收到UI界面*********");
			return;
		case -2147090433:
			c_a5.h2 = var2.method_int(var2.method_do() - 6);
			c_a5.fR = false;
			c_b5.method_case("********商店，收到UI数据*********");
			return;
		case -2146631679:
			c_b5.method_case("玩家与NPC交谈isWaiting========" + c_a5.fR);
			var5 = var2.method_if();
			c_b5.method_case("GOManager-cmd-S_PLAYER_NPC_TALK");
			c_b5.method_case("fc = " + var5);
			boolean var7 = false;
			int[] var15 = new int[var5];
			var16 = new String[var5];

			for (var25 = 0; var25 < var5; ++var25) {
				var15[var25] = var2.method_byte();
				var7 = true;
				var16[var25] = var2.method_goto();
				c_b5.method_case("*find-＝" + var15[var25] + "--centent=" + var16[var25]);
			}

			c_b5.method_case("haveMapMenu = " + var7);
			if (var7) {
				(c_br.iW = new c_br((byte) 1)).a(var16, var15);
				c_a5.method_try((byte) 5);
				c_a5.fR = false;
				return;
			}

			c_a5.fR = false;
			return;
		case -2146631644:
			if ((field_case = var2.method_byte()) == 0) {
				return;
			}

			(var14 = (c_b) a(field_case)).eb = var2.method_case();
			var14.dp = var2.method_if();
			if (var14.dp == 1) {
				c_z.ad[0] = field_case;
				return;
			}

			if (var14.dp == 2) {
				c_z.ad[1] = field_case;
				return;
			}
			break;
		case -2146631624:
			c_z.field_case = false;
			if (field_goto != 3) {
				field_goto = 3;
			}

			c_z.ag = new Vector();
			if (c_a5.gQ != null) {
				c_as.a8();
				return;
			}
		}

	}
}
