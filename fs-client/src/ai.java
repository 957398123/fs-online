import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/21
 * @author 95739
 *
 */
public final class ai {
    private static String[] field_new = new String[]{"网络设置:<自动选择>", "请按左软键", "请按右软键", "请按中间键完成设置"};
    private static int field_do = 0;
    static int field_byte = 2;
    static int[] field_if = new int[3];
    private static String field_int = null;
    private static String a = null;
    private static String field_for = null;
    private static int field_try;

    public ai() {
    }

    public static void a(Graphics var0) {
        var0.setColor(13808780);
        var0.drawString("按键设置", c_a5.ic >> 1, 5, 17);
        var0.setColor(16766720);
        if (field_try % 3 == 0) {
            var0.fillRect(8, 30 + field_do * (c_a5.iG + 4) + 4, 8, 8);
        } else {
            var0.fillRect(7, 30 + field_do * (c_a5.iG + 4) + 3, 6, 6);
        }

        int var1 = 0;

        for(int var2 = field_new.length; var1 < var2; ++var1) {
            if (var1 == field_do) {
                var0.setColor(16766720);
            } else {
                var0.setColor(12092939);
            }

            var0.drawString(field_new[var1], 20, 30 + var1 * (c_a5.iG + 4), 20);
        }

        var0.setColor(3100495);
        var0.fillRect((c_a5.ic >> 1) - 25, c_a5.il >> 1, 50, 80);
        var0.setColor(6266528);
        var0.fillRect((c_a5.ic >> 1) - 22, (c_a5.il >> 1) + 3, 44, 50);
        var0.fillRect((c_a5.ic >> 1) - 25 + 2, (c_a5.il >> 1) + 55, 15, 10);
        var0.fillRect((c_a5.ic >> 1) + 25 - 2 - 15, (c_a5.il >> 1) + 55, 15, 10);
        var0.fillRect((c_a5.ic >> 1) - 4, (c_a5.il >> 1) + 56, 8, 8);
        if (field_try % 3 == 0) {
            var0.setColor(65535);
            switch(field_do) {
            case 1:
                var0.fillRect((c_a5.ic >> 1) - 25 + 2, (c_a5.il >> 1) + 55, 15, 10);
                return;
            case 2:
                var0.fillRect((c_a5.ic >> 1) + 25 - 2 - 15, (c_a5.il >> 1) + 55, 15, 10);
                return;
            case 3:
                var0.fillRect((c_a5.ic >> 1) - 4, (c_a5.il >> 1) + 56, 8, 8);
            }
        }

    }

    private static boolean method_if(int var0) {
        boolean var1 = true;
        int[] var2 = new int[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 42, 35, c_a5.e8.getKeyCode(2), c_a5.e8.getKeyCode(5), c_a5.e8.getKeyCode(1), c_a5.e8.getKeyCode(6), c_a5.e8.getKeyCode(8)};

        for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var0 == var2[var3]) {
                var1 = false;
            }
        }

        return var1;
    }

    public static void method_for() {
        if (++field_try > 100) {
        	field_try = 0;
        }

    }

    public static void a(int var0) {
        byte[] var1 = new byte[1];
        int var2;
        if ((var2 = c_a5.e8.getGameAction(var0)) == 1) {
            if (field_do > 0) {
                --field_do;
            }

        } else if (var2 == 6) {
            if (field_do < field_new.length - 1) {
                ++field_do;
            }

        } else {
            if (var2 == 8) {
                if (field_int == null) {
                	field_do = 1;
                    return;
                }

                if (a == null) {
                	field_do = 2;
                    return;
                }

                field_if[2] = var0;
                var1[0] = (byte)field_byte;
                c_b5.a(field_if, "keyValue");
                c_b5.a(var1, "gamemount");
                if (field_byte == 0) {
                    c_a5.hM = false;
                    c_a5.dU = true;
                } else if (field_byte == 1) {
                    c_a5.hM = false;
                    c_a5.dU = false;
                } else if (field_byte == 2) {
                    c_a5.hM = true;
                    c_a5.dU = true;
                }

                c_a5.gw = c_b5.method_int("keyValue", field_if.length);
                c_a5.method_do((byte)4);
            }

            switch(field_do) {
            case 0:
                if (var2 == 2) {
                    if (field_byte > 0) {
                        --field_byte;
                    } else {
                    	field_byte = 2;
                    }
                } else if (var2 == 5) {
                    if (field_byte < 2) {
                        ++field_byte;
                    } else {
                    	field_byte = 0;
                    }
                }

                String var3 = null;
                switch(field_byte) {
                case 0:
                    var3 = "网络设置:<CMWAP>";
                    break;
                case 1:
                    var3 = "网络设置:<CMNET>";
                    break;
                case 2:
                    var3 = "网络设置:<自动选择>";
                }

                field_new[field_do] = var3;
                return;
            case 1:
                if (method_if(var0)) {
                	field_if[0] = var0;
                    if (var0 == field_if[1]) {
                    	field_do = 2;
                        return;
                    }

                    if (field_int == null) {
                    	field_int = "ok";
                    	field_new[field_do] = field_new[field_do] + field_int;
                    }

                    ++field_do;
                    return;
                }
                break;
            case 2:
                if (method_if(var0)) {
                    if (var0 == field_if[0]) {
                    	field_do = 1;
                        return;
                    }

                    field_if[1] = var0;
                    if (a == null) {
                        a = "ok";
                        field_new[field_do] = field_new[field_do] + a;
                    }

                    ++field_do;
                }
            }

        }
    }

    public static void method_for(int var0) {
        ay var1 = (ay)c_a5.es.cf().elementAt(2);
        ah var2 = (ah)c_a5.es.cf().elementAt(3);
        ah var3 = (ah)c_a5.es.cf().elementAt(4);
        ah var4 = (ah)c_a5.es.cf().elementAt(5);
        ak var5 = (ak)c_a5.es.cf().elementAt(7);
        int var6;
        if ((var6 = c_a5.e8.getGameAction(var0)) == 1 && !var5.q()) {
            if (field_do > 0) {
                --field_do;
            }

            if (!var1.q()) {
                if (var2.q()) {
                    var5.a(true, c_a5.es);
                    var2.a(false, c_a5.es);
                } else if (var3.q()) {
                    var2.a(true, c_a5.es);
                    var3.a(false, c_a5.es);
                } else {
                    if (var4.q()) {
                        var3.a(true, c_a5.es);
                        var4.a(false, c_a5.es);
                    }

                }
            }
        } else if (var6 == 6 && !var5.q()) {
            if (field_do < 3) {
                ++field_do;
            }

            if (var1.q()) {
                var1.a(false, c_a5.es);
                var5.a(true, c_a5.es);
            } else if (var2.q()) {
                var2.a(false, c_a5.es);
                var3.a(true, c_a5.es);
            } else if (var3.q()) {
                var3.a(false, c_a5.es);
                var4.a(true, c_a5.es);
            } else if (!var4.q()) {
                ;
            }
        } else {
            if (var4.q()) {
                if (var6 == 8) {
                    if (field_int == null) {
                    	field_do = 1;
                        var2.a(true, c_a5.es);
                        var4.a(false, c_a5.es);
                        return;
                    }

                    if (a == null) {
                    	field_do = 2;
                        var3.a(true, c_a5.es);
                        var4.a(false, c_a5.es);
                        return;
                    }

                    if (field_for == null) {
                    	field_for = "ok";
                        var4.a(var4.aj() + a);
                    }

                    field_if[2] = var0;
                    return;
                }

                if (c_a5.method_byte(262144)) {
                    method_if();
                    return;
                }
            } else if (var1.q()) {
                if (var6 == 2) {
                    if (field_byte > 0) {
                        --field_byte;
                    } else {
                    	field_byte = 2;
                    }

                    method_int();
                    return;
                }

                if (var6 == 5) {
                    if (field_byte < 2) {
                        ++field_byte;
                    } else {
                    	field_byte = 0;
                    }

                    method_int();
                    return;
                }

                if (c_a5.method_byte(262144)) {
                    method_if();
                    return;
                }
            } else if (var2.q()) {
                if (method_if(var0)) {
                	field_if[0] = var0;
                    if (var0 == field_if[1]) {
                        var2.a(false, c_a5.es);
                        var3.a(true, c_a5.es);
                        return;
                    }

                    if (field_int == null) {
                    	field_int = "ok";
                        var2.a(var2.aj() + field_int);
                    }

                    var2.a(false, c_a5.es);
                    var3.a(true, c_a5.es);
                    return;
                }
            } else if (var3.q()) {
                if (method_if(var0)) {
                    if (var0 == field_if[0]) {
                        var3.a(false, c_a5.es);
                        var2.a(true, c_a5.es);
                        return;
                    }

                    field_if[1] = var0;
                    if (a == null) {
                        a = "ok";
                        var3.a(var3.aj() + a);
                    }

                    var3.a(false, c_a5.es);
                    var4.a(true, c_a5.es);
                    return;
                }
            } else if (var5.q()) {
                c_a5.es.cw();
            }

        }
    }

    public static void method_do(int var0) {
        ay var1 = (ay)c_a5.es.cf().elementAt(2);
        ak var2 = (ak)c_a5.es.cf().elementAt(7);
        var0 = c_a5.e8.getGameAction(var0);
        if (var1.q()) {
            if (var0 == 1) {
                return;
            }

            if (var0 != 6) {
                if (var0 == 2) {
                    if (field_byte > 0) {
                        --field_byte;
                    } else {
                    	field_byte = 2;
                    }

                    method_int();
                    return;
                }

                if (var0 == 5) {
                    if (field_byte < 2) {
                        ++field_byte;
                    } else {
                    	field_byte = 0;
                    }

                    method_int();
                    return;
                }

                if (c_a5.method_byte(262144)) {
                    method_if();
                    return;
                }

                return;
            }

            var1.a(false, c_a5.es);
        } else if (var2.q()) {
            c_a5.es.cw();
            return;
        }

        var2.a(true, c_a5.es);
    }

    public static void method_int() {
        ay var0 = (ay)c_a5.es.cf().elementAt(2);
        byte var1 = 0;
        switch(field_byte) {
        case 0:
            var1 = 1;
            break;
        case 1:
            var1 = 2;
            break;
        case 2:
            var1 = 0;
        }

        var0.method_case((byte)var1);
        ((ak)c_a5.es.cf().elementAt(7)).method_if(c_bm.al[var1]);
    }

    public static void method_if() {
        byte[] var0 = new byte[1];
        int[] var1;
        if (!c_a5.gZ && (var1 = c_b5.method_int("keyValue", field_if.length)) != null) {
            int var2 = 0;

            for(int var3 = var1.length; var2 < var3; ++var2) {
                if (field_if[var2] != 0) {
                    var1[var2] = field_if[var2];
                }
            }

            c_b5.a(var1, "keyValue");
            c_a5.gw = c_b5.method_int("keyValue", field_if.length);
        }

        var0[0] = (byte)field_byte;
        c_b5.a(var0, "gamemount");
        if (field_byte == 0) {
            c_a5.hM = false;
            c_a5.dU = true;
        } else if (field_byte == 1) {
            c_a5.hM = false;
            c_a5.dU = false;
        } else if (field_byte == 2) {
            c_a5.hM = true;
            c_a5.dU = true;
        }

        if (c_be.g8) {
            if (c_a5.method_case() == 11) {
                c_a5.method_do((byte)11);
            } else {
                c_a5.method_do((byte)4);
            }

            c_be.g8 = false;
        } else {
            c_a5.method_do((byte)4);
        }
    }

    public static void a() {
        if (c_a5.gZ && c_a5.method_byte(268435456)) {
            int var0 = c_a5.ic - (c_a5.iA + 4 << 1);
            int var1 = c_a5.il - 18;
            int var2 = c_a5.iA + 4 << 1;
            ay var3 = (ay)c_a5.es.cf().elementAt(2);
            if (c_a5.a(var0, var1, var2, 18)) {
                method_if();
            }

            var0 = var3.k;
            if (var3.d7 != null && !var3.d7.equals("")) {
                var0 += var3.d7.length() * c_a5.iA + 8;
            }

            if (c_a5.a(var0, var3.j, c_a5.eb.getWidth(), c_a5.eb.getHeight())) {
                if (field_byte > 0) {
                    --field_byte;
                } else {
                	field_byte = 2;
                }

                method_int();
                return;
            }

            if (c_a5.a(var0 + c_a5.eb.getWidth() + 8 + c_b5.method_do((String)var3.d9.elementAt(field_do)), var3.j, c_a5.eb.getWidth(), c_a5.eb.getHeight())) {
                if (field_byte < 2) {
                    ++field_byte;
                } else {
                	field_byte = 0;
                }

                method_int();
            }
        }

    }

    public static void method_do() {
    	field_int = null;
        a = null;
        field_for = null;
        field_if = new int[3];
    }
}
