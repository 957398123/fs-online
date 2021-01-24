/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class bx {
    public static byte field_for = -1;
    public static byte field_if = -1;
    public static byte a = -1;

    public bx() {
    }

    public static byte[] a(int var0) {
    	c_a5.fR = true;
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 917506:
            c_b5.method_case("发送 ui装备-卸下 命令");
            var1.a(a7.fF);
            break;
        case 917507:
            c_b5.method_case("发送 ui装备-查看 命令");
            var1.a(a7.fF);
            break;
        case 917508:
            c_b5.method_case("发送 ui装备-比较 命令");
            break;
        case 917509:
        case 917523:
            var1.a(c_r.mp);
            var1.a(a7.fF);
            c_b5.method_case("发送 ui装备-穿上 命令");
            c_b5.method_case("---背包里第 " + c_r.mp + "格---");
            c_b5.method_case("---装备里第 " + a7.fF + "格---");
        case 917510:
        case 917512:
        case 917513:
        case 917514:
        case 917515:
        case 917516:
        case 917517:
        case 917518:
        case 917519:
        default:
            break;
        case 917511:
            int var2 = c_r.m8;
            var1.a((byte)var2);
            c_b5.method_case("发送 ui装备-丢弃 命令");
            break;
        case 917520:
            c_b5.method_case("发送 ui装备-修理装备UI 命令");
            break;
        case 917521:
            c_b5.method_case("发送 ui装备-修理装备 单个 命令");
            var1.a(a7.fF);
            break;
        case 917522:
            c_b5.method_case("发送 ui装备-修理装备 全部 命令");
            var1.a(a7.fF);
            break;
        case 917524:
            var1.a(field_for);
            var1.a(a);
            var1.a(field_if);
            c_b5.method_case("m_bEquipIndex所修物品索引=" + field_for);
            c_b5.method_case("m_bOrigin物品来源=" + a);
            c_b5.method_case("m_bPropIndex修补道具索引=" + field_if);
            break;
        case 917525:
        case 917530:
            c_a5.fR = true;
            break;
        case 917526:
        case 917527:
            var1.a(am.field_do);
            c_a5.fR = true;
            break;
        case 917528:
            c_a5.fR = true;
            var1.a(aq.a);
            var1.a(aq.field_int);
            break;
        case 917529:
            c_a5.fR = true;
            var1.a(aq.a);
            var1.a(aq.field_int);
            aq.method_if();
        }

        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        switch(var0) {
        case -2146566141:
            aq.a = var1.method_if();
            aq.a(4, true, 0, false);
            return;
        case -2146566140:
            aq.field_int = var1.method_if();
            aq.a(6, true, 0, true);
        default:
            return;
        case -2146565984:
            var1.method_if();
        }
    }
}
