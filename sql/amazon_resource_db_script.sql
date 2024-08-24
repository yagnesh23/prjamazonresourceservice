CREATE DATABASE IF NOT EXISTS amazon_resource;

CREATE TABLE `file_configs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` enum('IMAGE','AUDIO','VIDEO') DEFAULT NULL,
  `max_size` varchar(10) DEFAULT NULL,
  `min_size` varchar(10) DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `files` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `file_name` varchar(255) DEFAULT NULL,
  `file_extension` enum('JPG','MP4','PNG') DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `type` enum('IMAGE','AUDIO','VIDEO') DEFAULT NULL,
  `uploaded_at` datetime DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT NULL,
  `deleted_by` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;