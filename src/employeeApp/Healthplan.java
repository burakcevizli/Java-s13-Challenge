package employeeApp;

public class Healthplan {

    private int id;
    private String name;
    private Plan plan;

    public enum Plan {
        BASIC("Basic", 1000),
        STANDART("Standart", 2000),
        PREMIUM("Premium", 3000);

        private final String name;
        private final int price;

         Plan(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    public Healthplan(int id, String name, Plan plan) {
        this.id= id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String toString() {
        return "Healtplan [id: " + id + ", name: " + name + ", plan: " + plan + "]";
    }
}
