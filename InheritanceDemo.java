class Company {
    String companyName;
    int establishedYear;
    Company(String name, int year) {
        companyName = name;
        establishedYear = year;
        System.out.println("Company constructor called.");
    }
    void displayCompany() {
        System.out.println("Company: " + companyName);
        System.out.println("Established: " + establishedYear);
    }
}
class Department extends Company {
    String departmentName;
    Department(String name, int year, String dept) {
        super(name, year); // Call Company constructor
        departmentName = dept;
        System.out.println("Department constructor called.");
    }
    void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}
class Team extends Department {
    String teamName;
    Team(String name, int year, String dept, String team) {
        super(name, year, dept); 
        teamName = team;
        System.out.println("Team constructor called.");
    }
    void displayTeam() {
        System.out.println("Team: " + teamName);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Department dept = new Department("TechNova Solutions", 2005, "Research & Development");
        dept.displayCompany();
        dept.displayDepartment();
        System.out.println("\n=== Multilevel Inheritance ===");
        Team team = new Team("TechNova Solutions", 2005, "Research & Development", "AI Innovation Team");
        team.displayCompany();
        team.displayDepartment();
        team.displayTeam();
    }
}