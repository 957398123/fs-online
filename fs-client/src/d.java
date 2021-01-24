import java.util.Vector;

/**
 * 2021/01/20
 * @author 95739
 *
 */
public final class d {
	private static boolean a = false;

	public d() {
	}

	public static byte[] method_do(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 1572865:
			c_a5.fR = true;
			var1.method_do(c_l.a().method_new());
			c_b5.method_case("GOManager-cmd-C_SKILL_SHOW=" + c_l.a().method_new());
			break;
		case 1572866:
			var1.method_do(c_l.a().method_new());
			c_b5.method_case("GOManager-cmd-C_COLLECT=" + c_l.a().method_new());
			break;
		case 1572867:
			c_a5.fR = true;
			a = true;
			var1.method_do(c_l.a().method_new());
			c_bv var5;
			short var6 = (short) (var5 = (c_bv) c_a5.es.cf().elementAt(3)).t(var5.dw());
			var1.a(bp.fj[var6]);
			c_b5.method_case("GOManager-cmd-C_STUDY_SKILL=" + c_l.a().method_new() + "--SkillID=" + bp.fj[var6]);
			break;
		case 1572868:
			c_a5.fR = true;
			break;
		case 1572869:
			var1.a(bp.ag().eR);

			for (byte var4 = 0; var4 < bp.ag().eR; ++var4) {
				int var3 = bp.ag().ee[var4].length;
				var1.a((byte) var3);
				var1.method_if(bp.ag().ee[var4]);
				c_b5.method_case("GOManager-cmd-C_CHANGE_GENIUS=" + bp.ag().ee[var4]);
			}
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		boolean var6;
		switch (var0) {
		case -2145910783:
			var6 = var1.method_case();
			c_b5.method_case("GOManager-cmd-S_SKILL_SHOW=" + var6);
			a(-1610612731);
			c_a5.method_try((byte) 4);
		case -2145910782:
		case -2145910779:
		case -2145910778:
		default:
			break;
		case -2145910781:
			long[] var7 = new long[4];

			for (byte var2 = 0; var2 < 4; ++var2) {
				var7[var2] = var1.method_char();
			}

			bp.ag().a(var7);
			b2.a();
			b2.field_try.method_do();
			if (a) {
				a = false;
				c_bv var9;
				var0 = (var9 = (c_bv) c_a5.es.cf().elementAt(3)).dt().size();
				int var8 = var9.jl;
				var9.dy();
				var9.jl = 0;
				var9.a((byte) 3);
				int[] var3 = bp.ag().aH();

				for (short var4 = 0; var4 < var3.length; ++var4) {
					StringBuffer var10002 = (new StringBuffer()).append("");
					bp.ag();
					c_m var5;
					c_m var10000 = var5 = new c_m(var10002.append(bp.eQ[var3[var4]]).toString(), (byte) 8, (byte) 0,
							var9.dF());
					bp.ag();
					var10000.method_if(bp.eD[var3[var4]]);
					var9.a(var5);
				}

				int var10 = var9.dt().size();
				var9.method_if(var3);
				c_bv.a(var9, (byte) 0);
				if (var0 > var10) {
					var9.jl = var8;
					if (var9.jl >= var10) {
						--var9.jl;
						if (var9.jl < 0) {
							var9.jl = 0;
						}
					}

					if (var9.dw() == (byte) var10) {
						var9.y((byte) (var10 - 1));
						--var9.jl;
						if (var9.jl < 0) {
							var9.jl = 0;
						}
					}

					if (var10 - var9.jl < var9.z$132bd3()) {
						--var9.jl;
						if (var9.jl < 0) {
							var9.jl = 0;
						}
					}
				} else if (var0 == var10) {
					var9.jl = var8;
				}

				if (var9.dr().U != null) {
					var9.dr().U.a((short) var10, (short) var9.z$132bd3(), (short) var9.jl);
				}
			}
			break;
		case -2145910780:
			bp.ag().method_do(var1);
			method_if(524292);
			c_a5.method_try((byte) 4);
			break;
		case -2145910777:
			bp.ag().method_if(var1);
			break;
		case -2145910776:
			System.out.println("222222222222222222");
			bp.a(var1.method_if(), var1);
			break;
		case -2145910775:
			System.out.println("111111111111111");
			var6 = var1.method_case();
			bp.a(var1, var6);
		}

		c_a5.fR = false;
	}

	private static void a(int var0) {
		c_be var1 = c_e.a("/ui/learnskill.ui");
		c_be var2 = c_e.a("/ui/learnskill.ui");
		c_a5.es = var1;
		var1.g9 = var0;
		c_a5.fE.addElement(var1);
		c_a5.fE.addElement(var2);
		c_bv var5;
		(var5 = (c_bv) c_a5.es.cf().elementAt(3)).dy();
		var5.a((byte) 3);
		int[] var6 = bp.ag().aH();

		for (short var3 = 0; var3 < var6.length; ++var3) {
			StringBuffer var10002 = (new StringBuffer()).append("");
			bp.ag();
			c_m var4;
			c_m var10000 = var4 = new c_m(var10002.append(bp.eQ[var6[var3]]).toString(), (byte) 8, (byte) 0, var5.dF());
			bp.ag();
			var10000.method_if(bp.eD[var6[var3]]);
			var5.a(var4);
		}

		var5.method_if(var6);
		c_bv.a(var5, (byte) 0);
		c_bv var7;
		(var7 = (c_bv) var2.cf().elementAt(3)).dy();
		var7.a((byte) 4);
		var7.a(new c_m("1-10级", (byte) 0, (byte) 0, var7.dF()));
		var7.a(new c_m("11-20级", (byte) 0, (byte) 0, var7.dF()));
		var7.a(new c_m("21-30级", (byte) 0, (byte) 0, var7.dF()));
		var7.a(new c_m("31-40级", (byte) 0, (byte) 0, var7.dF()));
		var7.a(new c_m("41-50级", (byte) 0, (byte) 0, var7.dF()));
		var7.a(new c_m("51-60级", (byte) 0, (byte) 0, var7.dF()));
		var7.a(new c_m("61-70级", (byte) 0, (byte) 0, var7.dF()));
		int[] var8 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		var7.method_if(var8);
		c_bv.a(var7, (byte) 0);
	}

	private static void method_if(int var0) {
		Vector var1 = new Vector();

		for (byte var2 = 0; var2 < bp.ag().eR; ++var2) {
			c_be var3 = c_e.a("/ui/geniustree.ui");
			((ah) var3.cf().elementAt(8)).a(20);
			ah var10;
			if (var2 == 0) {
				int var4 = 0;

				while (true) {
					if (var4 >= bp.ag().eR) {
						var10 = (ah) var3.cf().elementAt(6);
						ah var11 = (ah) var3.cf().elementAt(7);
						bp.ag().e0 = (short) (3 + var10.method_long() + ah.ad());
						bp.ag().fb = (short) (var11.method_long() - bp.ag().e0);
						break;
					}

					var1.addElement(bp.ag().ff[var4] + "天赋");

					for (int var5 = 0; var5 < bp.ag().fL[var4].length; ++var5) {
						bp.ag().fL[var4][var5] = 0;
					}

					++var4;
				}
			}

			var3.g9 = var0;
			((ae) var3.cf().elementAt(4)).a(var1);
			c_a5.fE.addElement(var3);
			c_ao var12;
			(var12 = (c_ao) var3.cf().elementAt(0)).method_for(true);
			var12.a(true, var3);
			var12.w();
			var10 = (ah) var3.cf().elementAt(6);
			bp.ag().e1 = var10.v();
			bp.ag().e3 = var10.method_for();
			int var6;
			if ((var6 = bp.ag().a(var2, bp.ag().fC[var2])) == -1) {
				var6 = 0;
			}

			String var7 = bp.ag().eF[var2][var6];
			var3.c(bp.ag().fl[var2][var6]);
			var10.a(var7);
			((ah) var3.cf().elementAt(8)).a(bp.ag().e7 + "");
			byte var8 = bp.ag().fc[var2][bp.ag().fc[var2].length - 1];
			var12.b6 = (byte) ((var8 - 1) / 3 + 1);
			var12.ca = (byte) (bp.ag().fb / 27);
			var12.cl = 0;
			short var9 = (short) ((short) (bp.ag().fb + (c_a5.ca.getHeight() << 1)) - c_a5.hI.getHeight());
			var12.b1 = (short) (var9 / (var12.b6 - var12.ca + 2));
			var12.cr = (short) (bp.ag().e0 + 3 + c_a5.ca.getHeight() + var9);
			var12.cq = new af((short) (bp.ag().e1 + bp.ag().e3 - c_a5.ca.getWidth() - 5), (short) (bp.ag().e0 + 3),
					(short) 0, var9, (byte) 0, true, (c_be) null);
			var12.cq.a((short) var12.b6, (short) var12.ca, (short) var12.cl);
		}

		(c_a5.es = (c_be) c_a5.fE.elementAt(0)).ck();
	}
}
