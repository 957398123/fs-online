import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 2020/01/20
 * 
 * @author 95739
 *
 */
public class c_t extends bz {
	byte bH = -1;
	public static String[] bU = null;
	public static Image[] bR = null;
	private static byte[] bA = null;
	private static short[] bN = null;
	private static byte[] bD = null;
	private static short[][][] bF = null;
	private static byte[][][] bL = null;
	private static byte[] bz = null;
	short bZ = -1;
	short bE = -1;
	public c_g bI = null;
	private int bB = 0;
	private static Hashtable bV;

	protected c_t() {
	}

	public c_t(byte var1, byte var2) {
		super.field_try = var1;
		bI = c_a4.d.method_if(c_a4.d.method_for(bz[var2]));
		super.h = 0;
		bZ = 0;
		bE = 0;
		super.aT = 49;
		method_do((byte) 0);
		method_new((byte) 1);
		super.aI = new Vector();
	}

	public static void a(ac var0) {
		try {
			byte var1 = var0.method_if();
			c_b5.method_case("Neighbor.LoadStaticTiles-neiYICount=" + var1);
			bF = new short[var1][][];
			bL = new byte[var1][][];
			bz = new byte[var1];
			short var2 = 0;
			Hashtable var3 = new Hashtable();
			c_b5.method_case("--------------MonsterRefe.size()" + bV.size());

			short var5;
			short var6;
			for (int var4 = 0; var4 < var1; ++var4) {
				byte var8;
				int var14;
				if (var0.method_case()) {
					int var12 = (var14 = var0.method_byte()) / 100000;
					var14 %= 100000;
					bz[var4] = (byte) var12;
					short var15 = var0.method_new();
					bF[var4] = new short[var15][];
					bL[var4] = new byte[var15][];
					InputStream var16 = null;
					DataInputStream var13 = null;
					var16 = c_b5.int$3b9f0c8("/pkg_npc/npcdata/npc" + var14 + ".dat");
					(var13 = new DataInputStream(var16)).readShort();

					for (var14 = 0; var14 < var15; ++var14) {
						var13.readShort();
						var8 = var13.readByte();
						bF[var4][var14] = new short[var8];
						bL[var4][var14] = new byte[var8];

						for (byte var9 = 0; var9 < var8; ++var9) {
							bF[var4][var14][var9] = var13.readShort();
							bL[var4][var14][var9] = var13.readByte();
							if ((bL[var4][var14][var9] & 8) == 0) {
								if (!var3.containsKey(new String(bF[var4][var14][var9] + "P"))) {
									var3.put(new String(bF[var4][var14][var9] + "P"), new Short(bF[var4][var14][var9]));
								}
							} else if (!var3.containsKey(new String(bF[var4][var14][var9] + "M"))) {
								var3.put(new String(bF[var4][var14][var9] + "M"), new Short(var2++));
							}
						}
					}

					for (var14 = 0; var14 < var15; ++var14) {
						for (var8 = 0; var8 < bF[var4][var14].length; ++var8) {
							if ((bL[var4][var14][var8] & 8) == 0) {
								bF[var4][var14][var8] = (Short) var3.get(new String(bF[var4][var14][var8] + "P"));
							} else {
								bF[var4][var14][var8] = (Short) var3.get(new String(bF[var4][var14][var8] + "M"));
							}
						}
					}

					var13.close();
				} else {
					var6 = var0.method_new();
					bz[var4] = (byte) var6;
					var5 = var0.method_new();
					c_b5.method_case("Neighbor.LoadStaticTiles-frmCount=" + var5 + "--dddd=" + var6);
					bF[var4] = new short[var5][];
					bL[var4] = new byte[var5][];

					byte var7;
					for (var14 = 0; var14 < var5; ++var14) {
						var0.method_new();
						var7 = var0.method_if();
						bF[var4][var14] = new short[var7];
						bL[var4][var14] = new byte[var7];

						for (var8 = 0; var8 < var7; ++var8) {
							bF[var4][var14][var8] = var0.method_new();
							bL[var4][var14][var8] = var0.method_if();
							if ((bL[var4][var14][var8] & 8) == 0) {
								if (!var3.containsKey(new String(bF[var4][var14][var8] + "P"))) {
									var3.put(new String(bF[var4][var14][var8] + "P"), new Short(bF[var4][var14][var8]));
								}
							} else if (!var3.containsKey(new String(bF[var4][var14][var8] + "M"))) {
								var3.put(new String(bF[var4][var14][var8] + "M"), new Short(var2++));
							}
						}
					}

					for (var14 = 0; var14 < var5; ++var14) {
						for (var7 = 0; var7 < bF[var4][var14].length; ++var7) {
							if ((bL[var4][var14][var7] & 8) == 0) {
								bF[var4][var14][var7] = (Short) var3.get(new String(bF[var4][var14][var7] + "P"));
							} else {
								bF[var4][var14][var7] = (Short) var3.get(new String(bF[var4][var14][var7] + "M"));
							}
						}
					}
				}
			}

			var3.clear();
			short var11 = var0.method_new();
			c_b5.method_case("Neighbor.LoadStaticTiles-refe01count=" + var11);
			bR = new Image[var11];
			bA = new byte[var11 << 1];
			bN = new short[var11];
			bD = new byte[var11];
			bU = new String[var11];

			for (var5 = 0; var5 < var11; ++var5) {
				bN[var5] = var0.method_new();
				bD[var5] = 0;
				var6 = var5;

				while (--var6 >= 0) {
					if (bD[var6] != 1 && bN[var6] == bN[var5]) {
						bN[var5] = var6;
						bD[var5] = 1;
						break;
					}
				}

				if (bD[var5] == 0) {
					bU[var5] = bN[var5] + ".png";
				}

				bA[var5 * 2] = var0.method_if();
				bA[var5 * 2 + 1] = var0.method_if();
			}

			bR = c_b5.method_if(bR, "/pkg_npc/mimage/monsterbody.pkg", bU);
			var0.field_do = null;
		} catch (Exception var10) {
			var10.printStackTrace();
		}
	}

	public final void method_new(byte var1) {
		super.a7 = var1;
		a(super.field_byte);
	}

	public final void method_do(byte var1) {
		super.field_byte = var1;
		super.h = 0;
		a(super.field_byte);
	}

	public final void method_case(int var1) {
		bB = var1;
	}

	public final int O() {
		return bB;
	}

	public void a(Graphics var1) {
		a(var1, super.o, super.n);
		method_do(var1);
	}

	public final void a(Graphics var1, short var2, short var3) {
		if (!super.J) {
			try {
				byte var4 = (byte) bI.field_do[bZ].length;
				boolean var5 = false;
				boolean var6 = false;
				boolean var7 = false;
				boolean var8 = false;

				for (byte var9 = 0; var9 < var4; var9 = (byte) (var9 + 2)) {
					short var14;
					if (super.g) {
						var14 = (short) (var2 - bI.field_do[bZ][var9]);
					} else {
						var14 = (short) (var2 + bI.field_do[bZ][var9]);
					}

					short var15 = (short) (var3 + bI.field_do[bZ][var9 + 1]);
					short var16 = bF[bH][bZ][var9 >> 1];
					byte var17;
					if (((var17 = bL[bH][bZ][var9 >> 1]) & 16) == 0) {
						Image var10 = null;
						boolean var11 = false;
						boolean var12 = false;
						short var18;
						short var19;
						if ((var17 & 8) == 0) {
							if (c_b.c4[var16] == 0) {
								var10 = c_b.cw[var16];
							} else {
								var10 = c_b.cw[c_b.cI[var16]];
							}

							switch (var17) {
							case 0:
								var19 = (short) (var15 - c_b.dZ[var16 * 2 + 1]);
								if (super.g) {
									var18 = (short) (var14 - (var10.getWidth() - c_b.dZ[var16 * 2]));
									c_b5.a(var1, var10, var18, var19, 2);
								} else {
									var18 = (short) (var14 - c_b.dZ[var16 * 2]);
									c_b5.a(var1, var10, var18, var19, 0);
								}
								break;
							case 1:
								var19 = (short) (var15 - c_b.dZ[var16 * 2]);
								if (super.g) {
									var18 = (short) (var14 - c_b.dZ[var16 * 2 + 1] - 1);
									c_b5.a(var1, var10, var18, var19, 4);
								} else {
									var18 = (short) (var14 - (var10.getHeight() - c_b.dZ[var16 * 2 + 1]) + 1);
									c_b5.a(var1, var10, var18, var19, 5);
								}
								break;
							case 2:
								var19 = (short) (var15 - (var10.getHeight() - c_b.dZ[var16 * 2 + 1]) + 1);
								if (super.g) {
									var18 = (short) (var14 - c_b.dZ[var16 * 2] - 1);
									c_b5.a(var1, var10, var18, var19, 1);
								} else {
									var18 = (short) (var14 - (var10.getWidth() - c_b.dZ[var16 * 2]) + 1);
									c_b5.a(var1, var10, var18, var19, 3);
								}
								break;
							case 3:
								var19 = (short) (var15 - (var10.getWidth() - c_b.dZ[var16 * 2]) + 1);
								if (super.g) {
									var18 = (short) (var14 - (var10.getHeight() - c_b.dZ[var16 * 2 + 1]));
									c_b5.a(var1, var10, var18, var19, 7);
								} else {
									var18 = (short) (var14 - c_b.dZ[var16 * 2 + 1]);
									c_b5.a(var1, var10, var18, var19, 6);
								}
								break;
							case 4:
								var19 = (short) (var15 - c_b.dZ[var16 * 2 + 1]);
								if (super.g) {
									var18 = (short) (var14 - c_b.dZ[var16 * 2] - 1);
									c_b5.a(var1, var10, var18, var19, 0);
								} else {
									var18 = (short) (var14 - (var10.getWidth() - c_b.dZ[var16 * 2]) + 1);
									c_b5.a(var1, var10, var18, var19, 2);
								}
								break;
							case 5:
								var19 = (short) (var15 - c_b.dZ[var16 * 2]);
								if (super.g) {
									var18 = (short) (var14 - (var10.getHeight() - c_b.dZ[var16 * 2 + 1]) - 1);
									c_b5.a(var1, var10, var18, var19, 5);
								} else {
									var18 = (short) (var14 - c_b.dZ[var16 * 2 + 1]);
									c_b5.a(var1, var10, var18, var19, 4);
								}
								break;
							case 6:
								var19 = (short) (var15 - (var10.getHeight() - c_b.dZ[var16 * 2 + 1]) + 1);
								if (super.g) {
									var18 = (short) (var14 - (var10.getWidth() - c_b.dZ[var16 * 2]));
									c_b5.a(var1, var10, var18, var19, 3);
								} else {
									var18 = (short) (var14 - c_b.dZ[var16 * 2]);
									c_b5.a(var1, var10, var18, var19, 1);
								}
								break;
							case 7:
								var19 = (short) (var15 - (var10.getWidth() - c_b.dZ[var16 * 2]) + 1);
								if (super.g) {
									var18 = (short) (var14 - c_b.dZ[var16 * 2 + 1] - 1);
									c_b5.a(var1, var10, var18, var19, 6);
								} else {
									var18 = (short) (var14 - (var10.getHeight() - c_b.dZ[var16 * 2 + 1]) + 1);
									c_b5.a(var1, var10, var18, var19, 7);
								}
								break;
							default:
								c_b5.method_case("NullPointer玩家GameObject.Draw()..." + bZ + "..." + (var16 >> 1)
										+ "--mirror=" + var17);
							}
						} else {
							var17 = (byte) (var17 & 7);
							if (bD[var16] == 0) {
								var10 = bR[var16];
							} else {
								var10 = bR[bN[var16]];
							}

							switch (var17) {
							case 0:
								var19 = (short) (var15 - bA[var16 * 2 + 1]);
								if (super.g) {
									var18 = (short) (var14 - (var10.getWidth() - bA[var16 * 2]));
									c_b5.a(var1, var10, var18, var19, 2);
								} else {
									var18 = (short) (var14 - bA[var16 * 2]);
									var1.drawImage(var10, var18, var19, 20);
								}
								break;
							case 1:
								var19 = (short) (var15 - bA[var16 * 2]);
								if (super.g) {
									var18 = (short) (var14 - bA[var16 * 2 + 1] - 1);
									c_b5.a(var1, var10, var18, var19, 4);
								} else {
									var18 = (short) (var14 - (var10.getHeight() - bA[var16 * 2 + 1]) + 1);
									c_b5.a(var1, var10, var18, var19, 5);
								}
								break;
							case 2:
								var19 = (short) (var15 - (var10.getHeight() - bA[var16 * 2 + 1]) + 1);
								if (super.g) {
									var18 = (short) (var14 - bA[var16 * 2] - 1);
									c_b5.a(var1, var10, var18, var19, 1);
								} else {
									var18 = (short) (var14 - (var10.getWidth() - bA[var16 * 2]) + 1);
									c_b5.a(var1, var10, var18, var19, 3);
								}
								break;
							case 3:
								var19 = (short) (var15 - (var10.getWidth() - bA[var16 * 2]) + 1);
								if (super.g) {
									var18 = (short) (var14 - (var10.getHeight() - bA[var16 * 2 + 1]));
									c_b5.a(var1, var10, var18, var19, 7);
								} else {
									var18 = (short) (var14 - bA[var16 * 2 + 1]);
									c_b5.a(var1, var10, var18, var19, 6);
								}
								break;
							case 4:
								var19 = (short) (var15 - bA[var16 * 2 + 1]);
								if (super.g) {
									var18 = (short) (var14 - bA[var16 * 2] - 1);
									var1.drawImage(var10, var18, var19, 20);
								} else {
									var18 = (short) (var14 - (var10.getWidth() - bA[var16 * 2]) + 1);
									c_b5.a(var1, var10, var18, var19, 2);
								}
								break;
							case 5:
								var19 = (short) (var15 - bA[var16 * 2]);
								if (super.g) {
									var18 = (short) (var14 - (var10.getHeight() - bA[var16 * 2 + 1]) - 1);
									c_b5.a(var1, var10, var18, var19, 5);
								} else {
									var18 = (short) (var14 - bA[var16 * 2 + 1]);
									c_b5.a(var1, var10, var18, var19, 4);
								}
								break;
							case 6:
								var19 = (short) (var15 - (var10.getHeight() - bA[var16 * 2 + 1]) + 1);
								if (super.g) {
									var18 = (short) (var14 - (var10.getWidth() - bA[var16 * 2]));
									c_b5.a(var1, var10, var18, var19, 3);
								} else {
									var18 = (short) (var14 - bA[var16 * 2]);
									c_b5.a(var1, var10, var18, var19, 1);
								}
								break;
							case 7:
								var19 = (short) (var15 - (var10.getWidth() - bA[var16 * 2]) + 1);
								if (super.g) {
									var18 = (short) (var14 - bA[var16 * 2 + 1] - 1);
									c_b5.a(var1, var10, var18, var19, 6);
								} else {
									var18 = (short) (var14 - (var10.getHeight() - bA[var16 * 2 + 1]) + 1);
									c_b5.a(var1, var10, var18, var19, 7);
								}
								break;
							default:
								c_b5.method_case("NullPointer怪NPCGameObject.Draw()..." + bZ + "..." + (var16 >> 1)
										+ "--mirror=" + var17);
							}
						}
					}
				}

			} catch (Exception var13) {
				var13.printStackTrace();
				c_b5.method_case(method_byte() + "出错了！");
			}
		}
	}

	public final void method_case() {
		switch (super.field_byte) {
		case 1:
			l();
		case 0:
		default:
			d();
			I();
			t();
			super.o = (short) (super.c - c_z.aE);
			super.n = (short) (super.field_void - c_z.aD + 3);
		}
	}

	private void a(byte var1) {
		byte var2;
		var2 = 0;
		label52: switch (var1) {
		case 0:
			switch (y()) {
			case 1:
			case 8:
				var2 = 0;
				super.g = false;
				break label52;
			case 2:
			case 7:
				var2 = 1;
				super.g = false;
				break label52;
			case 3:
			case 5:
				var2 = 2;
				super.g = false;
				break label52;
			case 4:
			case 6:
				var2 = 1;
				super.g = true;
			default:
				break label52;
			}
		case 1:
			switch (y()) {
			case 1:
			case 8:
				var2 = 3;
				super.g = false;
				break label52;
			case 2:
			case 7:
				var2 = 4;
				super.g = false;
				break label52;
			case 3:
			case 5:
				var2 = 5;
				super.g = false;
				break label52;
			case 4:
			case 6:
				var2 = 4;
				super.g = true;
			default:
				break label52;
			}
		case 2:
			switch (y()) {
			case 1:
			case 8:
				var2 = 6;
				super.g = false;
				break label52;
			case 2:
			case 7:
				var2 = 7;
				super.g = false;
				break label52;
			case 3:
			case 5:
				var2 = 8;
				super.g = false;
				break label52;
			case 4:
			case 6:
				var2 = 7;
				super.g = true;
			default:
				break label52;
			}
		case 3:
			switch (y()) {
			case 1:
			case 8:
				var2 = 9;
				super.g = false;
				break label52;
			case 2:
			case 7:
				var2 = 10;
				super.g = false;
				break label52;
			case 3:
			case 5:
				var2 = 11;
				super.g = false;
				break label52;
			case 4:
			case 6:
				var2 = 10;
				super.g = true;
			default:
				break label52;
			}
		case 4:
			switch (y()) {
			case 1:
			case 8:
				var2 = 12;
				super.g = false;
				break;
			case 2:
			case 7:
				var2 = 13;
				super.g = false;
				break;
			case 3:
			case 5:
				var2 = 14;
				super.g = false;
				break;
			case 4:
			case 6:
				var2 = 13;
				super.g = true;
			}
		case 5:
		case 6:
		case 7:
		case 8:
		default:
			break;
		case 9:
			var2 = 15;
		}

		bE = (short) var2;
	}

	public final void d() {
		if (!super.A) {
			if (super.h >= bI.field_for[bE].length) {
				super.h = 0;
				switch (method_do()) {
				case 2:
					if (method_case(c_z.method_if(A(), n()), c_z.a(A(), n()))) {
						method_do((byte) 1);
					} else {
						method_do((byte) 0);
					}
					break;
				case 3:
					method_do((byte) 4);
					break;
				case 4:
					method_do((byte) 0);
				case 5:
				case 6:
				case 7:
				case 8:
				default:
					break;
				case 9:
					super.h = (byte) (bI.field_for[bE].length - 1);
				}
			}

			short[] var10001 = bI.field_for[bE];
			byte var10004 = super.h;
			super.h = (byte) (var10004 + 1);
			bZ = var10001[var10004];
		}
	}

	public final byte D() {
		return c_g.a[bI.field_if][0];
	}

	public final byte M() {
		return c_g.a[bI.field_if][1];
	}

	public final byte G() {
		return c_g.a[bI.field_if][2];
	}

	public final byte x() {
		return c_g.a[bI.field_if][3];
	}

	static {
		new Hashtable();
		bV = new Hashtable();
	}
}
