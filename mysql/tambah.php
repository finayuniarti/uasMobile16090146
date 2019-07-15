<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
    $nama = $_POST['nama'];
    $nomor = $_POST['nomor'];
    $alamat = $_POST['alamat'];
    $jk = $_POST['jk']

    $sql = "INSERT INTO haji (nama,nomor,alamat,jk) VALUES ('$nama','$nomor','$alamat','$jk')";
    
    require_once('koneksi.php');
    
    if(mysqli_query($con,$sql)){
    echo 'Berhasil Menambahkan Daftar Haji';
    }else{
    echo 'Gagal Menambahkan Daftar Haji';
    }
    
    mysqli_close($con);
}
?>