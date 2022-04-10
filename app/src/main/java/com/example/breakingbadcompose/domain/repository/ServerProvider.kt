package com.example.breakingbadcompose.domain.repository

import com.example.breakingbadcompose.domain.model.Character
import com.example.breakingbadcompose.domain.repository.CharacterRepository


class ServerProvider : CharacterRepository {
    override fun getCharacters(): List<Character> {
        return listOf(
            Character(
                1,
                "Walter White",
                "https://images.amcnetworks.com/amc.com/wp-content/uploads/2015/04/cast_bb_700x1000_walter-white-lg.jpg",
                "Presumed dead",
                "Heisenberg",
                "Bryan Cranston"
            ),
            Character(
                2,
                "Jesse Pinkman",
                "https://vignette.wikia.nocookie.net/breakingbad/images/9/95/JesseS5.jpg/revision/latest?cb=20120620012441",
                "Alive",
                "Cap n' Cook",
                "Aaron Paul"
            ),
            Character(
                3,
                "Skyler White",
                "https://s-i.huffpost.com/gen/1317262/images/o-ANNA-GUNN-facebook.jpg",
                "Alive",
                "Sky",
                "Anna Gunn"
            ),
            Character(
                4,
                "Walter White Jr.",
                "https://media1.popsugar-assets.com/files/thumbor/WeLUSvbAMS_GL4iELYAUzu7Bpv0/fit-in/1024x1024/filters:format_auto-!!-:strip_icc-!!-/2018/01/12/910/n/1922283/fb758e62b5daf3c9_TCDBRBA_EC011/i/RJ-Mitte-Walter-White-Jr.jpg",
                "Alive",
                "Flynn",
                "RJ Mitte"
            ),
            Character(
                5,
                "Henry Schrader",
                "https://vignette.wikia.nocookie.net/breakingbad/images/b/b7/HankS5.jpg/revision/latest/scale-to-width-down/700?cb=20120620014136",
                "Deceased",
                "Hank",
                "Dean Norris"
            ),
            Character(
                6,
                "Marie Schrader",
                "https://vignette.wikia.nocookie.net/breakingbad/images/1/10/Season_2_-_Marie.jpg/revision/latest?cb=20120617211645",
                "Alive",
                "Marie",
                "Betsy Brandt"
            ),
            Character(
                7,
                "Mike Ehrmantraut",
                "https://images.amcnetworks.com/amc.com/wp-content/uploads/2015/04/cast_bb_700x1000_mike-ehrmantraut-lg.jpg",
                "Deceased",
                "Mike",
                "Jonathan Banks"
            ),
            Character(
                8,
                "Saul Goodman",
                "https://vignette.wikia.nocookie.net/breakingbad/images/1/16/Saul_Goodman.jpg/revision/latest?cb=20120704065846",
                "Alive",
                "Jimmy McGill",
                "Bob Odenkirk"
            ),
            Character(
                9,
                "Gustavo Fring",
                "https://vignette.wikia.nocookie.net/breakingbad/images/1/1f/BCS_S4_Gustavo_Fring.jpg/revision/latest?cb=20180824195925",
                "Deceased",
                "Gus",
                "Giancarlo Esposito"
            ),
            Character(
                10,
                "Hector Salamanca",
                "https://vignette.wikia.nocookie.net/breakingbad/images/b/b4/Hector_BCS.jpg/revision/latest?cb=20170810091606",
                "Deceased",
                "Don Hector",
                "Mark Margolis"
            ),
            Character(
                11,
                "Domingo Molina",
                "https://vignette.wikia.nocookie.net/breakingbad/images/e/e7/Krazy8.png/revision/latest?cb=20130208041554",
                "Deceased",
                "Krazy-8",
                "Maximino Arciniega"
            ),
            Character(
                12,
                "Tuco Salamanca",
                "https://vignette.wikia.nocookie.net/breakingbad/images/a/a7/Tuco_BCS.jpg/revision/latest?cb=20170810082445",
                "Deceased",
                "Tuco",
                "Raymond Cruz"
            ),
            Character(
                13,
                "Marco & Leonel Salamanca",
                "https://images.amcnetworks.com/amc.com/wp-content/uploads/2015/04/cast_bb_700x1000_the-cousins-lg.jpg",
                "Deceased",
                "The Cousins",
                "Luis & Daniel Moncada"
            ),
            Character(
                14,
                "Lydia Rodarte-Quayle",
                "https://media1.popsugar-assets.com/files/thumbor/wERDST0TUb-iHCSb2r5ZpsvaZLo/fit-in/1024x1024/filters:format_auto-!!-:strip_icc-!!-/2013/07/17/675/n/1922283/fae2f583f04bb80f_Laura-Fraser-is-back-as-Lydia-Rodarte-Quayle_gallery_primary/i/Laura-Fraser-Lydia-Rodarte-Quayle.jpg",
                "Deceased",
                "Lydia",
                "Laura Fraser"
            ),
            Character(
                15,
                "Todd Alquist",
                "https://vignette.wikia.nocookie.net/breakingbad/images/9/95/Todd_brba5b.png/revision/latest?cb=20130717134303",
                "Deceased",
                "Ricky Hitler",
                "Jesse Plemons"
            ),
            Character(
                16,
                "Jane Margolis",
                "https://vignette.wikia.nocookie.net/breakingbad/images/b/b4/Jane.jpg/revision/latest?cb=20090621233653",
                "Deceased",
                "Apology Girl",
                "Krysten Ritter"
            ),
            Character(
                17,
                "Skinny Pete",
                "https://vignette.wikia.nocookie.net/breaking-bad-tv/images/c/ce/Sp.png/revision/latest?cb=20121016143623",
                "Alive",
                "Skinny",
                "Charles Baker"
            ),
            Character(
                18,
                "Brandon Mayhew",
                "https://images.amcnetworks.com/amc.com/wp-content/uploads/2015/04/cast_bb_700x1000_badger-lg.jpg",
                "Alive",
                "Badger",
                "Matt L. Jones"
            ),
            Character(
                19,
                "Huell Babineaux",
                "https://vignette.wikia.nocookie.net/breakingbad/images/c/c1/4x11_-_Huell.png/revision/latest?cb=20130913100459&path-prefix=es",
                "Alive",
                "Huell",
                "Lavell Crawford"
            ),
            Character(
                20,
                "Steven Gomez",
                "https://images.amcnetworks.com/amc.com/wp-content/uploads/2015/04/cast_bb_700x1000_steven-gomez-lg.jpg",
                "Deceased",
                "Gomie",
                "Steven Michael Quezada"
            ),
            Character(
                21,
                "Theodore Beneke",
                "https://vignette.wikia.nocookie.net/breakingbad/images/b/bd/Cast_bb_700x1000_todd-beneke-lg.jpg/revision/latest?cb=20170723165057",
                "Alive",
                "Ted",
                "Christopher Cousins"
            ),
            Character(
                22,
                "Gale Boetticher",
                "https://images.amcnetworks.com/amc.com/wp-content/uploads/2015/04/cast_bb_700x1000_gale-boetticher-lg.jpg",
                "Deceased",
                "GB",
                "David Costabile"
            ),
            Character(
                23,
                "Andrea Cantillo",
                "https://vignette.wikia.nocookie.net/breakingbad/images/5/51/Andrea_-_To%27hajilee.png/revision/latest?cb=20131025094457",
                "Deceased",
                "Andrea",
                "Emily Rios"
            ),
            Character(
                24,
                "Brock Cantillo",
                "https://vignette.wikia.nocookie.net/breakingbad/images/9/97/Brock.png/revision/latest?cb=20170725193144",
                "Alive",
                "Brock",
                "Ian Posada"
            ),
            Character(
                25,
                "Carmen Molina",
                "https://vignette.wikia.nocookie.net/breakingbad/images/d/de/Carmen.JPG/revision/latest?cb=20100410125233",
                "Alive",
                "Carmen",
                "Carmen Serano"
            ),
            Character(
                26,
                "Gretchen Schwartz",
                "https://vignette.wikia.nocookie.net/breakingbad/images/5/5e/Gretchen_Schwartz.png/revision/latest?cb=20131005103735&path-prefix=es",
                "Alive",
                "Gretchen",
                "Jessica Hecht"
            ),
            Character(
                27,
                "Elliot Schwartz",
                "https://vignette.wikia.nocookie.net/breakingbad/images/8/8a/Elliott_Schwartz.png/revision/latest?cb=20131005103743&path-prefix=es",
                "Alive",
                "Elliot",
                "Adam Godley"
            ),
            Character(
                28,
                "Gonzo",
                "https://vignette.wikia.nocookie.net/breakingbad/images/d/d6/Gonzo.JPG/revision/latest?cb=20100415212944",
                "Deceased",
                "Gonzo",
                "Jesus, Payan, Jr."
            ),
            Character(
                29,
                "Christian Ortgea",
                "https://res.cloudinary.com/dwvrok1le/image/upload/v1540314304/c8acek3pimb0hb4efrvf.jpg",
                "Deceased",
                "Combo",
                "Rodney Rush"
            ),
            Character(
                30,
                "Mrs. Pinkman",
                "https://vignette.wikia.nocookie.net/breakingbad/images/a/a2/Tess_Harper.jpg/revision/latest?cb=20120923235754",
                "Alive",
                "Jesse's mom",
                "Tess Harper"
            ),
            Character(
                31,
                "Adam Pinkman",
                "https://vignette.wikia.nocookie.net/breakingbad/images/c/c9/AdamPinkman.png/revision/latest?cb=20141117180836&path-prefix=es",
                "Alive",
                "Jesse's dad",
                "Michael Bofshever"
            ),
            Character(
                32,
                "Jake Pinkman",
                "https://vignette.wikia.nocookie.net/breakingbad/images/a/a4/Jake.jpg/revision/latest?cb=20121214201656&path-prefix=de",
                "Alive",
                "Jake",
                "Ben Petry"
            ),
            Character(
                33,
                "No-Doze",
                "https://vignette.wikia.nocookie.net/breakingbad/images/c/ca/No_Doze_2.png/revision/latest?cb=20131014073210",
                "Deceased",
                "No-Doze",
                "Cesar Garcia"
            ),
            Character(
                34,
                "Emilio Koyama",
                "https://vignette.wikia.nocookie.net/trbreakingbad/images/9/9c/Emilio.jpeg/revision/latest?cb=20161029192022",
                "Deceased",
                "Emilio",
                "John Koyama"
            ),
            Character(
                35,
                "Dr. Delcavoli",
                "https://res.cloudinary.com/dwvrok1le/image/upload/v1540314509/lj5qlbe6xvmmpxnspz6y.jpg",
                "Alive",
                "Dr. Delcavoli",
                "David House"
            ),
            Character(
                36,
                "Wendy S.",
                "https://vignette.wikia.nocookie.net/breakingbad/images/c/cc/Wendy.jpg/revision/latest?cb=20170721162715",
                "Alive",
                "Wendy",
                "Julie Minesci"
            ),
            Character(
                37,
                "Bogdan Wolynetz",
                "https://i.pinimg.com/originals/d5/c0/34/d5c0345ae70fbdbaa33b7537d685da54.jpg",
                "Alive",
                "Bogdan",
                "Marius Stan"
            ),
            Character(
                38,
                "Ken",
                "https://vignette.wikia.nocookie.net/breakingbad/images/8/8c/Ken.png/revision/latest?cb=20170721163649",
                "Alive",
                "Ken Wins",
                "Kyle Bornheimer"
            ),
            Character(
                39,
                "Holly White",
                "https://static.wikia.nocookie.net/breakingbad/images/0/08/Tumblr_lqddc79K9S1qc5omm.png/revision/latest?cb=20111012055605",
                "Alive",
                "Holly",
                "Unknown"
            ),
            Character(
                40,
                "George Merkert",
                "https://m.media-amazon.com/images/M/MV5BMTkwMTkxNjUzM15BMl5BanBnXkFtZTgwMTg5MTczMTE@._V1_UY317_CR175,0,214,317_AL_.jpg",
                "Alive",
                "ASAC Merkert",
                "Michael Shamus Wiles"
            ),
            Character(
                41,
                "Donald Margolis",
                "https://vignette.wikia.nocookie.net/breakingbad/images/1/12/Donald_Margolis.png/revision/latest?cb=20120802212034",
                "Unknown",
                "Jane's dad",
                "John de Lancie"
            ),
            Character(
                42,
                "Clovis",
                "https://vignette.wikia.nocookie.net/breakingbad/images/0/0f/Clovis.JPG/revision/latest?cb=20100415221013",
                "Alive",
                "Clovis",
                "Tom Kiesche"
            ),
            Character(
                43,
                "SAC Ramey",
                "https://res.cloudinary.com/dwvrok1le/image/upload/v1539360786/o7thsjdorobfbetqaefj.jpg",
                "Alive",
                "SAC Ramey",
                "Todd Terry"
            ),
            Character(
                44,
                "Victor",
                "https://vignette.wikia.nocookie.net/breakingbad/images/4/48/Victor2.png/revision/latest?cb=20131009225027",
                "Deceased",
                "Victor",
                "Jeremiah Bitsui"
            ),
            Character(
                45,
                "Tomás Cantillo",
                "https://vignette.wikia.nocookie.net/breakingbad/images/e/ec/Tomas.png/revision/latest?cb=20130131043014",
                "Deceased",
                "Andrea's brother",
                "Angelo Martinez"
            ),
            Character(
                46,
                "Francesca Liddy",
                "https://res.cloudinary.com/dwvrok1le/image/upload/v1539362182/o9mstjonfn6dsdi3uij6.jpg",
                "Alive",
                "Honey Tits",
                "Tina Parker"
            ),
            Character(
                47,
                "Cynthia",
                "https://res.cloudinary.com/dwvrok1le/image/upload/v1539362375/z63youp272k5mbqbuqj9.jpg",
                "Alive",
                "Cynthia",
                "Ashley Kajiki"
            ),
            Character(
                48,
                "Tortuga",
                "https://vignette.wikia.nocookie.net/breakingbad/images/5/58/BBWA_Tortuga.jpg/revision/latest?cb=20131101172007",
                "Deceased",
                "Tortuga",
                "Danny Trejo"
            ),
            Character(
                49,
                "Tim Roberts",
                "https://vignette.wikia.nocookie.net/breakingbad/images/8/8d/2x02_-_Tim_Roberts.jpg/revision/latest?cb=20110927053954",
                "Alive",
                "Detective Roberts",
                "Nigel Gibbs"
            ),
            Character(
                50,
                "Juan Bolsa",
                "https://vignette.wikia.nocookie.net/breakingbad/images/3/38/Bolsa.png/revision/latest?cb=20180825204033",
                "Deceased",
                "Don Juan",
                "Javier Grajeda"
            ),
            Character(
                51,
                "Group Leader",
                "https://vignette.wikia.nocookie.net/breakingbad/images/8/81/Group_Leader_Brown_Shirt_-_Kafkaesque.png/revision/latest?cb=20131025095333",
                "Alive",
                "Counselor",
                "Jere Burns"
            ),
            Character(
                52,
                "Kaylee Ehrmantraut",
                "https://vignette.wikia.nocookie.net/breakingbad/images/c/cc/Kaylee.png/revision/latest?cb=20170810082843",
                "Alive",
                "Mike's Granddaughter",
                "Kaija Rose Bales"
            ),
            Character(
                53,
                "Pamela",
                "https://res.cloudinary.com/dwvrok1le/image/upload/v1539373707/bbb6muek0tcmbc3g2sog.jpg",
                "Alive",
                "Skyler's attorney",
                "Julie Dretzin"
            ),
            Character(
                54,
                "Duane Chow",
                "https://res.cloudinary.com/dwvrok1le/image/upload/v1539373871/ssk1t4hvo9tmhvdt5hcn.jpg",
                "Deceased",
                "Chow",
                "James Ning"
            ),
            Character(
                55,
                "Stacey Ehrmantraut",
                "https://vignette.wikia.nocookie.net/breakingbad/images/b/b3/StaceyEhrmantraut.png/revision/latest?cb=20150310150049",
                "Alive",
                "Mike's daugter-in-law",
                "Kerry Condon"
            ),
            Character(
                56,
                "Officer Saxton",
                "https://vignette.wikia.nocookie.net/breakingbad/images/f/f3/Officer_Saxton_-_I.F.T..png/revision/latest?cb=20131025090606",
                "Alive",
                "Saxton",
                "Stoney Westmoreland"
            ),
            Character(
                57,
                "Jack Welker",
                "https://vignette.wikia.nocookie.net/breakingbad/images/c/ce/Jack5x13.png/revision/latest?cb=20130912225922",
                "Deceased",
                "Uncle Jack",
                "Michael Bowen"
            ),
            Character(
                112,
                "Kimberly Wexler",
                "https://vignette.wikia.nocookie.net/breakingbad/images/f/f7/BCS_S4_Kim_Wexler.jpg/revision/latest?cb=20180824195845",
                "Alive",
                "Kim",
                "Rhea Seehorn"
            ),
            Character(
                113,
                "Howard Hamlin",
                "https://vignette.wikia.nocookie.net/breakingbad/images/5/57/BCS_S4_Howard_Hamlin.jpg/revision/latest?cb=20180824195855",
                "Alive",
                "Howard",
                "Patrick Fabian"
            ),
            Character(
                114,
                "Charles McGill",
                "https://vignette.wikia.nocookie.net/breakingbad/images/3/3e/BCS_S3_ChuckMcGill.jpg/revision/latest?cb=20170327185308",
                "Deceased",
                "Chuck",
                "Michael McKean"
            ),
            Character(
                115,
                "Ignacio Varga",
                "https://vignette.wikia.nocookie.net/breakingbad/images/b/b1/BCS_S4_Nacho_Varga.jpg/revision/latest?cb=20180824195910",
                "Alive",
                "Nacho",
                "Michael Mano"
            ),
            Character(
                116,
                "Eduardo Salamanca",
                "https://vignette.wikia.nocookie.net/breakingbad/images/8/85/LaloProfileBCS.png/revision/latest?cb=20180925050152",
                "Alive",
                "Lalo",
                "Tony Dalton"
            )
        )
    }
}