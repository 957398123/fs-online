/**
 * 2021/01/21
 * @author 95739
 *
 */
public final class a2 {
	private static int a = 0;

	public a2() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 1376257:
			var1.method_do(a);
			c_b5.method_case("--------------- 发送 请求交易 命令-------------");
		case 1376258:
		case 1376270:
		case 1376271:
		case 1376272:
		default:
			break;
		case 1376259:
			c_b5.method_case("--------------- 发送 拒绝交易界面 命令-------------");
			break;
		case 1376260:
			c_be.ch();
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 请求交易界面 命令-------------");
			break;
		case 1376261:
			byte var3 = 0;

			int var2;
			for (var2 = 0; var2 < c_r.mG.length; ++var2) {
				if (c_r.mG[var2] > -1) {
					++var3;
				}
			}

			var1.a(var3);
			c_b5.method_case("UIGrid.tradeSign.length = " + c_r.mG.length);
			var2 = 0;

			for (var0 = c_r.mG.length; var2 < var0; ++var2) {
				if (c_r.mG[var2] > -1) {
					var1.a(c_r.mG[var2]);
					var1.a(c_r.md[var2]);
					c_b5.method_case("UIGrid.tradeSignNum[" + var2 + "] = " + c_r.md[var2]);
				}
			}

			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 确定选择物品，请求交易界面 命令-------------");
			break;
		case 1376262:
		case 1376274:
			c_be.ch();
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 取消交易界面 命令-------------");
			break;
		case 1376263:
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 进背包选择物品 命令-------------");
			break;
		case 1376264:
			c_be.hC = true;
			c_r.dX();
			c_be.gs = 0;
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 清除物品 命令-------------");
			break;
		case 1376265:
			var1.method_do(c_be.gs);
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 锁定物品 命令-------------");
			break;
		case 1376266:
			if (c_be.gs > c_be.hm) {
				var1.a(true);
				c_b5.method_case("$$$$$$$$$$$$$ 大宗交易小心点！！！！ $$$$$$$$$$$$");
			} else {
				var1.a(false);
			}

			c_be.ch();
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 完成 命令-------------");
			break;
		case 1376267:
			var1.a(c_be.hd);
			c_b5.method_case("UIForm.curPicNum = " + c_be.hH);
			var1.a(c_be.hH);
			am.a = false;
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 物品查看 命令-------------");
			break;
		case 1376268:
			var1.a(c_be.hH);
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 取回 命令-------------");
			break;
		case 1376269:
			var1.method_do(c_l.g.method_new());
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 请求交易检测 命令-------------");
			break;
		case 1376273:
			c_a5.fR = true;
			c_b5.method_case("--------------- 发送 交易查看物品信息后返回 命令 -------------");
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
		switch (var0) {
		case -2146107388:
			c_be.gG = var1.method_byte();
			c_b5.method_case("--------------- 接收交易界面获取人物金钱 命令-------------");
			return;
		case -2146107386:
			c_be.ch();
			if (c_a5.V() == 4) {
				c_a5.A();
			}

			c_b5.method_case("--------------- 取消交易界面 命令-------------");
			return;
		case -2146107385:
			c_b5.method_case("--------------- 接收交易界面标识 命令-------------");
			return;
		case -2146107383:
			c_be.hm = var1.method_byte();
			c_be.gs = var1.method_byte();
			c_b5.method_case("--------------- 接收大宗交易警戒线 命令-------------");
			return;
		case -2146107382:
			c_be.ch();
			c_b5.method_case("--------------- 交易成功 命令-------------");
			return;
		case -2146107380:
			byte var2 = var1.method_if();
			c_b5.method_case("取回的第 " + var2 + " 个物品");
			c_r.mG[var2] = -1;
			c_r.md[var2] = 1;
			c_b5.method_case("--------------- 删除背包里的某个标记 命令-------------");
			return;
		case -2146107379:
			c_b5.method_case("--------------- 接收 请求交易检测 命令-------------");
			a = var1.method_byte();
			if (c_a5.V() == 0 && !c_a5.hH && c_a5.gQ == null) {
				c_a5.eQ.a(1376257);
				c_b5.method_case("--------------- 发送 CommandList.C_TRADE 命令-------------");
				return;
			} else {
				c_a5.eQ.a(1376270);
				c_b5.method_case("--------------- 发送 CommandList.C_TRADE_DENY_REQ 命令-------------");
			}
		case -2146107387:
		case -2146107384:
		case -2146107381:
		default:
		}
	}
}
