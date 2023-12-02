<?php
// Verificar si se ha enviado el formulario
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Obtener los datos del formulario
    $id = $_POST['ID'];
    $codigo = $_POST['CODIGO'];
    $nombre = $_POST['NOMBRE'];
    $hechos = $_POST['DONE'];

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

    // Consulta para UPDATE en la tabla
    $sql = "UPDATE Productos SET codigo=?, nombre=?, done=? WHERE id=?";
    $params = array($codigo, $nombre, $hechos, $id);

    $stmt = sqlsrv_query($conn, $sql, $params);

    if ($stmt === false) {
        die(print_r(sqlsrv_errors(), true));
        echo "No se actualizó!";
    } else {
        // Redirigir después de la actualización
        header("Location: index.php");
        exit(); // Terminar el script después de la redirección
    }
}
?>
