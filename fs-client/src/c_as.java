import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class c_as extends ba {
    public byte dl;
    public byte y;
    private String cJ;
    private String dO;
    private int dP;
    private int dp;
    private int dc;
    private short dw;
    private short ds;
    public static String dM = "确认充值并扣费请继续，否则请点击返回不扣费。";
    private String[] cK;
    private short[][] c1;
    private short di;
    private short dh;
    private short cS;
    private static int c0 = 16711680;
    private short cM;
    private short da;
    public static boolean dX = false;
    private static String cN = "0123456789";
    StringBuffer dJ;
    public byte cA;
    public static int cH = 20;
    private static byte dy = 0;
    private int c3;
    private int[] cy;
    private String[] cP;
    private int cV;
    public int cR;
    public static int dV = -1;
    public static int c4 = -1;
    private static byte dU = -1;
    private static byte cW = -1;
    private byte[][] cG;
    public static String[] db;
    public static byte cu = 0;
    public static boolean cY;
    public static byte cB;
    public static byte cX;
    public static int dk;

    private c_as(short var1, short var2, short var3, short var4, c_be var5) {
        super((short)0, (short)0, (short)0, (short)0, var5);
        dl = 0;
        y = 0;
        cJ = "";
        dO = "";
        dP = -1;
        dp = -1;
        dc = 0;
        dw = 0;
        ds = 0;
        cK = new String[]{"#"};
        int[] var10000 = new int[]{16711935};
        c1 = null;
        di = 0;
        dh = 0;
        cS = 0;
        cM = -1;
        da = -1;
        dJ = null;
        cA = 10;
        c3 = 0;
        cy = new int[4];
        cV = 0;
        cR = -1;
    }

    public c_as(byte var1, c_be var2) {
        this((short)0, (short)0, (short)0, (short)0, (c_be)null);
        y = var1;
        switch(var1) {
        case 0:
            return;
        case 1:
        case 13:
            dJ = new StringBuffer();
            dJ.append("0");
        case 4:
        case 16:
        default:
        }
    }

    public final void a(byte var1, int var2, String var3, String var4, String var5, int var6, int var7) {
        dl = var1;
        c0 = var2;
        c_as var9;
        (var9 = this).dP = var6;
        var9.dp = var7;
        switch(var9.y) {
        case 1:
            var9.method_new((short)0);
            var9.method_do((short)c_a5.ic);
            var9.dc = var9.a - 28 - 6 - 2 - 2;
            var9.method_new(var3);
            var9.method_for((short)(c_a5.il - var9.z() >> 1));
            var9.a(var4, var5);
            var9.di = (short)(var9.k + 4 + 10 + 3 + 1 + 1 + 1);
            var9.dh = (short)(var9.j + 5 + 1 + 1 + 1);
            return;
        case 4:
            var9.method_new((short)0);
            var9.method_do((short)c_a5.ic);
            var9.dc = var9.a - 28 - 6 - 2 - 2;
            String var12 = c_a5.gZ ? "玩家死亡，$触摸弹板$复活！" : "玩家死亡，按$#$键复活！";
            var9.method_new(var12);
            var9.method_for((short)((c_a5.il - var9.ds) / 2));
            var9.di = (short)(var9.k + 4 + 10 + 3 + 1 + 1 + 1);
            var9.dh = (short)(var9.j + 5 + 1 + 1 + 1);
            String[] var13 = var9.cK;
            c_as var8 = var9;
            var9.c1 = c_b5.a(var12, var13, var9.dc, c_a5.fq);

            for(int var11 = 0; var11 < var8.c1.length; ++var11) {
                short[] var14 = var8.c1[var11];
                var14[0] += var8.di;
                var8.c1[var11][1] = (short)(var8.dh + c_a5.iG * (var8.c1[var11][1] - 1));
            }

            var8.dw = (short)(var8.cP.length * (c_a5.iG + 1) + 5);
            var8.ds = (short)(var8.dw + 2 + 2 + 2 + 10 + 4);
            var8.cS = (short)(var8.ds - 5 - 1 - 1 - 1);
            var8.a(var8.ds);
            return;
        default:
            var9.method_new((short)0);
            var9.method_do((short)c_a5.ic);
            var9.dc = var9.a - 28 - 6 - 2 - 2;
            var9.method_new(var3);
            var9.method_for((short)((c_a5.il - var9.ds) / 2));
            var9.a(var4, var5);
            var9.di = (short)(var9.k + 4 + 10 + 3 + 1 + 1 + 1);
            var9.dh = (short)(var9.j + 5 + 1 + 1 + 1);
        }
    }

    private void method_new(String var1) {
        if (var1 != null) {
            Font var4 = c_a5.fq;
            int var3 = dc;
            c_as var13 = this;
            char[] var14;
            int var5 = (var14 = var1.toCharArray()).length;
            int[] var6 = new int[34];
            int var7 = 0;
            StringBuffer var8 = new StringBuffer();
            Vector var9 = new Vector();

            int var10;
            for(var10 = 0; var10 < var5; ++var10) {
                if (var14[var10] != '\n') {
                    var9.addElement(new Character(var14[var10]));
                }

                if (var14[var10] != '$') {
                    var8.append(var14[var10]);
                }
            }

            var10 = 0;

            for(int var15 = var9.size(); var10 < var15; ++var10) {
                if (var9.elementAt(var10).toString().charAt(0) == '$') {
                    var6[var7] = var10;
                    ++var7;
                }
            }

            String[] var24;
            var5 = (var24 = c_b5.a(var8.toString(), var3, var4)).length;
            cG = new byte[var5][];
            int[][] var16 = new int[var5][2];

            int var18;
            for(var3 = 0; var3 < var5; ++var3) {
                var18 = var24[var3].length();
                var13.cG[var3] = new byte[var18];
                if (var3 == 0) {
                    var16[var3][0] = 0;
                    var16[var3][1] = var18 - 1;
                } else {
                    var16[var3][0] = var16[var3 - 1][1] + 1;
                    var16[var3][1] = var16[var3][0] + var18 - 1;
                }
            }

            Vector var17 = new Vector(4);
            if (var7 % 2 != 0) {
                --var7;
            }

            int var12;
            int var23;
            for(var18 = 0; var18 < var7; var18 += 2) {
                var6[var18] -= var18;
                var6[var18 + 1] -= var18 + 1 + 1;
                int var21 = c_b5.a(var6[var18], var16);
                var23 = c_b5.a(var6[var18 + 1], var16);
                if (var21 == var23) {
                    int[] var11;
                    (var11 = new int[3])[0] = var21;
                    var11[1] = var6[var18] - var16[var21][0];
                    var11[2] = var6[var18 + 1] - var16[var21][0];
                    var17.addElement(var11);
                } else {
                    if (var23 - var21 > 1) {
                        for(var12 = var21 + 1; var12 < var23; ++var12) {
                            int[] var20;
                            (var20 = new int[3])[0] = var12;
                            var20[1] = 0;
                            var20[2] = var24[var12].length() - 1;
                            var17.addElement(var20);
                        }
                    }

                    int[] var26;
                    (var26 = new int[3])[0] = var21;
                    var26[1] = var6[var18] - var16[var21][0];
                    var26[2] = var16[var21][1] - var16[var21][0];
                    var17.addElement(var26);
                    (var26 = new int[3])[0] = var23;
                    var26[1] = 0;
                    var26[2] = var6[var18 + 1] - var16[var23][0];
                    var17.addElement(var26);
                }
            }

            int[][] var19 = new int[var5 = var17.size()][];
            Enumeration var22 = var17.elements();

            for(var23 = 0; var22.hasMoreElements(); ++var23) {
                var19[var23] = (int[])((int[])var22.nextElement());
            }

            for(int var25 = 0; var25 < var5; ++var25) {
                for(var12 = var19[var25][1]; var12 <= var19[var25][2]; ++var12) {
                    var13.cG[var19[var25][0]][var12] = 1;
                }
            }

            cP = var24;
            dw = (short)(cP.length * (c_a5.fq.getHeight() + 1) + 5);
            if (y == 1) {
                ds = (short)(dw + 2 + 2 + 2 + 10 + 4 + 13);
                cS = (short)(ds - 5 - 1 - 1 - 1);
            } else {
                ds = (short)(dw + 2 + 2 + 2 + 10 + 4 + 8);
                cS = (short)(ds - 5 - 1 - 1 - 1);
            }

            a(ds);
        }
    }

    private void a(String var1, String var2) {
        if (var1 == null) {
            cJ = "";
        } else {
            cJ = var1;
        }

        if (var2 == null) {
            dO = "";
        } else {
            dO = var2;
        }
    }

    private void method_for(Graphics var1) {
        int var2 = cP.length;
        if (cP != null) {
            for(int var3 = 0; var3 < var2; ++var3) {
                int var4 = 0;
                char[] var5 = cP[var3].toCharArray();
                int var6 = c_a5.fq.stringWidth(cP[var3]) >> 1;

                for(int var7 = 0; var7 < var5.length; ++var7) {
                    if (cG[var3][var7] == 0) {
                        var1.setColor(c_bm.bP);
                    } else {
                        var1.setColor(c0);
                    }

                    var1.drawChar(var5[var7], c_a5.ic / 2 - var6 + var4, dh + c_a5.iG * var3, 20);
                    var4 += c_a5.fq.charWidth(var5[var7]);
                }
            }
        }

    }

    public static int a2() {
        return 16711680;
    }

    public final void a(Graphics var1) {
        c_as var2;
        boolean var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        c_as var10;
        int var13;
        switch(y) {
        case 1:
            (var10 = this).method_void(var1);
            var10.method_int(var1);
            var2 = var10;
            var13 = 14 > c_a5.iG + 1 ? 14 : c_a5.iG + 1;
            var5 = var10.k + (var10.a - 75 >> 1);
            var6 = var10.j + 5 + 1 + 1 + 1 + var10.cP.length * (c_a5.iG + 3) + 3;
            var1.setColor(c_bm.dw);
            var1.fillRect(var5, var6, 75, var13);
            var1.setColor(c_bm.dt);
            var1.drawRect(var5, var6, 75, var13);
            var4 = false;
            var1.setColor(c_bm.F);
            var7 = var10.dJ.toString().trim().length();
            var8 = 0;
            var9 = var10.dJ.toString().trim();

            for(var13 = c_a5.fq.stringWidth(var9); var13 + 4 > var2.a && var8 <= var7 - 1; var13 = c_a5.fq.stringWidth(var9)) {
                ++var8;
                var9 = var2.dJ.toString().substring(var8).trim();
            }

            var1.drawString(var9, var5 + 5, var6, 20);
            if (++var2.c3 > 5) {
                var2.c3 = 0;
            }

            if (var2.c3 < 3) {
                var2.cV = var5 + 5 + var13 + 2;
                var1.setColor(c_bm.F);
                var1.drawLine(var2.cV, var6 + 1, var2.cV, var6 + 12);
            }

            var10.c(var1);
            return;
        case 4:
            (var10 = this).method_void(var1);
            var10.method_for(var1);
            return;
        case 10:
        case 31:
            (var10 = this).d(var1);
            String var12 = c_a5.gZ ? "触摸此处查看" : "按0键查看";
            int var3 = var10.cP.length;
            int var11 = var10.dh + c_a5.iG * var3;
            var1.drawString(var12, c_a5.ic >> 1, var11, 17);
            return;
        case 13:
            (var10 = this).method_void(var1);
            var10.method_int(var1);
            var2 = var10;
            var5 = var10.a - 75 >> 1;
            var6 = var10.j + 5 + 1 + 1 + 1 + var10.cP.length * (c_a5.iG + 3) + 3;
            var1.setColor(c_bm.dw);
            var1.fillRect(var5, var6, 75, 13);
            var1.setColor(c_bm.dt);
            var1.drawRect(var5, var6, 75, 13);
            var4 = false;
            var1.setColor(c_bm.F);
            var7 = var10.dJ.toString().trim().length();
            var8 = 0;
            var9 = var10.dJ.toString().trim();

            for(var13 = c_a5.fq.stringWidth(var9); var13 + 4 > var2.a && var8 <= var7 - 1; var13 = c_a5.fq.stringWidth(var9)) {
                ++var8;
                var9 = var2.dJ.toString().substring(var8).trim();
            }

            var1.drawString(var9, var5 + 5, var6, 20);
            if (++var2.c3 > 5) {
                var2.c3 = 0;
            }

            if (var2.c3 < 3) {
                var2.cV = var5 + 5 + var13 + 2;
                var1.setColor(c_bm.F);
                var1.drawLine(var2.cV, var6 + 1, var2.cV, var6 + 12);
            }

            var10.c(var1);
            return;
        default:
            d(var1);
        }
    }

    public final void a7() {
        aV();
        if (c_a5.method_else() == 5) {
            int var1;
            c_as var3;
            switch((var3 = this).y) {
            case 1:
            case 13:
                var1 = 0;

                for(int var2 = c_a5.eT.length; var1 < var2; ++var1) {
                    if (c_a5.method_byte(c_a5.eT[var1])) {
                        var3.method_void(c_a5.eT[var1]);
                    }
                }

                if (c_a5.method_byte(131072)) {
                    if (var3.dP == -1610612640) {
                        bk.field_char = var3.aT();
                        if (bk.f()) {
                            c_a5.eQ.a(2425012);
                        }
                        break;
                    }

                    if (var3.dP == -1610612639) {
                        bk.field_char = var3.aT();
                        if (bk.f()) {
                            c_a5.eQ.a(2425013);
                        }
                        break;
                    }

                    if (var3.dP == -1610612617) {
                        if ((byte)var3.aT() == 0) {
                            a((byte)0, (String)"请您输入数量", "确定", "", -1, -2);
                            return;
                        }

                        aj.field_void = (byte)var3.aT();
                        c_a5.gQ = null;
                        aj.method_if();
                        break;
                    }
                }

                if (!c_a5.method_byte(1048576) && !c_a5.method_try(16384)) {
                    if (var3.aS()) {
                        c4 = var3.aT();
                        switch(c_a5.es.g9) {
                        case 1179649:
                        case 1179650:
                        case 1179652:
                        case 1179654:
                        case 1179655:
                        case 1179657:
                        case 1638423:
                            c_r.ny = c4;
                            break;
                        case 1376263:
                            if (!var3.dJ.toString().equals("0")) {
                                c_r.md[dU] = (byte)c4;
                                c_r.mG[dU] = cW;
                            }
                            break;
                        case 1703946:
                            if (c4 <= 0) {
                                c_r.mE[dU][0] = -1;
                                c_r.mE[dU][1] = -1;
                                c_r.mE[dU][2] = -1;
                                c_r.mE[dU][3] = -1;
                                if (c_q.j > 0) {
                                    --c_q.j;
                                }

                                c_a5.gQ = null;
                                return;
                            }

                            c_r.mE[dU][3] = (byte)c4;
                            break;
                        case 1900546:
                            bw.field_if = c4;
                            break;
                        case 1900547:
                            if (c4 > 0) {
                                bw.a((byte)c4);
                            } else {
                                c_a5.gQ = null;
                            }
                        }

                        if (var3.dP >= 0) {
                            c_a5.gQ = null;
                            if (var3.dP != 458756 && var3.dP != 1179656) {
                                if (var3.dP != 1179651 && var3.dP != 1179653) {
                                    if ((var3.dP == 2555963 || var3.dP == 2555943 || var3.dP == 2555970 || var3.dP == 2555954 || var3.dP == 2555945 || var3.dP == 2555971 || var3.dP == 2555940 || var3.dP == 2555941 || var3.dP == 2555909 || var3.dP == 2555958 || var3.dP == 2555975) && (byte)var3.aT() == 0) {
                                        a((byte)0, (String)"请您输入数量", "确定", "", -1, -2);
                                        if ((var3.dP == 2555943 || var3.dP == 2555945 || var3.dP == 2555941) && c_a5.d6.size() > 0) {
                                            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
                                        }
                                        break;
                                    }
                                } else if ((bs.field_if = (byte)var3.aT()) == 0) {
                                    break;
                                }
                            } else {
                                at.field_new = (byte)var3.aT();
                            }

                            c_a5.eQ.a(var3.dP);
                        } else {
                            if (var3.dP != -1) {
                                return;
                            }

                            c_a5.gQ = null;
                        }
                    } else {
                        if (!c_a5.method_byte(262144)) {
                            return;
                        }

                        if (var3.dp >= 0) {
                            c_a5.gQ = null;
                            c_a5.eQ.a(var3.dp);
                        } else if (var3.dp == -1) {
                            c_a5.gQ = null;
                            switch(c_a5.es.g9) {
                            case 1703946:
                                for(var1 = 0; var1 < c_r.mE.length; ++var1) {
                                    if (c_r.mE[var1][0] == cW) {
                                        c_r.mE[var1][0] = -1;
                                        c_r.mE[var1][1] = -1;
                                        c_r.mE[var1][2] = -1;
                                        c_r.mE[var1][3] = -1;
                                        break;
                                    }
                                }

                                if (c_q.j > 0) {
                                    --c_q.j;
                                }
                            }
                        } else {
                            if (var3.dp != -16) {
                                return;
                            }

                            c_a5.gQ = null;
                            if (c_a5.d6.size() <= 0) {
                                return;
                            }

                            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
                        }
                    }
                } else {
                    var3.aU();
                }
                break;
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            default:
                if (var3.aS()) {
                    c_b5.method_case("默认弹板leftCmd = " + Integer.toHexString(var3.dP));
                    if (var3.dP >= 0) {
                        dV = var3.cR;
                        c_b5.method_case("curTaskID=============" + dV);
                        c_a5.gQ = null;
                        if (var3.dP == 1638447) {
                            c_be.cn();
                        } else if (var3.dP == 3342345) {
                            if (c_a5.d6.size() > 0) {
                                c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
                            }
                        } else {
                            c_a5.eQ.a(var3.dP);
                            switch(var3.dP) {
                            case 65547:
                                a0();
                                return;
                            case 65549:
                                c_a5.gQ = null;
                                c_a5.eQ.a(131071);
                                c_a5.method_do((byte)2);
                                c_ad.a("");
                                c_a5.e8.a((byte)0);
                                bp.ag().cA = false;
                                if (c_a5.hQ != 0) {
                                    c_a5.hQ = 0;
                                }

                                c_a5.eQ.a(65551);
                                if (c_a5.eQ.e) {
                                    c_a5.eQ.e = false;
                                }

                                c_a5.hH = true;
                                return;
                            case 1966085:
                                Object var4;
                                if ((var4 = c_a5.d6.elementAt(0)) instanceof c_be) {
                                    c_be var5 = (c_be)var4;
                                    c_a5.d6.setElementAt(new Integer(var5.g9), 0);
                                    return;
                                }
                            }
                        }
                    } else if (var3.dP == -1) {
                        if (c_a5.es != null && (c_a5.es.g9 == 131078 || c_a5.es.g9 == 131079)) {
                            c_a5.eQ.e = false;
                        }

                        c_a5.gQ = null;
                    } else if (var3.dP == -250) {
                        c_a5.gQ = null;
                        a((byte)0, (String)"部分邮件可能含有附件，你确认删除？", "是", "否", 1703944, -1);
                    } else if (var3.dP == -260) {
                        c_a5.gQ = null;
                        bo.method_if();
                    } else if (var3.dP == -3) {
                        c_a5.gQ = null;
                        c_r.ed();
                        c_q.a();
                        c_a5.eQ.a(1703955);
                    } else if (var3.dP != -4 && var3.dP != -5) {
                        if (var3.dP == -6) {
                            c_a5.gQ = null;
                            aq.a(4, false, 3, true);
                            c_a5.eQ.a(2031622);
                        } else if (var3.dP == -7) {
                            c_a5.gQ = null;
                            if (c_a5.cC) {
                                c_a5.cC = false;
                            } else {
                                aq.a(6, false, 1, true);
                            }
                        } else if (var3.dP == -8) {
                            c_a5.gQ = null;
                            if (c_a5.cC) {
                               c_a5.cC = false;
                            } else {
                                aq.a(8, false, 2, true);
                            }
                        } else if (var3.dP == -10) {
                            c_a5.gQ = null;
                            aq.a = (byte)c_r.mY[0];
                            c_a5.eQ.a(2031637);
                        } else if (var3.dP == -11) {
                            c_a5.gQ = null;
                            aj.a();
                        } else if (var3.dP == -12) {
                            c_a5.gQ = null;
                            aj.field_do -= (Byte)aj.a.elementAt(aj.a.size() - 1);
                            if (aj.field_new.size() <= 0) {
                                return;
                            }

                            aj.field_new.removeElementAt(aj.field_new.size() - 1);
                            aj.a.removeElementAt(aj.a.size() - 1);
                            aj.field_byte = (Byte)((Byte)aj.field_new.elementAt(aj.field_new.size() - 1));
                        } else {
                            a7 var8;
                            c_r var9;
                            if (var3.dP == -13) {
                                c_a5.gQ = null;
                                au.field_int = (byte)c_r.mY[0];
                                var8 = (a7)c_a5.es.cf().elementAt(4);
                                var9 = (c_r)c_a5.es.cf().elementAt(7);
                                var8.a(true, c_a5.es);
                                var9.a(false, c_a5.es);
                                c_a5.eQ.a(1966098);
                            } else if (var3.dP == -14) {
                                c_a5.gQ = null;
                                au.field_try = (byte)c_r.mY[0];
                                var8 = (a7)c_a5.es.cf().elementAt(6);
                                var9 = (c_r)c_a5.es.cf().elementAt(7);
                                var8.a(true, (byte)1);
                                var8.fC = (byte)c_r.mY[2];
                                short var6 = c_r.mY[1];
                                var8.ft = true;
                                var8.method_if(var6, true);
                                var8.a(c_a5.gg);
                                var8.a(false, c_a5.es);
                                var9.a(true, c_a5.es);
                            } else if (var3.dP == -15) {
                                c_a5.gQ = null;
                                au.field_do = 1;
                            } else if (var3.dP == -16) {
                                c_a5.gQ = null;
                                au.field_int = -1;
                                (var8 = (a7)c_a5.es.cf().elementAt(4)).g(false);
                                var8.ft = false;
                                var8.a((bi)null);
                            } else if (var3.dP == -17) {
                                c_a5.gQ = null;
                                var8 = (a7)c_a5.es.cf().elementAt(4);
                                a7 var10 = (a7)c_a5.es.cf().elementAt(6);
                                c_r var7 = (c_r)c_a5.es.cf().elementAt(7);
                                var8.a(false, c_a5.es);
                                var10.a(true, c_a5.es);
                                var7.a(false, c_a5.es);
                                if (c_a5.d6.size() > 0) {
                                	c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
                                }
                            } else if (var3.dP == -18) {
                            	c_a5.gQ = null;
                                ((ah)c_a5.es.cf().elementAt(32)).a(true, c_a5.es);
                            } else if (var3.dP == -19) {
                                a8();
                                if (c_a5.ea != null) {
                                	c_a5.ea.l6.removeAllElements();
                                	c_a5.ea = null;
                                }

                                c_a5.hH = true;
                                c_a5.eQ.a(65542);
                                c_a5.method_do((byte)2);
                                c_ad.a("");
                                c_a5.e8.a((byte)0);
                                bp.ag().cA = false;
                                if (c_bu.d != 0) {
                                    c_bu.d = 0;
                                }

                                if (c_z.field_case) {
                                    c_z.field_case = false;
                                }

                                if (c_l.field_goto != 3) {
                                    c_l.field_goto = 3;
                                }

                                c_z.ag = new Vector();
                            } else if (var3.dP == -20) {
                                a8();
                                if (bp.ag() != null) {
                                    bp.ag().method_if(false);
                                }

                                if (c_a5.ea != null) {
                                	c_a5.ea.l6.removeAllElements();
                                	c_a5.ea = null;
                                }

                                c_a5.q();
                                bp.ag().cA = false;
                                c_ad.a("");
                                if (c_bu.d != 0) {
                                    c_bu.d = 0;
                                }

                                if (c_z.field_case) {
                                    c_z.field_case = false;
                                }

                                if (c_l.field_goto != 3) {
                                    c_l.field_goto = 3;
                                }

                                c_z.ag = new Vector();
                            } else if (var3.dP == -21) {
                            	c_a5.gQ = null;
                            	c_a5.A();
                            } else if (var3.dP == -22) {
                            	c_a5.gQ = null;
                                au.field_case = 0;
                            } else if (var3.dP == -23) {
                            	c_a5.gQ = null;
                                bo.C = 1;
                                bo.method_if((byte)1);
                                bo.method_int();
                                // FIXME 该处存在争议
                                (new Thread() {
                                    public final void run() {
                                        bo.a(bo.e);
                                    }
                                }).start();
                                bo.field_long = 2;
                                a((byte)0, (String)"正在充值，请您稍候...", "", "", -2, -2);
                            } else if (var3.dP == -24) {
                                a9 var12 = (a9)c_a5.es.cf().elementAt(9);
                                a9 var11 = (a9)c_a5.es.cf().elementAt(10);
                                var12.a(new StringBuffer(bk.aa));
                                var11.a(new StringBuffer(bk.aa));
                                c_a5.gQ = null;
                            } else if (var3.dP == -25) {
                            	c_a5.gQ = null;
                            	c_a5.A();
                                if (c_a5.ea != null) {
                                	c_a5.ea.l6.removeAllElements();
                                	c_a5.ea = null;
                                }

                                c_b5.a(c_a5.hC, "name_password");
                                c_a5.method_try((byte)0);
                                c_a5.hQ = 2;
                                c_a5.eQ.a(65548);
                            } else if (var3.dP == -26) {
                            	c_a5.gQ = null;
                                c_be.cn();
                            } else if (var3.dP == -27) {
                                a0();
                            } else if (var3.dP == -28) {
                            	c_a5.gQ = null;
                                String var13 = "请稍候...";
                                c_a5.a((byte)0, var13, "", "", -120, -120);
                                var9 = null;
                                (new bk(bk.q, bk.method_do((byte)0), (byte)(c_a5.dU ? 0 : 1), (byte)2)).a((byte)0);
                            } else {
                                if (var3.dP != -29) {
                                    return;
                                }

                                c_a5.gQ = null;
                                c_a5.eQ.a(2555955);
                            }
                        }
                    } else {
                    	c_a5.gQ = null;
                        aq.method_if();
                    }
                } else if (c_a5.method_byte(262144)) {
                    if (var3.dp >= 0) {
                        dV = var3.cR;
                        c_a5.gQ = null;
                        c_a5.eQ.a(var3.dp);
                    } else if (var3.dp == -1) {
                    	c_a5.gQ = null;
                    } else if (var3.dp != -4 && var3.dp != -5) {
                        if (var3.dp == -9) {
                        	c_a5.gQ = null;

                            for(var1 = 0; var1 < c_r.mY.length; ++var1) {
                                c_r.mY[var1] = -1;
                            }

                            return;
                        } else if (var3.dp == -11) {
                        	c_a5.gQ = null;
                            aj.a();
                        } else if (var3.dp == -12) {
                            a8();
                            if (bp.ag() != null) {
                                bp.ag().method_if(false);
                            }

                            if (c_a5.ea != null) {
                            	c_a5.ea.l6.removeAllElements();
                            	c_a5.ea = null;
                            }

                            c_a5.q();
                            bp.ag().cA = false;
                            c_ad.a("");
                            c_a5.hQ = 0;
                        } else if (var3.dp == -15) {
                        	c_a5.gQ = null;
                            au.field_do = 1;
                        } else {
                            if (var3.dp != -18) {
                                return;
                            }

                            c_a5.gQ = null;
                            c4 = 0;
                        }
                    } else {
                    	c_a5.gQ = null;
                        aq.method_if();
                    }
                } else {
                    if (!c_a5.method_byte(1)) {
                        return;
                    }

                    switch(var3.y) {
                    case 10:
                        c_br.c6();
                        c_a5.eQ.a(720913);
                        c_a5.gQ = null;
                        return;
                    case 31:
                        c_br.c6();
                        c_a5.eQ.a(720915);
                        c_a5.gQ = null;
                        return;
                    default:
                        return;
                    }
                }
                break;
            case 4:
                if (c_a5.method_byte(2048)) {
                	c_a5.A();
                	c_a5.aj();
                    a8();
                    c_l.method_for();
                    c_a5.method_do((byte)2);
                    c_a5.eQ.a(196621);
                }
                break;
            case 6:
                if (var3.aS()) {
                    ((c_bv)c_a5.es.cf().elementAt(2)).s(var3.dP);
                    return;
                }

                if (c_a5.method_byte(262144)) {
                    ((c_bv)c_a5.es.cf().elementAt(2)).s(var3.dp);
                }
                break;
            case 11:
                if (var3.aS()) {
                	c_a5.A();
                	c_a5.gQ = null;
                	c_a5.method_try(c_a5.cg);
                	c_a5.eQ.a(196627);
                    return;
                }

                if (c_a5.method_byte(262144)) {
                	c_a5.A();
                	c_a5.gQ = null;
                	c_a5.method_try(c_a5.cg);
                	c_a5.eQ.a(196628);
                }
                break;
            case 14:
                byte var10000;
                if (var3.aS()) {
                    if (var3.dP != 624776) {
                        return;
                    }

                    c_a5.eQ.a(624776);
                    c_a5.gQ = null;
                    var10000 = bp.ag().ct;
                    bp.ag();
                    if (var10000 != 25) {
                        return;
                    }

                    a((byte)4, (String)"", "", "", -2, -2);
                } else {
                    if (!c_a5.method_byte(262144) || var3.dp != -1) {
                        return;
                    }

                    c_a5.gQ = null;
                    var10000 = bp.ag().ct;
                    bp.ag();
                    if (var10000 != 25) {
                        return;
                    }

                    a((byte)4, (String)"", "", "", -2, -2);
                }
                break;
            case 15:
                if (var3.aS()) {
                	c_a5.gQ = null;
                	c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
                    c_be.cr();
                }
                break;
            case 16:
                if (c_a5.method_byte(262144)) {
                	c_a5.gQ = null;
                    if (var3.dp >= 0) {
                    	c_a5.eQ.a(var3.dp);
                    }
                }
                break;
            case 17:
                if (!var3.aS() || var3.dP != -1) {
                    return;
                }

                c_a5.iB = 0;
                c_a5.C();
                break;
            case 35:
                if (var3.aS()) {
                    c_ao.ci = false;
                    c_a5.gQ = null;
                    c_be.cn();
                    return;
                }

                if (c_a5.method_byte(262144)) {
                	c_a5.gQ = null;
                }
            }
        } else {
            aM();
        }

    }

    private void d(Graphics var1) {
        method_void(var1);
        method_for(var1);
        var1.setColor(c_bm.bP);
        var1.drawString(cJ, di, super.j + cS + 1, 36);
        var1.drawString(dO, di + dc - 2, super.j + cS + 1, 40);
    }

    private void method_void(Graphics var1) {
        short var2;
        if ((var2 = (short)(super.a - 8)) <= 0) {
            throw new IllegalArgumentException("控件宽度初始值不够长");
        } else {
            var1.setColor(c_bm.field_try);
            var1.fillRect(super.k + 4 + 2, super.j + 2, var2 - 4, super.field_int - 4);
            var1.setColor(c_bm.dw);
            var1.drawRect(super.k + 4 + 1, super.j + 1, var2 - 3, super.field_int - 3);
            var1.setColor(c_bm.dx);
            var1.drawRect(super.k + 4, super.j, var2 - 1, super.field_int - 1);
            var1.drawImage(c_a5.gu, super.k, super.j + 5, 20);
            var1.drawImage(c_a5.gu, super.k, super.j + super.field_int - 5 - c_a5.gu.getHeight(), 20);
            c_b5.a(var1, c_a5.gu, super.k + super.a - c_a5.gu.getWidth(), super.j + 5, 2);
            c_b5.a(var1, c_a5.gu, super.k + super.a - c_a5.gu.getWidth(), super.j + super.field_int - 5 - c_a5.gu.getHeight(), 2);
            int var6 = super.k + 4 + 10;
            boolean var3 = false;
            int var7;
            if (da == -1) {
                var7 = super.j + 5;
            } else {
                var7 = super.j + 5 + da;
            }

            int var4 = super.a - 28;
            boolean var5 = false;
            int var8;
            if (cM == -1) {
                var8 = super.field_int - 10;
            } else {
                var8 = cM;
            }

            var1.setColor(c_bm.dt);
            var1.fillRect(var6, var7, var4, var8);
            var6 += 3;
            ++var7;
            var4 -= 6;
            var8 -= 2;
            var1.setColor(c_bm.field_try);
            var1.fillRect(var6, var7, var4, var8);
            ++var6;
            ++var7;
            var4 -= 2;
            var8 -= 2;
            var1.setColor(c_bm.dt);
            var1.fillRect(var6, var7, var4, var8);
            ++var6;
            ++var7;
            var4 -= 2;
            var8 -= 2;
            cy[0] = var6 + 1;
            cy[1] = var7 + var8 - c_a5.iG - 3;
            cy[2] = var6 + var4 - 2 * c_a5.iA;
            cy[3] = var7 + var8 - c_a5.iG - 3;
            var1.setColor(c_bm.field_try);
            var1.fillRect(var6, var7, var4, var8);
        }
    }

    private void aM() {
        int var1;
        String var3;
        switch(y) {
        case 1:
            var1 = 0;

            for(int var2 = c_a5.eT.length; var1 < var2; ++var1) {
                if (c_a5.method_byte(c_a5.eT[var1])) {
                    method_void(c_a5.eT[var1]);
                }
            }

            if (c_a5.method_byte(1048576) || c_a5.method_try(16384)) {
                aU();
            }

            if (c_a5.method_byte(131072)) {
                if (dP == -1610612640) {
                    bk.field_char = aT();
                    if (bk.f()) {
                        if (bk.m()) {
                            var3 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + c_a5.ik + "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype=7&qtime=" + bk.field_if + "&qmonth=" + bk.field_char;
                            c_a5.a((byte)0, "请稍候...", "", "", -120, -120);
                            (new bk(bk.field_void, var3, (byte)(c_a5.dU ? 0 : 1), (byte)3)).a((byte)8);
                        } else {
                        	c_a5.a((byte)0, "请稍候...", "", "", -120, -120);
                            bk.b = true;
                            (new bk(bk.aG, bk.aQ, (byte)(c_a5.dU ? 0 : 1), (byte)1)).a((byte)8);
                        }
                    }
                } else if (dP == -1610612639) {
                    bk.field_char = aT();
                    if (bk.f()) {
                        if (bk.m()) {
                            var3 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + c_a5.ik + "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype=" + bk.ay + "&qtime=" + bk.field_if + "&qmonth=" + bk.field_char;
                            c_a5.a((byte)0, "请稍候...", "", "", -120, -120);
                            (new bk(bk.field_void, var3, (byte)(c_a5.dU ? 0 : 1), (byte)3)).a((byte)9);
                        } else {
                        	c_a5.a((byte)0, "请稍候...", "", "", -120, -120);
                            bk.b = true;
                            (new bk(bk.aG, bk.aQ, (byte)(c_a5.dU ? 0 : 1), (byte)1)).a((byte)9);
                        }
                    }
                }
            }
            break;
        case 17:
            if (aS() && dP == -1) {
            	c_a5.iB = 0;
            	c_a5.C();
            }
        }

        if (aS()) {
            if (dP >= 0) {
            	c_a5.gQ = null;
                c_a5.eQ.a(dP);
                return;
            }

            if (dP == -1) {
            	c_a5.gQ = null;
                if (c_a5.method_else() != 21 && c_a5.method_else() != 22 && c_a5.method_else() != 23 && c_a5.method_else() != 17) {
                	c_a5.method_do((byte)4);
                    return;
                }
            } else if (dP != -2) {
                if (dP == -3 || dP == -5) {
                	c_a5.gQ = null;
                    return;
                }

                if (dP == -4) {
                	c_a5.gQ = null;
                    if (c_a5.method_else() == 14) {
                    	c_b5.a(c_a5.hC, "name_password");
                    	c_a5.fr = null;
                    	c_a5.I();
                    	c_a5.eQ.a(65537);
                        return;
                    }

                    if (c_a5.method_else() == 18) {
                    	c_a5.eQ.a(131071);
                        var3 = "请稍候...";
                        c_a5.a((byte)0, var3, "", "", -120, -120);
                        c_a5.e8.cP[0] = 1;
                        c_a5.ah();
                        c_a5.G();
                        c_a5.gx = 0;
                        c_a5.eg = 1;
                        return;
                    }

                    if (c_a5.method_else() == 15) {
                    	c_a5.I();
                    	c_a5.method_do((byte)11);
                        return;
                    }

                    if (c_a5.method_else() == 19) {
                    	c_a5.ah();
                    	c_a5.G();
                    	c_a5.eg = 2;
                    	c_a5.eQ.a(131071);
                    	c_a5.method_do((byte)17);
                        return;
                    }

                    if (c_a5.method_else() == 17) {
                    	c_a5.a(c_be.gU[0], c_be.gU[1]);
                        var3 = "请稍候...";
                        c_a5.a((byte)0, var3, "", "", -120, -120);
                        c_a5.eQ.a(131071);
                        c_a5.method_do((byte)17);
                        c_a5.h6 = 0;
                        return;
                    }
                } else {
                    if (dP == -6) {
                    	c_a5.gQ = null;
                    	c_a5.eQ.method_for();
                    	c_a5.method_do((byte)11);
                        return;
                    }

                    if (dP == -7) {
                    	c_a5.gQ = null;
                        return;
                    }

                    if (dP == -8) {
                    	c_a5.gQ = null;
                        bq.a(c_a5.dI, (byte)0);
                        return;
                    }

                    if (dP == -9) {
                        a9 var7 = (a9)c_a5.es.cf().elementAt(9);
                        a9 var5 = (a9)c_a5.es.cf().elementAt(10);
                        var7.a(new StringBuffer(bk.aa));
                        var5.a(new StringBuffer(bk.aa));
                        c_a5.gQ = null;
                        return;
                    }

                    if (dP == -10) {
                    	c_a5.gQ = null;
                        c_be.g8 = true;
                        c_a5.method_do((byte)8);
                        return;
                    }

                    String var4;
                    if (dP == -11) {
                        if (c_a5.f6 == null) {
                        	c_a5.f6 = new byte[1];
                        }

                        c_a5.f6[0] = 0;
                        c_b5.a(c_a5.f6, "login_type");
                        var3 = "请稍候...";
                        c_a5.a((byte)0, var3, "", "", -120, -120);
                        var4 = null;
                        (new bk(bk.q, bk.method_do((byte)0), (byte)(c_a5.dU ? 0 : 1), (byte)2)).a((byte)0);
                        return;
                    }

                    if (dP == -19) {
                    	c_a5.gQ = null;
                    	c_a5.iC[c_a5.hg] = (a7)c_a5.es.cf().elementAt(c_a5.hg + 3);
                    	c_a5.iC[c_a5.hg].eo = null;

                        for(var1 = 0; var1 < c_a5.iD.length; ++var1) {
                        	c_a5.iD[var1] = (ah)c_a5.es.cf().elementAt(var1 + 11);
                        	c_a5.iD[var1].a("");
                        }

                        c_a5.e0[c_a5.hg] = null;
                        c_a5.im[c_a5.hg] = 0;
                        c_a5.fZ[c_a5.hg] = 0;
                        c_a5.hE[c_a5.hg] = 0;
                        c_a5.d3[c_a5.hg] = null;
                        ((ak)c_a5.es.cf().elementAt(16)).method_if("删除角色");
                        return;
                    }

                    if (dP == -30 || dP == -31) {
                        if (dP == -31) {
                            if (bk.d) {
                                bk.d = false;
                            }

                            c_a5.hY = 1;
                        }

                        c_b5.a(c_a5.hC, "name_password");
                        var3 = null;
                        bk var6 = new bk(bk.q, bk.method_do((byte)1), (byte)(c_a5.dU ? 0 : 1), (byte)2);
                        if (c_a5.hM) {
                            c_be.gd = System.currentTimeMillis();
                        }

                        var6.a((byte)1);
                        var4 = "请稍候...";
                        c_a5.a((byte)0, var4, "", "", -120, -120);
                        return;
                    }
                }
            }
        } else if (c_a5.method_byte(262144)) {
            if (dp >= 0) {
            	c_a5.gQ = null;
            	c_a5.eQ.a(dp);
                return;
            }

            if (dp == -1) {
            	c_a5.gQ = null;
                return;
            }

            if (dp == -2) {
            	c_a5.method_do((byte)12);
                return;
            }

            if (dp == -3) {
            	c_a5.gQ = null;
                return;
            }

            if (dp == -17) {
            	c_a5.gQ = null;
                if (bk.d) {
                    bk.d = false;
                }
            }
        }

    }

    public static void a6() {
    	c_a5.gQ = null;
    }

    public static void aL() {
        if (c_a5.gR.length > 0) {
            byte[] var0 = c_a5.gR[0];
            boolean var1 = false;
            switch(var0[0]) {
            case 0:
                var1 = true;
                break;
            case 1:
                if (c_a5.V() == 0 && !c_a5.fR) {
                    var1 = true;
                }
            }

            if (var1) {
            	c_a5.gQ = c_e.a(var0);
            	c_a5.gR = c_b5.a(c_a5.gR, 0);
            }
        }

    }

    public static void a8() {
    	c_a5.gR = new byte[0][];
    	c_a5.gQ = null;
    }

    private void c(Graphics var1) {
        var1.setColor(c_bm.bP);
        var1.drawString(cJ, cy[0], cy[1], 20);
        var1.drawString(dO, cy[2], cy[3], 20);
    }

    private void method_int(Graphics var1) {
        var1.setColor(c_bm.bP);
        if (cP != null) {
            int var2 = super.j + 5 + 1 + 1 + 1;

            for(int var3 = 0; var3 < cP.length; ++var3) {
                int var4 = c_b5.method_do(cP[var3]);
                var4 = (super.a - var4) / 2;
                var1.drawString(cP[var3], var4, var2 + var3 * (c_a5.iG + 3), 20);
            }
        }

    }

    private void method_void(int var1) {
        int var2 = 0;

        while(true) {
            if (var2 < 10) {
                if (1 << var2 != var1) {
                    ++var2;
                    continue;
                }

                if (y == 1 || y == 13) {
                    a(cN.charAt(var2));
                    return;
                }
            }

            return;
        }
    }

    public final void a(char var1) {
        if (dJ.length() < cA) {
            if (dJ.length() == 1 && dJ.toString().equals("0")) {
                dJ.deleteCharAt(0);
            }

            dJ.append(var1);
            long var2 = Long.parseLong(dJ.toString());
            if (cH >= 0) {
                try {
                    if ((var2 = Long.parseLong(dJ.toString())) > (long)cH) {
                        method_for(Long.toString((long)cH));
                    } else {
                        method_for(Long.toString(var2));
                    }
                } catch (Exception var4) {
                }
            }

            if (var2 < 0L) {
                method_for(0 + "");
            }
        }

    }

    private void aU() {
        if (dJ.length() > 0) {
            dJ.deleteCharAt(dJ.length() - 1);
            if (dJ.length() == 0 || aT() < 0) {
                method_for(0 + "");
            }
        }

        c3 = 0;
    }

    private int aT() {
        try {
            return dJ.toString().trim().equals("") ? 0 : Integer.parseInt(dJ.toString());
        } catch (Exception var1) {
            return 0;
        }
    }

    public final void method_goto(int var1) {
        dJ = new StringBuffer();
        dJ.append(var1);
    }

    private void method_for(String var1) {
        if (var1 != null && var1.length() != 0) {
            int var2 = 0;

            for(int var3 = var1.length(); var2 < var3; ++var2) {
                if (!Character.isDigit(var1.charAt(var2))) {
                    return;
                }
            }

            dJ.delete(0, dJ.length());
            dJ.append(var1);
        } else {
            dJ.delete(0, dJ.length());
        }
    }

    public final byte method_char() {
        return y;
    }

    public final void a(byte var1) {
        y = var1;
    }

    public static void a(byte var0, String var1, String var2, String var3, int var4, int var5) {
        (c_a5.gQ = new c_as(var0, (c_be)null)).a((byte)5, c0, var1, var2, var3, var4, var5);
    }

    public static void aY() {
        a((byte)0, (String)"您当前的联网方式不支持此功能，请返回游戏主菜单修改联网方式为CMWAP后重新尝试", "确定", "", -1, -2);
    }

    public static void a(byte var0, String var1, String var2, String var3, int var4, int var5, int var6, int var7) {
        a((byte)1, (String)var1, var2, var3, var4, -1);
        dU = (byte)var6;
        cW = (byte)var7;
    }

    public static void a(byte var0, String[] var1, String var2, String var3, int var4, int var5) {
        c_as var10000 = c_a5.gQ = new c_as((byte)13, (c_be)null);
        byte var7 = -1;
        c_as var6 = var10000;
        var10000.dP = var4;
        var6.dp = var7;
        if (var6.y == 13) {
            var6.method_new((short)0);
            var6.method_do((short)c_a5.ic);
            var5 = var1.length;
            var6.dw = (short)((c_a5.iG + 3) * (var5 + 2));
            var6.ds = (short)((var6.dw + 2 + 2 + 2 + 10 + 4) * c_a5.il / 208);
            var6.cS = (short)(var6.ds - 5 - 1 - 1 - 1);
            var6.a(var6.ds);
            var6.dc = var6.a - 28 - 6 - 2 - 2;
            var6.method_for((short)(c_a5.il - var6.z() >> 1));
            var6.a(var2, var3);
            var6.cP = var1;
        }

    }

    public final void aV() {
        if (c_a5.gZ && c_a5.method_byte(268435456)) {
            boolean var1 = false;
            var1 = false;
            int var5 = c_a5.fq.stringWidth(cJ);
            int var2 = y == 13 ? cy[0] : di;
            int var3 = y == 13 ? cy[1] : super.j + cS + 1 - c_a5.iG;
            if (c_a5.method_for(var2, var3, var5, c_a5.iG) && cJ != null) {
            	c_a5.a(131072);
            }

            var5 = c_a5.fq.stringWidth(dO);
            var2 = y == 13 ? cy[2] : di + dc - 2 - var5;
            var3 = y == 13 ? cy[3] : super.j + cS + 1 - c_a5.iG;
            if (c_a5.method_for(var2, var3, var5, c_a5.iG) && dO != null) {
            	c_a5.a(262144);
            }

            int var4;
            switch(y) {
            case 1:
            case 13:
                var5 = super.k + (super.a - 75 >> 1);
                var4 = super.j + 5 + 1 + 1 + 1 + cP.length * (c_a5.iG + 3) + 3;
                if (c_a5.a(var5, var4, 75, 13)) {
                    c_b5.method_for();
                    return;
                }
                break;
            case 4:
                short var7 = (short)(super.a - 8);
                var2 = super.k + 4;
                short var8 = super.j;
                var5 = var7 - 1;
                var4 = super.field_int - 1;
                if (c_a5.a(var2, var8, var5, var4)) {
                	c_a5.a(2048);
                    return;
                }
                break;
            case 10:
            case 31:
                String var6 = c_a5.gZ ? "触摸此处查看" : "按0键查看";
                var2 = cP.length;
                var5 = c_a5.fq.stringWidth(var6);
                var3 = (c_a5.ic >> 1) - (var5 >> 1);
                var4 = dh + c_a5.iG * var2;
                var2 = c_a5.iG;
                if (c_a5.a(var3, var4, var5, var2)) {
                	c_a5.a(1);
                }
            }
        }

    }

    private boolean aS() {
        boolean var1 = false;
        if (c_a5.method_byte(131072)) {
            var1 = true;
        } else if (c_a5.method_byte(65536)) {
            if (dO != null && !dO.equals("")) {
                var1 = false;
            } else {
                var1 = true;
            }
        }

        return var1;
    }

    public static void a0() {
    	c_a5.gQ = null;
        a((byte)0, (String)"请您稍候...", "", "", -2, -2);
        bk.d = true;
        c_a5.hC[0] = "tjuser";
        c_a5.hC[1] = "121212";
        (new bk(bk.q, bk.method_do((byte)5), (byte)(c_a5.dU ? 0 : 1), (byte)2)).a((byte)0);
    }

    public static void b(Graphics var0) {
        if (cu != 0) {
            int var1 = (var1 = c_a5.iA * c_b5.a(db) + 30) > c_a5.ic ? c_a5.ic : var1;
            int var2 = (c_a5.iG + 2) * db.length + 30;
            short var3;
            int var4 = (var3 = (short)(2 + b2.field_if + c_a5.iG + 2)) + (var2 - (c_a5.iG + 2) * db.length >> 1);
            int var5 = cu * 1000 / 120;
            int[][] var6 = new int[][]{{16765320, 13740650, 8023640, 4866613, 4866613, 8023640, 13740650, 16765320}, {1461506, 2392068, 3455750, 4718344, 4718344, 3455750, 2392068, 1461506}, {5046786, 8389892, 12257286, 16714504, 16714504, 12257286, 8389892, 5046786}, {5064450, 8418820, 12299782, 16772360, 16772360, 12299782, 8418820, 5064450}};
            int var7 = c_a5.ic - var1 >> 1;
            if (cY) {
                if (++cB == var5) {
                    cu = 0;
                    cB = 0;
                    cY = false;
                    cX = 0;
                } else if (cB < 4 || cB < 4 || cB >= var5 - 4) {
                    ++cX;
                }

                var0.setColor(c_bm.aG);
                var0.fillRect(var7 + 1, var3 + 1, var1 - 2, var2 - 2);
                int[] var11 = new int[]{c_bm.cW, c_bm.cV, c_bm.cU};

                int var8;
                for(var8 = 0; var8 < 3; ++var8) {
                    var0.setColor(var11[var8]);
                    var0.drawRect(var7 + var8, var3 + var8, var1 - var8 * 2, var2 - var8 * 2);
                }

                int[] var13 = new int[]{c_bm.a9, c_bm.a8, c_bm.a7, c_bm.a5};

                for(var5 = 0; var5 < 4; ++var5) {
                    var0.setColor(var13[var5]);
                    var0.drawRect(var7 + 3 + 2 + var5, var3 + 3 + 2 + var5, var1 - 4 - 2 * (5 + var5), var2 - 4 - 2 * (5 + var5));
                }

                for(var5 = 0; var5 < db.length; ++var5) {
                    var1 = 0;
                    char[] var9 = db[var5].toCharArray();
                    int var10 = c_a5.fq.stringWidth(db[var5]) >> 1;
                    if ((var7 = c_b5.method_if(db[var5], '$')) > 0 && var7 % 2 == 0) {
                        var10 -= c_a5.fq.stringWidth("$") * (var7 / 2);
                    }

                    boolean var12 = false;

                    for(var8 = 0; var8 < var9.length; ++var8) {
                        if (var9[var8] == '$' && !var12) {
                            var12 = true;
                        } else if (var9[var8] == '$' && var12) {
                            var12 = false;
                        } else {
                            if (var12) {
                                if (cX == 3) {
                                    var0.setColor(dk);
                                } else {
                                    var0.setColor(var6[0][cX]);
                                }
                            } else {
                                var0.setColor(var6[0][cX]);
                            }

                            var0.drawChar(var9[var8], c_a5.ic / 2 - var10 + var1, var4 + (c_a5.iG + 2) * var5, 20);
                            var1 += c_a5.fq.charWidth(var9[var8]);
                        }
                    }
                }
            }

        }
    }
}
