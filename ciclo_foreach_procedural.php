<?php
    $meses=['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo','Junio', 'Julio','Agosto', 'Septiembre','Octubre', 'Noviembre','Diciembre'];

    if($_SERVER['REQUEST_METHOD']=='POST'){ 
        
        if(isset($_POST['asc'])){
            sort($meses);
        }else  if(isset($_POST['des'])){
            rsort($meses);
        }
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Foreach</title>
    <style>
    .caja{
        width:40%;
        
    }
    .caja2 ul li{
        list-style: none;
    }
    </style>
</head>
<body>

<div class="caja">
<form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>" method="POST">
    <label for="asc">Ascendente</label>
    <input type="radio" name="asc" id="asc" value="asc">
    <label for="des">Descendente</label>
    <input type="radio" name="des" id="des" value="des">
    <input type="submit" value="Enviar">
</form>
    <h2>Ciclo Foreach</h2>
    <div class="caja2">
    
    <ul>
         <?php
            foreach($meses as $mes){
                echo '<li>'.$mes.'</li>';
            }
        ?>
    </ul> 
    </div>
    </div>
</body>
</html>
