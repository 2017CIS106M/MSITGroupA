/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : fmawtfd

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2017-03-28 12:30:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `brand`
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `Brand_Cd` varchar(45) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `DosageOrDirections` varchar(1000) DEFAULT NULL,
  `Administration` varchar(1000) DEFAULT NULL,
  `PregnancyCategory` varchar(1000) DEFAULT NULL,
  `Interactions` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`Brand_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of brand
-- ----------------------------

-- ----------------------------
-- Table structure for `customers`
-- ----------------------------
DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers` (
  `code` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `credit_limit` double DEFAULT NULL,
  `current_credit` double DEFAULT NULL,
  `name` varchar(80) NOT NULL,
  `primary_phone_line` varchar(255) DEFAULT NULL,
  `secondary_phone_line` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customers
-- ----------------------------

-- ----------------------------
-- Table structure for `disease`
-- ----------------------------
DROP TABLE IF EXISTS `disease`;
CREATE TABLE `disease` (
  `Disease_Cd` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  PRIMARY KEY (`Disease_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of disease
-- ----------------------------

-- ----------------------------
-- Table structure for `disease_symptoms`
-- ----------------------------
DROP TABLE IF EXISTS `disease_symptoms`;
CREATE TABLE `disease_symptoms` (
  `Disease_Cd` varchar(45) NOT NULL,
  `Symptoms_Cd` varchar(45) NOT NULL,
  `disease_disease_cd` varchar(255) NOT NULL,
  `drug_drug_cd` varchar(255) NOT NULL,
  PRIMARY KEY (`Disease_Cd`,`Symptoms_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of disease_symptoms
-- ----------------------------

-- ----------------------------
-- Table structure for `distributor`
-- ----------------------------
DROP TABLE IF EXISTS `distributor`;
CREATE TABLE `distributor` (
  `Distributor_Cd` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Address` varchar(200) NOT NULL,
  PRIMARY KEY (`Distributor_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of distributor
-- ----------------------------

-- ----------------------------
-- Table structure for `drug`
-- ----------------------------
DROP TABLE IF EXISTS `drug`;
CREATE TABLE `drug` (
  `Drug_Cd` varchar(45) NOT NULL,
  `Name` varchar(1000) NOT NULL,
  `Indication` varchar(1000) NOT NULL,
  `DosageAndDirections` varchar(1000) NOT NULL,
  `ContraIndications` varchar(1000) NOT NULL,
  `SpecialPrecautions` varchar(1000) NOT NULL,
  `SideEffects` varchar(1000) NOT NULL,
  `Interactions` varchar(1000) NOT NULL,
  `PregnacySafety` varchar(1000) NOT NULL,
  `Brand_Cd` varchar(45) NOT NULL,
  `Manufacturer_Cd` varchar(45) NOT NULL,
  `Distributor_Cd` varchar(45) NOT NULL,
  PRIMARY KEY (`Drug_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug
-- ----------------------------

-- ----------------------------
-- Table structure for `drug_disease`
-- ----------------------------
DROP TABLE IF EXISTS `drug_disease`;
CREATE TABLE `drug_disease` (
  `DRUG_Drug_Cd` varchar(45) NOT NULL,
  `DISEASE_Disease_Cd` varchar(45) NOT NULL,
  PRIMARY KEY (`DRUG_Drug_Cd`,`DISEASE_Disease_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug_disease
-- ----------------------------

-- ----------------------------
-- Table structure for `drug_form`
-- ----------------------------
DROP TABLE IF EXISTS `drug_form`;
CREATE TABLE `drug_form` (
  `Form` varchar(45) NOT NULL,
  `Photo` blob,
  `Packing` varchar(1000) NOT NULL,
  `Price` decimal(16,2) NOT NULL,
  `DRUG_Drug_Cd` varchar(45) NOT NULL,
  PRIMARY KEY (`Form`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug_form
-- ----------------------------

-- ----------------------------
-- Table structure for `manufacturer`
-- ----------------------------
DROP TABLE IF EXISTS `manufacturer`;
CREATE TABLE `manufacturer` (
  `Manufacturer_Cd` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Address` varchar(200) NOT NULL,
  PRIMARY KEY (`Manufacturer_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manufacturer
-- ----------------------------

-- ----------------------------
-- Table structure for `order_lines`
-- ----------------------------
DROP TABLE IF EXISTS `order_lines`;
CREATE TABLE `order_lines` (
  `code` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_code` bigint(20) NOT NULL,
  `product_price` double NOT NULL,
  `quantity` double NOT NULL,
  `sales_code` bigint(20) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_lines
-- ----------------------------

-- ----------------------------
-- Table structure for `pharmacy`
-- ----------------------------
DROP TABLE IF EXISTS `pharmacy`;
CREATE TABLE `pharmacy` (
  `Pharmacy_Cd` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Logo` blob NOT NULL,
  `LTO_No` varchar(45) NOT NULL,
  `Validity_Date` date NOT NULL,
  `BldgNoOrUnitNo` varchar(45) NOT NULL,
  `Street` varchar(45) NOT NULL,
  `Barangay` varchar(45) NOT NULL,
  `City` varchar(45) NOT NULL,
  `Province` varchar(45) NOT NULL,
  `Zipcode` varchar(45) DEFAULT NULL,
  `Contact_No` varchar(45) NOT NULL,
  `Contact_Person` varchar(45) NOT NULL,
  PRIMARY KEY (`Pharmacy_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pharmacy
-- ----------------------------

-- ----------------------------
-- Table structure for `products`
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `code` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` double DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of products
-- ----------------------------

-- ----------------------------
-- Table structure for `sales_orders`
-- ----------------------------
DROP TABLE IF EXISTS `sales_orders`;
CREATE TABLE `sales_orders` (
  `code` bigint(20) NOT NULL,
  `customer` varchar(255) DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sales_orders
-- ----------------------------

-- ----------------------------
-- Table structure for `store`
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `Store_Cd` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Picture` blob,
  `BldgNoOrUnitNo` varchar(45) NOT NULL,
  `Street` varchar(45) NOT NULL,
  `Barangay` varchar(45) NOT NULL,
  `City` varchar(45) NOT NULL,
  `Province` varchar(45) NOT NULL,
  `Zipcode` varchar(45) NOT NULL,
  `Contact_No` varchar(45) NOT NULL,
  `Contact_Person` varchar(45) NOT NULL,
  `License_No` varchar(45) NOT NULL,
  `Validity` varchar(45) NOT NULL,
  `Pharmacy_Cd` varchar(45) NOT NULL,
  PRIMARY KEY (`Store_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store
-- ----------------------------

-- ----------------------------
-- Table structure for `store_drug`
-- ----------------------------
DROP TABLE IF EXISTS `store_drug`;
CREATE TABLE `store_drug` (
  `Store_Cd` int(11) NOT NULL,
  `Drug_Cd` varchar(45) NOT NULL,
  PRIMARY KEY (`Store_Cd`,`Drug_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store_drug
-- ----------------------------

-- ----------------------------
-- Table structure for `symptoms`
-- ----------------------------
DROP TABLE IF EXISTS `symptoms`;
CREATE TABLE `symptoms` (
  `Symptoms_Cd` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  PRIMARY KEY (`Symptoms_Cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of symptoms
-- ----------------------------

-- ----------------------------
-- Table structure for `user_drug_search`
-- ----------------------------
DROP TABLE IF EXISTS `user_drug_search`;
CREATE TABLE `user_drug_search` (
  `DRUG_NAME` int(11) NOT NULL,
  `BRAND_NAME` varchar(45) NOT NULL,
  `DRUG_DOSAGE` varchar(45) NOT NULL,
  `DRUG_INDICATION` varchar(45) NOT NULL,
  `PRICE` varchar(45) NOT NULL,
  `PHOTO` blob,
  `SYMPTOMS` varchar(45) NOT NULL,
  `STORES` varchar(45) NOT NULL,
  `USER_DRUG_SEARCHcol` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_drug_search
-- ----------------------------
