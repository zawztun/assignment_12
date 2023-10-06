package hibernate.dao;

import hibernate.entity.MobilePhone;

public interface MobilePhoneDao_interface {
 MobilePhone saveMobile(MobilePhone mbp);
 Integer deleteMobile(int id);
 Integer updateMobile(int id, MobilePhone mbp);
}
