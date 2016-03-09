package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		while( true ){
		
			Random r = new Random();
			int k = r.nextInt( 100 ) + 1;
			
			int max = 100;
			int min = 1;
			int tryCount = 0;
			
			while( true ){
			
				System.out.println( min + "-" + max );
				System.out.print( ++tryCount + ">>");
				int guess = scanner.nextInt();
			
				if( guess > k ) {
					System.out.println( "더 낲게" );
					max = guess;
				} else if( guess < k ){
					System.out.println( "더 높게" );
					min = guess;
				} else {
					System.out.println( "맞았습니다!!!");
					break;
				}
			}
			
			System.out.print( "다시하시겠습니까?(y/n)>>" );
			String yn = scanner.next();
			if( "y".equals( yn ) == false ){
				break;
			}
		}
		
		scanner.close();
	}
}
