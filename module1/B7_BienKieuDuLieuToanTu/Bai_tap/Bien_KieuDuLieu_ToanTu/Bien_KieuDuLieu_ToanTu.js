// gọi hàm chuyển đổi
function convertDegree() {
    let c =Number(document.getElementById("Celsius").value);
    let f ;
    f=(c*1.8)+32;
    alert("Fahrenheit Degree : "+ f)
}
// gọi hàm tính điểm trung bình
function count() {
    let mathGrade = Number(document.getElementById("Math").value);
    let physicsGrade = Number(document.getElementById("Physics").value);
    let chemistryGrade = Number(document.getElementById("Chemistry").value);
    let result = (mathGrade + physicsGrade + chemistryGrade)/3;
    return alert("Điểm trung bình của bạn là : " + result)
}
//gọi hàm tính bán kính hình tròn
function circleArea() {
    let r = Number(document.getElementById("radius").value)
    let circleArea = r * r * Math.PI;
    alert("Diện tích của hình tròn là : "+circleArea)
}
function circleDiameter() {
    let r = Number(document.getElementById("radius").value)
    let circleDiameter = 2 * r* Math.PI;
    alert("Chu vi của hình tròn là : "+circleDiameter)
}