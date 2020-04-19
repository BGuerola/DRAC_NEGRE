package com.example.dracnegre.Model;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import com.example.dracnegre.llistalocals;

public class MySQLiteHelper extends SQLiteOpenHelper {


    private static String DATABASE_NAME = "DracNegre";
    private static int DATABASE_VERSION = 1; // Telèfono en un camp a part + camp Adresa

    //SQL sentence to create a table Poblacions. Pròxima versió: Canviar poblacio per nom!!!
    String sqlDeletePobalcions =  "DROP TABLE Poblacions;";
    String sqlCreatePoblacions =  "CREATE TABLE Poblacions (ordre TEXT PRIMARY KEY, nomCiutat TEXT NOT NULL, nomClub TEXT, direccio TEXT, numTelf TEXT, latitut REAL, longitut REAL) ";

    String sqlInsertPoblacio1 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('1','Alaquas','C.A. Alaquàs' ,'Plaça de la Constitució, 1 46970 ALAQUÀS','686009679',39.3970134,-0.4138396)";
    String sqlInsertPoblacio2 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('2','Alborache','C.A. Alborache Piccadilly', 'Pz España nº4 (Escuelas Antiguas) 46369 ALBORACHE','626516426',39.3929035,-0.7743851)";
    String sqlInsertPoblacio3 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('3','Aldaia','C.A. Aldaia Educart','Polideportivo Aldaia C/ Joaquin Blume S/N. 46960 ALDAIA','654136346',39.4606223,-0.4596357)";
    String sqlInsertPoblacio4 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('4','Alzira','C.A. Alzira','C/ Pedro Morell,6. 46600. ALZIRA', '667410433', '39.1491082','-0.4405458,17')";
    String sqlInsertPoblacio5 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('5','Basilio','C.D. Basilio.', '46008. VALENCIA', '626816690','39.4727535','-0.389589,13')";
    String sqlInsertPoblacio6 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('6','Benimaclet','C.A. Gambito-Benimaclet','Daniel Balaciart s/n Polideportivo Benimaclet. 46020 VALENCIA','647484846','39.4810591','-0.3545263,17')";
    String sqlInsertPoblacio7 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('7','Buñol','C.A.BUÑOL', 'Plaza la Yana 2bis (28,93 km). 46360 BUÑOL','39.4170123','39.4170123','-0.7888384,17')";
    String sqlInsertPoblacio8 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('8','Burjassot','C.A. Burjassot','C/ Bautista Riera 8 (Círculo Católico). 46100 BURJASSOT','699424531','39.5053766','-0.4078544,17')";
    String sqlInsertPoblacio9 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('9','Ciutat Vella','C.A. Ciutat Vella','C/ Paseo La Pechina 42. 46008 VALENCIA', '626816690','39.475888','-0.393696,17')";
    String sqlInsertPoblacio10 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('10','Dama Roja','C.A. Dama Roja','C/Luis Santángel, 30. 46006 VALENCIA', '600329826','39.4612416','-0.3666761,17')";
    String sqlInsertPoblacio11 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('11','Gandia','C.A. Fomento de Gandia','C/SAN FRANCISCO DE BORJA, 56. 46701 GANDIA','615363141','38.9658895','-0.1829014,17')";
    String sqlInsertPoblacio12 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('12','Massanassa','C.A. Massanassa','Calle Gregorio Mayans, 8 bajo. 46470 MASSANASSA','615395801','39.4110476','-0.401376,17')";
    String sqlInsertPoblacio13 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('13','Mislata','C.A. Mislata Lanjarón Discema','C/ Felipe Bellver, 43. 46920 MISLATA','679921256','39.47524','-0.411274,17')";
    String sqlInsertPoblacio14 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('14','Moncada','C.A. Moncada FDM','C/Luis Vives, 18-1º. 43113 MONCADA', '625858706','39.5458423','-0.3946106,17')";
    String sqlInsertPoblacio15 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('15','Monserrat','C.E. Montserrat','Hogar Jubilados, c/ Mayor. 46192 MONTSERRAT','607154928','39.3564934','-0.5997589,14')";
    String sqlInsertPoblacio16 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('16','Quart','C.A. Ajedrez Quart','Pza País Valenciano , nº 7. 46930 Quart de Poblet','000000000','39.4780371','-0.4225869,17')";
    String sqlInsertPoblacio17 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('17','Torrefiel','C.A. Torrefiel','Asociación cívica El Ventanal, C/ Fray Pedro Vives,13-15. 46009 VALENCIA','656622191','39.4867701','-0.3737708,17')";
    String sqlInsertPoblacio18 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('18','Xativa','C.E. Xátiva','Carrer Abu Masaifa, 9. 46800 XATIVA','601206585','38.9893469','-0.5274009,17')";
    String sqlInsertPoblacio19 = "INSERT INTO Poblacions (ordre, nomCiutat, nomClub, direccio, numTelf, latitut, longitut) " +
            "VALUES ('19','Xeraco','C.A. Xeraco','Plaça del Quartell, s/n (Centre Cívic). 46670 XERACO','657160043','39.3843647','-0.2402383,8')";


    // The constructor: Create the database
    public MySQLiteHelper(Context context) {
        super(context , DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Called if the DB is accessed but not yet created
    @Override
    public void onCreate(SQLiteDatabase db) {
        createSentences(db);
    }

    // Called, if the database version is increased in your application code.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(sqlDeletePobalcions);
        db.execSQL(sqlCreatePoblacions);
        db.execSQL(sqlInsertPoblacio1);
        db.execSQL(sqlInsertPoblacio2);
        db.execSQL(sqlInsertPoblacio3);
        db.execSQL(sqlInsertPoblacio4);
        db.execSQL(sqlInsertPoblacio5);
        db.execSQL(sqlInsertPoblacio6);
        db.execSQL(sqlInsertPoblacio7);
        db.execSQL(sqlInsertPoblacio8);
        db.execSQL(sqlInsertPoblacio9);
        db.execSQL(sqlInsertPoblacio10);
        db.execSQL(sqlInsertPoblacio11);
        db.execSQL(sqlInsertPoblacio12);
        db.execSQL(sqlInsertPoblacio13);
        db.execSQL(sqlInsertPoblacio14);
        db.execSQL(sqlInsertPoblacio15);
        db.execSQL(sqlInsertPoblacio16);
        db.execSQL(sqlInsertPoblacio17);
        db.execSQL(sqlInsertPoblacio18);
        db.execSQL(sqlInsertPoblacio19);

    }

    protected void createSentences (SQLiteDatabase db) {
        db.execSQL(sqlCreatePoblacions);
        db.execSQL(sqlInsertPoblacio1);
        db.execSQL(sqlInsertPoblacio2);
        db.execSQL(sqlInsertPoblacio3);
        db.execSQL(sqlInsertPoblacio4);
        db.execSQL(sqlInsertPoblacio5);
        db.execSQL(sqlInsertPoblacio6);
        db.execSQL(sqlInsertPoblacio7);
        db.execSQL(sqlInsertPoblacio8);
        db.execSQL(sqlInsertPoblacio9);
        db.execSQL(sqlInsertPoblacio10);
        db.execSQL(sqlInsertPoblacio11);
        db.execSQL(sqlInsertPoblacio12);
        db.execSQL(sqlInsertPoblacio13);
        db.execSQL(sqlInsertPoblacio14);
        db.execSQL(sqlInsertPoblacio15);
        db.execSQL(sqlInsertPoblacio16);
        db.execSQL(sqlInsertPoblacio17);
        db.execSQL(sqlInsertPoblacio18);
        db.execSQL(sqlInsertPoblacio19);
    }

}