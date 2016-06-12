import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Creador;

public class ServletCreador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
                Creador cre=new Creador();
            
            try (PrintWriter out = response.getWriter()) {
            
            if(request.getParameter("eliminar")!=null){
               
            int id=Integer.parseInt(request.getParameter("eliminar"));
                out.println("Eliminar ID:"+id);
                cre.setCreador_id(id);
               
                cre.eliminar();
               
                response.sendRedirect("Creadores/index.jsp");
               
           }else if(request.getParameter("guardar")!=null){
               
               String nombre=request.getParameter("nombre");
               String apepat=request.getParameter("apepat");
               String apemat=request.getParameter("apemat");
               int nacionalidad_id=Integer.parseInt(request.getParameter("nacionalidad_id"));
               
               cre.setNombre(nombre);
               cre.setApepat(apepat);
               cre.setApepat(apemat);
               cre.setNacionalidad_id(nacionalidad_id);
               
               cre.guardar();
               
               response.sendRedirect("Creadores/index.jsp");
               
           }else if(request.getParameter("editar")!=null){
               
               int creador_id=Integer.parseInt(request.getParameter("creador_id"));
               String nombre=request.getParameter("nombre");
               String apepat=request.getParameter("apepat");
               String apemat=request.getParameter("apemat");
               int nacionalidad_id=Integer.parseInt(request.getParameter("nacionalidad_id"));
               
               cre.setCreador_id(creador_id);
               cre.setNombre(nombre);
               cre.setApepat(apepat);
               cre.setApemat(apemat);
               cre.setNacionalidad_id(nacionalidad_id);
               
               cre.actualizar();
               
               response.sendRedirect("Creadores/index.jsp");
           }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
