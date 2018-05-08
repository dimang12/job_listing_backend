-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 08, 2018 at 08:49 PM
-- Server version: 5.7.19
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `jobs`
--

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--

CREATE TABLE IF NOT EXISTS `cities` (
  `id` int(5) NOT NULL,
  `title` varchar(100) NOT NULL,
  `job_number` int(6) NOT NULL,
  `ordering` int(4) NOT NULL,
  `is_published` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--

INSERT INTO `cities` (`id`, `title`, `job_number`, `ordering`, `is_published`) VALUES
  (1, 'Oakland', 50, 1, 1),
  (2, 'San Francisco', 1200, 2, 1),
  (3, 'Los Angeles', 30, 3, 1),
  (4, 'San Diego', 18, 4, 1),
  (5, 'Los Angeles', 30, 3, 1),
  (6, 'San Diego', 18, 4, 1),
  (7, 'San Jose', 212, 5, 1),
  (8, 'Frsno', 3, 6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `jobs`
--

CREATE TABLE IF NOT EXISTS `jobs` (
  `id` int(11) NOT NULL,
  `title` varchar(225) NOT NULL,
  `city` int(6) NOT NULL,
  `job_type` int(2) NOT NULL,
  `salary` float NOT NULL,
  `summary` text NOT NULL,
  `duty` text NOT NULL,
  `requirement` text NOT NULL,
  `job_title` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jobs`
--

INSERT INTO `jobs` (`id`, `title`, `city`, `job_type`, `salary`, `summary`, `duty`, `requirement`, `job_title`) VALUES
  (1, 'Front End Web & Software Designer', 2, 1, 100000, 'We’re looking for talented designer/developer hybrids to help us build and enhance products, web flows and other resources. Our ideal candidate is a designer first with enough development experience to work closely with our in-house team of engineers. Backgrounds Online is a small company that moves quickly. We are excited about what we do and want someone who will help us grow.\r\n\r\nDo you thrive in a fast-paced, supportive and fun environment that encourages people to take initiative? Then we want to hear from you.', 'Must be local to the Sacramento area and onsite full-time.\r\nPrimary Duty: Work on new projects and enhancements for our web properties.\r\nOptimize design and UX/UI for our front-end website, online client software and administrative systems.\r\nDevelop HTML/XHTML, CSS, JavaScript, AngularJS to be utilized by inhouse developers.\r\nDevelop graphics and build designs to pixel-perfect accuracy with cross-browser compatibility.\r\nProblem-solve on your own and work collaboratively with others to meet the needs of projects.\r\nTake initiative to learn about our technology and systems.\r\nPossess strong written and verbal communication skills.', 'BS in Graphic Communication, Web Development, Computer Science or equivalent.\r\nSeveral years doing creative web design, graphic web production and web development.\r\nStrong knowledge of HTML/XHTML, CSS, JavaScript and jQuery.\r\nProficiency creating web designs and graphics using Adobe Photoshop or Fireworks.\r\nKnowledge of browser compatibility issues; ability to build standards-compliant web code.\r\nMust have high aptitude in triaging problems, identifying options and choosing optimal solutions.\r\nStrong knowledge of web standards, technologies and solutions.\r\nUnderstanding of project lifecycles and development methodologies.\r\nExperience with Visual Studio development environment.\r\nExperience with print layout/design is a plus.\r\nExperience with AngularJS is a plus.', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `resume`
--

CREATE TABLE IF NOT EXISTS `resume` (
  `id` int(10) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `position` varchar(100) NOT NULL,
  `location` varchar(150) NOT NULL,
  `email` varchar(80) NOT NULL,
  `phone` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `resume`
--

INSERT INTO `resume` (`id`, `first_name`, `last_name`, `position`, `location`, `email`, `phone`) VALUES
  (1, 'Dimang', 'Chou', 'Crew Member', 'Oakland, California', 'dimang12@gmail.com', '5108096093');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cities`
--
ALTER TABLE `cities`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jobs`
--
ALTER TABLE `jobs`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `resume`
--
ALTER TABLE `resume`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cities`
--
ALTER TABLE `cities`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `jobs`
--
ALTER TABLE `jobs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `resume`
--
ALTER TABLE `resume`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;