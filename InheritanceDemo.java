import java.util.Scanner;
class Library {  
    String libraryName;
    void getLibraryInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Library Name: ");
        libraryName = sc.nextLine();
    }
    void showLibraryInfo() {
        System.out.println("Library Name: " + libraryName);
    }
}
class MemberSingle extends Library {  
    String memberName;
    void getMemberDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Member Name (Single Inheritance): ");
        memberName = sc.nextLine();
    }
    void showMemberDetails() {
        System.out.println("Member Name: " + memberName);
    }
}
class MemberMulti extends Library {  
    String memberName;
    void getMemberInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Member Name (Multilevel Inheritance): ");
        memberName = sc.nextLine();
    }
}
class Borrow extends MemberMulti {  
    String bookName;
    void getBookInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name to Borrow: ");
        bookName = sc.nextLine();
    }
    void showBorrowDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("Member: " + memberName);
        System.out.println("Borrowed Book: " + bookName);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("------Single Inheritance Demo -----");
        MemberSingle single = new MemberSingle();
        single.getLibraryInfo();      
        single.getMemberDetails();     
        System.out.println("\nSingle Inheritance Details:");
        single.showLibraryInfo();
        single.showMemberDetails();
        System.out.println("\n----- Multilevel Inheritance Demo -----");
        Borrow multi = new Borrow();
        multi.getLibraryInfo();        
        multi.getMemberInfo();         
        multi.getBookInfo();           
        System.out.println("\nMultilevel Inheritance Details:");
        multi.showBorrowDetails();
    }
}