import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/20
 * @author 95739
 *
 */
public final class c_y extends ba {
    private short Q = -1;
    short E = -1;
    af U = null;
    private af R = null;
    int F = 15317892;
    int T = 600869;
    public int[] I = new int[4];
    int G = 0;
    public static boolean S;
    public static boolean M;

    public c_y(short var1, short var2, short var3, short var4, byte var5, c_be var6) {
        super(var1, var2, var3, var4, var6);
        super.y = var5;
        I[0] = super.k + 10 + 3 + 1 + 1;
        if (E == -1) {
            I[1] = super.j + 5 + 1 + 1 + 1;
        } else {
            I[1] = super.j + 5 + 1 + 1 + 1 + E;
        }

        I[2] = super.k + super.a - 30 - c_a5.ca.getWidth();
        if (Q == -1) {
            I[3] = super.field_int - 16;
        } else {
            I[3] = Q - 6;
        }

        G = I[3] / c_a5.iG;
    }

    public final void a(Graphics var1) {
        if (super.y == 2) {
            var1.setColor(T);
            var1.drawRect(super.k, super.j, super.a - 1, super.field_int - 1);
            var1.setColor(F);
            var1.fillRect(super.k + 1, super.j + 1, super.a - 2, super.field_int - 2);
        } else {
            short var2 = super.a;
            var1.setColor(7755053);
            var1.fillRect(super.k, super.j, var2, super.field_int);
            var1.setColor(11241821);
            var1.fillRect(super.k + 1, super.j + 1, var2 - 2, super.field_int - 2);
            var1.setColor(15255701);
            var1.fillRect(super.k + 2, super.j + 2, var2 - 4, super.field_int - 4);
            var1.setColor(11241821);
            var1.fillRect(super.k + 3, super.j + 3, var2 - 6, super.field_int - 6);
            var1.setColor(12952181);
            var1.fillRect(super.k + 4, super.j + 4, var2 - 8, super.field_int - 8);
            var1.setColor(15255701);
            var1.fillRect(super.k + 5, super.j + 5, var2 - 10, super.field_int - 10);
            var1.setColor(c_bm.field_try);
            var1.fillRect(super.k + 6, super.j + 6, var2 - 12, super.field_int - 12);
            if (super.y == 1) {
                int var6;
                if (M) {
                    var6 = super.k + 10 - 4;
                } else {
                    var6 = super.k + 10;
                }

                boolean var3 = false;
                int var7;
                if (E == -1) {
                    var7 = super.j + 5 + 2;
                } else {
                    var7 = super.j + 5 + 2 + E;
                }

                int var4;
                if (M) {
                    var4 = super.a - 20 + 8;
                } else {
                    var4 = super.a - 20;
                }

                boolean var5 = false;
                int var8;
                if (Q == -1) {
                    var8 = super.field_int - 14;
                } else {
                    var8 = Q - 5;
                }

                var1.setColor(c_bm.dt);
                var1.fillRect(var6, var7, var4, var8);
                var6 += 3;
                ++var7;
                var4 -= 6;
                var8 -= 2;
                var1.setColor(c_bm.field_try);
                var1.fillRect(var6, var7, var4, var8);
                ++var6;
                ++var7;
                var4 -= 2;
                var8 -= 2;
                var1.setColor(c_bm.dt);
                var1.fillRect(var6, var7, var4, var8);
                ++var6;
                ++var7;
                var4 -= 2;
                var8 -= 2;
                var1.setColor(c_bm.field_try);
                var1.fillRect(var6, var7, var4, var8);
                if (U != null) {
                    U.a(var1);
                }
            }

        }
    }

    public final void f() {
    }

    public final void method_new(boolean var1) {
        if (super.y == 1 && U == null) {
            int var2;
            if (M) {
                var2 = super.k + super.a - 10 - 3 - 1 - 1 - c_a5.ca.getWidth() + 3;
            } else {
                var2 = super.k + super.a - 10 - 3 - 1 - 1 - c_a5.ca.getWidth() - 3;
            }

            boolean var3 = false;
            int var5;
            if (E == -1) {
                var5 = super.j + 5 + 1 + 1 + 1 + 3;
            } else {
                var5 = super.j + 5 + 1 + 1 + 1 + 3 + E;
            }

            boolean var4 = false;
            int var6;
            if (Q == -1) {
                var6 = super.field_int - 22 - 1;
            } else if (S) {
                var6 = Q - 6 - 7;
            } else {
                var6 = Q - 6 - 1;
            }

            U = new af((short)var2, (short)var5, (short)0, (short)var6, (byte)0, var1, (c_be)null);
        }

    }

    public final short M() {
        boolean var1 = false;
        int var2;
        if (Q == -1) {
            var2 = super.field_int - 10;
        } else {
            var2 = Q;
        }

        return (short)var2;
    }

    public final void method_case(short var1) {
        Q = var1;
        boolean var2 = false;
        int var3;
        if (var1 == -1) {
            var3 = super.field_int - 16;
        } else {
            var3 = var1 - 6;
        }

        I[3] = var3;
        G = I[3] / c_a5.iG;
        if (U != null) {
            U.a((short)var3);
        }

    }

    public final void method_try(short var1) {
        if (var1 == method_long() + 5) {
            E = -1;
        } else {
            E = (short)((var1 - 5) * c_a5.il / 208 - method_long());
            I[1] = E + method_long() + 8;
        }

        method_for(method_long());
    }

    public final af L() {
        return U;
    }

    public final void a(short var1, short var2) {
        if (U != null) {
            U.ay = var2;
            U.az = var1;
            af var10000 = U;
            byte var4 = 0;
            var10000.aj = var4;
        }

    }
}
