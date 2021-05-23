<?php
include 'conexionAndroid.php';
//echo "conectado";
        // CREAMOS LA CONSULTA
            $sql = "select * from lotes";				
			$result = $pdo ->prepare($sql);
			$result->execute();
			$resultado = $result->fetchAll(PDO::FETCH_ASSOC);
			//var_dump($resultado);
			echo json_encode($resultado,JSON_UNESCAPED_UNICODE);

			
?>

?>

