CREATE DATABASE  IF NOT EXISTS `employee_management`;
USE `employee_management`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(100)DEFAULT NULL,
  `profile` varchar(20) DEFAULT NULL,
  `mobile_number` varchar(10) DEFAULT NULL,
  `dob`       DATE,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;




