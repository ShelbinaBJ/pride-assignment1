class Station extends Asset {
    private String location;

    public Station(String id, String name, String location) {
        super(id, name);
        this.location = location;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
