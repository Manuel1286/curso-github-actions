package utils;

import static constants.ConstantLogin.LOGIN_DATA_KEY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import constants.ConstantsForgetPasword;
import interactions.ValidateDemo;
import java.util.Arrays;
import models.DocumentType;
import models.UserLoginData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import ui.login.DemoPage;

public class DataManager {
  private DataManager() { }

  enum Users {
    RICARDO("Ricardo", "usuario para login exitoso") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "1143346807", "1234", "", "", "");
      }
    },
    CRISTIAN("Cristian", "usuario con cedula de extranjeria") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA_EXTRANJERIA, "203174", "1234", "35978297", "", "");
      }
    },
    DAVID("David", "usuario con pasaporte") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.PASAPORTE, "2003479", "1234", "", "", "");
      }
    },
    ALEJANDRO("Alejandro", "usuario con tarjeta de identidad") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.TARJETA_IDENTIDAD, "1097501751", "1234", "", "", "");
      }
    },
    GERMAN("German", "usuario con tarjeta de identidad, ingreso con TD") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.TARJETA_IDENTIDAD, "1097503474", "1234", "", "", "4971");
      }
    },
    DANIEL("Daniel", "usuario para login exitoso con cuenta de ahorro y cte") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA,
            "1011458968",
            "1234",
            ConstantsForgetPasword.SAVING_ACCOUNT,
            "000314666",
            "");
      }
    },
    ANDRES("Andres", "usuario para login exitoso con cuenta ahorro, TC y CDT") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42094912", "1234", "", "", "");
      }
    },
    JOSUE("Josue", "usuario para pruebas de smoke test") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "2006699", "1234", "", "", "");
      }
    },
    LAURA("Laura", "usuario para login exitoso con cuenta ahorro, leasing,adn y CDT") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42094911", "1234", "", "", "");
      }
    },
    GABY("Gaby", "usuario con cuenta de ahorros") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42094486", "1234", "", "", "");
      }
    },
    JULIETH("Julieth", "usuario ctas de ahorro y TC visa gold") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA_EXTRANJERIA,
            "2006354",
            "1234",
            ConstantsForgetPasword.DEBIT_CARD,
            "",
            "");
      }
    },
    MARCELA("Marcela", "usuario para login exitoso cuenta CC y creditos") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.PASAPORTE, "300666", "1234", "", "", "");
      }
    },
    CARLOS("Carlos", "usuario para login exitoso cuenta ahorros y TC") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.PASAPORTE, "1002277499", "1234", "", "", "");
      }
    },
    DARWIN("Darwin", "usuario para login exitoso cuenta ahorros y TC sin pago minimo") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "3227413", "4321", "", "", "");
      }
    },
    MARIA("Maria", "usuario para login exitoso cuenta ahorros y TC inscritas") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80797920", "1234", "", "", "");
      }
    },
    JUANA("Juana", "usuario con cuentas de ahorro sin saldo y corriente") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "1056891435", "1234", "", "", "");
      }
    },
    JUAN("Juan", "usuario con credito con pago minimo") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "33966024", "1234", "", "", "");
      }
    },
    DARIO("Dario", "usuario cuentas de ahorro") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "79378821", "1234", "", "", "");
      }
    },
    JOSE("Jose", "usuario cuentas de ahorro, crediservice y libranza, servicios inscritos") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.PASAPORTE, "1002277455", "1234", "", "", "");
      }
    },
    JULIO("Julio", "ingreso con TD") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.PASAPORTE, "302496", "1234", "", "", "4930");
      }
    },

    ALEJANDRA("Alejandra", "cuenta ahorro, corriente, tc inscritas y servicios") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80036844", "1234", "", "", "");
      }
    },
    CAMILO(
        "Camilo",
        "usuario ctas de ahorro, corriente, fiducias, creditos,cdt,rotativos, servicios inscritos") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "70190088", "1234", "", "", "");
      }
    },

    ALONSO("Alonso", "usuario con AH CCT Creditos y servicios ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA_EXTRANJERIA,
            "2001742",
            "1234",
            ConstantsForgetPasword.DEBIT_CARD,
            "1234",
            "");
      }
    },
    DAVIDS("Davids", "usuario con AH CCT Creditos y servicios ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "1011460871", "1234", "", "", "");
      }
    },
    ARTURO("Arturo", "usuario con AH y TC ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42094647", "1234", "", "", "");
      }
    },

    LUCIANA("Luciana", "usuario con cuenta corriente y crediservice ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA_EXTRANJERIA, "101414", "4321", "", "", "");
      }
    },
    FERNEY("Ferney", "usuario con AH sin movimientos ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA_EXTRANJERIA, "122826", "1234", "", "", "");
      }
    },
    SUSAN("Susan", "usuario que no tiene cuenta en bm") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80791883", "2222", "", "", "");
      }
    },
    LELI("Leli", "usuario con productos inactivos") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "20000254", "2222", "", "", "3333");
      }
    },
    JAVIER("Javier", "usuario con registro civil") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.REGISTRO_CIVIL, "1100004820", "1234", "", "", "");
      }
    },
    FELIPE("Felipe", "usuario con cédula de ciudadanía, cuentas de ahorro y fiducia") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "70190088", "1234", "", "", "");
      }
    },
    JOHN("John", "usuario con registro civil, ingreso con TD") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.REGISTRO_CIVIL, "1100004761", "1234", "", "", "4955");
      }
    },

    ALLISON("Allison", "usuario sin clave segura") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA, "80797031", "1234", ConstantsForgetPasword.DEBIT_CARD, "3902", "");
      }
    },
    ANGIE("Angie", "usuario con tarjeta de crédito como producto principal") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA,
            "42094934",
            "1234",
            ConstantsForgetPasword.CREDIT_ACCOUNT,
            "97260712",
            "");
      }
    },

    MARCOS("Marcos", "usuario sin clave segura") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA,
            "1011460514",
            "1234",
            ConstantsForgetPasword.CREDIT_ACCOUNT,
            "00357147142",
            "");
      }
    },
    ESTRELLA(
        "Estrella",
        "usuario con tarjeta de crédito creada correctamente en las diferentes entidades") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA,
            "63343977",
            "1234",
            ConstantsForgetPasword.CREDIT_CARD,
            "1234",
            "");
      }
    },
    VANESSA("Vanessa", "Usuario con dos TD por activar") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA, "80796976", "1234", ConstantsForgetPasword.DEBIT_CARD, "1234", "");
      }
    },
    PABLO("Pablo", "Usuario con TD por bloquear") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "19902734", "1234", "", "1234", "");
      }
    },
    ENRIQUE("Enrique", "Usuario para enviar dinero por TY") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "14207840", "1234", "", "1234", "");
      }
    },
    XUASY("Xuasy", "Usuario sin dato seguro") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42094684", "1234", "", "1234", "");
      }
    },
    SARA("Sara", "Usuario con sus productos inactivos") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "20000254", "1234", "", "1234", "");
      }
    },
    LUCAS("Lucas", "Usuario sin productos con el banco de bogotá") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "55566699", "1234", "", "1234", "");
      }
    },
    MARGARITA("Margarita", "usuario con tarjeta débito como producto principal") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA, "2006354", "1234", ConstantsForgetPasword.DEBIT_CARD, "1234", "");
      }
    },
    RAMIRO("Ramiro", "usuario para solicitar token con Tarjeta débito bloqueada") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "52017124", "1234", "", "", "");
      }
    },
    MARCO("Marco", "usuario para solicitar token sin Tarjeta débito activa") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "19444351", "1234", "", "", "");
      }
    },
    TOBIAS("Tobias", "usuario con producto principal TC para olvido de clave") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA,
            "2006730",
            "1234",
            ConstantsForgetPasword.CREDIT_CARD,
            "05378222",
            "4484");
      }
    },
    MATIAS("Matias", "usuario con producto principal TD para ingreso con TD") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA,
            "2006741",
            "1234",
            ConstantsForgetPasword.CREDIT_CARD,
            "4915110205383527",
            "3527");
      }
    },
    GERMAIN("Germain", "usuario con producto principal crédito para olvido de clave") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.PASAPORTE,
            "302618",
            "1234",
            ConstantsForgetPasword.CREDIT_ACCOUNT,
            "57147151",
            "");
      }
    },
    GIGLIANA("Gigliana", "usuario con producto principal CDT para olvido de clave") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA,
            "19107164",
            "1234",
            ConstantsForgetPasword.CDT_ACCOUNT,
            "0213443229",
            "");
      }
    },
    ROBERTO("Roberto", "usuario con cuenta AFC, credito Vivienda") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "807938762", "1234", "", "", "");
      }
    },
    ALEX("Alex", "usuario con cuenta AFC, TC,ctaAH, ctaCC") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "1016002868", "1234", "", "", "");
      }
    },
    ALEXA("Alexa", "usuario para solicitar token sin Tarjeta débito activa") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "1011460415", "1234", "", "", "");
      }
    },
    MIRIAM("Miriam", "usuario con CDT FISICO") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA_EXTRANJERIA, "104411", "2025", "", "", "");
      }
    },
    RICHI("Richi", "usuario con Tarjetas de crédito") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42094649", "1234", "", "", "");
      }
    },
    RODRIGO("Rodrigo", "usuario con Tarjetas de crédito") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "32779088", "1234", "", "", "");
      }
    },

    FRANCISCO("Francisco", "usuario con AFC, Crediservice, Libredestino") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "17027470", "4321", "", "", "");
      }
    },
    LENIN("Lenin", "usuario con cta AH y puntos TuPlus") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "2006740", "1234", "", "", "");
      }
    },
    DARK("Dark", "usuario con cta AH, corriente y Crediservice") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA_EXTRANJERIA, "203540", "2024", "", "", "");
      }
    },
    ALVARO("Alvaro", "usuario con cta AH y credito de vivienda") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80798689", "1234", "", "", "");
      }
    },
    MARTIN("Martin", "usuario con cuta AH y Leasing") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80798687", "1234", "", "", "");
      }
    },
    MARY("Mary", "usuario con fiducias") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA_EXTRANJERIA, "332826", "1234", "", "", "");
      }
    },
    LEONARDO("Leonardo", "usuario sin Tarjeta de crédito activa") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "19107194", "1234", "", "", "");
      }
    },
    INGRID("Ingrid", "Usuario monoproduto crédito de vivienda") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.PASAPORTE,
            "302619",
            "1234",
            ConstantsForgetPasword.CREDIT_ACCOUNT,
            "00357147160",
            "");
      }
    },
    PLACIDO("Placido", "Usuario que no se encuentra registrado en la app") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42094937", "1234", "", "", "");
      }
    },
    HERNAN("Hernan", "Usuario con TD disponibles para bloquear") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.TARJETA_IDENTIDAD, "1097501751", "1234", "", "", "");
      }
    },

    JHON("Jhon", "Usuario con cuenta de AH y libranza") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80798688", "1234", "", "", "");
      }
    },
    JAIRO("Jairo", "Usuario monoproducto con credito de vivienda") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80799043", "1234", "", "", "");
      }
    },
    ALFONSO("Alfonso", "Usuario monoproducto cuenta de ahorro") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42095389", "1234", "", "", "");
      }
    },
    MARINA("Marina", "ahorros, corriente, adn, libranza, vivienda, leasing ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80791556", "1234", "", "", "");
      }
    },
    MAICON("Maincon", "Usuario sin clave segura") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.PASAPORTE,
            "303219",
            "1234",
            ConstantsForgetPasword.SAVING_ACCOUNT,
            "000343558",
            "");
      }
    },
    XIMENA("Ximena", "Usuario con productos inactivos") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "19107299", "1234", "", "", "");
      }
    },
    ELSY("Elsy", "Usuario sin clave segura") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(
            DocumentType.CEDULA,
            "80793597",
            "1234",
            ConstantsForgetPasword.CREDIT_CARD,
            "62829754",
            "");
      }
    },
    OMAR("Omar", "Usuario con cuenta de AH,cte y fiducia") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80794595", "1234", "", "", "");
      }
    },
    CANDANCEE("Candancee", "Usuario con PFM") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "2007607", "1234", "", "", "");
      }
    },

    GRACIELA("Graciela", "Usuario con créditos Aval inscritos y cuenta propia ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA_EXTRANJERIA, "2002008", "1234", "", "", "");
      }
    },
    MARTINA("Martina", "Usuario con crédito ADN ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "42095928", "1234", "", "", "");
      }
    },
    FRANCISCA("Francisca", "Usuario con crédito ADN y cuenta propia") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.TARJETA_IDENTIDAD, "1097503276", "1234", "", "", "");
      }
    },
    CLAUDIA("Claudia", "Usuario con crédito ADN y cuenta propia") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80798686", "1234", "", "", "");
      }
    },
    SAUL("Saul", "Usuario con cuenta DDB ya inscrita") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "19107213", "1234", "", "", "");
      }
    },
    JORGE("Jorge", "Usuario no existe") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "101460818", "1234", "", "", "");
      }
    },
    BELISARIO("Belisario", "Usuario monoproducto de CDT") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "19294935", "1234", "", "", "");
      }
    },
    MARIANA(
        "Mariana",
        "Usuario con cuenta de ahorros, TC Clasica, Adelanto de nomina y Credito de vivienda") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "46355532", "1234", "", "", "");
      }
    },
    JENNY("Jenny", "Usuario con cuenta de ahorros y creditos de Libranza") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "2996543", "1234", "", "", "");
      }
    },
    DELFINA("Delfina", "Usuario con cuenta DDB ya inscrita y TD congelada") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "2007601", "1234", "", "", "");
      }
    },
    BRAYAN("Brayan", "Usuario con cuenta DDB ya inscrita y TD bloqueadas por PIN") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "1011593553", "1234", "", "", "");
      }
    },
    WILDER("Wilder", "Usuario para enviar o recibir TY") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80791557", "1234", "", "", "");
      }
    },
    KEVIN("Kevin", "Usuario de banca movil BDB") {
      @Override
      public UserLoginData loginData() {
        return null;
      }
    },
    NATALIA("Natalia", "usuario Alcancias") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80800070", "4321", "", "", "");
      }
    },
    DANIELA("Daniela", "Usuario monocuenta con saldo PMA") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.PASAPORTE, "2003963", "1234", "", "", "");
      }
    },
    CAROLINA("Carolina", "Usuario Tsx PMA") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "35254659", "1234", "", "", "");
      }
    },
    MANUEL("Manuel", "Usuario consulta Aval") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80789081", "1234", "", "", "");
      }
    },
    SANTIAGO("Santiago", "Usuario consulta Aval - Banco de popular") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "13872001", "1234", "", "", "");
      }
    },
    MARTHA("Martha", "Usuario sin saldo ") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "807941949", "1234", "", "", "");
      }
    },
    SANDRA("Sandra", "Usuario saldo menor a PMA") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA_EXTRANJERIA, "2001543", "1234", "", "", "");
      }
    },
    SANDRO("Sandro", "Usuario con producto Aval-Occidente") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "31471257", "1234", "", "", "");
      }
    },
    NATI("Nati", "Usuario con producto Aval-Occidente") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "19198659", "1234", "", "", "");
      }
    },
    CAMILA("Camila", "Usuario para generar Tsx Fallida") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "19902734", "1234", "", "", "");
      }
    },
    MAYRA("Mayra", "usuario que no tiene cuenta en banca movil") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80791885", "2222", "", "", "");
      }
    },
    MARTA("Marta", "usuario que no tiene cuenta en banca movil") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "80791886", "2222", "", "", "");
      }
    },
    DAMIAN("Damian", "usuario no Existe") {
      @Override
      public UserLoginData loginData() {
        return new UserLoginData(DocumentType.CEDULA, "73101367", "1234", "", "", "");
      }
    };
    public final String userName;
    public final String description;

     Users(String userName, String description) {
      this.userName = userName;
      this.description = description;
    }

    public String getUserName() {
      return userName;
    }

    public String getDescription() {
      return description;
    }

    public abstract UserLoginData loginData();

    public static Users fromUserName(String actorName) {
      return Arrays.stream(values())
          .filter(users -> users.userName.equals(actorName))
          .findFirst()
          .orElse(KEVIN);
    }
  }

  public static void initActorWithName(String actorName) {
    Users user = Users.fromUserName(actorName);
    OnStage.theActorCalled(actorName)
        .describedAs(user.description)
        .remember(LOGIN_DATA_KEY, user.loginData());
    OnStage.withCurrentActor(
        Check.whether(WebElementQuestion.the(DemoPage.TITLE_DEMO), isVisible())
            .andIfSo(ValidateDemo.toTheApplication()));
  }
}
