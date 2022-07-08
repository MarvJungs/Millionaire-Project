package game.millionaire;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class QuestionRepository
{
    ArrayList<Question> questions = new ArrayList<>();
    static Random r;

    public QuestionRepository()
    {
        r = new Random();

        questions.add(new Question("Star Revenge 7.5 is one of the few hacks where the player is missing integral things at the start of the game. What is one of them?",
                "The ability to triple jump",
                "The tool to patch the .bps",
                "The English translation of the readme",
                "The ability to rotate the camera",
                0));
        questions.add(new Question("In Peach's Fury, players are rewarded for doing certain tricks frame perfectly. What exactly spawns as a result of that?",
                "Goombas",
                "Sparkles",
                "Dust",
                "Credit Cards",
                1));
        questions.add(new Question("A hack named after which graphics plugin was featured in a Romhack Geoguessr event?",
                "Jabo",
                "GlideN64",
                "RiceVideo",
                "ORGE",
                0));
        questions.add(new Question("If you are listening to the first 4 notes of Delfino Plaza on loop, which region in Stan 64 are you the most likely to be stuck in?",
                "Mexico",
                "Romania",
                "Hawaii",
                "Brazil",
                3));
        questions.add(new Question("Which of these websites contains functionality such as rating, reviewing and bookmarking romhacks?",
                "sm64hacks.com",
                "getpaint.net",
                "romhacking.com",
                "Brazil",
                2));
        questions.add(new Question("What do the fangames SM64 The Missing Stars and I wanna be the Fangame have in common?",
                "Both have a difficulty selection",
                "Both were released in the same year",
                "Both have Bowser as a major boss",
                "Both are the first notable fangames of their source material",
                3));
        //questions.add(new Question("Which of these overworld stars in EFTJ DE requires the most stars to become obtainable?",
                //"MIPS", "Toad in jail cage", "Toad on ruined roof", "Bait finish line star", 0));
        questions.add(new Question("What can you obtain in the eyeball guardian fight in EFTJ DE?",
                "Infinite HP",
                "Infinite Coins",
                "Infinite i-Frames",
                "Infinite speed",
                0));
        questions.add(new Question("The side area with a koopa shell in Bitter Badlands in ETFJ DE resembles which game the most closely?",
                "Run",
                "Canabalt",
                "Subway Surfers",
                "Temple Run",
                0));
        questions.add(new Question("If in a Bowser fight area, a star spawns instead of a key, and it's uncollected, what does that mean?",
                "You haven't collected a star 1 in the Bowser level",
                "You haven't collected course 1 star 1",
                "You haven't collected a star from any secret course",
                "You haven't collected slide star 2",
                0));
        questions.add(new Question("Which of these areas from Speed Star Adventure already existed in a \"prequel\" hack that scuttlebug_raiser submitted to a competition?",
                "Water Land",
                "Grass Future",
                "Space Land",
                "Flower Future",
                0));
        questions.add(new Question("Whose hacks are best described as follows: \"Huge, empty levels. Traditional feel. Have no quality of life additions, even in 2020. Tend to not have 100 coin stars.\"?",
                "Fares hacks",
                "Gael hacks",
                "BroDute hacks",
                "sm64pie hacks",
                0));
        //questions.add(new Question("The challenge presented by which objects did Arthurtilly nerf in v1.0.1 of Gravity Swap 64?", ))
        questions.add(new Question("Which of these interactions deal the most damage by default?",
                "Stomp by a thwomp",
                "Hitting a sleeping piranha plant",
                "Hitting a snufit",
                "Getting heaved by a heave-ho",
                3));
        questions.add(new Question("Which of these people is not part of the trio that every once in a while plays SM64 romhacks together on stream?",
                "Wolsk",
                "Stonk",
                "pieceofcheese87",
                "Naloa",
                3));
        questions.add(new Question("What is the best way to not lose time in a speedrun of a kaizo (extreme) romhack?",
                "Missing a firsty",
                "Not straining enough sideways for a crossover",
                "admiring quicksand",
                "Not dying",
                3));
        questions.add(new Question("What is a defining property of Mario's Trip in China?",
                "It is holding over 9.0 rating on RHDC",
                "It has had the most runs uploaded for a romhack on srcom",
                "It's the second chinese romhack",
                "It was katze789's 100th beaten romhack",
                2));
        questions.add(new Question("Which level in Star Revenge Redone v2.0 has \"Grasslands, All the Way\" from Bowser's Inside Story for its music?",
                "Autumn Wood Plains",
                "Strange Letter Space",
                "Snow Mountain Resort",
                "Magmatic Toxic Sewers",
                0));
        questions.add(new Question("What romhack contains the track that is playing right now",
                "Marty Party 64",
                "Star Revenge 2: Night of Doom",
                "Super Mario 74",
                "Star Revenge 3.5",
                0));
        questions.add(new Question("In the level V A P O R S P A C E in Star Revenge 5, one of the floating objects closely resembles a traditional object in IWBTG (fangames). Which one is it?",
                "N64 Logo",
                "Delicious Fruit",
                "Save Block",
                "Cocktail",
                1));
        questions.add(new Question("Which pair \"speedrunner - main speedgame\" is wrong?",
                "Phanton404 - Star Revenge 5.5",
                "Geeroid/Jhinn70 - Star Revenge 5",
                "StanFuzz - Star Revenge 2: NoD",
                "AndrewSM64 - Shining Stars 2",
                3));
        questions.add(new Question("Which of these courses in Star Revenge 5.5 contains red coins?",
                "Yellow Goldwood Forest",
                "Acid Green Toxic Caverns",
                "Abyss of Purple Pinkness",
                "Sinister Metallic Void Madness (Future)",
                1));
        questions.add(new Question("Near the start of SR6.25 c7 there is the face of a certain cartoon figure. Which cartoon does it come from?",
                "???",
                "Steven Universe",
                "Gravity Falls",
                "Amphibia",
                0));
        questions.add(new Question("What is the green demon challenge about?",
                "Do not touch grass",
                "do not touch a 1Up",
                "defeat bowser as quickly as possible",
                "jump into a bucket of green paint",
                1));
        questions.add(new Question("What property of the level it belongs to does the phrase in Super Mario 74 \"Twice the amount or else they won't count\" describe?",
                "Has 16 red coins",
                "Requires twice the vanilla amount of stars to enter",
                "Requires 200 total coins to spawn a star",
                "Requires both Bowser keys directly to enter",
                0));
        questions.add(new Question("Which of the Super Mario Odyssey 64 kingdoms does NOT allow you to capture the enemy listed?",
                "Cap - Dorrie",
                "Cascade - Chain Chomp",
                "Sand - Bullet Bill",
                "Wodded - Uproot",
                0));
        questions.add(new Question("Which of these items is \"sold\" for 50 coins in the shop of SS3's Sticker Express?",
                "Ice Flower",
                "Ultra Mushroom",
                "POW Block",
                "Super Boots",
                1));
        questions.add(new Question("Which of these texts does the 1-up in the Halls of Fame hub in Another Mario Adventure show on pickup?",
                "Egyptian",
                "True Ceilling Issues",
                "I Adore Unleashed",
                "No Corner Physics Kreygasm",
                2));
        questions.add(new Question("What happens if you try to divide by 0 on the calculator in SM64: Last Impact?",
                "Game crash",
                "You get 1 as a result",
                "No number appears on the calculator",
                "A small puff of cloud appears",
                1));
        questions.add(new Question("What colour in the number 7 on the HUD of Treasure World: Dream Edition",
                "Dark Blue",
                "Orange",
                "Light green",
                "Pink",
                0));
        questions.add(new Question("Which stage from Star Revenge 4.5 uses Cave Story music?",
                "Crystal Lake",
                "Blue Realm",
                "Moustache Moon Galaxy",
                "Dreamy Fountain",
                2));
        questions.add(new Question("In which of the following SR5.5 stages is music from The Matrix played?",
                "Save Zone",
                "Boss Tower (boss theme)",
                "Reverse Castle Basement",
                "Discolored Distorted Madness",
                2));
        questions.add(new Question("Music from which course was used in the release trailer of Last Impact?",
                "Giant Desk",
                "Dusky Doomed Dale",
                "Melty Molten Mountains",
                "Colossal Circuits",
                3));
        questions.add(new Question("Music from which course was used in the release trailer of Ztar Attack Rebooted",
                "Skyhigh Gorges",
                "The Nightdark Haven",
                "Negative Realm: Forbidden Universe",
                "Valley of Dreams",
                2));
        questions.add(new Question("Which of these levels does NOT have Touhou music in it?",
                "Star Revenge 7.5 - Course 1", "Ztar Attack 2 - Race against Gaell", "Blue Star Adventure - Course 12", "SM64 Shining Stars - Course 13",
                3));
        questions.add(new Question("The small overworld area at the start of the the hack Seaside Town has music from what game?",
                "Super Mario RPG",
                "Touhou 10 - Mountain of Faith",
                "Pokemon Shuffle",
                "Touhou 12 - Undefined Fantastic Object",
                2));
        questions.add(new Question("The music for the stage Lost Jungle in Mario Heroes 64 is from which Sonic Heroes stage?",
                "Bingo Highway",
                "Frog Forest",
                "Frog Forest",
                "Hang Castle",
                1));
        questions.add(new Question("What is the song played in the level TsucnenT's Dream called?",
                "Neo Land (Kururin Paradise)",
                "Cotton Island (Plok!)",
                "Vanishing Dream ~ Lost Dream (Touhou: PoDD)",
                "Intersect Thunderbolt (eXceed3rd)",
                0));
        questions.add(new Question("What is the name of the song from KBR2 course 15?",
                "Tenth Zone East (F-Zero Maximum Velocity)",
                "Beastial Beat (Mushihimesama Futari)",
                "Battle! Cynthia (Pokémon Diamond/Pearl/Platinum)",
                "Dream Land (Touhou LLS)",
                0));
        questions.add(new Question("What was the name of the meme song used in Star Revenge 5's file select screen?",
                "We Are Number One (LazyTown)",
                "Never Gonna Give You Up (Rick Astley)",
                "Gangnam Style (PSY)",
                "Revenge (CaptainSparklez feat. TryHardNinja)",
                0));
        questions.add(new Question("Which Star Revenge 4 v1.1 course blamed the player for having a little D?",
                "Magmatic Beach Canyon",
                "Little Mitmolt",
                "Blue Boulevard",
                "Bobomb Cap Stage",
                1));
        questions.add(new Question("Which of the following Mysterious Hidden Objects from SM74 was preserved in SM74EE?",
                "Banjo-Kazooie cartridge",
                "Rare logo",
                "Empty Rareware logo",
                "Banjo-Tooie cartridge",
                2));
        questions.add(new Question("According to sign in the end of LatFRR, what number in ZA series does the game have?",
                "It does not have a number",
                "0",
                "0.5",
                "1.5",
                2));
        questions.add(new Question("What government system are Toads quarrelling about near Peach’s Castle in SR4?",
                "Democracy",
                "Totalitarianism",
                "Oligarchy",
                "Monarchy",
                0));
        questions.add(new Question("Which of these types of movement does NOT have a sign in Masters Challenge's castle?",
                "Firsty",
                "Slidekick immunity",
                "Quicksand Ledgegrab",
                "Lava Boost",
                3));
        questions.add(new Question("A Sign in SR0.5 mentions that the Cap levels were actually taken from an other hack. Which hack is it talking about?",
                "Star Revenge 2: Night of Doom",
                "Star Revenge 1",
                "Star Revenge 2: To The Moon Demo",
                "That sign does not exist",2));
        questions.add(new Question("Which of these hacks that are remakes of older Star Revenges has been released the earliest?",
                "Star Revenge 4.5",
                "Star Revenge 5",
                "Star Revenge 2.5,",
                "Star Revenge Redone 2.0",
                2));
        questions.add(new Question("Who has completed the most hacks/stars recognized in \"Reddit%\" out of the listed people?",
                "LinCrash",
                "Drunkrazy",
                "ChrisLink",
                "Xalince",
                0));
        questions.add(new Question("What is the release year of Super Mario Fallen Stars?",
                "2011",
                "2012",
                "2013",
                "2014",
                2));
        questions.add(new Question("What hack was made by 22neptun?",
                "Fire Flower Isles",
                "Silver Heavenly Castle",
                "Silent Hill 64",
                "Super Mario Parallel Worlds",
                1));
        questions.add(new Question("What was the first hack to be run at a Weekly Race in 2017?",
                "Star Revenge 5",
                "Super Mario 74",
                "Star Revenge 4.5",
                "Super Mario Star Road",
                0));
        questions.add(new Question("How many \"Bowser's Dank Rave\" hacks have been released so far?",
                "4",
                "6",
                "8",
                "10",
                2));
        questions.add(new Question("Who is the creator of SM64: Last Impact?",
                "PixelSM64",
                "Kaze",
                "Mushie64",
                "aglab2",
                1));
        questions.add(new Question("Which of these is NOT a level made by Redmat?",
                "Devastated Forest",
                "Glitch Factory",
                "Skyscraper City",
                "Spooky Dark Castle",
                3));
        questions.add(new Question("Which participle was NOT used for remade hack?",
                "Reimagined",
                "Rebooted",
                "Redone",
                "Reconsidered",
                3));
        questions.add(new Question("Since the SR1 v1.2 update not all stars are required to beat the game anymore, what is the lowest amount of stars required instead?",
                "75",
                "91",
                "100",
                "101",
                1));
        questions.add(new Question("Which of the following people have obtained TsucnenT's Dream red coins? (as of 8/12/2019)",
                "Normal_",
                "PlutoTheThing",
                "ShiKiT",
                "Ap616",
                3));
        questions.add(new Question("How long was the first ever recorded run of 152 star in NoD?",
                "17.5h",
                "19.5h",
                "21.5h",
                "23.5h",
                2));
        questions.add(new Question("Which Runner performed the first ever 115 Star speedrun of Remnant of Doom?",
                "Muimania",
                "InfiniteVoid316",
                "dj0nk",
                "agyroth",
                0));
        questions.add(new Question("Who was the first person to speedrun Super Mario Treasure World 115 Star?",
                "mopplopmopplop",
                "gian_97",
                "Spaceman64",
                "drunkrazy",
                2));
        questions.add(new Question("Which course in NoD does NOT have enemy replaced by star model? (excluding flamethrowers)",
                "Frozen Mushroom Cliffs (C2)",
                "GAY Forest Temple (C7)",
                "Mysterious Snow Castle (C9)",
                "Oldschool Sand Fields (C13)",
                0));
        questions.add(new Question("Which of these Star Revenge stages does not contain a CatBag?",
                "Forest of Fall Magic (SR2: TTM)",
                "Skyhigh Kingdom in the Evening (SR5)",
                "Moustache Moon Galaxy (SR4.5)",
                "Sepia Abandoned Temple (SRR2.0)",
                3));
        questions.add(new Question("What is the official subtitle of Star Revenge 6.9?",
                "Luigi Lost in Time",
                "Luigi's Adventure",
                "Kedowser's Return",
                "Mario and the Magic Wand",
                0));
        questions.add(new Question("What is stage 1 in Star Revenge 6.9 called?",
                "Sandy Sky Golf Course",
                "Crystal Beach",
                "Wishworld of the Scepter",
                "Skyhigh Golfing",
                3));
        questions.add(new Question("What is the name of the 15th course of Super Mario Treasure World Dream Edition?",
                "Final Tragedy",
                "Final Nightmare",
                "Beginning of the Tragedy",
                "Forgotten Lands IV",
                0));
        questions.add(new Question("In LATFR Rebooted, how many courses have a star for collecting 8 red coins?",
                "1",
                "2",
                "0",
                "6",
                1));
        questions.add(new Question("Which of the following characters is not playable in SM64 Online/Net64?",
                "Kirby",
                "Knuckles",
                "Waluigi",
                "King Dedede",
                3));
        questions.add(new Question("How many stars are in King Boo's Revenge?",
                "121",
                "145",
                "168",
                "182",
                2));
        questions.add(new Question("How many stars are in All Star Adventure?",
                "146",
                "166",
                "182",
                "208",
                0));
        questions.add(new Question("How many stars are in SR6.9: Luigi Lost in Time?",
                "16",
                "20",
                "24",
                "25",
                3));
        questions.add(new Question("Which of the following changes were NOT made in Night of Doom 1.2?",
                "Newer Aglab cam",
                "Lower ISC",
                "Key 1 boss nerfed",
                "Longer cap timers",
                2));
        questions.add(new Question("How much IQ do you need to beat Biobak's troll Quiz House?",
                "500",
                "1000",
                "2000",
                "5000",
                2));
        questions.add(new Question("In which hack are you required to throw a bob-omb at a Toad to spawn a star?",
                "Star Revenge 8",
                "Mario Adventure",
                "SM64: Last Impact",
                "All Star Adventure",
                1));
        questions.add(new Question("What feature does Whomp in Marble Apotos City have?",
                "Moves 2 times faster",
                "Hitbox is moved on top of him",
                "Is very small",
                "Has 7 hits",
                1));
        questions.add(new Question("What hack was the first to utilize 1-word clues and cryptic star placements?",
                "Star Revenge 5.5",
                "Star Revenge 6.5",
                "Mario Adventure",
                "All Star Adventure",
                1));
        questions.add(new Question("How many frames long is the window for performing a wallkick?",
                "1",
                "4",
                "5",
                "infinite",
                2));
        questions.add(new Question("What does the yellow switch do in Luigi and the Forest Ruins 64?",
                "Makes mips spawn a third time",
                "Causes a hidden star to show in each course",
                "Absolutely nothing",
                "Gives you 4 stars but takes your hat",
                3));
        questions.add(new Question("Which of these memes does NOT appear in Ztar Attack 2's 5-3 (Los Bowzeres)?",
                "VoidHarmPolice",
                "Banime",
                "Windows Marv",
                "Kappa",
                3));
        questions.add(new Question("Who is the name of SS3’s course 8 (Mt. Zora) referencing?",
                "Asbeth4567",
                "Kochiya",
                "BroDute",
                "Lumanaremaxima",
                0));
        questions.add(new Question("What is the correct spelling of the name of MN64's creator?",
                "Apeious",
                "Apieous",
                "Apioeus",
                "Apiueos",
                2));
        questions.add(new Question("Who was the creator and first owner of the SM64 ROM Hack Community server?",
                "sizzlingmario4",
                "SigotuSR",
                "Galaxtic",
                "AlejoGDOfficial",
                3));
        questions.add(new Question("When was the sm64romhacks Twitch channel used for the first time for streaming an event?",
                "January 2017",
                "August 2017",
                "January 2018",
                "August 2018",
                1));
        questions.add(new Question("What time do you have to beat to get a secret star in Peach's Secret Slide in SM64?",
                "23 seconds",
                "21 seconds",
                "20 seconds",
                "12.6 seconds",
                1));
        questions.add(new Question("Which of the following is not a correct answer in Star Revenge 5.5's meme song quiz?",
                "Never Gonna Give You Up",
                "Snow Halation",
                "Shooting Stars",
                "Megalovania",
                2));
        questions.add(new Question("How many buttons are there on an N64 controller? (D-pad = 4 buttons)",
                "3",
                "8",
                "14",
                "18",
                3));
        questions.add(new Question("Which of the following courses does not contain exactly 100 coins?",
                "Koopa Beach (TA C10)",
                "Colorful Board (SotB C5)",
                "Slippery Toxic Castle (TA:IC C2)",
                "Dried Out Dead Desert (74EE C11)",
                3));
        questions.add(new Question("Which of the following hacks does not exist?",
                "SM64 Die Lavahölle",
                "Red is Dead: Extreme Edition",
                "Kaizo Mario 64: The Green Stars",
                "Sub-Par Frankie 64 2",
                2));
        questions.add(new Question("Who was the first person to find the BLJ strategy in Shining Stars 1 Bowser 3, skipping most of the level?",
                "FrostyZako",
                "homerfunky",
                "SpaceMan64",
                "TriforceTK",
                1));
        questions.add(new Question("Which of the following courses in Star Revenge 6.5 has a secret sign?",
                "Burning Night Heights",
                "Star Tree Valley",
                "Dead Frankoopsko",
                "Blue Realm: Castle Dute",
                1));
        questions.add(new Question("What does SM64 stand for?",
                "Super Material 64",
                "Space Master 64",
                "Sizzling's Machines 64",
                "Super Mario 64",
                3));
        questions.add(new Question("Where does the Song \"Mandark's Laboratory\" play? ",
                "Bowser in the Melting Ice Tower (Ztar Attack Rebooted)",
                "Castle Basement (Star Revenge 5.5)",
                "Risky Reset (All Star Adventure)",
                "Secret Star Hide (Star Revenge Redone v2.1)",
                0));
        questions.add(new Question("Which ROM Hack Runner did the so-called \"Drunkathon\"?",
                "Tomatobird8",
                "katze789",
                "Muimania",
                "drunkrazy",
                3));
        questions.add(new Question("The so-called Drunkathon was a normal run of a game except...",
                "The Runner took one shot for each death",
                "The Runner took one shot after each Split",
                "It was a marathon hosted by drunkrazy",
                "The Drunkathon never happened",
                1));
        questions.add(new Question("Which cancelled hack did Star Revenge 6 Courses 3, 5, and 6 Originate from?",
                "SM64: The Forgotten Stars",
                "SM64 Stolen Colors",
                "Super Mario Lost Levels",
                "Star Revenge 5.9",
                1));
        questions.add(new Question("What is the first Star Revenge hack to contain reference billboards?",
                "Star Revenge 4",
                "Star Revenge 0.5",
                "Star Revenge 7",
                "Star Revenge 7.5",
                1));
        questions.add(new Question("What is the approximate amount of symbols in compiled SM64 Decomp map?",
                "2000",
                "3000",
                "4000",
                "5000",
                3));
        questions.add(new Question("How many bytes are copied for the level segment E in SM64 Editor 2.0.8?",
                "0xD0000",
                "0x150000",
                "0x100000",
                "level dependant",
                1));
        questions.add(new Question("What time player needs to beat to get Key 1 in Escape from the Jail?",
                "30''0",
                "1'00''0",
                "1'30''0",
                "2'00''0",
                3));
        questions.add(new Question("Which level in original SM64 has default objects drawing distances reduced?",
                "Tall Tall Mountain",
                "Tick Tock Clock",
                "Lethal Lava Land",
                "Shifting Sand Land",
                1));
        questions.add(new Question("Which hacker did NOT make a TT64 hack (aka one with no custom stages imported)?",
                "caasje",
                "OmegaEdge29",
                "Mariocrash64",
                "JoelElProXD5",
                3));
        questions.add(new Question("Who made the guest stage \"Crisis City\" in King Boo's Revenge 2?",
                "BroDute",
                "Bubby64",
                "sm64pie",
                "aglab2",
                2));
        questions.add(new Question("How many released hacks (according to patch list) have 170 or more stars?",
                "5",
                "6",
                "7",
                "8",
                2));
        questions.add(new Question("Who made an Ideal Run of the 2nd Run of Treasure World: Dream Edition?",
                "FrostyZako",
                "Focus_SR",
                "sm64expert",
                "mopplopmopplop",
                1));
        questions.add(new Question("Who ended the Star Revenge Scrubs Challenge Race on last place?",
                "InfiniteVoid316",
                "MarvJungs",
                "Katze789",
                "Muimania",
                1));
        questions.add(new Question("Which course has the most coins?",
                "Molten Treasure Chest (Super Mario 74)",
                "Ztar Meadows (SM64 1.5: Ztar Attack!)",
                "Lost Islands (Super Mario Apocalypse)",
                "Frostburn Cavern (Super Mario and the Marvel Adventure)",
                2));
        questions.add(new Question("Which of these Last Impact courses does not have a rainbow coin challenge for unlocking a minigame?",
                "Super Sweet Sugarland",
                "Harried Honey Hive",
                "Sky-High Islands",
                "Luna Park",
                1));
        questions.add(new Question("How many levels are in Super Mario 64 Peach's Memory Cut Levels?",
                "2",
                "5",
                "4",
                "6",
                1));
        questions.add(new Question("Which of these hacks was released first?",
                "Kaizo Mario 64",
                "Super Waluigi 64",
                "Super Mario 64 The Missing Stars",
                "Super Mario 128",
                3));
        questions.add(new Question("In SSRM Star Adventure, one of the quiz questions in course 5 asks which Star Revenge is objectively the best. Which hack does it say is the correct answer?",
                "Star Revenge 2.5",
                "Star Revenge 4.5",
                "Star Revenge 6",
                "Star Revenge 8",
                1));
        questions.add(new Question("Which Star Revenge hack is the first to feature Timerock as a boss (ordered by release date)?",
                "Star Revenge 6: Luigi's Adventure",
                "Star Revenge 7: Park of Time",
                "Star Revenge 6.9: Luigi Lost in Time",
                "Star Revenge 4: The Kedama Takeover",
                3));
        questions.add(new Question("In which of these Star Revenge games does Rainbo'b-omb van Color make an appearance?",
                "Star Revenge 2: Night of Doom",
                "Star Revenge 4: The Kedama Takeover",
                "Star Revenge 7: Park of Time",
                "Star Revenge 8: Scepter of Hope",
                2));
        questions.add(new Question("Which of the following levels has the most red coins?",
                "100 Coin Comet (Star Revenge 2: Night of Doom)",
                "Wing Luigi over the Rainbow (SM64 Masters Challenge)",
                "The Grand Finale (Super Mario Apocalypse)",
                "Transparent Obscure Ruins (SM76 Nightmare Edition)",
                1));
        //line 86 on base
    }

    public Question getRandomQuestion()
    {
        return questions.get(r.nextInt(questions.size()));
    }

    public ArrayList<Question> getQuestions()
    {
        return questions;
    }
}
