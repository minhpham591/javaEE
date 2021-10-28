/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.user;

/**
 *
 * @author phamm
 */
public class UserDAO extends BaseDAO<user>{
    public void insert(user model) {
        try {
            String sql ="INSERT INTO [DEMOMESS].[dbo].[USER]\n" +
                    "           ([username]\n" +
                    "           ,[password])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, model.getUsername());
            statement.setString(2, model.getPassword());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
     public user getAcountByUsername(String username){
        try {
            String sql= "SELECT [username]\n" +
"      ,[password]\n" +
"  FROM [USER] WHERE username = ?";      
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
        if(rs.next()){
            user user = new user();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));  
            return user ;
        }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null ;
    }

    
}
