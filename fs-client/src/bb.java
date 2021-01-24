import java.util.Vector;

/**
 * 2021/01/22
 * @author 95739
 *
 */
public final class bb {
	public static byte field_new = -1;
	public static int field_try = -1;
	public static int field_char = -1;
	public static byte field_if = 0;
	public static byte a = 0;
	public static int field_else = 0;
	public static byte b = 0;
	public static byte field_long = 0;
	public static byte field_goto = 0;
	public static String field_int = "";
	public static byte field_byte = 0;
	public static byte field_void = 0;
	public static byte field_do = 0;
	private static int field_for = 0;

	public bb() {
	}

	public static byte[] a(int var0) {
		ac var1;
		(var1 = new ac()).method_do(var0);
		switch (var0) {
		case 2162689:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_LIST...");
		case 2162690:
		case 2162691:
		case 2162703:
		case 2162714:
		case 2162725:
		case 2162736:
		case 2162745:
		case 2162757:
		case 2162764:
		case 2162771:
		case 2162778:
		default:
			break;
		case 2162692:
		case 2162705:
		case 2162716:
		case 2162727:
			c_a5.fR = true;
			var1.a(field_new);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_LEARN_TYPE...");
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
			c_a5.fR = true;
			var1.a(field_new);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_LEARN_INFO...");
			break;
		case 2162694:
		case 2162707:
		case 2162718:
		case 2162729:
			c_a5.fR = true;
			var1.a(field_new);
			var1.method_do(field_try);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_LEARN_DETAIL_WEAPON...");
			break;
		case 2162695:
		case 2162752:
			c_a5.fR = true;
			var1.method_do(field_char);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_LEARN_WEAPON_INFO...");
			break;
		case 2162696:
		case 2162709:
		case 2162720:
		case 2162731:
		case 2162740:
		case 2162748:
		case 2162761:
		case 2162768:
		case 2162775:
		case 2162782:
			c_a5.fR = true;
			var1.a(field_new);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_LEARN or C_PRODUCE_SMITH_LEARN...");
			break;
		case 2162697:
		case 2162710:
		case 2162721:
		case 2162732:
		case 2162741:
		case 2162749:
		case 2162762:
		case 2162769:
		case 2162776:
		case 2162783:
			c_a5.fR = true;
			var1.a(field_if);
			var1.a(a);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_CONFIRM_LEARN...");
			break;
		case 2162698:
		case 2162704:
		case 2162715:
		case 2162726:
			c_a5.fR = true;
			var1.a(field_new);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_TYPE...");
			break;
		case 2162699:
		case 2162706:
		case 2162717:
		case 2162728:
			c_a5.fR = true;
			var1.a(field_new);
			var1.method_do(field_try);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_DETAIL_WEAPON...");
			break;
		case 2162700:
		case 2162711:
		case 2162722:
		case 2162733:
		case 2162742:
			c_a5.fR = true;
			var1.method_do(field_char);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_FORG...");
			break;
		case 2162701:
		case 2162712:
		case 2162723:
		case 2162734:
		case 2162743:
		case 2162751:
			c_a5.fR = true;
			var1.method_do(field_else);
			var1.a(field_new);
			var1.method_do(field_try);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_FORGING_CONFIRM_FORG...");
			break;
		case 2162702:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_SMITH_LIST...");
			break;
		case 2162713:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_LEATHER_LIST...");
			break;
		case 2162724:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_SEWING_LIST...");
			break;
		case 2162735:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_ENCHANTING_LIST...");
			break;
		case 2162737:
		case 2162746:
		case 2162758:
		case 2162765:
		case 2162772:
		case 2162779:
			c_a5.fR = true;
			var1.a(field_new);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_ENCHANTING_DETAIL_ENCHANT...");
			break;
		case 2162738:
		case 2162759:
		case 2162766:
		case 2162773:
		case 2162780:
			c_a5.fR = true;
			var1.a(field_new);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_ENCHANTING_LEARN_DETAIL_ENCHANT...");
			break;
		case 2162744:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_RESOLVE_LIST...");
			break;
		case 2162750:
			c_a5.fR = true;
			var1.a(field_new);
			var1.method_do(field_char);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_RESOLVE_RESOLVE...");
			break;
		case 2162753:
			c_a5.fR = true;
			var1.a(field_new);
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_RESOLVE_VIEW_LEVEL...");
			break;
		case 2162754:
			c_a5.fR = true;
			var1.a(c_r.nj);
			var1.a(field_do);
			var1.a(field_void);
			c_b5.method_case("Produce.snd_Parse() C_ENCHANTING_ENCHANT...");
			break;
		case 2162755:
			c_a5.fR = true;
			var1.a(b);
			var1.a(field_long);
			var1.a(field_goto);
			c_b5.method_case("Produce.snd_Parse() C_ENCHANTING_CONFIRM_ENCHANT...");
			break;
		case 2162756:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_MINING_LIST...");
			break;
		case 2162763:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_HERBALISM_LIST...");
			break;
		case 2162770:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_CLOTH_LIST...");
			break;
		case 2162777:
			c_a5.fR = true;
			c_b5.method_case("Produce.snd_Parse() C_PRODUCE_SKIN_LIST...");
		}

		return var1.method_long();
	}

	public static void a(int var0, ac var1) {
        switch(var0) {
        case -2145320958:
            field_for = var1.method_byte();
            c_b5.method_case("UIList.forgLevel = " + field_for);
            c_be var3;
            if (c_a5.es.g9 != 2162699 && c_a5.es.g9 != 2162706 && c_a5.es.g9 != 2162717 && c_a5.es.g9 != 2162728) {
                if (c_a5.es.g9 == 2162737 || c_a5.es.g9 == 2162746 || c_a5.es.g9 == 2162758 || c_a5.es.g9 == 2162759 || c_a5.es.g9 == 2162765 || c_a5.es.g9 == 2162766 || c_a5.es.g9 == 2162772 || c_a5.es.g9 == 2162773 || c_a5.es.g9 == 2162779 || c_a5.es.g9 == 2162780) {
                    ((ah)c_a5.es.cf().elementAt(5)).method_case(field_for);
                    Vector var5;
                    c_be var6;
                    if ((var6 = (c_be)(var5 = (Vector)c_a5.d6.elementAt(c_a5.d6.size() - 1)).elementAt(0)) != null) {
                        ((ah)var6.cf().elementAt(7)).method_case(field_for);
                    }

                    if ((var3 = (c_be)var5.elementAt(1)) != null) {
                        ((ah)var3.cf().elementAt(7)).method_case(field_for);
                    }
                }
            } else {
                ((ah)c_a5.es.cf().elementAt(5)).method_case(field_for);
                c_be var4;
                if ((var4 = (c_be)c_a5.d6.elementAt(c_a5.d6.size() - 1)) != null) {
                    ((ah)var4.cf().elementAt(5)).method_case(field_for);
                }

                Vector var2;
                if ((var3 = (c_be)(var2 = (Vector)c_a5.d6.elementAt(c_a5.d6.size() - 2)).elementAt(0)) != null) {
                    ((ah)var3.cf().elementAt(7)).method_case(field_for);
                }

                if ((var3 = (c_be)var2.elementAt(1)) != null) {
                    ((ah)var3.cf().elementAt(7)).method_case(field_for);
                }
            }

            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_LEVEL...");
            return;
        case -2145320957:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162689, 2162691});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_FORGING_LEARN_SUCCESS...");
            return;
        case -2145320956:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162702, 2162703});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_SMITH_LEARN_SUCCESS...");
            return;
        case -2145320955:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162713, 2162714});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_LEATHER_LEARN_SUCCESS...");
            return;
        case -2145320954:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162724, 2162725});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_SEWING_LEARN_SUCCESS...");
            return;
        case -2145320953:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162735, 2162736});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_ENCHANTING_LEARN_SUCCESS...");
            return;
        case -2145320952:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162744, 2162745});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_RESOLVE_LEARN_SUCCESS...");
            return;
        case -2145320951:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162756, 2162757});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_MINING_LEARN_SUCCESS...");
            return;
        case -2145320950:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162763, 2162764});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_HERBALISM_LEARN_SUCCESS...");
            return;
        case -2145320949:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162770, 2162771});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_CLOTH_LEARN_SUCCESS...");
            return;
        case -2145320948:
            c_a5.d6.removeElementAt(c_a5.d6.size() - 1);
            c_a5.eQ.a(new int[]{2162777, 2162778});
            c_b5.method_case("Produce.rec_Parse() S_PRODUCE_SKIN_LEARN_SUCCESS...");
        default:
        }
    }

	public static boolean a(c_be var0) {
        return a0.method_if(var0.g9) == 33;
    }

	public static boolean method_if(c_be var0)
	{
		return var0.g9 == 2162689 || var0.g9 == 2162691 || var0.g9 == 2162702 || var0.g9 == 2162703
				|| var0.g9 == 2162713 || var0.g9 == 2162714 || var0.g9 == 2162724 || var0.g9 == 2162725
				|| var0.g9 == 2162735 || var0.g9 == 2162736 || var0.g9 == 2162744 || var0.g9 == 2162745
				|| var0.g9 == 2162756 || var0.g9 == 2162757 || var0.g9 == 2162763 || var0.g9 == 2162764;
	}
}
