import java.util.Vector;

/**
 * 2020/01/21
 * 
 * @author 95739
 *
 */
public final class at {
	public static boolean field_byte = false;
	public static byte field_try = 0;
	public static int field_for = 0;
	public static int field_if = 0;
	public static int a = 0;
	public static byte field_do = 4;
	public static byte field_new = 0;
	public static int[] field_int = new int[] { -1, -1 };

	public at() {
	}

	public static byte[] a(int var0) {
		ac var1 = new ac();
		c_b5.method_case("发送UI命令");
		var1.method_do(var0);
		int var2;
		switch (var0) {
		case 458753:
			c_b5.method_case("in C_UI_PACKAGE_VIEW UIGrid.severGridIndex = " + c_r.mp);
			var1.a(c_r.mp);
			break;
		case 458754:
		case 458775:
			var1.a(c_r.mp);
			break;
		case 458755:
		case 458768:
			var1.a(c_r.mp);
			break;
		case 458756:
			var2 = field_int[0];
			var1.a((byte) var2);
			var2 = field_int[1];
			var1.a((byte) var2);
			var1.a(field_new);
			c_a5.es.cg();
			break;
		case 458757:
		case 458761:
		case 458764:
		case 458765:
		case 458766:
		case 458767:
		case 458774:
		default:
			return var1.method_long();
		case 458758:
			c_a5.fR = true;
			return var1.method_long();
		case 458759:
			var2 = c_r.m8;
			var1.a((byte) var2);
			break;
		case 458760:
			c_a5.fR = true;
			return var1.method_long();
		case 458762:
			c_a5.fR = true;
		case 458763:
			var1.method_do(av.g);
			return var1.method_long();
		case 458769:
			var1.a(c_r.mp);
			var1.a(field_try);
			field_byte = false;
			((c_ao) c_a5.es.cf().elementAt(1)).a("返回", 1);
			a(true);
			return var1.method_long();
		case 458770:
			var1.a(field_try);
			break;
		case 458771:
			c_bv var3 = (c_bv) c_a5.es.cf().elementAt(2);
			var1.a(var3.j7);
			var1.method_do(field_for);
			break;
		case 458772:
			c_a5.fR = true;
			return var1.method_long();
		case 458773:
		}

		c_a5.fR = true;
		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		int var7;
		int var10;
		int var15;
		switch (var0) {
		case -2147024884:
			boolean var9 = var1.method_case();
			short var2;
			int[] var3 = new int[var2 = var1.method_new()];

			for (int var18 = 0; var18 < var2; ++var18) {
				var3[var18] = var1.method_byte();
			}

			b2.a();
			av var20 = b2.field_try;

			int var19;
			for (var15 = 0; var15 < var2; ++var15) {
				var19 = var3[var15];
				var20.a((byte) 2, var19, var9);
			}

			var20.method_goto();
			if (c_a5.es != null) {
				a(c_a5.es, var2, var9, var3);
				var15 = c_a5.fE.size();

				for (var19 = 0; var19 < var15; ++var19) {
					c_be var13;
					if ((var13 = (c_be) ((c_be) c_a5.fE.elementAt(var19))) != null) {
						a(var13, var2, var9, var3);
					}
				}

				var15 = c_a5.d6.size();

				for (var19 = 0; var19 < var15; ++var19) {
					Object var14;
					if ((var14 = c_a5.d6.elementAt(var19)) instanceof c_be) {
						c_be var22;
						a(var22 = (c_be) var14, var2, var9, var3);
					} else if (var14 instanceof Vector) {
						Vector var21;
						var7 = (var21 = (Vector) var14).size();

						for (var10 = 0; var10 < var7; ++var10) {
							Object var8;
							if ((var8 = var21.elementAt(var10)) instanceof c_be) {
								c_be var23;
								a(var23 = (c_be) var8, var2, var9, var3);
							}
						}
					}
				}
			}

			c_b5.method_case("--------------- 接收背包物品CD时间 命令-------------");
			break;
		case -2147024883:
			c_b5.method_case("--------------- 接收背包冻结或解冻命令-------------");
			boolean var16 = var1.method_case();
			byte var17 = var1.method_if();
			byte var12 = var1.method_if();
			c_b5.method_case("a = " + var16 + "   beginIndex = " + var17 + "   endIndex = " + var12);
			if (var16) {
				c_b5.method_case("解冻");
			} else {
				c_b5.method_case("冻结");
			}

			c_r var4 = null;
			if (c_a5.es != null) {
				if (c_a5.es.g9 == 458760) {
					var4 = (c_r) c_a5.es.cf().elementAt(10);
				} else if (c_a5.es.g9 == 1179649) {
					var4 = (c_r) c_a5.es.cf().elementAt(8);
				} else if (c_a5.es.g9 == 917505) {
					var4 = (c_r) c_a5.es.cf().elementAt(23);
				} else if (c_a5.es.g9 != 983046 && c_a5.es.g9 != 983057 && c_a5.es.g9 != 983049 && c_a5.es.g9 != 983058
						&& c_a5.es.g9 != 983056) {
					if (c_a5.es.g9 != 1769473 && c_a5.es.g9 != 1769478 && c_a5.es.g9 != 1769479 && c_a5.es.g9 != 1769480
							&& c_a5.es.g9 != 1769488 && c_a5.es.g9 != 1769489 && c_a5.es.g9 != 1769490
							&& c_a5.es.g9 != 1769491 && c_a5.es.g9 != 1769492) {
						if (c_a5.es.g9 == 1179658) {
							var4 = (c_r) c_a5.es.cf().elementAt(3);
						}
					} else {
						var4 = (c_r) c_a5.es.cf().elementAt(5);
					}
				} else {
					var4 = (c_r) c_a5.es.cf().elementAt(5);
				}

				if (var4 != null) {
					c_b5.method_case("背包冻结或解冻不为空");

					for (var7 = var17; var7 < var12; ++var7) {
						if (var16) {
							var4.mZ[var7] = false;
						} else {
							var4.mZ[var7] = true;
						}
					}
				} else {
					c_b5.method_case("空的");
				}
			}
		case -2147024882:
		case -2147024879:
		case -2147024878:
		case -2147024877:
		case -2147024876:
		case -2147024875:
		default:
			break;
		case -2147024881:
			var15 = var1.method_byte();
			c_b5.method_case("东西没了" + var15);
			b2.a();
			b2.field_try.a(var15);
			break;
		case -2147024880:
			c_b5.method_case("--------------- 接收背包扩容结果-------------");
			byte var5 = var1.method_if();
			c_b5.method_case("result = " + var5);
			if (var5 == 0) {
				field_byte = false;
			} else {
				field_byte = true;
				a7[] var6 = new a7[] { (a7) c_a5.es.cf().elementAt(3), (a7) c_a5.es.cf().elementAt(5),
						(a7) c_a5.es.cf().elementAt(7), (a7) c_a5.es.cf().elementAt(9) };

				for (var10 = 0; var10 < var6.length; ++var10) {
					var6[var10].eY = (var5 & c_b5.method_int(2, var10)) != 0;
				}

				c_r var11 = (c_r) c_a5.es.cf().elementAt(10);
				var6[0].a(true, c_a5.es);
				var11.a(false, c_a5.es);
				((c_ao) c_a5.es.cf().elementAt(1)).a("取消", 1);
				a(false);
			}
			break;
		case -2147024874:
			field_do = (byte) (var1.method_if() + 4);
			System.out.println("~~~~~~~~~~~~~服务器发送装备索引： " + field_do);
		}

		c_a5.fR = false;
	}

	private static void a(c_be var0, int var1, boolean var2, int[] var3) {
		int var5;
		int var6;
		switch (var0.g9) {
		case -1610612734:
			for (int var9 = 0; var9 < var1; ++var9) {
				var5 = var3[var9];

				for (var6 = 0; var6 < 3; ++var6) {
					c_r var10 = (c_r) var0.cf().elementAt(var6 + 3);

					for (int var8 = 0; var8 < var10.dY(); ++var8) {
						if (var10.A(var8) == 2 && var10.G(var8) == var5) {
							var10.method_if(var8, var2);
						}
					}
				}
			}

			return;
		case 458754:
		case 458756:
		case 458758:
		case 458759:
		case 458760:
		case 458761:
		case 458775:
			if (var0.cf().elementAt(10) instanceof c_r) {
				c_r var4 = (c_r) ((c_r) var0.cf().elementAt(10));

				for (var5 = 0; var5 < var1; ++var5) {
					var6 = var3[var5];

					for (int var7 = 0; var7 < var4.mt; ++var7) {
						if (var4.mQ[var7] == var6) {
							var4.m4[var7] = var2;
						}
					}
				}

				return;
			}
		}

	}

	public static byte a() {
		if (((a7) c_a5.es.cf().elementAt(3)).q()) {
			return 0;
		} else if (((a7) c_a5.es.cf().elementAt(5)).q()) {
			return 1;
		} else if (((a7) c_a5.es.cf().elementAt(7)).q()) {
			return 2;
		} else if (((a7) c_a5.es.cf().elementAt(9)).q()) {
			return 3;
		} else {
			c_b5.method_case("获取扩容背包索引错误！！！！");
			return -1;
		}
	}

	public static void a(boolean var0) {
		if (var0) {
			((a7) c_a5.es.cf().elementAt(3)).a((byte) 1, (byte) 11);
			((a7) c_a5.es.cf().elementAt(5)).a((byte) 1, (byte) 11);
			((a7) c_a5.es.cf().elementAt(7)).a((byte) 1, (byte) 11);
			((a7) c_a5.es.cf().elementAt(9)).a((byte) 1, (byte) 11);
		} else {
			((a7) c_a5.es.cf().elementAt(3)).a((byte) 1, (byte) -1);
			((a7) c_a5.es.cf().elementAt(5)).a((byte) 1, (byte) -1);
			((a7) c_a5.es.cf().elementAt(7)).a((byte) 1, (byte) -1);
			((a7) c_a5.es.cf().elementAt(9)).a((byte) 1, (byte) -1);
		}
	}
}
