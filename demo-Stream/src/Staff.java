import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Staff {
  String name;
  Department department;
  int performance; // 0 - 100

  public Staff(String name, Department department, int performance){
    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  @Override
  public String toString(){
    return "Staff[name=" + this.name + ", " + this.department + "]" ;
  }

  public static void main(String[] args) {
    List<Staff> staffs = Arrays.asList(new Staff("Mary", new Department("HR"), 50),
                                       new Staff("Peter", new Department("IT"), 65),
                                       new Staff("Eirc", new Department("IT"), 70));

    // Map<Department, List<Staff>> deptMap = staffs.stream()
    // .collect(Collectors.groupingBy(staff -> staff.department))
    // .forEach((dept, staffList) -> System.out.println(dept + " " + staffList));

    Map<Boolean, List<Staff>> gradeMap = staffs.stream()
    .collect(Collectors.partitioningBy(e -> e.performance >= 60));

    gradeMap.entrySet().stream().forEach(e -> System.out.println(e));
  }
}
