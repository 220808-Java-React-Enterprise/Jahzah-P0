package com.revature.metallicgems.daos;

import com.revature.metallicgems.models.Earring;
import com.revature.metallicgems.utils.custom_exceptions.InvalidSQLException;
import com.revature.metallicgems.utils.database.ConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EarringDAO implements CrudDAO <Earring> {
    @Override
    public void save(Earring obj) {

    }

    @Override
    public void update(Earring obj) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Earring getById(String id) {
        return null;
    }

    @Override
    public List<Earring> getAll() {
        List<Earring> earring = new ArrayList<>();

        try (Connection con = ConnectionFactory.getInstance().getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM earrings");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Earring earring1 = new Earring(rs.getString("id"), rs.getInt("quantity"), rs.getString("style"), rs.getString("metal"), rs.getString("color"), rs.getString("order_id"), rs.getString("warehouse_id"));
                earring.add(earring1);
            }
        } catch (SQLException e) {
            throw new InvalidSQLException("An error occurred when tyring to save to the database.");
        }

        return earring;
    }
}
