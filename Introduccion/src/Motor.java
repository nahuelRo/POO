public class Motor {
    private double cilindrada;
    private TipoMotor motor;

    public Motor() {
    }

    public Motor(double cilindrada, TipoMotor motor) {
        this.cilindrada = cilindrada;
        this.motor = motor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getMotor() {
        return motor;
    }

    public void setMotor(TipoMotor motor) {
        this.motor = motor;
    }
}
