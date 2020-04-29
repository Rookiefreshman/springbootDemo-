package cn.sx.Main.domain;

public class Liaison {
    private String name;
    private String cellPhoneNumber;
    private String id;
    private String companyId;

    public Liaison(String name, String cellPhoneNumber, String id, String companyId) {
        this.name = name;
        this.cellPhoneNumber = cellPhoneNumber;
        this.id = id;
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
