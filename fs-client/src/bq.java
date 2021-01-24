import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class bq implements CommandListener {
	private static bq field_new = null;
	private static byte field_try;
	private static c_a a;
	private static Form field_for;
	private static Command field_case = new Command("确定", 4, 0);
	private static Command field_int = new Command("退出", 3, 1);
	private static Command field_if = new Command("返回", 2, 1);
	public static String field_byte = "";

	public bq() {
	}

	public final void commandAction(Command var1, Displayable var2) {
		if (var1 == field_case) {
			try {
				if (field_try == 0) {
					if (c_a5.e8.g0 == 1) {
						a.platformRequest(field_byte);
					} else {
						a.platformRequest(a1.field_new);
					}

					a.destroyApp(true);
				}
			} catch (Exception var3) {
			}
		} else if (var1 == field_if) {
			try {
				if (field_try == 0 || field_try == 9) {
					a.display.setCurrent(c_a5.e8);
					c_a5.method_do((byte) 4);
					field_for = null;
				}
			} catch (Exception var4) {
			}
		} else if (var1 == field_int) {
			a.destroyApp(true);
		}

		a1.field_new = null;
	}

	public static void a(c_a var0, byte var1) {
		field_try = 0;
		String var2;
		String var4;
		if (true) {
			var4 = "新版客户端下载";
			var2 = "点击“确定”下载新的客户端，点击“返回”返回游戏。";
		} else if (field_try == 1) {
			var4 = "内测号注册";
			var2 = "点击“确定”注册内测帐号，点击“返回”返回游戏。";
		} else if (field_try == 2) {
			var4 = "明细查询";
			var2 = "点击“确定”转到查询明细网页，点击“返回”返回游戏";
		} else if (field_try == 3) {
			var4 = "天劫论坛";
			var2 = "点击“确定”转到天劫论坛网页，点击“返回”返回游戏";
		} else if (field_try == 4) {
			var4 = "大额充值";
			var2 = "点击“确定”转到大额充值网页，点击“返回”返回游戏";
		} else if (field_try == 5) {
			var4 = "骏网一卡通充值";
			var2 = "点击“确定”转到骏网一卡通充值网页，点击“返回”返回游戏";
		} else if (field_try == 6) {
			var4 = "当乐平台";
			var2 = "更多精彩游戏尽在当乐网D.cn";
		} else if (field_try == 7) {
			var4 = "天劫论坛";
			var2 = "点击“确定”转到天劫论坛网页，点击“退出”退出游戏";
		} else if (field_try == 8) {
			var4 = "我的积分";
			var2 = "点击“确定”转到我的积分网页，点击“返回”返回游戏";
		} else if (field_try == 9) {
			var4 = "搜狐游戏中心";
			var2 = "点击“确定”转到搜狐游戏中心，点击“返回”返回游戏";
		} else {
			var4 = "未知类型";
			var2 = "";
		}

		try {
			a = var0;
			(field_for = new Form(var4)).deleteAll();
			field_for.append(var2);
			field_for.addCommand(field_case);
			if (field_try != 1 && field_try != 6 && field_try != 7) {
				field_for.addCommand(field_if);
			} else {
				field_for.addCommand(field_int);
			}

			Form var10000 = field_for;
			if (field_new == null) {
				field_new = new bq();
			}

			var10000.setCommandListener(field_new);
			a.display.setCurrent(field_for);
		} catch (Exception var3) {
		}
	}
}
