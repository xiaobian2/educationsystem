package cn.beijing.ssfh.entity;

public class EnterpriseContact {
    private Integer enterpriseContactId;

    private Integer enterpriseId;

    private String contactName;

    private String phone;

    private String fixedTelephone;

    private String email;

    private String contactPosition;

    private Integer numberOfDaysNotConnected;

    public Integer getEnterpriseContactId() {
        return enterpriseContactId;
    }

    public void setEnterpriseContactId(Integer enterpriseContactId) {
        this.enterpriseContactId = enterpriseContactId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFixedTelephone() {
        return fixedTelephone;
    }

    public void setFixedTelephone(String fixedTelephone) {
        this.fixedTelephone = fixedTelephone == null ? null : fixedTelephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContactPosition() {
        return contactPosition;
    }

    public void setContactPosition(String contactPosition) {
        this.contactPosition = contactPosition == null ? null : contactPosition.trim();
    }

    public Integer getNumberOfDaysNotConnected() {
        return numberOfDaysNotConnected;
    }

    public void setNumberOfDaysNotConnected(Integer numberOfDaysNotConnected) {
        this.numberOfDaysNotConnected = numberOfDaysNotConnected;
    }
}