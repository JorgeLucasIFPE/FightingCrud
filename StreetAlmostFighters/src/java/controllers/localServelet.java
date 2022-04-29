package controllers;

import java.util.List;

import model.negocios.Place;
import model.repositories.LocalMemo;

@WebServlet(name = "LocalServelet", urlPattern = "{/localServelet}")
public class localServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        if (id == null) {
            int i = Integer.parseInt(id);

            Place l = LocalMemo.getCurrentInstance().read(i);

            request.setAttribute("l", l);
        }

        List<Place> places = LocalMemo.getCurrentInstance().readAll();

        request.setAttribute("ls", places);

        getServletContext().getRequestDispatcher("/places.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletRespose response) throws ServletException, IOException {

                String nickname = request.getParameter("nickname");
                String address = request.getParameter("address");
                int capacity = request.getParameter("capacity");

                Place l = new Place();

                l.setNickname(nickname);
                l.setAddress(address);
                l.setCapacity(capacity);

                String update = request.getParameter("change");

                if (update == null) {
                    LocalMemo.getCurrentInstance().insert(l);
                
                } else {    
                    int id = Integer.parseInt(request.getParameter("id"));
                    l.setId(id);
                    LocalMemo.getCurrentInstance().change(l);

                    HttpSession session = request.getSession();

                    session.setAttriute('msg', "Local cadastrado com sucesso!");
                    response.sendRedirect("LocalServlet";
                    

                }
            }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletRespose response)
            throws ServletException, IOException {
        super.doDelete(request, response);

        int id = Integer.parseInt(request.getParameter("id"));

        LocalMemo.getCurrentInstance().delete(id);

    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPut(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short decription";
    }

}
