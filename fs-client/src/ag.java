import javax.microedition.lcdui.Graphics;

/**
 * 2020/01/20
 * 
 * @author 95739
 *
 */
public final class ag extends c_a4 {
	public byte r = 0;
	private byte s = 0;

	public ag(byte var1) {
		super.field_try = var1;
		super.h = 0;
	}

	public final void method_int(byte var1) {
		r = var1;
	}

	public final void a(Graphics var1) {
		a(var1, super.o, super.n);
		if (c_z.field_case) {
			method_if(var1, super.o, super.n);
		}

		if (super.field_try == 11) {
			method_if(var1, super.o, super.n);
		}

	}

	public final void a(Graphics var1, short var2, short var3) {
		c_a5.ch.method_if(var1, var2 - (c_a5.ch.field_try >> 1), var3 - (c_a5.ch.a >> 1), r);
	}

	public final void method_if(Graphics var1) {
		c_b5.method_if(var1, method_byte(), super.o - (var1.getFont().stringWidth(method_byte()) >> 1),
				super.n - (!c_z.field_case && super.field_try != 11 ? c_a5.ch.a >> 1 : (c_a5.hk.a >> 1) + 15) - c_a5.iG,
				65280, 0);
	}

	private void method_if(Graphics var1, short var2, short var3) {
		if (r == 5) {
			c_a5.hk.method_if(var1, var2 - (c_a5.hk.field_try >> 1) + 2, var3 - (c_a5.hk.a >> 1) - 18, s);
		} else if (r == 6) {
			c_a5.dE.method_if(var1, var2 - (c_a5.dE.field_try >> 1) + 2, var3 - (c_a5.dE.a >> 1) - 18, s);
		} else {
			if (r == 7) {
				c_a5.eh.method_if(var1, var2 - (c_a5.eh.field_try >> 1) + 2, var3 - (c_a5.eh.a >> 1) - 18, s);
			}

		}
	}

	public final void method_case() {
		super.o = (short) (super.c - c_z.aE);
		super.n = (short) (super.field_void - c_z.aD + 3);
		if (c_z.field_case) {
			++s;
			if (s > 3) {
				s = 0;
			}
		}

	}
}
