/**
 * 2021/01/21
 * @author 95739
 *
 */
public final class al {
    private static int field_do = -1;
    public static int field_if = -1;
    public static int a = -1;
    public static int[] field_for;

    public al() {
    }

    public static byte[] a(int var0) {
        c_a5.fR = true;
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 2293874:
            var1.method_do(field_if);
            break;
        case 2293875:
            var1.method_do(a);
            var1.a(c_bv.j9);
            var1.a(c_bv.j8);
            break;
        case 2293876:
            var1.method_do(ah.aQ);
            break;
        case 2297615:
            var1.method_do(field_do);
            var1.method_if(c_a5.hC[0]);
            var1.method_if(c_a5.hC[1]);
            c_a5.A();
        }

        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        switch(var0) {
        case -2145128208:
        	field_do = var1.method_byte();
            return;
        case -2145127951:
            System.out.println("玩家点击活动========");
            byte var6 = var1.method_if();
            boolean var2 = false;
            int[] var3 = new int[var6];
            String[] var4 = new String[var6];
            field_for = new int[var6];

            for(int var5 = 0; var5 < var6; ++var5) {
                var3[var5] = var1.method_byte();
                var2 = true;
                var4[var5] = var1.method_goto();
                field_for[var5] = var1.method_byte();
                System.out.println("功能ID: " + field_for[var5]);
            }

            if (var2) {
                (c_br.iW = new c_br((byte)2)).a(var4, var3);
                c_br.iW.m(false);
                c_a5.method_try((byte)5);
                c_a5.fR = false;
            }
        default:
        }
    }
}
