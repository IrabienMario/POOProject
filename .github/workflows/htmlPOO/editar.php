<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar producto</title>
    <style>
        body {
            text-align: center; /* Centrar el texto en el cuerpo de la página */
            font-family: Arial, sans-serif;
        }

        h1 {
            color: #333;
        }

        form {
            margin: 20px auto; /* Centrar el formulario */
            max-width: 400px; /* Ancho máximo del formulario */
            padding: 20px;
            background-color: #fff; /* Fondo blanco del formulario */
            border-radius: 8px; /* Esquinas redondeadas */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Sombra sutil */
        }

        table {
            width: 100%;
        }

        td {
            padding: 10px;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }

        input[type="submit"],
        a {
            display: inline-block;
            padding: 10px 20px;
            margin-right: 10px; /* Margen a la derecha para separar los botones */
            text-decoration: none;
            color: #fff;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"] {
            background-color: #4CAF50; /* Color verde para el botón de actualizar */
            border: none;
        }

        a {
            background-color: #f44336; /* Color rojo para el botón de cancelar */
        }

        input[type="submit"]:hover,
        a:hover {
            background-color: #45a049; /* Cambio de color al pasar el ratón sobre los botones */
        }
    </style>
</head>
<body>

<h1>Editar producto</h1>

<form action="sp_editar.php" method="post">
<?php
$ID = $_GET['id'];
$CODIGO = $_GET['codigo'];
$NOMBRE = $_GET['nombre'];
$HECHOS = $_GET['done'];
?>
<table>
    <tr>
       <td>Ingresar datos:</td>
       <td><input type="text" name="id" id="id" style="visibility:hidden" value="<?=$ID?>"></td>
    </tr>
    <tr>
       <td>CODIGO:</td>
       <td><input type="text" name="codigo" id="codigo" value="<?=$CODIGO?>"></td>
    </tr>
    <tr>
       <td>NOMBRE:</td>
       <td><input type="text" name="nombre" id="nombre" value="<?=$NOMBRE?>"></td>
    </tr>
    <tr>
       <td>HECHOS:</td>
       <td><input type="text" name="done" id="done" value="<?=$HECHOS?>"></td>
    </tr>
    <tr>
       <td>
           <input type="submit" value="Actualizar">
           <a href="index.php">Cancelar</a>
       </td>
    </tr>
</table>

</form>
</body>
</html>



