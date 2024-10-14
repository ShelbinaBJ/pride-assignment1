import java.time.LocalDate;

public class RailwayAssetManagement {
    public static void main(String[] args) {
        RailwaySystem railwaySystem = new RailwaySystem();

        Train train1 = new Train("T001", "Express Train", 300);
        Track track1 = new Track("TR001", "Main Line", 10.5);
        Station station1 = new Station("ST001", "Central Station", "Downtown");

        railwaySystem.addAsset(train1);
        railwaySystem.addAsset(track1);
        railwaySystem.addAsset(station1);

        MaintenanceRecord record1 = new MaintenanceRecord("T001", LocalDate.of(2024, 10, 1),
                "Routine maintenance performed.");
        railwaySystem.addMaintenanceRecord(record1);

        railwaySystem.displayAssets();
        railwaySystem.displayMaintenanceRecords();
    }
}
