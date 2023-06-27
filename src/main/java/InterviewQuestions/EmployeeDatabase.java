package InterviewQuestions;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.List;


public class EmployeeDatabase {

    public static List<Employee1> fetchEmployees() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper
                    .readValue(new File("C:\\Users\\karukris\\3D Objects\\untitled\\target\\employee.json"), new TypeReference<List<Employee1>>() {
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
