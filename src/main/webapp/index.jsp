<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Realiza tu reserva</h1>
        <form action="servletReserva">
            Entrada: <input type="date" name="entrada">
            Salida: <input type="date" name="salida">
            <select name="tiporeserva">
                <option value="normal">Normal</option>
                <option value="superior">Superior</option>
            </select>
            <p>
            <input type="submit" value="Calcular">
            <input type="reset" value="Limpiar">
            </p>
        </form>
    </body>
</html>
