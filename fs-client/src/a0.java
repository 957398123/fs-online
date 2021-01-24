/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class a0 {
    private static a0 F = null;
    private static int D = 0;

    public a0() {
    }

    /**
     * 单例模式（不安全）
     * @return
     */
    public static a0 a() {
        if (F == null) {
        	F = new a0();
        }
        return F;
    }

    public static byte[] a(int var0) {
        byte[] var1 = null;
        byte var2 = (byte)(var0 >> 16);
        c_a5.dS = c_a5.es;

        try {
            ac var5;
            switch(var2) {
            case 0:
            case 1:
            case 17:
                var1 = a1.a(var0);
                break;
            case 2:
                var1 = c_z.a(var0);
                break;
            case 3:
            case 13:
                var1 = c_l.method_do().method_do(var0);
                break;
            case 4:
                var1 = bf.a(var0);
            case 5:
            case 8:
            case 12:
            case 16:
            case 20:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 50:
            default:
                break;
            case 6:
                var1 = b3.a(var0);
                break;
            case 7:
                var1 = at.a(var0);
                break;
            case 9:
                c_b5.method_case("UITable.selectedPlayerId:" + c_bg.hP);
                (var5 = new ac()).method_do(var0);
                switch(var0) {
                case 589825:
                    c_a5.fR = true;
                    c_b5.method_case("PCSocial.snd_Parse()...friend list.");
                    break;
                case 589826:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("PCSocial.snd_Parse()...add:" + c_l.g.e);
                    break;
                case 589827:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("PCSocial.snd_Parse()...del:" + c_l.g.e);
                    break;
                case 589828:
                    c_a5.fR = true;
                    c_b5.method_case("PCSocial.snd_Parse()...black list.");
                    break;
                case 589829:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("PCSocial.snd_Parse()...blackadd:" + c_l.g.e);
                    break;
                case 589830:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("PCSocial.snd_Parse()...blackdel:" + c_l.g.e);
                    break;
                case 589831:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("PCSocial.snd_Parse()...player detail.");
                    break;
                case 589832:
                    c_a5.fR = true;
                    c_b5.method_case("PCSocial.snd_Parse()...SOCIAL_SEARCH.");
                    break;
                case 589833:
                    var5.method_if(b1.lN);
                    c_b5.method_case("PCSocial.snd_Parse()...C_UI_SOCIAL_ADD_FRIEND_FORM.");
                    break;
                case 589834:
                    c_a5.fR = true;
                    c_b5.method_case("PCSocial.snd_Parse()...C_UI_SOCIAL_TALK_FL.");
                    break;
                case 589835:
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("PCSocial.snd_Parse()...C_TOPFORM_SOCIAL_FRIENDADD.");
                    break;
                case 589836:
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("PCSocial.snd_Parse()...C_TOPFORM_SOCIAL_BLACKADD.");
                    break;
                case 589841:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("将当前玩家加为仇人");
                    break;
                case 589842:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("将当前玩家从仇人列表中删除出去");
                    break;
                case 589843:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("查看当前仇人的信息");
                    break;
                case 589844:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("传送到该仇人的身边");
                    break;
                case 589845:
                    c_a5.fR = true;
                    c_b5.method_case("向服务器索要仇人列表");
                    break;
                case 589846:
                    c_a5.fR = true;
                    var5.method_do(c_bg.hP);
                    c_b5.method_case("好友传送");
                    break;
                case 589847:
                    var5.method_if(b1.lN);
                    c_b5.method_case("PCSocial.snd_Parse()...C_UI_SOCIAL_ADD_BLACK_FORM.");
                    break;
                case 589848:
                    c_a5.fR = true;
                    var5.method_if(b1.lN);
                    c_b5.method_case("--------------发送仇人昵称--------------------");
                    break;
                case 624776:
                    var5.method_do(bp.ag().eC);
                }

                var1 = var5.method_long();
                break;
            case 10:
                var1 = c_ad.a(var0);
                break;
            case 11:
                var1 = c_bu.a(var0);
                break;
            case 14:
                var1 = bx.a(var0);
                break;
            case 15:
                c_a5.fR = true;
                (var5 = new ac()).method_do(var0);
                switch(var0) {
                case 983041:
                    var5.method_do(c_l.g.method_new());
                    var5.a(c_r.mp);
                    c_b5.method_case("发送 商店->查看 命令！！！！");
                    break;
                case 983042:
                    var5.method_do(c_l.g.method_new());
                    var5.a(c_r.mp);
                    c_b5.method_case("------- 买了第 " + c_r.mp + "格的物品");
                    var0 = c_as.c4;
                    var5.a((byte)var0);
                    c_b5.method_case("发送 商店->买入 命令 - 买了" + c_as.c4 + " 个");
                    c_as.c4 = 0;
                    break;
                case 983043:
                    var5.a(c_r.mp);
                    var0 = c_as.c4;
                    var5.a((byte)var0);
                    c_b5.method_case("发送 商店->卖出 命令 - 卖出" + c_as.c4 + " 个");
                    c_as.c4 = 0;
                    c_b5.method_case("发送 商店->卖出 命令！！！！");
                    break;
                case 983044:
                    c_a5.fR = true;
                    c_b5.method_case("发送 商店->整理 命令！！！！");
                    break;
                case 983045:
                    var5.a(c_r.mp);
                    c_b5.method_case("发送 商店->丢弃 命令！！！！");
                    break;
                case 983046:
                case 983047:
                case 983048:
                case 983057:
                    c_a5.fR = true;
                    c_b5.method_case("********商店，发送命令*********");
                case 983056:
                case 983058:
                    var5.method_do(c_l.g.method_new());
                    break;
                case 983049:
                    var5.method_do(c_l.g.method_new());
                case 983050:
                case 983051:
                case 983052:
                case 983053:
                case 983054:
                case 983055:
                }

                var1 = var5.method_long();
                break;
            case 18:
                var1 = bs.a(var0);
                break;
            case 19:
                var1 = an.a(var0);
                break;
            case 21:
                var1 = a2.a(var0);
                break;
            case 22:
                var1 = n.a(var0);
                break;
            case 23:
                c_a5.fR = true;
                (var5 = new ac()).method_do(var0);
                switch(var0) {
                case 1507329:
                    var5.method_do(c_l.g.method_new());
                    c_b5.method_case("Rank.snd_Parse() C_RANK_LIST...");
                    break;
                case 1507330:
                    var5.a(ax.a);
                    c_b5.method_case("Rank.snd_Parse() C_RANK_DETAIL_LIST...");
                    break;
                case 1507331:
                    c_b5.method_case("Rank.snd_Parse() C_RANK_NONE_NPC_LIST...");
                }

                var1 = var5.method_long();
                break;
            case 24:
                var1 = d.method_do(var0);
                break;
            case 25:
                var1 = c_bt.method_do(var0);
                break;
            case 26:
                var1 = c_q.a(var0);
                break;
            case 27:
                c_a5.fR = true;
                (var5 = new ac()).method_do(var0);
                switch(var0) {
                case 1769473:
                case 1769478:
                case 1769479:
                case 1769480:
                case 1769488:
                case 1769489:
                case 1769490:
                case 1769491:
                case 1769492:
                    var5.method_do(c_l.g.method_new());
                    c_b5.method_case("********兑换界面*********");
                    break;
                case 1769474:
                    var5.method_do(c_l.g.method_new());
                    var5.a(c_r.mp);
                    var5.method_do(c_as.c4);
                    c_b5.method_case("C_CHANGE_FINISH");
                    break;
                case 1769475:
                case 1769481:
                    var5.method_do(c_l.g.method_new());
                    var5.a(c_r.mp);
                    break;
                case 1769476:
                    var5.method_do(c_l.g.method_new());
                    var5.a(c_r.mp);
                    c_b5.method_case("C_CHANGE_POPFORM");
                case 1769477:
                case 1769482:
                case 1769483:
                case 1769484:
                case 1769485:
                case 1769486:
                case 1769487:
                }

                var1 = var5.method_long();
                break;
            case 28:
                var1 = c_i.method_do(var0);
                break;
            case 29:
                var1 = bw.a(var0);
                break;
            case 30:
                var1 = au.a(var0);
                break;
            case 31:
                var1 = aq.a(var0);
                break;
            case 32:
                var1 = by.a(var0);
                break;
            case 33:
                var1 = bb.a(var0);
                break;
            case 34:
                var1 = aj.a(var0);
                break;
            case 35:
                var1 = al.a(var0);
                break;
            case 36:
                var1 = o.a(var0);
                break;
            case 37:
                var1 = bo.method_if(var0);
                break;
            case 38:
                (var5 = new ac()).method_do(var0);
                c_a5.fR = true;
                switch(var0) {
                case 2490369:
                    var5.method_do(c_bu.method_do());
                case 2490370:
                case 2490371:
                case 2490372:
                case 2490374:
                case 2490376:
                case 2490377:
                case 2490378:
                case 2490379:
                case 2490380:
                case 2490381:
                case 2490382:
                case 2490383:
                case 2490384:
                case 2490386:
                case 2490387:
                case 2490388:
                case 2490389:
                case 2490390:
                case 2490391:
                case 2490392:
                case 2490393:
                case 2490394:
                case 2490395:
                case 2490396:
                case 2490397:
                case 2490398:
                case 2490399:
                case 2490400:
                case 2490401:
                case 2490405:
                case 2490406:
                case 2490410:
                case 2490411:
                case 2490412:
                case 2490413:
                case 2490414:
                case 2490415:
                case 2490418:
                case 2490419:
                default:
                    break;
                case 2490373:
                case 2490420:
                    var5.method_do(c_bu.method_do());
                    break;
                case 2490375:
                case 2490422:
                    var5.method_do(c_bu.method_do());
                    break;
                case 2490385:
                    c_b5.method_case("请求徒弟列表");
                    break;
                case 2490402:
                case 2490421:
                    var5.a(c.field_for);
                    break;
                case 2490403:
                    var5.method_do(c_bg.hP);
                    break;
                case 2490404:
                    var5.method_do(c_as.c4);
                    c_a5.fR = false;
                    break;
                case 2490407:
                case 2490417:
                    var5.method_do(c.a);
                    break;
                case 2490408:
                case 2490409:
                case 2490416:
                    c_a5.fR = false;
                    var5.method_do(c.a);
                    break;
                case 2490423:
                    c_a5.fR = false;
                    var5.method_do(c.a);
                }

                var1 = var5.method_long();
                break;
            case 39:
                var1 = az.a(var0);
                break;
            case 40:
                var1 = b4.a(var0);
                break;
            case 41:
                var1 = u.a(var0);
                break;
            case 48:
                var1 = aa.a(var0);
                break;
            case 49:
                (var5 = new ac()).method_do(var0);
                switch(var0) {
                case 3211265:
                case 3211266:
                case 3211267:
                case 3211268:
                case 3211269:
                    c_a5.fR = true;
                default:
                    var1 = var5.method_long();
                    return var1;
                }
            case 51:
                var1 = am.a(var0);
                break;
            case 52:
                (var5 = new ac()).method_do(var0);
                var1 = var5.method_long();
            }
        } catch (Exception var4) {
        }

        return var1;
    }

    public static void a(ac var0) {
        var0.method_new();
        D = var0.method_byte();

        try {
            int var5;
            switch((byte)(D >> 16)) {
            case 0:
            case 1:
            case 17:
                a1.a(D, var0);
                return;
            case 2:
                c_z.a(D, var0);
                return;
            case 3:
            case 13:
                c_l.method_do().a(D, var0);
                return;
            case 4:
                bf.a(D, var0);
                return;
            case 5:
                bl.a(D, var0);
                return;
            case 6:
                switch(var5 = D) {
                case -2147090429:
                    System.out.println("接收人物经验");
                    c_a5.dh = var5;
                    c_a5.gb = var0.method_int(var0.field_do.length - 6);
                    return;
                case -2147090423:
                    c_a5.dh = var5;
                    c_a5.gb = var0.method_int(var0.field_do.length - 6);
                    return;
                default:
                    return;
                }
            case 7:
                at.a(D, var0);
                return;
            case 8:
            case 12:
            case 15:
            case 16:
            case 20:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 50:
            case 52:
            default:
                break;
            case 9:
                ac var1 = var0;
                byte var7;
                switch(D) {
                case -2146893823:
                    byte var6 = var0.method_if();

                    for(var7 = 0; var7 < var6; ++var7) {
                        c_b5.method_case("PCSocial.rec_Parse()..name:" + var1.method_goto());
                        c_b5.method_case("PCSocial.rec_Parse()..id:" + var1.method_new());
                        c_b5.method_case("PCSocial.rec_Parse()..race:" + var1.method_if());
                        c_b5.method_case("PCSocial.rec_Parse()..pro:" + var1.method_if());
                        c_b5.method_case("PCSocial.rec_Parse()..online:" + var1.method_case());
                    }

                    return;
                case -2146893822:
                    c_b5.method_case("PCSocial.rec_Parse()...add return:" + var0.method_if());
                    return;
                case -2146893821:
                    c_b5.method_case("PCSocial.rec_Parse()...del return:" + var0.method_if());
                    return;
                case -2146893820:
                    var7 = var0.method_if();

                    for(byte var8 = 0; var8 < var7; ++var8) {
                        c_b5.method_case("PCSocial.rec_Parse().b.name:" + var1.method_goto());
                        c_b5.method_case("PCSocial.rec_Parse().b.id:" + var1.method_new());
                        c_b5.method_case("PCSocial.rec_Parse().b.race:" + var1.method_if());
                        c_b5.method_case("PCSocial.rec_Parse().b.pro:" + var1.method_if());
                        c_b5.method_case("PCSocial.rec_Parse().b.online:" + var1.method_case());
                    }

                    return;
                case -2146893819:
                    c_b5.method_case("PCSocial.rec_Parse()...badd return:" + var0.method_if());
                    return;
                case -2146893818:
                    c_b5.method_case("PCSocial.rec_Parse()...bdel return:" + var0.method_if());
                    return;
                default:
                    return;
                }
            case 10:
                c_ad.a(D, var0);
                return;
            case 11:
                c_bu.a(D, var0);
                return;
            case 14:
                bx.a(D, var0);
                return;
            case 18:
                bs.a(D, var0);
                return;
            case 19:
                an.a(D, var0);
                return;
            case 21:
                a2.a(D, var0);
                return;
            case 22:
                n.a(D, var0);
                return;
            case 23:
            case 49:
                return;
            case 24:
                d.a(D, var0);
                return;
            case 25:
                c_bt.a(D, var0);
                return;
            case 26:
                c_q.a(D, var0);
                return;
            case 27:
                switch(D) {
                case -2145714175:
                    c_a5.fR = false;
                    System.out.println("~~~~~~~~~兑换弹板~~~~~~~~~~~~~S_CHANGE_TOP_FORM");
                    var5 = var0.method_byte();
                    String var2 = var0.method_goto();
                    int var3 = var0.method_byte();
                    c_as.cH = var5;
                    c_as.a((byte)1, var2, "确定", "返回", var3, -1);
                    c_a5.gQ.method_goto(var5);
                    return;
                default:
                    return;
                }
            case 28:
                c_i.a(D, var0);
                return;
            case 29:
                bw.a(D, var0);
                return;
            case 30:
                au.a(D, var0);
                return;
            case 31:
                aq.a(D, var0);
                return;
            case 32:
                by.a(D, var0);
                return;
            case 33:
                bb.a(D, var0);
                return;
            case 34:
                aj.a(D, var0);
                return;
            case 35:
                al.a(D, var0);
                return;
            case 36:
                o.a(D, var0);
                return;
            case 37:
                bo.a(D, var0);
                return;
            case 38:
                switch(D) {
                case -2144993279:
                    c.field_if = var0.method_goto();
                    c.field_do = var0.method_byte();
                    c.field_int = var0.method_case();
                    return;
                case -2144993278:
                    c_as.cH = 100;
                    c_as.a((byte)1, "请给师傅打分：", "确定", "", 2490404, -2);
                    c_a5.gQ.method_goto(100);
                    return;
                default:
                    return;
                }
            case 39:
                az.a(D, var0);
                return;
            case 40:
                b4.a(D, var0);
                return;
            case 41:
                u.a(D, var0);
                return;
            case 48:
                aa.a(D, var0);
                return;
            case 51:
                am.a(D, var0);
            }

        } catch (Exception e) {
            c_b5.method_case("getType(nCmd)=" + (byte)(D >> 16));
            e.printStackTrace();
        }
    }

    public static byte method_if(int var0) {
        return (byte)(var0 >> 16);
    }
}
