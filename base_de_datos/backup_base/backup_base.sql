CREATE DATABASE  IF NOT EXISTS `app_recetas` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `app_recetas`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: app_recetas
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id_categoria` int NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Baja'),(2,'Media'),(3,'Alta');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_receta`
--

DROP TABLE IF EXISTS `detalle_receta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_receta` (
  `id_detalle` int NOT NULL AUTO_INCREMENT,
  `id_receta` int NOT NULL,
  `titulo` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `tiempo_preparacion` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_detalle`),
  KEY `id_receta` (`id_receta`),
  CONSTRAINT `detalle_receta_ibfk_1` FOREIGN KEY (`id_receta`) REFERENCES `receta` (`id_receta`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_receta`
--

LOCK TABLES `detalle_receta` WRITE;
/*!40000 ALTER TABLE `detalle_receta` DISABLE KEYS */;
INSERT INTO `detalle_receta` VALUES (1,1,'Receta de Galletas de avena','Estas galletas de avena fáciles y rápidas que compartimos están muy ricas y se pueden degustar acompañadas con un chocolate calentito o bien un café. Esta receta es ideal para la gente que le guste la avena tanto como a nosotros y que busquen, a su vez, snacks saludables y caseros, ya que la cantidad utilizada de azúcar es mínima y, además, ofrecemos alternativas más sanas.Si no dispones de mucho tiempo y quieres preparar un dulce sencillo y resultón para desayunar o merendar, prueba esta receta de galletas de avena fáciles de hacer. Quédate con nosotros, descubre cómo hacer galletas de avena y dinos qué te han parecido.','15 minutos'),(2,2,'Receta de Medialunas de manteca saladas','Las medialunas son una de las facturas más elegidas en las panaderías argentinas. Asimismo, generan largos debates alrededor del mate, para identificar cuáles son las mejores. Sin embargo, lo habitual es que las medialunas rellenas de manteca sean dulces, privando de este manjar a los que las prefieren saladas. Por ello, queremos enseñarte a prepararlas en casa de manera sencilla y, aunque lleve un poco de tiempo, te aseguramos que el resultado vale la pena.','180 minutos'),(3,3,'Receta de Tarta Ópera','La tarta Ópera es un clásico de la repostería francesa. Consiste en una tarta muy elaborada con varios pasos, como es costumbre en la alta repostería francesa. La historia de la tarta Ópera, como casi todos los pasteles populares, es algo incierto. Dos son las teorías de creación: la primera es a cargo de un famoso chef pastelero de la época, Louis Clichy, que creó este pastel para la Exposición Culinaria de París, a principio del siglo XX. La segunda teoría, es que fue creada a mitad del siglo XX en la pastelería Dalloyau y le pusieron este nombre como homenaje a la Ópera Garnier de París, ya que los colores de la tarta recuerdan a los mármoles y ébanos de la famosa ópera parisina. Sea como sea su creación, lo cierto es que se ha convertido en una tarta clásica que ha llegado a nuestros días como una de las tartas más ricas de la repostería. Tiene un sabor característico a café, con finas capas de bizcocho Gioconda, ganache de chocolate y crema de mantequilla de café. Si te gusta la repostería, y quieres recrear esta famosa tarta, has venido al lugar adecuado.','240 minutos'),(4,4,'Receta de Bizcocho vegano de yogur','Este bizcocho o pastel vegano fácil de yogur es un postre elaborado únicamente con ingredientes de origen vegetal. Una receta perfecta si eres vegano o tienes alergia al huevo o lácteos. Además, es muy fácil de preparar, con insumos que encuentras en la cocina, ya que solo necesitarás un par de bowls, un batidor globo y un molde.Por ello, queremos enseñarte cómo hacer bizcocho vegano de yogur, un pastel con una miga realmente esponjosa, tierna, al mismo tiempo húmeda y con trocitos crujientes de pecanas y almendras.','90 minutos');
/*!40000 ALTER TABLE `detalle_receta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favorita`
--

DROP TABLE IF EXISTS `favorita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `favorita` (
  `id_favorita` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_receta` int NOT NULL,
  PRIMARY KEY (`id_favorita`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_receta` (`id_receta`),
  CONSTRAINT `favorita_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  CONSTRAINT `favorita_ibfk_2` FOREIGN KEY (`id_receta`) REFERENCES `receta` (`id_receta`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favorita`
--

LOCK TABLES `favorita` WRITE;
/*!40000 ALTER TABLE `favorita` DISABLE KEYS */;
INSERT INTO `favorita` VALUES (1,1,1),(2,1,2),(3,1,3),(4,2,1),(5,2,2),(6,2,4),(7,3,3),(8,3,4);
/*!40000 ALTER TABLE `favorita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `foto`
--

DROP TABLE IF EXISTS `foto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `foto` (
  `id_foto` int NOT NULL AUTO_INCREMENT,
  `id_receta` int NOT NULL,
  `id_detalle` int NOT NULL,
  `ruta_imagen` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_foto`),
  KEY `id_receta` (`id_receta`),
  KEY `id_detalle` (`id_detalle`),
  CONSTRAINT `foto_ibfk_1` FOREIGN KEY (`id_receta`) REFERENCES `receta` (`id_receta`),
  CONSTRAINT `foto_ibfk_2` FOREIGN KEY (`id_detalle`) REFERENCES `detalle_receta` (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foto`
--

LOCK TABLES `foto` WRITE;
/*!40000 ALTER TABLE `foto` DISABLE KEYS */;
INSERT INTO `foto` VALUES (1,1,1,'http://dummyimage.com/138x100.png/dddddd/000000'),(2,1,1,'http://dummyimage.com/237x100.png/cc0000/ffffff'),(3,1,1,'http://dummyimage.com/227x100.png/ff4444/ffffff'),(4,1,1,'http://dummyimage.com/220x100.png/dddddd/000000'),(5,2,2,'http://dummyimage.com/207x100.png/5fa2dd/ffffff'),(6,2,2,'http://dummyimage.com/132x100.png/cc0000/ffffff'),(7,2,2,'http://dummyimage.com/125x100.png/dddddd/000000'),(8,2,2,'http://dummyimage.com/229x100.png/dddddd/000000'),(9,2,2,'http://dummyimage.com/198x100.png/ff4444/ffffff'),(10,2,2,'http://dummyimage.com/101x100.png/cc0000/ffffff'),(11,2,2,'http://dummyimage.com/195x100.png/5fa2dd/ffffff'),(12,2,2,'http://dummyimage.com/179x100.png/dddddd/000000'),(13,2,2,'http://dummyimage.com/100x100.png/cc0000/ffffff'),(14,2,2,'http://dummyimage.com/137x100.png/cc0000/ffffff'),(15,2,2,'http://dummyimage.com/177x100.png/ff4444/ffffff'),(16,3,3,'http://dummyimage.com/198x100.png/cc0000/ffffff'),(17,3,3,'http://dummyimage.com/221x100.png/5fa2dd/ffffff'),(18,3,3,'http://dummyimage.com/225x100.png/dddddd/000000'),(19,3,3,'http://dummyimage.com/194x100.png/ff4444/ffffff'),(20,3,3,'http://dummyimage.com/208x100.png/dddddd/000000'),(21,3,3,'http://dummyimage.com/101x100.png/cc0000/ffffff'),(22,3,3,'http://dummyimage.com/249x100.png/dddddd/000000'),(23,3,3,'http://dummyimage.com/186x100.png/5fa2dd/ffffff'),(24,3,3,'http://dummyimage.com/236x100.png/cc0000/ffffff'),(25,3,3,'http://dummyimage.com/115x100.png/cc0000/ffffff'),(26,3,3,'http://dummyimage.com/218x100.png/dddddd/000000'),(27,3,3,'http://dummyimage.com/221x100.png/ff4444/ffffff'),(28,3,3,'http://dummyimage.com/214x100.png/ff4444/ffffff'),(29,3,3,'http://dummyimage.com/158x100.png/cc0000/ffffff'),(30,3,3,'http://dummyimage.com/232x100.png/cc0000/ffffff'),(31,3,3,'http://dummyimage.com/118x100.png/ff4444/ffffff'),(32,3,3,'http://dummyimage.com/113x100.png/5fa2dd/ffffff'),(33,3,3,'http://dummyimage.com/102x100.png/5fa2dd/ffffff'),(34,3,3,'http://dummyimage.com/123x100.png/cc0000/ffffff'),(35,3,3,'http://dummyimage.com/201x100.png/ff4444/ffffff'),(36,4,4,'http://dummyimage.com/233x100.png/ff4444/ffffff'),(37,4,4,'http://dummyimage.com/194x100.png/cc0000/ffffff'),(38,4,4,'http://dummyimage.com/211x100.png/5fa2dd/ffffff'),(39,4,4,'http://dummyimage.com/235x100.png/5fa2dd/ffffff'),(40,4,4,'http://dummyimage.com/208x100.png/ff4444/ffffff'),(41,4,4,'http://dummyimage.com/244x100.png/ff4444/ffffff'),(42,4,4,'http://dummyimage.com/161x100.png/ff4444/ffffff'),(43,4,4,'http://dummyimage.com/111x100.png/5fa2dd/ffffff'),(44,4,4,'http://dummyimage.com/107x100.png/dddddd/000000');
/*!40000 ALTER TABLE `foto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingrediente`
--

DROP TABLE IF EXISTS `ingrediente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingrediente` (
  `id_ingrediente` int NOT NULL AUTO_INCREMENT,
  `descripcion_ingrediente` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_detalle` int NOT NULL,
  PRIMARY KEY (`id_ingrediente`),
  KEY `id_detalle` (`id_detalle`),
  CONSTRAINT `ingrediente_ibfk_1` FOREIGN KEY (`id_detalle`) REFERENCES `detalle_receta` (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingrediente`
--

LOCK TABLES `ingrediente` WRITE;
/*!40000 ALTER TABLE `ingrediente` DISABLE KEYS */;
INSERT INTO `ingrediente` VALUES (1,'120 gramos de avena en copos suaves (hojuelas)',1),(2,'40 gramos de harina (de trigo o de avena)',1),(3,'40 gramos de azúcar (moreno o blanco)',1),(4,'1 huevo',1),(5,'60 mililitros de aceite de girasol',1),(6,'1 cucharadita de levadura en polvo (polvos de hornear)',1),(7,'1 cucharadita de canela molida',1),(8,'1 pellizco de sal',1),(9,'60 centímetros cúbicos de leche tibia',2),(10,'50 gramos de harina 0000',2),(11,'1 cucharadita de azúcar',2),(12,'15 gramos de levadura fresca',2),(13,'70 gramos de manteca pomada',2),(14,'25 gramos de harina 0000',2),(15,'225 gramos de harina 0000',2),(16,'60 centímetros cúbicos de leche tibia',2),(17,'1 huevo',2),(18,'1 cucharadita de sal',2),(19,'100 gramos de azúcar (½ taza)',3),(20,'75 mililitros de agua',3),(21,'2 cucharadas soperas de café soluble',3),(22,'100 gramos de almendra molida',3),(23,'100 gramos de azúcar glas',3),(24,'3 huevos M',3),(25,'25 gramos de mantequilla sin sal fundida',3),(26,'25 gramos de harina común',3),(27,'3 claras de huevo M',3),(28,'50 gramos de azúcar blanca granulada',3),(29,'50 gramos de chocolate negro de postres para pincelar',3),(30,'150 mililitros de agua',3),(31,'75 gramos de azúcar',3),(32,'2 cucharadas soperas de extracto de café casero',3),(33,'100 gramos de chocolate negro',3),(34,'125 mililitros de nata para montar',3),(35,'15 gramos de mantequilla',3),(36,'150 gramos de azúcar (¾ taza)',3),(37,'50 mililitros de agua',3),(38,'2 huevos M',3),(39,'200 gramos de mantequilla sin sal a temperatura ambiente',3),(40,'2 cucharadas soperas de extracto de café casero',3),(41,'200 gramos de chocolate negro',3),(42,'25 mililitros de aceite de semillas',3),(43,'100 gramos de yogur vegano',4),(44,'4 gramos de vinagre',4),(45,'50 gramos de aceite',4),(46,'150 gramos de harina',4),(47,'10 gramos de maicena',4),(48,'4 gramos de bicarbonato de sodio',4),(49,'90 gramos de azúcar',4),(50,'220 gramos de almendras tostadas',4),(51,'35 gramos de pecanas tostadas',4),(52,'100 gramos de leche de almendras',4),(53,'1 pizca de sal',4);
/*!40000 ALTER TABLE `ingrediente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paso`
--

DROP TABLE IF EXISTS `paso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paso` (
  `id_paso` int NOT NULL AUTO_INCREMENT,
  `id_detalle` int NOT NULL,
  `descripcion_paso` text COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_paso`),
  KEY `id_detalle` (`id_detalle`),
  CONSTRAINT `paso_ibfk_1` FOREIGN KEY (`id_detalle`) REFERENCES `detalle_receta` (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paso`
--

LOCK TABLES `paso` WRITE;
/*!40000 ALTER TABLE `paso` DISABLE KEYS */;
INSERT INTO `paso` VALUES (1,1,'Mezcla todos los ingredientes en un bol hasta formar una pasta. Si dispones de un robot mezclador, mucho mejor, pero si no es así, puedes mezclar con una espátula. Puedes usar azúcar blanco, azúcar moreno o panela. En cuanto a la harina, puede ser de trigo o de avena. Para este último caso, te recomendamos consultar la Receta de harina de avena casera.'),(2,1,'Forra la bandeja del horno con papel sulfurizado o vegetal y forma las galletas de avena haciendo pequeñas bolas con las manos y luego aplastándolas. Para obtener unas galletas de avena crujientes, el truco está en no hacerlas muy gruesas. Truco: A nosotros nos salieron 12 galletas.'),(3,1,'Con el horno precalentado a 200 ºC con calor arriba y abajo y con la función de ventilador (en caso de tenerla), hornea las galletas de avena durante unos 10 minutos o hasta que estén doraditas. Deben quedar ligeramente tostadas, no mucho.'),(4,1,'Pasado ese tiempo, deja que las galletas de avenase enfríen y guárdalas en una caja o bote cerrado para que sigan crujientes. ¡Duran hasta 3 días! Como ves, esta es una receta de galletas de avena fáciles de hacer, ideal para niños y adultos porque son rapidísimas y muy saludables (sobre todo si usas azúcar moreno o panela).'),(5,2,'El primer paso para comenzar la receta de medialunas caseras consiste en preparar la esponja. Coloca en un recipiente la levadura, diluye con la leche tibia y, luego, incorpora los 50 gramos de harina y la cucharadita de azúcar. Mezcla bien y deja reposar 10-15 minutos.Truco: el azúcar que se incorpora en este paso no endulza la masa, pero ayuda al proceso de activación de la levadura. Sin embargo, en caso de no poder consumir azúcar, puedes evitar agregar.'),(6,2,'En un recipiente grande, mezcla la harina con la sal y realiza un hueco en el centro. Vierte allí el huevo, la esponja que preparamos en el primer paso y el resto de la leche también tibia.'),(7,2,'Incorpora del centro hacia afuera y comienza a armar el bollo. Cuando lo hayas hecho, lleva a la mesada y amasa por al menos 5 minutos. Cubre y deja reposar por 15 minutos.Truco: recuerda que la cantidad de líquido puede variar, por ello, te recomendamos tener a mano un poco más de leche, por si es necesario agregar más. Siempre recuerda incorporar poco a poco para no pasarte.'),(8,2,'En otro recipiente, mezcla los ingredientes del empaste, es decir, la manteca pomada con 25 gramos de harina.'),(9,2,'Estira la masa bien fina sobre la mesada dándole forma rectangular. Coloca en el centro el empaste, dejando 2 centímetros arriba y abajo.'),(10,2,'Cubre doblando en 3 la masa (como ves en la foto) Aplasta un poco el rodillo con cuidado que no se salga la manteca. Envuelve en papel film y lleva a la heladera por 20 minutos.'),(11,2,'Retira la masa de la heladera, vuelve a estirar en forma rectangular, y repite los dobleces en el sentido contrario a los realizados la primera vez. Cubre, lleva a la heladera por otros 20 minutos y, luego, repite este paso por tercera vez.'),(12,2,'Enciende el horno para precalentar a 200 °C y engrasa una fuente. Luego, retira la masa de la heladera, estira y corta en forma de triángulos. Utiliza un cuchillo filoso y sin serrucho para no arruinar las láminas de hojaldre que formamos durante todo el proceso.'),(13,2,'Enrolla desde la base hacia el vértice opuesto y forma las medialunas argentinas, coloca sobre la asadera. Puedes dejarlas sin arquear y quedarán con forma de croissant. Cubre y deja leudar 15 minutos. Lleva al horno hasta que estén doradas (alrededor de 15 minutos)'),(14,2,'Retira las medialunas de manteca saladas del horno, prepara el mate y listas paracomer. Cuéntanos en los comentarios tu opinión y comparte con nosotros una fotografía del resultado final.'),(15,3,'Para empezar con la receta de la tarta Ópera, primero deberás hacer extracto de café casero. Para ello, lleva a ebullición el agua y disuelve en ella las cucharadas soperas de café soluble y remueve. Luego, prepara un caramelo rubio con el azúcar. Así pues, pon el azúcar en una sartén amplia y pon al fuego. No debes removerlo con una cuchara, aunque sí que puedes remover un poco la sartén para homogeneizar el azúcar. Una vez tengas el caramelo hecho, retira del fuego y añade el extracto de café disuelto en agua caliente junto con el caramelo. Remueve constantemente y vuelve a poner al fuego hasta que se disuelvan los grumos. A continuación, retira del fuego, vierte en un pequeño bote y reserva.'),(16,3,'A continuación, prepara el bizcocho Gioconda. Para ello, pon en un bol la almendra molida, el azúcar glass y los huevos. Seguido, bate con unas varillas eléctricas, primero a potencia suave y después a potencia más fuerte. Señalamos que debe estar muy bien montado, entre 5-7 minutos. Seguido, funde la mantequilla y añade a la masa del bizcocho Gioconda, pero esta vez mezcla con una espátula para no bajar la masa cremosa que has obtenido con las varillas.'),(17,3,'Tamiza la harina encima y vuelve a mezclar suavemente con la espátula. Reserva.'),(18,3,'Precalienta el horno a 180 ºC. Bate las claras con unas varillas eléctricas y cuando estén casi montadas, añade el azúcar blanco granulado y sigue batiendo hasta que estén montadas firmes. Ve añadiendo poco a poco las claras a la mezcla del bizcocho Gioconda removiendo con movimientos envolventes.'),(19,3,'Forra una bandeja de unos 40x30 cm con papel de horno y extiende la masa del bizcocho en ella de forma suave con una espátula llegando hasta los bordes de la bandeja. A continuación, hornea a 180 ºC con calor arriba y abajo durante 8-7 minutos o hasta que esté dorada.'),(20,3,'Una vez horneado el bizcocho, deja enfriar en una rejilla por completo. Cuando esté frío, corta tres planchas de bizcocho. Con un rectángulo de repostería de unos 18x18 cm corta dos planchas de bizcochos iguales. La tercera, retira con los recortes que sobran de la plancha. Truco: si no tienes un molde de esa medida, puedes hacerte uno con un cartón forrado y papel de aluminio.'),(21,3,'Trocea el chocolate y funde en el microondas a pequeños golpes de calor. Una vez fundido, extiende con una espátula una capa fina solo en una de las planchas cortadas. Seguido, deja que se endurezca. Reserva las tres planchas hasta el momento del montaje de la tarta Ópera tradicional.'),(22,3,'Para preparar la ganache de chocolate, primero pica el chocolate negro. Seguido, lleva a ebullición la nata, retira del fuego y añade el chocolate picado, remueve hasta que se deshaga. Trocea la mantequilla y añade también. Mezcla todo bien y deja enfriar, lleva a la nevera hasta que empiece a solidificarse. Si la haces con mucha antelación, antes de usar deberás batirla para que quede con una textura untable. Truco: si quieres acelerar su enfriamiento, puedes meter la ganache en el congelador unos 30 minutos para que tome cuerpo y puedas usarla en ese momento.'),(23,3,'Para realizar la crema de mantequilla de café, pon el azúcar y el agua en un cazo y lleva a ebullición, cuece a fuego medio durante 14 minutos o hasta alcanzar los 110 ºC. En el momento de tener el almíbar y el azúcar a esa temperatura, bate los huevos con unas varillas eléctricas, retira del fuego y ve añadiendo en un hilo fino los huevos mientras bates a velocidad suave. Una vez tengas añadido todo el almíbar casero, zaumenta un poco la velocidad. Truco: bate constantemente hasta que observes que las paredes del bol se enfrían.'),(24,3,'Es el momento de añadir la mantequilla. Para ello, debe estar a temperatura ambiente y muy cremosa, este paso es importante, pues si la mantequilla está fría, se podría cortar la crema.'),(25,3,'Incorpora el extracto de café casero y bate de nuevo, pero lo justo para integrarlo. Lo ideal es usar la crema de mantequilla de café inmediatamente para el montaje de la tarta Ópera fácil, pero si aún no lo vas a hacer, reserva en la nevera, solo tendrás que volver a batirla un poco de nuevo para usarla, pues al enfriar se endurece.'),(26,3,'Prepara un sirope de café. Para ello, pon un cazo al fuego con agua, azúcar y extracto de café casero, deja cocer dos minutos y retira del fuego. Coge la plancha de bizcocho Gioconda que habías pincelado de chocolate y forra el molde cuadrado que tenías de 18x18 cm con papel de horno para que no se pegue y la puedas desmoldar bien. Coloca la plancha de bizcocho en su interior con la capa de chocolate hacia abajo. Seguido, empapa bien la parte de arriba con el sirope de café.'),(27,3,'Separa la crema de mantequilla de café en dos partes iguales, pésala si es necesario, pues va a ser una capa muy finita. Coloca la primera mitad encima de la plancha del bizcocho extendiendo bien, también por los bordes.'),(28,3,'Para la capa intermedia, utiliza la plancha de bizcochos con los recortes. Esta vez, pincela bien con el sirope de café las dos caras. Seguido, coloca encima la capa de mantequilla de café y presiona ligeramente.'),(29,3,'A continuación, extiende la ganache de chocolate. ¿Qué te está pareciendo esta torta Ópera original? Truco: si se ha enfriado mucho y se ha quedado muy dura, tienes que batir unos segundos hasta que se vuelva más manejable.'),(30,3,'Coloca la última plancha del bizcocho de la tarta Ópera. Recuerda antes empapar bien con el sirope de café por las dos caras. Truco: presiona ligeramente cuando la coloques en la tarta Ópera.'),(31,3,'Cubre la última parte con la mitad de crema de mantequilla de café y alisa bien. Reserva en la nevera durante dos horas para que la tarta compacte.'),(32,3,'Cuando la tarta esté compacta, prepara el glaseado de chocolate. Para ello, trocea el chocolate y funde en el microondas a pequeños golpes, remueve y añade en un hilo el aceite de semillas mientras mezclas hasta conseguir un glaseado uniforme. Vierte el glaseado encima de la tarta Ópera clásica poco a poco y reparte por toda la capa superior de la tarta. Deja enfriar, puedes hacerlo en la nevera. Una vez cuajado el glaseado, retira el molde y el papel de horno de alrededor de la tarta con cuidado.'),(33,3,'Si quieres decorarla, puedes hacer como hemos hecho nosotros, imprimiendo una pequeña clave de sol en un papel, calcarla y cubrir de chocolate blanco fundido. Guarda la tarta en la nevera y consume en un máximo de tres días. ¡Lista para comer la tarta Ópera!'),(34,4,'Empieza untando con mantequilla un molde para horno de 18 cm, también recorta un disco de papel manteca para introducir en la base y cuando quede bien adherido, enharínalo. También puedes usar un aro para horno, solo forra la base con papel aluminio y reserva.'),(35,4,'En un bowl comienza vertiendo los ingredientes líquidos, es decir, el yogur vegano, la leche de almendras o la leche vegetal de tu preferencia, el vinagre (cualquier clase estará bien: vinagre de manzana, blanco, tinto o de arroz). Además, añade el aceite, puedes utilizar aceite de palta, aceite de coco tibio o aceite de oliva, este último al tener un sabor fuerte puedes combinarlo con los otros tipos de aceites. Mezcla con un batidor de globo hasta obtener una mezcla homogénea donde el aceite se disperse en el yogur y la leche.'),(36,4,'Aparte, en otro bowl grande, cierne la harina, la maicena, el bicarbonato de sodio y la piza de sal. Termina de mezclar todos los ingredientes secos, en otras palabras, incorpora el azúcar, mezcla bien y forma un hueco en el centro. Truco: si deseas puedes saborizar con especias en polvo como canela, anís, cardamomo, clavo de olor, entre otros.'),(37,4,'En este hoyo vierte poco a poco los ingredientes líquidos, mezclando vigorosamente con el batidor de globo del centro hacia afuera. Cuando todos los grumos se hayan disuelto, reserva. Truco: si la masa del bizcocho vegano saludable está muy densa, puedes agregar un chorrito de leche o yogur.'),(38,4,'En una tabla, pica los frutos secos rústicamente, pueden ser pecanas, almendras, pistachos o castañas. Luego, colócalos en un bowl y empólvalos con un poco de harina.'),(39,4,'Seguidamente, viértelos en la masa y mezcla con una espátula de goma.'),(40,4,'Vierte la masa en el molde o aro, sacude un poco para que se empareje. Hornea a 170 °C por 40 minutos o hasta que la superficie se vea dorada e insertes un palillo y salga sin ningún residuo.'),(41,4,'Cuando el bizcocho vegano esponjoso esté listo, retíralo del horno, deja enfriar a temperatura ambiente, desmolda, decora y sirve. ¡A disfrutar!');
/*!40000 ALTER TABLE `paso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receta`
--

DROP TABLE IF EXISTS `receta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receta` (
  `id_receta` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_usuario` int NOT NULL,
  `id_categoria` int NOT NULL,
  PRIMARY KEY (`id_receta`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_categoria` (`id_categoria`),
  CONSTRAINT `receta_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  CONSTRAINT `receta_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receta`
--

LOCK TABLES `receta` WRITE;
/*!40000 ALTER TABLE `receta` DISABLE KEYS */;
INSERT INTO `receta` VALUES (1,'Galletas de avena',1,1),(2,'Medialunas de manteca saladas',2,2),(3,'Tarta opera',3,3),(4,'Bizcocho vegano de yogur',1,1);
/*!40000 ALTER TABLE `receta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seguimiento`
--

DROP TABLE IF EXISTS `seguimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seguimiento` (
  `id_seguimiento` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_usuario_seguido` int NOT NULL,
  PRIMARY KEY (`id_seguimiento`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_usuario_seguido` (`id_usuario_seguido`),
  CONSTRAINT `seguimiento_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  CONSTRAINT `seguimiento_ibfk_2` FOREIGN KEY (`id_usuario_seguido`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seguimiento`
--

LOCK TABLES `seguimiento` WRITE;
/*!40000 ALTER TABLE `seguimiento` DISABLE KEYS */;
INSERT INTO `seguimiento` VALUES (1,1,2),(2,1,3),(3,2,1),(4,2,3),(5,3,1),(6,3,2);
/*!40000 ALTER TABLE `seguimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuario` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `clave` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Paddy','Hexum','pad@gmail.com','pad12','p1234'),(2,'Edita','Waddington','edit@gmail.com','edit56','e5678'),(3,'Brandyn','Bernath','bran@gmail.com','bern34','b3456');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-02 20:18:47
