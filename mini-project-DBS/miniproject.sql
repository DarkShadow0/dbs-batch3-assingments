-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.8-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for miniproject
CREATE DATABASE IF NOT EXISTS `miniproject` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `miniproject`;

-- Dumping structure for table miniproject.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `CUSTOMERID` int(11) DEFAULT NULL,
  `CUSTOMERNAME` varchar(50) DEFAULT NULL,
  `ADDRESS` varchar(50) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `MOBILENO` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table miniproject.customer: ~2 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`CUSTOMERID`, `CUSTOMERNAME`, `ADDRESS`, `EMAIL`, `MOBILENO`) VALUES
	(100, 'abhinay', 'HYD', 'abinay@gmail.com', 1234567890),
	(101, 'chirayu', 'HYD', 'chirayu@gmail.com', 1234567890),
	(106, 'rohan', 'hyd', 'rohan@gmail.com', 86598635);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
