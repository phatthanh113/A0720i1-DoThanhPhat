create database furama_resort;
use furama_resort;
create table Vitri(
IDViTri int not null auto_increment,
TenViTri varchar(45) not null unique,
constraint ViTri_pk primary key (IDViTri)
);
create table TrinhDo(
IDTrinhDo int not null auto_increment,
TrinhDo varchar(45) not null unique,
constraint TrinhDo_pk primary key (IDTrinhDo)
);
create table BoPhan(
IDBoPhan int not null auto_increment,
TenBoPhan varchar(45) not null unique,
constraint BoPhan_pk primary key (IDBoPhan)
);
create table LoaiKhach(
IDLoaiKhach int not null auto_increment,
TenLoaiKhach varchar(45) not null unique,
constraint LoaiKhach_pk primary key (IDLoaiKhach)
);

create table KieuThue(
IDKieuThue int not null auto_increment,
TenKieuThue varchar(45) not null unique,
constraint KieuThue_pk primary key (IDKieuThue)
);
create table LoaiDichVu(
IDLoaiDichVu int not null auto_increment,
TenLoaiDichVu varchar(45) not null unique,
constraint LoaiDichVu_pk primary key (IDLoaiDichVu)
);
create table DichVuDiKem(
IDDichVuDiKem int not null auto_increment,
TenDichVuDiKem varchar(45) not null unique,
Gia int not null,
DonVi varchar(45) not null,
TrangThaiKhaDung varchar(45) not null,
constraint DichVuDiKem_pk primary key (IDDichVuDiKem)
);
create table NhanVien(
IDNhanVien int not null auto_increment,
HoTen varchar(45) not null,
IDViTri int not null,
IDTrinhDo int not null,
IDBoPhan int not null,
NgaySinh date not null,
SoCMND  varchar(45) not null unique,
Luong int not null,
SDT varchar(45) not null,
Email varchar(45) not null,
DiaChi varchar(45) not null,
constraint NhanVien_pk primary key (IDNhanVien),
foreign key (IDViTri) references ViTri(IDViTri),
foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo),
foreign key (IDBoPhan) references BoPhan(IDBoPhan)
);
create table KhachHang(
IDKhachHang int not null auto_increment,
IDLoaiKhach int not null,
HoTen varchar(45) not null,
NgaySinh date not null,
SoCMND varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) not null unique,
DiaChi varchar(45) not null,
constraint KhachHang_pk primary key (IDKhachHang),
foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);
create table DichVu(
IDDichVu int not null auto_increment,
TenDichVu varchar(45) not null unique,
DienTich int not null,
SoTang int not null,
SoNguoiToiDa int not null,
ChiPhiThue int not null,
IDKieuThue int not null,
IDLoaiDichVu int not null,
TrangThai varchar(45),
constraint DichVu_pk primary key (IDDichVu),
foreign key (IDKieuThue) references KieuThue(IDKieuThue),
foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);
create table HopDong(
IDHopDong int not null auto_increment,
IDNhanVien int not null,
IDKhachHang int not null,
IDDichVu int not null,
NgayLamHopDong date not null,
NgayKetThuc date not null,
TienDatCoc int not null,
TongTien int not null,
constraint HopDong_pk primary key (IDHopDong),
foreign key (IDNhanVien) references NhanVien(IDNhanVien),
foreign key (IDKhachHang) references KhachHang(IDKhachHang),
foreign key (IDDichVu) references DichVu(IDDichVu)
);
create table HopDongChiTiet(
IDHopDongChiTiet int not null auto_increment,
IDHopDong int not null,
IDDichVuDiKem int not null,
SoLuong int not null,
constraint HopDongChiTiet_pk primary key (IDHopDongChiTiet),
foreign key (IDHopDong) references HopDong(IDHopDong),
foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự --  
select *, substring_index(HoTen, ' ', -1) as TenNV from Nhanvien 
having (TenNV like 'h%' or TenNV like 't%' or TenNV like 'k%') and length(HoTen) <= 15;

-- 3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.--  
select *, year(curdate()) - year(NgaySinh) as Tuoi from KhachHang
having (DiaChi = 'Da Nang' or DiaChi = 'Quang Tri') and Tuoi > 18;
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị 
-- được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”. --
-- yeu cau 4 Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của
-- khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select khachhang.*, count(hopdong.idkhachhang) from ((khachhang 
inner join hopdong on khachhang.idkhachhang = hopdong.idkhachhang)
inner join loaikhach on loaikhach.idloaikhach = khachhang.idloaikhach)
where khachhang.idloaikhach = 1
group by idkhachhang;

-- yeu cau 5
-- Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong,TenDichVu, NgayLamHopDong, NgayKetThuc, 
-- TongTien (VớiTongTien được tính theo công thức như sau: ChiPhiThue +
-- SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả
-- các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng
-- đặt phòng cũng phải hiển thị ra).

SELECT khachHang.IDKhachHang, khachHang.HoTen, loaiKhach.TenLoaiKhach, hopDong.IDHopDong,
dichVu.TenDichVu, hopDong.NgayLamHopDong, hopDong.NgayKetThuc, dichVu.chiphithue + (hopDongChiTiet.soLuong * dichvudikem.gia) as tongTien 
from khachHang
left join hopdong on khachHang.idKhachHang = hopdong.idKhachHang
left join loaiKhach on khachHang.idLoaiKhach = loaiKhach.idLoaiKhach
left join dichVu on dichvu.iddichvu = hopdong.iddichvu
left join hopDongChiTiet on hopdong.idhopdong = hopDongChiTiet.idHopDong
left join dichVuDiKem on hopDongChiTiet.idDichVuDiKem = dichVuDiKem.idDichVuDiKem;

-- yeu cau 6: Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue,
-- TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng
-- thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
-- SELECT dichVu.IDDichVu, dichVu.TenDichVu, dichVu.DienTich, dichVu.ChiPhiThue, loaidichvu.idLoaiDichVu, hopDong.ngayLamHopDong
-- from dichVu
-- left join loaidichvu on dichvu.idLoaiDichVu = loaiDichVu.idLoaiDichVu
-- left join hopdong on dichVu.idDichVu = hopDong.idDichVu
-- where not (month(hopDong.ngayLamHopDong) in (01,02,03) and year(hopDong.ngayLamHopDong) = 2019) or hopDong.ngayLamHopDong is null
-- group by dichVu.idDichVu;

select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu, HopDongQuyMot.NgayLamHopDong
from DichVu left join ( select * from HopDong where NgayLamHopDong between '2019-01-01' and '2019-03-31') as HopDongQuyMot 
on DichVu.IDDichVu = HopDongQuyMot.IDDichVu 
left join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
group by DichVu.IDDichVu
having HopDongQuyMot.NgayLamHopDong is null;

-- 7....Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa,
-- ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được
-- Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách
-- hàng đặt phòng trong năm 2019.hopdong
select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, Dichvu.SoNguoiToiDa, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu
from DichVu 
inner join (select * from HopDong where year(NgayLamHopDong) = 2018) as HopDong2018 on DichVu.IDDichVu = HopDong2018.IDDichVu
left join (select * from HopDong where year(NgayLamHopDong) = 2019) as HopDong2019 on DichVu.IDDichVu = HopDong2019.IDDichVu
left join LoaiDichVu on LoaiDichVu.IDLoaiDichVu = DichVu.IDLoaiDichVu
where HopDong2019.IDDichVu is null
group by DichVu.IDDichVu;

-- yeu cau 8 Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau. 
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select distinct HoTen from KhachHang; -- distinct để loại bỏ các bản ghi trùng lặp
select HoTen from KhachHang group by HoTen;

-- 9. Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hopDong.ngayLamHopDong) as thang, count(idHopDong) as soLuong, sum(tongTien) 
from hopDong 
where year(ngayLamHopDong) = 2019
group by month(hopDong.ngayLamHopDong) ;

-- 10. Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong,
-- NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hopDong.idHopDong, hopDong.ngayLamHopDong, hopDong.ngayKetThuc, hopDong.tienDatCoc,
 count(hopDongChiTiet.idHopDongChiTiet) as SoLuongDichVuDiKem
 from hopDong
 left join hopDongChiTiet on hopDong.idHopdong = hopDongChiTiet.idHopDong
 group by hopDong.idHopDong;
 
--  11. Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh”
-- hoặc “Quảng Ngãi”.
select dichVuDiKem.* from dichVuDiKem
inner join hopDongChiTiet on dichVuDiKem.idDichVuDiKem = hopDongChiTiet.idDichVuDiKem
inner join hopDong on hopDongChiTiet.idHopDong = hopDong.idHopDong
inner join khachHang on hopDong.idKhachHang = khachHang.idKhachHang
inner join loaiKhach on loaiKhach.idLoaiKhach = khachhang.idLoaiKhach
where loaiKhach.tenLoaiKhach = 'Diamond' and (khachHang.diaChi = 'Vinh' or khachHang.diaChi = 'Quang Ngai');

-- 12. Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên 
-- tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa
-- từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hopDongChiTiet.idHopDong, nhanVien.hoTen as tenNhanVien, khachHang.hoTen as tenKhachHang, khachHang.sdt, dichVu.tenDichVu,
 count(hopDongChiTiet.soLuong) as soLuongDichVuDiKEm, hopDong.tienDatCoc, hopDong.ngayLamHopDong
from dichVu
inner join HopDong on hopDong.idDichVu = dichVu.idDichVu
inner join khachHang on khachHang.idKhachHang = hopDong.idKhachHang
inner join nhanVien on nhanVien.idNhanVien = hopDong.idNhanVien
inner join hopDongChiTiet on hopDong.idHopDong = hopDongChiTiet.idHopDong
where (hopDong.ngayLamHopDong between '2019-10-01' and '2019-12-31' and year(hopDong.ngayLamHopDong) = 2019)
and (hopDong.idDichVu not in (select hopDong.idDichVu from hopDong where hopDong.ngayLamHopDong between '2019-01-01' and '2019-06-30'))
group by hopDongChiTiet.idHopDong;

-- 13. Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dichVuDiKem.*, count(hopDongChiTiet.idDichVuDiKEm) as soLandat from dichVuDikem
left join hopDongChiTiet on hopDongChiTiet.idDichVuDiKem = dichVuDikem.idDichVuDiKem
group by dichVuDikem.idDichVuDiKem
order by soLanDat desc ;

-- 14. Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu,
-- TenDichVuDiKem, SoLanSuDung.

select hopDongChiTiet.idHopDong, dichVu.tenDichVu, dichVuDiKem.tenDichVuDiKem, count(hopDongChiTiet.idDichVuDiKEm) as soLanSuDung
from hopDongChiTiet
inner join hopDong on hopDong.idHopDong = hopDongChiTiet.idHopDong
inner join dichVu on hopDong.idDichVu = dichVu.idDichVu
inner join dichVuDiKem on hopDongChiTiet.idDichVuDiKem = dichVuDiKem.idDichVuDiKem
group by dichVuDiKem.tenDichVuDiKem
having soLanSuDung = 1;

-- 15. Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3
-- hợp đồng từ năm 2018 đến 2019.
select nhanVien.*, trinhDo.TrinhDo, boPhan.tenBoPhan, count(soHopDong.idNhanVien)
from nhanVien
left join (select hopDong.idNhanVien from hopDong where year(hopDong.ngayLamHopDong) in (2018,2019)) as soHopDong 
on nhanVien.idNhanVien = soHopDong.idNhanVien
left join trinhDo on nhanVien.idTrinhDo = trinhDo.idTrinhDo
left join boPhan on nhanVien.idBoPhan = boPhan.idBoPhan
group by nhanVien.idNhanVien
having count(soHopDong.idNhanVien) <= 3;

-- 16. Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.     *******chua fix dc*******
delete nhanvien from nhanVien 
left join (select hopDong.idNhanVien from hopDong where year(hopDong.ngayLamHopDong) in (2017,2018,2019)) as soHopDong 
on nhanVien.idNhanVien = soHopDong.idNhanVien
where nhanVien.idNhanVien is not null and soHopDong.idNhanVien is null;

-- 17. Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt    **************
-- phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
create or replace view khachHangDatNhieu as
select khachHang.* from khachHang
inner join hopDong on khachHang.idKhachHang = hopDong.idKhachHang
group by hopDong.idKhachHang
having sum(hopDong.TongTien) > 1000000;

update khachHangDatNhieu
set khachHangDatNhieu.idLoaiKhach = 1
where khachHangDatNhieu.idLoaiKhach = 2;

update khachHang,
(select khachHang.*, hopDong.ngayLamHopDong from khachHang
inner join hopDong on khachHang.idKhachHang = hopDong.idKhachHang
group by hopDong.idKhachHang
having sum(hopDong.TongTien) > 1000000 and year(hopDong.ngayLamHopDong) = 2019) as khachHangDatNhieu
set khachHangDatNhieu.idLoaiKhach = 1
where khachHangDatNhieu.idloaiKhach = 2;

select * from khachHangDatNhieu;


-- 18. Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).

-- 19. Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trongnăm 2019 lên gấp đôi.

-- 20. Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang),
-- HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select concat('NV - ',IDNhanVien), hoten, email, sdt, ngaysinh, DiaChi from nhanvien 
union all
select concat('KH - ',IDKhachHang), hoten, email, sdt, ngaysinh, DiaChi from khachhang;

-- 21. Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” và đã từng lập hợp đồng cho 1
-- hoặc nhiều Khách hàng bất kỳ với ngày lập hợp đồng là “12/12/2019”
create or replace view V_NHANVIEN as
select nhanVien.* from nhanVien
inner join hopDong on nhanVien.idNhanVien = hopDong.idNhanVien
where nhanVien.diaChi = 'Hai Chau' and hopdong.ngayLamHopDong = '2019-12-12' group by nhanVien.idNhanVien ;
select * from V_NHANVIEN;

-- 22. Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.
update V_NHANVIEN
set V_NHANVIEN.diaChi = 'Lien Chieu';