package com.earl.mycustomlistview;

/**
 * Created by Zer0 on 9/14/2017.
 */

public class AndroidVersion {

    int logo;
    String codename, version, api, date;

    public AndroidVersion(int logo, String codeName, String codename, String version, String date) {
        this.logo = logo;
        this.codename = codename;
        this.version = version;
        this.api = api;
        this.date = date;
    }

    public int getLogo() {
        return logo;
    }

    public String getCodename() {return codename;}

    public String getVersion() {return version;}

    public String getApi() {return api;}

    public String getDate() {return date;}
}
