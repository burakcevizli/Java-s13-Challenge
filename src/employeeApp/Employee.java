package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String eMail;
    private String password;
    private String[] healtplans;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealtplans() {
        return healtplans;
    }

    public void setHealtplans(String[] healtplans) {
        this.healtplans = healtplans;
    }


    public Employee(int id, String fullName, String eMail, String password, String[] healtplans) {
        this.id = id;
        this.fullName = fullName;
        this.eMail = eMail;
        this.password = password;
        this.healtplans = healtplans;
    }

    public void addHealtplan(int index, String name) {

        if (index >= 0 && index < healtplans.length) {
            if (healtplans[index] == null) {
                healtplans[index] = name;
            } else {
                System.out.println("This index is already full...");
            }
        } else {
            try {
                boolean isExist = false;
                for (String healthPlan : healtplans) {
                    if (healthPlan != null && healthPlan.equals(name)) {
                        isExist = true;
                        break;
                    }
                }

                if (!isExist) {
                    if (healtplans[index] == null) {
                        healtplans[index] = name;
                    } else {
                        System.out.println("İlgili index dolu");
                    }
                } else {
                    System.out.println("Bu isimde healtplan mevcut : " + name);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index :" + index);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password=" + password +
                ", healtplans=" + Arrays.toString(healtplans) +
                '}';
    }
}
