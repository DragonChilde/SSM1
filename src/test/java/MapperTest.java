import com.ssm.mapper.EmployeeMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Lee
 * @create 2019/11/21 14:54
 */
public class MapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void getEmps()
    {
        System.out.println(employeeMapper);
    }

}
