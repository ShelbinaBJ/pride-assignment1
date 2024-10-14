import java.time.LocalDate;

class MaintenanceRecord {
    private String assetId;
    private LocalDate date;
    private String description;

    public MaintenanceRecord(String assetId, LocalDate date, String description) {
        this.assetId = assetId;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MaintenanceRecord{" +
                "assetId='" + assetId + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
