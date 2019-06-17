function menseki(r){
    return r*r*3.14;
}

document.write(menseki(5)+"cm2<br>");
document.write(menseki(7)+"cm2<br>");
document.write(menseki(10)+"cm2<br><br>");




function fee(adult,child){
    return (adult*500) + (child*200);
}

document.write("Aグループの合計金額は"+fee(2,4)+"円です。<br>");
document.write("Bグループの合計金額は"+fee(1,5)+"円です。<br>");
document.write("Cグループの合計金額は"+fee(3,7)+"円です。");

