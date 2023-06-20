-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 20-06-2023 a las 02:52:43
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `almacenes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `cedula` bigint(20) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cedula`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cedula`, `nombres`, `apellidos`, `telefono`, `direccion`, `email`) VALUES
(108800, 'Deisi Yuliet', 'Perez Diaz', '3128783672', 'Pereira', 'deisysoy@gmail.com'),
(108801, 'Juan Camilo', 'Taborda', '1233456', 'Turin', 'camilo.@hotmail.com'),
(108802, 'Juan Pa', 'Garcia Montes', '325243534', 'Pereira', 'juan@outlook.com'),
(108803, 'Daniel Santiago', 'Cardenas Galeano', '3024322036', 'Marsella', 'daniel@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

DROP TABLE IF EXISTS `facturas`;
CREATE TABLE IF NOT EXISTS `facturas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cedula_cliente` bigint(255) DEFAULT NULL,
  `cedula_vendedor` bigint(255) DEFAULT NULL,
  `fecha` text,
  `total` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `ced_cliente_fact` (`cedula_cliente`) USING BTREE,
  KEY `ced_vendedor_fact` (`cedula_vendedor`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `items_factura`
--

DROP TABLE IF EXISTS `items_factura`;
CREATE TABLE IF NOT EXISTS `items_factura` (
  `nombre` varchar(200) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_factura` int(11) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `subtotal` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `id_fact_item` (`id_factura`) USING BTREE,
  KEY `id_prod_item` (`id_producto`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `nombre` (`nombre`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12355 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `descripcion`, `precio`, `cantidad`) VALUES
(1, 'CUADERNOS LC 50', 'Cuaderno Norma de 50 hojas - Linea corriente.', 1500, 73),
(2, 'CUADERNOS LC 100', 'Cuaderno Norma de 100 hojas - Linea corriente.', 2000, 50),
(3, 'CUADERNOS C 50', 'Cuaderno Norma de 50 hojas - Cuadriculado.', 1500, 288),
(4, 'CUADERNOS C 100', 'Cuaderno Norma de 100 hojas - Cuadriculado.', 2500, 390),
(5, 'LAPICERO', 'Kilimetrico - Gris', 810, 445),
(6, 'LAPICERO', 'Kilometrico - Azul', 800, 340),
(7, 'BORRADOR', 'Borrador de Nata blanco', 500, 494);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

DROP TABLE IF EXISTS `vendedores`;
CREATE TABLE IF NOT EXISTS `vendedores` (
  `cedula` bigint(20) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cedula`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`cedula`, `nombres`, `apellidos`, `telefono`, `direccion`, `email`) VALUES
(109900, 'OSCAR ANDRES', 'LOAIZA PABON', '3333333', 'CARRERA 8', 'oscar@email.com'),
(109901, 'JUAN DAVID', 'MONSALVE PEREZ', '3222222', 'CARRERA 20', 'monsalve@mail.com');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `ced_cliente_fact` FOREIGN KEY (`cedula_cliente`) REFERENCES `clientes` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ced_vendedor_fact` FOREIGN KEY (`cedula_vendedor`) REFERENCES `vendedores` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `items_factura`
--
ALTER TABLE `items_factura`
  ADD CONSTRAINT `id_fact_item` FOREIGN KEY (`id_factura`) REFERENCES `facturas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_prod_item` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
