<?php
// Verificar si se ha enviado el formulario
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Obtener los datos del formulario
    $id = $_POST['id'];
    $codigo = $_POST['codigo'];
    $nombre = $_POST['nombre'];
    $hechos = $_POST['done'];

    // Conexión a la base de datos (configuración necesaria)
    $serverName = "localhost";
    $connectionOptions = array(
        "Database" => "proyectoPOO",
        "Uid" => "sa",
        "PWD" => "12345678"
    );

    $conn = sqlsrv_connect($serverName, $connectionOptions);

    // Verificar la conexión
    if (!$conn) {
        die("La conexión falló: " . print_r(sqlsrv_errors(), true));
    }

    // Consulta para INSERT a la tabla
    $sql = "INSERT INTO Productos (codigo, nombre, done) VALUES (?, ?, ?)";
    $params = array($codigo, $nombre, $hechos);

    $stmt = sqlsrv_query($conn, $sql, $params);

    if ($stmt === false) {
        die(print_r(sqlsrv_errors(), true));
        echo "No se insertó!";
    } else {
        // Redirigir después de la inserción
        header("Location: index.php");
        exit(); // Terminar el script después de la redirección
    }
}
?>


