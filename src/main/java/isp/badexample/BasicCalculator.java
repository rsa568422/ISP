package isp.badexample;

public class BasicCalculator implements Operations {

    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double subtract(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double divide(Double a, Double b) {
        return a / b;
    }

    @Override
    public Double sine(Double angle) {
        throw new UnsupportedOperationException("Basic calculator does not support trigonometric operation");
    }

    @Override
    public Double cosine(Double angle) {
        throw new UnsupportedOperationException("Basic calculator does not support trigonometric operation");
    }

}
