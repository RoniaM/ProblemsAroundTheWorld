public class DrawRocket {
	public static final int SIZE = 5;

	public static void main(String[] args) {
		 SlashesAndStars();
		 PlusEqualAndStar();
		 DimondAndDots();
		 DimondsAndDotsReverse();
		 PlusEqualAndStar();
		 DimondsAndDotsReverse();
		 DimondAndDots();
		 PlusEqualAndStar();
		 SlashesAndStars();
	

	}
//printing slash and the two star in the middle part of the program 
	public static void SlashesAndStars() {
		for (int slash = 1; slash < 2*SIZE; slash++) {

			for (int spacing = 2*SIZE - slash; spacing > 0; spacing--) {
				System.out.print(" ");
			}

			for (int count = 1; count <= slash; count++) {
				System.out.print("/");

			}
			for (int star = 1; star < SIZE; star++) {
				System.out.print("*");
			}
			for (int count = 1; count <= slash; count++) {
				System.out.print("\\");

			}

			System.out.println();
		}
	}
//part of the program with +=* side by side 
	public static void PlusEqualAndStar() {
		System.out.print("+");
		for (int EqualAndPLusCount = 1; EqualAndPLusCount <= 2*SIZE; EqualAndPLusCount++) {
			System.out.print("=");
			System.out.print("*");
		}
		System.out.print("+");
		System.out.println();
	}

//the part of the program thats half the dimond- top part	
	public static void DimondAndDots() {
		for (int Rows = 1; Rows <=SIZE ; Rows++) {
			System.out.print("|");
			for (int count =1;count<=2; count++) {
				for (int Dot = 1; Dot <= SIZE - Rows; Dot++) {
					System.out.print(".");
				}

				for (int Pattern = 1; Pattern <= Rows; Pattern++) {
					System.out.print("/");
					System.out.print("\\");
				}

				for (int Dot = 1; Dot <= SIZE - Rows; Dot++) {
					System.out.print(".");
				}	
			}	
			System.out.print("|");
			System.out.println();

		}
	
	}
	// the bottom part of the Dimond
	public static void DimondsAndDotsReverse() {
		for (int Rows = SIZE; Rows >=1 ; Rows--) {
			System.out.print("|");
			for (int count =1;count<=2; count++) {
				for (int Dot = 1; Dot <= SIZE - Rows; Dot++) {
					System.out.print(".");
				}

				for (int Pattern = 1; Pattern <= Rows; Pattern++) {
					System.out.print("\\");
					System.out.print("/");
				}

				for (int Dot = 1; Dot <= SIZE - Rows; Dot++) {
					System.out.print(".");
				}	
			}	
			System.out.print("|");
			System.out.println();

		}	
	}
	
	}
