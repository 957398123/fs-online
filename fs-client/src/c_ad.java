import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2020/01/22
 * @author 95739
 *
 */
public final class c_ad {
    public static byte a = 1;
    private static String[] e = new String[]{"", "[私]", "[世]", "[族]", "[场]", "[队]", "[系]", "", "", "", "", "[喇]"};
    private static int d = 0;
    private static String[] v = new String[0];
    private static int[][] u = new int[0][];
    private static String[] E = new String[3];
    private static int[][] w = new int[3][];
    public static short I = 4095;
    private static int A = 0;
    private static int q = 0;
    private static int B = 0;
    public static Image field_long = null;
    private static Graphics J = null;
    public static final int m;
    private long field_char = 0L;
    public static int k;
    public static byte field_new;
    public static long field_if;
    private int s = 0;
    private int t = 0;
    static int b;
    private static String j;
    private static int y;
    private static int field_byte;
    private static String C;
    private static int H;
    private static byte field_goto;
    private static int field_else;
    private static String[] field_int;
    private static int[][] n;
    private static String[] field_case;
    private static int[][] f;
    private static int[] g;

    public c_ad() {
    	method_do();
    }

    private static void method_do() {
        J = (field_long = Image.createImage(c_a5.ic, m)).getGraphics();

        for(int var0 = 0; var0 < 3; ++var0) {
            E[var0] = "";
        }

        method_for();
    }

    public static void method_int() {
        a3.t = new String[0];
        a3.u = new String[0];
        a3.ak = new int[0];
        a3.aB = new byte[0];
        a3.aE = new Object[0];
        a3.W = new Object[0];
        a3.ai = new String[5][0];
        a3.z = new String[5][0];
        a3.aq = new int[5][0];
        a3.field_int = new Object[5][0];
        a3.H = new Object[5][0];
        a3.d = new String[0];
        a3.af = new String[0];
        a3.y = new int[0];
        a3.aH = new byte[0];
        a3.as = new Object[0];
        a3.field_long = new Object[0];
        a3.aI = new String[0];
        a3.aJ = new String[0];
        a3.s = new int[0];
        a3.K = new byte[0];
        a3.field_if = new Object[0];
        a3.l = new Object[0];
        a3.field_new = new String[0];
        a3.field_for = new int[0];
        a3.c = new int[0];
        v = new String[0];
        u = new int[0][];
        E = new String[3];
        w = new int[3][];
        field_long = null;
    }

    public static byte[] a(int var0) {
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 655361:
            a3.Q = a3.Q.replace('\n', ' ').replace('\r', ' ');
            var1.a(a3.T);
            var1.method_do(a3.aD);
            var1.method_if(a3.Q);
            int var2 = a3.ag.length;
            var1.a((byte)var2);
            c_b5.method_case("UIChat.chatSendGoods.length" + a3.ag.length);

            for(var0 = 0; var0 < a3.ag.length; ++var0) {
                Vector var3 = a3.ag[var0];
                var1.a((Short)var3.elementAt(0));
                var1.a((Byte)var3.elementAt(1));
                var1.a((Byte)var3.elementAt(2));
            }

            a3.Q = "";
            a3.ag = new Vector[0];
            break;
        case 655362:
            var1.a(I);
            break;
        case 655363:
            var1.a(field_if);
            var1.method_do(k);
            var1.a(field_new);
            if (field_new == 20) {
                c_bv.jI = (int)field_if;
            }

            k = -1;
            field_if = -1L;
            field_new = 0;
            am.a = false;
            c_a5.fR = true;
        }

        c_b5.a(var1.field_do.length);
        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        switch(var0) {
        case -2146828287:
            byte var10 = var1.method_if();
            int var2 = var1.method_byte();
            int var3 = var1.method_byte();
            String var4 = var1.method_goto();
            String var5 = var1.method_goto();
            byte var6 = var1.method_if();
            Vector[] var7 = null;
            Vector var9;
            if (var6 > 0) {
                var7 = new Vector[var6];

                for(int var8 = 0; var8 < var6; ++var8) {
                    (var9 = new Vector()).addElement(new Short(var1.method_new()));
                    var9.addElement("[" + var1.method_goto() + "]");
                    var9.addElement(new Long(var1.method_char()));
                    var9.addElement(new Byte(var1.method_if()));
                    var9.addElement(new Byte(var1.method_if()));
                    var7[var8] = var9;
                }
            }

            String var12 = null;
            var9 = new Vector();
            if (var10 == 1) {
                if (bp.ag().method_new() == var2) {
                    var9.addElement(new Integer(5));
                    var12 = "你对" + var4 + "说";
                    var2 = var3;
                } else {
                    var9.addElement(new Integer(3));
                    var12 = var4 + "对你说";
                }

                var9.addElement(new Integer(var4.length()));
            } else {
                if (var4 != null && var4.length() != 0 && bp.ag().method_new() != var2) {
                    var9.addElement(new Integer(3));
                    var9.addElement(new Integer(var4.length()));
                } else {
                    var9 = null;
                }

                var12 = var4;
            }

            if (var10 <= 5 && (var5 = method_if(var5, var2)).length() != 0) {
                a(var4, var2);
            }

            String var11 = a(e[var10], var12, var5, var7);
            method_int(var10, var11, var2, var4, var9, var7);
            return;
        case -2146828286:
            I = var1.method_new();
            c_b5.method_case("channelOpen" + I);
            return;
        case -2146828285:
            System.out.println("接收喇叭文字滚动速度");
            field_goto = var1.method_if();
            return;
        case -2146828282:
            bo.j = true;
            a7.fF = 23;
        case -2146828284:
        case -2146828283:
        default:
        }
    }

    private static final String a(String var0, String var1, String var2, Vector[] var3) {
        var0 = var0 + var1 + (var1.equals("") ? "" : ":");
        if (var3 != null) {
            int var10 = 0;
            StringBuffer var11 = new StringBuffer(var2);
            int var4 = var0.length();

            for(int var5 = 0; var5 < var3.length; ++var5) {
                Vector var6;
                short var7 = (Short)(var6 = var3[var5]).elementAt(0);
                var6.setElementAt(new Short((short)(var7 + var10 + var4)), 0);
                String var8 = (String)var6.elementAt(1);
                var11.insert(var10 + var7, var8);
                var10 += var8.length();
                var7 = (Short)var6.elementAt(0);
                int var13 = var8.length();
                byte var9 = (Byte)var6.elementAt(4);
                int[] var12 = new int[]{var7, var7 + var13 - 1, c_bm.c0[var9]};
                var6.addElement(var12);
            }

            var2 = var11.toString();
        }

        return var0 + var2;
    }

    private static final void a(String var0, int var1) {
        if (var1 != bp.ag().method_new() && var1 != 0 && var0 != null && !var0.equals("")) {
            for(int var2 = a3.field_for.length - 1; var2 >= 0; --var2) {
                if (a3.field_for[var2] == var1) {
                    return;
                }
            }

            a3.field_for = c_b5.a(a3.field_for, 0, var1);
            a3.field_new = c_b5.a(a3.field_new, 0, var0);
            if (a3.field_for.length > 4) {
                a3.field_for = c_b5.a(a3.field_for, a3.field_for.length - 1);
                a3.field_new = c_b5.a(a3.field_new, a3.field_new.length - 1);
            }

        }
    }

    public static void method_int(byte var0, String var1, int var2, String var3, Vector var4, Vector[] var5) {
        boolean var6 = true;
        switch(var0) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            var6 = false;
            byte var7 = (byte)(var0 - 1);
            if (var1 != null && !var1.equals("")) {
                a3.ai[var7] = c_b5.a(a3.ai[var7], 0, var1);
                a3.aq[var7] = c_b5.a(a3.aq[var7], 0, var2);
                a3.z[var7] = c_b5.a(a3.z[var7], 0, var3);
                a3.field_int[var7] = c_b5.a(a3.field_int[var7], 0, var5);
                a3.H[var7] = c_b5.a(a3.H[var7], 0, var4);
                if (a3.ai[var7].length > 10) {
                    a3.ai[var7] = c_b5.a(a3.ai[var7], a3.ai[var7].length - 1);
                    a3.aq[var7] = c_b5.a(a3.aq[var7], a3.aq[var7].length - 1);
                    a3.z[var7] = c_b5.a(a3.z[var7], a3.z[var7].length - 1);
                    a3.field_int[var7] = c_b5.a(a3.field_int[var7], a3.field_int[var7].length - 1);
                    a3.H[var7] = c_b5.a(a3.H[var7], a3.H[var7].length - 1);
                }

                if (c_be.gu != null && c_be.gu.C == var7) {
                    if ((c_be.gu.m == 2 || c_be.gu.m == 3 || c_be.gu.m == 4) && ++c_be.gu.n > a3.ai[var7].length - 1) {
                    	c_be.gu.n = (byte)(a3.ai[var7].length - 1);
                    	c_be.gu.G = null;
                    	c_be.gu.a((byte)2);
                    }

                    c_be.gu.k = a3.ai[var7];
                    c_be.gu.method_try();
                }
            }
        case 6:
            if (var6) {
                a(var0, var1, var2, var3, var4, var5);
            }
            break;
        case 7:
            a(var1);
            return;
        case 8:
            method_if(var0, var1, var2, var3, var4, var5);
            a(var1, var5);
            a(var0, var1, var2, var3, var4, var5);
            return;
        case 9:
            j = var1;
            b = c_a5.ic;
            y = c_a5.fq.stringWidth(var1);
            a(var0, var1, var2, var3, var4, var5);
            return;
        case 10:
            break;
        case 11:
            if (var1 != null && !var1.equals("")) {
                a3.aI = c_b5.a(a3.aI, 0, var1);
                a3.s = c_b5.a(a3.s, 0, var2);
                a3.aJ = c_b5.a(a3.aJ, 0, var3);
                a3.K = c_b5.a(a3.K, 0, var0);
                a3.field_if = c_b5.a(a3.field_if, 0, var5);
                a3.l = c_b5.a(a3.l, 0, var4);
                if (a3.aI.length > (c_a5.d8 ? 20 : 10)) {
                    a3.aI = c_b5.a(a3.aI, a3.aI.length - 1);
                    a3.s = c_b5.a(a3.s, a3.s.length - 1);
                    a3.aJ = c_b5.a(a3.aJ, a3.aJ.length - 1);
                    a3.K = c_b5.method_if(a3.K, a3.K.length - 1);
                    a3.field_if = c_b5.a(a3.field_if, a3.field_if.length - 1);
                    a3.l = c_b5.a(a3.l, a3.l.length - 1);
                }

                if (c_be.gu != null && c_be.gu.C == 6) {
                    if ((c_be.gu.m == 2 || c_be.gu.m == 3 || c_be.gu.m == 4) && ++c_be.gu.n > a3.aI.length - 1) {
                    	c_be.gu.n = (byte)(a3.aI.length - 1);
                    	c_be.gu.G = null;
                    	c_be.gu.a((byte)2);
                    }

                    c_be.gu.k = a3.aI;
                    c_be.gu.method_try();
                }
            }

            method_if(var0, var1, var2, var3, var4, var5);
            C = var1;
            field_byte = c_a5.ic;
            H = c_a5.fq.stringWidth(var1);
            return;
        default:
            return;
        }

        method_if(var0, var1, var2, var3, var4, var5);
        int[] var10 = method_if(var0, var1, var5);
        if (d > 0) {
            u = c_b5.a(u, u.length, var10);
            if ((v = c_b5.a(v, v.length, var1)).length > 10) {
                u = c_b5.a(u, 0);
                v = c_b5.a(v, 0);
            }

        } else {
            a(var1, var10);
        }
    }

    public final void method_if() {
    	//TODO 需要反编译
        // $FF: Couldn't be decompiled
    	if ((!c_a5.fR) && (this.t <= 20))
        {
          long l = System.currentTimeMillis() - this.field_char;
          this.field_char = System.currentTimeMillis();
          this.t += 1;
          if (l < 89L)
          {
            this.s += 1;
            if (this.s > 10);
          }
        }
        if ((c_ad.b = b - 3) + y <= 0)
          j = null;
        if ((c_ad.field_byte = field_byte - field_goto) + H <= 0)
          C = null;
        if (a == 1)
          if (q <= B)
          {
            if (!a())
              B = 0;
          }
          else if (A > 0)
            A -= 1;
          else if (q != 0)
            a();
        if (--d < 0)
        {
          d = 0;
          if (v.length > 0)
          {
            a(v[0], u[0]);
            u = c_b5.a(u, 0);
            v = c_b5.a(v, 0);
          }
        }
        if ((field_case.length == 0) || (f.length == 0))
          return;
        int i = c_a5.iG;
        if (((c_ad.field_else = field_else - 2) + i < c_a5.il - 36) && (field_case.length != 0))
        {
          field_case = c_b5.a(field_case, 0);
          f = c_b5.a(f, 0);
          n = new int[0][];
          if ((field_case.length == 0) || (f.length == 0))
            return;
          field_int = c_b5.a(field_case[0], c_a5.ic - 4, c_a5.fq);
          g = f[0];
          n = a(field_int, g);
          field_else = c_a5.il;
        }
    }

    private static boolean a() {
        int var0;
        if ((var0 = Math.min(4, Math.abs(B - q))) != 4) {
            return false;
        } else {
            q += B > q ? var0 : -var0;
            return true;
        }
    }

    private static void method_if(byte var0, String var1, int var2, String var3, Vector var4, Vector[] var5) {
        if (var1 != null && !var1.equals("")) {
            a3.t = c_b5.a(a3.t, 0, var1);
            a3.ak = c_b5.a(a3.ak, 0, var2);
            a3.u = c_b5.a(a3.u, 0, var3);
            a3.aB = c_b5.a(a3.aB, 0, var0);
            a3.aE = c_b5.a(a3.aE, 0, var5);
            a3.W = c_b5.a(a3.W, 0, var4);
            if (a3.t.length > 20) {
                a3.t = c_b5.a(a3.t, a3.t.length - 1);
                a3.ak = c_b5.a(a3.ak, a3.ak.length - 1);
                a3.u = c_b5.a(a3.u, a3.u.length - 1);
                a3.aB = c_b5.method_if(a3.aB, a3.aB.length - 1);
                a3.aE = c_b5.a(a3.aE, a3.aE.length - 1);
                a3.W = c_b5.a(a3.W, a3.W.length - 1);
            }

            if (c_be.gu != null && c_be.gu.C == 100) {
                if ((c_be.gu.m == 2 || c_be.gu.m == 3 || c_be.gu.m == 4) && ++c_be.gu.n > a3.t.length - 1) {
                	c_be.gu.n = (byte)(a3.t.length - 1);
                	c_be.gu.G = null;
                	c_be.gu.a((byte)2);
                }

                c_be.gu.k = a3.t;
                c_be.gu.method_try();
            }

        }
    }

    private static void a(byte var0, String var1, int var2, String var3, Vector var4, Vector[] var5) {
        if (var1 != null && !var1.equals("")) {
            a3.d = c_b5.a(a3.d, 0, var1);
            a3.y = c_b5.a(a3.y, 0, var2);
            a3.af = c_b5.a(a3.af, 0, var3);
            a3.aH = c_b5.a(a3.aH, 0, var0);
            a3.as = c_b5.a(a3.as, 0, var5);
            a3.field_long = c_b5.a(a3.field_long, 0, var4);
            if (a3.d.length > (c_a5.d8 ? 20 : 10)) {
                a3.d = c_b5.a(a3.d, a3.d.length - 1);
                a3.y = c_b5.a(a3.y, a3.y.length - 1);
                a3.af = c_b5.a(a3.af, a3.af.length - 1);
                a3.aH = c_b5.method_if(a3.aH, a3.aH.length - 1);
                a3.as = c_b5.a(a3.as, a3.as.length - 1);
                a3.field_long = c_b5.a(a3.field_long, a3.field_long.length - 1);
            }

            if (c_be.gu != null && c_be.gu.C == 5) {
                if ((c_be.gu.m == 2 || c_be.gu.m == 3 || c_be.gu.m == 4) && ++c_be.gu.n > a3.d.length - 1) {
                	c_be.gu.n = (byte)(a3.d.length - 1);
                	c_be.gu.G = null;
                	c_be.gu.a((byte)2);
                }

                c_be.gu.k = a3.d;
                c_be.gu.method_try();
            }

        }
    }

    public static final void a(String var0) {
        c_ao.bX = var0;
        c_ao.b3 = 0;
        c_ao.ch = 0;
        c_ao.cg = true;
        c_ao.cf = false;
        c_ao.cd = false;
    }

    public static final void a(String var0, boolean var1) {
    	c_ao.bX = var0;
    	c_ao.b3 = 0;
    	c_ao.ch = 0;
    	c_ao.cg = true;
    	c_ao.cf = false;
    	c_ao.cd = true;
    }

    public static final void a(Graphics var0, boolean var1) {
        if (j != null) {
            int var2 = c_a5.il - m - 36 - c_a5.iG - 2;
            if (!var1) {
                var0.setColor(8519935);
                var0.fillRect(0, var2, c_a5.ic, c_a5.iG);
                var0.setColor(c_bm.bR[9]);
            } else {
                var0.setColor(16711680);
            }

            var0.drawString(j, b, var2, 0);
        }

    }

    public static final void method_if(Graphics var0, boolean var1) {
        if (C != null) {
            int var2 = 2 + b2.field_if;
            if (!var1) {
                var0.setColor(8519935);
                var0.fillRect(0, var2, c_a5.ic, c_a5.iG);
                var0.setColor(c_bm.bR[9]);
            } else {
                var0.setColor(16711680);
            }

            int var7 = field_byte;
            char[] var3;
            int var4 = (var3 = C.toCharArray()).length;

            for(int var5 = 0; var5 < var4; ++var5) {
                if (var5 != var4 - 1 && var3[var5] == '#' && var3[var5 + 1] >= '0' && var3[var5 + 1] <= '9') {
                    c_a5.cJ.method_if(var0, var7, var2, var3[var5 + 1] - 48);
                    ++var5;
                    var7 += c_a5.cJ.field_try;
                } else {
                    var0.drawChar(var3[var5], var7, var2, 20);
                    int var6 = var0.getFont().charWidth(var3[var5]);
                    var7 += var6;
                }
            }
        }

    }

    public static final void method_new() {
        c_ao.bX = "";
        c_ao.b3 = 0;
        c_ao.ch = 0;
        c_ao.cg = true;
        c_ao.cf = false;
    }

    private static final int[] method_if(byte var0, String var1, Vector[] var2) {
        int var6;
        int[] var3 = new int[var6 = var1.length()];

        int var4;
        for(var4 = 0; var4 < var6; ++var4) {
            var3[var4] = c_bm.bR[var0];
        }

        if (var2 != null) {
            int[] var5;
            for(var4 = 0; var4 < var2.length; ++var4) {
                for(var6 = (var5 = (int[])((int[])var2[var4].elementAt(5)))[0]; var6 <= var5[1]; ++var6) {
                    var3[var6] = var5[2];
                }
            }
        }

        return var3;
    }

    private static void a(String var0, int[] var1) {
        d = 7;
        String[] var7 = c_b5.a(var0, c_a5.ic - 4, c_a5.fq);
        int var2 = 0;

        int var5;
        int var10;
        for(int var3 = var7.length; var2 < var3; ++var2) {
            boolean var4 = false;
            var5 = var7[var2].length();
            if (var3 > 1 && var2 != var3 - 1 && (var10 = var7[var2].lastIndexOf(35)) == var5 - 1) {
                var7[var2] = var7[var2].substring(0, var10);
                var7[var2 + 1] = "#" + var7[var2 + 1];
            }
        }

        var2 = var7.length;
        int[][] var9 = new int[0][];
        var10 = 0;

        for(var5 = 0; var5 < var2; ++var5) {
            int[] var6 = new int[var7[var5].length()];
            System.arraycopy(var1, var10, var6, 0, var6.length);
            var9 = c_b5.a(var9, var9.length, var6);
            var10 += var6.length;
        }

        int var11;
        if (a == 0) {
            var5 = var7.length;

            for(var11 = 0; var11 + var5 < E.length; ++var11) {
                E[var11] = E[var11 + var5];
                w[var11] = w[var11 + var5];
            }

            var11 = E.length - 1;

            for(int var8 = var7.length - 1; var11 >= 0 && var8 >= 0; --var11) {
                E[var11] = var7[var8];
                w[var11] = var9[var8];
                --var8;
            }
        } else if (a == 1) {
            var5 = Math.min(E.length, var7.length);

            for(var11 = 0; var11 < var5; ++var11) {
                E[var11] = var7[var11];
                w[var11] = var9[var11];
            }

            q = 0;
            if ((var11 = var7.length) > 3) {
                var11 = 3;
            }

            B = var11 * c_a5.iG;
            A = 20;
        }

        method_for();
    }

    private static void method_for() {
        if (J != null) {
            c_b5.a(J, 0, 0, field_long.getWidth(), field_long.getHeight(), 2167563);
            J.setColor(5190176);

            int var0;
            for(var0 = 0; var0 < 2; ++var0) {
                J.drawLine(0, c_a5.iG * (var0 + 1), field_long.getWidth(), c_a5.iG * (var0 + 1));
            }

            J.setFont(c_a5.fq);

            for(var0 = 0; var0 < 3; ++var0) {
                a$579467b(J, E[var0], w[var0], 2, c_a5.iG * var0);
            }

        }
    }

    private static void a$579467b(Graphics var0, String var1, int[] var2, int var3, int var4) {
        var3 = 2;
        char[] var8;
        int var5 = (var8 = var1.toCharArray()).length;

        for(int var6 = 0; var6 < var5; ++var6) {
            if (var6 != var5 - 1 && var8[var6] == '#' && var8[var6 + 1] >= '0' && var8[var6 + 1] <= '9') {
                c_a5.cJ.method_if(var0, var3, var4, var8[var6 + 1] - 48);
                ++var6;
                var3 += c_a5.cJ.field_try;
            } else {
                var0.setColor(var2[var6]);
                var0.drawChar(var8[var6], var3, var4, 20);
                int var7 = var0.getFont().charWidth(var8[var6]);
                var3 += var7;
            }
        }

    }

    public static final void a(Graphics var0, String var1, int var2, int var3, int var4, int[][] var5, int[] var6, int[] var7) {
        char[] var12;
        int var8 = (var12 = var1.toCharArray()).length;

        for(int var9 = 0; var9 < var8; ++var9) {
            if (var9 != var8 - 1 && var12[var9] == '#' && var12[var9 + 1] >= '0' && var12[var9 + 1] <= '9') {
                c_a5.cJ.method_if(var0, var3, var4, var12[var9 + 1] - 48);
                ++var9;
                var3 += c_a5.cJ.field_try;
            } else {
                var0.setColor(var2);
                int var10;
                if (var5 != null) {
                    var10 = var5.length;

                    for(int var11 = 0; var11 < var10; ++var11) {
                        if (var9 >= var5[var11][0] && var9 <= var5[var11][1]) {
                            var0.setColor(var5[var11][2]);
                        }
                    }
                }

                var10 = var0.getFont().charWidth(var12[var9]);
                var0.drawChar(var12[var9], var3, var4, 20);
                if (var7 != null && var9 >= var7[0] && var9 < var7[1]) {
                    var0.setColor(16776960);
                    var0.drawLine(var3, var4 + c_a5.iG, var3 + var10, var4 + c_a5.iG);
                }

                if (var6 != null && var9 >= var6[0] && var9 <= var6[1]) {
                    var0.drawLine(var3, var4 + c_a5.iG, var3 + var10, var4 + c_a5.iG);
                }

                var3 += var10;
            }
        }

    }

    private static final String method_if(String var0, int var1) {
        int var2 = -1;
        c_b5.method_case("senderId" + var1);

        for(int var3 = c_l.field_else.length - 1; var3 >= 0; --var3) {
            if (c_l.field_else[var3].method_new() == var1) {
                var2 = var3;
                break;
            }
        }

        c_b5.method_case("tmpIndex" + var2);
        c_b var6 = null;
        if (var2 != -1) {
            var6 = (c_b)c_l.field_else[var2];
            char[] var5;
            var2 = (var5 = var0.toCharArray()).length;

            for(int var4 = 0; var4 < var2; ++var4) {
                if (var4 != var2 - 1 && var5[var4] == '#' && var5[var4 + 1] >= '0' && var5[var4 + 1] <= '9' && var6 != null) {
                    var6.dw = (byte)(var5[var4 + 1] - 48);
                    var6.cK = 48;
                }
            }

            return var0;
        } else {
            return var0;
        }
    }

    public static void method_if(Graphics var0) {
        if (a == 0) {
            var0.drawImage(field_long, 0, c_a5.il - 36 - field_long.getHeight(), 20);
        } else {
            if (a == 1 && q != 0) {
                var0.drawImage(field_long, 0, c_a5.il - 36 - q, 20);
            }

        }
    }

    public static final void a(String var0, Vector[] var1) {
        if (field_case.length == 0) {
        	field_else = c_a5.il;
        }

        if (field_case.length != 0) {
            for(int var2 = field_case.length - 1; var2 >= 0; --var2) {
                if (var0.equals(field_case[var2])) {
                    return;
                }
            }
        }

        field_case = c_b5.a(field_case, field_case.length, var0);
        int[] var3 = method_if((byte)8, var0, var1);
        f = c_b5.a(f, f.length, var3);
        field_int = c_b5.a(field_case[0], c_a5.ic - 4, c_a5.fq);
        g = f[0];
        n = a(field_int, g);
    }

    private static int[][] a(String[] var0, int[] var1) {
        int var2 = var0.length;
        int var3 = 0;

        for(int var4 = 0; var4 < var2; ++var4) {
            int[] var5 = new int[var0[var4].length()];
            System.arraycopy(var1, var3, var5, 0, var5.length);
            n = c_b5.a(n, n.length, var5);
            var3 += var5.length;
        }

        return n;
    }

    public static void a(Graphics var0) {
        if (field_case.length != 0 && f.length != 0) {
            var0.setFont(c_a5.fq);
            var0.setClip(0, c_a5.il - 72 - m, c_a5.ic, 36);
            int var1 = field_int.length;
            int var2;
            if (a == 0) {
                for(var2 = 0; var2 < var1; ++var2) {
                    a$579467b(var0, field_int[var2], n[var2], 2, field_else - m - 36 + c_a5.iG * var2);
                }
            } else {
                for(var2 = 0; var2 < var1; ++var2) {
                    a$579467b(var0, field_int[var2], n[var2], 2, field_else - m - 36 + c_a5.iG * var2);
                }
            }

            var0.setClip(0, 0, c_a5.ic, c_a5.il);
        }
    }

    static {
        m = c_a5.iG * 3;
        k = -1;
        field_new = 0;
        field_if = -1L;
        b = 0;
        j = null;
        y = 0;
        field_byte = 0;
        C = null;
        H = 0;
        field_goto = 3;
        field_else = c_a5.il;
        n = new int[0][];
        field_case = new String[0];
        f = new int[0][];
    }
}
