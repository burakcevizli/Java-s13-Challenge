package employeeApp;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        checkGiro(giro);
    }

    private void checkGiro(int giro) {
        if(giro < 0 ){
            this.giro = 0;
        }else{
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.developerNames = developerNames;
        checkGiro(giro);
    }

    public void addEmployee(int index, String name) {
        try{
            if(developerNames[index]==null){
                developerNames[index] = name;
            }else{
                System.out.println("İlgili index dolu...");
            }

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan index için atama yapıldı..." + index);
        }

    }


    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
