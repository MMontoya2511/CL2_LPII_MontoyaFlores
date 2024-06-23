<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="model.TblProductocl2" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>

<body bgcolor="#c5dec9">
<h1 align="center">Listado de Productos</h1>

<h2 align="center">
<a href="FormRegistrarProducto.jsp">Registrar Producto</a>
</h2>

<table border="2" align="center">
    <tr>
        <td>Codigo</td>
        <td>Nom</td>
        <td>Pv</td>
        <td>Pc</td>
        <td>Est</td>
        <td>Des</td>

    </tr>

   <%
List<TblProductocl2> ListadoProductos = (List<TblProductocl2>) request.getAttribute("listadoproducto");

if (ListadoProductos != null) {
    for (TblProductocl2 lis : ListadoProductos) { // Aquí utilizamos ListadoProductos en el bucle
%>

<tr>
    <td><%= lis.getIdProductoCL2() %></td>
    <td><%= lis.getNombreCL2() %></td>
    <td><%= lis.getPrecioventaCL2() %></td>
    <td><%= lis.getPreciocompCL2() %></td>
    <td><%= lis.getEstadoCL2() %></td>
    <td><%= lis.getDescripCL2() %></td>
</tr>

<%
    }
}
%>
</table>
</body>
</html>