/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class bs {
    public static byte field_if = 0;
    public static byte a = -1;

    public bs() {
    }

    public static byte[] a(int var0) {
    	c_a5.fR = true;
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 1179650:
            var1.a(c_r.mp);
            c_b5.method_case("发送 仓库->查看物品 命令！！！！");
            return var1.method_long();
        case 1179651:
            var1.a(c_r.mp);
            var1.a(field_if);
            c_b5.method_case("发送 仓库->存物品 命令！！！！");
            return var1.method_long();
        case 1179652:
            var1.method_do(c_r.ny);
            c_b5.method_case("存入 " + c_r.ny + " 金币");
            c_r.ny = 0;
            c_b5.method_case("发送 仓库->存钱 命令！！！！");
            return var1.method_long();
        case 1179653:
            var1.a(c_r.mp);
            var1.a(field_if);
            c_b5.method_case("发送 仓库->取物品 命令！！！！");
            return var1.method_long();
        case 1179654:
            var1.method_do(c_r.ny);
            c_b5.method_case("取出 " + c_r.ny + " 金币");
            c_r.ny = 0;
            c_b5.method_case("发送 仓库->取钱 命令！！！！");
            return var1.method_long();
        case 1179655:
            break;
        case 1179656:
            var1.a(a);
            int var2 = at.field_int[0];
            var1.a((byte)var2);
            var2 = at.field_int[1];
            var1.a((byte)var2);
            var1.a(at.field_new);
            c_a5.es.cg();
            break;
        case 1179657:
            c_b5.method_case("发送 仓库->整理 命令！！！！");
            return var1.method_long();
        case 1179658:
            c_b5.method_case("发送 仓库->扩容UI 命令！！！！");
            return var1.method_long();
        case 1179659:
            var1.a(c_r.mp);
            c_b5.method_case("发送 仓库->扩容使用物品 命令！！！！");
            return var1.method_long();
        case 1179660:
        default:
            return var1.method_long();
        case 1179661:
            var1.a(c_r.mp);
            var1.a(at.field_try);
            at.field_byte = false;
            ((c_ao)c_a5.es.cf().elementAt(1)).a("返回", 1);
            a(true);
            return var1.method_long();
        case 1179662:
            var1.a(at.field_try);
        }

        c_a5.fR = true;
        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        switch(var0) {
        case -2146303988:
            c_b5.method_case("--------------- 接收仓库冻结或解冻命令-------------");
            boolean var5 = var1.method_case();
            byte var8 = var1.method_if();
            byte var9 = var1.method_if();
            c_r var3 = null;
            if (c_a5.es != null) {
                if (c_a5.es.g9 == 1179649) {
                    var3 = (c_r)c_a5.es.cf().elementAt(6);
                }

                if (var3 != null) {
                    for(int var10 = var8; var10 < var9; ++var10) {
                        if (var5) {
                            var3.mZ[var10] = false;
                        } else {
                            var3.mZ[var10] = true;
                        }
                    }
                }
            }
            break;
        case -2146303987:
            c_b5.method_case("--------------- 接收仓库扩容结果-------------");
            byte var4 = var1.method_if();
            c_b5.method_case("result = " + var4);
            if (var4 == 0) {
                at.field_byte = false;
            } else {
                at.field_byte = true;
                a7[] var2 = new a7[]{(a7)c_a5.es.cf().elementAt(7), (a7)c_a5.es.cf().elementAt(8), (a7)c_a5.es.cf().elementAt(9), (a7)c_a5.es.cf().elementAt(10)};

                for(int var6 = 0; var6 < var2.length; ++var6) {
                    var2[var6].eY = (var4 & c_b5.method_int(2, var6)) != 0;
                }

                c_r var7 = (c_r)c_a5.es.cf().elementAt(3);
                var2[0].a(true, c_a5.es);
                var7.a(false, c_a5.es);
                ((c_ao)c_a5.es.cf().elementAt(1)).a("取消", 1);
                a(false);
            }
        }

        c_a5.fR = false;
    }

    public static byte a() {
        if (((a7)c_a5.es.cf().elementAt(7)).q()) {
            return 0;
        } else if (((a7)c_a5.es.cf().elementAt(8)).q()) {
            return 1;
        } else if (((a7)c_a5.es.cf().elementAt(9)).q()) {
            return 2;
        } else if (((a7)c_a5.es.cf().elementAt(10)).q()) {
            return 3;
        } else {
            c_b5.method_case("获取扩容背包索引错误！！！！");
            return -1;
        }
    }

    public static void a(boolean var0) {
        if (var0) {
            ((a7)c_a5.es.cf().elementAt(7)).a((byte)1, (byte)4);
            ((a7)c_a5.es.cf().elementAt(8)).a((byte)1, (byte)4);
            ((a7)c_a5.es.cf().elementAt(9)).a((byte)1, (byte)4);
            ((a7)c_a5.es.cf().elementAt(10)).a((byte)1, (byte)4);
        } else {
            ((a7)c_a5.es.cf().elementAt(7)).a((byte)1, (byte)-1);
            ((a7)c_a5.es.cf().elementAt(8)).a((byte)1, (byte)-1);
            ((a7)c_a5.es.cf().elementAt(9)).a((byte)1, (byte)-1);
            ((a7)c_a5.es.cf().elementAt(10)).a((byte)1, (byte)-1);
        }
    }

    public static void method_if(boolean var0) {
        if (var0) {
            ((c_r)c_a5.es.cf().elementAt(6)).a((byte)1, (byte)9);
            ((c_r)c_a5.es.cf().elementAt(8)).a((byte)0, (byte)7);
        } else {
            ((c_r)c_a5.es.cf().elementAt(6)).a((byte)1, (byte)-1);
            ((c_r)c_a5.es.cf().elementAt(8)).a((byte)0, (byte)-1);
        }
    }
}
