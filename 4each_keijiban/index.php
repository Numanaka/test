<!DOCTYPE HTML>
<html lang="ja">

<head>
<meta charset="utf-8">
<title>4eachblog 掲示板</title>
<link rel="stylesheet" type="text/css" href="style.css">
    
</head>

    
<body>
    
    <?php
    
    mb_internal_encoding("utf8");
    
    $pdo=new PDO("mysql:dbname=numanaka;host=localhost;","root","mysql");
    
    $stmt=$pdo->query("select * from 4each_keijiban");
    
    
    ?>
    
<header>
    <img src="4eachblog_logo.jpg">
    <ul>
        <li>トップ</li>
        <li>プロフィール</li>
        <li>4eachについて</li>
        <li>登録フォーム</li>
        <li>問い合わせ</li>
        <li>その他</li>
    </ul>
    
</header>
    
</body>

<main>
<div class="main-container">
<div class="left">
    
    <h2>プログラミングに役立つ掲示板</h2>
    
   <div class="formbox">
    <h3 class="formtitle">入力フォーム</h3>
    <form method="post" action="insert.php">
    
       <div class="inner">
        ハンドルネーム<br>
        <input type="text" name="handlename" size="40" class="box">
        </div>
        
        <div class="inner">
        タイトル<br>
        <input type="text" name="title" size="40" class="box">
        </div>
        
        <div class="inner">
        コメント<br>
        <textarea name="comments" rows="7" cols="60" class="comments">
        </textarea>
            
        <div class="inner">
        <input type="submit" value="投稿する" class="button"></div>
            
        </div>
        
    </form>
   </div>
        

    
    <?php
    while ($row=$stmt->fetch()){
        
        echo "<div class='kijibox'>";
        echo "<h3 class='kijititle'>".$row['title']."</h3>";
        echo "<p class='nakami'>".$row['comments']."</p>";

        echo "<p class='posted'>posted by".$row['handlename']."</p>";
        
        echo "</div>";
        
        }
    
    
    ?>
   
</div>
    
<div class="right">
    <h3>人気の記事</h3>
        <p>PHPオススメ本</p>
        <p>PHP MyAdminの使い方</p>
        <p>いま人気のエディタTop5</p>
        <p>HTMLの基礎</p>
        <br>
    
    <h3>オススメリンク</h3>
        <p>インターノウス株式会社</p>
        <p>XAMPPのダウンロード</p>
        <p>Eclipseのダウンロード</p>
        <p>Bracketsのダウンロード</p>
        <br>
    
    <h3>カテゴリ</h3>
        <p>HTML</p>
        <p>PHP</p>
        <P>MySQL</P>
        <p>JavaScript</p>

</div>
               
</div>    
    
</main>
   
<footer>
copyright © internous | 4each blog is the one which provides A to Z about programing.
</footer>



</html>