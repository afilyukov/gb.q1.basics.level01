public class Plate {
    private int capacity;
    private int current;

    public Plate(int capacity, int current) {
        this.capacity = capacity;
        if (current > capacity) {
            System.out.println(String.format("Too much food, we can put only %s of food", capacity));
            this.current = capacity;
        } else {
            this.current = current;
        }
    }

    public boolean decreaseFood(int requestedPortion) {
        if (requestedPortion > this.current) {
            System.out.println(
                    String.format(
                            "There is no enough food: requested portion - %s, remaining portion - %s, capacity - %s", requestedPortion, current, capacity
                    )
            );
            return false;
        }

        this.current -= requestedPortion;
        System.out.println(String.format("Animal was fed: remaining portion - %s, capacity - %s", requestedPortion, capacity));
        return true;
    }

    public void addFood(int requestedPortion) {
        if (requestedPortion > this.capacity) {
            System.out.println(String.format("Too much food, we can put only %s", this.capacity));
            this.current = capacity;
        } else {
            this.current += requestedPortion;
        }

        System.out.println(
                String.format(
                        "There is no enough food: remaining portion - %s, capacity - %s",
                        this.current, this.capacity
                )
        );
    }

    public void info() {
            System.out.println(String.format("Current food in the plate: %s", this.current));
    }
}
