package com.string;

public class Strting_Function {
	
	public static void main(String[] args) {
		
		length_of_String();
		
		equals_String();
		
		not_Equals_String();
		
		equals_IgnoreCase();
		
		to_UpperCase();
		
		to_LowerCase();
		
	    char_At();
	    
	    index_Of();
	    
	    last_Index_of();
	    
	    contains();
	    
	    start_With();
	    
	    ends_With();
	    
	    trim();
	    
	    replace();
	    
	    concat();
	    
	    sub_String();
	    
	    sub_String_To();
	    
	    join();
	    
	    is_Empty();
	    
	    split();
	    
	    split_To();
	    
	    replace_All();
	    
	    s_Index();
	}
	
	public static void length_of_String() {
		
		String s = "Not a man from Earth";

		//int length_of_String = s.length();

		System.out.println("Length of String = "+s.length());

	}
	
	public static void equals_String() {
		
		String s1 = "Bastards";
		
		String s2 = "Bastards";
		
		boolean equals = s1.equals(s2);
		
		System.out.println("Is Equal = "+equals);

	}
	
	public static void not_Equals_String() {
		
		String s1 = "Pimp Bastard";

		String s2 = "Bastards";

		boolean not_equals = s1.equals(s2);

		System.out.println("Is Not Equal = "+not_equals);

	}
	
	public static void equals_IgnoreCase() {
		
		String s1 = "Western Front";

		String s2 = "westerN froNt";

		boolean ignore = s1.equalsIgnoreCase(s2);

		System.out.println("Is Not Equal = "+ignore);

	}
	
	public static void to_UpperCase() {
		
		String u = "Inspector Durai singaM";
		
		String uc = u.toUpperCase();
		
		System.out.println("To UpperCase = "+uc);

	}
	
	public static void to_LowerCase() {
		
		String l = "INSPECTOR DURAI SINGAM";

		String lc = l.toLowerCase();

		System.out.println("To LowerCase = "+lc);

	}
	
	public static void char_At() {
		
		String c = "Where is my Train";
		
		char ca = c.charAt(7);
		
		System.out.println("Char_At = "+ca);

	}
	
	public static void index_Of() {
		
		String i = "Davide Fincher";
		
		int io = i.indexOf('e');
		
		System.out.println("Index of = "+io);

	}
	
	public static void last_Index_of() {
		
		String l = "Christopher Nolan";
		
		int lio = l.lastIndexOf('o');
		
		System.out.println("Last Index of = "+lio);

	}
	
	public static void contains() {
		
		String con = "Avatar the way of Water";
		
		boolean contains = con.contains("w");
		
		System.out.println("Contains = "+contains);

	}
	
	public static void start_With() {
		
		String sw = "Voice Vibe";
		
		boolean startsWith = sw.startsWith("v");
		
		System.out.println("Start With = "+startsWith);

	}
	
	public static void ends_With() {
		
		String ew = "generation";
		
		boolean endsWith = ew.endsWith("n");
		
		System.out.println("Ends With = "+endsWith);

	}
	
	public static void trim() {
		
		String tr = "        The Ultimate Test    ";
		
		String trim = tr.trim();
		
		System.out.println("Trim = "+trim);

	}
	
	public static void replace() {
		
		String re = "Battleground mobile Pubg";
		
		String replace = re.replace('e', 'w');
		
		System.out.println("Replace = "+replace);

	}
	
	public static void concat() {
		
		String co = "All The";
		
		String co2 = "Best";
		
		String concat = co.concat(co2);
		
		System.out.println("Concat = "+concat);

	}
	
	public static void sub_String() {
		
		String sub = "All went wrong in this world";
		
		String substring = sub.substring(5);
		
		System.out.println("Substring = "+substring);

	}
	
	public static void sub_String_To() {
		
		String to = "Spider man into Multiverse";
		
		CharSequence subSequence = to.subSequence(7, 21);
		
		System.out.println("SubString from Begin to End = "+subSequence);

	}
	
	public static void join() {
		
		String jo = "The Last of us";
		
		String join = jo.join("-", "Earth","is","safe");
		
		System.out.println("Join = "+join);

	}
	
	public static void is_Empty() {
		
		String em = "Jil Jumg Juk";
		
		boolean empty = em.isEmpty();
		
		System.out.println("is Empty = "+empty);

	}
	
	public static void split() {
		
		String sp = "Avengers Endgame";
		
		String[] split = sp.split(sp);
		
		for (String string : split) {
			
			System.out.println("Split = "+string);
			
		}
		
		

	}
	
	public static void split_To() {

	}
	
	public static void replace_All() {
		
		String rep = "MS@$ Dho*ni Un_to-ld St+or=y";
		
		String replaceAll = rep.replaceAll("[^a-z A-Z 0-9^]", "");
		
		System.out.println("Replace All = "+replaceAll);

	}
	
	public static void s_Index() {
		
		String ind = "Free to leave the place";
		
		int indexOf = ind.indexOf('e', 5);
		
		System.out.println("Index of = "+indexOf);

	}

}
