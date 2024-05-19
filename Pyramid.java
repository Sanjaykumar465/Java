
 class Pyramid {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of rows for the pyramid: ");
 int numberOfRows = scanner.nextInt();
 // Outer loop for rows
 for (int i = 1; i <= numberOfRows; i++) {
 // Inner loop for spaces
 for (int j = 1; j <= numberOfRows - i; j++) {
 System.out.print(" ");
 }
 // Inner loop for printing stars
 for (int k = 1; k <= 2 * i - 1; k++) {
 System.out.print("*");
 }
 // Move to the next line after each row is printed
 System.out.println();
 }
B. Tech. 3rd Semester OOP USING JAVA (ROP3B201)
OOP USING JAVA (ROP3B201)
6
 scanner.close()
}}