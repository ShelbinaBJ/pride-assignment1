import java.util.ArrayList;
import java.util.List;

class RailwaySystem {
    private List<Asset> assets;
    private List<MaintenanceRecord> maintenanceRecords;

    public RailwaySystem() {
        assets = new ArrayList<>();
        maintenanceRecords = new ArrayList<>();
    }

    public void addAsset(Asset asset) {
        assets.add(asset);
    }

    public void addMaintenanceRecord(MaintenanceRecord record) {
        maintenanceRecords.add(record);
    }

    public void displayAssets() {
        System.out.println("Assets:");
        for (Asset asset : assets) {
            System.out.println(asset);
        }
    }

    public void displayMaintenanceRecords() {
        System.out.println("Maintenance Records:");
        for (MaintenanceRecord record : maintenanceRecords) {
            System.out.println(record);
        }
    }
}
