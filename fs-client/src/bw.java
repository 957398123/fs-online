import javax.microedition.lcdui.Graphics;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class bw {
    private static int field_byte = 0;
    private static int g = 0;
    public static int f = 0;
    private static byte h = 0;
    public static byte d = 0;
    public static byte a = 0;
    public static short field_void = 1;
    public static short c = 1;
    public static long field_goto = -1L;
    public static int i = 0;
    public static int field_int = 0;
    public static int field_case = 0;
    public static int field_if = 0;
    public static byte field_do = 0;
    public static boolean field_char = false;
    public static String field_new = "";
    public static boolean e = true;
    public static byte field_for = -1;
    public static byte field_long = -1;
    public static byte field_try = -1;
    public static byte field_else = -1;
    public static byte b = -1;

    public bw() {
    }

    public static byte[] a(int var0) {
    	c_a5.fR = true;
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 1900545:
            var1.method_do(c_l.g.method_new());
            break;
        case 1900546:
            var1.a(field_for);
            var1.a(field_long);
            var1.a(field_try);
            var1.a(field_else);
            var1.a(b);
            var1.a(field_void);
        case 1900547:
        case 1900548:
        case 1900549:
        case 1900551:
        default:
            break;
        case 1900550:
            var1.a((byte)c_r.mY[0]);
            var1.a(h);
            var1.method_do(field_byte);
            var1.method_do(g);
            var1.a(d);
            break;
        case 1900552:
            c_bv var2;
            c_r.E(((c_m)(var2 = (c_bv)c_a5.es.cf().elementAt(2)).dt().elementAt(var2.dw())).v);
            var1.a(field_goto);
            am.a = false;
            break;
        case 1900553:
            var1.a(field_goto);
            var1.method_do(field_if);
            var1.a(field_for);
            var1.a(field_long);
            var1.a(field_try);
            var1.a(field_else);
            var1.a(b);
            var1.a(field_void);
            c_b5.method_case("出价");
            break;
        case 1900554:
            var1.method_if(field_new);
            var1.a(field_void);
            break;
        case 1900555:
            var1.a(field_goto);
            var1.method_do(field_if);
            var1.method_if(field_new);
            var1.a(field_void);
            c_b5.method_case("搜索出价");
        }

        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        switch(var0) {
        case -2145583099:
        case -2145583097:
            c_b5.method_case("Auction.rec_Parse() S_AUCTION_HANG...");
            c_a5.dh = var0;
            c_a5.gb = var1.method_int(var1.field_do.length - 6);
        default:
        }
    }

    public static void method_if(byte var0) {
        a7 var1 = (a7)c_a5.es.cf().elementAt(3);
        if (var0 == 1 && var1.ft) {
            method_for();
            var1.g(false);
            var1.ft = false;
            var1.a((bi)null);
        } else if (var0 == 1 && !var1.ft) {
            c_as.a((byte)0, "请选择拍卖物品!", "确定", "", -1, -2);
        } else {
            if (var0 == 2) {
            	field_do = 0;
                method_for();
                var1.g(false);
                var1.ft = false;
                var1.a((bi)null);
            }

        }
    }

    public static void method_do() {
    	c_a5.es.cf().elementAt(3);
        a9 var0 = (a9)c_a5.es.cf().elementAt(4);
        a9 var1 = (a9)c_a5.es.cf().elementAt(5);
        if (var0.cc().toString().trim().equals("0")) {
            c_as.a((byte)0, "竞拍价不能为零", "确定", "", -1, -2);
        } else if (var1.cc().toString().trim().equals("0")) {
            c_as.a((byte)0, "一口价不能为零", "确定", "", -1, -2);
        } else {
            try {
            	field_byte = Integer.parseInt(var0.cc().toString().trim());
                g = Integer.parseInt(var1.cc().toString().trim());
            } catch (NumberFormatException var2) {
            	field_byte = 0;
                g = 0;
                var2.printStackTrace();
            }

            if (field_byte >= g) {
                c_as.a((byte)0, "一口价不能小于或等于竞拍价", "确定", "", -1, -2);
            } else {
                byte var3 = 0;
                switch(d) {
                case 0:
                    var3 = 6;
                    break;
                case 1:
                    var3 = 12;
                    break;
                case 2:
                    var3 = 24;
                    break;
                case 3:
                    var3 = 48;
                    break;
                case 4:
                    var3 = 72;
                }

                c_as.a((byte)0, "要扣除" + var3 + "个金币的保证金，您是否确定拍卖", "确定", "取消", 1900550, -1);
            }
        }
    }

    private static void method_for() {
        c_ao var0 = (c_ao)c_a5.es.cf().elementAt(1);
        a9 var1 = (a9)c_a5.es.cf().elementAt(4);
        a9 var2 = (a9)c_a5.es.cf().elementAt(5);
        ay var3 = (ay)c_a5.es.cf().elementAt(6);
        c_r var4 = (c_r)c_a5.es.cf().elementAt(8);
        ah var5 = (ah)c_a5.es.cf().elementAt(9);
        var1.method_void("0");
        var2.method_void("0");
        var5.a("");
        var3.method_case((byte)0);
        c_r.m2 = "";
        d = 0;
        h = 0;
        field_byte = 0;
        g = 0;
        field_char = false;

        for(int var6 = 0; var6 < c_r.mY.length; ++var6) {
            c_r.mY[var6] = -1;
        }

        a = 0;
        if (var4.q()) {
            var0.a("操作", 0);
        } else {
            var0.a("", 0);
        }
    }

    public static void a(byte var0) {
        c_ao var1 = (c_ao)c_a5.es.cf().elementAt(1);
        a7 var2 = (a7)c_a5.es.cf().elementAt(3);
        c_r var3 = (c_r)c_a5.es.cf().elementAt(8);
        ((ah)c_a5.es.cf().elementAt(9)).a(c_r.m2);
        if (var0 >= 1 && field_char) {
            var2.a(true, var0);
        } else {
            var2.a(false, var0);
        }

        h = var0;
        var2.fC = (byte)c_r.mY[2];
        short var5 = c_r.mY[1];
        var2.ft = true;
        var2.method_if(var5, false);
        var2.a(c_a5.gg);
        var2.a(true, c_a5.es);
        var3.a(false, c_a5.es);
        a = 1;
        var1.a("操作", 0);
    }

    public static void a() {
    	field_void = 1;
    }

    public static void a(c_be var0, Graphics var1, boolean var2, boolean var3) {
        if (var2 || var3) {
            ah var5;
            short var4 = (var5 = (ah)var0.cf().elementAt(15)).method_long();
            int var6 = var5.v() - 5 - 6;
            if (var2) {
                var1.setColor(10188618);
                var1.fillTriangle(var6 + 5, var4 - 1, var6 + 1, var4 + 3, var6 + 5, var4 + 7);
                var1.fillRect(var6 + 5, var4 + 2, 3, 3);
            }

            if (var3) {
                var1.setColor(10188618);
                var1.fillTriangle(var6 + 42, var4, var6 + 46, var4 + 3, var6 + 42, var4 + 7);
                var1.fillRect(var6 + 40, var4 + 2, 3, 3);
            }

        }
    }

    public static void method_int() {
    	field_byte = 0;
        g = 0;
        f = 0;
        h = 0;
        d = 0;
        field_void = 1;
        c = 1;
        field_goto = -1L;
        i = 0;
        field_int = 0;
        field_case = 0;
        field_if = 0;
        field_do = 0;
    }
}
