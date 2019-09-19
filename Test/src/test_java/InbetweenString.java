package test_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InbetweenString
{
  public static void main(String [] args)
  {
	  String str = "ZZZZ <%= dsn %> AFFF <%= AFG %>";
	  Pattern pattern = Pattern.compile("<%= (.*?) %>");
	  Matcher matcher = pattern.matcher(str);
	  while (matcher.find()) {
	      System.out.println(matcher.group(1));
	  }
  }
}