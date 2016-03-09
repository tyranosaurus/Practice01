package practice01;
public class Game369 {
	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			String number = String.valueOf( i );
			int length = number.length();
			int count = 0;

			for ( int j = 0; j < length; j++ ) {
				char c = number.charAt(j);
				if ( c == '3' || c == '6' || c == '9' ) {
					count++;
				}
			}

			if ( count == 0 ) {
				continue;
			}

			System.out.print( i + " " );
			for ( int j = 0; j < count; j++ ) {
				System.out.print( "¦" );
			}

			System.out.println( "" );
		}
	}
}
