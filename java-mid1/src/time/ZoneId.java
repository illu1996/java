package time;

public class ZoneId {
    public static void main(String[] args) {


        for (String getAvailableZoneIds : java.time.ZoneId.getAvailableZoneIds()) {
            java.time.ZoneId zoneId = java.time.ZoneId.of(getAvailableZoneIds);
            System.out.println(zoneId+ "|" + zoneId.getRules());
        }

        java.time.ZoneId zoneId = java.time.ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        java.time.ZoneId seoulZoneId = java.time.ZoneId.of("Asia/Seoul");
        System.out.println("SeoulZoneId = " + seoulZoneId);
    }
}
