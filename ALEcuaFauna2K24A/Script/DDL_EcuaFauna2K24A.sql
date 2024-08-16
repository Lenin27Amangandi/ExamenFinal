-- database: ../DataBase/EcuaFauna2K24A.SQLite
DROP TABLE IF EXISTS Hormiga;
DROP TABLE IF EXISTS IngestaNativa;
DROP TABLE IF EXISTS GenoAlimento;
DROP TABLE IF EXISTS TipoHormiga;
DROP TABLE IF EXISTS AlimentoTipo;
DROP TABLE IF EXISTS Ecuador;
DROP TABLE IF EXISTS Catalogo;
DROP TABLE IF EXISTS CatalogoTipo;
DROP TABLE IF EXISTS Entomologos;

CREATE TABLE CatalogoTipo(
    IdCatalogoTipo INTEGER PRIMARY KEY AUTOINCREMENT,     
    Nombre         VARCHAR(50) NOT NULL,
    Estado         VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X')),
    FechaCrea      DATETIME DEFAULT (DATETIME('now', 'localtime')),
    FechaModifica  DATETIME 
);
CREATE TABLE Catalogo(
    IdCatalogo     INTEGER PRIMARY KEY AUTOINCREMENT,
    IdCatalogoTipo INTEGER REFERENCES CatalogoTipo(IdCatalogoTipo),
    Nombre         VARCHAR(50) NOT NULL,
    Estado         VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X')),
    FechaCrea      DATETIME DEFAULT (DATETIME('now', 'localtime')),
    FechaModifica  DATETIME 
);

CREATE TABLE Localidad(
    IdLocalidad       INTEGER PRIMARY KEY AUTOINCREMENT,
    IdLocaliadPadre   INTEGER REFERENCES Localidad (IdLocalidad), 
    IdCatalogo        INTEGER REFERENCES Catalogo (IdCatalogo),
    Nombre            VARCHAR(50) NOT NULL,
    Estado            VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X')),
    FechaCrea         DATETIME DEFAULT (DATETIME('now', 'localtime')),
    FechaModifica     DATETIME 
);

CREATE TABLE IngestaNativa(
    IdIngestaNativa   INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre            VARCHAR(50) NOT NULL,
    Estado            VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X')),
    FechaCrea         DATETIME DEFAULT (DATETIME('now', 'localtime')),
    FechaModifica     DATETIME 
);

CREATE TABLE GenoAlimento(
    IdGenoAlimento   INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre            VARCHAR(50) NOT NULL,
    Estado            VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X')),
    FechaCrea         DATETIME DEFAULT (DATETIME('now', 'localtime')),
    FechaModifica     DATETIME 
);

CREATE TABLE TipoHormiga(
    IdTipoHormiga     INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre            VARCHAR(50) NOT NULL,
    Estado            VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X')),
    FechaCrea         DATETIME DEFAULT (DATETIME('now', 'localtime')),
    FechaModifica     DATETIME 
);

CREATE TABLE Hormiga(
    IdHormiga         INTEGER PRIMARY KEY AUTOINCREMENT,
    TipoHormiga       INTEGER REFERENCES TipoHormiga(IdTipoHormiga),
    Sexo              INTEGER REFERENCES Catalogo(IdCatalogo),
    Provincia         INTEGER REFERENCES Localidad (IdLocalidad),
    GenoAlimento      INTEGER REFERENCES GenoAlimento(IdGenoAlimento),
    IngestaNativa     INTEGER REFERENCES IngestaNativa(IdIngestaNativa),
    Estado            VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','X')),
    FechaCrea         DATETIME DEFAULT (DATETIME('now', 'localtime')),
    FechaModifica     DATETIME 
);
