package com.pattern.proxy;

/**
 * @author pc
 * @since 2018/1/4.
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHostOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
