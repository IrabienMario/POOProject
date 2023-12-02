<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de Productos</title>
    <style>
        body {
            text-align: center; /* Centrar el texto en el cuerpo de la página */
            font-family: Arial, sans-serif;
        }

        h1 {
            color: #333;
        }

        a {
            display: inline-block;
            padding: 8px 6px; /* Reducir el tamaño horizontal de los botones por la mitad */
            margin: 8px;
            text-decoration: none;
            color: #fff;
            background-color: #4CAF50; /* Color verde para los botones */
            border-radius: 5px; /* Esquinas redondeadas */
        }

        table {
            border-collapse: collapse;
            width: 60%; /* Reducir el ancho de la tabla */
            margin: 20px auto; /* Centrar la tabla */
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px; /* Ajustar el padding */
            text-align: left;
        }

        /* Ajuste del ancho de la columna de OPCIONES */
        th:nth-child(5),
        td:nth-child(5) {
            width: 15%; /* Ajusta este valor según tus necesidades */
        }

        th:nth-child(4),
        td:nth-child(4) {
            width: 1%; /* Ajusta este valor según tus necesidades */
        }

        th:nth-child(3),
        td:nth-child(3) {
            width: 20%; /* Ajusta este valor según tus necesidades */
        }

        th:nth-child(2),
        td:nth-child(2) {
            width: 1%; /* Ajusta este valor según tus necesidades */
        }

        th:nth-child(1),
        td:nth-child(1) {
            width: 1%; /* Ajusta este valor según tus necesidades */
        }

    </style>
</head>
<body>

<h1>Tabla de Productos</h1>

<a href="reset.php">Reiniciar ID</a>
<a href="nuevo.php">Nuevo producto</a>

<table>
    <tr>
        <th>ID</th>
        <th>CODIGO</th>
        <th>NOMBRE</th>
        <th>HECHOS</th>
        <th>OPCIONES</th>
    </tr>
    <?php
    // Simula una conexión a la base de datos (debes reemplazar esto con tu lógica de conexión)
    $servername = "localhost";
    $connectionoptions = array(
        "Database" => "proyectoPOO",
        "Uid" => "sa",
        "PWD" => "12345678"
    );

    $conn = sqlsrv_connect($servername, $connectionoptions);

    if (!$conn) {
        die("La conexión falló: " . print_r(sqlsrv_errors(), true));
    }

    // Consulta parametrizada para obtener los productos de la tabla
    $sql = "SELECT id, codigo, nombre, done FROM Productos";
    $stmt = sqlsrv_query($conn, $sql);

    if ($stmt === false) {
        die("Error en la consulta: " . print_r(sqlsrv_errors(), true));
    }

    while ($row = sqlsrv_fetch_array($stmt, SQLSRV_FETCH_ASSOC)): ?>
        <tr>
            <td><?= htmlspecialchars($row['id']); ?></td>
            <td><?= htmlspecialchars($row['codigo']); ?></td>
            <td><?= htmlspecialchars($row['nombre']); ?></td>
            <td><?= htmlspecialchars($row['done']); ?></td>
            <td>
                <a href="editar.php?id=<?= $row['id']; ?>&codigo=<?= $row['codigo']; ?>&nombre=<?= $row['nombre']; ?>&done=<?= $row['done']; ?>">Editar</a>
                <a href="eliminar.php?id=<?= $row['id']; ?>">Eliminar</a>
            </td>
        </tr>
    <?php endwhile; ?>
</table>
</body>
</html>

<?php
// Cerrar conexión (si es necesario)
if (isset($conn)) {
    sqlsrv_close($conn);
}
?>





