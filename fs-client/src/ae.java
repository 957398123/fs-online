import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/21
 * @author 95739
 *
 */
public final class ae extends ba {
	private Vector ad;
	private byte ab;
	private byte ae = 0;

	public ae(short var1, short var2, short var3, short var4, byte var5, c_be var6) {
		super(var1, var2, var3, (short) 0, var6);
		this.ae = var5;
		this.ad = new Vector();
		if (var1 <= 0) {
			super.k = 0;
		}

		super.a = var3;
		super.field_int = (short) (c_a5.iG + 8);
	}

	public final void a(Graphics var1) {
		if (c_a5.fE.size() > 0) {
			this.ab = ((c_be) c_a5.fE.elementAt(0)).ht;
		}

		int var2 = 0;
		if (this.ad.size() > this.ae) {
			var2 = this.ab < this.ae - 1 ? 0 : this.ab - this.ae + 1;
		}

		int var3 = 0;
		int var4 = this.ae * (c_b5.method_do((String) this.ad.elementAt(var2)) + 2 + 2) - 2 + 6;
		int var5 = c_a5.ic - var4 >> 1;
		var1.setColor(c_bm.H);
		var1.drawRect(var5, super.j, var4 - 4, super.field_int - 1);
		var1.setColor(c_bm.G);
		var1.drawRect(var5 + 1, super.j + 1, var4 - 3, super.field_int - 3);
		var4 = var5 + 2 + 1;
		int var6 = super.j + 4 - 2 + 1;
		int var7 = super.field_int - 6;

		for (int var8 = var2; var8 < var2 + this.ae; ++var8) {
			int var9 = ((String) this.ad.elementAt(var8)).length() * c_a5.iA + 2;
			if (var8 - var2 > 0) {
				var3 += c_b5.method_do((String) this.ad.elementAt(var8 - 1)) + 2;
			}

			if (var8 - var2 == (this.ab > this.ae - 1 ? this.ae - 1 : this.ab)) {
				var1.setColor(c_bm.E);
				var1.fillRect(var4 + var3 + (var8 - var2 << 1), var6, var9, var7);
				var1.setColor(c_bm.af);
				var1.drawRect(var4 + var3 + (var8 - var2 << 1) - 1, var6 - 1, var9 + 1, var7 + 1);
			} else {
				var1.setColor(c_bm.i);
				var1.fillRect(var4 + var3 + (var8 - var2 << 1), var6, var9, var7);
				var1.setColor(c_bm.bF);
				var1.drawRect(var4 + var3 + (var8 - var2 << 1) - 1, var6 - 1, var9 + 1, var7 + 1);
			}

			var1.setColor(c_bm.W);
			if ((this.ad.size() <= this.ae || var8 != var2 + this.ae - 1 || this.ab >= this.ae - 1)
					&& (this.ad.size() <= this.ae || var8 != var2 || this.ab < this.ae - 1)) {
				var1.drawString((String) this.ad.elementAt(var8 > var2 + this.ae - 1 ? var2 + this.ae - 1 : var8),
						var4 + 1 + var3 + (var8 - var2 << 1), var6, 20);
			} else {
				var1.drawString("……", var4 + 1 + var3 + (var8 - var2 << 1), var6, 20);
			}
		}

		short var10 = (short) (super.j + (super.field_int - c_a5.ec.getHeight()) / 2);
		var5 -= c_a5.ec.getWidth();
		byte var11 = 0;
		if (c_a5.ht % 4 > 2) {
			var11 = 2;
		}

		var1.drawImage(c_a5.ec, var5 - var11, var10, 20);
		c_b5.a(var1, c_a5.ec, c_a5.ic - var5 - c_a5.ec.getWidth() + var11, var10, 2);
		var1.drawImage(c_a5.iJ, var5 + 3 - var11, var10 + 2, 20);
		var1.drawImage(c_a5.gU, c_a5.ic - var5 - 3 - c_a5.gU.getWidth() + var11, var10 + 2, 20);
	}

	public final void a(Vector var1) {
		this.ad = var1;
	}

	public final void f() {
	}

	public final void U() {
		if (c_a5.gZ && c_a5.method_byte(268435456)) {
			int var2 = this.ae * (c_b5.method_do((String) this.ad.elementAt(0)) + 2 + 2) - 2 + 6;
			var2 = c_a5.ic - var2 >> 1;
			short var1 = (short) (super.j + (super.field_int - c_a5.ec.getHeight()) / 2);
			if (c_a5.a(var2 -= c_a5.ec.getWidth(), var1, c_a5.ec.getWidth(), c_a5.ec.getHeight())) {
				c_a5.a(1024);
			} else if (c_a5.a(c_a5.ic - var2 - c_a5.ec.getWidth(), var1, c_a5.ec.getWidth(), c_a5.ec.getHeight())) {
				c_a5.a(2048);
			}
		}

		boolean var3 = true;
		if (c_a5.method_byte(1024)) {
			this.ab = ((c_be) c_a5.fE.elementAt(0)).ht;
			--this.ab;
			if (this.ab < 0) {
				this.ab = 0;
				var3 = false;
			}

			((c_be) c_a5.fE.elementAt(0)).ht = this.ab;
			if (var3) {
				c_a5.es.cs();
			}

			(c_a5.es = (c_be)c_a5.fE.elementAt(this.ab)).ck();
		} else {
			if (c_a5.method_byte(2048)) {
				this.ab = ((c_be) c_a5.fE.elementAt(0)).ht;
				++this.ab;
				if (this.ab > c_a5.fE.size() - 1) {
					this.ab = (byte) (c_a5.fE.size() - 1);
					var3 = false;
				}

				((c_be) c_a5.fE.elementAt(0)).ht = this.ab;
				if (var3) {
					c_a5.es.cs();
				}

				(c_a5.es = (c_be) c_a5.fE.elementAt(this.ab)).ck();
			}

		}
	}
}
