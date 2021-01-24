import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2020/01/19
 * @author 95739
 *
 */
public final class bi {
	public Image field_if;
	public short field_try = 0;
	public short a = 0;
	public byte field_int = 0;
	private byte field_for = 0;
	public byte field_new = 0;

	public bi(Image var1, int var2, int var3) {
		if (var2 != 0 && var3 != 0) {
			field_try = (short) var2;
			a = (short) var3;
			field_if = var1;
			field_int = (byte) (var1.getWidth() / field_try);
			field_for = (byte) (var1.getHeight() / a);
			field_new = (byte) (field_int * field_for);
		}
	}

	public bi(String var1, int var2, int var3) {
		if (var2 != 0 && var3 != 0) {
			field_try = (short) var2;
			a = (short) var3;
			if (!var1.equals("")) {
				field_if = c_b5.a(var1);
				var1.substring(1, var1.length());
			}

			field_int = (byte) (field_if.getWidth() / field_try);
			field_for = (byte) (field_if.getHeight() / a);
			field_new = (byte) (field_int * field_for);
		}
	}

	public final void method_if(Graphics var1, int var2, int var3, int var4) {
		bi var10000 = this;
		boolean var6 = false;
		bi var7 = var10000;
		if (var10000.field_if != null) {
			int var5 = var7.field_try * (var4 % var7.field_int);
			var4 = var7.a * (var4 / var7.field_int);
			c_b5.a(var1, var7.field_if, var5, var4, var7.field_try, var7.a, var2, var3, 0);
		}

	}

	public final void a(Graphics var1, int var2, int var3, int var4) {
		c_b5.a(var1, field_if, var2, var3, var4);
	}
}
