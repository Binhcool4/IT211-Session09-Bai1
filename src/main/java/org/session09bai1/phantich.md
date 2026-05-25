# Phân tích: Vì sao không dùng System.out.println() trên Production

- Không lưu trữ log lâu dài:
    - System.out.println() chỉ in ra console.
    - Khi server restart hoặc log bị trôi, rất khó truy vết lỗi cũ.

- Không hỗ trợ phân loại mức độ log:
    - Không có các level như INFO, WARN, ERROR, DEBUG.
    - Khó lọc và phân tích log trong hệ thống lớn.

- Không phù hợp với hệ thống Production:
    - Không hỗ trợ ghi log ra file.
    - Không tích hợp tốt với ELK, Grafana, Splunk,...
    - printStackTrace() gây log lộn xộn và khó đọc.