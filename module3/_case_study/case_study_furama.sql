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