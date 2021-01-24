import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

/**
 * 2020/01/21
 * @author 95739
 *
 */
public final class ar {
    public ar() {
    }

    public static void a(String var0, String var1, final int var2) {
        final Form var5 = new Form(var0);
        final TextField var6 = new TextField(var1, "", 6, 0);
        var5.append(var6);
        final Command var3 = new Command(c_bm.a2[2], 4, 0);
        final Command var4 = new Command(c_bm.a2[1], 3, 1);
        var5.addCommand(var3);
        var5.addCommand(var4);
        var5.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1, Displayable var2x) {
                if (var1 == var3) {
                    Alert var3x;
                    if ((b1.lN = var6.getString()) != null && !b1.lN.equals("")) {
                        for(int var4x = 0; var4x < var6.getString().length(); ++var4x) {
                            if (!c_a5.a(var6.getString(), (byte)2)) {
                                var3x = new Alert(c_bm.a2[9], "您输入的玩家昵称含有非法字符请重新输入", (Image)null, AlertType.ERROR);
                                var6.setString("");
                                b1.lN = "";
                                c_a5.dI.display.setCurrent(var3x, var5);
                                return;
                            }
                        }

                        c_a5.eQ.a(var2);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        var3x = new Alert(c_bm.a2[9], "玩家名称不能为空", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var3x, var5);
                    }
                } else {
                    if (var1 == var4) {
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var5);
    }
}
