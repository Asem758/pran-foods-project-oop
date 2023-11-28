
package mainpkg;
        
import java.io.Serializable;

public class Employee implements Serializable{
//public class Employee {
    
    private int id;
    private String pw;

    public Employee() {
    }

    public Employee(int id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", pw=" + pw + '}';
    }
    
    
    
}
