import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

/**
 * 2020/01/22
 * @author 95739
 *
 */
public final class c_bv extends ba {
    private c_y i3;
    private Vector kN;
    private int[] j4;
    private byte jJ;
    private boolean jy;
    public byte la;
    public static byte kq;
    public static byte kT;
    public static int ks;
    public static byte k6;
    public static int jI = -1;
    public static long le = -1L;
    public static short j9;
    public static short j8;
    public byte jE;
    private int kD;
    private int kC;
    private boolean kV;
    private boolean kX;
    public static boolean jP = true;
    public static boolean jp = true;
    public static int[] ju = new int[0];
    private int jT;
    private int ku;
    private static String lh = "";
    public boolean kl;
    public int jl;
    public byte j7;

    public c_bv(short var1, short var2, short var3, short var4, byte var5, c_be var6) {
        super(var1, var2, var3, var4, var6);
        new Vector();
        this.jy = false;
        this.jE = -1;
        this.kD = 0;
        this.kC = 0;
        this.kV = true;
        this.kX = true;
        this.jT = -1;
        this.ku = -1;
        this.kl = false;
        this.jl = 0;
        this.j7 = 0;
        super.y = var5;
        super.b = true;
        this.kN = new Vector();
        this.i3 = new c_y(var1, var2, var3, var4, (byte)1, var6);
        this.kD = super.k + 10 + 3 + 1 + 1 + 3;
        this.kC = super.j + 5 + 1 + 1 + 1 + 2;
        this.la = 0;
        this.a(var5);
    }

    public final int t(int var1) {
        if (var1 >= 0 && var1 <= this.j4.length - 1) {
            return this.j4[var1];
        } else {
            throw new IndexOutOfBoundsException("越界");
        }
    }

    public final void method_if(int[] var1) {
        this.j4 = var1;
    }

    public final void a(Graphics var1) {
        if (this.i3 != null) {
            this.i3.a(var1);
        }

        if (this.i3.U != null) {
            this.i3.U.a(var1);
        }

        int var2;
        int var3;
        c_bv var6;
        switch(super.y) {
        case 0:
        case 3:
        case 4:
        case 5:
            var1 = var1;
            var6 = this;
            var2 = this.jl;

            for(var3 = this.kN.size() < this.jJ ? this.kN.size() : this.jJ + this.jl; var2 < var3; ++var2) {
                c_m var4 = (c_m)var6.kN.elementAt(var2);
                short var5;
                int var7;
                if (var6.kX && var2 == var6.la && var6.q()) {
                    if (var6.kV) {
                        var1.setColor(c_bm.bP);
                        var1.fillRect(var6.kD + 1, var6.kC + (var2 + 1 - var6.jl) + (var2 - var6.jl) * var6.dp(), var6.dF(), var6.dp() - 2);
                    } else {
                        var1.setColor(c_bm.bP);
                        if (var6.jy) {
                            var5 = var6.k;
                            if ((var6.a - 30 - c_b5.method_do(var4.method_case())) / 2 > 0) {
                                var7 = var5 + (var6.a - c_b5.method_do(var4.method_case())) / 2;
                            } else {
                                var7 = var6.kD + 6;
                            }

                            var1.fillRect(var7 - 1, var6.kC + (var2 + 1 - var6.jl) + (var2 - var6.jl) * var6.dp() + 6 - 4 + 1, var4.method_int() + 1, var6.dp() + 1);
                        } else {
                            var1.fillRect(var6.kD + 4, var6.kC + (var2 + 1 - var6.jl) + (var2 - var6.jl) * var6.dp() + 6 - 4 + 1, var4.method_int() + 1, var6.dp() + 1);
                        }
                    }
                }

                if (var6.kV) {
                    if (var6.jy) {
                        var5 = var6.k;
                        if ((var6.a - 30 - c_b5.method_do(var4.method_case())) / 2 > 0) {
                            var7 = var5 + (var6.a - c_b5.method_do(var4.method_case())) / 2;
                        } else {
                            var7 = var6.kD + 6;
                        }

                        var4.a(var1, var7, var6.kC + (var2 - var6.jl) + (var2 - var6.jl) * var6.dp() + 3, var6.dF(), var6.i3.U, var2 == var6.la && var6.kX && var6.q(), false);
                    } else {
                        var4.a(var1, var6.kD + 6, var6.kC + (var2 - var6.jl) + (var2 - var6.jl) * var6.dp() + 3, var6.dF(), var6.i3.U, var2 == var6.la && var6.kX && var6.q(), false);
                    }

                    var1.setColor(c_bm.bY);
                    var1.drawLine(var6.kD, var6.kC + (var2 - var6.jl) + (var2 - var6.jl + 1) * var6.dp(), var6.kD + var6.dF(), var6.kC + (var2 - var6.jl) + (var2 - var6.jl + 1) * var6.dp());
                } else if (var6.jy) {
                    var5 = var6.k;
                    if ((var6.a - 30 - c_b5.method_do(var4.method_case())) / 2 > 0) {
                        var7 = var5 + (var6.a - c_b5.method_do(var4.method_case())) / 2;
                    } else {
                        var7 = var6.kD + 6;
                    }

                    var4.a(var1, var7, var6.kC + (var2 - var6.jl) + (var2 - var6.jl) * var6.dp() + 6 - 4, var6.dF(), var6.i3.U, var2 == var6.la && var6.kX && var6.q(), false);
                } else {
                    var4.a(var1, var6.kD + 6, var6.kC + (var2 - var6.jl) + (var2 - var6.jl) * var6.dp() + 6 - 4, var6.dF(), var6.i3.U, var2 == var6.la && var6.kX && var6.q(), false);
                }
            }

            return;
        case 1:
            var1 = var1;
            var6 = this;
            var2 = this.jl;

            for(var3 = this.kN.size() < this.jJ ? this.kN.size() : this.jJ + this.jl; var2 < var3; ++var2) {
                ((c_m)var6.kN.elementAt(var2)).a(var1, var6.kD, var6.kC + (var2 - var6.jl) + (var2 - var6.jl) * c_m.method_else(), var6.dF(), var6.i3.U, var2 == var6.la, false);
            }

            return;
        case 2:
            var1 = var1;
            var6 = this;
            var2 = this.jl;

            for(var3 = this.kN.size() < this.jJ ? this.kN.size() : this.jJ + this.jl; var2 < var3; ++var2) {
                ((c_m)var6.kN.elementAt(var2)).a(var1, var6.kD, var6.kC + (var2 - var6.jl) + (var2 - var6.jl) * c_m.method_do(), var6.dF(), var6.i3.U, var2 == var6.la, var2 == c_be.gL);
            }
        default:
        }
    }

    public final Vector dt() {
        return this.kN;
    }

    public final void a(c_m var1) {
        this.kN.addElement(var1);
        boolean var2 = false;
        int var10001 = this.kN.size() * this.dp();
    }

    public final c_y dr() {
        return this.i3;
    }

    public final byte z$132bd3() {
        byte var1 = 0;

        for(short var2 = 0; var2 <= (this.kV ? (short)(super.field_int - 24) : (short)(super.field_int - 24 - 12)); ++var1) {
            switch(super.y) {
            case 0:
            case 3:
            case 4:
            case 5:
                var2 += this.dp();
                break;
            case 1:
                var2 += c_m.method_else();
                break;
            case 2:
                var2 += c_m.method_do();
            }
        }

        return --var1;
    }

    public final short dF() {
        boolean var1 = false;
        short var2;
        if (this.i3.U != null) {
            var2 = (short)(super.a - 38 - 10);
        } else {
            var2 = (short)(super.a - 38);
        }

        return var2;
    }

    public final void method_new(short var1) {
        super.method_new(var1);
        this.i3.method_new(var1);
    }

    public final void method_for(short var1) {
        super.method_for(var1);
        this.i3.method_for(var1);
    }

    public final void method_do(short var1) {
        super.method_do(var1);
        this.i3.method_do(var1);
    }

    public final void a(short var1) {
        super.a(var1);
        this.i3.a(var1);
    }

    public final void o(boolean var1) {
        this.jy = var1;
    }

    public final byte dw() {
        return this.la;
    }

    public final void y(byte var1) {
        this.la = var1;
    }

    public final void s(int var1) {
        c_m var2;
        label30:
        switch(var1) {
        case -6:
            var1 = 0;

            while(true) {
                if (var1 >= this.kN.size()) {
                    break label30;
                }

                var2 = (c_m)this.kN.elementAt(var1);
                ju[var1] = c_a5.iH[var1];
                var2.method_if(c_m.a(ju[var1]));
                ++var1;
            }
        case -5:
            for(var1 = 0; var1 < this.kN.size(); ++var1) {
                var2 = (c_m)this.kN.elementAt(var1);
                ju[var1] = 0;
                var2.method_if("");
            }

            c_as.a6();
            return;
        case -4:
        case -2:
        default:
            return;
        case -3:
            c_m var3 = (c_m)this.kN.elementAt(this.ku);
            ju[this.ku] = 0;
            this.ku = -1;
            var3.method_if("");
            var3 = (c_m)this.kN.elementAt(c_be.gL);
            ju[c_be.gL] = this.jT;
            var3.method_if(c_m.a(ju[c_be.gL]));
            c_be.gL = -1;
            break;
        case -1:
            c_as.a6();
            return;
        }

        c_as.a6();
    }

    public final void f() {
        int var12;
        c_m var14;
        if (c_be.gL != -1) {
            if (c_a5.et != 0) {
                if (c_a5.et >= 1 && c_a5.et <= 65536) {
                    boolean var16 = true;

                    for(var12 = 0; var12 < ju.length; ++var12) {
                        if (c_be.gL != var12 && (ju[var12] & c_a5.et) != 0) {
                            this.ku = var12;
                            this.jT = ju[var12];
                            var16 = false;
                            c_as.a((byte)6, "您所输入的按键已经作用于其他功能上，是否确定操作", "是", "否", -3, -1);
                            break;
                        }
                    }

                    if (var16) {
                        var14 = (c_m)this.kN.elementAt(c_be.gL);
                        ju[c_be.gL] = c_a5.et;
                        var14.method_if(c_m.a(ju[c_be.gL]));
                        c_be.gL = -1;
                    }
                } else if (c_a5.et == 262144) {
                	c_be.gL = -1;
                } else {
                	c_as.a((byte)0, "不能设置您所输入的按键！", "确定", "", -1, -2);
                }
            }
        } else {
            int var10;
            if (super.field_byte) {
                if (c_a5.method_try(4096)) {
                    this.y().c8();
                } else if (c_a5.method_try(8192)) {
                    this.y().c9();
                } else if (!c_a5.method_byte(65536) && !c_a5.method_byte(131072)) {
                    if (c_a5.method_byte(262144)) {
                    	c_b5.method_case("in uilist soft2");
                        super.field_byte = false;
                        this.a((c_br)null);
                    }
                } else {
                    this.y().dc();
                    if (super.y == 2) {
                        switch((Integer)this.y().db().elementAt(this.y().de())) {
                        case -8:
                            var14 = (c_m)this.kN.elementAt(this.la);
                            ju[this.la] = 0;
                            var14.method_if("");
                            break;
                        case -7:
                        	c_be.gL = this.la;
                            break;
                        case -6:
                        	c_as.a((byte)6, "是否恢复到默认设置的按键?", "是", "否", -6, -1);
                            break;
                        case -5:
                        	c_as.a((byte)6, "是否清空当前设置的所有按键?", "是", "否", -5, -1);
                        }

                        super.field_byte = false;
                    } else if (super.y == 3) {
                        if ((var10 = (Integer)this.y().db().elementAt(this.y().de())) != -1) {
                            if (var10 == -1610612730) {
                                a(var10, (short)this.t(this.la));
                            } else if (var10 == 1572867) {
                            	c_a5.eQ.a(var10);
                            }
                        }

                        super.field_byte = false;
                    } else if (super.y == 4) {
                        if ((var10 = (Integer)this.y().db().elementAt(this.y().de())) != -1 && var10 == -1610612731) {
                            this.u(var10);
                        }

                        super.field_byte = false;
                    } else if (super.y == 5) {
                        if ((var10 = (Integer)this.y().db().elementAt(this.y().de())) != -1 && var10 == -1610612730) {
                            a(var10, (short)this.t(this.la));
                        }

                        super.field_byte = false;
                    } else {
                    	c_m var15;
                        switch(c_a5.es.g9) {
                        case 1441793:
                            if ((var10 = (Integer)this.y().db().elementAt(this.y().de())) >= 0) {
                                switch(var10) {
                                case 1441794:
                                case 1441795:
                                case 1441796:
                                case 1441797:
                                	c_a5.eQ.a(var10);
                                }
                            }

                            super.field_byte = false;
                            break;
                        case 1835012:
                            jI = ((c_m)this.dt().elementAt(this.la)).q;
                            if ((var12 = (Integer)this.y().db().elementAt(this.y().de())) >= 0) {
                                switch(var12) {
                                case 1835016:
                                case 1835017:
                                case 1835020:
                                	c_i.method_if(var12);
                                case 1835018:
                                case 1835019:
                                case 1835021:
                                case 1835022:
                                case 1835023:
                                case 1835024:
                                case 1835025:
                                case 1835026:
                                case 1835027:
                                default:
                                    break;
                                case 1835028:
                                case 1835029:
                                	c_a5.eQ.a(var12);
                                }
                            }

                            super.field_byte = false;
                            break;
                        case 1835021:
                            if (this.dt().size() > 0) {
                                jI = (var15 = (c_m)this.dt().elementAt(this.la)).q;
                                le = var15.aa;
                            }

                            if ((var10 = (Integer)this.y().db().elementAt(this.y().de())) >= 0) {
                                switch(var10) {
                                case 1835022:
                                case 1835025:
                                	c_a5.eQ.a(var10);
                                    break;
                                case 1835023:
                                	c_i.a(1835023, "", "");
                                    break;
                                case 1835024:
                                	c_a5.eQ.a(1835026);
                                }
                            }

                            super.field_byte = false;
                            break;
                        case 1835030:
                        case 1835031:
                            if (this.dt().size() > 0) {
                                jI = ((c_m)this.dt().elementAt(this.la)).q;
                            }

                            if ((var10 = (Integer)this.y().db().elementAt(this.y().de())) >= 0) {
                                switch(var10) {
                                case 1835018:
                                case 1835019:
                                	c_a5.eQ.a(var10);
                                }
                            }

                            super.field_byte = false;
                            break;
                        case 2490385:
                            var15 = (c_m)this.dt().elementAt(this.la);
                            var12 = (Integer)this.y().db().elementAt(this.y().de());
                            c_bg.hP = var15.J;
                            if (var12 == -268435452) {
                                a3.a(var15.J, var15.method_case(), true);
                            } else {
                                if (var12 == 720897) {
                                	c_bu.k = var15.J;
                                }

                                if (var12 == 196638) {
                                	c_l.field_try = var15.J;
                                }

                                c_a5.eQ.a(var12);
                            }

                            super.field_byte = false;
                            break;
                        default:
                            label658: {
                                switch(this.jE) {
                                case 2:
                                case 9:
                                case 12:
                                case 15:
                                case 29:
                                    if (this.j4 != null) {
                                        jI = this.j4[this.la];
                                    }

                                    c_b5.method_case("选中任务ID：" + jI);
                                    if ((var10 = (Integer)this.y().db().elementAt(this.y().de())) == -1) {
                                        super.field_byte = false;
                                    } else if (var10 != 262148 && var10 != 262155) {
                                    	c_a5.eQ.a(var10);
                                        super.field_byte = false;
                                    } else {
                                        c_as.a((byte)0, "您确定要放弃此任务？", "确定", "取消", var10, -1);
                                        super.field_byte = false;
                                    }
                                case 3:
                                case 6:
                                case 7:
                                case 8:
                                case 10:
                                case 11:
                                case 13:
                                case 14:
                                case 16:
                                case 17:
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
                                case 30:
                                case 31:
                                case 33:
                                case 34:
                                case 35:
                                case 37:
                                case 39:
                                case 40:
                                case 42:
                                case 43:
                                case 45:
                                case 46:
                                case 48:
                                case 49:
                                case 51:
                                case 52:
                                case 54:
                                case 55:
                                case 58:
                                case 60:
                                case 62:
                                case 64:
                                case 65:
                                case 66:
                                case 68:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 76:
                                case 77:
                                case 78:
                                case 80:
                                case 81:
                                case 83:
                                case 84:
                                case 85:
                                case 88:
                                default:
                                    break label658;
                                case 4:
                                    if ((var10 = (Integer)this.y().db().elementAt(this.y().de())) != -1) {
                                        label856: {
                                            var14 = (c_m)this.dt().elementAt(this.la);
                                            switch(var10) {
                                            case -1610612726:
                                                a3.a(var14.L, var14.m, true);
                                                break label856;
                                            case 589831:
                                            case 589835:
                                            	c_bg.hP = var14.L;
                                                break;
                                            case 720899:
                                            case 720900:
                                            case 720901:
                                            case 720902:
                                            case 720908:
                                            case 720910:
                                                if (c_bu.e == 2 && c_a5.fE.size() > 0) {
                                                	c_a5.c9 = ((c_be)c_a5.fE.elementAt(0)).ht;
                                                }

                                                c_bu.k = var14.L;
                                            case 720919:
                                            case 720920:
                                                break;
                                            default:
                                                break label856;
                                            }

                                            c_a5.eQ.a(var10);
                                        }
                                    }

                                    super.field_byte = false;
                                    break label658;
                                case 5:
                                    switch(var10 = (Integer)this.y().db().elementAt(this.y().de())) {
                                    case 393218:
                                    	c_a5.eQ.a(var10);
                                        break;
                                    case 393227:
                                    	c_be.cn();
                                    	c_a5.eQ.a(var10);
                                    }

                                    super.field_byte = false;
                                    break label658;
                                case 18:
                                    var10 = (Integer)this.y().db().elementAt(this.y().de());
                                    bw.field_goto = (var14 = (c_m)((c_m)this.kN.elementAt(this.la))).field_char;
                                    bw.i = var14.r;
                                    bw.field_int = var14.i;
                                    if (var10 == 1) {
                                        if (bw.field_int < bw.field_case) {
                                        	c_as.cH = bw.field_int;
                                        } else {
                                        	c_as.cH = bw.field_case;
                                        }

                                        c_as.a((byte)13, new String[]{"当前最高价：" + bw.i, "一口价：" + bw.field_int, "请输入你的出价"}, "确定", "取消", bw.e ? 1900553 : 1900555, -1);
                                        super.field_byte = false;
                                    } else {
                                    	c_a5.eQ.a(var10);
                                        super.field_byte = false;
                                    }
                                    break label658;
                                case 32:
                                case 38:
                                case 44:
                                case 50:
                                case 56:
                                case 63:
                                case 67:
                                case 75:
                                case 79:
                                    bb.field_new = (var15 = (c_m)this.kN.elementAt(this.la)).Y;
                                    bb.field_int = var15.method_case();
                                    var12 = (Integer)this.y().db().elementAt(this.y().de());
                                    break;
                                case 36:
                                case 41:
                                case 47:
                                case 53:
                                case 57:
                                case 61:
                                    bb.field_char = ((c_m)this.kN.elementAt(this.la)).q;
                                    var12 = (Integer)this.y().db().elementAt(this.y().de());
                                    break;
                                case 59:
                                    bb.field_new = (var15 = (c_m)this.kN.elementAt(this.la)).Y;
                                    bb.field_int = var15.method_case();
                                    var12 = (Integer)this.y().db().elementAt(this.y().de());
                                    break;
                                case 82:
                                    at.field_for = ((c_m)this.kN.elementAt(this.la)).q;
                                    var12 = (Integer)this.y().db().elementAt(this.y().de());
                                    break;
                                case 86:
                                    if ((al.a = (var15 = (c_m)this.kN.elementAt(this.la)).q) >= 0) {
                                        j9 = var15.K;
                                        j8 = var15.I;
                                        var12 = (Integer)this.y().db().elementAt(this.y().de());
                                        c_a5.eQ.a(var12);
                                    }

                                    super.field_byte = false;
                                    break label658;
                                case 87:
                                    var10 = (Integer)this.y().db().elementAt(this.y().de());
                                    az.field_else = ((c_m)this.kN.elementAt(this.la)).e();
                                    az.o = (Byte)az.g.elementAt(this.y().de());
                                    c_a5.eQ.a(var10);
                                    super.field_byte = false;
                                    break label658;
                                case 89:
                                    var15 = (c_m)this.kN.elementAt(this.la);
                                    switch(var12 = (Integer)this.y().db().elementAt(this.y().de())) {
                                    case -1610612633:
                                        c_as.a((byte)0, "是否退出战场？强行退出后会有短暂的惩罚时间不能进入战场！", "确定", "取消", 852001, -1);
                                        break;
                                    case 196642:
                                        c_l.d = true;
                                        c_l.field_goto = this.y().de();
                                        break;
                                    case 852021:
                                    case 852023:
                                        c_l.field_void = var15.w;
                                    }
                                }

                                c_a5.eQ.a(var12);
                                super.field_byte = false;
                            }
                        }
                    }
                }
            } else {
                ah var1;
                c_ao var2;
                c_m var5;
                if (c_a5.method_try(4096)) {
                    if (this.kN.size() == 0) {
                        return;
                    }

                    if (this.kX) {
                        --this.la;
                        if (this.la < 0) {
                            this.la = 0;
                            this.kl = true;
                        } else {
                            c_b5.p = 0;
                            c_b5.d = 0;
                            this.kl = false;
                        }
                    }

                    if (c_a5.method_else() == 16) {
                        this.dI();
                    } else if (c_a5.es.g9 == 2359297) {
                        o.field_int = this.la;
                        (var1 = (ah)c_a5.es.cf().elementAt(6)).a(o.field_if[this.la]);
                        var1.method_new((short)(c_a5.ic - var1.method_for() >> 1));
                        ((ah)c_a5.es.cf().elementAt(7)).a(o.field_do[this.la]);
                        ((ah)c_a5.es.cf().elementAt(8)).a(o.a[this.la]);
                    } else if (c_a5.es.g9 != 2424994 && c_a5.es.g9 != 2425072) {
                        if (c_a5.es.g9 == 1703958) {
                            ((ak)c_a5.es.cf().elementAt(4)).method_if(c_q.field_byte[this.la]);
                        } else if (c_a5.es.g9 == 1703969) {
                            ((ak)c_a5.es.cf().elementAt(6)).method_if(c_q.field_case[this.la]);
                        }
                    } else {
                        B(this.la);
                    }

                    if (c_a5.es.g9 == 1900548 || c_a5.es.g9 == 1900546) {
                        this.dE();
                    }

                    if (c_a5.es.g9 == 262153 && this.dt().size() > 0) {
                        C(((c_m)this.dt().elementAt(this.la)).method_char());
                    }

                    if (c_a5.es.g9 == 852020) {
                        var5 = (c_m)this.dt().elementAt(this.la);
                        var2 = (c_ao)c_a5.es.cf().elementAt(1);
                        if (var5.field_else == 4125) {
                            var2.a("", 0);
                        } else {
                            var2.a("操作", 0);
                        }
                    }

                    if (this.dr().L() == null) {
                        return;
                    }

                    if (this.kX) {
                        if (this.la < this.dr().L().aj) {
                            --this.jl;
                        }
                    } else {
                        --this.jl;
                        if (this.jl < 0) {
                            this.jl = 0;
                        }

                        this.dr().L().method_char((short)this.jl);
                    }

                    c_b5.method_case("selectedIndex = " + this.la + "  startIndex = " + this.jl);
                } else if (c_a5.method_try(8192)) {
                    if (this.kN.size() == 0) {
                        return;
                    }

                    if (this.kX) {
                        ++this.la;
                        this.kl = false;
                        if (this.la > this.kN.size() - 1) {
                            this.la = (byte)(this.kN.size() - 1);
                        } else {
                            c_b5.p = 0;
                            c_b5.d = 0;
                        }
                    }

                    if (c_a5.method_else() == 16) {
                        this.dI();
                    } else if (c_a5.es.g9 == 2359297) {
                        o.field_int = this.la;
                        (var1 = (ah)c_a5.es.cf().elementAt(6)).a(o.field_if[this.la]);
                        var1.method_new((short)(c_a5.ic - var1.method_for() >> 1));
                        ((ah)c_a5.es.cf().elementAt(7)).a(o.field_do[this.la]);
                        ((ah)c_a5.es.cf().elementAt(8)).a(o.a[this.la]);
                    } else if (c_a5.es.g9 != 2424994 && c_a5.es.g9 != 2425072) {
                        if (c_a5.es.g9 == 1703958) {
                            ((ak)c_a5.es.cf().elementAt(4)).method_if(c_q.field_byte[this.la]);
                        } else if (c_a5.es.g9 == 1703969) {
                            ((ak)c_a5.es.cf().elementAt(6)).method_if(c_q.field_case[this.la]);
                        }
                    } else {
                        B(this.la);
                    }

                    if (c_a5.es.g9 == 1900548 || c_a5.es.g9 == 1900546) {
                        this.dE();
                    }

                    if (c_a5.es.g9 == 262153) {
                        C(((c_m)this.dt().elementAt(this.la)).method_char());
                    }

                    if (c_a5.es.g9 == 852020) {
                        var5 = (c_m)this.dt().elementAt(this.la);
                        var2 = (c_ao)c_a5.es.cf().elementAt(1);
                        if (var5.field_else == 4125) {
                            var2.a("", 0);
                        } else {
                            var2.a("操作", 0);
                        }
                    }

                    if (this.dr().L() == null) {
                        return;
                    }

                    if (this.kX) {
                        if (this.la >= this.dr().L().aj + this.dr().L().ay) {
                            ++this.jl;
                        }
                    } else {
                        ++this.jl;
                        if (this.jl > this.dr().L().az - this.dr().L().ay) {
                            this.jl = this.dr().L().az - this.dr().L().ay;
                        }

                        this.dr().L().method_char((short)this.jl);
                    }

                    c_b5.method_case("selectedIndex = " + this.la + "  startIndex = " + this.jl);
                } else if (!c_a5.method_byte(65536) && !c_a5.method_byte(131072)) {
                    if (c_a5.es.g9 == 1703969) {
                        if (c_a5.method_byte(2048)) {
                            ak var13 = (ak)c_a5.es.cf().elementAt(6);
                            if (this.q()) {
                                this.a(false, c_a5.es);
                                var13.a(true, c_a5.es);
                                var13.method_new((byte)2);
                                var13.ap();
                            }
                        }
                    } else if (super.y == 2) {
                        if (c_a5.method_byte(2048)) {
                            c_be.gL = this.la;
                        } else if (c_a5.method_byte(1024)) {
                            var5 = (c_m)this.kN.elementAt(this.la);
                            ju[this.la] = 0;
                            var5.method_if("");
                        }
                    }
                } else {
                    c_b5.method_case("clientCommand = " + c_a5.es.g9);
                    if (this.jE == 8) {
                        k6 = ((c_m)this.dt().elementAt(this.la)).method_long();
                        c_a5.eQ.a(131076);
                        return;
                    }

                    if (this.jE == 10) {
                        if (this.dt().size() == 0) {
                            return;
                        }

                        bf.a = this.j4[this.la];
                        c_a5.eQ.a(262166);
                        c_a5.d6.addElement(c_a5.es);
                        return;
                    }

                    if (this.jE == 11) {
                        if (this.dt().size() == 0) {
                            return;
                        }

                        bf.a = this.j4[this.la];
                        c_a5.eQ.a(262167);
                        c_a5.d6.addElement(c_a5.es);
                        return;
                    }

                    if (this.jE == 13) {
                        if (this.dt().size() == 0) {
                            return;
                        } else {
                            bf.a = this.j4[this.la];
                            c_a5.eQ.a(262169);
                            c_a5.d6.addElement(c_a5.es);
                            return;
                        }
                    }

                    if (this.jE == 14) {
                        if (this.dt().size() == 0) {
                            return;
                        }

                        bf.a = this.j4[this.la];
                        c_a5.eQ.a(262170);
                        c_a5.d6.addElement(c_a5.es);
                        return;
                    }

                    if (this.jE == 7) {
                        bf.field_if = false;
                        kT = (byte)(this.la + 1);
                        j9 = (var5 = (c_m)this.kN.elementAt(this.la)).K;
                        j8 = var5.I;
                        if (c_a5.es.g9 == 655363) {
                            var10 = 262194;
                        } else {
                            var10 = 262162;
                        }

                        c_a5.eQ.a(var10);
                    } else if (this.jE == 17) {
                        ax.a = ((c_m)this.kN.elementAt(this.la)).A;
                        c_a5.eQ.a(1507330);
                        c_a5.d6.addElement(c_a5.es);
                    } else {
                        c_bv var8;
                        if (this.jE == 19) {
                            switch(this.la) {
                            case 0:
                                c_a5.d6.addElement(c_a5.es);
                                bw.field_for = 0;
                                bw.field_long = -1;
                                bw.field_try = -1;
                                bw.field_else = -1;
                                bw.b = -1;
                                bw.a();
                                c_a5.eQ.a(1900546);
                                break;
                            case 1:
                                bw.field_for = 1;
                                bw.field_long = -1;
                                bw.field_try = -1;
                                bw.field_else = -1;
                                bw.b = -1;
                                c_a5.d6.addElement(c_a5.es);
                                (c_a5.es = c_e.a("/ui/ulist.ui")).g9 = -1610612724;
                                ((c_ao)c_a5.es.cf().elementAt(0)).method_do("武　器");
                                ((c_ao)c_a5.es.cf().elementAt(1)).a("确定", 0);
                                (var8 = (c_bv)c_a5.es.cf().elementAt(2)).dy();

                                for(var12 = 0; var12 < c_bm.Z.length; ++var12) {
                                    var8.a(new c_m(c_bm.Z[var12], (byte)0, (byte)0, var8.dF()));
                                }

                                var8.jE = 20;
                                a(var8, (byte)0);
                                break;
                            case 2:
                                bw.field_for = 2;
                                bw.field_long = -1;
                                bw.field_try = -1;
                                bw.field_else = -1;
                                bw.b = -1;
                                c_a5.d6.addElement(c_a5.es);
                                (c_a5.es = c_e.a("/ui/ulist.ui")).g9 = -1610612723;
                                ((c_ao)c_a5.es.cf().elementAt(0)).method_do("防　具");
                                ((c_ao)c_a5.es.cf().elementAt(1)).a("确定", 0);
                                (var8 = (c_bv)c_a5.es.cf().elementAt(2)).dy();

                                for(var12 = 0; var12 < c_bm.aO.length; ++var12) {
                                    var8.a(new c_m(c_bm.aO[var12], (byte)0, (byte)0, var8.dF()));
                                }

                                var8.jE = 21;
                                a(var8, (byte)0);
                                break;
                            case 3:
                                bw.field_for = 3;
                                bw.field_long = -1;
                                bw.field_try = -1;
                                bw.field_else = -1;
                                bw.b = -1;
                                c_a5.d6.addElement(c_a5.es);
                                (c_a5.es = c_e.a("/ui/ulist.ui")).g9 = -1610612722;
                                ((c_ao)c_a5.es.cf().elementAt(0)).method_do("素　材");
                                ((c_ao)c_a5.es.cf().elementAt(1)).a("确定", 0);
                                (var8 = (c_bv)c_a5.es.cf().elementAt(2)).dy();

                                for(var12 = 0; var12 < c_bm.bG.length; ++var12) {
                                    var8.a(new c_m(c_bm.bG[var12], (byte)0, (byte)0, var8.dF()));
                                }

                                var8.jE = 22;
                                a(var8, (byte)0);
                                break;
                            case 4:
                                bw.field_for = 4;
                                bw.field_long = -1;
                                bw.field_try = -1;
                                bw.field_else = -1;
                                bw.b = -1;
                                c_a5.d6.addElement(c_a5.es);
                                (c_a5.es = c_e.a("/ui/ulist.ui")).g9 = -1610612721;
                                ((c_ao)c_a5.es.cf().elementAt(0)).method_do("消　耗");
                                ((c_ao)c_a5.es.cf().elementAt(1)).a("确定", 0);
                                (var8 = (c_bv)c_a5.es.cf().elementAt(2)).dy();

                                for(var12 = 0; var12 < c_bm.cn.length; ++var12) {
                                    var8.a(new c_m(c_bm.cn[var12], (byte)0, (byte)0, var8.dF()));
                                }

                                var8.jE = 23;
                                a(var8, (byte)0);
                                break;
                            case 5:
                                c_a5.d6.addElement(c_a5.es);
                                bw.field_for = 5;
                                bw.field_long = 0;
                                bw.field_try = -1;
                                bw.field_else = -1;
                                bw.b = -1;
                                bw.a();
                                c_a5.eQ.a(1900546);
                            }
                        } else {
                            int var4;
                            String var6;
                            if (this.jE != 20 && this.jE != 21) {
                                if (this.jE == 22) {
                                    c_a5.d6.addElement(c_a5.es);
                                    bw.field_long = this.la;
                                    bw.field_try = -1;
                                    bw.field_else = -1;
                                    bw.b = -1;
                                    if (this.la == 0) {
                                        bw.a();
                                        c_a5.eQ.a(1900546);
                                    } else if (this.la != 5) {
                                        bw.a();
                                        c_a5.eQ.a(1900546);
                                    } else {
                                        (c_a5.es = c_e.a("/ui/ulist.ui")).g9 = -1610612719;
                                        ((c_ao)c_a5.es.cf().elementAt(0)).method_do("宝　石");
                                        ((c_ao)c_a5.es.cf().elementAt(1)).a("确定", 0);
                                        (var8 = (c_bv)c_a5.es.cf().elementAt(2)).dy();

                                        for(var12 = 0; var12 < c_bm.ck.length; ++var12) {
                                            var8.a(new c_m(c_bm.ck[var12], (byte)0, (byte)0, var8.dF()));
                                        }

                                        var8.jE = 25;
                                        a(var8, (byte)0);
                                    }
                                } else if (this.jE == 23) {
                                    c_a5.d6.addElement(c_a5.es);
                                    bw.field_long = this.la;
                                    bw.field_try = -1;
                                    bw.field_else = -1;
                                    bw.b = -1;
                                    bw.a();
                                    c_a5.eQ.a(1900546);
                                } else if (this.jE != 24 && this.jE != 26) {
                                    if (this.jE != 27 && this.jE != 28) {
                                        if (this.jE == 25) {
                                            c_a5.d6.addElement(c_a5.es);
                                            bw.b = this.la;
                                            bw.a();
                                            c_a5.eQ.a(1900546);
                                        } else if (this.jE != 31 && this.jE != 37 && this.jE != 43 && this.jE != 49 && this.jE != 55 && this.jE != 62 && this.jE != 66 && this.jE != 74 && this.jE != 78) {
                                            if (this.jE != 33 && this.jE != 40 && this.jE != 46 && this.jE != 52) {
                                                if (this.jE != 35 && this.jE != 39 && this.jE != 45 && this.jE != 51) {
                                                    if (this.jE != 34 && this.jE != 42 && this.jE != 48 && this.jE != 54 && this.jE != 58) {
                                                        if (this.jE == 60) {
                                                            c_br.c6();
                                                            bb.field_new = (var5 = (c_m)this.kN.elementAt(this.la)).Y;
                                                            bb.field_int = var5.method_case();
                                                            c_a5.eQ.a(2162747);
                                                        } else if (this.jE == 70) {
                                                            c_br.c6();
                                                            at.field_for = ((c_m)this.kN.elementAt(this.la)).q;
                                                            c_a5.eQ.a(458771);
                                                        } else if (this.jE == 71) {
                                                            var5 = (c_m)this.kN.elementAt(this.la);
                                                            c_as.cH = o.field_for[this.la];
                                                            c_as.a((byte)1, "您要兑换多少" + var5.method_case() + "?", "确定", "返回", 2359298, -1, -1, -1);
                                                            c_a5.gQ.method_goto(0);
                                                        } else if (this.jE == 72) {
                                                            var5 = (c_m)this.kN.elementAt(this.la);
                                                            bo.s[0] = this.la;
                                                            bo.o = var5.method_case();
                                                            c_a5.eQ.a(2424994);
                                                            c_br.c6();
                                                        }
                                                    } else {
                                                        if (this.kN.size() == 0) {
                                                            return;
                                                        }

                                                        c_br.c6();
                                                        bb.field_char = ((c_m)this.kN.elementAt(this.la)).q;
                                                        c_a5.eQ.a(2162695);
                                                    }
                                                } else {
                                                    if (this.kN.size() == 0) {
                                                        return;
                                                    }

                                                    c_br.c6();
                                                    bb.field_try = ((c_m)this.kN.elementAt(this.la)).q;
                                                    if (this.jE == 35) {
                                                        c_a5.eQ.a(2162699);
                                                    } else if (this.jE == 39) {
                                                        c_a5.eQ.a(2162706);
                                                    } else if (this.jE == 45) {
                                                        c_a5.eQ.a(2162717);
                                                    } else if (this.jE == 51) {
                                                        c_a5.eQ.a(2162728);
                                                    }
                                                }
                                            } else {
                                                if (this.kN.size() == 0) {
                                                    return;
                                                }

                                                c_br.c6();
                                                bb.field_try = ((c_m)this.kN.elementAt(this.la)).q;
                                                var10 = 0;
                                                if (this.jE == 33) {
                                                    var10 = 2162694;
                                                } else if (this.jE == 40) {
                                                    var10 = 2162707;
                                                } else if (this.jE == 46) {
                                                    var10 = 2162718;
                                                } else if (this.jE == 52) {
                                                    var10 = 2162729;
                                                }

                                                c_a5.eQ.a(var10);
                                            }
                                        } else {
                                            if (this.kN.size() == 0) {
                                                return;
                                            }

                                            c_br.c6();
                                            bb.field_new = (var5 = (c_m)this.kN.elementAt(this.la)).Y;
                                            bb.field_int = var5.method_case();
                                            var10 = 0;
                                            if (this.jE == 31) {
                                                var10 = 2162698;
                                            } else if (this.jE == 37) {
                                                var10 = 2162704;
                                            } else if (this.jE == 43) {
                                                var10 = 2162715;
                                            } else if (this.jE == 49) {
                                                var10 = 2162726;
                                            } else if (this.jE == 55) {
                                                var10 = 2162737;
                                            } else if (this.jE == 62) {
                                                var10 = 2162758;
                                            } else if (this.jE == 66) {
                                                var10 = 2162765;
                                            } else if (this.jE == 74) {
                                                var10 = 2162772;
                                            } else if (this.jE == 78) {
                                                var10 = 2162779;
                                            }

                                            c_a5.eQ.a(var10);
                                        }
                                    } else {
                                        c_a5.d6.addElement(c_a5.es);
                                        bw.field_else = this.la;
                                        bw.b = -1;
                                        bw.a();
                                        c_a5.eQ.a(1900546);
                                    }
                                } else {
                                    c_a5.d6.addElement(c_a5.es);
                                    bw.field_try = this.la;
                                    bw.field_else = -1;
                                    bw.b = -1;
                                    if (this.la == 0) {
                                        bw.a();
                                        c_a5.eQ.a(1900546);
                                        return;
                                    }

                                    c_a5.es = c_e.a("/ui/ulist.ui");
                                    if (this.jE == 24) {
                                        c_a5.es.g9 = -1610612717;
                                    } else if (this.jE == 26) {
                                        c_a5.es.g9 = -1610612716;
                                    }

                                    c_ao var9 = (c_ao)c_a5.es.cf().elementAt(0);
                                    if (this.jE == 24) {
                                        var9.method_do("武　器");
                                    } else if (this.jE == 26) {
                                        var9.method_do("防　具");
                                    }

                                    ((c_ao)c_a5.es.cf().elementAt(1)).a("确定", 0);
                                    (var8 = (c_bv)c_a5.es.cf().elementAt(2)).dy();
                                    String[] var11 = new String[c_bm.cu.length + 1];
                                    var6 = ((c_m)this.kN.elementAt(this.la)).method_case();
                                    var11[0] = var6 + "所有" + lh;
                                    System.arraycopy(c_bm.cu, 0, var11, 1, c_bm.cu.length);

                                    for(var4 = 0; var4 < var11.length; ++var4) {
                                        var8.a(new c_m(var11[var4], (byte)0, (byte)0, var8.dF()));
                                    }

                                    if (this.jE == 24) {
                                        var8.jE = 27;
                                    } else if (this.jE == 26) {
                                        var8.jE = 28;
                                    }

                                    a(var8, (byte)0);
                                }
                            } else {
                                c_a5.d6.addElement(c_a5.es);
                                bw.field_long = this.la;
                                bw.field_try = -1;
                                bw.field_else = -1;
                                bw.b = -1;
                                if (this.la == 0) {
                                    bw.a();
                                    c_a5.eQ.a(1900546);
                                    return;
                                }

                                lh = var6 = ((c_m)this.kN.elementAt(this.la)).method_case();
                                c_a5.es = c_e.a("/ui/ulist.ui");
                                if (this.jE == 20) {
                                    c_a5.es.g9 = -1610612720;
                                } else if (this.jE == 21) {
                                    c_a5.es.g9 = -1610612718;
                                }

                                ((c_ao)c_a5.es.cf().elementAt(0)).method_do(var6);
                                ((c_ao)c_a5.es.cf().elementAt(1)).a("确定", 0);
                                c_bv var3;
                                (var3 = (c_bv)c_a5.es.cf().elementAt(2)).dy();
                                String[] var7 = new String[]{"所有等级" + var6, "1-10级", "11-20级", "21-30级", "31-40级", "41-50级", "51-60级", "61-70级"};

                                for(var4 = 0; var4 < var7.length; ++var4) {
                                    var3.a(new c_m(var7[var4], (byte)0, (byte)0, var3.dF()));
                                }

                                if (this.jE == 20) {
                                    var3.jE = 24;
                                } else if (this.jE == 21) {
                                    var3.jE = 26;
                                }

                                a(var3, (byte)0);
                            }
                        }
                    }

                    if (c_a5.es.g9 == 851974) {
                        c_a5.d6.addElement(c_a5.es);
                    } else {
                        if (c_a5.es.g9 == 720916) {
                            kq = this.la;
                            c_a5.eQ.a(720918);
                            c_a5.A();
                            return;
                        }

                        if (c_a5.es.g9 == 262193) {
                            if (this.dt().size() != 0) {
                                if (c_be.gu.B.length() + 4 >= 30) {
                                    c_as.a((byte)5, "您输入的聊天字数已达上限！", "确定", "", -1, -2);
                                    return;
                                }

                                StringBuffer var10000 = new StringBuffer();
                                a3 var10002 = c_be.gu;
                                var10002.B = var10000.append(var10002.B).append("[r").append(this.la + 1).append("]").toString();
                                c_be.gu.method_if(false);
                            }

                            return;
                        }

                        if (c_a5.es.g9 == 2621441) {
                            b4.e = (var5 = (c_m)this.kN.elementAt(this.la)).q;
                            if (var5.q == -100) {
                                c_a5.eQ.a(2621444);
                            } else {
                                b4.f = var5.method_case();
                                c_a5.eQ.a(2621443);
                            }

                            c_br.c6();
                            return;
                        }

                        if (c_a5.es.g9 == 2621444) {
                            b4.field_do = (var5 = (c_m)this.kN.elementAt(this.la)).q;
                            b4.f = var5.method_case();
                            c_a5.eQ.a(2621445);
                            c_br.c6();
                            return;
                        }

                        if (c_a5.es.g9 == 2621442) {
                            bo.e = b4.e = ((c_m)this.kN.elementAt(this.la)).q;
                            System.out.println("需要发送" + bo.e + "条短信");
                            if (b4.field_else) {
                                c_as.a((byte)0, c_as.dM, "确认", "返回", -260, -1);
                            } else {
                                bo.method_if();
                            }
                        }
                    }

                    if (super.r == 130) {
                        bf.field_try = this.la;
                        c_a5.eQ.a(262192);
                        return;
                    }

                    if (super.y == 0 && c_a5.es.g9 == 1900545) {
                        this.dA();
                        return;
                    }

                    if (super.y == 0 && c_a5.es.g9 == 3145738) {
                        aa.field_do = this.la;
                        c_a5.eQ.a(3145739);
                        c_br.c6();
                        return;
                    }

                    if (super.y == 0 && c_a5.es.g9 == 3145739) {
                        aa.d = this.la;
                        c_a5.eQ.a(2425076);
                        return;
                    }

                    this.t();
                }

                if (this.dr().L() != null) {
                    this.dr().L().a((short)this.la, this.kX);
                }
            }
        }

        kq = this.la;
    }

    private void t() {
        c_br var1 = new c_br((byte)0);
        String[] var2;
        int[] var3;
        int[] var4;
        if (super.y == 2) {
            var2 = new String[]{"设置", "清空", "清空所有", "恢复默认"};
            var3 = new int[]{-7, -8, -5, -6};
            var4 = new int[]{3, 3, 3, 3};
            var1.a(var2, var3, var4);
        } else {
            int[] var5;
            String[] var9;
            if (super.y == 3) {
                if (this.kN.size() != 0) {
                    var9 = new String[]{"学　习", "查　看"};
                    var4 = new int[]{1572867, -1610612730};
                    var5 = new int[]{3, 2};
                    var1.a(var9, var4, var5);
                }
            } else if (super.y == 4) {
                var2 = new String[]{"查　看"};
                var3 = new int[]{-1610612731};
                var4 = new int[]{2};
                var1.a(var2, var3, var4);
            } else if (super.y == 5) {
                if (this.kN.size() != 0) {
                    var9 = new String[]{"查　看"};
                    var4 = new int[]{-1610612730};
                    var5 = new int[]{2};
                    var1.a(var9, var4, var5);
                }
            } else {
                c_m var8;
                c_m var10;
                String[] var11;
                switch(c_a5.es.g9) {
                case 1441793:
                    if (this.kN.size() == 0) {
                        return;
                    }

                    this.kN.elementAt(this.la);
                    var2 = null;
                    var9 = null;
                    var4 = null;
                    var5 = null;
                    switch(this.la) {
                    case 0:
                        var9 = new String[]{"结为伴侣"};
                        var4 = new int[]{1441794};
                        var5 = new int[]{3};
                        break;
                    case 1:
                        var9 = new String[]{"注册结婚"};
                        var4 = new int[]{1441795};
                        var5 = new int[]{3};
                        break;
                    case 2:
                        var9 = new String[]{"协议离婚", "强制离婚"};
                        var4 = new int[]{1441796, 1441797};
                        var5 = new int[]{3, 3};
                    }

                    var1.a(var9, var4, var5);
                    break;
                case 1638420:
                    if (this.kN.size() > 0) {
                        c_bt.h = (byte)(var8 = (c_m)this.kN.elementAt(this.la)).q;
                        c_bt.field_do = var8.method_case();
                    }

                    c_br.c6();
                    c_a5.eQ.a(1638421);
                    break;
                case 1835012:
                    var2 = new String[]{"查看详情", "查看成员"};
                    var3 = new int[]{1835029, 1835028};
                    var4 = new int[]{2, 2};
                    var10 = (c_m)this.kN.elementAt(this.la);
                    c_b5.method_case("Player.getInstance().getKingRight()" + bp.ag().as());
                    c_b5.method_case("Player.getInstance().getKingId()" + bp.ag().aS());
                    c_b5.method_case("item.itemId" + var10.q);
                    int[] var6;
                    int[] var7;
                    String[] var12;
                    if (bp.ag().ai() == var10.q) {
                        if (bp.ag().as() == c_i.field_for) {
                            var12 = new String[]{"解散诸侯"};
                            var6 = new int[]{1835016};
                            var7 = new int[]{0};
                            var2 = c_b5.a(var2, var2.length, var12);
                            var3 = c_b5.a(var3, var3.length, var6);
                            var4 = c_b5.a(var4, var4.length, var7);
                        } else if (bp.ag().aT() == c_bt.d) {
                            var12 = new String[]{"退出诸侯"};
                            var6 = new int[]{1835020};
                            var7 = new int[]{0};
                            var2 = c_b5.a(var2, var2.length, var12);
                            var3 = c_b5.a(var3, var3.length, var6);
                            var4 = c_b5.a(var4, var4.length, var7);
                        }
                    } else if (bp.ag().as() == c_i.field_for || bp.ag().as() == c_i.field_void) {
                        var12 = new String[]{"开除氏族"};
                        var6 = new int[]{1835017};
                        var7 = new int[]{3};
                        var2 = c_b5.a(var2, var2.length, var12);
                        var3 = c_b5.a(var3, var3.length, var6);
                        var4 = c_b5.a(var4, var4.length, var7);
                    }

                    var1.a(var2, var3, var4);
                    break;
                case 1835021:
                    var2 = null;
                    var9 = null;
                    var11 = null;
                    c_b5.a(bp.ag().as());
                    if (bp.ag().as() != c_i.field_for && bp.ag().as() != c_i.field_void) {
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"查看公告"};
                        var3 = new int[]{1835022};
                        var4 = new int[]{2};
                    } else if (this.kN.size() == 0) {
                        var2 = new String[]{"添加公告"};
                        var3 = new int[]{1835023};
                        var4 = new int[]{3};
                    } else {
                        var2 = new String[]{"查看公告", "添加公告", "修改公告", "删除公告"};
                        var3 = new int[]{1835022, 1835023, 1835024, 1835025};
                        var4 = new int[]{2, 3, 3, 3};
                    }

                    var1.a(var2, var3, var4);
                    break;
                case 1835030:
                    var2 = new String[]{"给予职务"};
                    var3 = new int[]{1835018};
                    var4 = new int[]{3};
                    var1.a(var2, var3, var4);
                    break;
                case 1835031:
                    var2 = new String[]{"撤销职务"};
                    var3 = new int[]{1835019};
                    var4 = new int[]{3};
                    var1.a(var2, var3, var4);
                    break;
                case 2490385:
                    if (this.kN.size() == 0) {
                        return;
                    }

                    var8 = (c_m)this.kN.elementAt(this.la);
                    var1.a("查　看", 2490403, 2);
                    var1.a("加为好友", 589835, 3);
                    var1.a("屏蔽玩家", 589836, 3);
                    if (var8.method_new()) {
                        var1.a("私　聊", -268435452, 2);
                    }

                    var1.a("举　报", 196638, 3);
                    if (var8.method_new() && c_bu.e == 0) {
                        var1.a("组队邀请", 720897, 3);
                    }
                    break;
                case 2490389:
                    if (this.kN.size() == 0) {
                        return;
                    }

                    c.field_for = this.la;
                    c_a5.eQ.a(2490421);
                    break;
                default:
                    switch(this.jE) {
                    case 2:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var8 = (c_m)this.kN.elementAt(this.la);
                        var9 = null;
                        var11 = null;
                        var10 = null;
                        if (this.j4 != null) {
                            jI = this.j4[this.la];
                        }

                        if (var8.method_char() == 2) {
                            jP = false;
                        } else if (var8.method_char() == 1) {
                            jP = true;
                            c_a5.eQ.a(262154);
                            c_br.c6();
                        } else if (var8.method_char() == 4) {
                            jp = false;
                            c_a5.eQ.a(262157);
                            c_a5.d6.addElement(c_a5.es);
                        } else if (var8.method_char() == 3) {
                            jp = true;
                            c_a5.eQ.a(262157);
                            c_br.dm();
                        }
                        break;
                    case 3:
                        c_b5.X = this.la;
                        c_b5.method_case("Util.m_nTalkId=" + c_b5.X);
                        c_a5.eQ.a(851975);
                        break;
                    case 4:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var8 = (c_m)this.kN.elementAt(this.la);
                        var9 = null;
                        var4 = null;
                        var5 = null;
                        if (c_bu.e == 0) {
                            c_a5.A();
                            c_as.a((byte)0, "你的队伍已解散！", c_bm.a2[2], "", -1, -2);
                        } else if (bp.ag().method_new() == c_bu.f) {
                            if (bp.ag().method_new() == var8.L) {
                                switch(c_bu.e) {
                                case 1:
                                    var9 = new String[]{"分配方式", "副本难度", "组建军团", "重置副本", "解散队伍", "退出队伍"};
                                    var4 = new int[]{720910, 720920, 720908, 720919, 720900, 720899};
                                    var5 = new int[]{2, c_z.aK ? 3 : 2, 3, 3, 3, 3};
                                    break;
                                case 2:
                                    var9 = new String[]{"分配方式", "副本难度", "重置副本", "解散军团", "退出军团"};
                                    var4 = new int[]{720910, 720920, 720919, 720900, 720899};
                                    var5 = new int[]{2, c_z.aK ? 3 : 2, 3, 3, 3};
                                }

                                var1.a(var9, var4, var5);
                            } else {
                                switch(c_bu.e) {
                                case 1:
                                    var9 = new String[]{"查看信息", "私聊", "加为好友", "给予队长", "移除队员", "退出队伍"};
                                    var4 = new int[]{589831, -1610612726, 589835, 720902, 720901, 720899};
                                    var5 = new int[]{2, 2, 3, 3, 3, 3};
                                    break;
                                case 2:
                                    var9 = new String[]{"查看信息", "私聊", "加为好友", "给予团长", "移除团员", "退出军团"};
                                    var4 = new int[]{589831, -1610612726, 589835, 720902, 720901, 720899};
                                    var5 = new int[]{2, 2, 2, 3, 3, 3};
                                }

                                var1.a(var9, var4, var5);
                            }
                        } else if (bp.ag().method_new() == var8.L) {
                            switch(c_bu.e) {
                            case 1:
                                var9 = new String[]{"退出队伍"};
                                var4 = new int[]{720899};
                                break;
                            case 2:
                                var9 = new String[]{"退出军团"};
                                var4 = new int[]{720899};
                            }

                            var1.a(var9, var4);
                        } else {
                            switch(c_bu.e) {
                            case 1:
                                var9 = new String[]{"查看信息", "私聊", "加为好友", "退出队伍"};
                                var4 = new int[]{589831, -1610612726, 589835, 720899};
                                var5 = new int[]{2, 2, 3, 3};
                                break;
                            case 2:
                                var9 = new String[]{"查看信息", "私聊", "加为好友", "退出军团"};
                                var4 = new int[]{589831, -1610612726, 589835, 720899};
                                var5 = new int[]{2, 2, 3, 3};
                            }

                            var1.a(var9, var4, var5);
                        }
                        break;
                    case 5:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        int[] var15 = new int[]{393227, 393218};
                        var3 = new int[]{3, 2};
                        var11 = new String[]{"确　定", "查　看"};
                        var1.a(var11, var15, var3);
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 16:
                    case 17:
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
                    case 30:
                    case 31:
                    case 33:
                    case 34:
                    case 35:
                    case 37:
                    case 39:
                    case 40:
                    case 42:
                    case 43:
                    case 45:
                    case 46:
                    case 48:
                    case 49:
                    case 51:
                    case 52:
                    case 54:
                    case 55:
                    case 58:
                    case 60:
                    case 62:
                    case 64:
                    case 65:
                    case 66:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 76:
                    case 77:
                    case 78:
                    case 80:
                    case 81:
                    default:
                        break;
                    case 9:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var8 = (c_m)this.kN.elementAt(this.la);
                        var1.a("查看详情", 262147, 2);
                        var1.a("查看报酬", 262159, 2);
                        if (c_bu.e != 0) {
                            var1.a("共　享", 262151, 3);
                        }

                        var1.a("放　弃", 262148, 3);
                        if (var8.g() == 1 && var8.a()) {
                            var1.a("刷　新", 262178, 2);
                        }

                        var1.a("收　藏", 262184, 3);
                        break;
                    case 12:
                        c_b5.method_case("add menu in SERVER_TYPE_TASK_RESET_DETAIL");
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"重　置", "查看详情", "查看报酬"};
                        var3 = new int[]{262173, 262147, 262159};
                        var4 = new int[]{3, 2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 15:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"任务详情", "任务报酬"};
                        var3 = new int[]{262147, 262159};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 18:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        if (c_a5.es.g9 == 1900548) {
                            var1.a("查看信息", 1900552, 2);
                            var1.a("刷　新", 1900548, 3);
                        } else if (c_a5.es.g9 == 1900546) {
                            var1.a("查看信息", 1900552, 2);
                            var1.a("出　价", 1, 3);
                            boolean var13 = false;
                            int var14;
                            if (bw.e) {
                                var14 = 1900546;
                            } else {
                                var14 = 1900554;
                            }

                            var1.a("刷　新", var14, 3);
                        }
                        break;
                    case 29:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"查看详情", "查看报酬", "删　除"};
                        var3 = new int[]{262147, 262159, 262186};
                        var4 = new int[]{2, 2, 3};
                        var1.a(var2, var3, var4);
                        break;
                    case 32:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162693, 2162692};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 36:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"锻造", "查看"};
                        var3 = new int[]{2162700, 2162695};
                        var4 = new int[]{3, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 38:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162708, 2162705};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 41:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"铸甲", "查看"};
                        var3 = new int[]{2162711, 2162695};
                        var4 = new int[]{3, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 44:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162719, 2162716};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 47:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"制革", "查看"};
                        var3 = new int[]{2162722, 2162695};
                        var4 = new int[]{3, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 50:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162730, 2162727};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 53:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"裁缝", "查看"};
                        var3 = new int[]{2162733, 2162695};
                        var4 = new int[]{3, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 56:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162739, 2162738};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 57:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"凝元", "查看"};
                        var3 = new int[]{2162742, 2162695};
                        var4 = new int[]{3, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 59:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"分解", "查看"};
                        var3 = new int[]{2162746, 2162753};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 61:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"分解", "查看"};
                        var3 = new int[]{2162750, 2162752};
                        var4 = new int[]{3, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 63:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162760, 2162759};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 67:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162767, 2162766};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 75:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162774, 2162773};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 79:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"学习", "详细"};
                        var3 = new int[]{2162781, 2162780};
                        var4 = new int[]{2, 2};
                        var1.a(var2, var3, var4);
                        break;
                    case 82:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        var2 = new String[]{"查看", "传送"};
                        var3 = new int[]{851978, 458771};
                        var4 = new int[]{2, 3};
                        var1.a(var2, var3, var4);
                        break;
                    case 83:
                        if (this.la == 0) {
                            c_a5.eQ.a(1703959);
                        } else if (this.la == 1) {
                            c_a5.eQ.a(1703960);
                        } else if (this.la == 2) {
                            c_a5.eQ.a(1703961);
                        }

                        c_br.c6();
                        break;
                    case 84:
                        c_q.o = (byte)(this.la + 1);
                        c_a5.eQ.a(1703971);
                        c_br.c6();
                        break;
                    case 85:
                        c_q.o = this.la;
                        c_a5.eQ.a(1703972);
                        break;
                    case 86:
                        if (((c_m)this.kN.elementAt(this.la)).q >= 0) {
                            var1.a("移动", 2293875, 3);
                        }
                        break;
                    case 87:
                        this.dG();
                        break;
                    case 88:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        az.field_case = (byte)(var8 = (c_m)this.kN.elementAt(this.la)).q;
                        az.k = var8.method_case();
                        c_a5.eQ.a(2555977);
                        c_br.c6();
                        break;
                    case 89:
                        if (this.kN.size() == 0) {
                            return;
                        }

                        if ((var8 = (c_m)this.kN.elementAt(this.la)).field_else == 4122) {
                            var9 = new String[]{"战况查看", "天人排名", "修罗排名", "总排名", "退出战场"};
                            var4 = new int[]{852022, 196642, 196642, 196642, -1610612633};
                            var5 = new int[]{2, 2, 2, 2, 3};
                            var1.a(var9, var4, var5);
                        } else if (var8.field_else == 4123) {
                            var9 = new String[]{"放弃排队"};
                            var4 = new int[]{852023};
                            var5 = new int[]{3};
                            var1.a(var9, var4, var5);
                        } else if (var8.field_else == 4124) {
                            var9 = new String[]{"战场排队"};
                            var4 = new int[]{852021};
                            var5 = new int[]{3};
                            var1.a(var9, var4, var5);
                        }
                    }
                }
            }
        }

        if (var1.dj().size() > 0) {
            this.a(var1);
        }

        if (this.jE != 3 && var1.dj().size() > 0) {
            super.field_byte = true;
            this.y().da();
        }

    }

    private void dI() {
        ((ak)c_a5.es.cf().elementAt(4)).method_if(c_bm.bd[this.la]);
        c_a5.e8.cQ = this.la;
    }

    public final void dy() {
        if (this.kN != null) {
            this.kN.removeAllElements();
        }

    }

    public final void x(byte var1) {
        this.jJ = var1;
    }

    public final void a(byte var1) {
        super.a(var1);
        switch(super.y) {
        case 0:
        case 3:
        case 4:
        case 5:
            this.jJ = this.z$132bd3();
            return;
        case 1:
            this.jJ = this.z$132bd3();
            return;
        case 2:
            this.jJ = this.z$132bd3();
        default:
        }
    }

    public final void p(boolean var1) {
        this.kV = var1;
    }

    public final void n(boolean var1) {
        this.kX = var1;
    }

    public final boolean b() {
        if (c_a5.gZ) {
            af var1;
            if (this.i3 != null && (var1 = this.i3.U) != null && var1.b()) {
                return true;
            }

            short var4 = 0;
            switch(super.y) {
            case 0:
            case 3:
            case 4:
            case 5:
                var4 = this.dp();
                break;
            case 1:
                var4 = c_m.method_else();
                break;
            case 2:
                var4 = c_m.method_do();
            }

            int var2 = this.jl;

            for(int var3 = this.kN.size() < this.jJ ? this.kN.size() : this.jJ + this.jl; var2 < var3; ++var2) {
                if (c_a5.a(this.kD, this.kC + (var2 - this.jl) + (var2 - this.jl) * var4, this.dF(), var4)) {
                    if (this.la == var2) {
                        return false;
                    }

                    c_b5.p = 0;
                    c_b5.d = 0;
                    this.la = (byte)var2;
                    if (c_a5.es.g9 == 262153) {
                        if (this.kN.size() > 0) {
                            C(((c_m)this.kN.elementAt(this.la)).method_char());
                        }
                    } else if (c_a5.es.g9 == 1900548 || c_a5.es.g9 == 1900546) {
                        this.dE();
                    }

                    if (c_a5.method_else() == 16) {
                        this.dI();
                    }

                    return true;
                }
            }
        }

        return true;
    }

    private short dp() {
        boolean var1 = false;
        short var2;
        if (this.kV) {
            var2 = (short)(c_a5.iG + 6);
        } else {
            var2 = (short)c_a5.iG;
        }

        return var2;
    }

    public static final void a(c_bv var0, byte var1) {
        if (var0.kN.size() > var0.z$132bd3() && var0.i3.U == null) {
            var0.i3.method_new(false);
        } else if (var0.kN.size() <= var0.z$132bd3() && var0.i3.U != null) {
            c_b5.method_case("list.items.size()" + var0.kN.size() + "   list.getCanShowCol(" + var1 + ")=" + var0.z$132bd3());
            c_y var3;
            if ((var3 = var0.i3).U != null) {
                var3.U = null;
            }
        }

        if (var0.i3.U != null) {
            byte var4 = 0;
            var0.i3.U.aj = var4;
            var0.i3.U.az = (short)var0.kN.size();
            var0.i3.U.ay = (short)var0.z$132bd3();
        }

    }

    private void u(int var1) {
        (c_a5.es = c_e.a("/ui/unlearn.ui")).g9 = var1;
        c_bv var5;
        (var5 = (c_bv)c_a5.es.cf().elementAt(2)).dy();
        var5.a((byte)5);
        int[] var4 = bp.ag().m((byte)this.t(this.la));

        for(byte var2 = 0; var2 < var4.length; ++var2) {
            StringBuffer var10002 = (new StringBuffer()).append("");
            bp.ag();
            c_m var3;
            c_m var10000 = var3 = new c_m(var10002.append(bp.eQ[var4[var2]]).toString(), (byte)8, (byte)0, var5.dF());
            bp.ag();
            var10000.method_if(bp.eD[var4[var2]]);
            var5.a(var3);
        }

        var5.j4 = var4;
        a(var5, (byte)0);
    }

    public static final void a(int var0, short var1) {
        (c_a5.es = c_e.a("/ui/skilldetail.ui")).g9 = var0;
        ah var3;
        (var3 = (ah)c_a5.es.cf().elementAt(3)).a((byte)5);
        bp.ag();
        var3.a(bp.eQ[var1]);
        ak var4 = (ak)c_a5.es.cf().elementAt(4);
        String var2 = bp.fu[var1] + "\n\n" + "习得技能需要:" + bp.en[var1] + "级\n\n" + c_bm.bB[bp.eW[var1]] + bp.fN[var1];
        var4.method_if(var2);
        var4.ap();
        a7 var5 = (a7)c_a5.es.cf().elementAt(5);
        var1 = bp.eD[var1];
        var5.fC = (byte)(var1 / 1000 - 1);
        if (var5.fC == -1) {
            var5.fC = 1;
        }

        var5.ft = true;
        var1 = (short)(var1 % 1000);
        var5.method_if(var1, true);
        var5.a(c_a5.gg);
    }

    private void dA() {
        if (this.la != 0) {
            if (this.la == 1) {
                c_a5.d6.addElement(c_a5.es);
                c_a5.eQ.a(1900547);
            } else if (this.la == 2) {
                c_a5.d6.addElement(c_a5.es);
                c_a5.eQ.a(1900548);
            } else {
                if (this.la == 3) {
                    final Form var1 = new Form("搜索物品");
                    final TextField var2 = new TextField("请输入物品名称:", "", 6, 0);
                    var1.append(var2);
                    final Command var5 = new Command("搜索", 4, 0);
                    final Command var6 = new Command("返回", 3, 1);
                    var1.addCommand(var5);
                    var1.addCommand(var6);
                    var1.setCommandListener(new CommandListener() {
                        public final void commandAction(Command var1x, Displayable var2x) {
                            if (var1x == var5) {
                                if ((bw.field_new = var2.getString()) != null && !bw.field_new.equals("")) {
                                    bw.e = false;
                                    bw.a();
                                    c_a5.eQ.a(1900554);
                                    c_a5.e8.setFullScreenMode(true);
                                    c_a5.dI.display.setCurrent(c_a5.e8);
                                    c_a5.d6.addElement(c_a5.es);
                                } else {
                                    Alert var3 = new Alert(c_bm.a2[9], "物品名称不能为空", (Image)null, AlertType.ERROR);
                                    c_a5.dI.display.setCurrent(var3, var1);
                                }
                            } else {
                                if (var1x == var6) {
                                    c_a5.e8.setFullScreenMode(true);
                                    c_a5.dI.display.setCurrent(c_a5.e8);
                                }

                            }
                        }
                    });
                    c_a5.dI.display.setCurrent(var1);
                }

            }
        } else {
            bw.e = true;
            c_a5.d6.addElement(c_a5.es);
            (c_a5.es = c_e.a("/ui/ulist.ui")).g9 = -1610612725;
            ((c_ao)c_a5.es.cf().elementAt(0)).method_do("拍　卖");
            ((c_ao)c_a5.es.cf().elementAt(1)).a("确定", 0);
            c_bv var3;
            (var3 = (c_bv)c_a5.es.cf().elementAt(2)).dy();

            for(int var4 = 0; var4 < c_bm.bH.length; ++var4) {
                var3.a(new c_m(c_bm.bH[var4], (byte)0, (byte)0, var3.dF()));
            }

            var3.jE = 19;
            a(var3, (byte)0);
        }
    }

    private void dE() {
        c_m var6 = (c_m)this.kN.elementAt(this.la);
        a7 var1 = (a7)c_a5.es.cf().elementAt(5);
        ah var2 = (ah)c_a5.es.cf().elementAt(8);
        a9 var3 = (a9)c_a5.es.cf().elementAt(7);
        a9 var4 = (a9)c_a5.es.cf().elementAt(10);
        a9 var5 = (a9)c_a5.es.cf().elementAt(12);
        var1.g(var6.B);
        var1.method_if((short)(var6.B % 1000), true);
        c_r.E(var6.v);
        if (var6.y == 1) {
            var1.g(false);
        } else {
            var1.a(true, var6.g);
        }

        var2.method_case(var6.f);
        var3.a(new StringBuffer(var6.r + ""));
        var4.a(new StringBuffer(var6.i + ""));
        var5.a(new StringBuffer(var6.l));
    }

    private static void B(byte var0) {
    	// FIXME 存在争议
        ((ah)c_a5.es.cf().elementAt(6)).method_case(var0);
    }

    public static void C(byte var0) {
        c_ao var1 = (c_ao)c_a5.es.cf().elementAt(1);
        String var2 = "";
        if (var0 == 1) {
            var2 = "选择";
        } else if (var0 == 2) {
            var2 = "";
        } else if (var0 == 3) {
            var2 = "选择";
        } else if (var0 == 4) {
            var2 = "查看";
        }

        var1.a(var2, 0);
    }

    private void dG() {
        az.g = new Vector();

        for(int var1 = 0; var1 < az.field_do.length; ++var1) {
            if ((((c_m)this.kN.elementAt(this.la)).b() & 1 << var1) != 0) {
                az.g.addElement(new Byte((byte)var1));
            }

            int[] var2 = new int[az.g.size()];
            int[] var3 = new int[az.g.size()];
            String[] var4 = new String[az.g.size()];

            for(int var5 = 0; var5 < az.g.size(); ++var5) {
                var2[var5] = 2555966;
                var3[var5] = az.b[(Byte)az.g.elementAt(var5)];
                var4[var5] = az.l[(Byte)az.g.elementAt(var5)];
            }

            c_br var6;
            (var6 = new c_br((byte)0)).a(var4, var2, var3);
            this.a(var6);
            super.field_byte = true;
            this.y().da();
        }

    }
}
