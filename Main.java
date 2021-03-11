import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
          ArrayList test = new ArrayList(10);
          test.add(1.2);
          test.add(1.4);
          test.add(1.6);
          test.add(6.69);
          ArrayList test2 = new ArrayList(10);
         test2.add(5);
          ArrayList<String> test3 = new ArrayList(10);
           test3.add("to");
          test3.add("ats");
          test3.add("asst");
          test3.add("aaaaaa");
          test3.add("FOFL");
          swapPairs(test3);
          removeDuplicates(test2);
          System.out.print(test2);
          System.out.print(test3);
          System.out.println(censor("kkklkllloookkk",'k'));
      }
    public static double findLargest(ArrayList<Double>  a)
    {
      double currentLargest = -(((99999999)));
      for (double k :a)
      {
        if (k > currentLargest)
      {
          currentLargest = k;
      }
      }
      return currentLargest;
    }
/*
Search an ArrayList of Doubles and return the largest number found in the ArrayList.
*/


public static int indexOfLargest(ArrayList<Double>  a)
{
   double currentLargest = -(((99999999)));
   int indexOfCurrentLargest= 0;
      for (int i = 0; i != a.size(); i++)
      {
        if (a.get(i) > currentLargest)
      {
          currentLargest = a.get(i);
          indexOfCurrentLargest = i;
      }
      }
      return indexOfCurrentLargest;
}
/*
Search an ArrayList of Doubles and return the index of the largest element found in the ArrayList.
*/


public static int indexOfInt(ArrayList<Integer>  a, int target)
{
  int indexOfInt = 0;
     for (int i = 0; i != a.size(); i++)
      {
        if (a.get(i) == target)
      {
          indexOfInt = i;
      }
      }
      return indexOfInt;
}
/*
Take an ArrayList of Integers and a value as two arguments to your method. Return the index of the first location of the value inside the ArrayList. If the ArrayList does not contain the value, return -1. So if the ArrayList contains { 3, 4, 5, 6, 5} and the value being searched for is 5, your method would return 2 because index 2 of the ArrayList is the first location where a 5 can be found. If the value being searched for is 7, your method would return a -1 because 7 is not present in this ArrayList.*/



public static boolean hasSameElements(ArrayList<Integer>  a, ArrayList<Integer>  b)
{
  //
  Collections.sort(a);
  Collections.sort(b);
  if (a.size() != b.size())
  {
    return false;
  }
 for (int y = 0; y != a.size(); y++)
      {
    if (a.get(y) != b.get(y))
    {
      return false;
    }
      } 
     return true;
}


/*Compare two ArrayLists of Integers that are known to be of the same length. Return true if they have the same contents (irrespective of order). Return false otherwise. */



public static void removeEvenLength(ArrayList<String>  a)
{
  Iterator<String> iter = a.iterator();
  while (iter.hasNext())
  {
    String str = iter.next();
    if (str.length() % 2 ==0)
    {
      iter.remove();
    }
  }
} 

/*Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.*/

public static void removeDuplicates(ArrayList<Integer>  a)
{
Iterator<Integer> itera = a.iterator();
int str= 0;
int prev = 0;
while (itera.hasNext()){ 
    str = itera.next();
    if (str == prev)
    {
      itera.remove();
    }
    prev = str; 
  }
}

/*If two or more consecutive elements of an ArrayList are the same Integer, remove all but one occurrence. Do not disturb the relative positioning of the other elements. 

Here is an example:  [ 5, 4, 4, 4, 3, 3, 2 ] → [ 5, 4, 3, 2 ]

Here is another example: [ 5, 4, 5, 3, 3 ] → [ 5, 4, 5, 3 ]    

Note that in the second example, the 5 is not removed because it is not consecutive./*/



public static void swapPairs(ArrayList<String>  a)
{
    int ogLeg = a.size();
  for (int i = 0; i <= ogLeg -1 ; i= i+2)
  {
    if (a.size() -1 <= i)
    {
      break;
    }
    System.out.println("a.get(i) = " + a.get(i));
    String Bob = a.get(i);
  a.set(i, a.get(i+1));
  a.set(i+1, Bob);
    
  }

}
/*Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"} your method should switch the first pair, "four", "score", the second pair, "and", "seven", and the third pair, "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}
If there are an odd number of values in the list, the final element is not moved. For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"} It would again switch pairs of values, but the final value, "hamlet" would not be moved, yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"} */



public static void doubleList(ArrayList<String>  a)

/*Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with two of that string. For example, if the list stores the values {"how", "are", "you?"} before the method is called, it should store the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.*/

{
 Object[] array = a.toArray();

 for (int x= 0; x!= array.length; x++)
 {
   a.add(2*x, array[x].toString());
 }

}
public static void removeShorterStrings(ArrayList<String>  a)
{
  int ogLeg = a.size();
  for (int i = 0; i <= ogLeg -1 ; i++)
  {
    if (a.size() -1 <= i)
    {
      break;
    }
    System.out.println("a.get(i) = " + a.get(i));
    if (a.get(i).length() <= a.get(i+1).length())
    {
      a.remove(i);
      
    }
    else
    {
      a.remove (i+1);

    }
    
  }

}
/*Note: There are a lot of conditions to meet in this one and your testing should involve several cases to make sure you meet all the requirements.

Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and that removes from each successive pair of values the shorter string in the pair. For example, suppose that an ArrayList called list contains the following values: {"four", "score", "and", "seven", "years", "ago"} In the first pair, "four" and "score", the shorter string is "four". In the second pair, "and" and "seven", the shorter string is "and". In the third pair, "years" and "ago", the shorter string is "ago". Therefore, the call: removeShorterStrings(list); should remove these shorter strings, leaving the list as follows: "score", "seven", "years". If there is a tie (both strings have the same length), your method should remove the first string in the pair. If there is an odd number of strings in the list, the final value should be kept in the list*/
public static String censor (String s, char c)
{
 return s.replace(c,'*');
    
}
}