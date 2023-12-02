<?php
$ID = $_GET['id'];

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
        die("La conexión falló: " . sqlsrv_errors());
    }

    // Consulta para DELETE a la tabla utilizando una consulta preparada
    $sql = "DELETE FROM Productos WHERE id = ?";
    $params = array($ID);

    $stmt = sqlsrv_query($conn, $sql, $params);

    if ($stmt === false) {
        die(print_r(sqlsrv_errors(), true));
        echo "No se eliminó!";
    } else {
        // Redirigir después de la eliminación
        header("Location: index.php");
        exit(); // Terminar el script después de la redirección
    }
?>
