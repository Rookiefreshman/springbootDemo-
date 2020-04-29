package cn.sx.Main.domain;

public class Computer {
    private String id;
    private String mainEngine;
    private String displayDevice;
    private String printer;
    private String ukey;
    private String network;
    private String companyId;

    public Computer(String id, String mainEngine, String displayDevice, String printer, String ukey, String network, String companyId) {
        this.id = id;
        this.mainEngine = mainEngine;
        this.displayDevice = displayDevice;
        this.printer = printer;
        this.ukey = ukey;
        this.network = network;
        this.companyId = companyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainEngine() {
        return mainEngine;
    }

    public void setMainEngine(String mainEngine) {
        this.mainEngine = mainEngine;
    }

    public String getDisplayDevice() {
        return displayDevice;
    }

    public void setDisplayDevice(String displayDevice) {
        this.displayDevice = displayDevice;
    }

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public String getUkey() {
        return ukey;
    }

    public void setUkey(String ukey) {
        this.ukey = ukey;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
