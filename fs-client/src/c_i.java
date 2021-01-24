import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class c_i {
    static String field_goto = "";
    static String field_int = "";
    static String field_case = "";
    static String field_if = "";
    private static int field_try = -1;
    static byte field_char = 1;
    static byte field_void = 2;
    static byte field_for = 3;
    public static int field_long = 0;
    public static int field_do = 0;

    public c_i() {
    }

    public static byte[] method_do(int var0) {
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 1835009:
            var1.method_do(c_l.g.method_new());
            c_a5.fR = true;
            break;
        case 1835010:
            var1.method_if(field_goto);
            var1.method_if(field_int);
            break;
        case 1835011:
            c_a5.fR = true;
            break;
        case 1835012:
        case 1835027:
            c_a5.fR = true;
            break;
        case 1835013:
            var1.method_do(field_long);
            break;
        case 1835014:
        case 1835015:
            var1.method_do(field_do);
        case 1835016:
        case 1835020:
        case 1835033:
        default:
            break;
        case 1835017:
        case 1835028:
        case 1835029:
            var1.method_do(c_bv.jI);
            c_a5.fR = true;
            break;
        case 1835018:
            var1.method_do(field_long);
            var1.method_do(c_bv.jI);
            c_a5.fR = true;
            break;
        case 1835019:
            var1.method_do(c_bv.jI);
            c_a5.fR = true;
            break;
        case 1835021:
            c_a5.fR = true;
            break;
        case 1835022:
            var1.method_do(c_bv.jI);
            c_a5.fR = true;
            break;
        case 1835023:
            var1.method_if(field_case);
            var1.method_if(field_if);
            field_case = "";
            field_if = "";
            break;
        case 1835024:
            var1.method_do(field_try);
            var1.a(c_bv.le);
            var1.method_if(field_case);
            var1.method_if(field_if);
            field_case = "";
            field_if = "";
            break;
        case 1835025:
            var1.method_do(c_bv.jI);
            var1.a(c_bv.le);
            c_a5.fR = true;
            break;
        case 1835026:
            var1.method_do(c_bv.jI);
            var1.a(c_bv.le);
            break;
        case 1835030:
        case 1835031:
        case 1835034:
            c_a5.fR = true;
            break;
        case 1835032:
            var1.method_do(bp.em);
            break;
        case 1835035:
            var1.method_do(field_long);
        }

        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        switch(var0) {
        case -2145648639:
            bp.ag().d(var1.method_byte());
            bp.ag().h(var1.method_if());
            return;
        case -2145648638:
            c_a5.A();
            return;
        case -2145648637:
            field_try = var1.method_byte();
            a(1835024, var1.method_goto(), var1.method_goto());
        default:
        }
    }

    public static void a(final int var0, String var1, String var2) {
        final Form var3 = new Form("公告详情");
        final TextField var6 = new TextField("请输入公告标题", var1, 6, 0);
        final TextField var7 = new TextField("请输入公告内容", var2, 30, 0);
        var3.append(var6);
        var3.append(var7);
        final Command var4 = new Command(c_bm.a2[2], 4, 0);
        final Command var5 = new Command(c_bm.a2[1], 3, 1);
        var3.addCommand(var4);
        var3.addCommand(var5);
        var3.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1, Displayable var2) {
                if (var1 == var4) {
                    c_i.field_case = var6.getString();
                    c_i.field_if = var7.getString();
                    c_a5.eQ.a(var0);
                    c_a5.dI.display.setCurrent(c_a5.e8);
                } else {
                    if (var1 == var5) {
                        var3.removeCommand(var4);
                        var3.removeCommand(var5);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var3);
    }

    public static void a(int var0) {
        switch(var0) {
        case 0:
            final Form var5 = new Form("创建诸侯");
            final TextField var1 = new TextField("请输入诸侯名称", field_goto, 6, 0);
            final TextField var2 = new TextField("请输入诸侯简介", field_int, 50, 0);
            var5.append(var1);
            var5.append(var2);
            final Command var3 = new Command(c_bm.a2[2], 4, 0);
            final Command var4 = new Command(c_bm.a2[1], 3, 1);
            var5.addCommand(var3);
            var5.addCommand(var4);
            var5.setCommandListener(new CommandListener() {
                public final void commandAction(Command var1x, Displayable var2x) {
                    if (var1x == var3) {
                        c_i.field_goto = var1.getString();
                        c_i.field_int = var2.getString();
                        a9 var3x = (a9)c_a5.es.cf().elementAt(3);
                        ak var4x = (ak)c_a5.es.cf().elementAt(5);
                        var3x.method_void(c_i.field_goto);
                        var4x.method_if(c_i.field_int);
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
        case 1835010:
            if (field_goto.length() > 0) {
                c_a5.eQ.a(1835010);
                field_goto = "";
                field_int = "";
                c_a5.A();
                return;
            } else {
                c_as.a((byte)0, "诸侯名称不能为空！", "确定", "", -1, -2);
            }
        default:
        }
    }

    public static c_br a() {
    	c_br var0 = new c_br((byte)0);
        String[] var1 = new String[]{"编辑详情", "申请创建"};
        int[] var2 = new int[]{0, 1835010};
        int[] var3 = new int[]{3, 3};
        var0.a(var1, var2, var3);
        return var0;
    }

    public static void method_if(int var0) {
        String var1 = "";
        switch(var0) {
        case 1835016:
            var1 = "是否解散诸侯？";
            break;
        case 1835017:
            var1 = "是否开除此氏族？";
            break;
        case 1835020:
            var1 = "是否退出诸侯？";
            break;
        case 1835034:
            var1 = "是否卸任诸侯内的职务?";
            break;
        case 1835035:
            var1 = "是否将侯主禅让给此人？";
        }

        c_as.a((byte)0, var1, "是", "否", var0, -1);
    }
}
