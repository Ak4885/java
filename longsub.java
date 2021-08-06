package example;
import java.util.*;

public class longsub

{
public static void main(String[] args)
{
  String word="hello";
  int length=0;
  
  char[]arr=word.toCharArray();
  Map<Character,Integer>map=new LinkedHashMap <Character,Integer >();
  
  for(int i=0;i<arr.length;i++)
  {
	  char ch=arr[i];
	  if(!map.containsKey(ch))
	  {
		  map.put(ch,i);// h-0,e-1,l=2
	  }
	  else
	  {
		  i=map.get(ch);
		  map.clear();
		  
	  }
	  if(map.size()>length)
	  {
		  length=map.size();
		  word=map.keySet().toString();
		  
	  }
	  
	 
  }
  System.out.println(word);
  System.out.println(length);
  
}
}
