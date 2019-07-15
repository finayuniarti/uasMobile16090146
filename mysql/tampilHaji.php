<?php 

	$id = $_GET['id'];
	require_once('koneksi.php');
	$sql = "SELECT * FROM haji WHERE id=$id";
	$r = mysqli_query($con,$sql);
	$result = array();
	$row = mysqli_fetch_array($r);
	array_push($result,array(
		"id"=>$row['id'],
		"nama"=>$row['nama'],
		"nomor"=>$row['nomor'],
        "alamat"=>$row['alamat'],
        "jk"=>$row['jk']
		));
	echo json_encode(array('result'=>$result));
	
	mysqli_close($con);
?>
 