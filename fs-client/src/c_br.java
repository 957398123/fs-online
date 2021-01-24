import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/23
 * @author 95739
 *
 */
public final class c_br extends ba {
	private Vector iY;
	private Vector iO;
	private Vector iU;
	private byte iQ;
	public byte iV;
	private boolean iR;
	public static c_br iZ = null;
	public static c_br iW = null;

	public c_br(short var1, short var2, short var3, short var4, byte var5) {
		super((short) 0, (short) 0, (short) 0, (short) 0, (c_be) null);
		this.iQ = 0;
		this.iV = -1;
		this.iR = true;
		this.iV = var5;
		this.iY = new Vector();
		this.iO = new Vector();
		this.iU = new Vector();
		this.dg();
	}

	public c_br(byte var1) {
		this((short) 0, (short) 0, (short) 0, (short) 0, var1);
	}

	private void dg() {
		super.k = this.dn();
		super.j = this.c7();
		super.a = this.dl();
		super.field_int = this.dd();
	}

	public final void a(Graphics var1) {
		var1.setColor(7755053);
		var1.fillRect(super.k, super.j, super.a, super.field_int);
		var1.setColor(11241821);
		var1.fillRect(super.k + 1, super.j + 1, super.a - 2, super.field_int - 2);
		var1.setColor(15255701);
		var1.fillRect(super.k + 2, super.j + 2, super.a - 4, super.field_int - 4);
		var1.setColor(11241821);
		var1.fillRect(super.k + 3, super.j + 3, super.a - 6, super.field_int - 6);
		var1.setColor(12952181);
		var1.fillRect(super.k + 4, super.j + 4, super.a - 8, super.field_int - 8);
		var1.setColor(15255701);
		var1.fillRect(super.k + 5, super.j + 5, super.a - 10, super.field_int - 10);
		var1.setColor(c_bm.field_try);
		var1.fillRect(super.k + 6, super.j + 6, super.a - 12, super.field_int - 12);
		boolean var2 = false;

		for (int var3 = 0; var3 < this.iY.size(); ++var3) {
			int var8;
			if (var3 == this.iQ) {
				var8 = c_bm.field_try;
				int var4 = super.k + (super.a - c_b5.method_do((String) this.iY.elementAt(this.dh()))) / 2 - 4;
				int var5 = super.j + 3 + 2 + 5 + var3 * (c_a5.iG + 2) - 1;
				int var6 = c_b5.method_do((String) this.iY.elementAt(this.dh())) + 8;
				int var7 = c_a5.iG + 2;
				var1.setColor(c_bm.bo);
				var1.fillRect(var4, var5, var6, var7);
			} else {
				var8 = c_bm.bP;
			}

			byte var9 = 0;
			if (this.iV == 3) {
				byte var10 = -1;
				switch (bf.field_new[var3]) {
				case 1:
					var10 = 5;
					break;
				case 2:
					var10 = 6;
					break;
				case 3:
					var10 = 3;
					break;
				case 4:
					var10 = 4;
					break;
				case 5:
					var10 = 0;
					break;
				case 6:
					var10 = 1;
					break;
				case 7:
					var10 = 2;
					break;
				case 8:
					var10 = 6;
				}

				c_a5.eq.method_if(var1, super.k + 10, super.j + 3 + 2 + 5 + var3 * (c_a5.iG + 2), var10);
				var9 = 10;
			}

			if (this.iR) {
				c_b5.method_do(var1, (String) this.iY.elementAt(var3), super.a, super.k,
						super.j + 3 + 2 + 5 + var3 * (c_a5.iG + 2), var8);
			} else {
				var1.setColor(var8);
				var1.drawString((String) this.iY.elementAt(var3), super.k + 10 + var9,
						super.j + 3 + 2 + 5 + var3 * (c_a5.iG + 2), 20);
			}
		}

	}

	public final Vector dj() {
		return this.iY;
	}

	public final byte de() {
		return this.iQ;
	}

	public final void c9() {
		++this.iQ;
		if (this.iQ > this.iY.size() - 1) {
			this.iQ = 0;
		}

	}

	public final void c8() {
		--this.iQ;
		if (this.iQ < 0) {
			this.iQ = (byte) (this.iY.size() - 1);
		}

	}

	public final boolean df() {
		if (c_a5.gZ && c_a5.method_byte(268435456)) {
			int var1 = this.iY.size();

			for (byte var2 = 0; var2 < var1; ++var2) {
				int var3 = super.k + (super.a - c_b5.method_do((String) this.iY.elementAt(this.dh()))) / 2 - 4;
				int var4 = super.j + 3 + 2 + 5 + var2 * (c_a5.iG + 2) - 1;
				int var5 = c_b5.method_do((String) this.iY.elementAt(this.dh())) + 8;
				int var6 = c_a5.iG + 2;
				if (c_a5.a(var3, var4, var5, var6)) {
					this.iQ = var2;
					return true;
				}
			}

			if (this == iZ || this == iW) {
				short var7 = this.dn();
				short var8 = this.c7();
				short var9 = this.dl();
				short var10 = this.dd();
				if (!c_a5.a(var7, var8, var9, var10) && c_a5.a(0, 0, c_a5.ic, c_a5.il)) {
					c_a5.a(262144);
					return false;
				}
			}
		}

		return false;
	}

	private short dn() {
		short var1 = 0;
		if (this.iV == 0) {
			var1 = 0;
		} else if (this.iV == 1 || this.iV == 2 || this.iV == 3) {
			var1 = (short) ((c_a5.ic - this.dl()) / 2);
		}

		return var1;
	}

	private short c7() {
		short var1 = 0;
		if (this.iV == 0) {
			var1 = (short) (c_a5.il - this.dd() - 18);
		} else if (this.iV == 1 || this.iV == 2 || this.iV == 3) {
			var1 = (short) ((c_a5.il - this.dd()) / 2);
		}

		return var1;
	}

	private short dd() {
		int var1 = c_a5.iG;
		return (short) (this.iY.size() * var1 + (this.iY.size() - 1 << 1) + 20);
	}

	private short dl() {
		return this.iY.size() == 0 ? 0 : (short) (c_b5.method_do((String) this.iY.elementAt(this.dh())) + 26);
	}

	private int dh() {
		if (this.iY.size() == 0) {
			return 0;
		} else {
			int var1 = 0;
			int var2 = ((String) this.iY.elementAt(0)).length();

			for (int var3 = 1; var3 < this.iY.size(); ++var3) {
				if (((String) this.iY.elementAt(var3)).length() > var2) {
					var2 = ((String) this.iY.elementAt(var3)).length();
					var1 = var3;
				}
			}

			return var1;
		}
	}

	public static int method_new(String[] var0) {
		int var1 = 0;

		for (int var2 = 0; var2 < var0.length; ++var2) {
			if (var0[var2].length() > var1) {
				var1 = var0[var2].length();
			}
		}

		return var1;
	}

	public final Vector db() {
		return this.iO;
	}

	public final void a(String var1, int var2, int var3) {
		if (var1 != null && !var1.equals("")) {
			this.iY.addElement(var1);
			this.iO.addElement(new Integer(var2));
			this.iU.addElement(new Integer(var3));
			this.dg();
		}

	}

	public final void a(String[] var1, int[] var2, int[] var3) {
		if (var1 != null && var2 != null && var1.length == var2.length) {
			for (int var4 = 0; var4 < var1.length; ++var4) {
				this.a(var1[var4], var2[var4], var3[var4]);
			}

		}
	}

	public final void a(String[] var1, int[] var2) {
		if (var1 != null && var2 != null && var1.length == var2.length) {
			for (int var3 = 0; var3 < var1.length; ++var3) {
				this.a(var1[var3], var2[var3], 3);
			}

		}
	}

	public final void dc() {
		switch ((Integer) ((Integer) this.iU.elementAt(this.iQ))) {
		case 0:
			c_ad.method_new();
			c_a5.d6.removeAllElements();
			c_a5.d6.addElement(new Integer(0));
			c_a5.fE.removeAllElements();
			return;
		case 1:
			switch (c_a5.es.g9) {
			case 131079:
				if (!c_ao.ct) {
					c_ad.method_new();
					dm();
					return;
				}

				return;
			default:
				c_ad.method_new();
				dm();
				return;
			}
		case 2:
			c_ad.method_new();
			c6();
			return;
		case 3:
			return;
		case 4:
			c_ad.method_new();
			return;
		case 5:
			c_ad.method_new();
			if (c_a5.d6.size() == 0) {
				c_a5.d6.addElement(new Integer(c_a5.es.g9));
				return;
			}

			c_a5.d6.removeElementAt(0);
			return;
		case 6:
			dk();
		}

	}

	public static void c6() {
		if (c_a5.fE.size() <= 0) {
			if (c_a5.es != null) {
				c_a5.d6.addElement(c_a5.es);
			}

		} else {
			Vector var0 = new Vector();

			for (int var1 = 0; var1 < c_a5.fE.size(); ++var1) {
				var0.addElement(c_a5.fE.elementAt(var1));
			}

			c_a5.d6.addElement(var0);
			c_a5.fE.removeAllElements();
		}
	}

	public static void dm() {
		if (c_a5.fE.size() <= 0) {
			if (c_a5.es != null) {
				c_a5.d6.addElement(new Integer(c_a5.es.g9));
			}

		} else {
			Vector var0 = new Vector();

			for (int var1 = 0; var1 < c_a5.fE.size(); ++var1) {
				var0.addElement(new Integer(((c_be) c_a5.fE.elementAt(var1)).g9));
			}

			c_a5.d6.addElement(var0);
			c_a5.fE.removeAllElements();
		}
	}

	public static void dk() {
		if (c_a5.d6.size() > 0) {
			c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
		}

	}

	public final void da() {
		this.iQ = 0;
	}

	public final void m(boolean var1) {
		this.iR = false;
	}
}
