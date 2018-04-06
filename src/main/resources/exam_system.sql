CREATE TABLE `tb_student` (
  `studentID` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `result` int(11) NOT NULL,
  `class` varchar(20) NOT NULL,
  PRIMARY KEY (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_subject` (
  `subjectID` int(11) NOT NULL AUTO_INCREMENT,
  `subjectTitle` varchar(255) NOT NULL,
  `subjectOptionA` varchar(50) DEFAULT NULL,
  `subjectOptionB` varchar(50) DEFAULT NULL,
  `subjectOptionC` varchar(50) DEFAULT NULL,
  `subjectOptionD` varchar(50) DEFAULT NULL,
  `subjectAnswer` varchar(1) DEFAULT NULL,
  `subjectParse` text,
  PRIMARY KEY (`subjectID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_teacher` (
  `teacherID` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`teacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;