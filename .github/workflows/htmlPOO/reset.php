<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reiniciar ID</title>
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
            margin-top: 10px; /* Espaciado superior para separar el botón del borde superior del formulario */
            margin-right: 10px; /* Margen a la derecha para separar los botones */
        }

        input[type="submit"]:hover,
        input[type="button"]:hover {
            background-color: #45a049; /* Cambio de color al pasar el ratón sobre los botones */
        }
    </style>
</head>
<body>

<h1>Reiniciar ID</h1>

<form action="sp_reset.php" method="post">

    <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="reset" id="reset"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Guardar">
                <input type="button" value="Regresar al índice" onclick="window.location.href='index.php';">
            </td>
        </tr>
    </table>

</form>

</body>
</html>

