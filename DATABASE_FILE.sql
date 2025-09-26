-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2023 at 07:06 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `listmenu`
--

-- --------------------------------------------------------

--
-- Table structure for table `addons`
--

CREATE TABLE `addons` (
  `item` int(11) NOT NULL,
  `orderAdd` varchar(255) NOT NULL,
  `price` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `addons`
--

INSERT INTO `addons` (`item`, `orderAdd`, `price`) VALUES
(1, 'BACON', 25),
(2, 'EGG', 20),
(3, 'HAM', 25),
(4, 'SPAM', 30),
(5, 'BBQ SAUCE', 20),
(6, 'BBQ SAUCE', 20),
(7, 'BACON', 25),
(8, 'BACON', 25),
(9, 'BBQ SAUCE', 20),
(10, 'CHEESE', 20),
(11, 'EGG', 20),
(12, 'EGG', 20),
(13, 'BACON', 25),
(14, 'EGG', 20),
(15, 'EGG', 20);

-- --------------------------------------------------------

--
-- Table structure for table `burger`
--

CREATE TABLE `burger` (
  `item` int(11) NOT NULL,
  `orderBurger` varchar(255) NOT NULL,
  `price` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `burger`
--

INSERT INTO `burger` (`item`, `orderBurger`, `price`) VALUES
(1, 'BOARD SLIDE', 179),
(2, 'BOARD SLIDE', 159),
(3, 'KETO', 159),
(4, 'FAKIE SANDWICH', 209),
(5, 'CHICK & BURGER', 220),
(6, 'BOARD SLIDE', 179),
(7, 'BOARD SLIDE', 159),
(8, 'BOARD SLIDE', 159),
(9, 'BOARD SLIDE', 159),
(10, 'CHICK & BURGER', 220),
(11, 'BOARD SLIDE', 159),
(12, 'KETO', 159),
(13, 'BOARD SLIDE', 159),
(14, 'BOARD SLIDE', 179),
(15, 'KETO', 159),
(16, 'KETO', 159),
(17, 'KETO', 159);

-- --------------------------------------------------------

--
-- Table structure for table `fries`
--

CREATE TABLE `fries` (
  `item` int(11) NOT NULL,
  `orderFries` varchar(255) NOT NULL,
  `price` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `fries`
--

INSERT INTO `fries` (`item`, `orderFries`, `price`) VALUES
(1, 'FIRST FRIES', 79),
(2, 'FIRST FRIES', 79),
(3, 'FIRST FRIES', 79),
(4, 'FIRST FRIES', 79),
(5, 'FIRST FRIES', 79),
(6, 'FIRST FRIES', 79),
(7, 'FIRST FRIES', 79),
(8, 'FIRST FRIES', 79),
(9, 'FIRST FRIES', 119),
(10, 'FIRST FRIES', 79),
(11, 'GRAND FRIES', 119),
(12, 'FIRST FRIES', 79),
(13, 'GRAND FRIES', 119),
(14, 'FIRST FRIES', 79),
(15, 'FIRST FRIES', 79),
(16, 'FIRST FRIES', 79),
(17, 'FIRST FRIES', 79),
(18, 'GRAND FRIES', 119),
(19, 'GRAND FRIES', 119),
(20, 'GRAND FRIES', 119),
(21, 'GRAND FRIES', 119),
(22, 'FIRST FRIES', 79),
(23, 'FIRST FRIES', 79),
(24, 'GRAND FRIES', 119),
(25, 'GRAND FRIES', 119);

-- --------------------------------------------------------

--
-- Table structure for table `sandwich`
--

CREATE TABLE `sandwich` (
  `item` int(11) NOT NULL,
  `orderSand` varchar(255) NOT NULL,
  `price` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sandwich`
--

INSERT INTO `sandwich` (`item`, `orderSand`, `price`) VALUES
(1, 'CHICKEN SANDWICH', 169),
(2, 'BACON & EGG', 79),
(3, 'HAM & EGG', 79),
(4, 'SPAM & EGG', 89),
(5, 'CHICKEN SANDWICH', 169),
(6, 'HAM & EGG', 79),
(7, 'SPAM & EGG', 89),
(8, 'BACON & EGG', 79),
(9, 'SPAM & EGG', 89),
(10, 'BACON & EGG', 79),
(11, 'CHICKEN SANDWICH', 169),
(12, 'CHICKEN SANDWICH', 169),
(13, 'SPAM & EGG', 89),
(14, 'SPAM & EGG', 89),
(15, 'SPAM & EGG', 89);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addons`
--
ALTER TABLE `addons`
  ADD PRIMARY KEY (`item`);

--
-- Indexes for table `burger`
--
ALTER TABLE `burger`
  ADD PRIMARY KEY (`item`);

--
-- Indexes for table `fries`
--
ALTER TABLE `fries`
  ADD PRIMARY KEY (`item`);

--
-- Indexes for table `sandwich`
--
ALTER TABLE `sandwich`
  ADD PRIMARY KEY (`item`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addons`
--
ALTER TABLE `addons`
  MODIFY `item` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `burger`
--
ALTER TABLE `burger`
  MODIFY `item` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `fries`
--
ALTER TABLE `fries`
  MODIFY `item` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `sandwich`
--
ALTER TABLE `sandwich`
  MODIFY `item` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
