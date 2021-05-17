package vn.phatdo.case_study.models.generator;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyGenerator implements IdentifierGenerator,Configurable{
    private String prefix;
    private String sequence;
    @Override
    public Serializable generate(
            SharedSessionContractImplementor session, Object obj)
            throws HibernateException {

        Connection connection = session.connection();

        try {
            Statement statement=connection.createStatement();
            statement.executeUpdate("CREATE TABLE if not exists "+ sequence +" (id INT NOT NULL)");

            String query = "SELECT id from "+ sequence;
            ResultSet rs=statement.executeQuery(query);

            int id ;
            if(!rs.next()){
              id = 0;
              statement.executeUpdate("INSERT INTO "+sequence+"(id) values "+"("+0+")");
            }else {
                id = rs.getInt(1);
            }
            String generatedId = prefix + String.format("%04d",id);
            statement.executeUpdate("UPDATE " + sequence + " SET id=last_insert_id(id+1)");
            return generatedId;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void configure(Type type, Properties properties,
                          ServiceRegistry serviceRegistry) throws MappingException {
        prefix = properties.getProperty("prefix");
        sequence=properties.getProperty("sequence");
    }

}
