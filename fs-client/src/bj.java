import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class bj extends ba {
	boolean il = true;
	short ii = 0;

	public bj(short var1, short var2, c_be var3) {
		super(var1, var2, (short) 0, (short) 0, var3);
		this.ii = 50;
		if (this.il) {
			this.method_do((short) (this.ii * c_a5.ic / 176));
		} else {
			this.a((short) (this.ii * c_a5.il / 208));
		}
	}

	public final void a(Graphics var1) {
		if (this.il) {
			this.method_do(this.ii);
			this.a((short) 0);
		} else {
			this.method_do((short) 0);
			this.a(this.ii);
		}

		var1.setColor(c_bm.b4);
		if (this.il) {
			var1.drawLine(this.v(), this.method_long(), this.v() + this.method_for() - 1, this.method_long());
		} else {
			var1.drawLine(this.v(), this.method_long(), this.v(), this.method_long() + this.z() - 1);
		}
	}
}
