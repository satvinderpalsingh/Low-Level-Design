package carRentalSystem;

public class User {
    private String userId;
    private String userName;
    private String drivingLicesenceId;
    public User(String userId, String userName, String drivingLicesenceId) {
        this.userId = userId;
        this.userName = userName;
        this.drivingLicesenceId = drivingLicesenceId;
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public String getDrivingLicesenceId() {
        return drivingLicesenceId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
