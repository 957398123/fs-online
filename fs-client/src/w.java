import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/20
 */
public final class w extends c_t {
    private byte b4 = 0;
    public static boolean ca = false;
    public static String[] b6 = null;
    public static int b7;
    public static int cc;
    public static int[] b9;
    public static int[] b3;
    private static byte b5;
    public static boolean cd;
    private static boolean cb;
    private static int b8;
    private static short b2;

    public w() {
    }

    public w(byte var1, byte var2) {
        super(var1, var2);
    }

    public final void method_goto(byte var1) {
        b4 = var1;
    }

    public final byte Q() {
        return b4;
    }

    public final void method_if(Graphics var1) {
        super.method_if(var1);
    }

    public final void method_int(Graphics var1) {
        int var2 = (var1.getFont().stringWidth(method_byte()) >> 1) + c_a5.b9.field_try;
        int var3 = c_a5.iG + bz.bf - M() + (method_int().length() == 0 ? 0 : c_a5.iG);
        byte var4 = 0;
        switch(b4) {
        case 1:
            var4 = 0;
            break;
        case 2:
            var4 = 1;
            break;
        case 3:
            var4 = 4;
            break;
        case 4:
            var4 = 2;
            break;
        case 5:
            var4 = 5;
            break;
        case 6:
            var4 = 3;
        }

        c_a5.b9.method_if(var1, super.o - var2, super.n - var3, var4);
    }

    public final void a(Graphics var1) {
        super.a(var1);
    }

    public static void method_new(Graphics var0) {
        if (ca) {
            var0.setColor(0);
            int var1 = (c_a5.ic - b7) / 2;
            int var2 = (c_a5.il - cc) / 6;
            var0.drawRoundRect(var1, var2, b9[b5], b3[b5], 12, 12);
            var0.setColor(16777215);
            var0.fillRoundRect(var1 + 1, var2 + 1, b9[b5] - 1, b3[b5] - 1, 12, 12);
            int var3 = var1 + 5;
            int var4 = var2 + 2;
            boolean var5 = false;
            int var13 = b6.length;
            int var6 = var0.getClipX();
            int var7 = var0.getClipY();
            int var8 = var0.getClipWidth();
            int var9 = var0.getClipHeight();
            var0.setClip(var1, var2, b9[b5], b3[b5]);
            var1 = 0;

            for(var2 = 0; var1 < var13; ++var2) {
                int var10 = 0;
                char[] var11 = b6[var1].toCharArray();

                for(int var12 = 0; var12 < var11.length; ++var12) {
                    if (c_b5.c[var1][var12] == 0) {
                        var0.setColor(0);
                    } else {
                        var0.setColor(65280);
                    }

                    var0.drawChar(var11[var12], var3 + var10, var4 + 3 + var2 * (c_a5.iG + 1), 20);
                    var10 += c_a5.fq.charWidth(var11[var12]);
                }

                ++var1;
            }

            var0.setClip(var6, var7, var8, var9);
        }

    }

    public static void P() {
        if (ca) {
            ++b8;
            if (cd && cb) {
                if (--b5 == 0) {
                    b8 = 0;
                    ca = false;
                    b5 = 0;
                    cd = false;
                    cb = false;
                    return;
                }
            } else {
                if (b8 < 10) {
                    b5 = (byte)b8;
                    return;
                }

                b9[9] = b7;
                b3[9] = cc;
                cb = true;
            }
        }

    }

    static {
        b7 = c_a5.iA * 7 + 18;
        cc = 0;
        b9 = new int[10];
        b3 = new int[10];
        b5 = 0;
        cd = false;
        cb = false;
        b8 = 0;
        b2 = 0;
    }
}
