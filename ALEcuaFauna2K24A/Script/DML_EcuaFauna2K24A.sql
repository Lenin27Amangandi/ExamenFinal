-- database: ../DataBase/EcuaFauna2K24A.SQLite
INSERT INTO CatalogoTipo(Nombre) VALUES
('Localidad'),          --idCatalogoTipo1
('Sexo');               --idCatalogoTipo2 

INSERT INTO Catalogo(IdCatalogoTipo,Nombre) VALUES
(1,'Pais'),             --idCatalogo1
(1,'Region'),           --idCatalogo2
(1,'Provincia'),        --idCatalogo3
(2,'Macho'),            --idCatalogo4
(2,'Hembra'),           --idCatalogo5
(2,'Asexual');          --idCatalogo6

INSERT INTO Localidad(IdLocaliadPadre,IdCatalogo,Nombre) VALUES
(NULL,1,'Ecuador'),
(1,2,'Sierra'),
(1,2,'Oriente'),
(1,2,'Costa'),
(1,2,'Insular'),
(2,2,'Carchi'),
(2,2,'Imbabura'),
(2,2,'Pichincha'),
(2,2,'Cotopaxi'),
(2,2,'Tunguragua'),
(2,2,'Bolivar'),
(2,2,'Chimborazo'),
(2,2,'Cañar'),
(2,2,'Azuay'),
(2,2,'Loja'),
(3,2,'Sucumbios'),
(3,2,'Napo'),
(3,2,'Orellana'),
(3,2,'Pastaza'),
(3,2,'Morona Santiago'),
(3,2,'Zamora Chinchipe'),
(4,2,'Esmeraldas'),
(4,2,'Santo Domingo de los Tsachilas'),
(4,2,'Manabi'),
(4,2,'Los Rios'),
(4,2,'Guayas'),
(4,2,'Santa Elena'),
(4,2,'El Oro'),
(5,2,'Galapagos');

INSERT INTO IngestaNativa (Nombre) VALUES
('Carnivoro'),
('Herviboro'),
('Omnivoro'),
('Insectivoro');

INSERT INTO GenoAlimento (Nombre) VALUES
('X'),
('XX'),
('XY');

INSERT INTO TipoHormiga (Nombre) VALUES
('Hormiga Larva'),
('Hormiga Soldado'),
('Hormiga Rastrera'),
('Hormiga Reina'),
('Hormiga Bala'),
('Hormiga Bulldog Gigante'),
('Hormiga de Fuego'),
('Hormiga Guerrera'),
('Hormiga Cortadora de hojas'),
('Hormiga Carpintera'),
('Hormiga Faraona'),
('Hormiga Casera olorosa'),
('Hormiga del Pavimento');

INSERT INTO Hormiga(TipoHormiga,Sexo,Provincia,GenoAlimento,IngestaNativa)VALUES
(2,4,17,1,1);

SELECT IdHormiga
    ,TipoHormiga
    ,Sexo 
    ,Provincia
    ,GenoAlimento
    ,IngestaNativa
    FROM Hormiga 
    WHERE Estado = 'A' 
    AND IdHormiga = 1;

DROP TABLE IF EXISTS Administrador;
    CREATE TABLE Administrador(
    nAdmin INTEGER PRIMARY KEY AUTOINCREMENT,
    Usuario TEXT NOT NULL,
    Contraseña TEXT CHECK(length(contraseña) = 6) NOT NULL UNIQUE,
    Estado VARCHAR(1) NOT NULL DEFAULT('A'),
    FechaCrea DATETIME DEFAULT(datetime('now','localtime')),
    FechaModifica DATETIME);

    INSERT INTO Administrador(Usuario,Contraseña) VALUES
    ("pat_mic",'123456');