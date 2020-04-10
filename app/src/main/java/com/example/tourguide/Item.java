package com.example.tourguide;

public class Item {
    static Item[] atm = {
            new Item(R.drawable.atm_machine, "ATM Hoàn Kiếm\n17 phố Lý Thường Kiệt, Phường Phan Chu Trinh, Quận Hoàn Kiếm, Hà Nội", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Đinh Tiên Hoàng\n7 Đinh Tiên Hoàng, Quận Hoàn Kiếm, Hà Nội", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Hội sở\n57 Lý Thường Kiệt, Quận Hoàn Kiếm, Hà Nội", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Nam Hà Nội\n236 Lê Thanh Nghị, Quận Hai Bà Trưng, Hà Nội", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Hai Bà Trưng\n300-302 Trần Khát Chân, Quận Hai Bà Trưng, Hà Nội", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Lê Ngọc Hân\n44 Lê Ngọc Hân, Quận Hai Bà Trưng, Hà Nội", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Thăng Long\n129-131 Hoàng Quốc Việt, Quận Cầu Giấy, Hà Nội", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Phạm Hùng\nTòa nhà FPT Phạm Hùng, Quận Cầu Giấy, Hà Nội", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Khâm Thiên\n158 Khâm Thiên, Quận Đống Đa, Hà Nội", R.color.colorAtm),
    };

    static Item[] atmHcm = {
            new Item(R.drawable.atm_machine, "ATM Q1\nQuận 1, HCM", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Q2\nQuận 2, HCM", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Q3\nQuận 3, HCM", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Q4\nQuận 4, HCM", R.color.colorAtm),
            new Item(R.drawable.atm_machine, "ATM Q5\nQuận 5, HCM", R.color.colorAtm),
    };

    static Item[] hospital = {
            new Item(R.drawable.hospital, "Bệnh viện Bạch Mai\n78 – Đường Giải Phóng – Phương Mai – Đống Đa – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh Viện Hữu Nghị\nSố 1 – Trần Khánh Dư – Quận Hai Bà Trưng – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh Viện E, Hà Nội\n89 – Trần Cung – Nghĩa Tân – Cầu Giấy – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Viện Răng Hàm Mặt\n40B – Tràng Thi – Hoàn Kiếm – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh Viện Tai Mũi Họng Trung Ương\n78 – Đường Giải Phóng – Quận Đống Đa – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh Viện Mắt Trung Ương\n85 – Phố Bà Triệu – Quận Hai Bà Trưng – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Viện Y Học Cổ Truyền Trung Ương\n29 – Phố Nguyễn Bỉnh Khiêm – Quận Hai Bà Trưng – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh Viện Nội Tiết\n80 – Thái Thịnh II – Thịnh Quang – Đống Đa – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh Viện Việt Đức\n8 – Phố Phủ Doãn – Quận Hoàn Kiếm – Hà Nội", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh Viện Nhi Trung Ương\n18/879 – Đường La Thành – Quận Đống Đa – Hà Nội", R.color.colorHospital),
    };

    static Item[] hospitalHcm = {
            new Item(R.drawable.hospital, "Bệnh viện Chợ Rẫy\nQ5", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh viện Nhân Dân\nQ10", R.color.colorHospital),
            new Item(R.drawable.hospital, "Bệnh viện Tai Mũi Họng\nQ3", R.color.colorHospital),
    };

    static Item[] hotel = {
            new Item(R.drawable.hotel, "The Queen Hotel & Spa\n67 Thuốc Bắc, Hàng Bồ, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam", R.color.colorHotel),
            new Item(R.drawable.hotel, "Hanoi Nostalgia Hotel & Spa\n13-15 Luong Ngoc Quyen, Hang Buom, Hoan Kiem, Hàng Buồm, Quận Hoàn Kiếm, Hà Nội, Việt Nam", R.color.colorHotel),
            new Item(R.drawable.hotel, "Church Legend Hotel Hanoi\n46 Ấu Triệu, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam", R.color.colorHotel),
            new Item(R.drawable.hotel, "Little Hanoi Diamond Hotel\n11 Bát Đàn, Quận Hoàn Kiếm, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam", R.color.colorHotel),
            new Item(R.drawable.hotel, "Flamingo Dai Lai Resort\nThôn Ngọc Quang, Xã Ngọc Thanh, Vĩnh Phúc, Phúc Yên, Hà Nội, Việt Nam", R.color.colorHotel),
            new Item(R.drawable.hotel, "Annam Legend Hotel\n27 Hàng Bè, Hàng Bạc, Quận Hoàn Kiếm, Hà Nội, Việt Nam", R.color.colorHotel),
            new Item(R.drawable.hotel, "The Queen Hotel & Spa\n67 Thuốc Bắc, Hàng Bồ, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam", R.color.colorHotel),
            new Item(R.drawable.hotel, "Hanoi Zesty Hotel\n20 Hàng Cân, Hàng Đào, Quận Hoàn Kiếm, Hà Nội, Việt Nam", R.color.colorHotel),
            new Item(R.drawable.hotel, "Bluebell Hotel\n41 Ngõ Huyện, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam", R.color.colorHotel),
    };

    static Item[] hotelHcm = {
            new Item(R.drawable.hotel, "New world\nQ1", R.color.colorHotel),
            new Item(R.drawable.hotel, "Time Square\nQ1", R.color.colorHotel),
    };

    static Item[] bus = {
            new Item(R.drawable.metro, "Tuyến 01\nBX Gia Lâm - BX Yên Nghĩa", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 02\nBác cổ - BX Yên Nghĩa", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 03A\nBX Giáp Bát - BX Gia Lâm", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 03B\nBx Giáp Bát - Vincom - Phúc Lợi", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 04\nLong Biên - BX Nước Ngầm", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 05\nLinh Đàm - Phú Diễn", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 06\nBX. Giáp Bát - Phú Minh (Phú Xuyên)", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 07\nCầu Giấy - Nội Bài", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 08\nLong Biên - Đông Mỹ", R.color.colorBus),
    };


    static Item[] busHcm = {
            new Item(R.drawable.metro, "Tuyến 01\nBX Chợ Lớn - BX Bến Thành", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 02\nBX Chợ Lớn - BX An Sương", R.color.colorBus),
            new Item(R.drawable.metro, "Tuyến 03\nBX An Sương - BX Vũng Tàu", R.color.colorBus),
    };

    public final int iconResId;
    public final String content;
    public final int colorResId;

    public Item(int iconResId, String content, int colorResId) {
        this.iconResId = iconResId;
        this.content = content;
        this.colorResId = colorResId;
    }
}