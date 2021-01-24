/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class o {
    public static String[] field_if;
    public static String[] field_do;
    public static String[] a;
    public static byte field_int = 0;
    public static int[] field_for;

    public o() {
    }

    public static byte[] a(int var0) {
        ac var1;
        (var1 = new ac()).method_do(var0);
        switch(var0) {
        case 2359297:
            c_a5.fR = true;
            break;
        case 2359298:
        case 2359299:
            if (c_as.c4 == 0) {
                c_as.a((byte)0, "请您输入数量", "确定", "", -1, -2);
            } else {
                c_a5.fR = true;
                int var2 = field_int + 1;
                var1.a((byte)var2);
                var1.method_do(c_as.c4);
                c_b5.method_case("-------------------------=" + c_as.c4);
            }
        }

        return var1.method_long();
    }

    public static void a(int var0, ac var1) {
        switch(var0) {
        case -2145124351:
            String var2 = var1.method_goto();
            String var3 = var1.method_goto();
            field_do[field_int] = var2;
            a[field_int] = var3;
            ((ah)c_a5.es.cf().elementAt(7)).a(field_do[field_int]);
            ((ah)c_a5.es.cf().elementAt(8)).a(a[field_int]);
            c_b5.method_case("555555555555555555555555555555");
        default:
        }
    }
}
