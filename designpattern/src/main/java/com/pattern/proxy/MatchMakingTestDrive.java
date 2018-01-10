package com.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * @author pc
 * @since 2018/1/5.
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setGender("1");
        personBean.setHotOrNotRating(2);
        personBean.setInterests("3");
        personBean.setName("4");

        PersonBean ownerProxy = getOwnProxy(personBean);
        ownerProxy.setName("bob");
        System.out.println(personBean.getName());
    }

    static PersonBean getOwnProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
}
