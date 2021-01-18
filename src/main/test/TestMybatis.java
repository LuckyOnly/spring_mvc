import com.zff.dao.AccountDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import java.io.InputStream;

public class TestMybatis {
    @Test
    public void run1() throws Exception{
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建factory对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        // 创建sqlsession对象
        SqlSession session=factory.openSession();
        // 获取代理对象 alt+enter
        AccountDao accountDao = session.getMapper(AccountDao.class);
        //查询所有数据
        accountDao.findAll();
        session.close();
        in.close();

    }
}
