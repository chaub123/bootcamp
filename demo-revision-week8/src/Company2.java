import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company2 {
    private Staff[] staffs;

    public Company2(){
      staffs = new Staff[0];
    }

    public Company2(Staff[] staffs){
      this.staffs = staffs;
    }

    public void add(Staff staff){
        Staff[] temp = this.staffs;
        this.staffs = new Staff[this.staffs.length + 1];
        for(int i =0; i < temp.length; i++){
            this.staffs[i] = temp[i];
        }
        this.staffs[this.staffs.length - 1] = staff;
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
}
