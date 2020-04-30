package com.nayek.string;

import java.util.regex.Pattern;

public class StringReversal {
	
	public void reverseUtil(String str)
	{
		char[] ch = str.toCharArray();
		int left =0;
		int right=ch.length-1;
		while(left < right)
		{
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		
		
		for(char c: ch)
		{
			System.out.print(c);
		}
		
	}
	
	public void wordReverse(String str)
	{	
		Pattern pattern = Pattern.compile("\\.");
		String[] temp = pattern.split(str);
		String result ="";
		
		for(int i=0;i<temp.length;i++)
		{
			if(i==temp.length-1)
			{
				System.out.println(temp[i]+result);
			}
			else
			{
				result = "."+temp[i]+result;
			}
		}
		
	}

	public static void main(String[] args) {
		
		StringReversal sr =new StringReversal();
		
		String str1 = "i.like.this.program.very.much";
		String str2 = "pqr.mno";
		
		System.out.println("After reversing the string completely");
		sr.reverseUtil(str1);
		System.out.println(" ");
		sr.reverseUtil(str2);

		System.out.println("");
		
		System.out.println("After reversing the string partially..words stay the same");
		sr.wordReverse(str1);
		sr.wordReverse(str2);
	}

}
