package com.revature.metallicgems.services;

import com.revature.metallicgems.models.Earring;
import com.revature.metallicgems.utils.custom_exceptions.InvalidUserException;
import com.revature.metallicgems.daos.EarringDAO;

import java.util.List;

public class EarringService {
    private final EarringDAO earringDAO;

    public EarringService(EarringDAO earringDao) {
        this.earringDAO = earringDao;
    }

    public List<Earring> getAllEarrings() {
        return earringDAO.getAll();
    }
}
