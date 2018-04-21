-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 04, 2018 at 04:30 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `firstout`
--
CREATE DATABASE IF NOT EXISTS `firstout` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `firstout`;

-- --------------------------------------------------------

--
-- Table structure for table `firstin`
--

CREATE TABLE IF NOT EXISTS `firstin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstno` int(100) NOT NULL,
  `secondno` int(200) NOT NULL,
  `thirdno` int(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `firstin`
--

INSERT INTO `firstin` (`id`, `firstno`, `secondno`, `thirdno`) VALUES
(1, 10, 20, 30),
(2, 40, 50, 60);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
