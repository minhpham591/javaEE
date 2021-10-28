/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.mess;

/**
 *
 * @author phamm
 */
public class MessDAO extends BaseDAO<mess>{

   
    public ArrayList<mess> getAll() {
        ArrayList<mess> messs=new ArrayList<>();
        try {
            String sql= "SELECT [id]\n" +
"      ,[username]\n" +
"      ,[mess]\n" +
"      ,[time]\n" +
"  FROM [DETAIL]";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                mess m=new mess();
                m.setUsername(rs.getString("username"));
                m.setMess(rs.getString("mess"));
                m.setDate(rs.getDate("time"));
                m.setTime(rs.getTime("time"));
                messs.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messs;
    }
     public void insert(mess model){
        try {
            String sql ="INSERT INTO [DEMOMESS].[dbo].[DETAIL]\n" +
                    "           ([username]\n" +
                    "           ,[mess]\n" +
                    "           ,[time])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,GETDATE())";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, model.getUsername());
            statement.setString(2, model.getMess());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public ArrayList<mess> search(String name, Date from, Date to){
         ArrayList<mess> ms= new ArrayList<>();
         String sql ="SELECT [id]\n" +
"      ,[username]\n" +
"      ,[mess]\n" +
"      ,[time]\n" +
"  FROM [DETAIL]"
                 + "WHERE 1=1";
         int countParam = 0;
        HashMap<Integer, Object[]> parameters = new HashMap<>();
         if (!name.equals("")) {
            sql += " AND username = ? ";
            countParam++;
            Object[] params = {"STRING", name};
            parameters.put(countParam, params);
        }
        if (from != null) {
            sql += " AND time >= ? ";
            countParam++;
            Object[] params = {"DATE", from};
            parameters.put(countParam, params);
        }

        if (to != null) {
            sql += " AND time <= ? ";
            countParam++;
            Object[] params = {"DATE", to};
            parameters.put(countParam, params);
        }

        PreparedStatement statement;
        try {
            statement = conn.prepareStatement(sql);
            for (Map.Entry<Integer, Object[]> entry : parameters.entrySet()) {
                Integer key = entry.getKey();
                Object[] value = entry.getValue();
                switch (value[0].toString()) {
                    case "STRING":
                        statement.setString(key, value[1].toString());
                        break;
                    case "DATE":
                        statement.setDate(key, (Date) value[1]);
                        break;
                }

            }
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                mess m = new mess();
                m.setUsername(rs.getString("username"));
                m.setMess(rs.getString("mess"));
                m.setDate(rs.getDate("time"));
                m.setTime(rs.getTime("time"));
                ms.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ms;
     }
}
