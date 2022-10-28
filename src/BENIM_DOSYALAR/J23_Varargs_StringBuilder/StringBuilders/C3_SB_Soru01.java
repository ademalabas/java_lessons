package BENIM_DOSYALAR.J23_Varargs_StringBuilder.StringBuilders;

public class C3_SB_Soru01 {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder();
        sb1.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb1); // B ) abbaccca
	}

}
