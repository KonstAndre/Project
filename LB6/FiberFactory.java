package LB6;

public class FiberFactory implements LaserFactory{
    @Override
    public Pump getPump() {
        return new FiberPump();
    }

    @Override
    public Substance getSubstance() {
        return new FiberSubstance();
    }
}
