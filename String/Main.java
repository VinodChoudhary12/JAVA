// Immutable Parent Class
final class ImmutableParent {
    private final int value;

    public ImmutableParent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

// Mutable Child Class
class MutableChild extends ImmutableParent {
    private int additionalValue;

    public MutableChild(int initialValue, int additionalValue) {
        super(initialValue);
        this.additionalValue = additionalValue;
    }

    public void addToValue() {
        // Mutable operation in the child class
        super.value += additionalValue;
    }
}

// Example Usage
public class Main {
    public static void main(String[] args) {
        ImmutableParent immutableInstance = new ImmutableParent(42);
        System.out.println("Immutable Parent Value: " + immutableInstance.getValue());

        MutableChild mutableInstance = new MutableChild(42, 10);
        mutableInstance.addToValue();
        System.out.println("Mutable Child Value: " + mutableInstance.getValue());
    }
}
