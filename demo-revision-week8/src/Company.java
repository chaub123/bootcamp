import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Staff> staffs;

    public Company(){
        staffs = new ArrayList<>();
    }

    public Company(List<Staff> staffs){
      this.staffs = staffs;
    }

    public List<Staff> getStaffs(){
      return this.staffs;
    }

    public void add(Staff staff){
      staffs.add(staff);
    }


    /**
     * Get staff name by staff ID
     * @param staffID
     * @return
     */
    public String getStaffName(int staffID){
      return this.staffs.stream()
        .filter(e -> e.getId() == staffID)
        .map(s -> s.getName())
        .findAny()
        .orElse("Not Exist");
    }
  

    public static void main(String[] args) {
        Company company = new Company();
        company.add(new Staff(1, 20000, "John"));
        company.add(new Staff(2, 15000, "Peter"));

        System.out.println(company.getStaffName(1));
    }
}
