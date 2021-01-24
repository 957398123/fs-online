import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/**
 * 2021/01/20
 * 
 * @author 95739
 *
 */
public final class p {
	private Vector field_do = null;
	private byte field_for = -1;
	private byte field_if = -1;

	public p() {
		field_do = new Vector(1, 2);
	}

	public final c_g method_if(byte var1) {
		return (c_g) field_do.elementAt(var1);
	}

	public final byte method_for(byte var1) {
		if (field_for == var1 && field_if != -1) {
			return field_if;
		} else {
			byte var2 = -1;
			if (field_do != null) {
				int var3 = field_do.size();

				for (int var4 = 0; var4 < var3; ++var4) {
					if (((c_g) field_do.elementAt(var4)).field_if == var1) {
						var2 = (byte) var4;
						break;
					}
				}

				if (var2 == -1) {
					c_g var12;
					(var12 = new c_g()).field_if = (short) var1;
					String var5 = null;
					var5 = null;
					var5 = "/bfm/m_body";
					if (var1 < 10) {
						var5 = var5 + "0";
					}

					var5 = var5 + var1;
					InputStream var13 = c_b5.int$3b9f0c8(var5 + ".dat");
					DataInputStream var14 = new DataInputStream(var13);

					short var6;
					short var7;
					byte var8;
					byte var9;
					try {
						var6 = var14.readShort();
						var12.field_do = new short[var6][];

						for (var7 = 0; var7 < var6; ++var7) {
							var14.readShort();
							var8 = (byte) (var14.readByte() << 1);
							var12.field_do[var7] = new short[var8];

							for (var9 = 0; var9 < var8; var12.field_do[var7][var9++] = var14.readShort()) {
								var12.field_do[var7][var9++] = var14.readShort();
							}
						}

						var14.close();
					} catch (IOException var11) {
						c_b5.method_case("SAManager.LoadData()...读入骨架文件");
						var11.printStackTrace();
					}

					var5 = "/bfm/m_motion";
					if (var1 < 10) {
						var5 = var5 + "0";
					}

					var5 = var5 + var1;
					var13 = c_b5.int$3b9f0c8(var5 + ".dat");
					var14 = new DataInputStream(var13);

					try {
						var6 = var14.readShort();
						var12.field_for = new short[var6][];

						for (var7 = 0; var7 < var6; ++var7) {
							var14.readByte();
							var8 = var14.readByte();
							var12.field_for[var7] = new short[var8];

							for (var9 = 0; var9 < var8; var12.field_for[var7][var9++] = var14.readShort()) {
							}
						}

						var14.close();
					} catch (IOException var10) {
						c_b5.method_case("SAManager.LoadData()...读入动作文件");
						var10.printStackTrace();
					}

					field_do.addElement(var12);
					var2 = (byte) (field_do.size() - 1);
				}
			}

			field_for = var1;
			field_if = var2;
			return var2;
		}
	}
}
