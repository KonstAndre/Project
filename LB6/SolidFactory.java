package LB6;

public class SolidFactory implements LaserFactory{
    @Override
    public Pump getPump() {
        return new SolidPump();
    }

    @Override
    public Substance getSubstance() {
        return new SolidSubstance();
    }
}
