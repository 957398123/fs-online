import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class ay extends ba {
	public String d7;
	public Vector d9;
	public boolean[] ef;
	private byte eb;
	private byte ee;
	public boolean[] d1;
	private boolean d5;
	private byte d2;
	public static byte[] d4 = new byte[5];
	public boolean eg;
	public boolean ec;

	public final boolean bl() {
		return this.d5;
	}

	public final void e(boolean var1) {
		this.d5 = var1;
	}

	public final byte bj() {
		return this.ee;
	}

	public final void method_char(byte var1) {
		this.ee = var1;
	}

	private ay(short var1, short var2, short var3, short var4, byte var5, String var6, c_be var7) {
        super(var1, var2, (short)0, (short)0, var7);
        this.d5 = true;
        this.eg = false;
        this.ec = false;
        super.y = var5;
        this.d7 = var6;
        this.d9 = new Vector();
        super.a = this.bg();
        super.field_int = this.bb();
        super.b = true;
        this.eb = this.ee = 0;
    }

	public ay(short var1, short var2, byte var3, String var4, c_be var5) {
		this(var1, var2, (short) 0, (short) 0, var3, var4, var5);
	}

	public final void a(Graphics var1) {
        if (this.d7 != null && !this.d7.equals("")) {
            if (this.q()) {
                var1.setColor(c_bm.field_try);
            } else {
                var1.setColor(c_bm.bP);
            }

            if (super.y == 2) {
                var1.setColor(c_bm.bP);
            }

            var1.drawString(this.d7, super.k, super.j, 20);
        }

        int var2 = super.k;
        if (this.d7 != null && !this.d7.equals("")) {
            var2 += this.d7.length() * c_a5.iA + 8;
        }

        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (super.y == 0 && !this.d9.isEmpty()) {
            if (this.d5) {
                var3 = super.j + (super.field_int - 8) / 2;

                for(var4 = 0; var4 < this.d9.size(); ++var4) {
                    if (var4 == this.ee && this.ef[var4]) {
                        var1.setColor(c_bm.field_else);
                        var1.drawRect(var2 + this.e(var4), var3, 7, 7);
                        var1.setColor(c_bm.v);
                        var1.drawRect(var2 + this.e(var4) + 1, var3 + 1, 5, 5);
                        var1.setColor(c_bm.field_else);
                        var1.fillRect(var2 + this.e(var4) + 2, var3 + 2, 4, 4);
                    } else if (this.ef[var4]) {
                        var1.setColor(c_bm.v);
                        var1.drawRect(var2 + this.e(var4), var3, 7, 7);
                        var1.setColor(c_bm.v);
                        var1.fillRect(var2 + this.e(var4) + 1, var3 + 1, 6, 6);
                    } else {
                        var1.setColor(c_bm.field_else);
                        var1.drawRect(var2 + this.e(var4), var3, 7, 7);
                        var1.setColor(c_bm.aV);
                        var1.fillRect(var2 + this.e(var4) + 1, var3 + 1, 6, 6);
                        var1.setColor(c_bm.field_else);
                        var1.drawLine(var2 + this.e(var4), var3, var2 + this.e(var4) + 8 - 1, var3 + 8 - 1);
                        var1.drawLine(var2 + this.e(var4) + 8 - 1, var3, var2 + this.e(var4), var3 + 8 - 1);
                    }

                    if (var4 == this.eb && this.q()) {
                        var1.setColor(c_bm.cP);
                        var5 = var2 + 8 + 4 + this.e(var4) - 1;
                        var6 = super.j - 1;
                        var7 = ((String)this.d9.elementAt(var4)).length() * c_a5.iA + 2;
                        var8 = c_a5.iG + 2;
                        var1.fillRect(var5, var6, var7, var8);
                        var1.setColor(c_bm.v);
                    } else {
                        var1.setColor(c_bm.bP);
                    }

                    var1.drawString((String)this.d9.elementAt(var4), var2 + 8 + 4 + this.e(var4), super.j, 20);
                }

            } else {
                var3 = super.j + (c_a5.iG - 8) / 2;

                for(var4 = 0; var4 < this.d9.size(); ++var4) {
                    if (var4 == this.ee && this.ef[var4]) {
                        var1.setColor(c_bm.field_else);
                        var1.drawRect(var2, var3 + d(var4), 7, 7);
                        var1.setColor(c_bm.v);
                        var1.drawRect(var2 + 1, var3 + d(var4) + 1, 5, 5);
                        var1.setColor(c_bm.field_else);
                        var1.fillRect(var2 + 2, var3 + d(var4) + 2, 4, 4);
                    } else if (this.ef[var4]) {
                        var1.setColor(c_bm.field_else);
                        var1.drawRect(var2, var3 + d(var4), 7, 7);
                        var1.setColor(c_bm.v);
                        var1.fillRect(var2 + 1, var3 + d(var4) + 1, 6, 6);
                    } else {
                        var1.setColor(c_bm.field_else);
                        var1.drawRect(var2, var3 + d(var4), 7, 7);
                        var1.setColor(c_bm.aV);
                        var1.fillRect(var2 + 1, var3 + d(var4) + 1, 6, 6);
                        var1.setColor(c_bm.field_else);
                        var1.drawLine(var2, var3 + d(var4), var2 + 8 - 1, var3 + d(var4) + 8 - 1);
                        var1.drawLine(var2 + 8 - 1, var3 + d(var4), var2, var3 + d(var4) + 8 - 1);
                    }

                    if (var4 == this.eb) {
                        var1.setColor(c_bm.cP);
                        var5 = var2 + 8 + 4 - 1;
                        var6 = super.j + f(var4) - 1;
                        var7 = ((String)this.d9.elementAt(var4)).length() * c_a5.iA + 2;
                        var8 = c_a5.iG + 2;
                        var1.fillRect(var5, var6, var7, var8);
                        var1.setColor(c_bm.v);
                    } else {
                        var1.setColor(c_bm.bP);
                    }

                    var1.drawString((String)this.d9.elementAt(var4), var2 + 8 + 4, super.j + f(var4), 20);
                }

            }
        } else if (super.y == 1 && !this.d9.isEmpty()) {
            if (this.q()) {
                super.a = this.bg();
                var1.setColor(c_bm.bP);
                var1.fillRect(super.k - 2, super.j - 1, super.a + 3, c_a5.iG + 1);
            }

            if (this.d7 != null && !this.d7.equals("")) {
                if (this.q()) {
                    var1.setColor(c_bm.field_try);
                } else {
                    var1.setColor(c_bm.bP);
                }

                var1.drawString(this.d7, super.k, super.j, 20);
            }

            var1.drawImage(c_a5.eb, var2, super.j, 20);
            if (this.q()) {
                var1.setColor(c_bm.field_try);
            } else {
                var1.setColor(c_bm.bP);
            }

            var1.drawString((String)this.d9.elementAt(this.eb), var2 + c_a5.eb.getWidth() + 4, super.j, 20);
            c_b5.a(var1, c_a5.eb, var2 + c_a5.eb.getWidth() + 8 + c_b5.method_do((String)this.d9.elementAt(this.eb)), super.j, 2);
        } else {
            if (super.y == 2 && !this.d9.isEmpty()) {
                var3 = super.j + (c_a5.iG - 8) / 2;

                for(var4 = 0; var4 < this.d9.size(); ++var4) {
                    if (this.d1[var4]) {
                        var1.setColor(c_bm.field_else);
                        var1.drawRect(var2, var3 + d(var4), 7, 7);
                        var1.setColor(c_bm.v);
                        var1.drawRect(var2 + 1, var3 + d(var4) + 1, 5, 5);
                        var1.setColor(c_bm.field_else);
                        var1.fillRect(var2 + 2, var3 + d(var4) + 2, 4, 4);
                    } else {
                        var1.setColor(c_bm.field_else);
                        var1.drawRect(var2, var3 + d(var4), 7, 7);
                        var1.setColor(c_bm.v);
                        var1.fillRect(var2 + 1, var3 + d(var4) + 1, 6, 6);
                    }

                    if (var4 == this.eb) {
                        var1.setColor(c_bm.cP);
                        var5 = var2 + 8 + 4 - 1;
                        var6 = super.j + f(var4) - 1;
                        var7 = ((String)this.d9.elementAt(var4)).length() * c_a5.iA + 2;
                        var8 = c_a5.iG + 2;
                        var1.fillRect(var5, var6, var7, var8);
                        var1.setColor(c_bm.v);
                    } else {
                        var1.setColor(c_bm.bP);
                    }

                    var1.drawString((String)this.d9.elementAt(var4), var2 + 8 + 4, super.j + f(var4), 20);
                }
            }

        }
    }

	public final short bb() {
		switch (super.y) {
		case 0:
		case 2:
			if (this.d5) {
				return (short) c_a5.iG;
			}

			return (short) ((c_a5.iG + 2) * this.d9.size() - 2);
		case 1:
			return (short) c_a5.eb.getHeight();
		default:
			throw new IllegalArgumentException("类型不匹配");
		}
	}

	public final void method_byte(String var1) {
		this.d7 = var1;
	}

	public final byte bm() {
		return this.eb;
	}

	public final void method_case(byte var1) {
		if (var1 >= 0 && var1 < this.d9.size()) {
			this.eb = var1;
		} else {
			throw new IllegalArgumentException("参数不符合");
		}
	}

	public final String[] be() {
		String[] var1 = new String[this.d9.size()];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			var1[var2] = (String) this.d9.elementAt(var2);
		}

		return var1;
	}

	public final void method_try(String var1) {
        if (var1 != null) {
            this.d9.addElement(var1);
            super.a = this.bg();
            super.field_int = this.bb();
        }

    }

	private short e(int var1) {
		short var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (short) (var2 + 12 + ((String) this.d9.elementAt(var3)).length() * c_a5.iA + 7);
		}

		return var2;
	}

	private static short d(int var0) {
		short var1 = 0;

		for (int var2 = 0; var2 < var0; ++var2) {
			var1 = (short) (var1 + 10 + (c_a5.iG - 8));
		}

		return var1;
	}

	private static short f(int var0) {
		short var1 = 0;

		for (int var2 = 0; var2 < var0; ++var2) {
			var1 = (short) (var1 + c_a5.iG + 2);
		}

		return var1;
	}

	public final void a(int var1, boolean var2) {
		if (var1 >= 0 && var1 <= this.ef.length - 1) {
			this.ef[var1] = var2;
		} else {
			throw new IndexOutOfBoundsException("index下标越界");
		}
	}

	public final short bg() {
		short var1 = 0;
		int var2 = c_a5.iA;
		if (this.d7 != null && !this.d7.equals("")) {
			var1 = (short) (0 + var2 * this.d7.length() + 8);
		}

		switch (super.y) {
		case 0:
		case 2:
			int var3;
			if (this.d5) {
				var3 = 0;

				for (int var4 = this.d9.size(); var3 < var4; ++var3) {
					var1 = (short) (var1 + 12 + var2 * ((String) this.d9.elementAt(var3)).length());
					if (var3 != var4 - 1) {
						var1 = (short) (var1 + 7);
					}
				}

				return var1;
			} else {
				ay var6 = this;
				int var7 = c_a5.iA;
				var2 = 0;

				for (var3 = 1; var3 < var6.d9.size(); ++var3) {
					String var8 = (String) var6.d9.elementAt(var3);
					String var5 = (String) var6.d9.elementAt(var2);
					if (var8.length() > var5.length()) {
						var2 = var3;
					}
				}

				var1 = (short) (var1 + 12 + (short) (var7 * ((String) var6.d9.elementAt(var2)).length()));
				break;
			}
		case 1:
			if (!this.d9.isEmpty()) {
				var1 = (short) (var1 + (c_a5.eb.getWidth() + 4 << 1)
						+ var2 * ((String) this.d9.elementAt(this.eb)).length());
			}
			break;
		default:
			throw new IllegalArgumentException("类型不匹配");
		}

		return var1;
	}

	public final void f() {
        byte var6;
        if (super.field_byte) {
            if (c_a5.method_byte(131072) || c_a5.method_byte(65536)) {
                if (super.y == 0 && !this.d9.isEmpty()) {
                    switch((Integer)this.y().db().elementAt(this.y().de())) {
                    case 0:
                        var6 = this.eb;
                        this.ee = var6;
                    default:
                        super.field_byte = false;
                    }
                } else if (super.y == 2) {
                    switch(c_a5.es.g9) {
                    case -1610612632:
                        byte var12;
                        label338:
                        switch((Integer)this.y().db().elementAt(this.y().de())) {
                        case -1610612631:
                            if (!this.d1[this.eb]) {
                                this.d1[this.eb] = true;
                            }
                            break;
                        case -1610612624:
                            if (this.d1[this.eb]) {
                                this.d1[this.eb] = false;
                            }
                            break;
                        case -1610612623:
                            var12 = 0;

                            while(true) {
                                if (var12 >= u.field_long) {
                                    break label338;
                                }

                                this.d1[var12] = true;
                                ++var12;
                            }
                        case -1610612621:
                            var12 = 0;

                            while(true) {
                                if (var12 >= u.field_long) {
                                    break label338;
                                }

                                this.d1[var12] = false;
                                ++var12;
                            }
                        case 2686980:
                            for(var12 = 0; var12 < u.field_long; ++var12) {
                                u.r[var12] = this.d1[var12];
                            }

                            c_a5.eQ.a(2686980);
                            c_as.a((byte)0, "请您稍候，正在进行操作", "", "", -2, -2);
                        }
                    }
                } else if (super.y == 1) {
                    switch(c_a5.es.g9) {
                    case 1900547:
                        if (bw.a == 1) {
                            switch((Integer)this.y().db().elementAt(this.y().de())) {
                            case -1610612714:
                                bw.method_if((byte)1);
                                break;
                            case -1610612713:
                                bw.method_do();
                            }

                            super.field_byte = false;
                        }
                    }
                }

                super.field_byte = false;
                return;
            }

            if (!c_a5.method_try(16384) && !c_a5.method_try(32768)) {
                if (c_a5.method_try(4096)) {
                    this.y().c8();
                    return;
                }

                if (c_a5.method_try(8192)) {
                    this.y().c9();
                    return;
                }

                if (c_a5.method_byte(262144)) {
                    super.field_byte = false;
                    return;
                }
            }
        } else if (!c_a5.method_byte(131072) && !c_a5.method_byte(65536)) {
            ay var10;
            ay var13;
            ay var14;
            ay var15;
            if (c_a5.method_try(16384)) {
                if (super.y == 1 && !this.d9.isEmpty()) {
                    if (this.q()) {
                        if (c_a5.method_else() == 18) {
                            label377: {
                                var13 = (ay)c_a5.es.cf().elementAt(5);
                                var10 = (ay)c_a5.es.cf().elementAt(6);
                                var14 = (ay)c_a5.es.cf().elementAt(7);
                                var15 = (ay)c_a5.es.cf().elementAt(8);
                                if (var13.q()) {
                                    --var13.eb;
                                    d4[1] = 0;
                                    if (var13.eb < 0) {
                                        var13.eb = 0;
                                        ++d4[0];
                                    }

                                    c_a5.ci = (byte)(var13.eb + 1);
                                    if (var13.eb != 0 || d4[0] != 0) {
                                        break label377;
                                    }

                                    var10.eb = 0;
                                    var15.eb = 0;
                                    c_a5.ck = (byte)(var10.eb + 1);
                                } else {
                                    if (var10.q()) {
                                        --var10.eb;
                                        d4[3] = 0;
                                        d4[4] = 0;
                                        if (var13.eb == 0) {
                                            if (var10.eb < 0) {
                                                var10.eb = 0;
                                                ++d4[2];
                                            }
                                        } else if (var13.eb == 1 && var10.eb < 2) {
                                            var10.eb = 2;
                                            ++d4[2];
                                        }

                                        c_a5.ck = (byte)(var10.eb + 1);
                                        if ((var10.eb == 0 || var10.eb == 2 || var10.eb == 3) && d4[2] == 0) {
                                            var15.eb = 0;
                                        } else if (var10.eb == 1) {
                                            var15.eb = 1;
                                        }

                                        c_a5.ig = (byte)(var15.eb + 1);
                                        break label377;
                                    }

                                    if (var14.q()) {
                                        --var14.eb;
                                        if (var14.eb < 0) {
                                            var14.eb = 0;
                                        }

                                        c_a5.fW = var14.eb;
                                        break label377;
                                    }

                                    if (!var15.q()) {
                                        break label377;
                                    }

                                    --var15.eb;
                                    if (var10.eb != 0 && var10.eb != 2) {
                                        if (var10.eb == 1) {
                                            if (var15.eb < 1) {
                                                var15.eb = 1;
                                            }
                                        } else if (var10.eb == 3) {
                                            if (var15.eb < 0) {
                                                var15.eb = 0;
                                            } else if (var15.eb == 4) {
                                                var15.eb = 3;
                                            } else if (var15.eb == 2) {
                                                var15.eb = 1;
                                            }
                                        }
                                    } else if (var15.eb < 0) {
                                        var15.eb = 0;
                                    } else if (var10.eb == 0 && var15.eb == 4) {
                                        var15.eb = 3;
                                    }
                                }

                                c_a5.ig = (byte)(var15.eb + 1);
                            }

                            super.a = this.bg();
                            c_a5.iC[0].eo = new c_b((short)0, (short)0, c_a5.ck, c_a5.ig, c_a5.fW);
                            c_a5.a(false);
                            return;
                        }

                        switch(c_a5.es.g9) {
                        case -1610612734:
                            if (!this.bc()) {
                                return;
                            }

                            b2.a();
                            av.a((byte)(this.eb + 1));
                            break;
                        case -1610612728:
                            this.d(true);
                            break;
                        case -1610612727:
                            var13 = (ay)c_a5.es.cf().elementAt(3);
                            if (bp.ag().r() >= 20 && var13.q()) {
                                return;
                            }

                            this.bc();
                            break;
                        case 1900547:
                            if (!this.bc()) {
                                return;
                            }

                            bw.d = this.eb;
                            break;
                        default:
                            this.bc();
                            return;
                        }
                    }
                } else if ((super.y == 0 || super.y == 2) && !this.d9.isEmpty() && this.d5) {
                    this.bc();
                    if (c_a5.es.g9 == 3145731) {
                        var6 = this.eb;
                        this.ee = var6;
                        return;
                    }
                }
            } else if (c_a5.method_try(32768)) {
                if (super.y == 1 && !this.d9.isEmpty()) {
                    if (this.q()) {
                        if (c_a5.method_else() == 18) {
                            label403: {
                                var13 = (ay)c_a5.es.cf().elementAt(5);
                                var10 = (ay)c_a5.es.cf().elementAt(6);
                                var14 = (ay)c_a5.es.cf().elementAt(7);
                                var15 = (ay)c_a5.es.cf().elementAt(8);
                                if (var13.q()) {
                                    ++var13.eb;
                                    d4[0] = 0;
                                    if (var13.eb > var13.d9.size() - 1) {
                                        var13.eb = (byte)(var13.d9.size() - 1);
                                        ++d4[1];
                                    }

                                    c_a5.ci = (byte)(var13.eb + 1);
                                    if (var13.eb != 1 || d4[1] != 0) {
                                        break label403;
                                    }

                                    var10.eb = 2;
                                    var15.eb = 0;
                                    c_a5.ck = (byte)(var10.eb + 1);
                                } else {
                                    if (var10.q()) {
                                        ++var10.eb;
                                        d4[2] = 0;
                                        if (var13.eb == 0) {
                                            if (var10.eb > var10.d9.size() - 3) {
                                                var10.eb = (byte)(var10.d9.size() - 3);
                                                ++d4[3];
                                            }
                                        } else if (var13.eb == 1 && var10.eb > var10.d9.size() - 1) {
                                            var10.eb = (byte)(var10.d9.size() - 1);
                                            ++d4[4];
                                        }

                                        c_a5.ck = (byte)(var10.eb + 1);
                                        if ((var10.eb == 0 || var10.eb == 2 || var10.eb == 3) && d4[4] == 0) {
                                            var15.eb = 0;
                                        } else if (var10.eb == 1 && d4[3] == 0) {
                                            var15.eb = 1;
                                        }

                                        c_a5.ig = (byte)(var15.eb + 1);
                                        break label403;
                                    }

                                    if (var14.q()) {
                                        ++var14.eb;
                                        if (var14.eb > var14.d9.size() - 1) {
                                            var14.eb = (byte)(var14.d9.size() - 1);
                                        }

                                        c_a5.fW = var14.eb;
                                        break label403;
                                    }

                                    if (!var15.q()) {
                                        break label403;
                                    }

                                    ++var15.eb;
                                    if (var10.eb == 0) {
                                        if (var15.eb > var15.d9.size() - 3) {
                                            var15.eb = (byte)(var15.d9.size() - 1);
                                        }
                                    } else if (var10.eb == 2) {
                                        if (var15.eb > var15.d9.size() - 3) {
                                            var15.eb = (byte)(var15.d9.size() - 2);
                                        }
                                    } else if (var10.eb == 1) {
                                        if (var15.eb > var15.d9.size() - 2) {
                                            var15.eb = (byte)(var15.d9.size() - 2);
                                        }
                                    } else if (var10.eb == 3) {
                                        if (var15.eb > 3) {
                                            var15.eb = (byte)(var15.d9.size() - 1);
                                        } else if (var15.eb > 1) {
                                            var15.eb = 3;
                                        } else if (var15.eb > var15.d9.size() - 1) {
                                            var15.eb = (byte)(var15.d9.size() - 1);
                                        }
                                    }
                                }

                                c_a5.ig = (byte)(var15.eb + 1);
                            }

                            super.a = this.bg();
                            c_a5.iC[0].eo = new c_b((short)0, (short)0, c_a5.ck, c_a5.ig, c_a5.fW);
                            c_a5.a(false);
                            return;
                        }

                        switch(c_a5.es.g9) {
                        case -1610612734:
                            if (!this.bd()) {
                                return;
                            }

                            b2.a();
                            av.a((byte)(this.eb + 1));
                            break;
                        case -1610612728:
                            this.d(false);
                            break;
                        case -1610612727:
                            var13 = (ay)c_a5.es.cf().elementAt(3);
                            if (bp.ag().r() >= 20 && var13.q()) {
                                return;
                            }

                            this.bd();
                            break;
                        case 1900547:
                            if (!this.bd()) {
                                return;
                            }

                            bw.d = this.eb;
                            break;
                        default:
                            this.bd();
                            return;
                        }
                    }
                } else if ((super.y == 0 || super.y == 2) && !this.d9.isEmpty() && this.d5) {
                    this.bd();
                    if (c_a5.es.g9 == 3145731) {
                        var6 = this.eb;
                        this.ee = var6;
                        return;
                    }
                }
            } else if (c_a5.method_try(4096)) {
                if ((super.y == 0 || super.y == 2) && !this.d9.isEmpty() && !this.d5) {
                    this.bc();
                    if (c_a5.es.g9 == 1703972) {
                        var6 = this.eb;
                        this.ee = var6;
                        return;
                    }
                }
            } else if (c_a5.method_try(8192) && (super.y == 0 || super.y == 2) && !this.d9.isEmpty() && !this.d5) {
                this.bd();
                if (c_a5.es.g9 == 1703972) {
                    var6 = this.eb;
                    this.ee = var6;
                }
            }
        } else if (!this.d9.isEmpty()) {
            int[] var4;
            c_br var7;
            String[] var8;
            int[] var11;
            if (super.y == 0) {
                switch(c_a5.es.g9) {
                case 720910:
                    var7 = new c_br((byte)0);
                    var8 = new String[]{"选择"};
                    var11 = new int[]{0};
                    var4 = new int[]{3};
                    var7.a(var8, var11, var4);
                    this.a(var7);
                    super.field_byte = true;
                    break;
                case 720920:
                    var6 = this.eb;
                    this.ee = var6;
                    c_bu.d = this.ee;
                    c_a5.eQ.a(720921);
                    break;
                case 1703972:
                    if (this.ee == 0) {
                        c_q.b = 4;
                    } else if (this.ee == 1) {
                    	c_q.b = 3;
                    } else if (this.ee == 2) {
                    	c_q.b = 2;
                    } else if (this.ee == 3) {
                    	c_q.b = 1;
                    } else if (this.ee == 4) {
                    	c_q.b = 5;
                    }

                    c_a5.eQ.a(1703970);
                    break;
                case 3145730:
                    int var5 = 0;

                    for(; var5 < aa.field_try.length; ++var5) {
                        if (((a7)c_a5.es.cf().elementAt(var5 + 3)).bE() == null) {
                            ++this.d2;
                        }
                    }

                    if (this.d2 == 8) {
                        c_as.a((byte)0, "请您先设置守护技能", "确定", "", -1, -2);
                        this.d2 = 0;
                        return;
                    }

                    aa.field_if = this.eb;
                    this.d2 = 0;
                    break;
                case 3145731:
                    int[] var1;
                    ay[] var2 = new ay[(var1 = new int[]{6, 10, 12}).length];

                    for(int var3 = 0; var3 < var1.length; ++var3) {
                        var2[var3] = (ay)c_a5.es.cf().elementAt(var1[var3]);
                        aa.field_for[var3] = var2[var3].ee;
                    }

                    c_a5.eQ.a(3145740);
                    c_be.ci();
                }

                if (this.d5) {
                    this.ee = this.eb;
                    return;
                }
            } else {
                if (super.y == 2) {
                    switch(c_a5.es.g9) {
                    case -1610612632:
                        var7 = new c_br((byte)0);
                        var8 = new String[]{"选   择", "取   消", "全部选择", "全部取消", "继续包月"};
                        var11 = new int[]{-1610612631, -1610612624, -1610612623, -1610612621, 2686980};
                        var4 = new int[]{3, 3, 3, 3, 3};
                        var7.a(var8, var11, var4);
                        this.a(var7);
                        super.field_byte = true;
                    default:
                        return;
                    }
                }

                if (super.y == 1) {
                    switch(c_a5.es.g9) {
                    case 1900547:
                        if (bw.a == 1) {
                            var7 = new c_br((byte)0);
                            int[] var9 = new int[]{-1610612713, -1610612714};
                            var11 = new int[]{3, 3};
                            var7.a(c_bm.at, var9, var11);
                            this.a(var7);
                            this.y().da();
                            super.field_byte = true;
                        }
                    default:
                        return;
                    }
                }
            }
        }

    }

	private void d(boolean var1) {
		ay var2 = (ay) c_a5.es.cf().elementAt(3);
		ay var3 = (ay) c_a5.es.cf().elementAt(4);
		ay var4 = (ay) c_a5.es.cf().elementAt(5);
		ay var5 = (ay) c_a5.es.cf().elementAt(6);
		ay var6 = (ay) c_a5.es.cf().elementAt(7);
		if (var2.q()) {
			if (var1) {
				--var2.eb;
				if (var2.eb < 0) {
					var2.eb = 0;
				}
			} else {
				++var2.eb;
				if (var2.eb > var2.d9.size() - 1) {
					var2.eb = (byte) (var2.d9.size() - 1);
				}
			}

			c_a5.gn = var2.eb;
			switch (var2.eb) {
			case 0:
				var3.eb = 1;
				var4.eb = 1;
				var5.eb = 1;
				var6.eb = 1;
				break;
			case 1:
				var3.eb = 1;
				var4.eb = 0;
				var5.eb = 1;
				var6.eb = 1;
				break;
			case 2:
				var3.eb = 0;
				var4.eb = 0;
				var5.eb = 0;
				var6.eb = 0;
			default:
				return;
			}
		} else {
			if (var1) {
				this.bc();
				return;
			}

			this.bd();
		}

	}

	private boolean bd() {
		++this.eb;
		this.ec = false;
		if (this.eb > this.d9.size() - 1) {
			this.eg = true;
			this.eb = (byte) (this.d9.size() - 1);
			return false;
		} else {
			this.eg = false;
			return true;
		}
	}

	private boolean bc() {
		--this.eb;
		this.eg = false;
		if (this.eb < 0) {
			this.ec = true;
			this.eb = 0;
			return false;
		} else {
			this.ec = false;
			return true;
		}
	}

	public final boolean b() {
        if (c_a5.gZ) {
            boolean var1;
            int var2;
            int var3;
            short var4;
            short var5;
            short var6;
            short var7;
            short var8;
            short var9;
            byte var10;
            switch(super.y) {
            case 0:
                var1 = false;
                var2 = this.d9.size();
                byte var12;
                if (!this.d5) {
                    if (c_a5.a(super.k, super.j, super.a, super.j + d(var2))) {
                        var10 = this.eb;

                        for(var3 = 0; var3 < var2; ++var3) {
                            var4 = c_a5.cV;
                            var5 = c_a5.cU;
                            var6 = super.k;
                            var7 = super.j;
                            var8 = super.a;
                            var9 = d(var3 + 1);
                            if (var4 >= var6 && var4 <= var6 + var8 && var5 >= var7 && var5 <= var7 + var9) {
                                this.eb = (byte)var3;
                                var12 = this.eb;
                                this.ee = var12;
                                break;
                            }
                        }

                        if (var10 == this.eb) {
                        	c_a5.a(131072);
                        }

                        return true;
                    }
                } else if (c_a5.a(super.k, super.j, super.k + this.e(var2), super.field_int)) {
                    var10 = this.eb;

                    for(var3 = 0; var3 < var2; ++var3) {
                        var4 = c_a5.cV;
                        var5 = c_a5.cU;
                        var6 = super.k;
                        var7 = super.j;
                        var8 = this.e(var3 + 1);
                        var9 = super.field_int;
                        if (var4 >= var6 && var4 <= var6 + var8 && var5 >= var7 && var5 <= var7 + var9) {
                            this.eb = (byte)var3;
                            var12 = this.eb;
                            this.ee = var12;
                            break;
                        }
                    }

                    if (var10 == this.eb) {
                    	c_a5.a(131072);
                    }

                    return true;
                }
                break;
            case 1:
                int var11 = super.k;
                if (this.d7 != null && !this.d7.equals("")) {
                    var11 += this.d7.length() * c_a5.iA + 8;
                }

                if (c_a5.a(var11, super.j, c_a5.eb.getWidth(), c_a5.eb.getHeight())) {
                	c_a5.a(16384);
                    return true;
                }

                if (c_a5.a(var11 + c_a5.eb.getWidth() + 8 + c_b5.method_do((String)this.d9.elementAt(this.eb)), super.j, c_a5.eb.getWidth(), c_a5.eb.getHeight())) {
                	c_a5.a(32768);
                    return true;
                }
                break;
            case 2:
                var1 = false;
                var2 = this.d9.size();
                if (c_a5.a(super.k, super.j, super.a, super.j + d(var2))) {
                    var10 = this.eb;

                    for(var3 = 0; var3 < var2; ++var3) {
                        var4 = c_a5.cV;
                        var5 = c_a5.cU;
                        var6 = super.k;
                        var7 = super.j;
                        var8 = super.a;
                        var9 = d(var3 + 1);
                        if (var4 >= var6 && var4 <= var6 + var8 && var5 >= var7 && var5 <= var7 + var9) {
                            this.eb = (byte)var3;
                            this.d1[var3] = !this.d1[var3];
                            break;
                        }
                    }

                    if (var10 == this.eb) {
                    	c_a5.a(131072);
                    }

                    return true;
                }
            }
        }

        return false;
    }
}
