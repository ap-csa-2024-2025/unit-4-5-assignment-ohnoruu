import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("code",3);
    System.out.println();
    printNums();
    uprightNumberTriangle(5);
    starTree();
    multTable();
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
    for (int row = 1; row <= N; row++){
      for (int num = 1; num <= row; num++){
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  public static void starTree()
  {
    for (int rowDescend = 1; rowDescend <= 9; rowDescend++){
      for (int numSpaces = 0; numSpaces < rowDescend; numSpaces ++){
        System.out.print(" ");
      }
      for (int numStars = 0; numStars <= 9 - (rowDescend-1); numStars++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void multTable()
  {
    for (int column = 1; column <= 10; column++){
      for (int num = 1; num <= 10; num ++){
        System.out.print(num*column + " ");
      }
      System.out.println();
    }
  }
}
