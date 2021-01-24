import java.io.IOException;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class bh {
	private static final int[] d = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4,
			5, 5, 5, 5, 0, 99, 99 };
	private static final int[] e = new int[] { 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59,
			67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0 };
	private static final int[] field_long = new int[] { 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9,
			9, 10, 10, 11, 11, 12, 12, 13, 13 };
	private static final int[] field_try = new int[] { 1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257,
			385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577 };
	private static final int[] field_new = new int[] { 16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1,
			15 };
	private static int field_else;
	private static int field_if;
	private static int a;

	public bh() {
	}

	public static byte[] a(byte[] var0) throws IOException {
		a = 0;
		field_if = 0;
		field_else = 0;
		if (method_if(var0, 16) == 35615 && method_if(var0, 8) == 8) {
			int var1 = method_if(var0, 8);
			field_else += 6;
			if ((var1 & 4) != 0) {
				field_else += method_if(var0, 16);
			}

			if ((var1 & 8) != 0) {
				while (var0[field_else++] != 0) {
				}
			}

			if ((var1 & 16) != 0) {
				while (var0[field_else++] != 0) {
				}
			}

			if ((var1 & 2) != 0) {
				field_else += 2;
			}

			var1 = field_else;
			field_else = var0.length - 4;
			byte[] var2 = new byte[method_if(var0, 16) | method_if(var0, 16) << 16];
			int var3 = 0;
			field_else = var1;
			boolean var11 = false;
			boolean var4 = false;

			label118: do {
				var1 = method_if(var0, 1);
				int var12;
				if ((var12 = method_if(var0, 2)) == 0) {
					a = 0;
					var12 = method_if(var0, 16);
					method_if(var0, 16);
					boolean var14 = false;
					System.arraycopy(var0, field_else, var2, var3, var12);
					field_else += var12;
					var3 += var12;
				} else {
					int[] var5;
					int var6;
					int var7;
					int var8;
					int var10;
					int[] var13;
					if (var12 == 2) {
						var6 = method_if(var0, 5) + 257;
						var7 = method_if(var0, 5) + 1;
						var8 = method_if(var0, 4) + 4;
						byte[] var9 = new byte[19];

						for (var10 = 0; var10 < var8; ++var10) {
							var9[field_new[var10]] = (byte) method_if(var0, 3);
						}

						int[] var20 = a(var9, 18);
						var13 = a(a(var0, var20, var6), var6 - 1);
						var5 = a(a(var0, var20, var7), var7 - 1);
					} else {
						byte[] var15 = new byte[288];

						for (var7 = 0; var7 < 144; ++var7) {
							var15[var7] = 8;
						}

						for (var7 = 144; var7 < 256; ++var7) {
							var15[var7] = 9;
						}

						for (var7 = 256; var7 < 280; ++var7) {
							var15[var7] = 7;
						}

						for (var7 = 280; var7 < 288; ++var7) {
							var15[var7] = 8;
						}

						var13 = a(var15, 287);
						byte[] var18 = new byte[32];

						for (var8 = 0; var8 < var18.length; ++var8) {
							var18[var8] = 5;
						}

						var5 = a(var18, 31);
					}

					boolean var16 = false;
					boolean var19 = false;

					while (true) {
						while (true) {
							if ((var6 = a(var0, var13)) == 256) {
								continue label118;
							}

							if (var6 > 256) {
								var6 -= 257;
								int var17 = e[var6];
								if ((var7 = d[var6]) > 0) {
									var17 += method_if(var0, var7);
								}

								var6 = a(var0, var5);
								var10 = field_try[var6];
								if ((var8 = field_long[var6]) > 0) {
									var10 += method_if(var0, var8);
								}

								for (var6 = var3 - var10; var10 < var17; var10 <<= 1) {
									System.arraycopy(var2, var6, var2, var3, var10);
									var3 += var10;
									var17 -= var10;
								}

								System.arraycopy(var2, var6, var2, var3, var17);
								var3 += var17;
							} else {
								var2[var3++] = (byte) var6;
							}
						}
					}
				}
			} while (var1 == 0);

			return var2;
		} else {
			throw new IOException("Invalid GZIP format");
		}
	}

	private static int method_if(byte[] var0, int var1) {
		int var2 = a == 0 ? (field_if = var0[field_else++] & 255) : field_if >> a;

		for (int var3 = 8 - a; var3 < var1; var3 += 8) {
			field_if = var0[field_else++] & 255;
			var2 |= field_if << var3;
		}

		a = a + var1 & 7;
		return var2 & (1 << var1) - 1;
	}

	private static int a(byte[] var0, int[] var1) {
		int var2;
		for (var2 = var1[0]; var2 >= 0; a = a + 1 & 7) {
			if (a == 0) {
				field_if = var0[field_else++] & 255;
			}

			var2 = (field_if & 1 << a) == 0 ? var1[var2 >> 16] : var1[var2 & '\uffff'];
		}

		return var2 & '\uffff';
	}

	private static byte[] a(byte[] var0, int[] var1, int var2) {
		byte[] var3 = new byte[var2];
		int var4 = 0;
		boolean var5 = false;

		int var8;
		for (int var6 = 0; var4 < var2; var6 = var8) {
			if ((var8 = a(var0, var1)) >= 16) {
				boolean var7 = false;
				int var9;
				if (var8 == 16) {
					var9 = 3 + method_if(var0, 2);
					var8 = var6;
				} else {
					if (var8 == 17) {
						var9 = 3 + method_if(var0, 3);
					} else {
						var9 = 11 + method_if(var0, 7);
					}

					var8 = 0;
				}

				while (var9-- > 0) {
					var3[var4++] = (byte) var8;
				}
			} else {
				var3[var4++] = (byte) var8;
			}
		}

		return var3;
	}

	private static int[] a(byte[] var0, int var1) {
		int[] var2 = new int[17];

		int var3;
		for (var3 = 0; var3 < var0.length; ++var3) {
			++var2[var0[var3]];
		}

		var3 = 0;
		var2[0] = 0;
		int[] var4 = new int[17];

		for (int var5 = 1; var5 <= 16; ++var5) {
			var4[var5] = var3 = var3 + var2[var5 - 1] << 1;
		}

		int[] var11 = new int[(var1 << 1) + 16];
		int var10 = 1;

		for (int var6 = 0; var6 <= var1; ++var6) {
			byte var7;
			if ((var7 = var0[var6]) != 0) {
				var3 = var4[var7]++;
				int var8 = 0;

				for (int var12 = var7 - 1; var12 >= 0; --var12) {
					int var9;
					if ((var3 & 1 << var12) == 0) {
						if ((var9 = var11[var8] >> 16) == 0) {
							var11[var8] |= var10 << 16;
							var8 = var10++;
						} else {
							var8 = var9;
						}
					} else if ((var9 = var11[var8] & '\uffff') == 0) {
						var11[var8] |= var10;
						var8 = var10++;
					} else {
						var8 = var9;
					}
				}

				var11[var8] = -2147483648 | var6;
			}
		}

		return var11;
	}
}
