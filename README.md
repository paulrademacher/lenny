# Lenny ( ͡° ͜ʖ ͡°)

This is the official Lenny library for Java.

Writes Lennys to stdout or to `slf4j`, optionally followed by a String message.

This is very important for your application.

All the methods below have two versions:

* Without arguments, you just get the lenny.
* With a String message, you get lenny followed by the string.

For example:

```    Lenny2.yay("Function completed");```

will write this to stdout:

```    \( ͡o ͜ʖ ͡o)/ Function completed```

Each Lenny also has `slf4j` logging calls:

* `.info()`   // Both no-args, and with a single String message
* `.warn()`   // No-args or with a String message
* `.debug()`  // etc
* `.error()`
* `.trace()`

And if the Lenny has a *yay* or *flex* versions, then there will also be *yay*
and *flex* logging calls.  For example:

```    Lenny4.warnFlex("Function completed");```

will output this as an `slf4j` warn() call:

```    ᕦ( ͡ಠ ͜ʖ ͡ಠ)ᕤ Function completed```

```
import lenny.*;

Lenny.println();      //  ( ͡° ͜ʖ ͡°)
Lenny.yay();          //  \( ͡° ͜ʖ ͡°)/
Lenny.flex();         //  ᕦ( ͡° ͜ʖ ͡°)ᕤ

Shrug.println();      //  ¯\_(ツ)_/¯

Gimme.println();      //  ༼ つ ◕_◕ ༽つ

Happy.println();      //  (ツ)
Happy.yay();          //  \(ツ)/
Happy.flex();         //  ᕦ(ツ)ᕤ

Lenny2.println();     //  ( ͡o ͜ʖ ͡o)
Lenny2.yay();         //  \( ͡o ͜ʖ ͡o)/
Lenny2.flex();        //  ᕦ( ͡o ͜ʖ ͡o)ᕤ

Lenny3.println();     //  ( ͡◕ ͜ʖ ͡◕)
Lenny3.yay();         //  \( ͡◕ ͜ʖ ͡◕)/
Lenny3.flex();        //  ᕦ( ͡◕ ͜ʖ ͡◕)ᕤ

Lenny4.println();     //  ( ͡ಠ ͜ʖ ͡ಠ)
Lenny4.yay();         //  \( ͡ಠ ͜ʖ ͡ಠ)/
Lenny4.flex();        //  ᕦ( ͡ಠ ͜ʖ ͡ಠ)ᕤ

Lenny5.println();     //  ( ͡◉ ͜ʖ ͡◉))
Lenny5.yay();         //  \( ͡◉ ͜ʖ ͡◉))/
Lenny5.flex();        //  ᕦ( ͡◉ ͜ʖ ͡◉))ᕤ

Lenny6.println();     //  ( ͡◐ ͜ʖ ͡◑))
Lenny6.yay();         //  \( ͡◐ ͜ʖ ͡◑))/
Lenny6.flex();        //  ᕦ( ͡◐ ͜ʖ ͡◑))ᕤ

Lenny7.println();     //  ( ͡ຈ ͜ʖ ͡ຈ)
Lenny7.yay();         //  \( ͡ຈ ͜ʖ ͡ຈ)/
Lenny7.flex();        //  ᕦ( ͡ຈ ͜ʖ ͡ຈ)ᕤ

Lenny8.println();     //  ( ͡◔ ͜ʖ ͡◔)
Lenny8.yay();         //  \( ͡◔ ͜ʖ ͡◔)/
Lenny8.flex();        //  ᕦ( ͡◔ ͜ʖ ͡◔)ᕤ

Lenny9.println();     //  ( ͡⚆ ͜ʖ ͡⚆)
Lenny9.yay();         //  \( ͡⚆ ͜ʖ ͡⚆)/
Lenny9.flex();        //  ᕦ( ͡⚆ ͜ʖ ͡⚆)ᕤ

Lenny10.println();    //  ( ͡ʘ ͜ʖ ͡ʘ)
Lenny10.yay();        //  \( ͡ʘ ͜ʖ ͡ʘ)/
Lenny10.flex();       //  ᕦ( ͡ʘ ͜ʖ ͡ʘ)ᕤ

Crying.println();     //  ( ͡; ʖ̯  ͡;)
Crying.yay();         //  \( ͡; ʖ̯  ͡;)/
Crying.flex();        //  ᕦ( ͡; ʖ̯  ͡;)ᕤ

Meh.println();        //  (‾ ʖ̫ ‾)
Meh.yay();            //  \(‾ ʖ̫ ‾)/
Meh.flex();           //  ᕦ(‾ ʖ̫ ‾)ᕤ

Wat.println();        //  (ಠ_ಠ)
Wat.yay();            //  \(ಠ_ಠ)/
Wat.flex();           //  ᕦ(ಠ_ಠ)ᕤ

Yeah.println();       //  (ಠ‿ಠ)
Yeah.yay();           //  \(ಠ‿ಠ)/
Yeah.flex();          //  ᕦ(ಠ‿ಠ)ᕤ

Rawr.println();       //  (\/)(°,,,°)(\/)

Run.println();        //  (╯°□°）╯

Run2.println();       //  (ﾉ◕ヮ◕)ﾉ

Run3.println();       //  (ノ・∀・)ノ

Happy2.println();     //  (◕‿◕)
Happy2.yay();         //  \(◕‿◕)/
Happy2.flex();        //  ᕦ(◕‿◕)ᕤ

Snap.println();       //  (☞ﾟ∀ﾟ)☞'

Shrug2.println();     //  \_(ʘ_ʘ)_/

Mad.println();        //  (ง •̀_•́)ง

Fight.println();      //  (ง'̀-'́)ง

Gimme2.println();     //  (っ◕‿◕)っ

Gimme3.println();     //  (づ｡◕‿‿◕｡)づ

Happy3.println();     //  ༼ຈل͜ຈ༽
Happy3.yay();         //  \༼ຈل͜ຈ༽/
Happy3.flex();        //  ᕦ༼ຈل͜ຈ༽ᕤ

Swimming.println();   //  ¸.·´¯`·.´¯`·.¸¸.·´¯`·.¸><(((º>

Fish.println();       //  ><(((('>

Fight.println();      //  (ง︡'-'︠)ง

Metal.println();      //  \m/_(>_<)_\m/

Fu.println();         //  ┌∩┐(◣_◢)┌∩┐

Fu2.println();        //  (ಠ_ಠ)┌∩┐

Meh2.println();       //  ヽ(。_°)ノ

Crazy.println();      //  (⊙_◎)
Crazy.yay();          //  \(⊙_◎)/
Crazy.flex();         //  ᕦ(⊙_◎)ᕤ

```

---------

Made with :horse: by Paul Rademacher.