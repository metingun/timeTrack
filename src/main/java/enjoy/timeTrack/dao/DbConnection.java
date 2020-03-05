package enjoy.timeTrack.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class DbConnection {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(){

        jdbcTemplate.execute("insert into Users values (4,'metin','metingun02','mamnnn','4343434343','asdasdasdasd','metr','')");

        List<Map<String, Object>> asd = jdbcTemplate.queryForList("select * from Users");

        System.out.println(asd);

    }
}




