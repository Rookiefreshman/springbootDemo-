
import com.shixiang.demo.entity.Condition;
import com.shixiang.demo.dao.TMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Create By  on 2020/4/12.
 */
@SpringBootTest// (classes = Application.class)
//@RunWith(SpringRunner.class)
@Slf4j
public class DemoTestMain {
    @Resource
    TMapper tMapper;

    @Test
    public void selectBy123() {
//        List<Condition> list = new ArrayList<Condition>();
//        Condition aa = new Condition();
//        aa.setAttr("api_id");
//        aa.setValue("1");
//        list.add(aa);
//        Map<String, Object> map = (Map<String, Object>) tMapper.selectByTableNameAndCommonAttr("api_service", list);

    }
}
//    public void selectByXXX(){
//    List<Condition> list=new ArrayList<Condition>();
//    Condition aa= new Condition();
//    aa.setAttr("api_id");
//    aa.setValue("1");
//    list.add(aa);
//    Map<String,Object> map= (Map<String, Object>) tMapper.selectByTableNameAndCommonAttr("api_service",list);
//
//    }



    //        condition.
//    @Test
//    public void aa() throws Exception{
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet rs= null;
//
//        try {
//            //加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //获取连接
//            String url = "jdbc:mysql://127.0.0.1:3306/test";
//            String user = "root";
//            String password = "123456";
//            connection = DriverManager.getConnection(url, user, password);
//            // 获取statement，preparedStatement
//            String sql = " select * from api_service where api_id=1  ";
//            preparedStatement = connection.prepareStatement(sql);
//            //设置参数
////            preparedStatement.setLong(1, 1);
//            //执行查询
//             rs = preparedStatement.executeQuery();
//             //处理结果集
//             while(rs.next()) {
//                 System.out.println(rs.getString("api_id"));
//                 System.out.println(rs.getString("api_desc"));
//                 System.out.println(rs.getString("api_path"));
//             }
//        }
//        finally {
//            if(rs!=null){
//                rs.close();
//            }
//            if(preparedStatement!=null){
//                preparedStatement.close();
//            }
//            if(connection!=null)
//            {
//                connection.close();
//            }
//        }
//    }

