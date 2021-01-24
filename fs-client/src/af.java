import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/21
 * @author 95739
 *
 */
public final class af extends ba {
	private short an = 0;
	private short ao = 0;
	private short aw = 0;
	private short au = 0;
	private short al = 0;
	private short ak = 0;
	private boolean at = false;
	private boolean am = false;
	private int aq = 0;
	private short ap = 0;
	private short as = 0;
	public short az = 0;
	public short ay = 0;
	private short ah = 0;
	public short aj = 0;

	public af(short var1, short var2, short var3, short var4, byte var5, boolean var6, c_be var7) {
		super(var1, var2, var3, var4, var7);
		super.k = var1;
		super.j = var2;
		super.a = var3;
		super.field_int = var4;
		this.aw = (short) (super.j + c_a5.ca.getHeight());
		this.au = (short) (this.method_char(this.at) - 1);
		this.al = (short) (super.k + c_a5.ca.getWidth());
		this.ak = (short) (this.method_else(this.am) - 1);
		this.a((byte) 0);
		if (this.method_char() == 0) {
			super.a = (short) c_a5.ca.getWidth();
			this.aa();
			this.a(this.aw, this.au + 1);
		} else {
			if (this.method_char() == 1) {
				super.field_int = (short) c_a5.ca.getHeight();
				this.ao = (short) (super.k + c_a5.ca.getWidth());
				this.a(this.al, this.ak + 1);
			}

		}
	}

	private int method_char(boolean var1) {
		return var1 ? super.j + super.field_int - 2 * c_a5.ca.getHeight()
				: super.j + super.field_int - c_a5.ca.getHeight();
	}

	private int method_else(boolean var1) {
		return var1 ? super.k + super.a - 2 * c_a5.ca.getWidth() : super.k + super.a - c_a5.ca.getHeight();
	}

	public final void a(Graphics var1) {
		if (this.method_char() == 0) {
			var1.drawImage(c_a5.ca, super.k, super.j, 20);
			c_b5.a(var1, c_a5.ca, super.k, this.method_char(this.at), 1);
			var1.setColor(c_bm.cE);
			var1.drawLine(super.k + 2, this.ap, super.k + 2, this.au);
			var1.setColor(c_bm.cB);
			var1.drawLine(super.k + 2 + 1, this.ap, super.k + 2 + 1, this.au);
			var1.setColor(c_bm.cz);
			var1.drawLine(super.k + 2 + 2, this.ap, super.k + 2 + 2, this.au);
			var1.setColor(c_bm.cE);
			var1.drawLine(super.k + 2 + 3, this.ap, super.k + 2 + 3, this.au);
			var1.drawImage(c_a5.hI, super.k, this.an, 20);
		} else {
			if (this.method_char() == 1) {
				c_b5.a(var1, c_a5.ca, super.k, super.j, 6);
				c_b5.a(var1, c_a5.ca, this.method_else(this.am), super.j, 5);
				var1.setColor(c_bm.cE);
				var1.drawLine(this.al, super.j + 2, this.ak, super.j + 2);
				var1.setColor(c_bm.cz);
				var1.drawLine(this.al, super.j + 2 + 1, this.ak, super.j + 2 + 1);
				var1.setColor(c_bm.cB);
				var1.drawLine(this.al, super.j + 2 + 2, this.ak, super.j + 2 + 2);
				var1.setColor(c_bm.cE);
				var1.drawLine(this.al, super.j + 2 + 3, this.ak, super.j + 2 + 3);
				c_b5.a(var1, c_a5.hI, this.ao, super.j, 6);
			}

		}
	}

	public final void aa() {
		this.au = (short) (this.method_char(this.at) - 1);
		this.an = (short) (super.j + c_a5.ca.getHeight());
		this.ap = this.an;
		this.as = (short) (super.j + super.field_int - c_a5.ca.getHeight() - W());
	}

	public final void a(short var1, boolean var2) {
		if (var2) {
			if (c_a5.method_try(20480)) {
				if (var1 < this.aj) {
					this.aj = var1;
				}
			} else if (c_a5.method_try(40960) && var1 >= this.aj + this.ay) {
				this.aj = (short) (var1 - this.ay + 1);
			}
		}

		this.ah = (short) (this.az - this.ay);
		if (this.ah > 0) {
			if (this.aj == this.az - 1) {
				this.an = this.as;
			} else {
				this.an = (short) (super.j + c_a5.ca.getHeight() + this.aj * (this.aq - W()) / this.ah);
			}
		} else {
			this.an = (short) (super.j + c_a5.ca.getHeight());
		}
	}

	private void a(int var1, int var2) {
		this.aq = Math.abs(var1 - var2);
		c_b5.method_case("轨道长度 = " + this.aq);
		if (this.method_char() == 0) {
			this.as = (short) (super.j + c_a5.ca.getHeight() + this.aq - W());
		} else {
			if (this.method_char() == 1) {
				c_a5.ca.getHeight();
				W();
			}

		}
	}

	private static int W() {
		return c_a5.hI != null ? c_a5.hI.getHeight() : 0;
	}

	public final void method_char(short var1) {
		this.aj = var1;
	}

	public final void a(short var1, short var2, short var3) {
		this.az = var1;
		this.ay = var2;
		this.aj = var3;
		this.ah = (short) (var1 - var2);
		if (this.ah > 0) {
			if (var3 == var1 - 1) {
				this.an = this.as;
			} else {
				this.an = (short) (super.j + c_a5.ca.getHeight() + var3 * (this.aq - W()) / this.ah);
			}
		} else {
			this.an = (short) (super.j + c_a5.ca.getHeight());
		}
	}

	public final boolean b() {
		if (c_a5.method_for(super.k, super.j, c_a5.hI.getWidth(), this.an - super.j)) {
			c_a5.a(4096);
			return true;
		} else if (c_a5.method_for(super.k, this.an + c_a5.hI.getHeight(), c_a5.hI.getWidth(),
				super.j + super.field_int - this.an - c_a5.hI.getHeight())) {
			c_a5.a(8192);
			return true;
		} else {
			return false;
		}
	}
}
