-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: online_banking_system
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactions` (
  `uid` int DEFAULT NULL,
  `trabsaction_id` int NOT NULL AUTO_INCREMENT,
  `date` varchar(10) DEFAULT NULL,
  `time` varchar(10) DEFAULT NULL,
  `receiver_acc` varchar(30) DEFAULT NULL,
  `receiver_name` varchar(45) DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `type` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`trabsaction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES (1,1,'2022-5-5','22:1:47','123','Nirmani',1000.00,'CRD'),(1,2,'2022-5-5','22:6:5','123123','Udani',1999.00,'CRD'),(1,3,'2022-5-5','22:8:55','12112','Shanon',199.00,'CRD'),(1,4,'2022-5-5','22:9:35','11111111','sunera',1212.00,'CRD'),(2,5,'2022-5-5','22:10:34','1111','sunera',1297.00,'CRD'),(1,6,'2022-5-6','12:27:43','145215','suneraabishek ',100.00,'CRD'),(2,7,'2022-5-6','23:36:35','200001','Vijini',1000.00,'CRD'),(5,8,'2022-5-6','16:32:22','111223344','qwqa',1000.00,'CRD'),(5,9,'2022-5-6','16:34:31','12761','Hiruni',100.00,'CRD'),(6,10,'2022-5-6','16:40:58','1992761','Abishek',1000.00,'CRD'),(2,11,'2022-5-6','23:53:49','19991119','Ruvina',500.00,'CRD'),(2,12,'2022-5-6','23:55:13','11221211','abilash',1100.00,'CRD'),(5,13,'2022-5-7','3:37:5','112545221','abiyash',100.00,'CRD'),(5,14,'2022-5-7','3:40:8','188219','Subiya',1000.00,'CRD');
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-07 11:29:41
