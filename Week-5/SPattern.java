
         // Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where.

import java.util.*;
public class SPattern{
public  static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.next();
System.out.println("enter the pattern");
String str1=s.next();
boolean result=false;
if(str.length()==str1.length()){
for(int i=0;i<str.length();++i){
	if(str.charAt(i)==str1.charAt(i))
		result=true;
	else if(str1.charAt(i)=='*')
		result=true;
	else
		result=false;
}
}
else
	result=false;

	System.out.println(result);
}
}