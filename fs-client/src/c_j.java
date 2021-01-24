import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

/**
 * 2021/01/20
 * 
 * @author 95739
 *
 */
public final class c_j {
	public c_j() {
	}

	private static int a(int var0, int var1) {
		while (var1-- > 0) {
			var0 <<= 1;
		}

		return var0;
	}

	private static int a(int var0) {
		int var1 = 0;

		for (int var2 = var0 - 1; var2 != 0; var2 >>= 1) {
			++var1;
		}

		return var0 == 1 ? 1 : var1;
	}

	public static final Image method_if(byte[] var0) {
		Object var1 = null;
		int var15 = 0;
		int var2 = 0;
		int var3 = 0;
		int[] var4 = null;
		byte var5 = 0;
		byte[] var6 = null;
		DataInputStream var7 = null;
		ByteArrayInputStream var13 = new ByteArrayInputStream(var0);
		var7 = new DataInputStream(var13);

		int var9;
		try {
			var7.readInt();
			boolean var8 = false;
			var15 = var7.readInt();
			var2 = var7.readInt();
			var4 = new int[var3 = var7.readInt()];

			for (var9 = 0; var9 < var3; ++var9) {
				var4[var9] = var7.readInt();
			}

			var5 = var7.readByte();
			var6 = new byte[var7.readInt()];
			var7.read(var6, 0, var6.length);
			var7.close();
			var13.close();
		} catch (Exception var12) {
		}

		int var18;
		int[] var17 = new int[var18 = var15 * var2];
		var9 = a(var3);
		int var14 = a(1, var9) - 1;
		int var10 = 0;
		int var11 = 0;
		int var16;
		switch (var5) {
		case 1:
			for (var11 = 0; var11 < var18; ++var11) {
				var17[var11] = var4[var6[var11] & 255];
			}

			return Image.createRGBImage(var17, var15, var2, true);
		case 2:
			while (var11 < var18) {
				var17[var11++] = var4[var6[var10] & 1];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 1 & 1];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 2 & 1];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 3 & 1];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 4 & 1];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 5 & 1];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 6 & 1];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 7 & 1];
				++var10;
			}

			return Image.createRGBImage(var17, var15, var2, true);
		case 3:
			while (var11 < var18) {
				var17[var11++] = var4[var6[var10] & 3];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 2 & 3];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 4 & 3];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 6 & 3];
				++var10;
			}

			return Image.createRGBImage(var17, var15, var2, true);
		case 4:
			while (var11 < var18) {
				var17[var11++] = var4[var6[var10] & 7];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 3 & 7];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				int var10001 = var11++;
				int var10003 = var6[var10] >> 6 & 3;
				++var10;
				var17[var10001] = var4[var10003 | var6[var10] << 2 & 4];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 1 & 7];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 4 & 7];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var10001 = var11++;
				var10003 = var6[var10] >> 7 & 1;
				++var10;
				var17[var10001] = var4[var10003 | var6[var10] << 1 & 6];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 2 & 7];
				if (var11 >= var18) {
					return Image.createRGBImage(var17, var15, var2, true);
				}

				var17[var11++] = var4[var6[var10] >> 5 & 7];
				++var10;
			}

			return Image.createRGBImage(var17, var15, var2, true);
		case 5:
			for (; var11 < var18; ++var10) {
				var17[var11++] = var4[var6[var10] & 15];
				if (var11 < var18) {
					var17[var11++] = var4[var6[var10] >> 4 & 15];
				}
			}

			return Image.createRGBImage(var17, var15, var2, true);
		case 6:
			while (var11 < var18) {
				var16 = var6[var10++] & 255;
				var3 = var4[var16 & var14];

				for (var16 >>= var9; var16-- > -1; var17[var11++] = var3) {
				}
			}
			break;
		case 7:
			while (true) {
				while (var11 < var18) {
					boolean var19 = false;
					if ((var16 = var6[var10++] & 255) < var3) {
						var17[var11++] = var4[var16];
					} else {
						while (var16-- > -1) {
							var17[var11++] = var4[var6[var10] & 255];
						}

						++var10;
					}
				}

				return Image.createRGBImage(var17, var15, var2, true);
			}
		case 8:
			while (var11 < var18) {
				var16 = var6[var10++] & 255;

				for (var3 = var4[var6[var10++] & 255]; var16-- > -1; var17[var11++] = var3) {
				}
			}

			return Image.createRGBImage(var17, var15, var2, true);
		case 9:
			while (true) {
				while (var10 < var6.length) {
					var3 = (var16 = var6[var10++] & 255) >> 7;
					var16 &= 127;
					if (var3 == 0) {
						var3 = var4[var16 & var14];

						for (var16 >>= var9; var16-- > -1; var17[var11++] = var3) {
						}
					} else {
						while (var16-- > -1) {
							var17[var11++] = var4[var6[var10] & 255];
						}

						++var10;
					}
				}

				return Image.createRGBImage(var17, var15, var2, true);
			}
		}

		return Image.createRGBImage(var17, var15, var2, true);
	}
}
