let options = document.getElementById('options');
function calculate() {
    switch (options.value) {
        case '1' : {
            calculate1();
            break;
        }
        case '2' : {
            calculate2();
            break;
        }
        case '3' : {
            calculate3();
            break;
        }
        case '4' : {
            calculate4()
            break;
        }
        case '5' : {
            calculate5();
            break;
        }
        default : {
            alert('Vui lòng nhập tên bài từ 1 đến 5')
        }
    }
}
// Tìm tổng 2 số bất kì
function calculate1() {
    let a = parseFloat(prompt('Nhập vào số đầu tiên'));
    let b = parseFloat(prompt('Nhập vào số thứ hai'));
    let sum=0;
    sum = a+b;
    alert(sum);
}
//Tính tổng các phần tử trong array
function calculate2() {
    let number =parseFloat(prompt('Nhập vào số phần tử bạn muốn có trong mảng'));
    let array=[];
    let sum=0;
    for (let i=0; i<number;i++) {
        let element= parseFloat(prompt('Nhập phần tử của mảng'));
        array.push(element);
        sum+=element;
    }
    alert(array);
    alert(sum);
}
//Trò chơi Compare the Triplets
function calculate3() {
    class Human {
        constructor(name,array,point) {
            this.name=name;
            this.array=array;
            this.point=point;
        }
        getPoint() {
            return this.point;
        }
        setArray(name) {
            for(let i=0;i<3;i++) {
                let element=parseFloat(prompt('Nhập 3 số bạn muốn thêm vào array cho '+this.name ));
                this.array.push(element);
            }
        }
        compare(human) {
            for(let i in this.array) {
                if(this.array[i]>human.array[i]) {
                    this.point++
                }
                else if(this.array[i]<human.array[i]) {
                    human.point++
                }
            }
        }
    }
    let man =new Human('Nam',[],0);
    let woman=new Human('Nu',[],0);
    man.setArray(man.name);
    woman.setArray();
    man.compare(woman);
    alert('Điểm của Nam là'+man.getPoint());
    alert('Điểm của Nữ là'+woman.getPoint());
}
//Calculate sum in array
function calculate4() {
    let number=parseFloat(prompt('Nhập số phần tử bạn muốn nhập vào'));
    let array=[];

}