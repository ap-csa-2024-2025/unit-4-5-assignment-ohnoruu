import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("code",3);
    System.out.println();
    printNums();
    uprightNumberTriangle(5);
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i<word.length();i++){
      for (int numTimes = 0; numTimes<N;numTimes++){
        String L = word.substring(i,i+1);
        System.out.print(L);
      }
    }
  }

  public static void printNums()
  {
    for (int numDescend = 10; numDescend > 0; numDescend--){ //numbers descending
      for (int repeat = numDescend; repeat > 0; repeat--){ //times number is repeated
        System.out.print(numDescend + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int numAscend = 1; numAscend<=N; numAscend++){ //numbers increasing up to N
      for (int printUpTo = numAscend; printUpTo<=N; printUpTo++){
        System.out.print(printUpTo);
      }
    }
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
