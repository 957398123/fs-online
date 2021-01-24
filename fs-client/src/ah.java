import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/21
 * @author 95739
 *
 */
public final class ah extends ba {
    public byte aK;
    private String aS;
    private int aH;
    private int aG;
    private int aF;
    private long a4;
    private boolean aP;
    private boolean aJ;
    private boolean aR;
    public String[] a1;
    public boolean a2;
    public short aN;
    private int aW;
    private boolean a0;
    public boolean aC;
    public static int aQ = 0;

    public ah(short var1, short var2, short var3, short var4, byte var5, String var6, c_be var7) {
        super(var1, var2, var3, var4, var7);
        this.aK = 0;
        this.aH = c_bm.bP;
        new Vector();
        this.aP = false;
        this.aJ = true;
        this.aR = true;
        this.a1 = new String[0];
        this.a2 = false;
        this.aN = 0;
        this.aW = 0;
        this.a0 = true;
        super.y = var5;
        this.a(var6);
        if (var5 == 0) {
            super.b = true;
        }

    }

    public ah(short var1, short var2, short var3, byte var4, String var5, c_be var6) {
        this(var1, var2, var3, (short)16, var4, var5, var6);
    }

    public ah(short var1, short var2, byte var3, String var4, c_be var5) {
        this(var1, var2, (short)0, (short)16, var3, var4, var5);
    }

    public ah(short var1, short var2, byte var3, String var4, boolean var5, c_be var6) {
        this(var1, var2, (short)0, (short)16, (byte)0, var4, var6);
        boolean var7 = true;
        this.aP = var7;
    }

    public ah(short var1, short var2, byte var3, c_be var4, byte var5) {
        this(var1, var2, (short)0, (short)16, var3, "", var4);
    }

    public ah(short var1, short var2, byte var3, c_be var4) {
        this(var1, var2, (short)0, (short)16, var3, "", var4);
    }

    public final void a(byte var1) {
        super.y = var1;
    }

    public final byte method_char() {
        return super.y;
    }

    public final void a(Graphics var1) {
        if (super.y == 0) {
            if (this.aS != null && !this.aS.equals("")) {
                if (!this.aR) {
                    var1.setColor(8224125);
                } else if (!this.aJ) {
                    var1.setColor(16711680);
                } else if (super.d) {
                    var1.setColor(c_bm.field_try);
                } else {
                    var1.setColor(c_bm.bP);
                }

                if (this.q()) {
                    if (this.aP) {
                        c_b5.a(var1, (c_a5.ic - c_b5.method_do(this.aj())) / 2 - 2, super.j - 1, c_b5.method_do(this.aj()) + 3, c_a5.iG + 1);
                    } else {
                        c_b5.a(var1, super.k - 2, super.j - 1, this.aj().length() * c_a5.iA + 3, c_a5.iG + 1);
                    }

                    if (this.aj().equals("修改昵称")) {
                        var1.setColor(16711680);
                    } else {
                        var1.setColor(c_bm.field_try);
                    }
                }

                if (this.aP) {
                    var1.drawString(this.aS, super.k, super.j, 17);
                } else if (this.a2) {
                    if (!super.d && !this.aC) {
                        a(var1, this.aS, super.k, super.j, this.aN);
                    } else {
                        this.a(var1, this.aS, super.k, super.j, this.aN, (byte)1, (byte)3, false);
                    }
                } else {
                    var1.drawString(this.aS, super.k, super.j, 20);
                }

                if (c_a5.es != null && c_a5.es.g9 == 3145731) {
                    int[] var2 = new int[]{4, 6, 10, 12};
                    int[] var3 = new int[]{3, 5, 9, 11};
                    ay[] var4 = new ay[var2.length];
                    ah[] var6 = new ah[var3.length];

                    for(int var5 = 0; var5 < var2.length; ++var5) {
                        var4[var5] = (ay)c_a5.es.cf().elementAt(var2[var5]);
                        var6[var5] = (ah)c_a5.es.cf().elementAt(var3[var5]);
                        if (var4[var5].q()) {
                            c_b5.a(var1, var6[var5].k - 2, var6[var5].j - 1, var6[var5].aj().length() * c_a5.iA + 3, c_a5.iG + 1);
                            var1.setColor(c_bm.field_try);
                            var1.drawString(var6[var5].aS, var6[var5].k, var6[var5].j, 20);
                        } else {
                            var1.setColor(c_bm.bo);
                            var1.drawString(var6[var5].aS, var6[var5].k, var6[var5].j, 20);
                        }
                    }

                    return;
                }
            }
        } else {
            int var7;
            int var9;
            if (super.y == 1) {
                var7 = c_a5.cY.getHeight();
                var1.setColor(c_bm.aS);
                var1.drawRect(super.k, super.j, super.a - 1, var7 - 1);
                var1.setColor(c_bm.cv);
                var1.fillRect(super.k + 1, super.j + 1, super.a - 2, var7 - 2);
                var1.drawImage(c_a5.cY, super.k, super.j, 20);
                c_b5.a(var1, c_a5.cY, super.k + super.a - c_a5.cY.getWidth(), super.j, 2);
                if (this.aS == null || this.aS.equals("")) {
                    return;
                }

                var9 = super.j + (var7 - c_a5.iG) / 2;
                if (c_b5.method_do(this.aS) > super.a - 2 * c_a5.cY.getWidth()) {
                    var1.setColor(this.aH);
                    c_b5.a(var1, this.aS, super.k + c_a5.cY.getWidth(), var9, super.a - 2 * c_a5.cY.getWidth(), (byte)1, (byte)3);
                    return;
                }

                c_b5.method_do(var1, this.aS, super.a, super.k, var9, this.aH);
            } else {
                if (super.y == 2) {
                    c_b5.method_do(var1, this.aG, this.aF, super.k, super.j);
                    return;
                }

                if (super.y == 3) {
                    c_b5.a(var1, (long)this.aG, super.k, super.j);
                    return;
                }

                if (super.y == 7) {
                    c_b5.a(var1, this.a4, super.k, super.j);
                    return;
                }

                short var10;
                if (super.y == 4) {
                    short var12 = super.k;
                    var10 = super.a;
                    var1.setColor(c_bm.ci);
                    var1.drawRect(var12, super.j, var10 - 1, super.field_int - 1);
                    var1.setColor(c_bm.y);
                    var1.fillRect(var12 + 1, super.j + 1, var10 - 2, super.field_int - 2);
                    short var11 = (short)(super.k + (super.a / 2 - c_a5.fq.stringWidth(this.aS) / 2));
                    if (this.aS != null && !this.aS.equals("")) {
                        var1.setColor(c_bm.F);
                        var1.drawString(this.aS, var11, super.j + 2, 20);
                    }

                    return;
                }

                if (super.y == 5) {
                    var7 = c_a5.cY.getHeight();
                    var1.setColor(c_bm.aS);
                    var1.drawRect(super.k, super.j, super.a - 1, var7 - 1);
                    var1.setColor(c_bm.cv);
                    var1.fillRect(super.k + 1, super.j + 1, super.a - 2, var7 - 2);
                    var1.drawImage(c_a5.cY, super.k, super.j, 20);
                    c_b5.a(var1, c_a5.cY, super.k + super.a - c_a5.cY.getWidth(), super.j, 2);
                    if (this.aS != null && !this.aS.equals("")) {
                        var9 = super.j + (var7 - c_a5.iG) / 2;
                        c_b5.method_do(var1, this.aS, super.a, super.k, var9, this.aH);
                    }

                    return;
                }

                if (super.y == 6) {
                    byte var8 = 0;
                    switch(this.aK) {
                    case 1:
                        var8 = 0;
                        break;
                    case 2:
                        var8 = 1;
                        break;
                    case 3:
                        var8 = 4;
                        break;
                    case 4:
                        var8 = 2;
                        break;
                    case 5:
                        var8 = 5;
                        break;
                    case 6:
                        var8 = 3;
                    }

                    if (this.aK != 0) {
                        c_a5.b9.method_if(var1, super.k, super.j, var8);
                    }

                    if (super.d) {
                        var1.setColor(c_bm.field_try);
                    } else {
                        var1.setColor(c_bm.bP);
                    }

                    var10 = this.aK == 0 ? 0 : c_a5.eq.field_try;
                    if (this.a2) {
                        if (super.d) {
                            this.a(var1, this.aS, super.k + var10, super.j, this.aN, (byte)1, (byte)3, false);
                            return;
                        }

                        a(var1, this.aS, super.k + var10, super.j, this.aN);
                        return;
                    }

                    var1.drawString(this.aS, super.k + var10, super.j, 20);
                }
            }
        }

    }

    public final void a(Graphics var1, int[] var2, int[] var3, int var4) {
        Object var7 = null;
        int[] var8;
        if (c_a5.ht % 8 < 4) {
            var8 = var2;
        } else {
            var8 = var3;
        }

        switch(super.y) {
        case 4:
            short var5 = super.k;
            short var6 = super.a;
            var1.setColor(var8[0]);
            var1.drawRect(var5, super.j, var6 - 1, super.field_int - 1);
            var1.setColor(var8[1]);
            var1.fillRect(var5 + 1, super.j + 1, var6 - 2, super.field_int - 2);
            var5 = (short)(super.k + (super.a / 2 - c_a5.fq.stringWidth(this.aS) / 2));
            if (this.aS != null && !this.aS.equals("")) {
                var1.setColor(var8[2]);
                var1.drawString(this.aS, var5, super.j + 2, 20);
            }
        default:
        }
    }

    public final void a(Graphics var1, int var2) {
        var1.setColor(var2);
        var1.drawString(this.aS, super.k, super.j, 20);
    }

    public final String aj() {
        if (this.aS == null) {
            this.aS = "";
        }

        return this.aS;
    }

    public final void a(String var1) {
        this.aS = var1;
        if (super.y == 0) {
            this.method_do((short)c_b5.method_do(var1));
        }

    }

    public static int ad() {
        return c_a5.cY.getHeight();
    }

    public final void method_char(int var1) {
        this.aH = var1;
    }

    public final void b(boolean var1) {
        this.method_new((short)((c_a5.es.method_for() - super.a) / 2));
    }

    public final int ag() {
        return this.aG;
    }

    public final void method_case(int var1) {
        this.aG = var1;
        if (super.y == 2) {
            super.a = (short)c_b5.method_do(var1, this.aF)[0];
            super.field_int = (short)c_b5.method_do(var1, this.aF)[1];
        } else {
            if (super.y == 3) {
                super.a = (short)c_b5.a((long)var1)[0];
                super.field_int = (short)c_b5.a((long)var1)[1];
            }

        }
    }

    public final void a(long var1) {
        this.a4 = var1;
        super.a = (short)c_b5.a(this.a4)[0];
        super.field_int = (short)c_b5.a(this.a4)[1];
    }

    public final void method_byte(int var1) {
        this.aF = var1;
        if (super.y == 2) {
            super.a = (short)c_b5.method_do(this.aG, var1)[0];
            super.field_int = (short)c_b5.method_do(this.aG, var1)[1];
        }

    }

    public final void method_void(boolean var1) {
        this.aP = var1;
    }

    public final void method_long(boolean var1) {
        this.aJ = var1;
    }

    public final void method_goto(boolean var1) {
        this.aR = var1;
    }

    public final void a(Graphics var1, String var2, int var3, int var4, int var5, byte var6, byte var7, boolean var8) {
        if (c_b5.method_do(var2) <= var5 && !var8) {
            var1.drawString(var2, var3, var4, 20);
        } else {
            int var12 = var1.getClipX();
            int var13 = var1.getClipY();
            int var9 = var1.getClipWidth();
            int var10 = var1.getClipHeight();
            var1.setClip(var3, var4, var5, c_a5.iG + 3);
            int var11;
            switch(var6) {
            case 0:
                if ((var11 = var3 + var5 - 3 * this.aW) + c_b5.method_do(var2) < var3) {
                    this.aW = 0;
                } else {
                    ++this.aW;
                }

                var1.drawString(var2, var11, var4, 20);
                break;
            case 1:
                if (this.a0) {
                    var11 = var3 - 3 * this.aW;
                    var1.drawString(var2, var11, var4, 20);
                    ++this.aW;
                    if (var11 + c_b5.method_do(var2) < var3 + var5) {
                        this.a0 = false;
                        this.aW = 0;
                    }
                } else {
                    var11 = var3 - (c_b5.method_do(var2) - var5) + 3 * this.aW;
                    var1.drawString(var2, var11, var4, 20);
                    ++this.aW;
                    if (var11 > var3) {
                        this.a0 = true;
                        this.aW = 0;
                    }
                }
            }

            var1.setClip(var12, var13, var9, var10);
        }
    }

    private static void a(Graphics var0, String var1, int var2, int var3, int var4) {
        if (c_b5.method_do(var1) <= var4) {
            var0.drawString(var1, var2, var3, 20);
        } else {
            var4 = var4 / c_a5.iA - 1;
            var0.drawString(var1.substring(0, var4) + "...", var2, var3, 20);
        }
    }

    public final void f() {
        if (super.field_byte) {
            if (this.y() == null) {
                return;
            }

            if (c_a5.method_try(4096)) {
                this.y().c8();
            } else if (c_a5.method_try(8192)) {
                this.y().c9();
            }

            if (c_a5.method_byte(65536) || c_a5.method_byte(131072)) {
                this.y().dc();
                switch(c_a5.es.g9) {
                case 2555905:
                    int var1;
                    if ((var1 = (Integer)this.y().db().elementAt(this.y().de())) == 2555906) {
                        az.n = 0;
                    } else if (var1 == 2555905) {
                        if (az.h == 0) {
                            c_as.a((byte)0, "您现在处在自己的农场", "确定", "", -1, -2);
                            super.field_byte = false;
                            return;
                        }

                        if (az.m != 0) {
                            az.m = 0;
                            c_a5.eQ.a(2555952);
                        }

                        az.field_else = 0;
                    }

                    c_a5.eQ.a(var1);
                    super.field_byte = false;
                default:
                    return;
                }
            }

            if (c_a5.method_byte(262144)) {
                super.field_byte = false;
                this.y().da();
                return;
            }
        } else if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
            this.af();
        }

    }

    public final void af() {
        switch(c_a5.es.g9) {
        case 2555905:
            ah var1 = (ah)c_a5.es.cf().elementAt(35);
            ah var2 = (ah)c_a5.es.cf().elementAt(36);
            ah var3 = (ah)c_a5.es.cf().elementAt(37);
            String[] var4;
            c_br var5;
            int[] var6;
            int[] var7;
            if (var1.q()) {
                var5 = new c_br((byte)0);
                if (az.h == 0) {
                    var6 = new int[]{2555906, 2555911, 2555907, 2555915, 2555910, 2555914, 2555976};
                    var7 = new int[]{2, 2, 2, 2, 2, 2, 2};
                    var4 = new String[]{"详情", "仓库", "种子背包", "道具背包", "公告板", "农场动态", "农场帮助"};
                    var5.a(var4, var6, var7);
                } else if (az.h == 1) {
                    var6 = new int[]{2555906, 2555914, 2555976};
                    var7 = new int[]{2, 2, 2};
                    var4 = new String[]{"详情", "农场动态", "农场帮助"};
                    var5.a(var4, var6, var7);
                }

                this.a(var5);
                super.field_byte = true;
                this.y().da();
                return;
            } else if (var2.q()) {
                var5 = new c_br((byte)0);
                var6 = new int[]{2555908, 2555957};
                var7 = new int[]{2, 2};
                var4 = new String[]{"种子商店", "道具商店"};
                var5.a(var4, var6, var7);
                this.a(var5);
                super.field_byte = true;
                this.y().da();
                return;
            } else if (var3.q()) {
                var5 = new c_br((byte)0);
                var6 = new int[]{2555905, 2555912, 2555913};
                var7 = new int[]{3, 2, 2};
                var4 = new String[]{"自家农场", "去偷好友", "去偷仇人"};
                var5.a(var4, var6, var7);
                this.a(var5);
                super.field_byte = true;
                this.y().da();
            }
        default:
        }
    }

    public final long al() {
        return this.a4;
    }
}
