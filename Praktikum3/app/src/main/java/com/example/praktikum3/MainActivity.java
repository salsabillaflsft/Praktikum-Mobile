package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> foto =  new ArrayList<>();
    private ArrayList<String> nama =  new ArrayList<>();
    private ArrayList<String> detail =  new ArrayList<>();
    private ArrayList<String> lirik =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){

        RecyclerView recyclerView = findViewById(R.id.rc);
        SongAdapter adapterData = new SongAdapter(foto, nama, detail, lirik,this);

        recyclerView.setAdapter(adapterData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        nama.add("Last Time");
        detail.add("Giveon ft Snoh Aalerga");
        foto.add("https://t2.genius.com/unsafe/220x220/https%3A%2F%2Fimages.genius.com%2Fe6d3b02e967a5726a623791434eddfd4.1000x1000x1.png");
        lirik.add("[Intro: Snoh Aalegra]\n" +
                "Mmm, mmm-mmm\n" +
                "Come over\n" +
                "I know I shouldn't, know you shouldn't, come over\n" +
                "No\n" +
                "\n" +
                "[Verse 1: Giveon & Snoh Aalegra]\n" +
                "Back into your arms again and you say it's gettin' old\n" +
                "Sayin' that I love you just so you don't let me go\n" +
                "It ain't right but I'ma stay tonight because you told me so (I told you so)\n" +
                "Every time we try it's back and forth (Hmm, hmm)\n" +
                "\n" +
                "[Pre-Chorus: Giveon & Snoh Aalegra, Snoh Aalegra]\n" +
                "Hmm, hmm, it's like that, I swear I come right back\n" +
                "I want you just like that (Yeah, yeah)\n" +
                "Don't fight back\n" +
                "Hmm, hmm, baby don't get like that\n" +
                "I swear I just might be gone, gone by tonight\n" +
                "\n" +
                "[Chorus: Giveon, with Snoh Aalegra]\n" +
                "Just this last time\n" +
                "Don't make me regret it, I don't wanna say it\n" +
                "Let's not overthink it, baby\n" +
                "Just this last time (Time)\n" +
                "Don't make me regret it, I don't wanna say it\n" +
                "Let's not overthink it, baby\n" +
                "\n" +
                "[Post-Chorus: Giveon & Snoh Aalegra, Snoh Aalegra]\n" +
                "Come ovеr (Come over)\n" +
                "I know I shouldn't, know you shouldn't (Oh yeah)\n" +
                "Comе over (Yeah, yeah)\n" +
                "\n" +
                "[Verse 2: Snoh Aalegra & Giveon]\n" +
                "Here we go (Go), back into your arms again\n" +
                "I know it's gettin' silly yo\n" +
                "Sayin' that you love me just so I don't let you go (Let you go)\n" +
                "It ain't right but I'ma let you stay tonight, I told you so, baby (I told you, baby)\n" +
                "Every time we try it's back and forth (Hmm, hmm)\n" +
                "\n" +
                "[Pre-Chorus: Giveon & Snoh Aalegra, Giveon]\n" +
                "Hmm, hmm, it's like that, I swear I come right back (Come right back)\n" +
                "I want you just like that (Just like that)\n" +
                "Don't fight back\n" +
                "Hmm, hmm, baby don't get like that (Woah, oh)\n" +
                "I swear I just might be gone, gone by tonight\n" +
                "\n" +
                "[Chorus: Giveon & Snoh Aalegra, Snoh Aalegra]\n" +
                "Just this last time (Just this last time)\n" +
                "Don't make me regret it, I don't wanna say it\n" +
                "Let's not overthink it, baby\n" +
                "Just this last time (Just this, just this)\n" +
                "Don't make me regret it, I don't wanna say it\n" +
                "Let's not overthink it, baby (You, ooh, ooh-ooh)\n" +
                "\n" +
                "[Post-Chorus: Giveon & Snoh Aalegra]\n" +
                "Come over (Ooh, ooh, you should know better, better)\n" +
                "I know I shouldn't, know you shouldn't (Come over)\n" +
                "Come over\n" +
                "\n" +
                "[Outro: Snoh Aalegra, Giveon, Giveon & Snoh Aalegra]\n" +
                "Hmm, hmm, hmm, hmm, hmm\n" +
                "Come over to me\n" +
                "No, oh woah, oh woah\n" +
                "Oh, oh, oh, yeah\n" +
                "Just this last time\n" +
                "\n" +
                "[Interlude: Unknown Man & Giveon]\n" +
                "- Oh yeah that makes sense\n" +
                "- Yeah bro\n" +
                "- So, what you 'bout to get into?\n" +
                "- Uh, I'm 'bout to, I'ma pull up on a friend real quick\n" +
                "- Don't tell me you pulling up on\n" +
                "- Nah, no, no, bro, that's over with\n");

        nama.add("All She Wrote");
        detail.add("Justin Bieber");
        foto.add("https://t2.genius.com/unsafe/220x220/https%3A%2F%2Fimages.genius.com%2F00746dd83645940d61f7947fccd1b685.905x905x1.png");
        lirik.add("[Intro: Justin Bieber]\n" +
                "Yeah, yeah\n" +
                "Yeah, yeah, yeah, yeah, yeah, yeah, yeah, yeah, yeah, yeah\n" +
                "\n" +
                "[Verse 1: Justin Bieber]\n" +
                "We reject what we don't understand\n" +
                "We turn our backs on a fellow man\n" +
                "I wanna change, but my heart is bleedin'\n" +
                "Heart is hard, and can't nobody see me\n" +
                "I wanna be there for the ones that need me\n" +
                "I can't stand the pain I see on TV\n" +
                "Jealous 'cause they wanna be me\n" +
                "Damn it man, this life ain't easy\n" +
                "It takes over me\n" +
                "My unforgiveness keeps control of mе\n" +
                "Damnit, I gotta get a hold of me\n" +
                "Gotta get a hold of mе, oh\n" +
                "What you want out of life? That's the question\n" +
                "This ain't a simulation, it's a blessing\n" +
                "Is it a mistake or is it destined?\n" +
                "We ain't got no time for second guessin'\n" +
                "We can't save ourselves, we need a savior\n" +
                "We ain't make ourselves, we need a maker\n" +
                "I keep failin' myself, I need somethin' new\n" +
                "So I lay my life down, I give it all to You\n" +
                "[Bridge: Chandler Moore]\n" +
                "All to You, give it all to You (I give it all to You)\n" +
                "Give it all to You, give it all (I give it all to You)\n" +
                "Oh, oh\n" +
                "\n" +
                "[Verse 2: Justin Bieber & Chandler Moore]\n" +
                "I came to the end of me, believin' the enemy\n" +
                "Comin' with that \"Mmm\", man, you ain't a friend of me\n" +
                "Nothing can fix that, ooh, not even the Hennessy\n" +
                "I had to switch it up, yeah, switch up the remedy\n" +
                "God, can You use imperfect people? (Oh)\n" +
                "'Cause I'm broken through and through (Oh)\n" +
                "Just tell me where I need to go (Need to go)\n" +
                "'Cause that's all that I wanna do (All that I wanna do)\n" +
                "I'm a mess, but I'm tryna grow\n" +
                "I'm upset, but I still wanna know\n" +
                "Is there more for my life\n" +
                "Or is that all she wrote? (Is that all she wrote?)\n" +
                "Uh, is that all she wrote? (Is that all that she wrote?)\n" +
                "Is that all she wrote? (Is that all that she wrote?)\n" +
                "Is that all she wrote?\n" +
                "\n" +
                "[Verse 3: Brandon Love]\n" +
                "Thanks to all them Judas kisses, I got a master's in forgiveness\n" +
                "I don't need a jail system, I walk in conviction\n" +
                "I'd rather pray to God, than pray for wishes\n" +
                "I'm supernatural, not superstitious, there's a difference\n" +
                "Like relationship versus religion, that's a prison\n" +
                "I'm lightin' circle, then royal purple inside a prism\n" +
                "This flow is so universal, it came with dreams and visions\n" +
                "I got the keys to the kingdom, I'm 'bout my Father business\n" +
                "I came up straight from the bottom, I started from the finish\n" +
                "You can't undermine a mastermind\n" +
                "I may be out of your mind, but I ain't out of mine\n" +
                "I'm co-crucified, bury, resurrected\n" +
                "And perfected in the Son of God\n" +
                "Just like water turn to wine, I'm a prophetic sign\n" +
                "Ask your barber, I'ma headliner in New York Times\n" +
                "My life verses, I am His, yeah, and He is mine\n" +
                "The great \"I Am's\", the greatest Lamb of all time\n" +
                "Rebranded, redesigned and redefined\n" +
                "From Brandon to brand new\n" +
                "I'ma brand name in the household, brand too\n" +
                "Who are you to try to tell me what I can't do? We need a pull, huh?\n" +
                "[Outro]\n" +
                "You ever ask yourself \"Am I gonna make it?\"\n" +
                "Well, I don't know, of course I can fake it\n" +
                "But honestly, can I go wrong?\n" +
                "I'm so tired, I'm so broken, I'm so weary\n" +
                "Oh, God, oh, God\n");

        nama.add("Hey,Ma");
        detail.add("Bon Iver");
        foto.add("https://t2.genius.com/unsafe/296x0/https%3A%2F%2Fimages.genius.com%2F2158715386c7f57e42e1fe7f1cb83f54.1000x1000x1.png");
        lirik.add("[Verse 1]\n" +
                "I waited outside\n" +
                "I took it remote\n" +
                "I wanted a bath\n" +
                "\"Tell the story or he goes\"\n" +
                "\"Tell the story or he goes\"\n" +
                "\n" +
                "[Chorus]\n" +
                "Full time, you talk your money up\n" +
                "While it's living in a coal mine\n" +
                "Tall time to call your Ma\n" +
                "Hey Ma, hey Ma\n" +
                "Tall vote, you know you mope it up\n" +
                "Well, you wanted it your whole life\n" +
                "You're back and forth with light\n" +
                "\n" +
                "[Verse 2]\n" +
                "I waited outside\n" +
                "I was tokin' on dope\n" +
                "I hoped it all wunt go in a minute\n" +
                "With the past that you know\n" +
                "I wanted all that mind sugar\n" +
                "I want it all mine\n" +
                "I had a heavy mind, sugar\n" +
                "I took it, it was right\n" +
                "\n" +
                "[Chorus]\n" +
                "Full time, you talk your money up\n" +
                "While it's living in a coal mine\n" +
                "Tall time to call your Ma\n" +
                "Hey Ma, hey Ma\n" +
                "Tall vote, you know you mope it up\n" +
                "Well, you wanted it your whole life\n" +
                "You're back and forth with light\n" +
                "\n" +
                "[Interlude]\n" +
                "You're back and forth\n" +
                "You're back and forth\n" +
                "You go back and forth\n" +
                "And then you're back and forth\n" +
                "And back and forth\n" +
                "\n" +
                "[Verse 3]\n" +
                "I waited outside\n" +
                "Then you took me in the room\n" +
                "And you offered up the truth\n" +
                "My eyes crawling up the window to the wall\n" +
                "From dusk 'til dawn\n" +
                "Let me talk to 'em\n" +
                "Let me talk to 'em all\n" +
                "\n" +
                "[Chorus]\n" +
                "Full time, you talk your money up\n" +
                "While it's living in a coal mine\n" +
                "Tall time to call your Ma\n" +
                "Hey Ma, hey Ma\n" +
                "Tall vote, you know you mope it up\n" +
                "Well, you wanted it your whole life\n" +
                "You're back and forth with light");

        nama.add("Same Drugs");
        detail.add("Chance The Rapper");
        foto.add("https://t2.genius.com/unsafe/296x0/https%3A%2F%2Fimages.genius.com%2Fbd58f880e3639190c45ab29cd1bdf354.1000x1000x1.png");
        lirik.add("[Chorus]\n" +
                "We don't do the same drugs no more\n" +
                "We don't do the, we don't do the same drugs, do the same drugs no more\n" +
                "'Cause she don't do the same drugs no more\n" +
                "We don't do the, we don't do the same drugs, do the same drugs no more\n" +
                "\n" +
                "[Verse 1]\n" +
                "When did you change?\n" +
                "Wendy, you've aged\n" +
                "I thought you'd never grow up\n" +
                "I thought you'd never\n" +
                "Window closed, Wendy got old\n" +
                "I was too late, I was too late\n" +
                "A shadow of what I once was\n" +
                "\n" +
                "[Chorus]\n" +
                "'Cause we don't do the same drugs no more\n" +
                "We don't do the, we don't do the same drugs, do the same drugs no more\n" +
                "She don't laugh the same way no more\n" +
                "We don't do the, we don't do the same drugs, do the same drugs no more\n" +
                "\n" +
                "[Verse 2]\n" +
                "Where did you go?\n" +
                "Why would you stay?\n" +
                "You must have lost your marbles\n" +
                "You always were so forgetful\n" +
                "In a hurry, don't wait up\n" +
                "I was too late, I was too late\n" +
                "A shadow of what I once was\n" +
                "'Cause we don't, we don't do what we say we're gonna\n" +
                "You were always perfect, and I was only practice\n" +
                "Don't you miss the days, stranger?\n" +
                "Don't you miss the days?\n" +
                "Don't you miss the danger?\n" +
                "[Chorus: Chance The Rapper & Eryn Allen Kane]\n" +
                "We don't (We don't) do the same drugs no more (Do the same drugs no more)\n" +
                "We don't do the, we don't do the same drugs, do the same drugs no more\n" +
                "We don't (We don't) do the same drugs no more (Do the same drugs no more)\n" +
                "We don't do the, we don't do the same drugs, do the same drugs no more\n" +
                "We don't do the, we don't do the same drugs\n" +
                "\n" +
                "[Outro: Chance The Rapper & Eryn Allen Kane]\n" +
                "Turn it around\n" +
                "I remember when\n" +
                "This age of pathetics\n" +
                "Don't forget the happy thoughts\n" +
                "All you need is happy thoughts\n" +
                "The past tense, past bed time\n" +
                "Way back then when everything we read was real\n" +
                "And everything we said rhymed\n" +
                "Wide eyed kids being kids\n" +
                "Why did you stop?\n" +
                "What did you do to your hair?\n" +
                "Where did you go to end up right back here?\n" +
                "When did you start to forget how to fly?\n" +
                "It's so natural\n" +
                "Just like Juicy Fruit\n" +
                "Works like a magic trick\n" +
                "Please give me half of that\n" +
                "We don't, we don't, we don't\n" +
                "Don't you color out\n" +
                "Don't you bleed on out, oh\n" +
                "Stay in the line, stay in the line\n" +
                "Dandelion\n" +
                "Do the same drugs no more\n" +
                "We don't do the, we don't do the same drugs, do the same drugs no more\n" +
                "We don't, we don't, we don't\n" +
                "Don't you color out\n" +
                "Don't you bleed on out, oh\n" +
                "Stay in the line, stay in the line\n" +
                "Dandelion\n");

        nama.add("Always Be My Baby");
        detail.add("Mariah Carey");
        foto.add("https://t2.genius.com/unsafe/296x0/https%3A%2F%2Fimages.genius.com%2F7f678d1be61222f1694310c5ecb3d988.1000x1000x1.jpg");
        lirik.add("[Verse 1]\n" +
                "We were as one, babe\n" +
                "For a moment in time\n" +
                "And it seemed everlasting\n" +
                "That you would always be mine\n" +
                "Now you want to be free\n" +
                "So I'll let you fly\n" +
                "'Cause I know in my heart, babe\n" +
                "Our love will never die, no\n" +
                "\n" +
                "[Chorus]\n" +
                "You'll always be a part of me\n" +
                "I'm part of you indefinitely\n" +
                "Boy, don't you know you can't escape me?\n" +
                "Ooh, darling, 'cause you'll always be my baby\n" +
                "And we'll linger on\n" +
                "Time can't erase a feeling this strong\n" +
                "No way you're never gonna shake me\n" +
                "Ooh, darling, 'cause you'll always be my baby\n" +
                "\n" +
                "[Verse 2]\n" +
                "I ain't gonna cry, no\n" +
                "And I won't beg you to stay\n" +
                "If you're determined to leave, boy\n" +
                "I will not stand in your way\n" +
                "But inevitably\n" +
                "You'll be back again\n" +
                "'Cause you know in your heart, babe\n" +
                "Our love will never end, no\n" +
                "\n" +
                "[Chorus]\n" +
                "You'll always be a part of me\n" +
                "I'm part of you indefinitely\n" +
                "Boy, don't you know you can't escape me?\n" +
                "Ooh, darling, 'cause you'll always be my baby\n" +
                "And we'll linger on\n" +
                "Time can't erase a feeling this strong\n" +
                "No way you're never gonna shake me\n" +
                "Ooh, darling, 'cause you'll always be my baby\n" +
                "\n" +
                "[Bridge]\n" +
                "I know that you'll be back, boy\n" +
                "When your days and your nights get a little bit colder, oh\n" +
                "I know that you'll be right back, baby\n" +
                "Oh, baby, believe me, it's only a matter of time, time\n" +
                "\n" +
                "[Chorus]\n" +
                "You'll always be a part of me\n" +
                "I'm part of you indefinitely\n" +
                "Boy, don't you know you can't escape me?\n" +
                "Ooh, darling, 'cause you'll always be my baby\n" +
                "And we'll linger on (And we will linger on and on)\n" +
                "Time can't erase a feeling this strong\n" +
                "No way you're never gonna shake me (Ooh baby)\n" +
                "Ooh, darling, 'cause you'll always be my baby\n" +
                "You'll always be a part of me\n" +
                "I'm part of you indefinitely\n" +
                "Boy, don't you know you can't escape me?\n" +
                "Ooh, darling, 'cause you'll always be my baby\n" +
                "(You and I) And we'll linger on\n" +
                "Time can't erase a feeling this strong (You and I)\n" +
                "No way you're never going to shake me (you and I)\n" +
                "Ooh, darling, 'cause you'll always be my baby\n" +
                "\n" +
                "[Outro]\n" +
                "You and I will always be\n" +
                "No way you're never gonna shake me\n" +
                "No way you're never gonna shake me\n" +
                "You and I will always be");

        nama.add("Hold On");
        detail.add("The Internet");
        foto.add("https://t2.genius.com/unsafe/296x0/https%3A%2F%2Fimages.genius.com%2Fa8c65a3d84d3390fb63a8821e369bd9f.1000x1000x1.jpg");
        lirik.add("[Verse 1]\n" +
                "Thinking ahead of time\n" +
                "Why don’t you spend the night?\n" +
                "I know you love me\n" +
                "Pick up and roll the dice\n" +
                "Reading between the lines\n" +
                "I know you love me\n" +
                "We can book a flight\n" +
                "Wake up in paradise\n" +
                "Sun up above us\n" +
                "Tell me you down to ride\n" +
                "And you can bet your life\n" +
                "No one above you\n" +
                "\n" +
                "[Chorus 1]\n" +
                "Said hold on, can’t stop love\n" +
                "Said hold on, can’t stop la (can’t stop, yeah, yeah)\n" +
                "Said hold on, can’t stop la (yeah, yeah, yeah, yeah)\n" +
                "Said hold on, can’t stop la\n" +
                "\n" +
                "[Verse 2]\n" +
                "And as long as you’re with me\n" +
                "I’m definitely\n" +
                "Yours for the takin’\n" +
                "Don’t be mistakin’\n" +
                "And as long as you’re wit’ it\n" +
                "I’ll be committed to you\n" +
                "\n" +
                "[Bridge 1]\n" +
                "(Ay, aw, yeah) I’ll show you what I know\n" +
                "You’ll give me what I need\n" +
                "Not saying I’m a pro\n" +
                "But you could learn from me\n" +
                "We go another round\n" +
                "Before we fall asleep\n" +
                "You got me on a cloud nine, baby\n" +
                "Feels almost like a dream\n" +
                "Something ‘bout your body (yeah, yeah)\n" +
                "La\n" +
                "\n" +
                "[Chorus 1]\n" +
                "(Yeah, yeah) Said hold on, can’t stop la (yeah)\n" +
                "I think you better hold on, can’t stop la (yeah, yeah, yeah)\n" +
                "Said hold on, can’t stop la (yeah, yeah)\n" +
                "I think you better hold on, can’t stop la (yeah, yeah, yeah)\n" +
                "\n" +
                "[Chorus 2]\n" +
                "I think you better hold on\n" +
                "I’m not ready to go\n" +
                "I hear you sayin’ don’t stop\n" +
                "I’d rather take it slow\n" +
                "I see you tryna hold on\n" +
                "But we aren't lettin’ go\n" +
                "You let me take control now\n" +
                "You’re ready to explode\n" +
                "\n" +
                "(Yeah, Yeah, Yeah, Yeah, Yeah)\n" +
                "\n" +
                "[Chorus 1]\n" +
                "Said hold on, can’t stop la (holding on, holding on)\n" +
                "Said hold on, can’t stop la (holding on, holding on)\n" +
                "Said hold on, can’t stop la (holding on, holding on)\n" +
                "Said hold on, can’t stop la (holding on, holding on)\n" +
                "\n" +
                "[Horn Interlude]\n" +
                "\n" +
                "[Bridge 2]\n" +
                "(Oh, oh, yeah)\n" +
                "(Oh-oh-oh, yeah)\n" +
                "And when you’re done just say enough (enough)\n" +
                "When your breath just can’t keep up (keep up)\n" +
                "‘Cause it’s bedtime baby (yeah, yay)\n" +
                "\n" +
                "[Chorus 1]\n" +
                "La\n" +
                "Said hold on, can’t stop la (holding on, holding on)\n" +
                "Said hold on, can’t stop la (holding on, holding on)\n" +
                "Said hold on, can’t stop la (holding on, holding on)\n" +
                "Said hold on, can’t stop la (holding on, holding on)\n" +
                "\n" +
                "[Instrumental Outro]");

        nama.add("W.A.Y.S");
        detail.add("Jhene Aiko");
        foto.add("https://t2.genius.com/unsafe/296x0/https%3A%2F%2Fimages.genius.com%2F7338cd2ea43e58c4ac27ed4e93b414b7.1000x1000x1.jpg");
        lirik.add("[Verse 1]\n" +
                "At forty-four minutes to four\n" +
                "An angel walked up to my door\n" +
                "Opened the windows to my soul\n" +
                "Told me he thinks that I should know\n" +
                "There's no slowing down\n" +
                "As the globe spins 'round and 'round\n" +
                "\n" +
                "[Refrain]\n" +
                "You better keep going, better keep going\n" +
                "Better keep going, you better keep going\n" +
                "Better keep going, you better keep going\n" +
                "You better keep going, you better keep going\n" +
                "You better keep going\n" +
                "\n" +
                "[Bridge]\n" +
                "If there's one thing that I learned\n" +
                "While in those county lines\n" +
                "It's that everything takes time\n" +
                "You have gotta lose your pride\n" +
                "You have gotta lose your mind\n" +
                "Just to find your peace of mind\n" +
                "You have got to trust the signs\n" +
                "Everything will turn out fine\n" +
                "\n" +
                "[Hook]\n" +
                "So why aren't you smiling? Why aren't you smiling?\n" +
                "Life can get wild when you're caught in the whirlwind\n" +
                "Lost in the world when you're chasing the win\n" +
                "You gotta understand\n" +
                "There's really no end, there's really no beginning\n" +
                "There's really no real, there's really no pretending\n" +
                "There's really no fail, there's really no winning\n" +
                "Cause nothing really is, and everything really isn't\n" +
                "\n" +
                "[Verse 2]\n" +
                "At forty-four minutes to four\n" +
                "An angel walked up to my door\n" +
                "Opened the windows to my soul\n" +
                "Told me he thinks that I should know\n" +
                "That life only gets harder, but you gotta get stronger\n" +
                "This is for my brother, I do this for my daughter\n" +
                "\n" +
                "[Refrain]\n" +
                "That's why I keep going, that's why I keep going\n" +
                "That's why I keep going\n" +
                "That's why I keep going, I gotta keep going\n" +
                "I gotta keep going, I gotta keep going\n" +
                "I gotta keep going, gotta keep going\n" +
                "Gotta keep going\n" +
                "I gotta show them that I can keep going\n" +
                "I gotta keep going, I gotta keep going\n" +
                "I gotta keep going\n" +
                "\n" +
                "[Hook]\n" +
                "Why aren't you smiling? Why aren't you smiling?\n" +
                "Life can get wild when you're caught in the whirlwind\n" +
                "Lost in the world when you're chasing the win\n" +
                "You gotta understand\n" +
                "There's really no end, there's really no beginning\n" +
                "There's really no real, there's really no pretending\n" +
                "There's really no fail, there's really no winning\n" +
                "Cause nothing really is and everything really isn't\n" +
                "\n" +
                "[Outro]\n" +
                "That's why I keep going");

        nama.add("Session 32");
        detail.add("Summer Walker");
        foto.add("https://t2.genius.com/unsafe/296x0/https%3A%2F%2Fimages.genius.com%2F03fbc79adc620966730d1d464bc9db93.500x500x1.jpg");
        lirik.add("[Verse 1]\n" +
                "Threw away your love letters\n" +
                "I thought it'd make me feel better\n" +
                "I finally got you out my bed\n" +
                "But I still can't get you out my head, ooh\n" +
                "I'm sending you one text at a time\n" +
                "I know you're by your phone\n" +
                "So boy pick up your line\n" +
                "And I ain’t too proud to beg\n" +
                "So what's been said has been said\n" +
                "\n" +
                "[Chorus]\n" +
                "And I need you to know\n" +
                "You don't know what love is\n" +
                "And I need you to know, you don't know\n" +
                "\n" +
                "[Verse 2]\n" +
                "And you don't know what love is\n" +
                "If you don't put up a fight\n" +
                "You don't know what love is\n" +
                "If you don't stay up all night, crying\n" +
                "You don't know what love is\n" +
                "If you’re too good to call a million times\n" +
                "And you say you know what love is\n" +
                "But I swear you never seen it in your life, ooh\n" +
                "\n" +
                "[Outro]\n" +
                "I swear you never seen it in your life\n" +
                "I swear you never seen it in your life");

        nama.add("Godspeed");
        detail.add("Frank Ocean");
        foto.add("https://t2.genius.com/unsafe/296x0/https%3A%2F%2Fimages.genius.com%2F626ddf4c88de200d9487bb42449d1ae3.1000x1000x1.png");
        lirik.add("[Verse: Frank Ocean & Yung Lean]\n" +
                "I will always love you how I do\n" +
                "Let go of a prayer for you\n" +
                "Just a sweet word\n" +
                "The table is prepared for you\n" +
                "(Ooh, ooh, ooh)\n" +
                "Ball so hard, all my boys flex\n" +
                "Wishing you godspeed, glory\n" +
                "There will be mountains you won't move\n" +
                "(Ooh, ooh, ooh)\n" +
                "Still I'll always be there for you how I do\n" +
                "I let go of my claim on you\n" +
                "It's a free world\n" +
                "You look down on where you came from sometimes\n" +
                "But you'll have this place to call home always\n" +
                "\n" +
                "[Bridge: Frank Ocean & Kim Burrell]\n" +
                "(Godspeed, glory)\n" +
                "This love will keep us through blinding of the eyes (Ohh)\n" +
                "Silence in the ears, darkness of the mind\n" +
                "Until it's time\n" +
                "This love will keep us through blinding of the eyes (Ohh)\n" +
                "Silence in the ears, darkness of the mind (Ohh)\n" +
                "Ohh, it's 'til it's time we die\n" +
                "This love will keep us through blinding of the eyes\n" +
                "Silence in the ears, darkness of the mind\n" +
                "\n" +
                "[Outro: Kim Burrell]\n" +
                "Oh-oh, ohhh\n" +
                "I'll always love you\n" +
                "Until the time we die\n" +
                "Oh-oh, ohhh");

        nama.add("BIGGER");
        detail.add("Beyonce");
        foto.add("https://t2.genius.com/unsafe/296x0/https%3A%2F%2Fimages.genius.com%2Fb8659ccffe15ca47f83ce2d018a21adc.1000x1000x1.jpg");
        lirik.add("[Intro: Beyoncé]\n" +
                "If you feel insignificant\n" +
                "You better think again\n" +
                "Better wake up because\n" +
                "You're part of something way bigger\n" +
                "You're part of something way bigger\n" +
                "Not just a speck in the universe\n" +
                "Not just some words in a bible verse\n" +
                "You are the living word\n" +
                "Ah, you're part of something way bigger\n" +
                "Bigger than you‚ bigger than we\n" +
                "Bigger than the picture they framed us to see\n" +
                "But now we see it\n" +
                "And it ain't no secret‚ no\n" +
                "\n" +
                "[Refrain: Beyoncé]\n" +
                "Understand that truth about that question in your soul\n" +
                "Look up‚ don't look down, then watch the answers unfold\n" +
                "Life is your birthright, they hid that in the fine print\n" +
                "Uh‚ take the pen and rewrite it\n" +
                "Step out your estimate\n" +
                "Step in your essence and know that you're excellent\n" +
                "Rise (Rise), the spirit is teachin'\n" +
                "No, I'm not just preachin'‚ I'm takin' my own advice\n" +
                "\n" +
                "[Verse: Beyoncé]\n" +
                "Let Mama let you know (Let you know)\n" +
                "Mama's still tryin'\n" +
                "I can't get no days off\n" +
                "I don't get no days off\n" +
                "Truly, I'm feelin' it\n" +
                "I had to say that thing twice (Twice)\n" +
                "Tryin' to be a good wife\n" +
                "Still really hard, I can't lie\n" +
                "But I promised you I would fight, so I fight\n" +
                "If you're feelin' frustrated and (Oh)\n" +
                "You're sinkin', I'm jumpin' in (Oh)\n" +
                "Forgiveness is key because\n" +
                "We're fightin' something way bigger\n" +
                "You'll never lose, we are winners\n" +
                "I'll be the roots, you'll be the tree\n" +
                "Pass on the fruit that was given to me\n" +
                "Legacy, ah\n" +
                "We're part of something way bigger\n" +
                "Remembering DMX | For The Record\n" +
                "\n" +
                "[Chorus: Beyoncé]\n" +
                "(Yeah) Bigger\n" +
                "You're part of something way bigger\n" +
                "Bigger than you, bigger than we\n" +
                "Bigger than the picture they framed us to see\n" +
                "Legacy, oh\n" +
                "You're part of something way bigger\n" +
                "\n" +
                "[Bridge: Beyoncé]\n" +
                "Let love be the water\n" +
                "I pour into you and you pour into me\n" +
                "There ain't no drought here\n" +
                "Bloom into our actual powers\n" +
                "I'll be your sanctuary\n" +
                "You just don't know it yet\n" +
                "You just don't know it yet\n" +
                "No matter how hard it gets\n" +
                "You got my blood in ya\n" +
                "And you're gonna rise\n" +
                "\n" +
                "[Chorus: Beyoncé & RAYE]\n" +
                "You're part of something way bigger\n" +
                "You're part of something way bigger\n" +
                "Bigger than you, bigger than me\n" +
                "Bigger than the picture they paint us to be, yeah\n" +
                "Ooh, ooh, ooh\n" +
                "You're part of something way bigger\n" +
                "\n" +
                "[Refrain: Beyoncé]\n" +
                "Understand that truth about that question in your soul (Bigger)\n" +
                "Look up, don't look down, then watch the answers unfold (Bigger)\n" +
                "Life is your birthright, they hid that in the fine print (Bigger)\n" +
                "Take the pen and rewrite it\n" +
                "Step out your estimate\n" +
                "Step in your essence and know that you're excellent\n" +
                "Rise, the spirit is teachin'\n" +
                "No, I'm not just preachin', I'm takin' my own advice\n" +
                "\n" +
                "[Outro: Beyoncé]\n" +
                "If you feel insignificant\n" +
                "You better think again\n" +
                "Better wake up because\n" +
                "You're part of something way bigger\n" +
                "You're part of something way bigger\n" +
                "I'll be the roots, you'll be the tree\n" +
                "Pass on the fruit that was given to me\n" +
                "Legacy, ah\n" +
                "We're part of something way bigger\n");


        prosesRecyclerViewAdapter();


    }

}