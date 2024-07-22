CREATE DATABASE DA1_N6
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
	TenNV nvarchar(50) not null,
	NgaySinh Date not null,
	GioiTinh int not null,
	SoDienThoai varchar(50) not null,
	Email varchar(50) not null,
	DiaChi nvarchar(250)not null,
	Luong float null,
	ThoiGianLamViec nvarchar(50) null,
	ChucVu nvarchar(50) not null,
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
values('TK01',N'adim','123456',N'Quản Lý'),
('TK02',N'NhanVien1','123456',N'Nhân Viên'),
('TK03',N'NhanVien2','123456',N'Nhân Viên'),
('TK04',N'NhanVien3','123456',N'Nhân Viên'),
('TK05',N'NhanVien4','123456',N'Nhân Viên')

select * from TAIKHOAN

--Thêm Dữ Liệu bảng Nhân Viên
insert into NHANVIEN(MANV,TenNV,NgaySinh,GioiTinh,SoDienThoai,Email,DiaChi,Luong,ThoiGianLamViec,ChucVu)
values('NV01',N'Trần Văn An','7-15-1989','1','0356518431','TranAn1989@gmail.com',N'Nam Định','15000000',N'Ca Sáng',N'Quản Lý'),
('NV02',N'Nguyễn Thị Bưởi','3-6-1991','0','0355967720','NguyenBuoi1991@gmail.com',N'Hà Nội','9000000',N'Ca Sáng',N'Nhân Viên Thu Ngân'),
('NV03',N'Kim Văn Phú','6-21-1992','1','0388805168','KimPhu1992@gmail.com',N'Hà Nội','9000000',N'Ca Sáng',N'Nhân Viên Đặt Phòng'),
('NV04',N'Trần Văn Đạt','1-17-1990','1','0359788631','TranDat1990@gmail.com',N'Hải Dương','9000000',N'Ca Chiều',N'Nhân Viên Đặt Phòng'),
('NV05',N'Hoàng Thị Hoài','6-6-1995','0','039312449','HoangHoai1995@gmail.com',N'Phú Thọ','9000000',N'Ca Tối',N'Nhân Viên Lễ Tân')

select *from NHANVIEN

--Thêm Dữ liệu bảng Khách Hàng
insert into KHACHHANG(MAKH,TenKhachHang,GioiTinh,NgaySinh,CCCD,SoDienThoai,Email,DiaChi)
values('KH01',N'Trần Văn Thuấn',1,'6-21-2001','036205011855','0354233242','Thuan2106@gmail.com',N'Nam Định'),
('KH02',N'Phạm Khánh Uyên',0,'7-17-2004','03647890872','0358776423','Uyen2004@gmail.com',N'Hà Nội'),
('KH03',N'Trần Tiến Đạt',1,'8-3-1990','03620789543','0354238765','TienDat1990@gmail.com',N'Cao Bằng'),
('KH04',N'Nguyễn Phương Mai',0,'7-7-1999','03646475775','0354888654','PhuongMai1999@gmail.com',N'Phú Thọ'),
('KH05',N'Hoàng văn Nhật',1,'5-3-2001','036206736648','0378886542','HoangNhat2001@gmail.com',N'Nam Định')

select * from KHACHHANG
<<<<<<< HEAD

--Thêm Dữ liệu bảng loại phòng

=======
>>>>>>> 3326a02803e37b370d3d51367858f9d74ca3b0e6
insert into LOAIPHONG(MALP,TenLoaiPhong,LoaiPhong,Gia,MoTa)
values('P01',N'Phòng 001',N'Phòng Thường','1000000',N'Thường'),
('P02',N'Phòng 002',N'Phòng Thường','1000000',N'Thường'),
('P03',N'Phòng 003',N'Phòng Thường','1000000',N'Thường'),
('P04',N'Phòng 004',N'Phòng VIP','1850000',N'VIP'),
('P05',N'Phòng 005',N'Phòng VIP','1850000',N'VIP')

select * from LOAIPHONG

--Thêm dữ liệu bảng Dịch Vụ
insert into DICHVU(MADV,TenDichVu,Gia,MoTa,LoaiDichVu)
values('DV01',N'Dịch Vụ Dọn Phòng','40000',N'Quét dọn phòng, sắp xếp lại đồ đạc',N'DV Thường+Vip'),
('DV02',N'Dịch Vụ Giặt Là','30000',N'Giặt Quần áo',N'DV Thường+Vip'),
('DV03',N'Dịch Vụ Ăn Uống','70000',N'Món Ăn Tự Chọn ở Quầy',N'DV Thường+Vip'),
('DV04',N'Dịch Vụ Quầy Bar','20000000',N'Tổ Chức Tiệc Đêm',N'DV VIP'),
('DV05',N'Dịch Vụ Xe Đưa Đón','50000',N'Đưa đón khách bằng xe khách sạn',N'DV Thường+Vip'),
('DV_ComBo1',N'Dịch Vụ Dọn Phòng+Giặt Là+Ăn Uống','140000',N'Dọn Phòng+Phục Vụ Ăn Uống',N'DV Thường+Vip')

select *from DICHVU

--Thêm dữ liệu bảng phòng
insert into PHONG(MA_P,MALP,MADV,Gia,LoaiDichVu,TinhTrang,Tang)
values('MP01','P01','DV01','1000000',N'Thường',N'Trống',1),
('MP02','P02','DV01','1000000',N'Thường',N'Trống',1),
('MP03','P03','DV01','1000000',N'Thường',N'Trống',1),
('MP04','P04','DV_ComBo1','1850000',N'Vip',N'Trống',2),
('MP05','P05','DV_ComBo1','1850000',N'Vip',N'Trống',3)

update PHONG 
set TinhTrang = N'Đang Sử Dụng'
where MA_P = 'MP01'

update PHONG 
set TinhTrang = N'Đang Sử Dụng'
where MA_P = 'MP02'

update PHONG 
set TinhTrang = N'Đang Sử Dụng'
where MA_P = 'MP03'

update PHONG 
set TinhTrang = N'Đang Sử Dụng'
where MA_P = 'MP04'

update PHONG 
set TinhTrang = N'Đang Sử Dụng'
where MA_P = 'MP05'

select * from PHONG

--Thêm DL bảng Đặt Dịch Vụ
insert into DATDICHVU(MA_DDV,MA_P,MADV,TenDichVu,LoaiDichVu,SoLuong,Gia,NgayDat,TongTien)
values('DDV01','MP01','DV05',N'Dịch Vụ Xe Đưa Đón',N'DV Thường',2,'50000','7-15-2024','100000'),
('DDV02','MP02','DV05',N'Dịch Vụ Xe Đưa Đón',N'DV Thường',2,'50000','7-16-2024','100000'),
('DDV03','MP03','DV03',N'Dịch Vụ Ăn Uống',N'DV Thường',3,'70000','7-16-2024','210000'),
('DDV04','MP04','DV02',N'Dịch Vụ Giặt Là',N'DV Thường',4,'30000','7-17-2024','120000'),
('DDV05','MP05','DV04',N'Dịch Vụ Quầy Bar',N'DV VIP',1,'2000000','7-18-2024','20000000')

select * from DATDICHVU

--Thêm dữ liệu bảng Khuyến Mãi
insert into KHUYENMAI(MAKM,TenKhuyenMai,LoaiKhuyenMai,PhanTramGiamGia,NgayBatDau,NgayKetThuc,Mota)
values('KM01', N'Giảm giá mùa hè', N'Giảm giá theo phần trăm', 10, '2024-06-01', '2024-08-31', N'Giảm 10% cho tất cả các dịch vụ'),
('KM02', N'Giảm giá mùa đông', N'Giảm giá theo phần trăm', 15, '2024-12-01', '2024-02-28', N'Giảm 15% cho tất cả các dịch vụ'),
('KM03', N'Giảm giá lễ hội', N'Giảm giá theo phần trăm', 20, '2024-11-01', '2024-12-31', N'Giảm 20% cho các dịch vụ trong mùa lễ hội'),
('KM04', N'Giảm giá đặc biệt', N'Giảm giá theo phần trăm', 25, '2024-07-01', '2024-07-31', N'Giảm 25% cho dịch vụ đặc biệt'),
('KM05', N'Giảm giá cho thành viên', N'Giảm giá theo phần trăm', 30, '2024-01-01', '2024-12-31', N'Giảm 30% cho thành viên')
--NgayBatDau='12-01-2024',NgayBatDau = '11-01-2024',NgayBatDau= '07-01-2024',NgayBatDau='01-02-2024'
update KHUYENMAI
set NgayBatDau = '06-01-2024',NgayKetThuc = '08-31-2024'
where MAKM = 'KM01'

update KHUYENMAI
<<<<<<< HEAD
set NgayBatDau = '12-01-2024',NgayKetThuc = '02-28-2025'
=======
set NgayBatDau = '12-01-2024',NgayKetThuc = '02-28-2024'
>>>>>>> 3326a02803e37b370d3d51367858f9d74ca3b0e6
where MAKM = 'KM02'

update KHUYENMAI
set NgayBatDau = '11-01-2024',NgayKetThuc = '12-31-2024'
where MAKM = 'KM03'

update KHUYENMAI
set NgayBatDau = '07-01-2024',NgayKetThuc = '07-31-2024'
where MAKM = 'KM04'

update KHUYENMAI
set NgayBatDau = '01-02-2024',NgayKetThuc = '12-31-2024'
where MAKM = 'KM05'

select * from KHUYENMAI

--Thêm Dữ liệu vào Bảng hóa đơn
select * from NHANVIEN
select * from KHACHHANG
select * from DATDICHVU
select * from PHONG
insert into HOADON(MAHD,MAKH,MANV,SoDienThoai,DiaChi,SoPhongDat,TrangThai,NgayXuatDon,NgayThanhToan,Thue,TienCoc,TongTien)
values('HD01','KH01','NV02','0354233242',N'Nam Định',1,N'Đã Thanh Toán','07-20-2024','07-20-2024',0,'100000','1100000'),
('HD02','KH02','NV02','0358776423',N'Hà Nội',1,N'Đã Thanh Toán','07-19-2024','07-19-2024',0,'100000','1100000'),
('HD03','KH03','NV02','0354238765',N'Cao Bằng',1,N'Đã Thanh Toán','07-21-2024','07-21-2024',0,'100000','1210000'),
('HD04','KH04','NV02','0354888654',N'Phú Thọ',1,N'Đã Thanh Toán','07-22-2024','07-22-2024',0,'100000','1120000'),
('HD05','KH05','NV02','0378886542',N'Nam Định',1,N'Đã Thanh Toán','07-22-2024','07-22-2024',0,'5000000','21000000')

select * from HOADON

--Thêm Dữ liệu Hóa Đơn Chi Tiết
select * from NHANVIEN
select * from KHACHHANG
select * from DATDICHVU
select * from PHONG
insert into HOADONCHITIET(MA_HDCT,MAKM,MAHD,MA_DDV,MA_P,CheckIn,CheckOut,GiaBanDau,GiaSauKhuyenMai,TongGiaDichVu,TongTienPhong,NgayThanhToan)
values('HDCT01','KM01','HD01','DDV01','MP01','07-19-2024 14:00:00','07-20-2024 14:00:00','1200000','1100000','100000','1100000','07-20-2024'),
('HDCT02','KM01','HD02','DDV01','MP02','07-18-2024 14:00:00','07-19-2024 14:00:00','1200000','1100000','100000','1100000','07-19-2024'),
('HDCT03','KM01','HD03','DDV03','MP03','07-20-2024 14:00:00','07-21-2024 14:00:00','1200000','1100000','210000','1100000','07-21-2024'),
('HDCT04','KM01','HD04','DDV04','MP04','07-21-2024 14:00:00','07-22-2024 14:00:00','1200000','1100000','120000','1100000','07-22-2024'),
('HDCT05','KM01','HD05','DDV05','MP05','07-21-2024 14:00:00','07-22-2024 14:00:00','22000000','21000000','100000','21000000','07-22-2024')
select * from HOADONCHITIET
<<<<<<< HEAD
=======
-- xóa cột loại khuyến mại trong bảng khuyến mại
ALTER TABLE KHUYENMAI
DROP COLUMN LOAIKHUYENMAI
>>>>>>> 3326a02803e37b370d3d51367858f9d74ca3b0e6
ALTER TABLE HOADON ALTER COLUMN NgayThanhToan date NULL;
ALTER TABLE HOADONCHITIET ALTER COLUMN NgayThanhToan date NULL;
ALTER TABLE HOADONCHITIET ALTER COLUMN MA_DDV VARCHAR(50) NULL;