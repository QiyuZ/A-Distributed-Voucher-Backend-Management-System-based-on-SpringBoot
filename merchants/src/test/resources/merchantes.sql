CREATE TABLE `merchants` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) COLLATE utf8_bin NOT NULL COMMENT 'merchant_name',
  `logo_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'merchant_logo',
  `business_license_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'merchant_license',
  `phone` varchar(64) COLLATE utf8_bin NOT NULL COMMENT 'merchant_phone',
  `address` varchar(64) COLLATE utf8_bin NOT NULL COMMENT 'merchant_address',
  `is_audit` BOOLEAN NOT NULL COMMENT 'merchant_verified',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;