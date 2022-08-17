package co.com.sofka.dto;

public class ActivityDto {
    private String id;
    private String description;
    private String date;
    private String observations;

    private String location;

    private String coordinates;

    public ActivityDto() {
    }

    public ActivityDto(String id, String description, String date, String observations, String location, String coordinates) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.observations = observations;
        this.location = location;
        this.coordinates = coordinates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
