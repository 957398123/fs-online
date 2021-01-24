import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2021/01/23
 * @author 95739
 *
 */
public final class c_bu {
	public static byte q = 0;
	public static int g = 0;
	public static boolean c = true;
	public static byte e = 0;
	public static int k = -1;
	public static int h = -1;
	public static int f = -1;
	public static c_b[] n;
	private static int field_new;
	private static int field_for;
	private static int b;
	private static int field_if;
	private static int a;
	public static byte d = 0;
	private Image m = null;

	public c_bu() {
		this.m = Image.createImage(48, 14);
		Graphics var1;
		c_b5.a(var1 = this.m.getGraphics(), 0, 0, this.m.getWidth(), this.m.getHeight(), 0);
		c_b5.method_if(var1, 0, 0, this.m.getHeight(), this.m.getHeight(), c_bm.dw);
		c_a5.cG.method_if(var1, this.m.getHeight(), 0, 10);
		c_a5.cG.method_if(var1, this.m.getHeight() + c_a5.cG.field_try - 1, 0, 11);
		int var2 = this.m.getHeight() + (c_a5.cG.field_try << 1) - 2;
		int var3 = this.m.getWidth() - var2;
		int var4 = this.m.getHeight() >> 1;
		c_b5.method_if(var1, var2, 0, var3, var4, c_bm.aR);
		c_b5.method_if(var1, var2 + 1, 1, var3 - 2, var4 - 2, c_bm.aP);
		c_b5.method_if(var1, var2, var4, var3, var4, c_bm.aR);
		c_b5.method_if(var1, var2 + 1, var4 + 1, var3 - 2, var4 - 2, c_bm.aP);
		field_new = var2 + 2;
		field_for = 2;
		b = var4 + 2;
		field_if = var3 - 4;
		a = var4 - 4;
	}

	public static void method_if() {
		e = 0;
		k = -1;
		h = -1;
		f = -1;
		n = null;
	}

	public static int method_do() {
		return n != null && n.length > 0 ? n[0].method_new() : 0;
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 720897:
			var1.method_do(k);
			break;
		case 720898:
		case 720909:
			var1.method_do(h);
		case 720899:
		case 720900:
		case 720908:
		case 720919:
		default:
			break;
		case 720901:
		case 720902:
			var1.method_do(k);
			c_a5.fR = true;
			break;
		case 720903:
			var1.a(q);
			break;
		case 720904:
		case 720905:
		case 720906:
		case 720907:
			c_a5.fR = true;
			break;
		case 720910:
			c_a5.fR = true;
			break;
		case 720911:
		case 720912:
			var1.method_do(g);
			break;
		case 720913:
		case 720915:
		case 720916:
			c_a5.fR = true;
			var1.method_do(g);
			break;
		case 720914:
			var1.method_do(bp.em);
			break;
		case 720917:
			c_b5.method_case("CommandList.C_TEAM_EQUIP_VIEW_HEADER" + g);
			var1.method_do(g);
			break;
		case 720918:
			var1.method_do(g);
			var1.a(c_bv.kq);
			break;
		case 720920:
			c_a5.fR = true;
			break;
		case 720921:
			if (d == 0) {
				var1.method_do(4122);
			} else if (d == 1) {
				var1.method_do(4123);
			} else if (d == 2) {
				var1.method_do(4124);
			}
		}

		c_b5.a(var1.field_do.length);
		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		int var2;
		switch (var0) {
		case -2146762751:
			c_a5.A();
			return;
		case -2146762750:
			e = var1.method_if();
			c_b5.method_case("teamState" + e);
			n = new c_b[var1.method_if() - 1];
			c_b5.method_case("teamMates.length" + n.length);
			h = var1.method_byte();

			for (var2 = 0; var2 < n.length; ++var2) {
				n[var2] = new c_b();
				n[var2].e = var1.method_goto();
				n[var2].field_goto = var1.method_byte();
				n[var2].aq = var1.method_if();
				n[var2].aO = var1.method_new();
				n[var2].a2 = var1.method_byte();
				n[var2].L = var1.method_byte();
				n[var2].bg = var1.method_byte();
				n[var2].ad = var1.method_byte();
				n[var2].method_do(var1.method_new());
				n[var2].c = var1.method_new();
				n[var2].field_void = var1.method_new();

				for (byte var5 = 0; var5 < 12; ++var5) {
					n[var2].aH[var5] = var1.method_if();
				}
			}

			return;
		case -2146762749:
			n = null;
			e = 0;
			if (d != 0) {
				d = 0;
				return;
			}
			break;
		case -2146762748:
		case -2146762747:
		case -2146762746:
		case -2146762745:
		case -2146762740:
			var2 = var1.method_byte();

			for (int var3 = 0; var3 < n.length; ++var3) {
				if (n[var3].method_new() == var2) {
					switch (var0) {
					case -2146762748:
						n[var3].aO = var1.method_new();
						n[var3].a2 = var1.method_byte();
						n[var3].L = var1.method_byte();
						n[var3].bg = var1.method_byte();
						n[var3].ad = var1.method_byte();
						return;
					case -2146762747:
						n[var3].a2 = var1.method_byte();
						n[var3].bg = var1.method_byte();
						return;
					case -2146762746:
						c_b5.method_case("1BUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFF");

						for (byte var4 = 0; var4 < 12; ++var4) {
							n[var3].aH[var4] = var1.method_if();
						}

						return;
					case -2146762745:
						n[var3].method_do(var1.method_new());
						n[var3].c = var1.method_new();
						n[var3].field_void = var1.method_new();
						return;
					case -2146762744:
					case -2146762743:
					case -2146762742:
					case -2146762741:
					default:
						return;
					case -2146762740:
						n[var3].aq = var1.method_if();
						return;
					}
				}
			}

			return;
		case -2146762744:
		case -2146762739:
		default:
			break;
		case -2146762743:
		case -2146762741:
			c_a5.eQ.a(new int[] { 720905, 720906, 720907 });
			return;
		case -2146762742:
			h = var1.method_byte();
			return;
		case -2146762738:
			c_b5.method_case("CommandList.S_TEAM_DIVIDE接收分配方式");
			c_a5.dh = var0;
			c_a5.gb = var1.method_int(var1.field_do.length - 6);
		}

	}

	public final void a(Graphics var1) {
		int var7;
		if (c_l.g != null) {
			if (c_l.g.method_new() == bp.ag().method_new()) {
				String var3 = c_z.a().method_try() + "(" + c_z.method_if(bp.ag().field_void, bp.ag().c) + ","
						+ c_z.a(bp.ag().field_void, bp.ag().c) + ")";
				c_b5.method_if(var1, var3, c_a5.ic - var1.getFont().stringWidth(var3) - 1, 2 + b2.field_if, 16777215,
						0);
			} else if (c_l.g.method_for() == 1 || c_l.g.method_for() == 3 || c_l.g.method_for() == 2) {
				short var4 = (short) (2 + c_a5.iG + b2.field_if);
				var1.drawImage(this.m, c_a5.ic - 48 - 2, var4, 20);
				c_b5.method_if(var1, c_a5.ic - 48 - 2 - 1, var4 - 1, 16, 16, c_bm.aR);
				if (((bz) c_l.g).method_for() == 3) {
					if (((bz) c_l.g).m() != -4 && ((bz) c_l.g).m() != -3 && ((bz) c_l.g).m() != -2) {
						c_b5.method_if(var1, ((bz) c_l.g).method_byte(),
								c_a5.ic - var1.getFont().stringWidth(((bz) c_l.g).method_byte()) - 2, 2 + b2.field_if,
								55551, 0);
					} else {
						c_b5.method_if(var1, ((bz) c_l.g).method_byte(),
								c_a5.ic - var1.getFont().stringWidth(((bz) c_l.g).method_byte()) - 2, 2 + b2.field_if,
								bz.method_do((int) ((bz) c_l.g).m()), 0);
					}
				} else {
					c_b5.method_if(var1, ((bz) c_l.g).method_byte(),
							c_a5.ic - var1.getFont().stringWidth(((bz) c_l.g).method_byte()) - 2, 2 + b2.field_if,
							bz.method_do((int) ((bz) c_l.g).m()), 0);
				}

				boolean var2 = true;
				switch (c_l.g.method_for()) {
				case 1:
					c_a5.hL.method_if(var1, c_a5.ic - 48 - 2 + 1 + (12 - c_a5.hL.field_try >> 1),
							var4 + 1 + (12 - c_a5.hL.a >> 1), ((bz) ((bz) c_l.g)).i());
					break;
				case 2:
					c_t var6 = (c_t) c_l.g;
					c_a5.hL.method_if(var1, c_a5.ic - 48 - 2 + 1 + (12 - c_a5.hL.field_try >> 1),
							var4 + 1 + (12 - c_a5.hL.a >> 1), var6.O());
					break;
				case 3:
					c_a5.hL.method_if(var1, c_a5.ic - 48 - 2 + 1 + (12 - c_a5.hL.field_try >> 1),
							var4 + 1 + (12 - c_a5.hL.a >> 1), 7);
				}

				c_a5.cG.method_if(var1, c_a5.ic - 48 - 2 + 14, var4 + 7, ((bz) c_l.g).r() / 10);
				c_a5.cG.method_if(var1, c_a5.ic - 48 - 2 + 14 + c_a5.cG.field_try - 1, var4 + 7, ((bz) c_l.g).r() % 10);
				c_b5.a(var1, c_a5.ic - 48 - 2 + field_new, var4 + field_for,
						((bz) c_l.g).J() * field_if / Math.max(1, ((bz) c_l.g).s()), a, 15728640);
				var7 = 0;
				if (((bz) c_l.g).N() != 0) {
					var7 = ((bz) c_l.g).v() * field_if / Math.max(1, ((bz) c_l.g).N());
				}

				c_b5.a(var1, c_a5.ic - 48 - 2 + field_new, var4 + b, var7, a, 18416);
				a(var1, (bz) c_l.g, c_a5.ic - 48 - 2, var4);
			}
		}

		if (n != null) {
			var7 = 2 + b2.field_if;
			int var8 = 26;
			int var9 = var7;
			if (c) {
				var8 = 26 + c_a5.iG;
				var9 = var7 + c_a5.iG;
			}

			for (int var5 = 0; var5 < n.length; ++var5) {
				if (c) {
					c_b5.method_if(var1, n[var5].method_byte(), 2, var7 + var5 * var8, c_bm.cf[3], 0);
				}

				var1.drawImage(this.m, 2, var9 + var5 * var8, 20);
				c_b5.method_if(var1, 1, var9 + var5 * var8 - 1, 16, 16, c_bm.aR);
				c_a5.hL.method_if(var1, 3 + (12 - c_a5.hL.field_try >> 1),
						var9 + var5 * var8 + 1 + (12 - c_a5.hL.a >> 1), n[var5].i());
				c_a5.cG.method_if(var1, 16, var9 + var5 * var8 + 7, n[var5].r() / 10);
				c_a5.cG.method_if(var1, 16 + c_a5.cG.field_try - 1, var9 + var5 * var8 + 7, n[var5].r() % 10);
				int var10;
				if ((var10 = n[var5].a2 * field_if / n[var5].L) > field_if) {
					var10 = field_if;
				}

				c_b5.a(var1, 2 + field_new, var9 + var5 * var8 + field_for, var10, a, 15728640);
				boolean var11 = false;
				if ((var10 = n[var5].bg * field_if / n[var5].ad) > field_if) {
					var10 = field_if;
				}

				c_b5.a(var1, 2 + field_new, var9 + var5 * var8 + b, var10, a, 18416);
				a(var1, n[var5], 2, var9 + var5 * var8);
			}

		}
	}

	private static void a(Graphics var0, bz var1, int var2, int var3) {
		for (byte var4 = 0; var4 < c_a5.fj.field_int; ++var4) {
			if (var1.aH[var4] != 0) {
				if (var4 < 6) {
					c_a5.fj.method_if(var0, var2 + 14 + var4 * 9, var3 + b + a + 3, var1.aH[var4] - 1);
				} else {
					c_a5.fj.method_if(var0, var2 + 14 + (var4 - 6) * 9, var3 + b + a + 3 + 9, var1.aH[var4] - 1);
				}
			}
		}

	}
}
