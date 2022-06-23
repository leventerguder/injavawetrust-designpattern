package interpreter;

public class Report {

    private String name;
    //"NOT ADMIN", "FINANCE_USER AND ADMIN"
    private String permission;

    public Report(String name, String permissions) {
        this.name = name;
        this.permission = permissions;
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }


}
