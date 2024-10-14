class Track extends Asset {
    private double length;

    public Track(String id, String name, double length) {
        super(id, name);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", length=" + length +
                '}';
    }
}
