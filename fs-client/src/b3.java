/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class b3 {
	public b3() {
	}

	public static byte[] a(int var0) {
		c_a5.fR = true;
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 393218:
			c_bv var3 = (c_bv) c_a5.es.cf().elementAt(2);
			var1.a(var3.la);
		case 393219:
		case 393220:
		case 393221:
		case 393222:
		case 393223:
		case 393224:
		case 393225:
		case 393228:
		default:
			break;
		case 393226:
			var0 = bn.iI.size();

			for (int var2 = 0; var2 < var0; ++var2) {
				var1.method_if(bn.iI.elementAt(var2).toString());
			}

			return var1.method_long();
		case 393227:
			var1.a(c_bv.kq);
			break;
		case 393229:
			var1.method_do(c_l.g.method_new());
			c_b5.method_case("-----发送好友资料命令-----");
			break;
		case 393230:
			var1.method_do(c_l.g.method_new());
			c_b5.method_case("-----发送 查看对方属性命令-----");
			break;
		case 393231:
			var1.method_do(c_l.g.method_new());
			var1.a(a7.fF);
			am.a = false;
			break;
		case 393232:
			var1.method_do(at.field_if);
			var1.method_do(at.a);
			c_b5.method_case("---------------------------------PCPackage.m_nGrade=" + at.field_if);
			c_b5.method_case("---------------------------------PCPackage.m_nClanGrade=" + at.a);
			break;
		case 393233:
			var1.method_do(c_l.g.method_new());
			var1.a(bp.ag().eS);
			c_a5.fR = false;
		}

		return var1.method_long();
	}
}
