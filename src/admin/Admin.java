package admin;

public class Admin {
    protected  String name;
    protected  int phoneNumber;
    protected  int fieldPrice;
    protected  int bonusPoint;
    protected  int fieldNumber;
    protected  int playTime;

    public Admin(String name, int phoneNumber, int fieldPrice, int bonusPoint, int fieldNumber, int playTime) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.fieldPrice = fieldPrice;
        this.bonusPoint = bonusPoint;
        this.fieldNumber = fieldNumber;
        this.playTime = playTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public  int getFieldPrice() {
        return fieldPrice;
    }

    public  void setFieldPrice(int fieldPrice) {
        this.fieldPrice = fieldPrice;
    }

    public  int getBonusPoint() {
        return bonusPoint;
    }

    public  void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public  int getFieldNumber() {
        return fieldNumber;
    }

    public  void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public  int getPlayTime() {
        return playTime;
    }

    public  void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    @Override
    public String toString() {
        return "admin{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", fieldPrice=" + fieldPrice +
                ", bonusPoint=" + bonusPoint +
                ", fieldNumber=" + fieldNumber +
                ", playTime=" + playTime +
                '}';
    }
}

