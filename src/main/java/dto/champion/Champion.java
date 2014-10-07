/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Adam Alyyan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 *  including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package dto.champion;


public class Champion {


    private boolean active;
    private boolean botEnabled;
    private boolean botMmEnabled;
    private boolean freeToPlay;
    private long id;
    private boolean rankedPlayEnabled;


    /**
     * @return true if the champion is currently active (available to play), false otherwise
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @return true if the bot enabled flag is enabled (only applies for custom games), false otherwise
     */
    public boolean isBotEnabled() {
        return botEnabled;
    }

    /**
     * @return true if the bot match made flag is enabled (only applies to Co-op vs. AI games), false otherwise
     */
    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    /**
     * @return  the champion ID. This ID can be used with the static data API to get more information about
     *          the champion
     */
    public long getId() {
        return id;
    }

    /**
     * @return  true if the champion is free to play, false otherwise. Free to play champions rotate so this will
     *          not always return the same value
     */
    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    /**
     * @return  true if the champion is enabled in ranked, false otherwise
     */
    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }
}
