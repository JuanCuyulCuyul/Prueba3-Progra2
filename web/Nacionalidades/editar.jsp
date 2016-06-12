<%@page import="accesodato.Coneccion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar Nacionalidades</h1>
        <br>
        <% String nacionalidad_id=request.getParameter("nacionalidad_id"); %>
        
        <form method="post" action="../ServletNacionalidad">
        <table border="1">
            <tr>
                <td>Nacionalidad_id</td><td><input type="text" name="nacionalidad_id" readonly value="<% out.println(""+nacionalidad_id);  %>"></td>
            </tr>
            <%  Coneccion con=new Coneccion();
                con.setConsulta("select * from Nacionalidades where nacionalidad_id='"+nacionalidad_id+"'");
                while(con.getResultado().next()){
            
            
            %>
            
            <tr>
                <td>Nombre</td><td><input type="text" name="nombre" value="<% out.println(""+con.getResultado().getString("nombre"));  %>"></td>
            </tr>
            <tr>
                <td><input type="submit" name="editar" value="Editar"></td>
            </tr>
            <% } %>
        </table>
        </form>
    </body>
</html>