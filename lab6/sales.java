package Marketing;

import General.employee;

public class sales extends employee {

    public sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance(double totalEarnings) {
        return 0.05 * totalEarnings;
    }

    public static void main(String[] args) {
        double basic = 20000;   // given basic salary

        sales s = new sales(101, "Rahul");

        double totalEarnings = s.earnings(basic);
        double ta = s.tallowance(totalEarnings);

        System.out.println("Employee ID: " + s.empid);
        System.out.println("Total Earnings: " + (totalEarnings + ta));
    }
}
