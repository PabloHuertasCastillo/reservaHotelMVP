<%-- 
    Document   : verReserva
    Created on : 28 ene. 2021, 10:56:06
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Tu reserva está lista</h1>
        <% 
            request.getAttribute("miReserva");
        %>
        <h4>Fecha de Entrada: ${miReserva.fechaentrada}</h4>
        <h4> Fecha de Salida: ${miReserva.fechasalida}</h4>
        <h4>Numero de noches: ${miReserva.numeronoches}</h4>
        <h4>Precio total: ${miReserva.preciototal} €</h4>
        <h4>Precio total: ${miReserva.precioconiva} €</h4>
       
        
        
        
    </body>
</html>
