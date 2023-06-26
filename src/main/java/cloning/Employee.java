package cloning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Cloneable{

    private String id;
    private String name;

    private Address address;


    public Object clone() throws CloneNotSupportedException {

        Employee employee = (Employee) super.clone();
        return employee;
    }
}
