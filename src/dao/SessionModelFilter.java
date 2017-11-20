package dao;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;

import javax.persistence.FlushModeType;

public class SessionModelFilter extends OpenSessionInViewFilter {

    //覆盖父类中创建Session的方式，因为父类总创建Session,默认设置Session的setFlushMode为FlushMode.MANUAL就是只读模式

    @Override
    protected Session openSession(SessionFactory sessionFactory) throws DataAccessResourceFailureException {
        Session session=sessionFactory.openSession();
        session.setFlushMode(FlushMode.COMMIT);//设置刷新模式也就是什么时候将sql语句发送到数据库

        return session;
    }


}