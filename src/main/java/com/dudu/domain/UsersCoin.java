package com.dudu.domain;

import javax.persistence.*;

@Table(name = "users_coin")
public class UsersCoin {
    @Id
    @Column(name = "user_name")
    private String userName;

    private Integer coin;

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return coin
     */
    public Integer getCoin() {
        return coin;
    }

    /**
     * @param coin
     */
    public void setCoin(Integer coin) {
        this.coin = coin;
    }
}