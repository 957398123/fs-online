import javax.microedition.lcdui.Graphics;

/**
 * 2020/01/19
 * @author 95739
 *
 */
public final class a6 {
	public byte a;
	public short field_if;
	private byte field_for;
	private byte field_int;
	private boolean field_do;
	public c_a4 field_byte;

	public a6(c_a4 var1, short var2, byte var3, byte var4) {
		field_byte = var1;
		field_if = var2;
		field_for = -1;
		field_int = var3;
		field_do = false;
		a = var4;
	}

	final boolean method_if() {
		if (field_for >= c_a5.g8[field_if].length) {
			field_for = 0;
			if (field_int > 1) {
				byte var2 = (byte) (field_int - 1);
				field_int = var2;
				field_do = false;
			} else if (field_int < 0) {
				field_do = false;
			} else if (field_int == 1) {
				byte var3 = 0;
				field_int = var3;
				field_do = true;
			}
		}

		return field_do;
	}

	public final void a(c_a4 var1, short var2, byte var3) {
		field_byte = var1;
		field_if = var2;
		field_for = -1;
		field_int = -1;
		field_do = false;
		c_b5.a(field_if);
	}

	public final void method_do() {
		if (bp.ag() != null) {
			bp.ag();
			if (bp.c(field_if) && (c_a5.V() != 0 || c_a5.gQ != null)) {
				return;
			}
		}

		++field_for;
	}

	public final void a(Graphics var1) {
		if (field_for < 0) {
			field_for = 0;
		}

		if (field_byte == null) {
			c_b5.a(c_a5.fM, var1, c_a5.eS[c_a5.g8[field_if][field_for]], c_a5.eJ, 0 - c_z.aE, 0 - c_z.aD, false);
		} else {
			c_b5.a(c_a5.fM, var1, c_a5.eS[c_a5.g8[field_if][field_for]], c_a5.eJ, field_byte.method_long(), field_byte.a() - 3,
					field_byte.g);
		}
	}
}
