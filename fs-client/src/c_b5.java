import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

/**
 * 2021/01/20
 * @author 95739
 *
 */
public abstract class c_b5 {
    public static Vector Q = new Vector();
    public static Vector I = new Vector();
    public static Vector M = new Vector();
    public static byte X = 0;
    private static boolean C = false;
    private static Random P;
    private static short j;
    private static int[] m;
    public static int field_int;
    private static int[] h;
    public static byte[][] c;
    public static int p;
    public static int d;
    private static boolean E;
    private static String field_case;
    static int o;

    public c_b5() {
    }

    public static void method_case(String var0) {
    	System.out.println(var0);
    }

    public static void a(int var0) {
    }

    public static byte[] a$1cf9d9ca(byte[] var0) {
        byte[] var1 = null;

        try {
            var1 = bh.a(var0);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        return var1;
    }

    public static int method_new(int var0) {
        return (P.nextInt() << 1 >>> 1) % var0;
    }

    public static final int a(int var0, int var1) {
        return (P.nextInt() << 1 >>> 1) % (var1 - var0 + 1) + var0;
    }

    private static byte[] a(boolean var0, byte[] var1, String var2) {
        byte[] var3 = null;
        if (var1 == null && !var0) {
            return null;
        } else {
            if (!var0) {
                try {
                    RecordStore.deleteRecordStore(var2);
                } catch (Exception var6) {
                }
            }

            try {
                RecordStore var4;
                if ((var4 = RecordStore.openRecordStore(var2, true)).getNumRecords() == 0) {
                    if (!var0) {
                        var4.addRecord(var1, 0, var1.length);
                    }
                } else if (var0) {
                    var3 = var4.getRecord(1);
                } else {
                    var4.setRecord(1, var1, 0, var1.length);
                }

                var4.closeRecordStore();
            } catch (Exception var5) {
            }

            return var3;
        }
    }

    static void method_if(byte[] var0, String var1) {
        a(false, var0, var1);
    }

    static void a(byte[] var0, String var1) {
        if (var0 != null) {
            Object var2 = null;
            ac var3 = new ac();

            for(int var4 = 0; var4 < var0.length; ++var4) {
                var3.a(var0[var4]);
            }

            byte[] var5 = var3.method_long();
            var3.field_do = null;
            a(false, var5, var1);
        }
    }

    static void a(int[] var0, String var1) {
        if (var0 != null) {
            Object var2 = null;
            ac var3 = new ac();

            for(int var4 = 0; var4 < var0.length; ++var4) {
                var3.method_do(var0[var4]);
            }

            byte[] var5 = var3.method_long();
            var3.field_do = null;
            a(false, var5, var1);
        }
    }

    static void a(short[] var0, String var1) {
        Object var2 = null;
        ac var3 = new ac();

        for(int var4 = 0; var4 < var0.length; ++var4) {
            var3.a(var0[var4]);
        }

        byte[] var5 = var3.method_long();
        var3.field_do = null;
        a(false, var5, var1);
    }

    static void a(String[] var0, String var1) {
        if (var0 != null) {
            Object var2 = null;
            ac var3 = new ac();

            for(int var4 = 0; var4 < var0.length; ++var4) {
                var3.method_if(var0[var4]);
            }

            byte[] var5 = var3.method_long();
            var3.field_do = null;
            a(false, var5, var1);
        }
    }

    static final byte[] method_byte(String var0) {
        return a(true, (byte[])null, var0);
    }

    static final byte[] method_if(String var0, int var1) {
        byte[] var5 = new byte[1];
        byte[] var3;
        if ((var3 = a(true, (byte[])null, var0)) == null) {
            return null;
        } else {
            ac var4 = new ac(var3);

            for(int var2 = 0; var2 < 1; ++var2) {
                var5[0] = var4.method_if();
            }

            return var5;
        }
    }

    static final int[] method_int(String var0, int var1) {
        int[] var2 = new int[var1];
        byte[] var4;
        if ((var4 = a(true, (byte[])null, var0)) == null) {
            return null;
        } else {
            ac var5 = new ac(var4);

            for(int var3 = 0; var3 < var1; ++var3) {
                var2[var3] = var5.method_byte();
            }

            return var2;
        }
    }

    static final short[] a(String var0, int var1) {
        short[] var5 = new short[2];
        byte[] var3;
        if ((var3 = a(true, (byte[])null, var0)) == null) {
            return null;
        } else {
            ac var4 = new ac(var3);

            for(int var2 = 0; var2 < 2; ++var2) {
                var5[var2] = var4.method_new();
            }

            return var5;
        }
    }

    static final String[] method_do(String var0, int var1) {
        String[] var2 = new String[var1];
        byte[] var4;
        if ((var4 = a(true, (byte[])null, var0)) == null) {
            return null;
        } else {
            ac var5 = new ac(var4);

            for(int var3 = 0; var3 < var1; ++var3) {
                var2[var3] = var5.method_goto();
            }

            return var2;
        }
    }

    public static short[] method_for(String var0, boolean var1) {
        short[] var7 = new short[0];

        String var2;
        try {
            InputStream var5 = int$3b9f0c8(var0);
            DataInputStream var6;
            if ((var6 = new DataInputStream(var5)).readShort() != j) {
                var2 = "Util.readPicFile() error: wrong version!";
            }

            boolean var8 = var6.readBoolean();
            short var3;
            var7 = new short[(var3 = var6.readShort()) << 2];
            int var9;
            if (var8) {
                for(var9 = 0; var9 < var3 << 2; ++var9) {
                    var7[var9] = var6.readShort();
                }
            } else {
                for(var9 = 0; var9 < var3 << 2; ++var9) {
                    var7[var9] = (short)(var6.readByte() & 255);
                }
            }

            var6.close();
        } catch (Exception var4) {
            var4.printStackTrace();
            var2 = "Util.readPdatFile() exception!";
        }

        return var7;
    }

    public static short[][] a(String var0, int var1, boolean var2) {
        short[][] var8 = new short[0][0];

        String var9;
        try {
            InputStream var6 = int$3b9f0c8(var0);
            DataInputStream var7;
            if ((var7 = new DataInputStream(var6)).readShort() != j) {
                var9 = "Util.readFdatFile() error: wrong version!";
            }

            var2 = var7.readBoolean();
            short var3;
            var8 = new short[var3 = var7.readShort()][];
            boolean var4 = false;
            int var10;
            short var11;
            int var12;
            if (var2) {
                for(var10 = 0; var10 < var3; ++var10) {
                    var11 = (short)(var7.readByte() & 255);
                    var8[var10] = new short[var11 << 2];

                    for(var12 = 0; var12 < var8[var10].length; ++var12) {
                        if (var12 == 0) {
                            var8[var10][var12] = (short)var7.readShort();
                        } else {
                            var8[var10][var12] = var7.readShort();
                        }
                    }
                }
            } else {
                for(var10 = 0; var10 < var3; ++var10) {
                    var11 = (short)(var7.readByte() & 255);
                    var8[var10] = new short[var11 << 2];

                    for(var12 = 0; var12 < var8[var10].length; var12 += 4) {
                        var8[var10][var12] = (short)(var7.readByte() & 255);
                        var8[var10][var12 + 1] = (short)var7.readByte();
                        var8[var10][var12 + 2] = (short)var7.readByte();
                        var8[var10][var12 + 3] = (short)var7.readByte();
                    }
                }
            }

            var7.close();
        } catch (Exception var5) {
            var5.printStackTrace();
            var9 = "Util.readFdatFile() exception!";
        }

        return var8;
    }

    public static short[][] method_if(String var0, boolean var1) {
        short[][] var8 = new short[0][0];

        String var2;
        try {
            InputStream var6 = int$3b9f0c8(var0);
            DataInputStream var7;
            if ((var7 = new DataInputStream(var6)).readShort() != j) {
                var2 = "Util.readMdatFile() error: wrong version!";
            }

            boolean var9 = var7.readBoolean();
            short var3;
            var8 = new short[var3 = var7.readShort()][];
            boolean var4 = false;
            int var10;
            short var11;
            int var12;
            if (var9) {
                for(var10 = 0; var10 < var3; ++var10) {
                    var11 = (short)(var7.readByte() & 255);
                    var8[var10] = new short[var11];

                    for(var12 = 0; var12 < var8[var10].length; ++var12) {
                        var8[var10][var12] = var7.readShort();
                    }
                }
            } else {
                for(var10 = 0; var10 < var3; ++var10) {
                    var11 = (short)(var7.readByte() & 255);
                    var8[var10] = new short[var11];

                    for(var12 = 0; var12 < var8[var10].length; ++var12) {
                        var8[var10][var12] = (short)(var7.readByte() & 255);
                    }
                }
            }

            var7.close();
        } catch (Exception var5) {
            var5.printStackTrace();
            var2 = "Util.readMdatFile() exception!";
        }

        return var8;
    }

    public static void a(Image var0, Graphics var1, short[] var2, short[] var3, int var4, int var5, boolean var6) {
        byte var13 = 0;

        for(int var14 = 0; var14 < var2.length; var14 += 4) {
            short var8 = var2[var14 + 1];
            short var7 = var2[var14];
            if ((var8 & 1) == 0) {
                int var9 = (var8 & 8) >> 3;
                int var15;
                if ((var15 = ((var8 & 6) >> 1) + (var9 == 0 ? 0 : var9 + 1 << 1)) == 8) {
                    var15 = 4;
                } else if (var15 == 9) {
                    var15 = 5;
                }

                if (var6) {
                    if (var15 != 0 && var15 != 4) {
                        var15 = 8 - var15;
                    } else {
                        var15 = 4 - var15;
                    }
                }

                var7 = (short)(var7 << 2);
                short var16 = var3[var7];
                short var10 = var3[var7 + 1];
                short var11 = var3[var7 + 2];
                short var12 = var3[var7 + 3];
                var7 = var11;
                switch(var15) {
                case 0:
                    var13 = 0;
                    var7 = var11;
                    break;
                case 1:
                    var13 = 6;
                    var7 = var12;
                    break;
                case 2:
                    var13 = 3;
                    var7 = var11;
                    break;
                case 3:
                    var13 = 5;
                    var7 = var12;
                    break;
                case 4:
                    var13 = 2;
                    var7 = var11;
                    break;
                case 5:
                    var13 = 4;
                    var7 = var12;
                    break;
                case 6:
                    var13 = 1;
                    var7 = var11;
                    break;
                case 7:
                    var13 = 7;
                    var7 = var12;
                }

                int var17;
                if (!var6) {
                    var17 = var4 + var2[var14 + 2];
                } else {
                    var17 = var4 - (var2[var14 + 2] + var7);
                }

                var15 = var5 + var2[var14 + 3];
                a(var1, var0, var16, var10, var11, var12, var17, var15, var13);
            }
        }

        var1.setClip(0, 0, c_a5.ic, c_a5.il);
    }

    public static String[] a(String var0, int var1, Font var2) {
        if (var1 == 0) {
            String[] var12;
            (var12 = new String[1])[0] = var0;
            return var12;
        } else {
            String var3 = null;
            var3 = new String(var0);
            int var11 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = var3.length();
            Vector var7 = null;
            var7 = new Vector(var2.stringWidth(var3) / var1, 4);
            boolean var8 = false;

            while(var4 < var6) {
                char var9;
                char var13;
                for(var13 = 0; var5 < var6 && (var9 = var3.charAt(var5)) != '\n'; ++var5) {
                    boolean var10 = false;
                    int var16 = var2.charWidth(var9);
                    if (var11 + var16 > var1) {
                        break;
                    }

                    var11 += var16;
                }

                boolean var14 = false;
                if (var5 < var6) {
                    switch(var3.charAt(var5)) {
                    case '\n':
                        break;
                    default:
                        var14 = true;
                        var13 = var3.charAt(var5);
                    }
                }

                var7.addElement(var5 > var4 ? var3.substring(var4, var5) : "");
                ++var5;
                var4 = var5;
                if (var14) {
                    var4 = var5 - 1;
                    var11 = var2.charWidth(var13);
                } else {
                    var11 = 0;
                }
            }

            String[] var15 = new String[var7.size()];

            for(var4 = 0; var4 < var15.length; ++var4) {
                var15[var4] = (String)var7.elementAt(var4);
            }

            return var15;
        }
    }

    public static short[][] a(String var0, String[] var1, int var2, Font var3) {
        String var4 = null;
        var4 = new String(var0 + "  ");
        int var17 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = var4.length();
        Vector var8 = null;
        var8 = new Vector(var3.stringWidth(var4) / var2, 4);
        boolean var9 = false;
        short var10 = 1;
        short var11;
        short[][] var12 = new short[var11 = (short)var1.length][2];

        while(var5 < var7) {
            char var13;
            char var19;
            for(var19 = 0; var6 < var7 && (var13 = var4.charAt(var6)) != '\n'; ++var6) {
                boolean var14 = false;
                int var21 = var3.charWidth(var13);
                if (var17 + var21 > var2) {
                    break;
                }

                var17 += var21;
            }

            boolean var20 = false;
            if (var6 < var7) {
                switch(var4.charAt(var6)) {
                case '\n':
                case ' ':
                    break;
                default:
                    var20 = true;
                    var19 = var4.charAt(var6);
                }
            }

            var8.addElement(var6 > var5 ? var4.substring(var5, var6) : "");
            String var22 = var6 > var5 ? var4.substring(var5, var6) : "";

            for(var17 = 0; var17 < var22.length(); ++var17) {
                char var18 = var22.charAt(var17);

                for(short var15 = 0; var15 < var11; ++var15) {
                    char var16 = var1[var15].charAt(0);
                    if (var18 == var16) {
                        var12[var15][0] = (short)(var17 * c_a5.iA);
                        var12[var15][1] = var10;
                    }
                }
            }

            ++var10;
            ++var6;
            var5 = var6;
            if (var20) {
                var5 = var6 - 1;
                var17 = var3.charWidth(var19);
            } else {
                var17 = 0;
            }
        }

        return var12;
    }

    public static final int a(int var0, int[][] var1) {
        int var2 = var1.length;
        int var3 = -1;

        for(int var4 = 0; var4 < var2; ++var4) {
            if (var0 >= var1[var4][0] && var0 <= var1[var4][1]) {
                var3 = var4;
                break;
            }
        }

        return var3;
    }

    private static final byte[][] a(String var0, String[] var1) {
        byte[][] var2 = new byte[var1.length][];
        boolean var3 = false;

        try {
            InputStream var9 = (new Object()).getClass().getResourceAsStream(var0);
            DataInputStream var10;
            String var11 = (var10 = new DataInputStream(var9)).readUTF();
            if (0 != var11.compareTo("PKG0")) {
                return null;
            }

            int var12;
            short[] var4 = new short[var12 = var10.readInt()];
            String[] var5 = new String[var12];

            int var6;
            for(var6 = 0; var6 < var12; ++var6) {
                var5[var6] = var10.readUTF();
                var4[var6] = (short)var10.readInt();
            }

            for(var6 = 0; var6 < var12; ++var6) {
                int var7;
                for(var7 = 0; var7 < var1.length && (var1[var7] == null || var1[var7].compareTo(var5[var6]) != 0); ++var7) {
                }

                if (var7 >= var1.length) {
                    var10.skip((long)var4[var6]);
                } else {
                    var2[var7] = new byte[var4[var6]];
                    var10.readFully(var2[var7]);
                }
            }

            var10.close();
        } catch (Exception var8) {
            var8.printStackTrace();
        }

        return var2;
    }

    private static byte[] a(String var0, String var1) {
        byte[] var2 = null;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = -1;
        String var6 = null;

        try {
            InputStream var10 = (new Object()).getClass().getResourceAsStream(var0);
            DataInputStream var11;
            String var12 = (var11 = new DataInputStream(var10)).readUTF();
            if (0 != var12.compareTo("PKG0")) {
                return null;
            }

            int var13 = var11.readInt();
            int var7 = 0;

            for(int var8 = 0; var8 < var13; ++var8) {
                var6 = var11.readUTF();
                int var14 = var11.readInt();
                if (var1.compareTo(var6) == 0) {
                    var5 = var14;
                }

                if (var5 == -1) {
                    var7 += var14;
                }
            }

            if (var5 == -1) {
                return null;
            }

            var2 = new byte[var5];
            var11.skip((long)var7);
            var11.readFully(var2);
            var11.close();
        } catch (Exception var9) {
        }

        return var2;
    }

    public static void method_try(String var0) {
        if (var0 != null && !var0.trim().equals("")) {
            try {
                RecordStore.deleteRecordStore(var0);
            } catch (RecordStoreNotFoundException var1) {
            } catch (RecordStoreException var2) {
            }
        }
    }

    public static boolean method_int(String var0) {
        int var1;
        return (var1 = var0.trim().length()) >= 6 && var1 <= 16;
    }

    public static String[] a(String var0, int var1, char var2) {
        return a(var0, var1, var2, true);
    }

    public static String[] a(String var0, int var1, char var2, boolean var3) {
        int var4 = var0.length();
        Vector var5 = new Vector();

        for(int var6 = 0; var6 < var4; ++var6) {
            String var7 = "";

            for(int var8 = 0; var8 < var1; ++var8) {
                char var9 = var0.charAt(var6);
                var7 = var7 + var9;
                if (var6 == var4 - 1) {
                    var5.addElement(var7);
                    break;
                }

                if (var9 == '\n' && var3 || var9 == var2) {
                    var5.addElement(var7);
                    break;
                }

                if (var8 == var1 - 1) {
                    if (var3) {
                        var7 = var7 + "\n";
                    }

                    var5.addElement(var7);
                    break;
                }

                ++var6;
            }
        }

        String[] var10 = new String[var5.size()];

        for(int var11 = 0; var11 < var10.length; ++var11) {
            var10[var11] = ((String)var5.elementAt(var11)).replace(var2, ' ').trim();
        }

        return var10;
    }

    public static String[] a(String var0, char var1) {
        int var2 = var0.length();
        Vector var3 = new Vector();

        for(int var4 = 0; var4 < var2; ++var4) {
            String var5 = "";

            for(int var6 = 0; var6 < var2; ++var6) {
                char var7 = var0.charAt(var4);
                var5 = var5 + var7;
                if (var4 == var2 - 1) {
                    var3.addElement(var5);
                    break;
                }

                if (var7 == var1) {
                    var3.addElement(var5);
                    break;
                }

                ++var4;
            }
        }

        String[] var8 = new String[var3.size()];

        for(int var9 = 0; var9 < var8.length; ++var9) {
            var8[var9] = ((String)var3.elementAt(var9)).replace(var1, ' ').trim();
        }

        return var8;
    }

    public static final int[][][] a(int[][][] var0, int var1, int[][][] var2) {
        int var4 = var2.length;
        int var5 = var0.length;
        int[][][] var6 = var0;
        var0 = new int[var5 + var4][][];
        System.arraycopy(var6, 0, var0, 0, var1);
        if (var4 > 0) {
            System.arraycopy(var6, var1, var0, var1 + var4, var5 - var1);
        } else {
            System.arraycopy(var6, var1 - var4, var0, var1, var5 + var4 - var1);
        }

        System.arraycopy(var2, 0, var0, var1, var2.length);
        return var0;
    }

    private static int[][] a(int[][] var0, int var1, int var2) {
        int var3 = var0.length;
        int[][] var4 = var0;
        var0 = new int[var3 + var2][];
        System.arraycopy(var4, 0, var0, 0, var1);
        if (var2 > 0) {
            System.arraycopy(var4, var1, var0, var1 + var2, var3 - var1);
        } else {
            System.arraycopy(var4, var1 - var2, var0, var1, var3 + var2 - var1);
        }

        return var0;
    }

    public static final int[][] a(int[][] var0, int var1, int[] var2) {
        (var0 = a((int[][])var0, var1, (int)1))[var1] = var2;
        return var0;
    }

    public static final int[][] a(int[][] var0, int var1) {
        return a((int[][])var0, 0, (int)-1);
    }

    public static final short[][] a(short[][] var0, short[] var1) {
        short[][] var10000 = var0;
        int var10001 = var0.length;
        boolean var5 = true;
        int var2 = var10001;
        var0 = var10000;
        int var3 = var10000.length;
        short[][] var4 = var0;
        var0 = new short[var3 + 1][];
        System.arraycopy(var4, 0, var0, 0, var2);
        System.arraycopy(var4, var2, var0, var2 + 1, var3 - var2);
        var0[var0.length - 1] = var1;
        return var0;
    }

    private static byte[][] a(byte[][] var0, int var1, int var2) {
        int var3 = var0.length;
        byte[][] var4 = var0;
        var0 = new byte[var3 + var2][];
        System.arraycopy(var4, 0, var0, 0, var1);
        if (var2 > 0) {
            System.arraycopy(var4, var1, var0, var1 + var2, var3 - var1);
        } else {
            System.arraycopy(var4, var1 - var2, var0, var1, var3 + var2 - var1);
        }

        return var0;
    }

    public static final byte[][] a(byte[][] var0, int var1, byte[] var2) {
        (var0 = a((byte[][])var0, var1, (int)1))[var1] = var2;
        return var0;
    }

    public static final byte[][] a(byte[][] var0, int var1) {
        return a((byte[][])var0, 0, (int)-1);
    }

    private static Object[] a(Object[] var0, int var1, int var2) {
        int var3 = var0.length;
        Object[] var4 = var0;
        var0 = new Object[var3 + var2];
        System.arraycopy(var4, 0, var0, 0, var1);
        if (var2 > 0) {
            System.arraycopy(var4, var1, var0, var1 + var2, var3 - var1);
        } else {
            System.arraycopy(var4, var1 - var2, var0, var1, var3 + var2 - var1);
        }

        return var0;
    }

    public static final Object[] a(Object[] var0, int var1, Object var2) {
        (var0 = a((Object[])var0, 0, (int)1))[0] = var2;
        return var0;
    }

    public static final Object[] a(Object[] var0, int var1) {
        return a((Object[])var0, var1, (int)-1);
    }

    private static c_a4[] a(c_a4[] var0, int var1, int var2) {
        int var3 = var0.length;
        c_a4[] var4 = var0;
        var0 = new c_a4[var3 + var2];
        System.arraycopy(var4, 0, var0, 0, var1);
        if (var2 > 0) {
            System.arraycopy(var4, var1, var0, var1 + var2, var3 - var1);
        } else {
            System.arraycopy(var4, var1 - var2, var0, var1, var3 + var2 - var1);
        }

        return var0;
    }

    public static final c_a4[] a(c_a4[] var0, c_a4 var1) {
        (var0 = a((c_a4[])var0, var0.length, (int)1))[var0.length - 1] = var1;
        return var0;
    }

    public static final c_a4[] a(c_a4[] var0, int var1) {
        return a((c_a4[])var0, var1, (int)-1);
    }

    public static final int method_if(c_a4[] var0, c_a4 var1) {
        for(int var2 = var0.length - 1; var2 >= 0; --var2) {
            if (var0[var2].method_new() == var1.method_new()) {
                return var2;
            }
        }

        return -1;
    }

    private static String[] a(String[] var0, int var1, int var2) {
        int var3 = var0.length;
        String[] var4 = var0;
        var0 = new String[var3 + var2];
        System.arraycopy(var4, 0, var0, 0, var1);
        if (var2 > 0) {
            System.arraycopy(var4, var1, var0, var1 + var2, var3 - var1);
        } else {
            System.arraycopy(var4, var1 - var2, var0, var1, var3 + var2 - var1);
        }

        return var0;
    }

    public static final String[] a(String[] var0, int var1, String var2) {
        (var0 = a((String[])var0, var1, (int)1))[var1] = var2;
        return var0;
    }

    public static final String[] a(String[] var0, int var1, String[] var2) {
        var0 = a(var0, var1, var2.length);
        System.arraycopy(var2, 0, var0, var1, var2.length);
        return var0;
    }

    public static final String[] a(String[] var0, int var1) {
        return a((String[])var0, var1, (int)-1);
    }

    private static int[] method_if(int[] var0, int var1, int var2) {
        int var3 = var0.length;
        int[] var4 = var0;
        var0 = new int[var3 + var2];
        System.arraycopy(var4, 0, var0, 0, var1);
        if (var2 > 0) {
            System.arraycopy(var4, var1, var0, var1 + var2, var3 - var1);
        } else {
            System.arraycopy(var4, var1 - var2, var0, var1, var3 + var2 - var1);
        }

        return var0;
    }

    public static final int[] a(int[] var0, int var1, int var2) {
        (var0 = method_if((int[])var0, var1, 1))[var1] = var2;
        return var0;
    }

    public static final int[] a(int[] var0, int var1, int[] var2) {
        var0 = method_if(var0, var1, var2.length);
        System.arraycopy(var2, 0, var0, var1, var2.length);
        return var0;
    }

    public static final int[] a(int[] var0, int var1) {
        return method_if((int[])var0, var1, -1);
    }

    private static byte[] a(byte[] var0, int var1, int var2) {
        int var3 = var0.length;
        byte[] var4 = var0;
        var0 = new byte[var3 + var2];
        System.arraycopy(var4, 0, var0, 0, var1);
        if (var2 > 0) {
            System.arraycopy(var4, var1, var0, var1 + var2, var3 - var1);
        } else {
            System.arraycopy(var4, var1 - var2, var0, var1, var3 + var2 - var1);
        }

        return var0;
    }

    public static final byte[] a(byte[] var0, int var1, byte var2) {
        (var0 = a((byte[])var0, var1, (int)1))[var1] = var2;
        return var0;
    }

    public static final byte[] method_if(byte[] var0, int var1) {
        return a((byte[])var0, var1, (int)-1);
    }

    private static char[] a(char[] var0, int var1, int var2) {
        int var3 = var0.length;
        char[] var4 = var0;
        var0 = new char[var3 + var2];
        System.arraycopy(var4, 0, var0, 0, var1);
        if (var2 > 0) {
            System.arraycopy(var4, var1, var0, var1 + var2, var3 - var1);
        } else {
            System.arraycopy(var4, var1 - var2, var0, var1, var3 + var2 - var1);
        }

        return var0;
    }

    public static final char[] a(char[] var0, int var1, char[] var2) {
        var0 = a(var0, var1, var2.length);
        System.arraycopy(var2, 0, var0, var1, var2.length);
        return var0;
    }

    public static final char[] method_if(char[] var0, int var1, int var2) {
        return a(var0, var1, -var2);
    }

    public static final Vector[] a(Vector[] var0, int var1, Vector var2) {
        Vector[] var10000 = var0;
        boolean var6 = true;
        var0 = var10000;
        int var4 = var10000.length;
        Vector[] var5 = var0;
        var0 = new Vector[var4 + 1];
        System.arraycopy(var5, 0, var0, 0, var1);
        System.arraycopy(var5, var1, var0, var1 + 1, var4 - var1);
        var0[var1] = var2;
        return var0;
    }

    public static final void method_byte() {
        try {
            if (a(true, (byte[])null, "setup") != null) {
                ;
            }
        } catch (Exception var1) {
        }
    }

    public static void method_do(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
        var0.setColor(var5);
        var2 = (var2 - method_do(var1)) / 2;
        var0.drawString(var1, var3 + var2, var4, 20);
    }

    public static int method_do(String var0) {
        int var1 = 0;

        for(int var2 = 0; var2 < var0.length(); ++var2) {
            var1 += c_a5.fq.charWidth(var0.charAt(var2));
        }

        return var1;
    }

    public static int method_do(Graphics var0, int var1, int var2, int var3, int var4) {
        short var5 = c_a5.dY.field_try;
        boolean var6 = false;
        String var12 = String.valueOf(var1);
        String var7 = String.valueOf(var2);
        int var8 = 0;

        int var9;
        for(var9 = String.valueOf(var1).length(); var8 < var9; ++var8) {
            byte var10 = Byte.parseByte(String.valueOf(var12.charAt(var8)));
            c_a5.dY.method_if(var0, var3 + (var5 + 1) * var8, var4, var10);
        }

        var8 = (var5 + 1) * String.valueOf(var1).length() + 1;
        c_a5.dY.method_if(var0, var3 + var8, var4, 10);
        var9 = 0;

        for(int var13 = String.valueOf(var2).length(); var9 < var13; ++var9) {
            byte var11 = Byte.parseByte(String.valueOf(var7.charAt(var9)));
            c_a5.dY.method_if(var0, var3 + var8 + var5 + 2 + (var5 + 1) * var9, var4, var11);
        }

        return var8 + var5 + 2 + (var5 + 1) * String.valueOf(var2).length();
    }

    public static int[] method_do(int var0, int var1) {
        int[] var2 = new int[2];
        var0 = (c_a5.dY.field_try + 1) * String.valueOf(var0).length() + 1 + c_a5.dY.field_try + 2 + (c_a5.dY.field_try + 1) * String.valueOf(var1).length();
        short var3 = c_a5.dY.a;
        var2[0] = var0;
        var2[1] = var3;
        return var2;
    }

    public static void a(Graphics var0, short var1, int var2, int var3) {
        short var4 = c_a5.eR.field_try;
        if (var1 < 10) {
        	c_a5.eR.method_if(var0, var2, var3, 0);
        	c_a5.eR.method_if(var0, var2 + var4 + 2, var3, var1);
        } else {
            int var5 = 0;

            for(int var6 = String.valueOf(var1).length(); var5 < var6; ++var5) {
                char var7 = String.valueOf(var1).charAt(var5);
                c_a5.eR.method_if(var0, var2 + (var4 + 2) * var5, var3, var7 - 48);
            }

        }
    }

    public static void method_for(Graphics var0, int var1, int var2, int var3, int var4) {
        int var5 = var1 - var2;
        var1 += var2;
        var2 = c_a5.ge.getHeight() - 7;
        var0.setColor(m[var4]);
        var0.fillTriangle(var5 - 8, var3, var5 - 8 + 7, var3, var5 - 8, var3 + 7);
        var0.fillTriangle(var1 + 1, var3, var1 + 1 + 7, var3, var1 + 1 + 7, var3 + 7);
        var0.fillTriangle(var5 - 8, var3 + var2 - 1, var5 - 8, var3 + var2 + 7, var5 - 8 + 7, var3 + var2 + 7);
        var0.fillTriangle(var1, var3 + var2 + 7, var1 + 1 + 7, var3 + var2 + 7, var1 + 1 + 7, var3 + var2 - 1);
    }

    public static void a(Graphics var0, long var1, int var3, int var4) {
        a(var0, c_a5.dY, var1, var3, var4);
    }

    public static void a(Graphics var0, bi var1, long var2, int var4, int var5) {
        short var6 = var1.field_try;
        long var7 = var2;
        String var9 = String.valueOf(var2);
        boolean var10 = false;
        int var11;
        if (var9.charAt(0) == '-') {
            var11 = var6 + 1;
            var9 = String.valueOf(var7 = Math.abs(var2));
            var1.method_if(var0, var4, var5, var1.field_new - 1);
        } else {
            var11 = 0;
        }

        int var12 = 0;

        for(int var3 = String.valueOf(var7).length(); var12 < var3; ++var12) {
            byte var13 = Byte.parseByte(String.valueOf(var9.charAt(var12)));
            var1.method_if(var0, var4 + var11 + (var6 + 1) * var12, var5, var13);
        }

    }

    public static int[] a(long var0) {
        int[] var2;
        (var2 = new int[2])[0] = (c_a5.dY.field_try + 1) * String.valueOf(var0).length();
        var2[1] = c_a5.dY.a;
        return var2;
    }

    public static void for$505cff1c(String var0) {
    }

    public static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        var0.setColor(var5);
        var0.fillRect(var1, var2, var3, var4);
    }

    public static final void method_if(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        var0.setColor(var5);
        var0.drawRect(var1, var2, var3 - 1, var4 - 1);
    }

    public static final void method_if(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
        var0.setColor(0);
        var0.drawString(var1, var2 + 1, var3 + 1, 0);
        var0.setColor(var4);
        var0.drawString(var1, var2, var3, 0);
    }

    public static void method_int(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setColor(h[field_int % 5]);
        var0.drawRect(var1, var2, var3 - 1, var4 - 1);
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setColor(c_bm.bo);
        var0.fillRect(var1, var2, var3, var4);
    }

    public static void a(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
        if (c_a5.ht % 2 == 0) {
            var0.setColor(var4);
        } else if (c_a5.ht % 2 == 1) {
            var0.setColor(var5);
        }

        var0.drawString(var1, var2, var3, 20);
    }

    public static void a(Graphics var0, int var1, int var2) {
        var0.drawImage(c_a5.gA, var1, var2, 20);
    }

    public static String[] method_if(String var0, int var1, Font var2) {
        char[] var11;
        int var3 = (var11 = var0.toCharArray()).length;
        int[] var4 = new int[34];
        int var5 = 0;
        StringBuffer var6 = new StringBuffer();
        Vector var7 = new Vector();

        int var8;
        for(var8 = 0; var8 < var3; ++var8) {
            if (var11[var8] != '\n') {
                var7.addElement(new Character(var11[var8]));
            }

            if (var11[var8] != '$') {
                var6.append(var11[var8]);
            }
        }

        var8 = 0;

        for(int var12 = var7.size(); var8 < var12; ++var8) {
            if (var7.elementAt(var8).toString().charAt(0) == '$') {
                var4[var5] = var8;
                ++var5;
            }
        }

        String[] var21;
        c = new byte[var3 = (var21 = a(var6.toString(), var1, var2)).length][];
        int[][] var13 = new int[var3][2];

        int var15;
        for(var1 = 0; var1 < var3; ++var1) {
            var15 = var21[var1].length();
            c[var1] = new byte[var15];
            if (var1 == 0) {
                var13[var1][0] = 0;
                var13[var1][1] = var15 - 1;
            } else {
                var13[var1][0] = var13[var1 - 1][1] + 1;
                var13[var1][1] = var13[var1][0] + var15 - 1;
            }
        }

        Vector var14 = new Vector(4);
        if (var5 % 2 != 0) {
            --var5;
        }

        int var10;
        int var20;
        for(var15 = 0; var15 < var5; var15 += 2) {
            var4[var15] -= var15;
            var4[var15 + 1] -= var15 + 1 + 1;
            int var18 = a(var4[var15], var13);
            var20 = a(var4[var15 + 1], var13);
            if (var18 == var20) {
                int[] var9;
                (var9 = new int[3])[0] = var18;
                var9[1] = var4[var15] - var13[var18][0];
                var9[2] = var4[var15 + 1] - var13[var18][0];
                var14.addElement(var9);
            } else {
                if (var20 - var18 > 1) {
                    for(var10 = var18 + 1; var10 < var20; ++var10) {
                        int[] var17;
                        (var17 = new int[3])[0] = var10;
                        var17[1] = 0;
                        var17[2] = var21[var10].length() - 1;
                        var14.addElement(var17);
                    }
                }

                int[] var23;
                (var23 = new int[3])[0] = var18;
                var23[1] = var4[var15] - var13[var18][0];
                var23[2] = var13[var18][1] - var13[var18][0];
                var14.addElement(var23);
                (var23 = new int[3])[0] = var20;
                var23[1] = 0;
                var23[2] = var4[var15 + 1] - var13[var20][0];
                var14.addElement(var23);
            }
        }

        int[][] var16 = new int[var3 = var14.size()][];
        Enumeration var19 = var14.elements();

        for(var20 = 0; var19.hasMoreElements(); ++var20) {
            var16[var20] = (int[])((int[])var19.nextElement());
        }

        for(int var22 = 0; var22 < var3; ++var22) {
            for(var10 = var16[var22][1]; var10 <= var16[var22][2]; ++var10) {
                c[var16[var22][0]][var10] = 1;
            }
        }

        return var21;
    }

    public static void a(Graphics var0, String var1, int var2, int var3, int var4, byte var5, byte var6) {
        if (method_do(var1) <= var4) {
            var0.drawString(var1, var2, var3, 20);
        } else {
            int var7 = var0.getClipX();
            int var8 = var0.getClipY();
            int var9 = var0.getClipWidth();
            int var10 = var0.getClipHeight();
            var0.setClip(var2, var3, var4, c_a5.iG + 3);
            int var11;
            switch(var5) {
            case 0:
                if ((var11 = var2 - var6 * p) + method_do(var1) < var2) {
                    p = -(var2 + var4) / var6 + 2;
                } else if (d < 3) {
                    ++d;
                } else {
                    ++p;
                }

                var0.drawString(var1, var11, var3, 20);
                break;
            case 1:
                if (E) {
                    var11 = var2 - var6 * p;
                    var0.drawString(var1, var11, var3, 20);
                    ++p;
                    if (var11 + method_do(var1) < var2 + var4) {
                        E = false;
                        p = 0;
                    }
                } else {
                    var11 = var2 - (method_do(var1) - var4) + var6 * p;
                    var0.drawString(var1, var11, var3, 20);
                    ++p;
                    if (var11 > var2) {
                        E = true;
                        p = 0;
                    }
                }
            }

            var0.setClip(var7, var8, var9, var10);
        }
    }

    public static final void a(Graphics var0, Image var1, int var2, int var3, int var4) {
        Graphics var10000 = var0;
        boolean var5 = true;
        var0 = var10000;
        if (var4 == 0) {
            var0.drawImage(var1, var2, var3, 20);
        } else {
            var0.drawRegion(var1, 0, 0, var1.getWidth(), var1.getHeight(), var4, var2, var3, 20);
        }
    }

    public static final void a(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        a(var0, var1, var2, var3, var4, var5, var6, var7, 0);
    }

    public static final void a(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        try {
            var0.drawRegion(var1, var2, var3, var4, var5, var8, var6, var7, 20);
        } catch (IllegalArgumentException var9) {
        }
    }

    public static Image a(String var0) {
        return do$5170543f(var0);
    }

    private static Image do$5170543f(String var0) {
        try {
            return Image.createImage(var0);
        } catch (IOException var1) {
            var1.printStackTrace();
            var0 = "此图片加载异常！！";
            return null;
        }
    }

    public static final Image method_if(String var0, String var1) {
        try {
            byte[] var3;
            return Image.createImage(var3 = a(var0, var1), 0, var3.length);
        } catch (Exception var2) {
            return null;
        }
    }

    public static final Image[] method_if(String var0, String[] var1) {
        try {
            Image[] var2 = new Image[var1.length];
            byte[][] var4 = a(var0, var1);

            for(int var5 = 0; var5 < var4.length; ++var5) {
                if (var2[var5] == null && var4[var5] != null) {
                    var2[var5] = Image.createImage(var4[var5], 0, var4[var5].length);
                }
            }

            return var2;
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static final Image[] a(Image[] var0, String var1, String[] var2) {
        try {
            boolean var3 = false;
            byte[][] var5 = a(var1, var2);

            for(int var6 = 0; var6 < var5.length; ++var6) {
                if (var0[var6] == null && var5[var6] != null) {
                    var0[var6] = c_j.method_if(var5[var6]);
                }
            }

            return var0;
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public static final Image[] method_if(Image[] var0, String var1, String[] var2) {
        try {
            byte[][] var4 = a(var1, var2);

            for(int var5 = 0; var5 < var4.length; ++var5) {
                if (var0[var5] == null && var4[var5] != null) {
                    var0[var5] = c_j.method_if(var4[var5]);
                }
            }

            return var0;
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static InputStream int$3b9f0c8(String var0) {
        try {
            return (new Object()).getClass().getResourceAsStream(var0);
        } catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public static void a(int[] var0) {
        final int var1 = var0.length;
        c_ao var2 = (c_ao)c_a5.es.cf().elementAt(0);
        final Form var12 = new Form(var2.aC());
        final Command var3 = new Command(c_bm.a2[2], 4, 0);
        final Command var4 = new Command(c_bm.a2[1], 3, 1);
        var12.addCommand(var3);
        var12.addCommand(var4);
        final TextField[] var5 = new TextField[var1];
        final a9[] var6 = new a9[var1];
        final int[] var7 = new int[var1];

        for(int var8 = 0; var8 < var1; ++var8) {
            var6[var8] = (a9)c_a5.es.cf().elementAt(var0[var8]);
            var7[var8] = var6[var8].b2();
            short var9 = var6[var8].b9();
            String var10 = var6[var8].b8();
            String var11 = var6[var8].cc().toString();
            var5[var8] = new TextField(var10, var11, var9, 2);
            var12.append(var5[var8]);
        }

        var12.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2) {
                if (var1x != var3) {
                    if (var1x == var4) {
                        var12.removeCommand(var3);
                        var12.removeCommand(var4);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                } else {
                    for(int var4x = 0; var4x < var1; ++var4x) {
                        String var5x;
                        Alert var8;
                        if ((var5x = var5[var4x].getString()).equals("") || var5x == null) {
                            var8 = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                            var5[var4x].setString("");
                            c_a5.dI.display.setCurrent(var8, var12);
                            return;
                        }

                        if (var5x.length() > var6[var4x].b9()) {
                            var8 = new Alert(c_bm.a2[9], "您输入的内容过长！", (Image)null, AlertType.ERROR);
                            var5[var4x].setString("");
                            c_a5.dI.display.setCurrent(var8, var12);
                            return;
                        }

                        if (var7[var4x] == 1) {
                            for(int var6x = 0; var6x < var5[var4x].getString().length(); ++var6x) {
                                char var3x;
                                if ((var3x = var5[var4x].getString().charAt(var6x)) < '0' || var3x > '9') {
                                    var8 = new Alert(c_bm.a2[9], "请您正确输入！", (Image)null, AlertType.ERROR);
                                    var5[var4x].setString("");
                                    c_a5.dI.display.setCurrent(var8, var12);
                                    return;
                                }
                            }
                        }

                        if (c_a5.es.g9 == 1638427) {
                            int var7x = ((ah)c_a5.es.cf().elementAt(4)).ag();
                            if (Long.parseLong(var5[var4x].getString()) > (long)var7x) {
                                var6[var4x].a(new StringBuffer(String.valueOf(var7x)));
                            } else {
                                var6[var4x].a(new StringBuffer(var5[var4x].getString()));
                            }
                        } else {
                            var6[var4x].a(new StringBuffer(var5[var4x].getString()));
                        }
                    }

                    c_a5.dI.display.setCurrent(c_a5.e8);
                }
            }
        });
        c_a5.dI.display.setCurrent(var12);
    }

    public static final void a(String var0, String var1, int var2, String var3, final int var4, final byte var5) {
        field_case = null;
        final Form var7 = new Form(var0);
        final TextField var8 = new TextField(var1, "", var2, 0);
        var7.append(var8);
        if (c_a5.es.g9 == 1376260 && !var3.equals("0") && !var3.equals("") && var3 != null) {
            var8.setString(var3);
        } else if (c_a5.es.g9 != 1376260 && var3 != null && !var3.equals("")) {
            var8.setString(var3);
        }

        final Command var9 = new Command(c_bm.a2[2], 4, 0);
        final Command var6 = new Command(c_bm.a2[1], 3, 1);
        var7.addCommand(var9);
        var7.addCommand(var6);
        var7.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1, Displayable var2) {
                a9 var7x = (a9)c_a5.es.cf().elementAt(var4);
                c_ao var3 = (c_ao)c_a5.es.cf().elementAt(1);
                if (var1 == var9) {
                    c_b5.field_case = var8.getString();
                    if (var8.getString().equals("")) {
                        c_b5.field_case.equals("");
                    } else {
                        c_b5.field_case.equals(var8.getString());
                    }

                    Alert var5x;
                    if (!var8.getString().equals("") && var8.getString() != null) {
                        if (!c_a5.a(var8.getString(), var5)) {
                            var5x = new Alert(c_bm.a2[9], "您输入的内容不符合要求，请您重新输入！", (Image)null, AlertType.ERROR);
                            var8.setString("");
                            c_a5.dI.display.setCurrent(var5x, var7);
                            c_b5.field_case = var8.getString();
                            if (!c_b5.field_case.equals("")) {
                                c_b5.field_case.equals("");
                            }

                        } else {
                            if (var5 == 5) {
                                if (!var8.getString().trim().equals("DEL") && !var8.getString().trim().equals("del") || var8.getString().trim().length() < 3) {
                                    var5x = new Alert(c_bm.a2[9], "请您正确输入！", (Image)null, AlertType.ERROR);
                                    var8.setString("");
                                    c_a5.dI.display.setCurrent(var5x, var7);
                                    c_b5.field_case = var8.getString();
                                    if (!c_b5.field_case.equals("")) {
                                        c_b5.field_case.equals("");
                                    }

                                    return;
                                }
                            } else if (var5 == 6) {
                                int var6x = 0;

                                while(true) {
                                    if (var6x >= var8.getString().length()) {
                                        if (Integer.parseInt(var8.getString().toString().trim()) > c_be.gG) {
                                            Alert var9x = new Alert(c_bm.a2[9], "您输入的数目已经超过当前上限，请您重新输入！", (Image)null, AlertType.ERROR);
                                            var8.setString("");
                                            c_a5.dI.display.setCurrent(var9x, var7);
                                            c_b5.field_case = var8.getString();
                                            if (!c_b5.field_case.equals("")) {
                                                c_b5.field_case.equals("");
                                            }

                                            return;
                                        }
                                        break;
                                    }

                                    char var4x;
                                    if ((var4x = var8.getString().charAt(var6x)) < '0' || var4x > '9') {
                                        var5x = new Alert(c_bm.a2[9], "请您正确输入！", (Image)null, AlertType.ERROR);
                                        var8.setString("");
                                        c_a5.dI.display.setCurrent(var5x, var7);
                                        c_b5.field_case = var8.getString();
                                        if (!c_b5.field_case.equals("")) {
                                            c_b5.field_case.equals("");
                                        }

                                        return;
                                    }

                                    ++var6x;
                                }
                            }

                            if (c_a5.method_else() == 19) {
                                c_b5.field_case = c_b5.method_for(c_b5.field_case);
                            }

                            var7x.a(new StringBuffer(c_b5.field_case));
                            if (c_a5.method_else() == 18) {
                            	c_a5.fY = c_b5.field_case;
                                ay var8x = (ay)c_a5.es.cf().elementAt(7);
                                if (var7x.q()) {
                                    var3.a("修改", 0);
                                } else if (var8x.q()) {
                                    var3.a("", 0);
                                } else {
                                    var3.a("介绍", 0);
                                }
                            } else if (c_a5.es.g9 == 1376260) {
                                var3.a("修改", 0);
                            } else {
                                var3.a("确定", 0);
                            }

                            c_a5.dI.display.setCurrent(c_a5.e8);
                        }
                    } else {
                        var5x = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                        var8.setString("");
                        c_a5.dI.display.setCurrent(var5x, var7);
                    }
                } else {
                    if (var1 == var6) {
                        var7.removeCommand(var9);
                        var7.removeCommand(var6);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        if (field_case != null && !field_case.equals("")) {
            var3.equals(field_case);
        }

        c_a5.dI.display.setCurrent(var7);
    }

    public static final void method_for(int var0, final int var1) {
        final Form var6 = new Form("请输入账号及其密码");
        final TextField var2 = new TextField("请输入账号", "", 16, 0);
        final TextField var3 = new TextField("请输入密码", "", 16, 0);
        var6.append(var2);
        var6.append(var3);
        if (c_a5.method_else() != 21 && c_a5.method_else() != 22 && c_a5.method_else() != 11) {
            if (c_a5.hC[0] != null && !c_a5.hC[0].equals("")) {
                var2.setString(c_a5.hC[0]);
            }

            if (c_a5.hC[1] != null && !c_a5.hC[1].equals("")) {
                var3.setString(c_a5.hC[1]);
            }
        } else {
            a9 var4 = (a9)c_a5.es.cf().elementAt(4);
            a9 var5 = (a9)c_a5.es.cf().elementAt(var1);
            if (var4.cc().toString().trim() != null && !var4.cc().toString().trim().equals("")) {
                var2.setString(var4.cc().toString().trim());
            }

            if (var5.cc().toString().trim() != null && !var5.cc().toString().trim().equals("")) {
                var3.setString(var5.cc().toString().trim());
            }
        }

        final Command var7 = new Command(c_bm.a2[2], 4, 0);
        final Command var8 = new Command(c_bm.a2[1], 3, 1);
        var6.addCommand(var7);
        var6.addCommand(var8);
        var6.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                a9 var6x = (a9)c_a5.es.cf().elementAt(4);
                a9 var3x = (a9)c_a5.es.cf().elementAt(var1);
                c_ao var4 = (c_ao)c_a5.es.cf().elementAt(1);
                if (var1x == var7) {
                    if (!var2.getString().equals("") && var2.getString() != null && !var3.getString().equals("") && var3.getString() != null) {
                    	c_a5.hC[0] = var2.getString();
                    	c_a5.hC[1] = var3.getString();
                    	c_a5.hC[0] = c_b5.method_for(c_a5.hC[0]);
                    	c_a5.hC[1] = c_b5.method_for(c_a5.hC[1]);
                        var6x.a(new StringBuffer(c_a5.hC[0]));
                        var3x.a(new StringBuffer(c_a5.hC[1]));
                        if (c_a5.method_else() == 11) {
                            var4.a("登录", 0);
                        } else {
                            var4.a("确定", 0);
                        }

                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        Alert var5 = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var5, var6);
                    }
                } else {
                    if (var1x == var8) {
                        var6.removeCommand(var7);
                        var6.removeCommand(var8);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var6);
    }

    public static final void method_if(int var0) {
        final Form var4 = new Form("请输入兑换码");
        final TextField var1 = new TextField("请输入兑换码", "", 16, 0);
        var4.append(var1);
        if (c_a5.method_else() != 21 && c_a5.method_else() != 22 && c_a5.method_else() != 23 && c_a5.hC[0] != null && !c_a5.hC[0].equals("")) {
            var1.setString(c_a5.hC[0]);
        }

        final Command var2 = new Command(c_bm.a2[2], 4, 0);
        final Command var3 = new Command(c_bm.a2[1], 3, 1);
        var4.addCommand(var2);
        var4.addCommand(var3);
        var4.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                a9 var5 = (a9)c_a5.es.cf().elementAt(4);
                c_ao var3x = (c_ao)c_a5.es.cf().elementAt(1);
                if (var1x == var2) {
                    Alert var4x;
                    if (!var1.getString().equals("") && var1.getString() != null) {
                    	c_a5.hC[0] = var1.getString();
                        if (!c_a5.a(var1.getString(), (byte)4)) {
                            var4x = new Alert(c_bm.a2[9], "您输入的账号不符合要求，请您重新输入！", (Image)null, AlertType.ERROR);
                            c_a5.dI.display.setCurrent(var4x, var4);
                        } else {
                        	c_a5.hC[0] = c_b5.method_for(c_a5.hC[0]);
                            var5.a(new StringBuffer(c_a5.hC[0]));
                            var3x.a("确定", 0);
                            c_a5.dI.display.setCurrent(c_a5.e8);
                        }
                    } else {
                        var4x = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var4x, var4);
                    }
                } else {
                    if (var1x == var3) {
                        var4.removeCommand(var2);
                        var4.removeCommand(var3);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var4);
    }

    public static final void a() {
        final Form var0 = new Form("请输入账号及其密码");
        final TextField var1 = new TextField("请输入账号", "", 16, 0);
        final TextField var2 = new TextField("请输入密码", "", 16, 0);
        var0.append(var1);
        var0.append(var2);
        if (c_a5.hC[0] != null && !c_a5.hC[0].equals("")) {
            var1.setString(c_a5.hC[0]);
        }

        if (c_a5.hC[1] != null && !c_a5.hC[1].equals("")) {
            var2.setString(c_a5.hC[1]);
        }

        final Command var3 = new Command(c_bm.a2[2], 4, 0);
        final Command var4 = new Command(c_bm.a2[1], 3, 1);
        var0.addCommand(var3);
        var0.addCommand(var4);
        var0.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                a9 var6 = (a9)c_a5.es.cf().elementAt(9);
                a9 var3x = (a9)c_a5.es.cf().elementAt(10);
                c_ao var4x = (c_ao)c_a5.es.cf().elementAt(1);
                if (var1x == var3) {
                    if (!var1.getString().equals("") && var1.getString() != null && !var2.getString().equals("") && var2.getString() != null) {
                    	c_a5.hC[0] = var1.getString();
                    	c_a5.hC[1] = var2.getString();
                    	c_a5.hC[0] = c_b5.method_for(c_a5.hC[0]);
                    	c_a5.hC[1] = c_b5.method_for(c_a5.hC[1]);
                        var6.a(new StringBuffer(c_a5.hC[0]));
                        var3x.a(new StringBuffer(c_a5.hC[1]));
                        var4x.a("确定", 0);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        Alert var5 = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var5, var0);
                    }
                } else {
                    if (var1x == var4) {
                        var0.removeCommand(var3);
                        var0.removeCommand(var4);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var0);
    }

    public static final void method_if() {
        final Form var0 = new Form("请输入账号及其密码");
        final TextField var1 = new TextField("请输入账号", "", 16, 0);
        final TextField var2 = new TextField("请输入原密码", "", 16, 0);
        final TextField var3 = new TextField("请输入新密码", "", 16, 0);
        final TextField var4 = new TextField("请输入确认密码", "", 16, 0);
        var0.append(var1);
        var0.append(var2);
        var0.append(var3);
        var0.append(var4);
        if (c_a5.fc[0] != null && !c_a5.fc[0].equals("")) {
            var1.setString(c_a5.fc[0]);
        }

        if (c_a5.fc[1] != null && !c_a5.fc[1].equals("")) {
            var2.setString(c_a5.fc[1]);
        }

        if (c_a5.fc[2] != null && !c_a5.fc[2].equals("")) {
            var3.setString(c_a5.fc[2]);
        }

        if (c_a5.fc[3] != null && !c_a5.fc[3].equals("")) {
            var4.setString(c_a5.fc[3]);
        }

        final Command var5 = new Command(c_bm.a2[2], 4, 0);
        final Command var6 = new Command(c_bm.a2[1], 3, 1);
        var0.addCommand(var5);
        var0.addCommand(var6);
        var0.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                a9 var8 = (a9)c_a5.es.cf().elementAt(10);
                a9 var3x = (a9)c_a5.es.cf().elementAt(11);
                a9 var4x = (a9)c_a5.es.cf().elementAt(12);
                a9 var5x = (a9)c_a5.es.cf().elementAt(13);
                c_ao var6x = (c_ao)c_a5.es.cf().elementAt(1);
                if (var1x == var5) {
                    Alert var7;
                    if (!var1.getString().equals("") && var1.getString() != null && !var2.getString().equals("") && var2.getString() != null && !var3.getString().equals("") && var3.getString() != null && !var4.getString().equals("") && var4.getString() != null) {
                    	c_a5.fc[0] = var1.getString().trim();
                    	c_a5.fc[1] = var2.getString().trim();
                    	c_a5.fc[2] = var3.getString().trim();
                    	c_a5.fc[3] = var4.getString().trim();
                        if (!c_a5.fc[2].equals(c_a5.fc[3])) {
                            var7 = new Alert(c_bm.a2[9], "确认密码输入有误，请您重新输入！", (Image)null, AlertType.ERROR);
                            c_a5.dI.display.setCurrent(var7, var0);
                        } else {
                        	c_a5.fc[0] = c_b5.method_for(c_a5.fc[0]);
                            c_a5.fc[1] = c_b5.method_for(c_a5.fc[1]);
                            c_a5.fc[2] = c_b5.method_for(c_a5.fc[2]);
                            c_a5.fc[3] = c_b5.method_for(c_a5.fc[3]);
                            var8.a(new StringBuffer(c_a5.fc[0]));
                            var3x.a(new StringBuffer(c_a5.fc[1]));
                            var4x.a(new StringBuffer(c_a5.fc[2]));
                            var5x.a(new StringBuffer(c_a5.fc[3]));
                            var6x.a("确定", 0);
                            c_a5.dI.display.setCurrent(c_a5.e8);
                        }
                    } else {
                        var7 = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var7, var0);
                    }
                } else {
                    if (var1x == var6) {
                        var0.removeCommand(var5);
                        var0.removeCommand(var6);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var0);
    }

    public static final void method_for() {
        final Form var0 = new Form("请输入要操作的数字");
        final TextField var1 = new TextField("请输入数字", "", 9, 0);
        var0.append(var1);
        final Command var2 = new Command(c_bm.a2[2], 4, 0);
        final Command var3 = new Command(c_bm.a2[1], 3, 1);
        var0.addCommand(var2);
        var0.addCommand(var3);
        var0.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                var2x = null;
                if (var1x != var2) {
                    if (var1x == var3) {
                        var0.removeCommand(var2);
                        var0.removeCommand(var3);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                } else {
                    Alert var5;
                    if (!var1.getString().equals("") && var1.getString() != null) {
                        String var7 = var1.getString();
                        int var6 = 0;

                        int var3x;
                        char var4;
                        for(var3x = var7.length(); var6 < var3x; ++var6) {
                            if ((var4 = var7.charAt(var6)) < '0' || var4 > '9') {
                                var5 = new Alert(c_bm.a2[9], "您输入的内容不符合要求，请您重新输入！", (Image)null, AlertType.ERROR);
                                c_a5.dI.display.setCurrent(var5, var0);
                                return;
                            }
                        }

                        c_a5.gQ.dJ = new StringBuffer();
                        var6 = 0;

                        for(var3x = var7.length(); var6 < var3x; ++var6) {
                            var4 = var7.charAt(var6);
                            c_a5.gQ.a(var4);
                        }

                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        var5 = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var5, var0);
                    }
                }
            }
        });
        c_a5.dI.display.setCurrent(var0);
    }

    public static final void method_new() {
        final Form var0 = new Form("请输入竞拍价格和一口价格");
        final TextField var1 = new TextField("请输入竞拍价", "", 9, 0);
        final TextField var2 = new TextField("请输入一口价", "", 9, 0);
        var0.append(var1);
        var0.append(var2);
        final Command var3 = new Command(c_bm.a2[2], 4, 0);
        final Command var4 = new Command(c_bm.a2[1], 3, 1);
        var0.addCommand(var3);
        var0.addCommand(var4);
        var0.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                a9 var10 = (a9)c_a5.es.cf().elementAt(4);
                a9 var3x = (a9)c_a5.es.cf().elementAt(5);
                String var4x = null;
                String var5 = null;
                if (var1x != var3) {
                    if (var1x == var4) {
                        var0.removeCommand(var3);
                        var0.removeCommand(var4);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                } else {
                    Alert var8;
                    if (!var1.getString().equals("") && var1.getString() != null && !var2.getString().equals("") && var2.getString() != null) {
                        var4x = var1.getString();
                        var5 = var2.getString();
                        int var9 = 0;

                        int var6;
                        char var7;
                        for(var6 = var4x.length(); var9 < var6; ++var9) {
                            if ((var7 = var4x.charAt(var9)) < '0' || var7 > '9') {
                                var8 = new Alert(c_bm.a2[9], "您输入的内容不符合要求，请您重新输入！", (Image)null, AlertType.ERROR);
                                c_a5.dI.display.setCurrent(var8, var0);
                                return;
                            }
                        }

                        var9 = 0;

                        for(var6 = var5.length(); var9 < var6; ++var9) {
                            if ((var7 = var5.charAt(var9)) < '0' || var7 > '9') {
                                var8 = new Alert(c_bm.a2[9], "您输入的内容不符合要求，请您重新输入！", (Image)null, AlertType.ERROR);
                                c_a5.dI.display.setCurrent(var8, var0);
                                return;
                            }
                        }

                        if (var4x.toString().trim().length() > 8) {
                            var4x = "99999998";
                        }

                        if (var5.toString().trim().length() > 8) {
                            var5 = "99999999";
                        }

                        var10.a(new StringBuffer(var4x));
                        var3x.a(new StringBuffer(var5));
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        var8 = new Alert(c_bm.a2[9], "内容不能为空，请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var8, var0);
                    }
                }
            }
        });
        c_a5.dI.display.setCurrent(var0);
    }

    public static final void method_try() {
        final Form var0 = new Form("请输入发送短信的条数");
        final TextField var1;
        (var1 = new TextField("请输入数字", "", 1, 0)).setString("5");
        var0.append(var1);
        final Command var2 = new Command(c_bm.a2[2], 4, 0);
        final Command var3 = new Command(c_bm.a2[1], 3, 1);
        var0.addCommand(var2);
        var0.addCommand(var3);
        var0.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                a9 var8 = (a9)c_a5.es.cf().elementAt(4);
                String var3x = var1.getString();
                if (var1x != var2) {
                    if (var1x == var3) {
                        var0.removeCommand(var2);
                        var0.removeCommand(var3);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                } else {
                    Alert var6;
                    if (!var3x.equals("") && var3x != null) {
                        int var7 = 0;

                        for(int var4 = var3x.length(); var7 < var4; ++var7) {
                            char var5;
                            if ((var5 = var3x.charAt(var7)) < '0' || var5 > '9') {
                                var6 = new Alert(c_bm.a2[9], "您输入的内容不符合要求，请您重新输入！", (Image)null, AlertType.ERROR);
                                c_a5.dI.display.setCurrent(var6, var0);
                                return;
                            }
                        }

                        if (Integer.parseInt(var3x) > 9) {
                            var6 = new Alert(c_bm.a2[9], "您最多可以输入9条，请您重新输入！", (Image)null, AlertType.ERROR);
                            c_a5.dI.display.setCurrent(var6, var0);
                        } else {
                            var8.a(new StringBuffer(var3x));
                            c_a5.dI.display.setCurrent(c_a5.e8);
                        }
                    } else {
                        var6 = new Alert(c_bm.a2[9], "内容不能为空，请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var6, var0);
                    }
                }
            }
        });
        c_a5.dI.display.setCurrent(var0);
    }

    public static final void method_case() {
        final Form var0 = new Form("请输入汇款金额");
        final TextField var1 = new TextField("请输入数字", "", 8, 0);
        var0.append(var1);
        final Command var2 = new Command(c_bm.a2[2], 4, 0);
        final Command var3 = new Command(c_bm.a2[1], 3, 1);
        var0.addCommand(var2);
        var0.addCommand(var3);
        var0.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                a9 var9 = (a9)c_a5.es.cf().elementAt(13);
                String var3x = var1.getString();
                if (var1x != var2) {
                    if (var1x == var3) {
                        var0.removeCommand(var2);
                        var0.removeCommand(var3);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                } else {
                    while(var3x.startsWith("0")) {
                        var3x = var3x.substring(1);
                    }

                    if (!var3x.equals("") && var3x != null) {
                        int var5 = 0;

                        for(int var6 = var3x.length(); var5 < var6; ++var5) {
                            char var7;
                            if ((var7 = var3x.charAt(var5)) < '0' || var7 > '9') {
                                Alert var8 = new Alert(c_bm.a2[9], "您输入的内容不符合要求，请您重新输入！", (Image)null, AlertType.ERROR);
                                c_a5.dI.display.setCurrent(var8, var0);
                                return;
                            }
                        }

                        long var10;
                        if ((var10 = Long.parseLong(var3x)) <= 0L) {
                            var9.a(new StringBuffer(Integer.toString(0)));
                        } else {
                            if (var10 + (long)c_q.e >= (long)c_q.field_void && (c_a5.es.g9 == 1703937 || c_a5.es.g9 == 1703952)) {
                                if ((var10 = (long)(c_q.field_void - c_q.e)) > 0L) {
                                    var9.a(new StringBuffer(Long.toString(var10)));
                                } else {
                                    var9.a(new StringBuffer(Long.toString(0L)));
                                }
                            } else {
                                var9.a(new StringBuffer(var3x));
                            }

                            c_q.q = true;
                            c_q.method_if();
                            c_a5.dI.display.setCurrent(c_a5.e8);
                        }
                    } else {
                        var9.a(new StringBuffer(Integer.toString(0)));
                        c_q.q = false;
                        c_q.method_if();
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }
                }
            }
        });
        c_a5.dI.display.setCurrent(var0);
    }

    public static final void method_try(int var0) {
        o = var0;
        final Form var4 = new Form("请输入代币金额");
        final TextField var1 = new TextField("请输入数字", "", 2, 0);
        var4.append(var1);
        final Command var2 = new Command(c_bm.a2[2], 4, 0);
        final Command var3 = new Command(c_bm.a2[1], 3, 1);
        var4.addCommand(var2);
        var4.addCommand(var3);
        var4.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2x) {
                a9 var9;
                String var3x = (var9 = (a9)c_a5.es.cf().elementAt(24 + c_b5.o)).cc().toString();
                String var4x = var1.getString();
                if (var1x != var2) {
                    if (var1x == var3) {
                        var4.removeCommand(var2);
                        var4.removeCommand(var3);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                } else {
                    while(var4x.startsWith("0") && var4x.length() > 1) {
                        var4x = var4x.substring(1);
                    }

                    Alert var7;
                    if (!var4x.equals("") && var4x != null) {
                        int var8 = 0;

                        int var5;
                        for(var5 = var4x.length(); var8 < var5; ++var8) {
                            char var6;
                            if ((var6 = var4x.charAt(var8)) < '0' || var6 > '9') {
                                var7 = new Alert(c_bm.a2[9], "您输入的内容不符合要求，请您重新输入！", (Image)null, AlertType.ERROR);
                                c_a5.dI.display.setCurrent(var7, var4);
                                return;
                            }
                        }

                        ah var10;
                        if ((var5 = Integer.parseInt((var10 = (ah)c_a5.es.cf().elementAt(37)).aj()) + Integer.parseInt(var3x) - Integer.parseInt(var4x)) < 0) {
                            var9.a(new StringBuffer("0"));
                            c_as.a((byte)0, "您的代币不足", "确定", "", -1, -2);
                        } else {
                            var10.a("" + var5);
                            var9.a(new StringBuffer(var4x));
                        }

                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        var7 = new Alert(c_bm.a2[9], "内容不能为空，请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var7, var4);
                    }
                }
            }
        });
        c_a5.dI.display.setCurrent(var4);
    }

    public static final void method_if(int var0, int var1) {
        final Form var5 = new Form("请输入账号及其密码");
        final TextField var6 = new TextField("请输入账号", "", 16, 0);
        final TextField var2 = new TextField("请输入密码", "", 16, 0);
        var5.append(var6);
        var5.append(var2);
        a9 var3 = (a9)c_a5.es.cf().elementAt(4);
        a9 var4 = (a9)c_a5.es.cf().elementAt(6);
        if (var3 != null && !var3.equals("")) {
            var6.setString(var3.cc().toString().trim());
        }

        if (var4 != null && !var4.equals("")) {
            var2.setString(var4.cc().toString().trim());
        }

        final Command var7 = new Command(c_bm.a2[2], 4, 0);
        final Command var8 = new Command(c_bm.a2[1], 3, 1);
        var5.addCommand(var7);
        var5.addCommand(var8);
        var5.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1, Displayable var2x) {
                a9 var6x = (a9)c_a5.es.cf().elementAt(4);
                a9 var3 = (a9)c_a5.es.cf().elementAt(6);
                c_ao var4 = (c_ao)c_a5.es.cf().elementAt(1);
                if (var1 == var7) {
                    if (!var6.getString().equals("") && var6.getString() != null && !var2.getString().equals("") && var2.getString() != null) {
                        var6x.a(new StringBuffer(var6.getString()));
                        var3.a(new StringBuffer(var2.getString()));
                        var4.a("确定", 0);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        Alert var5x = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var5x, var5);
                    }
                } else {
                    if (var1 == var8) {
                        var5.removeCommand(var7);
                        var5.removeCommand(var8);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var5);
    }

    public static final void a(final int var0, final int var1, String var2, String var3, String var4) {
        final Form var7 = new Form(var2);
        final TextField var8 = new TextField(var3, "", 17, 0);
        final TextField var9 = new TextField(var4, "", 18, 0);
        var7.append(var8);
        var7.append(var9);
        a9 var5 = (a9)c_a5.es.cf().elementAt(var0);
        a9 var6 = (a9)c_a5.es.cf().elementAt(var1);
        if (var5 != null) {
            var8.setString(var5.cc().toString().trim());
        }

        if (var6 != null) {
            var9.setString(var6.cc().toString().trim());
        }

        final Command var10 = new Command(c_bm.a2[2], 4, 0);
        final Command var11 = new Command(c_bm.a2[1], 3, 1);
        var7.addCommand(var10);
        var7.addCommand(var11);
        var7.setCommandListener(new CommandListener() {
            public final void commandAction(Command var1x, Displayable var2) {
                a9 var5 = (a9)c_a5.es.cf().elementAt(var0);
                a9 var3 = (a9)c_a5.es.cf().elementAt(var1);
                if (var1x == var10) {
                    if (!var8.getString().equals("") && var8.getString() != null && !var9.getString().equals("") && var9.getString() != null) {
                        var5.a(new StringBuffer(var8.getString()));
                        var3.a(new StringBuffer(var9.getString()));
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    } else {
                        Alert var4 = new Alert(c_bm.a2[9], "请您输入内容！", (Image)null, AlertType.ERROR);
                        c_a5.dI.display.setCurrent(var4, var7);
                    }
                } else {
                    if (var1x == var11) {
                        var7.removeCommand(var10);
                        var7.removeCommand(var11);
                        c_a5.e8.setFullScreenMode(true);
                        c_a5.dI.display.setCurrent(c_a5.e8);
                    }

                }
            }
        });
        c_a5.dI.display.setCurrent(var7);
    }

    public static int method_int(int var0, int var1) {
        var0 = 1;

        for(int var2 = 0; var2 < var1; ++var2) {
            var0 <<= 1;
        }

        return var0;
    }

    public static void method_int() {
        for(int var0 = 0; var0 < Q.size(); ++var0) {
            ((a7)Q.elementAt(var0)).h(false);
        }

    }

    public static String method_for(String var0) {
        for(int var1 = 0; var1 < var0.length(); ++var1) {
            char var2;
            if ((var2 = var0.charAt(var1)) >= 'A' && var2 <= 'Z') {
                char var3 = (char)(var2 + 32);
                var0 = var0.replace(var2, var3);
            }
        }

        return var0;
    }

    public static int a(String[] var0) {
        if (var0 != null && var0.length != 0) {
            int var1 = var0[0].length();

            for(int var2 = 1; var2 < var0.length; ++var2) {
                if (var0[var2].length() > var1) {
                    var1 = var0[var2].length();
                }
            }

            return var1;
        } else {
            return 0;
        }
    }

    public static String a(String var0, String var1, String var2) {
        int var3;
        if ((var3 = var0.indexOf(var1)) != -1 && var2 != null) {
            int var5 = var0.indexOf(var1) + var1.length();
            StringBuffer var4;
            (var4 = new StringBuffer()).append(var0.substring(0, var3)).append(var2).append(var0.substring(var5, var0.length()));
            return var4.toString();
        } else {
            return var0;
        }
    }

    public static int method_if(String var0, char var1) {
        int var4 = 0;
        char[] var3 = var0.toCharArray();

        for(int var2 = 0; var2 < var3.length; ++var2) {
            if (var3[var2] == '$') {
                ++var4;
            }
        }

        return var4;
    }

    static {
        short[] var10000 = new short[]{19, 20, 21, 22, 23, 24};
        String[] var0 = new String[]{"新游戏", "继续游戏", "调出记录", "游戏设置", "帮助说明", "关于", c_bm.a2[4], "天津猛犸科技\nwww.mammothworld.com\n", "游戏简介", "使用规则", "操作方法", "客服信息", "......1The implementation indicates its support for traversal internal to a CustomItem by setting one or both of the TRAVERSE_HORIZONTAL or TRAVERSE_VERTICAL bits in the value returned by getInteractionModes(). If neither of these bits is set, the implementation is unwilling to let CustomItems traverse internally, or the implementation does not support traversal at all. If the implementation does support traversal but has declined to permit traversal internal to CustomItems, the implementation will supply its own highlighting outside the CustomItem's content area.游戏简介具体内容", "......2使用规则具体内容", "......3操作方法具体内容", "......4客服信息具体内容", c_bm.a2[1], "声音", "请稍候...", "简体中文", "英文", "法文", "德文", "意大利文", "西班牙文", "开", "关", "按5键更改", "语言", "返回主封面"};
        P = new Random();
        j = 100;
        m = new int[]{1479680, 1683200, 10289152, 15335424, 11499522, 11703296};
        field_int = 0;
        h = new int[]{16711680, 16711424, 65409, 31999, 8585471, 6045209};
        p = 0;
        d = 0;
        E = true;
        var10000 = new short[]{0, 16384, 8192, 180, 16474, 270, 90, 8282};
    }
}
