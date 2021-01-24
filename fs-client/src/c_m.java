import javax.microedition.lcdui.Graphics;
/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class c_m {
    private byte G;
    private String Z;
    public byte A = -1;
    private short E = -1;
    private int k;
    private byte Q;
    private byte e = -1;
    private byte O = -1;
    private boolean n = true;
    private byte x = -1;
    private boolean c;
    public int J = -1;
    public short K = -1;
    public short I = -1;
    private String C = "";
    public int q = 0;
    public long aa = 0L;
    public byte Y = 0;
    public short w = 0;
    public short field_else = 0;
    public String m = null;
    public int L = -1;
    private boolean field_long = false;
    private short U = -1;
    private short field_for = -1;
    private int o = -1;
    private int M = -1;
    private int N = -1;
    private int field_byte = -1;
    private int S;
    public long field_char = -1L;
    public short B = -1;
    public byte g = -1;
    public byte v = -1;
    public short f = -1;
    public byte y = -1;
    public int r = -1;
    public int i = -1;
    public String l;
    private int R = 0;
    private int field_void = 0;
    private int u = 0;
    private static int s = 45;
    private static int a = 8;

    public final byte g() {
        return O;
    }

    public final void method_for(byte var1) {
        O = var1;
    }

    public final void method_if(short var1) {
        E = var1;
    }

    public final boolean a() {
        return n;
    }

    public final void a(boolean var1) {
        n = var1;
    }

    public final byte method_long() {
        return x;
    }

    public final void method_do(byte var1) {
        x = var1;
    }

    public final boolean method_new() {
        return c;
    }

    public final void method_if(boolean var1) {
        c = var1;
    }

    public final void method_if(String var1) {
        C = var1;
    }

    public static String a(int var0) {
        if (var0 == 0) {
            return "";
        } else {
            int var1;
            for(var1 = 0; (var0 >>= 1) != 0; ++var1) {
            }

            return c_a5.f9[var1];
        }
    }

    public c_m(String var1, byte var2, byte var3, int var4) {
        Z = var1;
        G = var2;
        Q = var3;
        S = c_a5.fq.stringWidth(Z);
        if (S > var4 - 6) {
            S = var4 - 6;
        }

    }

    public c_m(byte var1) {
        G = var1;
    }

    public final String method_case() {
        return Z;
    }

    public final void a(String var1) {
        Z = var1;
    }

    public final void a(byte var1) {
        G = 4;
    }

    public final void a(Graphics var1, int var2, int var3, int var4, af var5, boolean var6, boolean var7) {
        int var8;
        int var9;
        int var10;
        int var13;
        short var17;
        switch(G) {
        case 0:
        case 5:
            if (var6 && G == 0) {
                var1.setColor(c_bm.field_try);
            } else {
                var13 = 0;
                switch(Q) {
                case 0:
                    var13 = c_bm.bP;
                    break;
                case 1:
                    var13 = c_bm.bP;
                    break;
                case 2:
                    var13 = c_bm.c0[0];
                    break;
                case 3:
                    var13 = 0;
                    break;
                case 4:
                    var13 = c_bm.c0[2];
                    break;
                case 5:
                    var13 = c_bm.c0[3];
                    break;
                case 6:
                    var13 = c_bm.c0[4];
                    break;
                case 7:
                    var13 = c_bm.c0[5];
                    break;
                case 8:
                    var13 = c_bm.c0[6];
                }

                var1.setColor(var13);
            }

            if (var6) {
                c_b5.a(var1, Z, var2, var3, var4 - 6, (byte)0, (byte)3);
                return;
            }

            if (6 + c_b5.method_do(Z) <= var4) {
                var1.drawString(Z, var2, var3, 20);
                return;
            }

            var13 = 1;

            for(var8 = c_b5.method_do(Z.substring(0, 1)); var8 < var4; var8 = c_b5.method_do(Z.substring(0, var13))) {
                ++var13;
                if (var13 > Z.length()) {
                    break;
                }
            }

            --var13;
            var1.drawString(Z.substring(0, var13) + "...", var2, var3, 20);
            return;
        case 1:
            if (var6) {
                var1.setColor(c_bm.field_try);
            } else {
                var1.setColor(c_bm.bP);
            }

            byte var16 = -1;
            switch(e) {
            case 1:
                var16 = 5;
                break;
            case 2:
                var16 = 6;
                break;
            case 3:
                var16 = 3;
                break;
            case 4:
                var16 = 4;
                break;
            case 5:
                var16 = 0;
                break;
            case 6:
                var16 = 1;
                break;
            case 7:
                var16 = 2;
                break;
            case 8:
                var16 = 6;
            }

            c_a5.eq.method_if(var1, var2, var3, var16);
            if (var6) {
                c_b5.a(var1, Z, var2 + c_a5.eq.field_try + 4, var3, var4 - 6 - c_a5.eq.field_try - 4, (byte)0, (byte)3);
                return;
            }

            if (6 + c_a5.eq.field_try + 4 + c_b5.method_do(Z) <= var4) {
                var1.drawString(Z, var2 + c_a5.eq.field_try + 4, var3, 20);
                return;
            }

            var8 = var4 / c_a5.iA - 1;
            var1.drawString(Z.substring(0, var8) + "...", var2 + c_a5.eq.field_try + 4, var3, 20);
            return;
        case 2:
            var17 = 0;
            if (var5 != null) {
                var17 = var5.method_for();
            }

            var13 = 27 * c_a5.ic / 176;
            var9 = 14 * c_a5.il / 208;
            if (var6) {
                c_b5.a(var1, var2 + var13 + 1, var3, var4 - var13 - var17 - 1, var9, c_bm.bP);
                var1.setColor(c_bm.field_try);
            } else {
                c_b5.a(var1, var2 + var13 + 1, var3, var4 - var13 - var17 - 1, var9, c_bm.dw);
                var1.setColor(c_bm.bP);
            }

            var1.drawString(m, var2 + var13 + 3, var3, 20);
            if (field_long) {
                String var18 = "（队长）";
                if (c_bu.e == 2) {
                    var18 = "（团长）";
                }

                var1.drawString(var18, var2 + var13 + 3 + var1.getFont().stringWidth(m), var3, 20);
            }

            var1.setColor(c_bm.bP);
            var1.drawLine(var2, var3 - 1, var2 + var4 - var17 - 1, var3 - 1);
            var1.drawLine(var2, var3 + var9, var2 + var4 - var17 - 1, var3 + var9);
            var1.drawLine(var2 + var13, var3, var2 + var13, var3 + var9);
            if (var17 != 0) {
                var1.drawLine(var2 + var4 - var17 - 1, var3, var2 + var4 - var17 - 1, var3 + var9);
            }

            c_a5.hL.method_if(var1, var2 + 1, var3 + (var9 - c_a5.hL.a >> 1), U);
            var10 = var2 + 15;
            var4 = var3 + (var9 - c_a5.dY.a >> 1);
            c_b5.a(var1, c_a5.dY, (long)field_for, var10, var4);
            String var14 = "生命";
            var8 = var2 + 2 + var1.getFont().stringWidth(var14);
            int var19 = c_a5.dY.field_try * 11 + 12;
            var1.drawString("生命", var2 + 1, var3 + var9 + 1, 20);
            int var15;
            var10 = ((var15 = String.valueOf(o).length() + String.valueOf(M).length()) + 1) * c_a5.dY.field_try + var15 + 2;
            c_b5.method_do(var1, o, M, var8 + (var19 - var10 >> 1), var3 + 1 + var9 + (var9 - c_a5.dY.a >> 1));
            var14 = "法力";
            var1.drawString(var14, var2 + 1, var3 + (var9 << 1), 20);
            var10 = ((var15 = String.valueOf(N).length() + String.valueOf(field_byte).length()) + 1) * c_a5.dY.field_try + var15 + 2;
            c_b5.method_do(var1, N, field_byte, var8 + (var19 - var10 >> 1), var3 + (var9 << 1) + (var9 - c_a5.dY.a >> 1));
            var8 += var19 + 2;
            var4 = (var2 = s * c_a5.ic / 176) - 2;
            var13 = a - 2;
            c_b5.method_if(var1, var8, var3 + 1 + var9 + (var9 - a >> 1), var2, a, c_bm.bP);
            c_b5.method_if(var1, var8, var3 + (var9 << 1) + (var9 - a >> 1), var2, a, c_bm.bP);
            c_b5.a(var1, var8 + 1, var3 + 1 + var9 + (var9 - a >> 1) + 1, Math.min(o * var4 / M, var4), var13, 15728640);
            c_b5.a(var1, var8 + 1, var3 + 1 + (var9 << 1) + (var9 - a >> 1), Math.min(N * var4 / field_byte, var4), var13, 18416);
            return;
        case 3:
            var1.setColor(c_bm.bP);
            var1.drawString(Z, var2, var3, 20);
            c_b5.a(var1, (long)k, c_a5.fq.stringWidth(Z) + var2, var3 + (c_a5.iG - c_a5.dY.a >> 1));
            return;
        case 4:
            var17 = 0;
            if (var5 != null) {
                var17 = var5.method_for();
            }

            var9 = var4 - var17 - 4 - 2 >> 1;
            var10 = var2 + 2;
            var13 = var10 + var9 + 2;
            var8 = c_a5.fq.stringWidth(Z);
            short var11 = (short)(c_a5.iG + 9);
            if (var6) {
                var1.setColor(c_bm.bP);
                c_b5.a(var1, var10 - 1 + (var9 - var8 >> 1), var3 + 1, var8 + 2, var11 - 2, c_bm.bP);
                var1.setColor(c_bm.field_try);
            } else {
                var1.setColor(c_bm.bP);
            }

            var1.drawString(Z, var10 + (var9 - var8 >> 1), var3 + (var11 - c_a5.iG >> 1), 20);
            c_b5.method_if(var1, var13 + 1, var3 + 1, var9 - 2, var11 - 2, c_bm.ci);
            var6 = true;
            var10 = c_bm.y;
            if (var7) {
                var6 = false;
                if (c_a5.ht % 4 > 1) {
                    var10 = 16777215;
                }
            }

            c_b5.a(var1, var13 + 2, var3 + 2, var9 - 4, var11 - 4, var10);
            if (var6) {
                var1.setColor(c_bm.bP);
                var1.drawString(C, var13 + (var9 - c_a5.fq.stringWidth(C) >> 1), var3 + (var11 - c_a5.iG >> 1), 20);
                return;
            }
        case 6:
        default:
            break;
        case 7:
            if (var6) {
                if (c) {
                    var1.setColor(c_bm.field_try);
                } else {
                    var1.setColor(8224125);
                }
            } else if (c) {
                var1.setColor(c_bm.bP);
            } else {
                var1.setColor(8224125);
            }

            if (var6) {
                c_b5.a(var1, Z, var2, var3, var4 - 6, (byte)0, (byte)3);
                return;
            }

            if (6 + c_b5.method_do(Z) <= var4) {
                var1.drawString(Z, var2, var3, 20);
                return;
            }

            var13 = var4 / c_a5.iA - 1;
            var1.drawString(Z.substring(0, var13) + "...", var2, var3, 20);
            return;
        case 8:
            var17 = E;
            var1.setColor(c_bm.O[var17 / 1000 - 1][0]);
            var1.fillRect(var2, var3, c_a5.gg.field_try, c_a5.gg.a);
            short var12 = c_r.k((short)(var17 % 1000));
            c_a5.gg.method_if(var1, var2, var3, var12);
            var1.setColor(c_bm.O[var17 / 1000 - 1][1]);
            var1.drawRect(var2 - 1, var3 - 1, c_a5.gg.field_try + 1, c_a5.gg.a + 1);
            if (var6 && G == 8) {
                var1.setColor(c_bm.field_try);
            } else {
                var1.setColor(c_bm.bP);
            }

            if (var6) {
                c_b5.a(var1, Z, var2 + c_a5.gg.field_try + 4, var3, var4 - 6, (byte)0, (byte)3);
                return;
            }

            if (6 + c_b5.method_do(Z) <= var4) {
                var1.drawString(Z, var2 + c_a5.gg.field_try + 4, var3, 20);
                return;
            }

            var9 = var4 / c_a5.iA - 1;
            var1.drawString(Z.substring(0, var9) + "...", var2 + c_a5.gg.field_try + 4, var3, 20);
            return;
        case 9:
            if (var6 && G == 9) {
                var1.setColor(u);
            } else {
                var1.setColor(c_bm.bP);
            }

            if (var6) {
                c_b5.a(var1, Z, var2, var3, var4 - 6, (byte)0, (byte)3);
                return;
            }

            if (6 + c_b5.method_do(Z) <= var4) {
                var1.drawString(Z, var2, var3, 20);
                return;
            }

            var8 = var4 / c_a5.iA - 1;
            var1.drawString(Z.substring(0, var8) + "...", var2, var3, 20);
        }

    }

    public static short method_else() {
        return (short)(44 * c_a5.il / 208);
    }

    public static short method_do() {
        return (short)(c_a5.iG + 9);
    }

    public final byte method_char() {
        return e;
    }

    public final void method_int(byte var1) {
        e = var1;
    }

    public final void a(String var1, int var2, boolean var3, byte var4, short var5, int var6, int var7, int var8, int var9) {
        m = var1;
        L = var2;
        field_long = var3;
        U = (short)var4;
        field_for = var5;
        o = var6;
        M = var7;
        N = var8;
        field_byte = var9;
    }

    public final void a(String var1, long var2, short var4, byte var5, byte var6, short var7, byte var8, int var9, int var10, byte var11) {
        Z = var1;
        field_char = var2;
        B = var4;
        g = var5;
        v = var6;
        Q = (byte)(var6 + 2);
        c_r.E(v);
        f = var7;
        y = var8;
        r = var9;
        i = var10;
        switch(var11) {
        case 0:
            l = "很短";
            return;
        case 1:
            l = "短";
            return;
        case 2:
            l = "中";
            return;
        case 3:
            l = "长";
            return;
        case 4:
            l = "很长";
        default:
        }
    }

    public final void method_if(int var1) {
        k = var1;
    }

    public final int method_int() {
        return S;
    }

    public final int b() {
        return R;
    }

    public final void method_int(int var1) {
        R = var1;
    }

    public final int e() {
        return field_void;
    }

    public final void method_new(int var1) {
        field_void = var1;
    }

    public final void method_do(int var1) {
        u = var1;
    }
}
