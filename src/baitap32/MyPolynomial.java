package baitap32;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] == 0) continue;

            if (s.length() > 0 && coeffs[i] > 0) s += " + ";

            // In hệ số và x^i
            s += coeffs[i];
            if (i == 1) s += "x";
            else if (i > 1) s += "x^" + i;
        }
        return s;
    }

    public double evaluate(double x) {
        double total = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            total += coeffs[i] * Math.pow(x, i);
        }
        return total;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i < newCoeffs.length; i++) {
            double c1 = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double c2 = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            newCoeffs[i] = c1 + c2;
        }
        return new MyPolynomial(newCoeffs);
    }
}