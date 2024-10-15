
public class Test {

    String age = null;
    Bill[] bills = new Bill[100];

    public void myMethod() {
        age = "18";
    }

    public static void main(String[] args) {
        Test test = new Test();

        Bill bill = new Bill("BillTitle", "BillDescp");

        for (Object billObject : test.bills) {
            System.out.println(billObject);
        }
    }
}
