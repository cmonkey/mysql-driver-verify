package org.excavator.boot.mysqldriververify.commandline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

import static java.lang.System.out;

@Component
public class DataSourceCommandLineRunner implements CommandLineRunner{

    @Resource
    DataSource dataSource;
    @Override
    public void run(String... args) throws Exception {
        var connection  = dataSource.getConnection();
        var stmt = "select * from t_sign_in_reward";
        var p = connection.prepareStatement(stmt);
        var r = p.executeQuery();
        while(r.next()){
            out.println(r.getInt(1));
        }
        var continueDays = 16;
        var onBrowserRelated = 1;
        var rewardAmount = 10;
        var keyCode = "test mysql driver";
        var couponAmount = 10;
        var couponFace = "test mysql driver";

        for (int i = 0; i < 1000; i++) {

            var insertStmt = "insert into t_sign_in_reward values(?,?,?,?,?,?)";
            p = connection.prepareStatement(insertStmt);
            p.setInt(1, continueDays+i);
            p.setInt(2, onBrowserRelated);
            p.setInt(3, rewardAmount);
            p.setString(4, keyCode);
            p.setInt(5, couponAmount);
            p.setString(6, couponFace);

            var rows = p.executeUpdate();
            out.println(rows);
        }
    }
}