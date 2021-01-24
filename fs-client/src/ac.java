/**
 * 2020/01/19
 * 
 * @author 95739
 *
 */
public final class ac {
	private int field_try;
	byte[] field_do;

	public ac() {
		this(16);
	}

	private ac(int var1) {
		field_try = 0;
		field_do = new byte[16];
		field_try = 0;
	}

	public ac(byte[] var1) {
		field_try = 0;
		field_do = var1;
		field_try = 0;
	}

	public final void a(boolean var1) {
		method_if(1);
		field_do[field_try++] = (byte) (var1 ? 1 : 0);
	}

	public final void a(byte var1) {
		method_if(1);
		field_do[field_try++] = var1;
	}

	public final void a(short var1) {
		method_if(2);
		field_do[field_try + 1] = (byte) var1;
		field_do[field_try] = (byte) (var1 >>> 8);
		field_try += 2;
	}

	public final void method_do(int var1) {
		method_if(4);
		field_do[field_try + 3] = (byte) var1;
		field_do[field_try + 2] = (byte) (var1 >>> 8);
		field_do[field_try + 1] = (byte) (var1 >>> 16);
		field_do[field_try] = (byte) (var1 >> 24);
		field_try += 4;
	}

	public final void a(long var1) {
		method_if(8);
		field_do[field_try + 7] = (byte) ((int) var1);
		field_do[field_try + 6] = (byte) ((int) (var1 >>> 8));
		field_do[field_try + 5] = (byte) ((int) (var1 >>> 16));
		field_do[field_try + 4] = (byte) ((int) (var1 >>> 24));
		field_do[field_try + 3] = (byte) ((int) (var1 >>> 32));
		field_do[field_try + 2] = (byte) ((int) (var1 >>> 40));
		field_do[field_try + 1] = (byte) ((int) (var1 >>> 48));
		field_do[field_try] = (byte) ((int) (var1 >>> 56));
		field_try += 8;
	}

	public final void method_if(byte[] var1) {
		if (var1 != null) {
			method_if(var1.length);
			System.arraycopy(var1, 0, field_do, field_try, var1.length);
			field_try += var1.length;
		}
	}

	public final void method_if(String var1) {
		String var6 = var1;
		int var7 = var1.length();
		int var2 = 0;
		byte var4 = 0;

		char var3;
		for (int var5 = 0; var5 < var7; ++var5) {
			if ((var3 = var6.charAt(var5)) >= 1 && var3 <= 127) {
				++var2;
			} else if (var3 > 2047) {
				var2 += 3;
			} else {
				var2 += 2;
			}
		}

		byte[] var10;
		byte[] var10001 = var10 = new byte[var2 + 2];
		int var9 = var4 + 1;
		var10001[0] = (byte) (var2 >>> 8);
		++var9;
		var10[1] = (byte) var2;
		boolean var8 = false;

		for (var2 = 0; var2 < var7 && (var3 = var6.charAt(var2)) >= 1 && var3 <= 127; ++var2) {
			var10[var9++] = (byte) var3;
		}

		for (; var2 < var7; ++var2) {
			if ((var3 = var6.charAt(var2)) >= 1 && var3 <= 127) {
				var10[var9++] = (byte) var3;
			} else if (var3 > 2047) {
				var10[var9++] = (byte) (224 | var3 >> 12 & 15);
				var10[var9++] = (byte) (128 | var3 >> 6 & 63);
				var10[var9++] = (byte) (128 | var3 & 63);
			} else {
				var10[var9++] = (byte) (192 | var3 >> 6 & 31);
				var10[var9++] = (byte) (128 | var3 & 63);
			}
		}

		method_if(var10);
	}

	public final boolean method_case() {
		return field_do[field_try++] != 0;
	}

	public final byte method_if() {
		return field_do[field_try++];
	}

	public final short method_new() {
		short var1 = (short) ((field_do[field_try + 1] & 255) + ((field_do[field_try] & 255) << 8));
		field_try += 2;
		return var1;
	}

	public final int method_byte() {
		int r = (field_do[field_try + 3] & 255) + ((field_do[field_try + 2] & 255) << 8)
				+ ((field_do[field_try + 1] & 255) << 16) + ((field_do[field_try] & 255) << 24);
		field_try += 4;
		return r;
	}

	public final long method_char() {
		long var1 = ((long) field_do[field_try + 7] & 255L) + (((long) field_do[field_try + 6] & 255L) << 8)
				+ (((long) field_do[field_try + 5] & 255L) << 16) + (((long) field_do[field_try + 4] & 255L) << 24)
				+ (((long) field_do[field_try + 3] & 255L) << 32) + (((long) field_do[field_try + 2] & 255L) << 40)
				+ (((long) field_do[field_try + 1] & 255L) << 48) + (((long) field_do[field_try] & 255L) << 56);
		field_try += 8;
		return var1;
	}

	public final byte[] method_int(int var1) {
		if (var1 == -1 || field_try + var1 > field_do.length) {
			var1 = field_do.length - field_try;
		}

		byte[] var2 = new byte[var1];
		System.arraycopy(field_do, field_try, var2, 0, var1);
		field_try += var1;
		return var2;
	}

	public final String method_goto() {
		int var2 = method_else();
		int var1 = method_else();
		if ((var1 = (var2 | var1) < 0 ? -1 : (var2 << 8) + var1) == -1) {
			System.err.println("Error!! ByteArray: readUTF()");
			return "ERROR";
		} else {
			Object var9 = null;
			Object var3 = null;
			byte[] var10 = method_int(var1);
			if (var1 > var10.length) {
				return null;
			} else {
				char[] var11 = new char[var1];
				int var6 = 0;

				int var7;
				int var8;
				for (var7 = 0; var6 < var1 && (var8 = var10[var6] & 255) <= 127; var11[var7++] = (char) var8) {
					++var6;
				}

				while (var6 < var1) {
					byte var4;
					switch ((var8 = var10[var6] & 255) >> 4) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
						++var6;
						var11[var7++] = (char) var8;
					case 8:
					case 9:
					case 10:
					case 11:
					default:
						break;
					case 12:
					case 13:
						var6 += 2;
						var4 = var10[var6 - 1];
						var11[var7++] = (char) ((var8 & 31) << 6 | var4 & 63);
						break;
					case 14:
						var6 += 3;
						var4 = var10[var6 - 2];
						byte var5 = var10[var6 - 1];
						var11[var7++] = (char) ((var8 & 15) << 12 | (var4 & 63) << 6 | var5 & 63);
					}
				}

				return new String(var11, 0, var7);
			}
		}
	}

	private void method_if(int var1) {
		if (field_try + var1 >= field_do.length) {
			byte[] var2 = new byte[field_do.length + var1 * 2];
			System.arraycopy(field_do, 0, var2, 0, field_do.length);
			field_do = var2;
		}

	}

	private int method_else() {
		return field_do[field_try++] & 255;
	}

	public final byte[] method_long()

	{
		if (field_try >= field_do.length) {
			return field_do;
		} else {
			ac var10000 = this;
			int var1 = field_try;
			boolean var3 = false;
			ac var4 = var10000;
			if (var1 == -1 || var1 + 0 > var4.field_do.length) {
				var1 = var4.field_do.length;
			}

			byte[] var2 = new byte[var1];
			System.arraycopy(var4.field_do, 0, var2, 0, var1);
			return var2;
		}
	}

	public final int method_do() {
		return field_do.length;
	}
}
