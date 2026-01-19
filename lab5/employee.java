package p5;

public class employee {
    protected int empid;      // protected
    private String ename;     // private

    public employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic) {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}
