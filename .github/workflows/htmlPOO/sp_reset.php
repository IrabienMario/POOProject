<?php
$reset = $_POST['reset'];

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

// Consulta para reiniciar el ID de la tabla 'Productos' al valor de $reset
$sql = "DBCC CHECKIDENT ('Productos', RESEED, $reset)";

$stmt = sqlsrv_query($conn, $sql);

if ($stmt === false) {
    header("Location: index.php");
    exit(); // Terminar el script después de la redirección
} else {
    // Redirigir después de la reinicialización
    header("Location: index.php");
    exit(); // Terminar el script después de la redirección
}

?>