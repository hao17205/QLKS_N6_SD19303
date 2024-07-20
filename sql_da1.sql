
﻿CREATE DATABASE DA1_N6
GO
USE DA1_N6
CREATE TABLE TAIKHOAN(
	MATK varchar(50) primary key,
	TenDangNhap nvarchar(50) not null,
	MatKhau varchar(50) not null,
	ChucVu nvarchar(50) not null
)
CREATE TABLE NHANVIEN(
	MANV varchar(50) primary key,
	MATK varchar(50) not null,
	TenNV nvarchar(50) not null,
	NgaySinh Date not null,
	GioiTinh int not null,
	SoDienThoai varchar(50) not null,
	Email varchar(50) not null,
	DiaChi nvarchar(250) not null,
	Luong float not null,
	ThoiGianLamViec nvarchar(50) not null,
	ChucVu nvarchar(50) not null,
	foreign key(MATK) references TAIKHOAN(MATK)
)
CREATE TABLE KHACHHANG(
	MAKH varchar(50) primary key,
	TenKhachHang nvarchar(50) not null,
	GioiTinh int not null,
	NgaySinh Date not null,
	CCCD varchar(50) not null,
	SoDienThoai varchar(50) not null,
	Email varchar(50) not null,
	DiaChi nvarchar(250)
)
CREATE TABLE LOAIPHONG(
	MALP varchar(50) primary key,
	TenLoaiPhong nvarchar(50) not null,
	LoaiPhong nvarchar(50) not null,
	Gia float not null,
	MoTa nvarchar(500)
)
CREATE TABLE DICHVU(
	MADV varchar(50) primary key,
	TenDichVu nvarchar(250) not null,
	Gia float not null,
	MoTa nvarchar(500),
	LoaiDichVu nvarchar(300)
)
CREATE TABLE PHONG(
	MA_P varchar(50) primary key,
	MALP varchar(50) not null,
	MADV varchar(50) not null,
	Gia float not null,
	LoaiDichVu nvarchar(300),
	TinhTrang nvarchar(50),
	Tang int,
	foreign key(MALP) references LOAIPHONG(MALP),
	foreign key(MADV) references DICHVU(MADV)
)
CREATE TABLE DATDICHVU(
	MA_DDV varchar(50) primary key,
	MA_P varchar(50) not null,
	MADV varchar(50) not null,
	TenDichVu nvarchar(300) not null,
	LoaiDichVu nvarchar(300) not null,
	SoLuong int not null,
	Gia float not null,
	NgayDat Date not null,
	TongTien float not null,
	foreign key(MA_P) references PHONG(MA_P),
	foreign key(MADV) references DICHVU(MADV)
)
CREATE TABLE KHUYENMAI(
	MAKM varchar(50) primary key,
	TenKhuyenMai nvarchar(250) not null,
	LoaiKhuyenMai nvarchar(25) not null,
	PhanTramGiamGia float not null,
	NgayBatDau Date not null,
	NgayKetThuc Date not null,
	Mota nvarchar(500)
)
CREATE TABLE HOADON(
	MAHD varchar(50) primary key,
	MAKH varchar(50) not null,
	MANV varchar(50) not null,
	SoDienThoai varchar(50) not null,
	DiaChi nvarchar(500) not null,
	SoPhongDat int not null,
	TrangThai nvarchar(50) not null,
	NgayXuatDon Date not null,
	NgayThanhToan Date not null,
	Thue float not null,
	TienCoc float not null,
	TongTien float not null,
	foreign key(MAKH) references KHACHHANG(MAKH),
	foreign key(MANV) references NHANVIEN(MANV)
)
CREATE TABLE HOADONCHITIET(
	MA_HDCT varchar(50) primary key,
	MAKM varchar(50) not null,
	MAHD varchar(50) not null,
	MA_DDV varchar(50) not null,
	MA_P varchar(50) not null,
	CheckIn DateTime not null,
	CheckOut DateTime not null,
	GiaBanDau float not null,
	GiaSauKhuyenMai float not null,
	TongGiaDichVu float not null,
	TongTienPhong float not null,
	NgayThanhToan Date not null,
	foreign key(MAKM) references KHUYENMAI(MAKM),
	foreign key(MAHD) references HOADON(MAHD),
	foreign key(MA_DDV) references DATDICHVU(MA_DDV),
	foreign key(MA_P) references PHONG(MA_P)
)

--Thêm DL Bảng Tài Khoản
insert into TAIKHOAN(MATK,TenDangNhap,MatKhau,ChucVu)
values('TK01',N'Tran_Van_An','11111',N'Quản Lý'),
('TK02',N'Nguyen_Thi_Buoi','11112',N'Nhân Viên'),
('TK03',N'Kim_Van_Phu','11113',N'Nhân Viên'),
('TK04',N'Tran_Van_Dat','11114',N'Nhân Viên'),
('TK05',N'Hoang_Thi_Hoai','11115',N'Nhân Viên')

select * from TAIKHOAN

--Thêm Dữ Liệu bảng Nhân Viên
insert into NHANVIEN(MANV,MATK,TenNV,NgaySinh,GioiTinh,SoDienThoai,Email,DiaChi,Luong,ThoiGianLamViec,ChucVu)
values('NV01','TK01',N'Trần Văn An','7-15-1989','1','0356518431','TranAn1989@gmail.com',N'Nam Định','15000000',N'Ca Sáng',N'Quản Lý'),
('NV02','TK02',N'Nguyễn Thị Bưởi','3-6-1991','0','0355967720','NguyenBuoi1991@gmail.com',N'Hà Nội','9000000',N'Ca Sáng',N'Nhân Viên Thu Ngân'),
('NV03','TK03',N'Kim Văn Phú','6-21-1992','1','0388805168','KimPhu1992@gmail.com',N'Hà Nội','9000000',N'Ca Sáng',N'Nhân Viên Đặt Phòng'),
('NV04','TK04',N'Trần Văn Đạt','1-17-1990','1','0359788631','TranDat1990@gmail.com',N'Hải Dương','9000000',N'Ca Chiều',N'Nhân Viên Đặt Phòng'),
('NV05','TK05',N'Hoàng Thị Hoài','6-6-1995','0','039312449','HoangHoai1995@gmail.com',N'Phú Thọ','9000000',N'Ca Tối',N'Nhân Viên Lễ Tân')

select *from NHANVIEN

--Thêm Dữ liệu bảng Khách Hàng
insert into KHACHHANG(MAKH,TenKhachHang,GioiTinh,NgaySinh,CCCD,SoDienThoai,Email,DiaChi)
values('KH01',N'Trần Văn Thuấn',1,'6-21-2001','036205011855','0354233242','Thuan2106@gmail.com',N'Nam Định'),
('KH02',N'Phạm Khánh Uyên',0,'7-17-2004','03647890872','0358776423','Uyen2004@gmail.com',N'Hà Nội'),
('KH03',N'Trần Tiến Đạt',1,'8-3-1990','03620789543','0354238765','TienDat1990@gmail.com',N'Cao Bằng'),
('KH04',N'Nguyễn Phương Mai',0,'7-7-1999','03646475775','0354888654','PhuongMai1999@gmail.com',N'Phú Thọ'),
('KH05',N'Hoàng văn Nhật',1,'5-3-2001','036206736648','0378886542','HoangNhat2001@gmail.com',N'Nam Định')

select * from KHACHHANG
