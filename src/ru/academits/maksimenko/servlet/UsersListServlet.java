package ru.academits.maksimenko.servlet;

import ru.academits.maksimenko.ContactsList;
import ru.academits.maksimenko.model.Contact;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import java.util.List;

public class UsersListServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = -856234325007926384L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();

        List<Contact> contactList = ContactsList.getAllContacts();

        for (Contact contact : contactList) {
            writer.println(contact.getFullName());
        }

        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }
}