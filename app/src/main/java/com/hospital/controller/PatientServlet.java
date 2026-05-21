package com.hospital.controller;

import com.hospital.dao.PatientDAO;
import com.hospital.model.Patient;
import com.hospital.util.PatientIdGenerator;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class PatientServlet extends HttpServlet {

    PatientDAO dao = new PatientDAO();

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res
    ) throws ServletException, IOException {

        String action = req.getParameter("action");

        if(action.equals("register")) {

            Patient p = new Patient();

            p.setId(
                    PatientIdGenerator.generateId()
            );

            p.setName(req.getParameter("name"));
            p.setAge(
                    Integer.parseInt(
                            req.getParameter("age")
                    )
            );

            p.setGender(req.getParameter("gender"));
            p.setBlood(req.getParameter("blood"));
            p.setPhone(req.getParameter("phone"));
            p.setAddress(req.getParameter("address"));

            dao.addPatient(p);

            res.sendRedirect("patient-list.jsp");
        }
    }
}