/*----------------------------------------------------------------------------------------------------------------------	
	 StringUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import static java.lang.Character.isLetter;
import static java.lang.Character.isWhitespace;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

import java.util.Random;

public class StringUtil	{
	private static final String MS_ALPHABET_EN;
	private static final String MS_ALPHABET_TR;

	static {
		MS_ALPHABET_EN = "abcdefghijklmnopqrstuwxvyz";
		MS_ALPHABET_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
	}

	private StringUtil() {}

	public static String capitalize(String s)
	{
		if (s.isEmpty())
			return s;
		
		return toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}

	public static String changeCase(String s)
	{
		char [] c = s.toCharArray();

		for (int i = 0; i < c.length; ++i) {
			if (!Character.isLetter(c[i]))
				continue;

			c[i] = Character.isUpperCase(c[i]) ? Character.toLowerCase(c[i]) : Character.toUpperCase(c[i]);
		}

		return new String(c);
	}

	public static int getCount(String s1, String s2)
	{
		int count = 0;		
		
		for (int index = -1; (index = s1.indexOf(s2, index + 1)) != -1; ++count)
			;		
		
		return count;
	}
	
	public static String getLetters(String s)
	{
		int len = s.length();
		String str = "";
		
		for (int i = 0; i < len; ++i) {
			char c = s.charAt(i);
			
			if (isLetter(c))
				str += c;
		}
		
		return str;				
	}
	
	public static String getRandomText(Random r, int n, String str)
	{
		char [] c = new char[n];
		
		for (int i = 0; i < n; ++i)
			c[i] = str.charAt(r.nextInt(str.length()));
		
		return new String(c);
	}
	
	public static String getRandomTextTR(int n)
	{
		Random r = new Random();
		
		return getRandomTextTR(r, n);
	}
	
	public static String getRandomTextTR(Random r, int n)
	{
		return getRandomText(r, n, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞJHIİJKLMNOÖPRSŞTUÜVYZ");
	}
	
	public static String getRandomTextEN(int n)
	{
		Random r = new Random();
		
		return getRandomTextEN(r, n);
	}
	
	public static String getRandomTextEN(Random r, int n)
	{
		return getRandomText(r, n, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}

	public static boolean isIsogram(String str, String alphabet)
	{
		int [] counts = new int[alphabet.length()];
		int len = str.length();

		for (int i = 0; i < len; ++i) {
			char ch = Character.toLowerCase(str.charAt(i));

			int index = alphabet.indexOf(ch);

			if (index == -1)
				continue;

			++counts[index];

			if (counts[index] > 1)
				return false;
		}

		for (int val : counts)
			if (val == 0)
				return false;

		return true;
	}
	public static boolean isIsogramEN(String str)
	{
		int [] counts = new int[26];

		int len = str.length();

		for (int i = 0; i < len; ++i) {
			char ch = Character.toLowerCase(str.charAt(i));

			if (ch < 'a' || ch > 'z')
				continue;

			++counts[ch - 'a'];

			if (counts[ch - 'a'] > 1)
				return false;
		}

		for (int val : counts)
			if (val == 0)
				return false;

		return true;
	}

	public static boolean isIsogramTR(String str)
	{
		return isIsogram(str, MS_ALPHABET_TR);
	}

	public static boolean isPalindrome(String s)
	{
		String str = getLetters(s);
		
		if (str.isEmpty())
			return false;
		
		int first = 0;
		int last = str.length() - 1;
		
		while (first < last) {
			char chLeft = toLowerCase(str.charAt(first++));
			char chRight = toLowerCase(str.charAt(last--));
			
			if (chLeft != chRight)
				return false;
		}			
		
		return true;		
	}

	public static boolean isPangram(String str, String alphabet)
	{
		str = str.toLowerCase();

		int len = alphabet.length();

		for (int i = 0; i < len; ++i) {
			char c = alphabet.charAt(i);

			if (!str.contains(c + ""))
				return false;
		}

		return true;
	}

	public static boolean isPangramTR(String str)
	{
		return isPangram(str, MS_ALPHABET_TR);
	}

	public static boolean isPangramFR(String str)
	{
		return isPangram(str, MS_ALPHABET_EN);
	}

	public static boolean isPangramEN(String str)
	{
		return isPangram(str, MS_ALPHABET_EN);
	}
	
	public static String padLeft(String s, int len)
	{
		return padLeft(s, len, ' ');
	}

	public static String padLeft(String s, int len, char ch)
	{
		len -= s.length();
		
		if (len <= 0)
			return s;
		
		return repeat(len, ch) + s;				
	}
	
	public static String padRight(String s, int len)
	{
		return padRight(s, len, ' ');
	}
	
	public static String padRight(String s, int len, char ch)
	{
		len -= s.length();
		
		if (len <= 0)
			return s;
		
		return s + repeat(len, ch);
	}
	
	public static String repeat(int n, char ch)
	{
		char [] c = new char[n];
		
		while (n-- > 0)
			c[n] = ch;
		
		return new String(c);
	}	
	
	public static String reverse(String s)
	{
		char [] c = s.toCharArray();

		ArrayUtil.reverse(c);
		
		return new String(c);
	}

	public static String squeeze(String s1, String s2)
	{
		StringBuilder sb = new StringBuilder(s1);
		int len = s1.length();

		for (int i = 0; i < len; i++) {
			char ch = s1.charAt(i);
			if (s2.indexOf(ch) != -1)
				sb.deleteCharAt(i);
		}
		return sb.toString();
	}

	public static String [] split(String str, String delim)
	{
		return split(str, delim, StringSplitOptions.NONE);
	}

	public static String [] split(String str, String delim, StringSplitOptions options)
	{
		String re = "[";
		String metas = "[]";

		for (int i = 0; i < delim.length(); ++i) {
			char c = delim.charAt(i);

			re += (metas.contains(c + "") ? "\\" : "") + c;
		}

		re += "]";

		if (options == StringSplitOptions.REMOVE_EMPTY_ENTRIES)
			re += "+";

		return str.split(re);
	}
	
	public static String trimLeft(String s)
	{
		int i;
		int len = s.length();
		
		for (i = 0; i < len && isWhitespace(s.charAt(i)); ++i)
			;
		
		return s.substring(i);
	}
	
	public static String trimRight(String s)
	{
		int i;
		
		for (i = s.length() - 1; i >= 0 && isWhitespace(s.charAt(i)); --i)
			;
		
		return s.substring(0, i + 1);
	}
}
