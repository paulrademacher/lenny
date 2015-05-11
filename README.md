# Lenny ( ͡° ͜ʖ ͡°)

This is the official Lenny library for Java.

Writes Lennys to stdout or to `slf4j`, optionally followed by a String message.

All the methods below have two versions:

* Without arguments, you just get the lenny.
* With a String message, you get lenny followed by the string.

For example, `Lenny2.yay("Function completed");`

will write this to stdout:

```
 \( ͡o ͜ʖ ͡o)/ Function completed
```

Each Lenny also has `slf4j` logging calls:

* `.info()`   // Both no-args, and with a single String message
* `.warn()`   // No-args or with a String message
* `.debug()`  // etc
* `.error()`
* `.trace()`

And if the Lenny has *yay*, *flex*, and *shrug* versions, then there will also be *yay*,
*flex*, and *shrug* logging calls.  For example, `Lenny4.warnFlex("Function completed");`
outputs this as an `slf4j` `warn()` call (exact output depends on your `slf4j`
configuration):

```
 WARN  [2015-05-11 03:22:32]: ᕦ( ͡ಠ ͜ʖ ͡ಠ)ᕤ Function completed
```

## The Lennys

```
import lenny.*;

Lenny.println();   //  ( ͡° ͜ʖ ͡°)
Lenny.yay();       //  \( ͡° ͜ʖ ͡°)/
Lenny.flex();      //  ᕦ( ͡° ͜ʖ ͡°)ᕤ
Lenny.shrug();     //  ¯\_( ͡° ͜ʖ ͡°)_/¯

Shrug.println();   //  ¯\_(ツ)_/¯

Gimme.println();   //  ༼ つ ◕_◕ ༽つ

Whatever.println(); //  (ツ)
Whatever.yay();     //  \(ツ)/
Whatever.flex();    //  ᕦ(ツ)ᕤ
Whatever.shrug();   //  ¯\_(ツ)_/¯

Lenny2.println();  //  ( ͡o ͜ʖ ͡o)
Lenny2.yay();      //  \( ͡o ͜ʖ ͡o)/
Lenny2.flex();     //  ᕦ( ͡o ͜ʖ ͡o)ᕤ
Lenny2.shrug();    //  ¯\_( ͡o ͜ʖ ͡o)_/¯

Lenny3.println();  //  ( ͡◕ ͜ʖ ͡◕)
Lenny3.yay();      //  \( ͡◕ ͜ʖ ͡◕)/
Lenny3.flex();     //  ᕦ( ͡◕ ͜ʖ ͡◕)ᕤ
Lenny3.shrug();    //  ¯\_( ͡◕ ͜ʖ ͡◕)_/¯

Lenny4.println();  //  ( ͡ಠ ͜ʖ ͡ಠ)
Lenny4.yay();      //  \( ͡ಠ ͜ʖ ͡ಠ)/
Lenny4.flex();     //  ᕦ( ͡ಠ ͜ʖ ͡ಠ)ᕤ
Lenny4.shrug();    //  ¯\_( ͡ಠ ͜ʖ ͡ಠ)_/¯

Lenny5.println();  //  ( ͡◉ ͜ʖ ͡◉))
Lenny5.yay();      //  \( ͡◉ ͜ʖ ͡◉))/
Lenny5.flex();     //  ᕦ( ͡◉ ͜ʖ ͡◉))ᕤ
Lenny5.shrug();    //  ¯\_( ͡◉ ͜ʖ ͡◉))_/¯

Lenny6.println();  //  ( ͡◐ ͜ʖ ͡◑))
Lenny6.yay();      //  \( ͡◐ ͜ʖ ͡◑))/
Lenny6.flex();     //  ᕦ( ͡◐ ͜ʖ ͡◑))ᕤ
Lenny6.shrug();    //  ¯\_( ͡◐ ͜ʖ ͡◑))_/¯

Lenny7.println();  //  ( ͡ຈ ͜ʖ ͡ຈ)
Lenny7.yay();      //  \( ͡ຈ ͜ʖ ͡ຈ)/
Lenny7.flex();     //  ᕦ( ͡ຈ ͜ʖ ͡ຈ)ᕤ
Lenny7.shrug();    //  ¯\_( ͡ຈ ͜ʖ ͡ຈ)_/¯

Lenny8.println();  //  ( ͡◔ ͜ʖ ͡◔)
Lenny8.yay();      //  \( ͡◔ ͜ʖ ͡◔)/
Lenny8.flex();     //  ᕦ( ͡◔ ͜ʖ ͡◔)ᕤ
Lenny8.shrug();    //  ¯\_( ͡◔ ͜ʖ ͡◔)_/¯

Lenny9.println();  //  ( ͡⚆ ͜ʖ ͡⚆)
Lenny9.yay();      //  \( ͡⚆ ͜ʖ ͡⚆)/
Lenny9.flex();     //  ᕦ( ͡⚆ ͜ʖ ͡⚆)ᕤ
Lenny9.shrug();    //  ¯\_( ͡⚆ ͜ʖ ͡⚆)_/¯

Lenny10.println(); //  ( ͡ʘ ͜ʖ ͡ʘ)
Lenny10.yay();     //  \( ͡ʘ ͜ʖ ͡ʘ)/
Lenny10.flex();    //  ᕦ( ͡ʘ ͜ʖ ͡ʘ)ᕤ
Lenny10.shrug();   //  ¯\_( ͡ʘ ͜ʖ ͡ʘ)_/¯

Crying.println();  //  ( ͡; ʖ̯  ͡;)
Crying.yay();      //  \( ͡; ʖ̯  ͡;)/
Crying.flex();     //  ᕦ( ͡; ʖ̯  ͡;)ᕤ
Crying.shrug();    //  ¯\_( ͡; ʖ̯  ͡;)_/¯

Meh.println();     //  (‾ ʖ̫ ‾)
Meh.yay();         //  \(‾ ʖ̫ ‾)/
Meh.flex();        //  ᕦ(‾ ʖ̫ ‾)ᕤ
Meh.shrug();       //  ¯\_(‾ ʖ̫ ‾)_/¯

Wat.println();     //  (ಠ_ಠ)
Wat.yay();         //  \(ಠ_ಠ)/
Wat.flex();        //  ᕦ(ಠ_ಠ)ᕤ
Wat.shrug();       //  ¯\_(ಠ_ಠ)_/¯

Yeah.println();    //  (ಠ‿ಠ)
Yeah.yay();        //  \(ಠ‿ಠ)/
Yeah.flex();       //  ᕦ(ಠ‿ಠ)ᕤ
Yeah.shrug();      //  ¯\_(ಠ‿ಠ)_/¯

Zoidberg.println(); //  (\/)(°,,,°)(\/)

Run.println();     //  (╯°□°）╯

Happy.println();   //  (◕‿◕)
Happy.yay();       //  \(◕‿◕)/
Happy.flex();      //  ᕦ(◕‿◕)ᕤ
Happy.shrug();     //  ¯\_(◕‿◕)_/¯

Snap.println();    //  (☞ﾟ∀ﾟ)☞

Shrug2.println();  //  \_(ʘ_ʘ)_/

Mad.println();     //  (ง •̀_•́)ง

Fight.println();   //  (ง'̀-'́)ง

Gimme2.println();  //  (っ◕‿◕)っ

Gimme3.println();  //  (づ｡◕‿‿◕｡)づ

Gimme4.println();  //  (ﾉ◕ヮ◕)ﾉ

Gimme5.println();  //  (ノ・∀・)ノ

Happy2.println();  //  ༼ຈل͜ຈ༽
Happy2.yay();      //  \༼ຈل͜ຈ༽/
Happy2.flex();     //  ᕦ༼ຈل͜ຈ༽ᕤ
Happy2.shrug();    //  ¯\_༼ຈل͜ຈ༽_/¯

Crying2.println(); //  (╯︵╰,)
Crying2.yay();     //  \(╯︵╰,)/
Crying2.flex();    //  ᕦ(╯︵╰,)ᕤ
Crying2.shrug();   //  ¯\_(╯︵╰,)_/¯

Angry.println();   //  (っ˘̩╭╮˘̩)っ

Swimming.println(); //  ¸.·´¯`·.´¯`·.¸¸.·´¯`·.¸><(((º>

Fish.println();    //  ><(((('>

Metal.println();   //  \m/_(>_<)_\m/

Fu.println();      //  ┌∩┐(◣_◢)┌∩┐

Fu2.println();     //  (ಠ_ಠ)┌∩┐

Meh2.println();    //  ヽ(。_°)ノ

Crazy.println();   //  (⊙_◎)
Crazy.yay();       //  \(⊙_◎)/
Crazy.flex();      //  ᕦ(⊙_◎)ᕤ
Crazy.shrug();     //  ¯\_(⊙_◎)_/¯

```

---------

Made with :horse: by Paul Rademacher.