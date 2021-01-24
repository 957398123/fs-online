/**
 * 2021/01/22
 * @author 95739
 *
 */
final class b0 {
	private int field_goto;
	private int field_int;
	private int field_for;
	private int a;
	private int[][] field_do;
	private int[][] field_new;
	private int[][] field_long;

	public b0() {
	}

	public final int[][] a(int var1, int var2, int var3, int var4) {
		this.field_goto = var1;
		this.field_int = var2;
		this.field_for = var3;
		this.a = var4;
		b0 var11;
		(var11 = this).field_long = new int[0][];
		var11.field_do = new int[2][];
		var1 = var11.method_if(var11.field_goto, var11.field_int);
		var11.field_do[0] = new int[0];
		var11.field_do[1] = new int[] { var11.field_goto, var11.field_int, 0, var1, 0, var1 };
		var11.field_new = new int[0][];

		while (var11.field_do.length > 0) {
			var11.field_new = a(var11.field_new, var11.field_new.length, 1);
			var11.field_new[var11.field_new.length - 1] = var11.field_do[1];
			b0 var13;
			var3 = (var13 = var11).field_do.length - 1;
			var13.field_do[1] = var13.field_do[var3];
			var13.field_do = a(var13.field_do, var3, -1);
			var3 = var13.field_do.length - 1;

			int var7;
			for (var4 = 1; (var4 << 1) + 1 <= var3; var4 = var7) {
				int var5;
				int var6 = (var5 = var4 << 1) + 1;
				var7 = var13.field_do[var5][5] < var13.field_do[var6][5] ? var5 : var6;
				if (var13.field_do[var4][5] <= var13.field_do[var7][5]) {
					break;
				}

				int[] var8 = var13.field_do[var4];
				var13.field_do[var4] = var13.field_do[var7];
				var13.field_do[var7] = var8;
			}

			var1 = var11.field_new.length - 1;
			if (var11.field_new[var1][0] == var11.field_for && var11.field_new[var1][1] == var11.a) {
				b0 var12 = var11;
				var11.field_long = a(var11.field_long, 0, 1);

				for (var11.field_long[var11.field_long.length - 1] = var11.field_new[var11.field_new.length
						- 1]; var12.field_long[0][2] != 0; var12.field_long[0] = var12.field_new[var12.field_long[1][4]]) {
					var12.field_long = a(var12.field_long, 0, 1);
				}

				var12.field_goto = var12.field_for;
				var12.field_int = var12.a;
				break;
			}

			var3 = var11.field_new[var1][0];
			var4 = var11.field_new[var1][1];
			boolean var14 = false;
			boolean var15 = false;
			boolean var16 = false;
			boolean var17 = false;
			boolean var9 = false;
			boolean var10 = false;
			int var19;
			if ((var19 = var4 - 1) >= 0 && method_do(var3, var19)) {
				var14 = true;
				if (var11.method_if(var3, var19, var1) && var11.a(var3, var19)) {
					var11.a(var3, var19, var1);
				}
			}

			if ((var19 = var4 + 1) < c_z.U && method_do(var3, var19)) {
				var15 = true;
				if (var11.method_if(var3, var19, var1) && var11.a(var3, var19)) {
					var11.a(var3, var19, var1);
				}
			}

			int var18 = var3 - 1;
			if (var18 >= 0 && method_do(var18, var4)) {
				var16 = true;
				if (var11.method_if(var18, var4, var1) && var11.a(var18, var4)) {
					var11.a(var18, var4, var1);
				}
			}

			var18 = var3 + 1;
			if (var18 < c_z.field_try && method_do(var18, var4)) {
				var17 = true;
				if (var11.method_if(var18, var4, var1) && var11.a(var18, var4)) {
					var11.a(var18, var4, var1);
				}
			}

			var18 = var3 - 1;
			var19 = var4 - 1;
			if (var14 && var16 && method_do(var18, var19) && var11.method_if(var18, var19, var1)
					&& var11.a(var18, var19)) {
				var11.a(var18, var19, var1);
			}

			var18 = var3 + 1;
			var19 = var4 - 1;
			if (var14 && var17 && method_do(var18, var19) && var11.method_if(var18, var19, var1)
					&& var11.a(var18, var19)) {
				var11.a(var18, var19, var1);
			}

			var18 = var3 + 1;
			var19 = var4 + 1;
			if (var15 && var17 && method_do(var18, var19) && var11.method_if(var18, var19, var1)
					&& var11.a(var18, var19)) {
				var11.a(var18, var19, var1);
			}

			var18 = var3 - 1;
			var19 = var4 + 1;
			if (var15 && var16 && method_do(var18, var19) && var11.method_if(var18, var19, var1)
					&& var11.a(var18, var19)) {
				var11.a(var18, var19, var1);
			}
		}

		var11.field_do = null;
		var11.field_new = null;
		return var11.field_long;
	}

	private final boolean method_if(int var1, int var2, int var3) {
		for (int var4 = this.field_do.length - 1; var4 > 0; --var4) {
			if (this.field_do[var4][0] == var1 && this.field_do[var4][1] == var2) {
				if ((var1 = this.method_do(var1, var2, var3)) < this.field_do[var4][2]) {
					this.field_do[var4][2] = var1;
					this.field_do[var4][4] = var3;
					this.field_do[var4][5] = this.field_do[var4][2] + this.field_do[var4][3];
					this.method_if(var4);
				}

				return false;
			}
		}

		return true;
	}

	private final boolean a(int var1, int var2) {
		for (int var3 = this.field_new.length - 1; var3 >= 0; --var3) {
			if (this.field_new[var3][0] == var1 && this.field_new[var3][1] == var2) {
				return false;
			}
		}

		return true;
	}

	private static boolean method_do(int var0, int var1) {
		return c_z.a().method_int(var0, var1);
	}

	private final void a(int var1, int var2, int var3) {
		this.field_do = a(this.field_do, this.field_do.length, 1);
		int var4 = this.method_do(var1, var2, var3);
		int var5 = this.method_if(var1, var2);
		this.field_do[this.field_do.length - 1] = new int[] { var1, var2, var4, var5, var3, var4 + var5 };
		this.method_if(this.field_do.length - 1);
	}

	private final void method_if(int var1) {
		int var2;
		for (var1 = var1; var1 > 1; var1 = var2) {
			var2 = var1 >> 1;
			if (this.field_do[var1][5] >= this.field_do[var2][5]) {
				break;
			}

			int[] var3 = this.field_do[var1];
			this.field_do[var1] = this.field_do[var2];
			this.field_do[var2] = var3;
		}

	}

	private final int method_do(int var1, int var2, int var3) {
		int var4 = this.field_new[var3][0];
		int var5 = this.field_new[var3][1];
		int var6 = this.field_new[var3][2];
		return var4 - var1 != 0 && var5 - var2 != 0 ? var6 + 14 : var6 + 10;
	}

	private final int method_if(int var1, int var2) {
		return Math.abs(this.field_for - var1) * 10 + Math.abs(this.a - var2) * 10;
	}

	public static final int[][] a(int[][] var0, int var1, int var2) {
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
}
