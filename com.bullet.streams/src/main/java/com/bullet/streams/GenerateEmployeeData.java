package com.bullet.streams;
import static com.bullet.person.Gender.MALE;
import static com.bullet.person.Gender.FEMALE;
import static com.bullet.person.Gender.UNKNOWN;

import com.bullet.employee.Employee;
import com.bullet.employee.EmployeePersonalDetails;
import com.bullet.employee.strategy.EmployeePaymentDetails;
import com.bullet.names.Name;
import com.bullet.person.Gender;
import com.bullet.person.MyDate;
import com.bullet.person.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenerateEmployeeData {
    // create a method to create a gender object
    private static Gender createGender(String gender) {
        return gender.equals("Female") ? FEMALE : gender.equals("Male") ? MALE : UNKNOWN;
    }

    public static void main(String[] args) {
        String path = "/home/brilliant/Desktop/employee.txt";
        File file = new File(path);
        List<Employee> employeeList = new ArrayList<>();


        // read line by line using BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = bufferedReader.readLine();
            while (line != null) {

                String[] data = line.split(",");
            // process each line

                // get the employee id
                String id = data[0].split(":")[1];
                // get the first name
                String fname = data[1].split(":")[1];
                // get the last name
                String lname = data[2].split(":")[1];
                // get the gender
                String gender = data[3].split(":")[1];
                // get the email
                String email = data[4].split(":")[2];
                // get the phone number
                String phone = data[5].split(":")[1];
                // get the department
                String dpt = data[6].split(":")[1];
                // get the job title
                String title = data[7].split(":")[1];
                // get the salary

                /* i realized that there is a bug in my program, because to
                extract the salary variable from the file created a problem
                in that the salary values themselves had a comma in them.
                This created a problem that the data[9] variable contained
                "000" and hence when i tried to get data[9] initially, my
                program crashed.
                Therefore, i had to find a getaround for this bug, so that
                the date variable was now in data[10].
                */

                char[] sal = data[8].split(":")[1].strip().toCharArray();
                String mySal = String.valueOf(sal[1] + sal[2]);
                //System.out.println(sal);
                String mari = data[9].strip();
                String inotenga = mySal + mari;
                int salary = Integer.parseInt(inotenga);
                // get the date joined
                String date = data[10].split(":")[1].strip();
                int year = Integer.parseInt(date.split("-")[0]);
                int month = Integer.parseInt(date.split("-")[1]);
                int day = Integer.parseInt(date.split("-")[2]);

                // create a name object
                //Name fullName = new Name(fname, lname);
                // create a gender object
                Person person = new Person(fname, lname);
                Gender employeeGender= GenerateEmployeeData.createGender(gender);
                person.setGender(employeeGender);

                //System.out.println(gender);

                // create an employee object
                Employee emp = new Employee(person);
                //emp.setGender(employeeGender);
                System.out.println("Gender: " + emp.getEmployeeGender());
                System.out.println("Gender: " + emp.getPerson().getGenderName());

                long empId = Integer.parseInt(id.strip());
                emp.setEmployeeID(empId);
                EmployeePersonalDetails employeePersonalDetails = new EmployeePersonalDetails(emp);
                employeePersonalDetails.setEmployeeEmail(email);
                employeePersonalDetails.setEmployeePhoneNumber(phone);
                EmployeePaymentDetails employeePaymentDetails = new EmployeePaymentDetails(emp);
                employeePaymentDetails.setDepartment(dpt);
                employeePaymentDetails.setJobTitle(title);
                employeePaymentDetails.setBasicSalary(salary);
                employeePaymentDetails.setDateJoined(new MyDate(year, month, day));

                 //add the employee to the employee list
                employeeList.add(emp);

                line = bufferedReader.readLine();

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // print out employee details
        for(Employee employee: employeeList) {
            System.out.println(employee.getEmployeeName() +
                    ", "+ employee.getPerson().getGenderName() +
                    ", " + employee.getEmployeeID());
        }

        System.out.println();

        Gender rudzi = GenerateEmployeeData.createGender("Male");
        Gender rudzi1 = GenerateEmployeeData.createGender("Female");
        System.out.println(rudzi1);
        System.out.println(rudzi);

        // group employees by department
//        Map<String, List<Employee>> empByDept = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::g));

        //System.out.println(empByDept);
        //for (String city: empByDept.keySet()) System.out.println(employeeList);
    }



//    }



}
