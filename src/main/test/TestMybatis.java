import com.zff.dao.AccountDao;
import com.zff.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;


import java.io.InputStream;
import java.util.List;

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
//        List<Account> accountList=accountDao.findAll();
        List<Account> accountList=null;
        for(Account account:accountList){
            System.out.println(accountDao);
        }
        session.close();
        in.close();

    }

    @Test
    public void run2() throws Exception{

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建factory对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        // 创建sqlsession对象
        SqlSession session=factory.openSession(true);
        // 获取代理对象 alt+enter
        AccountDao accountDao = session.getMapper(AccountDao.class);
        Account account=new Account();
        account.setMoney(222f);
        account.setUsername("234");

        //查询所有数据
//        accountDao.saveAccount(account);
        //提交事务
        session.commit();
        session.close();
        in.close();
             }

}
