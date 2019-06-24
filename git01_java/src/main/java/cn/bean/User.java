package cn.bean;

import java.io.Serializable;

/**
 * describe:
 *
 * @author stone
 * @date 2019/06/24
 */
public class User implements Serializable {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
