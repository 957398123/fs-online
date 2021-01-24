import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/**
 * 2020/01/22
 * 
 * @author 95739
 *
 */
public final class c_e {
	public c_e() {
	}

	public static c_be a(String var0) {
		if (var0 != null && !var0.equals("")) {
			try {
				InputStream var4 = c_b5.int$3b9f0c8(var0);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();
				boolean var2 = false;

				int var6;
				while ((var6 = var4.read()) != -1) {
					var1.write(var6);
				}

				var0 = null;
				byte[] var5 = var1.toByteArray();
				var1.close();
				return a(var5, false);
			} catch (Exception var3) {
				var3.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	public static c_be a(byte[] var0, boolean var1) {
		if (bp.ag() != null) {
			bp.ag().method_if(false);
			c_be.hp = false;
		}

		try {
			return a(new DataInputStream(new ByteArrayInputStream(var0)), var1);
		} catch (Exception var2) {
			var2.printStackTrace();
			return null;
		}
	}

	private static c_be a(DataInputStream var0, boolean var1) {
		System.currentTimeMillis();
		c_be var2 = null;
		int var3 = 0;

		try {
			if (var1) {
				var3 = var0.readInt() & 268435455;
				c_b5.method_case("************************************************* = " + Integer.toHexString(var3));
			}

			if (var0.readInt() != 10461087) {
				c_b5.method_case("介四冒充的吧，小样！");
				var0.close();
				return null;
			}

			var0.readByte();
			short var4 = var0.readShort();
			short var5 = var0.readShort();
			var0.readByte();
			var2 = new c_be((short) 0, (short) 0, var4, var5);
			if (var1) {
				var2.g9 = var3;
			}

			byte var15 = var0.readByte();
			c_b5.method_case("本界面共有 " + var15 + " 个控件");

			for (int var16 = 0; var16 < var15; ++var16) {
				byte var6;
				Object var17;
				byte var26;
				boolean var27;
				var17 = null;
				var6 = var0.readByte();
				c_b5.method_case("第 " + (var16 + 1) + " 个UI界面类型 = " + var6);
				short var7;
				short var8;
				short var9;
				short var10;
				String var35;
				short var39;
				short var41;
				label82: switch (var6) {
				case 0:
					var26 = var0.readByte();
					c_ao var33 = new c_ao(var26, var2);
					switch (var26) {
					case 0:
						c_b5.method_case("开始解析Title控件...");
						var35 = var0.readUTF();
						c_b5.method_case("TEXTTEXTTEXTTEXT = " + var35);
						var33.method_do(var35);
						break;
					case 1:
						var35 = var0.readUTF();
						String var43 = var0.readUTF();
						var33.a(var35, 0);
						var33.a(var43, 1);
					}

					var17 = var33;
					var2.method_if(var33);
					String var32;
					switch (var2.g9) {
					case 983056:
						var32 = "师德商店";
						var33.method_do(var32);
						break label82;
					case 983057:
						var32 = "氏族商店";
						var33.method_do(var32);
						break label82;
					case 983058:
						var32 = "族贡商店";
						var33.method_do(var32);
					default:
						break label82;
					}
				case 1:
					ah var34;
					var17 = var34 = method_do(var0, var2);
					var2.method_if(var34);
					break;
				case 2:
					var26 = var0.readByte();
					var8 = var0.readShort();
					var9 = var0.readShort();
					var10 = var0.readShort();
					String var40 = var0.readUTF();
					var41 = var0.readShort();
					String var47 = var0.readUTF();
					a9 var30;
					(var30 = new a9(var8, var9, var10, var40, var26, var41, var2)).b(var47);
					var17 = var30;
					var2.method_if(var30);
					break;
				case 3:
					ay var29;
					var17 = var29 = method_char(var0, var2);
					var2.method_if(var29);
					break;
				case 4:
					a7 var28;
					var17 = var28 = method_int(var0, var2);
					var2.method_if(var28);
					break;
				case 5:
					var26 = var0.readByte();
					var8 = var0.readShort();
					var9 = var0.readShort();
					var10 = var0.readShort();
					var39 = var0.readShort();
					c_y var42 = new c_y(var8, var9, var10, var39, var26, var2);
					switch (var26) {
					case 0:
					default:
						break;
					case 1:
						short var46 = var0.readShort();
						var0.readShort();
						var27 = false;
						var0.readBoolean();
						var0.readBoolean();
						var42.method_try(var46);
						var42.method_case((short) -1);
						break;
					case 2:
						int var45 = var0.readInt();
						int var25 = var0.readInt();
						var42.T = var45;
						var42.F = var25;
					}

					var17 = var42;
					var2.method_if(var42);
				case 6:
				default:
					break;
				case 7:
					ae var24;
					var17 = var24 = method_if(var0, var2);
					var2.method_if(var24);
					break;
				case 8:
					var7 = var0.readShort();
					var8 = var0.readShort();
					var35 = var0.readUTF();
					var10 = var0.readShort();
					var39 = var0.readShort();
					var41 = var0.readShort();
					boolean var13 = var0.readBoolean();
					c_r var22;
					(var22 = new c_r(var7, var8, var35, var10, var39, var41, (byte) 0, var2)).q(var13);
					var17 = var22;
					var2.method_if(var22);
					break;
				case 9:
					var7 = var0.readShort();
					var8 = var0.readShort();
					bj var31 = new bj(var7, var8, var2);
					var10 = var0.readShort();
					boolean var37;
					if (var37 = var0.readBoolean()) {
						var10 = (short) (var10 * c_a5.ic / 176);
					} else {
						var10 = (short) (var10 * c_a5.il / 208);
					}

					var31.ii = var10;
					var31.il = var37;
					var17 = var31;
					var2.method_if(var31);
					break;
				case 10:
					c_bv var21;
					var17 = var21 = method_byte(var0, var2);
					var2.method_if(var21);
					break;
				case 11:
					var7 = var0.readShort();
					var8 = var0.readShort();
					var9 = var0.readShort();
					var10 = var0.readShort();
					byte var11 = var0.readByte();
					var0.readShort();
					var0.readShort();
					var0.readShort();
					int var12 = var0.readInt();
					String var18 = var0.readUTF();
					ak var23;
					(var23 = new ak(var7, var8, var9, var10, var2)).method_try(var11);
					var23.method_else(var12);
					var23.method_if(var18);
					var23.ap();
					var17 = var23;
					var2.method_if(var23);
					break;
				case 12:
					c_bg var20;
					var17 = var20 = method_new(var0, var2);
					var2.method_if(var20);
					break;
				case 99:
					bd var19;
					var17 = var19 = new bd((short) 0, (short) 0, (short) 0, (short) 0, var2);
					var2.method_if(var19);
				}

				if (var17 != null) {
					if (((ba) var17).u()) {
						var6 = var0.readByte();
						var26 = var0.readByte();
						byte var36 = var0.readByte();
						byte var38 = var0.readByte();
						boolean var44 = var0.readBoolean();
						((ba) var17).a((byte) 0, var6);
						((ba) var17).a((byte) 1, var26);
						((ba) var17).a((byte) 2, var36);
						((ba) var17).a((byte) 3, var38);
						if (!(var17 instanceof a7) || ((ba) var17).method_char() != 0
								|| c_a5.df != 18 && c_a5.df != 19 && c_a5.eg != 1 && c_a5.eg != 2) {
							((ba) var17).a(var44, var2);
						} else {
							((ba) var17).a(false, var2);
						}
					}

					var27 = var0.readBoolean();
					((ba) var17).a(var27);
				}
			}

			var0.close();
			if (var1) {
				if (c_a5.eQ.e) {
					c_a5.fE.addElement(var2);
				} else if (c_a5.dK != -1) {
					c_a5.fE.removeElementAt(c_a5.dK);
					c_a5.fE.insertElementAt(var2, c_a5.dK);
				}
			}
		} catch (Exception var14) {
			var14.printStackTrace();
		}

		var2.ck();
		return var2;
	}

	static void a(c_be var0, DataInputStream var1) {
		try {
			if (var0 == null) {
				c_b5.method_case("---当前界面为空，不能更新控件---");
				return;
			}

			c_b5.method_case("----进入部分更新解析方法----");
			byte var2 = var1.readByte();
			if (bo.q == 3 || bo.q == 8) {
				var2 = (byte) (var2 - 2);
			}

			for (int var3 = 0; var3 < var2; ++var3) {
				byte var4 = var1.readByte();
				ba var5;
				c_r var6;
				byte var7;
				short var27;
				int var41;
				byte var42;
				byte var46;
				if ((var5 = (ba) var0.cf().elementAt(var4)) instanceof c_r && var5.p() == 6) {
					var6 = (c_r) var5;
					var7 = var1.readByte();
					var6.l((short) var7);
					var42 = var1.readByte();

					for (var41 = 0; var41 < var42; ++var41) {
						var46 = var1.readByte();
						c_b5.method_case("更新索引：" + var46);
						var6.mQ[var46] = var1.readInt();
						c_b5.method_case("ID：" + var6.mQ[var46]);
						var27 = var1.readShort();
						var6.mW[var46] = var27;
						var6.mI[var46] = c_r.k((short) (var27 % 1000));
						var6.nu[var46] = var1.readByte();
						c_b5.method_case("数量：" + var6.nu[var46]);
						var6.mV[var46] = var1.readUTF();
						c_b5.method_case("名称：" + var6.mV[var46]);
						var6.ne[var46] = var1.readByte();
						var6.mM[var46] = var1.readShort();
						var6.m5[var46] = var1.readBoolean();
						var6.nq[var46] = var1.readBoolean();
						var6.nD[var46] = var1.readByte();
						var6.mN[var46] = var1.readInt();
						var6.nm[var46] = var1.readByte();
						var6.mx[var46] = var1.readByte();
						var6.m4[var46] = var1.readBoolean();
						var6.mS[var46] = var1.readBoolean();
						var6.mZ[var46] = var1.readBoolean();
						if (var6.nm[var46] == 1) {
							var6.nv[var46] = false;
						} else {
							var6.nv[var46] = true;
						}

						var6.method_do(var46, var27);
						var6.method_if(var6.mV[var6.ep()], c_r.E(var6.ne[var6.ep()]));
					}

					if (c_a5.es.g9 == 939349) {
						bx.field_for = -1;
						bx.field_if = -1;
						bx.a = -1;
					} else if (c_a5.es.g9 == 2228256) {
						aj.a();
					} else if (c_a5.es.g9 == 3342341 && var6.mQ[var6.mz] == -1) {
						((c_ao) c_a5.es.cf().elementAt(1)).a("", 0);
					}
				} else {
					int var8;
					byte var9;
					short var10;
					if (!(var5 instanceof c_r) || var5.p() != 42 && var5.p() != 53) {
						if (var5 instanceof c_r && var5.p() == 29) {
							var6 = (c_r) var5;
							var7 = var1.readByte();
							var6.l((short) var7);
							var42 = var1.readByte();

							for (var41 = 0; var41 < var42; ++var41) {
								var46 = var1.readByte();
								var6.mQ[var46] = var1.readInt();
								var27 = var1.readShort();
								var6.mW[var46] = var27;
								var6.mI[var46] = c_r.k((short) (var27 % 1000));
								var6.nu[var46] = var1.readByte();
								var6.mV[var46] = var1.readUTF();
								var6.nv[var46] = var1.readBoolean();
								var6.ne[var46] = var1.readByte();
								var6.method_do(var46, var27);
								var6.mZ[var46] = var1.readBoolean();
							}
						} else {
							a7 var25;
							String var39;
							short var53;
							if (var5 instanceof a7 && var5.p() == 16 && var5.method_char() == 3) {
								var25 = (a7) var5;
								var7 = var1.readByte();
								c_b5.method_case("equipType = " + var7);
								var53 = var1.readShort();
								c_b5.method_case("equipPicID = " + var53);
								var25.g(var53);
								var39 = var1.readUTF();
								c_b5.method_case("equipName = " + var39);
								var46 = var1.readByte();
								c_b5.method_case("equipColorLevel = " + var46);
								var27 = (short) (var53 % 1000);
								var25.fz = true;
								var25.e(var27);
								var25.a(c_a5.gg);
								var25.method_else(var39);
								var25.h(var7);
								var25.l(var46);
							} else {
								int var28;
								short var48;
								if (var5 instanceof a7 && var5.p() == 115 && var5.method_char() == 3) {
									var25 = (a7) var5;
									var7 = var1.readByte();
									c_b5.method_case("equipType = " + var7);
									var53 = var1.readShort();
									c_b5.method_case("equipPicID = " + var53);
									var25.g(var53);
									var39 = var1.readUTF();
									c_b5.method_case("equipName = " + var39);
									var46 = var1.readByte();
									c_b5.method_case("equipColorLevel = " + var46);
									var27 = var1.readShort();
									var48 = var1.readShort();
									var28 = var1.readInt();
									short var54 = (short) (var53 % 1000);
									var25.fz = true;
									var25.e(var54);
									var25.a(c_a5.gg);
									var25.method_else(var39);
									var25.h(var7);
									var25.l(var46);
									var25.f(var27);
									var25.d(var48);
									var25.h(var28);
								} else if (var5 instanceof a7 && var5.p() == 5 && var5.method_char() == 1) {
									var25 = (a7) var5;
									var7 = var1.readByte();
									var25.method_long(var7);
									if (c_a5.es != null) {
										switch (c_a5.es.g9) {
										case 458760:
											c_r.d6();
										}
									}
								} else {
									ah var29;
									int var40;
									if (var5 instanceof ah && var5.p() == 4 && var5.method_char() == 0) {
										var29 = (ah) var5;
										var40 = var1.readInt();
										var29.a(var40 + "");
									} else if (var5 instanceof ah && var5.p() == 4 && var5.method_char() == 3) {
										var29 = (ah) var5;
										var40 = var1.readInt();
										var29.method_case(var40);
									} else if (var5 instanceof ah && var5.p() == 4 && var5.method_char() == 4) {
										var29 = (ah) var5;
										var40 = var1.readInt();
										var29.a(Integer.toString(var40));
									} else if (var5 instanceof ah && var5.method_char() == 2) {
										var29 = (ah) var5;
										var40 = var1.readInt();
										var8 = var1.readInt();
										var29.method_case(var40);
										var29.method_byte(var8);
										if (c_a5.es.g9 == 2228225) {
											aj.field_for = (byte) var40;
										}
									} else {
										c_m var52;
										if (var5.p() == 67 && var5 instanceof c_bg) {
											var6 = null;
											c_bg var38;
											(var38 = (c_bg) var5).a((v) null);
											var42 = var1.readByte();
											ba[] var49 = new ba[3];
											v var51;
											short[] var24 = (var51 = (v) var38.cD().elementAt(0)).method_case();
											var52 = null;

											for (var28 = 0; var28 < var51.field_if.size(); ++var28) {
												var49[var28] = (ba) var51.field_if.elementAt(var28);
											}

											short var30 = var51.b;
											var38.cE();

											for (int var12 = 0; var12 < var42; ++var12) {
												String var35 = var1.readUTF();
												var10 = var1.readShort();
												String var55 = var1.readUTF();
												v var13;
												(var13 = new v()).a(3);
												short var15 = (short) (var30 + 6);
												var13.b = var15;
												var13.a(var24);
												var13.method_if((short) (var38.v() + 3 + 1 + 1));
												var13.a((short) (var38.method_long() + 1 + 1 + 1 + var12 * var30));

												for (int var14 = 0; var14 < 3; ++var14) {
													Object var56 = null;
													short var16 = (short) (var38.v() + 3 + 1 + 1);
													short var17 = (short) (var38.method_long() + 1 + 1 + 1);
													ah var57;
													if (var14 == 0) {
														var57 = (ah) var49[var14];
														(var57 = new ah(var57.v(), var57.method_long(),
																var57.method_for(), var57.z(), var57.method_char(),
																var57.aj(), (c_be) null)).a2 = true;
														var57.aN = (short) (var24[var14] * c_a5.ic / 176);
														var57.a(var35);
														var57.method_new((short) (var16
																+ (var13.method_if((byte) var14) + 1) * c_a5.ic / 176));
														var57.method_for((short) (var17 + var12 * var30
																+ (var30 - c_a5.iG) / 2));
														var56 = var57;
													} else if (var14 == 1) {
														a7 var58 = (a7) var49[var14];
														var58 = new a7(var58.v(), var58.method_long(),
																var58.method_for(), var58.z(), (String) null,
																var58.method_char(), (c_be) null);
														if (var10 != -1) {
															var58.g(var10);
															var58.ft = true;
															short var18 = (short) (var10 % 1000);
															var58.method_if(var18, true);
														}

														var58.a(c_a5.gg);
														var58.method_new((short) (var16
																+ (var13.method_if((byte) var14) + 1) * c_a5.ic / 176));
														var58.method_for((short) (var17 + var12 * var30
																+ (var30 - var58.bE().a) / 2));
														if (var10 == -1) {
															var58.a((bi) null);
														}

														var56 = var58;
													} else if (var14 == 2) {
														var57 = (ah) var49[var14];
														(var57 = new ah(var57.v(), var57.method_long(),
																var57.method_for(), var57.z(), var57.method_char(),
																var57.aj(), (c_be) null)).a2 = true;
														var57.aN = (short) (var24[var14] * c_a5.ic / 176);
														var57.a(var55);
														var57.method_new((short) (var16
																+ (var13.method_if((byte) var14) + 1) * c_a5.ic / 176));
														var57.method_for((short) (var17 + var12 * var30
																+ (var30 - c_a5.iG) / 2));
														var56 = var57;
													} else {
														c_b5.method_case("不正确的控件");
													}

													var13.a((ba) var56);
												}

												var38.method_if(var13);
											}

											if (c_a5.es.g9 == 1966100) {
												var38.h0 = 13;
											} else {
												var38.h0 = 12;
												au.field_case = 1;
												((c_ao) c_a5.es.cf().elementAt(1)).a("查看", 0);
											}

											var38.cP();
										} else {
											String var34;
											if (var5 instanceof a7 && (var5.p() == 34 || var5.p() == 35)) {
												var25 = (a7) var5;
												short var36 = var1.readShort();
												c_b5.method_case("AAAAAAAAAAAAAAAAA wpID = " + var36);
												var34 = var1.readUTF();
												c_b5.method_case("BBBBBBBBBBBBBBBBB name = " + var34);
												var9 = var1.readByte();
												c_b5.method_case("CCCCCCCCCCCCCCCCC num = " + var9);
												var46 = var1.readByte();
												byte var23 = var1.readByte();
												c_b5.method_case("DDDDDDDDDDDDDDDDD color = " + var23);
												var25.g(var36);
												var25.ft = true;
												var48 = (short) (var36 % 1000);
												var25.ft = true;
												var25.method_if(var48, true);
												var25.a(c_a5.gg);
												var25.method_else(var34);
												var25.h(var46);
												var25.l(var23);
												if (var9 > 0) {
													var25.a(true, var9);
												} else {
													var25.g(false);
												}

												try {
													if (var25.r == 35 && var25.q()) {
														ah var26;
														(var26 = (ah) c_a5.es.cf().elementAt(17)).a(var25.bv());
														c_be.hd = true;
														c_be.hH = (byte) (var3 - 20);
														var26.method_char(c_r.E(var25.bD()));
													}
												} catch (Exception var19) {
												}
											} else if (!(var5 instanceof a7) || var5.p() != 36 && var5.p() != 37) {
												c_bv var32;
												if ((var5.p() == 83 || var5.p() == 88 || var5.p() == 95
														|| var5.p() == 102 || var5.p() == 107 || var5.p() == 113)
														&& var5 instanceof c_bv) {
													c_b5.method_case(
															"fffffffffffffffffffff222222222ccccccccccccccccccc");
													(var32 = (c_bv) var5).dy();
													var7 = var1.readByte();

													for (var8 = 0; var8 < var7; ++var8) {
														var9 = var1.readByte();
														int var47 = var1.readInt();
														String var22 = var1.readUTF();
														var52 = new c_m(var22, (byte) 1, (byte) 0, var32.dF());
														var4 = -1;
														switch (var9) {
														case 0:
															var4 = 6;
															break;
														case 1:
															var4 = 7;
															break;
														case 2:
															var4 = 5;
															break;
														case 3:
															var4 = 8;
														}

														c_b5.method_case("锻造成功率：" + var4);
														var52.method_int(var4);
														var52.q = var47;
														var32.a(var52);
													}
												} else if (!(var5 instanceof c_r)
														|| var5.p() != 164 && var5.p() != 167) {
													if (var5 instanceof c_r && var5.p() == 165) {
														var6 = (c_r) var5;
														var7 = var1.readByte();
														var6.l((short) var7);
														var42 = var1.readByte();

														for (var41 = 0; var41 < var42; ++var41) {
															var46 = var1.readByte();
															if (var1.readByte() == 1) {
																var6.mQ[var46] = var1.readInt();
																var48 = var1.readShort();
																var6.mW[var46] = var48;
																var6.mI[var46] = c_r.k((short) (var48 % 1000));
																var6.method_do(var46, var48);
																var6.nu[var46] = var1.readByte();
																var6.nv[var46] = true;
																var6.mV[var46] = var1.readUTF();
																var6.ne[var46] = var1.readByte();
																var6.nq[var46] = var1.readBoolean();
																var6.mN[var46] = var1.readInt();
																var6.nm[var46] = var1.readByte();
																if (var6.mQ[var46] != -1) {
																	var6.mV[var46] = var6.mV[var46] + "单价"
																			+ var6.mN[var46] + "菜币";
																}
															} else {
																var6.mQ[var46] = -1;
																boolean var50 = false;
																var6.mW[var46] = -1;
																var6.mI[var46] = c_r.k((short) -1);
																var6.method_do(var46, -1);
																var6.nu[var46] = 0;
																var6.nv[var46] = false;
																var6.mV[var46] = "";
																var6.ne[var46] = 0;
																var6.nq[var46] = false;
																var6.mN[var46] = 0;
																var6.nm[var46] = 0;
															}
														}

														c_ao var44 = (c_ao) c_a5.es.cf().elementAt(1);
														if (var6.mQ[var6.ep()] != -1) {
															var44.a("操作", 0);
														} else {
															var44.a("整理", 0);
														}

														var6.method_if(var6.mV[var6.ep()], c_r.E(var6.ne[var6.ep()]));
													} else if (var5 instanceof c_bv && var5.p() == 170) {
														(var32 = (c_bv) var5).dy();
														var7 = var1.readByte();

														for (var8 = 0; var8 < var7; ++var8) {
															var39 = var1.readUTF();
															c_m var45;
															(var45 = new c_m(var39, (byte) 0, (byte) 0,
																	var32.dF())).w = var1.readShort();
															var45.field_else = var1.readShort();
															var32.a(var45);
														}
													} else if (var5 instanceof a7 && var5.p() == 175) {
														var25 = (a7) var5;
														var7 = var1.readByte();
														var25.method_goto(var7);
														var8 = var1.readInt();
														var25.a(false, (byte) 1);
														var25.fC = (byte) (var8 / 1000 - 1);
														short var37 = (short) (var8 % 1000);
														var25.ft = true;
														var25.method_if(var37, false);
														var25.a(c_a5.gg);
														ak var43 = (ak) c_a5.es.cf().elementAt(13);
														int[] var21 = new int[] { 3, 5, 7, 9, 11 };

														for (int var11 = 0; var11 < var21.length; ++var11) {
															if (var21[var3] == var4) {
																am.field_case[var3] = var1.readUTF();
																var43.method_if(am.field_case[var3]);
															}
														}
													} else if (var5 instanceof ah && var5.p() == 1
															&& var5.method_char() == 0) {
														var29 = (ah) var5;
														String var33 = var1.readUTF();
														var29.a(var33 + "");
													}
												} else {
													var6 = (c_r) var5;
													var7 = var1.readByte();

													for (var8 = 0; var8 < var7; ++var8) {
														var9 = var1.readByte();
														var10 = var1.readShort();
														var6.mW[var9] = var10;
														var6.mI[var9] = c_r.k((short) (var10 % 1000));
														var6.nu[var9] = var1.readByte();
														var6.mV[var9] = var1.readUTF();
														var6.ne[var9] = var1.readByte();
														var6.method_do(var9, var10);
														var6.mN[var9] = var1.readInt();
													}

													var6.method_if(var6.mV[var6.ep()], c_r.E(var6.ne[var6.ep()]));
												}
											} else {
												var25 = (a7) var5;
												boolean var31 = var1.readBoolean();
												var34 = null;
												if (var5.p() == 36) {
													var25.fg = 0;
													a7.ej = var31;
												} else {
													var25.fg = 3;
													a7.em = var31;
												}
											}
										}
									}
								}
							}
						}
					} else {
						var6 = (c_r) var5;
						var7 = var1.readByte();

						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var1.readByte();
							var6.mQ[var9] = var1.readInt();
							c_b5.method_case("--- stuffId[" + var9 + "] = " + var6.mQ[var9]);
							var10 = var1.readShort();
							var6.mW[var9] = var10;
							c_b5.method_case("--- imageFullID = " + var10);
							var6.mI[var9] = c_r.k((short) (var10 % 1000));
							var6.mN[var9] = var1.readInt();
							c_b5.method_case("--- grid.stuffPrice[" + var9 + "] = " + var6.mN[var9]);
							var6.nu[var9] = var1.readByte();
							c_b5.method_case("--- grid.stuffNumber[" + var9 + "] = " + var6.nu[var9]);
							var6.mV[var9] = var1.readUTF();
							c_b5.method_case("--- grid.stuffName[" + var9 + "] = " + var6.mV[var9]);
							var6.ne[var9] = var1.readByte();
							var6.nv[var9] = var1.readBoolean();
							c_b5.method_case("--- stuffShowMiniNum[" + var9 + "] = " + var6.nv[var9]);
							var6.nm[var9] = var1.readByte();
							c_b5.method_case("--- stuffMaxNum[" + var9 + "] = " + var6.nm[var9]);
							var6.method_do(var9, var10);
							if (var5.p() == 53) {
								var6.mu[var9] = var1.readByte();
								c_b5.method_case("--- stuffGroupNum[" + var9 + "] = " + var6.mu[var9]);
							}

							var6.method_if(var6.mV[var6.ep()], c_r.E(var6.ne[var6.ep()]));
						}
					}
				}
			}
		} catch (Exception var20) {
			var20.printStackTrace();
		}

	}

	public static void a(DataInputStream var0) {
		try {
			System.currentTimeMillis();
			long var1 = 0L;
			c_b5.method_case("enter in parseUIData");
			int var12 = var0.readInt();
			c_b5.method_case("fileHeader = " + var12);
			if (var12 != 8289918) {
				c_b5.method_case("用户数据头不对！");
				return;
			}

			byte var13 = var0.readByte();
			c_b5.method_case("用户数据控件数量 = " + var13);
			c_be var2 = null;
			if (c_a5.fE.size() != 0) {
				if (c_a5.dK != -1) {
					var2 = (c_be) c_a5.fE.elementAt(c_a5.dK);
				} else {
					var2 = (c_be) c_a5.fE.elementAt(c_a5.fE.size() - 1);
				}
			} else {
				var2 = c_a5.es;
			}

			short[] var3 = new short[var13];
			ba[] var4 = new ba[var13];

			int var5;
			for (var5 = 0; var5 < var13; ++var5) {
				byte var6 = (byte) (var0.readByte() - 1);
				c_b5.method_case("----- " + var6);
				if (var2 != null) {
					c_b5.method_case("----- " + var2.cf().size());
				}

				var3[var5] = var0.readShort();
				var4[var5] = (ba) var2.cf().elementAt(var6);
				var4[var5].method_int(var3[var5]);
			}

			for (var5 = 0; var5 < var13; ++var5) {
				short var10001 = var3[var5];
				ba var10002 = var4[var5];
				int var9 = var2.g9;
				ba var8 = var10002;
				short var7 = var10001;
				c_b5.method_case("clientType = " + var7);
				if (var8 instanceof c_bv) {
					a$571480af(var0, var7, (c_bv) var8);
				} else if (var8 instanceof ah) {
					a$470cfd82(var0, var7, (ah) var8, var2);
				} else if (var8 instanceof c_bg) {
					a(var0, var7, (c_bg) var8, var9, var2);
				} else if (var8 instanceof a7) {
					a$1a0c41af(var0, var7, (a7) var8);
				} else if (var8 instanceof ak) {
					a$3da4a85(var0, var7, (ak) var8, var9);
				} else if (var8 instanceof c_r) {
					a$7aebb325(var0, var7, (c_r) var8);
				} else {
					c_b5.method_case("！！！错误：没有相匹配的控件类型");
					c_b5.method_case("错误的clientType = " + var7);
				}
			}

			a();
			method_if();
			method_for();
			var0.close();
		} catch (Exception var11) {
			var11.printStackTrace();
		}

	}

	private static void method_for() {
		int var0 = 0;

		for (int var1 = c_a5.es.cf().size(); var0 < var1; ++var0) {
			if ((ba) c_a5.es.cf().elementAt(var0) instanceof a7
					&& ((ba) c_a5.es.cf().elementAt(var0)).method_char() == 1) {
				c_a5.es.cf().elementAt(var0);
			}
		}

	}

	private static void a() {
		int var0 = 0;

		for (int var1 = c_a5.es.cf().size(); var0 < var1; ++var0) {
			if ((ba) c_a5.es.cf().elementAt(var0) instanceof a7
					&& ((ba) c_a5.es.cf().elementAt(var0)).method_char() == 3) {
				c_a5.es.cf().elementAt(var0);
			}
		}

	}

	private static void method_if() {
		c_r var0 = null;
		int var1 = 0;

		for (int var2 = c_a5.es.cf().size(); var1 < var2; ++var1) {
			if ((ba) c_a5.es.cf().elementAt(var1) instanceof c_r
					&& (var0 = (c_r) c_a5.es.cf().elementAt(var1)).p() == 6) {
				switch (c_a5.es.g9) {
				case 458753:
				case 458754:
				case 458756:
				case 458757:
				case 458758:
				case 458759:
				case 458760:
				case 458775:
				case 3342341:
					var0.J((byte) 0);
					break;
				case 458755:
				case 917505:
				case 917506:
				case 917508:
				case 917509:
				case 917510:
				case 917511:
					var0.J((byte) 8);
					break;
				case 458817:
					var0.J((byte) 15);
					break;
				case 917525:
					var0.J((byte) 20);
					break;
				case 939349:
					var0.J((byte) 17);
					break;
				case 983041:
				case 983042:
				case 983043:
				case 983044:
				case 983045:
				case 983046:
				case 983047:
				case 983048:
				case 983049:
				case 983056:
				case 983057:
				case 983058:
					var0.J((byte) 1);
					break;
				case 1179649:
				case 1179650:
				case 1179651:
				case 1179652:
				case 1179653:
				case 1179654:
				case 1638423:
					var0.J((byte) 2);
					break;
				case 1179658:
					var0.J((byte) 9);
					break;
				case 1245185:
				case 1245186:
					var0.J((byte) 3);
					break;
				case 1376260:
				case 1376263:
				case 1376269:
					var0.J((byte) 4);
					break;
				case 1703946:
					var0.J((byte) 5);
					break;
				case 1769473:
				case 1769475:
				case 1769478:
				case 1769479:
				case 1769480:
				case 1769488:
				case 1769489:
				case 1769490:
				case 1769491:
				case 1769492:
					var0.J((byte) 6);
					break;
				case 1900547:
					var0.J((byte) 7);
					break;
				case 1966086:
					var0.J((byte) 10);
					break;
				case 1966097:
					var0.J((byte) 14);
					break;
				case 2031621:
					var0.J((byte) 12);
					break;
				case 2031636:
					var0.J((byte) 11);
					break;
				case 2228225:
					var0.J((byte) 13);
					break;
				case 2228256:
					var0.J((byte) 18);
					break;
				case 3342356:
					var0.J((byte) 19);
				}
			}
		}

	}

	private static void a$7aebb325(DataInputStream var0, short var1, c_r var2) throws IOException {
		byte var3;
		int var4;
		short var5;
		if (var1 == 6) {
			var3 = var0.readByte();
			c_b5.method_case("背包可用的格数 = " + var3);
			var2.j((short) var3);
			var2.d0();

			for (var4 = 0; var4 < var3; ++var4) {
				var2.mQ[var4] = var0.readInt();
				c_b5.method_case("grid.stuffId[" + var4 + "] = " + var2.mQ[var4]);
				var5 = var0.readShort();
				var2.mW[var4] = var5;
				var2.mI[var4] = c_r.k((short) (var5 % 1000));
				var2.nu[var4] = var0.readByte();
				var2.mV[var4] = var0.readUTF();
				var2.ne[var4] = var0.readByte();
				c_b5.method_case("物品文字颜色值： " + var2.ne[var4]);
				var2.mM[var4] = var0.readShort();
				c_b5.method_case("---------------grid.stuffType[" + var4 + "] = ------------------" + var2.mM[var4]);
				var2.m5[var4] = var0.readBoolean();
				var2.nq[var4] = var0.readBoolean();
				c_b5.method_case("---------------grid.isCanTrade[" + var4 + "] = ------------------" + var2.nq[var4]);
				var2.nD[var4] = var0.readByte();
				var2.mN[var4] = var0.readInt();
				var2.nm[var4] = var0.readByte();
				var2.mx[var4] = var0.readByte();
				c_b5.method_case("物品名称 = " + var2.mV[var4] + " 物品种类 = " + var2.mx[var4]);
				var2.m4[var4] = var0.readBoolean();
				var2.mS[var4] = var0.readBoolean();
				var2.mZ[var4] = var0.readBoolean();
				if (var2.nm[var4] == 1) {
					var2.nv[var4] = false;
				} else {
					var2.nv[var4] = true;
				}

				var2.method_do(var4, var5);
			}

			var2.method_if(var2.mV[var2.ep()], c_r.E(var2.ne[var2.ep()]));
			var2.d9();
		} else if (var1 != 42 && var1 != 53) {
			if (var1 == 29) {
				var3 = var0.readByte();
				var2.j((short) var3);

				for (var4 = 0; var4 < var3; ++var4) {
					var2.mQ[var4] = var0.readInt();
					var5 = var0.readShort();
					var2.mW[var4] = var5;
					var2.mI[var4] = c_r.k((short) (var5 % 1000));
					var2.nu[var4] = var0.readByte();
					var2.mV[var4] = var0.readUTF();
					var2.nv[var4] = var0.readBoolean();
					var2.ne[var4] = var0.readByte();
					var2.method_do(var4, var5);
					var2.mZ[var4] = var0.readBoolean();
				}

				var2.d9();
			} else if (var1 == 148) {
				int var9;
				bo.l = new byte[var9 = var0.readInt()];
				bo.G = new int[var9];
				bo.P = new String[var9];
				bo.g = new byte[var9];
				bo.K = new int[var9];
				bo.I = new byte[var9];
				var2.j((short) var9);
				var2.d0();

				for (var4 = 0; var4 < var9; ++var4) {
					var2.mQ[var4] = var0.readInt();
					bo.K[var4] = var2.mQ[var4];
					c_b5.method_case("grid.stuffId[" + var4 + "] = " + var2.mQ[var4]);
					var5 = var0.readShort();
					var2.mW[var4] = var5;
					var2.mI[var4] = c_r.k((short) (var5 % 1000));
					var2.nu[var4] = var0.readByte();
					bo.I[var4] = var2.nu[var4];
					var2.mV[var4] = var0.readUTF();
					var2.mo[var4] = var0.readByte();
					var2.ne[var4] = var2.mo[var4];
					bo.l[var4] = var0.readByte();
					bo.G[var4] = var0.readInt();
					if (bo.q == 3 || bo.q == 8) {
						bo.P[var4] = "" + bo.G[var4] / 10 + "." + bo.G[var4] % 10 + "元";
					}

					c_b5.method_case("PCIncrement.m_bBuyShopping[" + var4 + "]=" + bo.G[var4]);
					bo.g[var4] = var0.readByte();
					if (var2.nu[var4] == 1) {
						var2.nv[var4] = false;
					} else {
						var2.nv[var4] = true;
					}

					var2.method_do(var4, var5);
					((c_ao) c_a5.es.cf().elementAt(0)).method_do(bo.o);
					ah var7 = (ah) c_a5.es.cf().elementAt(6);
					if (bo.q != 3 && bo.q != 8) {
						var7.method_case(bo.G[0]);
					} else {
						var7.a((byte) 0);
						var7.a(bo.P[0]);
					}
				}

				var2.method_if(var2.mV[var2.ep()], c_r.E(var2.ne[var2.ep()]));
				var2.d9();
			} else {
				if (var1 != 164 && var1 != 167) {
					if (var1 == 160) {
						short var8 = var0.readShort();
						var2.j(var8);
						az.a = new int[var8];

						for (var4 = 0; var4 < var8; ++var4) {
							var2.mQ[var4] = var0.readInt();
							c_b5.method_case("grid.stuffId[" + var4 + "] = " + var2.mQ[var4]);
							var5 = var0.readShort();
							var2.mW[var4] = var5;
							var2.mI[var4] = c_r.k((short) (var5 % 1000));
							var2.mV[var4] = var0.readUTF();
							var2.ne[var4] = var0.readByte();
							az.a[var4] = var0.readInt();
							var2.method_do(var4, var5);
						}

						ah var12 = (ah) c_a5.es.cf().elementAt(4);
						ah var11 = (ah) c_a5.es.cf().elementAt(7);
						c_r var6 = (c_r) c_a5.es.cf().elementAt(3);
						var12.a(var6.mV[var6.ep()]);
						var12.method_char(c_r.E(var6.ne[var6.ep()]));
						var11.method_case(az.a[var6.ep()]);
						return;
					}

					if (var1 == 165) {
						var3 = var0.readByte();
						var2.j((short) var3);
						var2.d0();

						for (var4 = 0; var4 < var3; ++var4) {
							if (var0.readByte() == 1) {
								var2.mQ[var4] = var0.readInt();
								var1 = var0.readShort();
								var2.mW[var4] = var1;
								var2.mI[var4] = c_r.k((short) (var1 % 1000));
								var2.method_do(var4, var1);
								var2.nu[var4] = var0.readByte();
								var2.nv[var4] = true;
								var2.mV[var4] = var0.readUTF();
								var2.ne[var4] = var0.readByte();
								var2.nq[var4] = var0.readBoolean();
								var2.mN[var4] = var0.readInt();
								var2.nm[var4] = var0.readByte();
								var2.mV[var4] = var2.mV[var4] + "单价" + var2.mN[var4] + "菜币";
							} else {
								var2.mQ[var4] = -1;
								var2.mW[var4] = -1;
								var2.mI[var4] = c_r.k((short) -1);
								var2.method_do(var4, -1);
								var2.nu[var4] = 0;
								var2.nv[var4] = false;
								var2.mV[var4] = "";
								var2.ne[var4] = 0;
								var2.nq[var4] = false;
								var2.mN[var4] = 0;
								var2.nm[var4] = 0;
							}
						}

						var2.method_if(var2.mV[var2.ep()], c_r.E(var2.ne[var2.ep()]));
						var2.d9();
						if (var2.mQ[0] == -1) {
							((c_ao) c_a5.es.cf().elementAt(1)).a("整理", 0);
						}
					}
				} else {
					var3 = var0.readByte();
					c_b5.method_case("背包可用的格数 = " + var3);
					var2.j((short) var3);
					var2.d0();

					for (var4 = 0; var4 < var3; ++var4) {
						var5 = var0.readShort();
						var2.mW[var4] = var5;
						var2.mI[var4] = c_r.k((short) (var5 % 1000));
						var2.nu[var4] = var0.readByte();
						var2.nv[var4] = true;
						var2.mV[var4] = var0.readUTF();
						var2.ne[var4] = var0.readByte();
						var2.method_do(var4, var5);
						var2.mN[var4] = var0.readInt();
					}

					if (var3 != 0) {
						var2.method_if(var2.mV[var2.ep()], c_r.E(var2.ne[var2.ep()]));
						var2.d9();
						c_ao var10;
						switch (c_a5.es.g9) {
						case 2555907:
						case 2555915:
							if (!var2.mV[0].equals("") && var2.mV[0] != null) {
								return;
							}

							var10 = (c_ao) c_a5.es.cf().elementAt(1);
							break;
						case 2555936:
							if (var1 == 167 || var1 == 164) {
								var10 = (c_ao) c_a5.es.cf().elementAt(1);
								if (!var2.mV[0].equals("") && var2.mV[0] != null) {
									var10.a("操作", 0);
									return;
								}
								break;
							}

							return;
						default:
							return;
						}

						var10.a("", 0);
					}

					return;
				}

			}
		} else {
			var3 = var0.readByte();
			var2.j((short) var3);

			for (var4 = 0; var4 < var3; ++var4) {
				var2.mQ[var4] = var0.readInt();
				c_b5.method_case("--- stuffId[" + var4 + "] = " + var2.mQ[var4]);
				var5 = var0.readShort();
				var2.mW[var4] = var5;
				c_b5.method_case("--- imageFullID = " + var5);
				var2.mI[var4] = c_r.k((short) (var5 % 1000));
				var2.mN[var4] = var0.readInt();
				c_b5.method_case("--- grid.stuffPrice[" + var4 + "] = " + var2.mN[var4]);
				var2.nu[var4] = var0.readByte();
				c_b5.method_case("--- grid.stuffNumber[" + var4 + "] = " + var2.nu[var4]);
				var2.mV[var4] = var0.readUTF();
				c_b5.method_case("--- grid.stuffName[" + var4 + "] = " + var2.mV[var4]);
				var2.ne[var4] = var0.readByte();
				var2.nv[var4] = var0.readBoolean();
				c_b5.method_case("--- stuffShowMiniNum[" + var4 + "] = " + var2.nv[var4]);
				var2.nm[var4] = var0.readByte();
				c_b5.method_case("--- stuffMaxNum[" + var4 + "] = " + var2.nm[var4]);
				var2.method_do(var4, var5);
				if (var1 == 53) {
					var2.mu[var4] = var0.readByte();
					c_b5.method_case("--- stuffGroupNum[" + var4 + "] = " + var2.mu[var4]);
				}

				var2.method_if(var2.mV[var2.ep()], c_r.E(var2.ne[var2.ep()]));
			}

			var2.d9();
		}
	}

	private static void a$3da4a85(DataInputStream var0, short var1, ak var2, int var3) throws IOException {
		int var5;
		if (var1 != 8 && var1 != 17 && var1 != 21 && var1 != 23 && var1 != 22 && var1 != 63 && var1 != 55 && var1 != 57
				&& var1 != 61 && var1 != 62 && var1 != 68 && var1 != 66 && var1 != 69 && var1 != 81 && var1 != 90
				&& var1 != 97 && var1 != 104 && var1 != 109 && var1 != 114 && var1 != 120 && var1 != 126 && var1 != 142
				&& var1 != 147 && var1 != 1) {
			if (var1 == 135) {
				byte var7;
				bo.n = new String[var7 = var0.readByte()];

				for (var5 = 0; var5 < var7; ++var5) {
					bo.n[var5] = var0.readUTF();
				}

				if (var3 == 2424833) {
					((ak) c_a5.es.cf().elementAt(8)).method_if(bo.n[0]);
					return;
				}

				if (var3 == 2424840) {
					((ak) c_a5.es.cf().elementAt(5)).method_if(bo.n[0]);
				}
			}

		} else {
			String var4 = var0.readUTF();
			c_b5.method_case("" + var4);
			var5 = var0.readInt();
			var2.method_else(var5);
			ak.bu = System.currentTimeMillis();
			var2.method_if(var4);
			var2.ap();
			if (var1 == 17) {
				var2.bQ = 0;
			} else if (var1 == 21) {
				var2.bQ = 1;
			} else if (var1 == 23) {
				var2.bQ = 2;
			} else if (var1 == 22) {
				var2.bQ = 3;
			} else if (var1 == 55) {
				var2.bQ = 4;
			} else if (var1 == 57) {
				var2.bQ = 5;
			} else if (var1 == 61) {
				var2.bQ = 6;
			} else if (var1 == 62) {
				var2.bQ = 7;
			} else if (var1 == 63) {
				var2.bQ = 8;
			} else if (var1 == 68) {
				var2.bQ = 9;
			} else if (var1 == 81) {
				var2.bQ = 10;
			} else if (var1 == 90) {
				var2.bQ = 11;
			} else if (var1 == 97) {
				var2.bQ = 12;
			} else if (var1 == 104) {
				var2.bQ = 13;
			} else if (var1 == 109) {
				var2.bQ = 14;
			} else if (var1 == 114) {
				var2.bQ = 15;
			} else if (var1 == 120) {
				var2.bQ = 16;
			} else if (var1 == 126) {
				var2.bQ = 17;
			} else if (var1 == 142) {
				var2.bQ = 18;
			} else if (var1 == 147) {
				var2.bQ = 19;
			} else if (var1 == 1) {
				if (var3 == 2555977) {
					((c_ao) c_a5.es.cf().elementAt(0)).method_do(az.k);
				} else if (var3 == 2425077) {
					String var6 = var0.readUTF();
					((c_ao) c_a5.es.cf().elementAt(0)).method_do(var6);
					c_be.g3 = 0;
				}
			}

			var2.ap();
		}
	}

	private static void a$1a0c41af(DataInputStream var0, short var1, a7 var2) throws IOException {
		String var3;
		short var4;
		int var9;
		if (var1 != 0 && (var1 != 19 || var2.method_char() != 0)) {
			byte var13;
			if (var1 == 5 && var2.method_char() == 1) {
				var13 = var0.readByte();
				var2.method_long(var13);
			} else if (var1 == 5 && var2.method_char() == 2) {
				var13 = var0.readByte();
				var2.eT = true;
				var2.ei = var13;
				var2.a(c_a5.hL);
			} else {
				String var17;
				if ((var1 == 36 || var1 == 37) && var2.method_char() == 2) {
					boolean var26 = var0.readBoolean();
					var17 = null;
					if (var1 != 36) {
						var2.fg = 3;
						a7.em = var26;
						return;
					}

					var2.fg = 0;
					a7.ej = var26;
				} else {
					String var10;
					short var21;
					if (var1 == 3 && var2.method_char() == 1) {
						var21 = var0.readShort();
						var2.g(var21);
						var2.ft = true;
						var4 = (short) (var21 % 1000);
						var2.method_if(var4, true);
						var2.a(c_a5.gg);
						if (c_a5.es.g9 != 2424995 && c_a5.es.g9 != 2425079) {
							if (c_a5.es.g9 == 2555906) {
								var10 = var0.readUTF();
								az.field_byte[az.n] = var10;
								++az.n;
							}

							return;
						}

						if (bo.I[bo.N] == 1) {
							var2.g(false);
						} else if (bo.I[bo.N] > 1) {
							var2.a(true, bo.I[bo.N]);
						}

						bo.D = true;
						((c_ao) c_a5.es.cf().elementAt(0)).method_do("商品介绍");
					} else {
						byte var5;
						short var6;
						if (var1 == 16 && var2.method_char() == 3) {
							var13 = var0.readByte();
							var4 = var0.readShort();
							var2.g(var4);
							var10 = var0.readUTF();
							var5 = var0.readByte();
							var6 = (short) (var4 % 1000);
							var2.fz = true;
							var2.e(var6);
							var2.a(c_a5.gg);
							var2.method_else(var10);
							var2.h(var13);
							var2.l(var5);
							return;
						}

						short var28;
						if (var1 == 115 && var2.method_char() == 3) {
							var13 = var0.readByte();
							var4 = var0.readShort();
							var2.g(var4);
							var10 = var0.readUTF();
							var5 = var0.readByte();
							var6 = var0.readShort();
							var28 = var0.readShort();
							int var27 = var0.readInt();
							var4 = (short) (var4 % 1000);
							var2.fz = true;
							var2.e(var4);
							var2.a(c_a5.gg);
							var2.method_else(var10);
							var2.h(var13);
							var2.f(var6);
							var2.d(var28);
							var2.h(var27);
							var2.l(var5);
							return;
						}

						byte var25;
						if ((var1 == 34 || var1 == 35) && var2.method_char() == 1) {
							var21 = var0.readShort();
							c_b5.method_case("AAAAAAAAAAAAAAAAA wpID = " + var21);
							var17 = var0.readUTF();
							c_b5.method_case("BBBBBBBBBBBBBBBBB name = " + var17);
							byte var15 = var0.readByte();
							c_b5.method_case("CCCCCCCCCCCCCCCCC num = " + var15);
							var5 = var0.readByte();
							var25 = var0.readByte();
							c_b5.method_case("DDDDDDDDDDDDDDDDD color = " + var25);
							var2.g(var21);
							var2.ft = true;
							var28 = (short) (var21 % 1000);
							var2.ft = true;
							var2.method_if(var28, true);
							var2.a(c_a5.gg);
							var2.method_else(var17);
							var2.h(var5);
							var2.l(var25);
							if (var15 <= 0) {
								var2.g(false);
								return;
							}

							var2.a(true, var15);
						} else {
							if ((var1 == 40 || var1 == 41) && var2.method_char() == 1) {
								var21 = var0.readShort();
								var2.g(var21);
								var2.ft = true;
								var4 = (short) (var21 % 1000);
								var2.ft = true;
								var2.method_if(var4, true);
								var2.a(c_a5.gg);
								return;
							}

							String var8;
							int var16;
							byte var18;
							if (var1 == 27) {
								c_a5.hw = var0.readBoolean();
								c_b5.method_case("rec data=" + c_a5.hw);
								if (c_a5.hw) {
									var16 = var0.readInt();
									var17 = var0.readUTF();
									var9 = var0.readInt();
									var5 = var0.readByte();
									var25 = var0.readByte();
									byte var7 = var0.readByte();
									var8 = var0.readUTF();
									c_a5.cy[c_a5.h6] = var16;
									c_a5.e0[c_a5.h6] = var17;
									c_a5.im[c_a5.h6] = var9;
									c_a5.fZ[c_a5.h6] = var5;
									c_a5.hE[c_a5.h6] = var25;
									c_a5.d3[c_a5.h6] = var8;
									c_a5.iC[c_a5.h6] = var2;
									c_a5.eI[c_a5.h6] = var7;
									var2.eo = new c_b((short) 0, (short) 0, c_a5.fZ[c_a5.h6], c_a5.hE[c_a5.h6],
											c_a5.eI[c_a5.h6]);
									c_l.a(var2.eo);
									boolean var23 = false;
									var10 = null;
									var3 = null;
									c_b var24;
									if ((var24 = var2.eo) == null) {
										c_b5.method_case("**********NO Found Player***********");
									} else {
										short[][] var19 = new short[var18 = var0.readByte()][];
										byte[] var14 = new byte[var18];
										c_b5.method_case("登录换装数量 :" + var18);

										for (var25 = 0; var25 < var18; ++var25) {
											var0.readByte();
											var14[var25] = var0.readByte();
											c_b5.method_case("-bodywhere[" + var25 + "]=" + var14[var25]);
											byte var11;
											if (var14[var25] > 0) {
												var11 = var0.readByte();
												var19[var25] = new short[var11];

												for (var7 = 0; var7 < var11; ++var7) {
													var19[var25][var7] = var0.readShort();
													c_b5.method_case("+++++pf[" + var25 + "][" + var7 + "]="
															+ var19[var25][var7]);
												}
											} else if (var14[var25] < 0) {
												var11 = (byte) bz.aL[Math.abs(var14[var25]) - 1
														+ (var24.C() - 1) * (bz.aL.length / 2)].length;
												var19[var25] = new short[var11];
												c_b5.method_case("-yyc=" + var11 + "--ind=" + (Math.abs(var14[var25])
														- 1 + (var24.C() - 1) * (bz.aL.length / 2)));

												for (var7 = 0; var7 < var11; ++var7) {
													var19[var25][var7] = bz.aL[Math.abs(var14[var25]) - 1
															+ (var24.C() - 1) * (bz.aL.length / 2)][var7];
													c_b5.method_case("-----pf[" + var25 + "][" + var7 + "]="
															+ var19[var25][var7]);
												}
											} else {
												c_b5.method_case("出错了，不应该有0数值传输！");
											}
										}
									}

									var25 = var0.readByte();
									c_a5.hV[c_a5.h6] = var25;
									c_b5.method_case(
											"MainCanvas.m_bDelete[MainCanvas.m_bChooseCounter]=" + c_a5.hV[c_a5.h6]);
									boolean var12 = var0.readBoolean();
									c_a5.g3[c_a5.h6] = var12;
									c_b5.method_case("MainCanvas.m_bAmendNickname[MainCanvas.m_bChooseCounter]="
											+ c_a5.g3[c_a5.h6]);
								}

								++c_a5.h6;
								c_b5.method_case("MainCanvas.m_bChooseID=" + c_a5.h6);
								return;
							}

							if (var1 == 161) {
								var13 = var0.readByte();
								var2.method_goto(var13);
								if (var13 != 0) {
									var17 = var0.readUTF();
									var2.method_long(var17);
									var10 = var0.readUTF();
									var2.method_goto(var10);
									var5 = var0.readByte();
									var2.d(var5);
									var0.readByte();
									var0.readByte();
									var8 = var0.readUTF();
									var2.method_char(var8);
									var18 = var0.readByte();
									var2.m(var18);
									var1 = var0.readShort();
									var16 = var0.readInt();
									var2.i(var16);
									int var22 = var0.readInt();
									var2.j(var22);
									var2.g(var1);
									var2.ft = true;
									var6 = (short) (var1 % 1000);
									var2.method_if(var6, true);
									var2.a(c_a5.gg);
									return;
								}

								var2.method_long("");
								var2.method_goto("");
								var2.d((byte) 0);
								var2.method_char("");
								var2.m((byte) -1);
								var2.i(0);
								var2.j(0);
							} else if (var1 == 175) {
								var13 = var0.readByte();
								var2.method_goto(var13);
								int var20 = var0.readInt();
								var2.g(var20);
								var2.ft = true;
								var1 = (short) (var20 % 1000);
								var2.ft = true;
								var2.method_if(var1, true);
								var2.a(c_a5.gg);
								am.field_case[am.field_try] = var0.readUTF();
								if (++am.field_try >= 5) {
									((ak) c_a5.es.cf().elementAt(13)).method_if(am.field_case[0]);
								}
							}
						}
					}
				}

			}
		} else {
			var3 = var0.readUTF();
			c_b5.method_case("NPC图片名称：" + var3);
			var4 = var0.readShort();
			var9 = var0.readInt();
			c_b5.method_case("-----------------------targetID : " + var9);
			var2.method_void(var4);
			var2.k(var9);
		}
	}

	private static void a(DataInputStream var0, short var1, c_bg var2, int var3, c_be var4) throws IOException {
		byte var5;
		ba[] var6;
		v var7;
		short[] var8;
		Object var9;
		int var10;
		int var11;
		String var12;
		short var13;
		String var14;
		v var15;
		int var16;
		Object var17;
		short var18;
		short var19;
		ah var20;
		ah var21;
		short var22;
		boolean[] var30;
		short var31;
		int var35;
		String var39;
		byte var40;
		int var41;
		int var44;
		v var45;
		boolean var50;
		int var53;
		v var56;
		int var58;
		a7 var60;
		ah var62;
		ah var63;
		short var64;
		a7 var65;
		ah var68;
		short var69;
		a7 var71;
		String var73;
		short var76;
		ah var77;
		a7 var78;
		if (var1 == 67) {
			var2.a((v) null);
			var5 = var0.readByte();
			var6 = new ba[3];
			var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
			var9 = null;

			for (var10 = 0; var10 < var7.a().size(); ++var10) {
				var6[var10] = (ba) var7.a().elementAt(var10);
			}

			var31 = var7.method_for();
			var2.cE();

			for (var11 = 0; var11 < var5; ++var11) {
				var12 = var0.readUTF();
				var13 = var0.readShort();
				var14 = var0.readUTF();
				(var15 = new v()).a(3);
				var15.method_int(var31);
				var15.a(var8);
				var15.method_if((short) (var2.v() + 3 + 1 + 1));
				var15.a((short) (var2.method_long() + 1 + 1 + 1 + var11 * var31));

				for (var16 = 0; var16 < 3; ++var16) {
					var17 = null;
					var18 = (short) (var2.v() + 3 + 1 + 1);
					var19 = (short) (var2.method_long() + 1 + 1 + 1);
					if (var16 == 0) {
						var20 = (ah) var6[var16];
						(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
								var20.method_char(), var20.aj(), var4)).a2 = true;
						var21.aN = (short) (var8[var16] * c_a5.ic / 176);
						var21.a(var12);
						var21.method_new((short) (var18 + (var15.method_if((byte) var16) + 1) * c_a5.ic / 176));
						var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var17 = var21;
					} else if (var16 == 1) {
						var60 = (a7) var6[var16];
						var65 = new a7(var60.v(), var60.method_long(), var60.method_for(), var60.z(), (String) null,
								var60.method_char(), var4);
						if (var13 != -1) {
							var65.g(var13);
							var65.ft = true;
							var22 = (short) (var13 % 1000);
							var65.method_if(var22, true);
						}

						var65.a(c_a5.gg);
						var65.method_new((short) (var18 + (var15.method_if((byte) var16) + 1) * c_a5.ic / 176));
						var65.method_for((short) (var19 + var11 * var31 + (var31 - var65.bE().a) / 2));
						if (var13 == -1) {
							var65.a((bi) null);
						}

						var17 = var65;
					} else if (var16 == 2) {
						var20 = (ah) var6[var16];
						(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
								var20.method_char(), var20.aj(), var4)).a2 = true;
						var21.aN = (short) (var8[var16] * c_a5.ic / 176);
						var21.a(var14);
						var21.method_new((short) (var18 + (var15.method_if((byte) var16) + 1) * c_a5.ic / 176));
						var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var17 = var21;
						if (var11 == 0) {
							if (au.field_case == 1) {
								((c_ao) c_a5.es.cf().elementAt(1)).a("查看", 0);
							} else if (var14.equals("")) {
								((c_ao) c_a5.es.cf().elementAt(1)).a("镶嵌", 0);
							} else {
								((c_ao) c_a5.es.cf().elementAt(1)).a("操作", 0);
							}
						}
					} else {
						c_b5.method_case("不正确的控件");
					}

					var15.a((ba) var17);
				}

				var2.method_if(var15);
			}

			if (c_a5.es.g9 == 1966081) {
				var2.h0 = 11;
			} else if (c_a5.es.g9 == 1966087) {
				var2.h0 = 12;
			} else if (c_a5.es.g9 == 1966100) {
				var2.h0 = 13;
				((c_ao) c_a5.es.cf().elementAt(1)).a("操作", 0);
			}

			var2.cP();
		} else {
			short[] var29;
			byte var42;
			int var57;
			if (var1 != 9 && var1 != 12 && var1 != 14 && var1 != 24 && var1 != 72 && var1 != 156) {
				boolean[] var34;
				short var36;
				if (var1 != 30 && var1 != 74) {
					if (var1 != 127 && var1 != 128) {
						if (var1 == 75) {
							var5 = var0.readByte();
							c_b5.method_case("USER_NPC_TABLE num = " + var5);
							var6 = new ba[2];
							var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
							(var29 = new short[2])[0] = 1;
							var29[1] = 31;
							var34 = var7.method_if();

							for (var11 = 0; var11 < var7.a().size(); ++var11) {
								var6[var11] = (ba) var7.a().elementAt(var11);
							}

							var36 = var7.method_for();
							var2.cE();

							for (var35 = 0; var35 < var5; ++var35) {
								var39 = var0.readUTF();
								var14 = var0.readUTF();
								c_b5.method_case("---name= " + var39 + " leve = " + var14 + " ----");
								(var15 = new v()).a(2);
								var15.method_int(var36);
								var15.a(var8);
								var15.method_if((short) (var2.v() + 3 + 1 + 1));
								var15.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for()
										+ var35 * var36));

								for (var16 = 0; var16 < 2; ++var16) {
									var63 = null;
									var18 = (short) (var2.v() + 3 + 1 + 1);
									var19 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
									if (var29[var16] == 1 && var6[var16] instanceof ah) {
										var20 = (ah) var6[var16];
										(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
												var20.method_char(), var20.aj(), var4)).a(var39);
										var22 = 0;
										if (var34[var16]) {
											var22 = (short) ((var8[var16] - var21.method_for()) / 2);
										}

										var21.method_new((short) ((var18 + var15.method_if((byte) var16) + var22 + 1)
												* c_a5.ic / 176));
										var21.method_for((short) (var19 + var35 * var36 + (var36 - c_a5.iG) / 2));
										var21.a2 = true;
										var21.aN = (short) (var8[var16] * c_a5.ic / 176);
										var63 = var21;
									} else if (var29[var16] == 31 && var6[var16] instanceof ah) {
										var20 = (ah) var6[var16];
										(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
												var20.method_char(), var20.aj(), var4)).a(var14);
										var22 = 0;
										if (var34[var16]) {
											var22 = (short) ((var8[var16] - var21.method_for()) / 2);
										}

										var21.method_new((short) ((var18 + var15.method_if((byte) var16) + var22 + 1)
												* c_a5.ic / 176));
										var21.method_for((short) (var19 + var35 * var36 + (var36 - c_a5.iG) / 2));
										var21.a2 = true;
										var21.aN = (short) (var8[var16] * c_a5.ic / 176);
										var63 = var21;
									} else {
										c_b5.method_case("不正确的控件");
									}

									var15.a(var63);
								}

								var2.method_if(var15);
							}

							var2.cP();
						} else if (var1 == 39) {
							var2.a((v) null);
							c_be.hl = new int[var5 = var0.readByte()];
							c_be.hk = new int[var5];
							c_be.gq = new byte[var5];
							c_b5.method_case("USER_MAIL_TABLE num = " + var5);
							var6 = new ba[3];
							var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
							var9 = null;

							for (var10 = 0; var10 < var7.a().size(); ++var10) {
								var6[var10] = (ba) var7.a().elementAt(var10);
							}

							var31 = var7.method_for();
							var2.cE();

							for (var11 = 0; var11 < var5; ++var11) {
								long var43 = var0.readLong();
								var42 = var0.readByte();
								var50 = var0.readBoolean();
								String var52 = var0.readUTF();
								String var67 = null;
								if (var42 == 0) {
									var67 = "未读";
								} else if (var42 == 1) {
									var67 = "已读未回复";
								} else if (var42 == 2) {
									var67 = "已读并回复";
								}

								c_b5.method_case("---邮件名 " + var52 + " 邮件ID " + var43 + " 是否阅读 " + var67 + " 邮件类型 "
										+ (var50 ? "付费" : "普通") + " ----");
								v var66;
								(var66 = new v()).a(3);
								var66.method_int(var31);
								var66.a(var8);
								var66.method_if((short) (var2.v() + 3 + 1 + 1));
								var66.a((short) (var2.method_long() + 1 + 1 + 1 + var11 * var31));
								var66.field_try = var43;

								for (var57 = 0; var57 < 3; ++var57) {
									Object var70 = null;
									var69 = (short) (var2.v() + 3 + 1 + 1);
									var22 = (short) (var2.method_long() + 1 + 1 + 1);
									if (var57 == 0) {
										var78 = (a7) var6[var57];
										a7 var79 = new a7(var78.v(), var78.method_long(), var78.method_for(), var78.z(),
												(String) null, var78.method_char(), var4);
										if (var42 == 0) {
											c_be.gq[var11] = 1;
										} else if (var42 == 1) {
											c_be.gq[var11] = 2;
										} else if (var42 == 2) {
											c_be.gq[var11] = 3;
										}

										var79.eT = true;
										c_be.hl[var11] = var69 + var66.method_if((byte) var57) + 4;
										c_be.hk[var11] = var22 + var11 * var31 + (var31 - 13) / 2 + 5;
										var70 = var79;
									} else {
										ah var80;
										if (var57 == 1) {
											var77 = (ah) var6[var57];
											var80 = new ah(var77.v(), var77.method_long(), var77.method_for(),
													var77.z(), var77.method_char(), var77.aj(), var4);
											if (var50) {
												var80.a("付费");
											} else {
												var80.a("普通");
											}

											var80.method_new((short) (var69
													+ (var66.method_if((byte) var57) + 1) * c_a5.ic / 176));
											var80.method_for((short) (var22 + var11 * var31 + (var31 - c_a5.iG) / 2));
											var70 = var80;
										} else if (var57 == 2) {
											var77 = (ah) var6[var57];
											(var80 = new ah(var77.v(), var77.method_long(), var77.method_for(),
													var77.z(), var77.method_char(), var77.aj(), var4)).a(var52);
											var80.method_new((short) (var69
													+ (var66.method_if((byte) var57) + 1) * c_a5.ic / 176));
											var80.method_for((short) (var22 + var11 * var31 + (var31 - c_a5.iG) / 2));
											var70 = var80;
										} else {
											c_b5.method_case("不正确的控件");
										}
									}

									var66.a((ba) var70);
								}

								var2.method_if(var66);
							}

							var2.h0 = 6;
							var2.cP();
						}
					} else {
						var5 = var0.readByte();
						c_b5.method_case("USER_MUST_GET_TASK_TABLE num = " + var5);
						var6 = new ba[2];
						var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
						var30 = var7.method_if();

						for (var10 = 0; var10 < var7.a().size(); ++var10) {
							var6[var10] = (ba) var7.a().elementAt(var10);
						}

						var31 = var7.method_for();
						var2.cE();

						for (var11 = 0; var11 < var5; ++var11) {
							var40 = var0.readByte();
							c_b5.method_case("~~~~~~~~~~~~~payType = " + var40);
							var13 = var0.readShort();
							c_b5.method_case("~~~~~~~~~~~~~~~goodsID = " + var13);
							var14 = var0.readUTF();
							c_b5.method_case("~~~~~~~~~~~~~~payStr = " + var14);
							(var15 = new v()).a(2);
							var15.method_int(var31);
							var15.a(var8);
							var15.method_if((short) (var2.v() + 3 + 1 + 1));
							var15.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var11 * var31));
							var15.a(var40);

							for (var16 = 0; var16 < 2; ++var16) {
								var17 = null;
								var18 = (short) (var2.v() + 3 + 1 + 1);
								var19 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
								if (var16 == 0) {
									var60 = (a7) var6[var16];
									var65 = new a7(var60.v(), var60.method_long(), var60.method_for(), var60.z(),
											(String) null, var60.method_char(), var4);
									if (var40 == 1) {
										(var65 = new a7(var18, var19, (short) 0, (short) 0, (String) null, (byte) 1,
												var4)).a(c_a5.gg);
										var65.ft = true;
										var22 = (short) (var13 % 1000);
										var65.method_if(var22, true);
									} else if (var40 == 2) {
										var65 = new a7(var18, var19, (short) 0, (short) 0, "exp.png", (byte) 1, var4);
									} else if (var40 == 3) {
										var65 = new a7(var18, var19, (short) 0, (short) 0, "u-8.png", (byte) 1, var4);
									} else if (var40 == 4) {
										var65 = new a7(var18, var19, (short) 0, (short) 0, "u-2.png", (byte) 1, var4);
									} else if (var40 == 5) {
										var65 = new a7(var18, var19, (short) 0, (short) 0, "u-3.png", (byte) 1, var4);
									} else if (var40 == 6) {
										var65 = new a7(var18, var19, (short) 0, (short) 0, "exp.png", (byte) 1, var4);
									} else if (var40 == 7) {
										var65 = new a7(var18, var19, (short) 0, (short) 0, "cross.png", (byte) 1, var4);
									} else if (var40 == 8) {
										var65 = new a7(var18, var19, (short) 0, (short) 0, "long.png", (byte) 1, var4);
									}

									var65.method_new((short) (var18 + var15.method_if((byte) var16) + 1));
									var65.method_for((short) (var19 + var11 * var31 + (var31 - var65.bE().a) / 2));
									var17 = var65;
								} else if (var16 == 1) {
									var20 = (ah) var6[var16];
									(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
											var20.method_char(), var20.aj(), var4)).a2 = true;
									var21.aN = (short) ((var8[var16] - 20) * c_a5.ic / 176);
									var21.a(var14);
									var22 = 0;
									if (var30[var16]) {
										var22 = (short) ((var8[var16] - var21.method_for()) / 2);
									}

									var21.method_new((short) ((var18 + var15.method_if((byte) var16) + var22 + 1)
											* c_a5.ic / 176));
									var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
									var17 = var21;
								} else {
									c_b5.method_case("不正确的控件");
								}

								var15.a((ba) var17);
							}

							var2.method_if(var15);
						}

						if (var1 == 128) {
							var2.h0 = 10;
						}

						var2.cP();
					}
				} else {
					var5 = var0.readByte();
					c_b5.method_case("USER_NPC_TABLE num = " + var5);
					var6 = new ba[2];
					var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
					(var29 = new short[2])[0] = 1;
					var29[1] = 31;
					var34 = var7.method_if();

					for (var11 = 0; var11 < var7.a().size(); ++var11) {
						var6[var11] = (ba) var7.a().elementAt(var11);
					}

					var36 = var7.method_for();
					var2.cE();

					for (var35 = 0; var35 < var5; ++var35) {
						var39 = var0.readUTF();
						var14 = var0.readUTF();
						short var47 = var0.readShort();
						short var48 = var0.readShort();
						c_b5.method_case("---name= " + var39 + " x= " + var47 + " y= " + var48 + " ----");
						(var56 = new v()).a(2);
						var56.method_int(var36);
						var56.a(var8);
						var56.method_if((short) (var2.v() + 3 + 1 + 1));
						var56.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var35 * var36));
						var56.field_void = var47;
						var56.field_goto = var48;

						for (var58 = 0; var58 < 2; ++var58) {
							var62 = null;
							var64 = (short) (var2.v() + 3 + 1 + 1);
							var69 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
							if (var29[var58] == 1 && var6[var58] instanceof ah) {
								var68 = (ah) var6[var58];
								(var77 = new ah(var68.v(), var68.method_long(), var68.method_for(), var68.z(), (byte) 6,
										var68.aj(), var4)).a(var39);
								var76 = 0;
								if (var34[var58]) {
									var76 = (short) ((var8[var58] - var77.method_for()) / 2);
								}

								var77.method_new(
										(short) ((var64 + var56.method_if((byte) var58) + var76 + 1) * c_a5.ic / 176));
								var77.method_for((short) (var69 + var35 * var36 + (var36 - c_a5.iG) / 2));
								var77.a2 = true;
								var77.aN = (short) (var8[var58] * c_a5.ic / 176);
								var62 = var77;
							} else if (var29[var58] == 31 && var6[var58] instanceof ah) {
								var68 = (ah) var6[var58];
								(var77 = new ah(var68.v(), var68.method_long(), var68.method_for(), var68.z(),
										var68.method_char(), var68.aj(), var4)).a(var14);
								var76 = 0;
								if (var34[var58]) {
									var76 = (short) ((var8[var58] - var77.method_for()) / 2);
								}

								var77.method_new(
										(short) ((var64 + var56.method_if((byte) var58) + var76 + 1) * c_a5.ic / 176));
								var77.method_for((short) (var69 + var35 * var36 + (var36 - c_a5.iG) / 2));
								var77.a2 = true;
								var77.aN = (short) (var8[var58] * c_a5.ic / 176);
								var62 = var77;
							} else {
								c_b5.method_case("不正确的控件");
							}

							var56.a(var62);
						}

						var2.method_if(var56);
					}

					if (var0.readBoolean()) {
						for (var41 = 0; var41 < var5; ++var41) {
							var42 = var0.readByte();
							System.out.println(var41 + " ~~~taskIconType = " + var42);
							((ah) ((v) var2.cD().elementAt(var41)).a().elementAt(0)).aK = var42;
						}
					}

					if (var1 == 30) {
						var2.h0 = 4;
					}

					var2.cP();
				}
			} else {
				if (var1 == 24) {
					var2.k(var0.readBoolean());
				}

				var2.cI().a("族", (byte) 1);
				byte var26 = var2.cF();
				c_b5.method_case("showRow = " + var26);
				ba[] var27 = new ba[var26];
				v var28;
				var29 = (var28 = (v) var2.cD().elementAt(0)).method_case();

				for (var10 = 0; var10 < var29.length; ++var10) {
					c_b5.method_case("itemW = " + var29[var10]);
				}

				short[] var32 = new short[var26];
				boolean[] var33 = var28.method_if();

				for (var35 = 0; var35 < var28.a().size(); ++var35) {
					var27[var35] = (ba) var28.a().elementAt(var35);
				}

				short var37 = var28.method_for();
				var2.cE();
				byte var38 = var0.readByte();
				c_b5.method_case("line = " + var38);
				var42 = var0.readByte();
				c_b5.method_case("subRow = " + var42);

				for (var44 = 0; var44 < var26; ++var44) {
					var32[var44] = var0.readShort();
					System.out.println("userDataType[" + var44 + "] " + var32[var44]);
				}

				for (var44 = 0; var44 < var38; ++var44) {
					(var45 = new v()).a(var26);
					var45.method_int((short) (var37 + 6));
					var45.a(var29);
					var45.method_if((short) (var2.v() + 3 + 1 + 1));
					var45.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var44 * var37));

					for (var53 = 0; var53 < var42; ++var53) {
						Object var51 = null;
						if (var53 >= var26) {
							if (var53 == 3) {
								var57 = var0.readInt();
								var45.field_new = var57;
								c_b5.method_case("playerId = " + var57);
							} else if (var53 == 4) {
								boolean var59 = var0.readBoolean();
								var45.field_else = var59;
								c_b5.method_case("olState = " + var59);
							} else if (var53 == 5) {
								byte var61 = var0.readByte();
								c_b5.method_case("--------------------camp-------------------= " + var61);
								var45.field_byte = var61;
							}
						} else {
							var19 = (short) (var2.v() + 3 + 1 + 1);
							var64 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
							c_b5.method_case("^^^^^^^^^^^^^^^^^^ userDataType[" + var53 + "] = " + var32[var53]);
							c_b5.method_case("^^^^^^^^^^^^^^^^^^ lineUic[" + var53 + "] = " + var27[var53]);
							if (var32[var53] == 5 && var27[var53] instanceof a7) {
								var65 = (a7) var27[var53];
								(var71 = new a7(var65.v(), var65.method_long(), var65.method_for(), var65.z(),
										(String) null, var65.method_char(), var4)).eT = true;
								byte var75 = var0.readByte();
								c_b5.method_case("the picId is " + var75);
								var71.ei = var75;
								var71.a(c_a5.hL);
								var76 = 0;
								if (var33[var53]) {
									var76 = (short) ((var29[var53] - var71.bE().field_try) / 2);
								}

								var71.method_new((short) (var19 + var45.method_if((byte) var53) + var76 + 1));
								var71.method_for((short) (var64 + var44 * var37 + (var37 - var71.bE().a) / 2));
								var51 = var71;
							} else if (var32[var53] == 1 && var27[var53] instanceof ah) {
								var21 = (ah) var27[var53];
								var68 = new ah(var21.v(), var21.method_long(), var21.method_for(), var21.z(),
										var21.method_char(), var21.aj(), var4);
								var73 = var0.readUTF();
								if (var53 == 1) {
									var73 = var73.substring(0, var73.length() - 1);
								}

								c_b5.method_case("the base str is " + var73);
								var68.a(var73);
								var76 = 0;
								if (var33[var53]) {
									var76 = (short) ((var29[var53] - var68.method_for()) / 2);
								}

								var68.method_new(
										(short) (var19 + (var45.method_if((byte) var53) + var76) * c_a5.ic / 176 + 1));
								var68.method_for((short) (var64 + var44 * var37 + (var37 - c_a5.iG) / 2));
								var51 = var68;
							} else if (var32[var53] == 2 && var27[var53] instanceof ah) {
								var21 = (ah) var27[var53];
								var68 = new ah(var21.v(), var21.method_long(), var21.method_char(), var4, (byte) 0);
								int var23 = var0.readInt();
								int var24 = var0.readInt();
								var68.method_case(var23);
								var68.method_byte(var24);
								short var25 = 0;
								if (var33[var53]) {
									var25 = (short) ((var29[var53] - c_b5.method_do(var23, var24)[0]) / 2 - 3);
								}

								var68.method_new(
										(short) (var19 + (var45.method_if((byte) var53) + var25) * c_a5.ic / 176));
								var68.method_for((short) (var64 + var44 * var37
										+ (var37 - c_b5.method_do(var23, var24)[1]) / 2 + 1));
								var51 = var68;
							} else {
								c_b5.method_case("不正确的控件");
							}

							var45.a((ba) var51);
						}
					}

					var2.method_if(var45);
				}

				var2.cM();
				var2.cN();
				var2.cS();
				var2.cP();
				if (var1 == 9) {
					if (var3 == 589834) {
						var2.h0 = 5;
					} else if (var3 != 2555912 && var3 != 1703945) {
						if (var3 != 2555941 && var3 != 2555943 && var3 != 2555945) {
							var2.h0 = 0;
						} else {
							var2.h0 = 18;
							c_ao var46 = (c_ao) c_a5.es.cf().elementAt(1);
							if (var38 == 0) {
								var46.a("", 0);
							} else {
								var46.a("赠送", 0);
							}
						}
					} else {
						if (var3 == 2555912) {
							var2.h0 = 16;
						} else if (var3 == 1703945) {
							var2.h0 = 0;
						}

						if (var38 == 0) {
							((c_ao) c_a5.es.cf().elementAt(1)).a("", 0);
						}
					}
				} else if (var1 == 12) {
					var2.h0 = 1;
				} else if (var1 == 14) {
					var2.h0 = 2;
				} else if (var1 == 24) {
					var2.h0 = 3;
				} else if (var1 == 72) {
					if (var3 == 589845) {
						var2.h0 = 8;
					} else if (var3 == 2555913) {
						var2.h0 = 17;
						if (var38 == 0) {
							((c_ao) c_a5.es.cf().elementAt(1)).a("", 0);
						}
					} else {
						var2.h0 = 8;
					}
				} else if (var1 == 156) {
					var2.h0 = 15;
				}
			}
		}

		int var49;
		if (var1 == 162) {
			var5 = var0.readByte();
			var6 = new ba[3];
			var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
			var9 = null;

			for (var10 = 0; var10 < var7.a().size(); ++var10) {
				var6[var10] = (ba) var7.a().elementAt(var10);
			}

			var31 = var7.method_for();
			var2.cE();

			for (var11 = 0; var11 < var5; ++var11) {
				var12 = var0.readUTF();
				var41 = var0.readInt();
				var49 = var0.readInt();
				(var15 = new v()).a(3);
				var15.method_int(var31);
				var15.a(var8);
				var15.method_if((short) (var2.v() + 3 + 1 + 1));
				var15.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var11 * var31));
				var15.field_else = true;

				for (var16 = 0; var16 < 3; ++var16) {
					var63 = null;
					var18 = (short) (var2.v() + 3 + 1 + 1);
					var19 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
					int var81;
					if (var16 == 0) {
						var20 = (ah) var6[var16];
						(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
								var20.method_char(), var20.aj(), var4)).a2 = true;
						var21.aN = (short) (var8[var16] * c_a5.ic / 176);
						var21.a(var12);
						var81 = c_a5.d8 ? -2 : 3;
						var21.method_new((short) ((var18 + var15.method_if((byte) var16) + var81) * c_a5.ic / 176));
						var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var63 = var21;
					} else if (var16 == 1) {
						var20 = (ah) var6[var16];
						(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
								var20.method_char(), var20.aj(), var4)).a(var41 + "");
						var21.method_new((short) ((var18 + var15.method_if((byte) var16) + 3) * c_a5.ic / 176));
						var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var63 = var21;
					} else if (var16 == 2) {
						var20 = (ah) var6[var16];
						(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
								var20.method_char(), var20.aj(), var4)).a2 = true;
						var21.aN = (short) (var8[var16] * c_a5.ic / 176);
						var21.a(var49 + "");
						var81 = c_a5.d8 ? -2 : 3;
						var21.method_new((short) ((var18 + var15.method_if((byte) var16) + var81) * c_a5.ic / 176));
						var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var63 = var21;
					} else {
						c_b5.method_case("不正确的控件");
					}

					var15.a(var63);
				}

				var2.method_if(var15);
			}

			var2.cN();
			var2.cS();
			var2.cP();
		} else if (var1 == 159) {
			var5 = var0.readByte();
			c_b5.method_case("USER_CLAN_MEMBER_TABLE num = " + var5);
			var6 = new ba[3];
			var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
			var9 = null;

			for (var10 = 0; var10 < var7.a().size(); ++var10) {
				var6[var10] = (ba) var7.a().elementAt(var10);
			}

			var31 = var7.method_for();
			var2.cE();

			for (var11 = 0; var11 < var5; ++var11) {
				var12 = var0.readUTF();
				var39 = var0.readUTF();
				var49 = var0.readInt();
				var50 = var0.readBoolean();
				(var45 = new v()).a(3);
				var45.method_int(var31);
				var45.a(var8);
				var45.method_if((short) (var2.v() + 3 + 1 + 1));
				var45.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var11 * var31));
				var45.field_else = true;

				for (var53 = 0; var53 < 3; ++var53) {
					ah var74 = null;
					var19 = (short) (var2.v() + 3 + 1 + 1);
					var64 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
					if (var53 == 0) {
						var21 = (ah) var6[var53];
						(var68 = new ah(var21.v(), var21.method_long(), var21.method_for(), var21.z(),
								var21.method_char(), var21.aj(), var4)).a(var12);
						var68.method_new((short) ((var19 + var45.method_if((byte) var53) + 3) * c_a5.ic / 176));
						var68.method_for((short) (var64 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var74 = var68;
					} else if (var53 == 1) {
						var21 = (ah) var6[var53];
						(var68 = new ah(var21.v(), var21.method_long(), var21.method_for(), var21.z(),
								var21.method_char(), var21.aj(), var4)).a(var39);
						var68.method_new((short) ((var19 + var45.method_if((byte) var53) + 3) * c_a5.ic / 176));
						var68.method_for((short) (var64 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var74 = var68;
					} else if (var53 == 2) {
						var21 = (ah) var6[var53];
						var68 = new ah(var21.v(), var21.method_long(), var21.method_for(), var21.z(),
								var21.method_char(), var21.aj(), var4);
						var73 = var50 ? "有" : "无";
						var68.a(var73);
						var68.method_new((short) ((var19 + var45.method_if((byte) var53) + 3) * c_a5.ic / 176));
						var68.method_for((short) (var64 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var74 = var68;
					} else {
						c_b5.method_case("不正确的控件");
					}

					var45.field_new = var49;
					var45.a(var74);
				}

				var2.method_if(var45);
			}

			var2.cN();
			var2.cS();
			var2.h0 = 7;
			var2.cP();
		} else if (var1 != 54 && var1 != 64) {
			if (var1 == 153) {
				var5 = var0.readByte();
				c_b5.method_case("USER_ACT_TABLE num = " + var5);
				var6 = new ba[2];
				var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
				var9 = null;

				for (var10 = 0; var10 < var7.a().size(); ++var10) {
					var6[var10] = (ba) var7.a().elementAt(var10);
				}

				var31 = var7.method_for();
				var2.cE();

				for (var11 = 0; var11 < var5; ++var11) {
					var35 = var0.readInt();
					var39 = var0.readUTF();
					var14 = var0.readUTF();
					(var15 = new v()).field_new = var35;
					var15.a(2);
					var15.method_int(var31);
					var15.a(var8);
					var15.method_if((short) (var2.v() + 3 + 1 + 1));
					var15.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var11 * var31));

					for (var16 = 0; var16 < 2; ++var16) {
						var63 = null;
						var18 = (short) (var2.v() + 3 + 1 + 1);
						var19 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
						if (var16 == 0) {
							var20 = (ah) var6[var16];
							(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
									var20.method_char(), var20.aj(), var4)).a2 = true;
							var21.aN = (short) (var8[var16] * c_a5.ic / 176);
							var21.a(var39);
							var21.method_new((short) (var18 + (var15.method_if((byte) var16) + 3) * c_a5.ic / 176));
							var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
							var63 = var21;
						} else if (var16 == 1) {
							var20 = (ah) var6[var16];
							(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
									var20.method_char(), var20.aj(), var4)).a2 = true;
							var21.aN = (short) ((var8[var16] - 24) * c_a5.ic / 176);
							var21.a(var14);
							var21.method_new((short) (var18 + (var15.method_if((byte) var16) + 3) * c_a5.ic / 176));
							var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
							var63 = var21;
						} else {
							c_b5.method_case("不正确的控件");
						}

						var15.a(var63);
					}

					var2.method_if(var15);
				}

				var2.h0 = 14;
				var2.cP();
			} else if (var1 == 169) {
				var5 = var0.readByte();
				var6 = new ba[3];
				var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
				var30 = var7.method_if();

				for (var10 = 0; var10 < var7.a().size(); ++var10) {
					var6[var10] = (ba) var7.a().elementAt(var10);
				}

				var31 = var7.method_for();
				var2.cE();

				for (var11 = 0; var11 < var5; ++var11) {
					var35 = var0.readInt();
					var39 = var0.readUTF();
					var14 = var0.readUTF();
					long var55 = var0.readLong();
					(var56 = new v()).field_for = var55;
					var56.a(3);
					var56.method_int(var31);
					var56.a(var8);
					var56.method_if((short) (var2.v() + 3 + 1 + 1));
					var56.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var11 * var31));

					for (var58 = 0; var58 < 3; ++var58) {
						var62 = null;
						var64 = (short) (var2.v() + 3 + 1 + 1);
						var69 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
						if (var58 == 0) {
							var68 = (ah) var6[var58];
							(var77 = new ah(var68.v(), var68.method_long(), var68.method_for(), var68.z(),
									var68.method_char(), var68.aj(), var4)).a2 = true;
							var77.aN = (short) (var8[var58] * c_a5.ic / 176);
							var77.a("" + var35);
							var76 = 0;
							if (var30[var58]) {
								var76 = (short) ((var8[var58] - var77.method_for()) / 2);
							}

							var77.method_new(
									(short) (var64 + (var56.method_if((byte) var58) + var76) * c_a5.ic / 176 + 3));
							var77.method_for((short) (var69 + var11 * var31 + (var31 - c_a5.iG) / 2));
							var62 = var77;
						} else if (var58 == 1) {
							var68 = (ah) var6[var58];
							(var77 = new ah(var68.v(), var68.method_long(), var68.method_for(), var68.z(),
									var68.method_char(), var68.aj(), var4)).a2 = true;
							var77.aN = (short) ((var8[var58] - 24) * c_a5.ic / 176);
							var77.a(var39);
							var76 = 0;
							if (var30[var58]) {
								var76 = (short) ((var8[var58] - var77.method_for()) / 2);
							}

							var77.method_new(
									(short) (var64 + (var56.method_if((byte) var58) + var76) * c_a5.ic / 176 + 3));
							var77.method_for((short) (var69 + var11 * var31 + (var31 - c_a5.iG) / 2));
							var62 = var77;
						} else if (var58 == 2) {
							var68 = (ah) var6[var58];
							(var77 = new ah(var68.v(), var68.method_long(), var68.method_for(), var68.z(),
									var68.method_char(), var68.aj(), var4)).a2 = true;
							var77.aN = (short) ((var8[var58] - 24) * c_a5.ic / 176);
							var77.a(var14);
							var77.method_new((short) (var64 + (var56.method_if((byte) var58) + 3) * c_a5.ic / 176));
							var77.method_for((short) (var69 + var11 * var31 + (var31 - c_a5.iG) / 2));
							var62 = var77;
						} else {
							c_b5.method_case("不正确的控件");
						}

						var56.a(var62);
					}

					var2.method_if(var56);
				}

				var2.h0 = 19;
				var2.cP();
			} else {
				if (var1 == 176) {
					var5 = var0.readByte();
					c_b5.method_case("USER_CLAN_FIGHT_TABLE num = " + var5);
					var6 = new ba[2];
					var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();

					for (var10 = 0; var10 < var7.a().size(); ++var10) {
						var6[var10] = (ba) var7.a().elementAt(var10);
					}

					var31 = var7.method_for();
					var2.cE();

					for (var11 = 0; var11 < var5; ++var11) {
						var35 = var0.readInt();
						var39 = var0.readUTF();
						var14 = var0.readUTF();
						(var15 = new v()).a(3);
						var15.method_int(var31);
						var15.a(var8);
						var15.method_if((short) (var2.v() + 3 + 1 + 1));
						var15.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var11 * var31));

						for (var16 = 0; var16 < 2; ++var16) {
							var63 = null;
							var18 = (short) (var2.v() + 3 + 1 + 1);
							var19 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
							if (var16 == 0) {
								var20 = (ah) var6[var16];
								(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
										var20.method_char(), var20.aj(), var4)).a(var39);
								var21.method_new((short) (var18 + (var15.method_if((byte) var16) + 5) * c_a5.ic / 176));
								var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
								var63 = var21;
							} else if (var16 == 1) {
								var20 = (ah) var6[var16];
								(var21 = new ah(var20.v(), var20.method_long(), var20.method_for(), var20.z(),
										var20.method_char(), var20.aj(), var4)).a(var14);
								var21.method_new((short) (var18 + (var15.method_if((byte) var16) + 5) * c_a5.ic / 176));
								var21.method_for((short) (var19 + var11 * var31 + (var31 - c_a5.iG) / 2));
								var63 = var21;
							} else {
								c_b5.method_case("不正确的控件");
							}

							var15.field_new = var35;
							var15.a(var63);
						}

						var2.method_if(var15);
					}

					var2.h0 = 20;
					var2.cP();
				}

			}
		} else {
			var5 = var0.readByte();
			c_b5.method_case("USER_CLAN_MEMBER_TABLE num = " + var5);
			var6 = new ba[3];
			var8 = (var7 = (v) var2.cD().elementAt(0)).method_case();
			var30 = var7.method_if();

			for (var10 = 0; var10 < var7.a().size(); ++var10) {
				var6[var10] = (ba) var7.a().elementAt(var10);
			}

			var31 = var7.method_for();
			var2.cE();

			for (var11 = 0; var11 < var5; ++var11) {
				var40 = var0.readByte();
				var39 = var0.readUTF();
				var14 = var0.readUTF();
				var44 = var0.readInt();
				boolean var54 = var0.readBoolean();
				(var56 = new v()).a(3);
				var56.method_int((short) (var31 + 6));
				var56.a(var8);
				var56.method_if((short) (var2.v() + 3 + 1 + 1));
				var56.a((short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for() + var11 * var31));
				var56.field_else = var54;

				for (var58 = 0; var58 < 3; ++var58) {
					Object var72 = null;
					var64 = (short) (var2.v() + 3 + 1 + 1);
					var69 = (short) (var2.method_long() + 1 + 1 + 1 + var2.cI().method_for());
					if (var58 == 0) {
						var71 = (a7) var6[var58];
						(var78 = new a7(var71.v(), var71.method_long(), var71.method_for(), var71.z(), (String) null,
								var71.method_char(), var4)).eT = true;
						var78.ei = var40;
						var78.a(c_a5.hL);
						var76 = 0;
						if (var30[var58]) {
							var76 = (short) ((var8[var58] - var78.bE().field_try) / 2);
						}

						var78.method_new((short) (var64 + var56.method_if((byte) var58) + var76 + 1));
						var78.method_for((short) (var69 + var11 * var31 + (var31 - var78.bE().a) / 2));
						var72 = var78;
					} else if (var58 == 1) {
						var68 = (ah) var6[var58];
						(var77 = new ah(var68.v(), var68.method_long(), var68.method_for(), var68.z(),
								var68.method_char(), var68.aj(), var4)).a(var39);
						var77.method_new((short) (var64 + (var56.method_if((byte) var58) + 3) * c_a5.ic / 176));
						var77.method_for((short) (var69 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var72 = var77;
					} else if (var58 == 2) {
						var68 = (ah) var6[var58];
						(var77 = new ah(var68.v(), var68.method_long(), var68.method_for(), var68.z(),
								var68.method_char(), var68.aj(), var4)).a(var14);
						var77.method_new((short) (var64 + (var56.method_if((byte) var58) + 3) * c_a5.ic / 176));
						var77.method_for((short) (var69 + var11 * var31 + (var31 - c_a5.iG) / 2));
						var77.a2 = true;
						var77.aN = (short) (var8[var58] * c_a5.ic / 176);
						var72 = var77;
					} else {
						c_b5.method_case("不正确的控件");
					}

					var56.field_new = var44;
					var56.a((ba) var72);
				}

				var2.method_if(var56);
			}

			var2.cN();
			var2.cS();
			var2.h0 = 7;
			var2.cP();
		}
	}

	private static void a$470cfd82(DataInputStream var0, short var1, ah var2, c_be var3) throws IOException {
		String var6;
		if (var1 == 1 && var2.method_char() == 0) {
			var6 = var0.readUTF();
			ah var10;
			if (var3.g9 == 393219 && (var10 = (ah) var3.cf().elementAt(7)) == var2) {
				short var5 = var10.method_for();
				var10.a2 = true;
				var10.aC = true;
				var10.aN = (short) (var5 * c_a5.ic / 176);
			}

			var2.a(var6);
			if (var3.g9 == 2293873) {
				var2.method_new((short) (c_a5.ic >> 1));
				var2.method_void(true);
			}

		} else if (var1 == 116) {
			c_b5.method_case("in parse USER_COLOR_STR");
			var6 = var0.readUTF();
			byte var9 = var0.readByte();
			var2.a(var6);
			var2.method_char(c_r.E(var9));
		} else {
			int var4;
			int var7;
			if (var1 == 73 && var2.method_char() == 0) {
				var7 = var0.readInt();
				c_b5.method_case("textGroup.length = " + var7);

				for (var4 = 0; var4 < var7; ++var4) {
					var2.a1 = c_b5.a(var2.a1, var4, var0.readUTF());
					c_b5.method_case("textGroup[" + var4 + "] = " + var2.a1[var4]);
				}

				var2.a(var2.a1[0]);
			} else if (var1 == 3 && var2.method_char() == 3) {
				var1 = var0.readShort();
				c_b5.method_case("labelNum = " + var1);
				var2.method_case(var1);
			} else if (var1 == 3 && var2.method_char() == 0) {
				var1 = var0.readShort();
				c_b5.method_case("labelNum = " + var1);
				var2.a(var1 + "");
			} else {
				if (var1 == 4 && var2.method_char() == 3) {
					var7 = var0.readInt();
					if (c_a5.es.g9 != 2424995 && c_a5.es.g9 != 2424839 && c_a5.es.g9 != 2425079
							|| bo.q != 3 && bo.q != 8) {
						var2.method_case(var7);
						return;
					}

					String var8 = "" + var7 / 10 + "." + var7 % 10 + "元";
					var2.a((byte) 0);
					var2.a(var8);
				} else {
					if (var1 == 4 && var2.method_char() == 0) {
						var7 = var0.readInt();
						var2.a(var7 + "");
						c_b5.method_case("---------------------labelNum-----------------------------=" + var7);
						return;
					}

					if (var1 == 2 && var2.method_char() == 2) {
						var7 = var0.readInt();
						var4 = var0.readInt();
						var2.method_case(var7);
						var2.method_byte(var4);
						c_b5.method_case("----------num1---------=" + var7);
						c_b5.method_case("----------num2---------=" + var4);
						if (c_a5.es.g9 == 2228225) {
							aj.field_for = (byte) var7;
						}

						return;
					}

					if (var1 == 1 && var2.method_char() == 1) {
						var6 = var0.readUTF();
						var2.a(var6);
						if (c_a5.es.g9 == 458753 || c_a5.es.g9 == 917507 || c_a5.es.g9 == 983041
								|| c_a5.es.g9 == 1179650 || c_a5.es.g9 == 1900552 || c_a5.es.g9 == 1376267
								|| c_a5.es.g9 == 393231 || c_a5.es.g9 == 655363 || c_a5.es.g9 == 1769475
								|| c_a5.es.g9 == 1703948 || c_a5.es.g9 == 2031617 || c_a5.es.g9 == 2031635
								|| c_a5.es.g9 == 2228231 || c_a5.es.g9 == 1966113 || c_a5.es.g9 == 1966093
								|| c_a5.es.g9 == 1966087 || c_a5.es.g9 == 1966100) {
							if (c_r.mg == 16777215) {
								c_r.mg = c_bm.bP;
							}

							var2.method_char(c_r.mg);
						}

						return;
					}

					if (var1 == 4 && var2.method_char() == 4) {
						var7 = var0.readInt();
						var2.a(Integer.toString(var7));
						return;
					}

					if (var1 == 1 && var2.method_char() == 4) {
						var6 = var0.readUTF();
						var2.a(var6);
					}
				}

			}
		}
	}

	private static void a$571480af(DataInputStream var0, short var1, c_bv var2) throws IOException {
		byte var3;
		int var4;
		String var5;
		c_m var6;
		if (var1 != 130 && var1 != 137) {
			c_m var25;
			int var28;
			boolean var41;
			if (var1 == 155) {
				var2.dy();
				var3 = var0.readByte();

				for (var4 = 0; var4 < var3; ++var4) {
					var5 = var0.readUTF();
					var41 = var0.readBoolean();
					var28 = var0.readInt();
					(var25 = new c_m(var5, (byte) 7, (byte) 0, var2.dF())).method_if(var41);
					var25.J = var28;
					var2.a(var25);
				}

				c_bv.a(var2, (byte) 0);
			} else {
				c_m var7;
				if (var1 == 157) {
					var2.dy();
					var3 = var0.readByte();

					for (var4 = 0; var4 < var3; ++var4) {
						var5 = var0.readUTF();
						var41 = var0.readBoolean();
						(var7 = new c_m(var5, (byte) 7, (byte) 0, var2.dF())).method_if(var41);
						var2.a(var7);
					}

					c_bv.a(var2, (byte) 0);
				} else {
					int var15;
					String var18;
					if (var1 != 129 && var1 != 149) {
						short var8;
						c_m var9;
						if (var1 == 154) {
							var2.dy();
							var3 = var0.readByte();

							for (var4 = 0; var4 < var3; ++var4) {
								var15 = var0.readInt();
								var18 = var0.readUTF();
								short var19 = var0.readShort();
								var8 = var0.readShort();
								(var9 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).K = var19;
								var9.I = var8;
								var9.q = var15;
								var2.a(var9);
							}

							var2.jE = 86;
						} else {
							byte var16;
							if (var1 == 77 || var1 == 84 || var1 == 91 || var1 == 98 || var1 == 105 || var1 == 111
									|| var1 == 117 || var1 == 122 || var1 == 138 || var1 == 143) {
								var2.dy();
								bb.field_byte = var3 = var0.readByte();

								for (var4 = 0; var4 < var3; ++var4) {
									var16 = var0.readByte();
									var18 = var0.readUTF();
									(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).Y = var16;
									var2.a(var7);
								}

								if (var1 == 77) {
									var2.jE = 31;
								} else if (var1 == 84) {
									var2.jE = 37;
								} else if (var1 == 91) {
									var2.jE = 43;
								} else if (var1 == 98) {
									var2.jE = 49;
								} else if (var1 == 105) {
									var2.jE = 55;
								} else if (var1 == 111) {
									var2.jE = 59;
								} else if (var1 == 117) {
									var2.jE = 62;
								} else if (var1 == 122) {
									var2.jE = 66;
								} else if (var1 == 138) {
									var2.jE = 74;
								} else if (var1 == 143) {
									var2.jE = 78;
								}

								c_bv.a(var2, (byte) 0);
								return;
							}

							if (var1 == 78 || var1 == 85 || var1 == 92 || var1 == 99 || var1 == 106 || var1 == 112
									|| var1 == 118 || var1 == 123 || var1 == 139 || var1 == 144) {
								var2.dy();
								var3 = var0.readByte();

								for (var4 = 0; var4 < var3; ++var4) {
									var16 = var0.readByte();
									var18 = var0.readUTF();
									(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).Y = var16;
									var2.a(var7);
								}

								if (var1 == 78) {
									var2.jE = 32;
								} else if (var1 == 85) {
									var2.jE = 38;
								} else if (var1 == 92) {
									var2.jE = 44;
								} else if (var1 == 99) {
									var2.jE = 50;
								} else if (var1 == 106) {
									var2.jE = 56;
								} else if (var1 == 112) {
									var2.jE = 60;
								} else if (var1 == 118) {
									var2.jE = 63;
								} else if (var1 == 123) {
									var2.jE = 67;
								} else if (var1 == 139) {
									var2.jE = 75;
								} else if (var1 == 144) {
									var2.jE = 79;
								}

								c_bv.a(var2, (byte) 0);
								return;
							}

							if (var1 == 79 || var1 == 82 || var1 == 86 || var1 == 87 || var1 == 93 || var1 == 94
									|| var1 == 100 || var1 == 101 || var1 == 141 || var1 == 146) {
								var2.dy();
								var3 = var0.readByte();

								for (var4 = 0; var4 < var3; ++var4) {
									var15 = var0.readInt();
									var18 = var0.readUTF();
									(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).q = var15;
									var2.a(var7);
								}

								if (var1 == 79) {
									var2.jE = 33;
								} else if (var1 == 82) {
									var2.jE = 35;
								} else if (var1 == 86) {
									var2.jE = 39;
								} else if (var1 == 87) {
									var2.jE = 40;
								} else if (var1 == 93) {
									var2.jE = 45;
								} else if (var1 == 94) {
									var2.jE = 46;
								} else if (var1 == 100) {
									var2.jE = 51;
								} else if (var1 == 101) {
									var2.jE = 52;
								}

								c_bv.a(var2, (byte) 0);
								return;
							}

							if (var1 == 80 || var1 == 89 || var1 == 96 || var1 == 103 || var1 == 108 || var1 == 121
									|| var1 == 125 || var1 == 141 || var1 == 146) {
								var2.dy();
								var3 = var0.readByte();

								for (var4 = 0; var4 < var3; ++var4) {
									var15 = var0.readInt();
									var18 = var0.readUTF();
									(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).q = var15;
									var2.a(var7);
								}

								if (var1 == 80) {
									var2.jE = 34;
								} else if (var1 == 89) {
									var2.jE = 42;
								} else if (var1 == 96) {
									var2.jE = 48;
								} else if (var1 == 103) {
									var2.jE = 54;
								} else if (var1 == 108) {
									var2.jE = 58;
								} else if (var1 == 121) {
									var2.jE = 65;
								} else if (var1 == 125) {
									var2.jE = 69;
								} else if (var1 == 141) {
									var2.jE = 77;
								} else if (var1 == 146) {
									var2.jE = 81;
								}

								c_bv.a(var2, (byte) 0);
								return;
							}

							int var27;
							byte var30;
							if (var1 == 83 || var1 == 88 || var1 == 95 || var1 == 102 || var1 == 107 || var1 == 113
									|| var1 == 119 || var1 == 124 || var1 == 140 || var1 == 145) {
								var2.dy();
								var3 = var0.readByte();

								for (var4 = 0; var4 < var3; ++var4) {
									var16 = var0.readByte();
									var27 = var0.readInt();
									String var39 = var0.readUTF();
									var25 = new c_m(var39, (byte) 1, (byte) 0, var2.dF());
									var30 = -1;
									switch (var16) {
									case 0:
										var30 = 6;
										break;
									case 1:
										var30 = 7;
										break;
									case 2:
										var30 = 5;
										break;
									case 3:
										var30 = 8;
									}

									c_b5.method_case("锻造成功率：" + var30);
									var25.method_int(var30);
									var25.q = var27;
									var2.a(var25);
								}

								if (var1 == 83) {
									var2.jE = 36;
								} else if (var1 == 88) {
									var2.jE = 41;
								} else if (var1 == 95) {
									var2.jE = 47;
								} else if (var1 == 102) {
									var2.jE = 53;
								} else if (var1 == 107) {
									var2.jE = 57;
								} else if (var1 == 113) {
									var2.jE = 61;
								} else if (var1 == 119) {
									var2.jE = 64;
								} else if (var1 == 124) {
									var2.jE = 68;
								} else if (var1 == 140) {
									var2.jE = 76;
								} else if (var1 == 145) {
									var2.jE = 80;
								}

								c_bv.a(var2, (byte) 0);
								return;
							}

							if (var1 == 43 || var1 == 151) {
								var2.dy();
								var3 = var0.readByte();

								for (var4 = 0; var4 < var3; ++var4) {
									var5 = var0.readUTF();
									var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
									var2.a(var6);
								}

								if (var1 == 151) {
									var2.jE = 84;
								}

								c_bv.a(var2, (byte) 0);
								return;
							}

							if (var1 == 76) {
								c_b5.method_case("组队列表-----------------------==============组队列表");
								var2.dy();
								var3 = var0.readByte();
								c_b5.method_case("listNum==" + var3);

								for (var4 = 0; var4 < var3; ++var4) {
									var5 = var0.readUTF();
									c_b5.method_case("listItemStr==" + var5);
									var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
									var2.a(var6);
								}

								return;
							}

							if (var1 == 26) {
								var2.dy();
								var3 = var0.readByte();

								for (var4 = 0; var4 < var3; ++var4) {
									var5 = var0.readUTF();
									var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
									var2.a(var6);
								}

								if (var1 == 26) {
									var2.jE = 5;
								}

								c_bv.a(var2, (byte) 0);
								return;
							}

							short var26;
							byte var35;
							int[] var42;
							if (var1 == 45 || var1 == 18 || var1 == 33) {
								var2.dy();
								var3 = var0.readByte();
								c_b5.method_case("zbt 任务列表 列表项数量: " + var3);
								var42 = new int[var3];

								for (var15 = 0; var15 < var3; ++var15) {
									var18 = var0.readUTF();
									c_b5.method_case("任务名称：" + var18);
									var42[var15] = var0.readInt();
									var35 = var0.readByte();
									if (var1 == 33) {
										var8 = var0.readShort();
										var26 = var0.readShort();
										c_m var31;
										(var31 = new c_m(var18, (byte) 0, (byte) 1, var2.dF())).K = var8;
										var31.I = var26;
										var2.a(var31);
									} else if (var1 == 18) {
										(var25 = new c_m(var18, (byte) 1, (byte) 0, var2.dF())).method_int(var35);
										var2.a(var25);
									} else if (var1 == 45) {
										var25 = new c_m(var18, (byte) 1, (byte) 0, var2.dF());
										var30 = var0.readByte();
										boolean var33 = var0.readBoolean();
										var25.method_for(var30);
										var25.a(var33);
										byte var34 = -1;
										switch (var35) {
										case 1:
											var34 = 6;
											break;
										case 2:
											var34 = 7;
											break;
										case 3:
											var34 = 5;
										}

										c_b5.method_case("自身任务列表难度等级：" + var34);
										var25.method_int(var34);
										var2.a(var25);
									}
								}

								var2.method_if(var42);
								if (var1 == 45) {
									var2.jE = 9;
								} else if (var1 == 18) {
									if (var2.dt().size() > 0) {
										c_bv.C(((c_m) var2.dt().elementAt(0)).method_char());
									}

									var2.jE = 2;
								} else if (var1 == 33) {
									var2.jE = 7;
								}

								c_bv.a(var2, (byte) 0);
								return;
							}

							if (var1 == 44) {
								var2.dy();
								c_bv.ks = var0.readInt();
								var3 = var0.readByte();
								c_b5.method_case("传送的d地图ID：" + c_bv.ks + "==NPC传送列表项数量: " + var3);

								for (var4 = 0; var4 < var3; ++var4) {
									var16 = var0.readByte();
									var18 = var0.readUTF();
									(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).method_do(var16);
									var2.a(var7);
								}

								var2.jE = 8;
							} else {
								short var22;
								if (var1 == 46 || var1 == 47 || var1 == 49 || var1 == 50 || var1 == 48 || var1 == 51
										|| var1 == 71) {
									var2.dy();
									var22 = var0.readShort();
									c_b5.method_case("任列表项数量: " + var22);
									var42 = new int[var22];

									for (var15 = 0; var15 < var22; ++var15) {
										var42[var15] = var0.readInt();
										var18 = var0.readUTF();
										c_b5.method_case("任务名称：" + var18);
										if (var1 != 48 && var1 != 51) {
											var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF());
											var2.a(var7);
										} else {
											var35 = var0.readByte();
											var25 = new c_m(var18, (byte) 1, (byte) 0, var2.dF());
											var30 = -1;
											switch (var35) {
											case 1:
												var30 = 6;
												break;
											case 2:
												var30 = 7;
												break;
											case 3:
												var30 = 5;
											}

											c_b5.method_case("自身任务列表难度等级：" + var30);
											var25.method_int(var30);
											var2.a(var25);
										}
									}

									var2.method_if(var42);
									if (var1 == 48) {
										var2.jE = 12;
									} else if (var1 == 51) {
										var2.jE = 15;
									} else if (var1 == 46) {
										var2.jE = 10;
									} else if (var1 == 47) {
										var2.jE = 11;
									} else if (var1 == 49) {
										var2.jE = 13;
									} else if (var1 == 50) {
										var2.jE = 14;
									} else if (var1 == 71) {
										var2.jE = 29;
									}

									c_bv.a(var2, (byte) 0);
									return;
								}

								if (var1 == 56) {
									var2.dy();
									var3 = var0.readByte();

									for (var4 = 0; var4 < var3; ++var4) {
										var5 = var0.readUTF();
										c_b5.method_case("名称：" + var5);
										(var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF())).q = var0.readInt();
										var6.aa = var0.readLong();
										var2.a(var6);
									}

									var2.jE = 16;
								} else if (var1 == 58) {
									var2.dy();
									var3 = var0.readByte();
									c_b5.method_case("zbt 任务列表 列表项数量: " + var3);

									for (var4 = 0; var4 < var3; ++var4) {
										var5 = var0.readUTF();
										byte var20 = var0.readByte();
										(var7 = new c_m(var5, (byte) 0, (byte) 0, var2.dF())).A = var20;
										var2.a(var7);
									}

									var2.jE = 17;
								} else {
									if (var1 == 60) {
										var2.dy();
										var3 = var0.readByte();
										c_b5.method_case("zbt 任务列表 列表项数量: " + var3);

										for (var4 = 0; var4 < var3; ++var4) {
											var5 = var0.readUTF();
											var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
											var2.a(var6);
										}

										c_bv.a(var2, (byte) 0);
										return;
									}

									if (var1 == 65 || var1 == 70) {
										var2.dy();
										var3 = var0.readByte();

										for (var4 = 0; var4 < var3; ++var4) {
											var5 = var0.readUTF();
											c_b5.method_case("名称：" + var5);
											(var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF())).q = var0.readInt();
											var2.a(var6);
										}

										c_bv.a(var2, (byte) 0);
										return;
									}

									String var21;
									if (var1 == 20) {
										var2.dy();
										var3 = var0.readByte();
										c_b5.method_case("npctalk=" + var3);
										var21 = null;

										for (var15 = 0; var15 < var3; ++var15) {
											var18 = var0.readUTF();
											c_b5.method_case("对话标题：" + var18);
											var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF());
											var2.a(var7);
										}

										var2.jE = 3;
									} else {
										if (var1 == 25) {
											var2.a((byte) 1);
											var2.dy();
											var3 = var0.readByte();
											var2.jE = 4;
											if (var3 == 0) {
												return;
											}

											c_bu.f = var0.readInt();

											for (var4 = 0; var4 < var3; ++var4) {
												var5 = var0.readUTF();
												var27 = var0.readInt();
												boolean var32 = false;
												if (c_bu.f == var27) {
													var32 = true;
												}

												byte var24 = var0.readByte();
												var26 = var0.readShort();
												int var10 = var0.readInt();
												int var11 = var0.readInt();
												int var14 = var0.readInt();
												int var12 = var0.readInt();
												c_m var13;
												(var13 = new c_m((byte) 2)).a(var5, var27, var32, var24, var26, var10,
														var11, var14, var12);
												var2.a(var13);
											}

											if (var3 > var2.z$132bd3() && var2.dr().U == null) {
												var2.dr().method_new(false);
											}

											c_bv.a(var2, (byte) 0);
											return;
										}

										c_m var37;
										if (var1 == 32) {
											var2.dy();
											var3 = var0.readByte();

											for (var4 = 0; var4 < var3; ++var4) {
												var37 = new c_m((byte) 3);
												var18 = var0.readUTF();
												var28 = var0.readInt();
												var37.method_if(var28);
												var37.a(var18);
												var2.a(var37);
											}

											if (var3 > var2.z$132bd3() && var2.dr().U == null) {
												var2.dr().method_new(true);
											}

											var2.dr().a((short) var3, (short) var2.z$132bd3());
											return;
										}

										if (var1 == 158) {
											var2.dy();
											var3 = var0.readByte();

											for (var4 = 0; var4 < var3; ++var4) {
												(var37 = new c_m((byte) 0)).a(var0.readUTF());
												var37.q = var0.readByte();
												var2.a(var37);
											}

											var2.dr().a((short) var3, (short) var2.z$132bd3());
											return;
										}

										if (var1 == 52) {
											var2.dy();
											var3 = var0.readByte();

											for (var4 = 0; var4 < var3; ++var4) {
												(var37 = new c_m((byte) 0)).L = var0.readInt();
												var37.a(var0.readUTF());
												var2.a(var37);
											}

											var2.dr().a((short) var3, (short) var2.z$132bd3());
											return;
										}

										if (var1 == 134) {
											var2.dy();
											o.field_if = new String[var22 = var0.readShort()];
											o.field_do = new String[var22];
											o.a = new String[var22];
											o.field_for = new int[var22];

											for (var4 = 0; var4 < var22; ++var4) {
												var5 = var0.readUTF();
												var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
												var2.a(var6);
												o.field_if[var4] = var0.readUTF();
												o.field_do[var4] = var0.readUTF();
												o.a[var4] = var0.readUTF();
												o.field_for[var4] = var0.readInt();
											}

											if (var1 == 134) {
												var2.jE = 71;
											}

											c_bv.a(var2, (byte) 0);
											ah var40;
											(var40 = (ah) c_a5.es.cf().elementAt(6)).a(o.field_if[0]);
											var40.method_new((short) (c_a5.ic - var40.method_for() >> 1));
											ah var36;
											(var36 = (ah) c_a5.es.cf().elementAt(7)).a(o.field_do[0]);
											var36.method_new((short) (c_a5.ic - var36.method_for() >> 1));
											ah var38;
											(var38 = (ah) c_a5.es.cf().elementAt(8)).a(o.a[0]);
											var38.method_new((short) (c_a5.ic - var38.method_for() >> 1));
											return;
										}

										if (var1 == 133 || var1 == 136) {
											var2.dy();
											var22 = var0.readShort();

											for (var4 = 0; var4 < var22; ++var4) {
												var5 = var0.readUTF();
												var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
												var2.a(var6);
											}

											c_bv.a(var2, (byte) 0);
											return;
										}

										if (var1 == 131 || var1 == 132) {
											var2.dy();
											if (c_a5.es.g9 == 2425029) {
												var3 = var0.readByte();

												for (var4 = 0; var4 < var3; ++var4) {
													var5 = var0.readUTF();
													var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
													var2.a(var6);
												}

												var2.jE = 72;
											}

											c_bv.a(var2, (byte) 0);
											return;
										}

										if (var1 == 150) {
											var2.dy();
											c_q.field_byte = new String[var3 = var0.readByte()];

											for (var4 = 0; var4 < var3; ++var4) {
												var5 = var0.readUTF();
												var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
												var2.a(var6);
												c_q.field_byte[var4] = var0.readUTF();
											}

											((ak) c_a5.es.cf().elementAt(4)).method_if(c_q.field_byte[0]);
											c_bv.a(var2, (byte) 0);
											var2.jE = 83;
											return;
										}

										if (var1 == 152) {
											var2.dy();
											c_q.u = new int[var3 = var0.readByte()];
											c_q.field_case = new String[var3];
											c_q.k = new byte[var3];

											for (var4 = 0; var4 < var3; ++var4) {
												c_q.u[var4] = var0.readInt();
												var5 = var0.readUTF();
												var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
												var2.a(var6);
												c_q.field_case[var4] = var0.readUTF();
												c_q.k[var4] = var0.readByte();
											}

											if (var3 != 0) {
												((ak) c_a5.es.cf().elementAt(6)).method_if(c_q.field_case[0]);
												c_bv.a(var2, (byte) 0);
												var2.jE = 85;
											}

											return;
										}

										if (var1 == 166) {
											var2.dy();
											var3 = var0.readByte();

											for (var4 = 0; var4 < var3; ++var4) {
												var5 = var0.readUTF();
												var27 = var0.readInt();
												var28 = var0.readInt();
												int var23 = var0.readInt();
												(var9 = new c_m(var5, (byte) 9, (byte) 0, var2.dF())).method_new(var27);
												var9.method_int(var28);
												var2.a(var9);
												var9.method_do(var23);
											}

											if (var3 != 0) {
												c_bv.a(var2, (byte) 9);
												var2.jE = 87;
											} else {
												((c_ao) c_a5.es.cf().elementAt(1)).a("", 0);
											}

											var21 = var0.readUTF();
											((c_ao) c_a5.es.cf().elementAt(0)).method_do(var21);
											return;
										}

										if (var1 == 168) {
											var2.dy();
											var3 = var0.readByte();

											for (var4 = 0; var4 < var3; ++var4) {
												var16 = var0.readByte();
												var18 = var0.readUTF();
												(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).q = var16;
												var2.a(var7);
											}

											var2.jE = 88;
											return;
										}

										if (var1 == 170) {
											c_ao var17 = (c_ao) c_a5.es.cf().elementAt(1);
											var2.dy();
											byte var29 = var0.readByte();

											for (var15 = 0; var15 < var29; ++var15) {
												var18 = var0.readUTF();
												(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).w = var0
														.readShort();
												var7.field_else = var0.readShort();
												var2.a(var7);
											}

											var2.jE = 89;
											if (((c_m) var2.dt().elementAt(0)).field_else != 4125) {
												var17.a("操作", 0);
												return;
											}

											var17.a("", 0);
											return;
										}

										if (var1 == 171 || var1 == 172 || var1 == 173) {
											var2.dy();
											var3 = var0.readByte();

											for (var4 = 0; var4 < var3; ++var4) {
												var15 = var0.readInt();
												var18 = var0.readUTF();
												(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).q = var15;
												var2.a(var7);
											}

											c_bv.a(var2, (byte) 0);
											return;
										}

										if (var1 != 174) {
											return;
										}

										var2.dy();
										var3 = var0.readByte();
										if (c_a5.es.g9 == 3145738) {
											aa.field_void = new byte[var3];
										}

										for (var4 = 0; var4 < var3; ++var4) {
											var5 = var0.readUTF();
											if (c_a5.es.g9 == 3145738) {
												aa.field_void[var4] = var0.readByte();
											}

											var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
											var2.a(var6);
										}
									}
								}
							}
						}

						c_bv.a(var2, (byte) 0);
					} else {
						var2.dy();
						var2.j7 = var0.readByte();
						var3 = var0.readByte();

						for (var4 = 0; var4 < var3; ++var4) {
							var15 = var0.readInt();
							var18 = var0.readUTF();
							(var7 = new c_m(var18, (byte) 0, (byte) 0, var2.dF())).q = var15;
							var2.a(var7);
						}

						if (var1 == 129) {
							var2.jE = 70;
						} else if (var1 == 149) {
							var2.jE = 82;
						}

						c_bv.a(var2, (byte) 0);
					}
				}
			}
		} else {
			var2.dy();
			var3 = var0.readByte();

			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var0.readUTF();
				var6 = new c_m(var5, (byte) 0, (byte) 0, var2.dF());
				var2.a(var6);
			}

			c_bv.a(var2, (byte) 0);
		}
	}

	private static c_as method_if(DataInputStream var0) {
		c_as var1 = null;

		try {
			c_b5.method_case("enter in parseTopForm");
			byte var2 = var0.readByte();
			byte var3 = var0.readByte();
			(var1 = new c_as(var3, (c_be) null)).a(var2, var0.readInt(), var0.readUTF(), var0.readUTF(), var0.readUTF(),
					var0.readInt(), var0.readInt());
			c_b5.method_case("enter in parseTopForm" + var3);
			label99: switch (var3) {
			case 0:
			case 1:
			case 4:
			case 6:
			case 13:
			case 15:
			case 16:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 35:
			case 39:
			default:
				break;
			case 2:
				if (c_a5.gQ == null && c_a5.method_else() == 5 && c_a5.V() == 0) {
					c_bu.h = var0.readInt();
					break;
				}

				bp.em = var0.readInt();
				c_a5.eQ.a(720914);
				var1 = null;
				break;
			case 3:
				switch (var0.readByte()) {
				case 0:
					c_a5.A();
					break label99;
				case 1:
					switch (c_bu.e) {
					case 0:
						c_a5.A();
						break label99;
					case 1:
						c_a5.eQ.a(720904);
						break label99;
					case 2:
						c_a5.eQ.a(new int[] { 720905, 720906, 720907 });
					}
				default:
					break label99;
				}
			case 5:
				if (c_a5.V() != 0) {
					c_a5.eQ.a(1376259);
					var1 = null;
				}
				break;
			case 7:
				n.field_for = var0.readInt();
				break;
			case 8:
				var1.cR = var0.readInt();
				c_b5.method_case("在ParseUI中读取的taskID = " + var1.cR);
				break;
			case 9:
				if (c_a5.gQ == null && c_a5.method_else() == 5 && c_a5.V() == 0) {
					c_bt.field_for = var0.readInt();
					break;
				}

				bp.em = var0.readInt();
				c_a5.eQ.a(1638414);
				var1 = null;
				break;
			case 10:
				c_bu.g = var0.readInt();
				break;
			case 11:
				if (c_a5.gQ == null && c_a5.method_else() == 5 && c_a5.V() == 0) {
					bp.ag().fS = var0.readInt();
					break;
				}

				bp.em = var0.readInt();
				c_a5.eQ.a(196630);
				var1 = null;
				break;
			case 12:
				if (c_a5.gQ == null && c_a5.method_else() == 5 && c_a5.V() == 0) {
					c_i.field_do = var0.readInt();
					break;
				}

				bp.em = var0.readInt();
				c_a5.eQ.a(1835032);
				var1 = null;
				break;
			case 14:
				c_b5.method_case("弹出加为仇人的弹板");
				bp.ag().eC = var0.readInt();
				break;
			case 17:
				c_a5.iB = var0.readByte();
				break;
			case 31:
				c_bu.g = var0.readInt();
				c_b5.method_case("rollGoodsID========" + c_bu.g);
				break;
			case 32:
				bb.field_if = var0.readByte();
				bb.a = var0.readByte();
				break;
			case 33:
				bb.field_else = var0.readInt();
				break;
			case 34:
				bb.b = var0.readByte();
				bb.field_long = var0.readByte();
				bb.field_goto = var0.readByte();
				break;
			case 36:
				at.field_if = var0.readInt();
				at.a = var0.readInt();
				break;
			case 37:
				if (c_a5.eQ.e) {
					c_a5.eQ.e = false;
				}
				break;
			case 38:
				if (c_a5.gQ == null && c_a5.method_else() == 5 && c_a5.V() == 0) {
					c.a = var0.readInt();
					break;
				}

				c.a = var0.readInt();
				c_a5.eQ.a(2490423);
				var1 = null;
				break;
			case 40:
				c_l.field_if = var0.readShort();
				if (c_a5.V() == 4) {
					c_a5.A();
				}

				if (c_a5.ea != null) {
					c_a5.ea.l6.removeAllElements();
					c_a5.ea = null;
					c_a5.method_try((byte) 0);
				}
				break;
			case 41:
				if (c_a5.eQ.e) {
					c_a5.eQ.e = false;
				}
				break;
			case 42:
				c_bt.g = var0.readInt();
				c_bt.l = var0.readInt();
				c_bt.c = var0.readInt();
			}

			var0.close();
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		return var1;
	}

	public static c_as a(byte[] var0) {
		try {
			return method_if(new DataInputStream(new ByteArrayInputStream(var0)));
		} catch (Exception var1) {
			var1.printStackTrace();
			return null;
		}
	}

	public static c_be a(byte[] var0, int var1) {
		try {
			return a(new DataInputStream(new ByteArrayInputStream(var0)), var1);
		} catch (Exception var2) {
			var2.printStackTrace();
			return null;
		}
	}

	private static c_be a(DataInputStream var0, int var1) {
		c_be var2 = null;
		c_b5.method_case("parseCmdData------commID" + var1);

		try {
			byte var3;
			ah var5;
			short var12;
			int var13;
			byte var15;
			byte var16;
			byte var18;
			a9 var31;
			short var32;
			a9 var33;
			int var34;
			int var39;
			ah var45;
			byte var47;
			c_ao var54;
			String var69;
			int var72;
			short var76;
			int var79;
			short var87;
			c_m var89;
			int var91;
			short var103;
			switch (var1) {
			case -2147221500:
			case -2147221499:
			case -2147221498:
			case -2147221493:
			case -2147221492:
			case -2147221490:
				ba.q = false;
				c_be.gp = 0;
				var2 = new c_be((short) 0, (short) 0, (short) c_a5.ic, (short) c_a5.il);
				c_ao var59 = new c_ao((byte) 0, var2);
				byte var51 = -1;
				if (var1 == -2147221500) {
					var59.method_do("领取报酬");
					var51 = 0;
					var2.g9 = 262152;
				} else if (var1 == -2147221499) {
					var59.method_do("报酬详情");
					var51 = 1;
					var2.g9 = 262158;
				} else if (var1 == -2147221498) {
					var59.method_do("报酬详情");
					var51 = 2;
					var2.g9 = 262159;
				} else if (var1 == -2147221493) {
					var59.method_do("报酬详情");
					var51 = 3;
					var2.g9 = 262175;
				} else if (var1 == -2147221492) {
					var59.method_do("报酬详情");
					var51 = 4;
					var2.g9 = 262177;
				} else if (var1 == -2147221490) {
					var59.method_do("报酬详情");
					var51 = 5;
					var2.g9 = 262181;
				}

				c_b5.method_case("form.clientCommand = " + var2.g9);
				c_b5.method_case("-------报酬界面类型-------" + var51);
				var2.method_if(var59);
				var54 = new c_ao((byte) 1, var2);
				var2.method_if(var54);
				int var53 = ah.ad();
				c_y var58;
				(var58 = new c_y((short) 0, (short) (c_ao.aA() - 10), (short) c_a5.ic,
						(short) (c_a5.il - 18 - c_ao.aA() + 10), (byte) 1, var2))
								.method_case((short) (var58.M() - var53));
				var32 = (short) var53;
				var58.E = var32;
				var2.method_if(var58);
				String var65 = var0.readUTF();
				ah var67 = new ah((short) 15, (short) (var58.method_long() + 3), (short) (c_a5.ic - 30),
						(short) ah.ad(), (byte) 1, var65, var2);
				var2.method_if(var67);
				boolean var77 = false;
				var87 = (short) (c_ao.aA() - 10 + 26);
				c_b5.Q.removeAllElements();
				c_b5.I.removeAllElements();
				c_b5.M.removeAllElements();
				c_b5.method_case("before groupNum");
				byte var102 = var0.readByte();
				c_b5.method_case("after groupNum = " + var102);
				String var95;
				ah var101;
				if (var102 > 0) {
					bf.field_for = true;
					String var94 = "请选择一样物品作为";
					var95 = "您的附加奖励";
					var101 = new ah((short) 18, var87, (short) c_b5.method_do(var94), (short) c_a5.iG, (byte) 0, var94,
							var2);
					var5 = new ah((short) 18, (short) (var87 + 18 * c_a5.il / 208), (short) c_b5.method_do(var95),
							(short) c_a5.iG, (byte) 0, var95, var2);
					var2.method_if(var101);
					var2.method_if(var5);
				} else {
					bf.field_for = false;
				}

				a7 var100;
				for (var13 = 0; var13 < var102; ++var13) {
					byte var98 = var0.readByte();
					c_b5.method_case("附加奖励报酬类型: " + var98);
					int var104 = var13 + 2;
					c_b5.method_case("奖励当前行:" + var104);
					short var10004 = (short) (var87 + var104 * (18 * c_a5.il / 208));
					byte var10006 = (byte) (var13 + 1);
					byte var70 = var51;
					byte var68 = var10006;
					boolean var27 = true;
					short var60 = var10004;
					var53 = var104;
					var47 = var98;
					c_be var64 = var2;
					DataInputStream var28 = var0;

					try {
						var77 = false;
						String var30;
						String var71;
						a7 var108;
						switch (var47) {
						case 1:
							var76 = var28.readShort();
							var95 = var28.readUTF();
							var1 = var28.readInt();
							(var108 = new a7((short) 33, var60, (short) 0, (short) 0, (String) null, (byte) 1, var64))
									.g(var76);
							var108.a(c_a5.gg);
							var108.ft = true;
							var108.method_if((short) (var76 % 1000), true);
							var108.eK = 1;
							var108.eD = var68;
							var108.eJ = var70;
							var108.el = var47;
							if (var1 > 1) {
								var108.a(true, (byte) var1);
							}

							var64.method_if(var108);
							var108.w();
							c_b5.Q.addElement(var108);
							c_b5.I.addElement(new Integer(var64.cf().size() - 1));
							c_b5.M.addElement(new Integer(var53));
							(var5 = new ah((short) 53, var60, (short) c_b5.method_do(var95), (short) c_a5.iG, (byte) 0,
									var95, var64)).w();
							var64.method_if(var5);
							break;
						case 2:
							var69 = var28.readUTF();
							var91 = var28.readInt();
							a7 var35;
							(var35 = new a7((short) 33, var60, (short) 0, (short) 0, "exp.png", (byte) 1,
									var64)).eK = 1;
							var35.eD = var68;
							var35.eJ = var70;
							var35.el = var47;
							var35.i(true);
							var64.method_if(var35);
							var35.w();
							c_b5.Q.addElement(var35);
							c_b5.I.addElement(new Integer(var64.cf().size() - 1));
							c_b5.M.addElement(new Integer(var53));
							var5 = new ah((short) 53, var60, (short) c_b5.method_do(var69), (short) c_a5.iG, (byte) 0,
									var69, var64);
							var64.method_if(var5);
							(var45 = new ah((short) (53 + c_b5.method_do(var69) + 4), (short) (var60 + 3), (byte) 3,
									var64, (byte) 0)).method_case(var91);
							var64.method_if(var45);
							break;
						case 3:
							var72 = var28.readInt();
							c_b5.method_case("金钱: " + var72);
							(var100 = new a7((short) 33, var60, (short) 0, (short) 0, "u-8.png", (byte) 1,
									var64)).eK = 1;
							var100.eD = var68;
							var100.eJ = var70;
							var100.el = var47;
							var100.i(true);
							var64.method_if(var100);
							var100.w();
							c_b5.Q.addElement(var100);
							c_b5.I.addElement(new Integer(var64.cf().size() - 1));
							c_b5.M.addElement(new Integer(var53));
							var30 = "金钱";
							var101 = new ah((short) 53, var60, (short) c_b5.method_do(var30), (short) c_a5.iG, (byte) 0,
									var30, var64);
							var64.method_if(var101);
							(var5 = new ah((short) (53 + c_b5.method_do(var30) + 4), (short) (var60 + 3), (byte) 3,
									var64, (byte) 0)).method_case(var72);
							var64.method_if(var5);
							break;
						case 4:
							var28.readShort();
							var77 = false;
							var28.readUTF();
							var89 = null;
							var1 = var28.readInt();
							(var108 = new a7((short) 33, var60, (short) 0, (short) 0, "u-2.png", (byte) 1,
									var64)).eK = 1;
							var108.eD = var68;
							var108.eJ = var70;
							var108.el = var47;
							var108.i(true);
							var64.method_if(var108);
							var108.w();
							c_b5.Q.addElement(var108);
							c_b5.I.addElement(new Integer(var64.cf().size() - 1));
							c_b5.M.addElement(new Integer(var53));
							var71 = "技能";
							var45 = new ah((short) 53, var60, (short) c_b5.method_do(var71), (short) c_a5.iG, (byte) 0,
									var71, var64);
							var64.method_if(var45);
							(var5 = new ah((short) (53 + c_b5.method_do(var71) + 4), (short) (var60 + 3), (byte) 3,
									var64, (byte) 0)).method_case(var1);
							var64.method_if(var5);
							break;
						case 5:
							var28.readShort();
							var77 = false;
							var28.readUTF();
							var89 = null;
							var1 = var28.readInt();
							(var108 = new a7((short) 33, var60, (short) 0, (short) 0, "u-3.png", (byte) 1,
									var64)).eK = 1;
							var108.eD = var68;
							var108.eJ = var70;
							var108.el = var47;
							var64.method_if(var108);
							var108.i(true);
							var108.w();
							c_b5.Q.addElement(var108);
							c_b5.I.addElement(new Integer(var64.cf().size() - 1));
							c_b5.M.addElement(new Integer(var53));
							var71 = "建设";
							var45 = new ah((short) 53, var60, (short) c_b5.method_do(var71), (short) c_a5.iG, (byte) 0,
									var71, var64);
							var64.method_if(var45);
							(var5 = new ah((short) (53 + c_b5.method_do(var71) + 4), (short) (var60 + 3), (byte) 3,
									var64, (byte) 0)).method_case(var1);
							var64.method_if(var5);
							break;
						case 6:
							var72 = var28.readInt();
							c_b5.method_case("经验： " + var72);
							(var100 = new a7((short) 33, var60, (short) 0, (short) 0, "exp.png", (byte) 1,
									var64)).eK = 1;
							var100.eD = var68;
							var100.eJ = var70;
							var100.el = var47;
							var100.i(true);
							var64.method_if(var100);
							var100.w();
							c_b5.Q.addElement(var100);
							c_b5.I.addElement(new Integer(var64.cf().size() - 1));
							c_b5.M.addElement(new Integer(var53));
							var30 = "经验";
							var101 = new ah((short) 53, var60, (short) c_b5.method_do(var30), (short) c_a5.iG, (byte) 0,
									var30, var64);
							var64.method_if(var101);
							(var5 = new ah((short) (53 + c_b5.method_do(var30) + 4), (short) (var60 + 3), (byte) 3,
									var64, (byte) 0)).method_case(var72);
							var64.method_if(var5);
							break;
						case 7:
							var72 = var28.readInt();
							(var100 = new a7((short) 33, var60, (short) 0, (short) 0, "cross.png", (byte) 1,
									var64)).eK = 1;
							var100.eD = var68;
							var100.eJ = var70;
							var100.el = var47;
							var100.i(true);
							var64.method_if(var100);
							var100.w();
							c_b5.Q.addElement(var100);
							c_b5.I.addElement(new Integer(var64.cf().size() - 1));
							c_b5.M.addElement(new Integer(var53));
							var30 = "荣誉";
							var101 = new ah((short) 53, var60, (short) c_b5.method_do(var30), (short) c_a5.iG, (byte) 0,
									var30, var64);
							var64.method_if(var101);
							(var5 = new ah((short) (53 + c_b5.method_do(var30) + 4), (short) (var60 + 3), (byte) 3,
									var64, (byte) 0)).method_case(var72);
							var64.method_if(var5);
							break;
						case 8:
							var69 = var28.readUTF();
							(var100 = new a7((short) 33, var60, (short) 0, (short) 0, "long.png", (byte) 1,
									var64)).eK = 1;
							var100.eD = var68;
							var100.eJ = var70;
							var100.el = var47;
							var100.i(true);
							var64.method_if(var100);
							var100.w();
							c_b5.Q.addElement(var100);
							c_b5.I.addElement(new Integer(var64.cf().size() - 1));
							c_b5.M.addElement(new Integer(var53));
							var101 = new ah((short) 53, var60, (short) c_b5.method_do(var69), (short) c_a5.iG, (byte) 0,
									var69, var64);
							var64.method_if(var101);
						}
					} catch (Exception var23) {
						var23.printStackTrace();
					}
				}

				for (var13 = 0; var13 < c_b5.Q.size(); ++var13) {
					var100 = (a7) c_b5.Q.elementAt(var13);
					var15 = (byte) (Byte) c_b5.I.elementAt(var13);
					c_b5.method_case("picIndex = " + var15);
					if (var13 == 0) {
						var100.a(true, var2);
					}

					if (var13 > 0) {
						a7 var82 = (a7) c_b5.Q.elementAt(var13 - 1);
						var16 = (byte) (Byte) c_b5.I.elementAt(var13 - 1);
						c_b5.method_case("prePicIndex = " + var16);
						var82.a((byte) 1, (byte) (var15 + 1));
						var100.a((byte) 0, (byte) (var16 + 1));
					}
				}

				ba.q = true;
				break;
			case -2147090429:
				var2 = c_a5.es;
				bp.ag().eY = var0.readLong();
				bp.ag().fR = var0.readLong();
				if (c_a5.es != null) {
					ah var55;
					switch (c_a5.es.g9) {
					case 393219:
						System.out.println("人物基础界面接收经验");
						var55 = (ah) c_a5.es.cf().elementAt(33);
						ah var49 = (ah) c_a5.es.cf().elementAt(35);
						var55.a((byte) 7);
						var49.a((byte) 7);
						var55.a(bp.ag().eY);
						var49.a(bp.ag().fR);
						c_a5.fR = false;
						break;
					case 983047:
						System.out.println("经验商店信息接收经验");
						(var55 = (ah) c_a5.es.cf().elementAt(7)).a((byte) 7);
						var55.a(bp.ag().eY);
						c_a5.fR = false;
						break;
					case 2162693:
					case 2162708:
					case 2162719:
					case 2162730:
					case 2162739:
					case 2162747:
					case 2162760:
					case 2162767:
					case 2162774:
					case 2162781:
						System.out.println("商业技能学习信息接收经验");
						(var55 = (ah) c_a5.es.cf().elementAt(8)).a((byte) 7);
						var55.a(bp.ag().eY);
						c_a5.fR = false;
					}
				}
				break;
			case -2147090423:
				c_y.S = true;
				var2 = new c_be((short) 0, (short) 0, (short) c_a5.ic, (short) c_a5.il);
				var3 = var0.readByte();
				c_b5.method_case("self ============ " + var3);
				if (var3 == 0) {
					var2.g9 = 393225;
				} else {
					var2.g9 = 393229;
				}

				c_ao var46;
				(var46 = new c_ao((byte) 0, var2)).method_do("人物资料");
				var2.method_if(var46);
				var54 = new c_ao((byte) 1, var2);
				if (var3 == 1) {
					var54.a("", 0);
				}

				var2.method_if(var54);
				ba.q = false;
				c_y var50 = new c_y((short) 0, (short) 18, (short) c_a5.ic, (short) (c_a5.il - 18 - c_ao.aA() + 7),
						(byte) 1, var2);
				var2.method_if(var50);
				boolean var56 = false;
				short var63 = (short) (c_a5.ic / 4 + 4);
				short var66 = (short) ((c_a5.ic << 1) / 3);
				boolean var42 = false;
				if (var50.E == -1) {
					var34 = var50.method_long() + 5;
				} else {
					var34 = var50.method_long() + 5 + var50.E;
				}

				var76 = (short) ((short) var34 + 6);
				var87 = (short) (16 * c_a5.il / 208);
				var12 = (short) (var63 - (c_a5.iA << 1));
				short var92 = (short) (c_a5.ic * 3 / 4 - 8);
				bn var99 = new bn(var2.g9, var2);
				var39 = 0;
				int var105 = 0;

				for (boolean var109 = false; var105 < 10; ++var105) {
					ah var111 = new ah(var63, (short) (var76 + var87 * var105), (byte) 0, bn.iv[var105], true, var2);
					var2.method_if(var111);
					var99.method_do(var111);
					String var114 = var0.readUTF();
					var99.iA[var39++] = var114;
					if (var105 != 9) {
						ah var117 = new ah(var66, (short) (var76 + var87 * var105), (byte) 0, var114, true, var2);
						var2.method_if(var117);
						var99.method_do(var117);
					} else {
						ak var119;
						(var119 = new ak(var12, (short) (var76 + var87 * 10 + 2), var92, (short) 180, var2))
								.method_try((byte) 1);
						var119.method_else(-1);
						var119.method_if(var114);
						var2.method_if(var119);
						var99.method_do(var119);
					}
				}

				if (var50.U == null) {
					var50.method_new(true);
					var99.method_do(var50.U);
				}

				var50.a((short) 21, (short) 8);
				var99.w();
				var2.method_if(var99);
				ba.q = true;
				break;
			case -2146762738:
				var2 = c_a5.es;
				var3 = var0.readByte();
				ay var44;
				(var44 = (ay) var2.cf().elementAt(3)).method_char(var3);
				var44.method_case(var3);
				c_b5.method_case("CommandList.S_TEAM_DIVIDE" + var3);
				break;
			case -2146238462:
				var32 = var0.readShort();
				short var37 = var0.readShort();
				var47 = var0.readByte();
				c_b5.method_case("-------------------------------- rowNum = " + var47);
				short[] var52 = new short[var47];
				Object[] var61 = new Object[var47];
				String[] var62 = new String[var47];

				for (var72 = 0; var72 < var47; ++var72) {
					var62[var72] = var0.readUTF();
					if (var62[var72].length() > 2) {
						int var75 = var62[var72].length() - 2;
						var62[var72] = var62[var72].substring(var75, var62[var72].length());
					}

					var52[var72] = var0.readShort();
					String[] var78;
					switch (var52[var72]) {
					case 1:
						var78 = new String[] { var0.readUTF(), var0.readUTF() };
						var61[var72] = var78;
						break;
					case 4:
						int[] var84 = new int[] { var0.readInt(), var0.readInt() };
						var61[var72] = var84;
					}

					c_b5.method_case("********************************************");
					c_b5.method_case("firstColStr[" + var72 + "] = " + var62[var72]);
					c_b5.method_case("rowType[" + var72 + "] = " + var52[var72]);
					label220: switch (var52[var72]) {
					case 1:
						var78 = (String[]) ((String[]) var61[var72]);
						var79 = 0;

						while (true) {
							if (var79 >= var78.length) {
								break label220;
							}

							c_b5.method_case("rowContent[" + var72 + "]~m[" + var79 + "] = " + var78[var79]);
							++var79;
						}
					case 4:
						int[] var80 = (int[]) ((int[]) var61[var72]);

						for (var79 = 0; var79 < var80.length; ++var79) {
							c_b5.method_case("rowContent[" + var72 + "]~m[" + var79 + "] = " + var80[var79]);
						}
					}

					c_b5.method_case("********************************************");
				}

				(var2 = new c_be((short) 0, (short) 0, (short) c_a5.ic, (short) c_a5.il)).g9 = 1245185;
				c_be.g1 = true;
				c_y.S = true;
				c_y.M = true;
				bn var73 = new bn(var2.g9, var2);
				c_ao var83;
				(var83 = new c_ao((byte) 0, var2)).method_do("装备比较");
				var2.method_if(var83);
				c_ao var90 = new c_ao((byte) 1, var2);
				var2.method_if(var90);
				ba.q = false;
				c_y var88 = new c_y((short) 0, (short) 18, (short) c_a5.ic, (short) (c_a5.il - 18 - c_ao.aA() + 7),
						(byte) 1, var2);
				var2.method_if(var88);
				short var96 = (short) (135 * c_a5.il / 208 + 5);
				var88.method_try((short) 49);
				var88.method_case(var96);
				var73.method_do(var88);
				var103 = (short) (29 * c_a5.il / 208);
				short var107 = (short) (60 * c_a5.ic / 176);
				short var110 = (short) (125 * c_a5.ic / 176);
				a7 var113 = new a7((short) 21, var103, var2);
				var2.method_if(var113);
				var73.method_do(var113);
				a7 var116;
				(var116 = new a7(var107, var103, (short) 0, (short) 0, (String) null, (byte) 1, var2)).g(var32);
				short var26 = (short) (var32 % 1000);
				var116.ft = true;
				var116.method_if(var26, true);
				var116.a(c_a5.gg);
				var2.method_if(var116);
				var73.method_do(var116);
				a7 var93;
				(var93 = new a7(var110, var103, (short) 0, (short) 0, (String) null, (byte) 1, var2)).g(var37);
				var26 = (short) (var37 % 1000);
				var93.ft = true;
				var93.method_if(var26, true);
				var93.a(c_a5.gg);
				var2.method_if(var93);
				var73.method_do(var93);
				short var118 = (short) (var88.I[0] + c_a5.iA - 3);
				short var120 = (short) var88.I[1];
				short var25;
				var26 = (short) ((var25 = (short) ((var88.I[0] + var88.I[0] + (var88.I[2] + (c_a5.iA << 1) + 2 + 1) / 2
						+ (c_a5.iA << 1) + 2 + 1) / 2 - 1)) - (var88.I[0] + (c_a5.iA << 1) + 2) + var88.I[0]
						+ (var88.I[2] + (c_a5.iA << 1) + 2 + 1) / 2 + 4);

				for (var34 = 0; var34 < var47; ++var34) {
					ah var85;
					ah var97;
					switch (var52[var34]) {
					case 1:
						String[] var43 = (String[]) ((String[]) var61[var34]);
						var45 = new ah(var118, (short) (var120 + c_a5.iG * var34), (byte) 0, var62[var34], true, var2);
						var85 = new ah(var25, (short) (var120 + c_a5.iG * var34), (byte) 0, var43[0], true, var2);
						var97 = new ah(var26, (short) (var120 + c_a5.iG * var34), (byte) 0, var43[1], true, var2);
						var2.method_if(var45);
						var73.method_do(var45);
						var2.method_if(var85);
						var73.method_do(var85);
						var2.method_if(var97);
						var73.method_do(var97);
						break;
					case 4:
						int[] var40 = (int[]) ((int[]) var61[var34]);
						var45 = new ah(var118, (short) (var120 + c_a5.iG * var34), (byte) 0, var62[var34], true, var2);
						(var85 = new ah(var25, (short) (var120 + c_a5.iG * var34), (byte) 3, var2))
								.method_case(var40[0]);
						var85.method_new((short) (var25 - var85.method_for() / 2));
						var85.method_for((short) (var120 + c_a5.iG * var34 + var85.z() / 2));
						(var97 = new ah(var26, (short) (var120 + c_a5.iG * var34), (byte) 3, var2))
								.method_case(var40[1]);
						var97.method_new((short) (var26 - var97.method_for() / 2));
						var97.method_for((short) (var120 + c_a5.iG * var34 + var97.z() / 2));
						var2.method_if(var45);
						var73.method_do(var45);
						var2.method_if(var85);
						var73.method_do(var85);
						var2.method_if(var97);
						var73.method_do(var97);
					}
				}

				if (var88.U == null && var88.G < var47) {
					var88.method_new(true);
					var73.method_do(var88.U);
				}

				var88.a((short) var47, (short) var88.G);
				var73.w();
				var2.method_if(var73);
				ba.q = true;
				break;
			case -2145779711:
			case -2145779710:
				var2 = c_a5.es;
				c_b5.method_case("in parseCmdData S_MAIL_RECEIVE_NORMAL");
				(var31 = (a9) var2.cf().elementAt(3)).j(false);
				(var33 = (a9) var2.cf().elementAt(4)).j(false);
				ak var38 = (ak) var2.cf().elementAt(5);
				a9 var41;
				(var41 = (a9) var2.cf().elementAt(13)).j(false);
				a7[] var48 = new a7[6];

				for (int var57 = 0; var57 < var48.length; ++var57) {
					var48[var57] = (a7) var2.cf().elementAt(var57 + 7);
				}

				c_q.r = var0.readLong() != 0L;
				var69 = var0.readUTF();
				var33.a(new StringBuffer(var69));
				String var74 = var0.readUTF();
				var31.a(new StringBuffer(var74));
				String var81 = var0.readUTF();
				c_b5.method_case("~~~~~~~~~mailContent = " + var81);
				var38.method_if(var81);
				var38.ap();
				var38.method_else(16711680);
				var0.readBoolean();
				boolean var86 = false;
				c_q.field_char = var91 = var0.readInt();
				c_b5.method_case("付费金额-------------" + var91);
				var41.a(new StringBuffer(var91 + ""));
				var15 = var0.readByte();
				c_b5.method_case("附件数量-----------------" + var15);
				c_q.field_for = false;

				for (var39 = 0; var39 < var48.length; ++var39) {
					var103 = var0.readShort();
					byte var106 = var0.readByte();
					var18 = var0.readByte();
					byte var112 = var0.readByte();
					var48[var39].l(var112);
					var48[var39].c(var103);
					var48[var39].g(var103);
					var48[var39].ft = true;
					short var115 = (short) (var103 % 1000);
					var48[var39].method_if(var115, true);
					var48[var39].a(c_a5.gg);
					var48[var39].method_long(var106);
					var48[var39].fd = (byte) var39;
					if (var18 != 1 && var103 != 0) {
						var48[var39].g(true);
					} else {
						var48[var39].g(false);
					}
				}

				for (var39 = 0; var39 < var48.length; ++var39) {
					if (var48[var39].bu() > 0) {
						c_q.field_for = true;
						break;
					}
				}

				if (c_q.a != -1) {
					var31.a(false, var2);
					var33.a(false, var2);
					var48[c_q.a].a(true, var2);
				}

				if (var1 == -2145779711) {
					c_a5.es.g9 = 1703940;
				} else if (var1 == -2145779710) {
					c_a5.es.g9 = 1703941;
				}
				break;
			case -2145779707:
				var2 = c_a5.es;
				c_q.s = var0.readLong();
				c_q.field_new = var0.readUTF();
				c_q.field_try = var0.readUTF();
				c_q.f[0] = c_q.field_new;
				c_q.f[1] = c_q.field_try;
				var31 = (a9) var2.cf().elementAt(3);
				var33 = (a9) var2.cf().elementAt(4);
				var31.a(new StringBuffer(c_q.field_new));
				var33.a(new StringBuffer(c_q.field_try));
				break;
			case -2145583099:
				var2 = c_a5.es;
				bw.f = var0.readInt();
				(var31 = (a9) var2.cf().elementAt(7)).a(new StringBuffer(Integer.toString(bw.f)));
				var31.j(false);
				break;
			case -2145583097:
				(var2 = c_a5.es).c("按#键刷新");
				c_b5.method_case("in parseCmdData S_AUCTION_HANG");
				c_bv var29 = (c_bv) var2.cf().elementAt(2);
				var33 = (a9) var2.cf().elementAt(14);
				var5 = (ah) var2.cf().elementAt(15);
				a7 var6 = (a7) var2.cf().elementAt(5);
				ah var7 = (ah) var2.cf().elementAt(8);
				a9 var8 = (a9) var2.cf().elementAt(7);
				a9 var9 = (a9) var2.cf().elementAt(10);
				a9 var10 = (a9) var2.cf().elementAt(12);
				var29.dy();
				var29.jE = 18;
				byte var11 = var0.readByte();
				c_b5.method_case("当前页面物品数来那个" + var11);
				bw.c = var12 = var0.readShort();
				if (var12 < bw.field_void) {
					bw.field_void = var12;
				}

				var5.method_case(bw.field_void);
				var5.method_byte(var12);

				for (var13 = 0; var13 < var11; ++var13) {
					long var14 = var0.readLong();
					short var36 = var0.readShort();
					var16 = var0.readByte();
					String var17 = var0.readUTF();
					var18 = var0.readByte();
					short var19 = var0.readShort();
					byte var20 = var0.readByte();
					var1 = var0.readInt();
					var79 = var0.readInt();
					byte var21 = var0.readByte();
					c_m var22;
					(var22 = new c_m((byte) 5)).a(var17, var14, var36, var16, var18, var19, var20, var1, var79, var21);
					var29.a(var22);
				}

				c_bv.a(var29, (byte) 5);
				bw.field_case = var13 = var0.readInt();
				if (var11 > 0) {
					var89 = (c_m) var29.dt().elementAt(var29.dw());
					var6.ft = true;
					var6.a(c_a5.gg);
					var6.g(var89.B);
					var6.method_if((short) (var89.B % 1000), true);
					if (var89.y == 1) {
						var6.g(false);
					} else {
						var6.a(true, var89.g);
					}

					var7.method_case(var89.f);
					var8.a(new StringBuffer(var89.r + ""));
					var8.j(false);
					var9.a(new StringBuffer(var89.i + ""));
					var9.j(false);
					var10.a(new StringBuffer(var89.l));
					var10.j(false);
					var33.a(new StringBuffer(var13 + ""));
					var33.j(false);
				} else {
					var6.a((bi) null);
					var6.g(false);
					var7.method_case(0);
					var8.a(new StringBuffer(""));
					var8.j(false);
					var9.a(new StringBuffer(""));
					var9.j(false);
					var10.a(new StringBuffer(""));
					var10.j(false);
					var33.a(new StringBuffer(var13 + ""));
					var33.j(false);
				}
				break;
			case -2145517536:
				var2 = c_a5.es;
				au.field_new = new int[var3 = var0.readByte()];

				for (int var4 = 0; var4 < var3; ++var4) {
					au.field_new[var4] = var0.readInt();
				}

				((ah) var2.cf().elementAt(16)).a("" + au.field_new[au.field_for]);
			}
		} catch (Exception var24) {
			var24.printStackTrace();
		}

		return var2;
	}

	private static ah method_do(DataInputStream var0, c_be var1) throws IOException {
		byte var2 = var0.readByte();
		short var3 = var0.readShort();
		short var4 = var0.readShort();
		String var5 = var0.readUTF();
		ah var6 = null;
		short var7;
		int var8;
		int var9;
		switch (var2) {
		case 0:
			var6 = new ah(var3, var4, var2, var5, var1);
			break;
		case 1:
			var7 = var0.readShort();
			var8 = var0.readInt();
			(var6 = new ah(var3, var4, var7, var2, var5, var1)).method_char(var8);
			break;
		case 2:
			var9 = var0.readInt();
			var8 = var0.readInt();
			(var6 = new ah(var3, var4, var2, var1, (byte) 0)).method_case(var9);
			var6.method_byte(var8);
			break;
		case 3:
			var9 = var0.readInt();
			(var6 = new ah(var3, var4, var2, var1)).method_case(var9);
			break;
		case 4:
			var7 = var0.readShort();
			var6 = new ah(var3, var4, var7, var2, var5, var1);
		}

		return var6;
	}

	private static ay method_char(DataInputStream var0, c_be var1) throws IOException {
		byte var2 = var0.readByte();
		short var3 = var0.readShort();
		short var4 = var0.readShort();
		String var5 = var0.readUTF();
		byte var6 = var0.readByte();
		ay var7 = new ay(var3, var4, var2, var5, var1);

		byte var9;
		for (var9 = 0; var9 < var6; ++var9) {
			String var10 = var0.readUTF();
			var7.method_try(var10);
		}

		var9 = var0.readByte();
		var7.method_char(var9);
		switch (var2) {
		case 0:
			boolean var12 = var0.readBoolean();
			var7.e(var12);
			var7.method_do(var7.bg());
			var7.a(var7.bb());
			var7.ef = new boolean[var6];

			for (int var8 = 0; var8 < var6; ++var8) {
				boolean var11 = var0.readBoolean();
				var7.a(var8, var11);
			}
		default:
			return var7;
		}
	}

	private static a7 method_int(DataInputStream var0, c_be var1) throws IOException {
		byte var2 = var0.readByte();
		short var3 = var0.readShort();
		short var4 = var0.readShort();
		String var5 = var0.readUTF();
		c_b5.method_case("imgName = " + var5);
		a7 var6 = null;
		boolean var9;
		String var10;
		switch (var2) {
		case 0:
			short var12 = var0.readShort();
			short var14 = var0.readShort();
			var9 = var0.readBoolean();
			(var6 = new a7(var3, var4, var12, var14, var5, var2, var1)).f(var9);
			break;
		case 1:
			boolean var11 = var0.readBoolean();
			byte var13 = var0.readByte();
			var9 = var0.readBoolean();
			(var6 = new a7(var3, var4, var5, (String) null, var2, var1)).g(var11);
			var6.a(var11, var13);
			var6.i(var9);
			break;
		case 2:
			var10 = null;
			var6 = new a7(var3, var4, var5, (String) null, var2, var1);
			break;
		case 3:
			var10 = var0.readUTF();
			Object var8 = null;
			(var6 = new a7(var3, var4, var5, (String) null, var2, var1)).method_case(var10);
			break;
		case 4:
			byte var7 = var0.readByte();
			(var6 = new a7(var3, var4, var5, (String) null, var2, var1)).f(var7);
			break;
		case 5:
			var6 = new a7(var3, var4, var5, (String) null, var2, var1);
		}

		return var6;
	}

	private static ae method_if(DataInputStream var0, c_be var1) throws IOException {
		short var2 = var0.readShort();
		short var3 = var0.readShort();
		short var4 = var0.readShort();
		byte var5 = var0.readByte();
		ae var6 = new ae(var2, var3, var4, (short) 0, var5, var1);
		int var7 = var0.readInt();
		Vector var8 = new Vector();
		int var9 = 0;

		for (var7 = var7; var9 < var7; ++var9) {
			String var10 = var0.readUTF();
			var8.addElement(var10);
		}

		var6.a(var8);
		return var6;
	}

	private static c_bv method_byte(DataInputStream var0, c_be var1) throws IOException {
		byte var2 = var0.readByte();
		short var3 = var0.readShort();
		short var4 = var0.readShort();
		short var5 = var0.readShort();
		short var6 = var0.readShort();
		c_bv var8 = new c_bv(var3, var4, var5, var6, var2, var1);
		switch (var2) {
		case 0:
			var2 = var0.readByte();

			for (int var9 = 0; var9 < var2; ++var9) {
				String var11 = var0.readUTF();
				var8.a(new c_m(var11, (byte) 0, (byte) 0, var8.dF()));
			}

			boolean var10 = var0.readBoolean();
			boolean var12 = var0.readBoolean();
			boolean var7 = var0.readBoolean();
			var8.o(var10);
			var8.p(var12);
			var8.n(var7);
			var8.x(var8.z$132bd3());
			c_bv.a(var8, (byte) 0);
		default:
			return var8;
		}
	}

	private static c_bg method_new(DataInputStream var0, c_be var1) throws IOException {
		short var2 = var0.readShort();
		short var3 = var0.readShort();
		short var4 = var0.readShort();
		short var5 = var0.readShort();
		byte var6 = var0.readByte();
		byte var7 = var0.readByte();
		short var8 = var0.readShort();
		v var9 = new v();

		for (int var10 = 0; var10 < var7; ++var10) {
			var0.readByte();
			boolean var11 = false;
			ah var12 = method_do(var0, var1);
			var9.a(var12);
		}

		c_bg var18 = new c_bg(var2, var3, var4, var5, var7, var9, var1);
		short[] var19 = new short[var7];

		for (int var20 = 0; var20 < var7; ++var20) {
			var19[var20] = var0.readShort();
		}

		boolean[] var21 = new boolean[var7];

		int var13;
		for (var13 = 0; var13 < var7; ++var13) {
			var21[var13] = var0.readBoolean();
		}

		for (var13 = 0; var13 < var6; ++var13) {
			v var14;
			(var14 = new v()).b = (short) (var8 * c_a5.il / 208);

			for (int var15 = 0; var15 < var7; ++var15) {
				Object var16 = null;
				switch (var0.readByte()) {
				case 1:
					var16 = method_do(var0, var1);
					break;
				case 4:
					var16 = method_int(var0, var1);
					break;
				default:
					c_b5.method_case("列表中的未知控件类型");
				}

				boolean var17 = var0.readBoolean();
				((ba) var16).a(var17);
				if (((ba) var16).o()) {
					var0.readShort();
				}

				var14.a((ba) var16);
			}

			var14.a(var19);
			var14.a(var21);
			var18.method_if(var14);
		}

		if (var18.cI() != null) {
			var18.cI().a(var19);
		}

		return var18;
	}
}
