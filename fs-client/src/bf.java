/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class bf {
    public static boolean field_for = false;
    public static int a = -1;
    public static byte field_int = -1;
    public static byte field_try = -1;
    public static boolean field_if = false;
    public static int[] field_do;
    public static byte[] field_new;

    public bf() {
    }

    public static byte[] a(int var0) {
        c_a5.fR = true;
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 262147:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_UI_TASK_VIEW...");
            break;
        case 262148:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_UI_UTASK_DROP...");
            break;
        case 262149:
            var1.method_do(c_bv.jI);
            var1.method_do(c_l.g.method_new());
            field_if = true;
            c_b5.method_case("Task.snd_Parse() C_UI_TASK_RECEIVE...");
            break;
        case 262150:
            var1.method_do(c_bv.jI);
            var1.method_do(c_l.g.method_new());
            c_b5.method_case("选择的任务报酬索引：" + a7.e3);
            var1.a(a7.e3);
            a7.e3 = -1;
            c_b5.method_case("Task.snd_Parse() C_UI_TASK_OVER...");
            break;
        case 262151:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_SHARE...");
            break;
        case 262152:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_GET...");
            break;
        case 262153:
            var1.method_do(c_l.g.method_new());
            c_b5.method_case("Task.snd_Parse() C_UI_TASK_NPCLIST...");
            break;
        case 262154:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_UI_TASK_VIEW_NO...");
            break;
        case 262155:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_UI_QTASK_DROP...");
            break;
        case 262156:
            var1.method_do(c_bv.jI);
            var1.a(a7.fs);
            var1.a(a7.eB);
            c_b5.method_case("任务ID:" + c_bv.jI);
            c_b5.method_case("物品所在组:" + a7.fs);
            c_b5.method_case("物品所在行:" + a7.eB);
            c_b5.method_case("Task.snd_Parse() C_UI_TASK_GOODS...");
            break;
        case 262157:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_UI_TASK_TURNIN_VIEW...");
            break;
        case 262158:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_GET_JIE...");
            break;
        case 262159:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_GET_SELF...");
            break;
        case 262162:
            var1.method_do(c_bv.jI);
            var1.a(c_bv.kT);
            c_b5.method_case("Task.snd_Parse() C_TASK_FIND_PATH...");
            break;
        case 262164:
            c_b5.method_case("??????????????接收taskID = " + c_as.dV);
            var1.method_do(c_as.dV);
            c_b5.method_case("Task.snd_Parse() C_TASK_SHARE_ACCEPT...");
            break;
        case 262166:
            var1.method_do(a);
            c_b5.method_case("Task.snd_Parse() C_TASK_CAN_RESET_MAP...");
            break;
        case 262167:
            var1.method_do(a);
            c_b5.method_case("Task.snd_Parse() C_TASK_CAN_RESET_TASK...");
            break;
        case 262169:
            var1.method_do(a);
            c_b5.method_case("Task.snd_Parse() C_TASK_CAN_ACCEPT_MAP...");
            break;
        case 262170:
            var1.method_do(a);
            c_b5.method_case("Task.snd_Parse() C_TASK_CAN_ACCEPT_TASK...");
            break;
        case 262171:
            c_b5.method_case("Task.snd_Parse() C_TASK_ALL_LIST...");
            break;
        case 262172:
            var1.method_do(c_as.dV);
            c_b5.method_case("Task.snd_Parse() C_TASK_SHARE_CANCEL...");
            break;
        case 262173:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_RESET...");
            break;
        case 262174:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_RESET_VIEW...");
            break;
        case 262175:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_RESET_GET...");
            break;
        case 262176:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_ACCEPT_VIEW...");
            break;
        case 262177:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_ACCEPT_GET...");
            break;
        case 262178:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_REFESH_VIEW...");
            break;
        case 262179:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_REFESH...");
            break;
        case 262180:
            c_b5.method_case("Task.snd_Parse() C_TASK_GOODS_RECEIVE...");
            break;
        case 262181:
            c_b5.method_case("Task.snd_Parse() C_TASK_GOODS_GET...");
            break;
        case 262182:
            var1.a(a7.fs);
            var1.a(a7.eB);
            c_b5.method_case("UIPicture.sGroupIndex = " + a7.fs);
            c_b5.method_case("UIPicture.sColIndex = " + a7.eB);
            c_b5.method_case("Task.snd_Parse() C_TASK_GOODS_VIEW_GOODS...");
            break;
        case 262184:
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_COLLECT...");
            break;
        case 262185:
            c_b5.method_case("Task.snd_Parse() C_TASK_FAVORITE...");
            break;
        case 262186:
            c_b5.method_case("UIList.selectedListId: " + c_bv.jI);
            var1.method_do(c_bv.jI);
            c_b5.method_case("Task.snd_Parse() C_TASK_FAVORITE_DEL...");
            break;
        case 262187:
            c_b5.method_case("Task.snd_Parse() C_TASK_SELF...");
            break;
        case 262188:
            var1.method_do(c_bv.jI);
            var1.method_do(c_l.g.method_new());
            c_b5.method_case("Task.snd_Parse() C_TASK_CHECK_MAYBE_OVER...");
            break;
        case 262189:
            var1.method_do(c_bv.jI);
            var1.a(field_int);
            c_b5.method_case("Task.snd_Parse() C_TASK_VIEW_MUST_GOODS...");
            break;
        case 262190:
            var1.method_do(c_bv.jI);
            var1.method_do(c_l.g.method_new());
            c_b5.method_case("Task.snd_Parse() C_TASK_JIE_MAYBE_GOODS...");
            break;
        case 262192:
            var1.a(field_try);
            c_b5.method_case("Task.snd_Parse() C_TASK_ANSWER...");
            break;
        case 262193:
            c_b5.method_case("Task.snd_Parse() C_TASK_INSERTCHAT...");
            break;
        case 262194:
            var1.method_do(c_bv.jI);
            var1.a(c_bv.kT);
            break;
        case 263168:
            var1.method_do(c_l.g.method_new());
            c_b5.method_case("Task.snd_Parse() C_TASK_VIEW_NPC...");
        }

        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        byte var6;
        switch(var0) {
        case -2147221500:
        case -2147221499:
        case -2147221498:
        case -2147221493:
        case -2147221492:
        case -2147221490:
            c_b5.method_case("Task.rec_Parse() S_TASK_JIAO or S_TASK_JIE or S_TASK_SELF...");
            c_a5.dh = var0;
            c_a5.gb = var1.method_int(var1.field_do.length - 6);
            return;
        case -2147221497:
        case -2147221496:
        case -2147221494:
        case -2147221486:
        case -2147221485:
        case -2147221484:
        case -2147221483:
        case -2147221482:
        case -2147221481:
        case -2147221480:
        case -2147221479:
        case -2147221478:
        case -2147221477:
        case -2147221476:
        case -2147221475:
        case -2147221474:
        case -2147221473:
        case -2147221472:
        case -2147221471:
        case -2147221470:
        case -2147221469:
        case -2147221468:
        case -2147221467:
        case -2147221466:
        case -2147221465:
        case -2147221464:
        case -2147221463:
        case -2147221462:
        case -2147221461:
        case -2147221460:
        case -2147221459:
        case -2147221458:
        case -2147221457:
        case -2147221456:
        case -2147221455:
        case -2147221454:
        default:
            return;
        case -2147221495:
            c_b5.method_case("Task.rec_Parse() S_TASK_GUIDE_LOCALE...");
            c_a5.A();
            c_a5.aj();
            bp.ag().aA = (new b0()).a(bp.ag().l, bp.ag().q, c_bv.j9, c_bv.j8);
            bp.ag().method_do((byte)104);
            break;
        case -2147221491:
            c_b5.method_case("Task.rec_Parse() S_TASK_ID...");
            c_bv.jI = var1.method_byte();
            c_b5.method_case(" S_TASK_ID = " + Integer.toHexString(c_bv.jI));
            return;
        case -2147221489:
            var6 = var1.method_if();
            c_b5.method_case(" S_TASK_TYPE = " + var6);
            if (var6 == 1) {
                field_for = false;
                return;
            }

            field_for = true;
            return;
        case -2147221488:
            c_a5.A();
            c_b5.method_case(" S_TASK_SUCCESS_OVER ");
            return;
        case -2147221487:
            System.out.println("玩家点击任务========");
            var6 = var1.method_if();
            boolean var7 = false;
            int[] var8 = new int[var6];
            String[] var9 = new String[var6];
            field_do = new int[var6];
            field_new = new byte[var6];

            for(int var10 = 0; var10 < var6; ++var10) {
                var8[var10] = var1.method_byte();
                var7 = true;
                var9[var10] = var1.method_goto();
                field_do[var10] = var1.method_byte();
                field_new[var10] = var1.method_if();
                System.out.println("功能ID: " + field_do[var10]);
            }

            if (var7) {
                (c_br.iW = new c_br((byte)3)).a(var9, var8);
                c_br.iW.m(false);
                c_a5.method_try((byte)5);
            }
            break;
        case -2147221453:
            for(var0 = var1.method_if() - 1; var0 >= 0; --var0) {
                int var2 = var1.method_byte();
                byte var3 = var1.method_if();

                for(int var4 = c_l.field_else.length - 1; var4 >= 0; --var4) {
                    if (c_l.field_else[var4].method_new() == var2) {
                        c_b var5;
                        (var5 = (c_b)c_l.field_else[var4]).dw = var3;
                        var5.cK = 48;
                        break;
                    }
                }
            }

            return;
        }

        c_a5.fR = false;
    }

    public static void method_if() {
        c_ao var0 = (c_ao)c_a5.es.cf().elementAt(1);
        if (c_bv.jp) {
            var0.a("完成", 0);
        } else {
            var0.a("", 0);
        }
    }

    public static void a() {
        c_ao var0 = (c_ao)c_a5.es.cf().elementAt(1);
        if (c_bv.jP) {
            var0.a("接受", 0);
        } else {
            var0.a("", 0);
        }
    }
}
