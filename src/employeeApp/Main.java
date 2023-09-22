package employeeApp;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan healthplan1 = new Healthplan(1,"A Sigorta", Healthplan.Plan.PREMIUM);
        Healthplan healthplan2 = new Healthplan(2,"B Sigorta", Healthplan.Plan.BASIC);

        System.out.println(healthplan1);
        System.out.println(healthplan2);

        String[] healthplans = new String[3];
        healthplans[0] = healthplan1.getName();
        healthplans[1] = healthplan2.getName();

        Employee employee = new Employee(1,"Ali Veli","ali@text.com","1234",healthplans);

        employee.addHealtplan(0,"C Sigorta");
        employee.addHealtplan(2,"C Sigorta");

        System.out.println(Arrays.toString(employee.getHealtplans()));

        Employee developer = new Employee(2,"Mehmet Ali","lksdjfsd","123123",healthplans);

        String[] developerNames = new String[5];
        developerNames[0] = developer.getFullName();

        Company company = new Company(1,"Workintech",1000,developerNames);
        company.addEmployee(0,"Anıl ensari");
        company.addEmployee(5,"Anıl ensari");
        company.addEmployee(1,"Anıl ensari");
        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
