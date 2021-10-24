package ru.academits.maksimenko.servlet;

import ru.academits.maksimenko.ContactsList;
import ru.academits.maksimenko.model.Contact;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

public class AddUserServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = -856234325007926384L;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Contact contact = new Contact();
        contact.setFirstName(req.getParameter("firstName"));
        contact.setLastName(req.getParameter("lastName"));

        ContactsList.addContact(contact);

        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }
}