Ulti - A Java client for Riot's League of Legends API
=====

A simple client to access League of Legends game data via Riot's API.

Ulti was designed to make it easy for you to get all of the data you need so you can focus on making your application **great**.

For a full view of the api, the javadoc can be found [here](https://a64adam.github.io/ulti)

Ulti provides you with
- A simple API
- Efficient network requests via Square's OkHttp library
- Access to the latest versions of each LoL API
- Ability to run anywhere (using Java 1.6+)
- A full test suite validating each API call

## Download

Downloadable .jars can be found on the [GitHub releases page](https://github.com/a64adam/ulti/releases)

Gradle and Maven support are coming soon.

## Usage
Getting started with Ulti is simple:
```
Ulti ulti = new Ulti("YOUR_API_KEY");
```

You can also specify the region you wish to use:
```
// NA is the default region. The region can be changed at any
// time via the setRegion() function
Ulti ulti = new Ulti("YOUR_API_KEY", Region.NA);
```

Once you have your Ulti object created, you're ready to query whatever you like:
```
Summoner summoner = ulti.getSummonerByName("getCarry");
long summonerId = summoner.getId();

PlayerHistory history = ulti.getMatchHistoryBySummonerId(summonerId);
```

There is also access to the static data API's:
```
MasteryList masteries = ulti.getStaticMasteryList();
RuneList runes = ulti.getStaticRuneList();
```

For a full list of calls, please see the javadoc [here](https://a64adam.github.io/ulti), or the official API reference from Riot [here](https://developer.riotgames.com/api/methods)

## History
v1.1
- Incldues more powerful APIs for accessing static data via the static APIs. All the static APIs that accept optional parameters are supported!
```
ulti.getStaticChampionList(new ChampionQueryParams.Builder()
            .locale("en_US")
            .version("4.19.2")
            .dataById(true)
            .champData(ChampData.IMAGE, ChampData.LORE)
            .build());
```
- Updated documentation to reflect support for Hexakill game mode
- Bug fixes, including:
  - Changed allytips in Champion class from String to List<String>
  - Changed blocks in Recommended class from List<String> to List<Block>
- setShortRateLimit and setLongRateLimit had their parameter types changed from Integer to Double

v1.0
- Initial release

## License
```
The MIT License (MIT)

Copyright (c) 2014 Adam Alyyan

Permission is hereby granted, free of charge, to any person obtaining a copy of this 
software and associated documentation files (the "Software"), to deal in the Software 
without restriction, including without limitation the rights to use, copy, modify, merge, 
publish, distribute, sublicense, and/or sell copies of the Software, and to permit 
persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies 
or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR 
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE 
FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR 
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
DEALINGS IN THE SOFTWARE.
```
