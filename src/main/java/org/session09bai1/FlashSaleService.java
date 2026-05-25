package org.session09bai1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlashSaleService {

    private static final Logger logger =
            LoggerFactory.getLogger(FlashSaleService.class);

    public void applyDiscount(String userId, String code) {

        logger.info(
                "Đang xử lý mã: {} cho user: {}",
                code,
                userId
        );

        try {

            // ... logic xử lý

            logger.info(
                    "Áp dụng mã giảm giá thành công cho user: {}",
                    userId
            );

        } catch (Exception e) {

            logger.error(
                    "Lỗi khi áp dụng mã giảm giá cho user: {} với code: {}",
                    userId,
                    code,
                    e
            );
        }
    }
}
