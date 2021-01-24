import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

/**
 * 2021/01/20
 * @author 95739
 *
 */
public final class c_f {
    private Random m = new Random();
    public static String f = "socket://218.206.77.164:30000";
    public static SocketConnection field_else = null;
    private DataInputStream field_goto = null;
    private DataOutputStream b = null;
    private Vector field_long = new Vector();
    private c_f.a d = null;
    private Vector field_case = new Vector();
    private byte field_void = -1;
    private static c_f k = null;
    public int[] field_int = new int[0];
    public boolean e = false;
    short field_try = 0;
    byte[] j = null;

    private c_f() {
        m.setSeed(System.currentTimeMillis());
    }

    public static c_f method_byte() {
        if (k == null) {
            k = new c_f();
        }

        return k;
    }

    private synchronized boolean method_new() {
        try {
            (field_else = (SocketConnection)Connector.open(f, 3, false)).setSocketOption((byte)2, 0);
            field_else.setSocketOption((byte)0, 10);
            field_else.setSocketOption((byte)1, 5);
            field_goto = field_else.openDataInputStream();
            b = field_else.openDataOutputStream();
            d = new c_f.a();
            return true;
        } catch (Exception var2) {
            if (field_long != null) {
            	field_long = new Vector();
            }

            c_b5.method_case("first close KEmulator");
            var2.printStackTrace();
            c_a5.C();
            return false;
        }
    }

    public final void method_for() {
        try {
            if (d != null) {
                d.a = null;
                d = null;
            }

            if (field_else != null) {
            	field_else.close();
            	field_else = null;
            }

            field_else = null;
            if (field_goto != null) {
            	field_goto.close();
            	field_goto = null;
            }

            if (b != null) {
                b.close();
                b = null;
            }

            field_void = -1;
            field_try = 0;
            j = null;
        } catch (Exception var2) {
        }

        if (c_a5.method_else() == 11 && c_a5.gQ != null || c_a5.method_else() == 14 || c_a5.hQ == 1 && c_a5.method_else() == 4 || c_a5.hY == 1) {
            c_a5.hG = true;
            c_b5.method_case("MainCanvas.isFullClose=" + c_a5.hG);
        }

    }

    public final void a(int[] var1) {
    	field_int = var1;
        c_a5.fE.removeAllElements();
        if (field_int.length > 0) {
            method_if();
            e = true;
        }

    }

    public final void a(Vector var1) {
        field_int = new int[var1.size()];

        for(int var2 = 0; var2 < var1.size(); ++var2) {
        	field_int[var2] = (Integer)(var1.elementAt(var2));
        }

        c_a5.fE.removeAllElements();
        if (field_int.length > 0) {
            method_if();
            e = true;
        }

    }

    public final void method_if() {
        if (field_int.length > 0) {
            a(field_int[0]);
            field_int = c_b5.a(field_int, 0);
        }

    }

    public final void a(int var1) {
        ac var2 = null;
        byte[] var3 = null;
        short var4 = 0;
        Object var5 = null;
        a0.a();
        byte[] var13;
        if ((var13 = a0.a(var1)) != null) {
            var3 = var13;
            var4 = (short)(var13.length + 4);
        }

        var2 = new ac();
        byte var6 = 0;

        for(int var7 = 0; var7 < var13.length; ++var7) {
            var6 += var13[var7];
        }

        var2.a(var6);
        if (var3 != null) {
            var2.method_if(var3);
        }

        ac var16;
        ac var10000 = var16 = new ac();
        int var12 = var4 + 1;
        var10000.a((short)var12);
        var16.a((byte)65);
        ++field_void;
        var16.a(field_void);
        byte[] var10001 = var2.method_long();
        byte var10 = field_void;
        byte[] var14 = j;
        var3 = var10001;
        byte[] var11;
        if (var10001 == null) {
            var10001 = var3;
        } else if (var14 == null) {
            var10001 = var3;
        } else if (var14.length == 0) {
            var10001 = var3;
        } else {
            var11 = new byte[var3.length];
            int var15 = var14.length;
            var1 = ((byte)var10 + 256) % (var15 >> 1) << 1;
            var15 = 0;

            for(var1 = var1; var15 < var3.length; var1 += 2) {
                if (var1 >= var14.length) {
                    var1 = 0;
                }

                switch(var14[var1]) {
                case 38:
                    var11[var15] = (byte)(var3[var15] - var14[var1 + 1]);
                    break;
                case 75:
                    var11[var15] = (byte)(var3[var15] + var14[var1 + 1]);
                    break;
                case 80:
                    var11[var15] = (byte)(~var3[var15]);
                    break;
                case 123:
                default:
                    var11[var15] = (byte)(var3[var15] ^ var14[var1 + 1]);
                }

                ++var15;
            }

            var10001 = var11;
        }

        var16.method_if(var10001);
        var11 = var16.method_long();
        field_long.addElement(var11);
        synchronized(this) {
            if (field_else == null) {
                try {
                    c_b5.method_case("socket_start");
                    method_new();
                } catch (Exception var8) {
                }
            }

        }
    }

    public final void method_do() {
        if (field_case.size() > 0) {
            while(field_case.size() != 0) {
                ac var1 = new ac((byte[])((byte[])field_case.elementAt(0)));
                a0.a();
                a0.a(var1);
                field_case.removeElementAt(0);
            }
        }

    }

    private boolean a() {
        try {
            boolean var1 = false;
            short var5 = field_goto.readShort();

            while(var5 > 0) {
                byte[] var6 = new byte[var5 - 2];

                for(int var2 = 0; var2 - var6.length != 0; var2 += field_goto.read(var6, var2, var6.length - var2)) {
                }

                field_case.addElement(var6);

                try {
                    var5 = field_goto.readShort();
                } catch (Exception var3) {
                    return true;
                }
            }

            return true;
        } catch (Exception var4) {
            c_b5.method_case("in receive info error!");
            if (c_a5.iB == 0) {
                bk.method_goto();
                c_a5.C();
            }

            var4.printStackTrace();
            return false;
        }
    }

    public final boolean method_char() {
        if (b == null) {
            return true;
        } else {
            try {
                if (field_long.size() != 0) {
                    for(; field_long.size() != 0; field_long.removeElementAt(0)) {
                        byte[] var1;
                        if ((var1 = (byte[])((byte[])field_long.elementAt(0))) != null) {
                            b.write(var1);
                            c_a5.ix = 0;
                        }
                    }
                } else {
                    ++c_a5.ix;
                }

                b.flush();
                return true;
            } catch (Exception var2) {
                var2.printStackTrace();
                return false;
            }
        }
    }

    public static String method_case() {
        if (field_else == null) {
            return "";
        } else {
            try {
                return field_else.getLocalAddress();
            } catch (Exception var0) {
                return "";
            }
        }
    }

    private class a implements Runnable {
        Thread a = new Thread(this);

        a() {
            a.start();
        }

        public final void run() {
            Thread var1 = Thread.currentThread();

            while(a == var1) {
                try {
                    if (!c_f.this.a()) {
                        a = null;
                    }

                    synchronized(this) {
                        wait(100L);
                    }

                    Thread.yield();
                } catch (Exception var5) {
                    var5.printStackTrace();
                }
            }

            c_f.method_byte().method_for();
        }
    }
}
