CREATE DATABASE furamar;
USE furamar;
CREATE TABLE vi_tri_nhan_vien(
	stt_vi_tri_nhan_vien INT PRIMARY KEY AUTO_INCREMENT ,
	ten_vi_tri_nhan_vien VARCHAR(50) NOT NULL
	
);

CREATE TABLE trinh_do_nhan_vien(
	stt_trinh_do_nhan_vien INT PRIMARY KEY AUTO_INCREMENT,
	ten_trinh_do_nhan_vien VARCHAR(50) NOT NULL

);

CREATE TABLE bo_phan(
ID_bo_phan INT PRIMARY KEY AUTO_INCREMENT,
ten_bo_phan VARCHAR(50) NOT NULL

);

CREATE TABLE nhan_vien(
	ma_nhan_vien VARCHAR(15) PRIMARY KEY,
	ten_nhan_vien VARCHAR(50) NOT NULL ,
	ngay_sinh_nhan_vien DATE NOT NULL,
	so_CMND_nhan_vien INT NOT NULL UNIQUE ,
	so_dien_thoai VARCHAR(10) NOT NULL UNIQUE ,
	luong_nhan_vien FLOAT NOT NULL,
	vi_tri INT ,
	FOREIGN KEY (vi_tri) REFERENCES vi_tri_nhan_vien(stt_vi_tri_nhan_vien),
	trinh_do INT,
	FOREIGN KEY (trinh_do) REFERENCES trinh_do_nhan_vien(stt_trinh_do_nhan_vien),
	bo_phan INT,
    FOREIGN KEY (bo_phan) REFERENCES bo_phan(ID_bo_phan)
);

CREATE TABLE kieu_thue(
	stt_kieu_thue INT PRIMARY KEY AUTO_INCREMENT,
	ten_kieu_thue VARCHAR(50) NOT NULL
		
);

CREATE TABLE dich_vu_di_kem(
	ma_dich_vu_di_kem VARCHAR(50) PRIMARY KEY NOT NULL,
	ten_dich_vu_di_kem VARCHAR(50) NOT NULL,
	don_vi VARCHAR(15) NOT NULL,
	gia_tien FLOAT NOT NULL

);

CREATE TABLE tieu_chuan_phong(
stt_tieu_chuan_phong INT PRIMARY KEY AUTO_INCREMENT,
ten_tieu_chuan_phong VARCHAR(50)
);


CREATE TABLE dich_vu(
	ma_dich_vu VARCHAR (50) PRIMARY KEY NOT NULL,
	ten_dich_vu VARCHAR (50) NOT NULL,
	dien_tich_su_dung VARCHAR(50) NOT NULL,
	chi_phi_thue FLOAT NOT NULL,
	tieu_chuan_phong INT,
	mo_ta_tien_nghi TEXT NOT NULL,
	dien_tich_ho_boi VARCHAR (50),
    so_tang INT NOT NULL,
	dich_vu_mien_phi_di_kem VARCHAR(50),
	so_luong_nguoi_toi_da INT NOT NULL,
	kieu_thue INT ,
	FOREIGN KEY (kieu_thue) REFERENCES kieu_thue(stt_kieu_thue),
    FOREIGN KEY (tieu_chuan_phong) REFERENCES  tieu_chuan_phong (stt_tieu_chuan_phong)
  

);


CREATE TABLE loai_khach_hang(
	stt_loai_khach_hang INT PRIMARY KEY AUTO_INCREMENT,
	ten_loai_khach_hang VARCHAR(50) NOT NULL

);

CREATE TABLE khach_hang(
	ma_khach_hang INT PRIMARY KEY,
	ten_khach_hang VARCHAR(50) NOT NULL,
	ngay_sinh DATE NOT NULL,
	gioi_tinh VARCHAR(50) NOT NULL,
	so_CMND_khach_hang VARCHAR(50) NOT NULL UNIQUE,
	so_DT_khach_hang VARCHAR(50) NOT NULL UNIQUE,
	email_khach_hang VARCHAR(50) NOT NULL UNIQUE,
	dia_chi VARCHAR(50) NOT NULL,
	loai_khach_hang INT,
	FOREIGN KEY (loai_khach_hang) REFERENCES loai_khach_hang(stt_loai_khach_hang)

);



CREATE TABLE hop_dong_thue(
	ma_hop_dong INT PRIMARY KEY,
	ten_khach_hang INT NOT NULL,
	ten_nhan_vien VARCHAR(15) NOT NULL,
	dich_vu_su_dung VARCHAR (50) ,
	ngay_bat_dau DATE NOT NULL,
	ngay_ket_thuc DATE NOT NULL,
	so_tien_coc_truoc FLOAT NOT NULL,
	tong_so_tien_thanh_toan FLOAT,
 
	FOREIGN KEY (ten_khach_hang) REFERENCES khach_hang(ma_khach_hang),
	FOREIGN KEY (ten_nhan_vien) REFERENCES nhan_vien(ma_nhan_vien),
	FOREIGN KEY (dich_vu_su_dung) REFERENCES dich_vu(ma_dich_vu)
	
);

    CREATE TABLE hop_dong_chi_tiet(
    ID_hop_dong_chi_tiet INT PRIMARY KEY,
    ma_hop_dong INT NOT NULL ,
    ma_dich_vu_di_kem VARCHAR(50) ,
    so_luong INT,
	
    FOREIGN KEY (ma_hop_dong)REFERENCES hop_dong_thue(ma_hop_dong),
	FOREIGN KEY (ma_dich_vu_di_kem)REFERENCES dich_vu_di_kem (ma_dich_vu_di_kem)
    
    );
    
INSERT INTO `furamar`.`vi_tri_nhan_vien` (`ten_vi_tri_nhan_vien`) VALUES ('Giám Đốc');
INSERT INTO `furamar`.`vi_tri_nhan_vien` (`ten_vi_tri_nhan_vien`) VALUES ('Phó Giám Đốc');
INSERT INTO `furamar`.`vi_tri_nhan_vien` (`ten_vi_tri_nhan_vien`) VALUES ('Thư ký');
INSERT INTO `furamar`.`vi_tri_nhan_vien` (`ten_vi_tri_nhan_vien`) VALUES ('Thu ngân');
INSERT INTO `furamar`.`vi_tri_nhan_vien` (`ten_vi_tri_nhan_vien`) VALUES ('nhân viên');
INSERT INTO `furamar`.`vi_tri_nhan_vien` (`ten_vi_tri_nhan_vien`) VALUES ('Trưởng phòng');


-- bộ phận
INSERT INTO `furamar`.`bo_phan` (`ten_bo_phan`) VALUES ('Phòng hành chính');
INSERT INTO `furamar`.`bo_phan` (`ten_bo_phan`) VALUES ('Phòng nhân sự');
INSERT INTO `furamar`.`bo_phan` (`ten_bo_phan`) VALUES ('phòng giám đốc');
INSERT INTO `furamar`.`bo_phan` (`ten_bo_phan`) VALUES ('phòng nhân viên');


-- trình độ

INSERT INTO `furamar`.`trinh_do_nhan_vien` (`ten_trinh_do_nhan_vien`) VALUES ('Đại học');
INSERT INTO `furamar`.`trinh_do_nhan_vien` (`ten_trinh_do_nhan_vien`) VALUES ('Cao đẳng');
INSERT INTO `furamar`.`trinh_do_nhan_vien` (`ten_trinh_do_nhan_vien`) VALUES ('Tốt nghiệp cấp 3');
INSERT INTO `furamar`.`trinh_do_nhan_vien` (`ten_trinh_do_nhan_vien`) VALUES ('Thạc sĩ');
INSERT INTO `furamar`.`trinh_do_nhan_vien` (`ten_trinh_do_nhan_vien`) VALUES ('Tiến sĩ');


-- nhân viên

INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('GD_0001', 'Đặng Ngọc Minh Châu', '1995-05-15', '201727226', '0905315214', '3000', '1', '4', '3');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('PG_0001', 'Phan Ngọc Châu', '1996-02-01', '252656232', '0905315142', '2590', '2', '1', '3');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('TK_0011', 'Nguyễn Thị Thúy', '1995-05-25', '256256454', '0625487545', '1500', '3', '1', '2');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('TN_0001', 'Mai Thu Thủy', '1994-03-25', '256547859', '0965854751', '1250', '4', '2', '1');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('NV_0010', 'Huỳnh Bình', '1996-04-14', '123545687', '0932565985', '825', '5', '2', '4');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('NV_0011', 'Bùi Quốc Tiến', '1996-05-25', '252545854', '0905365265', '825', '5', '2', '4');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('NV_012', 'Phan Đức Nam', '1996-07-23', '252458457', '0965854784', '825', '5', '2', '4');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('TP_0129', 'Đặng Thụy Hương Giang', '1998-09-01', '565878458', '0985654548', '1350', '6', '1', '2');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('NV_0013', 'Trương Thị Thanh Thảo', '1993-01-02', '989289182', '0904283928', '825', '5', '2', '4');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('NV_0021', 'Huỳnh Thuận', '1991-01-02', '909876767', '0987878767', '825', '5', '2', '4');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('NV_0020', 'Kim Thị Tuyến', '1992-02-19', '987876767', '0976253645', '825', '5', '2', '4');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('TP_0122', 'Khổng Thanh Thảo', '1992-09-29', '987876765', '0908767656', '825', '5', '2', '1');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('NV_0192', 'Huỳnh Thị Thanh Thảo', '1992-09-01', '287487827', '0978767564', '850', '5', '2', '4');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('TP_0902', 'Huỳnh Nguyễn Anh Thư', '1996-01-02', '284756472', '0989878352', '1200', '6', '5', '1');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('TK_0921', 'Tạ Nguyễn Thanh Thảo', '1990-12-11', '287589283', '0917263462', '1100', '3', '5', '1');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('TP_0212', 'Trương Công Anh Trí', '1995-11-12', '267467267', '0908767562', '1120', '6', '4', '1');
INSERT INTO `furamar`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh_nhan_vien`, `so_CMND_nhan_vien`, `so_dien_thoai`, `luong_nhan_vien`, `vi_tri`, `trinh_do`, `bo_phan`) VALUES ('NV_0123', 'Phan Đức Nam', '1996-07-23', '898547854', '0875485689', '865', '5', '2', '4');


-- kiểu thuê

INSERT INTO `furamar`.`kieu_thue` (`ten_kieu_thue`) VALUES ('Thuê năm');
INSERT INTO `furamar`.`kieu_thue` (`ten_kieu_thue`) VALUES ('Thuê tháng');
INSERT INTO `furamar`.`kieu_thue` (`ten_kieu_thue`) VALUES ('Thuê ngày');
INSERT INTO `furamar`.`kieu_thue` (`ten_kieu_thue`) VALUES ('Thuê giờ');


-- tiêu chuẩn phòng

INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('1 phòng ngủ');
INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('2 phòng ngủ');
INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('3 phòng ngủ');
INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('4 phòng ngủ');
INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('Phòng giường đơn');
INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('Phòng giường đôi');
INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('phòng giường 3');
INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('Phòng giường 4');
INSERT INTO `furamar`.`tieu_chuan_phong` (`ten_tieu_chuan_phong`) VALUES ('');
UPDATE `furamar`.`tieu_chuan_phong` SET `ten_tieu_chuan_phong` = 'Nguyên căn' WHERE (`stt_tieu_chuan_phong` = '9');


-- dịch vụ

INSERT INTO `furamar`.`dich_vu` (`ma_dich_vu`, `ten_dich_vu`, `dien_tich_su_dung`, `chi_phi_thue`, `tieu_chuan_phong`, `mo_ta_tien_nghi`, `dien_tich_ho_boi`, `so_tang`, `so_luong_nguoi_toi_da`, `kieu_thue`) VALUES ('VILLA_001', 'Khu biệt thự Sealine', '100m2', '10000000', '9', 'Khu biệt thự Sealine tọa lạc ở vị trí đẹp và gần với nhà hàng ven biển. Từ đây, bạn có thể thong thả rảo bước đến bãi biển ngắm nhìn khung cảnh hoàng hôn, thỏa sức với các hoạt động thể thao trên biển và thưởng thức các món ngon tại nhà hàng A la carte. Khu Sealine gồm 16 căn biệt thự với thiết kế sang trọng, cao cấp. Bạn sẽ cảm nhận được hơi thở của thiên nhiên với không gian xanh bên ngoài biệt thự – là những rặng dừa rì rào, thảm co xanh mướt,…Với đặc trưng phòng khách rộng, nhiều cửa chính, cửa sổ gương, không gian bên trong ngập tràn ánh sáng, mang lại cảm giác tươi mới, tràn đầy năng lượng. Sự giao thoa giữa nét thanh lịch, cổ điển và cao cấp, hiện đại được thể hiện rõ qua nội thất các villa nghỉ dưỡng tại Sunset Sanato Beach Villas. Sự hòa quyện của các gam màu tinh tế, đơn giản như xám, trắng, sang trọng như xanh cổ vịt, tươi mới như lá cây vùng nhiệt đới và ấm cúng như màu gỗ khẽ khàng “níu giữ” du khách ngơi nghỉ lâu hơn tại Sunset Sanato Beach Villas.', '50m2', '3', '5', '3');
INSERT INTO `furamar`.`dich_vu` (`ma_dich_vu`, `ten_dich_vu`, `dien_tich_su_dung`, `chi_phi_thue`, `tieu_chuan_phong`, `mo_ta_tien_nghi`, `dien_tich_ho_boi`, `so_tang`, `so_luong_nguoi_toi_da`, `kieu_thue`) VALUES ('VILLA_002', 'The Ocean VIllas', '200m2', '15000000', '9', 'Là một trong những khu nghỉ dưỡng phức hợp lớn nhất tại vùng duyên hải miền Trung và là khu nghỉ dưỡng hàng đầu của VinaCapital nhận được nhiều giải thưởng, The Ocean Villas có 114 biệt thự sang trọng và 116 căn hộ, một sân golf đẳng cấp thế giới và nhiều tiện ích khác, mang đến cho quý khách một nơi nghỉ dưỡng đẳng cấp hướng ra vẻ đẹp ngoạn mục của biển Đông Việt Nam. Được Tổng cục Du lịch Việt Nam (VNAT) trao tặng 5 sao, tất cả các biệt thự và căn hộ đều được trang bị nội thất trang nhã và cung cấp dịch vụ tiêu chuẩn quốc tế 24/7 chu đáo/ tận tình và cẩn trọng.',  '75m2','4', '10', '2');
INSERT INTO `furamar`.`dich_vu` (`ma_dich_vu`, `ten_dich_vu`, `dien_tich_su_dung`, `chi_phi_thue`, `tieu_chuan_phong`, `mo_ta_tien_nghi`, `dien_tich_ho_boi`, `so_tang`, `so_luong_nguoi_toi_da`, `kieu_thue`) VALUES ('HOUSE_001', 'Dreamy House', '70m2', '850000', '2', 'Là một không gian thoáng mát , là nới dừng chân cho các bạn trẻ thích sự phóng thoáng,Dreamy House sẽ mang đến cho bạn những trải nghiệm tuyệt vời', '20m2', '2', '6', '3');
INSERT INTO `furamar`.`dich_vu` (`ma_dich_vu`, `ten_dich_vu`, `dien_tich_su_dung`, `chi_phi_thue`, `tieu_chuan_phong`, `mo_ta_tien_nghi`, `so_tang`, `dich_vu_mien_phi_di_kem`, `so_luong_nguoi_toi_da`, `kieu_thue`) VALUES ('ROOM_001', 'Centra Hotel', '20m2', '589000', '1', 'ất cả các phòng đều được thiết kế hiện đại, sang trọng với đầy đủ trang thiết bị của các thương hiệu uy tín hàng đầu trong lĩnh vực khách sạn. Chúng tôi cam kết sẽ mang lại cho Quý khách những trải nghiệm tuyệt vời, khó quên trong suốt thời gian lưu trú.', '2', 'giảm 30% thức ăn', '4', '4');
INSERT INTO `furamar`.`dich_vu` (`ma_dich_vu`, `ten_dich_vu`, `dien_tich_su_dung`, `chi_phi_thue`, `tieu_chuan_phong`, `mo_ta_tien_nghi`, `dien_tich_ho_boi`, `so_tang`, `so_luong_nguoi_toi_da`, `kieu_thue`) VALUES ('VILLA_003', 'Như Minh Villas', '200m2', '2500000', '9', 'là một nơi dừng chân lý tưởng với đầy đủ các tiện nghi', '80m2', '3', '10', '2');
INSERT INTO `furamar`.`dich_vu` (`ma_dich_vu`, `ten_dich_vu`, `dien_tich_su_dung`, `chi_phi_thue`, `tieu_chuan_phong`, `mo_ta_tien_nghi`, `so_tang`, `dich_vu_mien_phi_di_kem`, `so_luong_nguoi_toi_da`, `kieu_thue`) VALUES ('ROOM_002', 'The beat Hotel', '30m2', '589000', '6', 'xanh sạch đẹp', '2', 'tặng 1 bánh pizza', '4', '4');
INSERT INTO `furamar`.`dich_vu` (`ma_dich_vu`, `ten_dich_vu`, `dien_tich_su_dung`, `chi_phi_thue`, `tieu_chuan_phong`, `mo_ta_tien_nghi`, `dien_tich_ho_boi`, `so_tang`, `dich_vu_mien_phi_di_kem`, `so_luong_nguoi_toi_da`, `kieu_thue`) VALUES ('ROOM_003', 'Rose Hotel', '20m2', '1200000', '5', 'có tivi, ăn sáng, wifi miễn phí, điều hòa, bồn tắm', '28m2', '1', 'ăn sáng', '4', '3');
INSERT INTO `furamar`.`dich_vu` (`ma_dich_vu`, `ten_dich_vu`, `dien_tich_su_dung`, `chi_phi_thue`, `tieu_chuan_phong`, `mo_ta_tien_nghi`, `dien_tich_ho_boi`, `so_tang`, `so_luong_nguoi_toi_da`, `kieu_thue`) VALUES ('HOUSE_002', 'HomeStay', '150m2', '3000000', '4', 'có đầy đủ tiện nghi và 1 hồ bơi', '30m2', '2', '8', '3');

-- dịch vụ đi kèm

INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('MS', 'massage', '30p', '100000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('KA', 'karaoke', '1h', '120000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('BAP', 'bắp', '1 hộp', '45000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('GA', 'gà nướng', '1 con ', '180000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('VIT', 'vịt quay', '1 con', '220000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('COM', 'cơm phần', '1 phần', '50000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('N_001', 'nước suối', '1 chai', '10000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('N_002', 'pepsi', '1 lon', '15000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('N_003', 'cocacola', '1 lon', '15000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('NB_001', 'Tiger', '1 lon', '11000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('NB_002', 'huda', '1 lon', '15000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('NB_003', 'bubweiser', '1 lon', '19000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('NB_004', 'tiger bạc', '1 lon', '20000');
INSERT INTO `furamar`.`dich_vu_di_kem` (`ma_dich_vu_di_kem`, `ten_dich_vu_di_kem`, `don_vi`, `gia_tien`) VALUES ('TX', 'thuê xe tham quan', '1h', '130000');


-- loại khách hàng 
INSERT INTO `furamar`.`loai_khach_hang` (`ten_loai_khach_hang`) VALUES ('Diamound');
INSERT INTO `furamar`.`loai_khach_hang` (`ten_loai_khach_hang`) VALUES ('Platinium');
INSERT INTO `furamar`.`loai_khach_hang` (`ten_loai_khach_hang`) VALUES ('Gold');
INSERT INTO `furamar`.`loai_khach_hang` (`ten_loai_khach_hang`) VALUES ('Silver');
INSERT INTO `furamar`.`loai_khach_hang` (`ten_loai_khach_hang`) VALUES ('Member');

-- khách hàng
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('101', 'Lê Quang Đạo', '1997-02-19', 'Nam', '278576473', '0905646523', 'quangdao@gmai.com', '124 Điện Biên Phủ - Đà Nẵng', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('102', 'Trần Thị Thanh', '1992-03-29', 'Nữ', '987876752', '0908767656', 'thanhtran@gmail.com', 'h56/98 Điện Biên Phủ - Đà Nẵng', '5');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('103', 'Quang Văn Tần', '1991-07-28', 'Nam', '989898758', '0987675643', 'tanquangvan@gmail.com', '123 Lê Lợi - Đà Nẵng', '5');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('104', 'Nguyễn Phước Thiện', '1995-07-17', 'Nam', '190978767', '0908767657', 'thiennguyen@gmail.com', '126 Trần Cao Vân - Đà Nẵng', '5');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('105', 'Nguyễn Thị Phương Thanh', '1998-07-20', 'Nữ', '239481723', '0909878782', 'thanhnguyen@gmail.com', '128 Nguyễn Thái Học - Hà Nội', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('106', 'Phan Thị Thanh Trúc', '2002-08-20', 'Nữ', '546854512', '0905658545', 'thanhtruc@gmail.com', '566 Pham Đình Thái - Quảng Tri', '4');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('107', 'Đặng Quang Thanh', '1996-08-09', 'Nam', '589645123', '0954215487', 'quangthanh@gmail.com', '55 Điện Biên Phủ - Quảng Trị', '4');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('108', 'Đặng Quang Phú', '1997-02-19', 'Nam', '879856859', '0958645784', 'quangphu@gmail.com', '56 Điện Biên Phủ - Tp Hồ Chí Minh', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('109', 'Đặng Lý Bạch Long', '1966-07-17', 'Nam', '545125652', '0789456215', 'longdang@gmail.com', 'h18 Điện Biên Phủ - Đà Nẵng', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('110', 'Lê Thị Loan', '1992-09-20', 'Nữ', '451254568', '0908978656', 'loanle@gmail.com', 'h12 Điện Biên Phủ - Đà Nẵng', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('111', 'Nguyễn Hải Minh', '1994-09-01', 'Nam', '895685652', '0956856985', 'minhnguyen@gmail.com', '166 Trần Cao Vân - Đà Nẵng', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('112', 'Nguyễn Hải Đăng', '1989-09-01', 'Nam', '895847854', '0986584578', 'dangnguyen@gmail.com', '189 Trần Cao Vân - Đà Nẵng', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('113', 'Nguyễn Hải Đăng', '1991-10-25', 'Nam', '878678378', '0917254627', 'dangdangnguyen@gmail.com', '767 Điện Biên Phủ - Quảng Trị', '4');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('114', 'Đặng Quang Phú', '1996-08-19', 'Nam', '278478273', '0907876253', 'qugnphu@gmail.com', '254/16 Hàn Thuyên - Đà Nẵng', '4');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('115', 'Nguyên Trương Thảo Anh ', '1997-09-29', 'Nữ', '267467162', '0976564512', 'thaoanh123@gmail.com', '55 Trần Cao Vân - Vinh', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('116', 'Trương Thị Thảo Tú', '1982-01-23', 'Nữ ', '678374819', '0927567462', 'tuthao@gmail.com', '76 Điện Biên Phủ - Vinh', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('117', 'Phan Đặng Thảo Mai', '1992-02-19', 'Nữ', '789687485', '0928571332', 'thaomai@gmail.com', '66 Hà Huy Tâp - Quãng Ngãi', '1');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('118', 'Phan Văn Dưỡng', '1995-05-09', 'Nam', '879456878', '0987564154', 'duongphan@gmail.com', '56 Quảng Nam', '2');
INSERT INTO `furamar`.`khach_hang` (`ma_khach_hang`, `ten_khach_hang`, `ngay_sinh`, `gioi_tinh`, `so_CMND_khach_hang`, `so_DT_khach_hang`, `email_khach_hang`, `dia_chi`, `loai_khach_hang`) VALUES ('119', 'Nguyễn Quang Phong', '1995-07-17', 'Nam', '987548752', '0598785451', 'phongnguyen@gmail.com', '22 Duy Xuyên - Quảng Nam', '2');


-- hợp đồng
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1101', '101', 'NV_0011', 'HOUSE_001',  '2020-05-13', '2020-05-14', '25000' );
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1111', '101', 'NV_0013', 'HOUSE_001',  '2019-08-11', '2019-08-12', '300000' );
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1112', '101', 'NV_0020', 'VILLA_001',  '2018-09-15', '2018-09-20', '5000000' );
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc` ) VALUES ('1113', '112', 'NV_0013', 'HOUSE_001',  '2019-08-11', '2019-08-12', '200000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1114', '112', 'NV_0013', 'HOUSE_001',  '2018-09-15', '2018-09-20', '400000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1115', '112', 'NV_0011', 'VILLA_001',  '2018-09-15', '2018-09-20', '6000000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1116', '112', 'NV_0020', 'VILLA_002',  '2017-09-15', '2017-09-20', '4000000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1117', '109', 'NV_0021', 'VILLA_002',  '2017-09-15', '2017-09-20', '4500000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`,  `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1121', '102', 'NV_0020', 'VILLA_001',  '2018-09-15', '2018-09-20', '5000000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1222', '110', 'NV_0011', 'HOUSE_002', '2018-10-15', '2018-10-16', '150000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('1212', '108', 'NV_0020', 'HOUSE_002', '2019-01-15', '2019-01-16', '500000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('2221', '107', 'NV_0020', 'HOUSE_002', '2019-10-15', '2019-10-16', '150000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('2123', '115', 'NV_0123', 'VILLA_002', '2019-11-29', '2019-11-30', '1500000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('4352', '116', 'NV_0011', 'HOUSE_002', '2018-12-09', '2018-12-11', '200000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('3214', '117', 'NV_0013', 'VILLA_001', '2017-10-15', '2017-10-17', '2000000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('2212', '111', 'NV_0020', 'VILLA_002', '2019-03-11', '2019-03-12', '1500000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('7685', '113', 'NV_0123', 'HOUSE_001', '2019-04-12', '2019-04-15', '200000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('3212', '118', 'NV_0011', 'VILLA_002', '2019-04-22', '2019-04-25', '10000000');
INSERT INTO `furamar`.`hop_dong_thue` (`ma_hop_dong`, `ten_khach_hang`, `ten_nhan_vien`, `dich_vu_su_dung`, `ngay_bat_dau`, `ngay_ket_thuc`, `so_tien_coc_truoc`) VALUES ('44423', '119', 'NV_0123', 'HOUSE_001', '2020-04-22', '2020-04-25', '12000000');


-- hợp đồng chi tiết

INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('1011', '1101', 'BAP','2');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('1231', '1111', 'KA','3');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('1212', '1112', 'GA','4');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('1121', '1113', 'BAP','3');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('1112', '1114', 'MS','1');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('2221', '1115', 'BAP','5');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('2312', '1116', 'NB_004','6');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('13131', '1117', 'NB_001','2');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`,`so_luong`) VALUES ('2323', '1121', 'TX','1');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('22123', '1121', 'NB_001', '2');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('1111', '4352', 'BAP', '2');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('3321', '3214', 'KA', '2');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('3212', '2123', 'TX', '2');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('6564', '7685', 'MS', '4');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('23122', '2212', 'NB_001', '8');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('9893', '2221', 'GA', '2');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('4321', '1113', 'N_003', '1');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('29989', '44423', 'KA', '2');
INSERT INTO `furamar`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('653', '3212', 'BAP', '4');




-- task 2
SELECT *
FROM nhan_vien
WHERE (ten_nhan_vien LIKE ('K%') OR ten_nhan_vien LIKE ('H%') OR ten_nhan_vien LIKE ('T%')) AND length(ten_nhan_vien) >= 15;

-- task 3

SELECT *
FROM khach_hang
WHERE (ngay_sinh <= '2002-01-01'  AND ngay_sinh <= '2034-01-01') AND (dia_chi LIKE '%Đà Nẵng' OR dia_chi LIKE '%Quảng Trị');

-- task 4
SELECT  khach_hang.ma_khach_hang,khach_hang.ten_khach_hang
FROM hop_dong_thue
INNER JOIN khach_hang ON hop_dong_thue.ten_khach_hang = khach_hang.ma_khach_hang
WHERE khach_hang.loai_khach_hang = 1
GROUP BY khach_hang.ten_khach_hang
HAVING COUNT(khach_hang.ten_khach_hang)
ORDER BY khach_hang.ten_khach_hang ASC;

-- task 5
SELECT khach_hang.ma_khach_hang,khach_hang.ten_khach_hang,ten_loai_khach_hang,hop_dong_thue.ma_hop_dong,dich_vu_su_dung,hop_dong_thue.ngay_bat_dau,hop_dong_thue.ngay_ket_thuc,
(chi_phi_thue + gia_tien) as tong_tien
FROM khach_hang 
inner join loai_khach_hang ON khach_hang.loai_khach_hang = loai_khach_hang.stt_loai_khach_hang
INNER JOIN hop_dong_thue ON khach_hang.ma_khach_hang = hop_dong_thue.ten_khach_hang
INNER JOIN dich_vu ON  hop_dong_thue.dich_vu_su_dung = dich_vu.ma_dich_vu
INNER JOIN hop_dong_chi_tiet ON hop_dong_thue.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem =dich_vu_di_kem.ma_dich_vu_di_kem;

-- task 6
select  ma_hop_dong,ma_dich_vu,ten_dich_vu,dien_tich_su_dung,chi_phi_thue,ten_kieu_thue
FROM hop_dong_thue 
INNER JOIN dich_vu ON hop_dong_thue.dich_vu_su_dung = dich_vu.ma_dich_vu
INNER JOIN kieu_thue ON dich_vu.kieu_thue = kieu_thue.stt_kieu_thue
WHERE ngay_bat_dau < '2019-01-01' OR ngay_bat_dau > '2019-03-01';

-- task 7
select  ma_hop_dong,ma_dich_vu,ten_dich_vu,dien_tich_su_dung,chi_phi_thue,ten_kieu_thue,so_luong_nguoi_toi_da,ngay_bat_dau
FROM hop_dong_thue 
INNER JOIN dich_vu ON hop_dong_thue.dich_vu_su_dung = dich_vu.ma_dich_vu
INNER JOIN kieu_thue ON dich_vu.kieu_thue = kieu_thue.stt_kieu_thue
WHERE (ngay_bat_dau > '2018-01-01' AND ngay_bat_dau < '2019-01-01') ;


-- task8

SELECT ten_khach_hang
FROM khach_hang
GROUP BY (ten_khach_hang);

SELECT DISTINCT ten_khach_hang 
FROM khach_hang;

-- task 9

SELECT COUNT(ten_khach_hang) AS thang_1_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-01-01' AND ngay_bat_dau <='2019-01-31';

SELECT COUNT(ten_khach_hang) AS thang_2_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-02-01' AND ngay_bat_dau <='2019-02-29';

SELECT COUNT(ten_khach_hang) AS thang_3_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-03-01' AND ngay_bat_dau <='2019-03-31';

SELECT COUNT(ten_khach_hang) AS thang_4_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-04-01' AND ngay_bat_dau <='2019-04-30';

SELECT COUNT(ten_khach_hang) AS thang_5_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-05-01' AND ngay_bat_dau <='2019-05-31';

SELECT COUNT(ten_khach_hang) AS thang_6_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-06-01' AND ngay_bat_dau <='2019-06-30';

SELECT COUNT(ten_khach_hang) AS thang_7_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-07-01' AND ngay_bat_dau <='2019-07-31';

SELECT COUNT(ten_khach_hang) AS thang_8_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-08-01' AND ngay_bat_dau <='2019-08-31';

SELECT COUNT(ten_khach_hang) AS thang_9_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-09-01' AND ngay_bat_dau <='2019-09-30';

SELECT COUNT(ten_khach_hang) AS thang_10_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-10-01' AND ngay_bat_dau <='2019-10-31';

SELECT COUNT(ten_khach_hang) AS thang_11_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-11-01' AND ngay_bat_dau <='2019-11-30';

SELECT COUNT(ten_khach_hang) AS thang_12_co
FROM hop_dong_thue
WHERE ngay_bat_dau >='2019-12-01' AND ngay_bat_dau <='2019-12-31';


-- task 10
SELECT *
 --  hop_dong_chi_tiet.ma_hop_dong,ngay_bat_dau,ngay_ket_thuc,so_tien_coc_truoc,so_luong
FROM hop_dong_thue INNER JOIN hop_dong_chi_tiet ON hop_dong_thue.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
GROUP BY (hop_dong_chi_tiet.ma_hop_dong);

-- task 11
SELECT khach_hang.ten_khach_hang,ten_dich_vu_di_kem,dia_chi
FROM hop_dong_thue INNER JOIN hop_dong_chi_tiet ON hop_dong_thue.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong 
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem 
RIGHT JOIN khach_hang ON hop_dong_thue.ten_khach_hang = khach_hang.ma_khach_hang
RIGHT JOIN loai_khach_hang ON khach_hang.loai_khach_hang = loai_khach_hang.stt_loai_khach_hang
WHERE ten_loai_khach_hang = 'Diamound' AND (dia_chi LIKE'%Vinh' OR dia_chi LIKE '%Quãng Ngãi');

-- task 12
SELECT hop_dong_thue.ma_hop_dong,nhan_vien.ten_nhan_vien,khach_hang.ten_khach_hang,so_DT_khach_hang,ten_dich_vu,so_luong,so_tien_coc_truoc,ngay_bat_dau
FROM hop_dong_thue INNER JOIN hop_dong_chi_tiet ON hop_dong_thue.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong 
RIGHT JOIN dich_vu ON hop_dong_thue.dich_vu_su_dung = dich_vu.ma_dich_vu
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem 
RIGHT JOIN khach_hang ON hop_dong_thue.ten_khach_hang = khach_hang.ma_khach_hang
RIGHT JOIN loai_khach_hang ON khach_hang.loai_khach_hang = loai_khach_hang.stt_loai_khach_hang
RIGHT JOIN nhan_vien ON hop_dong_thue.ten_nhan_vien = nhan_vien.ma_nhan_vien
WHERE ngay_bat_dau > '2019-09-30' AND  ngay_bat_dau < '2020-01-01';

-- task 13
SELECT ten_dich_vu_di_kem,so_luong 
FROM hop_dong_thue
INNER JOIN hop_dong_chi_tiet ON hop_dong_thue.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong 
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
ORDER BY so_luong DESC
limit 1;

-- task 14
SELECT ten_dich_vu_di_kem
FROM hop_dong_thue
INNER JOIN hop_dong_chi_tiet ON hop_dong_thue.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong 
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
GROUP BY (ten_dich_vu_di_kem)
HAVING COUNT(ten_dich_vu_di_kem) = 1
ORDER BY(COUNT(ten_dich_vu_di_kem));

-- task 15
SELECT ma_nhan_vien as'ID nhân viên',nhan_vien.ten_nhan_vien as 'tên nhân viên ',ten_trinh_do_nhan_vien as 'trình độ nhân viên',ten_bo_phan as'tên bộ phân',so_dien_thoai as'số điện thoại',
hop_dong_thue.ngay_bat_dau
FROM nhan_vien INNER JOIN bo_phan ON nhan_vien.bo_phan = bo_phan.ID_bo_phan 
RIGHT JOIN trinh_do_nhan_vien ON nhan_vien.trinh_do = trinh_do_nhan_vien.stt_trinh_do_nhan_vien
RIGHT JOIN vi_tri_nhan_vien ON nhan_vien.vi_tri = vi_tri_nhan_vien.stt_vi_tri_nhan_vien
INNER JOIN hop_dong_thue ON nhan_vien.ma_nhan_vien = hop_dong_thue.ten_nhan_vien
GROUP BY (ma_nhan_vien)
HAVING COUNT(hop_dong_thue.ten_nhan_vien) <= 3  AND (ngay_bat_dau >= '2017-01-01' AND ngay_bat_dau < '2020-01-01' );


-- task 16

DELETE 
FROM nhan_vien,bo_phan,trinh_do_nhan_vien,vi_tri_nhan_vien,hop_dong_thue
USING nhan_vien,bo_phan,trinh_do_nhan_vien,vi_tri_nhan_vien,hop_dong_thue
WHERE  nhan_vien.bo_phan = bo_phan.ID_bo_phan AND nhan_vien.trinh_do = trinh_do_nhan_vien.stt_trinh_do_nhan_vien
AND nhan_vien.vi_tri = vi_tri_nhan_vien.stt_vi_tri_nhan_vien AND nhan_vien.ma_nhan_vien = 'NV_0192' ;

-- task 17
UPDATE  khach_hang,hop_dong_thue,dich_vu,dich_vu_di_kem
SET loai_khach_hang = 1
WHERE loai_khach_hang = 2 AND ( hop_dong_thue.ngay_bat_dau > '2018-12-30' AND hop_dong_thue.ngay_bat_dau < '2020-01-01' ) AND (chi_phi_thue + gia_tien)  >= 10000000;

-- task 18

-- UPDATE dich_vu_di_kem,hop_dong_chi_tiet 
-- SET gia_tien = (gia_tien * 2)
CREATE TABLE tong_DV(

SELECT*,COUNT(ma_dich_vu_di_kem) as tong_cong
FROM hop_dong_chi_tiet
GROUP BY(ma_dich_vu_di_kem)
HAVING COUNT(ma_dich_vu_di_kem)

)
;

UPDATE dich_vu_di_kem,tong_dv
SET gia_tien = (gia_tien * 2)
WHERE tong_dv.tong_cong = 4 ;

SELECT ma_dich_vu_di_kem
FROM tong_dv
WHERE tong_cong = 10


-- task 19

DELETE khach_hang
FROM khach_hang,hop_dong_thue
WHERE ngay_bat_dau <= '2015-12-31';

-- task 20
SELECT ma_nhan_vien,ten_nhan_vien,so_dien_thoai,ngay_sinh_nhan_vien,
ma_khach_hang,ten_khach_hang,email_khach_hang,so_DT_khach_hang,dia_chi,ngay_sinh
FROM nhan_vien,khach_hang;




