class Train extends Asset {
    private int capacity;

    public Train(String id, String name, int capacity) {
        super(id, name);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
