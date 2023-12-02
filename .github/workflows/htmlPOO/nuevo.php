<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nuevo producto</title>
    <style>
        body {
            text-align: center; /* Centrar el texto en el cuerpo de la página */
            font-family: Arial, sans-serif;
            background-color: #f2f2f2; /* Color de fondo */
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
        input[type="button"] {
            background-color: #4CAF50; /* Color verde para el botón */
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-right: 10px; /* Margen a la derecha para separar los botones */
        }

        input[type="submit"]:hover,
        input[type="button"]:hover {
            background-color: #45a049; /* Cambio de color al pasar el ratón sobre el botón */
        }
    </style>
</head>
<body>

<h1>Nuevo producto</h1>

<form action="insertar.php" method="post">

<table>
    <tr>
       <td>Ingresar datos:</td>
       <td><input type="text" name="id" id="id" style="visibility:hidden" value="<?=$ID?>"></td>
    </tr>
    <tr>
       <td>CODIGO:</td>
       <td><input type="text" name="codigo" id="codigo"></td>
    </tr>
    <tr>
       <td>NOMBRE:</td>
       <td><input type="text" name="nombre" id="nombre"></td>
    </tr>
    <tr>
       <td>HECHOS:</td>
       <td><input type="text" name="done" id="done"></td>
    </tr>
    <tr>
       <td colspan="2">
           <input type="button" value="Volver al índice" onclick="window.location.href='index.php';">
           <input type="submit" value="Guardar">
       </td>
    </tr>
</table>

</form>

</body>
</html>
