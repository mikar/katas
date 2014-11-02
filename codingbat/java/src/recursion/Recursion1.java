package recursion;

public class Recursion1 {

	public static int factorial( final int n ) {
		return n < 2 ? n : n * factorial( n - 1 );
	}

	public static int bunnyEars( final int n ) {
		return n < 1 ? 0 : 2 + bunnyEars( n - 1 );
	}

	public static int fibonacciLoop( final int n ) {
		int a = 0, b = 1, temp;
		for ( int i = 1; i < n; i++ ) {
			temp = b;
			b = a + b;
			a = temp;
		}
		return n < 2 ? n : b;
	}

	public static int fibonacci( final int n ) {
		int a = 0, b = 1, temp;
		for ( int i = 1; i < n; i++ ) {
			temp = b;
			b = a + b;
			a = temp;
		}
		return n < 2 ? n : fibonacci( n - 1 ) + fibonacci( n - 2 );
	}

	public static int bunnyEars2( final int n ) {
		if ( n < 1 ) {
			return 0;
		}
		return determineEars( n ) + bunnyEars2( n - 1 );
	}

	private static int determineEars( final int n ) {
		return isEven( n ) ? 3 : 2;
	}

	private static boolean isEven( final int n ) {
		return n % 2 == 0;
	}

	public static int triangle( final int n ) {
		return n < 2 ? n : n + triangle( n - 1 );
	}

	public static int sumDigits( final int n ) {
		return n < 1 ? 0 : n % 10 + sumDigits( n / 10 );
	}

	public static int count7( final int n ) {
		return n < 1 ? 0 : containsInt( n, 7 ) + count7( n / 10 );
	}

	private static int containsInt( final int a, final int b ) {
		return a % 10 == b ? 1 : 0;
	}

	public static int count8( final int n ) {
		if ( n < 1 ) {
			return 0;
		}
		if ( containsInt( n / 10, 8 ) == 1 && containsInt( n, 8 ) == 1 ) {
			return 2 + count8( n / 10 );
		}
		return containsInt( n, 8 ) + count8( n / 10 );
	}

	public static int powerN( final int base, final int n ) {
		return n == 0 ? 1 : base * powerN( base, n - 1 );
	}

	public static int countX( final String string ) {
		if ( string.isEmpty() ) {
			return 0;
		}
		return ( string.charAt( 0 ) == 'x' ? 1 : 0 ) + countX( string.substring( 1 ) );
	}

	public static int countHi( final String string ) {
		if ( string.length() < 2 ) {
			return 0;
		}
		return ( string.substring( 0, 2 ).equals( "hi" ) ? 1 : 0 ) + countHi( string.substring( 1 ) );
	}

}
