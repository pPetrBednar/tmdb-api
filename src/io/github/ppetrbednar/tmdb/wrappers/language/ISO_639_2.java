package io.github.ppetrbednar.tmdb.wrappers.language;

/**
 * List of language shortcuts in norm ISO 639-2.
 *
 * @author Petr Bednář
 */
public enum ISO_639_2 {
    AAR("Afar"),
    ABK("Abkhazian"),
    AVE("Avestan"),
    AFR("Afrikaans"),
    AKA("Akan"),
    AMH("Amharic"),
    ARG("Aragonese"),
    ARA("Arabic"),
    ASM("Assamese"),
    AVA("Avaric"),
    AYM("Aymara"),
    AZE("Azerbaijani"),
    BAK("Bashkir"),
    BEL("Belarusian"),
    BUL("Bulgarian"),
    BIH("Bihari languages"),
    BIS("Bislama"),
    BAM("Bambara"),
    BEN("Bengali"),
    TIB("Tibetan"),
    BRE("Breton"),
    BOS("Bosnian"),
    CAT("Catalan, Valencian"),
    CHE("Chechen"),
    CHA("Chamorro"),
    COS("Corsican"),
    CRE("Cree"),
    CZE("Czech"),
    CHU("Church Slavic, Slavonic, Old Bulgarian"),
    CHV("Chuvash"),
    WEL("Welsh"),
    DAN("Danish"),
    GER("German"),
    DIV("Divehi, Dhivehi, Maldivian"),
    DZO("Dzongkha"),
    EWE("Ewe"),
    GRE("Greek, Modern (1453-)"),
    ENG("English"),
    EPO("Esperanto"),
    SPA("Spanish, Castilian"),
    EST("Estonian"),
    BAQ("Basque"),
    PER("Persian"),
    FUL("Fulah"),
    FIN("Finnish"),
    FIJ("Fijian"),
    FAO("Faroese"),
    FRE("French"),
    FRY("Western Frisian"),
    GLE("Irish"),
    GLA("Gaelic, Scottish Gaelic"),
    GLG("Galician"),
    GRN("Guarani"),
    GUJ("Gujarati"),
    GLV("Manx"),
    HAU("Hausa"),
    HEB("Hebrew"),
    HIN("Hindi"),
    HMO("Hiri Motu"),
    HRV("Croatian"),
    HAT("Haitian, Haitian Creole"),
    HUN("Hungarian"),
    ARM("Armenian"),
    HER("Herero"),
    INA("Interlingua"),
    IND("Indonesian"),
    ILE("Interlingue, Occidental"),
    IBO("Igbo"),
    III("Sichuan Yi, Nuosu"),
    IPK("Inupiaq"),
    IDO("Ido"),
    ICE("Icelandic"),
    ITA("Italian"),
    IKU("Inuktitut"),
    JPN("Japanese"),
    JAV("Javanese"),
    GEO("Georgian"),
    KON("Kongo"),
    KIK("Kikuyu, Gikuyu"),
    KUA("Kuanyama, Kwanyama"),
    KAZ("Kazakh"),
    KAL("Kalaallisut, Greenlandic"),
    KHM("Central Khmer"),
    KAN("Kannada"),
    KOR("Korean"),
    KAU("Kanuri"),
    KAS("Kashmiri"),
    KUR("Kurdish"),
    KOM("Komi"),
    COR("Cornish"),
    KIR("Kirghiz, Kyrgyz"),
    LAT("Latin"),
    LTZ("Luxembourgish, Letzeburgesch"),
    LUG("Ganda"),
    LIM("Limburgan, Limburger, Limburgish"),
    LIN("Lingala"),
    LAO("Lao"),
    LIT("Lithuanian"),
    LUB("Luba-Katanga"),
    LAV("Latvian"),
    MLG("Malagasy"),
    MAH("Marshallese"),
    MAO("Maori"),
    MAC("Macedonian"),
    MAL("Malayalam"),
    MON("Mongolian"),
    MAR("Marathi"),
    MAY("Malay"),
    MLT("Maltese"),
    BUR("Burmese"),
    NAU("Nauru"),
    NOB("Norwegian Bokmål"),
    NDE("Ndebele North, North Ndebele"),
    NEP("Nepali"),
    NDO("Ndonga"),
    DUT("Dutch, Flemish"),
    NNO("Norwegian Nynorsk"),
    NOR("Norwegian"),
    NBL("Ndebele South, South Ndebele"),
    NAV("Navajo, Navaho"),
    NYA("Chichewa, Chewa, Nyanja"),
    OCI("Occitan (post 1500)"),
    OJI("Ojibwa"),
    ORM("Oromo"),
    ORI("Oriya"),
    OSS("Ossetian, Ossetic"),
    PAN("Panjabi, Punjabi"),
    PLI("Pali"),
    POL("Polish"),
    PUS("Pushto, Pashto"),
    POR("Portuguese"),
    QUE("Quechua"),
    ROH("Romansh"),
    RUN("Rundi"),
    RUM("Romanian, Moldavian, Moldovan"),
    RUS("Russian"),
    KIN("Kinyarwanda"),
    SAN("Sanskrit"),
    SRD("Sardinian"),
    SND("Sindhi"),
    SME("Northern Sami"),
    SAG("Sango"),
    SIN("Sinhala, Sinhalese"),
    SLO("Slovak"),
    SLV("Slovenian"),
    SMO("Samoan"),
    SNA("Shona"),
    SOM("Somali"),
    ALB("Albanian"),
    SRP("Serbian"),
    SSW("Swati"),
    SOT("Sotho, Southern"),
    SUN("Sundanese"),
    SWE("Swedish"),
    SWA("Swahili"),
    TAM("Tamil"),
    TEL("Telugu"),
    TGK("Tajik"),
    THA("Thai"),
    TIR("Tigrinya"),
    TUK("Turkmen"),
    TGL("Tagalog"),
    TSN("Tswana"),
    TON("Tonga (Tonga Islands)"),
    TUR("Turkish"),
    TSO("Tsonga"),
    TAT("Tatar"),
    TWI("Twi"),
    TAH("Tahitian"),
    UIG("Uighur, Uyghur"),
    UKR("Ukrainian"),
    URD("Urdu"),
    UZB("Uzbek"),
    VEN("Venda"),
    VIE("Vietnamese"),
    VOL("Volapük"),
    WLN("Walloon"),
    WOL("Wolof"),
    XHO("Xhosa"),
    YID("Yiddish"),
    YOR("Yoruba"),
    ZHA("Zhuang, Chuang"),
    CHI("Chinese"),
    ZUL("Zulu"),
    UNKNOWN("Unknown");

    private final String language;

    private ISO_639_2(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    /**
     * Converts any supported language shortcut from ISO 639-2.
     *
     * @param shortcut Lanuage shortcut
     * @return Language
     */
    public static ISO_639_2 getValueOf(String shortcut) {

        if (shortcut == null || shortcut.length() != 3) {
            return UNKNOWN;
        }

        try {
            return valueOf(shortcut.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return UNKNOWN;
        }
    }
}