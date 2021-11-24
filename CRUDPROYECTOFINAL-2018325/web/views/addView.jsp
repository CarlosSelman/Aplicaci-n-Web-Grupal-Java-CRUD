<%-- 
    Document   : add
    Created on : 16/09/2020, 12:57:05 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="dist/css/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="dist/css/main.css">
        <link rel="icon" href="dist/img/LOGO CPF.png?v=2">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <title>Agregar</title>
    </head>
    <body class="color-section">
        <!--Empieza side bar-->
        <div id="wrapper">
        <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <li class="sidebar-brand">
                        <a hre="#" class="text-center">
                            <center><img src="dist/img/LOGO CPF.png" class="img-responsive img-circle logo-img"></center>
                        </a>
                    </li>
                    <div class="links">
                        <li>
                            <a href="index.html"><i class="fas fa-home" style="padding-right: 5px; color: white; font-size: 18pt"></i>Inicio</a>
                        </li>
                        <li>
                            <a href="Controlador?accion=listar"><i class="fas fa-clipboard-list" style="padding-right: 5px; color: white; font-size: 22pt;"></i>Listar</a>
                        </li>
                        <li>
                            <a href="Controlador?accion=add"><i class="fas fa-plus" style="padding-right: 5px; color: white; font-size: 22pt;"></i>Agregar</a>
                        </li>
                    </div>
                </ul>
            </div>
            <!-- Page Content -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <a href="#menu-toggle" class="float-right" id="menu-toggle"><i class="fas fa-bars" style="whidth: 15px; height: 15px;"></i></a>
                    <!--**** CONTENIDO AQUI *******-->
                    <h1 class="text-center">Agregar Persona</h1>
                        <form action="Controlador" class="col-xs-5" style="padding-left: 400px; padding-right: 0; width: 70%; padding-top: 50px;">
                            <strong>DPI:</strong><br>
                            <input class="form-control" type="text" name="txtDPI" required><br>
                            <strong>Nombres:</strong><br>
                            <input class="form-control" type="text" name="txtNombres" required><br><br>
                            <div class="text-center">
                                <input class="btn btn-success btn-lg" type="submit" name="accion" value="Agregar" onclick='add()'>
                            </div>
                        </form>
                    <!--**** CONTENIDO AQUI *******-->
                </div>
            </div>
    </div>
        <!--Termina Side bar -->
    </body>
    <!--Scripts-->
    <script src="dist/js/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="dist/js/main.js" type="text/javascript"></script>
    <script src="dist/js/popper.min.js" type="text/javascript"></script>
    <script src="dist/css/fontawesome/js/all.min.js" type="text/javascript"></script>
    <script>
    function add(){
        swal("Exito !", "Registro agregado correctamente!", "success");
    }
    </script>
    <!--Termina Scripts-->
</html>
