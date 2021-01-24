import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/**
 * 2020/01/20
 * @author 95739
 *
 */
public final class v {
    private short field_char;
    private short field_case;
    Vector field_if = new Vector();
    private short[] a;
    private boolean[] field_int;
    short b;
    public short field_void = -1;
    public short field_goto = -1;
    public int field_new = -1;
    public byte field_byte = -1;
    public boolean field_else = false;
    public long field_try = 0L;
    byte c = -1;
    public long field_for = -1L;

    public v() {
        b = (short)(c_a5.iG + 2);
    }

    public final Vector a() {
        return field_if;
    }

    public final void a(ba var1) {
        field_if.addElement(var1);
    }

    public final void a(int var1) {
        a = new short[var1];
    }

    public final void a(String var1, byte var2) {
        ba var3;
        if ((var3 = (ba)field_if.elementAt(1)) instanceof ah) {
            ((ah)var3).a(var1);
        }

    }

    public final void a(Graphics var1, boolean var2) {
        for(int var3 = 0; var3 < field_if.size(); ++var3) {
            ba var4;
            (var4 = (ba)field_if.elementAt(var3)).method_if(var2);
            var4.a(var1);
        }

    }

    public final short[] method_case() {
        return a;
    }

    public final void a(short[] var1) {
        a = var1;
    }

    public final short method_if(byte var1) {
        short var2 = 0;

        for(int var3 = 0; var3 < var1; ++var3) {
            var2 += a[var3];
        }

        return var2;
    }

    public final boolean[] method_if() {
        return field_int;
    }

    public final void a(boolean[] var1) {
        field_int = var1;
    }

    public final short method_for() {
        return b;
    }

    public final void method_int(short var1) {
        b = var1;
    }

    public final short method_try() {
        return field_char;
    }

    public final void method_if(short var1) {
        field_char = var1;
    }

    public final short method_byte() {
        return field_case;
    }

    public final void a(short var1) {
        field_case = var1;
    }

    public final void a(byte var1) {
        c = var1;
    }
}
