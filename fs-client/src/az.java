import java.util.Vector;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class az {
	public static byte n = 0;
	public static String[] field_byte = new String[3];
	public static String field_new;
	public static String c;
	public static int[] a;
	public static String field_try = "";
	public static byte field_if;
	public static byte f;
	public static byte o;
	public static Vector g;
	public static byte m;
	public static byte h;
	public static int field_else;
	public static byte field_int = 0;
	public static byte field_for = -1;
	private static byte field_goto;
	public static byte field_long;
	public static int d;
	public static byte field_char;
	public static String k;
	public static byte field_case;
	public static final String[] field_do = new String[] { "播种", "犁地", "收获", "偷窃", "查看", "除草", "浇水", "捉虫", "种杂草", "放虫",
			"使用道具" };
	public static final int[] e = new int[] { 2, 3, 3, 3, 2, 3, 3, 3, 3, 3, 2 };
	public static final String[] l = new String[] { "查看详情", "发送信息", "加为好友", "屏蔽此人", "加为仇人" };
	public static final int[] b = new int[] { 2, 3, 3, 3, 3 };
	public static final String[] i = new String[] { "", "龟裂", "干燥", "正常", "湿润" };
	private static int j = 0;

	public az() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 2555905:
		case 2555906:
			c_a5.fR = true;
			var1.method_do(field_else);
			break;
		case 2555907:
		case 2555908:
		case 2555910:
		case 2555911:
		case 2555912:
		case 2555913:
		case 2555915:
		case 2555955:
		case 2555957:
		case 2555959:
		case 2555960:
		case 2555961:
		case 2555972:
		case 2555976:
			c_a5.fR = true;
			break;
		case 2555909:
		case 2555958:
			c_a5.fR = true;
			var1.a(field_long);
			var1.a((byte) c_as.c4);
			break;
		case 2555914:
			c_a5.fR = true;
			var1.method_do(j);
		case 2555916:
		case 2555917:
		case 2555918:
		case 2555919:
		case 2555921:
		case 2555922:
		case 2555923:
		case 2555924:
		case 2555925:
		case 2555926:
		case 2555927:
		case 2555928:
		case 2555929:
		case 2555930:
		case 2555931:
		case 2555932:
		case 2555933:
		case 2555934:
		case 2555935:
		case 2555947:
		case 2555948:
		case 2555949:
		case 2555950:
		case 2555951:
		case 2555953:
		case 2555967:
		default:
			break;
		case 2555920:
			var1.method_if(field_try);
			break;
		case 2555936:
			c_a5.fR = true;
			var1.method_do(j);
			var1.a(field_if);
			var1.a(f);
			var1.a(o);
			break;
		case 2555937:
			c_a5.fR = true;
			var1.method_do(j);
			var1.a(field_if);
			var1.a(f);
			var1.a(field_long);
			break;
		case 2555938:
			c_a5.fR = true;
			var1.method_do(j);
			var1.a(field_if);
			var1.a(f);
			var1.a(field_long);
			break;
		case 2555939:
		case 2555956:
		case 2555962:
		case 2555968:
		case 2555969:
			c_a5.fR = true;
			var1.a(field_long);
			break;
		case 2555940:
		case 2555963:
		case 2555970:
		case 2555971:
			c_a5.fR = true;
			var1.a(field_long);
			var1.a((byte) c_as.c4);
			break;
		case 2555941:
		case 2555943:
		case 2555945:
			c_a5.fR = true;
			field_goto = (byte) c_as.c4;
			break;
		case 2555942:
		case 2555944:
		case 2555946:
			c_a5.fR = true;
			var1.method_do(d);
			var1.a(field_long);
			var1.a(field_goto);
			break;
		case 2555952:
			var1.method_do(j);
			var1.a(m);
			break;
		case 2555954:
		case 2555975:
			c_a5.fR = true;
			var1.a(field_int);
			var1.a((byte) c_as.c4);
			break;
		case 2555964:
		case 2555965:
			c_a5.fR = true;
			var1.method_do(field_else);
			break;
		case 2555966:
			c_a5.fR = true;
			var1.method_do(field_else);
			var1.method_do(o);
			break;
		case 2555973:
			var1.method_do(j);
			break;
		case 2555974:
			var1.a(field_char);
			break;
		case 2555977:
			c_a5.fR = true;
			var1.a(field_case);
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		int var6;
		switch (var0) {
		case -2144927743:
			c = var1.method_goto();
			field_new = var1.method_goto();
			j = var1.method_byte();
			h = var1.method_if();
			return;
		case -2144927695:
			byte var7 = var1.method_if();
			var6 = 0;

			a7 var14;
			for (; var6 < var7; ++var6) {
				byte var5 = var1.method_if();
				if (c_a5.d6.size() > 0) {
					var14 = (a7) ((c_be) c_a5.d6.elementAt(0)).cf().elementAt(var5);
				} else {
					var14 = (a7) c_a5.es.cf().elementAt(var5);
				}

				byte var2 = var1.method_if();
				var14.method_goto(var2);
				if (var2 == 0) {
					var14.method_long("");
					var14.method_goto("");
					var14.d((byte) 0);
					var14.method_char("");
					var14.m((byte) 0);
					var14.i(0);
					var14.j(0);
				} else {
					String var10 = var1.method_goto();
					var14.method_long(var10);
					var10 = var1.method_goto();
					var14.method_goto(var10);
					var2 = var1.method_if();
					var14.d(var2);
					var1.method_if();
					var1.method_if();
					var10 = var1.method_goto();
					var14.method_char(var10);
					var2 = var1.method_if();
					var14.m(var2);
					short var12 = var1.method_new();
					int var3 = var1.method_byte();
					var14.i(var3);
					var3 = var1.method_byte();
					var14.j(var3);
					var14.g(var12);
					var14.ft = true;
					var12 = (short) (var12 % 1000);
					var14.method_if(var12, true);
					var14.a(c_a5.gg);
				}
			}

			ah var4;
			ah var8;
			ah var9;
			ah var11;
			ah var13;
			if (c_a5.d6.size() > 0) {
				c_be var15;
				var8 = (ah) (var15 = (c_be) c_a5.d6.elementAt(0)).cf().elementAt(3);
				var9 = (ah) var15.cf().elementAt(4);
				var13 = (ah) var15.cf().elementAt(6);
				var11 = (ah) var15.cf().elementAt(10);
				var4 = (ah) var15.cf().elementAt(8);
			} else {
				var8 = (ah) c_a5.es.cf().elementAt(3);
				var9 = (ah) c_a5.es.cf().elementAt(4);
				var13 = (ah) c_a5.es.cf().elementAt(6);
				var11 = (ah) c_a5.es.cf().elementAt(10);
				var4 = (ah) c_a5.es.cf().elementAt(8);
			}

			for (var6 = 0; var6 < 12; ++var6) {
				if (c_a5.d6.size() > 0) {
					var14 = (a7) ((c_be) c_a5.d6.elementAt(0)).cf().elementAt(var6 + 11);
				} else {
					var14 = (a7) c_a5.es.cf().elementAt(var6 + 11);
				}

				if (var14.q() && var14.bN() != 0) {
					var8.a(var14.bn());
					var9.a(var14.bY());
					var13.method_case(var14.bz());
					var11.a(var14.by());
					if (var14.bJ() == -1) {
						var4.a(i[0]);
					} else if (var14.bJ() == 0) {
						var4.a(i[1]);
					} else if (var14.bJ() >= 1 && var14.bJ() <= 30) {
						var4.a(i[2]);
					} else if (var14.bJ() >= 31 && var14.bJ() <= 70) {
						var4.a(i[3]);
					} else if (var14.bJ() >= 71 && var14.bJ() <= 100) {
						var4.a(i[4]);
					}
				}
			}

			for (var6 = 0; var6 < 6; ++var6) {
				if (c_a5.d6.size() > 0) {
					var14 = (a7) ((c_be) c_a5.d6.elementAt(0)).cf().elementAt(var6 + 25);
				} else {
					var14 = (a7) c_a5.es.cf().elementAt(var6 + 25);
				}

				if (var14.q() && var14.bN() != 0) {
					var8.a(var14.bn());
					var9.a(var14.bY());
					var13.method_case(var14.bz());
					var11.a(var14.by());
					if (var14.bJ() == -1) {
						var4.a(i[0]);
					} else if (var14.bJ() == 0) {
						var4.a(i[1]);
					} else if (var14.bJ() >= 1 && var14.bJ() <= 30) {
						var4.a(i[2]);
					} else if (var14.bJ() >= 31 && var14.bJ() <= 70) {
						var4.a(i[3]);
					} else if (var14.bJ() >= 71 && var14.bJ() <= 100) {
						var4.a(i[4]);
					}
				}
			}

			return;
		case -2144927675:
			var6 = var1.method_byte();
			((ah) c_a5.es.cf().elementAt(32)).method_case(var6);
		default:
		}
	}

	public static void method_if() {
		if (h != 0) {
			h = 0;
		}

		if (m != 0) {
			m = 0;
		}

		if (field_else != 0) {
			field_else = 0;
		}

	}
}
