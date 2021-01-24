import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

/**
 * 2021/01/21
 * @author 95739
 *
 */
public final class c_bt {
    static String field_else = "";
    static String field_case = "";
    static String e = "";
    static int b = 0;
    static byte field_long = 2;
    static byte d = 3;
    public static int f = 0;
    public static int field_for = 0;
    public static byte h = 0;
    public static String field_do = "";
    private static int[] j = null;
    private static boolean[] i = null;
    static String field_if = "";
    public static int g;
    public static int l;
    public static int c;

    public c_bt() {
    }

    public static byte[] method_do(int var0) {
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 1638401:
            var1.method_do(c_l.g.method_new());
            c_a5.fR = true;
            break;
        case 1638402:
            var1.method_if(field_else);
            var1.method_if(field_case);
            break;
        case 1638403:
        case 1638416:
            c_a5.fR = true;
            break;
        case 1638404:
        case 1638417:
        case 1638419:
        case 1638420:
        case 1638445:
            c_a5.fR = true;
            break;
        case 1638405:
            var1.method_do(f);
            break;
        case 1638406:
        case 1638407:
            var1.method_do(field_for);
        case 1638408:
        case 1638413:
        case 1638424:
        case 1638430:
        case 1638431:
        case 1638434:
        case 1638435:
        case 1638436:
        case 1638437:
        case 1638438:
        case 1638439:
        case 1638440:
        case 1638441:
        case 1638442:
        case 1638443:
        case 1638447:
        case 1638448:
        default:
            break;
        case 1638409:
        case 1638410:
        case 1638411:
        case 1638412:
        case 1638415:
            var1.method_do(f);
            c_a5.fR = true;
            break;
        case 1638414:
            var1.method_do(bp.em);
            break;
        case 1638418:
            var1.method_if(e);
            c_a5.fR = true;
            break;
        case 1638421:
            var1.a(h);
            c_a5.fR = true;
            break;
        case 1638422:
            var1.a(h);
            var0 = j.length;
            var1.a((byte)var0);

            for(int var2 = 0; var2 < var0; ++var2) {
                var1.method_do(j[var2]);
                var1.a(i[var2]);
            }

            j = null;
            i = null;
            break;
        case 1638423:
        case 1638425:
        case 1638426:
        case 1638427:
        case 1638428:
            c_a5.fR = true;
            break;
        case 1638429:
            c_a5.fR = true;
            var1.method_do(b);
            break;
        case 1638432:
        case 1638433:
            var1.a(a7.fF);
            break;
        case 1638444:
            c_a5.fR = true;
            var1.method_do(c_bg.hP);
            break;
        case 1638446:
            c_a5.fR = true;
            var1.method_if(field_if);
            break;
        case 1638449:
            var1.method_do(l);
            break;
        case 1638450:
        case 1638451:
            var1.method_do(g);
            var1.method_do(l);
            var1.method_do(c);
        }

        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        switch(var0) {
        case -2145845247:
            bp.ag().b(var1.method_byte());
            bp.ag().i(var1.method_if());
            return;
        case -2145845246:
            c_a5.A();
        default:
        }
    }

    public static void method_for(int var0) {
        switch(var0) {
        case 0:
            final Form var5 = new Form("创建氏族");
            final TextField var1 = new TextField("请输入氏族名称", field_else, 6, 0);
            final TextField var2 = new TextField("请输入氏族简介", field_case, 50, 0);
            var5.append(var1);
            var5.append(var2);
            final Command var3 = new Command(c_bm.a2[2], 4, 0);
            final Command var4 = new Command(c_bm.a2[1], 3, 1);
            var5.addCommand(var3);
            var5.addCommand(var4);
            var5.setCommandListener(new CommandListener() {
                public final void commandAction(Command var1x, Displayable var2x) {
                    if (var1x == var3) {
                        c_bt.field_else = var1.getString();
                        c_bt.field_case = var2.getString();
                        a9 var3x = (a9)c_a5.es.cf().elementAt(3);
                        ak var4x = (ak)c_a5.es.cf().elementAt(5);
                        var3x.method_void(c_bt.field_else);
                        var4x.method_if(c_bt.field_case);
                        var4x.ap();
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        if (var1x == var4) {
                            var5.removeCommand(var3);
                            var5.removeCommand(var4);
                            c_a5.e8.setFullScreenMode(true);
                            c_a5.dI.display.setCurrent(c_a5.e8);
                        }

                    }
                }
            });
            c_a5.dI.display.setCurrent(var5);
            return;
        case 1638402:
            if (field_else.length() > 0) {
                c_a5.eQ.a(1638402);
                field_else = "";
                field_case = "";
                c_a5.A();
                return;
            } else {
                c_as.a((byte)0, "氏族名称不能为空！", "确定", "", -1, -2);
            }
        default:
        }
    }

    public static void a(int var0) {
        switch(var0) {
        case 1638418:
            e = ((ak)c_a5.es.cf().elementAt(3)).as().trim();
            final Form var4 = new Form("氏族公告");
            final TextField var1 = new TextField("请输入公告内容", e, 100, 0);
            var4.append(var1);
            final Command var2 = new Command("更新", 4, 0);
            final Command var3 = new Command(c_bm.a2[1], 3, 1);
            var4.addCommand(var2);
            var4.addCommand(var3);
            var4.setCommandListener(new CommandListener() {
                public final void commandAction(Command var1x, Displayable var2x) {
                    if (var1x == var2) {
                        c_bt.e = var1.getString();
                        c_a5.eQ.a(1638418);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        if (var1x == var3) {
                            var4.removeCommand(var2);
                            var4.removeCommand(var3);
                            c_a5.e8.setFullScreenMode(true);
                            c_a5.dI.display.setCurrent(c_a5.e8);
                        }

                    }
                }
            });
            c_a5.dI.display.setCurrent(var4);
        default:
        }
    }

    public static c_br method_for() {
    	c_br var0 = new c_br((byte)0);
        String[] var1 = new String[]{"编辑详情", "申请创建"};
        int[] var2 = new int[]{0, 1638402};
        int[] var3 = new int[]{3, 3};
        var0.a(var1, var2, var3);
        return var0;
    }

    public static c_br method_new() {
    	c_br var0 = new c_br((byte)0);
        String[] var1 = new String[]{"更新公告"};
        int[] var2 = new int[]{1638418};
        int[] var3 = new int[]{3};
        var0.a(var1, var2, var3);
        return var0;
    }

    public static c_br method_if() {
    	c_br var0 = new c_br((byte)0);
        String[] var1 = new String[]{"管理权限"};
        int[] var2 = new int[]{1638420};
        int[] var3 = new int[]{2};
        var0.a(var1, var2, var3);
        return var0;
    }

    public static void method_if(int var0) {
        String var1 = "";
        switch(var0) {
        case 1638408:
            var1 = "是否解散氏族？";
            break;
        case 1638409:
            var1 = "是否开除此人？";
            break;
        case 1638410:
            var1 = "是否将族长禅让给此人？";
        case 1638411:
        case 1638412:
        case 1638414:
        case 1638415:
        default:
            break;
        case 1638413:
            var1 = "是否退出氏族？";
            break;
        case 1638416:
            var1 = "是否卸任氏族内的职务?";
        }

        c_as.a((byte)0, var1, "是", "否", var0, -1);
    }

    public static void a() {
        c_bg var0;
        int var1;
        j = new int[var1 = (var0 = (c_bg)((c_bg)c_a5.es.cf().elementAt(3))).cD().size()];
        i = new boolean[var1];

        for(int var2 = 0; var2 < var1; ++var2) {
            v var3 = (v)var0.cD().elementAt(var2);
            j[var2] = var3.field_new;
            ah var4 = (ah)var3.field_if.elementAt(2);
            i[var2] = var4.aj() == "有";
        }

        c_a5.eQ.a(1638422);
    }
}
