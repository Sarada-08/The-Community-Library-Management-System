import java.util.Scanner;

class CommunityLibrary {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String[] books = new String[20];
boolean[] available = new boolean[20];
int n = 0, ch;

while (true) {
System.out.println("\n1.Add 2.Issue 3.Return 4.Search 5.Display 6.Exit");
ch = sc.nextInt();
sc.nextLine();

switch (ch) {
case 1:
System.out.print("Book name: ");
books[n] = sc.nextLine();
available[n++] = true;
break;

case 2:
System.out.print("Book number: ");
int i = sc.nextInt();
if (available[i])
available[i] = false;
else
System.out.println("Book not available.");
break;

case 3:
System.out.print("Book number: ");
i = sc.nextInt();
System.out.print("Late days: ");
int d = sc.nextInt();
available[i] = true;
System.out.println("Fine = Rs." + d * 5);
break;

case 4:
System.out.print("Search book: ");
String s = sc.nextLine();
for (i = 0; i < n; i++)
if (books[i].equalsIgnoreCase(s))
System.out.println("Found: " + books[i]);
break;

case 5:
for (i = 0; i < n; i++)
System.out.println(i + " - " + books[i]);
break;

case 6:
return;
}
}
}
}

