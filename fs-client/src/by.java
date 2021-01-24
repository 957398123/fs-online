/**
 * 2020/01/20
 * 
 * @author 95739
 *
 */
public final class by {
	public static boolean field_do = false;
	public static a9[] field_try = new a9[7];
	public static int c = 0;
	public static final byte[] field_byte = new byte[] { 1, 3, 5, 7, 9, 11, 13 };
	public static a7[] field_goto = new a7[7];
	public static byte field_case = 0;
	public static int field_new = 0;
	public static byte a = 0;
	public static int e = 0;
	public static int field_long = 0;
	public static byte field_int = 0;
	private static int field_for;
	public static boolean b = false;
	public static boolean field_void = false;
	public static boolean f = false;
	public static boolean d = false;
	public static byte field_if = 0;
	public static boolean field_else = false;

	public by() {
	}

	public static byte[] a(int var0) {
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 2097153:
            c_a5.fR = true;

            for(var0 = 0; var0 < 7; ++var0) {
                int var3 = field_try[var0].b3();
                var1.a((byte)var3);
            }

            var1.method_do(c);
            break;
        case 2097154:
            c_a5.fR = true;
            var1.method_do(field_for);
            var1.method_do(c);
            var1.a(field_case);
            var1.method_do(field_for);
            break;
        case 2097155:
            c_a5.fR = true;
        }

        return var1.method_long();
    }

	public static void a(int var0, ac var1) {
        switch(var0) {
        case -2145386495:
            c_a5.fR = false;
            b = var1.method_case();
            c = var1.method_byte();
            field_for = var1.method_byte();
            a = var1.method_if();
            field_do = true;
            f = true;
            field_int = 0;
            c_b5.method_case("-------award-------=" + b);
            c_b5.method_case("-------m_nJetton-------=" + c);
            c_b5.method_case("-------jetton-------=" + field_for);
            c_b5.method_case("-------index1-------=" + a);
            return;
        case -2145386494:
            c_a5.fR = false;
            field_void = var1.method_case();
            c = var1.method_byte();
            field_for = var1.method_byte();
            d = true;
            c_b5.method_case("-------award_1-------=" + field_void);
            c_b5.method_case("-------m_nJetton-------=" + c);
            c_b5.method_case("-------jetton-------=" + field_for);
        default:
        }
    }

	public static void a(byte var0) {
        ah var1 = (ah)c_a5.es.cf().elementAt(37);

        for(int var3 = 0; var3 < 7; ++var3) {
            field_try[var3] = (a9)c_a5.es.cf().elementAt(var3 + 24);
            if (field_try[var3].b3() != 0 && field_try[var3].q()) {
                c_b5.method_case("textfield[i].getNumber()=" + field_try[var3].b3());
                int var2;
                if (var0 == 1) {
                    var2 = Integer.parseInt(var1.aj()) - field_try[var3].b3();
                    var1.a("" + var2);
                } else if (var0 == 2) {
                    var2 = Integer.parseInt(var1.aj()) + field_try[var3].b3();
                    var1.a("" + var2);
                }
            }
        }

    }

	public static void a() {
        ah var0 = (ah)c_a5.es.cf().elementAt(32);
        ah var1 = (ah)c_a5.es.cf().elementAt(36);
        a7 var2 = (a7)c_a5.es.cf().elementAt(7);
        a7 var3 = (a7)c_a5.es.cf().elementAt(9);
        a7 var4 = (a7)c_a5.es.cf().elementAt(31);
        a7 var5 = (a7)c_a5.es.cf().elementAt(33);
        c_ao var6 = (c_ao)c_a5.es.cf().elementAt(1);
        f = false;
        e = 0;
        field_long = 0;
        if (b && field_if == 0) {
            var1.a("" + field_for);
            var0.a("结算");
            var6.a("结算", 0);
            field_if = 1;
            c_as.a((byte)0, "恭喜您获得了" + field_for + "枚代币，您可以结算该代币，也可以按左右键来猜阴阳，如果猜中，你获得代币会翻倍！", "确定", "", -1, -2);
        } else if (!b && field_if == 0 || !field_void && field_if == 1) {
            var0.a("开局");
            var6.a("开局", 0);
            c_as.a((byte)0, "很遗憾，您没有获得代币，请继续努力！", "确定", "", -1, -2);
            field_do = false;
            var1.a("0");

            for(int var7 = 0; var7 < 7; ++var7) {
                field_try[var7].method_void("0");
            }

            field_if = 0;
            field_new = 0;
            a = 0;
        } else if (field_void && field_if == 1) {
            var1.a("" + field_for);
            var0.a("结算");
            var6.a("结算", 0);
            c_as.a((byte)0, "恭喜您获得了" + field_for + "枚代币，您可以结算该代币，也可以继续猜阴阳！", "确定", "", -1, -2);
        }

        var2.a(false, c_a5.es);
        var3.a(false, c_a5.es);
        var4.a(false, c_a5.es);
        var5.a(false, c_a5.es);
        var0.a(true, c_a5.es);
        field_else = false;
    }
}
