package com.erp.orm.domain;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> loginName;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> mobile;
    public static volatile SingularAttribute<User, String> count;
    public static volatile SingularAttribute<User, String> roleid;
    public static volatile SingularAttribute<User, Date> createAt;
}
